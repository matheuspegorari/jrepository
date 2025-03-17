package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ApontamentoMateriais implements SankhyaEntity<ApontamentoMateriais> {

   private String referencia;
   private String codVol;
   private BigDecimal seqApa;
   private BigDecimal nuApo;
   private String controleMp;
   private BigDecimal codProdMp;
   private String tipoUso;
   private BigDecimal qtd;
   private String vinculoSeriePa;
   private BigDecimal seqMp;
   private BigDecimal codLocalBaixa;
   private BigDecimal codMpe;
   private BigDecimal qtdMpe;
   private BigDecimal qtdPerda;

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        this.referencia = referencia;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public BigDecimal getSeqApa() {
        return seqApa;
   }

   public void setSeqApa(BigDecimal seqApa) {
        this.seqApa = seqApa;
   }

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        this.nuApo = nuApo;
   }

   public String getControleMp() {
        return controleMp;
   }

   public void setControleMp(String controleMp) {
        this.controleMp = controleMp;
   }

   public BigDecimal getCodProdMp() {
        return codProdMp;
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        this.codProdMp = codProdMp;
   }

   public String getTipoUso() {
        return tipoUso;
   }

   public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
   }

   public BigDecimal getQtd() {
        return qtd;
   }

   public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
   }

   public String getVinculoSeriePa() {
        return vinculoSeriePa;
   }

   public void setVinculoSeriePa(String vinculoSeriePa) {
        this.vinculoSeriePa = vinculoSeriePa;
   }

   public BigDecimal getSeqMp() {
        return seqMp;
   }

   public void setSeqMp(BigDecimal seqMp) {
        this.seqMp = seqMp;
   }

   public BigDecimal getCodLocalBaixa() {
        return codLocalBaixa;
   }

   public void setCodLocalBaixa(BigDecimal codLocalBaixa) {
        this.codLocalBaixa = codLocalBaixa;
   }

   public BigDecimal getCodMpe() {
        return codMpe;
   }

   public void setCodMpe(BigDecimal codMpe) {
        this.codMpe = codMpe;
   }

   public BigDecimal getQtdMpe() {
        return qtdMpe;
   }

   public void setQtdMpe(BigDecimal qtdMpe) {
        this.qtdMpe = qtdMpe;
   }

   public BigDecimal getQtdPerda() {
        return qtdPerda;
   }

   public void setQtdPerda(BigDecimal qtdPerda) {
        this.qtdPerda = qtdPerda;
   }

   @Override
   public String getEntityName() {
        return "ApontamentoMateriais";
   }

   @Override
   public ApontamentoMateriais fromVO(DynamicVO vo) {
        this.referencia = vo.asString("REFERENCIA");
        this.codVol = vo.asString("CODVOL");
        this.seqApa = vo.asBigDecimal("SEQAPA");
        this.nuApo = vo.asBigDecimal("NUAPO");
        this.controleMp = vo.asString("CONTROLEMP");
        this.codProdMp = vo.asBigDecimal("CODPRODMP");
        this.tipoUso = vo.asString("TIPOUSO");
        this.qtd = vo.asBigDecimal("QTD");
        this.vinculoSeriePa = vo.asString("VINCULOSERIEPA");
        this.seqMp = vo.asBigDecimal("SEQMP");
        this.codLocalBaixa = vo.asBigDecimal("CODLOCALBAIXA");
        this.codMpe = vo.asBigDecimal("CODMPE");
        this.qtdMpe = vo.asBigDecimal("QTDMPE");
        this.qtdPerda = vo.asBigDecimal("QTDPERDA");
        return this;
   }
}
