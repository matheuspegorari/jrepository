package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Cheque extends AbstractSankhyaEntity<Cheque> {
   private String agencia;
   private String cgcCpf;
   private String cmc7;
   private BigDecimal codBco;
   private String conta;
   private Timestamp dataCheque;
   private String nomeEmitente;
   private BigDecimal nuChq;
   private BigDecimal nuFin;
   private String numCheque;
   private String status;
   private BigDecimal vlrCheque;

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

   public String getCmc7() {
        return cmc7;
   }

   public void setCmc7(String cmc7) {
        this.cmc7 = cmc7;
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

   public Timestamp getDataCheque() {
        return dataCheque;
   }

   public void setDataCheque(Timestamp dataCheque) {
        this.dataCheque = dataCheque;
   }

   public String getNomeEmitente() {
        return nomeEmitente;
   }

   public void setNomeEmitente(String nomeEmitente) {
        this.nomeEmitente = nomeEmitente;
   }

   public BigDecimal getNuChq() {
        return nuChq;
   }

   public void setNuChq(BigDecimal nuChq) {
        this.nuChq = nuChq;
   }

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        this.nuFin = nuFin;
   }

   public String getNumCheque() {
        return numCheque;
   }

   public void setNumCheque(String numCheque) {
        this.numCheque = numCheque;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        this.status = status;
   }

   public BigDecimal getVlrCheque() {
        return vlrCheque;
   }

   public void setVlrCheque(BigDecimal vlrCheque) {
        this.vlrCheque = vlrCheque;
   }

   @Override
   public String getTableName() {
        return "TGFCHQ";
   }

   @Override
   public String getEntityName() {
        return "Cheque";
   }

   @Override
   public Cheque fromVO(DynamicVO vo) {
        this.agencia = vo.asString("AGENCIA");
        this.cgcCpf = vo.asString("CGC_CPF");
        this.cmc7 = vo.asString("CMC7");
        this.codBco = vo.asBigDecimal("CODBCO");
        this.conta = vo.asString("CONTA");
        this.dataCheque = vo.asTimestamp("DATACHEQUE");
        this.nomeEmitente = vo.asString("NOMEEMITENTE");
        this.nuChq = vo.asBigDecimal("NUCHQ");
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.numCheque = vo.asString("NUMCHEQUE");
        this.status = vo.asString("STATUS");
        this.vlrCheque = vo.asBigDecimal("VLRCHEQUE");
        return this;
   }
}
