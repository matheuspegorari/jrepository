package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExtratoBancario implements SankhyaEntity<ExtratoBancario> {

   private BigDecimal codCateg;
   private BigDecimal codUsu;
   private String conciliado;
   private BigDecimal convenio;
   private Timestamp dhAlter;
   private Timestamp dtLanc;
   private String hist;
   private String nroCta;
   private BigDecimal nroDoc;
   private BigDecimal nuExb;
   private BigDecimal nuImport;
   private BigDecimal valor;
   private String cnpjCpf;
   private BigDecimal codBco;
   private String fitId;
   private BigDecimal recDesp;
   private String tipoTransacao;
   private BigDecimal nuBco;

   public BigDecimal getCodCateg() {
        return codCateg;
   }

   public void setCodCateg(BigDecimal codCateg) {
        this.codCateg = codCateg;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getConciliado() {
        return conciliado;
   }

   public void setConciliado(String conciliado) {
        this.conciliado = conciliado;
   }

   public BigDecimal getConvenio() {
        return convenio;
   }

   public void setConvenio(BigDecimal convenio) {
        this.convenio = convenio;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public Timestamp getDtLanc() {
        return dtLanc;
   }

   public void setDtLanc(Timestamp dtLanc) {
        this.dtLanc = dtLanc;
   }

   public String getHist() {
        return hist;
   }

   public void setHist(String hist) {
        this.hist = hist;
   }

   public String getNroCta() {
        return nroCta;
   }

   public void setNroCta(String nroCta) {
        this.nroCta = nroCta;
   }

   public BigDecimal getNroDoc() {
        return nroDoc;
   }

   public void setNroDoc(BigDecimal nroDoc) {
        this.nroDoc = nroDoc;
   }

   public BigDecimal getNuExb() {
        return nuExb;
   }

   public void setNuExb(BigDecimal nuExb) {
        this.nuExb = nuExb;
   }

   public BigDecimal getNuImport() {
        return nuImport;
   }

   public void setNuImport(BigDecimal nuImport) {
        this.nuImport = nuImport;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        this.valor = valor;
   }

   public String getCnpjCpf() {
        return cnpjCpf;
   }

   public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
   }

   public BigDecimal getCodBco() {
        return codBco;
   }

   public void setCodBco(BigDecimal codBco) {
        this.codBco = codBco;
   }

   public String getFitId() {
        return fitId;
   }

   public void setFitId(String fitId) {
        this.fitId = fitId;
   }

   public BigDecimal getRecDesp() {
        return recDesp;
   }

   public void setRecDesp(BigDecimal recDesp) {
        this.recDesp = recDesp;
   }

   public String getTipoTransacao() {
        return tipoTransacao;
   }

   public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
   }

   public BigDecimal getNuBco() {
        return nuBco;
   }

   public void setNuBco(BigDecimal nuBco) {
        this.nuBco = nuBco;
   }

   @Override
   public String getEntityName() {
        return "ExtratoBancario";
   }

   @Override
   public ExtratoBancario fromVO(DynamicVO vo) {
        this.codCateg = vo.asBigDecimal("CODCATEG");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.conciliado = vo.asString("CONCILIADO");
        this.convenio = vo.asBigDecimal("CONVENIO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dtLanc = vo.asTimestamp("DTLANC");
        this.hist = vo.asString("HIST");
        this.nroCta = vo.asString("NROCTA");
        this.nroDoc = vo.asBigDecimal("NRODOC");
        this.nuExb = vo.asBigDecimal("NUEXB");
        this.nuImport = vo.asBigDecimal("NUIMPORT");
        this.valor = vo.asBigDecimal("VALOR");
        this.cnpjCpf = vo.asString("CNPJCPF");
        this.codBco = vo.asBigDecimal("CODBCO");
        this.fitId = vo.asString("FITID");
        this.recDesp = vo.asBigDecimal("RECDESP");
        this.tipoTransacao = vo.asString("TIPOTRANSACAO");
        this.nuBco = vo.asBigDecimal("NUBCO");
        return this;
   }
}
