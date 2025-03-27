package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TransicaoPorFluxoProcesso extends AbstractSankhyaEntity<TransicaoPorFluxoProcesso> {
   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodServDest() {
        return this.getVo().asBigDecimal("CODSERVDEST");
   }

   public void setCodServDest(BigDecimal codServDest) {
        markAsChanged("CODSERVDEST", codServDest);
   }

   public BigDecimal getCodServOrig() {
        return this.getVo().asBigDecimal("CODSERVORIG");
   }

   public void setCodServOrig(BigDecimal codServOrig) {
        markAsChanged("CODSERVORIG", codServOrig);
   }

   public BigDecimal getSequenciaDest() {
        return this.getVo().asBigDecimal("SEQUENCIADEST");
   }

   public void setSequenciaDest(BigDecimal sequenciaDest) {
        markAsChanged("SEQUENCIADEST", sequenciaDest);
   }

   public BigDecimal getSequenciaOrig() {
        return this.getVo().asBigDecimal("SEQUENCIAORIG");
   }

   public void setSequenciaOrig(BigDecimal sequenciaOrig) {
        markAsChanged("SEQUENCIAORIG", sequenciaOrig);
   }

   public BigDecimal getVariacao() {
        return this.getVo().asBigDecimal("VARIACAO");
   }

   public void setVariacao(BigDecimal variacao) {
        markAsChanged("VARIACAO", variacao);
   }

   @Override
   public String getTableName() {
        return "TCSTFL";
   }

   @Override
   public String getEntityName() {
        return "TransicaoPorFluxoProcesso";
   }

   @Override
   public TransicaoPorFluxoProcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
