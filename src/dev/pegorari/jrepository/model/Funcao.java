package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Funcao implements SankhyaEntity<Funcao> {

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
        this.codCbo = codCbo;
   }

   public BigDecimal getCodFuncao() {
        return codFuncao;
   }

   public void setCodFuncao(BigDecimal codFuncao) {
        this.codFuncao = codFuncao;
   }

   public String getDescrFuncao() {
        return descrFuncao;
   }

   public void setDescrFuncao(String descrFuncao) {
        this.descrFuncao = descrFuncao;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public String getIncaPont() {
        return incaPont;
   }

   public void setIncaPont(String incaPont) {
        this.incaPont = incaPont;
   }

   public String getPodeEncEmp() {
        return podeEncEmp;
   }

   public void setPodeEncEmp(String podeEncEmp) {
        this.podeEncEmp = podeEncEmp;
   }

   public String getPodeSupEmp() {
        return podeSupEmp;
   }

   public void setPodeSupEmp(String podeSupEmp) {
        this.podeSupEmp = podeSupEmp;
   }

   @Override
   public String getEntityName() {
        return "Funcao";
   }

   @Override
   public Funcao fromVO(DynamicVO vo) {
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
