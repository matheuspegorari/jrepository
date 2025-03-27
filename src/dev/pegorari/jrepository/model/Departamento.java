package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Departamento extends AbstractSankhyaEntity<Departamento> {
   public String getAnalitico() {
        return this.getVo().asString("ANALITICO");
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodDep() {
        return this.getVo().asBigDecimal("CODDEP");
   }

   public void setCodDep(BigDecimal codDep) {
        markAsChanged("CODDEP", codDep);
   }

   public BigDecimal getCodDepPai() {
        return this.getVo().asBigDecimal("CODDEPPAI");
   }

   public void setCodDepPai(BigDecimal codDepPai) {
        markAsChanged("CODDEPPAI", codDepPai);
   }

   public BigDecimal getCodEnd() {
        return this.getVo().asBigDecimal("CODEND");
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodRegFis() {
        return this.getVo().asBigDecimal("CODREGFIS");
   }

   public void setCodRegFis(BigDecimal codRegFis) {
        markAsChanged("CODREGFIS", codRegFis);
   }

   public String getComplemento() {
        return this.getVo().asString("COMPLEMENTO");
   }

   public void setComplemento(String complemento) {
        markAsChanged("COMPLEMENTO", complemento);
   }

   public String getDescrDep() {
        return this.getVo().asString("DESCRDEP");
   }

   public void setDescrDep(String descrDep) {
        markAsChanged("DESCRDEP", descrDep);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public String getNumEnd() {
        return this.getVo().asString("NUMEND");
   }

   public void setNumEnd(String numEnd) {
        markAsChanged("NUMEND", numEnd);
   }

   public String getNrInscContrat() {
        return this.getVo().asString("NRINSCCONTRAT");
   }

   public void setNrInscContrat(String nrInscContrat) {
        markAsChanged("NRINSCCONTRAT", nrInscContrat);
   }

   public String getNrInscProp() {
        return this.getVo().asString("NRINSCPROP");
   }

   public void setNrInscProp(String nrInscProp) {
        markAsChanged("NRINSCPROP", nrInscProp);
   }

   public BigDecimal getTipLotacao() {
        return this.getVo().asBigDecimal("TIPLOTACAO");
   }

   public void setTipLotacao(BigDecimal tipLotacao) {
        markAsChanged("TIPLOTACAO", tipLotacao);
   }

   public BigDecimal getTpInscContrat() {
        return this.getVo().asBigDecimal("TPINSCCONTRAT");
   }

   public void setTpInscContrat(BigDecimal tpInscContrat) {
        markAsChanged("TPINSCCONTRAT", tpInscContrat);
   }

   public BigDecimal getTpInscProp() {
        return this.getVo().asBigDecimal("TPINSCPROP");
   }

   public void setTpInscProp(BigDecimal tpInscProp) {
        markAsChanged("TPINSCPROP", tpInscProp);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   @Override
   public String getTableName() {
        return "TFPDEP";
   }

   @Override
   public String getEntityName() {
        return "Departamento";
   }

   @Override
   public Departamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
