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
        markAsChanged("CNPJ", cnpj);
        this.cnpj = cnpj;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodMunFis() {
        return codMunFis;
   }

   public void setCodMunFis(BigDecimal codMunFis) {
        markAsChanged("CODMUNFIS", codMunFis);
        this.codMunFis = codMunFis;
   }

   public BigDecimal getCodPaisFis() {
        return codPaisFis;
   }

   public void setCodPaisFis(BigDecimal codPaisFis) {
        markAsChanged("CODPAISFIS", codPaisFis);
        this.codPaisFis = codPaisFis;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public String getCpf() {
        return cpf;
   }

   public void setCpf(String cpf) {
        markAsChanged("CPF", cpf);
        this.cpf = cpf;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
        this.digitado = digitado;
   }

   public Timestamp getDtFinal() {
        return dtFinal;
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
        this.dtFinal = dtFinal;
   }

   public Timestamp getDtInicial() {
        return dtInicial;
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
        this.dtInicial = dtInicial;
   }

   public String getIe() {
        return ie;
   }

   public void setIe(String ie) {
        markAsChanged("IE", ie);
        this.ie = ie;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
        this.nome = nome;
   }

   public String getReg() {
        return reg;
   }

   public void setReg(String reg) {
        markAsChanged("REG", reg);
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
        this.setOriginalVO(vo);
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
