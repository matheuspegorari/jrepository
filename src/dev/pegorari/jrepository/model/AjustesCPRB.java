package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AjustesCPRB extends AbstractSankhyaEntity<AjustesCPRB> {
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

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public BigDecimal getVlrTotAdicao() {
        return this.getVo().asBigDecimal("VLRTOTADICAO");
   }

   public void setVlrTotAdicao(BigDecimal vlrTotAdicao) {
        markAsChanged("VLRTOTADICAO", vlrTotAdicao);
   }

   public BigDecimal getVlrTotExclusao() {
        return this.getVo().asBigDecimal("VLRTOTEXCLUSAO");
   }

   public void setVlrTotExclusao(BigDecimal vlrTotExclusao) {
        markAsChanged("VLRTOTEXCLUSAO", vlrTotExclusao);
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
        this.setVo(vo);
        return this;
   }
}
