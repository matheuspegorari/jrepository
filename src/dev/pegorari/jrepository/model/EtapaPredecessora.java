package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EtapaPredecessora extends AbstractSankhyaEntity<EtapaPredecessora> {
   private BigDecimal nuFap;
   private BigDecimal nuMetapa;
   private BigDecimal nuMetapaPred;
   private String tipo;

   public BigDecimal getNuFap() {
        return nuFap;
   }

   public void setNuFap(BigDecimal nuFap) {
        this.nuFap = nuFap;
   }

   public BigDecimal getNuMetapa() {
        return nuMetapa;
   }

   public void setNuMetapa(BigDecimal nuMetapa) {
        this.nuMetapa = nuMetapa;
   }

   public BigDecimal getNuMetapaPred() {
        return nuMetapaPred;
   }

   public void setNuMetapaPred(BigDecimal nuMetapaPred) {
        this.nuMetapaPred = nuMetapaPred;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getTableName() {
        return "TCSEPD";
   }

   @Override
   public String getEntityName() {
        return "EtapaPredecessora";
   }

   @Override
   public EtapaPredecessora fromVO(DynamicVO vo) {
        this.nuFap = vo.asBigDecimal("NUFAP");
        this.nuMetapa = vo.asBigDecimal("NUMETAPA");
        this.nuMetapaPred = vo.asBigDecimal("NUMETAPAPRED");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
