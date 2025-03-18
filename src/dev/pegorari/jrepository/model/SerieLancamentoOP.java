package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SerieLancamentoOP extends AbstractSankhyaEntity<SerieLancamentoOP> {
   private BigDecimal codProdPa;
   private BigDecimal nuLop;
   private BigDecimal seqOp;
   private String seriePa;

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public BigDecimal getNuLop() {
        return nuLop;
   }

   public void setNuLop(BigDecimal nuLop) {
        markAsChanged("NULOP", nuLop);
        this.nuLop = nuLop;
   }

   public BigDecimal getSeqOp() {
        return seqOp;
   }

   public void setSeqOp(BigDecimal seqOp) {
        markAsChanged("SEQOP", seqOp);
        this.seqOp = seqOp;
   }

   public String getSeriePa() {
        return seriePa;
   }

   public void setSeriePa(String seriePa) {
        markAsChanged("SERIEPA", seriePa);
        this.seriePa = seriePa;
   }

   @Override
   public String getTableName() {
        return "TPRSERLOP";
   }

   @Override
   public String getEntityName() {
        return "SerieLancamentoOP";
   }

   @Override
   public SerieLancamentoOP fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.nuLop = vo.asBigDecimal("NULOP");
        this.seqOp = vo.asBigDecimal("SEQOP");
        this.seriePa = vo.asString("SERIEPA");
        return this;
   }
}
