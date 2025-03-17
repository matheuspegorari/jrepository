package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class GrupoUsuario implements SankhyaEntity<GrupoUsuario> {

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
        this.ativo = ativo;
   }

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        this.codGrupo = codGrupo;
   }

   public BigDecimal getCodUnn() {
        return codUnn;
   }

   public void setCodUnn(BigDecimal codUnn) {
        this.codUnn = codUnn;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        this.email = email;
   }

   public String getNomeGrupo() {
        return nomeGrupo;
   }

   public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
   }

   public String getUserName() {
        return userName;
   }

   public void setUserName(String userName) {
        this.userName = userName;
   }

   @Override
   public String getEntityName() {
        return "GrupoUsuario";
   }

   @Override
   public GrupoUsuario fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.codUnn = vo.asBigDecimal("CODUNN");
        this.email = vo.asString("EMAIL");
        this.nomeGrupo = vo.asString("NOMEGRUPO");
        this.userName = vo.asString("USERNAME");
        return this;
   }
}
