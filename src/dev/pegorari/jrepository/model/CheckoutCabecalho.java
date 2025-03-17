package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CheckoutCabecalho extends AbstractSankhyaEntity<CheckoutCabecalho> {
   private BigDecimal codCencus;
   private BigDecimal codEmp;
   private BigDecimal codNat;
   private BigDecimal codParc;
   private BigDecimal codTipOper;
   private BigDecimal codTipVenda;
   private BigDecimal codUsu;
   private BigDecimal codVend;
   private BigDecimal nuKc;
   private BigDecimal nuLayout;
   private String cpfCnpjAdquirEnte;

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        this.codCencus = codCencus;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
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

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        this.codTipVenda = codTipVenda;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        this.codVend = codVend;
   }

   public BigDecimal getNuKc() {
        return nuKc;
   }

   public void setNuKc(BigDecimal nuKc) {
        this.nuKc = nuKc;
   }

   public BigDecimal getNuLayout() {
        return nuLayout;
   }

   public void setNuLayout(BigDecimal nuLayout) {
        this.nuLayout = nuLayout;
   }

   public String getCpfCnpjAdquirEnte() {
        return cpfCnpjAdquirEnte;
   }

   public void setCpfCnpjAdquirEnte(String cpfCnpjAdquirEnte) {
        this.cpfCnpjAdquirEnte = cpfCnpjAdquirEnte;
   }

   @Override
   public String getTableName() {
        return "TGFCKC";
   }

   @Override
   public String getEntityName() {
        return "CheckoutCabecalho";
   }

   @Override
   public CheckoutCabecalho fromVO(DynamicVO vo) {
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.codTipVenda = vo.asBigDecimal("CODTIPVENDA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.nuKc = vo.asBigDecimal("NUCKC");
        this.nuLayout = vo.asBigDecimal("NULAYOUT");
        this.cpfCnpjAdquirEnte = vo.asString("CPFCNPJADQUIRENTE");
        return this;
   }
}
