package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class LigacaoSeparacaoAgrupada implements SankhyaEntity<LigacaoSeparacaoAgrupada> {

   private BigDecimal nuSepFilha;
   private BigDecimal seqIttFilha;
   private BigDecimal seqIttMae;
   private BigDecimal nuSepMae;
   private BigDecimal qtdFilha;

   public BigDecimal getNuSepFilha() {
        return nuSepFilha;
   }

   public void setNuSepFilha(BigDecimal nuSepFilha) {
        this.nuSepFilha = nuSepFilha;
   }

   public BigDecimal getSeqIttFilha() {
        return seqIttFilha;
   }

   public void setSeqIttFilha(BigDecimal seqIttFilha) {
        this.seqIttFilha = seqIttFilha;
   }

   public BigDecimal getSeqIttMae() {
        return seqIttMae;
   }

   public void setSeqIttMae(BigDecimal seqIttMae) {
        this.seqIttMae = seqIttMae;
   }

   public BigDecimal getNuSepMae() {
        return nuSepMae;
   }

   public void setNuSepMae(BigDecimal nuSepMae) {
        this.nuSepMae = nuSepMae;
   }

   public BigDecimal getQtdFilha() {
        return qtdFilha;
   }

   public void setQtdFilha(BigDecimal qtdFilha) {
        this.qtdFilha = qtdFilha;
   }

   @Override
   public String getEntityName() {
        return "LigacaoSeparacaoAgrupada";
   }

   @Override
   public LigacaoSeparacaoAgrupada fromVO(DynamicVO vo) {
        this.nuSepFilha = vo.asBigDecimal("NUSEPFILHA");
        this.seqIttFilha = vo.asBigDecimal("SEQITTFILHA");
        this.seqIttMae = vo.asBigDecimal("SEQITTMAE");
        this.nuSepMae = vo.asBigDecimal("NUSEPMAE");
        this.qtdFilha = vo.asBigDecimal("QTDFILHA");
        return this;
   }
}
