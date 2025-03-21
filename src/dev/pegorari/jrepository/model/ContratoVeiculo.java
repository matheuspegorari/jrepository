package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ContratoVeiculo extends AbstractSankhyaEntity<ContratoVeiculo> {
   private BigDecimal codServ;
   private BigDecimal codUsu;
   private BigDecimal codVeiculo;
   private Timestamp dtAlter;
   private Timestamp dtDesinstal;
   private Timestamp dtInstal;
   private BigDecimal numContrato;
   private BigDecimal numOsDesinstal;
   private BigDecimal numOsInstal;
   private BigDecimal sequencia;
   private String telefone;

   public BigDecimal getCodServ() {
        return codServ;
   }

   public void setCodServ(BigDecimal codServ) {
        markAsChanged("CODSERV", codServ);
        this.codServ = codServ;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodVeiculo() {
        return codVeiculo;
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
        this.codVeiculo = codVeiculo;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtDesinstal() {
        return dtDesinstal;
   }

   public void setDtDesinstal(Timestamp dtDesinstal) {
        markAsChanged("DTDESINSTAL", dtDesinstal);
        this.dtDesinstal = dtDesinstal;
   }

   public Timestamp getDtInstal() {
        return dtInstal;
   }

   public void setDtInstal(Timestamp dtInstal) {
        markAsChanged("DTINSTAL", dtInstal);
        this.dtInstal = dtInstal;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
        this.numContrato = numContrato;
   }

   public BigDecimal getNumOsDesinstal() {
        return numOsDesinstal;
   }

   public void setNumOsDesinstal(BigDecimal numOsDesinstal) {
        markAsChanged("NUMOSDESINSTAL", numOsDesinstal);
        this.numOsDesinstal = numOsDesinstal;
   }

   public BigDecimal getNumOsInstal() {
        return numOsInstal;
   }

   public void setNumOsInstal(BigDecimal numOsInstal) {
        markAsChanged("NUMOSINSTAL", numOsInstal);
        this.numOsInstal = numOsInstal;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getTelefone() {
        return telefone;
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
        this.telefone = telefone;
   }

   @Override
   public String getTableName() {
        return "TCSCVE";
   }

   @Override
   public String getEntityName() {
        return "ContratoVeiculo";
   }

   @Override
   public ContratoVeiculo fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codServ = vo.asBigDecimal("CODSERV");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVeiculo = vo.asBigDecimal("CODVEICULO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtDesinstal = vo.asTimestamp("DTDESINSTAL");
        this.dtInstal = vo.asTimestamp("DTINSTAL");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.numOsDesinstal = vo.asBigDecimal("NUMOSDESINSTAL");
        this.numOsInstal = vo.asBigDecimal("NUMOSINSTAL");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.telefone = vo.asString("TELEFONE");
        return this;
   }
}
