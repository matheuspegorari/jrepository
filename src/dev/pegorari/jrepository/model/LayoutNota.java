package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class LayoutNota implements SankhyaEntity<LayoutNota> {

   private BigDecimal modulo;
   private String descricao;
   private char[] layout;
   private BigDecimal nuLayout;
   private String padrao;
   private String tipMov;
   private String usarCheckoutProd;
   private String tipRec;

   public BigDecimal getModulo() {
        return modulo;
   }

   public void setModulo(BigDecimal modulo) {
        this.modulo = modulo;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public char[] getLayout() {
        return layout;
   }

   public void setLayout(char[] layout) {
        this.layout = layout;
   }

   public BigDecimal getNuLayout() {
        return nuLayout;
   }

   public void setNuLayout(BigDecimal nuLayout) {
        this.nuLayout = nuLayout;
   }

   public String getPadrao() {
        return padrao;
   }

   public void setPadrao(String padrao) {
        this.padrao = padrao;
   }

   public String getTipMov() {
        return tipMov;
   }

   public void setTipMov(String tipMov) {
        this.tipMov = tipMov;
   }

   public String getUsarCheckoutProd() {
        return usarCheckoutProd;
   }

   public void setUsarCheckoutProd(String usarCheckoutProd) {
        this.usarCheckoutProd = usarCheckoutProd;
   }

   public String getTipRec() {
        return tipRec;
   }

   public void setTipRec(String tipRec) {
        this.tipRec = tipRec;
   }

   @Override
   public String getEntityName() {
        return "LayoutNota";
   }

   @Override
   public LayoutNota fromVO(DynamicVO vo) {
        this.modulo = vo.asBigDecimal("MODULO");
        this.descricao = vo.asString("DESCRICAO");
        this.layout = vo.asClob("LAYOUT");
        this.nuLayout = vo.asBigDecimal("NULAYOUT");
        this.padrao = vo.asString("PADRAO");
        this.tipMov = vo.asString("TIPMOV");
        this.usarCheckoutProd = vo.asString("USARCHECKOUTPROD");
        this.tipRec = vo.asString("TIPREC");
        return this;
   }
}
