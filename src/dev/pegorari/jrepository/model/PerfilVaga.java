package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PerfilVaga extends AbstractSankhyaEntity<PerfilVaga> {
   public BigDecimal getCodPerfil() {
        return this.getVo().asBigDecimal("CODPERFIL");
   }

   public void setCodPerfil(BigDecimal codPerfil) {
        markAsChanged("CODPERFIL", codPerfil);
   }

   public BigDecimal getCodAnuncio() {
        return this.getVo().asBigDecimal("CODANUNCIO");
   }

   public void setCodAnuncio(BigDecimal codAnuncio) {
        markAsChanged("CODANUNCIO", codAnuncio);
   }

   @Override
   public String getTableName() {
        return "TRSPFV";
   }

   @Override
   public String getEntityName() {
        return "PerfilVaga";
   }

   @Override
   public PerfilVaga fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
