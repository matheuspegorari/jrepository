package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ContainerCTe extends AbstractSankhyaEntity<ContainerCTe> {
   private String idContainers;
   private BigDecimal nuNota;

   public String getIdContainers() {
        return idContainers;
   }

   public void setIdContainers(String idContainers) {
        markAsChanged("IDCONTAINERS", idContainers);
        this.idContainers = idContainers;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   @Override
   public String getTableName() {
        return "TGFCONT";
   }

   @Override
   public String getEntityName() {
        return "ContainerCTe";
   }

   @Override
   public ContainerCTe fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.idContainers = vo.asString("IDCONTAINERS");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        return this;
   }
}
