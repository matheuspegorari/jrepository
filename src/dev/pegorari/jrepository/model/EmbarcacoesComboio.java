package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EmbarcacoesComboio extends AbstractSankhyaEntity<EmbarcacoesComboio> {
   public BigDecimal getCodVeiculo() {
        return this.getVo().asBigDecimal("CODVEICULO");
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
   }

   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
   }

   public BigDecimal getSeqMdfe() {
        return this.getVo().asBigDecimal("SEQMDFE");
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
   }

   @Override
   public String getTableName() {
        return "TGFCOMB";
   }

   @Override
   public String getEntityName() {
        return "EmbarcacoesComboio";
   }

   @Override
   public EmbarcacoesComboio fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
