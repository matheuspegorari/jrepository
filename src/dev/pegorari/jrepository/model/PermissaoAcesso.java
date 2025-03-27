package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PermissaoAcesso extends AbstractSankhyaEntity<PermissaoAcesso> {
   public BigDecimal getCodGrupo() {
        return this.getVo().asBigDecimal("CODGRUPO");
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getPermissao() {
        return this.getVo().asString("PERMISSAO");
   }

   public void setPermissao(String permissao) {
        markAsChanged("PERMISSAO", permissao);
   }

   public BigDecimal getTipoAcesso() {
        return this.getVo().asBigDecimal("TIPOACESSO");
   }

   public void setTipoAcesso(BigDecimal tipoAcesso) {
        markAsChanged("TIPOACESSO", tipoAcesso);
   }

   @Override
   public String getTableName() {
        return "TSIPER";
   }

   @Override
   public String getEntityName() {
        return "PermissaoAcesso";
   }

   @Override
   public PermissaoAcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
