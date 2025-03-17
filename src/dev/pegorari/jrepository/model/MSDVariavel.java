package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDVariavel extends AbstractSankhyaEntity<MSDVariavel> {
   private String ativa;
   private String cfgDtResol;
   private BigDecimal codGrupo;
   private BigDecimal codUsu;
   private BigDecimal codVar;
   private String descrVar;
   private Timestamp dtAlter;
   private String expDtRef;
   private char[] formula;
   private String nomeExib;
   private String nomeVar;
   private String obs;
   private BigDecimal ordem;
   private BigDecimal periodicidade;
   private Timestamp proxResol;
   private String tipo;
   private String tipoSaida;
   private Timestamp ultResol;
   private String valorPadrao;

   public String getAtiva() {
        return ativa;
   }

   public void setAtiva(String ativa) {
        this.ativa = ativa;
   }

   public String getCfgDtResol() {
        return cfgDtResol;
   }

   public void setCfgDtResol(String cfgDtResol) {
        this.cfgDtResol = cfgDtResol;
   }

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        this.codGrupo = codGrupo;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getCodVar() {
        return codVar;
   }

   public void setCodVar(BigDecimal codVar) {
        this.codVar = codVar;
   }

   public String getDescrVar() {
        return descrVar;
   }

   public void setDescrVar(String descrVar) {
        this.descrVar = descrVar;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public String getExpDtRef() {
        return expDtRef;
   }

   public void setExpDtRef(String expDtRef) {
        this.expDtRef = expDtRef;
   }

   public char[] getFormula() {
        return formula;
   }

   public void setFormula(char[] formula) {
        this.formula = formula;
   }

   public String getNomeExib() {
        return nomeExib;
   }

   public void setNomeExib(String nomeExib) {
        this.nomeExib = nomeExib;
   }

   public String getNomeVar() {
        return nomeVar;
   }

   public void setNomeVar(String nomeVar) {
        this.nomeVar = nomeVar;
   }

   public String getObs() {
        return obs;
   }

   public void setObs(String obs) {
        this.obs = obs;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public BigDecimal getPeriodicidade() {
        return periodicidade;
   }

   public void setPeriodicidade(BigDecimal periodicidade) {
        this.periodicidade = periodicidade;
   }

   public Timestamp getProxResol() {
        return proxResol;
   }

   public void setProxResol(Timestamp proxResol) {
        this.proxResol = proxResol;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getTipoSaida() {
        return tipoSaida;
   }

   public void setTipoSaida(String tipoSaida) {
        this.tipoSaida = tipoSaida;
   }

   public Timestamp getUltResol() {
        return ultResol;
   }

   public void setUltResol(Timestamp ultResol) {
        this.ultResol = ultResol;
   }

   public String getValorPadrao() {
        return valorPadrao;
   }

   public void setValorPadrao(String valorPadrao) {
        this.valorPadrao = valorPadrao;
   }

   @Override
   public String getTableName() {
        return "TMDVAR";
   }

   @Override
   public String getEntityName() {
        return "MSDVariavel";
   }

   @Override
   public MSDVariavel fromVO(DynamicVO vo) {
        this.ativa = vo.asString("ATIVA");
        this.cfgDtResol = vo.asString("CFGDTRESOL");
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVar = vo.asBigDecimal("CODVAR");
        this.descrVar = vo.asString("DESCRVAR");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.expDtRef = vo.asString("EXPDTREF");
        this.formula = vo.asClob("FORMULA");
        this.nomeExib = vo.asString("NOMEEXIB");
        this.nomeVar = vo.asString("NOMEVAR");
        this.obs = vo.asString("OBS");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.periodicidade = vo.asBigDecimal("PERIODICIDADE");
        this.proxResol = vo.asTimestamp("PROXRESOL");
        this.tipo = vo.asString("TIPO");
        this.tipoSaida = vo.asString("TIPOSAIDA");
        this.ultResol = vo.asTimestamp("ULTRESOL");
        this.valorPadrao = vo.asString("VALORPADRAO");
        return this;
   }
}
