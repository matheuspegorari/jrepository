package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ApuracaoDivergenciaICMSST extends AbstractSankhyaEntity<ApuracaoDivergenciaICMSST> {
   public BigDecimal getBaseSubstitCalc() {
        return this.getVo().asBigDecimal("BASESUBSTITCALC");
   }

   public void setBaseSubstitCalc(BigDecimal baseSubstitCalc) {
        markAsChanged("BASESUBSTITCALC", baseSubstitCalc);
   }

   public BigDecimal getBaseSubstitNota() {
        return this.getVo().asBigDecimal("BASESUBSTITNOTA");
   }

   public void setBaseSubstitNota(BigDecimal baseSubstitNota) {
        markAsChanged("BASESUBSTITNOTA", baseSubstitNota);
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

   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
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

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public BigDecimal getVlrSubstCalc() {
        return this.getVo().asBigDecimal("VLRSUBSTCALC");
   }

   public void setVlrSubstCalc(BigDecimal vlrSubstCalc) {
        markAsChanged("VLRSUBSTCALC", vlrSubstCalc);
   }

   public BigDecimal getVlrSubstNota() {
        return this.getVo().asBigDecimal("VLRSUBSTNOTA");
   }

   public void setVlrSubstNota(BigDecimal vlrSubstNota) {
        markAsChanged("VLRSUBSTNOTA", vlrSubstNota);
   }

   public BigDecimal getVlrTotDivSubst() {
        return this.getVo().asBigDecimal("VLRTOTDIVSUBST");
   }

   public void setVlrTotDivSubst(BigDecimal vlrTotDivSubst) {
        markAsChanged("VLRTOTDIVSUBST", vlrTotDivSubst);
   }

   @Override
   public String getTableName() {
        return "TGFADST";
   }

   @Override
   public String getEntityName() {
        return "ApuracaoDivergenciaICMSST";
   }

   @Override
   public ApuracaoDivergenciaICMSST fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
