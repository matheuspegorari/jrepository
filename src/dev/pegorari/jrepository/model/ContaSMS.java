package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ContaSMS extends AbstractSankhyaEntity<ContaSMS> {
   private BigDecimal codContaSms;
   private String descricao;
   private String nomeRemetente;
   private String plataforma;
   private String senha;
   private String usuario;

   public BigDecimal getCodContaSms() {
        return codContaSms;
   }

   public void setCodContaSms(BigDecimal codContaSms) {
        this.codContaSms = codContaSms;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getNomeRemetente() {
        return nomeRemetente;
   }

   public void setNomeRemetente(String nomeRemetente) {
        this.nomeRemetente = nomeRemetente;
   }

   public String getPlataforma() {
        return plataforma;
   }

   public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
   }

   public String getSenha() {
        return senha;
   }

   public void setSenha(String senha) {
        this.senha = senha;
   }

   public String getUsuario() {
        return usuario;
   }

   public void setUsuario(String usuario) {
        this.usuario = usuario;
   }

   @Override
   public String getTableName() {
        return "TSISMS";
   }

   @Override
   public String getEntityName() {
        return "ContaSMS";
   }

   @Override
   public ContaSMS fromVO(DynamicVO vo) {
        this.codContaSms = vo.asBigDecimal("CODCONTASMS");
        this.descricao = vo.asString("DESCRICAO");
        this.nomeRemetente = vo.asString("NOMEREMETENTE");
        this.plataforma = vo.asString("PLATAFORMA");
        this.senha = vo.asString("SENHA");
        this.usuario = vo.asString("USUARIO");
        return this;
   }
}
