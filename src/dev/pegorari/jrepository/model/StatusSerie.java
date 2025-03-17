package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class StatusSerie implements SankhyaEntity<StatusSerie> {

   private BigDecimal codProd;
   private BigDecimal nuNota;
   private BigDecimal seqNota;
   private String serie;
   private String status;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getSeqNota() {
        return seqNota;
   }

   public void setSeqNota(BigDecimal seqNota) {
        this.seqNota = seqNota;
   }

   public String getSerie() {
        return serie;
   }

   public void setSerie(String serie) {
        this.serie = serie;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        this.status = status;
   }

   @Override
   public String getEntityName() {
        return "StatusSerie";
   }

   @Override
   public StatusSerie fromVO(DynamicVO vo) {
        this.codProd = vo.asBigDecimal("CODPROD");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.seqNota = vo.asBigDecimal("SEQNOTA");
        this.serie = vo.asString("SERIE");
        this.status = vo.asString("STATUS");
        return this;
   }
}
