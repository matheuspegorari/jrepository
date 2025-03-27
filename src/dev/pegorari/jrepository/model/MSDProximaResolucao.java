package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;

public class MSDProximaResolucao extends AbstractSankhyaEntity<MSDProximaResolucao> {
   public Timestamp getProxResol() {
        return this.getVo().asTimestamp("PROXRESOL");
   }

   public void setProxResol(Timestamp proxResol) {
        markAsChanged("PROXRESOL", proxResol);
   }

   @Override
   public String getTableName() {
        return "TMDPRS";
   }

   @Override
   public String getEntityName() {
        return "MSDProximaResolucao";
   }

   @Override
   public MSDProximaResolucao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
