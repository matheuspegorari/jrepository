package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LiberacaoOcorrencia extends AbstractSankhyaEntity<LiberacaoOcorrencia> {
   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodUsuLib() {
        return this.getVo().asBigDecimal("CODUSULIB");
   }

   public void setCodUsuLib(BigDecimal codUsuLib) {
        markAsChanged("CODUSULIB", codUsuLib);
   }

   public BigDecimal getCodUsuSolicit() {
        return this.getVo().asBigDecimal("CODUSUSOLICIT");
   }

   public void setCodUsuSolicit(BigDecimal codUsuSolicit) {
        markAsChanged("CODUSUSOLICIT", codUsuSolicit);
   }

   public Timestamp getDhLiberacao() {
        return this.getVo().asTimestamp("DHLIBERACAO");
   }

   public void setDhLiberacao(Timestamp dhLiberacao) {
        markAsChanged("DHLIBERACAO", dhLiberacao);
   }

   public Timestamp getDhSolicitacao() {
        return this.getVo().asTimestamp("DHSOLICITACAO");
   }

   public void setDhSolicitacao(Timestamp dhSolicitacao) {
        markAsChanged("DHSOLICITACAO", dhSolicitacao);
   }

   public BigDecimal getNumNota() {
        return this.getVo().asBigDecimal("NUMNOTA");
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
   }

   public BigDecimal getNuSeparacao() {
        return this.getVo().asBigDecimal("NUSEPARACAO");
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        markAsChanged("NUSEPARACAO", nuSeparacao);
   }

   public BigDecimal getNuTarefa() {
        return this.getVo().asBigDecimal("NUTAREFA");
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
   }

   public BigDecimal getQtdEndAtual() {
        return this.getVo().asBigDecimal("QTDENDATUAL");
   }

   public void setQtdEndAtual(BigDecimal qtdEndAtual) {
        markAsChanged("QTDENDATUAL", qtdEndAtual);
   }

   public BigDecimal getQtdEndereco() {
        return this.getVo().asBigDecimal("QTDENDERECO");
   }

   public void setQtdEndereco(BigDecimal qtdEndereco) {
        markAsChanged("QTDENDERECO", qtdEndereco);
   }

   public BigDecimal getQtdFalta() {
        return this.getVo().asBigDecimal("QTDFALTA");
   }

   public void setQtdFalta(BigDecimal qtdFalta) {
        markAsChanged("QTDFALTA", qtdFalta);
   }

   public BigDecimal getQtdOutrosEnd() {
        return this.getVo().asBigDecimal("QTDOUTROSEND");
   }

   public void setQtdOutrosEnd(BigDecimal qtdOutrosEnd) {
        markAsChanged("QTDOUTROSEND", qtdOutrosEnd);
   }

   public BigDecimal getQtdSaidasPend() {
        return this.getVo().asBigDecimal("QTDSAIDASPEND");
   }

   public void setQtdSaidasPend(BigDecimal qtdSaidasPend) {
        markAsChanged("QTDSAIDASPEND", qtdSaidasPend);
   }

   public BigDecimal getSeqTarefa() {
        return this.getVo().asBigDecimal("SEQTAREFA");
   }

   public void setSeqTarefa(BigDecimal seqTarefa) {
        markAsChanged("SEQTAREFA", seqTarefa);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
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
        this.setVo(vo);
        return this;
   }
}
