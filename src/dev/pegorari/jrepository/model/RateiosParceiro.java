package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RateiosParceiro extends AbstractSankhyaEntity<RateiosParceiro> {
   private BigDecimal nuFin;
   private BigDecimal nuRateio;
   private BigDecimal recDesp;
   private String tipo;

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        this.nuFin = nuFin;
   }

   public BigDecimal getNuRateio() {
        return nuRateio;
   }

   public void setNuRateio(BigDecimal nuRateio) {
        this.nuRateio = nuRateio;
   }

   public BigDecimal getRecDesp() {
        return recDesp;
   }

   public void setRecDesp(BigDecimal recDesp) {
        this.recDesp = recDesp;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
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
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.nuRateio = vo.asBigDecimal("NURATEIO");
        this.recDesp = vo.asBigDecimal("RECDESP");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
