package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Funcao extends AbstractSankhyaEntity<Funcao> {
   public BigDecimal getCodCbo() {
        return this.getVo().asBigDecimal("CODCBO");
   }

   public void setCodCbo(BigDecimal codCbo) {
        markAsChanged("CODCBO", codCbo);
   }

   public BigDecimal getCodFuncao() {
        return this.getVo().asBigDecimal("CODFUNCAO");
   }

   public void setCodFuncao(BigDecimal codFuncao) {
        markAsChanged("CODFUNCAO", codFuncao);
   }

   public String getDescrFuncao() {
        return this.getVo().asString("DESCRFUNCAO");
   }

   public void setDescrFuncao(String descrFuncao) {
        markAsChanged("DESCRFUNCAO", descrFuncao);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public String getIncaPont() {
        return this.getVo().asString("INCAPONT");
   }

   public void setIncaPont(String incaPont) {
        markAsChanged("INCAPONT", incaPont);
   }

   public String getPodeEncEmp() {
        return this.getVo().asString("PODEENCEMP");
   }

   public void setPodeEncEmp(String podeEncEmp) {
        markAsChanged("PODEENCEMP", podeEncEmp);
   }

   public String getPodeSupEmp() {
        return this.getVo().asString("PODESUPEMP");
   }

   public void setPodeSupEmp(String podeSupEmp) {
        markAsChanged("PODESUPEMP", podeSupEmp);
   }

   @Override
   public String getTableName() {
        return "TFPFCO";
   }

   @Override
   public String getEntityName() {
        return "Funcao";
   }

   @Override
   public Funcao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
