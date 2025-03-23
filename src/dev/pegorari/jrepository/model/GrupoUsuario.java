package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GrupoUsuario extends AbstractSankhyaEntity<GrupoUsuario> {
   private String ativo;
   private BigDecimal codGrupo;
   private BigDecimal codUnn;
   private String email;
   private String nomeGrupo;
   private String userName;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
        this.codGrupo = codGrupo;
   }

   public BigDecimal getCodUnn() {
        return codUnn;
   }

   public void setCodUnn(BigDecimal codUnn) {
        markAsChanged("CODUNN", codUnn);
        this.codUnn = codUnn;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
        this.email = email;
   }

   public String getNomeGrupo() {
        return nomeGrupo;
   }

   public void setNomeGrupo(String nomeGrupo) {
        markAsChanged("NOMEGRUPO", nomeGrupo);
        this.nomeGrupo = nomeGrupo;
   }

   public String getUserName() {
        return userName;
   }

   public void setUserName(String userName) {
        markAsChanged("USER_NAME", userName);
        this.userName = userName;
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
        this.ativo = vo.asString("ATIVO");
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.codUnn = vo.asBigDecimal("CODUNN");
        this.email = vo.asString("EMAIL");
        this.nomeGrupo = vo.asString("NOMEGRUPO");
        this.userName = vo.asString("USER_NAME");
        return this;
   }
}
