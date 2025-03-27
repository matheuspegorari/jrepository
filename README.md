# JRepository - Acesso Tipado e Seguro ao Banco de Dados no Sankhya

**JRepository** é uma camada de abstração que traz forte tipagem e segurança para aplicações Sankhya. Ele transforma a interação com o **Jape Framework** em uma experiência mais robusta, previsível e manutenível, eliminando erros comuns e facilitando o desenvolvimento. Sintaxe e conceitos inspirados no **Spring Data JPA**. 
## 🔒 Vantagens da Tipagem Forte

A principal inovação do JRepository está na forte tipagem que garante:

- **Segurança em tempo de compilação**: erros são identificados antes da execução
- **Autocompletar preciso**: seu IDE sugere apenas campos que realmente existem
- **Validação automática**: dados incorretos são rejeitados precocemente
- **Conversão de tipos automática**: sem necessidade de casting manual
- **Rastreamento de mudanças**: apenas campos alterados são atualizados

## ❌ Imunidade a Erros Comuns

O JRepository previne diversos erros frequentes:

- **Erros de digitação em nomes de campos**: impossíveis com propriedades tipadas
- **Conversões de tipos inconsistentes**: manipulação segura com getters/setters tipados
- **Chamadas incorretas à API**: métodos padronizados para todas operações

## 🏗️ Instalação

### No Projeto de Desenvolvimento

Para utilizar o JRepository no seu projeto de desenvolvimento:

