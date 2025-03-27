package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EtapaPredecessora extends AbstractSankhyaEntity<EtapaPredecessora> {
   public BigDecimal getNuFap() {
        return this.getVo().asBigDecimal("NUFAP");
   }

   public void setNuFap(BigDecimal nuFap) {
        markAsChanged("NUFAP", nuFap);
   }

   public BigDecimal getNuMetapa() {
        return this.getVo().asBigDecimal("NUMETAPA");
   }

   public void setNuMetapa(BigDecimal nuMetapa) {
        markAsChanged("NUMETAPA", nuMetapa);
   }

   public BigDecimal getNuMetapaPred() {
        return this.getVo().asBigDecimal("NUMETAPAPRED");
   }

   public void setNuMetapaPred(BigDecimal nuMetapaPred) {
        markAsChanged("NUMETAPAPRED", nuMetapaPred);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
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
        this.setVo(vo);
        return this;
   }
}
