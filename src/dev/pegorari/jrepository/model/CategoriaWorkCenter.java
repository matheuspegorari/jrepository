package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CategoriaWorkCenter extends AbstractSankhyaEntity<CategoriaWorkCenter> {
   private BigDecimal codCap;
   private BigDecimal codCwc;
   private BigDecimal codWcppadrao;
   private String descricao;
   private BigDecimal qtdCapacidadeMax;
   private BigDecimal qtdCapacidadeMin;
   private BigDecimal qtdCapacidadePad;
   private BigDecimal tempoCleanup;
   private BigDecimal tempoSetup;
   private String tipo;
   private BigDecimal capacidadeHora;

   public BigDecimal getCodCap() {
        return codCap;
   }

   public void setCodCap(BigDecimal codCap) {
        markAsChanged("CODCAP", codCap);
        this.codCap = codCap;
   }

   public BigDecimal getCodCwc() {
        return codCwc;
   }

   public void setCodCwc(BigDecimal codCwc) {
        markAsChanged("CODCWC", codCwc);
        this.codCwc = codCwc;
   }

   public BigDecimal getCodWcppadrao() {
        return codWcppadrao;
   }

   public void setCodWcppadrao(BigDecimal codWcppadrao) {
        markAsChanged("CODWCPPADRAO", codWcppadrao);
        this.codWcppadrao = codWcppadrao;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
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

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getCapacidadeHora() {
        return capacidadeHora;
   }

   public void setCapacidadeHora(BigDecimal capacidadeHora) {
        markAsChanged("CAPACIDADEHORA", capacidadeHora);
        this.capacidadeHora = capacidadeHora;
   }

   @Override
   public String getTableName() {
        return "TPRCWC";
   }

   @Override
   public String getEntityName() {
        return "CategoriaWorkCenter";
   }

   @Override
   public CategoriaWorkCenter fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codCap = vo.asBigDecimal("CODCAP");
        this.codCwc = vo.asBigDecimal("CODCWC");
        this.codWcppadrao = vo.asBigDecimal("CODWCPPADRAO");
        this.descricao = vo.asString("DESCRICAO");
        this.qtdCapacidadeMax = vo.asBigDecimal("QTDCAPACIDADEMAX");
        this.qtdCapacidadeMin = vo.asBigDecimal("QTDCAPACIDADEMIN");
        this.qtdCapacidadePad = vo.asBigDecimal("QTDCAPACIDADEPAD");
        this.tempoCleanup = vo.asBigDecimal("TEMPOCLEANUP");
        this.tempoSetup = vo.asBigDecimal("TEMPOSETUP");
        this.tipo = vo.asString("TIPO");
        this.capacidadeHora = vo.asBigDecimal("CAPACIDADEHORA");
        return this;
   }
}
