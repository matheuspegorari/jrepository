package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;

public class MSDProximaResolucao extends AbstractSankhyaEntity<MSDProximaResolucao> {
   private Timestamp proxResol;

   public Timestamp getProxResol() {
        return proxResol;
   }

   public void setProxResol(Timestamp proxResol) {
        this.proxResol = proxResol;
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
        this.proxResol = vo.asTimestamp("PROXRESOL");
        return this;
   }
}
