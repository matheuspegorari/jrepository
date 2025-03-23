package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;

public class MSDProximaResolucaoMensagens extends AbstractSankhyaEntity<MSDProximaResolucaoMensagens> {
   private Timestamp proxResol;

   public Timestamp getProxResol() {
        return proxResol;
   }

   public void setProxResol(Timestamp proxResol) {
        markAsChanged("PROXRESOL", proxResol);
        this.proxResol = proxResol;
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
        this.proxResol = vo.asTimestamp("PROXRESOL");
        return this;
   }
}
