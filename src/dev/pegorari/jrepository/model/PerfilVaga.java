package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PerfilVaga extends AbstractSankhyaEntity<PerfilVaga> {
   private BigDecimal codPerfil;
   private BigDecimal codAnuncio;

   public BigDecimal getCodPerfil() {
        return codPerfil;
   }

   public void setCodPerfil(BigDecimal codPerfil) {
        markAsChanged("CODPERFIL", codPerfil);
        this.codPerfil = codPerfil;
   }

   public BigDecimal getCodAnuncio() {
        return codAnuncio;
   }

   public void setCodAnuncio(BigDecimal codAnuncio) {
        markAsChanged("CODANUNCIO", codAnuncio);
        this.codAnuncio = codAnuncio;
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
        this.setOriginalVO(vo);
        this.codPerfil = vo.asBigDecimal("CODPERFIL");
        this.codAnuncio = vo.asBigDecimal("CODANUNCIO");
        return this;
   }
}
