package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PedidoProjeto extends AbstractSankhyaEntity<PedidoProjeto> {
   private String ativo;
   private BigDecimal nuFap;
   private BigDecimal nuNota;
   private BigDecimal qtdHoras;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getNuFap() {
        return nuFap;
   }

   public void setNuFap(BigDecimal nuFap) {
        this.nuFap = nuFap;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getQtdHoras() {
        return qtdHoras;
   }

   public void setQtdHoras(BigDecimal qtdHoras) {
        this.qtdHoras = qtdHoras;
   }

   @Override
   public String getTableName() {
        return "TCSFPD";
   }

   @Override
   public String getEntityName() {
        return "PedidoProjeto";
   }

   @Override
   public PedidoProjeto fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.nuFap = vo.asBigDecimal("NUFAP");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.qtdHoras = vo.asBigDecimal("QTDHORAS");
        return this;
   }
}
