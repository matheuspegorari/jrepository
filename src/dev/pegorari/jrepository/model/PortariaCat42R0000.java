package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PortariaCat42R0000 extends AbstractSankhyaEntity<PortariaCat42R0000> {
   private String cnpj;
   private BigDecimal codEmp;
   private BigDecimal codFin;
   private BigDecimal codMun;
   private BigDecimal codVer;
   private String digitado;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private String ie;
   private String nome;
   private Timestamp periodo;
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

   public BigDecimal getCodFin() {
        return codFin;
   }

   public void setCodFin(BigDecimal codFin) {
        markAsChanged("CODFIN", codFin);
        this.codFin = codFin;
   }

   public BigDecimal getCodMun() {
        return codMun;
   }

   public void setCodMun(BigDecimal codMun) {
        markAsChanged("CODMUN", codMun);
        this.codMun = codMun;
   }

   public BigDecimal getCodVer() {
        return codVer;
   }

   public void setCodVer(BigDecimal codVer) {
        markAsChanged("CODVER", codVer);
        this.codVer = codVer;
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

   public Timestamp getPeriodo() {
        return periodo;
   }

   public void setPeriodo(Timestamp periodo) {
        markAsChanged("PERIODO", periodo);
        this.periodo = periodo;
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
        return "TGFCAT42R0000";
   }

   @Override
   public String getEntityName() {
        return "PortariaCat42R0000";
   }

   @Override
   public PortariaCat42R0000 fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.cnpj = vo.asString("CNPJ");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codFin = vo.asBigDecimal("CODFIN");
        this.codMun = vo.asBigDecimal("CODMUN");
        this.codVer = vo.asBigDecimal("CODVER");
        this.digitado = vo.asString("DIGITADO");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.ie = vo.asString("IE");
        this.nome = vo.asString("NOME");
        this.periodo = vo.asTimestamp("PERIODO");
        this.reg = vo.asString("REG");
        return this;
   }
}
