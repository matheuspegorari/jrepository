package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotaRetencaoApuracaoIRPJ extends AbstractSankhyaEntity<NotaRetencaoApuracaoIRPJ> {
   private BigDecimal codEmp;
   private BigDecimal codParc;
   private Timestamp dtEntSai;
   private Timestamp dtNeg;
   private BigDecimal numNota;
   private BigDecimal nuNota;
   private Timestamp referencia;
   private String serieNota;
   private BigDecimal vlrCsll;
   private BigDecimal vlrIrpj;
   private BigDecimal vlrNota;
   private String retemIrpjCsll;

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

   public Timestamp getDtEntSai() {
        return dtEntSai;
   }

   public void setDtEntSai(Timestamp dtEntSai) {
        markAsChanged("DTENTSAI", dtEntSai);
        this.dtEntSai = dtEntSai;
   }

   public Timestamp getDtNeg() {
        return dtNeg;
   }

   public void setDtNeg(Timestamp dtNeg) {
        markAsChanged("DTNEG", dtNeg);
        this.dtNeg = dtNeg;
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

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public String getSerieNota() {
        return serieNota;
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
        this.serieNota = serieNota;
   }

   public BigDecimal getVlrCsll() {
        return vlrCsll;
   }

   public void setVlrCsll(BigDecimal vlrCsll) {
        markAsChanged("VLRCSLL", vlrCsll);
        this.vlrCsll = vlrCsll;
   }

   public BigDecimal getVlrIrpj() {
        return vlrIrpj;
   }

   public void setVlrIrpj(BigDecimal vlrIrpj) {
        markAsChanged("VLRIRPJ", vlrIrpj);
        this.vlrIrpj = vlrIrpj;
   }

   public BigDecimal getVlrNota() {
        return vlrNota;
   }

   public void setVlrNota(BigDecimal vlrNota) {
        markAsChanged("VLRNOTA", vlrNota);
        this.vlrNota = vlrNota;
   }

   public String getRetemIrpjCsll() {
        return retemIrpjCsll;
   }

   public void setRetemIrpjCsll(String retemIrpjCsll) {
        markAsChanged("RETEMIRPJCSLL", retemIrpjCsll);
        this.retemIrpjCsll = retemIrpjCsll;
   }

   @Override
   public String getTableName() {
        return "TCBIRPJNFRET";
   }

   @Override
   public String getEntityName() {
        return "NotaRetencaoApuracaoIRPJ";
   }

   @Override
   public NotaRetencaoApuracaoIRPJ fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.dtEntSai = vo.asTimestamp("DTENTSAI");
        this.dtNeg = vo.asTimestamp("DTNEG");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.serieNota = vo.asString("SERIENOTA");
        this.vlrCsll = vo.asBigDecimal("VLRCSLL");
        this.vlrIrpj = vo.asBigDecimal("VLRIRPJ");
        this.vlrNota = vo.asBigDecimal("VLRNOTA");
        this.retemIrpjCsll = vo.asString("RETEMIRPJCSLL");
        return this;
   }
}
