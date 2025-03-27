package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PlanoContaECD extends AbstractSankhyaEntity<PlanoContaECD> {
   public Timestamp getDtPrimImp() {
        return this.getVo().asTimestamp("DTPRIMIMP");
   }

   public void setDtPrimImp(Timestamp dtPrimImp) {
        markAsChanged("DTPRIMIMP", dtPrimImp);
   }

   public String getDescrCta() {
        return this.getVo().asString("DESCRCTA");
   }

   public void setDescrCta(String descrCta) {
        markAsChanged("DESCRCTA", descrCta);
   }

   public Timestamp getDtInclusao() {
        return this.getVo().asTimestamp("DTINCLUSAO");
   }

   public void setDtInclusao(Timestamp dtInclusao) {
        markAsChanged("DTINCLUSAO", dtInclusao);
   }

   public String getCtaCtb() {
        return this.getVo().asString("CTACTB");
   }

   public void setCtaCtb(String ctaCtb) {
        markAsChanged("CTACTB", ctaCtb);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getCodCtaCtbPai() {
        return this.getVo().asString("CODCTACTBPAI");
   }

   public void setCodCtaCtbPai(String codCtaCtbPai) {
        markAsChanged("CODCTACTBPAI", codCtaCtbPai);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public String getCodGrupoCta() {
        return this.getVo().asString("CODGRUPOCTA");
   }

   public void setCodGrupoCta(String codGrupoCta) {
        markAsChanged("CODGRUPOCTA", codGrupoCta);
   }

   public String getAnalitica() {
        return this.getVo().asString("ANALITICA");
   }

   public void setAnalitica(String analitica) {
        markAsChanged("ANALITICA", analitica);
   }

   public BigDecimal getCodCtaCtb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
   }

   public BigDecimal getCodCtaCtbIntPai() {
        return this.getVo().asBigDecimal("CODCTACTBINTPAI");
   }

   public void setCodCtaCtbIntPai(BigDecimal codCtaCtbIntPai) {
        markAsChanged("CODCTACTBINTPAI", codCtaCtbIntPai);
   }

   @Override
   public String getTableName() {
        return "TCBPLA_IMP";
   }

   @Override
   public String getEntityName() {
        return "PlanoContaECD";
   }

   @Override
   public PlanoContaECD fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
