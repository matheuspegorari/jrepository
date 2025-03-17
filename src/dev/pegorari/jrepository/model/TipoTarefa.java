package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class TipoTarefa implements SankhyaEntity<TipoTarefa> {

   private BigDecimal codTarefa;
   private String descrTarefa;

   public BigDecimal getCodTarefa() {
        return codTarefa;
   }

   public void setCodTarefa(BigDecimal codTarefa) {
        this.codTarefa = codTarefa;
   }

   public String getDescrTarefa() {
        return descrTarefa;
   }

   public void setDescrTarefa(String descrTarefa) {
        this.descrTarefa = descrTarefa;
   }

   @Override
   public String getEntityName() {
        return "TipoTarefa";
   }

   @Override
   public TipoTarefa fromVO(DynamicVO vo) {
        this.codTarefa = vo.asBigDecimal("CODTAREFA");
        this.descrTarefa = vo.asString("DESCRTAREFA");
        return this;
   }
}
