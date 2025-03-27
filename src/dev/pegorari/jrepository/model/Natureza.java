package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Natureza extends AbstractSankhyaEntity<Natureza> {
   public BigDecimal getAliqCofins() {
        return this.getVo().asBigDecimal("ALIQCOFINS");
   }

   public void setAliqCofins(BigDecimal aliqCofins) {
        markAsChanged("ALIQCOFINS", aliqCofins);
   }

   public BigDecimal getAliqPis() {
        return this.getVo().asBigDecimal("ALIQPIS");
   }

   public void setAliqPis(BigDecimal aliqPis) {
        markAsChanged("ALIQPIS", aliqPis);
   }

   public String getAnalitica() {
        return this.getVo().asString("ANALITICA");
   }

   public void setAnalitica(String analitica) {
        markAsChanged("ANALITICA", analitica);
   }

   public String getAtiva() {
        return this.getVo().asString("ATIVA");
   }

   public void setAtiva(String ativa) {
        markAsChanged("ATIVA", ativa);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodCtaCtb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
   }

   public BigDecimal getCodCtaCtb2() {
        return this.getVo().asBigDecimal("CODCTACTB2");
   }

   public void setCodCtaCtb2(BigDecimal codCtaCtb2) {
        markAsChanged("CODCTACTB2", codCtaCtb2);
   }

   public BigDecimal getCodGrupoNat() {
        return this.getVo().asBigDecimal("CODGRUPONAT");
   }

   public void setCodGrupoNat(BigDecimal codGrupoNat) {
        markAsChanged("CODGRUPONAT", codGrupoNat);
   }

   public BigDecimal getCodHistCtb() {
        return this.getVo().asBigDecimal("CODHISTCTB");
   }

   public void setCodHistCtb(BigDecimal codHistCtb) {
        markAsChanged("CODHISTCTB", codHistCtb);
   }

   public BigDecimal getCodHistCtb2() {
        return this.getVo().asBigDecimal("CODHISTCTB2");
   }

   public void setCodHistCtb2(BigDecimal codHistCtb2) {
        markAsChanged("CODHISTCTB2", codHistCtb2);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getCodNatPai() {
        return this.getVo().asBigDecimal("CODNATPAI");
   }

   public void setCodNatPai(BigDecimal codNatPai) {
        markAsChanged("CODNATPAI", codNatPai);
   }

   public BigDecimal getCodServUnico() {
        return this.getVo().asBigDecimal("CODSERVUNICO");
   }

   public void setCodServUnico(BigDecimal codServUnico) {
        markAsChanged("CODSERVUNICO", codServUnico);
   }

   public BigDecimal getCstCofins() {
        return this.getVo().asBigDecimal("CSTCOFINS");
   }

   public void setCstCofins(BigDecimal cstCofins) {
        markAsChanged("CSTCOFINS", cstCofins);
   }

   public BigDecimal getCstPis() {
        return this.getVo().asBigDecimal("CSTPIS");
   }

   public void setCstPis(BigDecimal cstPis) {
        markAsChanged("CSTPIS", cstPis);
   }

   public BigDecimal getDecVlr() {
        return this.getVo().asBigDecimal("DECVLR");
   }

   public void setDecVlr(BigDecimal decVlr) {
        markAsChanged("DECVLR", decVlr);
   }

   public String getDescrNat() {
        return this.getVo().asString("DESCRNAT");
   }

   public void setDescrNat(String descrNat) {
        markAsChanged("DESCRNAT", descrNat);
   }

   public String getFormula() {
        return this.getVo().asString("FORMULA");
   }

   public void setFormula(String formula) {
        markAsChanged("FORMULA", formula);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public String getGrupoMkp() {
        return this.getVo().asString("GRUPOMKP");
   }

   public void setGrupoMkp(String grupoMkp) {
        markAsChanged("GRUPOMKP", grupoMkp);
   }

   public String getIncResult() {
        return this.getVo().asString("INCRESULT");
   }

   public void setIncResult(String incResult) {
        markAsChanged("INCRESULT", incResult);
   }

   public String getNatBcCred() {
        return this.getVo().asString("NATBCCRED");
   }

   public void setNatBcCred(String natBcCred) {
        markAsChanged("NATBCCRED", natBcCred);
   }

   public String getRegimeEfd() {
        return this.getVo().asString("REGIMEEFD");
   }

   public void setRegimeEfd(String regimeEfd) {
        markAsChanged("REGIMEEFD", regimeEfd);
   }

   public String getSubGrupoMkp() {
        return this.getVo().asString("SUBGRUPOMKP");
   }

   public void setSubGrupoMkp(String subGrupoMkp) {
        markAsChanged("SUBGRUPOMKP", subGrupoMkp);
   }

   public String getTipNat() {
        return this.getVo().asString("TIPNAT");
   }

   public void setTipNat(String tipNat) {
        markAsChanged("TIPNAT", tipNat);
   }

   public BigDecimal getCodCtaCtbEfd() {
        return this.getVo().asBigDecimal("CODCTACTBEFD");
   }

   public void setCodCtaCtbEfd(BigDecimal codCtaCtbEfd) {
        markAsChanged("CODCTACTBEFD", codCtaCtbEfd);
   }

   public String getRecAdiantRural() {
        return this.getVo().asString("RECADIANTRURAL");
   }

   public void setRecAdiantRural(String recAdiantRural) {
        markAsChanged("RECADIANTRURAL", recAdiantRural);
   }

   public String getGeralCdPr() {
        return this.getVo().asString("GERALCDPR");
   }

   public void setGeralCdPr(String geralCdPr) {
        markAsChanged("GERALCDPR", geralCdPr);
   }

   public BigDecimal getNatEfdContM410M810() {
        return this.getVo().asBigDecimal("NATEFDCONTM410M810");
   }

   public void setNatEfdContM410M810(BigDecimal natEfdContM410M810) {
        markAsChanged("NATEFDCONTM410M810", natEfdContM410M810);
   }

   @Override
   public String getTableName() {
        return "TGFNAT";
   }

   @Override
   public String getEntityName() {
        return "Natureza";
   }

   @Override
   public Natureza fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
