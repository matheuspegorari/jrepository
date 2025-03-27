package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RegraSLA extends AbstractSankhyaEntity<RegraSLA> {
   public BigDecimal getCodCargaHor() {
        return this.getVo().asBigDecimal("CODCARGAHOR");
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        markAsChanged("CODCARGAHOR", codCargaHor);
   }

   public String getBaseCalcTempo() {
        return this.getVo().asString("BASECALCTEMPO");
   }

   public void setBaseCalcTempo(String baseCalcTempo) {
        markAsChanged("BASECALCTEMPO", baseCalcTempo);
   }

   public BigDecimal getCodGrupoProd() {
        return this.getVo().asBigDecimal("CODGRUPOPROD");
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
   }

   public BigDecimal getCodOcorOs() {
        return this.getVo().asBigDecimal("CODOCOROS");
   }

   public void setCodOcorOs(BigDecimal codOcorOs) {
        markAsChanged("CODOCOROS", codOcorOs);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodServ() {
        return this.getVo().asBigDecimal("CODSERV");
   }

   public void setCodServ(BigDecimal codServ) {
        markAsChanged("CODSERV", codServ);
   }

   public BigDecimal getNumReg() {
        return this.getVo().asBigDecimal("NUMREG");
   }

   public void setNumReg(BigDecimal numReg) {
        markAsChanged("NUMREG", numReg);
   }

   public BigDecimal getNuSla() {
        return this.getVo().asBigDecimal("NUSLA");
   }

   public void setNuSla(BigDecimal nuSla) {
        markAsChanged("NUSLA", nuSla);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public String getPadrao() {
        return this.getVo().asString("PADRAO");
   }

   public void setPadrao(String padrao) {
        markAsChanged("PADRAO", padrao);
   }

   public BigDecimal getPrioridade() {
        return this.getVo().asBigDecimal("PRIORIDADE");
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
   }

   public BigDecimal getTempoTotal() {
        return this.getVo().asBigDecimal("TEMPOTOTAL");
   }

   public void setTempoTotal(BigDecimal tempoTotal) {
        markAsChanged("TEMPOTOTAL", tempoTotal);
   }

   public String getTipoTempo() {
        return this.getVo().asString("TIPOTEMPO");
   }

   public void setTipoTempo(String tipoTempo) {
        markAsChanged("TIPOTEMPO", tipoTempo);
   }

   public String getUsaRegraPadrao() {
        return this.getVo().asString("USAREGRAPADRAO");
   }

   public void setUsaRegraPadrao(String usaRegraPadrao) {
        markAsChanged("USAREGRAPADRAO", usaRegraPadrao);
   }

   public BigDecimal getValorTempo() {
        return this.getVo().asBigDecimal("VALORTEMPO");
   }

   public void setValorTempo(BigDecimal valorTempo) {
        markAsChanged("VALORTEMPO", valorTempo);
   }

   @Override
   public String getTableName() {
        return "TCSRSL";
   }

   @Override
   public String getEntityName() {
        return "RegraSLA";
   }

   @Override
   public RegraSLA fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
