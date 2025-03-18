package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExtratoBancario extends AbstractSankhyaEntity<ExtratoBancario> {
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
        markAsChanged("CODCATEG", codCateg);
        this.codCateg = codCateg;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getConciliado() {
        return conciliado;
   }

   public void setConciliado(String conciliado) {
        markAsChanged("CONCILIADO", conciliado);
        this.conciliado = conciliado;
   }

   public BigDecimal getConvenio() {
        return convenio;
   }

   public void setConvenio(BigDecimal convenio) {
        markAsChanged("CONVENIO", convenio);
        this.convenio = convenio;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public Timestamp getDtLanc() {
        return dtLanc;
   }

   public void setDtLanc(Timestamp dtLanc) {
        markAsChanged("DTLANC", dtLanc);
        this.dtLanc = dtLanc;
   }

   public String getHist() {
        return hist;
   }

   public void setHist(String hist) {
        markAsChanged("HIST", hist);
        this.hist = hist;
   }

   public String getNroCta() {
        return nroCta;
   }

   public void setNroCta(String nroCta) {
        markAsChanged("NROCTA", nroCta);
        this.nroCta = nroCta;
   }

   public BigDecimal getNroDoc() {
        return nroDoc;
   }

   public void setNroDoc(BigDecimal nroDoc) {
        markAsChanged("NRODOC", nroDoc);
        this.nroDoc = nroDoc;
   }

   public BigDecimal getNuExb() {
        return nuExb;
   }

   public void setNuExb(BigDecimal nuExb) {
        markAsChanged("NUEXB", nuExb);
        this.nuExb = nuExb;
   }

   public BigDecimal getNuImport() {
        return nuImport;
   }

   public void setNuImport(BigDecimal nuImport) {
        markAsChanged("NUIMPORT", nuImport);
        this.nuImport = nuImport;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
        this.valor = valor;
   }

   public String getCnpjCpf() {
        return cnpjCpf;
   }

   public void setCnpjCpf(String cnpjCpf) {
        markAsChanged("CNPJ_CPF", cnpjCpf);
        this.cnpjCpf = cnpjCpf;
   }

   public BigDecimal getCodBco() {
        return codBco;
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
        this.codBco = codBco;
   }

   public String getFitId() {
        return fitId;
   }

   public void setFitId(String fitId) {
        markAsChanged("FITID", fitId);
        this.fitId = fitId;
   }

   public BigDecimal getRecDesp() {
        return recDesp;
   }

   public void setRecDesp(BigDecimal recDesp) {
        markAsChanged("RECDESP", recDesp);
        this.recDesp = recDesp;
   }

   public String getTipoTransacao() {
        return tipoTransacao;
   }

   public void setTipoTransacao(String tipoTransacao) {
        markAsChanged("TIPOTRANSACAO", tipoTransacao);
        this.tipoTransacao = tipoTransacao;
   }

   public BigDecimal getNuBco() {
        return nuBco;
   }

   public void setNuBco(BigDecimal nuBco) {
        markAsChanged("NUBCO", nuBco);
        this.nuBco = nuBco;
   }

   @Override
   public String getTableName() {
        return "TGFEXB";
   }

   @Override
   public String getEntityName() {
        return "ExtratoBancario";
   }

   @Override
   public ExtratoBancario fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
        this.cnpjCpf = vo.asString("CNPJ_CPF");
        this.codBco = vo.asBigDecimal("CODBCO");
        this.fitId = vo.asString("FITID");
        this.recDesp = vo.asBigDecimal("RECDESP");
        this.tipoTransacao = vo.asString("TIPOTRANSACAO");
        this.nuBco = vo.asBigDecimal("NUBCO");
        return this;
   }
}
