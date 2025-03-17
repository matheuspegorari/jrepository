package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class UsuarioLiberadorMeta implements SankhyaEntity<UsuarioLiberadorMeta> {

   private BigDecimal codMeta;
   private BigDecimal codUsu;

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        this.codMeta = codMeta;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   @Override
   public String getEntityName() {
        return "UsuarioLiberadorMeta";
   }

   @Override
   public UsuarioLiberadorMeta fromVO(DynamicVO vo) {
        this.codMeta = vo.asBigDecimal("CODMETA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        return this;
   }
}
