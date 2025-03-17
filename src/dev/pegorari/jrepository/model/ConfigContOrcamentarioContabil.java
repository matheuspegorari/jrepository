package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ConfigContOrcamentarioContabil implements SankhyaEntity<ConfigContOrcamentarioContabil> {

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
   private String zerarCtaCtaB;

   public String getApresCod() {
        return apresCod;
   }

   public void setApresCod(String apresCod) {
        this.apresCod = apresCod;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCodCco() {
        return codCco;
   }

   public void setCodCco(BigDecimal codCco) {
        this.codCco = codCco;
   }

   public String getCrPart() {
        return crPart;
   }

   public void setCrPart(String crPart) {
        this.crPart = crPart;
   }

   public String getCtaCtbPart() {
        return ctaCtbPart;
   }

   public void setCtaCtbPart(String ctaCtbPart) {
        this.ctaCtbPart = ctaCtbPart;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getDetalharPor() {
        return detalharPor;
   }

   public void setDetalharPor(String detalharPor) {
        this.detalharPor = detalharPor;
   }

   public String getEmpPart() {
        return empPart;
   }

   public void setEmpPart(String empPart) {
        this.empPart = empPart;
   }

   public String getGruCtaCtbPart() {
        return gruCtaCtbPart;
   }

   public void setGruCtaCtbPart(String gruCtaCtbPart) {
        this.gruCtaCtbPart = gruCtaCtbPart;
   }

   public String getPeriodic() {
        return periodic;
   }

   public void setPeriodic(String periodic) {
        this.periodic = periodic;
   }

   public String getProjPart() {
        return projPart;
   }

   public void setProjPart(String projPart) {
        this.projPart = projPart;
   }

   public BigDecimal getDtIniCorc() {
        return dtIniCorc;
   }

   public void setDtIniCorc(BigDecimal dtIniCorc) {
        this.dtIniCorc = dtIniCorc;
   }

   public String getCalDesInRecDesp() {
        return calDesInRecDesp;
   }

   public void setCalDesInRecDesp(String calDesInRecDesp) {
        this.calDesInRecDesp = calDesInRecDesp;
   }

   public String getUsaSalConReali() {
        return usaSalConReali;
   }

   public void setUsaSalConReali(String usaSalConReali) {
        this.usaSalConReali = usaSalConReali;
   }

   public String getZerarCtaCtaB() {
        return zerarCtaCtaB;
   }

   public void setZerarCtaCtaB(String zerarCtaCtaB) {
        this.zerarCtaCtaB = zerarCtaCtaB;
   }

   @Override
   public String getEntityName() {
        return "ConfigContOrcamentarioContabil";
   }

   @Override
   public ConfigContOrcamentarioContabil fromVO(DynamicVO vo) {
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
        this.zerarCtaCtaB = vo.asString("ZERARCTACTAB");
        return this;
   }
}
