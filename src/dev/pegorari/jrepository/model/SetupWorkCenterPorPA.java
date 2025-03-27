package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SetupWorkCenterPorPA extends AbstractSankhyaEntity<SetupWorkCenterPorPA> {
   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public BigDecimal getNuAst() {
        return this.getVo().asBigDecimal("NUAST");
   }

   public void setNuAst(BigDecimal nuAst) {
        markAsChanged("NUAST", nuAst);
   }

   public String getVal() {
        return this.getVo().asString("VAL");
   }

   public void setVal(String val) {
        markAsChanged("VAL", val);
   }

   public BigDecimal getValDecimal() {
        return this.getVo().asBigDecimal("VALDECIMAL");
   }

   public void setValDecimal(BigDecimal valDecimal) {
        markAsChanged("VALDECIMAL", valDecimal);
   }

   public BigDecimal getValInteiro() {
        return this.getVo().asBigDecimal("VALINTEIRO");
   }

   public void setValInteiro(BigDecimal valInteiro) {
        markAsChanged("VALINTEIRO", valInteiro);
   }

   public String getValMemo() {
        return this.getVo().asString("VALMEMO");
   }

   public void setValMemo(String valMemo) {
        markAsChanged("VALMEMO", valMemo);
   }

   public String getValTexto() {
        return this.getVo().asString("VALTEXTO");
   }

   public void setValTexto(String valTexto) {
        markAsChanged("VALTEXTO", valTexto);
   }

   @Override
   public String getTableName() {
        return "TPRSWXP";
   }

   @Override
   public String getEntityName() {
        return "SetupWorkCenterPorPA";
   }

   @Override
   public SetupWorkCenterPorPA fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
