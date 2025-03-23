package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DemonsApurRessarcimentoSTR0000 extends AbstractSankhyaEntity<DemonsApurRessarcimentoSTR0000> {
   private String cnpj;
   private BigDecimal codEmp;
   private BigDecimal codFin;
   private BigDecimal codMun;
   private BigDecimal codVer;
   private String cpf;
   private String digitado;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private String ie;
   private String im;
   private BigDecimal indAtiv;
   private String indPerfil;
   private String nome;
   private String reg;
   private String suframa;
   private String uf;

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

   public String getIm() {
        return im;
   }

   public void setIm(String im) {
        markAsChanged("IM", im);
        this.im = im;
   }

   public BigDecimal getIndAtiv() {
        return indAtiv;
   }

   public void setIndAtiv(BigDecimal indAtiv) {
        markAsChanged("INDATIV", indAtiv);
        this.indAtiv = indAtiv;
   }

   public String getIndPerfil() {
        return indPerfil;
   }

   public void setIndPerfil(String indPerfil) {
        markAsChanged("INDPERFIL", indPerfil);
        this.indPerfil = indPerfil;
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

   public String getSuframa() {
        return suframa;
   }

   public void setSuframa(String suframa) {
        markAsChanged("SUFRAMA", suframa);
        this.suframa = suframa;
   }

   public String getUf() {
        return uf;
   }

   public void setUf(String uf) {
        markAsChanged("UF", uf);
        this.uf = uf;
   }

   @Override
   public String getTableName() {
        return "TGFDRCSTR0000";
   }

   @Override
   public String getEntityName() {
        return "DemonsApurRessarcimentoSTR0000";
   }

   @Override
   public DemonsApurRessarcimentoSTR0000 fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.cnpj = vo.asString("CNPJ");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codFin = vo.asBigDecimal("CODFIN");
        this.codMun = vo.asBigDecimal("CODMUN");
        this.codVer = vo.asBigDecimal("CODVER");
        this.cpf = vo.asString("CPF");
        this.digitado = vo.asString("DIGITADO");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.ie = vo.asString("IE");
        this.im = vo.asString("IM");
        this.indAtiv = vo.asBigDecimal("INDATIV");
        this.indPerfil = vo.asString("INDPERFIL");
        this.nome = vo.asString("NOME");
        this.reg = vo.asString("REG");
        this.suframa = vo.asString("SUFRAMA");
        this.uf = vo.asString("UF");
        return this;
   }
}
