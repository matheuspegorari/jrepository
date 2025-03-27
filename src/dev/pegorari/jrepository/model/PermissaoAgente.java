package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;

public class PermissaoAgente extends AbstractSankhyaEntity<PermissaoAgente> {
   public Timestamp getDhAutorizacao() {
        return this.getVo().asTimestamp("DHAUTORIZACAO");
   }

   public void setDhAutorizacao(Timestamp dhAutorizacao) {
        markAsChanged("DHAUTORIZACAO", dhAutorizacao);
   }

   public String getId() {
        return this.getVo().asString("ID");
   }

   public void setId(String id) {
        markAsChanged("ID", id);
   }

   public String getPermissao() {
        return this.getVo().asString("PERMISSAO");
   }

   public void setPermissao(String permissao) {
        markAsChanged("PERMISSAO", permissao);
   }

   public String getAutorizado() {
        return this.getVo().asString("AUTORIZADO");
   }

   public void setAutorizado(String autorizado) {
        markAsChanged("AUTORIZADO", autorizado);
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
        return this;
   }
}
