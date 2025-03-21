package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConfigContOrcamentarioContabil extends AbstractSankhyaEntity<ConfigContOrcamentarioContabil> {
   private String apresCod;
   private String ativo;
   private BigDecimal codCco;
   private String crPart;
   private String ctaCtbPart;
   private String descricao;
   private String detalharPor;
   private String empPart;
   private String gruCtaCtbPart;
   private String periodic;
   private String projPart;
   private BigDecimal dtIniCorc;
   private String calDesInRecDesp;
   private String usaSalConReali;
   private String zerarCtaCtab;

   public String getApresCod() {
        return apresCod;
   }

   public void setApresCod(String apresCod) {
        markAsChanged("APRESCOD", apresCod);
        this.apresCod = apresCod;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodCco() {
        return codCco;
   }

   public void setCodCco(BigDecimal codCco) {
        markAsChanged("CODCCO", codCco);
        this.codCco = codCco;
   }

   public String getCrPart() {
        return crPart;
   }

   public void setCrPart(String crPart) {
        markAsChanged("CRPART", crPart);
        this.crPart = crPart;
   }

   public String getCtaCtbPart() {
        return ctaCtbPart;
   }

   public void setCtaCtbPart(String ctaCtbPart) {
        markAsChanged("CTACTBPART", ctaCtbPart);
        this.ctaCtbPart = ctaCtbPart;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getDetalharPor() {
        return detalharPor;
   }

   public void setDetalharPor(String detalharPor) {
        markAsChanged("DETALHARPOR", detalharPor);
        this.detalharPor = detalharPor;
   }

   public String getEmpPart() {
        return empPart;
   }

   public void setEmpPart(String empPart) {
        markAsChanged("EMPPART", empPart);
        this.empPart = empPart;
   }

   public String getGruCtaCtbPart() {
        return gruCtaCtbPart;
   }

   public void setGruCtaCtbPart(String gruCtaCtbPart) {
        markAsChanged("GRUCTACTBPART", gruCtaCtbPart);
        this.gruCtaCtbPart = gruCtaCtbPart;
   }

   public String getPeriodic() {
        return periodic;
   }

   public void setPeriodic(String periodic) {
        markAsChanged("PERIODIC", periodic);
        this.periodic = periodic;
   }

   public String getProjPart() {
        return projPart;
   }

   public void setProjPart(String projPart) {
        markAsChanged("PROJPART", projPart);
        this.projPart = projPart;
   }

   public BigDecimal getDtIniCorc() {
        return dtIniCorc;
   }

   public void setDtIniCorc(BigDecimal dtIniCorc) {
        markAsChanged("DTINICORC", dtIniCorc);
        this.dtIniCorc = dtIniCorc;
   }

   public String getCalDesInRecDesp() {
        return calDesInRecDesp;
   }

   public void setCalDesInRecDesp(String calDesInRecDesp) {
        markAsChanged("CALDESINRECDESP", calDesInRecDesp);
        this.calDesInRecDesp = calDesInRecDesp;
   }

   public String getUsaSalConReali() {
        return usaSalConReali;
   }

   public void setUsaSalConReali(String usaSalConReali) {
        markAsChanged("USASALCONREALI", usaSalConReali);
        this.usaSalConReali = usaSalConReali;
   }

   public String getZerarCtaCtab() {
        return zerarCtaCtab;
   }

   public void setZerarCtaCtab(String zerarCtaCtab) {
        markAsChanged("ZERARCTACTAB", zerarCtaCtab);
        this.zerarCtaCtab = zerarCtaCtab;
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
        this.setOriginalVO(vo);
        this.apresCod = vo.asString("APRESCOD");
        this.ativo = vo.asString("ATIVO");
        this.codCco = vo.asBigDecimal("CODCCO");
        this.crPart = vo.asString("CRPART");
        this.ctaCtbPart = vo.asString("CTACTBPART");
        this.descricao = vo.asString("DESCRICAO");
        this.detalharPor = vo.asString("DETALHARPOR");
        this.empPart = vo.asString("EMPPART");
        this.gruCtaCtbPart = vo.asString("GRUCTACTBPART");
        this.periodic = vo.asString("PERIODIC");
        this.projPart = vo.asString("PROJPART");
        this.dtIniCorc = vo.asBigDecimal("DTINICORC");
        this.calDesInRecDesp = vo.asString("CALDESINRECDESP");
        this.usaSalConReali = vo.asString("USASALCONREALI");
        this.zerarCtaCtab = vo.asString("ZERARCTACTAB");
        return this;
   }
}
