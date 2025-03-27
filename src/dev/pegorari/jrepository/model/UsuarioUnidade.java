package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UsuarioUnidade extends AbstractSankhyaEntity<UsuarioUnidade> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   @Override
   public String getTableName() {
        return "TGWUXU";
   }

   @Override
   public String getEntityName() {
        return "UsuarioUnidade";
   }

   @Override
   public UsuarioUnidade fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
