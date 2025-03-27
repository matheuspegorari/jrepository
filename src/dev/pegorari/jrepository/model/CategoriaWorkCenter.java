package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CategoriaWorkCenter extends AbstractSankhyaEntity<CategoriaWorkCenter> {
   public BigDecimal getCodCap() {
        return this.getVo().asBigDecimal("CODCAP");
   }

   public void setCodCap(BigDecimal codCap) {
        markAsChanged("CODCAP", codCap);
   }

   public BigDecimal getCodCwc() {
        return this.getVo().asBigDecimal("CODCWC");
   }

   public void setCodCwc(BigDecimal codCwc) {
        markAsChanged("CODCWC", codCwc);
   }

   public BigDecimal getCodWcppadrao() {
        return this.getVo().asBigDecimal("CODWCPPADRAO");
   }

   public void setCodWcppadrao(BigDecimal codWcppadrao) {
        markAsChanged("CODWCPPADRAO", codWcppadrao);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
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

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getCapacidadeHora() {
        return this.getVo().asBigDecimal("CAPACIDADEHORA");
   }

   public void setCapacidadeHora(BigDecimal capacidadeHora) {
        markAsChanged("CAPACIDADEHORA", capacidadeHora);
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
        this.setVo(vo);
        return this;
   }
}
