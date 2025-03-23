package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConferenciaCodBarComposto extends AbstractSankhyaEntity<ConferenciaCodBarComposto> {
   private String codBarComp;
   private BigDecimal nuConf;
   private BigDecimal nuNota;
   private BigDecimal seqConf;
   private BigDecimal sequencia;
   private BigDecimal seqConf2;
   private BigDecimal nuConf2;

   public String getCodBarComp() {
        return codBarComp;
   }

   public void setCodBarComp(String codBarComp) {
        markAsChanged("CODBARCOMP", codBarComp);
        this.codBarComp = codBarComp;
   }

   public BigDecimal getNuConf() {
        return nuConf;
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
        this.nuConf = nuConf;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getSeqConf() {
        return seqConf;
   }

   public void setSeqConf(BigDecimal seqConf) {
        markAsChanged("SEQCONF", seqConf);
        this.seqConf = seqConf;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getSeqConf2() {
        return seqConf2;
   }

   public void setSeqConf2(BigDecimal seqConf2) {
        markAsChanged("SEQCONF2", seqConf2);
        this.seqConf2 = seqConf2;
   }

   public BigDecimal getNuConf2() {
        return nuConf2;
   }

   public void setNuConf2(BigDecimal nuConf2) {
        markAsChanged("NUCONF2", nuConf2);
        this.nuConf2 = nuConf2;
   }

   @Override
   public String getTableName() {
        return "TGFCBC";
   }

   @Override
   public String getEntityName() {
        return "ConferenciaCodBarComposto";
   }

   @Override
   public ConferenciaCodBarComposto fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codBarComp = vo.asString("CODBARCOMP");
        this.nuConf = vo.asBigDecimal("NUCONF");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.seqConf = vo.asBigDecimal("SEQCONF");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.seqConf2 = vo.asBigDecimal("SEQCONF2");
        this.nuConf2 = vo.asBigDecimal("NUCONF2");
        return this;
   }
}
