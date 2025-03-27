package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoInstanciaProcesso extends AbstractSankhyaEntity<CabecalhoInstanciaProcesso> {
   public BigDecimal getNumps() {
        return this.getVo().asBigDecimal("NUMPS");
   }

   public void setNumps(BigDecimal numps) {
        markAsChanged("NUMPS", numps);
   }

   public String getNroLote() {
        return this.getVo().asString("NROLOTE");
   }

   public void setNroLote(String nroLote) {
        markAsChanged("NROLOTE", nroLote);
   }

   public BigDecimal getQtdProduzir() {
        return this.getVo().asBigDecimal("QTDPRODUZIR");
   }

   public void setQtdProduzir(BigDecimal qtdProduzir) {
        markAsChanged("QTDPRODUZIR", qtdProduzir);
   }

   public Timestamp getDhTermino() {
        return this.getVo().asTimestamp("DHTERMINO");
   }

   public void setDhTermino(Timestamp dhTermino) {
        markAsChanged("DHTERMINO", dhTermino);
   }

   public BigDecimal getIdIprocPai() {
        return this.getVo().asBigDecimal("IDIPROCPAI");
   }

   public void setIdIprocPai(BigDecimal idIprocPai) {
        markAsChanged("IDIPROCPAI", idIprocPai);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getCodExec() {
        return this.getVo().asBigDecimal("CODEXEC");
   }

   public void setCodExec(BigDecimal codExec) {
        markAsChanged("CODEXEC", codExec);
   }

   public String getNomeExec() {
        return this.getVo().asString("NOMEEXEC");
   }

   public void setNomeExec(String nomeExec) {
        markAsChanged("NOMEEXEC", nomeExec);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public String getComplDescPa() {
        return this.getVo().asString("COMPLDESCPA");
   }

   public void setComplDescPa(String complDescPa) {
        markAsChanged("COMPLDESCPA", complDescPa);
   }

   public String getDescrProdPa() {
        return this.getVo().asString("DESCRPRODPA");
   }

   public void setDescrProdPa(String descrProdPa) {
        markAsChanged("DESCRPRODPA", descrProdPa);
   }

   public BigDecimal getCodParcTerc() {
        return this.getVo().asBigDecimal("CODPARCTERC");
   }

   public void setCodParcTerc(BigDecimal codParcTerc) {
        markAsChanged("CODPARCTERC", codParcTerc);
   }

   public String getNomeRpa() {
        return this.getVo().asString("NOMERPA");
   }

   public void setNomeRpa(String nomeRpa) {
        markAsChanged("NOMERPA", nomeRpa);
   }

   public String getMultiProduto() {
        return this.getVo().asString("MULTIPRODUTO");
   }

   public void setMultiProduto(String multiProduto) {
        markAsChanged("MULTIPRODUTO", multiProduto);
   }

   public BigDecimal getQtdRpa() {
        return this.getVo().asBigDecimal("QTDRPA");
   }

   public void setQtdRpa(BigDecimal qtdRpa) {
        markAsChanged("QTDRPA", qtdRpa);
   }

   public BigDecimal getCodGrupoProdPa() {
        return this.getVo().asBigDecimal("CODGRUPOPRODPA");
   }

   public void setCodGrupoProdPa(BigDecimal codGrupoProdPa) {
        markAsChanged("CODGRUPOPRODPA", codGrupoProdPa);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public BigDecimal getDecQtd() {
        return this.getVo().asBigDecimal("DECQTD");
   }

   public void setDecQtd(BigDecimal decQtd) {
        markAsChanged("DECQTD", decQtd);
   }

   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getCodUsuInc() {
        return this.getVo().asBigDecimal("CODUSUINC");
   }

   public void setCodUsuInc(BigDecimal codUsuInc) {
        markAsChanged("CODUSUINC", codUsuInc);
   }

   public Timestamp getDhInc() {
        return this.getVo().asTimestamp("DHINC");
   }

   public void setDhInc(Timestamp dhInc) {
        markAsChanged("DHINC", dhInc);
   }

   public Timestamp getDhInst() {
        return this.getVo().asTimestamp("DHINST");
   }

   public void setDhInst(Timestamp dhInst) {
        markAsChanged("DHINST", dhInst);
   }

   public BigDecimal getIdIproc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
   }

   public BigDecimal getIdProc() {
        return this.getVo().asBigDecimal("IDPROC");
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
   }

   public String getIdWflow() {
        return this.getVo().asString("IDWFLOW");
   }

   public void setIdWflow(String idWflow) {
        markAsChanged("IDWFLOW", idWflow);
   }

   public BigDecimal getPrioridade() {
        return this.getVo().asBigDecimal("PRIORIDADE");
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
   }

   public String getStatusProc() {
        return this.getVo().asString("STATUSPROC");
   }

   public void setStatusProc(String statusProc) {
        markAsChanged("STATUSPROC", statusProc);
   }

   public BigDecimal getCodPlp() {
        return this.getVo().asBigDecimal("CODPLP");
   }

   public void setCodPlp(BigDecimal codPlp) {
        markAsChanged("CODPLP", codPlp);
   }

   public Timestamp getDtInicioMax() {
        return this.getVo().asTimestamp("DTINICIOMAX");
   }

   public void setDtInicioMax(Timestamp dtInicioMax) {
        markAsChanged("DTINICIOMAX", dtInicioMax);
   }

   public Timestamp getDtPrevEnt() {
        return this.getVo().asTimestamp("DTPREVENT");
   }

   public void setDtPrevEnt(Timestamp dtPrevEnt) {
        markAsChanged("DTPREVENT", dtPrevEnt);
   }

   public BigDecimal getIdIcop() {
        return this.getVo().asBigDecimal("IDICOP");
   }

   public void setIdIcop(BigDecimal idIcop) {
        markAsChanged("IDICOP", idIcop);
   }

   public BigDecimal getTempoAtravess() {
        return this.getVo().asBigDecimal("TEMPOATRAVESS");
   }

   public void setTempoAtravess(BigDecimal tempoAtravess) {
        markAsChanged("TEMPOATRAVESS", tempoAtravess);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getCodUsuFinal() {
        return this.getVo().asBigDecimal("CODUSUFINAL");
   }

   public void setCodUsuFinal(BigDecimal codUsuFinal) {
        markAsChanged("CODUSUFINAL", codUsuFinal);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getSaldoOp() {
        return this.getVo().asBigDecimal("SALDOOP");
   }

   public void setSaldoOp(BigDecimal saldoOp) {
        markAsChanged("SALDOOP", saldoOp);
   }

   public BigDecimal getSeqNota() {
        return this.getVo().asBigDecimal("SEQNOTA");
   }

   public void setSeqNota(BigDecimal seqNota) {
        markAsChanged("SEQNOTA", seqNota);
   }

   public String getPeriodoMps() {
        return this.getVo().asString("PERIODOMPS");
   }

   public void setPeriodoMps(String periodoMps) {
        markAsChanged("PERIODOMPS", periodoMps);
   }

   @Override
   public String getTableName() {
        return "TPRIPROC";
   }

   @Override
   public String getEntityName() {
        return "CabecalhoInstanciaProcesso";
   }

   @Override
   public CabecalhoInstanciaProcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
