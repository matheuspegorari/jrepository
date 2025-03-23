package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PermissaoAcesso extends AbstractSankhyaEntity<PermissaoAcesso> {
   private BigDecimal codGrupo;
   private BigDecimal codUsu;
   private String permissao;
   private BigDecimal tipoAcesso;

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
        this.codGrupo = codGrupo;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getPermissao() {
        return permissao;
   }

   public void setPermissao(String permissao) {
        markAsChanged("PERMISSAO", permissao);
        this.permissao = permissao;
   }

   public BigDecimal getTipoAcesso() {
        return tipoAcesso;
   }

   public void setTipoAcesso(BigDecimal tipoAcesso) {
        markAsChanged("TIPOACESSO", tipoAcesso);
        this.tipoAcesso = tipoAcesso;
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
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.permissao = vo.asString("PERMISSAO");
        this.tipoAcesso = vo.asBigDecimal("TIPOACESSO");
        return this;
   }
}
