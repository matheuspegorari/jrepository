package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CargaHorariaRecursoHumano extends AbstractSankhyaEntity<CargaHorariaRecursoHumano> {
   public BigDecimal getCodCargaHor() {
        return this.getVo().asBigDecimal("CODCARGAHOR");
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        markAsChanged("CODCARGAHOR", codCargaHor);
   }

   public BigDecimal getCodRhp() {
        return this.getVo().asBigDecimal("CODRHP");
   }

   public void setCodRhp(BigDecimal codRhp) {
        markAsChanged("CODRHP", codRhp);
   }

   public Timestamp getDtFinalVigor() {
        return this.getVo().asTimestamp("DTFINALVIGOR");
   }

   public void setDtFinalVigor(Timestamp dtFinalVigor) {
        markAsChanged("DTFINALVIGOR", dtFinalVigor);
   }

   public Timestamp getDtInicioVigor() {
        return this.getVo().asTimestamp("DTINICIOVIGOR");
   }

   public void setDtInicioVigor(Timestamp dtInicioVigor) {
        markAsChanged("DTINICIOVIGOR", dtInicioVigor);
   }

   @Override
   public String getTableName() {
        return "TPRCHR";
   }

   @Override
   public String getEntityName() {
        return "CargaHorariaRecursoHumano";
   }

   @Override
   public CargaHorariaRecursoHumano fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
