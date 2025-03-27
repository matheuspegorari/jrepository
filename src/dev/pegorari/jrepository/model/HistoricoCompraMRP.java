package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoCompraMRP extends AbstractSankhyaEntity<HistoricoCompraMRP> {
   public BigDecimal getSeqImrp() {
        return this.getVo().asBigDecimal("SEQIMRP");
   }

   public void setSeqImrp(BigDecimal seqImrp) {
        markAsChanged("SEQIMRP", seqImrp);
   }

   public String getCancelado() {
        return this.getVo().asString("CANCELADO");
   }

   public void setCancelado(String cancelado) {
        markAsChanged("CANCELADO", cancelado);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuCanc() {
        return this.getVo().asBigDecimal("CODUSUCANC");
   }

   public void setCodUsuCanc(BigDecimal codUsuCanc) {
        markAsChanged("CODUSUCANC", codUsuCanc);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public Timestamp getDtCanc() {
        return this.getVo().asTimestamp("DTCANC");
   }

   public void setDtCanc(Timestamp dtCanc) {
        markAsChanged("DTCANC", dtCanc);
   }

   public Timestamp getDtMov() {
        return this.getVo().asTimestamp("DTMOV");
   }

   public void setDtMov(Timestamp dtMov) {
        markAsChanged("DTMOV", dtMov);
   }

   public BigDecimal getNumPs() {
        return this.getVo().asBigDecimal("NUMPS");
   }

   public void setNumPs(BigDecimal numPs) {
        markAsChanged("NUMPS", numPs);
   }

   public BigDecimal getQtdMov() {
        return this.getVo().asBigDecimal("QTDMOV");
   }

   public void setQtdMov(BigDecimal qtdMov) {
        markAsChanged("QTDMOV", qtdMov);
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
        return this;
   }
}
