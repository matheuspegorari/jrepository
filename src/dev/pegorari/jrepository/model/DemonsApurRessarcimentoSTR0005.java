package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DemonsApurRessarcimentoSTR0005 extends AbstractSankhyaEntity<DemonsApurRessarcimentoSTR0005> {
   private String bairro;
   private String cep;
   private BigDecimal codEmp;
   private String compl;
   private String digitado;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private String email;
   private String ender;
   private String fantasia;
   private String fax;
   private String fone;
   private String num;
   private String reg;

   public String getBairro() {
        return bairro;
   }

   public void setBairro(String bairro) {
        this.bairro = bairro;
   }

   public String getCep() {
        return cep;
   }

   public void setCep(String cep) {
        this.cep = cep;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getCompl() {
        return compl;
   }

   public void setCompl(String compl) {
        this.compl = compl;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public Timestamp getDtFinal() {
        return dtFinal;
   }

   public void setDtFinal(Timestamp dtFinal) {
        this.dtFinal = dtFinal;
   }

   public Timestamp getDtInicial() {
        return dtInicial;
   }

   public void setDtInicial(Timestamp dtInicial) {
        this.dtInicial = dtInicial;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        this.email = email;
   }

   public String getEnder() {
        return ender;
   }

   public void setEnder(String ender) {
        this.ender = ender;
   }

   public String getFantasia() {
        return fantasia;
   }

   public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
   }

   public String getFax() {
        return fax;
   }

   public void setFax(String fax) {
        this.fax = fax;
   }

   public String getFone() {
        return fone;
   }

   public void setFone(String fone) {
        this.fone = fone;
   }

   public String getNum() {
        return num;
   }

   public void setNum(String num) {
        this.num = num;
   }

   public String getReg() {
        return reg;
   }

   public void setReg(String reg) {
        this.reg = reg;
   }

   @Override
   public String getTableName() {
        return "TGFDRCSTR0005";
   }

   @Override
   public String getEntityName() {
        return "DemonsApurRessarcimentoSTR0005";
   }

   @Override
   public DemonsApurRessarcimentoSTR0005 fromVO(DynamicVO vo) {
        this.bairro = vo.asString("BAIRRO");
        this.cep = vo.asString("CEP");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.compl = vo.asString("COMPL");
        this.digitado = vo.asString("DIGITADO");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.email = vo.asString("EMAIL");
        this.ender = vo.asString("ENDER");
        this.fantasia = vo.asString("FANTASIA");
        this.fax = vo.asString("FAX");
        this.fone = vo.asString("FONE");
        this.num = vo.asString("NUM");
        this.reg = vo.asString("REG");
        return this;
   }
}
