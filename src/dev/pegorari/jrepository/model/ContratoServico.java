package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ContratoServico extends AbstractSankhyaEntity<ContratoServico> {
   public BigDecimal getCodServ() {
        return this.getVo().asBigDecimal("CODSERV");
   }

   public void setCodServ(BigDecimal codServ) {
        markAsChanged("CODSERV", codServ);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public BigDecimal getParcelas() {
        return this.getVo().asBigDecimal("PARCELAS");
   }

   public void setParcelas(BigDecimal parcelas) {
        markAsChanged("PARCELAS", parcelas);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
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
        return this;
   }
}
