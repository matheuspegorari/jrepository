package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class GNREUnidadeFederativa implements SankhyaEntity<GNREUnidadeFederativa> {

   private BigDecimal codCampoExtraGnre;
   private BigDecimal codDetGnre;
   private BigDecimal codFcpstGnre;
   private BigDecimal codGuf;
   private BigDecimal codProdGnre;
   private String codStGnre;
   private BigDecimal codUf;
   private String gerInfCampAdicGnre;
   private String protocoloConvenio;
   private String valorCampoExtra;
   private String versaoGnre;
   private BigDecimal codObr;
   private String tipApuracao;
   private BigDecimal codCampoExtraGnre2;
   private String vlrPersGnre;
   private BigDecimal codClsVencDime;
   private BigDecimal codClsVencDimeFcpst;
   private BigDecimal codRecDime;
   private BigDecimal codRecDimeFcpst;
   private BigDecimal tipoDoc;
   private String tipoInfo;

   public BigDecimal getCodCampoExtraGnre() {
        return codCampoExtraGnre;
   }

   public void setCodCampoExtraGnre(BigDecimal codCampoExtraGnre) {
        this.codCampoExtraGnre = codCampoExtraGnre;
   }

   public BigDecimal getCodDetGnre() {
        return codDetGnre;
   }

   public void setCodDetGnre(BigDecimal codDetGnre) {
        this.codDetGnre = codDetGnre;
   }

   public BigDecimal getCodFcpstGnre() {
        return codFcpstGnre;
   }

   public void setCodFcpstGnre(BigDecimal codFcpstGnre) {
        this.codFcpstGnre = codFcpstGnre;
   }

   public BigDecimal getCodGuf() {
        return codGuf;
   }

   public void setCodGuf(BigDecimal codGuf) {
        this.codGuf = codGuf;
   }

   public BigDecimal getCodProdGnre() {
        return codProdGnre;
   }

   public void setCodProdGnre(BigDecimal codProdGnre) {
        this.codProdGnre = codProdGnre;
   }

   public String getCodStGnre() {
        return codStGnre;
   }

   public void setCodStGnre(String codStGnre) {
        this.codStGnre = codStGnre;
   }

   public BigDecimal getCodUf() {
        return codUf;
   }

   public void setCodUf(BigDecimal codUf) {
        this.codUf = codUf;
   }

   public String getGerInfCampAdicGnre() {
        return gerInfCampAdicGnre;
   }

   public void setGerInfCampAdicGnre(String gerInfCampAdicGnre) {
        this.gerInfCampAdicGnre = gerInfCampAdicGnre;
   }

   public String getProtocoloConvenio() {
        return protocoloConvenio;
   }

   public void setProtocoloConvenio(String protocoloConvenio) {
        this.protocoloConvenio = protocoloConvenio;
   }

   public String getValorCampoExtra() {
        return valorCampoExtra;
   }

   public void setValorCampoExtra(String valorCampoExtra) {
        this.valorCampoExtra = valorCampoExtra;
   }

   public String getVersaoGnre() {
        return versaoGnre;
   }

   public void setVersaoGnre(String versaoGnre) {
        this.versaoGnre = versaoGnre;
   }

   public BigDecimal getCodObr() {
        return codObr;
   }

   public void setCodObr(BigDecimal codObr) {
        this.codObr = codObr;
   }

   public String getTipApuracao() {
        return tipApuracao;
   }

   public void setTipApuracao(String tipApuracao) {
        this.tipApuracao = tipApuracao;
   }

   public BigDecimal getCodCampoExtraGnre2() {
        return codCampoExtraGnre2;
   }

   public void setCodCampoExtraGnre2(BigDecimal codCampoExtraGnre2) {
        this.codCampoExtraGnre2 = codCampoExtraGnre2;
   }

   public String getVlrPersGnre() {
        return vlrPersGnre;
   }

   public void setVlrPersGnre(String vlrPersGnre) {
        this.vlrPersGnre = vlrPersGnre;
   }

   public BigDecimal getCodClsVencDime() {
        return codClsVencDime;
   }

   public void setCodClsVencDime(BigDecimal codClsVencDime) {
        this.codClsVencDime = codClsVencDime;
   }

   public BigDecimal getCodClsVencDimeFcpst() {
        return codClsVencDimeFcpst;
   }

   public void setCodClsVencDimeFcpst(BigDecimal codClsVencDimeFcpst) {
        this.codClsVencDimeFcpst = codClsVencDimeFcpst;
   }

   public BigDecimal getCodRecDime() {
        return codRecDime;
   }

   public void setCodRecDime(BigDecimal codRecDime) {
        this.codRecDime = codRecDime;
   }

   public BigDecimal getCodRecDimeFcpst() {
        return codRecDimeFcpst;
   }

   public void setCodRecDimeFcpst(BigDecimal codRecDimeFcpst) {
        this.codRecDimeFcpst = codRecDimeFcpst;
   }

   public BigDecimal getTipoDoc() {
        return tipoDoc;
   }

   public void setTipoDoc(BigDecimal tipoDoc) {
        this.tipoDoc = tipoDoc;
   }

   public String getTipoInfo() {
        return tipoInfo;
   }

   public void setTipoInfo(String tipoInfo) {
        this.tipoInfo = tipoInfo;
   }

   @Override
   public String getEntityName() {
        return "GNREUnidadeFederativa";
   }

   @Override
   public GNREUnidadeFederativa fromVO(DynamicVO vo) {
        this.codCampoExtraGnre = vo.asBigDecimal("CODCAMPOEXTRAGNRE");
        this.codDetGnre = vo.asBigDecimal("CODDETGNRE");
        this.codFcpstGnre = vo.asBigDecimal("CODFCPSTGNRE");
        this.codGuf = vo.asBigDecimal("CODGUF");
        this.codProdGnre = vo.asBigDecimal("CODPRODGNRE");
        this.codStGnre = vo.asString("CODSTGNRE");
        this.codUf = vo.asBigDecimal("CODUF");
        this.gerInfCampAdicGnre = vo.asString("GERINFCAMPADICGNRE");
        this.protocoloConvenio = vo.asString("PROTOCOLOCONVENIO");
        this.valorCampoExtra = vo.asString("VALORCAMPOEXTRA");
        this.versaoGnre = vo.asString("VERSAOGNRE");
        this.codObr = vo.asBigDecimal("CODOBR");
        this.tipApuracao = vo.asString("TIPAPURACAO");
        this.codCampoExtraGnre2 = vo.asBigDecimal("CODCAMPOEXTRAGNRE2");
        this.vlrPersGnre = vo.asString("VLRPERSGNRE");
        this.codClsVencDime = vo.asBigDecimal("CODCLSVENCDIME");
        this.codClsVencDimeFcpst = vo.asBigDecimal("CODCLSVENCDIMEFCPST");
        this.codRecDime = vo.asBigDecimal("CODRECDIME");
        this.codRecDimeFcpst = vo.asBigDecimal("CODRECDIMEFCPST");
        this.tipoDoc = vo.asBigDecimal("TIPODOC");
        this.tipoInfo = vo.asString("TIPOINFO");
        return this;
   }
}
