package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MateriaPrimaAltLancamento extends AbstractSankhyaEntity<MateriaPrimaAltLancamento> {
   private BigDecimal nuLop;
   private BigDecimal qtdMistura;
   private BigDecimal ordem;
   private String controleMpAlt;
   private BigDecimal codProdMpAlt;
   private String controleMp;
   private BigDecimal codProdMp;
   private String controlePa;
   private BigDecimal codProdPa;
   private BigDecimal seqOp;
   private BigDecimal seqMpa;

   public BigDecimal getNuLop() {
        return nuLop;
   }

   public void setNuLop(BigDecimal nuLop) {
        markAsChanged("NULOP", nuLop);
        this.nuLop = nuLop;
   }

   public BigDecimal getQtdMistura() {
        return qtdMistura;
   }

   public void setQtdMistura(BigDecimal qtdMistura) {
        markAsChanged("QTDMISTURA", qtdMistura);
        this.qtdMistura = qtdMistura;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
        this.ordem = ordem;
   }

   public String getControleMpAlt() {
        return controleMpAlt;
   }

   public void setControleMpAlt(String controleMpAlt) {
        markAsChanged("CONTROLEMPALT", controleMpAlt);
        this.controleMpAlt = controleMpAlt;
   }

   public BigDecimal getCodProdMpAlt() {
        return codProdMpAlt;
   }

   public void setCodProdMpAlt(BigDecimal codProdMpAlt) {
        markAsChanged("CODPRODMPALT", codProdMpAlt);
        this.codProdMpAlt = codProdMpAlt;
   }

   public String getControleMp() {
        return controleMp;
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
        this.controleMp = controleMp;
   }

   public BigDecimal getCodProdMp() {
        return codProdMp;
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
        this.codProdMp = codProdMp;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
        this.controlePa = controlePa;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public BigDecimal getSeqOp() {
        return seqOp;
   }

   public void setSeqOp(BigDecimal seqOp) {
        markAsChanged("SEQOP", seqOp);
        this.seqOp = seqOp;
   }

   public BigDecimal getSeqMpa() {
        return seqMpa;
   }

   public void setSeqMpa(BigDecimal seqMpa) {
        markAsChanged("SEQMPA", seqMpa);
        this.seqMpa = seqMpa;
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
        this.nuLop = vo.asBigDecimal("NULOP");
        this.qtdMistura = vo.asBigDecimal("QTDMISTURA");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.controleMpAlt = vo.asString("CONTROLEMPALT");
        this.codProdMpAlt = vo.asBigDecimal("CODPRODMPALT");
        this.controleMp = vo.asString("CONTROLEMP");
        this.codProdMp = vo.asBigDecimal("CODPRODMP");
        this.controlePa = vo.asString("CONTROLEPA");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.seqOp = vo.asBigDecimal("SEQOP");
        this.seqMpa = vo.asBigDecimal("SEQMPA");
        return this;
   }
}
