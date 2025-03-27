package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Beneficio extends AbstractSankhyaEntity<Beneficio> {
   public BigDecimal getCodBco() {
        return this.getVo().asBigDecimal("CODBCO");
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
   }

   public BigDecimal getCodBen() {
        return this.getVo().asBigDecimal("CODBEN");
   }

   public void setCodBen(BigDecimal codBen) {
        markAsChanged("CODBEN", codBen);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodCencusDif() {
        return this.getVo().asBigDecimal("CODCENCUSDIF");
   }

   public void setCodCencusDif(BigDecimal codCencusDif) {
        markAsChanged("CODCENCUSDIF", codCencusDif);
   }

   public BigDecimal getCodCtabcoInt() {
        return this.getVo().asBigDecimal("CODCTABCOINT");
   }

   public void setCodCtabcoInt(BigDecimal codCtabcoInt) {
        markAsChanged("CODCTABCOINT", codCtabcoInt);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEvento() {
        return this.getVo().asBigDecimal("CODEVENTO");
   }

   public void setCodEvento(BigDecimal codEvento) {
        markAsChanged("CODEVENTO", codEvento);
   }

   public BigDecimal getCodEventoEmp() {
        return this.getVo().asBigDecimal("CODEVENTOEMP");
   }

   public void setCodEventoEmp(BigDecimal codEventoEmp) {
        markAsChanged("CODEVENTOEMP", codEventoEmp);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodParcEmp() {
        return this.getVo().asBigDecimal("CODPARCEMP");
   }

   public void setCodParcEmp(BigDecimal codParcEmp) {
        markAsChanged("CODPARCEMP", codParcEmp);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public BigDecimal getCodTbe() {
        return this.getVo().asBigDecimal("CODTBE");
   }

   public void setCodTbe(BigDecimal codTbe) {
        markAsChanged("CODTBE", codTbe);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public BigDecimal getCodTipTit() {
        return this.getVo().asBigDecimal("CODTIPTIT");
   }

   public void setCodTipTit(BigDecimal codTipTit) {
        markAsChanged("CODTIPTIT", codTipTit);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getFormula() {
        return this.getVo().asString("FORMULA");
   }

   public void setFormula(String formula) {
        markAsChanged("FORMULA", formula);
   }

   public String getFormulaInd() {
        return this.getVo().asString("FORMULAIND");
   }

   public void setFormulaInd(String formulaInd) {
        markAsChanged("FORMULAIND", formulaInd);
   }

   public String getValidaAfastamento() {
        return this.getVo().asString("VALIDAAFASTAMENTO");
   }

   public void setValidaAfastamento(String validaAfastamento) {
        markAsChanged("VALIDAAFASTAMENTO", validaAfastamento);
   }

   public BigDecimal getVlrParteEmpresa() {
        return this.getVo().asBigDecimal("VLRPARTEEMPRESA");
   }

   public void setVlrParteEmpresa(BigDecimal vlrParteEmpresa) {
        markAsChanged("VLRPARTEEMPRESA", vlrParteEmpresa);
   }

   public String getDescHrCarga() {
        return this.getVo().asString("DESCHRCARGA");
   }

   public void setDescHrCarga(String descHrCarga) {
        markAsChanged("DESCHRCARGA", descHrCarga);
   }

   public BigDecimal getTipoBeneficio() {
        return this.getVo().asBigDecimal("TIPOBENEFICIO");
   }

   public void setTipoBeneficio(BigDecimal tipoBeneficio) {
        markAsChanged("TIPOBENEFICIO", tipoBeneficio);
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
        this.setVo(vo);
        return this;
   }
}
