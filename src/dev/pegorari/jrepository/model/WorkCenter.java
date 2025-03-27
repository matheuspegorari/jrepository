package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class WorkCenter extends AbstractSankhyaEntity<WorkCenter> {
   public BigDecimal getCodCap() {
        return this.getVo().asBigDecimal("CODCAP");
   }

   public void setCodCap(BigDecimal codCap) {
        markAsChanged("CODCAP", codCap);
   }

   public BigDecimal getCodCargaHor() {
        return this.getVo().asBigDecimal("CODCARGAHOR");
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        markAsChanged("CODCARGAHOR", codCargaHor);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodCwc() {
        return this.getVo().asBigDecimal("CODCWC");
   }

   public void setCodCwc(BigDecimal codCwc) {
        markAsChanged("CODCWC", codCwc);
   }

   public BigDecimal getCodLocalWc() {
        return this.getVo().asBigDecimal("CODLOCALWC");
   }

   public void setCodLocalWc(BigDecimal codLocalWc) {
        markAsChanged("CODLOCALWC", codLocalWc);
   }

   public BigDecimal getCodPlp() {
        return this.getVo().asBigDecimal("CODPLP");
   }

   public void setCodPlp(BigDecimal codPlp) {
        markAsChanged("CODPLP", codPlp);
   }

   public BigDecimal getCodUsuResp() {
        return this.getVo().asBigDecimal("CODUSURESP");
   }

   public void setCodUsuResp(BigDecimal codUsuResp) {
        markAsChanged("CODUSURESP", codUsuResp);
   }

   public BigDecimal getCodWcp() {
        return this.getVo().asBigDecimal("CODWCP");
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
   }

   public String getExigeCleanup() {
        return this.getVo().asString("EXIGECLEANUP");
   }

   public void setExigeCleanup(String exigeCleanup) {
        markAsChanged("EXIGECLEANUP", exigeCleanup);
   }

   public BigDecimal getIndiceOee() {
        return this.getVo().asBigDecimal("INDICEOEE");
   }

   public void setIndiceOee(BigDecimal indiceOee) {
        markAsChanged("INDICEOEE", indiceOee);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public String getNomeImpressora() {
        return this.getVo().asString("NOMEIMPRESSORA");
   }

   public void setNomeImpressora(String nomeImpressora) {
        markAsChanged("NOMEIMPRESSORA", nomeImpressora);
   }

   public BigDecimal getNumQp() {
        return this.getVo().asBigDecimal("NUMQP");
   }

   public void setNumQp(BigDecimal numQp) {
        markAsChanged("NUMQP", numQp);
   }

   public String getOperacao() {
        return this.getVo().asString("OPERACAO");
   }

   public void setOperacao(String operacao) {
        markAsChanged("OPERACAO", operacao);
   }

   public BigDecimal getQtdCapacidadeMax() {
        return this.getVo().asBigDecimal("QTDCAPACIDADEMAX");
   }

   public void setQtdCapacidadeMax(BigDecimal qtdCapacidadeMax) {
        markAsChanged("QTDCAPACIDADEMAX", qtdCapacidadeMax);
   }

   public BigDecimal getQtdCapacidadeMin() {
        return this.getVo().asBigDecimal("QTDCAPACIDADEMIN");
   }

   public void setQtdCapacidadeMin(BigDecimal qtdCapacidadeMin) {
        markAsChanged("QTDCAPACIDADEMIN", qtdCapacidadeMin);
   }

   public BigDecimal getQtdCapacidadePad() {
        return this.getVo().asBigDecimal("QTDCAPACIDADEPAD");
   }

   public void setQtdCapacidadePad(BigDecimal qtdCapacidadePad) {
        markAsChanged("QTDCAPACIDADEPAD", qtdCapacidadePad);
   }

   public String getSetupPronto() {
        return this.getVo().asString("SETUPPRONTO");
   }

   public void setSetupPronto(String setupPronto) {
        markAsChanged("SETUPPRONTO", setupPronto);
   }

   public BigDecimal getTempoCleanup() {
        return this.getVo().asBigDecimal("TEMPOCLEANUP");
   }

   public void setTempoCleanup(BigDecimal tempoCleanup) {
        markAsChanged("TEMPOCLEANUP", tempoCleanup);
   }

   public BigDecimal getTempoSetup() {
        return this.getVo().asBigDecimal("TEMPOSETUP");
   }

   public void setTempoSetup(BigDecimal tempoSetup) {
        markAsChanged("TEMPOSETUP", tempoSetup);
   }

   public String getTipoSetup() {
        return this.getVo().asString("TIPOSETUP");
   }

   public void setTipoSetup(String tipoSetup) {
        markAsChanged("TIPOSETUP", tipoSetup);
   }

   public BigDecimal getQtdAlocada() {
        return this.getVo().asBigDecimal("QTDALOCADA");
   }

   public void setQtdAlocada(BigDecimal qtdAlocada) {
        markAsChanged("QTDALOCADA", qtdAlocada);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public BigDecimal getQtdCargaMax() {
        return this.getVo().asBigDecimal("QTDCARGAMAX");
   }

   public void setQtdCargaMax(BigDecimal qtdCargaMax) {
        markAsChanged("QTDCARGAMAX", qtdCargaMax);
   }

   public BigDecimal getQtdCargaMin() {
        return this.getVo().asBigDecimal("QTDCARGAMIN");
   }

   public void setQtdCargaMin(BigDecimal qtdCargaMin) {
        markAsChanged("QTDCARGAMIN", qtdCargaMin);
   }

   public String getRestringeCarga() {
        return this.getVo().asString("RESTRINGECARGA");
   }

   public void setRestringeCarga(String restringeCarga) {
        markAsChanged("RESTRINGECARGA", restringeCarga);
   }

   public BigDecimal getCapacidadeHora() {
        return this.getVo().asBigDecimal("CAPACIDADEHORA");
   }

   public void setCapacidadeHora(BigDecimal capacidadeHora) {
        markAsChanged("CAPACIDADEHORA", capacidadeHora);
   }

   public String getDisponibilidade() {
        return this.getVo().asString("DISPONIBILIDADE");
   }

   public void setDisponibilidade(String disponibilidade) {
        markAsChanged("DISPONIBILIDADE", disponibilidade);
   }

   @Override
   public String getTableName() {
        return "TPRWCP";
   }

   @Override
   public String getEntityName() {
        return "WorkCenter";
   }

   @Override
   public WorkCenter fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
