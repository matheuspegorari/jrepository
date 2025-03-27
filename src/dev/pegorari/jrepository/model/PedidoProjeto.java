package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PedidoProjeto extends AbstractSankhyaEntity<PedidoProjeto> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getNuFap() {
        return this.getVo().asBigDecimal("NUFAP");
   }

   public void setNuFap(BigDecimal nuFap) {
        markAsChanged("NUFAP", nuFap);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getQtdHoras() {
        return this.getVo().asBigDecimal("QTDHORAS");
   }

   public void setQtdHoras(BigDecimal qtdHoras) {
        markAsChanged("QTDHORAS", qtdHoras);
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
        this.setVo(vo);
        return this;
   }
}
