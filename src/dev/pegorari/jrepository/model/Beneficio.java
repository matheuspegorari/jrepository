package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class Beneficio implements SankhyaEntity<Beneficio> {

   private BigDecimal codBco;
   private BigDecimal codBen;
   private BigDecimal codCenCus;
   private BigDecimal codCenCusDif;
   private BigDecimal codCtaBcoInt;
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

   public BigDecimal getCodCenCus() {
        return codCenCus;
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        this.codCenCus = codCenCus;
   }

   public BigDecimal getCodCenCusDif() {
        return codCenCusDif;
   }

   public void setCodCenCusDif(BigDecimal codCenCusDif) {
        this.codCenCusDif = codCenCusDif;
   }

   public BigDecimal getCodCtaBcoInt() {
        return codCtaBcoInt;
   }

   public void setCodCtaBcoInt(BigDecimal codCtaBcoInt) {
        this.codCtaBcoInt = codCtaBcoInt;
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
   public String getEntityName() {
        return "Beneficio";
   }

   @Override
   public Beneficio fromVO(DynamicVO vo) {
        this.codBco = vo.asBigDecimal("CODBCO");
        this.codBen = vo.asBigDecimal("CODBEN");
        this.codCenCus = vo.asBigDecimal("CODCENCUS");
        this.codCenCusDif = vo.asBigDecimal("CODCENCUSDIF");
        this.codCtaBcoInt = vo.asBigDecimal("CODCTABCOINT");
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
