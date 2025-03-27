package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AjusteIpi extends AbstractSankhyaEntity<AjusteIpi> {
   public String getChaveNfe() {
        return this.getVo().asString("CHAVENFE");
   }

   public void setChaveNfe(String chaveNfe) {
        markAsChanged("CHAVENFE", chaveNfe);
   }

   public BigDecimal getCodAjuste() {
        return this.getVo().asBigDecimal("CODAJUSTE");
   }

   public void setCodAjuste(BigDecimal codAjuste) {
        markAsChanged("CODAJUSTE", codAjuste);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodModDoc() {
        return this.getVo().asBigDecimal("CODMODDOC");
   }

   public void setCodModDoc(BigDecimal codModDoc) {
        markAsChanged("CODMODDOC", codModDoc);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtDoc() {
        return this.getVo().asTimestamp("DTDOC");
   }

   public void setDtDoc(Timestamp dtDoc) {
        markAsChanged("DTDOC", dtDoc);
   }

   public BigDecimal getNumNota() {
        return this.getVo().asBigDecimal("NUMNOTA");
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public BigDecimal getOrigProcesso() {
        return this.getVo().asBigDecimal("ORIGPROCESSO");
   }

   public void setOrigProcesso(BigDecimal origProcesso) {
        markAsChanged("ORIGPROCESSO", origProcesso);
   }

   public String getSerieNota() {
        return this.getVo().asString("SERIENOTA");
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
   }

   public String getTipImposto() {
        return this.getVo().asString("TIPIMPOSTO");
   }

   public void setTipImposto(String tipImposto) {
        markAsChanged("TIPIMPOSTO", tipImposto);
   }

   public BigDecimal getVlrAjuste() {
        return this.getVo().asBigDecimal("VLRAJUSTE");
   }

   public void setVlrAjuste(BigDecimal vlrAjuste) {
        markAsChanged("VLRAJUSTE", vlrAjuste);
   }

   @Override
   public String getTableName() {
        return "TGFAJI";
   }

   @Override
   public String getEntityName() {
        return "AjusteIpi";
   }

   @Override
   public AjusteIpi fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
