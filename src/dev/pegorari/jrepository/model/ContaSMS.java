package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ContaSMS extends AbstractSankhyaEntity<ContaSMS> {
   public BigDecimal getCodContaSms() {
        return this.getVo().asBigDecimal("CODCONTASMS");
   }

   public void setCodContaSms(BigDecimal codContaSms) {
        markAsChanged("CODCONTASMS", codContaSms);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getNomeRemetente() {
        return this.getVo().asString("NOMEREMETENTE");
   }

   public void setNomeRemetente(String nomeRemetente) {
        markAsChanged("NOMEREMETENTE", nomeRemetente);
   }

   public String getPlataforma() {
        return this.getVo().asString("PLATAFORMA");
   }

   public void setPlataforma(String plataforma) {
        markAsChanged("PLATAFORMA", plataforma);
   }

   public String getSenha() {
        return this.getVo().asString("SENHA");
   }

   public void setSenha(String senha) {
        markAsChanged("SENHA", senha);
   }

   public String getUsuario() {
        return this.getVo().asString("USUARIO");
   }

   public void setUsuario(String usuario) {
        markAsChanged("USUARIO", usuario);
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
        this.setVo(vo);
        return this;
   }
}
