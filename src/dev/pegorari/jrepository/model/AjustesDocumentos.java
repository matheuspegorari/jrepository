package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AjustesDocumentos extends AbstractSankhyaEntity<AjustesDocumentos> {
   public String getCodAjuste() {
        return this.getVo().asString("CODAJUSTE");
   }

   public void setCodAjuste(String codAjuste) {
        markAsChanged("CODAJUSTE", codAjuste);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodObsPadrao() {
        return this.getVo().asBigDecimal("CODOBSPADRAO");
   }

   public void setCodObsPadrao(BigDecimal codObsPadrao) {
        markAsChanged("CODOBSPADRAO", codObsPadrao);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getCompAjuste() {
        return this.getVo().asString("COMPAJUSTE");
   }

   public void setCompAjuste(String compAjuste) {
        markAsChanged("COMPAJUSTE", compAjuste);
   }

   public String getCompObsPadrao() {
        return this.getVo().asString("COMPOBSPADRAO");
   }

   public void setCompObsPadrao(String compObsPadrao) {
        markAsChanged("COMPOBSPADRAO", compObsPadrao);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getOrigem() {
        return this.getVo().asString("ORIGEM");
   }

   public void setOrigem(String origem) {
        markAsChanged("ORIGEM", origem);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getVlrIcms() {
        return this.getVo().asBigDecimal("VLRICMS");
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
   }

   public BigDecimal getVlrOutros() {
        return this.getVo().asBigDecimal("VLROUTROS");
   }

   public void setVlrOutros(BigDecimal vlrOutros) {
        markAsChanged("VLROUTROS", vlrOutros);
   }

   public BigDecimal getAliqIcms() {
        return this.getVo().asBigDecimal("ALIQICMS");
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        markAsChanged("ALIQICMS", aliqIcms);
   }

   public BigDecimal getBaseIcms() {
        return this.getVo().asBigDecimal("BASEICMS");
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        markAsChanged("BASEICMS", baseIcms);
   }

   public BigDecimal getCodCfg() {
        return this.getVo().asBigDecimal("CODCFG");
   }

   public void setCodCfg(BigDecimal codCfg) {
        markAsChanged("CODCFG", codCfg);
   }

   public String getAgrupar() {
        return this.getVo().asString("AGRUPAR");
   }

   public void setAgrupar(String agrupar) {
        markAsChanged("AGRUPAR", agrupar);
   }

   public String getIndSubApuracaoAj() {
        return this.getVo().asString("INDSUBAPURACAOAJ");
   }

   public void setIndSubApuracaoAj(String indSubApuracaoAj) {
        markAsChanged("INDSUBAPURACAOAJ", indSubApuracaoAj);
   }

   public String getSubApuracaoAj() {
        return this.getVo().asString("SUBAPURACAOAJ");
   }

   public void setSubApuracaoAj(String subApuracaoAj) {
        markAsChanged("SUBAPURACAOAJ", subApuracaoAj);
   }

   @Override
   public String getTableName() {
        return "TGFAJD";
   }

   @Override
   public String getEntityName() {
        return "AjustesDocumentos";
   }

   @Override
   public AjustesDocumentos fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
