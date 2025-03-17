package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EmbarcacoesComboio extends AbstractSankhyaEntity<EmbarcacoesComboio> {
   private BigDecimal codVeiculo;
   private BigDecimal nuViag;
   private BigDecimal seqMdfe;

   public BigDecimal getCodVeiculo() {
        return codVeiculo;
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        this.codVeiculo = codVeiculo;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        this.nuViag = nuViag;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        this.seqMdfe = seqMdfe;
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
        this.codVeiculo = vo.asBigDecimal("CODVEICULO");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        return this;
   }
}
