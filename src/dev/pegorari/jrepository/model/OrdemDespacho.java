package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OrdemDespacho implements SankhyaEntity<OrdemDespacho> {

   private String status;
   private BigDecimal codEmp;
   private BigDecimal codParcTransp;
   private BigDecimal nuOdp;
   private Timestamp dtInclusao;

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        this.status = status;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodParcTransp() {
        return codParcTransp;
   }

   public void setCodParcTransp(BigDecimal codParcTransp) {
        this.codParcTransp = codParcTransp;
   }

   public BigDecimal getNuOdp() {
        return nuOdp;
   }

   public void setNuOdp(BigDecimal nuOdp) {
        this.nuOdp = nuOdp;
   }

   public Timestamp getDtInclusao() {
        return dtInclusao;
   }

   public void setDtInclusao(Timestamp dtInclusao) {
        this.dtInclusao = dtInclusao;
   }

   @Override
   public String getEntityName() {
        return "OrdemDespacho";
   }

   @Override
   public OrdemDespacho fromVO(DynamicVO vo) {
        this.status = vo.asString("STATUS");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codParcTransp = vo.asBigDecimal("CODPARCTRANSP");
        this.nuOdp = vo.asBigDecimal("NUODP");
        this.dtInclusao = vo.asTimestamp("DTINCLUSAO");
        return this;
   }
}
