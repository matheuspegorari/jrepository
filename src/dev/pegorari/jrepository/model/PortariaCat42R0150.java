package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PortariaCat42R0150 extends AbstractSankhyaEntity<PortariaCat42R0150> {
   private String cnpj;
   private BigDecimal codEmp;
   private BigDecimal codMunFis;
   private BigDecimal codPaisFis;
   private BigDecimal codParc;
   private String cpf;
   private String digitado;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private String ie;
   private String nome;
   private String reg;

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

   public BigDecimal getCodMunFis() {
        return codMunFis;
   }

   public void setCodMunFis(BigDecimal codMunFis) {
        this.codMunFis = codMunFis;
   }

   public BigDecimal getCodPaisFis() {
        return codPaisFis;
   }

   public void setCodPaisFis(BigDecimal codPaisFis) {
        this.codPaisFis = codPaisFis;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public String getCpf() {
        return cpf;
   }

   public void setCpf(String cpf) {
        this.cpf = cpf;
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

   public String getIe() {
        return ie;
   }

   public void setIe(String ie) {
        this.ie = ie;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        this.nome = nome;
   }

   public String getReg() {
        return reg;
   }

   public void setReg(String reg) {
        this.reg = reg;
   }

   @Override
   public String getTableName() {
        return "TGFCAT42R0150";
   }

   @Override
   public String getEntityName() {
        return "PortariaCat42R0150";
   }

   @Override
   public PortariaCat42R0150 fromVO(DynamicVO vo) {
        this.cnpj = vo.asString("CNPJ");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codMunFis = vo.asBigDecimal("CODMUNFIS");
        this.codPaisFis = vo.asBigDecimal("CODPAISFIS");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.cpf = vo.asString("CPF");
        this.digitado = vo.asString("DIGITADO");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.ie = vo.asString("IE");
        this.nome = vo.asString("NOME");
        this.reg = vo.asString("REG");
        return this;
   }
}
