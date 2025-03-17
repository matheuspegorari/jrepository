package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class MSDDestinatarioPerfil implements SankhyaEntity<MSDDestinatarioPerfil> {

   private BigDecimal codCon;
   private BigDecimal codPer;

   public BigDecimal getCodCon() {
        return codCon;
   }

   public void setCodCon(BigDecimal codCon) {
        this.codCon = codCon;
   }

   public BigDecimal getCodPer() {
        return codPer;
   }

   public void setCodPer(BigDecimal codPer) {
        this.codPer = codPer;
   }

   @Override
   public String getEntityName() {
        return "MSDDestinatarioPerfil";
   }

   @Override
   public MSDDestinatarioPerfil fromVO(DynamicVO vo) {
        this.codCon = vo.asBigDecimal("CODCON");
        this.codPer = vo.asBigDecimal("CODPER");
        return this;
   }
}
