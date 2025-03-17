package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class PerfilVaga implements SankhyaEntity<PerfilVaga> {

   private BigDecimal codPerfil;
   private BigDecimal codAnuncio;

   public BigDecimal getCodPerfil() {
        return codPerfil;
   }

   public void setCodPerfil(BigDecimal codPerfil) {
        this.codPerfil = codPerfil;
   }

   public BigDecimal getCodAnuncio() {
        return codAnuncio;
   }

   public void setCodAnuncio(BigDecimal codAnuncio) {
        this.codAnuncio = codAnuncio;
   }

   @Override
   public String getEntityName() {
        return "PerfilVaga";
   }

   @Override
   public PerfilVaga fromVO(DynamicVO vo) {
        this.codPerfil = vo.asBigDecimal("CODPERFIL");
        this.codAnuncio = vo.asBigDecimal("CODANUNCIO");
        return this;
   }
}
