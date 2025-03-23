package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DetalhesAjustesCPRB extends AbstractSankhyaEntity<DetalhesAjustesCPRB> {
   private BigDecimal codAjuste;
   private String codCprb;
   private BigDecimal codEmp;
   private String codObra;
   private String descRAjuste;
   private Timestamp dtRef;
   private BigDecimal tipoAjuste;
   private BigDecimal vlrAjuste;

   public BigDecimal getCodAjuste() {
        return codAjuste;
   }

   public void setCodAjuste(BigDecimal codAjuste) {
        markAsChanged("CODAJUSTE", codAjuste);
        this.codAjuste = codAjuste;
   }

   public String getCodCprb() {
        return codCprb;
   }

   public void setCodCprb(String codCprb) {
        markAsChanged("CODCPRB", codCprb);
        this.codCprb = codCprb;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public String getCodObra() {
        return codObra;
   }

   public void setCodObra(String codObra) {
        markAsChanged("CODOBRA", codObra);
        this.codObra = codObra;
   }

   public String getDescRAjuste() {
        return descRAjuste;
   }

   public void setDescRAjuste(String descRAjuste) {
        markAsChanged("DESCRAJUSTE", descRAjuste);
        this.descRAjuste = descRAjuste;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
        this.dtRef = dtRef;
   }

   public BigDecimal getTipoAjuste() {
        return tipoAjuste;
   }

   public void setTipoAjuste(BigDecimal tipoAjuste) {
        markAsChanged("TIPOAJUSTE", tipoAjuste);
        this.tipoAjuste = tipoAjuste;
   }

   public BigDecimal getVlrAjuste() {
        return vlrAjuste;
   }

   public void setVlrAjuste(BigDecimal vlrAjuste) {
        markAsChanged("VLRAJUSTE", vlrAjuste);
        this.vlrAjuste = vlrAjuste;
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
        this.codAjuste = vo.asBigDecimal("CODAJUSTE");
        this.codCprb = vo.asString("CODCPRB");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codObra = vo.asString("CODOBRA");
        this.descRAjuste = vo.asString("DESCRAJUSTE");
        this.dtRef = vo.asTimestamp("DTREF");
        this.tipoAjuste = vo.asBigDecimal("TIPOAJUSTE");
        this.vlrAjuste = vo.asBigDecimal("VLRAJUSTE");
        return this;
   }
}
