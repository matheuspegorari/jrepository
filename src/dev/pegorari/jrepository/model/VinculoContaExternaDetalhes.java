package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class VinculoContaExternaDetalhes extends AbstractSankhyaEntity<VinculoContaExternaDetalhes> {
   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getCtaCtb() {
        return this.getVo().asString("CTACTB");
   }

   public void setCtaCtb(String ctaCtb) {
        markAsChanged("CTACTB", ctaCtb);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getCodCtaCtb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
   }

   public String getCtaCtbExt() {
        return this.getVo().asString("CTACTBEXT");
   }

   public void setCtaCtbExt(String ctaCtbExt) {
        markAsChanged("CTACTBEXT", ctaCtbExt);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getCtaCtbExtImp() {
        return this.getVo().asString("CTACTBEXTIMP");
   }

   public void setCtaCtbExtImp(String ctaCtbExtImp) {
        markAsChanged("CTACTBEXTIMP", ctaCtbExtImp);
   }

   public String getCrImportado() {
        return this.getVo().asString("CRIMPORTADO");
   }

   public void setCrImportado(String crImportado) {
        markAsChanged("CRIMPORTADO", crImportado);
   }

   public String getCrVinculado() {
        return this.getVo().asString("CRVINCULADO");
   }

   public void setCrVinculado(String crVinculado) {
        markAsChanged("CRVINCULADO", crVinculado);
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
        this.setVo(vo);
        return this;
   }
}
