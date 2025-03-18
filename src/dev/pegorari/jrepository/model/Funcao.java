package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Funcao extends AbstractSankhyaEntity<Funcao> {
   private BigDecimal codCbo;
   private BigDecimal codFuncao;
   private String descrFuncao;
   private Timestamp dtAlter;
   private String incaPont;
   private String podeEncEmp;
   private String podeSupEmp;

   public BigDecimal getCodCbo() {
        return codCbo;
   }

   public void setCodCbo(BigDecimal codCbo) {
        markAsChanged("CODCBO", codCbo);
        this.codCbo = codCbo;
   }

   public BigDecimal getCodFuncao() {
        return codFuncao;
   }

   public void setCodFuncao(BigDecimal codFuncao) {
        markAsChanged("CODFUNCAO", codFuncao);
        this.codFuncao = codFuncao;
   }

   public String getDescrFuncao() {
        return descrFuncao;
   }

   public void setDescrFuncao(String descrFuncao) {
        markAsChanged("DESCRFUNCAO", descrFuncao);
        this.descrFuncao = descrFuncao;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public String getIncaPont() {
        return incaPont;
   }

   public void setIncaPont(String incaPont) {
        markAsChanged("INCAPONT", incaPont);
        this.incaPont = incaPont;
   }

   public String getPodeEncEmp() {
        return podeEncEmp;
   }

   public void setPodeEncEmp(String podeEncEmp) {
        markAsChanged("PODEENCEMP", podeEncEmp);
        this.podeEncEmp = podeEncEmp;
   }

   public String getPodeSupEmp() {
        return podeSupEmp;
   }

   public void setPodeSupEmp(String podeSupEmp) {
        markAsChanged("PODESUPEMP", podeSupEmp);
        this.podeSupEmp = podeSupEmp;
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
        this.setOriginalVO(vo);
        this.codCbo = vo.asBigDecimal("CODCBO");
        this.codFuncao = vo.asBigDecimal("CODFUNCAO");
        this.descrFuncao = vo.asString("DESCRFUNCAO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.incaPont = vo.asString("INCAPONT");
        this.podeEncEmp = vo.asString("PODEENCEMP");
        this.podeSupEmp = vo.asString("PODESUPEMP");
        return this;
   }
}
