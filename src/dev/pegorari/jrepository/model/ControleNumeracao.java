package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ControleNumeracao extends AbstractSankhyaEntity<ControleNumeracao> {
   private String arquivo;
   private String automatico;
   private BigDecimal codEmp;
   private BigDecimal codMaq;
   private BigDecimal codModDoc;
   private BigDecimal diasAviso;
   private Timestamp dtVal;
   private String impNota;
   private BigDecimal modNotaFis;
   private String nomeArq;
   private BigDecimal qtdAviso;
   private String serie;
   private String tipoImpressora;
   private BigDecimal totItensNota;
   private BigDecimal totServNota;
   private BigDecimal ultCod;
   private BigDecimal ultNotaTalao;

   public String getArquivo() {
        return arquivo;
   }

   public void setArquivo(String arquivo) {
        markAsChanged("ARQUIVO", arquivo);
        this.arquivo = arquivo;
   }

   public String getAutomatico() {
        return automatico;
   }

   public void setAutomatico(String automatico) {
        markAsChanged("AUTOMATICO", automatico);
        this.automatico = automatico;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodMaq() {
        return codMaq;
   }

   public void setCodMaq(BigDecimal codMaq) {
        markAsChanged("CODMAQ", codMaq);
        this.codMaq = codMaq;
   }

   public BigDecimal getCodModDoc() {
        return codModDoc;
   }

   public void setCodModDoc(BigDecimal codModDoc) {
        markAsChanged("CODMODDOC", codModDoc);
        this.codModDoc = codModDoc;
   }

   public BigDecimal getDiasAviso() {
        return diasAviso;
   }

   public void setDiasAviso(BigDecimal diasAviso) {
        markAsChanged("DIASAVISO", diasAviso);
        this.diasAviso = diasAviso;
   }

   public Timestamp getDtVal() {
        return dtVal;
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
        this.dtVal = dtVal;
   }

   public String getImpNota() {
        return impNota;
   }

   public void setImpNota(String impNota) {
        markAsChanged("IMPNOTA", impNota);
        this.impNota = impNota;
   }

   public BigDecimal getModNotaFis() {
        return modNotaFis;
   }

   public void setModNotaFis(BigDecimal modNotaFis) {
        markAsChanged("MODNOTAFIS", modNotaFis);
        this.modNotaFis = modNotaFis;
   }

   public String getNomeArq() {
        return nomeArq;
   }

   public void setNomeArq(String nomeArq) {
        markAsChanged("NOMEARQ", nomeArq);
        this.nomeArq = nomeArq;
   }

   public BigDecimal getQtdAviso() {
        return qtdAviso;
   }

   public void setQtdAviso(BigDecimal qtdAviso) {
        markAsChanged("QTDAVISO", qtdAviso);
        this.qtdAviso = qtdAviso;
   }

   public String getSerie() {
        return serie;
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
        this.serie = serie;
   }

   public String getTipoImpressora() {
        return tipoImpressora;
   }

   public void setTipoImpressora(String tipoImpressora) {
        markAsChanged("TIPOIMPRESSORA", tipoImpressora);
        this.tipoImpressora = tipoImpressora;
   }

   public BigDecimal getTotItensNota() {
        return totItensNota;
   }

   public void setTotItensNota(BigDecimal totItensNota) {
        markAsChanged("TOTITENSNOTA", totItensNota);
        this.totItensNota = totItensNota;
   }

   public BigDecimal getTotServNota() {
        return totServNota;
   }

   public void setTotServNota(BigDecimal totServNota) {
        markAsChanged("TOTSERVNOTA", totServNota);
        this.totServNota = totServNota;
   }

   public BigDecimal getUltCod() {
        return ultCod;
   }

   public void setUltCod(BigDecimal ultCod) {
        markAsChanged("ULTCOD", ultCod);
        this.ultCod = ultCod;
   }

   public BigDecimal getUltNotaTalao() {
        return ultNotaTalao;
   }

   public void setUltNotaTalao(BigDecimal ultNotaTalao) {
        markAsChanged("ULTNOTATALAO", ultNotaTalao);
        this.ultNotaTalao = ultNotaTalao;
   }

   @Override
   public String getTableName() {
        return "TGFNUM";
   }

   @Override
   public String getEntityName() {
        return "ControleNumeracao";
   }

   @Override
   public ControleNumeracao fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.arquivo = vo.asString("ARQUIVO");
        this.automatico = vo.asString("AUTOMATICO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codMaq = vo.asBigDecimal("CODMAQ");
        this.codModDoc = vo.asBigDecimal("CODMODDOC");
        this.diasAviso = vo.asBigDecimal("DIASAVISO");
        this.dtVal = vo.asTimestamp("DTVAL");
        this.impNota = vo.asString("IMPNOTA");
        this.modNotaFis = vo.asBigDecimal("MODNOTAFIS");
        this.nomeArq = vo.asString("NOMEARQ");
        this.qtdAviso = vo.asBigDecimal("QTDAVISO");
        this.serie = vo.asString("SERIE");
        this.tipoImpressora = vo.asString("TIPOIMPRESSORA");
        this.totItensNota = vo.asBigDecimal("TOTITENSNOTA");
        this.totServNota = vo.asBigDecimal("TOTSERVNOTA");
        this.ultCod = vo.asBigDecimal("ULTCOD");
        this.ultNotaTalao = vo.asBigDecimal("ULTNOTATALAO");
        return this;
   }
}
