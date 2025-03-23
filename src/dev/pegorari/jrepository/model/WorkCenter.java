package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class WorkCenter extends AbstractSankhyaEntity<WorkCenter> {
   private BigDecimal codCap;
   private BigDecimal codCargaHor;
   private BigDecimal codCencus;
   private BigDecimal codCwc;
   private BigDecimal codLocalWc;
   private BigDecimal codPlp;
   private BigDecimal codUsuResp;
   private BigDecimal codWcp;
   private String exigeCleanup;
   private BigDecimal indiceOee;
   private String nome;
   private String nomeImpressora;
   private BigDecimal numQp;
   private String operacao;
   private BigDecimal qtdCapacidadeMax;
   private BigDecimal qtdCapacidadeMin;
   private BigDecimal qtdCapacidadePad;
   private String setupPronto;
   private BigDecimal tempoCleanup;
   private BigDecimal tempoSetup;
   private String tipoSetup;
   private BigDecimal qtdAlocada;
   private String codVol;
   private BigDecimal qtdCargaMax;
   private BigDecimal qtdCargaMin;
   private String restringeCarga;
   private BigDecimal capacidadeHora;
   private String disponibilidade;

   public BigDecimal getCodCap() {
        return codCap;
   }

   public void setCodCap(BigDecimal codCap) {
        markAsChanged("CODCAP", codCap);
        this.codCap = codCap;
   }

   public BigDecimal getCodCargaHor() {
        return codCargaHor;
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        markAsChanged("CODCARGAHOR", codCargaHor);
        this.codCargaHor = codCargaHor;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
        this.codCencus = codCencus;
   }

   public BigDecimal getCodCwc() {
        return codCwc;
   }

   public void setCodCwc(BigDecimal codCwc) {
        markAsChanged("CODCWC", codCwc);
        this.codCwc = codCwc;
   }

   public BigDecimal getCodLocalWc() {
        return codLocalWc;
   }

   public void setCodLocalWc(BigDecimal codLocalWc) {
        markAsChanged("CODLOCALWC", codLocalWc);
        this.codLocalWc = codLocalWc;
   }

   public BigDecimal getCodPlp() {
        return codPlp;
   }

   public void setCodPlp(BigDecimal codPlp) {
        markAsChanged("CODPLP", codPlp);
        this.codPlp = codPlp;
   }

   public BigDecimal getCodUsuResp() {
        return codUsuResp;
   }

   public void setCodUsuResp(BigDecimal codUsuResp) {
        markAsChanged("CODUSURESP", codUsuResp);
        this.codUsuResp = codUsuResp;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
        this.codWcp = codWcp;
   }

   public String getExigeCleanup() {
        return exigeCleanup;
   }

   public void setExigeCleanup(String exigeCleanup) {
        markAsChanged("EXIGECLEANUP", exigeCleanup);
        this.exigeCleanup = exigeCleanup;
   }

   public BigDecimal getIndiceOee() {
        return indiceOee;
   }

   public void setIndiceOee(BigDecimal indiceOee) {
        markAsChanged("INDICEOEE", indiceOee);
        this.indiceOee = indiceOee;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
        this.nome = nome;
   }

   public String getNomeImpressora() {
        return nomeImpressora;
   }

   public void setNomeImpressora(String nomeImpressora) {
        markAsChanged("NOMEIMPRESSORA", nomeImpressora);
        this.nomeImpressora = nomeImpressora;
   }

   public BigDecimal getNumQp() {
        return numQp;
   }

   public void setNumQp(BigDecimal numQp) {
        markAsChanged("NUMQP", numQp);
        this.numQp = numQp;
   }

   public String getOperacao() {
        return operacao;
   }

   public void setOperacao(String operacao) {
        markAsChanged("OPERACAO", operacao);
        this.operacao = operacao;
   }

   public BigDecimal getQtdCapacidadeMax() {
        return qtdCapacidadeMax;
   }

   public void setQtdCapacidadeMax(BigDecimal qtdCapacidadeMax) {
        markAsChanged("QTDCAPACIDADEMAX", qtdCapacidadeMax);
        this.qtdCapacidadeMax = qtdCapacidadeMax;
   }

   public BigDecimal getQtdCapacidadeMin() {
        return qtdCapacidadeMin;
   }

   public void setQtdCapacidadeMin(BigDecimal qtdCapacidadeMin) {
        markAsChanged("QTDCAPACIDADEMIN", qtdCapacidadeMin);
        this.qtdCapacidadeMin = qtdCapacidadeMin;
   }

   public BigDecimal getQtdCapacidadePad() {
        return qtdCapacidadePad;
   }

   public void setQtdCapacidadePad(BigDecimal qtdCapacidadePad) {
        markAsChanged("QTDCAPACIDADEPAD", qtdCapacidadePad);
        this.qtdCapacidadePad = qtdCapacidadePad;
   }

   public String getSetupPronto() {
        return setupPronto;
   }

   public void setSetupPronto(String setupPronto) {
        markAsChanged("SETUPPRONTO", setupPronto);
        this.setupPronto = setupPronto;
   }

   public BigDecimal getTempoCleanup() {
        return tempoCleanup;
   }

   public void setTempoCleanup(BigDecimal tempoCleanup) {
        markAsChanged("TEMPOCLEANUP", tempoCleanup);
        this.tempoCleanup = tempoCleanup;
   }

   public BigDecimal getTempoSetup() {
        return tempoSetup;
   }

   public void setTempoSetup(BigDecimal tempoSetup) {
        markAsChanged("TEMPOSETUP", tempoSetup);
        this.tempoSetup = tempoSetup;
   }

   public String getTipoSetup() {
        return tipoSetup;
   }

   public void setTipoSetup(String tipoSetup) {
        markAsChanged("TIPOSETUP", tipoSetup);
        this.tipoSetup = tipoSetup;
   }

   public BigDecimal getQtdAlocada() {
        return qtdAlocada;
   }

   public void setQtdAlocada(BigDecimal qtdAlocada) {
        markAsChanged("QTDALOCADA", qtdAlocada);
        this.qtdAlocada = qtdAlocada;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public BigDecimal getQtdCargaMax() {
        return qtdCargaMax;
   }

   public void setQtdCargaMax(BigDecimal qtdCargaMax) {
        markAsChanged("QTDCARGAMAX", qtdCargaMax);
        this.qtdCargaMax = qtdCargaMax;
   }

   public BigDecimal getQtdCargaMin() {
        return qtdCargaMin;
   }

   public void setQtdCargaMin(BigDecimal qtdCargaMin) {
        markAsChanged("QTDCARGAMIN", qtdCargaMin);
        this.qtdCargaMin = qtdCargaMin;
   }

   public String getRestringeCarga() {
        return restringeCarga;
   }

   public void setRestringeCarga(String restringeCarga) {
        markAsChanged("RESTRINGECARGA", restringeCarga);
        this.restringeCarga = restringeCarga;
   }

   public BigDecimal getCapacidadeHora() {
        return capacidadeHora;
   }

   public void setCapacidadeHora(BigDecimal capacidadeHora) {
        markAsChanged("CAPACIDADEHORA", capacidadeHora);
        this.capacidadeHora = capacidadeHora;
   }

   public String getDisponibilidade() {
        return disponibilidade;
   }

   public void setDisponibilidade(String disponibilidade) {
        markAsChanged("DISPONIBILIDADE", disponibilidade);
        this.disponibilidade = disponibilidade;
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
        this.codCap = vo.asBigDecimal("CODCAP");
        this.codCargaHor = vo.asBigDecimal("CODCARGAHOR");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codCwc = vo.asBigDecimal("CODCWC");
        this.codLocalWc = vo.asBigDecimal("CODLOCALWC");
        this.codPlp = vo.asBigDecimal("CODPLP");
        this.codUsuResp = vo.asBigDecimal("CODUSURESP");
        this.codWcp = vo.asBigDecimal("CODWCP");
        this.exigeCleanup = vo.asString("EXIGECLEANUP");
        this.indiceOee = vo.asBigDecimal("INDICEOEE");
        this.nome = vo.asString("NOME");
        this.nomeImpressora = vo.asString("NOMEIMPRESSORA");
        this.numQp = vo.asBigDecimal("NUMQP");
        this.operacao = vo.asString("OPERACAO");
        this.qtdCapacidadeMax = vo.asBigDecimal("QTDCAPACIDADEMAX");
        this.qtdCapacidadeMin = vo.asBigDecimal("QTDCAPACIDADEMIN");
        this.qtdCapacidadePad = vo.asBigDecimal("QTDCAPACIDADEPAD");
        this.setupPronto = vo.asString("SETUPPRONTO");
        this.tempoCleanup = vo.asBigDecimal("TEMPOCLEANUP");
        this.tempoSetup = vo.asBigDecimal("TEMPOSETUP");
        this.tipoSetup = vo.asString("TIPOSETUP");
        this.qtdAlocada = vo.asBigDecimal("QTDALOCADA");
        this.codVol = vo.asString("CODVOL");
        this.qtdCargaMax = vo.asBigDecimal("QTDCARGAMAX");
        this.qtdCargaMin = vo.asBigDecimal("QTDCARGAMIN");
        this.restringeCarga = vo.asString("RESTRINGECARGA");
        this.capacidadeHora = vo.asBigDecimal("CAPACIDADEHORA");
        this.disponibilidade = vo.asString("DISPONIBILIDADE");
        return this;
   }
}
