package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ContratoVeiculo extends AbstractSankhyaEntity<ContratoVeiculo> {
   public BigDecimal getCodServ() {
        return this.getVo().asBigDecimal("CODSERV");
   }

   public void setCodServ(BigDecimal codServ) {
        markAsChanged("CODSERV", codServ);
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

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtDesinstal() {
        return this.getVo().asTimestamp("DTDESINSTAL");
   }

   public void setDtDesinstal(Timestamp dtDesinstal) {
        markAsChanged("DTDESINSTAL", dtDesinstal);
   }

   public Timestamp getDtInstal() {
        return this.getVo().asTimestamp("DTINSTAL");
   }

   public void setDtInstal(Timestamp dtInstal) {
        markAsChanged("DTINSTAL", dtInstal);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public BigDecimal getNumOsDesinstal() {
        return this.getVo().asBigDecimal("NUMOSDESINSTAL");
   }

   public void setNumOsDesinstal(BigDecimal numOsDesinstal) {
        markAsChanged("NUMOSDESINSTAL", numOsDesinstal);
   }

   public BigDecimal getNumOsInstal() {
        return this.getVo().asBigDecimal("NUMOSINSTAL");
   }

   public void setNumOsInstal(BigDecimal numOsInstal) {
        markAsChanged("NUMOSINSTAL", numOsInstal);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTelefone() {
        return this.getVo().asString("TELEFONE");
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
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
        this.setVo(vo);
        return this;
   }
}
