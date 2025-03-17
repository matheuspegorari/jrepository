package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ContainerCTe implements SankhyaEntity<ContainerCTe> {

   private String idContainers;
   private BigDecimal nuNota;

   public String getIdContainers() {
        return idContainers;
   }

   public void setIdContainers(String idContainers) {
        this.idContainers = idContainers;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   @Override
   public String getEntityName() {
        return "ContainerCTe";
   }

   @Override
   public ContainerCTe fromVO(DynamicVO vo) {
        this.idContainers = vo.asString("IDCONTAINERS");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        return this;
   }
}
