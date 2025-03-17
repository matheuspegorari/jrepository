package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemMateriaPrimaAlternativa extends AbstractSankhyaEntity<ItemMateriaPrimaAlternativa> {
   private BigDecimal qtdFatNota;
   private BigDecimal qtdMistura;
   private BigDecimal ordem;
   private String controleMpAlt;
   private BigDecimal codProdMpAlt;
   private String controleMp;
   private BigDecimal codProdMp;
   private String controlePa;
   private BigDecimal codProdPa;
   private BigDecimal idIproc;

   public BigDecimal getQtdFatNota() {
        return qtdFatNota;
   }

   public void setQtdFatNota(BigDecimal qtdFatNota) {
        this.qtdFatNota = qtdFatNota;
   }

   public BigDecimal getQtdMistura() {
        return qtdMistura;
   }

   public void setQtdMistura(BigDecimal qtdMistura) {
        this.qtdMistura = qtdMistura;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public String getControleMpAlt() {
        return controleMpAlt;
   }

   public void setControleMpAlt(String controleMpAlt) {
        this.controleMpAlt = controleMpAlt;
   }

   public BigDecimal getCodProdMpAlt() {
        return codProdMpAlt;
   }

   public void setCodProdMpAlt(BigDecimal codProdMpAlt) {
        this.codProdMpAlt = codProdMpAlt;
   }

   public String getControleMp() {
        return controleMp;
   }

   public void setControleMp(String controleMp) {
        this.controleMp = controleMp;
   }

   public BigDecimal getCodProdMp() {
        return codProdMp;
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        this.codProdMp = codProdMp;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        this.idIproc = idIproc;
   }

   @Override
   public String getTableName() {
        return "TPRIMPA";
   }

   @Override
   public String getEntityName() {
        return "ItemMateriaPrimaAlternativa";
   }

   @Override
   public ItemMateriaPrimaAlternativa fromVO(DynamicVO vo) {
        this.qtdFatNota = vo.asBigDecimal("QTDFATNOTA");
        this.qtdMistura = vo.asBigDecimal("QTDMISTURA");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.controleMpAlt = vo.asString("CONTROLEMPALT");
        this.codProdMpAlt = vo.asBigDecimal("CODPRODMPALT");
        this.controleMp = vo.asString("CONTROLEMP");
        this.codProdMp = vo.asBigDecimal("CODPRODMP");
        this.controlePa = vo.asString("CONTROLEPA");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.idIproc = vo.asBigDecimal("IDIPROC");
        return this;
   }
}
