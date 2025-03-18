package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TipoTarefa extends AbstractSankhyaEntity<TipoTarefa> {
   private BigDecimal codTarefa;
   private String descTarefa;

   public BigDecimal getCodTarefa() {
        return codTarefa;
   }

   public void setCodTarefa(BigDecimal codTarefa) {
        markAsChanged("CODTAREFA", codTarefa);
        this.codTarefa = codTarefa;
   }

   public String getDescTarefa() {
        return descTarefa;
   }

   public void setDescTarefa(String descTarefa) {
        markAsChanged("DESCRTAREFA", descTarefa);
        this.descTarefa = descTarefa;
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
        this.setOriginalVO(vo);
        this.codTarefa = vo.asBigDecimal("CODTAREFA");
        this.descTarefa = vo.asString("DESCRTAREFA");
        return this;
   }
}
