package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RateioVeiculo extends AbstractSankhyaEntity<RateioVeiculo> {
   public BigDecimal getAfericao() {
        return this.getVo().asBigDecimal("AFERICAO");
   }

   public void setAfericao(BigDecimal afericao) {
        markAsChanged("AFERICAO", afericao);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodCtactb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtactb(BigDecimal codCtactb) {
        markAsChanged("CODCTACTB", codCtactb);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public BigDecimal getCodSite() {
        return this.getVo().asBigDecimal("CODSITE");
   }

   public void setCodSite(BigDecimal codSite) {
        markAsChanged("CODSITE", codSite);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodVeiculo() {
        return this.getVo().asBigDecimal("CODVEICULO");
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public String getOrigem() {
        return this.getVo().asString("ORIGEM");
   }

   public void setOrigem(String origem) {
        markAsChanged("ORIGEM", origem);
   }

   public BigDecimal getPercRateio() {
        return this.getVo().asBigDecimal("PERCRATEIO");
   }

   public void setPercRateio(BigDecimal percRateio) {
        markAsChanged("PERCRATEIO", percRateio);
   }

   public String getTipoAfericao() {
        return this.getVo().asString("TIPOAFERICAO");
   }

   public void setTipoAfericao(String tipoAfericao) {
        markAsChanged("TIPOAFERICAO", tipoAfericao);
   }

   @Override
   public String getTableName() {
        return "TGFRAV";
   }

   @Override
   public String getEntityName() {
        return "RateioVeiculo";
   }

   @Override
   public RateioVeiculo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
