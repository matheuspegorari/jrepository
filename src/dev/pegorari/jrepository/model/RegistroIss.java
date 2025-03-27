package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegistroIss extends AbstractSankhyaEntity<RegistroIss> {
   public BigDecimal getVlrRedBaseIss() {
        return this.getVo().asBigDecimal("VLRREDBASEISS");
   }

   public void setVlrRedBaseIss(BigDecimal vlrRedBaseIss) {
        markAsChanged("VLRREDBASEISS", vlrRedBaseIss);
   }

   public BigDecimal getVlrSub() {
        return this.getVo().asBigDecimal("VLRSUB");
   }

   public void setVlrSub(BigDecimal vlrSub) {
        markAsChanged("VLRSUB", vlrSub);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getSerieNota() {
        return this.getVo().asString("SERIENOTA");
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
   }

   public BigDecimal getAliqIss() {
        return this.getVo().asBigDecimal("ALIQISS");
   }

   public void setAliqIss(BigDecimal aliqIss) {
        markAsChanged("ALIQISS", aliqIss);
   }

   public BigDecimal getBaseIss() {
        return this.getVo().asBigDecimal("BASEISS");
   }

   public void setBaseIss(BigDecimal baseIss) {
        markAsChanged("BASEISS", baseIss);
   }

   public BigDecimal getCodCfps() {
        return this.getVo().asBigDecimal("CODCFPS");
   }

   public void setCodCfps(BigDecimal codCfps) {
        markAsChanged("CODCFPS", codCfps);
   }

   public BigDecimal getCodCidDestino() {
        return this.getVo().asBigDecimal("CODCIDDESTINO");
   }

   public void setCodCidDestino(BigDecimal codCidDestino) {
        markAsChanged("CODCIDDESTINO", codCidDestino);
   }

   public BigDecimal getCodCidExecServ() {
        return this.getVo().asBigDecimal("CODCIDEXECSERV");
   }

   public void setCodCidExecServ(BigDecimal codCidExecServ) {
        markAsChanged("CODCIDEXECSERV", codCidExecServ);
   }

   public BigDecimal getCodCidOrigem() {
        return this.getVo().asBigDecimal("CODCIDORIGEM");
   }

   public void setCodCidOrigem(BigDecimal codCidOrigem) {
        markAsChanged("CODCIDORIGEM", codCidOrigem);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEmpOrig() {
        return this.getVo().asBigDecimal("CODEMPORIG");
   }

   public void setCodEmpOrig(BigDecimal codEmpOrig) {
        markAsChanged("CODEMPORIG", codEmpOrig);
   }

   public String getCodModDocIss() {
        return this.getVo().asString("CODMODDOCISS");
   }

   public void setCodModDocIss(String codModDocIss) {
        markAsChanged("CODMODDOCISS", codModDocIss);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodTribIss() {
        return this.getVo().asBigDecimal("CODTRIBISS");
   }

   public void setCodTribIss(BigDecimal codTribIss) {
        markAsChanged("CODTRIBISS", codTribIss);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public Timestamp getDtDoc() {
        return this.getVo().asTimestamp("DTDOC");
   }

   public void setDtDoc(Timestamp dtDoc) {
        markAsChanged("DTDOC", dtDoc);
   }

   public Timestamp getDtFilt() {
        return this.getVo().asTimestamp("DTFILT");
   }

   public void setDtFilt(Timestamp dtFilt) {
        markAsChanged("DTFILT", dtFilt);
   }

   public Timestamp getDtMov() {
        return this.getVo().asTimestamp("DTMOV");
   }

   public void setDtMov(Timestamp dtMov) {
        markAsChanged("DTMOV", dtMov);
   }

   public String getEntSai() {
        return this.getVo().asString("ENTSAI");
   }

   public void setEntSai(String entSai) {
        markAsChanged("ENTSAI", entSai);
   }

   public BigDecimal getIsentasIss() {
        return this.getVo().asBigDecimal("ISENTASISS");
   }

   public void setIsentasIss(BigDecimal isentasIss) {
        markAsChanged("ISENTASISS", isentasIss);
   }

   public BigDecimal getNaoTribIss() {
        return this.getVo().asBigDecimal("NAOTRIBISS");
   }

   public void setNaoTribIss(BigDecimal naoTribIss) {
        markAsChanged("NAOTRIBISS", naoTribIss);
   }

   public BigDecimal getNumNota() {
        return this.getVo().asBigDecimal("NUMNOTA");
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
   }

   public BigDecimal getNumNota2() {
        return this.getVo().asBigDecimal("NUMNOTA2");
   }

   public void setNumNota2(BigDecimal numNota2) {
        markAsChanged("NUMNOTA2", numNota2);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getVlrIss() {
        return this.getVo().asBigDecimal("VLRISS");
   }

   public void setVlrIss(BigDecimal vlrIss) {
        markAsChanged("VLRISS", vlrIss);
   }

   public BigDecimal getVlrMat() {
        return this.getVo().asBigDecimal("VLRMAT");
   }

   public void setVlrMat(BigDecimal vlrMat) {
        markAsChanged("VLRMAT", vlrMat);
   }

   public BigDecimal getVlrMatTerc() {
        return this.getVo().asBigDecimal("VLRMATTERC");
   }

   public void setVlrMatTerc(BigDecimal vlrMatTerc) {
        markAsChanged("VLRMATTERC", vlrMatTerc);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getOrigem() {
        return this.getVo().asString("ORIGEM");
   }

   public void setOrigem(String origem) {
        markAsChanged("ORIGEM", origem);
   }

   public String getRetido() {
        return this.getVo().asString("RETIDO");
   }

   public void setRetido(String retido) {
        markAsChanged("RETIDO", retido);
   }

   public String getUfDestino() {
        return this.getVo().asString("UFDESTINO");
   }

   public void setUfDestino(String ufDestino) {
        markAsChanged("UFDESTINO", ufDestino);
   }

   public String getUfOrigem() {
        return this.getVo().asString("UFORIGEM");
   }

   public void setUfOrigem(String ufOrigem) {
        markAsChanged("UFORIGEM", ufOrigem);
   }

   public BigDecimal getVlrCtb() {
        return this.getVo().asBigDecimal("VLRCTB");
   }

   public void setVlrCtb(BigDecimal vlrCtb) {
        markAsChanged("VLRCTB", vlrCtb);
   }

   public BigDecimal getCodLst() {
        return this.getVo().asBigDecimal("CODLST");
   }

   public void setCodLst(BigDecimal codLst) {
        markAsChanged("CODLST", codLst);
   }

   @Override
   public String getTableName() {
        return "TGFLIS";
   }

   @Override
   public String getEntityName() {
        return "RegistroIss";
   }

   @Override
   public RegistroIss fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
