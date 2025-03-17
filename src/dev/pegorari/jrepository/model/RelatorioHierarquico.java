package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RelatorioHierarquico extends AbstractSankhyaEntity<RelatorioHierarquico> {
   private BigDecimal alinhamento;
   private BigDecimal codCampo;
   private BigDecimal codCampoPai;
   private BigDecimal codUni;
   private String descricao;
   private String expressao;
   private String ligacao;
   private String mascara;
   private String programa;
   private String sankhya;
   private String soHierarquia;
   private String tabelas;
   private BigDecimal tamanho;
   private String tipo;
   private String totaliza;
   private String zerarNaQuebra;

   public BigDecimal getAlinhamento() {
        return alinhamento;
   }

   public void setAlinhamento(BigDecimal alinhamento) {
        this.alinhamento = alinhamento;
   }

   public BigDecimal getCodCampo() {
        return codCampo;
   }

   public void setCodCampo(BigDecimal codCampo) {
        this.codCampo = codCampo;
   }

   public BigDecimal getCodCampoPai() {
        return codCampoPai;
   }

   public void setCodCampoPai(BigDecimal codCampoPai) {
        this.codCampoPai = codCampoPai;
   }

   public BigDecimal getCodUni() {
        return codUni;
   }

   public void setCodUni(BigDecimal codUni) {
        this.codUni = codUni;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getExpressao() {
        return expressao;
   }

   public void setExpressao(String expressao) {
        this.expressao = expressao;
   }

   public String getLigacao() {
        return ligacao;
   }

   public void setLigacao(String ligacao) {
        this.ligacao = ligacao;
   }

   public String getMascara() {
        return mascara;
   }

   public void setMascara(String mascara) {
        this.mascara = mascara;
   }

   public String getPrograma() {
        return programa;
   }

   public void setPrograma(String programa) {
        this.programa = programa;
   }

   public String getSankhya() {
        return sankhya;
   }

   public void setSankhya(String sankhya) {
        this.sankhya = sankhya;
   }

   public String getSoHierarquia() {
        return soHierarquia;
   }

   public void setSoHierarquia(String soHierarquia) {
        this.soHierarquia = soHierarquia;
   }

   public String getTabelas() {
        return tabelas;
   }

   public void setTabelas(String tabelas) {
        this.tabelas = tabelas;
   }

   public BigDecimal getTamanho() {
        return tamanho;
   }

   public void setTamanho(BigDecimal tamanho) {
        this.tamanho = tamanho;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getTotaliza() {
        return totaliza;
   }

   public void setTotaliza(String totaliza) {
        this.totaliza = totaliza;
   }

   public String getZerarNaQuebra() {
        return zerarNaQuebra;
   }

   public void setZerarNaQuebra(String zerarNaQuebra) {
        this.zerarNaQuebra = zerarNaQuebra;
   }

   @Override
   public String getTableName() {
        return "TSIRHI";
   }

   @Override
   public String getEntityName() {
        return "RelatorioHierarquico";
   }

   @Override
   public RelatorioHierarquico fromVO(DynamicVO vo) {
        this.alinhamento = vo.asBigDecimal("ALINHAMENTO");
        this.codCampo = vo.asBigDecimal("CODCAMPO");
        this.codCampoPai = vo.asBigDecimal("CODCAMPOPAI");
        this.codUni = vo.asBigDecimal("CODUNI");
        this.descricao = vo.asString("DESCRICAO");
        this.expressao = vo.asString("EXPRESSAO");
        this.ligacao = vo.asString("LIGACAO");
        this.mascara = vo.asString("MASCARA");
        this.programa = vo.asString("PROGRAMA");
        this.sankhya = vo.asString("SANKHYA");
        this.soHierarquia = vo.asString("SOHIERARQUIA");
        this.tabelas = vo.asString("TABELAS");
        this.tamanho = vo.asBigDecimal("TAMANHO");
        this.tipo = vo.asString("TIPO");
        this.totaliza = vo.asString("TOTALIZA");
        this.zerarNaQuebra = vo.asString("ZERARNAQUEBRA");
        return this;
   }
}
