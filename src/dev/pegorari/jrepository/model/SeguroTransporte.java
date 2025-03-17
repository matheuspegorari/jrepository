package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SeguroTransporte extends AbstractSankhyaEntity<SeguroTransporte> {
   private BigDecimal vlrCarga;
   private BigDecimal seqSeg;
   private String numApo;
   private BigDecimal nuNota;
   private String respSeg;
   private String nomeSeg;
   private String numAve;

   public BigDecimal getVlrCarga() {
        return vlrCarga;
   }

   public void setVlrCarga(BigDecimal vlrCarga) {
        this.vlrCarga = vlrCarga;
   }

   public BigDecimal getSeqSeg() {
        return seqSeg;
   }

   public void setSeqSeg(BigDecimal seqSeg) {
        this.seqSeg = seqSeg;
   }

   public String getNumApo() {
        return numApo;
   }

   public void setNumApo(String numApo) {
        this.numApo = numApo;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public String getRespSeg() {
        return respSeg;
   }

   public void setRespSeg(String respSeg) {
        this.respSeg = respSeg;
   }

   public String getNomeSeg() {
        return nomeSeg;
   }

   public void setNomeSeg(String nomeSeg) {
        this.nomeSeg = nomeSeg;
   }

   public String getNumAve() {
        return numAve;
   }

   public void setNumAve(String numAve) {
        this.numAve = numAve;
   }

   @Override
   public String getTableName() {
        return "TGFSEG";
   }

   @Override
   public String getEntityName() {
        return "SeguroTransporte";
   }

   @Override
   public SeguroTransporte fromVO(DynamicVO vo) {
        this.vlrCarga = vo.asBigDecimal("VLRCARGA");
        this.seqSeg = vo.asBigDecimal("SEQSEG");
        this.numApo = vo.asString("NUMAPO");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.respSeg = vo.asString("RESPSEG");
        this.nomeSeg = vo.asString("NOMESEG");
        this.numAve = vo.asString("NUMAVE");
        return this;
   }
}
