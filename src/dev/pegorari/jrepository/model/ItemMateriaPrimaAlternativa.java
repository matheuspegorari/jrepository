package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemMateriaPrimaAlternativa extends AbstractSankhyaEntity<ItemMateriaPrimaAlternativa> {
   public BigDecimal getQtdFatNota() {
        return this.getVo().asBigDecimal("QTDFATNOTA");
   }

   public void setQtdFatNota(BigDecimal qtdFatNota) {
        markAsChanged("QTDFATNOTA", qtdFatNota);
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

   public BigDecimal getIdIproc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
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
        this.setVo(vo);
        return this;
   }
}
