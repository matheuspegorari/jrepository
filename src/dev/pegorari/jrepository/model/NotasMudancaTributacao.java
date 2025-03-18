package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotasMudancaTributacao extends AbstractSankhyaEntity<NotasMudancaTributacao> {
   private BigDecimal baseSubstit;
   private BigDecimal baseSubstitRec;
   private BigDecimal baseSubstitUn;
   private BigDecimal codEmp;
   private BigDecimal codProd;
   private Timestamp dtMtp;
   private BigDecimal nuNotaCompra;
   private BigDecimal qtdNeg;
   private BigDecimal qtdRec;
   private String digitado;

   public BigDecimal getBaseSubstit() {
        return baseSubstit;
   }

   public void setBaseSubstit(BigDecimal baseSubstit) {
        markAsChanged("BASESUBSTIT", baseSubstit);
        this.baseSubstit = baseSubstit;
   }

   public BigDecimal getBaseSubstitRec() {
        return baseSubstitRec;
   }

   public void setBaseSubstitRec(BigDecimal baseSubstitRec) {
        markAsChanged("BASESUBSTITREC", baseSubstitRec);
        this.baseSubstitRec = baseSubstitRec;
   }

   public BigDecimal getBaseSubstitUn() {
        return baseSubstitUn;
   }

   public void setBaseSubstitUn(BigDecimal baseSubstitUn) {
        markAsChanged("BASESUBSTITUN", baseSubstitUn);
        this.baseSubstitUn = baseSubstitUn;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public Timestamp getDtMtp() {
        return dtMtp;
   }

   public void setDtMtp(Timestamp dtMtp) {
        markAsChanged("DTMTP", dtMtp);
        this.dtMtp = dtMtp;
   }

   public BigDecimal getNuNotaCompra() {
        return nuNotaCompra;
   }

   public void setNuNotaCompra(BigDecimal nuNotaCompra) {
        markAsChanged("NUNOTACOMPRA", nuNotaCompra);
        this.nuNotaCompra = nuNotaCompra;
   }

   public BigDecimal getQtdNeg() {
        return qtdNeg;
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        markAsChanged("QTDNEG", qtdNeg);
        this.qtdNeg = qtdNeg;
   }

   public BigDecimal getQtdRec() {
        return qtdRec;
   }

   public void setQtdRec(BigDecimal qtdRec) {
        markAsChanged("QTDREC", qtdRec);
        this.qtdRec = qtdRec;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
        this.digitado = digitado;
   }

   @Override
   public String getTableName() {
        return "TGFNPMT";
   }

   @Override
   public String getEntityName() {
        return "NotasMudancaTributacao";
   }

   @Override
   public NotasMudancaTributacao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.baseSubstit = vo.asBigDecimal("BASESUBSTIT");
        this.baseSubstitRec = vo.asBigDecimal("BASESUBSTITREC");
        this.baseSubstitUn = vo.asBigDecimal("BASESUBSTITUN");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.dtMtp = vo.asTimestamp("DTMTP");
        this.nuNotaCompra = vo.asBigDecimal("NUNOTACOMPRA");
        this.qtdNeg = vo.asBigDecimal("QTDNEG");
        this.qtdRec = vo.asBigDecimal("QTDREC");
        this.digitado = vo.asString("DIGITADO");
        return this;
   }
}
