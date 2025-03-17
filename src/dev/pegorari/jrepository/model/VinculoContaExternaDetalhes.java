package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class VinculoContaExternaDetalhes extends AbstractSankhyaEntity<VinculoContaExternaDetalhes> {
   private Timestamp dtAlter;
   private BigDecimal codUsu;
   private String ctaCtb;
   private BigDecimal sequencia;
   private BigDecimal codCtaCtb;
   private String ctaCtbExt;
   private BigDecimal codEmp;
   private String ctaCtbExtImp;
   private String crImportado;
   private String crVinculado;

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getCtaCtb() {
        return ctaCtb;
   }

   public void setCtaCtb(String ctaCtb) {
        this.ctaCtb = ctaCtb;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        this.codCtaCtb = codCtaCtb;
   }

   public String getCtaCtbExt() {
        return ctaCtbExt;
   }

   public void setCtaCtbExt(String ctaCtbExt) {
        this.ctaCtbExt = ctaCtbExt;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getCtaCtbExtImp() {
        return ctaCtbExtImp;
   }

   public void setCtaCtbExtImp(String ctaCtbExtImp) {
        this.ctaCtbExtImp = ctaCtbExtImp;
   }

   public String getCrImportado() {
        return crImportado;
   }

   public void setCrImportado(String crImportado) {
        this.crImportado = crImportado;
   }

   public String getCrVinculado() {
        return crVinculado;
   }

   public void setCrVinculado(String crVinculado) {
        this.crVinculado = crVinculado;
   }

   @Override
   public String getTableName() {
        return "TCBVCED";
   }

   @Override
   public String getEntityName() {
        return "VinculoContaExternaDetalhes";
   }

   @Override
   public VinculoContaExternaDetalhes fromVO(DynamicVO vo) {
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.ctaCtb = vo.asString("CTACTB");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.ctaCtbExt = vo.asString("CTACTBEXT");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.ctaCtbExtImp = vo.asString("CTACTBEXTIMP");
        this.crImportado = vo.asString("CRIMPORTADO");
        this.crVinculado = vo.asString("CRVINCULADO");
        return this;
   }
}
