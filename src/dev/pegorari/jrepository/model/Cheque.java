package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Cheque extends AbstractSankhyaEntity<Cheque> {
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

   public String getCmc7() {
        return this.getVo().asString("CMC7");
   }

   public void setCmc7(String cmc7) {
        markAsChanged("CMC7", cmc7);
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

   public Timestamp getDataCheque() {
        return this.getVo().asTimestamp("DATACHEQUE");
   }

   public void setDataCheque(Timestamp dataCheque) {
        markAsChanged("DATACHEQUE", dataCheque);
   }

   public String getNomeEmitente() {
        return this.getVo().asString("NOMEEMITENTE");
   }

   public void setNomeEmitente(String nomeEmitente) {
        markAsChanged("NOMEEMITENTE", nomeEmitente);
   }

   public BigDecimal getNuChq() {
        return this.getVo().asBigDecimal("NUCHQ");
   }

   public void setNuChq(BigDecimal nuChq) {
        markAsChanged("NUCHQ", nuChq);
   }

   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
   }

   public String getNumCheque() {
        return this.getVo().asString("NUMCHEQUE");
   }

   public void setNumCheque(String numCheque) {
        markAsChanged("NUMCHEQUE", numCheque);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public BigDecimal getVlrCheque() {
        return this.getVo().asBigDecimal("VLRCHEQUE");
   }

   public void setVlrCheque(BigDecimal vlrCheque) {
        markAsChanged("VLRCHEQUE", vlrCheque);
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
        return this;
   }
}
