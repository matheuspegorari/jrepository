package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;

public class AlteracaoCadastralEnotas extends AbstractSankhyaEntity<AlteracaoCadastralEnotas> {
   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDhDone() {
        return this.getVo().asTimestamp("DHDONE");
   }

   public void setDhDone(Timestamp dhDone) {
        markAsChanged("DHDONE", dhDone);
   }

   public String getId() {
        return this.getVo().asString("ID");
   }

   public void setId(String id) {
        markAsChanged("ID", id);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TGFACE";
   }

   @Override
   public String getEntityName() {
        return "AlteracaoCadastralEnotas";
   }

   @Override
   public AlteracaoCadastralEnotas fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
