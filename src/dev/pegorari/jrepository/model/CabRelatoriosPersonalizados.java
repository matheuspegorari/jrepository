package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabRelatoriosPersonalizados extends AbstractSankhyaEntity<CabRelatoriosPersonalizados> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getNuPeriodoCtb() {
        return this.getVo().asBigDecimal("NUPERIODOCTB");
   }

   public void setNuPeriodoCtb(BigDecimal nuPeriodoCtb) {
        markAsChanged("NUPERIODOCTB", nuPeriodoCtb);
   }

   public BigDecimal getTabela() {
        return this.getVo().asBigDecimal("TABELA");
   }

   public void setTabela(BigDecimal tabela) {
        markAsChanged("TABELA", tabela);
   }

   @Override
   public String getTableName() {
        return "TCBCRP";
   }

   @Override
   public String getEntityName() {
        return "CabRelatoriosPersonalizados";
   }

   @Override
   public CabRelatoriosPersonalizados fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
