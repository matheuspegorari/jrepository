package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoCompraMRP extends AbstractSankhyaEntity<HistoricoCompraMRP> {
   private BigDecimal seqImrp;
   private String cancelado;
   private BigDecimal codProd;
   private BigDecimal codUsu;
   private BigDecimal codUsuCanc;
   private String controle;
   private Timestamp dtCanc;
   private Timestamp dtMov;
   private BigDecimal numPs;
   private BigDecimal qtdMov;

   public BigDecimal getSeqImrp() {
        return seqImrp;
   }

   public void setSeqImrp(BigDecimal seqImrp) {
        markAsChanged("SEQIMRP", seqImrp);
        this.seqImrp = seqImrp;
   }

   public String getCancelado() {
        return cancelado;
   }

   public void setCancelado(String cancelado) {
        markAsChanged("CANCELADO", cancelado);
        this.cancelado = cancelado;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuCanc() {
        return codUsuCanc;
   }

   public void setCodUsuCanc(BigDecimal codUsuCanc) {
        markAsChanged("CODUSUCANC", codUsuCanc);
        this.codUsuCanc = codUsuCanc;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public Timestamp getDtCanc() {
        return dtCanc;
   }

   public void setDtCanc(Timestamp dtCanc) {
        markAsChanged("DTCANC", dtCanc);
        this.dtCanc = dtCanc;
   }

   public Timestamp getDtMov() {
        return dtMov;
   }

   public void setDtMov(Timestamp dtMov) {
        markAsChanged("DTMOV", dtMov);
        this.dtMov = dtMov;
   }

   public BigDecimal getNumPs() {
        return numPs;
   }

   public void setNumPs(BigDecimal numPs) {
        markAsChanged("NUMPS", numPs);
        this.numPs = numPs;
   }

   public BigDecimal getQtdMov() {
        return qtdMov;
   }

   public void setQtdMov(BigDecimal qtdMov) {
        markAsChanged("QTDMOV", qtdMov);
        this.qtdMov = qtdMov;
   }

   @Override
   public String getTableName() {
        return "TPRHMRP";
   }

   @Override
   public String getEntityName() {
        return "HistoricoCompraMRP";
   }

   @Override
   public HistoricoCompraMRP fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.seqImrp = vo.asBigDecimal("SEQIMRP");
        this.cancelado = vo.asString("CANCELADO");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuCanc = vo.asBigDecimal("CODUSUCANC");
        this.controle = vo.asString("CONTROLE");
        this.dtCanc = vo.asTimestamp("DTCANC");
        this.dtMov = vo.asTimestamp("DTMOV");
        this.numPs = vo.asBigDecimal("NUMPS");
        this.qtdMov = vo.asBigDecimal("QTDMOV");
        return this;
   }
}
