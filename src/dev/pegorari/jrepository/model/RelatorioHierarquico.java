package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RelatorioHierarquico extends AbstractSankhyaEntity<RelatorioHierarquico> {
   public BigDecimal getAlinhamento() {
        return this.getVo().asBigDecimal("ALINHAMENTO");
   }

   public void setAlinhamento(BigDecimal alinhamento) {
        markAsChanged("ALINHAMENTO", alinhamento);
   }

   public BigDecimal getCodCampo() {
        return this.getVo().asBigDecimal("CODCAMPO");
   }

   public void setCodCampo(BigDecimal codCampo) {
        markAsChanged("CODCAMPO", codCampo);
   }

   public BigDecimal getCodCampoPai() {
        return this.getVo().asBigDecimal("CODCAMPOPAI");
   }

   public void setCodCampoPai(BigDecimal codCampoPai) {
        markAsChanged("CODCAMPOPAI", codCampoPai);
   }

   public BigDecimal getCodUni() {
        return this.getVo().asBigDecimal("CODUNI");
   }

   public void setCodUni(BigDecimal codUni) {
        markAsChanged("CODUNI", codUni);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getExpressao() {
        return this.getVo().asString("EXPRESSAO");
   }

   public void setExpressao(String expressao) {
        markAsChanged("EXPRESSAO", expressao);
   }

   public String getLigacao() {
        return this.getVo().asString("LIGACAO");
   }

   public void setLigacao(String ligacao) {
        markAsChanged("LIGACAO", ligacao);
   }

   public String getMascara() {
        return this.getVo().asString("MASCARA");
   }

   public void setMascara(String mascara) {
        markAsChanged("MASCARA", mascara);
   }

   public String getPrograma() {
        return this.getVo().asString("PROGRAMA");
   }

   public void setPrograma(String programa) {
        markAsChanged("PROGRAMA", programa);
   }

   public String getSankhya() {
        return this.getVo().asString("SANKHYA");
   }

   public void setSankhya(String sankhya) {
        markAsChanged("SANKHYA", sankhya);
   }

   public String getSoHierarquia() {
        return this.getVo().asString("SOHIERARQUIA");
   }

   public void setSoHierarquia(String soHierarquia) {
        markAsChanged("SOHIERARQUIA", soHierarquia);
   }

   public String getTabelas() {
        return this.getVo().asString("TABELAS");
   }

   public void setTabelas(String tabelas) {
        markAsChanged("TABELAS", tabelas);
   }

   public BigDecimal getTamanho() {
        return this.getVo().asBigDecimal("TAMANHO");
   }

   public void setTamanho(BigDecimal tamanho) {
        markAsChanged("TAMANHO", tamanho);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getTotaliza() {
        return this.getVo().asString("TOTALIZA");
   }

   public void setTotaliza(String totaliza) {
        markAsChanged("TOTALIZA", totaliza);
   }

   public String getZerarNaQuebra() {
        return this.getVo().asString("ZERARNAQUEBRA");
   }

   public void setZerarNaQuebra(String zerarNaQuebra) {
        markAsChanged("ZERARNAQUEBRA", zerarNaQuebra);
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
        this.setVo(vo);
        return this;
   }
}
