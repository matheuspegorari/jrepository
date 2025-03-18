package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UsuarioLiberadorMeta extends AbstractSankhyaEntity<UsuarioLiberadorMeta> {
   private BigDecimal codMeta;
   private BigDecimal codUsu;

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
        this.codMeta = codMeta;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   @Override
   public String getTableName() {
        return "TGMUSLB";
   }

   @Override
   public String getEntityName() {
        return "UsuarioLiberadorMeta";
   }

   @Override
   public UsuarioLiberadorMeta fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codMeta = vo.asBigDecimal("CODMETA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        return this;
   }
}
