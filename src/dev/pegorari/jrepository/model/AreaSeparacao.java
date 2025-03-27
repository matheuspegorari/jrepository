package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AreaSeparacao extends AbstractSankhyaEntity<AreaSeparacao> {
   public BigDecimal getCodAreaConf() {
        return this.getVo().asBigDecimal("CODAREACONF");
   }

   public void setCodAreaConf(BigDecimal codAreaConf) {
        markAsChanged("CODAREACONF", codAreaConf);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getM3Max() {
        return this.getVo().asBigDecimal("M3MAX");
   }

   public void setM3Max(BigDecimal m3Max) {
        markAsChanged("M3MAX", m3Max);
   }

   public String getNomeAreaSep() {
        return this.getVo().asString("NOMEAREASEP");
   }

   public void setNomeAreaSep(String nomeAreaSep) {
        markAsChanged("NOMEAREASEP", nomeAreaSep);
   }

   public BigDecimal getPesoMax() {
        return this.getVo().asBigDecimal("PESOMAX");
   }

   public void setPesoMax(BigDecimal pesoMax) {
        markAsChanged("PESOMAX", pesoMax);
   }

   public String getTipoSep() {
        return this.getVo().asString("TIPOSEP");
   }

   public void setTipoSep(String tipoSep) {
        markAsChanged("TIPOSEP", tipoSep);
   }

   public BigDecimal getCodAreaSep() {
        return this.getVo().asBigDecimal("CODAREASEP");
   }

   public void setCodAreaSep(BigDecimal codAreaSep) {
        markAsChanged("CODAREASEP", codAreaSep);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getImpEtiqFechVol() {
        return this.getVo().asString("IMPETIQFECHVOL");
   }

   public void setImpEtiqFechVol(String impEtiqFechVol) {
        markAsChanged("IMPETIQFECHVOL", impEtiqFechVol);
   }

   public BigDecimal getQtdUmaPed() {
        return this.getVo().asBigDecimal("QTDUMAPED");
   }

   public void setQtdUmaPed(BigDecimal qtdUmaPed) {
        markAsChanged("QTDUMAPED", qtdUmaPed);
   }

   public String getVolContinuo() {
        return this.getVo().asString("VOLCONTINUO");
   }

   public void setVolContinuo(String volContinuo) {
        markAsChanged("VOLCONTINUO", volContinuo);
   }

   public String getUsaSepAgruProd() {
        return this.getVo().asString("USASEPAGRUPROD");
   }

   public void setUsaSepAgruProd(String usaSepAgruProd) {
        markAsChanged("USASEPAGRUPROD", usaSepAgruProd);
   }

   public BigDecimal getQtPedSepAgr() {
        return this.getVo().asBigDecimal("QTPEDSEPAGR");
   }

   public void setQtPedSepAgr(BigDecimal qtPedSepAgr) {
        markAsChanged("QTPEDSEPAGR", qtPedSepAgr);
   }

   public BigDecimal getPesMaxSepAgru() {
        return this.getVo().asBigDecimal("PESMAXSEPAGRU");
   }

   public void setPesMaxSepAgru(BigDecimal pesMaxSepAgru) {
        markAsChanged("PESMAXSEPAGRU", pesMaxSepAgru);
   }

   public BigDecimal getVolCheckSepProd() {
        return this.getVo().asBigDecimal("VOLCHECKSEPROD");
   }

   public void setVolCheckSepProd(BigDecimal volCheckSepProd) {
        markAsChanged("VOLCHECKSEPROD", volCheckSepProd);
   }

   public BigDecimal getQtCheckSep() {
        return this.getVo().asBigDecimal("QTCHECKSEP");
   }

   public void setQtCheckSep(BigDecimal qtCheckSep) {
        markAsChanged("QTCHECKSEP", qtCheckSep);
   }

   public String getImpressoraEtqSep() {
        return this.getVo().asString("IMPRESSORAETQSEP");
   }

   public void setImpressoraEtqSep(String impressoraEtqSep) {
        markAsChanged("IMPRESSORAETQSEP", impressoraEtqSep);
   }

   public String getPosEsteiraSep() {
        return this.getVo().asString("POSESTEIRASEP");
   }

   public void setPosEsteiraSep(String posEsteiraSep) {
        markAsChanged("POSESTEIRASEP", posEsteiraSep);
   }

   public String getAgruparPedidosWms() {
        return this.getVo().asString("AGRUPARPEDIDOSWMS");
   }

   public void setAgruparPedidosWms(String agruparPedidosWms) {
        markAsChanged("AGRUPARPEDIDOSWMS", agruparPedidosWms);
   }

   public String getImpressoraEtqVol() {
        return this.getVo().asString("IMPRESSORAETQVOL");
   }

   public void setImpressoraEtqVol(String impressoraEtqVol) {
        markAsChanged("IMPRESSORAETQVOL", impressoraEtqVol);
   }

   public BigDecimal getModEtqVol() {
        return this.getVo().asBigDecimal("MODETQVOL");
   }

   public void setModEtqVol(BigDecimal modEtqVol) {
        markAsChanged("MODETQVOL", modEtqVol);
   }

   public BigDecimal getQtdSku() {
        return this.getVo().asBigDecimal("QTDSKU");
   }

   public void setQtdSku(BigDecimal qtdSku) {
        markAsChanged("QTDSKU", qtdSku);
   }

   public BigDecimal getToleranciaSku() {
        return this.getVo().asBigDecimal("TOLERANCIASKU");
   }

   public void setToleranciaSku(BigDecimal toleranciaSku) {
        markAsChanged("TOLERANCIASKU", toleranciaSku);
   }

   public String getQuebraPorNorma() {
        return this.getVo().asString("QUEBRAPORNORMA");
   }

   public void setQuebraPorNorma(String quebraPorNorma) {
        markAsChanged("QUEBRAPORNORMA", quebraPorNorma);
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
        this.setVo(vo);
        return this;
   }
}
