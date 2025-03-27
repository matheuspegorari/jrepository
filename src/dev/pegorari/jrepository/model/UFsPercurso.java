package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UFsPercurso extends AbstractSankhyaEntity<UFsPercurso> {
   public BigDecimal getSeqMdfe() {
        return this.getVo().asBigDecimal("SEQMDFE");
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
   }

   public BigDecimal getCodUf() {
        return this.getVo().asBigDecimal("CODUF");
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
   }

   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public BigDecimal getSeqViagem() {
        return this.getVo().asBigDecimal("SEQVIAGEM");
   }

   public void setSeqViagem(BigDecimal seqViagem) {
        markAsChanged("SEQVIAGEM", seqViagem);
   }

   @Override
   public String getTableName() {
        return "TGFUFP";
   }

   @Override
   public String getEntityName() {
        return "UFsPercurso";
   }

   @Override
   public UFsPercurso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
