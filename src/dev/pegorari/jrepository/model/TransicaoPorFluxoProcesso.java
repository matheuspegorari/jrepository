package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TransicaoPorFluxoProcesso extends AbstractSankhyaEntity<TransicaoPorFluxoProcesso> {
   private BigDecimal codProd;
   private BigDecimal codServDest;
   private BigDecimal codServOrig;
   private BigDecimal sequenciaDest;
   private BigDecimal sequenciaOrig;
   private BigDecimal variacao;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodServDest() {
        return codServDest;
   }

   public void setCodServDest(BigDecimal codServDest) {
        markAsChanged("CODSERVDEST", codServDest);
        this.codServDest = codServDest;
   }

   public BigDecimal getCodServOrig() {
        return codServOrig;
   }

   public void setCodServOrig(BigDecimal codServOrig) {
        markAsChanged("CODSERVORIG", codServOrig);
        this.codServOrig = codServOrig;
   }

   public BigDecimal getSequenciaDest() {
        return sequenciaDest;
   }

   public void setSequenciaDest(BigDecimal sequenciaDest) {
        markAsChanged("SEQUENCIADEST", sequenciaDest);
        this.sequenciaDest = sequenciaDest;
   }

   public BigDecimal getSequenciaOrig() {
        return sequenciaOrig;
   }

   public void setSequenciaOrig(BigDecimal sequenciaOrig) {
        markAsChanged("SEQUENCIAORIG", sequenciaOrig);
        this.sequenciaOrig = sequenciaOrig;
   }

   public BigDecimal getVariacao() {
        return variacao;
   }

   public void setVariacao(BigDecimal variacao) {
        markAsChanged("VARIACAO", variacao);
        this.variacao = variacao;
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
        this.setOriginalVO(vo);
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codServDest = vo.asBigDecimal("CODSERVDEST");
        this.codServOrig = vo.asBigDecimal("CODSERVORIG");
        this.sequenciaDest = vo.asBigDecimal("SEQUENCIADEST");
        this.sequenciaOrig = vo.asBigDecimal("SEQUENCIAORIG");
        this.variacao = vo.asBigDecimal("VARIACAO");
        return this;
   }
}
