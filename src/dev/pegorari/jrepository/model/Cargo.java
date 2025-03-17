package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Cargo extends AbstractSankhyaEntity<Cargo> {
   private BigDecimal codUsu;
   private String descrCargo;
   private Timestamp dtAlter;
   private String obs;
   private String responsabilidades;
   private String ativo;
   private BigDecimal codCargo;
   private BigDecimal codCbo;
   private BigDecimal codNivelIni;
   private BigDecimal contagemEsp;
   private BigDecimal acumCargo;
   private String aposentaEsp;
   private BigDecimal codCarreira;
   private BigDecimal codEscala;
   private BigDecimal codGrupoCargo;
   private BigDecimal codNivelFim;
   private String contagemTempo;
   private String dedicacaoExc;
   private Timestamp dtLei;
   private String nrLei;
   private BigDecimal origAtiv;
   private String possuiNivel;
   private BigDecimal sitCargo;
   private String tecnicoCientifico;
   private BigDecimal tempoAso;
   private String usadoEsocial;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getDescrCargo() {
        return descrCargo;
   }

   public void setDescrCargo(String descrCargo) {
        this.descrCargo = descrCargo;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public String getObs() {
        return obs;
   }

   public void setObs(String obs) {
        this.obs = obs;
   }

   public String getResponsabilidades() {
        return responsabilidades;
   }

   public void setResponsabilidades(String responsabilidades) {
        this.responsabilidades = responsabilidades;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCodCargo() {
        return codCargo;
   }

   public void setCodCargo(BigDecimal codCargo) {
        this.codCargo = codCargo;
   }

   public BigDecimal getCodCbo() {
        return codCbo;
   }

   public void setCodCbo(BigDecimal codCbo) {
        this.codCbo = codCbo;
   }

   public BigDecimal getCodNivelIni() {
        return codNivelIni;
   }

   public void setCodNivelIni(BigDecimal codNivelIni) {
        this.codNivelIni = codNivelIni;
   }

   public BigDecimal getContagemEsp() {
        return contagemEsp;
   }

   public void setContagemEsp(BigDecimal contagemEsp) {
        this.contagemEsp = contagemEsp;
   }

   public BigDecimal getAcumCargo() {
        return acumCargo;
   }

   public void setAcumCargo(BigDecimal acumCargo) {
        this.acumCargo = acumCargo;
   }

   public String getAposentaEsp() {
        return aposentaEsp;
   }

   public void setAposentaEsp(String aposentaEsp) {
        this.aposentaEsp = aposentaEsp;
   }

   public BigDecimal getCodCarreira() {
        return codCarreira;
   }

   public void setCodCarreira(BigDecimal codCarreira) {
        this.codCarreira = codCarreira;
   }

   public BigDecimal getCodEscala() {
        return codEscala;
   }

   public void setCodEscala(BigDecimal codEscala) {
        this.codEscala = codEscala;
   }

   public BigDecimal getCodGrupoCargo() {
        return codGrupoCargo;
   }

   public void setCodGrupoCargo(BigDecimal codGrupoCargo) {
        this.codGrupoCargo = codGrupoCargo;
   }

   public BigDecimal getCodNivelFim() {
        return codNivelFim;
   }

   public void setCodNivelFim(BigDecimal codNivelFim) {
        this.codNivelFim = codNivelFim;
   }

   public String getContagemTempo() {
        return contagemTempo;
   }

   public void setContagemTempo(String contagemTempo) {
        this.contagemTempo = contagemTempo;
   }

   public String getDedicacaoExc() {
        return dedicacaoExc;
   }

   public void setDedicacaoExc(String dedicacaoExc) {
        this.dedicacaoExc = dedicacaoExc;
   }

   public Timestamp getDtLei() {
        return dtLei;
   }

   public void setDtLei(Timestamp dtLei) {
        this.dtLei = dtLei;
   }

   public String getNrLei() {
        return nrLei;
   }

   public void setNrLei(String nrLei) {
        this.nrLei = nrLei;
   }

   public BigDecimal getOrigAtiv() {
        return origAtiv;
   }

   public void setOrigAtiv(BigDecimal origAtiv) {
        this.origAtiv = origAtiv;
   }

   public String getPossuiNivel() {
        return possuiNivel;
   }

   public void setPossuiNivel(String possuiNivel) {
        this.possuiNivel = possuiNivel;
   }

   public BigDecimal getSitCargo() {
        return sitCargo;
   }

   public void setSitCargo(BigDecimal sitCargo) {
        this.sitCargo = sitCargo;
   }

   public String getTecnicoCientifico() {
        return tecnicoCientifico;
   }

   public void setTecnicoCientifico(String tecnicoCientifico) {
        this.tecnicoCientifico = tecnicoCientifico;
   }

   public BigDecimal getTempoAso() {
        return tempoAso;
   }

   public void setTempoAso(BigDecimal tempoAso) {
        this.tempoAso = tempoAso;
   }

   public String getUsadoEsocial() {
        return usadoEsocial;
   }

   public void setUsadoEsocial(String usadoEsocial) {
        this.usadoEsocial = usadoEsocial;
   }

   @Override
   public String getTableName() {
        return "TFPCAR";
   }

   @Override
   public String getEntityName() {
        return "Cargo";
   }

   @Override
   public Cargo fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descrCargo = vo.asString("DESCRCARGO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.obs = vo.asString("OBS");
        this.responsabilidades = vo.asString("RESPONSABILIDADES");
        this.ativo = vo.asString("ATIVO");
        this.codCargo = vo.asBigDecimal("CODCARGO");
        this.codCbo = vo.asBigDecimal("CODCBO");
        this.codNivelIni = vo.asBigDecimal("CODNIVELINI");
        this.contagemEsp = vo.asBigDecimal("CONTAGEMESP");
        this.acumCargo = vo.asBigDecimal("ACUMCARGO");
        this.aposentaEsp = vo.asString("APOSENTAESP");
        this.codCarreira = vo.asBigDecimal("CODCARREIRA");
        this.codEscala = vo.asBigDecimal("CODESCALA");
        this.codGrupoCargo = vo.asBigDecimal("CODGRUPOCARGO");
        this.codNivelFim = vo.asBigDecimal("CODNIVELFIM");
        this.contagemTempo = vo.asString("CONTAGEMTEMPO");
        this.dedicacaoExc = vo.asString("DEDICACAOEXC");
        this.dtLei = vo.asTimestamp("DTLEI");
        this.nrLei = vo.asString("NRLEI");
        this.origAtiv = vo.asBigDecimal("ORIGATIV");
        this.possuiNivel = vo.asString("POSSUINIVEL");
        this.sitCargo = vo.asBigDecimal("SITCARGO");
        this.tecnicoCientifico = vo.asString("TECNICOCIENTIFICO");
        this.tempoAso = vo.asBigDecimal("TEMPOASO");
        this.usadoEsocial = vo.asString("USADOESOCIAL");
        return this;
   }
}
