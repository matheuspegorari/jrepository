package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExtratoBancario extends AbstractSankhyaEntity<ExtratoBancario> {
   public BigDecimal getCodCateg() {
        return this.getVo().asBigDecimal("CODCATEG");
   }

   public void setCodCateg(BigDecimal codCateg) {
        markAsChanged("CODCATEG", codCateg);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getConciliado() {
        return this.getVo().asString("CONCILIADO");
   }

   public void setConciliado(String conciliado) {
        markAsChanged("CONCILIADO", conciliado);
   }

   public BigDecimal getConvenio() {
        return this.getVo().asBigDecimal("CONVENIO");
   }

   public void setConvenio(BigDecimal convenio) {
        markAsChanged("CONVENIO", convenio);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDtLanc() {
        return this.getVo().asTimestamp("DTLANC");
   }

   public void setDtLanc(Timestamp dtLanc) {
        markAsChanged("DTLANC", dtLanc);
   }

   public String getHist() {
        return this.getVo().asString("HIST");
   }

   public void setHist(String hist) {
        markAsChanged("HIST", hist);
   }

   public String getNroCta() {
        return this.getVo().asString("NROCTA");
   }

   public void setNroCta(String nroCta) {
        markAsChanged("NROCTA", nroCta);
   }

   public BigDecimal getNroDoc() {
        return this.getVo().asBigDecimal("NRODOC");
   }

   public void setNroDoc(BigDecimal nroDoc) {
        markAsChanged("NRODOC", nroDoc);
   }

   public BigDecimal getNuExb() {
        return this.getVo().asBigDecimal("NUEXB");
   }

   public void setNuExb(BigDecimal nuExb) {
        markAsChanged("NUEXB", nuExb);
   }

   public BigDecimal getNuImport() {
        return this.getVo().asBigDecimal("NUIMPORT");
   }

   public void setNuImport(BigDecimal nuImport) {
        markAsChanged("NUIMPORT", nuImport);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
   }

   public String getCnpjCpf() {
        return this.getVo().asString("CNPJ_CPF");
   }

   public void setCnpjCpf(String cnpjCpf) {
        markAsChanged("CNPJ_CPF", cnpjCpf);
   }

   public BigDecimal getCodBco() {
        return this.getVo().asBigDecimal("CODBCO");
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
   }

   public String getFitId() {
        return this.getVo().asString("FITID");
   }

   public void setFitId(String fitId) {
        markAsChanged("FITID", fitId);
   }

   public BigDecimal getRecDesp() {
        return this.getVo().asBigDecimal("RECDESP");
   }

   public void setRecDesp(BigDecimal recDesp) {
        markAsChanged("RECDESP", recDesp);
   }

   public String getTipoTransacao() {
        return this.getVo().asString("TIPOTRANSACAO");
   }

   public void setTipoTransacao(String tipoTransacao) {
        markAsChanged("TIPOTRANSACAO", tipoTransacao);
   }

   public BigDecimal getNuBco() {
        return this.getVo().asBigDecimal("NUBCO");
   }

   public void setNuBco(BigDecimal nuBco) {
        markAsChanged("NUBCO", nuBco);
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
        this.setVo(vo);
        return this;
   }
}
