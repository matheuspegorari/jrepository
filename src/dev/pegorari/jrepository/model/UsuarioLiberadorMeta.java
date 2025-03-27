package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UsuarioLiberadorMeta extends AbstractSankhyaEntity<UsuarioLiberadorMeta> {
   public BigDecimal getCodMeta() {
        return this.getVo().asBigDecimal("CODMETA");
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
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
        this.setVo(vo);
        return this;
   }
}
