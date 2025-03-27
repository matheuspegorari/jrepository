package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DetalhesAjustesCPRB extends AbstractSankhyaEntity<DetalhesAjustesCPRB> {
   public BigDecimal getCodAjuste() {
        return this.getVo().asBigDecimal("CODAJUSTE");
   }

   public void setCodAjuste(BigDecimal codAjuste) {
        markAsChanged("CODAJUSTE", codAjuste);
   }

   public String getCodCprb() {
        return this.getVo().asString("CODCPRB");
   }

   public void setCodCprb(String codCprb) {
        markAsChanged("CODCPRB", codCprb);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getCodObra() {
        return this.getVo().asString("CODOBRA");
   }

   public void setCodObra(String codObra) {
        markAsChanged("CODOBRA", codObra);
   }

   public String getDescRAjuste() {
        return this.getVo().asString("DESCRAJUSTE");
   }

   public void setDescRAjuste(String descRAjuste) {
        markAsChanged("DESCRAJUSTE", descRAjuste);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public BigDecimal getTipoAjuste() {
        return this.getVo().asBigDecimal("TIPOAJUSTE");
   }

   public void setTipoAjuste(BigDecimal tipoAjuste) {
        markAsChanged("TIPOAJUSTE", tipoAjuste);
   }

   public BigDecimal getVlrAjuste() {
        return this.getVo().asBigDecimal("VLRAJUSTE");
   }

   public void setVlrAjuste(BigDecimal vlrAjuste) {
        markAsChanged("VLRAJUSTE", vlrAjuste);
   }

   @Override
   public String getTableName() {
        return "TGFDACPRB";
   }

   @Override
   public String getEntityName() {
        return "DetalhesAjustesCPRB";
   }

   @Override
   public DetalhesAjustesCPRB fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
