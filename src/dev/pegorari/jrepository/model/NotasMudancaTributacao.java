package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotasMudancaTributacao extends AbstractSankhyaEntity<NotasMudancaTributacao> {
   public BigDecimal getBaseSubstit() {
        return this.getVo().asBigDecimal("BASESUBSTIT");
   }

   public void setBaseSubstit(BigDecimal baseSubstit) {
        markAsChanged("BASESUBSTIT", baseSubstit);
   }

   public BigDecimal getBaseSubstitRec() {
        return this.getVo().asBigDecimal("BASESUBSTITREC");
   }

   public void setBaseSubstitRec(BigDecimal baseSubstitRec) {
        markAsChanged("BASESUBSTITREC", baseSubstitRec);
   }

   public BigDecimal getBaseSubstitUn() {
        return this.getVo().asBigDecimal("BASESUBSTITUN");
   }

   public void setBaseSubstitUn(BigDecimal baseSubstitUn) {
        markAsChanged("BASESUBSTITUN", baseSubstitUn);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public Timestamp getDtMtp() {
        return this.getVo().asTimestamp("DTMTP");
   }

   public void setDtMtp(Timestamp dtMtp) {
        markAsChanged("DTMTP", dtMtp);
   }

   public BigDecimal getNuNotaCompra() {
        return this.getVo().asBigDecimal("NUNOTACOMPRA");
   }

   public void setNuNotaCompra(BigDecimal nuNotaCompra) {
        markAsChanged("NUNOTACOMPRA", nuNotaCompra);
   }

   public BigDecimal getQtdNeg() {
        return this.getVo().asBigDecimal("QTDNEG");
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        markAsChanged("QTDNEG", qtdNeg);
   }

   public BigDecimal getQtdRec() {
        return this.getVo().asBigDecimal("QTDREC");
   }

   public void setQtdRec(BigDecimal qtdRec) {
        markAsChanged("QTDREC", qtdRec);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
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
        this.setVo(vo);
        return this;
   }
}
