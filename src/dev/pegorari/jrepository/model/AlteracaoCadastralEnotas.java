package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;

public class AlteracaoCadastralEnotas extends AbstractSankhyaEntity<AlteracaoCadastralEnotas> {
   private Timestamp dhAlter;
   private Timestamp dhDone;
   private String id;
   private String tipo;

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhDone() {
        return dhDone;
   }

   public void setDhDone(Timestamp dhDone) {
        markAsChanged("DHDONE", dhDone);
        this.dhDone = dhDone;
   }

   public String getId() {
        return id;
   }

   public void setId(String id) {
        markAsChanged("ID", id);
        this.id = id;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
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
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhDone = vo.asTimestamp("DHDONE");
        this.id = vo.asString("ID");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
