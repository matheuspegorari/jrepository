package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SerieLancamentoOP extends AbstractSankhyaEntity<SerieLancamentoOP> {
   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public BigDecimal getNuLop() {
        return this.getVo().asBigDecimal("NULOP");
   }

   public void setNuLop(BigDecimal nuLop) {
        markAsChanged("NULOP", nuLop);
   }

   public BigDecimal getSeqOp() {
        return this.getVo().asBigDecimal("SEQOP");
   }

   public void setSeqOp(BigDecimal seqOp) {
        markAsChanged("SEQOP", seqOp);
   }

   public String getSeriePa() {
        return this.getVo().asString("SERIEPA");
   }

   public void setSeriePa(String seriePa) {
        markAsChanged("SERIEPA", seriePa);
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
        this.setVo(vo);
        return this;
   }
}
