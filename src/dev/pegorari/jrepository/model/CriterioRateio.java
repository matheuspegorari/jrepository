package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CriterioRateio extends AbstractSankhyaEntity<CriterioRateio> {
   private String automatico;
   private BigDecimal codCencus;
   private BigDecimal codCriterio;
   private BigDecimal codEmp;
   private BigDecimal codNat;
   private BigDecimal codProj;
   private String descricao;
   private String origemCriterio;
   private BigDecimal numContrato;

   public String getAutomatico() {
        return automatico;
   }

   public void setAutomatico(String automatico) {
        markAsChanged("AUTOMATICO", automatico);
        this.automatico = automatico;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
        this.codCencus = codCencus;
   }

   public BigDecimal getCodCriterio() {
        return codCriterio;
   }

   public void setCodCriterio(BigDecimal codCriterio) {
        markAsChanged("CODCRITERIO", codCriterio);
        this.codCriterio = codCriterio;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
        this.codNat = codNat;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
        this.codProj = codProj;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getOrigemCriterio() {
        return origemCriterio;
   }

   public void setOrigemCriterio(String origemCriterio) {
        markAsChanged("ORIGEMCRITERIO", origemCriterio);
        this.origemCriterio = origemCriterio;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
        this.numContrato = numContrato;
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
        this.setOriginalVO(vo);
        this.automatico = vo.asString("AUTOMATICO");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codCriterio = vo.asBigDecimal("CODCRITERIO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.descricao = vo.asString("DESCRICAO");
        this.origemCriterio = vo.asString("ORIGEMCRITERIO");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        return this;
   }
}
