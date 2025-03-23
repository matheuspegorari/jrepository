package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDGrupo extends AbstractSankhyaEntity<MSDGrupo> {
   private BigDecimal codGrupo;
   private String descrGrupo;
   private Timestamp dtAlter;
   private BigDecimal ordem;

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
        this.codGrupo = codGrupo;
   }

   public String getDescrGrupo() {
        return descrGrupo;
   }

   public void setDescrGrupo(String descrGrupo) {
        markAsChanged("DESCRGRUPO", descrGrupo);
        this.descrGrupo = descrGrupo;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
        this.ordem = ordem;
   }

   @Override
   public String getTableName() {
        return "TMDGRU";
   }

   @Override
   public String getEntityName() {
        return "MSDGrupo";
   }

   @Override
   public MSDGrupo fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.descrGrupo = vo.asString("DESCRGRUPO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.ordem = vo.asBigDecimal("ORDEM");
        return this;
   }
}
