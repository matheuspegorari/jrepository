package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ComissaoMultipla extends AbstractSankhyaEntity<ComissaoMultipla> {
   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getObs() {
        return this.getVo().asString("OBS");
   }

   public void setObs(String obs) {
        markAsChanged("OBS", obs);
   }

   public BigDecimal getPercCom() {
        return this.getVo().asBigDecimal("PERCCOM");
   }

   public void setPercCom(BigDecimal percCom) {
        markAsChanged("PERCCOM", percCom);
   }

   @Override
   public String getTableName() {
        return "TGFCCM";
   }

   @Override
   public String getEntityName() {
        return "ComissaoMultipla";
   }

   @Override
   public ComissaoMultipla fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
