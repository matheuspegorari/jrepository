package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GrupoUsuario extends AbstractSankhyaEntity<GrupoUsuario> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodGrupo() {
        return this.getVo().asBigDecimal("CODGRUPO");
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
   }

   public BigDecimal getCodUnn() {
        return this.getVo().asBigDecimal("CODUNN");
   }

   public void setCodUnn(BigDecimal codUnn) {
        markAsChanged("CODUNN", codUnn);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public String getNomeGrupo() {
        return this.getVo().asString("NOMEGRUPO");
   }

   public void setNomeGrupo(String nomeGrupo) {
        markAsChanged("NOMEGRUPO", nomeGrupo);
   }

   public String getUserName() {
        return this.getVo().asString("USER_NAME");
   }

   public void setUserName(String userName) {
        markAsChanged("USER_NAME", userName);
   }

   @Override
   public String getTableName() {
        return "TSIGRU";
   }

   @Override
   public String getEntityName() {
        return "GrupoUsuario";
   }

   @Override
   public GrupoUsuario fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
