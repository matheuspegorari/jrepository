package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;

public class MSDProximaResolucaoMensagens implements SankhyaEntity<MSDProximaResolucaoMensagens> {

   private Timestamp proxResol;

   public Timestamp getProxResol() {
        return proxResol;
   }

   public void setProxResol(Timestamp proxResol) {
        this.proxResol = proxResol;
   }

   @Override
   public String getEntityName() {
        return "MSDProximaResolucaoMensagens";
   }

   @Override
   public MSDProximaResolucaoMensagens fromVO(DynamicVO vo) {
        this.proxResol = vo.asTimestamp("PROXRESOL");
        return this;
   }
}
