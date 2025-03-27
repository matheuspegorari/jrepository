package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MotoristaCTe extends AbstractSankhyaEntity<MotoristaCTe> {
   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getSeqMot() {
        return this.getVo().asBigDecimal("SEQMOT");
   }

   public void setSeqMot(BigDecimal seqMot) {
        markAsChanged("SEQMOT", seqMot);
   }

   @Override
   public String getTableName() {
        return "TGFMOT";
   }

   @Override
   public String getEntityName() {
        return "MotoristaCTe";
   }

   @Override
   public MotoristaCTe fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
