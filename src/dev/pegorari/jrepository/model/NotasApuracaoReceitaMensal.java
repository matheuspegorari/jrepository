package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotasApuracaoReceitaMensal extends AbstractSankhyaEntity<NotasApuracaoReceitaMensal> {
   private BigDecimal codEmp;
   private BigDecimal codParc;
   private BigDecimal codTipOper;
   private String digitado;
   private Timestamp dtNeg;
   private BigDecimal nuApuracao;
   private BigDecimal numNota;
   private BigDecimal nuNota;
   private String serieNota;
   private BigDecimal status;
   private String tipMov;
   private BigDecimal vlrTotRecExt;
   private BigDecimal vlrTotRecInt;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
        this.codTipOper = codTipOper;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
        this.digitado = digitado;
   }

   public Timestamp getDtNeg() {
        return dtNeg;
   }

   public void setDtNeg(Timestamp dtNeg) {
        markAsChanged("DTNEG", dtNeg);
        this.dtNeg = dtNeg;
   }

   public BigDecimal getNuApuracao() {
        return nuApuracao;
   }

   public void setNuApuracao(BigDecimal nuApuracao) {
        markAsChanged("NUAPURACAO", nuApuracao);
        this.nuApuracao = nuApuracao;
   }

   public BigDecimal getNumNota() {
        return numNota;
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
        this.numNota = numNota;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public String getSerieNota() {
        return serieNota;
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
        this.serieNota = serieNota;
   }

   public BigDecimal getStatus() {
        return status;
   }

   public void setStatus(BigDecimal status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public String getTipMov() {
        return tipMov;
   }

   public void setTipMov(String tipMov) {
        markAsChanged("TIPMOV", tipMov);
        this.tipMov = tipMov;
   }

   public BigDecimal getVlrTotRecExt() {
        return vlrTotRecExt;
   }

   public void setVlrTotRecExt(BigDecimal vlrTotRecExt) {
        markAsChanged("VLRTOTRECEXT", vlrTotRecExt);
        this.vlrTotRecExt = vlrTotRecExt;
   }

   public BigDecimal getVlrTotRecInt() {
        return vlrTotRecInt;
   }

   public void setVlrTotRecInt(BigDecimal vlrTotRecInt) {
        markAsChanged("VLRTOTRECINT", vlrTotRecInt);
        this.vlrTotRecInt = vlrTotRecInt;
   }

   @Override
   public String getTableName() {
        return "TGFNARM";
   }

   @Override
   public String getEntityName() {
        return "NotasApuracaoReceitaMensal";
   }

   @Override
   public NotasApuracaoReceitaMensal fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.digitado = vo.asString("DIGITADO");
        this.dtNeg = vo.asTimestamp("DTNEG");
        this.nuApuracao = vo.asBigDecimal("NUAPURACAO");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.serieNota = vo.asString("SERIENOTA");
        this.status = vo.asBigDecimal("STATUS");
        this.tipMov = vo.asString("TIPMOV");
        this.vlrTotRecExt = vo.asBigDecimal("VLRTOTRECEXT");
        this.vlrTotRecInt = vo.asBigDecimal("VLRTOTRECINT");
        return this;
   }
}
