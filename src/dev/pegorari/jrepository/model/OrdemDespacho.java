package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OrdemDespacho extends AbstractSankhyaEntity<OrdemDespacho> {
   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodParctransp() {
        return this.getVo().asBigDecimal("CODPARCTRANSP");
   }

   public void setCodParctransp(BigDecimal codParctransp) {
        markAsChanged("CODPARCTRANSP", codParctransp);
   }

   public BigDecimal getNuOdp() {
        return this.getVo().asBigDecimal("NUODP");
   }

   public void setNuOdp(BigDecimal nuOdp) {
        markAsChanged("NUODP", nuOdp);
   }

   public Timestamp getDtInclusao() {
        return this.getVo().asTimestamp("DTINCLUSAO");
   }

   public void setDtInclusao(Timestamp dtInclusao) {
        markAsChanged("DTINCLUSAO", dtInclusao);
   }

   @Override
   public String getTableName() {
        return "TGFODP";
   }

   @Override
   public String getEntityName() {
        return "OrdemDespacho";
   }

   @Override
   public OrdemDespacho fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
