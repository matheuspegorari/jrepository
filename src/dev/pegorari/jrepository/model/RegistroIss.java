package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegistroIss extends AbstractSankhyaEntity<RegistroIss> {
   private BigDecimal vlrRedBaseIss;
   private BigDecimal vlrSub;
   private BigDecimal sequencia;
   private String serieNota;
   private BigDecimal aliqIss;
   private BigDecimal baseIss;
   private BigDecimal codCfps;
   private BigDecimal codCidDestino;
   private BigDecimal codCidExecServ;
   private BigDecimal codCidOrigem;
   private BigDecimal codEmp;
   private BigDecimal codEmpOrig;
   private String codModDocIss;
   private BigDecimal codParc;
   private BigDecimal codTribIss;
   private String digitado;
   private Timestamp dtDoc;
   private Timestamp dtFilt;
   private Timestamp dtMov;
   private String entSai;
   private BigDecimal isentasIss;
   private BigDecimal naoTribIss;
   private BigDecimal numNota;
   private BigDecimal numNota2;
   private BigDecimal nuNota;
   private BigDecimal vlrIss;
   private BigDecimal vlrMat;
   private BigDecimal vlrMatTerc;
   private String observacao;
   private String origem;
   private String retido;
   private String ufDestino;
   private String ufOrigem;
   private BigDecimal vlrCtb;
   private BigDecimal codLst;

   public BigDecimal getVlrRedBaseIss() {
        return vlrRedBaseIss;
   }

   public void setVlrRedBaseIss(BigDecimal vlrRedBaseIss) {
        this.vlrRedBaseIss = vlrRedBaseIss;
   }

   public BigDecimal getVlrSub() {
        return vlrSub;
   }

   public void setVlrSub(BigDecimal vlrSub) {
        this.vlrSub = vlrSub;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getSerieNota() {
        return serieNota;
   }

   public void setSerieNota(String serieNota) {
        this.serieNota = serieNota;
   }

   public BigDecimal getAliqIss() {
        return aliqIss;
   }

   public void setAliqIss(BigDecimal aliqIss) {
        this.aliqIss = aliqIss;
   }

   public BigDecimal getBaseIss() {
        return baseIss;
   }

   public void setBaseIss(BigDecimal baseIss) {
        this.baseIss = baseIss;
   }

   public BigDecimal getCodCfps() {
        return codCfps;
   }

   public void setCodCfps(BigDecimal codCfps) {
        this.codCfps = codCfps;
   }

   public BigDecimal getCodCidDestino() {
        return codCidDestino;
   }

   public void setCodCidDestino(BigDecimal codCidDestino) {
        this.codCidDestino = codCidDestino;
   }

   public BigDecimal getCodCidExecServ() {
        return codCidExecServ;
   }

   public void setCodCidExecServ(BigDecimal codCidExecServ) {
        this.codCidExecServ = codCidExecServ;
   }

   public BigDecimal getCodCidOrigem() {
        return codCidOrigem;
   }

   public void setCodCidOrigem(BigDecimal codCidOrigem) {
        this.codCidOrigem = codCidOrigem;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEmpOrig() {
        return codEmpOrig;
   }

   public void setCodEmpOrig(BigDecimal codEmpOrig) {
        this.codEmpOrig = codEmpOrig;
   }

   public String getCodModDocIss() {
        return codModDocIss;
   }

   public void setCodModDocIss(String codModDocIss) {
        this.codModDocIss = codModDocIss;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodTribIss() {
        return codTribIss;
   }

   public void setCodTribIss(BigDecimal codTribIss) {
        this.codTribIss = codTribIss;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public Timestamp getDtDoc() {
        return dtDoc;
   }

   public void setDtDoc(Timestamp dtDoc) {
        this.dtDoc = dtDoc;
   }

   public Timestamp getDtFilt() {
        return dtFilt;
   }

   public void setDtFilt(Timestamp dtFilt) {
        this.dtFilt = dtFilt;
   }

   public Timestamp getDtMov() {
        return dtMov;
   }

   public void setDtMov(Timestamp dtMov) {
        this.dtMov = dtMov;
   }

   public String getEntSai() {
        return entSai;
   }

   public void setEntSai(String entSai) {
        this.entSai = entSai;
   }

   public BigDecimal getIsentasIss() {
        return isentasIss;
   }

   public void setIsentasIss(BigDecimal isentasIss) {
        this.isentasIss = isentasIss;
   }

   public BigDecimal getNaoTribIss() {
        return naoTribIss;
   }

   public void setNaoTribIss(BigDecimal naoTribIss) {
        this.naoTribIss = naoTribIss;
   }

   public BigDecimal getNumNota() {
        return numNota;
   }

   public void setNumNota(BigDecimal numNota) {
        this.numNota = numNota;
   }

   public BigDecimal getNumNota2() {
        return numNota2;
   }

   public void setNumNota2(BigDecimal numNota2) {
        this.numNota2 = numNota2;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getVlrIss() {
        return vlrIss;
   }

   public void setVlrIss(BigDecimal vlrIss) {
        this.vlrIss = vlrIss;
   }

   public BigDecimal getVlrMat() {
        return vlrMat;
   }

   public void setVlrMat(BigDecimal vlrMat) {
        this.vlrMat = vlrMat;
   }

   public BigDecimal getVlrMatTerc() {
        return vlrMatTerc;
   }

   public void setVlrMatTerc(BigDecimal vlrMatTerc) {
        this.vlrMatTerc = vlrMatTerc;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   public String getOrigem() {
        return origem;
   }

   public void setOrigem(String origem) {
        this.origem = origem;
   }

   public String getRetido() {
        return retido;
   }

   public void setRetido(String retido) {
        this.retido = retido;
   }

   public String getUfDestino() {
        return ufDestino;
   }

   public void setUfDestino(String ufDestino) {
        this.ufDestino = ufDestino;
   }

   public String getUfOrigem() {
        return ufOrigem;
   }

   public void setUfOrigem(String ufOrigem) {
        this.ufOrigem = ufOrigem;
   }

   public BigDecimal getVlrCtb() {
        return vlrCtb;
   }

   public void setVlrCtb(BigDecimal vlrCtb) {
        this.vlrCtb = vlrCtb;
   }

   public BigDecimal getCodLst() {
        return codLst;
   }

   public void setCodLst(BigDecimal codLst) {
        this.codLst = codLst;
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
        this.vlrRedBaseIss = vo.asBigDecimal("VLRREDBASEISS");
        this.vlrSub = vo.asBigDecimal("VLRSUB");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.serieNota = vo.asString("SERIENOTA");
        this.aliqIss = vo.asBigDecimal("ALIQISS");
        this.baseIss = vo.asBigDecimal("BASEISS");
        this.codCfps = vo.asBigDecimal("CODCFPS");
        this.codCidDestino = vo.asBigDecimal("CODCIDDESTINO");
        this.codCidExecServ = vo.asBigDecimal("CODCIDEXECSERV");
        this.codCidOrigem = vo.asBigDecimal("CODCIDORIGEM");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEmpOrig = vo.asBigDecimal("CODEMPORIG");
        this.codModDocIss = vo.asString("CODMODDOCISS");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codTribIss = vo.asBigDecimal("CODTRIBISS");
        this.digitado = vo.asString("DIGITADO");
        this.dtDoc = vo.asTimestamp("DTDOC");
        this.dtFilt = vo.asTimestamp("DTFILT");
        this.dtMov = vo.asTimestamp("DTMOV");
        this.entSai = vo.asString("ENTSAI");
        this.isentasIss = vo.asBigDecimal("ISENTASISS");
        this.naoTribIss = vo.asBigDecimal("NAOTRIBISS");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.numNota2 = vo.asBigDecimal("NUMNOTA2");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.vlrIss = vo.asBigDecimal("VLRISS");
        this.vlrMat = vo.asBigDecimal("VLRMAT");
        this.vlrMatTerc = vo.asBigDecimal("VLRMATTERC");
        this.observacao = vo.asString("OBSERVACAO");
        this.origem = vo.asString("ORIGEM");
        this.retido = vo.asString("RETIDO");
        this.ufDestino = vo.asString("UFDESTINO");
        this.ufOrigem = vo.asString("UFORIGEM");
        this.vlrCtb = vo.asBigDecimal("VLRCTB");
        this.codLst = vo.asBigDecimal("CODLST");
        return this;
   }
}
