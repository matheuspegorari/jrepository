package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PrevisaoEntrega extends AbstractSankhyaEntity<PrevisaoEntrega> {
   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private Timestamp dtPrev;
   private BigDecimal nuNota;
   private BigDecimal qtd;
   private BigDecimal qtdEntregue;
   private BigDecimal seqPrev;
   private BigDecimal sequencia;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtPrev() {
        return dtPrev;
   }

   public void setDtPrev(Timestamp dtPrev) {
        markAsChanged("DTPREV", dtPrev);
        this.dtPrev = dtPrev;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getQtd() {
        return qtd;
   }

   public void setQtd(BigDecimal qtd) {
        markAsChanged("QTD", qtd);
        this.qtd = qtd;
   }

   public BigDecimal getQtdEntregue() {
        return qtdEntregue;
   }

   public void setQtdEntregue(BigDecimal qtdEntregue) {
        markAsChanged("QTDENTREGUE", qtdEntregue);
        this.qtdEntregue = qtdEntregue;
   }

   public BigDecimal getSeqPrev() {
        return seqPrev;
   }

   public void setSeqPrev(BigDecimal seqPrev) {
        markAsChanged("SEQPREV", seqPrev);
        this.seqPrev = seqPrev;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
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
        this.setOriginalVO(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtPrev = vo.asTimestamp("DTPREV");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.qtd = vo.asBigDecimal("QTD");
        this.qtdEntregue = vo.asBigDecimal("QTDENTREGUE");
        this.seqPrev = vo.asBigDecimal("SEQPREV");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
