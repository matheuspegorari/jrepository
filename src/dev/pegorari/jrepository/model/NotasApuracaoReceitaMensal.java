package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotasApuracaoReceitaMensal extends AbstractSankhyaEntity<NotasApuracaoReceitaMensal> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public Timestamp getDtNeg() {
        return this.getVo().asTimestamp("DTNEG");
   }

   public void setDtNeg(Timestamp dtNeg) {
        markAsChanged("DTNEG", dtNeg);
   }

   public BigDecimal getNuApuracao() {
        return this.getVo().asBigDecimal("NUAPURACAO");
   }

   public void setNuApuracao(BigDecimal nuApuracao) {
        markAsChanged("NUAPURACAO", nuApuracao);
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

   public String getSerieNota() {
        return this.getVo().asString("SERIENOTA");
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
   }

   public BigDecimal getStatus() {
        return this.getVo().asBigDecimal("STATUS");
   }

   public void setStatus(BigDecimal status) {
        markAsChanged("STATUS", status);
   }

   public String getTipMov() {
        return this.getVo().asString("TIPMOV");
   }

   public void setTipMov(String tipMov) {
        markAsChanged("TIPMOV", tipMov);
   }

   public BigDecimal getVlrTotRecExt() {
        return this.getVo().asBigDecimal("VLRTOTRECEXT");
   }

   public void setVlrTotRecExt(BigDecimal vlrTotRecExt) {
        markAsChanged("VLRTOTRECEXT", vlrTotRecExt);
   }

   public BigDecimal getVlrTotRecInt() {
        return this.getVo().asBigDecimal("VLRTOTRECINT");
   }

   public void setVlrTotRecInt(BigDecimal vlrTotRecInt) {
        markAsChanged("VLRTOTRECINT", vlrTotRecInt);
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
        this.setVo(vo);
        return this;
   }
}
