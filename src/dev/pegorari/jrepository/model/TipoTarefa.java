package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TipoTarefa extends AbstractSankhyaEntity<TipoTarefa> {
   public BigDecimal getCodTarefa() {
        return this.getVo().asBigDecimal("CODTAREFA");
   }

   public void setCodTarefa(BigDecimal codTarefa) {
        markAsChanged("CODTAREFA", codTarefa);
   }

   public String getDescTarefa() {
        return this.getVo().asString("DESCRTAREFA");
   }

   public void setDescTarefa(String descTarefa) {
        markAsChanged("DESCRTAREFA", descTarefa);
   }

   @Override
   public String getTableName() {
        return "TGWTTR";
   }

   @Override
   public String getEntityName() {
        return "TipoTarefa";
   }

   @Override
   public TipoTarefa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
