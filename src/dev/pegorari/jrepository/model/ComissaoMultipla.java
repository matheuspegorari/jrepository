package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ComissaoMultipla extends AbstractSankhyaEntity<ComissaoMultipla> {
   private BigDecimal codVend;
   private BigDecimal nuNota;
   private String obs;
   private BigDecimal percCom;

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
        this.codVend = codVend;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public String getObs() {
        return obs;
   }

   public void setObs(String obs) {
        markAsChanged("OBS", obs);
        this.obs = obs;
   }

   public BigDecimal getPercCom() {
        return percCom;
   }

   public void setPercCom(BigDecimal percCom) {
        markAsChanged("PERCCOM", percCom);
        this.percCom = percCom;
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
        this.codVend = vo.asBigDecimal("CODVEND");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.obs = vo.asString("OBS");
        this.percCom = vo.asBigDecimal("PERCCOM");
        return this;
   }
}
