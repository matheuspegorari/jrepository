package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PlanoContaECD implements SankhyaEntity<PlanoContaECD> {

   private Timestamp dtPrimImp;
   private String descrCta;
   private Timestamp dtInclusao;
   private String ctaCtb;
   private BigDecimal codEmp;
   private BigDecimal codUsu;
   private String codCtaCtbPai;
   private Timestamp dtAlter;
   private BigDecimal grau;
   private String codGrupoCta;
   private String analitica;
   private BigDecimal codCtaCtb;
   private BigDecimal codCtaCtbIntPai;

   public Timestamp getDtPrimImp() {
        return dtPrimImp;
   }

   public void setDtPrimImp(Timestamp dtPrimImp) {
        this.dtPrimImp = dtPrimImp;
   }

   public String getDescrCta() {
        return descrCta;
   }

   public void setDescrCta(String descrCta) {
        this.descrCta = descrCta;
   }

   public Timestamp getDtInclusao() {
        return dtInclusao;
   }

   public void setDtInclusao(Timestamp dtInclusao) {
        this.dtInclusao = dtInclusao;
   }

   public String getCtaCtb() {
        return ctaCtb;
   }

   public void setCtaCtb(String ctaCtb) {
        this.ctaCtb = ctaCtb;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getCodCtaCtbPai() {
        return codCtaCtbPai;
   }

   public void setCodCtaCtbPai(String codCtaCtbPai) {
        this.codCtaCtbPai = codCtaCtbPai;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        this.grau = grau;
   }

   public String getCodGrupoCta() {
        return codGrupoCta;
   }

   public void setCodGrupoCta(String codGrupoCta) {
        this.codGrupoCta = codGrupoCta;
   }

   public String getAnalitica() {
        return analitica;
   }

   public void setAnalitica(String analitica) {
        this.analitica = analitica;
   }

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodCtaCtbIntPai() {
        return codCtaCtbIntPai;
   }

   public void setCodCtaCtbIntPai(BigDecimal codCtaCtbIntPai) {
        this.codCtaCtbIntPai = codCtaCtbIntPai;
   }

   @Override
   public String getEntityName() {
        return "PlanoContaECD";
   }

   @Override
   public PlanoContaECD fromVO(DynamicVO vo) {
        this.dtPrimImp = vo.asTimestamp("DTPRIMIMP");
        this.descrCta = vo.asString("DESCRCTA");
        this.dtInclusao = vo.asTimestamp("DTINCLUSAO");
        this.ctaCtb = vo.asString("CTACTB");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codCtaCtbPai = vo.asString("CODCTACTBPAI");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.grau = vo.asBigDecimal("GRAU");
        this.codGrupoCta = vo.asString("CODGRUPOCTA");
        this.analitica = vo.asString("ANALITICA");
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.codCtaCtbIntPai = vo.asBigDecimal("CODCTACTBINTPAI");
        return this;
   }
}
