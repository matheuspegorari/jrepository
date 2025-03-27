package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CriterioRateio extends AbstractSankhyaEntity<CriterioRateio> {
   public String getAutomatico() {
        return this.getVo().asString("AUTOMATICO");
   }

   public void setAutomatico(String automatico) {
        markAsChanged("AUTOMATICO", automatico);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodCriterio() {
        return this.getVo().asBigDecimal("CODCRITERIO");
   }

   public void setCodCriterio(BigDecimal codCriterio) {
        markAsChanged("CODCRITERIO", codCriterio);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getOrigemCriterio() {
        return this.getVo().asString("ORIGEMCRITERIO");
   }

   public void setOrigemCriterio(String origemCriterio) {
        markAsChanged("ORIGEMCRITERIO", origemCriterio);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   @Override
   public String getTableName() {
        return "TGFCRI";
   }

   @Override
   public String getEntityName() {
        return "CriterioRateio";
   }

   @Override
   public CriterioRateio fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
