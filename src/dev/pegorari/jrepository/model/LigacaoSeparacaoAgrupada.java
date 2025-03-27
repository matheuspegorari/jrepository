package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class LigacaoSeparacaoAgrupada extends AbstractSankhyaEntity<LigacaoSeparacaoAgrupada> {
   public BigDecimal getNuSepFilha() {
        return this.getVo().asBigDecimal("NUSEPFILHA");
   }

   public void setNuSepFilha(BigDecimal nuSepFilha) {
        markAsChanged("NUSEPFILHA", nuSepFilha);
   }

   public BigDecimal getSeqIttFilha() {
        return this.getVo().asBigDecimal("SEQITTFILHA");
   }

   public void setSeqIttFilha(BigDecimal seqIttFilha) {
        markAsChanged("SEQITTFILHA", seqIttFilha);
   }

   public BigDecimal getSeqIttMae() {
        return this.getVo().asBigDecimal("SEQITTMAE");
   }

   public void setSeqIttMae(BigDecimal seqIttMae) {
        markAsChanged("SEQITTMAE", seqIttMae);
   }

   public BigDecimal getNuSepMae() {
        return this.getVo().asBigDecimal("NUSEPMAE");
   }

   public void setNuSepMae(BigDecimal nuSepMae) {
        markAsChanged("NUSEPMAE", nuSepMae);
   }

   public BigDecimal getQtdFilha() {
        return this.getVo().asBigDecimal("QTDFILHA");
   }

   public void setQtdFilha(BigDecimal qtdFilha) {
        markAsChanged("QTDFILHA", qtdFilha);
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
        return this;
   }
}
