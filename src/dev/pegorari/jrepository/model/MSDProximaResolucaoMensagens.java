package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;

public class MSDProximaResolucaoMensagens extends AbstractSankhyaEntity<MSDProximaResolucaoMensagens> {
   public Timestamp getProxResol() {
        return this.getVo().asTimestamp("PROXRESOL");
   }

   public void setProxResol(Timestamp proxResol) {
        markAsChanged("PROXRESOL", proxResol);
   }

   @Override
   public String getTableName() {
        return "TMDPRM";
   }

   @Override
   public String getEntityName() {
        return "MSDProximaResolucaoMensagens";
   }

   @Override
   public MSDProximaResolucaoMensagens fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
