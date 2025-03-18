package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MSDDestinatarioPerfil extends AbstractSankhyaEntity<MSDDestinatarioPerfil> {
   private BigDecimal codCon;
   private BigDecimal codPer;

   public BigDecimal getCodCon() {
        return codCon;
   }

   public void setCodCon(BigDecimal codCon) {
        markAsChanged("CODCON", codCon);
        this.codCon = codCon;
   }

   public BigDecimal getCodPer() {
        return codPer;
   }

   public void setCodPer(BigDecimal codPer) {
        markAsChanged("CODPER", codPer);
        this.codPer = codPer;
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
        this.setOriginalVO(vo);
        this.codCon = vo.asBigDecimal("CODCON");
        this.codPer = vo.asBigDecimal("CODPER");
        return this;
   }
}
