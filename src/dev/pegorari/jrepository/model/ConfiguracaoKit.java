package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConfiguracaoKit extends AbstractSankhyaEntity<ConfiguracaoKit> {
   public String getDistDescKitComp() {
        return this.getVo().asString("DISTDESCKITCOMP");
   }

   public void setDistDescKitComp(String distDescKitComp) {
        markAsChanged("DISTDESCKITCOMP", distDescKitComp);
   }

   public String getCalcImpKit() {
        return this.getVo().asString("CALCIMPKIT");
   }

   public void setCalcImpKit(String calcImpKit) {
        markAsChanged("CALCIMPKIT", calcImpKit);
   }

   public String getDistribuiKitComp() {
        return this.getVo().asString("DISTRIBUIKITCOMP");
   }

   public void setDistribuiKitComp(String distribuiKitComp) {
        markAsChanged("DISTRIBUIKITCOMP", distribuiKitComp);
   }

   public String getUtilPrecoAbaComp() {
        return this.getVo().asString("UTILPRECOABACOMP");
   }

   public void setUtilPrecoAbaComp(String utilPrecoAbaComp) {
        markAsChanged("UTILPRECOABACOMP", utilPrecoAbaComp);
   }

   public String getSomaIcmsCompKit() {
        return this.getVo().asString("SOMAICMSCOMPKIT");
   }

   public void setSomaIcmsCompKit(String somaIcmsCompKit) {
        markAsChanged("SOMAICMSCOMPKIT", somaIcmsCompKit);
   }

   public String getExplodComp() {
        return this.getVo().asString("EXPLODCOMP");
   }

   public void setExplodComp(String explodComp) {
        markAsChanged("EXPLODCOMP", explodComp);
   }

   public BigDecimal getCodConfKit() {
        return this.getVo().asBigDecimal("CODCONFKIT");
   }

   public void setCodConfKit(BigDecimal codConfKit) {
        markAsChanged("CODCONFKIT", codConfKit);
   }

   public String getDescrConfKit() {
        return this.getVo().asString("DESCRCONFKIT");
   }

   public void setDescrConfKit(String descrConfKit) {
        markAsChanged("DESCRCONFKIT", descrConfKit);
   }

   public String getSomaPrecoCompKit() {
        return this.getVo().asString("SOMAPRECOCOMPKIT");
   }

   public void setSomaPrecoCompKit(String somaPrecoCompKit) {
        markAsChanged("SOMAPRECOCOMPKIT", somaPrecoCompKit);
   }

   public String getSomaCustoCompKit() {
        return this.getVo().asString("SOMACUSTOCOMPKIT");
   }

   public void setSomaCustoCompKit(String somaCustoCompKit) {
        markAsChanged("SOMACUSTOCOMPKIT", somaCustoCompKit);
   }

   public String getFaKitEstComp() {
        return this.getVo().asString("FAKITESTCOMP");
   }

   public void setFaKitEstComp(String faKitEstComp) {
        markAsChanged("FAKITESTCOMP", faKitEstComp);
   }

   @Override
   public String getTableName() {
        return "TSIKIT";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoKit";
   }

   @Override
   public ConfiguracaoKit fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
