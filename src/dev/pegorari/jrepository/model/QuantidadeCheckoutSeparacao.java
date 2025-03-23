package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class QuantidadeCheckoutSeparacao extends AbstractSankhyaEntity<QuantidadeCheckoutSeparacao> {
   private BigDecimal sequencia;
   private BigDecimal nuSeparacao;
   private BigDecimal qtdCheckouts;
   private BigDecimal nuSepMae;
   private BigDecimal nuNota;

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getNuSeparacao() {
        return nuSeparacao;
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        markAsChanged("NUSEPARACAO", nuSeparacao);
        this.nuSeparacao = nuSeparacao;
   }

   public BigDecimal getQtdCheckouts() {
        return qtdCheckouts;
   }

   public void setQtdCheckouts(BigDecimal qtdCheckouts) {
        markAsChanged("QTDCHECKOUTS", qtdCheckouts);
        this.qtdCheckouts = qtdCheckouts;
   }

   public BigDecimal getNuSepMae() {
        return nuSepMae;
   }

   public void setNuSepMae(BigDecimal nuSepMae) {
        markAsChanged("NUSEPMAE", nuSepMae);
        this.nuSepMae = nuSepMae;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
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
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.nuSeparacao = vo.asBigDecimal("NUSEPARACAO");
        this.qtdCheckouts = vo.asBigDecimal("QTDCHECKOUTS");
        this.nuSepMae = vo.asBigDecimal("NUSEPMAE");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        return this;
   }
}
