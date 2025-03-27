package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ApontamentoPA extends AbstractSankhyaEntity<ApontamentoPA> {
   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getQtdFatsp() {
        return this.getVo().asBigDecimal("QTDFATSP");
   }

   public void setQtdFatsp(BigDecimal qtdFatsp) {
        markAsChanged("QTDFATSP", qtdFatsp);
   }

   public BigDecimal getQtdApontada() {
        return this.getVo().asBigDecimal("QTDAPONTADA");
   }

   public void setQtdApontada(BigDecimal qtdApontada) {
        markAsChanged("QTDAPONTADA", qtdApontada);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public BigDecimal getCodProdpa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdpa(BigDecimal codProdpa) {
        markAsChanged("CODPRODPA", codProdpa);
   }

   public BigDecimal getSeqApa() {
        return this.getVo().asBigDecimal("SEQAPA");
   }

   public void setSeqApa(BigDecimal seqApa) {
        markAsChanged("SEQAPA", seqApa);
   }

   public BigDecimal getQtdFat() {
        return this.getVo().asBigDecimal("QTDFAT");
   }

   public void setQtdFat(BigDecimal qtdFat) {
        markAsChanged("QTDFAT", qtdFat);
   }

   public BigDecimal getNuApo() {
        return this.getVo().asBigDecimal("NUAPO");
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
   }

   public BigDecimal getCodMpe() {
        return this.getVo().asBigDecimal("CODMPE");
   }

   public void setCodMpe(BigDecimal codMpe) {
        markAsChanged("CODMPE", codMpe);
   }

   public BigDecimal getQtdPerda() {
        return this.getVo().asBigDecimal("QTDPERDA");
   }

   public void setQtdPerda(BigDecimal qtdPerda) {
        markAsChanged("QTDPERDA", qtdPerda);
   }

   public BigDecimal getQtdMpe() {
        return this.getVo().asBigDecimal("QTDMPE");
   }

   public void setQtdMpe(BigDecimal qtdMpe) {
        markAsChanged("QTDMPE", qtdMpe);
   }

   @Override
   public String getTableName() {
        return "TPRAPA";
   }

   @Override
   public String getEntityName() {
        return "ApontamentoPA";
   }

   @Override
   public ApontamentoPA fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
