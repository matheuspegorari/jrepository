package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class QuantidadeCheckoutSeparacao extends AbstractSankhyaEntity<QuantidadeCheckoutSeparacao> {
   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getNuSeparacao() {
        return this.getVo().asBigDecimal("NUSEPARACAO");
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        markAsChanged("NUSEPARACAO", nuSeparacao);
   }

   public BigDecimal getQtdCheckouts() {
        return this.getVo().asBigDecimal("QTDCHECKOUTS");
   }

   public void setQtdCheckouts(BigDecimal qtdCheckouts) {
        markAsChanged("QTDCHECKOUTS", qtdCheckouts);
   }

   public BigDecimal getNuSepMae() {
        return this.getVo().asBigDecimal("NUSEPMAE");
   }

   public void setNuSepMae(BigDecimal nuSepMae) {
        markAsChanged("NUSEPMAE", nuSepMae);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   @Override
   public String getTableName() {
        return "TGWQCS";
   }

   @Override
   public String getEntityName() {
        return "QuantidadeCheckoutSeparacao";
   }

   @Override
   public QuantidadeCheckoutSeparacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
