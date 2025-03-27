package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ConferenciaCodBarComposto extends AbstractSankhyaEntity<ConferenciaCodBarComposto> {
   public String getCodBarComp() {
        return this.getVo().asString("CODBARCOMP");
   }

   public void setCodBarComp(String codBarComp) {
        markAsChanged("CODBARCOMP", codBarComp);
   }

   public BigDecimal getNuConf() {
        return this.getVo().asBigDecimal("NUCONF");
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getSeqConf() {
        return this.getVo().asBigDecimal("SEQCONF");
   }

   public void setSeqConf(BigDecimal seqConf) {
        markAsChanged("SEQCONF", seqConf);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getSeqConf2() {
        return this.getVo().asBigDecimal("SEQCONF2");
   }

   public void setSeqConf2(BigDecimal seqConf2) {
        markAsChanged("SEQCONF2", seqConf2);
   }

   public BigDecimal getNuConf2() {
        return this.getVo().asBigDecimal("NUCONF2");
   }

   public void setNuConf2(BigDecimal nuConf2) {
        markAsChanged("NUCONF2", nuConf2);
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
        return this;
   }
}
