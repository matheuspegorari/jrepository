package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDGrupo implements SankhyaEntity<MSDGrupo> {

   private BigDecimal codGrupo;
   private String descrGrupo;
   private Timestamp dtAlter;
   private BigDecimal ordem;

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        this.codGrupo = codGrupo;
   }

   public String getDescrGrupo() {
        return descrGrupo;
   }

   public void setDescrGrupo(String descrGrupo) {
        this.descrGrupo = descrGrupo;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   @Override
   public String getEntityName() {
        return "MSDGrupo";
   }

   @Override
   public MSDGrupo fromVO(DynamicVO vo) {
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.descrGrupo = vo.asString("DESCRGRUPO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.ordem = vo.asBigDecimal("ORDEM");
        return this;
   }
}
