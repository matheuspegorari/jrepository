package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UnidadeFederativa extends AbstractSankhyaEntity<UnidadeFederativa> {
   public BigDecimal getCodDetGnre() {
        return this.getVo().asBigDecimal("CODDETGNRE");
   }

   public void setCodDetGnre(BigDecimal codDetGnre) {
        markAsChanged("CODDETGNRE", codDetGnre);
   }

   public BigDecimal getCodIbge() {
        return this.getVo().asBigDecimal("CODIBGE");
   }

   public void setCodIbge(BigDecimal codIbge) {
        markAsChanged("CODIBGE", codIbge);
   }

   public BigDecimal getCodPais() {
        return this.getVo().asBigDecimal("CODPAIS");
   }

   public void setCodPais(BigDecimal codPais) {
        markAsChanged("CODPAIS", codPais);
   }

   public BigDecimal getCodParcSecRecEst() {
        return this.getVo().asBigDecimal("CODPARCSECRECEST");
   }

   public void setCodParcSecRecEst(BigDecimal codParcSecRecEst) {
        markAsChanged("CODPARCSECRECEST", codParcSecRecEst);
   }

   public BigDecimal getCodProdGnre() {
        return this.getVo().asBigDecimal("CODPRODGNRE");
   }

   public void setCodProdGnre(BigDecimal codProdGnre) {
        markAsChanged("CODPRODGNRE", codProdGnre);
   }

   public String getCodStGnre() {
        return this.getVo().asString("CODSTGNRE");
   }

   public void setCodStGnre(String codStGnre) {
        markAsChanged("CODSTGNRE", codStGnre);
   }

   public BigDecimal getCodUf() {
        return this.getVo().asBigDecimal("CODUF");
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getProtocoloConvenio() {
        return this.getVo().asString("PROTOCOLOCONVENIO");
   }

   public void setProtocoloConvenio(String protocoloConvenio) {
        markAsChanged("PROTOCOLOCONVENIO", protocoloConvenio);
   }

   public String getUf() {
        return this.getVo().asString("UF");
   }

   public void setUf(String uf) {
        markAsChanged("UF", uf);
   }

   public BigDecimal getCodCampoExtraGnre() {
        return this.getVo().asBigDecimal("CODCAMPOEXTRAGNRE");
   }

   public void setCodCampoExtraGnre(BigDecimal codCampoExtraGnre) {
        markAsChanged("CODCAMPOEXTRAGNRE", codCampoExtraGnre);
   }

   public BigDecimal getCodFcpStGnre() {
        return this.getVo().asBigDecimal("CODFCPSTGNRE");
   }

   public void setCodFcpStGnre(BigDecimal codFcpStGnre) {
        markAsChanged("CODFCPSTGNRE", codFcpStGnre);
   }

   public String getGerInfCampAdicGnre() {
        return this.getVo().asString("GERINFCAMPADICGNRE");
   }

   public void setGerInfCampAdicGnre(String gerInfCampAdicGnre) {
        markAsChanged("GERINFCAMPADICGNRE", gerInfCampAdicGnre);
   }

   public BigDecimal getTipTitGnreFcpSt() {
        return this.getVo().asBigDecimal("TIPTITGNREFCPST");
   }

   public void setTipTitGnreFcpSt(BigDecimal tipTitGnreFcpSt) {
        markAsChanged("TIPTITGNREFCPST", tipTitGnreFcpSt);
   }

   public String getValorCampoExtra() {
        return this.getVo().asString("VALORCAMPOEXTRA");
   }

   public void setValorCampoExtra(String valorCampoExtra) {
        markAsChanged("VALORCAMPOEXTRA", valorCampoExtra);
   }

   public String getVersaoGnre() {
        return this.getVo().asString("VERSAOGNRE");
   }

   public void setVersaoGnre(String versaoGnre) {
        markAsChanged("VERSAOGNRE", versaoGnre);
   }

   public String getEstornoNfe() {
        return this.getVo().asString("ESTORNONFE");
   }

   public void setEstornoNfe(String estornoNfe) {
        markAsChanged("ESTORNONFE", estornoNfe);
   }

   public BigDecimal getCodCampoExtraGnre2() {
        return this.getVo().asBigDecimal("CODCAMPOEXTRAGNRE2");
   }

   public void setCodCampoExtraGnre2(BigDecimal codCampoExtraGnre2) {
        markAsChanged("CODCAMPOEXTRAGNRE2", codCampoExtraGnre2);
   }

   public String getVlrPersGnre() {
        return this.getVo().asString("VLRPERSGNRE");
   }

   public void setVlrPersGnre(String vlrPersGnre) {
        markAsChanged("VLRPERSGNRE", vlrPersGnre);
   }

   public BigDecimal getCodClsVencDime() {
        return this.getVo().asBigDecimal("CODCLSVENCDIME");
   }

   public void setCodClsVencDime(BigDecimal codClsVencDime) {
        markAsChanged("CODCLSVENCDIME", codClsVencDime);
   }

   public BigDecimal getCodClsVencDimeFcpSt() {
        return this.getVo().asBigDecimal("CODCLSVENCDIMEFCPST");
   }

   public void setCodClsVencDimeFcpSt(BigDecimal codClsVencDimeFcpSt) {
        markAsChanged("CODCLSVENCDIMEFCPST", codClsVencDimeFcpSt);
   }

   public BigDecimal getCodRecDime() {
        return this.getVo().asBigDecimal("CODRECDIME");
   }

   public void setCodRecDime(BigDecimal codRecDime) {
        markAsChanged("CODRECDIME", codRecDime);
   }

   public BigDecimal getCodRecDimeFcpSt() {
        return this.getVo().asBigDecimal("CODRECDIMEFCPST");
   }

   public void setCodRecDimeFcpSt(BigDecimal codRecDimeFcpSt) {
        markAsChanged("CODRECDIMEFCPST", codRecDimeFcpSt);
   }

   public BigDecimal getTipoDoc() {
        return this.getVo().asBigDecimal("TIPODOC");
   }

   public void setTipoDoc(BigDecimal tipoDoc) {
        markAsChanged("TIPODOC", tipoDoc);
   }

   public String getTipoInfo() {
        return this.getVo().asString("TIPOINFO");
   }

   public void setTipoInfo(String tipoInfo) {
        markAsChanged("TIPOINFO", tipoInfo);
   }

   public String getUsaWebServiceGnre() {
        return this.getVo().asString("USAWEBSERVICEGNRE");
   }

   public void setUsaWebServiceGnre(String usaWebServiceGnre) {
        markAsChanged("USAWEBSERVICEGNRE", usaWebServiceGnre);
   }

   public BigDecimal getTabPrecoPf() {
        return this.getVo().asBigDecimal("TABPRECOPF");
   }

   public void setTabPrecoPf(BigDecimal tabPrecoPf) {
        markAsChanged("TABPRECOPF", tabPrecoPf);
   }

   public BigDecimal getTabPrecoPmc() {
        return this.getVo().asBigDecimal("TABPRECPMC");
   }

   public void setTabPrecoPmc(BigDecimal tabPrecoPmc) {
        markAsChanged("TABPRECPMC", tabPrecoPmc);
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
        return this;
   }
}
