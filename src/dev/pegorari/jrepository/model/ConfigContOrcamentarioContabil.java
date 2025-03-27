package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConfigContOrcamentarioContabil extends AbstractSankhyaEntity<ConfigContOrcamentarioContabil> {
   public String getApresCod() {
        return this.getVo().asString("APRESCOD");
   }

   public void setApresCod(String apresCod) {
        markAsChanged("APRESCOD", apresCod);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodCco() {
        return this.getVo().asBigDecimal("CODCCO");
   }

   public void setCodCco(BigDecimal codCco) {
        markAsChanged("CODCCO", codCco);
   }

   public String getCrPart() {
        return this.getVo().asString("CRPART");
   }

   public void setCrPart(String crPart) {
        markAsChanged("CRPART", crPart);
   }

   public String getCtaCtbPart() {
        return this.getVo().asString("CTACTBPART");
   }

   public void setCtaCtbPart(String ctaCtbPart) {
        markAsChanged("CTACTBPART", ctaCtbPart);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getDetalharPor() {
        return this.getVo().asString("DETALHARPOR");
   }

   public void setDetalharPor(String detalharPor) {
        markAsChanged("DETALHARPOR", detalharPor);
   }

   public String getEmpPart() {
        return this.getVo().asString("EMPPART");
   }

   public void setEmpPart(String empPart) {
        markAsChanged("EMPPART", empPart);
   }

   public String getGruCtaCtbPart() {
        return this.getVo().asString("GRUCTACTBPART");
   }

   public void setGruCtaCtbPart(String gruCtaCtbPart) {
        markAsChanged("GRUCTACTBPART", gruCtaCtbPart);
   }

   public String getPeriodic() {
        return this.getVo().asString("PERIODIC");
   }

   public void setPeriodic(String periodic) {
        markAsChanged("PERIODIC", periodic);
   }

   public String getProjPart() {
        return this.getVo().asString("PROJPART");
   }

   public void setProjPart(String projPart) {
        markAsChanged("PROJPART", projPart);
   }

   public BigDecimal getDtIniCorc() {
        return this.getVo().asBigDecimal("DTINICORC");
   }

   public void setDtIniCorc(BigDecimal dtIniCorc) {
        markAsChanged("DTINICORC", dtIniCorc);
   }

   public String getCalDesInRecDesp() {
        return this.getVo().asString("CALDESINRECDESP");
   }

   public void setCalDesInRecDesp(String calDesInRecDesp) {
        markAsChanged("CALDESINRECDESP", calDesInRecDesp);
   }

   public String getUsaSalConReali() {
        return this.getVo().asString("USASALCONREALI");
   }

   public void setUsaSalConReali(String usaSalConReali) {
        markAsChanged("USASALCONREALI", usaSalConReali);
   }

   public String getZerarCtaCtab() {
        return this.getVo().asString("ZERARCTACTAB");
   }

   public void setZerarCtaCtab(String zerarCtaCtab) {
        markAsChanged("ZERARCTACTAB", zerarCtaCtab);
   }

   @Override
   public String getTableName() {
        return "TCBCCO";
   }

   @Override
   public String getEntityName() {
        return "ConfigContOrcamentarioContabil";
   }

   @Override
   public ConfigContOrcamentarioContabil fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
