package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CargaHorariaRecursoHumano extends AbstractSankhyaEntity<CargaHorariaRecursoHumano> {
   private BigDecimal codCargaHor;
   private BigDecimal codRhp;
   private Timestamp dtFinalVigor;
   private Timestamp dtInicioVigor;

   public BigDecimal getCodCargaHor() {
        return codCargaHor;
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        this.codCargaHor = codCargaHor;
   }

   public BigDecimal getCodRhp() {
        return codRhp;
   }

   public void setCodRhp(BigDecimal codRhp) {
        this.codRhp = codRhp;
   }

   public Timestamp getDtFinalVigor() {
        return dtFinalVigor;
   }

   public void setDtFinalVigor(Timestamp dtFinalVigor) {
        this.dtFinalVigor = dtFinalVigor;
   }

   public Timestamp getDtInicioVigor() {
        return dtInicioVigor;
   }

   public void setDtInicioVigor(Timestamp dtInicioVigor) {
        this.dtInicioVigor = dtInicioVigor;
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
        this.codCargaHor = vo.asBigDecimal("CODCARGAHOR");
        this.codRhp = vo.asBigDecimal("CODRHP");
        this.dtFinalVigor = vo.asTimestamp("DTFINALVIGOR");
        this.dtInicioVigor = vo.asTimestamp("DTINICIOVIGOR");
        return this;
   }
}
