package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AjustesDocumentos implements SankhyaEntity<AjustesDocumentos> {

   private String codAjuste;
   private BigDecimal codEmp;
   private BigDecimal codObsPadrao;
   private BigDecimal codUsu;
   private String compAjuste;
   private String compObsPadrao;
   private Timestamp dhAlter;
   private BigDecimal nuNota;
   private String origem;
   private BigDecimal sequencia;
   private BigDecimal vlrIcms;
   private BigDecimal vlrOutros;
   private BigDecimal aliqIcms;
   private BigDecimal baseIcms;
   private BigDecimal codCfg;
   private String agrupar;
   private String indSubApuracaoAj;
   private String subApuracaoAj;

   public String getCodAjuste() {
        return codAjuste;
   }

   public void setCodAjuste(String codAjuste) {
        this.codAjuste = codAjuste;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodObsPadrao() {
        return codObsPadrao;
   }

   public void setCodObsPadrao(BigDecimal codObsPadrao) {
        this.codObsPadrao = codObsPadrao;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getCompAjuste() {
        return compAjuste;
   }

   public void setCompAjuste(String compAjuste) {
        this.compAjuste = compAjuste;
   }

   public String getCompObsPadrao() {
        return compObsPadrao;
   }

   public void setCompObsPadrao(String compObsPadrao) {
        this.compObsPadrao = compObsPadrao;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public String getOrigem() {
        return origem;
   }

   public void setOrigem(String origem) {
        this.origem = origem;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getVlrIcms() {
        return vlrIcms;
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        this.vlrIcms = vlrIcms;
   }

   public BigDecimal getVlrOutros() {
        return vlrOutros;
   }

   public void setVlrOutros(BigDecimal vlrOutros) {
        this.vlrOutros = vlrOutros;
   }

   public BigDecimal getAliqIcms() {
        return aliqIcms;
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
   }

   public BigDecimal getBaseIcms() {
        return baseIcms;
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        this.baseIcms = baseIcms;
   }

   public BigDecimal getCodCfg() {
        return codCfg;
   }

   public void setCodCfg(BigDecimal codCfg) {
        this.codCfg = codCfg;
   }

   public String getAgrupar() {
        return agrupar;
   }

   public void setAgrupar(String agrupar) {
        this.agrupar = agrupar;
   }

   public String getIndSubApuracaoAj() {
        return indSubApuracaoAj;
   }

   public void setIndSubApuracaoAj(String indSubApuracaoAj) {
        this.indSubApuracaoAj = indSubApuracaoAj;
   }

   public String getSubApuracaoAj() {
        return subApuracaoAj;
   }

   public void setSubApuracaoAj(String subApuracaoAj) {
        this.subApuracaoAj = subApuracaoAj;
   }

   @Override
   public String getEntityName() {
        return "AjustesDocumentos";
   }

   @Override
   public AjustesDocumentos fromVO(DynamicVO vo) {
        this.codAjuste = vo.asString("CODAJUSTE");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codObsPadrao = vo.asBigDecimal("CODOBSPADRAO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.compAjuste = vo.asString("COMPAJUSTE");
        this.compObsPadrao = vo.asString("COMPOBSPADRAO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.origem = vo.asString("ORIGEM");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.vlrIcms = vo.asBigDecimal("VLRICMS");
        this.vlrOutros = vo.asBigDecimal("VLROUTROS");
        this.aliqIcms = vo.asBigDecimal("ALIQICMS");
        this.baseIcms = vo.asBigDecimal("BASEICMS");
        this.codCfg = vo.asBigDecimal("CODCFG");
        this.agrupar = vo.asString("AGRUPAR");
        this.indSubApuracaoAj = vo.asString("INDSUBAPURACAOAJ");
        this.subApuracaoAj = vo.asString("SUBAPURACAOAJ");
        return this;
   }
}
