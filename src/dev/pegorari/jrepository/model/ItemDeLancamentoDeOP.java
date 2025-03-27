package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemDeLancamentoDeOP extends AbstractSankhyaEntity<ItemDeLancamentoDeOP> {
   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public BigDecimal getSeqOp() {
        return this.getVo().asBigDecimal("SEQOP");
   }

   public void setSeqOp(BigDecimal seqOp) {
        markAsChanged("SEQOP", seqOp);
   }

   public BigDecimal getIdProc() {
        return this.getVo().asBigDecimal("IDPROC");
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
   }

   public BigDecimal getCodPlp() {
        return this.getVo().asBigDecimal("CODPLP");
   }

   public void setCodPlp(BigDecimal codPlp) {
        markAsChanged("CODPLP", codPlp);
   }

   public BigDecimal getNuLop() {
        return this.getVo().asBigDecimal("NULOP");
   }

   public void setNuLop(BigDecimal nuLop) {
        markAsChanged("NULOP", nuLop);
   }

   public String getCompartilha() {
        return this.getVo().asString("COMPARTILHA");
   }

   public void setCompartilha(String compartilha) {
        markAsChanged("COMPARTILHA", compartilha);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getDescrProd() {
        return this.getVo().asString("DESCRPROD");
   }

   public void setDescrProd(String descrProd) {
        markAsChanged("DESCRPROD", descrProd);
   }

   public Timestamp getDtInicioMax() {
        return this.getVo().asTimestamp("DTINICIOMAX");
   }

   public void setDtInicioMax(Timestamp dtInicioMax) {
        markAsChanged("DTINICIOMAX", dtInicioMax);
   }

   public Timestamp getDtPrevent() {
        return this.getVo().asTimestamp("DTPREVENT");
   }

   public void setDtPrevent(Timestamp dtPrevent) {
        markAsChanged("DTPREVENT", dtPrevent);
   }

   public BigDecimal getQtdPa() {
        return this.getVo().asBigDecimal("QTDPA");
   }

   public void setQtdPa(BigDecimal qtdPa) {
        markAsChanged("QTDPA", qtdPa);
   }

   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getSeqCop() {
        return this.getVo().asBigDecimal("SEQCOP");
   }

   public void setSeqCop(BigDecimal seqCop) {
        markAsChanged("SEQCOP", seqCop);
   }

   public BigDecimal getTamLote() {
        return this.getVo().asBigDecimal("TAMLOTE");
   }

   public void setTamLote(BigDecimal tamLote) {
        markAsChanged("TAMLOTE", tamLote);
   }

   public BigDecimal getTempoAtravess() {
        return this.getVo().asBigDecimal("TEMPOATRAVESS");
   }

   public void setTempoAtravess(BigDecimal tempoAtravess) {
        markAsChanged("TEMPOATRAVESS", tempoAtravess);
   }

   public String getTipoOp() {
        return this.getVo().asString("TIPOOP");
   }

   public void setTipoOp(String tipoOp) {
        markAsChanged("TIPOOP", tipoOp);
   }

   public BigDecimal getCodParcterc() {
        return this.getVo().asBigDecimal("CODPARCTERC");
   }

   public void setCodParcterc(BigDecimal codParcterc) {
        markAsChanged("CODPARCTERC", codParcterc);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getSeqNota() {
        return this.getVo().asBigDecimal("SEQNOTA");
   }

   public void setSeqNota(BigDecimal seqNota) {
        markAsChanged("SEQNOTA", seqNota);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   @Override
   public String getTableName() {
        return "TPRILOP";
   }

   @Override
   public String getEntityName() {
        return "ItemDeLancamentoDeOP";
   }

   @Override
   public ItemDeLancamentoDeOP fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
