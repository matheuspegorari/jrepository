package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Natureza extends AbstractSankhyaEntity<Natureza> {
   private BigDecimal aliqCofins;
   private BigDecimal aliqPis;
   private String analitica;
   private String ativa;
   private BigDecimal codCencus;
   private BigDecimal codCtaCtb;
   private BigDecimal codCtaCtb2;
   private BigDecimal codGrupoNat;
   private BigDecimal codHistCtb;
   private BigDecimal codHistCtb2;
   private BigDecimal codNat;
   private BigDecimal codNatPai;
   private BigDecimal codServUnico;
   private BigDecimal cstCofins;
   private BigDecimal cstPis;
   private BigDecimal decVlr;
   private String descrNat;
   private String formula;
   private BigDecimal grau;
   private String grupoMkp;
   private String incResult;
   private String natBcCred;
   private String regimeEfd;
   private String subGrupoMkp;
   private String tipNat;
   private BigDecimal codCtaCtbEfd;
   private String recAdiantRural;
   private String geralCdPr;
   private BigDecimal natEfdContM410M810;

   public BigDecimal getAliqCofins() {
        return aliqCofins;
   }

   public void setAliqCofins(BigDecimal aliqCofins) {
        markAsChanged("ALIQCOFINS", aliqCofins);
        this.aliqCofins = aliqCofins;
   }

   public BigDecimal getAliqPis() {
        return aliqPis;
   }

   public void setAliqPis(BigDecimal aliqPis) {
        markAsChanged("ALIQPIS", aliqPis);
        this.aliqPis = aliqPis;
   }

   public String getAnalitica() {
        return analitica;
   }

   public void setAnalitica(String analitica) {
        markAsChanged("ANALITICA", analitica);
        this.analitica = analitica;
   }

   public String getAtiva() {
        return ativa;
   }

   public void setAtiva(String ativa) {
        markAsChanged("ATIVA", ativa);
        this.ativa = ativa;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
        this.codCencus = codCencus;
   }

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodCtaCtb2() {
        return codCtaCtb2;
   }

   public void setCodCtaCtb2(BigDecimal codCtaCtb2) {
        markAsChanged("CODCTACTB2", codCtaCtb2);
        this.codCtaCtb2 = codCtaCtb2;
   }

   public BigDecimal getCodGrupoNat() {
        return codGrupoNat;
   }

   public void setCodGrupoNat(BigDecimal codGrupoNat) {
        markAsChanged("CODGRUPONAT", codGrupoNat);
        this.codGrupoNat = codGrupoNat;
   }

   public BigDecimal getCodHistCtb() {
        return codHistCtb;
   }

   public void setCodHistCtb(BigDecimal codHistCtb) {
        markAsChanged("CODHISTCTB", codHistCtb);
        this.codHistCtb = codHistCtb;
   }

   public BigDecimal getCodHistCtb2() {
        return codHistCtb2;
   }

   public void setCodHistCtb2(BigDecimal codHistCtb2) {
        markAsChanged("CODHISTCTB2", codHistCtb2);
        this.codHistCtb2 = codHistCtb2;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
        this.codNat = codNat;
   }

   public BigDecimal getCodNatPai() {
        return codNatPai;
   }

   public void setCodNatPai(BigDecimal codNatPai) {
        markAsChanged("CODNATPAI", codNatPai);
        this.codNatPai = codNatPai;
   }

   public BigDecimal getCodServUnico() {
        return codServUnico;
   }

   public void setCodServUnico(BigDecimal codServUnico) {
        markAsChanged("CODSERVUNICO", codServUnico);
        this.codServUnico = codServUnico;
   }

   public BigDecimal getCstCofins() {
        return cstCofins;
   }

   public void setCstCofins(BigDecimal cstCofins) {
        markAsChanged("CSTCOFINS", cstCofins);
        this.cstCofins = cstCofins;
   }

   public BigDecimal getCstPis() {
        return cstPis;
   }

   public void setCstPis(BigDecimal cstPis) {
        markAsChanged("CSTPIS", cstPis);
        this.cstPis = cstPis;
   }

   public BigDecimal getDecVlr() {
        return decVlr;
   }

   public void setDecVlr(BigDecimal decVlr) {
        markAsChanged("DECVLR", decVlr);
        this.decVlr = decVlr;
   }

   public String getDescrNat() {
        return descrNat;
   }

   public void setDescrNat(String descrNat) {
        markAsChanged("DESCRNAT", descrNat);
        this.descrNat = descrNat;
   }

   public String getFormula() {
        return formula;
   }

   public void setFormula(String formula) {
        markAsChanged("FORMULA", formula);
        this.formula = formula;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
        this.grau = grau;
   }

   public String getGrupoMkp() {
        return grupoMkp;
   }

   public void setGrupoMkp(String grupoMkp) {
        markAsChanged("GRUPOMKP", grupoMkp);
        this.grupoMkp = grupoMkp;
   }

   public String getIncResult() {
        return incResult;
   }

   public void setIncResult(String incResult) {
        markAsChanged("INCRESULT", incResult);
        this.incResult = incResult;
   }

   public String getNatBcCred() {
        return natBcCred;
   }

   public void setNatBcCred(String natBcCred) {
        markAsChanged("NATBCCRED", natBcCred);
        this.natBcCred = natBcCred;
   }

   public String getRegimeEfd() {
        return regimeEfd;
   }

   public void setRegimeEfd(String regimeEfd) {
        markAsChanged("REGIMEEFD", regimeEfd);
        this.regimeEfd = regimeEfd;
   }

   public String getSubGrupoMkp() {
        return subGrupoMkp;
   }

   public void setSubGrupoMkp(String subGrupoMkp) {
        markAsChanged("SUBGRUPOMKP", subGrupoMkp);
        this.subGrupoMkp = subGrupoMkp;
   }

   public String getTipNat() {
        return tipNat;
   }

   public void setTipNat(String tipNat) {
        markAsChanged("TIPNAT", tipNat);
        this.tipNat = tipNat;
   }

   public BigDecimal getCodCtaCtbEfd() {
        return codCtaCtbEfd;
   }

   public void setCodCtaCtbEfd(BigDecimal codCtaCtbEfd) {
        markAsChanged("CODCTACTBEFD", codCtaCtbEfd);
        this.codCtaCtbEfd = codCtaCtbEfd;
   }

   public String getRecAdiantRural() {
        return recAdiantRural;
   }

   public void setRecAdiantRural(String recAdiantRural) {
        markAsChanged("RECADIANTRURAL", recAdiantRural);
        this.recAdiantRural = recAdiantRural;
   }

   public String getGeralCdPr() {
        return geralCdPr;
   }

   public void setGeralCdPr(String geralCdPr) {
        markAsChanged("GERALCDPR", geralCdPr);
        this.geralCdPr = geralCdPr;
   }

   public BigDecimal getNatEfdContM410M810() {
        return natEfdContM410M810;
   }

   public void setNatEfdContM410M810(BigDecimal natEfdContM410M810) {
        markAsChanged("NATEFDCONTM410M810", natEfdContM410M810);
        this.natEfdContM410M810 = natEfdContM410M810;
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
        this.aliqCofins = vo.asBigDecimal("ALIQCOFINS");
        this.aliqPis = vo.asBigDecimal("ALIQPIS");
        this.analitica = vo.asString("ANALITICA");
        this.ativa = vo.asString("ATIVA");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.codCtaCtb2 = vo.asBigDecimal("CODCTACTB2");
        this.codGrupoNat = vo.asBigDecimal("CODGRUPONAT");
        this.codHistCtb = vo.asBigDecimal("CODHISTCTB");
        this.codHistCtb2 = vo.asBigDecimal("CODHISTCTB2");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codNatPai = vo.asBigDecimal("CODNATPAI");
        this.codServUnico = vo.asBigDecimal("CODSERVUNICO");
        this.cstCofins = vo.asBigDecimal("CSTCOFINS");
        this.cstPis = vo.asBigDecimal("CSTPIS");
        this.decVlr = vo.asBigDecimal("DECVLR");
        this.descrNat = vo.asString("DESCRNAT");
        this.formula = vo.asString("FORMULA");
        this.grau = vo.asBigDecimal("GRAU");
        this.grupoMkp = vo.asString("GRUPOMKP");
        this.incResult = vo.asString("INCRESULT");
        this.natBcCred = vo.asString("NATBCCRED");
        this.regimeEfd = vo.asString("REGIMEEFD");
        this.subGrupoMkp = vo.asString("SUBGRUPOMKP");
        this.tipNat = vo.asString("TIPNAT");
        this.codCtaCtbEfd = vo.asBigDecimal("CODCTACTBEFD");
        this.recAdiantRural = vo.asString("RECADIANTRURAL");
        this.geralCdPr = vo.asString("GERALCDPR");
        this.natEfdContM410M810 = vo.asBigDecimal("NATEFDCONTM410M810");
        return this;
   }
}
