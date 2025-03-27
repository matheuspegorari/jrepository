package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ControleNumeracao extends AbstractSankhyaEntity<ControleNumeracao> {
   public String getArquivo() {
        return this.getVo().asString("ARQUIVO");
   }

   public void setArquivo(String arquivo) {
        markAsChanged("ARQUIVO", arquivo);
   }

   public String getAutomatico() {
        return this.getVo().asString("AUTOMATICO");
   }

   public void setAutomatico(String automatico) {
        markAsChanged("AUTOMATICO", automatico);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodMaq() {
        return this.getVo().asBigDecimal("CODMAQ");
   }

   public void setCodMaq(BigDecimal codMaq) {
        markAsChanged("CODMAQ", codMaq);
   }

   public BigDecimal getCodModDoc() {
        return this.getVo().asBigDecimal("CODMODDOC");
   }

   public void setCodModDoc(BigDecimal codModDoc) {
        markAsChanged("CODMODDOC", codModDoc);
   }

   public BigDecimal getDiasAviso() {
        return this.getVo().asBigDecimal("DIASAVISO");
   }

   public void setDiasAviso(BigDecimal diasAviso) {
        markAsChanged("DIASAVISO", diasAviso);
   }

   public Timestamp getDtVal() {
        return this.getVo().asTimestamp("DTVAL");
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
   }

   public String getImpNota() {
        return this.getVo().asString("IMPNOTA");
   }

   public void setImpNota(String impNota) {
        markAsChanged("IMPNOTA", impNota);
   }

   public BigDecimal getModNotaFis() {
        return this.getVo().asBigDecimal("MODNOTAFIS");
   }

   public void setModNotaFis(BigDecimal modNotaFis) {
        markAsChanged("MODNOTAFIS", modNotaFis);
   }

   public String getNomeArq() {
        return this.getVo().asString("NOMEARQ");
   }

   public void setNomeArq(String nomeArq) {
        markAsChanged("NOMEARQ", nomeArq);
   }

   public BigDecimal getQtdAviso() {
        return this.getVo().asBigDecimal("QTDAVISO");
   }

   public void setQtdAviso(BigDecimal qtdAviso) {
        markAsChanged("QTDAVISO", qtdAviso);
   }

   public String getSerie() {
        return this.getVo().asString("SERIE");
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
   }

   public String getTipoImpressora() {
        return this.getVo().asString("TIPOIMPRESSORA");
   }

   public void setTipoImpressora(String tipoImpressora) {
        markAsChanged("TIPOIMPRESSORA", tipoImpressora);
   }

   public BigDecimal getTotItensNota() {
        return this.getVo().asBigDecimal("TOTITENSNOTA");
   }

   public void setTotItensNota(BigDecimal totItensNota) {
        markAsChanged("TOTITENSNOTA", totItensNota);
   }

   public BigDecimal getTotServNota() {
        return this.getVo().asBigDecimal("TOTSERVNOTA");
   }

   public void setTotServNota(BigDecimal totServNota) {
        markAsChanged("TOTSERVNOTA", totServNota);
   }

   public BigDecimal getUltCod() {
        return this.getVo().asBigDecimal("ULTCOD");
   }

   public void setUltCod(BigDecimal ultCod) {
        markAsChanged("ULTCOD", ultCod);
   }

   public BigDecimal getUltNotaTalao() {
        return this.getVo().asBigDecimal("ULTNOTATALAO");
   }

   public void setUltNotaTalao(BigDecimal ultNotaTalao) {
        markAsChanged("ULTNOTATALAO", ultNotaTalao);
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
        return this;
   }
}
