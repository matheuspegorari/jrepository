package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImportacaoXMLNotas extends AbstractSankhyaEntity<ImportacaoXMLNotas> {
   public Timestamp getDhEmiss() {
        return this.getVo().asTimestamp("DHEMISS");
   }

   public void setDhEmiss(Timestamp dhEmiss) {
        markAsChanged("DHEMISS", dhEmiss);
   }

   public BigDecimal getVlrNota() {
        return this.getVo().asBigDecimal("VLRNOTA");
   }

   public void setVlrNota(BigDecimal vlrNota) {
        markAsChanged("VLRNOTA", vlrNota);
   }

   public String getSituacaoMde() {
        return this.getVo().asString("SITUACAOMDE");
   }

   public void setSituacaoMde(String situacaoMde) {
        markAsChanged("SITUACAOMDE", situacaoMde);
   }

   public String getImportadoMde() {
        return this.getVo().asString("IMPORTADOMDE");
   }

   public void setImportadoMde(String importadoMde) {
        markAsChanged("IMPORTADOMDE", importadoMde);
   }

   public String getSituacaoNfe() {
        return this.getVo().asString("SITUACAONFE");
   }

   public void setSituacaoNfe(String situacaoNfe) {
        markAsChanged("SITUACAONFE", situacaoNfe);
   }

   public String getTemXml() {
        return this.getVo().asString("TEMXML");
   }

   public void setTemXml(String temXml) {
        markAsChanged("TEMXML", temXml);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public String getChaveAcesso() {
        return this.getVo().asString("CHAVEACESSO");
   }

   public void setChaveAcesso(String chaveAcesso) {
        markAsChanged("CHAVEACESSO", chaveAcesso);
   }

   public BigDecimal getCodUsuImp() {
        return this.getVo().asBigDecimal("CODUSUIMP");
   }

   public void setCodUsuImp(BigDecimal codUsuImp) {
        markAsChanged("CODUSUIMP", codUsuImp);
   }

   public BigDecimal getCodUsuProc() {
        return this.getVo().asBigDecimal("CODUSUPROC");
   }

   public void setCodUsuProc(BigDecimal codUsuProc) {
        markAsChanged("CODUSUPROC", codUsuProc);
   }

   public char[] getConfig() {
        return this.getVo().asClob("CONFIG");
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
   }

   public String getDetalhesImportacao() {
        return this.getVo().asString("DETALHESIMPORTACAO");
   }

   public void setDetalhesImportacao(String detalhesImportacao) {
        markAsChanged("DETALHESIMPORTACAO", detalhesImportacao);
   }

   public Timestamp getDhImport() {
        return this.getVo().asTimestamp("DHIMPORT");
   }

   public void setDhImport(Timestamp dhImport) {
        markAsChanged("DHIMPORT", dhImport);
   }

   public Timestamp getDhProcess() {
        return this.getVo().asTimestamp("DHPROCESS");
   }

   public void setDhProcess(Timestamp dhProcess) {
        markAsChanged("DHPROCESS", dhProcess);
   }

   public String getNomeArquivo() {
        return this.getVo().asString("NOMEARQUIVO");
   }

   public void setNomeArquivo(String nomeArquivo) {
        markAsChanged("NOMEARQUIVO", nomeArquivo);
   }

   public BigDecimal getNuArquivo() {
        return this.getVo().asBigDecimal("NUARQUIVO");
   }

   public void setNuArquivo(BigDecimal nuArquivo) {
        markAsChanged("NUARQUIVO", nuArquivo);
   }

   public BigDecimal getNumNota() {
        return this.getVo().asBigDecimal("NUMNOTA");
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getStatus() {
        return this.getVo().asBigDecimal("STATUS");
   }

   public void setStatus(BigDecimal status) {
        markAsChanged("STATUS", status);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public char[] getXml() {
        return this.getVo().asClob("XML");
   }

   public void setXml(char[] xml) {
        markAsChanged("XML", xml);
   }

   public String getXNomeEmit() {
        return this.getVo().asString("XNOMEEMIT");
   }

   public void setXNomeEmit(String xNomeEmit) {
        markAsChanged("XNOMEEMIT", xNomeEmit);
   }

   public String getXNomeToma() {
        return this.getVo().asString("XNOMETOMA");
   }

   public void setXNomeToma(String xNomeToma) {
        markAsChanged("XNOMETOMA", xNomeToma);
   }

   public String getXNomeTransp() {
        return this.getVo().asString("XNOMETRANSP");
   }

   public void setXNomeTransp(String xNomeTransp) {
        markAsChanged("XNOMETRANSP", xNomeTransp);
   }

   public String getCfopXml() {
        return this.getVo().asString("CFOPXML");
   }

   public void setCfopXml(String cfopXml) {
        markAsChanged("CFOPXML", cfopXml);
   }

   public String getCnpjDest() {
        return this.getVo().asString("CNPJDEST");
   }

   public void setCnpjDest(String cnpjDest) {
        markAsChanged("CNPJDEST", cnpjDest);
   }

   public String getCnpjExped() {
        return this.getVo().asString("CNPJEXPED");
   }

   public void setCnpjExped(String cnpjExped) {
        markAsChanged("CNPJEXPED", cnpjExped);
   }

   public String getCnpjParc() {
        return this.getVo().asString("CNPJPARC");
   }

   public void setCnpjParc(String cnpjParc) {
        markAsChanged("CNPJPARC", cnpjParc);
   }

   public String getCnpjReceb() {
        return this.getVo().asString("CNPJRECEB");
   }

   public void setCnpjReceb(String cnpjReceb) {
        markAsChanged("CNPJRECEB", cnpjReceb);
   }

   public String getCnpjRemet() {
        return this.getVo().asString("CNPJREMET");
   }

   public void setCnpjRemet(String cnpjRemet) {
        markAsChanged("CNPJREMET", cnpjRemet);
   }

   public String getCnpjTransp() {
        return this.getVo().asString("CNPJTRANSP");
   }

   public void setCnpjTransp(String cnpjTransp) {
        markAsChanged("CNPJTRANSP", cnpjTransp);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getCodParcDest() {
        return this.getVo().asBigDecimal("CODPARCDEST");
   }

   public void setCodParcDest(BigDecimal codParcDest) {
        markAsChanged("CODPARCDEST", codParcDest);
   }

   public BigDecimal getCodParcExped() {
        return this.getVo().asBigDecimal("CODPARCEXPED");
   }

   public void setCodParcExped(BigDecimal codParcExped) {
        markAsChanged("CODPARCEXPED", codParcExped);
   }

   public BigDecimal getCodParcReceb() {
        return this.getVo().asBigDecimal("CODPARCRECEB");
   }

   public void setCodParcReceb(BigDecimal codParcReceb) {
        markAsChanged("CODPARCRECEB", codParcReceb);
   }

   public BigDecimal getCodParcRemet() {
        return this.getVo().asBigDecimal("CODPARCREMET");
   }

   public void setCodParcRemet(BigDecimal codParcRemet) {
        markAsChanged("CODPARCREMET", codParcRemet);
   }

   public BigDecimal getCodParcTransp() {
        return this.getVo().asBigDecimal("CODPARCTRANSP");
   }

   public void setCodParcTransp(BigDecimal codParcTransp) {
        markAsChanged("CODPARCTRANSP", codParcTransp);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public BigDecimal getCodTipVenda() {
        return this.getVo().asBigDecimal("CODTIPVENDA");
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
   }

   public String getDiasEmissaoCalc() {
        return this.getVo().asString("DIASEMISSAOCALC");
   }

   public void setDiasEmissaoCalc(String diasEmissaoCalc) {
        markAsChanged("DIASEMISSAOCALC", diasEmissaoCalc);
   }

   public char[] getDocsRef() {
        return this.getVo().asClob("DOCSREF");
   }

   public void setDocsRef(char[] docsRef) {
        markAsChanged("DOCSREF", docsRef);
   }

   public Timestamp getDtAutorizacao() {
        return this.getVo().asTimestamp("DTAUTORIZACAO");
   }

   public void setDtAutorizacao(Timestamp dtAutorizacao) {
        markAsChanged("DTAUTORIZACAO", dtAutorizacao);
   }

   public Timestamp getDtConfirmacao() {
        return this.getVo().asTimestamp("DTCONFIRMACAO");
   }

   public void setDtConfirmacao(Timestamp dtConfirmacao) {
        markAsChanged("DTCONFIRMACAO", dtConfirmacao);
   }

   public String getEntSaiNfe() {
        return this.getVo().asString("ENTSAINFE");
   }

   public void setEntSaiNfe(String entSaiNfe) {
        markAsChanged("ENTSAINFE", entSaiNfe);
   }

   public String getNaturezaOper() {
        return this.getVo().asString("NATUREZAOPER");
   }

   public void setNaturezaOper(String naturezaOper) {
        markAsChanged("NATUREZAOPER", naturezaOper);
   }

   public String getObservacaoDfe() {
        return this.getVo().asString("OBSERVACAODFE");
   }

   public void setObservacaoDfe(String observacaoDfe) {
        markAsChanged("OBSERVACAODFE", observacaoDfe);
   }

   public String getPapelCte() {
        return this.getVo().asString("PAPELCTE");
   }

   public void setPapelCte(String papelCte) {
        markAsChanged("PAPELCTE", papelCte);
   }

   public String getPlacaVeic() {
        return this.getVo().asString("PLACAVEIC");
   }

   public void setPlacaVeic(String placaVeic) {
        markAsChanged("PLACAVEIC", placaVeic);
   }

   public BigDecimal getSerieDoc() {
        return this.getVo().asBigDecimal("SERIEDOC");
   }

   public void setSerieDoc(BigDecimal serieDoc) {
        markAsChanged("SERIEDOC", serieDoc);
   }

   public String getSituacaoCte() {
        return this.getVo().asString("SITUACAOCTE");
   }

   public void setSituacaoCte(String situacaoCte) {
        markAsChanged("SITUACAOCTE", situacaoCte);
   }

   public String getTipoCte() {
        return this.getVo().asString("TIPOCTE");
   }

   public void setTipoCte(String tipoCte) {
        markAsChanged("TIPOCTE", tipoCte);
   }

   public BigDecimal getTipoManifDfe() {
        return this.getVo().asBigDecimal("TIPOMANIFDFE");
   }

   public void setTipoManifDfe(BigDecimal tipoManifDfe) {
        markAsChanged("TIPOMANIFDFE", tipoManifDfe);
   }

   public String getTomadorCte() {
        return this.getVo().asString("TOMADORCTE");
   }

   public void setTomadorCte(String tomadorCte) {
        markAsChanged("TOMADORCTE", tomadorCte);
   }

   public String getUlteVedFe() {
        return this.getVo().asString("ULTEVEDFE");
   }

   public void setUlteVedFe(String ulteVedFe) {
        markAsChanged("ULTEVEDFE", ulteVedFe);
   }

   public String getXNomeDest() {
        return this.getVo().asString("XNOMEDEST");
   }

   public void setXNomeDest(String xNomeDest) {
        markAsChanged("XNOMEDEST", xNomeDest);
   }

   public BigDecimal getStatusWms() {
        return this.getVo().asBigDecimal("STATUSWMS");
   }

   public void setStatusWms(BigDecimal statusWms) {
        markAsChanged("STATUSWMS", statusWms);
   }

   public String getTipImpCte() {
        return this.getVo().asString("TIPIMPCTE");
   }

   public void setTipImpCte(String tipImpCte) {
        markAsChanged("TIPIMPCTE", tipImpCte);
   }

   public String getTipoNfe() {
        return this.getVo().asString("TIPONFE");
   }

   public void setTipoNfe(String tipoNfe) {
        markAsChanged("TIPONFE", tipoNfe);
   }

   public BigDecimal getNumCotacao() {
        return this.getVo().asBigDecimal("NUMCOTACAO");
   }

   public void setNumCotacao(BigDecimal numCotacao) {
        markAsChanged("NUMCOTACAO", numCotacao);
   }

   public Timestamp getDtVenc() {
        return this.getVo().asTimestamp("DTVENC");
   }

   public void setDtVenc(Timestamp dtVenc) {
        markAsChanged("DTVENC", dtVenc);
   }

   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
   }

   public BigDecimal getCodParcColetaCte() {
        return this.getVo().asBigDecimal("CODPARCCOLETACTE");
   }

   public void setCodParcColetaCte(BigDecimal codParcColetaCte) {
        markAsChanged("CODPARCCOLETACTE", codParcColetaCte);
   }

   public BigDecimal getCodParcEntregaCte() {
        return this.getVo().asBigDecimal("CODPARCENTREGACTE");
   }

   public void setCodParcEntregaCte(BigDecimal codParcEntregaCte) {
        markAsChanged("CODPARCENTREGACTE", codParcEntregaCte);
   }

   public Timestamp getDhProcAg() {
        return this.getVo().asTimestamp("DHPROCAG");
   }

   public void setDhProcAg(Timestamp dhProcAg) {
        markAsChanged("DHPROCAG", dhProcAg);
   }

   public BigDecimal getQtdProcAg() {
        return this.getVo().asBigDecimal("QTDPROCAG");
   }

   public void setQtdProcAg(BigDecimal qtdProcAg) {
        markAsChanged("QTDPROCAG", qtdProcAg);
   }

   @Override
   public String getTableName() {
        return "TGFIXN";
   }

   @Override
   public String getEntityName() {
        return "ImportacaoXMLNotas";
   }

   @Override
   public ImportacaoXMLNotas fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
