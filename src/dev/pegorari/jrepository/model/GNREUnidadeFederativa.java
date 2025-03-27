package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GNREUnidadeFederativa extends AbstractSankhyaEntity<GNREUnidadeFederativa> {
   public BigDecimal getCodCampoExtraGnre() {
        return this.getVo().asBigDecimal("CODCAMPOEXTRAGNRE");
   }

   public void setCodCampoExtraGnre(BigDecimal codCampoExtraGnre) {
        markAsChanged("CODCAMPOEXTRAGNRE", codCampoExtraGnre);
   }

   public BigDecimal getCodDetGnre() {
        return this.getVo().asBigDecimal("CODDETGNRE");
   }

   public void setCodDetGnre(BigDecimal codDetGnre) {
        markAsChanged("CODDETGNRE", codDetGnre);
   }

   public BigDecimal getCodFcpstGnre() {
        return this.getVo().asBigDecimal("CODFCPSTGNRE");
   }

   public void setCodFcpstGnre(BigDecimal codFcpstGnre) {
        markAsChanged("CODFCPSTGNRE", codFcpstGnre);
   }

   public BigDecimal getCodGuf() {
        return this.getVo().asBigDecimal("CODGUF");
   }

   public void setCodGuf(BigDecimal codGuf) {
        markAsChanged("CODGUF", codGuf);
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

   public String getGerInfCampAdicGnre() {
        return this.getVo().asString("GERINFCAMPADICGNRE");
   }

   public void setGerInfCampAdicGnre(String gerInfCampAdicGnre) {
        markAsChanged("GERINFCAMPADICGNRE", gerInfCampAdicGnre);
   }

   public String getProtocoloConvenio() {
        return this.getVo().asString("PROTOCOLOCONVENIO");
   }

   public void setProtocoloConvenio(String protocoloConvenio) {
        markAsChanged("PROTOCOLOCONVENIO", protocoloConvenio);
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

   public BigDecimal getCodObr() {
        return this.getVo().asBigDecimal("CODOBR");
   }

   public void setCodObr(BigDecimal codObr) {
        markAsChanged("CODOBR", codObr);
   }

   public String getTipApuracao() {
        return this.getVo().asString("TIPAPURACAO");
   }

   public void setTipApuracao(String tipApuracao) {
        markAsChanged("TIPAPURACAO", tipApuracao);
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

   public BigDecimal getCodClsVencDimeFcpst() {
        return this.getVo().asBigDecimal("CODCLSVENCDIMEFCPST");
   }

   public void setCodClsVencDimeFcpst(BigDecimal codClsVencDimeFcpst) {
        markAsChanged("CODCLSVENCDIMEFCPST", codClsVencDimeFcpst);
   }

   public BigDecimal getCodRecDime() {
        return this.getVo().asBigDecimal("CODRECDIME");
   }

   public void setCodRecDime(BigDecimal codRecDime) {
        markAsChanged("CODRECDIME", codRecDime);
   }

   public BigDecimal getCodRecDimeFcpst() {
        return this.getVo().asBigDecimal("CODRECDIMEFCPST");
   }

   public void setCodRecDimeFcpst(BigDecimal codRecDimeFcpst) {
        markAsChanged("CODRECDIMEFCPST", codRecDimeFcpst);
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

   @Override
   public String getTableName() {
        return "TSIGUF";
   }

   @Override
   public String getEntityName() {
        return "GNREUnidadeFederativa";
   }

   @Override
   public GNREUnidadeFederativa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
