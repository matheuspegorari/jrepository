package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Departamento extends AbstractSankhyaEntity<Departamento> {
   private String analitico;
   private String ativo;
   private BigDecimal codCencus;
   private BigDecimal codDep;
   private BigDecimal codDepPai;
   private BigDecimal codEnd;
   private BigDecimal codParc;
   private BigDecimal codRegFis;
   private String complemento;
   private String descrDep;
   private BigDecimal grau;
   private String numEnd;
   private String nrInscContrat;
   private String nrInscProp;
   private BigDecimal tipLotacao;
   private BigDecimal tpInscContrat;
   private BigDecimal tpInscProp;
   private BigDecimal codProj;

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
        this.analitico = analitico;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
        this.codCencus = codCencus;
   }

   public BigDecimal getCodDep() {
        return codDep;
   }

   public void setCodDep(BigDecimal codDep) {
        markAsChanged("CODDEP", codDep);
        this.codDep = codDep;
   }

   public BigDecimal getCodDepPai() {
        return codDepPai;
   }

   public void setCodDepPai(BigDecimal codDepPai) {
        markAsChanged("CODDEPPAI", codDepPai);
        this.codDepPai = codDepPai;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
        this.codEnd = codEnd;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodRegFis() {
        return codRegFis;
   }

   public void setCodRegFis(BigDecimal codRegFis) {
        markAsChanged("CODREGFIS", codRegFis);
        this.codRegFis = codRegFis;
   }

   public String getComplemento() {
        return complemento;
   }

   public void setComplemento(String complemento) {
        markAsChanged("COMPLEMENTO", complemento);
        this.complemento = complemento;
   }

   public String getDescrDep() {
        return descrDep;
   }

   public void setDescrDep(String descrDep) {
        markAsChanged("DESCRDEP", descrDep);
        this.descrDep = descrDep;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
        this.grau = grau;
   }

   public String getNumEnd() {
        return numEnd;
   }

   public void setNumEnd(String numEnd) {
        markAsChanged("NUMEND", numEnd);
        this.numEnd = numEnd;
   }

   public String getNrInscContrat() {
        return nrInscContrat;
   }

   public void setNrInscContrat(String nrInscContrat) {
        markAsChanged("NRINSCCONTRAT", nrInscContrat);
        this.nrInscContrat = nrInscContrat;
   }

   public String getNrInscProp() {
        return nrInscProp;
   }

   public void setNrInscProp(String nrInscProp) {
        markAsChanged("NRINSCPROP", nrInscProp);
        this.nrInscProp = nrInscProp;
   }

   public BigDecimal getTipLotacao() {
        return tipLotacao;
   }

   public void setTipLotacao(BigDecimal tipLotacao) {
        markAsChanged("TIPLOTACAO", tipLotacao);
        this.tipLotacao = tipLotacao;
   }

   public BigDecimal getTpInscContrat() {
        return tpInscContrat;
   }

   public void setTpInscContrat(BigDecimal tpInscContrat) {
        markAsChanged("TPINSCCONTRAT", tpInscContrat);
        this.tpInscContrat = tpInscContrat;
   }

   public BigDecimal getTpInscProp() {
        return tpInscProp;
   }

   public void setTpInscProp(BigDecimal tpInscProp) {
        markAsChanged("TPINSCPROP", tpInscProp);
        this.tpInscProp = tpInscProp;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
        this.codProj = codProj;
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
        this.setOriginalVO(vo);
        this.analitico = vo.asString("ANALITICO");
        this.ativo = vo.asString("ATIVO");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codDep = vo.asBigDecimal("CODDEP");
        this.codDepPai = vo.asBigDecimal("CODDEPPAI");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codRegFis = vo.asBigDecimal("CODREGFIS");
        this.complemento = vo.asString("COMPLEMENTO");
        this.descrDep = vo.asString("DESCRDEP");
        this.grau = vo.asBigDecimal("GRAU");
        this.numEnd = vo.asString("NUMEND");
        this.nrInscContrat = vo.asString("NRINSCCONTRAT");
        this.nrInscProp = vo.asString("NRINSCPROP");
        this.tipLotacao = vo.asBigDecimal("TIPLOTACAO");
        this.tpInscContrat = vo.asBigDecimal("TPINSCCONTRAT");
        this.tpInscProp = vo.asBigDecimal("TPINSCPROP");
        this.codProj = vo.asBigDecimal("CODPROJ");
        return this;
   }
}
