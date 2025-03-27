package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDGrupo extends AbstractSankhyaEntity<MSDGrupo> {
   public BigDecimal getCodGrupo() {
        return this.getVo().asBigDecimal("CODGRUPO");
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
   }

   public String getDescrGrupo() {
        return this.getVo().asString("DESCRGRUPO");
   }

   public void setDescrGrupo(String descrGrupo) {
        markAsChanged("DESCRGRUPO", descrGrupo);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
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
        return this;
   }
}
