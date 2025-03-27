package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SeguroTransporte extends AbstractSankhyaEntity<SeguroTransporte> {
   public BigDecimal getVlrCarga() {
        return this.getVo().asBigDecimal("VLRCARGA");
   }

   public void setVlrCarga(BigDecimal vlrCarga) {
        markAsChanged("VLRCARGA", vlrCarga);
   }

   public BigDecimal getSeqSeg() {
        return this.getVo().asBigDecimal("SEQSEG");
   }

   public void setSeqSeg(BigDecimal seqSeg) {
        markAsChanged("SEQSEG", seqSeg);
   }

   public String getNumApo() {
        return this.getVo().asString("NUMAPO");
   }

   public void setNumApo(String numApo) {
        markAsChanged("NUMAPO", numApo);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getRespSeg() {
        return this.getVo().asString("RESPSEG");
   }

   public void setRespSeg(String respSeg) {
        markAsChanged("RESPSEG", respSeg);
   }

   public String getNomeSeg() {
        return this.getVo().asString("NOMESEG");
   }

   public void setNomeSeg(String nomeSeg) {
        markAsChanged("NOMESEG", nomeSeg);
   }

   public String getNumAve() {
        return this.getVo().asString("NUMAVE");
   }

   public void setNumAve(String numAve) {
        markAsChanged("NUMAVE", numAve);
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
        this.setVo(vo);
        return this;
   }
}
