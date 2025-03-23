package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OrdemDespacho extends AbstractSankhyaEntity<OrdemDespacho> {
   private String status;
   private BigDecimal codEmp;
   private BigDecimal codParctransp;
   private BigDecimal nuOdp;
   private Timestamp dtInclusao;

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodParctransp() {
        return codParctransp;
   }

   public void setCodParctransp(BigDecimal codParctransp) {
        markAsChanged("CODPARCTRANSP", codParctransp);
        this.codParctransp = codParctransp;
   }

   public BigDecimal getNuOdp() {
        return nuOdp;
   }

   public void setNuOdp(BigDecimal nuOdp) {
        markAsChanged("NUODP", nuOdp);
        this.nuOdp = nuOdp;
   }

   public Timestamp getDtInclusao() {
        return dtInclusao;
   }

   public void setDtInclusao(Timestamp dtInclusao) {
        markAsChanged("DTINCLUSAO", dtInclusao);
        this.dtInclusao = dtInclusao;
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
        this.status = vo.asString("STATUS");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codParctransp = vo.asBigDecimal("CODPARCTRANSP");
        this.nuOdp = vo.asBigDecimal("NUODP");
        this.dtInclusao = vo.asTimestamp("DTINCLUSAO");
        return this;
   }
}
