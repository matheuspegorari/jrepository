package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RateiosParceiro extends AbstractSankhyaEntity<RateiosParceiro> {
   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
   }

   public BigDecimal getNuRateio() {
        return this.getVo().asBigDecimal("NURATEIO");
   }

   public void setNuRateio(BigDecimal nuRateio) {
        markAsChanged("NURATEIO", nuRateio);
   }

   public BigDecimal getRecDesp() {
        return this.getVo().asBigDecimal("RECDESP");
   }

   public void setRecDesp(BigDecimal recDesp) {
        markAsChanged("RECDESP", recDesp);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TGFRAP";
   }

   @Override
   public String getEntityName() {
        return "RateiosParceiro";
   }

   @Override
   public RateiosParceiro fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
