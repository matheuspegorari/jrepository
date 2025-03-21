package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AreaSeparacao extends AbstractSankhyaEntity<AreaSeparacao> {
   private BigDecimal codAreaConf;
   private Timestamp dhAlter;
   private BigDecimal m3Max;
   private String nomeAreaSep;
   private BigDecimal pesoMax;
   private String tipoSep;
   private BigDecimal codAreaSep;
   private BigDecimal codUsu;
   private String impEtiqFechVol;
   private BigDecimal qtdUmaPed;
   private String volContinuo;
   private String usaSepAgruProd;
   private BigDecimal qtPedSepAgr;
   private BigDecimal pesMaxSepAgru;
   private BigDecimal volCheckSepProd;
   private BigDecimal qtCheckSep;
   private String impressoraEtqSep;
   private String posEsteiraSep;
   private String agruparPedidosWms;
   private String impressoraEtqVol;
   private BigDecimal modEtqVol;
   private BigDecimal qtdSku;
   private BigDecimal toleranciaSku;
   private String quebraPorNorma;

   public BigDecimal getCodAreaConf() {
        return codAreaConf;
   }

   public void setCodAreaConf(BigDecimal codAreaConf) {
        markAsChanged("CODAREACONF", codAreaConf);
        this.codAreaConf = codAreaConf;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public BigDecimal getM3Max() {
        return m3Max;
   }

   public void setM3Max(BigDecimal m3Max) {
        markAsChanged("M3MAX", m3Max);
        this.m3Max = m3Max;
   }

   public String getNomeAreaSep() {
        return nomeAreaSep;
   }

   public void setNomeAreaSep(String nomeAreaSep) {
        markAsChanged("NOMEAREASEP", nomeAreaSep);
        this.nomeAreaSep = nomeAreaSep;
   }

   public BigDecimal getPesoMax() {
        return pesoMax;
   }

   public void setPesoMax(BigDecimal pesoMax) {
        markAsChanged("PESOMAX", pesoMax);
        this.pesoMax = pesoMax;
   }

   public String getTipoSep() {
        return tipoSep;
   }

   public void setTipoSep(String tipoSep) {
        markAsChanged("TIPOSEP", tipoSep);
        this.tipoSep = tipoSep;
   }

   public BigDecimal getCodAreaSep() {
        return codAreaSep;
   }

   public void setCodAreaSep(BigDecimal codAreaSep) {
        markAsChanged("CODAREASEP", codAreaSep);
        this.codAreaSep = codAreaSep;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getImpEtiqFechVol() {
        return impEtiqFechVol;
   }

   public void setImpEtiqFechVol(String impEtiqFechVol) {
        markAsChanged("IMPETIQFECHVOL", impEtiqFechVol);
        this.impEtiqFechVol = impEtiqFechVol;
   }

   public BigDecimal getQtdUmaPed() {
        return qtdUmaPed;
   }

   public void setQtdUmaPed(BigDecimal qtdUmaPed) {
        markAsChanged("QTDUMAPED", qtdUmaPed);
        this.qtdUmaPed = qtdUmaPed;
   }

   public String getVolContinuo() {
        return volContinuo;
   }

   public void setVolContinuo(String volContinuo) {
        markAsChanged("VOLCONTINUO", volContinuo);
        this.volContinuo = volContinuo;
   }

   public String getUsaSepAgruProd() {
        return usaSepAgruProd;
   }

   public void setUsaSepAgruProd(String usaSepAgruProd) {
        markAsChanged("USASEPAGRUPROD", usaSepAgruProd);
        this.usaSepAgruProd = usaSepAgruProd;
   }

   public BigDecimal getQtPedSepAgr() {
        return qtPedSepAgr;
   }

   public void setQtPedSepAgr(BigDecimal qtPedSepAgr) {
        markAsChanged("QTPEDSEPAGR", qtPedSepAgr);
        this.qtPedSepAgr = qtPedSepAgr;
   }

   public BigDecimal getPesMaxSepAgru() {
        return pesMaxSepAgru;
   }

   public void setPesMaxSepAgru(BigDecimal pesMaxSepAgru) {
        markAsChanged("PESMAXSEPAGRU", pesMaxSepAgru);
        this.pesMaxSepAgru = pesMaxSepAgru;
   }

   public BigDecimal getVolCheckSepProd() {
        return volCheckSepProd;
   }

   public void setVolCheckSepProd(BigDecimal volCheckSepProd) {
        markAsChanged("VOLCHECKSEPROD", volCheckSepProd);
        this.volCheckSepProd = volCheckSepProd;
   }

   public BigDecimal getQtCheckSep() {
        return qtCheckSep;
   }

   public void setQtCheckSep(BigDecimal qtCheckSep) {
        markAsChanged("QTCHECKSEP", qtCheckSep);
        this.qtCheckSep = qtCheckSep;
   }

   public String getImpressoraEtqSep() {
        return impressoraEtqSep;
   }

   public void setImpressoraEtqSep(String impressoraEtqSep) {
        markAsChanged("IMPRESSORAETQSEP", impressoraEtqSep);
        this.impressoraEtqSep = impressoraEtqSep;
   }

   public String getPosEsteiraSep() {
        return posEsteiraSep;
   }

   public void setPosEsteiraSep(String posEsteiraSep) {
        markAsChanged("POSESTEIRASEP", posEsteiraSep);
        this.posEsteiraSep = posEsteiraSep;
   }

   public String getAgruparPedidosWms() {
        return agruparPedidosWms;
   }

   public void setAgruparPedidosWms(String agruparPedidosWms) {
        markAsChanged("AGRUPARPEDIDOSWMS", agruparPedidosWms);
        this.agruparPedidosWms = agruparPedidosWms;
   }

   public String getImpressoraEtqVol() {
        return impressoraEtqVol;
   }

   public void setImpressoraEtqVol(String impressoraEtqVol) {
        markAsChanged("IMPRESSORAETQVOL", impressoraEtqVol);
        this.impressoraEtqVol = impressoraEtqVol;
   }

   public BigDecimal getModEtqVol() {
        return modEtqVol;
   }

   public void setModEtqVol(BigDecimal modEtqVol) {
        markAsChanged("MODETQVOL", modEtqVol);
        this.modEtqVol = modEtqVol;
   }

   public BigDecimal getQtdSku() {
        return qtdSku;
   }

   public void setQtdSku(BigDecimal qtdSku) {
        markAsChanged("QTDSKU", qtdSku);
        this.qtdSku = qtdSku;
   }

   public BigDecimal getToleranciaSku() {
        return toleranciaSku;
   }

   public void setToleranciaSku(BigDecimal toleranciaSku) {
        markAsChanged("TOLERANCIASKU", toleranciaSku);
        this.toleranciaSku = toleranciaSku;
   }

   public String getQuebraPorNorma() {
        return quebraPorNorma;
   }

   public void setQuebraPorNorma(String quebraPorNorma) {
        markAsChanged("QUEBRAPORNORMA", quebraPorNorma);
        this.quebraPorNorma = quebraPorNorma;
   }

   @Override
   public String getTableName() {
        return "TGWARS";
   }

   @Override
   public String getEntityName() {
        return "AreaSeparacao";
   }

   @Override
   public AreaSeparacao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codAreaConf = vo.asBigDecimal("CODAREACONF");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.m3Max = vo.asBigDecimal("M3MAX");
        this.nomeAreaSep = vo.asString("NOMEAREASEP");
        this.pesoMax = vo.asBigDecimal("PESOMAX");
        this.tipoSep = vo.asString("TIPOSEP");
        this.codAreaSep = vo.asBigDecimal("CODAREASEP");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.impEtiqFechVol = vo.asString("IMPETIQFECHVOL");
        this.qtdUmaPed = vo.asBigDecimal("QTDUMAPED");
        this.volContinuo = vo.asString("VOLCONTINUO");
        this.usaSepAgruProd = vo.asString("USASEPAGRUPROD");
        this.qtPedSepAgr = vo.asBigDecimal("QTPEDSEPAGR");
        this.pesMaxSepAgru = vo.asBigDecimal("PESMAXSEPAGRU");
        this.volCheckSepProd = vo.asBigDecimal("VOLCHECKSEPROD");
        this.qtCheckSep = vo.asBigDecimal("QTCHECKSEP");
        this.impressoraEtqSep = vo.asString("IMPRESSORAETQSEP");
        this.posEsteiraSep = vo.asString("POSESTEIRASEP");
        this.agruparPedidosWms = vo.asString("AGRUPARPEDIDOSWMS");
        this.impressoraEtqVol = vo.asString("IMPRESSORAETQVOL");
        this.modEtqVol = vo.asBigDecimal("MODETQVOL");
        this.qtdSku = vo.asBigDecimal("QTDSKU");
        this.toleranciaSku = vo.asBigDecimal("TOLERANCIASKU");
        this.quebraPorNorma = vo.asString("QUEBRAPORNORMA");
        return this;
   }
}