1. Acesse a página [Releases](https://github.com/matheuspegorari/jrepository/releases/).
2. Baixe a versão mais recente do arquivo `jrepository-1.x.x.jar`
3. Adicione o JAR como dependência no seu projeto:

**IntelliJ IDEA**:
  - Vá para File > Project Structure > Modules
  - Na aba Dependencies, clique em "+" e selecione "JARs or directories"
  - Navegue até o local do `jrepository-1.x.x.jar` e adicione-o

**Eclipse**:
  - Clique com o botão direito no projeto > Build Path > Configure Build Path
  - Na aba Libraries, clique em "Add External JARs"
  - Navegue até o local do `jrepository-1.x.x.jar` e adicione-o

**Maven/Gradle**:
 - ⏳ Em breve

### No Sankhya

Ao implantar sua personalização que utiliza o JRepository:

1. Acesse o Sankhya
2. Navegue a tela **Módulo Java**
3. Clique em "Incluir" para adicionar um novo módulo
4. Preencha os campos necessários
5. **Importante**: Você deve adicionar tanto o JAR da sua personalização quanto o `jrepository-1.0.0.jar`

> **Nota importante**: O JAR da biblioteca JRepository deve ser incluído no mesmo **Módulo Java** que a sua personalização. Isso é importante para que as classes do **JRepository** estejam disponíveis em tempo de execução.



## 📊 Abordagem Antiga vs Nova

### Exemplo: Buscando um parceiro e alterando seu endereço

#### ❌ Abordagem Tradicional (JapeWrapper)

```java
    // Obtém o parceiro pelo ID
    JapeWrapper daoParceiro = JapeFactory.dao("Parceiro");
    DynamicVO parceiro = daoParceiro.findByPK(new BigDecimal(1001));

    // Extraindo valores - propenso a erros de digitação e tipos
    String nomeAtual = parceiro.asString("NOMEFARC");  // ERRO: nome do campo incorreto!
    BigDecimal codBairro = parceiro.asBigDecimal("CODBAI");

    // Alteração usando builder - propenso a erros
    daoParceiro.prepareToUpdate(parceiro)
            .set("NUMEND", "123")  // Se o campo estiver errado, só descobrirá em tempo de execução
            .set("COMPLEMENTO", "Apto 101")
            .update();
```

#### ✅ Nova Abordagem com JRepository

```java
    // Busca tipada e segura
    Parceiro parceiro = JRepository.findByPK(new Parceiro(), new BigDecimal(1001));

    // Acesso a propriedades com autocompletar e verificação de tipos
    String nomeAtual = parceiro.getNomeParc();  // Nome correto sugerido pelo IDE
    BigDecimal codBairro = parceiro.getCodBai();  // Tipo correto garantido

    // Alteração direta e segura
    parceiro.setNumEnd("123");  // IDE mostra apenas campos válidos
    parceiro.setComplemento("Apto 101");
    parceiro.persist();  // Método unificado para persistência - detecta se é update
```

## 🌟 Exemplos Práticos

### Exemplo 1: Criando uma Nova Entidade do Zero

```java
public void cadastrarNovoBairro() {
    try {
        // Cria uma nova instância do bairro
        Bairro novoBairro = new Bairro();
        
        // Define os valores usando métodos tipados
        novoBairro.setNomeBai("Jardim América");
        novoBairro.setCodReg(new BigDecimal(5)); // Código da região
        novoBairro.setDescricaoCorreio("JARDIM AMERICA");
        
        // Persiste a nova entidade no banco de dados
        novoBairro.persist();
        
        // Após a persistência, o objeto terá o VO preenchido
        BigDecimal codBairroGerado = novoBairro.getCodBai();
        System.out.println("Novo bairro criado com código: " + codBairroGerado);
        
    } catch (Exception e) {
        throw new RuntimeException("Erro ao cadastrar novo bairro", e);
    }
}
```

### Exemplo 2: Evento Programável com Verificação Fiscal

```java
@Override
public void beforeInsert(PersistenceEvent persistenceEvent) throws Exception {
    // Converte o evento em uma entidade fortemente tipada
    CabecalhoNota cabecalho = new CabecalhoNota().fromVO((DynamicVO) persistenceEvent.getVo());
    
    // Busca a operação fiscal com validação automática de tipos
    TipoOperacao tipoOperacao = JRepository.findByPK(
        new TipoOperacao(), 
        cabecalho.getCodTipOper(), 
        cabecalho.getDhTipOper()
    );
    
    // Verificação de isenção com campos tipados - sem risco de erros
    if ("I".equals(tipoOperacao.getClassifIcms())) {
        // Atualização segura com propriedades nomeadas
        cabecalho.setObservacao("Isenção de ICMS conforme decreto 1234/2021");
        cabecalho.persist(); // Persiste as alterações
    }
}
```

## 🧩 Entidades Customizadas (AD_)
Para entidades customizadas (tabelas AD_), é possível utilizar a classe `AdEntity` para manipulação de registros.
### Exemplo 1: Criando novo registro de tabela AD
```java
    public void cadastrarFrete() {
        AdEntity tabelaFretes = new AdEntity("AD_FRETES"); // construtor exige o nome da entidade
        tabelaFretes.set("CODFRETE", new BigDecimal(1)); // setando valores
        tabelaFretes.set("VALOR", new BigDecimal(100.0));
        tabelaFretes.persist(); // persiste a entidade
    }
```

### Exemplo 2: Instanciando e fazendo realizando atualização
```java
    public void atualizarFrete() {
        AdEntity tabelaFretes = new AdEntity("AD_FRETES");
        tabelaFretes.set("VALOR", new BigDecimal(149.9));
        tabelaFretes.set("CODMOTORISTA", new BigDecimal(10));
        tabelaFretes.persist(); // persiste a entidade
    }
```
### Exemplo 3: Campos AD em tabelas nativas
O model do JRepository conta apenas com os campos nativos do Sankhya. E será atualizado de tempos em tempos. 
Porém sempre será possível utilizar os métodos genéricos tradicionais.
```java
    // instanciando o parceiro    
    Parceiro parceiro = JRepository.findByPK(new Parceiro(), new BigDecimal(1001)); 
    BigDecimal percDesc = parceiro.asBigDecimal("AD_PERCDESC"); // obtendo um campo AD
    parceiro.set("AD_PERCDESC", new BigDecimal(10)); // atualizando um campo AD
    parceiro.persist();    
```

## 🛠️ Ganhos Principais

- **Prevenção de erros em tempo de compilação**: detecte problemas antes da execução
- **Método unificado de persistência**: `persist()` identifica automaticamente se deve fazer insert ou update
- **Tipagem forte**: acesso seguro a propriedades com getters/setters tipados
- **Rastreamento automático de mudanças**: apenas campos alterados são enviados ao banco
- **Objetos de domínio**: trabalhe com classes Java em vez de objetos genéricos
- **Redução de código boilerplate**: menos linhas de código, maior legibilidade


## 🚀 Recursos Implementados

As seguintes funcionalidades foram implementadas com sucesso:

- ✅ Busca de entidades por chave primária com `findByPK()`.
- ✅ Busca de entidades por condições personalizadas com `find()`.
- ✅ Persistência de registros com `persist()`, incluindo suporte a inserções e atualizações automáticas.
- ✅ Atualização de registros com `update()`.
- ✅ Criação de novos registros com `create()`.
- ✅ Rastreamento automático de mudanças em entidades.
- ✅ Conversão automática entre objetos VO e entidades de domínio.

## 🛣️ Próximos Passos

- ⏳ **Suporte para ligações entre entidades** (exemplo: buscar um parceiro e automaticamente carregar seu endereço e contatos).
- ⏳ **Suporte para deleção de registros** (Por PK ou por condições).
- ⏳ Página de documentação detalhada.
- ⏳ Implementação de forma nativa no Sankhya
---

🔐 **JRepository**: Built with ❤️ by pegorari.dev
