package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;

public class AlteracaoCadastralEnotas implements SankhyaEntity<AlteracaoCadastralEnotas> {

   private Timestamp dhAlter;
   private Timestamp dhDone;
   private String id;
   private String tipo;

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhDone() {
        return dhDone;
   }

   public void setDhDone(Timestamp dhDone) {
        this.dhDone = dhDone;
   }

   public String getId() {
        return id;
   }

   public void setId(String id) {
        this.id = id;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getEntityName() {
        return "AlteracaoCadastralEnotas";
   }

   @Override
   public AlteracaoCadastralEnotas fromVO(DynamicVO vo) {
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhDone = vo.asTimestamp("DHDONE");
        this.id = vo.asString("ID");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
