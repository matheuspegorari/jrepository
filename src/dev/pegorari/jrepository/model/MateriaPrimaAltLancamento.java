package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MateriaPrimaAltLancamento extends AbstractSankhyaEntity<MateriaPrimaAltLancamento> {
   public BigDecimal getNuLop() {
        return this.getVo().asBigDecimal("NULOP");
   }

   public void setNuLop(BigDecimal nuLop) {
        markAsChanged("NULOP", nuLop);
   }

   public BigDecimal getQtdMistura() {
        return this.getVo().asBigDecimal("QTDMISTURA");
   }

   public void setQtdMistura(BigDecimal qtdMistura) {
        markAsChanged("QTDMISTURA", qtdMistura);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public String getControleMpAlt() {
        return this.getVo().asString("CONTROLEMPALT");
   }

   public void setControleMpAlt(String controleMpAlt) {
        markAsChanged("CONTROLEMPALT", controleMpAlt);
   }

   public BigDecimal getCodProdMpAlt() {
        return this.getVo().asBigDecimal("CODPRODMPALT");
   }

   public void setCodProdMpAlt(BigDecimal codProdMpAlt) {
        markAsChanged("CODPRODMPALT", codProdMpAlt);
   }

   public String getControleMp() {
        return this.getVo().asString("CONTROLEMP");
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
   }

   public BigDecimal getCodProdMp() {
        return this.getVo().asBigDecimal("CODPRODMP");
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public BigDecimal getSeqOp() {
        return this.getVo().asBigDecimal("SEQOP");
   }

   public void setSeqOp(BigDecimal seqOp) {
        markAsChanged("SEQOP", seqOp);
   }

   public BigDecimal getSeqMpa() {
        return this.getVo().asBigDecimal("SEQMPA");
   }

   public void setSeqMpa(BigDecimal seqMpa) {
        markAsChanged("SEQMPA", seqMpa);
   }

   @Override
   public String getTableName() {
        return "TPRMPALOP";
   }

   @Override
   public String getEntityName() {
        return "MateriaPrimaAltLancamento";
   }

   @Override
   public MateriaPrimaAltLancamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
