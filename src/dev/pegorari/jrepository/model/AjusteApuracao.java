package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AjusteApuracao extends AbstractSankhyaEntity<AjusteApuracao> {
   private String codAjuste;
   private BigDecimal codEmp;
   private BigDecimal codObsPadrao;
   private BigDecimal codUf;
   private BigDecimal codUsu;
   private String debEsp;
   private String descrProcesso;
   private Timestamp dtAlter;
   private Timestamp dtRef;
   private BigDecimal nuAja;
   private String numDa;
   private String numProcesso;
   private String observacao;
   private BigDecimal origProcesso;
   private BigDecimal sequencia;
   private BigDecimal tipAjuste;
   private BigDecimal tipApuracao;
   private String tipImposto;
   private BigDecimal vlrAjuste;
   private BigDecimal codCfg;
   private String indSubApuracao;
   private String subApuracao;
   private String apuracaoUf;
   private String regAjdime;

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

   public BigDecimal getCodUf() {
        return codUf;
   }

   public void setCodUf(BigDecimal codUf) {
        this.codUf = codUf;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getDebEsp() {
        return debEsp;
   }

   public void setDebEsp(String debEsp) {
        this.debEsp = debEsp;
   }

   public String getDescrProcesso() {
        return descrProcesso;
   }

   public void setDescrProcesso(String descrProcesso) {
        this.descrProcesso = descrProcesso;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        this.dtRef = dtRef;
   }

   public BigDecimal getNuAja() {
        return nuAja;
   }

   public void setNuAja(BigDecimal nuAja) {
        this.nuAja = nuAja;
   }

   public String getNumDa() {
        return numDa;
   }

   public void setNumDa(String numDa) {
        this.numDa = numDa;
   }

   public String getNumProcesso() {
        return numProcesso;
   }

   public void setNumProcesso(String numProcesso) {
        this.numProcesso = numProcesso;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   public BigDecimal getOrigProcesso() {
        return origProcesso;
   }

   public void setOrigProcesso(BigDecimal origProcesso) {
        this.origProcesso = origProcesso;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getTipAjuste() {
        return tipAjuste;
   }

   public void setTipAjuste(BigDecimal tipAjuste) {
        this.tipAjuste = tipAjuste;
   }

   public BigDecimal getTipApuracao() {
        return tipApuracao;
   }

   public void setTipApuracao(BigDecimal tipApuracao) {
        this.tipApuracao = tipApuracao;
   }

   public String getTipImposto() {
        return tipImposto;
   }

   public void setTipImposto(String tipImposto) {
        this.tipImposto = tipImposto;
   }

   public BigDecimal getVlrAjuste() {
        return vlrAjuste;
   }

   public void setVlrAjuste(BigDecimal vlrAjuste) {
        this.vlrAjuste = vlrAjuste;
   }

   public BigDecimal getCodCfg() {
        return codCfg;
   }

   public void setCodCfg(BigDecimal codCfg) {
        this.codCfg = codCfg;
   }

   public String getIndSubApuracao() {
        return indSubApuracao;
   }

   public void setIndSubApuracao(String indSubApuracao) {
        this.indSubApuracao = indSubApuracao;
   }

   public String getSubApuracao() {
        return subApuracao;
   }

   public void setSubApuracao(String subApuracao) {
        this.subApuracao = subApuracao;
   }

   public String getApuracaoUf() {
        return apuracaoUf;
   }

   public void setApuracaoUf(String apuracaoUf) {
        this.apuracaoUf = apuracaoUf;
   }

   public String getRegAjdime() {
        return regAjdime;
   }

   public void setRegAjdime(String regAjdime) {
        this.regAjdime = regAjdime;
   }

   @Override
   public String getTableName() {
        return "TGFAJA";
   }

   @Override
   public String getEntityName() {
        return "AjusteApuracao";
   }

   @Override
   public AjusteApuracao fromVO(DynamicVO vo) {
        this.codAjuste = vo.asString("CODAJUSTE");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codObsPadrao = vo.asBigDecimal("CODOBSPADRAO");
        this.codUf = vo.asBigDecimal("CODUF");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.debEsp = vo.asString("DEBESP");
        this.descrProcesso = vo.asString("DESCRPROCESSO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtRef = vo.asTimestamp("DTREF");
        this.nuAja = vo.asBigDecimal("NUAJA");
        this.numDa = vo.asString("NUMDA");
        this.numProcesso = vo.asString("NUMPROCESSO");
        this.observacao = vo.asString("OBSERVACAO");
        this.origProcesso = vo.asBigDecimal("ORIGPROCESSO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipAjuste = vo.asBigDecimal("TIPAJUSTE");
        this.tipApuracao = vo.asBigDecimal("TIPAPURACAO");
        this.tipImposto = vo.asString("TIPIMPOSTO");
        this.vlrAjuste = vo.asBigDecimal("VLRAJUSTE");
        this.codCfg = vo.asBigDecimal("CODCFG");
        this.indSubApuracao = vo.asString("INDSUBAPURACAO");
        this.subApuracao = vo.asString("SUBAPURACAO");
        this.apuracaoUf = vo.asString("APURACAOUF");
        this.regAjdime = vo.asString("REGAJDIME");
        return this;
   }
}
