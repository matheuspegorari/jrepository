package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class LayoutNota extends AbstractSankhyaEntity<LayoutNota> {
   public BigDecimal getModulo() {
        return this.getVo().asBigDecimal("MODULO");
   }

   public void setModulo(BigDecimal modulo) {
        markAsChanged("MODULO", modulo);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public char[] getLayout() {
        return this.getVo().asClob("LAYOUT");
   }

   public void setLayout(char[] layout) {
        markAsChanged("LAYOUT", layout);
   }

   public BigDecimal getNuLayout() {
        return this.getVo().asBigDecimal("NULAYOUT");
   }

   public void setNuLayout(BigDecimal nuLayout) {
        markAsChanged("NULAYOUT", nuLayout);
   }

   public String getPadrao() {
        return this.getVo().asString("PADRAO");
   }

   public void setPadrao(String padrao) {
        markAsChanged("PADRAO", padrao);
   }

   public String getTipMov() {
        return this.getVo().asString("TIPMOV");
   }

   public void setTipMov(String tipMov) {
        markAsChanged("TIPMOV", tipMov);
   }

   public String getUsarCheckoutProd() {
        return this.getVo().asString("USARCHECKOUTPROD");
   }

   public void setUsarCheckoutProd(String usarCheckoutProd) {
        markAsChanged("USARCHECKOUTPROD", usarCheckoutProd);
   }

   public String getTipRec() {
        return this.getVo().asString("TIPREC");
   }

   public void setTipRec(String tipRec) {
        markAsChanged("TIPREC", tipRec);
   }

   @Override
   public String getTableName() {
        return "TGFLAY";
   }

   @Override
   public String getEntityName() {
        return "LayoutNota";
   }

   @Override
   public LayoutNota fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
