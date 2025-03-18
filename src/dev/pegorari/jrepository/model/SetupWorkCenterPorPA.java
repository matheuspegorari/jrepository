package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SetupWorkCenterPorPA extends AbstractSankhyaEntity<SetupWorkCenterPorPA> {
   private BigDecimal codProdPa;
   private String controlePa;
   private BigDecimal nuAst;
   private String val;
   private BigDecimal valDecimal;
   private BigDecimal valInteiro;
   private String valMemo;
   private String valTexto;

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
        this.controlePa = controlePa;
   }

   public BigDecimal getNuAst() {
        return nuAst;
   }

   public void setNuAst(BigDecimal nuAst) {
        markAsChanged("NUAST", nuAst);
        this.nuAst = nuAst;
   }

   public String getVal() {
        return val;
   }

   public void setVal(String val) {
        markAsChanged("VAL", val);
        this.val = val;
   }

   public BigDecimal getValDecimal() {
        return valDecimal;
   }

   public void setValDecimal(BigDecimal valDecimal) {
        markAsChanged("VALDECIMAL", valDecimal);
        this.valDecimal = valDecimal;
   }

   public BigDecimal getValInteiro() {
        return valInteiro;
   }

   public void setValInteiro(BigDecimal valInteiro) {
        markAsChanged("VALINTEIRO", valInteiro);
        this.valInteiro = valInteiro;
   }

   public String getValMemo() {
        return valMemo;
   }

   public void setValMemo(String valMemo) {
        markAsChanged("VALMEMO", valMemo);
        this.valMemo = valMemo;
   }

   public String getValTexto() {
        return valTexto;
   }

   public void setValTexto(String valTexto) {
        markAsChanged("VALTEXTO", valTexto);
        this.valTexto = valTexto;
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
        this.setOriginalVO(vo);
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.controlePa = vo.asString("CONTROLEPA");
        this.nuAst = vo.asBigDecimal("NUAST");
        this.val = vo.asString("VAL");
        this.valDecimal = vo.asBigDecimal("VALDECIMAL");
        this.valInteiro = vo.asBigDecimal("VALINTEIRO");
        this.valMemo = vo.asString("VALMEMO");
        this.valTexto = vo.asString("VALTEXTO");
        return this;
   }
}
