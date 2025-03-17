package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CargaHoraria extends AbstractSankhyaEntity<CargaHoraria> {
   private String descansoSem;
   private BigDecimal diaSem;
   private Timestamp dtAlter;
   private BigDecimal entrada;
   private BigDecimal saida;
   private BigDecimal turno;
   private String valEntrada;
   private BigDecimal cargaHoraria;
   private BigDecimal codCargaHor;
   private String valSaida;
   private BigDecimal durJornadaEsocial;

   public String getDescansoSem() {
        return descansoSem;
   }

   public void setDescansoSem(String descansoSem) {
        this.descansoSem = descansoSem;
   }

   public BigDecimal getDiaSem() {
        return diaSem;
   }

   public void setDiaSem(BigDecimal diaSem) {
        this.diaSem = diaSem;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getEntrada() {
        return entrada;
   }

   public void setEntrada(BigDecimal entrada) {
        this.entrada = entrada;
   }

   public BigDecimal getSaida() {
        return saida;
   }

   public void setSaida(BigDecimal saida) {
        this.saida = saida;
   }

   public BigDecimal getTurno() {
        return turno;
   }

   public void setTurno(BigDecimal turno) {
        this.turno = turno;
   }

   public String getValEntrada() {
        return valEntrada;
   }

   public void setValEntrada(String valEntrada) {
        this.valEntrada = valEntrada;
   }

   public BigDecimal getCargaHoraria() {
        return cargaHoraria;
   }

   public void setCargaHoraria(BigDecimal cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
   }

   public BigDecimal getCodCargaHor() {
        return codCargaHor;
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        this.codCargaHor = codCargaHor;
   }

   public String getValSaida() {
        return valSaida;
   }

   public void setValSaida(String valSaida) {
        this.valSaida = valSaida;
   }

   public BigDecimal getDurJornadaEsocial() {
        return durJornadaEsocial;
   }

   public void setDurJornadaEsocial(BigDecimal durJornadaEsocial) {
        this.durJornadaEsocial = durJornadaEsocial;
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
        this.descansoSem = vo.asString("DESCANSOSEM");
        this.diaSem = vo.asBigDecimal("DIASEM");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.entrada = vo.asBigDecimal("ENTRADA");
        this.saida = vo.asBigDecimal("SAIDA");
        this.turno = vo.asBigDecimal("TURNO");
        this.valEntrada = vo.asString("VALENTRADA");
        this.cargaHoraria = vo.asBigDecimal("CARGAHORARIA");
        this.codCargaHor = vo.asBigDecimal("CODCARGAHOR");
        this.valSaida = vo.asString("VALSAIDA");
        this.durJornadaEsocial = vo.asBigDecimal("DURJORNADAESOCIAL");
        return this;
   }
}
