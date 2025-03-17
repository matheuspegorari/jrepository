package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImportacaoXMLNotas implements SankhyaEntity<ImportacaoXMLNotas> {

   private Timestamp dhEmiss;
   private BigDecimal vlrNota;
   private String situacaoMde;
   private String importadoMde;
   private String situacaoNfe;
   private String temXml;
   private BigDecimal codEmp;
   private BigDecimal codVend;
   private BigDecimal codParc;
   private BigDecimal codTipOper;
   private String chaveAcesso;
   private BigDecimal codUsuImp;
   private BigDecimal codUsuProc;
   private char[] config;
   private String detalhesImportacao;
   private Timestamp dhImport;
   private Timestamp dhProcess;
   private String nomeArquivo;
   private BigDecimal nuArquivo;
   private BigDecimal numNota;
   private BigDecimal nuNota;
   private BigDecimal status;
   private String tipo;
   private char[] xml;
   private String xNomeEmit;
   private String xNomeToma;
   private String xNomeTransp;
   private String cfopXml;
   private String cnpjDest;
   private String cnpjExped;
   private String cnpjParc;
   private String cnpjReceb;
   private String cnpjRemet;
   private String cnpjTransp;
   private BigDecimal codCencus;
   private BigDecimal codNat;
   private BigDecimal codParcDest;
   private BigDecimal codParcExped;
   private BigDecimal codParcReceb;
   private BigDecimal codParcRemet;
   private BigDecimal codParcTransp;
   private BigDecimal codProj;
   private BigDecimal codTipVenda;
   private String diasEmissaoCalc;
   private char[] docsRef;
   private Timestamp dtAutorizacao;
   private Timestamp dtConfirmacao;
   private String entSaiNfe;
   private String naturezaOper;
   private String observacaoDfe;
   private String papelCte;
   private String placaVeic;
   private BigDecimal serieDoc;
   private String situacaoCte;
   private String tipoCte;
   private BigDecimal tipoManifDfe;
   private String tomadorCte;
   private String ulteveDfe;
   private String xNomeDest;
   private BigDecimal statusWms;
   private String tipImpCte;
   private String tipoNfe;
   private BigDecimal numCotacao;
   private Timestamp dtVenc;
   private BigDecimal nuFin;
   private BigDecimal codParcColetaCte;
   private BigDecimal codParcEntregaCte;
   private Timestamp dhProcAg;
   private BigDecimal qtdProcAg;

   public Timestamp getDhEmiss() {
        return dhEmiss;
   }

   public void setDhEmiss(Timestamp dhEmiss) {
        this.dhEmiss = dhEmiss;
   }

   public BigDecimal getVlrNota() {
        return vlrNota;
   }

   public void setVlrNota(BigDecimal vlrNota) {
        this.vlrNota = vlrNota;
   }

   public String getSituacaoMde() {
        return situacaoMde;
   }

   public void setSituacaoMde(String situacaoMde) {
        this.situacaoMde = situacaoMde;
   }

   public String getImportadoMde() {
        return importadoMde;
   }

   public void setImportadoMde(String importadoMde) {
        this.importadoMde = importadoMde;
   }

   public String getSituacaoNfe() {
        return situacaoNfe;
   }

   public void setSituacaoNfe(String situacaoNfe) {
        this.situacaoNfe = situacaoNfe;
   }

   public String getTemXml() {
        return temXml;
   }

   public void setTemXml(String temXml) {
        this.temXml = temXml;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        this.codVend = codVend;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        this.codTipOper = codTipOper;
   }

   public String getChaveAcesso() {
        return chaveAcesso;
   }

   public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
   }

   public BigDecimal getCodUsuImp() {
        return codUsuImp;
   }

   public void setCodUsuImp(BigDecimal codUsuImp) {
        this.codUsuImp = codUsuImp;
   }

   public BigDecimal getCodUsuProc() {
        return codUsuProc;
   }

   public void setCodUsuProc(BigDecimal codUsuProc) {
        this.codUsuProc = codUsuProc;
   }

   public char[] getConfig() {
        return config;
   }

   public void setConfig(char[] config) {
        this.config = config;
   }

   public String getDetalhesImportacao() {
        return detalhesImportacao;
   }

   public void setDetalhesImportacao(String detalhesImportacao) {
        this.detalhesImportacao = detalhesImportacao;
   }

   public Timestamp getDhImport() {
        return dhImport;
   }

   public void setDhImport(Timestamp dhImport) {
        this.dhImport = dhImport;
   }

   public Timestamp getDhProcess() {
        return dhProcess;
   }

   public void setDhProcess(Timestamp dhProcess) {
        this.dhProcess = dhProcess;
   }

   public String getNomeArquivo() {
        return nomeArquivo;
   }

   public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
   }

   public BigDecimal getNuArquivo() {
        return nuArquivo;
   }

   public void setNuArquivo(BigDecimal nuArquivo) {
        this.nuArquivo = nuArquivo;
   }

   public BigDecimal getNumNota() {
        return numNota;
   }

   public void setNumNota(BigDecimal numNota) {
        this.numNota = numNota;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getStatus() {
        return status;
   }

   public void setStatus(BigDecimal status) {
        this.status = status;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public char[] getXml() {
        return xml;
   }

   public void setXml(char[] xml) {
        this.xml = xml;
   }

   public String getXNomeEmit() {
        return xNomeEmit;
   }

   public void setXNomeEmit(String xNomeEmit) {
        this.xNomeEmit = xNomeEmit;
   }

   public String getXNomeToma() {
        return xNomeToma;
   }

   public void setXNomeToma(String xNomeToma) {
        this.xNomeToma = xNomeToma;
   }

   public String getXNomeTransp() {
        return xNomeTransp;
   }

   public void setXNomeTransp(String xNomeTransp) {
        this.xNomeTransp = xNomeTransp;
   }

   public String getCfopXml() {
        return cfopXml;
   }

   public void setCfopXml(String cfopXml) {
        this.cfopXml = cfopXml;
   }

   public String getCnpjDest() {
        return cnpjDest;
   }

   public void setCnpjDest(String cnpjDest) {
        this.cnpjDest = cnpjDest;
   }

   public String getCnpjExped() {
        return cnpjExped;
   }

   public void setCnpjExped(String cnpjExped) {
        this.cnpjExped = cnpjExped;
   }

   public String getCnpjParc() {
        return cnpjParc;
   }

   public void setCnpjParc(String cnpjParc) {
        this.cnpjParc = cnpjParc;
   }

   public String getCnpjReceb() {
        return cnpjReceb;
   }

   public void setCnpjReceb(String cnpjReceb) {
        this.cnpjReceb = cnpjReceb;
   }

   public String getCnpjRemet() {
        return cnpjRemet;
   }

   public void setCnpjRemet(String cnpjRemet) {
        this.cnpjRemet = cnpjRemet;
   }

   public String getCnpjTransp() {
        return cnpjTransp;
   }

   public void setCnpjTransp(String cnpjTransp) {
        this.cnpjTransp = cnpjTransp;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        this.codCencus = codCencus;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        this.codNat = codNat;
   }

   public BigDecimal getCodParcDest() {
        return codParcDest;
   }

   public void setCodParcDest(BigDecimal codParcDest) {
        this.codParcDest = codParcDest;
   }

   public BigDecimal getCodParcExped() {
        return codParcExped;
   }

   public void setCodParcExped(BigDecimal codParcExped) {
        this.codParcExped = codParcExped;
   }

   public BigDecimal getCodParcReceb() {
        return codParcReceb;
   }

   public void setCodParcReceb(BigDecimal codParcReceb) {
        this.codParcReceb = codParcReceb;
   }

   public BigDecimal getCodParcRemet() {
        return codParcRemet;
   }

   public void setCodParcRemet(BigDecimal codParcRemet) {
        this.codParcRemet = codParcRemet;
   }

   public BigDecimal getCodParcTransp() {
        return codParcTransp;
   }

   public void setCodParcTransp(BigDecimal codParcTransp) {
        this.codParcTransp = codParcTransp;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        this.codProj = codProj;
   }

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        this.codTipVenda = codTipVenda;
   }

   public String getDiasEmissaoCalc() {
        return diasEmissaoCalc;
   }

   public void setDiasEmissaoCalc(String diasEmissaoCalc) {
        this.diasEmissaoCalc = diasEmissaoCalc;
   }

   public char[] getDocsRef() {
        return docsRef;
   }

   public void setDocsRef(char[] docsRef) {
        this.docsRef = docsRef;
   }

   public Timestamp getDtAutorizacao() {
        return dtAutorizacao;
   }

   public void setDtAutorizacao(Timestamp dtAutorizacao) {
        this.dtAutorizacao = dtAutorizacao;
   }

   public Timestamp getDtConfirmacao() {
        return dtConfirmacao;
   }

   public void setDtConfirmacao(Timestamp dtConfirmacao) {
        this.dtConfirmacao = dtConfirmacao;
   }

   public String getEntSaiNfe() {
        return entSaiNfe;
   }

   public void setEntSaiNfe(String entSaiNfe) {
        this.entSaiNfe = entSaiNfe;
   }

   public String getNaturezaOper() {
        return naturezaOper;
   }

   public void setNaturezaOper(String naturezaOper) {
        this.naturezaOper = naturezaOper;
   }

   public String getObservacaoDfe() {
        return observacaoDfe;
   }

   public void setObservacaoDfe(String observacaoDfe) {
        this.observacaoDfe = observacaoDfe;
   }

   public String getPapelCte() {
        return papelCte;
   }

   public void setPapelCte(String papelCte) {
        this.papelCte = papelCte;
   }

   public String getPlacaVeic() {
        return placaVeic;
   }

   public void setPlacaVeic(String placaVeic) {
        this.placaVeic = placaVeic;
   }

   public BigDecimal getSerieDoc() {
        return serieDoc;
   }

   public void setSerieDoc(BigDecimal serieDoc) {
        this.serieDoc = serieDoc;
   }

   public String getSituacaoCte() {
        return situacaoCte;
   }

   public void setSituacaoCte(String situacaoCte) {
        this.situacaoCte = situacaoCte;
   }

   public String getTipoCte() {
        return tipoCte;
   }

   public void setTipoCte(String tipoCte) {
        this.tipoCte = tipoCte;
   }

   public BigDecimal getTipoManifDfe() {
        return tipoManifDfe;
   }

   public void setTipoManifDfe(BigDecimal tipoManifDfe) {
        this.tipoManifDfe = tipoManifDfe;
   }

   public String getTomadorCte() {
        return tomadorCte;
   }

   public void setTomadorCte(String tomadorCte) {
        this.tomadorCte = tomadorCte;
   }

   public String getUlteveDfe() {
        return ulteveDfe;
   }

   public void setUlteveDfe(String ulteveDfe) {
        this.ulteveDfe = ulteveDfe;
   }

   public String getXNomeDest() {
        return xNomeDest;
   }

   public void setXNomeDest(String xNomeDest) {
        this.xNomeDest = xNomeDest;
   }

   public BigDecimal getStatusWms() {
        return statusWms;
   }

   public void setStatusWms(BigDecimal statusWms) {
        this.statusWms = statusWms;
   }

   public String getTipImpCte() {
        return tipImpCte;
   }

   public void setTipImpCte(String tipImpCte) {
        this.tipImpCte = tipImpCte;
   }

   public String getTipoNfe() {
        return tipoNfe;
   }

   public void setTipoNfe(String tipoNfe) {
        this.tipoNfe = tipoNfe;
   }

   public BigDecimal getNumCotacao() {
        return numCotacao;
   }

   public void setNumCotacao(BigDecimal numCotacao) {
        this.numCotacao = numCotacao;
   }

   public Timestamp getDtVenc() {
        return dtVenc;
   }

   public void setDtVenc(Timestamp dtVenc) {
        this.dtVenc = dtVenc;
   }

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        this.nuFin = nuFin;
   }

   public BigDecimal getCodParcColetaCte() {
        return codParcColetaCte;
   }

   public void setCodParcColetaCte(BigDecimal codParcColetaCte) {
        this.codParcColetaCte = codParcColetaCte;
   }

   public BigDecimal getCodParcEntregaCte() {
        return codParcEntregaCte;
   }

   public void setCodParcEntregaCte(BigDecimal codParcEntregaCte) {
        this.codParcEntregaCte = codParcEntregaCte;
   }

   public Timestamp getDhProcAg() {
        return dhProcAg;
   }

   public void setDhProcAg(Timestamp dhProcAg) {
        this.dhProcAg = dhProcAg;
   }

   public BigDecimal getQtdProcAg() {
        return qtdProcAg;
   }

   public void setQtdProcAg(BigDecimal qtdProcAg) {
        this.qtdProcAg = qtdProcAg;
   }

   @Override
   public String getEntityName() {
        return "ImportacaoXMLNotas";
   }

   @Override
   public ImportacaoXMLNotas fromVO(DynamicVO vo) {
        this.dhEmiss = vo.asTimestamp("DHEMISS");
        this.vlrNota = vo.asBigDecimal("VLRNOTA");
        this.situacaoMde = vo.asString("SITUACAOMDE");
        this.importadoMde = vo.asString("IMPORTADOMDE");
        this.situacaoNfe = vo.asString("SITUACAONFE");
        this.temXml = vo.asString("TEMXML");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.chaveAcesso = vo.asString("CHAVEACESSO");
        this.codUsuImp = vo.asBigDecimal("CODUSUIMP");
        this.codUsuProc = vo.asBigDecimal("CODUSUPROC");
        this.config = vo.asClob("CONFIG");
        this.detalhesImportacao = vo.asString("DETALHESIMPORTACAO");
        this.dhImport = vo.asTimestamp("DHIMPORT");
        this.dhProcess = vo.asTimestamp("DHPROCESS");
        this.nomeArquivo = vo.asString("NOMEARQUIVO");
        this.nuArquivo = vo.asBigDecimal("NUARQUIVO");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.status = vo.asBigDecimal("STATUS");
        this.tipo = vo.asString("TIPO");
        this.xml = vo.asClob("XML");
        this.xNomeEmit = vo.asString("XNOMEEMIT");
        this.xNomeToma = vo.asString("XNOMETOMA");
        this.xNomeTransp = vo.asString("XNOMETRANSP");
        this.cfopXml = vo.asString("CFOPXML");
        this.cnpjDest = vo.asString("CNPJDEST");
        this.cnpjExped = vo.asString("CNPJEXPED");
        this.cnpjParc = vo.asString("CNPJPARC");
        this.cnpjReceb = vo.asString("CNPJRECEB");
        this.cnpjRemet = vo.asString("CNPJREMET");
        this.cnpjTransp = vo.asString("CNPJTRANSP");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codParcDest = vo.asBigDecimal("CODPARCDEST");
        this.codParcExped = vo.asBigDecimal("CODPARCEXPED");
        this.codParcReceb = vo.asBigDecimal("CODPARCRECEB");
        this.codParcRemet = vo.asBigDecimal("CODPARCREMET");
        this.codParcTransp = vo.asBigDecimal("CODPARCTRANSP");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.codTipVenda = vo.asBigDecimal("CODTIPVENDA");
        this.diasEmissaoCalc = vo.asString("DIASEMISSAOCALC");
        this.docsRef = vo.asClob("DOCSREF");
        this.dtAutorizacao = vo.asTimestamp("DTAUTORIZACAO");
        this.dtConfirmacao = vo.asTimestamp("DTCONFIRMACAO");
        this.entSaiNfe = vo.asString("ENTSAINFE");
        this.naturezaOper = vo.asString("NATUREZAOPER");
        this.observacaoDfe = vo.asString("OBSERVACAODFE");
        this.papelCte = vo.asString("PAPELCTE");
        this.placaVeic = vo.asString("PLACAVEIC");
        this.serieDoc = vo.asBigDecimal("SERIEDOC");
        this.situacaoCte = vo.asString("SITUACAOCTE");
        this.tipoCte = vo.asString("TIPOCTE");
        this.tipoManifDfe = vo.asBigDecimal("TIPOMANIFDFE");
        this.tomadorCte = vo.asString("TOMADORCTE");
        this.ulteveDfe = vo.asString("ULTEVEDFE");
        this.xNomeDest = vo.asString("XNOMEDEST");
        this.statusWms = vo.asBigDecimal("STATUSWMS");
        this.tipImpCte = vo.asString("TIPIMPCTE");
        this.tipoNfe = vo.asString("TIPONFE");
        this.numCotacao = vo.asBigDecimal("NUMCOTACAO");
        this.dtVenc = vo.asTimestamp("DTVENC");
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.codParcColetaCte = vo.asBigDecimal("CODPARCCOLETACTE");
        this.codParcEntregaCte = vo.asBigDecimal("CODPARCENTREGACTE");
        this.dhProcAg = vo.asTimestamp("DHPROCAG");
        this.qtdProcAg = vo.asBigDecimal("QTDPROCAG");
        return this;
   }
}
