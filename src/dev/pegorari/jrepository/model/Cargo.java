package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Cargo extends AbstractSankhyaEntity<Cargo> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescrCargo() {
        return this.getVo().asString("DESCRCARGO");
   }

   public void setDescrCargo(String descrCargo) {
        markAsChanged("DESCRCARGO", descrCargo);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public String getObs() {
        return this.getVo().asString("OBS");
   }

   public void setObs(String obs) {
        markAsChanged("OBS", obs);
   }

   public String getResponsabilidades() {
        return this.getVo().asString("RESPONSABILIDADES");
   }

   public void setResponsabilidades(String responsabilidades) {
        markAsChanged("RESPONSABILIDADES", responsabilidades);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodCargo() {
        return this.getVo().asBigDecimal("CODCARGO");
   }

   public void setCodCargo(BigDecimal codCargo) {
        markAsChanged("CODCARGO", codCargo);
   }

   public BigDecimal getCodCbo() {
        return this.getVo().asBigDecimal("CODCBO");
   }

   public void setCodCbo(BigDecimal codCbo) {
        markAsChanged("CODCBO", codCbo);
   }

   public BigDecimal getCodNivelIni() {
        return this.getVo().asBigDecimal("CODNIVELINI");
   }

   public void setCodNivelIni(BigDecimal codNivelIni) {
        markAsChanged("CODNIVELINI", codNivelIni);
   }

   public BigDecimal getContagemEsp() {
        return this.getVo().asBigDecimal("CONTAGEMESP");
   }

   public void setContagemEsp(BigDecimal contagemEsp) {
        markAsChanged("CONTAGEMESP", contagemEsp);
   }

   public BigDecimal getAcumCargo() {
        return this.getVo().asBigDecimal("ACUMCARGO");
   }

   public void setAcumCargo(BigDecimal acumCargo) {
        markAsChanged("ACUMCARGO", acumCargo);
   }

   public String getAposentaEsp() {
        return this.getVo().asString("APOSENTAESP");
   }

   public void setAposentaEsp(String aposentaEsp) {
        markAsChanged("APOSENTAESP", aposentaEsp);
   }

   public BigDecimal getCodCarreira() {
        return this.getVo().asBigDecimal("CODCARREIRA");
   }

   public void setCodCarreira(BigDecimal codCarreira) {
        markAsChanged("CODCARREIRA", codCarreira);
   }

   public BigDecimal getCodEscala() {
        return this.getVo().asBigDecimal("CODESCALA");
   }

   public void setCodEscala(BigDecimal codEscala) {
        markAsChanged("CODESCALA", codEscala);
   }

   public BigDecimal getCodGrupoCargo() {
        return this.getVo().asBigDecimal("CODGRUPOCARGO");
   }

   public void setCodGrupoCargo(BigDecimal codGrupoCargo) {
        markAsChanged("CODGRUPOCARGO", codGrupoCargo);
   }

   public BigDecimal getCodNivelFim() {
        return this.getVo().asBigDecimal("CODNIVELFIM");
   }

   public void setCodNivelFim(BigDecimal codNivelFim) {
        markAsChanged("CODNIVELFIM", codNivelFim);
   }

   public String getContagemTempo() {
        return this.getVo().asString("CONTAGEMTEMPO");
   }

   public void setContagemTempo(String contagemTempo) {
        markAsChanged("CONTAGEMTEMPO", contagemTempo);
   }

   public String getDedicacaoExc() {
        return this.getVo().asString("DEDICACAOEXC");
   }

   public void setDedicacaoExc(String dedicacaoExc) {
        markAsChanged("DEDICACAOEXC", dedicacaoExc);
   }

   public Timestamp getDtLei() {
        return this.getVo().asTimestamp("DTLEI");
   }

   public void setDtLei(Timestamp dtLei) {
        markAsChanged("DTLEI", dtLei);
   }

   public String getNrLei() {
        return this.getVo().asString("NRLEI");
   }

   public void setNrLei(String nrLei) {
        markAsChanged("NRLEI", nrLei);
   }

   public BigDecimal getOrigAtiv() {
        return this.getVo().asBigDecimal("ORIGATIV");
   }

   public void setOrigAtiv(BigDecimal origAtiv) {
        markAsChanged("ORIGATIV", origAtiv);
   }

   public String getPossuiNivel() {
        return this.getVo().asString("POSSUINIVEL");
   }

   public void setPossuiNivel(String possuiNivel) {
        markAsChanged("POSSUINIVEL", possuiNivel);
   }

   public BigDecimal getSitCargo() {
        return this.getVo().asBigDecimal("SITCARGO");
   }

   public void setSitCargo(BigDecimal sitCargo) {
        markAsChanged("SITCARGO", sitCargo);
   }

   public String getTecnicoCientifico() {
        return this.getVo().asString("TECNICOCIENTIFICO");
   }

   public void setTecnicoCientifico(String tecnicoCientifico) {
        markAsChanged("TECNICOCIENTIFICO", tecnicoCientifico);
   }

   public BigDecimal getTempoAso() {
        return this.getVo().asBigDecimal("TEMPOASO");
   }

   public void setTempoAso(BigDecimal tempoAso) {
        markAsChanged("TEMPOASO", tempoAso);
   }

   public String getUsadoEsocial() {
        return this.getVo().asString("USADOESOCIAL");
   }

   public void setUsadoEsocial(String usadoEsocial) {
        markAsChanged("USADOESOCIAL", usadoEsocial);
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
        this.setVo(vo);
        return this;
   }
}
