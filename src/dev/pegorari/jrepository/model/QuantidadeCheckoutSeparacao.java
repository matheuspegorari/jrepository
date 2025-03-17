package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class QuantidadeCheckoutSeparacao implements SankhyaEntity<QuantidadeCheckoutSeparacao> {

   private BigDecimal sequencia;
   private BigDecimal nuSeparacao;
   private BigDecimal qtdCheckouts;
   private BigDecimal nuSepMae;
   private BigDecimal nuNota;

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getNuSeparacao() {
        return nuSeparacao;
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        this.nuSeparacao = nuSeparacao;
   }

   public BigDecimal getQtdCheckouts() {
        return qtdCheckouts;
   }

   public void setQtdCheckouts(BigDecimal qtdCheckouts) {
        this.qtdCheckouts = qtdCheckouts;
   }

   public BigDecimal getNuSepMae() {
        return nuSepMae;
   }

   public void setNuSepMae(BigDecimal nuSepMae) {
        this.nuSepMae = nuSepMae;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   @Override
   public String getEntityName() {
        return "QuantidadeCheckoutSeparacao";
   }

   @Override
   public QuantidadeCheckoutSeparacao fromVO(DynamicVO vo) {
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.nuSeparacao = vo.asBigDecimal("NUSEPARACAO");
        this.qtdCheckouts = vo.asBigDecimal("QTDCHECKOUTS");
        this.nuSepMae = vo.asBigDecimal("NUSEPMAE");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        return this;
   }
}
