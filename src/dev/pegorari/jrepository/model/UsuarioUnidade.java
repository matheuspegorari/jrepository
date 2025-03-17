package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class UsuarioUnidade implements SankhyaEntity<UsuarioUnidade> {

   private BigDecimal codUsu;
   private String codVol;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   @Override
   public String getEntityName() {
        return "UsuarioUnidade";
   }

   @Override
   public UsuarioUnidade fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVol = vo.asString("CODVOL");
        return this;
   }
}
