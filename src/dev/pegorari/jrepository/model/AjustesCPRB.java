package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AjustesCPRB extends AbstractSankhyaEntity<AjustesCPRB> {
   private String codCprb;
   private BigDecimal codEmp;
   private String codObra;
   private Timestamp dtRef;
   private BigDecimal vlrTotAdicao;
   private BigDecimal vlrTotExclusao;

   public String getCodCprb() {
        return codCprb;
   }

   public void setCodCprb(String codCprb) {
        this.codCprb = codCprb;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getCodObra() {
        return codObra;
   }

   public void setCodObra(String codObra) {
        this.codObra = codObra;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        this.dtRef = dtRef;
   }

   public BigDecimal getVlrTotAdicao() {
        return vlrTotAdicao;
   }

   public void setVlrTotAdicao(BigDecimal vlrTotAdicao) {
        this.vlrTotAdicao = vlrTotAdicao;
   }

   public BigDecimal getVlrTotExclusao() {
        return vlrTotExclusao;
   }

   public void setVlrTotExclusao(BigDecimal vlrTotExclusao) {
        this.vlrTotExclusao = vlrTotExclusao;
   }

   @Override
   public String getTableName() {
        return "TGFACPRB";
   }

   @Override
   public String getEntityName() {
        return "AjustesCPRB";
   }

   @Override
   public AjustesCPRB fromVO(DynamicVO vo) {
        this.codCprb = vo.asString("CODCPRB");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codObra = vo.asString("CODOBRA");
        this.dtRef = vo.asTimestamp("DTREF");
        this.vlrTotAdicao = vo.asBigDecimal("VLRTOTADICAO");
        this.vlrTotExclusao = vo.asBigDecimal("VLRTOTEXCLUSAO");
        return this;
   }
}
