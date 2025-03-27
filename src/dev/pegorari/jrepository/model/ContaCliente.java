package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ContaCliente extends AbstractSankhyaEntity<ContaCliente> {
   public String getAgencia() {
        return this.getVo().asString("AGENCIA");
   }

   public void setAgencia(String agencia) {
        markAsChanged("AGENCIA", agencia);
   }

   public String getCgcCpf() {
        return this.getVo().asString("CGC_CPF");
   }

   public void setCgcCpf(String cgcCpf) {
        markAsChanged("CGC_CPF", cgcCpf);
   }

   public BigDecimal getCodBco() {
        return this.getVo().asBigDecimal("CODBCO");
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
   }

   public String getConta() {
        return this.getVo().asString("CONTA");
   }

   public void setConta(String conta) {
        markAsChanged("CONTA", conta);
   }

   public String getNomeEmitente() {
        return this.getVo().asString("NOMEEMITENTE");
   }

   public void setNomeEmitente(String nomeEmitente) {
        markAsChanged("NOMEEMITENTE", nomeEmitente);
   }

   @Override
   public String getTableName() {
        return "TGFCTC";
   }

   @Override
   public String getEntityName() {
        return "ContaCliente";
   }

   @Override
   public ContaCliente fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
