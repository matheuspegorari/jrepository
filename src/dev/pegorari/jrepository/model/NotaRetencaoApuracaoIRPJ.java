package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotaRetencaoApuracaoIRPJ extends AbstractSankhyaEntity<NotaRetencaoApuracaoIRPJ> {
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

   public Timestamp getDtEntSai() {
        return this.getVo().asTimestamp("DTENTSAI");
   }

   public void setDtEntSai(Timestamp dtEntSai) {
        markAsChanged("DTENTSAI", dtEntSai);
   }

   public Timestamp getDtNeg() {
        return this.getVo().asTimestamp("DTNEG");
   }

   public void setDtNeg(Timestamp dtNeg) {
        markAsChanged("DTNEG", dtNeg);
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

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public String getSerieNota() {
        return this.getVo().asString("SERIENOTA");
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
   }

   public BigDecimal getVlrCsll() {
        return this.getVo().asBigDecimal("VLRCSLL");
   }

   public void setVlrCsll(BigDecimal vlrCsll) {
        markAsChanged("VLRCSLL", vlrCsll);
   }

   public BigDecimal getVlrIrpj() {
        return this.getVo().asBigDecimal("VLRIRPJ");
   }

   public void setVlrIrpj(BigDecimal vlrIrpj) {
        markAsChanged("VLRIRPJ", vlrIrpj);
   }

   public BigDecimal getVlrNota() {
        return this.getVo().asBigDecimal("VLRNOTA");
   }

   public void setVlrNota(BigDecimal vlrNota) {
        markAsChanged("VLRNOTA", vlrNota);
   }

   public String getRetemIrpjCsll() {
        return this.getVo().asString("RETEMIRPJCSLL");
   }

   public void setRetemIrpjCsll(String retemIrpjCsll) {
        markAsChanged("RETEMIRPJCSLL", retemIrpjCsll);
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
        this.setVo(vo);
        return this;
   }
}
