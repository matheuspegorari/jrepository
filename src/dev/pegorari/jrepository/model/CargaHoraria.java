package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CargaHoraria extends AbstractSankhyaEntity<CargaHoraria> {
   public String getDescansoSem() {
        return this.getVo().asString("DESCANSOSEM");
   }

   public void setDescansoSem(String descansoSem) {
        markAsChanged("DESCANSOSEM", descansoSem);
   }

   public BigDecimal getDiaSem() {
        return this.getVo().asBigDecimal("DIASEM");
   }

   public void setDiaSem(BigDecimal diaSem) {
        markAsChanged("DIASEM", diaSem);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getEntrada() {
        return this.getVo().asBigDecimal("ENTRADA");
   }

   public void setEntrada(BigDecimal entrada) {
        markAsChanged("ENTRADA", entrada);
   }

   public BigDecimal getSaida() {
        return this.getVo().asBigDecimal("SAIDA");
   }

   public void setSaida(BigDecimal saida) {
        markAsChanged("SAIDA", saida);
   }

   public BigDecimal getTurno() {
        return this.getVo().asBigDecimal("TURNO");
   }

   public void setTurno(BigDecimal turno) {
        markAsChanged("TURNO", turno);
   }

   public String getValEntrada() {
        return this.getVo().asString("VALENTRADA");
   }

   public void setValEntrada(String valEntrada) {
        markAsChanged("VALENTRADA", valEntrada);
   }

   public BigDecimal getCargaHoraria() {
        return this.getVo().asBigDecimal("CARGAHORARIA");
   }

   public void setCargaHoraria(BigDecimal cargaHoraria) {
        markAsChanged("CARGAHORARIA", cargaHoraria);
   }

   public BigDecimal getCodCargaHor() {
        return this.getVo().asBigDecimal("CODCARGAHOR");
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        markAsChanged("CODCARGAHOR", codCargaHor);
   }

   public String getValSaida() {
        return this.getVo().asString("VALSAIDA");
   }

   public void setValSaida(String valSaida) {
        markAsChanged("VALSAIDA", valSaida);
   }

   public BigDecimal getDurJornadaEsocial() {
        return this.getVo().asBigDecimal("DURJORNADAESOCIAL");
   }

   public void setDurJornadaEsocial(BigDecimal durJornadaEsocial) {
        markAsChanged("DURJORNADAESOCIAL", durJornadaEsocial);
   }

   @Override
   public String getTableName() {
        return "TFPHOR";
   }

   @Override
   public String getEntityName() {
        return "CargaHoraria";
   }

   @Override
   public CargaHoraria fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
