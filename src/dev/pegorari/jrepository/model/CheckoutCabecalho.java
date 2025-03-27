package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CheckoutCabecalho extends AbstractSankhyaEntity<CheckoutCabecalho> {
   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
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

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public BigDecimal getCodTipVenda() {
        return this.getVo().asBigDecimal("CODTIPVENDA");
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public BigDecimal getNuKc() {
        return this.getVo().asBigDecimal("NUCKC");
   }

   public void setNuKc(BigDecimal nuKc) {
        markAsChanged("NUCKC", nuKc);
   }

   public BigDecimal getNuLayout() {
        return this.getVo().asBigDecimal("NULAYOUT");
   }

   public void setNuLayout(BigDecimal nuLayout) {
        markAsChanged("NULAYOUT", nuLayout);
   }

   public String getCpfCnpjAdquirEnte() {
        return this.getVo().asString("CPFCNPJADQUIRENTE");
   }

   public void setCpfCnpjAdquirEnte(String cpfCnpjAdquirEnte) {
        markAsChanged("CPFCNPJADQUIRENTE", cpfCnpjAdquirEnte);
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
        this.setVo(vo);
        return this;
   }
}
