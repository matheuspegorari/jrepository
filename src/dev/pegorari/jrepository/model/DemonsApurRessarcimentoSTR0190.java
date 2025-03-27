package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DemonsApurRessarcimentoSTR0190 extends AbstractSankhyaEntity<DemonsApurRessarcimentoSTR0190> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getDescr() {
        return this.getVo().asString("DESCR");
   }

   public void setDescr(String descr) {
        markAsChanged("DESCR", descr);
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

   public String getUnid() {
        return this.getVo().asString("UNID");
   }

   public void setUnid(String unid) {
        markAsChanged("UNID", unid);
   }

   @Override
   public String getTableName() {
        return "TGFDRCSTR0190";
   }

   @Override
   public String getEntityName() {
        return "DemonsApurRessarcimentoSTR0190";
   }

   @Override
   public DemonsApurRessarcimentoSTR0190 fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
