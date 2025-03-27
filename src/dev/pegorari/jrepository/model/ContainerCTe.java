package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ContainerCTe extends AbstractSankhyaEntity<ContainerCTe> {
   public String getIdContainers() {
        return this.getVo().asString("IDCONTAINERS");
   }

   public void setIdContainers(String idContainers) {
        markAsChanged("IDCONTAINERS", idContainers);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
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
        return this;
   }
}
