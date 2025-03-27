package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PortariaCat42R0200 extends AbstractSankhyaEntity<PortariaCat42R0200> {
   public BigDecimal getAliqIcms() {
        return this.getVo().asBigDecimal("ALIQICMS");
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        markAsChanged("ALIQICMS", aliqIcms);
   }

   public BigDecimal getCest() {
        return this.getVo().asBigDecimal("CEST");
   }

   public void setCest(BigDecimal cest) {
        markAsChanged("CEST", cest);
   }

   public String getCodBarra() {
        return this.getVo().asString("CODBARRA");
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getCodItem() {
        return this.getVo().asString("CODITEM");
   }

   public void setCodItem(String codItem) {
        markAsChanged("CODITEM", codItem);
   }

   public String getCodNcm() {
        return this.getVo().asString("CODNCM");
   }

   public void setCodNcm(String codNcm) {
        markAsChanged("CODNCM", codNcm);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getDescrItem() {
        return this.getVo().asString("DESCRITEM");
   }

   public void setDescrItem(String descrItem) {
        markAsChanged("DESCRITEM", descrItem);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public Timestamp getDtFinal() {
        return this.getVo().asTimestamp("DTFINAL");
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
   }

   public Timestamp getDtInicial() {
        return this.getVo().asTimestamp("DTINICIAL");
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
   }

   public String getReg() {
        return this.getVo().asString("REG");
   }

   public void setReg(String reg) {
        markAsChanged("REG", reg);
   }

   public String getUnidInv() {
        return this.getVo().asString("UNIDINV");
   }

   public void setUnidInv(String unidInv) {
        markAsChanged("UNIDINV", unidInv);
   }

   @Override
   public String getTableName() {
        return "TGFCAT42R0200";
   }

   @Override
   public String getEntityName() {
        return "PortariaCat42R0200";
   }

   @Override
   public PortariaCat42R0200 fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
