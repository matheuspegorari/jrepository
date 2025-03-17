package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ContratoServico implements SankhyaEntity<ContratoServico> {

   private BigDecimal codServ;
   private BigDecimal numContrato;
   private BigDecimal parcelas;
   private BigDecimal sequencia;
   private BigDecimal valor;

   public BigDecimal getCodServ() {
        return codServ;
   }

   public void setCodServ(BigDecimal codServ) {
        this.codServ = codServ;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        this.numContrato = numContrato;
   }

   public BigDecimal getParcelas() {
        return parcelas;
   }

   public void setParcelas(BigDecimal parcelas) {
        this.parcelas = parcelas;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        this.valor = valor;
   }

   @Override
   public String getEntityName() {
        return "ContratoServico";
   }

   @Override
   public ContratoServico fromVO(DynamicVO vo) {
        this.codServ = vo.asBigDecimal("CODSERV");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.parcelas = vo.asBigDecimal("PARCELAS");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.valor = vo.asBigDecimal("VALOR");
        return this;
   }
}
