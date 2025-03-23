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
        markAsChanged("AGENCIA", agencia);
        this.agencia = agencia;
   }

   public String getCgcCpf() {
        return cgcCpf;
   }

   public void setCgcCpf(String cgcCpf) {
        markAsChanged("CGC_CPF", cgcCpf);
        this.cgcCpf = cgcCpf;
   }

   public String getCmc7() {
        return cmc7;
   }

   public void setCmc7(String cmc7) {
        markAsChanged("CMC7", cmc7);
        this.cmc7 = cmc7;
   }

   public BigDecimal getCodBco() {
        return codBco;
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
        this.codBco = codBco;
   }

   public String getConta() {
        return conta;
   }

   public void setConta(String conta) {
        markAsChanged("CONTA", conta);
        this.conta = conta;
   }

   public Timestamp getDataCheque() {
        return dataCheque;
   }

   public void setDataCheque(Timestamp dataCheque) {
        markAsChanged("DATACHEQUE", dataCheque);
        this.dataCheque = dataCheque;
   }

   public String getNomeEmitente() {
        return nomeEmitente;
   }

   public void setNomeEmitente(String nomeEmitente) {
        markAsChanged("NOMEEMITENTE", nomeEmitente);
        this.nomeEmitente = nomeEmitente;
   }

   public BigDecimal getNuChq() {
        return nuChq;
   }

   public void setNuChq(BigDecimal nuChq) {
        markAsChanged("NUCHQ", nuChq);
        this.nuChq = nuChq;
   }

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
        this.nuFin = nuFin;
   }

   public String getNumCheque() {
        return numCheque;
   }

   public void setNumCheque(String numCheque) {
        markAsChanged("NUMCHEQUE", numCheque);
        this.numCheque = numCheque;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public BigDecimal getVlrCheque() {
        return vlrCheque;
   }

   public void setVlrCheque(BigDecimal vlrCheque) {
        markAsChanged("VLRCHEQUE", vlrCheque);
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
        this.setVo(vo);
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
