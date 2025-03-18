# JRepository - Acesso Simplificado ao Banco de Dados no Sankhya

**JRepository** é uma camada de abstração que simplifica a interação com o **Jape Framework** do Sankhya. Inspirado no **Spring Data JPA**, ele reduz a barreira de entrada para novos desenvolvedores no ecossistema Sankhya, tornando o acesso e manipulação aos dados mais intuitivo, eficiente e escalável.

## 🚀 Recursos

- **Reduz código repetitivo**, eliminando chamadas manuais ao `JapeFactory`.
- **Facilita a manutenção e escalabilidade** com um design mais limpo.
- **Encapsula a lógica de acesso aos dados** dentro das entidades.
- **Fornece operações genéricas** como busca e atualização.
- **Segue a filosofia do Spring Data JPA**, facilitando a adoção por novos desenvolvedores.
- **Suporta operações em lote** para atualização e criação de múltiplas entidades em uma única chamada.

## 🏗️ Instalação

Para usar o JRepository no seu projeto, certifique-se de ter as dependências do **Sankhya Jape** configuradas no seu projeto.

```xml
<dependency>
    <groupId>br.com.sankhya</groupId>
    <artifactId>jape</artifactId>
    <version>SUA_VERSÃO_AQUI</version>
</dependency>
```

## 🛠️ Exemplos de Uso

### 📌 Caso de Uso 1: Buscando um parceiro e alterando o nome do bairro dele

O exemplo a seguir mostra como recuperar um **parceiro** (cliente ou fornecedor) pelo seu ID, obter o bairro onde ele está localizado e alterar o nome desse bairro no banco de dados.

#### 🛑 Abordagem Tradicional (JapeWrapper)

```java
private static void jeitoAntigo() {
    // Obtém o parceiro pelo ID
    JapeWrapper daoParceiro = JapeFactory.dao(DynamicEntityNames.PARCEIRO);
    DynamicVO parceiro = daoParceiro.findByPK(BigDecimal.ONE);

    // Obtém o código do bairro do parceiro
    BigDecimal codBairro = parceiro.asBigDecimal("CODBAI");

    // Busca o bairro associado ao parceiro
    JapeWrapper daoBairro = JapeFactory.dao(DynamicEntityNames.BAIRRO);
    DynamicVO bairro = daoBairro.findByPK(codBairro);

    // Atualiza o nome do bairro no banco de dados
    daoBairro.prepareToUpdate(bairro)
            .set("NOMEBAI", "Bairro Teste")
            .update();
}
```

#### ✅ Nova Abordagem com JRepository

```java
private static void jeitoNovo() {
    // Obtém o parceiro diretamente pelo ID
    Parceiro parceiro = JRepository.findByPK(new Parceiro(), BigDecimal.ONE);

    // Obtém o código do bairro associado ao parceiro
    BigDecimal codBairro = parceiro.getCodBai();

    // Busca o bairro e altera o nome dele
    Bairro bairro = JRepository.findByPK(new Bairro(), codBairro);
    bairro.setNomeBai("Bairro Teste");
    JRepository.update(bairro);
}
```

### 📌 Caso de Uso 2: Utilizando em um Evento Programável

Aqui, verificamos se a operação fiscal associada a um documento está **isenta de ICMS**. Se estiver, adicionamos automaticamente uma observação explicativa na nota.

#### 🛑 Abordagem Tradicional (JapeWrapper)

```java
@Override
public void beforeInsert(PersistenceEvent persistenceEvent) throws Exception {
    // Obtém os valores do evento de persistência
    DynamicVO vo = (DynamicVO) persistenceEvent.getVo();

    // Busca a operação pelo código e data/hora
    JapeWrapper daoTop = JapeFactory.dao("TipoOperacao");
    DynamicVO top = daoTop.findByPK(vo.asBigDecimal("CODTIPOPER"), vo.asTimestamp("DHTIPOPER"));
    
    // Se a classificação ICMS for "I" (Isento), adiciona a observação na nota
    if (top.asString("CLASSIFICMS").equals("I")) {
        JapeFactory.dao("CabecalhoNota").prepareToUpdate(vo)
            .set("OBSERVACAO", "Isenção de ICMS segundo o decreto 1234/2021")
            .update();
    }
}
```

#### ✅ Nova Abordagem com JRepository

