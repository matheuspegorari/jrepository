package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConfiguracaoKit extends AbstractSankhyaEntity<ConfiguracaoKit> {
   private String distDescKitComp;
   private String calcImpKit;
   private String distribuiKitComp;
   private String utilPrecoAbaComp;
   private String somaIcmsCompKit;
   private String explodComp;
   private BigDecimal codConfKit;
   private String descrConfKit;
   private String somaPrecoCompKit;
   private String somaCustoCompKit;
   private String faKitEstComp;

   public String getDistDescKitComp() {
        return distDescKitComp;
   }

   public void setDistDescKitComp(String distDescKitComp) {
        markAsChanged("DISTDESCKITCOMP", distDescKitComp);
        this.distDescKitComp = distDescKitComp;
   }

   public String getCalcImpKit() {
        return calcImpKit;
   }

   public void setCalcImpKit(String calcImpKit) {
        markAsChanged("CALCIMPKIT", calcImpKit);
        this.calcImpKit = calcImpKit;
   }

   public String getDistribuiKitComp() {
        return distribuiKitComp;
   }

   public void setDistribuiKitComp(String distribuiKitComp) {
        markAsChanged("DISTRIBUIKITCOMP", distribuiKitComp);
        this.distribuiKitComp = distribuiKitComp;
   }

   public String getUtilPrecoAbaComp() {
        return utilPrecoAbaComp;
   }

   public void setUtilPrecoAbaComp(String utilPrecoAbaComp) {
        markAsChanged("UTILPRECOABACOMP", utilPrecoAbaComp);
        this.utilPrecoAbaComp = utilPrecoAbaComp;
   }

   public String getSomaIcmsCompKit() {
        return somaIcmsCompKit;
   }

   public void setSomaIcmsCompKit(String somaIcmsCompKit) {
        markAsChanged("SOMAICMSCOMPKIT", somaIcmsCompKit);
        this.somaIcmsCompKit = somaIcmsCompKit;
   }

   public String getExplodComp() {
        return explodComp;
   }

   public void setExplodComp(String explodComp) {
        markAsChanged("EXPLODCOMP", explodComp);
        this.explodComp = explodComp;
   }

   public BigDecimal getCodConfKit() {
        return codConfKit;
   }

   public void setCodConfKit(BigDecimal codConfKit) {
        markAsChanged("CODCONFKIT", codConfKit);
        this.codConfKit = codConfKit;
   }

   public String getDescrConfKit() {
        return descrConfKit;
   }

   public void setDescrConfKit(String descrConfKit) {
        markAsChanged("DESCRCONFKIT", descrConfKit);
        this.descrConfKit = descrConfKit;
   }

   public String getSomaPrecoCompKit() {
        return somaPrecoCompKit;
   }

   public void setSomaPrecoCompKit(String somaPrecoCompKit) {
        markAsChanged("SOMAPRECOCOMPKIT", somaPrecoCompKit);
        this.somaPrecoCompKit = somaPrecoCompKit;
   }

   public String getSomaCustoCompKit() {
        return somaCustoCompKit;
   }

   public void setSomaCustoCompKit(String somaCustoCompKit) {
        markAsChanged("SOMACUSTOCOMPKIT", somaCustoCompKit);
        this.somaCustoCompKit = somaCustoCompKit;
   }

   public String getFaKitEstComp() {
        return faKitEstComp;
   }

   public void setFaKitEstComp(String faKitEstComp) {
        markAsChanged("FAKITESTCOMP", faKitEstComp);
        this.faKitEstComp = faKitEstComp;
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
        this.setOriginalVO(vo);
        this.distDescKitComp = vo.asString("DISTDESCKITCOMP");
        this.calcImpKit = vo.asString("CALCIMPKIT");
        this.distribuiKitComp = vo.asString("DISTRIBUIKITCOMP");
        this.utilPrecoAbaComp = vo.asString("UTILPRECOABACOMP");
        this.somaIcmsCompKit = vo.asString("SOMAICMSCOMPKIT");
        this.explodComp = vo.asString("EXPLODCOMP");
        this.codConfKit = vo.asBigDecimal("CODCONFKIT");
        this.descrConfKit = vo.asString("DESCRCONFKIT");
        this.somaPrecoCompKit = vo.asString("SOMAPRECOCOMPKIT");
        this.somaCustoCompKit = vo.asString("SOMACUSTOCOMPKIT");
        this.faKitEstComp = vo.asString("FAKITESTCOMP");
        return this;
   }
}
