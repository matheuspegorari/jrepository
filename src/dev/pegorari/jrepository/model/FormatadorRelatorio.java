package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class FormatadorRelatorio extends AbstractSankhyaEntity<FormatadorRelatorio> {
   private String acessoCubo;
   private BigDecimal codEmp;
   private BigDecimal codGrupoRel;
   private BigDecimal codRel;
   private String contasBco;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private String escolhidos;
   private String fastService;
   private String filtros;
   private String filtros2;
   private byte[] grafic;
   private byte[] layout;
   private byte[] layoutSw;
   private String lista1;
   private String lista2;
   private String lista3;
   private String lista4;
   private BigDecimal nivel;
   private String nome;
   private String observacao;
   private String ordem;
   private String orientacao;
   private BigDecimal origem;
   private String paramsGen;
   private String personalizado;
   private BigDecimal qtdVisualizacoes;
   private String resumo;
   private String sankhya;
   private BigDecimal tamFonte;
   private String temLayoutSw;
   private String tipo;
   private String tipoFonte;

   public String getAcessoCubo() {
        return acessoCubo;
   }

   public void setAcessoCubo(String acessoCubo) {
        this.acessoCubo = acessoCubo;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodGrupoRel() {
        return codGrupoRel;
   }

   public void setCodGrupoRel(BigDecimal codGrupoRel) {
        this.codGrupoRel = codGrupoRel;
   }

   public BigDecimal getCodRel() {
        return codRel;
   }

   public void setCodRel(BigDecimal codRel) {
        this.codRel = codRel;
   }

   public String getContasBco() {
        return contasBco;
   }

   public void setContasBco(String contasBco) {
        this.contasBco = contasBco;
   }

   public Timestamp getDtFinal() {
        return dtFinal;
   }

   public void setDtFinal(Timestamp dtFinal) {
        this.dtFinal = dtFinal;
   }

   public Timestamp getDtInicial() {
        return dtInicial;
   }

   public void setDtInicial(Timestamp dtInicial) {
        this.dtInicial = dtInicial;
   }

   public String getEscolhidos() {
        return escolhidos;
   }

   public void setEscolhidos(String escolhidos) {
        this.escolhidos = escolhidos;
   }

   public String getFastService() {
        return fastService;
   }

   public void setFastService(String fastService) {
        this.fastService = fastService;
   }

   public String getFiltros() {
        return filtros;
   }

   public void setFiltros(String filtros) {
        this.filtros = filtros;
   }

   public String getFiltros2() {
        return filtros2;
   }

   public void setFiltros2(String filtros2) {
        this.filtros2 = filtros2;
   }

   public byte[] getGrafic() {
        return grafic;
   }

   public void setGrafic(byte[] grafic) {
        this.grafic = grafic;
   }

   public byte[] getLayout() {
        return layout;
   }

   public void setLayout(byte[] layout) {
        this.layout = layout;
   }

   public byte[] getLayoutSw() {
        return layoutSw;
   }

   public void setLayoutSw(byte[] layoutSw) {
        this.layoutSw = layoutSw;
   }

   public String getLista1() {
        return lista1;
   }

   public void setLista1(String lista1) {
        this.lista1 = lista1;
   }

   public String getLista2() {
        return lista2;
   }

   public void setLista2(String lista2) {
        this.lista2 = lista2;
   }

   public String getLista3() {
        return lista3;
   }

   public void setLista3(String lista3) {
        this.lista3 = lista3;
   }

   public String getLista4() {
        return lista4;
   }

   public void setLista4(String lista4) {
        this.lista4 = lista4;
   }

   public BigDecimal getNivel() {
        return nivel;
   }

   public void setNivel(BigDecimal nivel) {
        this.nivel = nivel;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        this.nome = nome;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   public String getOrdem() {
        return ordem;
   }

   public void setOrdem(String ordem) {
        this.ordem = ordem;
   }

   public String getOrientacao() {
        return orientacao;
   }

   public void setOrientacao(String orientacao) {
        this.orientacao = orientacao;
   }

   public BigDecimal getOrigem() {
        return origem;
   }

   public void setOrigem(BigDecimal origem) {
        this.origem = origem;
   }

   public String getParamsGen() {
        return paramsGen;
   }

   public void setParamsGen(String paramsGen) {
        this.paramsGen = paramsGen;
   }

   public String getPersonalizado() {
        return personalizado;
   }

   public void setPersonalizado(String personalizado) {
        this.personalizado = personalizado;
   }

   public BigDecimal getQtdVisualizacoes() {
        return qtdVisualizacoes;
   }

   public void setQtdVisualizacoes(BigDecimal qtdVisualizacoes) {
        this.qtdVisualizacoes = qtdVisualizacoes;
   }

   public String getResumo() {
        return resumo;
   }

   public void setResumo(String resumo) {
        this.resumo = resumo;
   }

   public String getSankhya() {
        return sankhya;
   }

   public void setSankhya(String sankhya) {
        this.sankhya = sankhya;
   }

   public BigDecimal getTamFonte() {
        return tamFonte;
   }

   public void setTamFonte(BigDecimal tamFonte) {
        this.tamFonte = tamFonte;
   }

   public String getTemLayoutSw() {
        return temLayoutSw;
   }

   public void setTemLayoutSw(String temLayoutSw) {
        this.temLayoutSw = temLayoutSw;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getTipoFonte() {
        return tipoFonte;
   }

   public void setTipoFonte(String tipoFonte) {
        this.tipoFonte = tipoFonte;
   }

   @Override
   public String getTableName() {
        return "TSIIMP";
   }

   @Override
   public String getEntityName() {
        return "FormatadorRelatorio";
   }

   @Override
   public FormatadorRelatorio fromVO(DynamicVO vo) {
        this.acessoCubo = vo.asString("ACESSOCUBO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codGrupoRel = vo.asBigDecimal("CODGRUPOREL");
        this.codRel = vo.asBigDecimal("CODREL");
        this.contasBco = vo.asString("CONTASBCO");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.escolhidos = vo.asString("ESCOLHIDOS");
        this.fastService = vo.asString("FASTSERVICE");
        this.filtros = vo.asString("FILTROS");
        this.filtros2 = vo.asString("FILTROS2");
        this.grafic = vo.asBlob("GRAFIC");
        this.layout = vo.asBlob("LAYOUT");
        this.layoutSw = vo.asBlob("LAYOUTSW");
        this.lista1 = vo.asString("LISTA1");
        this.lista2 = vo.asString("LISTA2");
        this.lista3 = vo.asString("LISTA3");
        this.lista4 = vo.asString("LISTA4");
        this.nivel = vo.asBigDecimal("NIVEL");
        this.nome = vo.asString("NOME");
        this.observacao = vo.asString("OBSERVACAO");
        this.ordem = vo.asString("ORDEM");
        this.orientacao = vo.asString("ORIENTACAO");
        this.origem = vo.asBigDecimal("ORIGEM");
        this.paramsGen = vo.asString("PARAMSGEN");
        this.personalizado = vo.asString("PERSONALIZADO");
        this.qtdVisualizacoes = vo.asBigDecimal("QTDVISUALIZACOES");
        this.resumo = vo.asString("RESUMO");
        this.sankhya = vo.asString("SANKHYA");
        this.tamFonte = vo.asBigDecimal("TAMFONTE");
        this.temLayoutSw = vo.asString("TEMLAYOUTSW");
        this.tipo = vo.asString("TIPO");
        this.tipoFonte = vo.asString("TIPOFONTE");
        return this;
   }
}
