package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UnidadeFederativa extends AbstractSankhyaEntity<UnidadeFederativa> {
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
   private BigDecimal tipTitGnreFcpSt;
   private String valorCampoExtra;
   private String versaoGnre;
   private String estornoNfe;
   private BigDecimal codCampoExtraGnre2;
   private String vlrPersGnre;
   private BigDecimal codClsVencDime;
   private BigDecimal codClsVencDimeFcpSt;
   private BigDecimal codRecDime;
   private BigDecimal codRecDimeFcpSt;
   private BigDecimal tipoDoc;
   private String tipoInfo;
   private String usaWebServiceGnre;
   private BigDecimal tabPrecoPf;
   private BigDecimal tabPrecoPmc;

   public BigDecimal getCodDetGnre() {
        return codDetGnre;
   }

   public void setCodDetGnre(BigDecimal codDetGnre) {
        markAsChanged("CODDETGNRE", codDetGnre);
        this.codDetGnre = codDetGnre;
   }

   public BigDecimal getCodIbge() {
        return codIbge;
   }

   public void setCodIbge(BigDecimal codIbge) {
        markAsChanged("CODIBGE", codIbge);
        this.codIbge = codIbge;
   }

   public BigDecimal getCodPais() {
        return codPais;
   }

   public void setCodPais(BigDecimal codPais) {
        markAsChanged("CODPAIS", codPais);
        this.codPais = codPais;
   }

   public BigDecimal getCodParcSecRecEst() {
        return codParcSecRecEst;
   }

   public void setCodParcSecRecEst(BigDecimal codParcSecRecEst) {
        markAsChanged("CODPARCSECRECEST", codParcSecRecEst);
        this.codParcSecRecEst = codParcSecRecEst;
   }

   public BigDecimal getCodProdGnre() {
        return codProdGnre;
   }

   public void setCodProdGnre(BigDecimal codProdGnre) {
        markAsChanged("CODPRODGNRE", codProdGnre);
        this.codProdGnre = codProdGnre;
   }

   public String getCodStGnre() {
        return codStGnre;
   }

   public void setCodStGnre(String codStGnre) {
        markAsChanged("CODSTGNRE", codStGnre);
        this.codStGnre = codStGnre;
   }

   public BigDecimal getCodUf() {
        return codUf;
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
        this.codUf = codUf;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getProtocoloConvenio() {
        return protocoloConvenio;
   }

   public void setProtocoloConvenio(String protocoloConvenio) {
        markAsChanged("PROTOCOLOCONVENIO", protocoloConvenio);
        this.protocoloConvenio = protocoloConvenio;
   }

   public String getUf() {
        return uf;
   }

   public void setUf(String uf) {
        markAsChanged("UF", uf);
        this.uf = uf;
   }

   public BigDecimal getCodCampoExtraGnre() {
        return codCampoExtraGnre;
   }

   public void setCodCampoExtraGnre(BigDecimal codCampoExtraGnre) {
        markAsChanged("CODCAMPOEXTRAGNRE", codCampoExtraGnre);
        this.codCampoExtraGnre = codCampoExtraGnre;
   }

   public BigDecimal getCodFcpStGnre() {
        return codFcpStGnre;
   }

   public void setCodFcpStGnre(BigDecimal codFcpStGnre) {
        markAsChanged("CODFCPSTGNRE", codFcpStGnre);
        this.codFcpStGnre = codFcpStGnre;
   }

   public String getGerInfCampAdicGnre() {
        return gerInfCampAdicGnre;
   }

   public void setGerInfCampAdicGnre(String gerInfCampAdicGnre) {
        markAsChanged("GERINFCAMPADICGNRE", gerInfCampAdicGnre);
        this.gerInfCampAdicGnre = gerInfCampAdicGnre;
   }

   public BigDecimal getTipTitGnreFcpSt() {
        return tipTitGnreFcpSt;
   }

   public void setTipTitGnreFcpSt(BigDecimal tipTitGnreFcpSt) {
        markAsChanged("TIPTITGNREFCPST", tipTitGnreFcpSt);
        this.tipTitGnreFcpSt = tipTitGnreFcpSt;
   }

   public String getValorCampoExtra() {
        return valorCampoExtra;
   }

   public void setValorCampoExtra(String valorCampoExtra) {
        markAsChanged("VALORCAMPOEXTRA", valorCampoExtra);
        this.valorCampoExtra = valorCampoExtra;
   }

   public String getVersaoGnre() {
        return versaoGnre;
   }

   public void setVersaoGnre(String versaoGnre) {
        markAsChanged("VERSAOGNRE", versaoGnre);
        this.versaoGnre = versaoGnre;
   }

   public String getEstornoNfe() {
        return estornoNfe;
   }

   public void setEstornoNfe(String estornoNfe) {
        markAsChanged("ESTORNONFE", estornoNfe);
        this.estornoNfe = estornoNfe;
   }

   public BigDecimal getCodCampoExtraGnre2() {
        return codCampoExtraGnre2;
   }

   public void setCodCampoExtraGnre2(BigDecimal codCampoExtraGnre2) {
        markAsChanged("CODCAMPOEXTRAGNRE2", codCampoExtraGnre2);
        this.codCampoExtraGnre2 = codCampoExtraGnre2;
   }

   public String getVlrPersGnre() {
        return vlrPersGnre;
   }

   public void setVlrPersGnre(String vlrPersGnre) {
        markAsChanged("VLRPERSGNRE", vlrPersGnre);
        this.vlrPersGnre = vlrPersGnre;
   }

   public BigDecimal getCodClsVencDime() {
        return codClsVencDime;
   }

   public void setCodClsVencDime(BigDecimal codClsVencDime) {
        markAsChanged("CODCLSVENCDIME", codClsVencDime);
        this.codClsVencDime = codClsVencDime;
   }

   public BigDecimal getCodClsVencDimeFcpSt() {
        return codClsVencDimeFcpSt;
   }

   public void setCodClsVencDimeFcpSt(BigDecimal codClsVencDimeFcpSt) {
        markAsChanged("CODCLSVENCDIMEFCPST", codClsVencDimeFcpSt);
        this.codClsVencDimeFcpSt = codClsVencDimeFcpSt;
   }

   public BigDecimal getCodRecDime() {
        return codRecDime;
   }

   public void setCodRecDime(BigDecimal codRecDime) {
        markAsChanged("CODRECDIME", codRecDime);
        this.codRecDime = codRecDime;
   }

   public BigDecimal getCodRecDimeFcpSt() {
        return codRecDimeFcpSt;
   }

   public void setCodRecDimeFcpSt(BigDecimal codRecDimeFcpSt) {
        markAsChanged("CODRECDIMEFCPST", codRecDimeFcpSt);
        this.codRecDimeFcpSt = codRecDimeFcpSt;
   }

   public BigDecimal getTipoDoc() {
        return tipoDoc;
   }

   public void setTipoDoc(BigDecimal tipoDoc) {
        markAsChanged("TIPODOC", tipoDoc);
        this.tipoDoc = tipoDoc;
   }

   public String getTipoInfo() {
        return tipoInfo;
   }

   public void setTipoInfo(String tipoInfo) {
        markAsChanged("TIPOINFO", tipoInfo);
        this.tipoInfo = tipoInfo;
   }

   public String getUsaWebServiceGnre() {
        return usaWebServiceGnre;
   }

   public void setUsaWebServiceGnre(String usaWebServiceGnre) {
        markAsChanged("USAWEBSERVICEGNRE", usaWebServiceGnre);
        this.usaWebServiceGnre = usaWebServiceGnre;
   }

   public BigDecimal getTabPrecoPf() {
        return tabPrecoPf;
   }

   public void setTabPrecoPf(BigDecimal tabPrecoPf) {
        markAsChanged("TABPRECOPF", tabPrecoPf);
        this.tabPrecoPf = tabPrecoPf;
   }

   public BigDecimal getTabPrecoPmc() {
        return tabPrecoPmc;
   }

   public void setTabPrecoPmc(BigDecimal tabPrecoPmc) {
        markAsChanged("TABPRECPMC", tabPrecoPmc);
        this.tabPrecoPmc = tabPrecoPmc;
   }

   @Override
   public String getTableName() {
        return "TSIUFS";
   }

   @Override
   public String getEntityName() {
        return "UnidadeFederativa";
   }

   @Override
   public UnidadeFederativa fromVO(DynamicVO vo) {
        this.setVo(vo);
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
        this.tipTitGnreFcpSt = vo.asBigDecimal("TIPTITGNREFCPST");
        this.valorCampoExtra = vo.asString("VALORCAMPOEXTRA");
        this.versaoGnre = vo.asString("VERSAOGNRE");
        this.estornoNfe = vo.asString("ESTORNONFE");
        this.codCampoExtraGnre2 = vo.asBigDecimal("CODCAMPOEXTRAGNRE2");
        this.vlrPersGnre = vo.asString("VLRPERSGNRE");
        this.codClsVencDime = vo.asBigDecimal("CODCLSVENCDIME");
        this.codClsVencDimeFcpSt = vo.asBigDecimal("CODCLSVENCDIMEFCPST");
        this.codRecDime = vo.asBigDecimal("CODRECDIME");
        this.codRecDimeFcpSt = vo.asBigDecimal("CODRECDIMEFCPST");
        this.tipoDoc = vo.asBigDecimal("TIPODOC");
        this.tipoInfo = vo.asString("TIPOINFO");
        this.usaWebServiceGnre = vo.asString("USAWEBSERVICEGNRE");
        this.tabPrecoPf = vo.asBigDecimal("TABPRECOPF");
        this.tabPrecoPmc = vo.asBigDecimal("TABPRECPMC");
        return this;
   }
}
