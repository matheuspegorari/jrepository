package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ApontamentoPA extends AbstractSankhyaEntity<ApontamentoPA> {
   private String referencia;
   private BigDecimal qtdFatsp;
   private BigDecimal qtdApontada;
   private String controlePa;
   private BigDecimal codProdpa;
   private BigDecimal seqApa;
   private BigDecimal qtdFat;
   private BigDecimal nuApo;
   private BigDecimal codMpe;
   private BigDecimal qtdPerda;
   private BigDecimal qtdMpe;

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public BigDecimal getQtdFatsp() {
        return qtdFatsp;
   }

   public void setQtdFatsp(BigDecimal qtdFatsp) {
        markAsChanged("QTDFATSP", qtdFatsp);
        this.qtdFatsp = qtdFatsp;
   }

   public BigDecimal getQtdApontada() {
        return qtdApontada;
   }

   public void setQtdApontada(BigDecimal qtdApontada) {
        markAsChanged("QTDAPONTADA", qtdApontada);
        this.qtdApontada = qtdApontada;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
        this.controlePa = controlePa;
   }

   public BigDecimal getCodProdpa() {
        return codProdpa;
   }

   public void setCodProdpa(BigDecimal codProdpa) {
        markAsChanged("CODPRODPA", codProdpa);
        this.codProdpa = codProdpa;
   }

   public BigDecimal getSeqApa() {
        return seqApa;
   }

   public void setSeqApa(BigDecimal seqApa) {
        markAsChanged("SEQAPA", seqApa);
        this.seqApa = seqApa;
   }

   public BigDecimal getQtdFat() {
        return qtdFat;
   }

   public void setQtdFat(BigDecimal qtdFat) {
        markAsChanged("QTDFAT", qtdFat);
        this.qtdFat = qtdFat;
   }

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
        this.nuApo = nuApo;
   }

   public BigDecimal getCodMpe() {
        return codMpe;
   }

   public void setCodMpe(BigDecimal codMpe) {
        markAsChanged("CODMPE", codMpe);
        this.codMpe = codMpe;
   }

   public BigDecimal getQtdPerda() {
        return qtdPerda;
   }

   public void setQtdPerda(BigDecimal qtdPerda) {
        markAsChanged("QTDPERDA", qtdPerda);
        this.qtdPerda = qtdPerda;
   }

   public BigDecimal getQtdMpe() {
        return qtdMpe;
   }

   public void setQtdMpe(BigDecimal qtdMpe) {
        markAsChanged("QTDMPE", qtdMpe);
        this.qtdMpe = qtdMpe;
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
        this.referencia = vo.asString("REFERENCIA");
        this.qtdFatsp = vo.asBigDecimal("QTDFATSP");
        this.qtdApontada = vo.asBigDecimal("QTDAPONTADA");
        this.controlePa = vo.asString("CONTROLEPA");
        this.codProdpa = vo.asBigDecimal("CODPRODPA");
        this.seqApa = vo.asBigDecimal("SEQAPA");
        this.qtdFat = vo.asBigDecimal("QTDFAT");
        this.nuApo = vo.asBigDecimal("NUAPO");
        this.codMpe = vo.asBigDecimal("CODMPE");
        this.qtdPerda = vo.asBigDecimal("QTDPERDA");
        this.qtdMpe = vo.asBigDecimal("QTDMPE");
        return this;
   }
}
