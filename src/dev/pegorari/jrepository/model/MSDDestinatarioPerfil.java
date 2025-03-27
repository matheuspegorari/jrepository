package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MSDDestinatarioPerfil extends AbstractSankhyaEntity<MSDDestinatarioPerfil> {
   public BigDecimal getCodCon() {
        return this.getVo().asBigDecimal("CODCON");
   }

   public void setCodCon(BigDecimal codCon) {
        markAsChanged("CODCON", codCon);
   }

   public BigDecimal getCodPer() {
        return this.getVo().asBigDecimal("CODPER");
   }

   public void setCodPer(BigDecimal codPer) {
        markAsChanged("CODPER", codPer);
   }

   @Override
   public String getTableName() {
        return "TMDCPE";
   }

   @Override
   public String getEntityName() {
        return "MSDDestinatarioPerfil";
   }

   @Override
   public MSDDestinatarioPerfil fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
