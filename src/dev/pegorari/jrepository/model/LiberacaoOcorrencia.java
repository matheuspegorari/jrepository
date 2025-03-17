package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LiberacaoOcorrencia extends AbstractSankhyaEntity<LiberacaoOcorrencia> {
   private BigDecimal codProd;
   private BigDecimal codUsuLib;
   private BigDecimal codUsuSolicit;
   private Timestamp dhLiberacao;
   private Timestamp dhSolicitacao;
   private BigDecimal numNota;
   private BigDecimal nuSeparacao;
   private BigDecimal nuTarefa;
   private BigDecimal qtdEndAtual;
   private BigDecimal qtdEndereco;
   private BigDecimal qtdFalta;
   private BigDecimal qtdOutrosEnd;
   private BigDecimal qtdSaidasPend;
   private BigDecimal seqTarefa;
   private String situacao;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodUsuLib() {
        return codUsuLib;
   }

   public void setCodUsuLib(BigDecimal codUsuLib) {
        this.codUsuLib = codUsuLib;
   }

   public BigDecimal getCodUsuSolicit() {
        return codUsuSolicit;
   }

   public void setCodUsuSolicit(BigDecimal codUsuSolicit) {
        this.codUsuSolicit = codUsuSolicit;
   }

   public Timestamp getDhLiberacao() {
        return dhLiberacao;
   }

   public void setDhLiberacao(Timestamp dhLiberacao) {
        this.dhLiberacao = dhLiberacao;
   }

   public Timestamp getDhSolicitacao() {
        return dhSolicitacao;
   }

   public void setDhSolicitacao(Timestamp dhSolicitacao) {
        this.dhSolicitacao = dhSolicitacao;
   }

   public BigDecimal getNumNota() {
        return numNota;
   }

   public void setNumNota(BigDecimal numNota) {
        this.numNota = numNota;
   }

   public BigDecimal getNuSeparacao() {
        return nuSeparacao;
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        this.nuSeparacao = nuSeparacao;
   }

   public BigDecimal getNuTarefa() {
        return nuTarefa;
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        this.nuTarefa = nuTarefa;
   }

   public BigDecimal getQtdEndAtual() {
        return qtdEndAtual;
   }

   public void setQtdEndAtual(BigDecimal qtdEndAtual) {
        this.qtdEndAtual = qtdEndAtual;
   }

   public BigDecimal getQtdEndereco() {
        return qtdEndereco;
   }

   public void setQtdEndereco(BigDecimal qtdEndereco) {
        this.qtdEndereco = qtdEndereco;
   }

   public BigDecimal getQtdFalta() {
        return qtdFalta;
   }

   public void setQtdFalta(BigDecimal qtdFalta) {
        this.qtdFalta = qtdFalta;
   }

   public BigDecimal getQtdOutrosEnd() {
        return qtdOutrosEnd;
   }

   public void setQtdOutrosEnd(BigDecimal qtdOutrosEnd) {
        this.qtdOutrosEnd = qtdOutrosEnd;
   }

   public BigDecimal getQtdSaidasPend() {
        return qtdSaidasPend;
   }

   public void setQtdSaidasPend(BigDecimal qtdSaidasPend) {
        this.qtdSaidasPend = qtdSaidasPend;
   }

   public BigDecimal getSeqTarefa() {
        return seqTarefa;
   }

   public void setSeqTarefa(BigDecimal seqTarefa) {
        this.seqTarefa = seqTarefa;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        this.situacao = situacao;
   }

   @Override
   public String getTableName() {
        return "TGWLBO";
   }

   @Override
   public String getEntityName() {
        return "LiberacaoOcorrencia";
   }

   @Override
   public LiberacaoOcorrencia fromVO(DynamicVO vo) {
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsuLib = vo.asBigDecimal("CODUSULIB");
        this.codUsuSolicit = vo.asBigDecimal("CODUSUSOLICIT");
        this.dhLiberacao = vo.asTimestamp("DHLIBERACAO");
        this.dhSolicitacao = vo.asTimestamp("DHSOLICITACAO");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.nuSeparacao = vo.asBigDecimal("NUSEPARACAO");
        this.nuTarefa = vo.asBigDecimal("NUTAREFA");
        this.qtdEndAtual = vo.asBigDecimal("QTDENDATUAL");
        this.qtdEndereco = vo.asBigDecimal("QTDENDERECO");
        this.qtdFalta = vo.asBigDecimal("QTDFALTA");
        this.qtdOutrosEnd = vo.asBigDecimal("QTDOUTROSEND");
        this.qtdSaidasPend = vo.asBigDecimal("QTDSAIDASPEND");
        this.seqTarefa = vo.asBigDecimal("SEQTAREFA");
        this.situacao = vo.asString("SITUACAO");
        return this;
   }
}