```java
@Override
public void beforeInsert(PersistenceEvent persistenceEvent) throws Exception {
    // Converte o VO para um objeto da classe CabecalhoNota
    DynamicVO vo = (DynamicVO) persistenceEvent.getVo();
    CabecalhoNota cab = new CabecalhoNota().fromVO(vo);

    // Busca a operação pelo código e data/hora
    TipoOperacao top = JRepository.findByPK(new TipoOperacao(), cab.getCodTipOper(), cab.getDhTipOper());

    // Se a operação tiver isenção de ICMS, adiciona a observação na nota
    if (top.getClassifIcms().equals("I")) {
        cab.setObservacao("Isenção de ICMS segundo o decreto 1234/2021");
        JRepository.update(cab);
    }
}
```

### 📌 Caso de Uso 3: Atualizando múltiplas entidades em lote

Uma funcionalidade implementada com sucesso no JRepository é a capacidade de atualizar múltiplas entidades em uma única chamada:

```java
public void atualizarClienteEEndereco() {
    // Busca o cliente e seu endereço
    Parceiro cliente = JRepository.findByPK(new Parceiro(), new BigDecimal(1001));
    Bairro bairro = JRepository.findByPK(new Bairro(), cliente.getCodBai());
    CEP cep = JRepository.findByPK(new CEP(), cliente.getCep());
    
    // Atualiza informações em múltiplas entidades
    cliente.setNomeParc("Novo Nome Cliente");
    bairro.setNomeBai("Novo Nome Bairro");
    cep.setIntervalo("100-200");
    
    // Atualiza todas as entidades de uma só vez
    JRepository.update(cliente, bairro, cep);
}
```

### 🏆 Benefícios do JRepository

✅ **Código mais limpo e modular** – Fácil de entender e manter.  
✅ **Evita instanciar manualmente DAOs** – Reduz o risco de erros e inconsistências.  
✅ **Utiliza objetos de domínio** – Maior organização e reutilização do código.  
✅ **Facilidade para escalar** – Reaproveitamento de código em diferentes processos.  
✅ **Operações em lote** – Atualização e criação de múltiplas entidades em uma única chamada.  
✅ **Sintaxe inspirada no Spring Data JPA**, facilitando a adaptação para novos desenvolvedores.

## 📚 Componentes Principais

### `JRepository`
A classe principal que gerencia as operações de **busca e atualização** de dados.

#### Métodos Implementados:

- **`findByPK(T template, Object... pkValues) -> T`**  
  Retorna um registro pelo seu identificador primário.

- **`find(T template, String where, Object... params) -> List<T>`**  
  Retorna uma lista de registros que atendem a uma condição.

- **`update(SankhyaEntity<?>... entities)`**  
  Atualiza um ou mais registros existentes com as mudanças rastreadas.

- **`create(SankhyaEntity<?>... entities)`**  
  Cria um ou mais novos registros.

### `SankhyaEntity`
Interface que define o contrato para todas as entidades usadas no JRepository.

```java
public interface SankhyaEntity<T extends SankhyaEntity<T>> {
    String getTableName();
    String getEntityName();
    T fromVO(DynamicVO vo);
    DynamicVO getOriginalVO();
    Map<String,Object> getChanges();
    void clearChanges();
}
```

## 🚀 Recursos Implementados

As seguintes funcionalidades foram implementadas com sucesso:

- ✅ Busca de entidades por chave primária com `findByPK()`.
- ✅ Busca de entidades por condições personalizadas com `find()`.
- ✅ Atualização de registros com `update()`, incluindo suporte a atualizações em lote.
- ✅ Criação de novos registros com `create()`, incluindo suporte a criações em lote.
- ✅ Rastreamento automático de mudanças em entidades.
- ✅ Conversão automática entre objetos VO e entidades de domínio.

## 🛣️ Próximos Passos

- ⏳ **Suporte para ligações entre entidades** (exemplo: buscar um parceiro e automaticamente carregar seu endereço e contatos).
- ⏳ Implementação de transações mais robustas.
- ⏳ Otimização de desempenho para operações em lote com grandes volumes.
- ⏳ Implementação de cache para consultas frequentes.

---

🎯 **JRepository** torna o acesso aos dados do Sankhya mais **simples, rápido e organizado**, reduzindo a barreira de entrada para novos desenvolvedores ao trazer conceitos inspirados no **Spring Data JPA**.

## 🤝 Contribuindo

Fique à vontade para abrir issues ou enviar pull requests para aprimorar este projeto!