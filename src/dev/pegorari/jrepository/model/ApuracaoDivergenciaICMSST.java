package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ApuracaoDivergenciaICMSST extends AbstractSankhyaEntity<ApuracaoDivergenciaICMSST> {
   private BigDecimal baseSubstitCalc;
   private BigDecimal baseSubstitNota;
   private String digitado;
   private Timestamp dtNeg;
   private BigDecimal nuFin;
   private BigDecimal numNota;
   private BigDecimal nuNota;
   private String status;
   private BigDecimal vlrSubstCalc;
   private BigDecimal vlrSubstNota;
   private BigDecimal vlrTotDivSubst;

   public BigDecimal getBaseSubstitCalc() {
        return baseSubstitCalc;
   }

   public void setBaseSubstitCalc(BigDecimal baseSubstitCalc) {
        markAsChanged("BASESUBSTITCALC", baseSubstitCalc);
        this.baseSubstitCalc = baseSubstitCalc;
   }

   public BigDecimal getBaseSubstitNota() {
        return baseSubstitNota;
   }

   public void setBaseSubstitNota(BigDecimal baseSubstitNota) {
        markAsChanged("BASESUBSTITNOTA", baseSubstitNota);
        this.baseSubstitNota = baseSubstitNota;
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

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
        this.nuFin = nuFin;
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

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public BigDecimal getVlrSubstCalc() {
        return vlrSubstCalc;
   }

   public void setVlrSubstCalc(BigDecimal vlrSubstCalc) {
        markAsChanged("VLRSUBSTCALC", vlrSubstCalc);
        this.vlrSubstCalc = vlrSubstCalc;
   }

   public BigDecimal getVlrSubstNota() {
        return vlrSubstNota;
   }

   public void setVlrSubstNota(BigDecimal vlrSubstNota) {
        markAsChanged("VLRSUBSTNOTA", vlrSubstNota);
        this.vlrSubstNota = vlrSubstNota;
   }

   public BigDecimal getVlrTotDivSubst() {
        return vlrTotDivSubst;
   }

   public void setVlrTotDivSubst(BigDecimal vlrTotDivSubst) {
        markAsChanged("VLRTOTDIVSUBST", vlrTotDivSubst);
        this.vlrTotDivSubst = vlrTotDivSubst;
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
        this.setOriginalVO(vo);
        this.baseSubstitCalc = vo.asBigDecimal("BASESUBSTITCALC");
        this.baseSubstitNota = vo.asBigDecimal("BASESUBSTITNOTA");
        this.digitado = vo.asString("DIGITADO");
        this.dtNeg = vo.asTimestamp("DTNEG");
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.status = vo.asString("STATUS");
        this.vlrSubstCalc = vo.asBigDecimal("VLRSUBSTCALC");
        this.vlrSubstNota = vo.asBigDecimal("VLRSUBSTNOTA");
        this.vlrTotDivSubst = vo.asBigDecimal("VLRTOTDIVSUBST");
        return this;
   }
}
