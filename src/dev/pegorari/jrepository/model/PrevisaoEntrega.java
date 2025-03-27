package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PrevisaoEntrega extends AbstractSankhyaEntity<PrevisaoEntrega> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtPrev() {
        return this.getVo().asTimestamp("DTPREV");
   }

   public void setDtPrev(Timestamp dtPrev) {
        markAsChanged("DTPREV", dtPrev);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getQtd() {
        return this.getVo().asBigDecimal("QTD");
   }

   public void setQtd(BigDecimal qtd) {
        markAsChanged("QTD", qtd);
   }

   public BigDecimal getQtdEntregue() {
        return this.getVo().asBigDecimal("QTDENTREGUE");
   }

   public void setQtdEntregue(BigDecimal qtdEntregue) {
        markAsChanged("QTDENTREGUE", qtdEntregue);
   }

   public BigDecimal getSeqPrev() {
        return this.getVo().asBigDecimal("SEQPREV");
   }

   public void setSeqPrev(BigDecimal seqPrev) {
        markAsChanged("SEQPREV", seqPrev);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TGFDTP";
   }

   @Override
   public String getEntityName() {
        return "PrevisaoEntrega";
   }

   @Override
   public PrevisaoEntrega fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
