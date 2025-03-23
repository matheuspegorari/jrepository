package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ContratoServico extends AbstractSankhyaEntity<ContratoServico> {
   private BigDecimal codServ;
   private BigDecimal numContrato;
   private BigDecimal parcelas;
   private BigDecimal sequencia;
   private BigDecimal valor;

   public BigDecimal getCodServ() {
        return codServ;
   }

   public void setCodServ(BigDecimal codServ) {
        markAsChanged("CODSERV", codServ);
        this.codServ = codServ;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
        this.numContrato = numContrato;
   }

   public BigDecimal getParcelas() {
        return parcelas;
   }

   public void setParcelas(BigDecimal parcelas) {
        markAsChanged("PARCELAS", parcelas);
        this.parcelas = parcelas;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
        this.valor = valor;
   }

   @Override
   public String getTableName() {
        return "TCSCSE";
   }

   @Override
   public String getEntityName() {
        return "ContratoServico";
   }

   @Override
   public ContratoServico fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codServ = vo.asBigDecimal("CODSERV");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.parcelas = vo.asBigDecimal("PARCELAS");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.valor = vo.asBigDecimal("VALOR");
        return this;
   }
}
