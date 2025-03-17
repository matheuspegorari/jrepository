package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Beneficio extends AbstractSankhyaEntity<Beneficio> {
   private BigDecimal codBco;
   private BigDecimal codBen;
   private BigDecimal codCencus;
   private BigDecimal codCencusDif;
   private BigDecimal codCtabcoInt;
   private BigDecimal codEmp;
   private BigDecimal codEvento;
   private BigDecimal codEventoEmp;
   private BigDecimal codNat;
   private BigDecimal codParc;
   private BigDecimal codParcEmp;
   private BigDecimal codProj;
   private BigDecimal codTbe;
   private BigDecimal codTipOper;
   private BigDecimal codTipTit;
   private String descricao;
   private String formula;
   private String formulaInd;
   private String validaAfastamento;
   private BigDecimal vlrParteEmpresa;
   private String descHrCarga;
   private BigDecimal tipoBeneficio;

   public BigDecimal getCodBco() {
        return codBco;
   }

   public void setCodBco(BigDecimal codBco) {
        this.codBco = codBco;
   }

   public BigDecimal getCodBen() {
        return codBen;
   }

   public void setCodBen(BigDecimal codBen) {
        this.codBen = codBen;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        this.codCencus = codCencus;
   }

   public BigDecimal getCodCencusDif() {
        return codCencusDif;
   }

   public void setCodCencusDif(BigDecimal codCencusDif) {
        this.codCencusDif = codCencusDif;
   }

   public BigDecimal getCodCtabcoInt() {
        return codCtabcoInt;
   }

   public void setCodCtabcoInt(BigDecimal codCtabcoInt) {
        this.codCtabcoInt = codCtabcoInt;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEvento() {
        return codEvento;
   }

   public void setCodEvento(BigDecimal codEvento) {
        this.codEvento = codEvento;
   }

   public BigDecimal getCodEventoEmp() {
        return codEventoEmp;
   }

   public void setCodEventoEmp(BigDecimal codEventoEmp) {
        this.codEventoEmp = codEventoEmp;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        this.codNat = codNat;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodParcEmp() {
        return codParcEmp;
   }

   public void setCodParcEmp(BigDecimal codParcEmp) {
        this.codParcEmp = codParcEmp;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        this.codProj = codProj;
   }

   public BigDecimal getCodTbe() {
        return codTbe;
   }

   public void setCodTbe(BigDecimal codTbe) {
        this.codTbe = codTbe;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCodTipTit() {
        return codTipTit;
   }

   public void setCodTipTit(BigDecimal codTipTit) {
        this.codTipTit = codTipTit;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getFormula() {
        return formula;
   }

   public void setFormula(String formula) {
        this.formula = formula;
   }

   public String getFormulaInd() {
        return formulaInd;
   }

   public void setFormulaInd(String formulaInd) {
        this.formulaInd = formulaInd;
   }

   public String getValidaAfastamento() {
        return validaAfastamento;
   }

   public void setValidaAfastamento(String validaAfastamento) {
        this.validaAfastamento = validaAfastamento;
   }

   public BigDecimal getVlrParteEmpresa() {
        return vlrParteEmpresa;
   }

   public void setVlrParteEmpresa(BigDecimal vlrParteEmpresa) {
        this.vlrParteEmpresa = vlrParteEmpresa;
   }

   public String getDescHrCarga() {
        return descHrCarga;
   }

   public void setDescHrCarga(String descHrCarga) {
        this.descHrCarga = descHrCarga;
   }

   public BigDecimal getTipoBeneficio() {
        return tipoBeneficio;
   }

   public void setTipoBeneficio(BigDecimal tipoBeneficio) {
        this.tipoBeneficio = tipoBeneficio;
   }

   @Override
   public String getTableName() {
        return "TFPBEN";
   }

   @Override
   public String getEntityName() {
        return "Beneficio";
   }

   @Override
   public Beneficio fromVO(DynamicVO vo) {
        this.codBco = vo.asBigDecimal("CODBCO");
        this.codBen = vo.asBigDecimal("CODBEN");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codCencusDif = vo.asBigDecimal("CODCENCUSDIF");
        this.codCtabcoInt = vo.asBigDecimal("CODCTABCOINT");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEvento = vo.asBigDecimal("CODEVENTO");
        this.codEventoEmp = vo.asBigDecimal("CODEVENTOEMP");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codParcEmp = vo.asBigDecimal("CODPARCEMP");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.codTbe = vo.asBigDecimal("CODTBE");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.codTipTit = vo.asBigDecimal("CODTIPTIT");
        this.descricao = vo.asString("DESCRICAO");
        this.formula = vo.asString("FORMULA");
        this.formulaInd = vo.asString("FORMULAIND");
        this.validaAfastamento = vo.asString("VALIDAAFASTAMENTO");
        this.vlrParteEmpresa = vo.asBigDecimal("VLRPARTEEMPRESA");
        this.descHrCarga = vo.asString("DESCHRCARGA");
        this.tipoBeneficio = vo.asBigDecimal("TIPOBENEFICIO");
        return this;
   }
}
