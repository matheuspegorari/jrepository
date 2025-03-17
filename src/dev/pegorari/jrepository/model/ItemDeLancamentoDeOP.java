package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemDeLancamentoDeOP implements SankhyaEntity<ItemDeLancamentoDeOP> {

   private BigDecimal ordem;
   private BigDecimal seqOp;
   private BigDecimal idProc;
   private BigDecimal codPlp;
   private BigDecimal nuLop;
   private String compartilha;
   private BigDecimal codProd;
   private String descrProd;
   private Timestamp dtInicioMax;
   private Timestamp dtPrevent;
   private BigDecimal qtdPa;
   private String referencia;
   private BigDecimal seqCop;
   private BigDecimal tamLote;
   private BigDecimal tempoAtravess;
   private String tipoOp;
   private BigDecimal codParcterc;
   private BigDecimal nuNota;
   private BigDecimal seqNota;
   private String controle;

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public BigDecimal getSeqOp() {
        return seqOp;
   }

   public void setSeqOp(BigDecimal seqOp) {
        this.seqOp = seqOp;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        this.idProc = idProc;
   }

   public BigDecimal getCodPlp() {
        return codPlp;
   }

   public void setCodPlp(BigDecimal codPlp) {
        this.codPlp = codPlp;
   }

   public BigDecimal getNuLop() {
        return nuLop;
   }

   public void setNuLop(BigDecimal nuLop) {
        this.nuLop = nuLop;
   }

   public String getCompartilha() {
        return compartilha;
   }

   public void setCompartilha(String compartilha) {
        this.compartilha = compartilha;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getDescrProd() {
        return descrProd;
   }

   public void setDescrProd(String descrProd) {
        this.descrProd = descrProd;
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

   public BigDecimal getQtdPa() {
        return qtdPa;
   }

   public void setQtdPa(BigDecimal qtdPa) {
        this.qtdPa = qtdPa;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        this.referencia = referencia;
   }

   public BigDecimal getSeqCop() {
        return seqCop;
   }

   public void setSeqCop(BigDecimal seqCop) {
        this.seqCop = seqCop;
   }

   public BigDecimal getTamLote() {
        return tamLote;
   }

   public void setTamLote(BigDecimal tamLote) {
        this.tamLote = tamLote;
   }

   public BigDecimal getTempoAtravess() {
        return tempoAtravess;
   }

   public void setTempoAtravess(BigDecimal tempoAtravess) {
        this.tempoAtravess = tempoAtravess;
   }

   public String getTipoOp() {
        return tipoOp;
   }

   public void setTipoOp(String tipoOp) {
        this.tipoOp = tipoOp;
   }

   public BigDecimal getCodParcterc() {
        return codParcterc;
   }

   public void setCodParcterc(BigDecimal codParcterc) {
        this.codParcterc = codParcterc;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getSeqNota() {
        return seqNota;
   }

   public void setSeqNota(BigDecimal seqNota) {
        this.seqNota = seqNota;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   @Override
   public String getEntityName() {
        return "ItemDeLancamentoDeOP";
   }

   @Override
   public ItemDeLancamentoDeOP fromVO(DynamicVO vo) {
        this.ordem = vo.asBigDecimal("ORDEM");
        this.seqOp = vo.asBigDecimal("SEQOP");
        this.idProc = vo.asBigDecimal("IDPROC");
        this.codPlp = vo.asBigDecimal("CODPLP");
        this.nuLop = vo.asBigDecimal("NULOP");
        this.compartilha = vo.asString("COMPARTILHA");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.descrProd = vo.asString("DESCRPROD");
        this.dtInicioMax = vo.asTimestamp("DTINICIOMAX");
        this.dtPrevent = vo.asTimestamp("DTPREVENT");
        this.qtdPa = vo.asBigDecimal("QTDPA");
        this.referencia = vo.asString("REFERENCIA");
        this.seqCop = vo.asBigDecimal("SEQCOP");
        this.tamLote = vo.asBigDecimal("TAMLOTE");
        this.tempoAtravess = vo.asBigDecimal("TEMPOATRAVESS");
        this.tipoOp = vo.asString("TIPOOP");
        this.codParcterc = vo.asBigDecimal("CODPARCTERC");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.seqNota = vo.asBigDecimal("SEQNOTA");
        this.controle = vo.asString("CONTROLE");
        return this;
   }
}
