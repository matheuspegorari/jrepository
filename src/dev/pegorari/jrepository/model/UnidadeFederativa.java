package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class UnidadeFederativa implements SankhyaEntity<UnidadeFederativa> {

   private BigDecimal codDetGnre;
   private BigDecimal codIbge;
   private BigDecimal codPais;
   private BigDecimal codParcSecRecEst;
   private BigDecimal codProdGnre;
   private String codStGnre;
   private BigDecimal codUf;
   private String descricao;
   private String protocoloConvenio;
   private String uf;
   private BigDecimal codCampoExtraGnre;
   private BigDecimal codFcpStGnre;
   private String gerInfCampAdicGnre;
   private BigDecimal tipTitGnreFcpst;
   private String valorCampoExtra;
   private String versaoGnre;
   private String estornoNfe;
   private BigDecimal codCampoExtraGnre2;
   private String vlrPersGnre;
   private BigDecimal codClsVencDime;
   private BigDecimal codClsVencDimeFcpst;
   private BigDecimal codRecDime;
   private BigDecimal codRecDimeFcpst;
   private BigDecimal tipoDoc;
   private String tipoInfo;
   private String usaWebServiceGnre;
   private BigDecimal tabPrecoPf;
   private BigDecimal tabPrecoPmc;

   public BigDecimal getCodDetGnre() {
        return codDetGnre;
   }

   public void setCodDetGnre(BigDecimal codDetGnre) {
        this.codDetGnre = codDetGnre;
   }

   public BigDecimal getCodIbge() {
        return codIbge;
   }

   public void setCodIbge(BigDecimal codIbge) {
        this.codIbge = codIbge;
   }

   public BigDecimal getCodPais() {
        return codPais;
   }

   public void setCodPais(BigDecimal codPais) {
        this.codPais = codPais;
   }

   public BigDecimal getCodParcSecRecEst() {
        return codParcSecRecEst;
   }

   public void setCodParcSecRecEst(BigDecimal codParcSecRecEst) {
        this.codParcSecRecEst = codParcSecRecEst;
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

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getProtocoloConvenio() {
        return protocoloConvenio;
   }

   public void setProtocoloConvenio(String protocoloConvenio) {
        this.protocoloConvenio = protocoloConvenio;
   }

   public String getUf() {
        return uf;
   }

   public void setUf(String uf) {
        this.uf = uf;
   }

   public BigDecimal getCodCampoExtraGnre() {
        return codCampoExtraGnre;
   }

   public void setCodCampoExtraGnre(BigDecimal codCampoExtraGnre) {
        this.codCampoExtraGnre = codCampoExtraGnre;
   }

   public BigDecimal getCodFcpStGnre() {
        return codFcpStGnre;
   }

   public void setCodFcpStGnre(BigDecimal codFcpStGnre) {
        this.codFcpStGnre = codFcpStGnre;
   }

   public String getGerInfCampAdicGnre() {
        return gerInfCampAdicGnre;
   }

   public void setGerInfCampAdicGnre(String gerInfCampAdicGnre) {
        this.gerInfCampAdicGnre = gerInfCampAdicGnre;
   }

   public BigDecimal getTipTitGnreFcpst() {
        return tipTitGnreFcpst;
   }

   public void setTipTitGnreFcpst(BigDecimal tipTitGnreFcpst) {
        this.tipTitGnreFcpst = tipTitGnreFcpst;
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

   public String getEstornoNfe() {
        return estornoNfe;
   }

   public void setEstornoNfe(String estornoNfe) {
        this.estornoNfe = estornoNfe;
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

   public String getUsaWebServiceGnre() {
        return usaWebServiceGnre;
   }

   public void setUsaWebServiceGnre(String usaWebServiceGnre) {
        this.usaWebServiceGnre = usaWebServiceGnre;
   }

   public BigDecimal getTabPrecoPf() {
        return tabPrecoPf;
   }

   public void setTabPrecoPf(BigDecimal tabPrecoPf) {
        this.tabPrecoPf = tabPrecoPf;
   }

   public BigDecimal getTabPrecoPmc() {
        return tabPrecoPmc;
   }

   public void setTabPrecoPmc(BigDecimal tabPrecoPmc) {
        this.tabPrecoPmc = tabPrecoPmc;
   }

   @Override
   public String getEntityName() {
        return "UnidadeFederativa";
   }

   @Override
   public UnidadeFederativa fromVO(DynamicVO vo) {
        this.codDetGnre = vo.asBigDecimal("CODDETGNRE");
        this.codIbge = vo.asBigDecimal("CODIBGE");
        this.codPais = vo.asBigDecimal("CODPAIS");
        this.codParcSecRecEst = vo.asBigDecimal("CODPARCSECRECEST");
        this.codProdGnre = vo.asBigDecimal("CODPRODGNRE");
        this.codStGnre = vo.asString("CODSTGNRE");
        this.codUf = vo.asBigDecimal("CODUF");
        this.descricao = vo.asString("DESCRICAO");
        this.protocoloConvenio = vo.asString("PROTOCOLOCONVENIO");
        this.uf = vo.asString("UF");
        this.codCampoExtraGnre = vo.asBigDecimal("CODCAMPOEXTRAGNRE");
        this.codFcpStGnre = vo.asBigDecimal("CODFCPSTGNRE");
        this.gerInfCampAdicGnre = vo.asString("GERINFCAMPADICGNRE");
        this.tipTitGnreFcpst = vo.asBigDecimal("TIPTITGNREFCPST");
        this.valorCampoExtra = vo.asString("VALORCAMPOEXTRA");
        this.versaoGnre = vo.asString("VERSAOGNRE");
        this.estornoNfe = vo.asString("ESTORNONFE");
        this.codCampoExtraGnre2 = vo.asBigDecimal("CODCAMPOEXTRAGNRE2");
        this.vlrPersGnre = vo.asString("VLRPERSGNRE");
        this.codClsVencDime = vo.asBigDecimal("CODCLSVENCDIME");
        this.codClsVencDimeFcpst = vo.asBigDecimal("CODCLSVENCDIMEFCPST");
        this.codRecDime = vo.asBigDecimal("CODRECDIME");
        this.codRecDimeFcpst = vo.asBigDecimal("CODRECDIMEFCPST");
        this.tipoDoc = vo.asBigDecimal("TIPODOC");
        this.tipoInfo = vo.asString("TIPOINFO");
        this.usaWebServiceGnre = vo.asString("USAWEBSERVICEGNRE");
        this.tabPrecoPf = vo.asBigDecimal("TABPRECOPF");
        this.tabPrecoPmc = vo.asBigDecimal("TABPRECOPMC");
        return this;
   }
}
