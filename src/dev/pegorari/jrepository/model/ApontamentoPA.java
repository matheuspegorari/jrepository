package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ApontamentoPA implements SankhyaEntity<ApontamentoPA> {

   private String referencia;
   private BigDecimal qtdFatSp;
   private BigDecimal qtdApontada;
   private String controlePa;
   private BigDecimal codProdPa;
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
        this.referencia = referencia;
   }

   public BigDecimal getQtdFatSp() {
        return qtdFatSp;
   }

   public void setQtdFatSp(BigDecimal qtdFatSp) {
        this.qtdFatSp = qtdFatSp;
   }

   public BigDecimal getQtdApontada() {
        return qtdApontada;
   }

   public void setQtdApontada(BigDecimal qtdApontada) {
        this.qtdApontada = qtdApontada;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public BigDecimal getSeqApa() {
        return seqApa;
   }

   public void setSeqApa(BigDecimal seqApa) {
        this.seqApa = seqApa;
   }

   public BigDecimal getQtdFat() {
        return qtdFat;
   }

   public void setQtdFat(BigDecimal qtdFat) {
        this.qtdFat = qtdFat;
   }

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        this.nuApo = nuApo;
   }

   public BigDecimal getCodMpe() {
        return codMpe;
   }

   public void setCodMpe(BigDecimal codMpe) {
        this.codMpe = codMpe;
   }

   public BigDecimal getQtdPerda() {
        return qtdPerda;
   }

   public void setQtdPerda(BigDecimal qtdPerda) {
        this.qtdPerda = qtdPerda;
   }

   public BigDecimal getQtdMpe() {
        return qtdMpe;
   }

   public void setQtdMpe(BigDecimal qtdMpe) {
        this.qtdMpe = qtdMpe;
   }

   @Override
   public String getEntityName() {
        return "ApontamentoPA";
   }

   @Override
   public ApontamentoPA fromVO(DynamicVO vo) {
        this.referencia = vo.asString("REFERENCIA");
        this.qtdFatSp = vo.asBigDecimal("QTDFATSP");
        this.qtdApontada = vo.asBigDecimal("QTDAPONTADA");
        this.controlePa = vo.asString("CONTROLEPA");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.seqApa = vo.asBigDecimal("SEQAPA");
        this.qtdFat = vo.asBigDecimal("QTDFAT");
        this.nuApo = vo.asBigDecimal("NUAPO");
        this.codMpe = vo.asBigDecimal("CODMPE");
        this.qtdPerda = vo.asBigDecimal("QTDPERDA");
        this.qtdMpe = vo.asBigDecimal("QTDMPE");
        return this;
   }
}
