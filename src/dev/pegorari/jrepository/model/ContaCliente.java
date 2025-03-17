package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ContaCliente extends AbstractSankhyaEntity<ContaCliente> {
   private String agencia;
   private String cgcCpf;
   private BigDecimal codBco;
   private String conta;
   private String nomeEmitente;

   public String getAgencia() {
        return agencia;
   }

   public void setAgencia(String agencia) {
        this.agencia = agencia;
   }

   public String getCgcCpf() {
        return cgcCpf;
   }

   public void setCgcCpf(String cgcCpf) {
        this.cgcCpf = cgcCpf;
   }

   public BigDecimal getCodBco() {
        return codBco;
   }

   public void setCodBco(BigDecimal codBco) {
        this.codBco = codBco;
   }

   public String getConta() {
        return conta;
   }

   public void setConta(String conta) {
        this.conta = conta;
   }

   public String getNomeEmitente() {
        return nomeEmitente;
   }

   public void setNomeEmitente(String nomeEmitente) {
        this.nomeEmitente = nomeEmitente;
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
        this.agencia = vo.asString("AGENCIA");
        this.cgcCpf = vo.asString("CGC_CPF");
        this.codBco = vo.asBigDecimal("CODBCO");
        this.conta = vo.asString("CONTA");
        this.nomeEmitente = vo.asString("NOMEEMITENTE");
        return this;
   }
}
