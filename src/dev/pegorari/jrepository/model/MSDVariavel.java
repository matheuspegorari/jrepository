package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDVariavel extends AbstractSankhyaEntity<MSDVariavel> {
   public String getAtiva() {
        return this.getVo().asString("ATIVA");
   }

   public void setAtiva(String ativa) {
        markAsChanged("ATIVA", ativa);
   }

   public String getCfgDtResol() {
        return this.getVo().asString("CFGDTRESOL");
   }

   public void setCfgDtResol(String cfgDtResol) {
        markAsChanged("CFGDTRESOL", cfgDtResol);
   }

   public BigDecimal getCodGrupo() {
        return this.getVo().asBigDecimal("CODGRUPO");
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodVar() {
        return this.getVo().asBigDecimal("CODVAR");
   }

   public void setCodVar(BigDecimal codVar) {
        markAsChanged("CODVAR", codVar);
   }

   public String getDescrVar() {
        return this.getVo().asString("DESCRVAR");
   }

   public void setDescrVar(String descrVar) {
        markAsChanged("DESCRVAR", descrVar);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public String getExpDtRef() {
        return this.getVo().asString("EXPDTREF");
   }

   public void setExpDtRef(String expDtRef) {
        markAsChanged("EXPDTREF", expDtRef);
   }

   public char[] getFormula() {
        return this.getVo().asClob("FORMULA");
   }

   public void setFormula(char[] formula) {
        markAsChanged("FORMULA", formula);
   }

   public String getNomeExib() {
        return this.getVo().asString("NOMEEXIB");
   }

   public void setNomeExib(String nomeExib) {
        markAsChanged("NOMEEXIB", nomeExib);
   }

   public String getNomeVar() {
        return this.getVo().asString("NOMEVAR");
   }

   public void setNomeVar(String nomeVar) {
        markAsChanged("NOMEVAR", nomeVar);
   }

   public String getObs() {
        return this.getVo().asString("OBS");
   }

   public void setObs(String obs) {
        markAsChanged("OBS", obs);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public BigDecimal getPeriodicidade() {
        return this.getVo().asBigDecimal("PERIODICIDADE");
   }

   public void setPeriodicidade(BigDecimal periodicidade) {
        markAsChanged("PERIODICIDADE", periodicidade);
   }

   public Timestamp getProxResol() {
        return this.getVo().asTimestamp("PROXRESOL");
   }

   public void setProxResol(Timestamp proxResol) {
        markAsChanged("PROXRESOL", proxResol);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getTipoSaida() {
        return this.getVo().asString("TIPOSAIDA");
   }

   public void setTipoSaida(String tipoSaida) {
        markAsChanged("TIPOSAIDA", tipoSaida);
   }

   public Timestamp getUltResol() {
        return this.getVo().asTimestamp("ULTRESOL");
   }

   public void setUltResol(Timestamp ultResol) {
        markAsChanged("ULTRESOL", ultResol);
   }

   public String getValorPadrao() {
        return this.getVo().asString("VALORPADRAO");
   }

   public void setValorPadrao(String valorPadrao) {
        markAsChanged("VALORPADRAO", valorPadrao);
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
        this.setVo(vo);
        return this;
   }
}
