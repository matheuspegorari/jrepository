package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class FormatadorRelatorio extends AbstractSankhyaEntity<FormatadorRelatorio> {
   public String getAcessoCubo() {
        return this.getVo().asString("ACESSOCUBO");
   }

   public void setAcessoCubo(String acessoCubo) {
        markAsChanged("ACESSOCUBO", acessoCubo);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodGrupoRel() {
        return this.getVo().asBigDecimal("CODGRUPOREL");
   }

   public void setCodGrupoRel(BigDecimal codGrupoRel) {
        markAsChanged("CODGRUPOREL", codGrupoRel);
   }

   public BigDecimal getCodRel() {
        return this.getVo().asBigDecimal("CODREL");
   }

   public void setCodRel(BigDecimal codRel) {
        markAsChanged("CODREL", codRel);
   }

   public String getContasBco() {
        return this.getVo().asString("CONTASBCO");
   }

   public void setContasBco(String contasBco) {
        markAsChanged("CONTASBCO", contasBco);
   }

   public Timestamp getDtFinal() {
        return this.getVo().asTimestamp("DTFINAL");
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
   }

   public Timestamp getDtInicial() {
        return this.getVo().asTimestamp("DTINICIAL");
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
   }

   public String getEscolhidos() {
        return this.getVo().asString("ESCOLHIDOS");
   }

   public void setEscolhidos(String escolhidos) {
        markAsChanged("ESCOLHIDOS", escolhidos);
   }

   public String getFastService() {
        return this.getVo().asString("FASTSERVICE");
   }

   public void setFastService(String fastService) {
        markAsChanged("FASTSERVICE", fastService);
   }

   public String getFiltros() {
        return this.getVo().asString("FILTROS");
   }

   public void setFiltros(String filtros) {
        markAsChanged("FILTROS", filtros);
   }

   public String getFiltros2() {
        return this.getVo().asString("FILTROS2");
   }

   public void setFiltros2(String filtros2) {
        markAsChanged("FILTROS2", filtros2);
   }

   public byte[] getGrafic() {
        return this.getVo().asBlob("GRAFIC");
   }

   public void setGrafic(byte[] grafic) {
        markAsChanged("GRAFIC", grafic);
   }

   public byte[] getLayout() {
        return this.getVo().asBlob("LAYOUT");
   }

   public void setLayout(byte[] layout) {
        markAsChanged("LAYOUT", layout);
   }

   public byte[] getLayoutSw() {
        return this.getVo().asBlob("LAYOUTSW");
   }

   public void setLayoutSw(byte[] layoutSw) {
        markAsChanged("LAYOUTSW", layoutSw);
   }

   public String getLista1() {
        return this.getVo().asString("LISTA1");
   }

   public void setLista1(String lista1) {
        markAsChanged("LISTA1", lista1);
   }

   public String getLista2() {
        return this.getVo().asString("LISTA2");
   }

   public void setLista2(String lista2) {
        markAsChanged("LISTA2", lista2);
   }

   public String getLista3() {
        return this.getVo().asString("LISTA3");
   }

   public void setLista3(String lista3) {
        markAsChanged("LISTA3", lista3);
   }

   public String getLista4() {
        return this.getVo().asString("LISTA4");
   }

   public void setLista4(String lista4) {
        markAsChanged("LISTA4", lista4);
   }

   public BigDecimal getNivel() {
        return this.getVo().asBigDecimal("NIVEL");
   }

   public void setNivel(BigDecimal nivel) {
        markAsChanged("NIVEL", nivel);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getOrdem() {
        return this.getVo().asString("ORDEM");
   }

   public void setOrdem(String ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public String getOrientacao() {
        return this.getVo().asString("ORIENTACAO");
   }

   public void setOrientacao(String orientacao) {
        markAsChanged("ORIENTACAO", orientacao);
   }

   public BigDecimal getOrigem() {
        return this.getVo().asBigDecimal("ORIGEM");
   }

   public void setOrigem(BigDecimal origem) {
        markAsChanged("ORIGEM", origem);
   }

   public String getParamsGen() {
        return this.getVo().asString("PARAMSGEN");
   }

   public void setParamsGen(String paramsGen) {
        markAsChanged("PARAMSGEN", paramsGen);
   }

   public String getPersonalizado() {
        return this.getVo().asString("PERSONALIZADO");
   }

   public void setPersonalizado(String personalizado) {
        markAsChanged("PERSONALIZADO", personalizado);
   }

   public BigDecimal getQtdVisualizacoes() {
        return this.getVo().asBigDecimal("QTDVISUALIZACOES");
   }

   public void setQtdVisualizacoes(BigDecimal qtdVisualizacoes) {
        markAsChanged("QTDVISUALIZACOES", qtdVisualizacoes);
   }

   public String getResumo() {
        return this.getVo().asString("RESUMO");
   }

   public void setResumo(String resumo) {
        markAsChanged("RESUMO", resumo);
   }

   public String getSankhya() {
        return this.getVo().asString("SANKHYA");
   }

   public void setSankhya(String sankhya) {
        markAsChanged("SANKHYA", sankhya);
   }

   public BigDecimal getTamFonte() {
        return this.getVo().asBigDecimal("TAMFONTE");
   }

   public void setTamFonte(BigDecimal tamFonte) {
        markAsChanged("TAMFONTE", tamFonte);
   }

   public String getTemLayoutSw() {
        return this.getVo().asString("TEMLAYOUTSW");
   }

   public void setTemLayoutSw(String temLayoutSw) {
        markAsChanged("TEMLAYOUTSW", temLayoutSw);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getTipoFonte() {
        return this.getVo().asString("TIPOFONTE");
   }

   public void setTipoFonte(String tipoFonte) {
        markAsChanged("TIPOFONTE", tipoFonte);
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
        this.setVo(vo);
        return this;
   }
}
