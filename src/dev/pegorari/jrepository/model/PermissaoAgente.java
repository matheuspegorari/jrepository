package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;

public class PermissaoAgente extends AbstractSankhyaEntity<PermissaoAgente> {
   private Timestamp dhAutorizacao;
   private String id;
   private String permissao;
   private String autorizado;

   public Timestamp getDhAutorizacao() {
        return dhAutorizacao;
   }

   public void setDhAutorizacao(Timestamp dhAutorizacao) {
        markAsChanged("DHAUTORIZACAO", dhAutorizacao);
        this.dhAutorizacao = dhAutorizacao;
   }

   public String getId() {
        return id;
   }

   public void setId(String id) {
        markAsChanged("ID", id);
        this.id = id;
   }

   public String getPermissao() {
        return permissao;
   }

   public void setPermissao(String permissao) {
        markAsChanged("PERMISSAO", permissao);
        this.permissao = permissao;
   }

   public String getAutorizado() {
        return autorizado;
   }

   public void setAutorizado(String autorizado) {
        markAsChanged("AUTORIZADO", autorizado);
        this.autorizado = autorizado;
   }

   @Override
   public String getTableName() {
        return "TASPAG";
   }

   @Override
   public String getEntityName() {
        return "PermissaoAgente";
   }

   @Override
   public PermissaoAgente fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.dhAutorizacao = vo.asTimestamp("DHAUTORIZACAO");
        this.id = vo.asString("ID");
        this.permissao = vo.asString("PERMISSAO");
        this.autorizado = vo.asString("AUTORIZADO");
        return this;
   }
}
