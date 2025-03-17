# JRepository - Acesso Simplificado ao Banco de Dados no Sankhya

**JRepository** é uma camada de abstração que simplifica a interação com o **Jape DAO** do Sankhya. Com ele, você pode realizar operações no banco de dados de forma **mais clara, organizada e eficiente**.

## 🚀 Recursos

- **Reduz código repetitivo**, eliminando chamadas manuais ao `JapeFactory`.
- **Facilita a manutenção e escalabilidade** com um design mais limpo.
- **Encapsula a lógica de acesso aos dados** dentro das entidades.
- **Fornece operações genéricas** como busca e atualização.

## 🛠️ Exemplo de Uso

### 📌 Caso de Uso: Buscando um parceiro e alterando o nome do bairro dele

O exemplo a seguir mostra como recuperar um **parceiro** (cliente ou fornecedor) pelo seu ID, obter o bairro onde ele está localizado e alterar o nome desse bairro no banco de dados.

### Abordagem Tradicional (JapeWrapper)

```java
private static void jeitoAntigo() throws Exception {
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

### ✅ Nova Abordagem com JRepository

```java
private static void jeitoNovo() throws Exception {
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

### 🏆 Por que usar JRepository?

✅ **Código mais limpo** – Sem necessidade de instanciar vários DAOs.  
✅ **Mais legível e organizado** – Facilita a manutenção e entendimento do código.  
✅ **Melhor encapsulamento** – Cada entidade gerencia seu próprio comportamento via `SankhyaEntity`.  
✅ **Menos repetições** – Evita chamadas duplicadas para DAOs.

## 📚 Componentes Principais

### `JRepository`
A classe principal que gerencia as operações de **busca e atualização** de dados.

#### Métodos:

- **`findByPK(T template, Object... pkValues) -> T`**  
  Retorna um registro pelo seu identificador primário.

- **`find(T template, String where, Object... params) -> List<T>`**  
  Retorna uma lista de registros que atendem a uma condição.

- **`update(T entity)`** *(Ainda não implementado)*  
  Atualiza um registro existente.

- **`create(T entity)`** *(Ainda não implementado)*  
  Cria um novo registro.

### `SankhyaEntity`
Interface que define o contrato para todas as entidades usadas no JRepository.

```java
public interface SankhyaEntity<T extends SankhyaEntity<T>> {
    String getEntityName();
    T fromVO(DynamicVO vo);
}
```

## 🚀 Próximos Passos

- ✅ Implementação de `findByPK` e `find`.
- ⏳ Implementação de `update` e `create`.
- ⏳ Suporte para transações no banco de dados.

## 🤝 Contribuindo

Fique à vontade para abrir issues ou enviar pull requests para aprimorar este projeto!
