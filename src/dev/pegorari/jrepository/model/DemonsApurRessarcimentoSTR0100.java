package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DemonsApurRessarcimentoSTR0100 extends AbstractSankhyaEntity<DemonsApurRessarcimentoSTR0100> {
   private String digitado;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private String email;
   private String ender;
   private String fax;
   private String fone;
   private String nome;
   private String num;
   private String reg;
   private String bairro;
   private String cep;
   private String cnpj;
   private BigDecimal codEmp;
   private BigDecimal codMun;
   private String compl;
   private String cpf;
   private String crc;

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

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        this.nome = nome;
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

   public String getCnpj() {
        return cnpj;
   }

   public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodMun() {
        return codMun;
   }

   public void setCodMun(BigDecimal codMun) {
        this.codMun = codMun;
   }

   public String getCompl() {
        return compl;
   }

   public void setCompl(String compl) {
        this.compl = compl;
   }

   public String getCpf() {
        return cpf;
   }

   public void setCpf(String cpf) {
        this.cpf = cpf;
   }

   public String getCrc() {
        return crc;
   }

   public void setCrc(String crc) {
        this.crc = crc;
   }

   @Override
   public String getTableName() {
        return "TGFDRCSTR0100";
   }

   @Override
   public String getEntityName() {
        return "DemonsApurRessarcimentoSTR0100";
   }

   @Override
   public DemonsApurRessarcimentoSTR0100 fromVO(DynamicVO vo) {
        this.digitado = vo.asString("DIGITADO");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.email = vo.asString("EMAIL");
        this.ender = vo.asString("ENDER");
        this.fax = vo.asString("FAX");
        this.fone = vo.asString("FONE");
        this.nome = vo.asString("NOME");
        this.num = vo.asString("NUM");
        this.reg = vo.asString("REG");
        this.bairro = vo.asString("BAIRRO");
        this.cep = vo.asString("CEP");
        this.cnpj = vo.asString("CNPJ");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codMun = vo.asBigDecimal("CODMUN");
        this.compl = vo.asString("COMPL");
        this.cpf = vo.asString("CPF");
        this.crc = vo.asString("CRC");
        return this;
   }
}
