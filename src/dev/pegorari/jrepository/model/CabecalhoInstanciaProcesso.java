package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoInstanciaProcesso implements SankhyaEntity<CabecalhoInstanciaProcesso> {

   private BigDecimal numPs;
   private String nroLote;
   private BigDecimal qtdProduzir;
   private Timestamp dhTermino;
   private BigDecimal idIProcPai;
   private String descricao;
   private BigDecimal codExec;
   private String nomeExec;
   private String controlePa;
   private String complDescPa;
   private String descrProdPa;
   private BigDecimal codParcTerc;
   private String nomeRpa;
   private String multiProduto;
   private BigDecimal qtdRpa;
   private BigDecimal codGrupoProdPa;
   private BigDecimal codProdPa;
   private BigDecimal decQtd;
   private String referencia;
   private BigDecimal codUsuInc;
   private Timestamp dhInc;
   private Timestamp dhInst;
   private BigDecimal idIProc;
   private BigDecimal idProc;
   private String idWflow;
   private BigDecimal prioridade;
   private String statusProc;
   private BigDecimal codPlp;
   private Timestamp dtInicioMax;
   private Timestamp dtPrevent;
   private BigDecimal idICop;
   private BigDecimal tempoAtravess;
   private BigDecimal nuNota;
   private BigDecimal codUsuFinal;
   private BigDecimal codParc;
   private BigDecimal saldoOp;
   private BigDecimal seqNota;
   private String periodoMps;

   public BigDecimal getNumPs() {
        return numPs;
   }

   public void setNumPs(BigDecimal numPs) {
        this.numPs = numPs;
   }

   public String getNroLote() {
        return nroLote;
   }

   public void setNroLote(String nroLote) {
        this.nroLote = nroLote;
   }

   public BigDecimal getQtdProduzir() {
        return qtdProduzir;
   }

   public void setQtdProduzir(BigDecimal qtdProduzir) {
        this.qtdProduzir = qtdProduzir;
   }

   public Timestamp getDhTermino() {
        return dhTermino;
   }

   public void setDhTermino(Timestamp dhTermino) {
        this.dhTermino = dhTermino;
   }

   public BigDecimal getIdIProcPai() {
        return idIProcPai;
   }

   public void setIdIProcPai(BigDecimal idIProcPai) {
        this.idIProcPai = idIProcPai;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public BigDecimal getCodExec() {
        return codExec;
   }

   public void setCodExec(BigDecimal codExec) {
        this.codExec = codExec;
   }

   public String getNomeExec() {
        return nomeExec;
   }

   public void setNomeExec(String nomeExec) {
        this.nomeExec = nomeExec;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public String getComplDescPa() {
        return complDescPa;
   }

   public void setComplDescPa(String complDescPa) {
        this.complDescPa = complDescPa;
   }

   public String getDescrProdPa() {
        return descrProdPa;
   }

   public void setDescrProdPa(String descrProdPa) {
        this.descrProdPa = descrProdPa;
   }

   public BigDecimal getCodParcTerc() {
        return codParcTerc;
   }

   public void setCodParcTerc(BigDecimal codParcTerc) {
        this.codParcTerc = codParcTerc;
   }

   public String getNomeRpa() {
        return nomeRpa;
   }

   public void setNomeRpa(String nomeRpa) {
        this.nomeRpa = nomeRpa;
   }

   public String getMultiProduto() {
        return multiProduto;
   }

   public void setMultiProduto(String multiProduto) {
        this.multiProduto = multiProduto;
   }

   public BigDecimal getQtdRpa() {
        return qtdRpa;
   }

   public void setQtdRpa(BigDecimal qtdRpa) {
        this.qtdRpa = qtdRpa;
   }

   public BigDecimal getCodGrupoProdPa() {
        return codGrupoProdPa;
   }

   public void setCodGrupoProdPa(BigDecimal codGrupoProdPa) {
        this.codGrupoProdPa = codGrupoProdPa;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public BigDecimal getDecQtd() {
        return decQtd;
   }

   public void setDecQtd(BigDecimal decQtd) {
        this.decQtd = decQtd;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        this.referencia = referencia;
   }

   public BigDecimal getCodUsuInc() {
        return codUsuInc;
   }

   public void setCodUsuInc(BigDecimal codUsuInc) {
        this.codUsuInc = codUsuInc;
   }

   public Timestamp getDhInc() {
        return dhInc;
   }

   public void setDhInc(Timestamp dhInc) {
        this.dhInc = dhInc;
   }

   public Timestamp getDhInst() {
        return dhInst;
   }

   public void setDhInst(Timestamp dhInst) {
        this.dhInst = dhInst;
   }

   public BigDecimal getIdIProc() {
        return idIProc;
   }

   public void setIdIProc(BigDecimal idIProc) {
        this.idIProc = idIProc;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        this.idProc = idProc;
   }

   public String getIdWflow() {
        return idWflow;
   }

   public void setIdWflow(String idWflow) {
        this.idWflow = idWflow;
   }

   public BigDecimal getPrioridade() {
        return prioridade;
   }

   public void setPrioridade(BigDecimal prioridade) {
        this.prioridade = prioridade;
   }

   public String getStatusProc() {
        return statusProc;
   }

   public void setStatusProc(String statusProc) {
        this.statusProc = statusProc;
   }

   public BigDecimal getCodPlp() {
        return codPlp;
   }

   public void setCodPlp(BigDecimal codPlp) {
        this.codPlp = codPlp;
   }

   public Timestamp getDtInicioMax() {
        return dtInicioMax;
   }

   public void setDtInicioMax(Timestamp dtInicioMax) {
        this.dtInicioMax = dtInicioMax;
   }

   public Timestamp getDtPrevent() {
        return dtPrevent;
   }

   public void setDtPrevent(Timestamp dtPrevent) {
        this.dtPrevent = dtPrevent;
   }

   public BigDecimal getIdICop() {
        return idICop;
   }

   public void setIdICop(BigDecimal idICop) {
        this.idICop = idICop;
   }

   public BigDecimal getTempoAtravess() {
        return tempoAtravess;
   }

   public void setTempoAtravess(BigDecimal tempoAtravess) {
        this.tempoAtravess = tempoAtravess;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getCodUsuFinal() {
        return codUsuFinal;
   }

   public void setCodUsuFinal(BigDecimal codUsuFinal) {
        this.codUsuFinal = codUsuFinal;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getSaldoOp() {
        return saldoOp;
   }

   public void setSaldoOp(BigDecimal saldoOp) {
        this.saldoOp = saldoOp;
   }

   public BigDecimal getSeqNota() {
        return seqNota;
   }

   public void setSeqNota(BigDecimal seqNota) {
        this.seqNota = seqNota;
   }

   public String getPeriodoMps() {
        return periodoMps;
   }

   public void setPeriodoMps(String periodoMps) {
        this.periodoMps = periodoMps;
   }

   @Override
   public String getEntityName() {
        return "CabecalhoInstanciaProcesso";
   }

   @Override
   public CabecalhoInstanciaProcesso fromVO(DynamicVO vo) {
        this.numPs = vo.asBigDecimal("NUMPS");
        this.nroLote = vo.asString("NROLOTE");
        this.qtdProduzir = vo.asBigDecimal("QTDPRODUZIR");
        this.dhTermino = vo.asTimestamp("DHTERMINO");
        this.idIProcPai = vo.asBigDecimal("IDIPROCPAI");
        this.descricao = vo.asString("DESCRICAO");
        this.codExec = vo.asBigDecimal("CODEXEC");
        this.nomeExec = vo.asString("NOMEEXEC");
        this.controlePa = vo.asString("CONTROLEPA");
        this.complDescPa = vo.asString("COMPLDESCPA");
        this.descrProdPa = vo.asString("DESCRPRODPA");
        this.codParcTerc = vo.asBigDecimal("CODPARCTERC");
        this.nomeRpa = vo.asString("NOMERPA");
        this.multiProduto = vo.asString("MULTIPRODUTO");
        this.qtdRpa = vo.asBigDecimal("QTDRPA");
        this.codGrupoProdPa = vo.asBigDecimal("CODGRUPOPRODPA");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.decQtd = vo.asBigDecimal("DECQTD");
        this.referencia = vo.asString("REFERENCIA");
        this.codUsuInc = vo.asBigDecimal("CODUSUINC");
        this.dhInc = vo.asTimestamp("DHINC");
        this.dhInst = vo.asTimestamp("DHINST");
        this.idIProc = vo.asBigDecimal("IDIPROC");
        this.idProc = vo.asBigDecimal("IDPROC");
        this.idWflow = vo.asString("IDWFLOW");
        this.prioridade = vo.asBigDecimal("PRIORIDADE");
        this.statusProc = vo.asString("STATUSPROC");
        this.codPlp = vo.asBigDecimal("CODPLP");
        this.dtInicioMax = vo.asTimestamp("DTINICIOMAX");
        this.dtPrevent = vo.asTimestamp("DTPREVENT");
        this.idICop = vo.asBigDecimal("IDICOP");
        this.tempoAtravess = vo.asBigDecimal("TEMPOATRAVESS");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.codUsuFinal = vo.asBigDecimal("CODUSUFINAL");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.saldoOp = vo.asBigDecimal("SALDOOP");
        this.seqNota = vo.asBigDecimal("SEQNOTA");
        this.periodoMps = vo.asString("PERIODOMPS");
        return this;
   }
}
