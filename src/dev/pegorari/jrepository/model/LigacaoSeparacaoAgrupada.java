package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class LigacaoSeparacaoAgrupada extends AbstractSankhyaEntity<LigacaoSeparacaoAgrupada> {
   private BigDecimal nuSepFilha;
   private BigDecimal seqIttFilha;
   private BigDecimal seqIttMae;
   private BigDecimal nuSepMae;
   private BigDecimal qtdFilha;

   public BigDecimal getNuSepFilha() {
        return nuSepFilha;
   }

   public void setNuSepFilha(BigDecimal nuSepFilha) {
        markAsChanged("NUSEPFILHA", nuSepFilha);
        this.nuSepFilha = nuSepFilha;
   }

   public BigDecimal getSeqIttFilha() {
        return seqIttFilha;
   }

   public void setSeqIttFilha(BigDecimal seqIttFilha) {
        markAsChanged("SEQITTFILHA", seqIttFilha);
        this.seqIttFilha = seqIttFilha;
   }

   public BigDecimal getSeqIttMae() {
        return seqIttMae;
   }

   public void setSeqIttMae(BigDecimal seqIttMae) {
        markAsChanged("SEQITTMAE", seqIttMae);
        this.seqIttMae = seqIttMae;
   }

   public BigDecimal getNuSepMae() {
        return nuSepMae;
   }

   public void setNuSepMae(BigDecimal nuSepMae) {
        markAsChanged("NUSEPMAE", nuSepMae);
        this.nuSepMae = nuSepMae;
   }

   public BigDecimal getQtdFilha() {
        return qtdFilha;
   }

   public void setQtdFilha(BigDecimal qtdFilha) {
        markAsChanged("QTDFILHA", qtdFilha);
        this.qtdFilha = qtdFilha;
   }

   @Override
   public String getTableName() {
        return "TGWSVAR";
   }

   @Override
   public String getEntityName() {
        return "LigacaoSeparacaoAgrupada";
   }

   @Override
   public LigacaoSeparacaoAgrupada fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.nuSepFilha = vo.asBigDecimal("NUSEPFILHA");
        this.seqIttFilha = vo.asBigDecimal("SEQITTFILHA");
        this.seqIttMae = vo.asBigDecimal("SEQITTMAE");
        this.nuSepMae = vo.asBigDecimal("NUSEPMAE");
        this.qtdFilha = vo.asBigDecimal("QTDFILHA");
        return this;
   }
}
