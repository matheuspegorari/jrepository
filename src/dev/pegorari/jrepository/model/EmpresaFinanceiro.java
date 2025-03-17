package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EmpresaFinanceiro implements SankhyaEntity<EmpresaFinanceiro> {

   private BigDecimal codLancBcoPag;
   private String corTeFaltaWms;
   private String cpfContador;
   private String crcContador;
   private String credCofins;
   private String credPis;
   private BigDecimal cstIpiEnt;
   private BigDecimal cstIpiSai;
   private Timestamp dtCertifNfeFim;
   private Timestamp dtCertifNfeIni;
   private String emailContador;
   private String emiteExped;
   private BigDecimal empDestinoWms;
   private BigDecimal empSoma;
   private BigDecimal endeCktIndef;
   private BigDecimal endeMovIndef;
   private String entPenBalcaoWms;
   private String flex;
   private String fragmentaEstWms;
   private String frasEnfse;
   private String freteSepConstransp;
   private String freteSepSemPre;
   private String geraGnre;
   private String gerarLivros;
   private String gerarProdLivEnt;
   private String gerarProdOrigKit;
   private String geraNotaEnt;
   private String gravarObsNota;
   private String gravarObsPadrao;
   private String gravarSerieNota;
   private String impEtiqSepOc;
   private String impEtiqVolConf;
   private BigDecimal impEtqVol;
   private String impExped;
   private String incentCult;
   private BigDecimal indEscrit;
   private String integraWmsProd;
   private String ipiIncIcms;
   private String ipiNaoIncid;
   private String layoutDanfe;
   private String livro1Para1Tgfite;
   private BigDecimal localPad;
   private String logoDanfe;
   private String marcaNotRps;
   private BigDecimal maxCredIndeniz;
   private BigDecimal maxDebIndeniz;
   private BigDecimal codEmpMatrizNfse;
   private BigDecimal codEmpOc;
   private BigDecimal codEndAvaria;
   private BigDecimal codLancBcoRec;
   private BigDecimal codLocAlterc;
   private BigDecimal codModDanfe;
   private BigDecimal codModDanfeContingencia;
   private BigDecimal codParcCtb;
   private BigDecimal codTab;
   private BigDecimal codTabCalc;
   private BigDecimal codTipOperComp;
   private String codTrib20Red;
   private String codTrib30;
   private String codTrib40Isent;
   private String codTrib41NaoTrib;
   private String codTrib50Susp;
   private String codTrib51Dif;
   private String codTrib60StAnt;
   private String codTrib70RedSt;
   private String codTrib90Out;
   private String compIpi;
   private String compIpiSepIcm;
   private String complItemNota;
   private String consEntRpendWms;
   private String consOutrosImp;
   private String consVlrLiqNfse;
   private String contingenciaNfe;
   private BigDecimal copiasDanfe;
   private BigDecimal copiasDanfeConting;
   private BigDecimal codEndDiverg;
   private BigDecimal codEndPerda;
   private BigDecimal partIcMeta;
   private BigDecimal percCfFab;
   private BigDecimal percCfOutros;
   private BigDecimal percCfServico;
   private BigDecimal percCofins;
   private BigDecimal percCsl;
   private BigDecimal percCusVar;
   private BigDecimal percMargem;
   private BigDecimal percPis;
   private String perfilEfd;
   private String perProj;
   private String prodEpe;
   private String projOnline;
   private String rastrEstoque;
   private String reabCorrecaoWms;
   private String recMinTare;
   private String reg54Seq997St;
   private String regimeEspTribIss;
   private String saldoLivQuinz;
   private String codTrib61;
   private String prefixSerieNacional;
   private String saldoLivQuinzIpi;
   private String senhaNfse;
   private String serieAcompCf;
   private String serieDevWms;
   private String stInclusa;
   private String telContador;
   private String temCofins;
   private String temCssl;
   private String temPis;
   private String temReaIcms;
   private BigDecimal tipoAtividade;
   private BigDecimal tipoAtividadePisCofins;
   private String tipoCorteWms;
   private String tipoDanfe;
   private String tipoEnvioNfe;
   private String tipoImpressora;
   private String tiraServLrContab;
   private BigDecimal topDevolucaoWms;
   private BigDecimal topEntradaWms;
   private BigDecimal topEnvWmsAgrup;
   private BigDecimal tpAssinante;
   private String tpAssinanteInf;
   private BigDecimal tpLigacao;
   private String tpLigacaoInf;
   private String trabComIpi;
   private String tratarDifParc;
   private String tratarTribut;
   private String tratarTributDefEmp;
   private String tratoCWms;
   private String ufCrcContador;
   private BigDecimal ultAutorPag;
   private BigDecimal ultDupl;
   private BigDecimal ultPagCiapModc;
   private BigDecimal ultPagLivEntrad;
   private BigDecimal ultPagLivIcms;
   private BigDecimal ultPagLivIpi;
   private BigDecimal ultPagLivIss;
   private BigDecimal ultPagLivSaida;
   private String usaMovVertWms;
   private String usaTributItens;
   private String usuarioNfse;
   private String utilizaWms;
   private BigDecimal versaoNfe;
   private String vlrLiqItemNfe;
   private BigDecimal wmsCodEndGar;
   private BigDecimal wmsLocalAjEst;
   private String wmsUsaRegVolFat;
   private Timestamp dtInicioKardex;
   private String gerLdPerTri;
   private String icmsSctTd;
   private BigDecimal maxNotasLoteNfe;
   private BigDecimal modDupl;
   private BigDecimal modExped;
   private String natPessoaJuridica;
   private String nfe;
   private String nfse;
   private String nomeContador;
   private String ccm;
   private String agrupaServFat;
   private String altContador;
   private String arqModBoleto;
   private BigDecimal notaSaiPerdaWms;
   private BigDecimal nuRfe;
   private BigDecimal nuRfeCartaCorr;
   private String calcIss;
   private BigDecimal calPercPis;
   private BigDecimal codCenCus;
   private BigDecimal codCenCusDesp;
   private BigDecimal codCtabCoipad;
   private BigDecimal codCtactb1;
   private BigDecimal codCtactb2;
   private BigDecimal codCtactb3;
   private BigDecimal codEmp;
   private BigDecimal codEmpMatrizEfd;
   private BigDecimal codEndSobra;
   private BigDecimal codEndWms;
   private BigDecimal codFormPrec;
   private String codGrupoTensao;
   private BigDecimal notaSaiAjustEst;
   private String utilizaMde;
   private String ativo;
   private String calcFunRural;
   private String calcIcms;
   private String calcIrrf;
   private BigDecimal notaEntAjustEst;
   private BigDecimal notaEntSobraWms;
   private String codTrib53;
   private String envRespContNfe;
   private BigDecimal tpObsFing4000;
   private BigDecimal tpObsNotag4000;
   private String gerObsFing4000;
   private BigDecimal codBcoIpi;
   private String tipTransmNfse;
   private BigDecimal codParcNfce;
   private String incentFiscalIssqn;
   private String serieTopDifMenor;
   private String serieTopDifMaior;
   private String tipIcmsTopEntSimNac;
   private BigDecimal codEnqIpiEnt;
   private BigDecimal codMeta;
   private BigDecimal codModNfceCompl;
   private BigDecimal codModNfceSimpl;
   private BigDecimal codEnqIpiSai;
   private BigDecimal topSaidaDifPesoWms;
   private BigDecimal codTabAlt;
   private BigDecimal codSmtp;
   private BigDecimal topEntDifPesoWms;
   private BigDecimal codTipParc;
   private BigDecimal corAgendado;
   private BigDecimal corAtendido;
   private BigDecimal corBloqueado;
   private BigDecimal corEncaixado;
   private BigDecimal corFaturado;
   private BigDecimal corFixado;
   private BigDecimal horaFinal;
   private BigDecimal horaInicial;
   private BigDecimal intervalo;
   private BigDecimal notaModeloDAgenda;
   private BigDecimal qtdLimiteMes;
   private String validaCpfCnpj;
   private String wmsUsaEtiqPal;
   private String gerObsNotag4000;
   private BigDecimal margSegPcp;
   private BigDecimal seqTokenNfce;
   private String tokenNfce;
   private String tpAmbMdfe;
   private String vlrLiqItemNfce;
   private String chaveDigitalAgiliblue;
   private String codUsuNfse;
   private String codContrInfse;
   private String temDenuesPont;
   private BigDecimal przTolCancNota;
   private BigDecimal przRegCancNota;
   private String serNaoTribBaseIss;
   private BigDecimal codEndArmIndef;
   private BigDecimal copiasDacte;
   private String tpAmbCte;
   private BigDecimal codModDacte;
   private String tipoEnvioCte;
   private String contingenciaCte;
   private String tipoDacte;
   private String jobKeyNdd;
   private String conectorNfse;
   private BigDecimal codCtactbDesc;
   private BigDecimal codCtactbJuros;
   private BigDecimal codCtactbMult;
   private BigDecimal codEndCrossdock;
   private String codTrib90CredDeb;
   private String conIcmsMajFcpInt;
   private String consDevEvtr2050;
   private String consIdBenef;
   private String contingenciaNfce;
   private BigDecimal copiasDanfce;
   private String descRedDifCiap;
   private String difAliqFcpInt;
   private String emailNotfeCreinf;
   private String envEmailConf;
   private String envioSincronoCte;
   private String envioSincronoNfce;
   private String envioSincronoNfe;
   private BigDecimal gerarRetencao;
   private String gerarTaxFinEmbNfe;
   private String igCertifSmtpXml;
   private String insXmlPorImpSmtpXml;
   private BigDecimal intConsSmtpXml;
   private String nfseStAntConsFinal;
   private BigDecimal notaEntAjustEstCons;
   private BigDecimal notaEntAjustEstCter;
   private BigDecimal notaEntAjustEstDter;
   private BigDecimal notaSaiAjustBem;
   private BigDecimal notaSaiAjustEstCons;
   private BigDecimal notaSaiAjustEstCter;
   private BigDecimal notaSaiAjustEstDter;
   private String numDocR2020;
   private BigDecimal nuNotaDemFx;
   private BigDecimal nuNotaModFx;
   private BigDecimal nuNotaTrcFx;
   private String origProdComIpi;
   private String permOutroUsuSepPed;
   private BigDecimal portaSmtpXml;
   private String progAquisAlim;
   private Timestamp proxExecSmtpXml;
   private String qrcodeNfceVersao2;
   private String redIssBcPisConf;
   private String redStCompBcPisCofins;
   private String senhaSmtpXml;
   private String servidorSmtpXml;
   private String suprimirEmailDest;
   private String tipConexSmtpXml;
   private String tipDataEvtServ;
   private String tipGerInfGveicGreb;
   private String tipoEnvioNfce;
   private String ultNsuCte;
   private String usaCodBarrasConcatWms;
   private String usaNomeComplItem;
   private String usaRecParcial;
   private String usaStExtNotaRestSt;
   private String usuarioSmtpXml;
   private String utilizaDfeTransp;
   private String utilizaExploteSep;
   private String utilizaSepPulmao;
   private String utilizaTriCrossdocking;
   private BigDecimal versaoNt;
   private BigDecimal versaoNtCte;
   private BigDecimal versaoNtMdfe;
   private String wmsArmTotalCol;
   private String wmsInfoPesoDetVol;
   private String wmsMultiUsuConf;
   private String wmsUsaImpFechaVol;
   private String wmsUsaRegVolRec;
   private String aedfe;
   private String atualCbeneffat;
   private String calcIcmsStNaoCont;
   private BigDecimal codTabCkc;
   private String reabCompleto;
   private BigDecimal aliqCfBonif;
   private BigDecimal aliqPisBonif;
   private BigDecimal codCtactbBonif;
   private String codStPisCfBonif;
   private String mdfeDocSemisPropria;
   private BigDecimal nuRfeCartaCorrCte;
   private String tribPisCfBonif;
   private String gerLivIcmsEmpSn;
   private BigDecimal codForDifAliq;
   private String defCstIpi00;
   private String defCstIpi01;
   private String defCstIpi02;
   private String defCstIpi03;
   private String defCstIpi04;
   private String defCstIpi05;
   private String defCstIpi49;
   private String defCstIpi50;
   private String defCstIpi51;
   private String defCstIpi52;
   private String defCstIpi53;
   private String defCstIpi54;
   private String defCstIpi55;
   private String defCstIpi99;
   private String ipiTributDefEmp;
   private String escritCompraEmissProp;
   private String geraNotaEntCanc;
   private String metCalcDifIcms;
   private BigDecimal pesMaxSepAgru;
   private String usaSepAgrupProd;
   private BigDecimal qtPedSepAgr;
   private BigDecimal qtCheckSep;
   private BigDecimal volCheckSepProd;
   private String consRepIcmsBasePisCof;
   private BigDecimal aliqPisDesc;
   private BigDecimal aliqCfJuros;
   private BigDecimal localPadEconect;
   private BigDecimal aliqCfDesc;
   private String jobMdEndDigital;
   private String codStPisCfDesc;
   private String codStPisCfJuros;
   private BigDecimal aliqPisJuros;
   private String tribPisCfDesc;
   private String tribPisCfJuros;
   private BigDecimal aliqPisMult;
   private BigDecimal aliqCfMult;
   private String codStPisCfMult;
   private String tribPisCfMult;
   private String certificadoPix;
   private String impCteEmisProp;
   private BigDecimal codEndRetExp;
   private String redIcmsBcPisConfins;
   private String ultNsu;
   private String usaInfoAdConfPed;
   private BigDecimal nfseObsIterps;
   private BigDecimal qtdCarNfseObsIterps;
   private String caepf;
   private String cafir;
   private String gerAlcdpr;
   private String tipoExploracao;
   private String baixaFinPreEmissNfce;
   private String icmsNormalDifIcmsSn;
   private String dirFcpfResp;
   private String dirFDepDecJud;
   private String dirFDepFunInv;
   private Timestamp dirFdhevento;
   private String dirFentImune;
   private String dirFnatDecl;
   private String dirFpgExt;
   private String dirFpgFundPub;
   private String dirFplPriAss;
   private String dirFsitEsp;
   private String dirFsocost;
   private String tempPremiacaoEstadual;
   private BigDecimal codClassifEstab;
   private String redPisBcPisCofins;
   private BigDecimal nuRfeProducao;
   private String impressoraEtqSep;
   private String filtroAliqIcmsSql;
   private String clasConsAgua;
   private String clasConsEnerg;
   private String clasConsGas;
   private String identEct;
   private String wmsDocAsepBalcao;
   private String efdh010;
   private String efdh010Prter;
   private String efdh010Ter;
   private String utilizaExplote;
   private BigDecimal codRelMinutaOdp;
   private String senhaEct;
   private Timestamp dtRefPreProdFictReinf;
   private Timestamp dtRefPreProdReaisReinf;
   private Timestamp dtRefProdReinf;
   private Timestamp dtValFinReinf;
   private Timestamp dtValIniReinf;
   private String empAdmPubDir;
   private String entregaEcd;
   private String identEctRastreio;
   private String impNfeEmissProp;
   private String partCanalVerde;
   private BigDecimal ambienteReinf;
   private String camConvPref;
   private String cnpjEfrVinc;
   private String desonerafolhaCprb;
   private BigDecimal respEntReinf;
   private String senhaEctRastreio;
   private BigDecimal sitEmpReinf;
   private String tipCtactbEfd;
   private BigDecimal topCorBanEconect;
   private BigDecimal tribReinf;
   private BigDecimal versaoCte;
   private String vinculoEfr;
   private BigDecimal nroMaxProd;
   private BigDecimal tpOempresa;
   private BigDecimal versaoMdfe;
   private String transpCarga;
   private String usaDtValLotNfe;
   private String usaDtFabLotNfe;
   private BigDecimal modEtqVol;
   private String igPermCompProds;
   private String impressoraEtqVol;
   private String chaveAcessoNfse;
   private BigDecimal codLojaEconect;
   private BigDecimal topRecargaCelEconect;
   private BigDecimal topNfceEconect;
   private BigDecimal topSateConect;
   private BigDecimal wmsCodEndFlut;
   private String usaTrocoCheckout;
   private BigDecimal codEmpOrigMovFin;
   private String calcVencGnreApu;
   private String gerObsIpiRegEnt;
   private String gerCteCredPisCof;
   private String ger0220UndForn;
   private String gerChaveRefSig;
   private String proibDigConfEnt;
   private BigDecimal qtdConfEntWms;
   private String empCentralMovFin;
   private BigDecimal codModEmailNfe;
   private BigDecimal codModDanfeSimplifNfe;
   private String gerCiapCompEfd;
   private BigDecimal modEmailLibLim;
   private String tokenNfse;
   private BigDecimal efdCodBco;
   private BigDecimal efdCodCenCus;
   private BigDecimal efdCodCtabCoInt;
   private BigDecimal efdCodNatDespRecIcms;
   private BigDecimal efdCodTipOper;
   private BigDecimal efdCodTipTit;
   private BigDecimal efdDiaVenc;
   private String efdTipReenchNota;
   private String intFinObriIcmsStRec;
   private String wmsRastSerMed;
   private String codRespRetc180;
   private String vlrBaseStc180;
   private String vlrStc180;
   private BigDecimal topSangSupri;
   private String usaVlrMedTransfEmp;
   private BigDecimal topDespesa;
   private String usaIndPresTopFat;
   private String tipoImpKitFox;
   private String apiKeyPixCheckout;
   private BigDecimal bancoPixCheckout;
   private String clientIdPixCheckout;
   private String clientSecretPixCheckout;
   private String cstNRedIcmsBcPisCof;
   private String consDevNfeReinf;
   private String ambienteGnre;
   private BigDecimal codEmpMatrizGnre;
   private String versaoGnre;
   private BigDecimal codEmpGrupoFrete;
   private String calcFetHab;
   private String msgInfAdicFetHab;
   private BigDecimal aliqFunttel;
   private BigDecimal aliqFust;
   private String fistel;
   private String vlrIcmsOpAnt;
   private String vlrStFcpOpAnt;
   private String vlrStOpAnt;
   private String vlrUnitIcmsOp;
   private String inibeReabMaxPicking;
   private String tratSobFinConf;
   private BigDecimal conEstOrigProd;
   private String vlrUnitMerc;
   private String redDifAlBcPisCof;
   private String entAutTarMapa;
   private BigDecimal priorCodNat;
   private String envRespContCte;
   private String consDevTerevtr2050;
   private String envInutNotaExc;
   private String jusInutNotaExc;
   private String wmsDocArep;
   private String deduzFcpBcPisCofins;
   private String sepPulParcial;
   private String obtStAntMedEnt;
   private String calcIcmsAt;
   private String proibEscCheckoutPed;
   private String nfeCanExtCanMes;
   private String envMdfSinc;
   private String wmsPerSepProdAp;
   private String consIdQtCarcDesc;
   private String envLeiTranspDesc;
   private String envLeiTranspTotoBs;
   private String cgcProcurador;
   private String inibLoqRegConf;
   private String blqNfaCompNfcPend;
   private String difAliqDespAcess;
   private String complRestituicaoIcmsSt;
   private String calcPisCfsFin;
   private String isAliqIntSexC;
   private BigDecimal tipIcmsFenvalBem;
   private String chavePixCheckout;
   private String urlPixCheckout;
   private BigDecimal calcVlrAquisBem;
   private String inibeLote;
   private String contBaiBemSubImprec;
   private BigDecimal codCtaPixTef;
   private String credIcmsCombus;
   private String credIcmsRemg;
   private String descricao;
   private String descrNat;
   private String desTipIdevCom;
   private BigDecimal natCanPix;
   private String rupturaEst;
   private String somarFcpBcCiap;
   private String tipoPix;
   private BigDecimal topCanPixFin;
   private BigDecimal topCanPixPag;
   private BigDecimal topCanPixRec;
   private String usaMedDiaImp;
   private BigDecimal codCenCusIpi;
   private BigDecimal codCtabCoIpi;
   private BigDecimal codEmpImposto;
   private BigDecimal codModRetEstWms;
   private BigDecimal codNatIpi;
   private BigDecimal codParcIpi;
   private String codReceitaIpi;
   private String codReceitaReinf;
   private BigDecimal codTipOperIpi;
   private BigDecimal codTipTitIpi;
   private String consDifParcOutIcms;
   private String ctactbAnlRegApur;
   private String desRestrFcpCst;
   private String desRestrFcpStCst;
   private BigDecimal diaVencIpi;
   private Timestamp dtObito;
   private String dtOpJuros;
   private String dtOpMulta;
   private Timestamp dtRefPreProdReaisReinfG4000;
   private Timestamp dtRefProdReinfG4000;
   private Timestamp dtTransfFinsLucr;
   private String envInfIssSomDevido;
   private String estrNcredIcmsSt;
   private String gerMultPlacres;
   private BigDecimal indTipLayoutK010;
   private BigDecimal indUniao;
   private String integrarIpiFin;
   private BigDecimal modEstCpaWms;
   private BigDecimal notaEntAjusteReclas;
   private BigDecimal notaSaiAjusteReclas;
   private BigDecimal origDescontos;
   private String redStBcPisCofins;
   private String stInclusa70;
   private String tipCtactbEfdf;
   private String tipDataEvtPag;
   private String tipDataEvtPagXir;
   private String tokenIbpt;
   private String usaCusMedIcMpro;
   private String usaCustoMedioMps;
   private String desApCprodEpe;
   private String regApurTribSn;
   private BigDecimal status;
   private String geraDeducaoPf;
   private String credIcmsCst60Am;
   private String denunCesPcte;
   private BigDecimal prazoRcancCte;
   private BigDecimal prazoTcancCte;
   private String teraCpCte;
   private String aplCalcDifAliqFrt;

   public BigDecimal getCodLancBcoPag() {
        return codLancBcoPag;
   }

   public void setCodLancBcoPag(BigDecimal codLancBcoPag) {
        this.codLancBcoPag = codLancBcoPag;
   }

   public String getCorTeFaltaWms() {
        return corTeFaltaWms;
   }

   public void setCorTeFaltaWms(String corTeFaltaWms) {
        this.corTeFaltaWms = corTeFaltaWms;
   }

   public String getCpfContador() {
        return cpfContador;
   }

   public void setCpfContador(String cpfContador) {
        this.cpfContador = cpfContador;
   }

   public String getCrcContador() {
        return crcContador;
   }

   public void setCrcContador(String crcContador) {
        this.crcContador = crcContador;
   }

   public String getCredCofins() {
        return credCofins;
   }

   public void setCredCofins(String credCofins) {
        this.credCofins = credCofins;
   }

   public String getCredPis() {
        return credPis;
   }

   public void setCredPis(String credPis) {
        this.credPis = credPis;
   }

   public BigDecimal getCstIpiEnt() {
        return cstIpiEnt;
   }

   public void setCstIpiEnt(BigDecimal cstIpiEnt) {
        this.cstIpiEnt = cstIpiEnt;
   }

   public BigDecimal getCstIpiSai() {
        return cstIpiSai;
   }

   public void setCstIpiSai(BigDecimal cstIpiSai) {
        this.cstIpiSai = cstIpiSai;
   }

   public Timestamp getDtCertifNfeFim() {
        return dtCertifNfeFim;
   }

   public void setDtCertifNfeFim(Timestamp dtCertifNfeFim) {
        this.dtCertifNfeFim = dtCertifNfeFim;
   }

   public Timestamp getDtCertifNfeIni() {
        return dtCertifNfeIni;
   }

   public void setDtCertifNfeIni(Timestamp dtCertifNfeIni) {
        this.dtCertifNfeIni = dtCertifNfeIni;
   }

   public String getEmailContador() {
        return emailContador;
   }

   public void setEmailContador(String emailContador) {
        this.emailContador = emailContador;
   }

   public String getEmiteExped() {
        return emiteExped;
   }

   public void setEmiteExped(String emiteExped) {
        this.emiteExped = emiteExped;
   }

   public BigDecimal getEmpDestinoWms() {
        return empDestinoWms;
   }

   public void setEmpDestinoWms(BigDecimal empDestinoWms) {
        this.empDestinoWms = empDestinoWms;
   }

   public BigDecimal getEmpSoma() {
        return empSoma;
   }

   public void setEmpSoma(BigDecimal empSoma) {
        this.empSoma = empSoma;
   }

   public BigDecimal getEndeCktIndef() {
        return endeCktIndef;
   }

   public void setEndeCktIndef(BigDecimal endeCktIndef) {
        this.endeCktIndef = endeCktIndef;
   }

   public BigDecimal getEndeMovIndef() {
        return endeMovIndef;
   }

   public void setEndeMovIndef(BigDecimal endeMovIndef) {
        this.endeMovIndef = endeMovIndef;
   }

   public String getEntPenBalcaoWms() {
        return entPenBalcaoWms;
   }

   public void setEntPenBalcaoWms(String entPenBalcaoWms) {
        this.entPenBalcaoWms = entPenBalcaoWms;
   }

   public String getFlex() {
        return flex;
   }

   public void setFlex(String flex) {
        this.flex = flex;
   }

   public String getFragmentaEstWms() {
        return fragmentaEstWms;
   }

   public void setFragmentaEstWms(String fragmentaEstWms) {
        this.fragmentaEstWms = fragmentaEstWms;
   }

   public String getFrasEnfse() {
        return frasEnfse;
   }

   public void setFrasEnfse(String frasEnfse) {
        this.frasEnfse = frasEnfse;
   }

   public String getFreteSepConstransp() {
        return freteSepConstransp;
   }

   public void setFreteSepConstransp(String freteSepConstransp) {
        this.freteSepConstransp = freteSepConstransp;
   }

   public String getFreteSepSemPre() {
        return freteSepSemPre;
   }

   public void setFreteSepSemPre(String freteSepSemPre) {
        this.freteSepSemPre = freteSepSemPre;
   }

   public String getGeraGnre() {
        return geraGnre;
   }

   public void setGeraGnre(String geraGnre) {
        this.geraGnre = geraGnre;
   }

   public String getGerarLivros() {
        return gerarLivros;
   }

   public void setGerarLivros(String gerarLivros) {
        this.gerarLivros = gerarLivros;
   }

   public String getGerarProdLivEnt() {
        return gerarProdLivEnt;
   }

   public void setGerarProdLivEnt(String gerarProdLivEnt) {
        this.gerarProdLivEnt = gerarProdLivEnt;
   }

   public String getGerarProdOrigKit() {
        return gerarProdOrigKit;
   }

   public void setGerarProdOrigKit(String gerarProdOrigKit) {
        this.gerarProdOrigKit = gerarProdOrigKit;
   }

   public String getGeraNotaEnt() {
        return geraNotaEnt;
   }

   public void setGeraNotaEnt(String geraNotaEnt) {
        this.geraNotaEnt = geraNotaEnt;
   }

   public String getGravarObsNota() {
        return gravarObsNota;
   }

   public void setGravarObsNota(String gravarObsNota) {
        this.gravarObsNota = gravarObsNota;
   }

   public String getGravarObsPadrao() {
        return gravarObsPadrao;
   }

   public void setGravarObsPadrao(String gravarObsPadrao) {
        this.gravarObsPadrao = gravarObsPadrao;
   }

   public String getGravarSerieNota() {
        return gravarSerieNota;
   }

   public void setGravarSerieNota(String gravarSerieNota) {
        this.gravarSerieNota = gravarSerieNota;
   }

   public String getImpEtiqSepOc() {
        return impEtiqSepOc;
   }

   public void setImpEtiqSepOc(String impEtiqSepOc) {
        this.impEtiqSepOc = impEtiqSepOc;
   }

   public String getImpEtiqVolConf() {
        return impEtiqVolConf;
   }

   public void setImpEtiqVolConf(String impEtiqVolConf) {
        this.impEtiqVolConf = impEtiqVolConf;
   }

   public BigDecimal getImpEtqVol() {
        return impEtqVol;
   }

   public void setImpEtqVol(BigDecimal impEtqVol) {
        this.impEtqVol = impEtqVol;
   }

   public String getImpExped() {
        return impExped;
   }

   public void setImpExped(String impExped) {
        this.impExped = impExped;
   }

   public String getIncentCult() {
        return incentCult;
   }

   public void setIncentCult(String incentCult) {
        this.incentCult = incentCult;
   }

   public BigDecimal getIndEscrit() {
        return indEscrit;
   }

   public void setIndEscrit(BigDecimal indEscrit) {
        this.indEscrit = indEscrit;
   }

   public String getIntegraWmsProd() {
        return integraWmsProd;
   }

   public void setIntegraWmsProd(String integraWmsProd) {
        this.integraWmsProd = integraWmsProd;
   }

   public String getIpiIncIcms() {
        return ipiIncIcms;
   }

   public void setIpiIncIcms(String ipiIncIcms) {
        this.ipiIncIcms = ipiIncIcms;
   }

   public String getIpiNaoIncid() {
        return ipiNaoIncid;
   }

   public void setIpiNaoIncid(String ipiNaoIncid) {
        this.ipiNaoIncid = ipiNaoIncid;
   }

   public String getLayoutDanfe() {
        return layoutDanfe;
   }

   public void setLayoutDanfe(String layoutDanfe) {
        this.layoutDanfe = layoutDanfe;
   }

   public String getLivro1Para1Tgfite() {
        return livro1Para1Tgfite;
   }

   public void setLivro1Para1Tgfite(String livro1Para1Tgfite) {
        this.livro1Para1Tgfite = livro1Para1Tgfite;
   }

   public BigDecimal getLocalPad() {
        return localPad;
   }

   public void setLocalPad(BigDecimal localPad) {
        this.localPad = localPad;
   }

   public String getLogoDanfe() {
        return logoDanfe;
   }

   public void setLogoDanfe(String logoDanfe) {
        this.logoDanfe = logoDanfe;
   }

   public String getMarcaNotRps() {
        return marcaNotRps;
   }

   public void setMarcaNotRps(String marcaNotRps) {
        this.marcaNotRps = marcaNotRps;
   }

   public BigDecimal getMaxCredIndeniz() {
        return maxCredIndeniz;
   }

   public void setMaxCredIndeniz(BigDecimal maxCredIndeniz) {
        this.maxCredIndeniz = maxCredIndeniz;
   }

   public BigDecimal getMaxDebIndeniz() {
        return maxDebIndeniz;
   }

   public void setMaxDebIndeniz(BigDecimal maxDebIndeniz) {
        this.maxDebIndeniz = maxDebIndeniz;
   }

   public BigDecimal getCodEmpMatrizNfse() {
        return codEmpMatrizNfse;
   }

   public void setCodEmpMatrizNfse(BigDecimal codEmpMatrizNfse) {
        this.codEmpMatrizNfse = codEmpMatrizNfse;
   }

   public BigDecimal getCodEmpOc() {
        return codEmpOc;
   }

   public void setCodEmpOc(BigDecimal codEmpOc) {
        this.codEmpOc = codEmpOc;
   }

   public BigDecimal getCodEndAvaria() {
        return codEndAvaria;
   }

   public void setCodEndAvaria(BigDecimal codEndAvaria) {
        this.codEndAvaria = codEndAvaria;
   }

   public BigDecimal getCodLancBcoRec() {
        return codLancBcoRec;
   }

   public void setCodLancBcoRec(BigDecimal codLancBcoRec) {
        this.codLancBcoRec = codLancBcoRec;
   }

   public BigDecimal getCodLocAlterc() {
        return codLocAlterc;
   }

   public void setCodLocAlterc(BigDecimal codLocAlterc) {
        this.codLocAlterc = codLocAlterc;
   }

   public BigDecimal getCodModDanfe() {
        return codModDanfe;
   }

   public void setCodModDanfe(BigDecimal codModDanfe) {
        this.codModDanfe = codModDanfe;
   }

   public BigDecimal getCodModDanfeContingencia() {
        return codModDanfeContingencia;
   }

   public void setCodModDanfeContingencia(BigDecimal codModDanfeContingencia) {
        this.codModDanfeContingencia = codModDanfeContingencia;
   }

   public BigDecimal getCodParcCtb() {
        return codParcCtb;
   }

   public void setCodParcCtb(BigDecimal codParcCtb) {
        this.codParcCtb = codParcCtb;
   }

   public BigDecimal getCodTab() {
        return codTab;
   }

   public void setCodTab(BigDecimal codTab) {
        this.codTab = codTab;
   }

   public BigDecimal getCodTabCalc() {
        return codTabCalc;
   }

   public void setCodTabCalc(BigDecimal codTabCalc) {
        this.codTabCalc = codTabCalc;
   }

   public BigDecimal getCodTipOperComp() {
        return codTipOperComp;
   }

   public void setCodTipOperComp(BigDecimal codTipOperComp) {
        this.codTipOperComp = codTipOperComp;
   }

   public String getCodTrib20Red() {
        return codTrib20Red;
   }

   public void setCodTrib20Red(String codTrib20Red) {
        this.codTrib20Red = codTrib20Red;
   }

   public String getCodTrib30() {
        return codTrib30;
   }

   public void setCodTrib30(String codTrib30) {
        this.codTrib30 = codTrib30;
   }

   public String getCodTrib40Isent() {
        return codTrib40Isent;
   }

   public void setCodTrib40Isent(String codTrib40Isent) {
        this.codTrib40Isent = codTrib40Isent;
   }

   public String getCodTrib41NaoTrib() {
        return codTrib41NaoTrib;
   }

   public void setCodTrib41NaoTrib(String codTrib41NaoTrib) {
        this.codTrib41NaoTrib = codTrib41NaoTrib;
   }

   public String getCodTrib50Susp() {
        return codTrib50Susp;
   }

   public void setCodTrib50Susp(String codTrib50Susp) {
        this.codTrib50Susp = codTrib50Susp;
   }

   public String getCodTrib51Dif() {
        return codTrib51Dif;
   }

   public void setCodTrib51Dif(String codTrib51Dif) {
        this.codTrib51Dif = codTrib51Dif;
   }

   public String getCodTrib60StAnt() {
        return codTrib60StAnt;
   }

   public void setCodTrib60StAnt(String codTrib60StAnt) {
        this.codTrib60StAnt = codTrib60StAnt;
   }

   public String getCodTrib70RedSt() {
        return codTrib70RedSt;
   }

   public void setCodTrib70RedSt(String codTrib70RedSt) {
        this.codTrib70RedSt = codTrib70RedSt;
   }

   public String getCodTrib90Out() {
        return codTrib90Out;
   }

   public void setCodTrib90Out(String codTrib90Out) {
        this.codTrib90Out = codTrib90Out;
   }

   public String getCompIpi() {
        return compIpi;
   }

   public void setCompIpi(String compIpi) {
        this.compIpi = compIpi;
   }

   public String getCompIpiSepIcm() {
        return compIpiSepIcm;
   }

   public void setCompIpiSepIcm(String compIpiSepIcm) {
        this.compIpiSepIcm = compIpiSepIcm;
   }

   public String getComplItemNota() {
        return complItemNota;
   }

   public void setComplItemNota(String complItemNota) {
        this.complItemNota = complItemNota;
   }

   public String getConsEntRpendWms() {
        return consEntRpendWms;
   }

   public void setConsEntRpendWms(String consEntRpendWms) {
        this.consEntRpendWms = consEntRpendWms;
   }

   public String getConsOutrosImp() {
        return consOutrosImp;
   }

   public void setConsOutrosImp(String consOutrosImp) {
        this.consOutrosImp = consOutrosImp;
   }

   public String getConsVlrLiqNfse() {
        return consVlrLiqNfse;
   }

   public void setConsVlrLiqNfse(String consVlrLiqNfse) {
        this.consVlrLiqNfse = consVlrLiqNfse;
   }

   public String getContingenciaNfe() {
        return contingenciaNfe;
   }

   public void setContingenciaNfe(String contingenciaNfe) {
        this.contingenciaNfe = contingenciaNfe;
   }

   public BigDecimal getCopiasDanfe() {
        return copiasDanfe;
   }

   public void setCopiasDanfe(BigDecimal copiasDanfe) {
        this.copiasDanfe = copiasDanfe;
   }

   public BigDecimal getCopiasDanfeConting() {
        return copiasDanfeConting;
   }

   public void setCopiasDanfeConting(BigDecimal copiasDanfeConting) {
        this.copiasDanfeConting = copiasDanfeConting;
   }

   public BigDecimal getCodEndDiverg() {
        return codEndDiverg;
   }

   public void setCodEndDiverg(BigDecimal codEndDiverg) {
        this.codEndDiverg = codEndDiverg;
   }

   public BigDecimal getCodEndPerda() {
        return codEndPerda;
   }

   public void setCodEndPerda(BigDecimal codEndPerda) {
        this.codEndPerda = codEndPerda;
   }

   public BigDecimal getPartIcMeta() {
        return partIcMeta;
   }

   public void setPartIcMeta(BigDecimal partIcMeta) {
        this.partIcMeta = partIcMeta;
   }

   public BigDecimal getPercCfFab() {
        return percCfFab;
   }

   public void setPercCfFab(BigDecimal percCfFab) {
        this.percCfFab = percCfFab;
   }

   public BigDecimal getPercCfOutros() {
        return percCfOutros;
   }

   public void setPercCfOutros(BigDecimal percCfOutros) {
        this.percCfOutros = percCfOutros;
   }

   public BigDecimal getPercCfServico() {
        return percCfServico;
   }

   public void setPercCfServico(BigDecimal percCfServico) {
        this.percCfServico = percCfServico;
   }

   public BigDecimal getPercCofins() {
        return percCofins;
   }

   public void setPercCofins(BigDecimal percCofins) {
        this.percCofins = percCofins;
   }

   public BigDecimal getPercCsl() {
        return percCsl;
   }

   public void setPercCsl(BigDecimal percCsl) {
        this.percCsl = percCsl;
   }

   public BigDecimal getPercCusVar() {
        return percCusVar;
   }

   public void setPercCusVar(BigDecimal percCusVar) {
        this.percCusVar = percCusVar;
   }

   public BigDecimal getPercMargem() {
        return percMargem;
   }

   public void setPercMargem(BigDecimal percMargem) {
        this.percMargem = percMargem;
   }

   public BigDecimal getPercPis() {
        return percPis;
   }

   public void setPercPis(BigDecimal percPis) {
        this.percPis = percPis;
   }

   public String getPerfilEfd() {
        return perfilEfd;
   }

   public void setPerfilEfd(String perfilEfd) {
        this.perfilEfd = perfilEfd;
   }

   public String getPerProj() {
        return perProj;
   }

   public void setPerProj(String perProj) {
        this.perProj = perProj;
   }

   public String getProdEpe() {
        return prodEpe;
   }

   public void setProdEpe(String prodEpe) {
        this.prodEpe = prodEpe;
   }

   public String getProjOnline() {
        return projOnline;
   }

   public void setProjOnline(String projOnline) {
        this.projOnline = projOnline;
   }

   public String getRastrEstoque() {
        return rastrEstoque;
   }

   public void setRastrEstoque(String rastrEstoque) {
        this.rastrEstoque = rastrEstoque;
   }

   public String getReabCorrecaoWms() {
        return reabCorrecaoWms;
   }

   public void setReabCorrecaoWms(String reabCorrecaoWms) {
        this.reabCorrecaoWms = reabCorrecaoWms;
   }

   public String getRecMinTare() {
        return recMinTare;
   }

   public void setRecMinTare(String recMinTare) {
        this.recMinTare = recMinTare;
   }

   public String getReg54Seq997St() {
        return reg54Seq997St;
   }

   public void setReg54Seq997St(String reg54Seq997St) {
        this.reg54Seq997St = reg54Seq997St;
   }

   public String getRegimeEspTribIss() {
        return regimeEspTribIss;
   }

   public void setRegimeEspTribIss(String regimeEspTribIss) {
        this.regimeEspTribIss = regimeEspTribIss;
   }

   public String getSaldoLivQuinz() {
        return saldoLivQuinz;
   }

   public void setSaldoLivQuinz(String saldoLivQuinz) {
        this.saldoLivQuinz = saldoLivQuinz;
   }

   public String getCodTrib61() {
        return codTrib61;
   }

   public void setCodTrib61(String codTrib61) {
        this.codTrib61 = codTrib61;
   }

   public String getPrefixSerieNacional() {
        return prefixSerieNacional;
   }

   public void setPrefixSerieNacional(String prefixSerieNacional) {
        this.prefixSerieNacional = prefixSerieNacional;
   }

   public String getSaldoLivQuinzIpi() {
        return saldoLivQuinzIpi;
   }

   public void setSaldoLivQuinzIpi(String saldoLivQuinzIpi) {
        this.saldoLivQuinzIpi = saldoLivQuinzIpi;
   }

   public String getSenhaNfse() {
        return senhaNfse;
   }

   public void setSenhaNfse(String senhaNfse) {
        this.senhaNfse = senhaNfse;
   }

   public String getSerieAcompCf() {
        return serieAcompCf;
   }

   public void setSerieAcompCf(String serieAcompCf) {
        this.serieAcompCf = serieAcompCf;
   }

   public String getSerieDevWms() {
        return serieDevWms;
   }

   public void setSerieDevWms(String serieDevWms) {
        this.serieDevWms = serieDevWms;
   }

   public String getStInclusa() {
        return stInclusa;
   }

   public void setStInclusa(String stInclusa) {
        this.stInclusa = stInclusa;
   }

   public String getTelContador() {
        return telContador;
   }

   public void setTelContador(String telContador) {
        this.telContador = telContador;
   }

   public String getTemCofins() {
        return temCofins;
   }

   public void setTemCofins(String temCofins) {
        this.temCofins = temCofins;
   }

   public String getTemCssl() {
        return temCssl;
   }

   public void setTemCssl(String temCssl) {
        this.temCssl = temCssl;
   }

   public String getTemPis() {
        return temPis;
   }

   public void setTemPis(String temPis) {
        this.temPis = temPis;
   }

   public String getTemReaIcms() {
        return temReaIcms;
   }

   public void setTemReaIcms(String temReaIcms) {
        this.temReaIcms = temReaIcms;
   }

   public BigDecimal getTipoAtividade() {
        return tipoAtividade;
   }

   public void setTipoAtividade(BigDecimal tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
   }

   public BigDecimal getTipoAtividadePisCofins() {
        return tipoAtividadePisCofins;
   }

   public void setTipoAtividadePisCofins(BigDecimal tipoAtividadePisCofins) {
        this.tipoAtividadePisCofins = tipoAtividadePisCofins;
   }

   public String getTipoCorteWms() {
        return tipoCorteWms;
   }

   public void setTipoCorteWms(String tipoCorteWms) {
        this.tipoCorteWms = tipoCorteWms;
   }

   public String getTipoDanfe() {
        return tipoDanfe;
   }

   public void setTipoDanfe(String tipoDanfe) {
        this.tipoDanfe = tipoDanfe;
   }

   public String getTipoEnvioNfe() {
        return tipoEnvioNfe;
   }

   public void setTipoEnvioNfe(String tipoEnvioNfe) {
        this.tipoEnvioNfe = tipoEnvioNfe;
   }

   public String getTipoImpressora() {
        return tipoImpressora;
   }

   public void setTipoImpressora(String tipoImpressora) {
        this.tipoImpressora = tipoImpressora;
   }

   public String getTiraServLrContab() {
        return tiraServLrContab;
   }

   public void setTiraServLrContab(String tiraServLrContab) {
        this.tiraServLrContab = tiraServLrContab;
   }

   public BigDecimal getTopDevolucaoWms() {
        return topDevolucaoWms;
   }

   public void setTopDevolucaoWms(BigDecimal topDevolucaoWms) {
        this.topDevolucaoWms = topDevolucaoWms;
   }

   public BigDecimal getTopEntradaWms() {
        return topEntradaWms;
   }

   public void setTopEntradaWms(BigDecimal topEntradaWms) {
        this.topEntradaWms = topEntradaWms;
   }

   public BigDecimal getTopEnvWmsAgrup() {
        return topEnvWmsAgrup;
   }

   public void setTopEnvWmsAgrup(BigDecimal topEnvWmsAgrup) {
        this.topEnvWmsAgrup = topEnvWmsAgrup;
   }

   public BigDecimal getTpAssinante() {
        return tpAssinante;
   }

   public void setTpAssinante(BigDecimal tpAssinante) {
        this.tpAssinante = tpAssinante;
   }

   public String getTpAssinanteInf() {
        return tpAssinanteInf;
   }

   public void setTpAssinanteInf(String tpAssinanteInf) {
        this.tpAssinanteInf = tpAssinanteInf;
   }

   public BigDecimal getTpLigacao() {
        return tpLigacao;
   }

   public void setTpLigacao(BigDecimal tpLigacao) {
        this.tpLigacao = tpLigacao;
   }

   public String getTpLigacaoInf() {
        return tpLigacaoInf;
   }

   public void setTpLigacaoInf(String tpLigacaoInf) {
        this.tpLigacaoInf = tpLigacaoInf;
   }

   public String getTrabComIpi() {
        return trabComIpi;
   }

   public void setTrabComIpi(String trabComIpi) {
        this.trabComIpi = trabComIpi;
   }

   public String getTratarDifParc() {
        return tratarDifParc;
   }

   public void setTratarDifParc(String tratarDifParc) {
        this.tratarDifParc = tratarDifParc;
   }

   public String getTratarTribut() {
        return tratarTribut;
   }

   public void setTratarTribut(String tratarTribut) {
        this.tratarTribut = tratarTribut;
   }

   public String getTratarTributDefEmp() {
        return tratarTributDefEmp;
   }

   public void setTratarTributDefEmp(String tratarTributDefEmp) {
        this.tratarTributDefEmp = tratarTributDefEmp;
   }

   public String getTratoCWms() {
        return tratoCWms;
   }

   public void setTratoCWms(String tratoCWms) {
        this.tratoCWms = tratoCWms;
   }

   public String getUfCrcContador() {
        return ufCrcContador;
   }

   public void setUfCrcContador(String ufCrcContador) {
        this.ufCrcContador = ufCrcContador;
   }

   public BigDecimal getUltAutorPag() {
        return ultAutorPag;
   }

   public void setUltAutorPag(BigDecimal ultAutorPag) {
        this.ultAutorPag = ultAutorPag;
   }

   public BigDecimal getUltDupl() {
        return ultDupl;
   }

   public void setUltDupl(BigDecimal ultDupl) {
        this.ultDupl = ultDupl;
   }

   public BigDecimal getUltPagCiapModc() {
        return ultPagCiapModc;
   }

   public void setUltPagCiapModc(BigDecimal ultPagCiapModc) {
        this.ultPagCiapModc = ultPagCiapModc;
   }

   public BigDecimal getUltPagLivEntrad() {
        return ultPagLivEntrad;
   }

   public void setUltPagLivEntrad(BigDecimal ultPagLivEntrad) {
        this.ultPagLivEntrad = ultPagLivEntrad;
   }

   public BigDecimal getUltPagLivIcms() {
        return ultPagLivIcms;
   }

   public void setUltPagLivIcms(BigDecimal ultPagLivIcms) {
        this.ultPagLivIcms = ultPagLivIcms;
   }

   public BigDecimal getUltPagLivIpi() {
        return ultPagLivIpi;
   }

   public void setUltPagLivIpi(BigDecimal ultPagLivIpi) {
        this.ultPagLivIpi = ultPagLivIpi;
   }

   public BigDecimal getUltPagLivIss() {
        return ultPagLivIss;
   }

   public void setUltPagLivIss(BigDecimal ultPagLivIss) {
        this.ultPagLivIss = ultPagLivIss;
   }

   public BigDecimal getUltPagLivSaida() {
        return ultPagLivSaida;
   }

   public void setUltPagLivSaida(BigDecimal ultPagLivSaida) {
        this.ultPagLivSaida = ultPagLivSaida;
   }

   public String getUsaMovVertWms() {
        return usaMovVertWms;
   }

   public void setUsaMovVertWms(String usaMovVertWms) {
        this.usaMovVertWms = usaMovVertWms;
   }

   public String getUsaTributItens() {
        return usaTributItens;
   }

   public void setUsaTributItens(String usaTributItens) {
        this.usaTributItens = usaTributItens;
   }

   public String getUsuarioNfse() {
        return usuarioNfse;
   }

   public void setUsuarioNfse(String usuarioNfse) {
        this.usuarioNfse = usuarioNfse;
   }

   public String getUtilizaWms() {
        return utilizaWms;
   }

   public void setUtilizaWms(String utilizaWms) {
        this.utilizaWms = utilizaWms;
   }

   public BigDecimal getVersaoNfe() {
        return versaoNfe;
   }

   public void setVersaoNfe(BigDecimal versaoNfe) {
        this.versaoNfe = versaoNfe;
   }

   public String getVlrLiqItemNfe() {
        return vlrLiqItemNfe;
   }

   public void setVlrLiqItemNfe(String vlrLiqItemNfe) {
        this.vlrLiqItemNfe = vlrLiqItemNfe;
   }

   public BigDecimal getWmsCodEndGar() {
        return wmsCodEndGar;
   }

   public void setWmsCodEndGar(BigDecimal wmsCodEndGar) {
        this.wmsCodEndGar = wmsCodEndGar;
   }

   public BigDecimal getWmsLocalAjEst() {
        return wmsLocalAjEst;
   }

   public void setWmsLocalAjEst(BigDecimal wmsLocalAjEst) {
        this.wmsLocalAjEst = wmsLocalAjEst;
   }

   public String getWmsUsaRegVolFat() {
        return wmsUsaRegVolFat;
   }

   public void setWmsUsaRegVolFat(String wmsUsaRegVolFat) {
        this.wmsUsaRegVolFat = wmsUsaRegVolFat;
   }

   public Timestamp getDtInicioKardex() {
        return dtInicioKardex;
   }

   public void setDtInicioKardex(Timestamp dtInicioKardex) {
        this.dtInicioKardex = dtInicioKardex;
   }

   public String getGerLdPerTri() {
        return gerLdPerTri;
   }

   public void setGerLdPerTri(String gerLdPerTri) {
        this.gerLdPerTri = gerLdPerTri;
   }

   public String getIcmsSctTd() {
        return icmsSctTd;
   }

   public void setIcmsSctTd(String icmsSctTd) {
        this.icmsSctTd = icmsSctTd;
   }

   public BigDecimal getMaxNotasLoteNfe() {
        return maxNotasLoteNfe;
   }

   public void setMaxNotasLoteNfe(BigDecimal maxNotasLoteNfe) {
        this.maxNotasLoteNfe = maxNotasLoteNfe;
   }

   public BigDecimal getModDupl() {
        return modDupl;
   }

   public void setModDupl(BigDecimal modDupl) {
        this.modDupl = modDupl;
   }

   public BigDecimal getModExped() {
        return modExped;
   }

   public void setModExped(BigDecimal modExped) {
        this.modExped = modExped;
   }

   public String getNatPessoaJuridica() {
        return natPessoaJuridica;
   }

   public void setNatPessoaJuridica(String natPessoaJuridica) {
        this.natPessoaJuridica = natPessoaJuridica;
   }

   public String getNfe() {
        return nfe;
   }

   public void setNfe(String nfe) {
        this.nfe = nfe;
   }

   public String getNfse() {
        return nfse;
   }

   public void setNfse(String nfse) {
        this.nfse = nfse;
   }

   public String getNomeContador() {
        return nomeContador;
   }

   public void setNomeContador(String nomeContador) {
        this.nomeContador = nomeContador;
   }

   public String getCcm() {
        return ccm;
   }

   public void setCcm(String ccm) {
        this.ccm = ccm;
   }

   public String getAgrupaServFat() {
        return agrupaServFat;
   }

   public void setAgrupaServFat(String agrupaServFat) {
        this.agrupaServFat = agrupaServFat;
   }

   public String getAltContador() {
        return altContador;
   }

   public void setAltContador(String altContador) {
        this.altContador = altContador;
   }

   public String getArqModBoleto() {
        return arqModBoleto;
   }

   public void setArqModBoleto(String arqModBoleto) {
        this.arqModBoleto = arqModBoleto;
   }

   public BigDecimal getNotaSaiPerdaWms() {
        return notaSaiPerdaWms;
   }

   public void setNotaSaiPerdaWms(BigDecimal notaSaiPerdaWms) {
        this.notaSaiPerdaWms = notaSaiPerdaWms;
   }

   public BigDecimal getNuRfe() {
        return nuRfe;
   }

   public void setNuRfe(BigDecimal nuRfe) {
        this.nuRfe = nuRfe;
   }

   public BigDecimal getNuRfeCartaCorr() {
        return nuRfeCartaCorr;
   }

   public void setNuRfeCartaCorr(BigDecimal nuRfeCartaCorr) {
        this.nuRfeCartaCorr = nuRfeCartaCorr;
   }

   public String getCalcIss() {
        return calcIss;
   }

   public void setCalcIss(String calcIss) {
        this.calcIss = calcIss;
   }

   public BigDecimal getCalPercPis() {
        return calPercPis;
   }

   public void setCalPercPis(BigDecimal calPercPis) {
        this.calPercPis = calPercPis;
   }

   public BigDecimal getCodCenCus() {
        return codCenCus;
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        this.codCenCus = codCenCus;
   }

   public BigDecimal getCodCenCusDesp() {
        return codCenCusDesp;
   }

   public void setCodCenCusDesp(BigDecimal codCenCusDesp) {
        this.codCenCusDesp = codCenCusDesp;
   }

   public BigDecimal getCodCtabCoipad() {
        return codCtabCoipad;
   }

   public void setCodCtabCoipad(BigDecimal codCtabCoipad) {
        this.codCtabCoipad = codCtabCoipad;
   }

   public BigDecimal getCodCtactb1() {
        return codCtactb1;
   }

   public void setCodCtactb1(BigDecimal codCtactb1) {
        this.codCtactb1 = codCtactb1;
   }

   public BigDecimal getCodCtactb2() {
        return codCtactb2;
   }

   public void setCodCtactb2(BigDecimal codCtactb2) {
        this.codCtactb2 = codCtactb2;
   }

   public BigDecimal getCodCtactb3() {
        return codCtactb3;
   }

   public void setCodCtactb3(BigDecimal codCtactb3) {
        this.codCtactb3 = codCtactb3;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEmpMatrizEfd() {
        return codEmpMatrizEfd;
   }

   public void setCodEmpMatrizEfd(BigDecimal codEmpMatrizEfd) {
        this.codEmpMatrizEfd = codEmpMatrizEfd;
   }

   public BigDecimal getCodEndSobra() {
        return codEndSobra;
   }

   public void setCodEndSobra(BigDecimal codEndSobra) {
        this.codEndSobra = codEndSobra;
   }

   public BigDecimal getCodEndWms() {
        return codEndWms;
   }

   public void setCodEndWms(BigDecimal codEndWms) {
        this.codEndWms = codEndWms;
   }

   public BigDecimal getCodFormPrec() {
        return codFormPrec;
   }

   public void setCodFormPrec(BigDecimal codFormPrec) {
        this.codFormPrec = codFormPrec;
   }

   public String getCodGrupoTensao() {
        return codGrupoTensao;
   }

   public void setCodGrupoTensao(String codGrupoTensao) {
        this.codGrupoTensao = codGrupoTensao;
   }

   public BigDecimal getNotaSaiAjustEst() {
        return notaSaiAjustEst;
   }

   public void setNotaSaiAjustEst(BigDecimal notaSaiAjustEst) {
        this.notaSaiAjustEst = notaSaiAjustEst;
   }

   public String getUtilizaMde() {
        return utilizaMde;
   }

   public void setUtilizaMde(String utilizaMde) {
        this.utilizaMde = utilizaMde;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public String getCalcFunRural() {
        return calcFunRural;
   }

   public void setCalcFunRural(String calcFunRural) {
        this.calcFunRural = calcFunRural;
   }

   public String getCalcIcms() {
        return calcIcms;
   }

   public void setCalcIcms(String calcIcms) {
        this.calcIcms = calcIcms;
   }

   public String getCalcIrrf() {
        return calcIrrf;
   }

   public void setCalcIrrf(String calcIrrf) {
        this.calcIrrf = calcIrrf;
   }

   public BigDecimal getNotaEntAjustEst() {
        return notaEntAjustEst;
   }

   public void setNotaEntAjustEst(BigDecimal notaEntAjustEst) {
        this.notaEntAjustEst = notaEntAjustEst;
   }

   public BigDecimal getNotaEntSobraWms() {
        return notaEntSobraWms;
   }

   public void setNotaEntSobraWms(BigDecimal notaEntSobraWms) {
        this.notaEntSobraWms = notaEntSobraWms;
   }

   public String getCodTrib53() {
        return codTrib53;
   }

   public void setCodTrib53(String codTrib53) {
        this.codTrib53 = codTrib53;
   }

   public String getEnvRespContNfe() {
        return envRespContNfe;
   }

   public void setEnvRespContNfe(String envRespContNfe) {
        this.envRespContNfe = envRespContNfe;
   }

   public BigDecimal getTpObsFing4000() {
        return tpObsFing4000;
   }

   public void setTpObsFing4000(BigDecimal tpObsFing4000) {
        this.tpObsFing4000 = tpObsFing4000;
   }

   public BigDecimal getTpObsNotag4000() {
        return tpObsNotag4000;
   }

   public void setTpObsNotag4000(BigDecimal tpObsNotag4000) {
        this.tpObsNotag4000 = tpObsNotag4000;
   }

   public String getGerObsFing4000() {
        return gerObsFing4000;
   }

   public void setGerObsFing4000(String gerObsFing4000) {
        this.gerObsFing4000 = gerObsFing4000;
   }

   public BigDecimal getCodBcoIpi() {
        return codBcoIpi;
   }

   public void setCodBcoIpi(BigDecimal codBcoIpi) {
        this.codBcoIpi = codBcoIpi;
   }

   public String getTipTransmNfse() {
        return tipTransmNfse;
   }

   public void setTipTransmNfse(String tipTransmNfse) {
        this.tipTransmNfse = tipTransmNfse;
   }

   public BigDecimal getCodParcNfce() {
        return codParcNfce;
   }

   public void setCodParcNfce(BigDecimal codParcNfce) {
        this.codParcNfce = codParcNfce;
   }

   public String getIncentFiscalIssqn() {
        return incentFiscalIssqn;
   }

   public void setIncentFiscalIssqn(String incentFiscalIssqn) {
        this.incentFiscalIssqn = incentFiscalIssqn;
   }

   public String getSerieTopDifMenor() {
        return serieTopDifMenor;
   }

   public void setSerieTopDifMenor(String serieTopDifMenor) {
        this.serieTopDifMenor = serieTopDifMenor;
   }

   public String getSerieTopDifMaior() {
        return serieTopDifMaior;
   }

   public void setSerieTopDifMaior(String serieTopDifMaior) {
        this.serieTopDifMaior = serieTopDifMaior;
   }

   public String getTipIcmsTopEntSimNac() {
        return tipIcmsTopEntSimNac;
   }

   public void setTipIcmsTopEntSimNac(String tipIcmsTopEntSimNac) {
        this.tipIcmsTopEntSimNac = tipIcmsTopEntSimNac;
   }

   public BigDecimal getCodEnqIpiEnt() {
        return codEnqIpiEnt;
   }

   public void setCodEnqIpiEnt(BigDecimal codEnqIpiEnt) {
        this.codEnqIpiEnt = codEnqIpiEnt;
   }

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        this.codMeta = codMeta;
   }

   public BigDecimal getCodModNfceCompl() {
        return codModNfceCompl;
   }

   public void setCodModNfceCompl(BigDecimal codModNfceCompl) {
        this.codModNfceCompl = codModNfceCompl;
   }

   public BigDecimal getCodModNfceSimpl() {
        return codModNfceSimpl;
   }

   public void setCodModNfceSimpl(BigDecimal codModNfceSimpl) {
        this.codModNfceSimpl = codModNfceSimpl;
   }

   public BigDecimal getCodEnqIpiSai() {
        return codEnqIpiSai;
   }

   public void setCodEnqIpiSai(BigDecimal codEnqIpiSai) {
        this.codEnqIpiSai = codEnqIpiSai;
   }

   public BigDecimal getTopSaidaDifPesoWms() {
        return topSaidaDifPesoWms;
   }

   public void setTopSaidaDifPesoWms(BigDecimal topSaidaDifPesoWms) {
        this.topSaidaDifPesoWms = topSaidaDifPesoWms;
   }

   public BigDecimal getCodTabAlt() {
        return codTabAlt;
   }

   public void setCodTabAlt(BigDecimal codTabAlt) {
        this.codTabAlt = codTabAlt;
   }

   public BigDecimal getCodSmtp() {
        return codSmtp;
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        this.codSmtp = codSmtp;
   }

   public BigDecimal getTopEntDifPesoWms() {
        return topEntDifPesoWms;
   }

   public void setTopEntDifPesoWms(BigDecimal topEntDifPesoWms) {
        this.topEntDifPesoWms = topEntDifPesoWms;
   }

   public BigDecimal getCodTipParc() {
        return codTipParc;
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        this.codTipParc = codTipParc;
   }

   public BigDecimal getCorAgendado() {
        return corAgendado;
   }

   public void setCorAgendado(BigDecimal corAgendado) {
        this.corAgendado = corAgendado;
   }

   public BigDecimal getCorAtendido() {
        return corAtendido;
   }

   public void setCorAtendido(BigDecimal corAtendido) {
        this.corAtendido = corAtendido;
   }

   public BigDecimal getCorBloqueado() {
        return corBloqueado;
   }

   public void setCorBloqueado(BigDecimal corBloqueado) {
        this.corBloqueado = corBloqueado;
   }

   public BigDecimal getCorEncaixado() {
        return corEncaixado;
   }

   public void setCorEncaixado(BigDecimal corEncaixado) {
        this.corEncaixado = corEncaixado;
   }

   public BigDecimal getCorFaturado() {
        return corFaturado;
   }

   public void setCorFaturado(BigDecimal corFaturado) {
        this.corFaturado = corFaturado;
   }

   public BigDecimal getCorFixado() {
        return corFixado;
   }

   public void setCorFixado(BigDecimal corFixado) {
        this.corFixado = corFixado;
   }

   public BigDecimal getHoraFinal() {
        return horaFinal;
   }

   public void setHoraFinal(BigDecimal horaFinal) {
        this.horaFinal = horaFinal;
   }

   public BigDecimal getHoraInicial() {
        return horaInicial;
   }

   public void setHoraInicial(BigDecimal horaInicial) {
        this.horaInicial = horaInicial;
   }

   public BigDecimal getIntervalo() {
        return intervalo;
   }

   public void setIntervalo(BigDecimal intervalo) {
        this.intervalo = intervalo;
   }

   public BigDecimal getNotaModeloDAgenda() {
        return notaModeloDAgenda;
   }

   public void setNotaModeloDAgenda(BigDecimal notaModeloDAgenda) {
        this.notaModeloDAgenda = notaModeloDAgenda;
   }

   public BigDecimal getQtdLimiteMes() {
        return qtdLimiteMes;
   }

   public void setQtdLimiteMes(BigDecimal qtdLimiteMes) {
        this.qtdLimiteMes = qtdLimiteMes;
   }

   public String getValidaCpfCnpj() {
        return validaCpfCnpj;
   }

   public void setValidaCpfCnpj(String validaCpfCnpj) {
        this.validaCpfCnpj = validaCpfCnpj;
   }

   public String getWmsUsaEtiqPal() {
        return wmsUsaEtiqPal;
   }

   public void setWmsUsaEtiqPal(String wmsUsaEtiqPal) {
        this.wmsUsaEtiqPal = wmsUsaEtiqPal;
   }

   public String getGerObsNotag4000() {
        return gerObsNotag4000;
   }

   public void setGerObsNotag4000(String gerObsNotag4000) {
        this.gerObsNotag4000 = gerObsNotag4000;
   }

   public BigDecimal getMargSegPcp() {
        return margSegPcp;
   }

   public void setMargSegPcp(BigDecimal margSegPcp) {
        this.margSegPcp = margSegPcp;
   }

   public BigDecimal getSeqTokenNfce() {
        return seqTokenNfce;
   }

   public void setSeqTokenNfce(BigDecimal seqTokenNfce) {
        this.seqTokenNfce = seqTokenNfce;
   }

   public String getTokenNfce() {
        return tokenNfce;
   }

   public void setTokenNfce(String tokenNfce) {
        this.tokenNfce = tokenNfce;
   }

   public String getTpAmbMdfe() {
        return tpAmbMdfe;
   }

   public void setTpAmbMdfe(String tpAmbMdfe) {
        this.tpAmbMdfe = tpAmbMdfe;
   }

   public String getVlrLiqItemNfce() {
        return vlrLiqItemNfce;
   }

   public void setVlrLiqItemNfce(String vlrLiqItemNfce) {
        this.vlrLiqItemNfce = vlrLiqItemNfce;
   }

   public String getChaveDigitalAgiliblue() {
        return chaveDigitalAgiliblue;
   }

   public void setChaveDigitalAgiliblue(String chaveDigitalAgiliblue) {
        this.chaveDigitalAgiliblue = chaveDigitalAgiliblue;
   }

   public String getCodUsuNfse() {
        return codUsuNfse;
   }

   public void setCodUsuNfse(String codUsuNfse) {
        this.codUsuNfse = codUsuNfse;
   }

   public String getCodContrInfse() {
        return codContrInfse;
   }

   public void setCodContrInfse(String codContrInfse) {
        this.codContrInfse = codContrInfse;
   }

   public String getTemDenuesPont() {
        return temDenuesPont;
   }

   public void setTemDenuesPont(String temDenuesPont) {
        this.temDenuesPont = temDenuesPont;
   }

   public BigDecimal getPrzTolCancNota() {
        return przTolCancNota;
   }

   public void setPrzTolCancNota(BigDecimal przTolCancNota) {
        this.przTolCancNota = przTolCancNota;
   }

   public BigDecimal getPrzRegCancNota() {
        return przRegCancNota;
   }

   public void setPrzRegCancNota(BigDecimal przRegCancNota) {
        this.przRegCancNota = przRegCancNota;
   }

   public String getSerNaoTribBaseIss() {
        return serNaoTribBaseIss;
   }

   public void setSerNaoTribBaseIss(String serNaoTribBaseIss) {
        this.serNaoTribBaseIss = serNaoTribBaseIss;
   }

   public BigDecimal getCodEndArmIndef() {
        return codEndArmIndef;
   }

   public void setCodEndArmIndef(BigDecimal codEndArmIndef) {
        this.codEndArmIndef = codEndArmIndef;
   }

   public BigDecimal getCopiasDacte() {
        return copiasDacte;
   }

   public void setCopiasDacte(BigDecimal copiasDacte) {
        this.copiasDacte = copiasDacte;
   }

   public String getTpAmbCte() {
        return tpAmbCte;
   }

   public void setTpAmbCte(String tpAmbCte) {
        this.tpAmbCte = tpAmbCte;
   }

   public BigDecimal getCodModDacte() {
        return codModDacte;
   }

   public void setCodModDacte(BigDecimal codModDacte) {
        this.codModDacte = codModDacte;
   }

   public String getTipoEnvioCte() {
        return tipoEnvioCte;
   }

   public void setTipoEnvioCte(String tipoEnvioCte) {
        this.tipoEnvioCte = tipoEnvioCte;
   }

   public String getContingenciaCte() {
        return contingenciaCte;
   }

   public void setContingenciaCte(String contingenciaCte) {
        this.contingenciaCte = contingenciaCte;
   }

   public String getTipoDacte() {
        return tipoDacte;
   }

   public void setTipoDacte(String tipoDacte) {
        this.tipoDacte = tipoDacte;
   }

   public String getJobKeyNdd() {
        return jobKeyNdd;
   }

   public void setJobKeyNdd(String jobKeyNdd) {
        this.jobKeyNdd = jobKeyNdd;
   }

   public String getConectorNfse() {
        return conectorNfse;
   }

   public void setConectorNfse(String conectorNfse) {
        this.conectorNfse = conectorNfse;
   }

   public BigDecimal getCodCtactbDesc() {
        return codCtactbDesc;
   }

   public void setCodCtactbDesc(BigDecimal codCtactbDesc) {
        this.codCtactbDesc = codCtactbDesc;
   }

   public BigDecimal getCodCtactbJuros() {
        return codCtactbJuros;
   }

   public void setCodCtactbJuros(BigDecimal codCtactbJuros) {
        this.codCtactbJuros = codCtactbJuros;
   }

   public BigDecimal getCodCtactbMult() {
        return codCtactbMult;
   }

   public void setCodCtactbMult(BigDecimal codCtactbMult) {
        this.codCtactbMult = codCtactbMult;
   }

   public BigDecimal getCodEndCrossdock() {
        return codEndCrossdock;
   }

   public void setCodEndCrossdock(BigDecimal codEndCrossdock) {
        this.codEndCrossdock = codEndCrossdock;
   }

   public String getCodTrib90CredDeb() {
        return codTrib90CredDeb;
   }

   public void setCodTrib90CredDeb(String codTrib90CredDeb) {
        this.codTrib90CredDeb = codTrib90CredDeb;
   }

   public String getConIcmsMajFcpInt() {
        return conIcmsMajFcpInt;
   }

   public void setConIcmsMajFcpInt(String conIcmsMajFcpInt) {
        this.conIcmsMajFcpInt = conIcmsMajFcpInt;
   }

   public String getConsDevEvtr2050() {
        return consDevEvtr2050;
   }

   public void setConsDevEvtr2050(String consDevEvtr2050) {
        this.consDevEvtr2050 = consDevEvtr2050;
   }

   public String getConsIdBenef() {
        return consIdBenef;
   }

   public void setConsIdBenef(String consIdBenef) {
        this.consIdBenef = consIdBenef;
   }

   public String getContingenciaNfce() {
        return contingenciaNfce;
   }

   public void setContingenciaNfce(String contingenciaNfce) {
        this.contingenciaNfce = contingenciaNfce;
   }

   public BigDecimal getCopiasDanfce() {
        return copiasDanfce;
   }

   public void setCopiasDanfce(BigDecimal copiasDanfce) {
        this.copiasDanfce = copiasDanfce;
   }

   public String getDescRedDifCiap() {
        return descRedDifCiap;
   }

   public void setDescRedDifCiap(String descRedDifCiap) {
        this.descRedDifCiap = descRedDifCiap;
   }

   public String getDifAliqFcpInt() {
        return difAliqFcpInt;
   }

   public void setDifAliqFcpInt(String difAliqFcpInt) {
        this.difAliqFcpInt = difAliqFcpInt;
   }

   public String getEmailNotfeCreinf() {
        return emailNotfeCreinf;
   }

   public void setEmailNotfeCreinf(String emailNotfeCreinf) {
        this.emailNotfeCreinf = emailNotfeCreinf;
   }

   public String getEnvEmailConf() {
        return envEmailConf;
   }

   public void setEnvEmailConf(String envEmailConf) {
        this.envEmailConf = envEmailConf;
   }

   public String getEnvioSincronoCte() {
        return envioSincronoCte;
   }

   public void setEnvioSincronoCte(String envioSincronoCte) {
        this.envioSincronoCte = envioSincronoCte;
   }

   public String getEnvioSincronoNfce() {
        return envioSincronoNfce;
   }

   public void setEnvioSincronoNfce(String envioSincronoNfce) {
        this.envioSincronoNfce = envioSincronoNfce;
   }

   public String getEnvioSincronoNfe() {
        return envioSincronoNfe;
   }

   public void setEnvioSincronoNfe(String envioSincronoNfe) {
        this.envioSincronoNfe = envioSincronoNfe;
   }

   public BigDecimal getGerarRetencao() {
        return gerarRetencao;
   }

   public void setGerarRetencao(BigDecimal gerarRetencao) {
        this.gerarRetencao = gerarRetencao;
   }

   public String getGerarTaxFinEmbNfe() {
        return gerarTaxFinEmbNfe;
   }

   public void setGerarTaxFinEmbNfe(String gerarTaxFinEmbNfe) {
        this.gerarTaxFinEmbNfe = gerarTaxFinEmbNfe;
   }

   public String getIgCertifSmtpXml() {
        return igCertifSmtpXml;
   }

   public void setIgCertifSmtpXml(String igCertifSmtpXml) {
        this.igCertifSmtpXml = igCertifSmtpXml;
   }

   public String getInsXmlPorImpSmtpXml() {
        return insXmlPorImpSmtpXml;
   }

   public void setInsXmlPorImpSmtpXml(String insXmlPorImpSmtpXml) {
        this.insXmlPorImpSmtpXml = insXmlPorImpSmtpXml;
   }

   public BigDecimal getIntConsSmtpXml() {
        return intConsSmtpXml;
   }

   public void setIntConsSmtpXml(BigDecimal intConsSmtpXml) {
        this.intConsSmtpXml = intConsSmtpXml;
   }

   public String getNfseStAntConsFinal() {
        return nfseStAntConsFinal;
   }

   public void setNfseStAntConsFinal(String nfseStAntConsFinal) {
        this.nfseStAntConsFinal = nfseStAntConsFinal;
   }

   public BigDecimal getNotaEntAjustEstCons() {
        return notaEntAjustEstCons;
   }

   public void setNotaEntAjustEstCons(BigDecimal notaEntAjustEstCons) {
        this.notaEntAjustEstCons = notaEntAjustEstCons;
   }

   public BigDecimal getNotaEntAjustEstCter() {
        return notaEntAjustEstCter;
   }

   public void setNotaEntAjustEstCter(BigDecimal notaEntAjustEstCter) {
        this.notaEntAjustEstCter = notaEntAjustEstCter;
   }

   public BigDecimal getNotaEntAjustEstDter() {
        return notaEntAjustEstDter;
   }

   public void setNotaEntAjustEstDter(BigDecimal notaEntAjustEstDter) {
        this.notaEntAjustEstDter = notaEntAjustEstDter;
   }

   public BigDecimal getNotaSaiAjustBem() {
        return notaSaiAjustBem;
   }

   public void setNotaSaiAjustBem(BigDecimal notaSaiAjustBem) {
        this.notaSaiAjustBem = notaSaiAjustBem;
   }

   public BigDecimal getNotaSaiAjustEstCons() {
        return notaSaiAjustEstCons;
   }

   public void setNotaSaiAjustEstCons(BigDecimal notaSaiAjustEstCons) {
        this.notaSaiAjustEstCons = notaSaiAjustEstCons;
   }

   public BigDecimal getNotaSaiAjustEstCter() {
        return notaSaiAjustEstCter;
   }

   public void setNotaSaiAjustEstCter(BigDecimal notaSaiAjustEstCter) {
        this.notaSaiAjustEstCter = notaSaiAjustEstCter;
   }

   public BigDecimal getNotaSaiAjustEstDter() {
        return notaSaiAjustEstDter;
   }

   public void setNotaSaiAjustEstDter(BigDecimal notaSaiAjustEstDter) {
        this.notaSaiAjustEstDter = notaSaiAjustEstDter;
   }

   public String getNumDocR2020() {
        return numDocR2020;
   }

   public void setNumDocR2020(String numDocR2020) {
        this.numDocR2020 = numDocR2020;
   }

   public BigDecimal getNuNotaDemFx() {
        return nuNotaDemFx;
   }

   public void setNuNotaDemFx(BigDecimal nuNotaDemFx) {
        this.nuNotaDemFx = nuNotaDemFx;
   }

   public BigDecimal getNuNotaModFx() {
        return nuNotaModFx;
   }

   public void setNuNotaModFx(BigDecimal nuNotaModFx) {
        this.nuNotaModFx = nuNotaModFx;
   }

   public BigDecimal getNuNotaTrcFx() {
        return nuNotaTrcFx;
   }

   public void setNuNotaTrcFx(BigDecimal nuNotaTrcFx) {
        this.nuNotaTrcFx = nuNotaTrcFx;
   }

   public String getOrigProdComIpi() {
        return origProdComIpi;
   }

   public void setOrigProdComIpi(String origProdComIpi) {
        this.origProdComIpi = origProdComIpi;
   }

   public String getPermOutroUsuSepPed() {
        return permOutroUsuSepPed;
   }

   public void setPermOutroUsuSepPed(String permOutroUsuSepPed) {
        this.permOutroUsuSepPed = permOutroUsuSepPed;
   }

   public BigDecimal getPortaSmtpXml() {
        return portaSmtpXml;
   }

   public void setPortaSmtpXml(BigDecimal portaSmtpXml) {
        this.portaSmtpXml = portaSmtpXml;
   }

   public String getProgAquisAlim() {
        return progAquisAlim;
   }

   public void setProgAquisAlim(String progAquisAlim) {
        this.progAquisAlim = progAquisAlim;
   }

   public Timestamp getProxExecSmtpXml() {
        return proxExecSmtpXml;
   }

   public void setProxExecSmtpXml(Timestamp proxExecSmtpXml) {
        this.proxExecSmtpXml = proxExecSmtpXml;
   }

   public String getQrcodeNfceVersao2() {
        return qrcodeNfceVersao2;
   }

   public void setQrcodeNfceVersao2(String qrcodeNfceVersao2) {
        this.qrcodeNfceVersao2 = qrcodeNfceVersao2;
   }

   public String getRedIssBcPisConf() {
        return redIssBcPisConf;
   }

   public void setRedIssBcPisConf(String redIssBcPisConf) {
        this.redIssBcPisConf = redIssBcPisConf;
   }

   public String getRedStCompBcPisCofins() {
        return redStCompBcPisCofins;
   }

   public void setRedStCompBcPisCofins(String redStCompBcPisCofins) {
        this.redStCompBcPisCofins = redStCompBcPisCofins;
   }

   public String getSenhaSmtpXml() {
        return senhaSmtpXml;
   }

   public void setSenhaSmtpXml(String senhaSmtpXml) {
        this.senhaSmtpXml = senhaSmtpXml;
   }

   public String getServidorSmtpXml() {
        return servidorSmtpXml;
   }

   public void setServidorSmtpXml(String servidorSmtpXml) {
        this.servidorSmtpXml = servidorSmtpXml;
   }

   public String getSuprimirEmailDest() {
        return suprimirEmailDest;
   }

   public void setSuprimirEmailDest(String suprimirEmailDest) {
        this.suprimirEmailDest = suprimirEmailDest;
   }

   public String getTipConexSmtpXml() {
        return tipConexSmtpXml;
   }

   public void setTipConexSmtpXml(String tipConexSmtpXml) {
        this.tipConexSmtpXml = tipConexSmtpXml;
   }

   public String getTipDataEvtServ() {
        return tipDataEvtServ;
   }

   public void setTipDataEvtServ(String tipDataEvtServ) {
        this.tipDataEvtServ = tipDataEvtServ;
   }

   public String getTipGerInfGveicGreb() {
        return tipGerInfGveicGreb;
   }

   public void setTipGerInfGveicGreb(String tipGerInfGveicGreb) {
        this.tipGerInfGveicGreb = tipGerInfGveicGreb;
   }

   public String getTipoEnvioNfce() {
        return tipoEnvioNfce;
   }

   public void setTipoEnvioNfce(String tipoEnvioNfce) {
        this.tipoEnvioNfce = tipoEnvioNfce;
   }

   public String getUltNsuCte() {
        return ultNsuCte;
   }

   public void setUltNsuCte(String ultNsuCte) {
        this.ultNsuCte = ultNsuCte;
   }

   public String getUsaCodBarrasConcatWms() {
        return usaCodBarrasConcatWms;
   }

   public void setUsaCodBarrasConcatWms(String usaCodBarrasConcatWms) {
        this.usaCodBarrasConcatWms = usaCodBarrasConcatWms;
   }

   public String getUsaNomeComplItem() {
        return usaNomeComplItem;
   }

   public void setUsaNomeComplItem(String usaNomeComplItem) {
        this.usaNomeComplItem = usaNomeComplItem;
   }

   public String getUsaRecParcial() {
        return usaRecParcial;
   }

   public void setUsaRecParcial(String usaRecParcial) {
        this.usaRecParcial = usaRecParcial;
   }

   public String getUsaStExtNotaRestSt() {
        return usaStExtNotaRestSt;
   }

   public void setUsaStExtNotaRestSt(String usaStExtNotaRestSt) {
        this.usaStExtNotaRestSt = usaStExtNotaRestSt;
   }

   public String getUsuarioSmtpXml() {
        return usuarioSmtpXml;
   }

   public void setUsuarioSmtpXml(String usuarioSmtpXml) {
        this.usuarioSmtpXml = usuarioSmtpXml;
   }

   public String getUtilizaDfeTransp() {
        return utilizaDfeTransp;
   }

   public void setUtilizaDfeTransp(String utilizaDfeTransp) {
        this.utilizaDfeTransp = utilizaDfeTransp;
   }

   public String getUtilizaExploteSep() {
        return utilizaExploteSep;
   }

   public void setUtilizaExploteSep(String utilizaExploteSep) {
        this.utilizaExploteSep = utilizaExploteSep;
   }

   public String getUtilizaSepPulmao() {
        return utilizaSepPulmao;
   }

   public void setUtilizaSepPulmao(String utilizaSepPulmao) {
        this.utilizaSepPulmao = utilizaSepPulmao;
   }

   public String getUtilizaTriCrossdocking() {
        return utilizaTriCrossdocking;
   }

   public void setUtilizaTriCrossdocking(String utilizaTriCrossdocking) {
        this.utilizaTriCrossdocking = utilizaTriCrossdocking;
   }

   public BigDecimal getVersaoNt() {
        return versaoNt;
   }

   public void setVersaoNt(BigDecimal versaoNt) {
        this.versaoNt = versaoNt;
   }

   public BigDecimal getVersaoNtCte() {
        return versaoNtCte;
   }

   public void setVersaoNtCte(BigDecimal versaoNtCte) {
        this.versaoNtCte = versaoNtCte;
   }

   public BigDecimal getVersaoNtMdfe() {
        return versaoNtMdfe;
   }

   public void setVersaoNtMdfe(BigDecimal versaoNtMdfe) {
        this.versaoNtMdfe = versaoNtMdfe;
   }

   public String getWmsArmTotalCol() {
        return wmsArmTotalCol;
   }

   public void setWmsArmTotalCol(String wmsArmTotalCol) {
        this.wmsArmTotalCol = wmsArmTotalCol;
   }

   public String getWmsInfoPesoDetVol() {
        return wmsInfoPesoDetVol;
   }

   public void setWmsInfoPesoDetVol(String wmsInfoPesoDetVol) {
        this.wmsInfoPesoDetVol = wmsInfoPesoDetVol;
   }

   public String getWmsMultiUsuConf() {
        return wmsMultiUsuConf;
   }

   public void setWmsMultiUsuConf(String wmsMultiUsuConf) {
        this.wmsMultiUsuConf = wmsMultiUsuConf;
   }

   public String getWmsUsaImpFechaVol() {
        return wmsUsaImpFechaVol;
   }

   public void setWmsUsaImpFechaVol(String wmsUsaImpFechaVol) {
        this.wmsUsaImpFechaVol = wmsUsaImpFechaVol;
   }

   public String getWmsUsaRegVolRec() {
        return wmsUsaRegVolRec;
   }

   public void setWmsUsaRegVolRec(String wmsUsaRegVolRec) {
        this.wmsUsaRegVolRec = wmsUsaRegVolRec;
   }

   public String getAedfe() {
        return aedfe;
   }

   public void setAedfe(String aedfe) {
        this.aedfe = aedfe;
   }

   public String getAtualCbeneffat() {
        return atualCbeneffat;
   }

   public void setAtualCbeneffat(String atualCbeneffat) {
        this.atualCbeneffat = atualCbeneffat;
   }

   public String getCalcIcmsStNaoCont() {
        return calcIcmsStNaoCont;
   }

   public void setCalcIcmsStNaoCont(String calcIcmsStNaoCont) {
        this.calcIcmsStNaoCont = calcIcmsStNaoCont;
   }

   public BigDecimal getCodTabCkc() {
        return codTabCkc;
   }

   public void setCodTabCkc(BigDecimal codTabCkc) {
        this.codTabCkc = codTabCkc;
   }

   public String getReabCompleto() {
        return reabCompleto;
   }

   public void setReabCompleto(String reabCompleto) {
        this.reabCompleto = reabCompleto;
   }

   public BigDecimal getAliqCfBonif() {
        return aliqCfBonif;
   }

   public void setAliqCfBonif(BigDecimal aliqCfBonif) {
        this.aliqCfBonif = aliqCfBonif;
   }

   public BigDecimal getAliqPisBonif() {
        return aliqPisBonif;
   }

   public void setAliqPisBonif(BigDecimal aliqPisBonif) {
        this.aliqPisBonif = aliqPisBonif;
   }

   public BigDecimal getCodCtactbBonif() {
        return codCtactbBonif;
   }

   public void setCodCtactbBonif(BigDecimal codCtactbBonif) {
        this.codCtactbBonif = codCtactbBonif;
   }

   public String getCodStPisCfBonif() {
        return codStPisCfBonif;
   }

   public void setCodStPisCfBonif(String codStPisCfBonif) {
        this.codStPisCfBonif = codStPisCfBonif;
   }

   public String getMdfeDocSemisPropria() {
        return mdfeDocSemisPropria;
   }

   public void setMdfeDocSemisPropria(String mdfeDocSemisPropria) {
        this.mdfeDocSemisPropria = mdfeDocSemisPropria;
   }

   public BigDecimal getNuRfeCartaCorrCte() {
        return nuRfeCartaCorrCte;
   }

   public void setNuRfeCartaCorrCte(BigDecimal nuRfeCartaCorrCte) {
        this.nuRfeCartaCorrCte = nuRfeCartaCorrCte;
   }

   public String getTribPisCfBonif() {
        return tribPisCfBonif;
   }

   public void setTribPisCfBonif(String tribPisCfBonif) {
        this.tribPisCfBonif = tribPisCfBonif;
   }

   public String getGerLivIcmsEmpSn() {
        return gerLivIcmsEmpSn;
   }

   public void setGerLivIcmsEmpSn(String gerLivIcmsEmpSn) {
        this.gerLivIcmsEmpSn = gerLivIcmsEmpSn;
   }

   public BigDecimal getCodForDifAliq() {
        return codForDifAliq;
   }

   public void setCodForDifAliq(BigDecimal codForDifAliq) {
        this.codForDifAliq = codForDifAliq;
   }

   public String getDefCstIpi00() {
        return defCstIpi00;
   }

   public void setDefCstIpi00(String defCstIpi00) {
        this.defCstIpi00 = defCstIpi00;
   }

   public String getDefCstIpi01() {
        return defCstIpi01;
   }

   public void setDefCstIpi01(String defCstIpi01) {
        this.defCstIpi01 = defCstIpi01;
   }

   public String getDefCstIpi02() {
        return defCstIpi02;
   }

   public void setDefCstIpi02(String defCstIpi02) {
        this.defCstIpi02 = defCstIpi02;
   }

   public String getDefCstIpi03() {
        return defCstIpi03;
   }

   public void setDefCstIpi03(String defCstIpi03) {
        this.defCstIpi03 = defCstIpi03;
   }

   public String getDefCstIpi04() {
        return defCstIpi04;
   }

   public void setDefCstIpi04(String defCstIpi04) {
        this.defCstIpi04 = defCstIpi04;
   }

   public String getDefCstIpi05() {
        return defCstIpi05;
   }

   public void setDefCstIpi05(String defCstIpi05) {
        this.defCstIpi05 = defCstIpi05;
   }

   public String getDefCstIpi49() {
        return defCstIpi49;
   }

   public void setDefCstIpi49(String defCstIpi49) {
        this.defCstIpi49 = defCstIpi49;
   }

   public String getDefCstIpi50() {
        return defCstIpi50;
   }

   public void setDefCstIpi50(String defCstIpi50) {
        this.defCstIpi50 = defCstIpi50;
   }

   public String getDefCstIpi51() {
        return defCstIpi51;
   }

   public void setDefCstIpi51(String defCstIpi51) {
        this.defCstIpi51 = defCstIpi51;
   }

   public String getDefCstIpi52() {
        return defCstIpi52;
   }

   public void setDefCstIpi52(String defCstIpi52) {
        this.defCstIpi52 = defCstIpi52;
   }

   public String getDefCstIpi53() {
        return defCstIpi53;
   }

   public void setDefCstIpi53(String defCstIpi53) {
        this.defCstIpi53 = defCstIpi53;
   }

   public String getDefCstIpi54() {
        return defCstIpi54;
   }

   public void setDefCstIpi54(String defCstIpi54) {
        this.defCstIpi54 = defCstIpi54;
   }

   public String getDefCstIpi55() {
        return defCstIpi55;
   }

   public void setDefCstIpi55(String defCstIpi55) {
        this.defCstIpi55 = defCstIpi55;
   }

   public String getDefCstIpi99() {
        return defCstIpi99;
   }

   public void setDefCstIpi99(String defCstIpi99) {
        this.defCstIpi99 = defCstIpi99;
   }

   public String getIpiTributDefEmp() {
        return ipiTributDefEmp;
   }

   public void setIpiTributDefEmp(String ipiTributDefEmp) {
        this.ipiTributDefEmp = ipiTributDefEmp;
   }

   public String getEscritCompraEmissProp() {
        return escritCompraEmissProp;
   }

   public void setEscritCompraEmissProp(String escritCompraEmissProp) {
        this.escritCompraEmissProp = escritCompraEmissProp;
   }

   public String getGeraNotaEntCanc() {
        return geraNotaEntCanc;
   }

   public void setGeraNotaEntCanc(String geraNotaEntCanc) {
        this.geraNotaEntCanc = geraNotaEntCanc;
   }

   public String getMetCalcDifIcms() {
        return metCalcDifIcms;
   }

   public void setMetCalcDifIcms(String metCalcDifIcms) {
        this.metCalcDifIcms = metCalcDifIcms;
   }

   public BigDecimal getPesMaxSepAgru() {
        return pesMaxSepAgru;
   }

   public void setPesMaxSepAgru(BigDecimal pesMaxSepAgru) {
        this.pesMaxSepAgru = pesMaxSepAgru;
   }

   public String getUsaSepAgrupProd() {
        return usaSepAgrupProd;
   }

   public void setUsaSepAgrupProd(String usaSepAgrupProd) {
        this.usaSepAgrupProd = usaSepAgrupProd;
   }

   public BigDecimal getQtPedSepAgr() {
        return qtPedSepAgr;
   }

   public void setQtPedSepAgr(BigDecimal qtPedSepAgr) {
        this.qtPedSepAgr = qtPedSepAgr;
   }

   public BigDecimal getQtCheckSep() {
        return qtCheckSep;
   }

   public void setQtCheckSep(BigDecimal qtCheckSep) {
        this.qtCheckSep = qtCheckSep;
   }

   public BigDecimal getVolCheckSepProd() {
        return volCheckSepProd;
   }

   public void setVolCheckSepProd(BigDecimal volCheckSepProd) {
        this.volCheckSepProd = volCheckSepProd;
   }

   public String getConsRepIcmsBasePisCof() {
        return consRepIcmsBasePisCof;
   }

   public void setConsRepIcmsBasePisCof(String consRepIcmsBasePisCof) {
        this.consRepIcmsBasePisCof = consRepIcmsBasePisCof;
   }

   public BigDecimal getAliqPisDesc() {
        return aliqPisDesc;
   }

   public void setAliqPisDesc(BigDecimal aliqPisDesc) {
        this.aliqPisDesc = aliqPisDesc;
   }

   public BigDecimal getAliqCfJuros() {
        return aliqCfJuros;
   }

   public void setAliqCfJuros(BigDecimal aliqCfJuros) {
        this.aliqCfJuros = aliqCfJuros;
   }

   public BigDecimal getLocalPadEconect() {
        return localPadEconect;
   }

   public void setLocalPadEconect(BigDecimal localPadEconect) {
        this.localPadEconect = localPadEconect;
   }

   public BigDecimal getAliqCfDesc() {
        return aliqCfDesc;
   }

   public void setAliqCfDesc(BigDecimal aliqCfDesc) {
        this.aliqCfDesc = aliqCfDesc;
   }

   public String getJobMdEndDigital() {
        return jobMdEndDigital;
   }

   public void setJobMdEndDigital(String jobMdEndDigital) {
        this.jobMdEndDigital = jobMdEndDigital;
   }

   public String getCodStPisCfDesc() {
        return codStPisCfDesc;
   }

   public void setCodStPisCfDesc(String codStPisCfDesc) {
        this.codStPisCfDesc = codStPisCfDesc;
   }

   public String getCodStPisCfJuros() {
        return codStPisCfJuros;
   }

   public void setCodStPisCfJuros(String codStPisCfJuros) {
        this.codStPisCfJuros = codStPisCfJuros;
   }

   public BigDecimal getAliqPisJuros() {
        return aliqPisJuros;
   }

   public void setAliqPisJuros(BigDecimal aliqPisJuros) {
        this.aliqPisJuros = aliqPisJuros;
   }

   public String getTribPisCfDesc() {
        return tribPisCfDesc;
   }

   public void setTribPisCfDesc(String tribPisCfDesc) {
        this.tribPisCfDesc = tribPisCfDesc;
   }

   public String getTribPisCfJuros() {
        return tribPisCfJuros;
   }

   public void setTribPisCfJuros(String tribPisCfJuros) {
        this.tribPisCfJuros = tribPisCfJuros;
   }

   public BigDecimal getAliqPisMult() {
        return aliqPisMult;
   }

   public void setAliqPisMult(BigDecimal aliqPisMult) {
        this.aliqPisMult = aliqPisMult;
   }

   public BigDecimal getAliqCfMult() {
        return aliqCfMult;
   }

   public void setAliqCfMult(BigDecimal aliqCfMult) {
        this.aliqCfMult = aliqCfMult;
   }

   public String getCodStPisCfMult() {
        return codStPisCfMult;
   }

   public void setCodStPisCfMult(String codStPisCfMult) {
        this.codStPisCfMult = codStPisCfMult;
   }

   public String getTribPisCfMult() {
        return tribPisCfMult;
   }

   public void setTribPisCfMult(String tribPisCfMult) {
        this.tribPisCfMult = tribPisCfMult;
   }

   public String getCertificadoPix() {
        return certificadoPix;
   }

   public void setCertificadoPix(String certificadoPix) {
        this.certificadoPix = certificadoPix;
   }

   public String getImpCteEmisProp() {
        return impCteEmisProp;
   }

   public void setImpCteEmisProp(String impCteEmisProp) {
        this.impCteEmisProp = impCteEmisProp;
   }

   public BigDecimal getCodEndRetExp() {
        return codEndRetExp;
   }

   public void setCodEndRetExp(BigDecimal codEndRetExp) {
        this.codEndRetExp = codEndRetExp;
   }

   public String getRedIcmsBcPisConfins() {
        return redIcmsBcPisConfins;
   }

   public void setRedIcmsBcPisConfins(String redIcmsBcPisConfins) {
        this.redIcmsBcPisConfins = redIcmsBcPisConfins;
   }

   public String getUltNsu() {
        return ultNsu;
   }

   public void setUltNsu(String ultNsu) {
        this.ultNsu = ultNsu;
   }

   public String getUsaInfoAdConfPed() {
        return usaInfoAdConfPed;
   }

   public void setUsaInfoAdConfPed(String usaInfoAdConfPed) {
        this.usaInfoAdConfPed = usaInfoAdConfPed;
   }

   public BigDecimal getNfseObsIterps() {
        return nfseObsIterps;
   }

   public void setNfseObsIterps(BigDecimal nfseObsIterps) {
        this.nfseObsIterps = nfseObsIterps;
   }

   public BigDecimal getQtdCarNfseObsIterps() {
        return qtdCarNfseObsIterps;
   }

   public void setQtdCarNfseObsIterps(BigDecimal qtdCarNfseObsIterps) {
        this.qtdCarNfseObsIterps = qtdCarNfseObsIterps;
   }

   public String getCaepf() {
        return caepf;
   }

   public void setCaepf(String caepf) {
        this.caepf = caepf;
   }

   public String getCafir() {
        return cafir;
   }

   public void setCafir(String cafir) {
        this.cafir = cafir;
   }

   public String getGerAlcdpr() {
        return gerAlcdpr;
   }

   public void setGerAlcdpr(String gerAlcdpr) {
        this.gerAlcdpr = gerAlcdpr;
   }

   public String getTipoExploracao() {
        return tipoExploracao;
   }

   public void setTipoExploracao(String tipoExploracao) {
        this.tipoExploracao = tipoExploracao;
   }

   public String getBaixaFinPreEmissNfce() {
        return baixaFinPreEmissNfce;
   }

   public void setBaixaFinPreEmissNfce(String baixaFinPreEmissNfce) {
        this.baixaFinPreEmissNfce = baixaFinPreEmissNfce;
   }

   public String getIcmsNormalDifIcmsSn() {
        return icmsNormalDifIcmsSn;
   }

   public void setIcmsNormalDifIcmsSn(String icmsNormalDifIcmsSn) {
        this.icmsNormalDifIcmsSn = icmsNormalDifIcmsSn;
   }

   public String getDirFcpfResp() {
        return dirFcpfResp;
   }

   public void setDirFcpfResp(String dirFcpfResp) {
        this.dirFcpfResp = dirFcpfResp;
   }

   public String getDirFDepDecJud() {
        return dirFDepDecJud;
   }

   public void setDirFDepDecJud(String dirFDepDecJud) {
        this.dirFDepDecJud = dirFDepDecJud;
   }

   public String getDirFDepFunInv() {
        return dirFDepFunInv;
   }

   public void setDirFDepFunInv(String dirFDepFunInv) {
        this.dirFDepFunInv = dirFDepFunInv;
   }

   public Timestamp getDirFdhevento() {
        return dirFdhevento;
   }

   public void setDirFdhevento(Timestamp dirFdhevento) {
        this.dirFdhevento = dirFdhevento;
   }

   public String getDirFentImune() {
        return dirFentImune;
   }

   public void setDirFentImune(String dirFentImune) {
        this.dirFentImune = dirFentImune;
   }

   public String getDirFnatDecl() {
        return dirFnatDecl;
   }

   public void setDirFnatDecl(String dirFnatDecl) {
        this.dirFnatDecl = dirFnatDecl;
   }

   public String getDirFpgExt() {
        return dirFpgExt;
   }

   public void setDirFpgExt(String dirFpgExt) {
        this.dirFpgExt = dirFpgExt;
   }

   public String getDirFpgFundPub() {
        return dirFpgFundPub;
   }

   public void setDirFpgFundPub(String dirFpgFundPub) {
        this.dirFpgFundPub = dirFpgFundPub;
   }

   public String getDirFplPriAss() {
        return dirFplPriAss;
   }

   public void setDirFplPriAss(String dirFplPriAss) {
        this.dirFplPriAss = dirFplPriAss;
   }

   public String getDirFsitEsp() {
        return dirFsitEsp;
   }

   public void setDirFsitEsp(String dirFsitEsp) {
        this.dirFsitEsp = dirFsitEsp;
   }

   public String getDirFsocost() {
        return dirFsocost;
   }

   public void setDirFsocost(String dirFsocost) {
        this.dirFsocost = dirFsocost;
   }

   public String getTempPremiacaoEstadual() {
        return tempPremiacaoEstadual;
   }

   public void setTempPremiacaoEstadual(String tempPremiacaoEstadual) {
        this.tempPremiacaoEstadual = tempPremiacaoEstadual;
   }

   public BigDecimal getCodClassifEstab() {
        return codClassifEstab;
   }

   public void setCodClassifEstab(BigDecimal codClassifEstab) {
        this.codClassifEstab = codClassifEstab;
   }

   public String getRedPisBcPisCofins() {
        return redPisBcPisCofins;
   }

   public void setRedPisBcPisCofins(String redPisBcPisCofins) {
        this.redPisBcPisCofins = redPisBcPisCofins;
   }

   public BigDecimal getNuRfeProducao() {
        return nuRfeProducao;
   }

   public void setNuRfeProducao(BigDecimal nuRfeProducao) {
        this.nuRfeProducao = nuRfeProducao;
   }

   public String getImpressoraEtqSep() {
        return impressoraEtqSep;
   }

   public void setImpressoraEtqSep(String impressoraEtqSep) {
        this.impressoraEtqSep = impressoraEtqSep;
   }

   public String getFiltroAliqIcmsSql() {
        return filtroAliqIcmsSql;
   }

   public void setFiltroAliqIcmsSql(String filtroAliqIcmsSql) {
        this.filtroAliqIcmsSql = filtroAliqIcmsSql;
   }

   public String getClasConsAgua() {
        return clasConsAgua;
   }

   public void setClasConsAgua(String clasConsAgua) {
        this.clasConsAgua = clasConsAgua;
   }

   public String getClasConsEnerg() {
        return clasConsEnerg;
   }

   public void setClasConsEnerg(String clasConsEnerg) {
        this.clasConsEnerg = clasConsEnerg;
   }

   public String getClasConsGas() {
        return clasConsGas;
   }

   public void setClasConsGas(String clasConsGas) {
        this.clasConsGas = clasConsGas;
   }

   public String getIdentEct() {
        return identEct;
   }

   public void setIdentEct(String identEct) {
        this.identEct = identEct;
   }

   public String getWmsDocAsepBalcao() {
        return wmsDocAsepBalcao;
   }

   public void setWmsDocAsepBalcao(String wmsDocAsepBalcao) {
        this.wmsDocAsepBalcao = wmsDocAsepBalcao;
   }

   public String getEfdh010() {
        return efdh010;
   }

   public void setEfdh010(String efdh010) {
        this.efdh010 = efdh010;
   }

   public String getEfdh010Prter() {
        return efdh010Prter;
   }

   public void setEfdh010Prter(String efdh010Prter) {
        this.efdh010Prter = efdh010Prter;
   }

   public String getEfdh010Ter() {
        return efdh010Ter;
   }

   public void setEfdh010Ter(String efdh010Ter) {
        this.efdh010Ter = efdh010Ter;
   }

   public String getUtilizaExplote() {
        return utilizaExplote;
   }

   public void setUtilizaExplote(String utilizaExplote) {
        this.utilizaExplote = utilizaExplote;
   }

   public BigDecimal getCodRelMinutaOdp() {
        return codRelMinutaOdp;
   }

   public void setCodRelMinutaOdp(BigDecimal codRelMinutaOdp) {
        this.codRelMinutaOdp = codRelMinutaOdp;
   }

   public String getSenhaEct() {
        return senhaEct;
   }

   public void setSenhaEct(String senhaEct) {
        this.senhaEct = senhaEct;
   }

   public Timestamp getDtRefPreProdFictReinf() {
        return dtRefPreProdFictReinf;
   }

   public void setDtRefPreProdFictReinf(Timestamp dtRefPreProdFictReinf) {
        this.dtRefPreProdFictReinf = dtRefPreProdFictReinf;
   }

   public Timestamp getDtRefPreProdReaisReinf() {
        return dtRefPreProdReaisReinf;
   }

   public void setDtRefPreProdReaisReinf(Timestamp dtRefPreProdReaisReinf) {
        this.dtRefPreProdReaisReinf = dtRefPreProdReaisReinf;
   }

   public Timestamp getDtRefProdReinf() {
        return dtRefProdReinf;
   }

   public void setDtRefProdReinf(Timestamp dtRefProdReinf) {
        this.dtRefProdReinf = dtRefProdReinf;
   }

   public Timestamp getDtValFinReinf() {
        return dtValFinReinf;
   }

   public void setDtValFinReinf(Timestamp dtValFinReinf) {
        this.dtValFinReinf = dtValFinReinf;
   }

   public Timestamp getDtValIniReinf() {
        return dtValIniReinf;
   }

   public void setDtValIniReinf(Timestamp dtValIniReinf) {
        this.dtValIniReinf = dtValIniReinf;
   }

   public String getEmpAdmPubDir() {
        return empAdmPubDir;
   }

   public void setEmpAdmPubDir(String empAdmPubDir) {
        this.empAdmPubDir = empAdmPubDir;
   }

   public String getEntregaEcd() {
        return entregaEcd;
   }

   public void setEntregaEcd(String entregaEcd) {
        this.entregaEcd = entregaEcd;
   }

   public String getIdentEctRastreio() {
        return identEctRastreio;
   }

   public void setIdentEctRastreio(String identEctRastreio) {
        this.identEctRastreio = identEctRastreio;
   }

   public String getImpNfeEmissProp() {
        return impNfeEmissProp;
   }

   public void setImpNfeEmissProp(String impNfeEmissProp) {
        this.impNfeEmissProp = impNfeEmissProp;
   }

   public String getPartCanalVerde() {
        return partCanalVerde;
   }

   public void setPartCanalVerde(String partCanalVerde) {
        this.partCanalVerde = partCanalVerde;
   }

   public BigDecimal getAmbienteReinf() {
        return ambienteReinf;
   }

   public void setAmbienteReinf(BigDecimal ambienteReinf) {
        this.ambienteReinf = ambienteReinf;
   }

   public String getCamConvPref() {
        return camConvPref;
   }

   public void setCamConvPref(String camConvPref) {
        this.camConvPref = camConvPref;
   }

   public String getCnpjEfrVinc() {
        return cnpjEfrVinc;
   }

   public void setCnpjEfrVinc(String cnpjEfrVinc) {
        this.cnpjEfrVinc = cnpjEfrVinc;
   }

   public String getDesonerafolhaCprb() {
        return desonerafolhaCprb;
   }

   public void setDesonerafolhaCprb(String desonerafolhaCprb) {
        this.desonerafolhaCprb = desonerafolhaCprb;
   }

   public BigDecimal getRespEntReinf() {
        return respEntReinf;
   }

   public void setRespEntReinf(BigDecimal respEntReinf) {
        this.respEntReinf = respEntReinf;
   }

   public String getSenhaEctRastreio() {
        return senhaEctRastreio;
   }

   public void setSenhaEctRastreio(String senhaEctRastreio) {
        this.senhaEctRastreio = senhaEctRastreio;
   }

   public BigDecimal getSitEmpReinf() {
        return sitEmpReinf;
   }

   public void setSitEmpReinf(BigDecimal sitEmpReinf) {
        this.sitEmpReinf = sitEmpReinf;
   }

   public String getTipCtactbEfd() {
        return tipCtactbEfd;
   }

   public void setTipCtactbEfd(String tipCtactbEfd) {
        this.tipCtactbEfd = tipCtactbEfd;
   }

   public BigDecimal getTopCorBanEconect() {
        return topCorBanEconect;
   }

   public void setTopCorBanEconect(BigDecimal topCorBanEconect) {
        this.topCorBanEconect = topCorBanEconect;
   }

   public BigDecimal getTribReinf() {
        return tribReinf;
   }

   public void setTribReinf(BigDecimal tribReinf) {
        this.tribReinf = tribReinf;
   }

   public BigDecimal getVersaoCte() {
        return versaoCte;
   }

   public void setVersaoCte(BigDecimal versaoCte) {
        this.versaoCte = versaoCte;
   }

   public String getVinculoEfr() {
        return vinculoEfr;
   }

   public void setVinculoEfr(String vinculoEfr) {
        this.vinculoEfr = vinculoEfr;
   }

   public BigDecimal getNroMaxProd() {
        return nroMaxProd;
   }

   public void setNroMaxProd(BigDecimal nroMaxProd) {
        this.nroMaxProd = nroMaxProd;
   }

   public BigDecimal getTpOempresa() {
        return tpOempresa;
   }

   public void setTpOempresa(BigDecimal tpOempresa) {
        this.tpOempresa = tpOempresa;
   }

   public BigDecimal getVersaoMdfe() {
        return versaoMdfe;
   }

   public void setVersaoMdfe(BigDecimal versaoMdfe) {
        this.versaoMdfe = versaoMdfe;
   }

   public String getTranspCarga() {
        return transpCarga;
   }

   public void setTranspCarga(String transpCarga) {
        this.transpCarga = transpCarga;
   }

   public String getUsaDtValLotNfe() {
        return usaDtValLotNfe;
   }

   public void setUsaDtValLotNfe(String usaDtValLotNfe) {
        this.usaDtValLotNfe = usaDtValLotNfe;
   }

   public String getUsaDtFabLotNfe() {
        return usaDtFabLotNfe;
   }

   public void setUsaDtFabLotNfe(String usaDtFabLotNfe) {
        this.usaDtFabLotNfe = usaDtFabLotNfe;
   }

   public BigDecimal getModEtqVol() {
        return modEtqVol;
   }

   public void setModEtqVol(BigDecimal modEtqVol) {
        this.modEtqVol = modEtqVol;
   }

   public String getIgPermCompProds() {
        return igPermCompProds;
   }

   public void setIgPermCompProds(String igPermCompProds) {
        this.igPermCompProds = igPermCompProds;
   }

   public String getImpressoraEtqVol() {
        return impressoraEtqVol;
   }

   public void setImpressoraEtqVol(String impressoraEtqVol) {
        this.impressoraEtqVol = impressoraEtqVol;
   }

   public String getChaveAcessoNfse() {
        return chaveAcessoNfse;
   }

   public void setChaveAcessoNfse(String chaveAcessoNfse) {
        this.chaveAcessoNfse = chaveAcessoNfse;
   }

   public BigDecimal getCodLojaEconect() {
        return codLojaEconect;
   }

   public void setCodLojaEconect(BigDecimal codLojaEconect) {
        this.codLojaEconect = codLojaEconect;
   }

   public BigDecimal getTopRecargaCelEconect() {
        return topRecargaCelEconect;
   }

   public void setTopRecargaCelEconect(BigDecimal topRecargaCelEconect) {
        this.topRecargaCelEconect = topRecargaCelEconect;
   }

   public BigDecimal getTopNfceEconect() {
        return topNfceEconect;
   }

   public void setTopNfceEconect(BigDecimal topNfceEconect) {
        this.topNfceEconect = topNfceEconect;
   }

   public BigDecimal getTopSateConect() {
        return topSateConect;
   }

   public void setTopSateConect(BigDecimal topSateConect) {
        this.topSateConect = topSateConect;
   }

   public BigDecimal getWmsCodEndFlut() {
        return wmsCodEndFlut;
   }

   public void setWmsCodEndFlut(BigDecimal wmsCodEndFlut) {
        this.wmsCodEndFlut = wmsCodEndFlut;
   }

   public String getUsaTrocoCheckout() {
        return usaTrocoCheckout;
   }

   public void setUsaTrocoCheckout(String usaTrocoCheckout) {
        this.usaTrocoCheckout = usaTrocoCheckout;
   }

   public BigDecimal getCodEmpOrigMovFin() {
        return codEmpOrigMovFin;
   }

   public void setCodEmpOrigMovFin(BigDecimal codEmpOrigMovFin) {
        this.codEmpOrigMovFin = codEmpOrigMovFin;
   }

   public String getCalcVencGnreApu() {
        return calcVencGnreApu;
   }

   public void setCalcVencGnreApu(String calcVencGnreApu) {
        this.calcVencGnreApu = calcVencGnreApu;
   }

   public String getGerObsIpiRegEnt() {
        return gerObsIpiRegEnt;
   }

   public void setGerObsIpiRegEnt(String gerObsIpiRegEnt) {
        this.gerObsIpiRegEnt = gerObsIpiRegEnt;
   }

   public String getGerCteCredPisCof() {
        return gerCteCredPisCof;
   }

   public void setGerCteCredPisCof(String gerCteCredPisCof) {
        this.gerCteCredPisCof = gerCteCredPisCof;
   }

   public String getGer0220UndForn() {
        return ger0220UndForn;
   }

   public void setGer0220UndForn(String ger0220UndForn) {
        this.ger0220UndForn = ger0220UndForn;
   }

   public String getGerChaveRefSig() {
        return gerChaveRefSig;
   }

   public void setGerChaveRefSig(String gerChaveRefSig) {
        this.gerChaveRefSig = gerChaveRefSig;
   }

   public String getProibDigConfEnt() {
        return proibDigConfEnt;
   }

   public void setProibDigConfEnt(String proibDigConfEnt) {
        this.proibDigConfEnt = proibDigConfEnt;
   }

   public BigDecimal getQtdConfEntWms() {
        return qtdConfEntWms;
   }

   public void setQtdConfEntWms(BigDecimal qtdConfEntWms) {
        this.qtdConfEntWms = qtdConfEntWms;
   }

   public String getEmpCentralMovFin() {
        return empCentralMovFin;
   }

   public void setEmpCentralMovFin(String empCentralMovFin) {
        this.empCentralMovFin = empCentralMovFin;
   }

   public BigDecimal getCodModEmailNfe() {
        return codModEmailNfe;
   }

   public void setCodModEmailNfe(BigDecimal codModEmailNfe) {
        this.codModEmailNfe = codModEmailNfe;
   }

   public BigDecimal getCodModDanfeSimplifNfe() {
        return codModDanfeSimplifNfe;
   }

   public void setCodModDanfeSimplifNfe(BigDecimal codModDanfeSimplifNfe) {
        this.codModDanfeSimplifNfe = codModDanfeSimplifNfe;
   }

   public String getGerCiapCompEfd() {
        return gerCiapCompEfd;
   }

   public void setGerCiapCompEfd(String gerCiapCompEfd) {
        this.gerCiapCompEfd = gerCiapCompEfd;
   }

   public BigDecimal getModEmailLibLim() {
        return modEmailLibLim;
   }

   public void setModEmailLibLim(BigDecimal modEmailLibLim) {
        this.modEmailLibLim = modEmailLibLim;
   }

   public String getTokenNfse() {
        return tokenNfse;
   }

   public void setTokenNfse(String tokenNfse) {
        this.tokenNfse = tokenNfse;
   }

   public BigDecimal getEfdCodBco() {
        return efdCodBco;
   }

   public void setEfdCodBco(BigDecimal efdCodBco) {
        this.efdCodBco = efdCodBco;
   }

   public BigDecimal getEfdCodCenCus() {
        return efdCodCenCus;
   }

   public void setEfdCodCenCus(BigDecimal efdCodCenCus) {
        this.efdCodCenCus = efdCodCenCus;
   }

   public BigDecimal getEfdCodCtabCoInt() {
        return efdCodCtabCoInt;
   }

   public void setEfdCodCtabCoInt(BigDecimal efdCodCtabCoInt) {
        this.efdCodCtabCoInt = efdCodCtabCoInt;
   }

   public BigDecimal getEfdCodNatDespRecIcms() {
        return efdCodNatDespRecIcms;
   }

   public void setEfdCodNatDespRecIcms(BigDecimal efdCodNatDespRecIcms) {
        this.efdCodNatDespRecIcms = efdCodNatDespRecIcms;
   }

   public BigDecimal getEfdCodTipOper() {
        return efdCodTipOper;
   }

   public void setEfdCodTipOper(BigDecimal efdCodTipOper) {
        this.efdCodTipOper = efdCodTipOper;
   }

   public BigDecimal getEfdCodTipTit() {
        return efdCodTipTit;
   }

   public void setEfdCodTipTit(BigDecimal efdCodTipTit) {
        this.efdCodTipTit = efdCodTipTit;
   }

   public BigDecimal getEfdDiaVenc() {
        return efdDiaVenc;
   }

   public void setEfdDiaVenc(BigDecimal efdDiaVenc) {
        this.efdDiaVenc = efdDiaVenc;
   }

   public String getEfdTipReenchNota() {
        return efdTipReenchNota;
   }

   public void setEfdTipReenchNota(String efdTipReenchNota) {
        this.efdTipReenchNota = efdTipReenchNota;
   }

   public String getIntFinObriIcmsStRec() {
        return intFinObriIcmsStRec;
   }

   public void setIntFinObriIcmsStRec(String intFinObriIcmsStRec) {
        this.intFinObriIcmsStRec = intFinObriIcmsStRec;
   }

   public String getWmsRastSerMed() {
        return wmsRastSerMed;
   }

   public void setWmsRastSerMed(String wmsRastSerMed) {
        this.wmsRastSerMed = wmsRastSerMed;
   }

   public String getCodRespRetc180() {
        return codRespRetc180;
   }

   public void setCodRespRetc180(String codRespRetc180) {
        this.codRespRetc180 = codRespRetc180;
   }

   public String getVlrBaseStc180() {
        return vlrBaseStc180;
   }

   public void setVlrBaseStc180(String vlrBaseStc180) {
        this.vlrBaseStc180 = vlrBaseStc180;
   }

   public String getVlrStc180() {
        return vlrStc180;
   }

   public void setVlrStc180(String vlrStc180) {
        this.vlrStc180 = vlrStc180;
   }

   public BigDecimal getTopSangSupri() {
        return topSangSupri;
   }

   public void setTopSangSupri(BigDecimal topSangSupri) {
        this.topSangSupri = topSangSupri;
   }

   public String getUsaVlrMedTransfEmp() {
        return usaVlrMedTransfEmp;
   }

   public void setUsaVlrMedTransfEmp(String usaVlrMedTransfEmp) {
        this.usaVlrMedTransfEmp = usaVlrMedTransfEmp;
   }

   public BigDecimal getTopDespesa() {
        return topDespesa;
   }

   public void setTopDespesa(BigDecimal topDespesa) {
        this.topDespesa = topDespesa;
   }

   public String getUsaIndPresTopFat() {
        return usaIndPresTopFat;
   }

   public void setUsaIndPresTopFat(String usaIndPresTopFat) {
        this.usaIndPresTopFat = usaIndPresTopFat;
   }

   public String getTipoImpKitFox() {
        return tipoImpKitFox;
   }

   public void setTipoImpKitFox(String tipoImpKitFox) {
        this.tipoImpKitFox = tipoImpKitFox;
   }

   public String getApiKeyPixCheckout() {
        return apiKeyPixCheckout;
   }

   public void setApiKeyPixCheckout(String apiKeyPixCheckout) {
        this.apiKeyPixCheckout = apiKeyPixCheckout;
   }

   public BigDecimal getBancoPixCheckout() {
        return bancoPixCheckout;
   }

   public void setBancoPixCheckout(BigDecimal bancoPixCheckout) {
        this.bancoPixCheckout = bancoPixCheckout;
   }

   public String getClientIdPixCheckout() {
        return clientIdPixCheckout;
   }

   public void setClientIdPixCheckout(String clientIdPixCheckout) {
        this.clientIdPixCheckout = clientIdPixCheckout;
   }

   public String getClientSecretPixCheckout() {
        return clientSecretPixCheckout;
   }

   public void setClientSecretPixCheckout(String clientSecretPixCheckout) {
        this.clientSecretPixCheckout = clientSecretPixCheckout;
   }

   public String getCstNRedIcmsBcPisCof() {
        return cstNRedIcmsBcPisCof;
   }

   public void setCstNRedIcmsBcPisCof(String cstNRedIcmsBcPisCof) {
        this.cstNRedIcmsBcPisCof = cstNRedIcmsBcPisCof;
   }

   public String getConsDevNfeReinf() {
        return consDevNfeReinf;
   }

   public void setConsDevNfeReinf(String consDevNfeReinf) {
        this.consDevNfeReinf = consDevNfeReinf;
   }

   public String getAmbienteGnre() {
        return ambienteGnre;
   }

   public void setAmbienteGnre(String ambienteGnre) {
        this.ambienteGnre = ambienteGnre;
   }

   public BigDecimal getCodEmpMatrizGnre() {
        return codEmpMatrizGnre;
   }

   public void setCodEmpMatrizGnre(BigDecimal codEmpMatrizGnre) {
        this.codEmpMatrizGnre = codEmpMatrizGnre;
   }

   public String getVersaoGnre() {
        return versaoGnre;
   }

   public void setVersaoGnre(String versaoGnre) {
        this.versaoGnre = versaoGnre;
   }

   public BigDecimal getCodEmpGrupoFrete() {
        return codEmpGrupoFrete;
   }

   public void setCodEmpGrupoFrete(BigDecimal codEmpGrupoFrete) {
        this.codEmpGrupoFrete = codEmpGrupoFrete;
   }

   public String getCalcFetHab() {
        return calcFetHab;
   }

   public void setCalcFetHab(String calcFetHab) {
        this.calcFetHab = calcFetHab;
   }

   public String getMsgInfAdicFetHab() {
        return msgInfAdicFetHab;
   }

   public void setMsgInfAdicFetHab(String msgInfAdicFetHab) {
        this.msgInfAdicFetHab = msgInfAdicFetHab;
   }

   public BigDecimal getAliqFunttel() {
        return aliqFunttel;
   }

   public void setAliqFunttel(BigDecimal aliqFunttel) {
        this.aliqFunttel = aliqFunttel;
   }

   public BigDecimal getAliqFust() {
        return aliqFust;
   }

   public void setAliqFust(BigDecimal aliqFust) {
        this.aliqFust = aliqFust;
   }

   public String getFistel() {
        return fistel;
   }

   public void setFistel(String fistel) {
        this.fistel = fistel;
   }

   public String getVlrIcmsOpAnt() {
        return vlrIcmsOpAnt;
   }

   public void setVlrIcmsOpAnt(String vlrIcmsOpAnt) {
        this.vlrIcmsOpAnt = vlrIcmsOpAnt;
   }

   public String getVlrStFcpOpAnt() {
        return vlrStFcpOpAnt;
   }

   public void setVlrStFcpOpAnt(String vlrStFcpOpAnt) {
        this.vlrStFcpOpAnt = vlrStFcpOpAnt;
   }

   public String getVlrStOpAnt() {
        return vlrStOpAnt;
   }

   public void setVlrStOpAnt(String vlrStOpAnt) {
        this.vlrStOpAnt = vlrStOpAnt;
   }

   public String getVlrUnitIcmsOp() {
        return vlrUnitIcmsOp;
   }

   public void setVlrUnitIcmsOp(String vlrUnitIcmsOp) {
        this.vlrUnitIcmsOp = vlrUnitIcmsOp;
   }

   public String getInibeReabMaxPicking() {
        return inibeReabMaxPicking;
   }

   public void setInibeReabMaxPicking(String inibeReabMaxPicking) {
        this.inibeReabMaxPicking = inibeReabMaxPicking;
   }

   public String getTratSobFinConf() {
        return tratSobFinConf;
   }

   public void setTratSobFinConf(String tratSobFinConf) {
        this.tratSobFinConf = tratSobFinConf;
   }

   public BigDecimal getConEstOrigProd() {
        return conEstOrigProd;
   }

   public void setConEstOrigProd(BigDecimal conEstOrigProd) {
        this.conEstOrigProd = conEstOrigProd;
   }

   public String getVlrUnitMerc() {
        return vlrUnitMerc;
   }

   public void setVlrUnitMerc(String vlrUnitMerc) {
        this.vlrUnitMerc = vlrUnitMerc;
   }

   public String getRedDifAlBcPisCof() {
        return redDifAlBcPisCof;
   }

   public void setRedDifAlBcPisCof(String redDifAlBcPisCof) {
        this.redDifAlBcPisCof = redDifAlBcPisCof;
   }

   public String getEntAutTarMapa() {
        return entAutTarMapa;
   }

   public void setEntAutTarMapa(String entAutTarMapa) {
        this.entAutTarMapa = entAutTarMapa;
   }

   public BigDecimal getPriorCodNat() {
        return priorCodNat;
   }

   public void setPriorCodNat(BigDecimal priorCodNat) {
        this.priorCodNat = priorCodNat;
   }

   public String getEnvRespContCte() {
        return envRespContCte;
   }

   public void setEnvRespContCte(String envRespContCte) {
        this.envRespContCte = envRespContCte;
   }

   public String getConsDevTerevtr2050() {
        return consDevTerevtr2050;
   }

   public void setConsDevTerevtr2050(String consDevTerevtr2050) {
        this.consDevTerevtr2050 = consDevTerevtr2050;
   }

   public String getEnvInutNotaExc() {
        return envInutNotaExc;
   }

   public void setEnvInutNotaExc(String envInutNotaExc) {
        this.envInutNotaExc = envInutNotaExc;
   }

   public String getJusInutNotaExc() {
        return jusInutNotaExc;
   }

   public void setJusInutNotaExc(String jusInutNotaExc) {
        this.jusInutNotaExc = jusInutNotaExc;
   }

   public String getWmsDocArep() {
        return wmsDocArep;
   }

   public void setWmsDocArep(String wmsDocArep) {
        this.wmsDocArep = wmsDocArep;
   }

   public String getDeduzFcpBcPisCofins() {
        return deduzFcpBcPisCofins;
   }

   public void setDeduzFcpBcPisCofins(String deduzFcpBcPisCofins) {
        this.deduzFcpBcPisCofins = deduzFcpBcPisCofins;
   }

   public String getSepPulParcial() {
        return sepPulParcial;
   }

   public void setSepPulParcial(String sepPulParcial) {
        this.sepPulParcial = sepPulParcial;
   }

   public String getObtStAntMedEnt() {
        return obtStAntMedEnt;
   }

   public void setObtStAntMedEnt(String obtStAntMedEnt) {
        this.obtStAntMedEnt = obtStAntMedEnt;
   }

   public String getCalcIcmsAt() {
        return calcIcmsAt;
   }

   public void setCalcIcmsAt(String calcIcmsAt) {
        this.calcIcmsAt = calcIcmsAt;
   }

   public String getProibEscCheckoutPed() {
        return proibEscCheckoutPed;
   }

   public void setProibEscCheckoutPed(String proibEscCheckoutPed) {
        this.proibEscCheckoutPed = proibEscCheckoutPed;
   }

   public String getNfeCanExtCanMes() {
        return nfeCanExtCanMes;
   }

   public void setNfeCanExtCanMes(String nfeCanExtCanMes) {
        this.nfeCanExtCanMes = nfeCanExtCanMes;
   }

   public String getEnvMdfSinc() {
        return envMdfSinc;
   }

   public void setEnvMdfSinc(String envMdfSinc) {
        this.envMdfSinc = envMdfSinc;
   }

   public String getWmsPerSepProdAp() {
        return wmsPerSepProdAp;
   }

   public void setWmsPerSepProdAp(String wmsPerSepProdAp) {
        this.wmsPerSepProdAp = wmsPerSepProdAp;
   }

   public String getConsIdQtCarcDesc() {
        return consIdQtCarcDesc;
   }

   public void setConsIdQtCarcDesc(String consIdQtCarcDesc) {
        this.consIdQtCarcDesc = consIdQtCarcDesc;
   }

   public String getEnvLeiTranspDesc() {
        return envLeiTranspDesc;
   }

   public void setEnvLeiTranspDesc(String envLeiTranspDesc) {
        this.envLeiTranspDesc = envLeiTranspDesc;
   }

   public String getEnvLeiTranspTotoBs() {
        return envLeiTranspTotoBs;
   }

   public void setEnvLeiTranspTotoBs(String envLeiTranspTotoBs) {
        this.envLeiTranspTotoBs = envLeiTranspTotoBs;
   }

   public String getCgcProcurador() {
        return cgcProcurador;
   }

   public void setCgcProcurador(String cgcProcurador) {
        this.cgcProcurador = cgcProcurador;
   }

   public String getInibLoqRegConf() {
        return inibLoqRegConf;
   }

   public void setInibLoqRegConf(String inibLoqRegConf) {
        this.inibLoqRegConf = inibLoqRegConf;
   }

   public String getBlqNfaCompNfcPend() {
        return blqNfaCompNfcPend;
   }

   public void setBlqNfaCompNfcPend(String blqNfaCompNfcPend) {
        this.blqNfaCompNfcPend = blqNfaCompNfcPend;
   }

   public String getDifAliqDespAcess() {
        return difAliqDespAcess;
   }

   public void setDifAliqDespAcess(String difAliqDespAcess) {
        this.difAliqDespAcess = difAliqDespAcess;
   }

   public String getComplRestituicaoIcmsSt() {
        return complRestituicaoIcmsSt;
   }

   public void setComplRestituicaoIcmsSt(String complRestituicaoIcmsSt) {
        this.complRestituicaoIcmsSt = complRestituicaoIcmsSt;
   }

   public String getCalcPisCfsFin() {
        return calcPisCfsFin;
   }

   public void setCalcPisCfsFin(String calcPisCfsFin) {
        this.calcPisCfsFin = calcPisCfsFin;
   }

   public String getIsAliqIntSexC() {
        return isAliqIntSexC;
   }

   public void setIsAliqIntSexC(String isAliqIntSexC) {
        this.isAliqIntSexC = isAliqIntSexC;
   }

   public BigDecimal getTipIcmsFenvalBem() {
        return tipIcmsFenvalBem;
   }

   public void setTipIcmsFenvalBem(BigDecimal tipIcmsFenvalBem) {
        this.tipIcmsFenvalBem = tipIcmsFenvalBem;
   }

   public String getChavePixCheckout() {
        return chavePixCheckout;
   }

   public void setChavePixCheckout(String chavePixCheckout) {
        this.chavePixCheckout = chavePixCheckout;
   }

   public String getUrlPixCheckout() {
        return urlPixCheckout;
   }

   public void setUrlPixCheckout(String urlPixCheckout) {
        this.urlPixCheckout = urlPixCheckout;
   }

   public BigDecimal getCalcVlrAquisBem() {
        return calcVlrAquisBem;
   }

   public void setCalcVlrAquisBem(BigDecimal calcVlrAquisBem) {
        this.calcVlrAquisBem = calcVlrAquisBem;
   }

   public String getInibeLote() {
        return inibeLote;
   }

   public void setInibeLote(String inibeLote) {
        this.inibeLote = inibeLote;
   }

   public String getContBaiBemSubImprec() {
        return contBaiBemSubImprec;
   }

   public void setContBaiBemSubImprec(String contBaiBemSubImprec) {
        this.contBaiBemSubImprec = contBaiBemSubImprec;
   }

   public BigDecimal getCodCtaPixTef() {
        return codCtaPixTef;
   }

   public void setCodCtaPixTef(BigDecimal codCtaPixTef) {
        this.codCtaPixTef = codCtaPixTef;
   }

   public String getCredIcmsCombus() {
        return credIcmsCombus;
   }

   public void setCredIcmsCombus(String credIcmsCombus) {
        this.credIcmsCombus = credIcmsCombus;
   }

   public String getCredIcmsRemg() {
        return credIcmsRemg;
   }

   public void setCredIcmsRemg(String credIcmsRemg) {
        this.credIcmsRemg = credIcmsRemg;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getDescrNat() {
        return descrNat;
   }

   public void setDescrNat(String descrNat) {
        this.descrNat = descrNat;
   }

   public String getDesTipIdevCom() {
        return desTipIdevCom;
   }

   public void setDesTipIdevCom(String desTipIdevCom) {
        this.desTipIdevCom = desTipIdevCom;
   }

   public BigDecimal getNatCanPix() {
        return natCanPix;
   }

   public void setNatCanPix(BigDecimal natCanPix) {
        this.natCanPix = natCanPix;
   }

   public String getRupturaEst() {
        return rupturaEst;
   }

   public void setRupturaEst(String rupturaEst) {
        this.rupturaEst = rupturaEst;
   }

   public String getSomarFcpBcCiap() {
        return somarFcpBcCiap;
   }

   public void setSomarFcpBcCiap(String somarFcpBcCiap) {
        this.somarFcpBcCiap = somarFcpBcCiap;
   }

   public String getTipoPix() {
        return tipoPix;
   }

   public void setTipoPix(String tipoPix) {
        this.tipoPix = tipoPix;
   }

   public BigDecimal getTopCanPixFin() {
        return topCanPixFin;
   }

   public void setTopCanPixFin(BigDecimal topCanPixFin) {
        this.topCanPixFin = topCanPixFin;
   }

   public BigDecimal getTopCanPixPag() {
        return topCanPixPag;
   }

   public void setTopCanPixPag(BigDecimal topCanPixPag) {
        this.topCanPixPag = topCanPixPag;
   }

   public BigDecimal getTopCanPixRec() {
        return topCanPixRec;
   }

   public void setTopCanPixRec(BigDecimal topCanPixRec) {
        this.topCanPixRec = topCanPixRec;
   }

   public String getUsaMedDiaImp() {
        return usaMedDiaImp;
   }

   public void setUsaMedDiaImp(String usaMedDiaImp) {
        this.usaMedDiaImp = usaMedDiaImp;
   }

   public BigDecimal getCodCenCusIpi() {
        return codCenCusIpi;
   }

   public void setCodCenCusIpi(BigDecimal codCenCusIpi) {
        this.codCenCusIpi = codCenCusIpi;
   }

   public BigDecimal getCodCtabCoIpi() {
        return codCtabCoIpi;
   }

   public void setCodCtabCoIpi(BigDecimal codCtabCoIpi) {
        this.codCtabCoIpi = codCtabCoIpi;
   }

   public BigDecimal getCodEmpImposto() {
        return codEmpImposto;
   }

   public void setCodEmpImposto(BigDecimal codEmpImposto) {
        this.codEmpImposto = codEmpImposto;
   }

   public BigDecimal getCodModRetEstWms() {
        return codModRetEstWms;
   }

   public void setCodModRetEstWms(BigDecimal codModRetEstWms) {
        this.codModRetEstWms = codModRetEstWms;
   }

   public BigDecimal getCodNatIpi() {
        return codNatIpi;
   }

   public void setCodNatIpi(BigDecimal codNatIpi) {
        this.codNatIpi = codNatIpi;
   }

   public BigDecimal getCodParcIpi() {
        return codParcIpi;
   }

   public void setCodParcIpi(BigDecimal codParcIpi) {
        this.codParcIpi = codParcIpi;
   }

   public String getCodReceitaIpi() {
        return codReceitaIpi;
   }

   public void setCodReceitaIpi(String codReceitaIpi) {
        this.codReceitaIpi = codReceitaIpi;
   }

   public String getCodReceitaReinf() {
        return codReceitaReinf;
   }

   public void setCodReceitaReinf(String codReceitaReinf) {
        this.codReceitaReinf = codReceitaReinf;
   }

   public BigDecimal getCodTipOperIpi() {
        return codTipOperIpi;
   }

   public void setCodTipOperIpi(BigDecimal codTipOperIpi) {
        this.codTipOperIpi = codTipOperIpi;
   }

   public BigDecimal getCodTipTitIpi() {
        return codTipTitIpi;
   }

   public void setCodTipTitIpi(BigDecimal codTipTitIpi) {
        this.codTipTitIpi = codTipTitIpi;
   }

   public String getConsDifParcOutIcms() {
        return consDifParcOutIcms;
   }

   public void setConsDifParcOutIcms(String consDifParcOutIcms) {
        this.consDifParcOutIcms = consDifParcOutIcms;
   }

   public String getCtactbAnlRegApur() {
        return ctactbAnlRegApur;
   }

   public void setCtactbAnlRegApur(String ctactbAnlRegApur) {
        this.ctactbAnlRegApur = ctactbAnlRegApur;
   }

   public String getDesRestrFcpCst() {
        return desRestrFcpCst;
   }

   public void setDesRestrFcpCst(String desRestrFcpCst) {
        this.desRestrFcpCst = desRestrFcpCst;
   }

   public String getDesRestrFcpStCst() {
        return desRestrFcpStCst;
   }

   public void setDesRestrFcpStCst(String desRestrFcpStCst) {
        this.desRestrFcpStCst = desRestrFcpStCst;
   }

   public BigDecimal getDiaVencIpi() {
        return diaVencIpi;
   }

   public void setDiaVencIpi(BigDecimal diaVencIpi) {
        this.diaVencIpi = diaVencIpi;
   }

   public Timestamp getDtObito() {
        return dtObito;
   }

   public void setDtObito(Timestamp dtObito) {
        this.dtObito = dtObito;
   }

   public String getDtOpJuros() {
        return dtOpJuros;
   }

   public void setDtOpJuros(String dtOpJuros) {
        this.dtOpJuros = dtOpJuros;
   }

   public String getDtOpMulta() {
        return dtOpMulta;
   }

   public void setDtOpMulta(String dtOpMulta) {
        this.dtOpMulta = dtOpMulta;
   }

   public Timestamp getDtRefPreProdReaisReinfG4000() {
        return dtRefPreProdReaisReinfG4000;
   }

   public void setDtRefPreProdReaisReinfG4000(Timestamp dtRefPreProdReaisReinfG4000) {
        this.dtRefPreProdReaisReinfG4000 = dtRefPreProdReaisReinfG4000;
   }

   public Timestamp getDtRefProdReinfG4000() {
        return dtRefProdReinfG4000;
   }

   public void setDtRefProdReinfG4000(Timestamp dtRefProdReinfG4000) {
        this.dtRefProdReinfG4000 = dtRefProdReinfG4000;
   }

   public Timestamp getDtTransfFinsLucr() {
        return dtTransfFinsLucr;
   }

   public void setDtTransfFinsLucr(Timestamp dtTransfFinsLucr) {
        this.dtTransfFinsLucr = dtTransfFinsLucr;
   }

   public String getEnvInfIssSomDevido() {
        return envInfIssSomDevido;
   }

   public void setEnvInfIssSomDevido(String envInfIssSomDevido) {
        this.envInfIssSomDevido = envInfIssSomDevido;
   }

   public String getEstrNcredIcmsSt() {
        return estrNcredIcmsSt;
   }

   public void setEstrNcredIcmsSt(String estrNcredIcmsSt) {
        this.estrNcredIcmsSt = estrNcredIcmsSt;
   }

   public String getGerMultPlacres() {
        return gerMultPlacres;
   }

   public void setGerMultPlacres(String gerMultPlacres) {
        this.gerMultPlacres = gerMultPlacres;
   }

   public BigDecimal getIndTipLayoutK010() {
        return indTipLayoutK010;
   }

   public void setIndTipLayoutK010(BigDecimal indTipLayoutK010) {
        this.indTipLayoutK010 = indTipLayoutK010;
   }

   public BigDecimal getIndUniao() {
        return indUniao;
   }

   public void setIndUniao(BigDecimal indUniao) {
        this.indUniao = indUniao;
   }

   public String getIntegrarIpiFin() {
        return integrarIpiFin;
   }

   public void setIntegrarIpiFin(String integrarIpiFin) {
        this.integrarIpiFin = integrarIpiFin;
   }

   public BigDecimal getModEstCpaWms() {
        return modEstCpaWms;
   }

   public void setModEstCpaWms(BigDecimal modEstCpaWms) {
        this.modEstCpaWms = modEstCpaWms;
   }

   public BigDecimal getNotaEntAjusteReclas() {
        return notaEntAjusteReclas;
   }

   public void setNotaEntAjusteReclas(BigDecimal notaEntAjusteReclas) {
        this.notaEntAjusteReclas = notaEntAjusteReclas;
   }

   public BigDecimal getNotaSaiAjusteReclas() {
        return notaSaiAjusteReclas;
   }

   public void setNotaSaiAjusteReclas(BigDecimal notaSaiAjusteReclas) {
        this.notaSaiAjusteReclas = notaSaiAjusteReclas;
   }

   public BigDecimal getOrigDescontos() {
        return origDescontos;
   }

   public void setOrigDescontos(BigDecimal origDescontos) {
        this.origDescontos = origDescontos;
   }

   public String getRedStBcPisCofins() {
        return redStBcPisCofins;
   }

   public void setRedStBcPisCofins(String redStBcPisCofins) {
        this.redStBcPisCofins = redStBcPisCofins;
   }

   public String getStInclusa70() {
        return stInclusa70;
   }

   public void setStInclusa70(String stInclusa70) {
        this.stInclusa70 = stInclusa70;
   }

   public String getTipCtactbEfdf() {
        return tipCtactbEfdf;
   }

   public void setTipCtactbEfdf(String tipCtactbEfdf) {
        this.tipCtactbEfdf = tipCtactbEfdf;
   }

   public String getTipDataEvtPag() {
        return tipDataEvtPag;
   }

   public void setTipDataEvtPag(String tipDataEvtPag) {
        this.tipDataEvtPag = tipDataEvtPag;
   }

   public String getTipDataEvtPagXir() {
        return tipDataEvtPagXir;
   }

   public void setTipDataEvtPagXir(String tipDataEvtPagXir) {
        this.tipDataEvtPagXir = tipDataEvtPagXir;
   }

   public String getTokenIbpt() {
        return tokenIbpt;
   }

   public void setTokenIbpt(String tokenIbpt) {
        this.tokenIbpt = tokenIbpt;
   }

   public String getUsaCusMedIcMpro() {
        return usaCusMedIcMpro;
   }

   public void setUsaCusMedIcMpro(String usaCusMedIcMpro) {
        this.usaCusMedIcMpro = usaCusMedIcMpro;
   }

   public String getUsaCustoMedioMps() {
        return usaCustoMedioMps;
   }

   public void setUsaCustoMedioMps(String usaCustoMedioMps) {
        this.usaCustoMedioMps = usaCustoMedioMps;
   }

   public String getDesApCprodEpe() {
        return desApCprodEpe;
   }

   public void setDesApCprodEpe(String desApCprodEpe) {
        this.desApCprodEpe = desApCprodEpe;
   }

   public String getRegApurTribSn() {
        return regApurTribSn;
   }

   public void setRegApurTribSn(String regApurTribSn) {
        this.regApurTribSn = regApurTribSn;
   }

   public BigDecimal getStatus() {
        return status;
   }

   public void setStatus(BigDecimal status) {
        this.status = status;
   }

   public String getGeraDeducaoPf() {
        return geraDeducaoPf;
   }

   public void setGeraDeducaoPf(String geraDeducaoPf) {
        this.geraDeducaoPf = geraDeducaoPf;
   }

   public String getCredIcmsCst60Am() {
        return credIcmsCst60Am;
   }

   public void setCredIcmsCst60Am(String credIcmsCst60Am) {
        this.credIcmsCst60Am = credIcmsCst60Am;
   }

   public String getDenunCesPcte() {
        return denunCesPcte;
   }

   public void setDenunCesPcte(String denunCesPcte) {
        this.denunCesPcte = denunCesPcte;
   }

   public BigDecimal getPrazoRcancCte() {
        return prazoRcancCte;
   }

   public void setPrazoRcancCte(BigDecimal prazoRcancCte) {
        this.prazoRcancCte = prazoRcancCte;
   }

   public BigDecimal getPrazoTcancCte() {
        return prazoTcancCte;
   }

   public void setPrazoTcancCte(BigDecimal prazoTcancCte) {
        this.prazoTcancCte = prazoTcancCte;
   }

   public String getTeraCpCte() {
        return teraCpCte;
   }

   public void setTeraCpCte(String teraCpCte) {
        this.teraCpCte = teraCpCte;
   }

   public String getAplCalcDifAliqFrt() {
        return aplCalcDifAliqFrt;
   }

   public void setAplCalcDifAliqFrt(String aplCalcDifAliqFrt) {
        this.aplCalcDifAliqFrt = aplCalcDifAliqFrt;
   }

   @Override
   public String getEntityName() {
        return "EmpresaFinanceiro";
   }

   @Override
   public EmpresaFinanceiro fromVO(DynamicVO vo) {
        this.codLancBcoPag = vo.asBigDecimal("CODLANCBCOPAG");
        this.corTeFaltaWms = vo.asString("CORTEFALTAWMS");
        this.cpfContador = vo.asString("CPFCONTADOR");
        this.crcContador = vo.asString("CRCCONTADOR");
        this.credCofins = vo.asString("CREDCOFINS");
        this.credPis = vo.asString("CREDPIS");
        this.cstIpiEnt = vo.asBigDecimal("CSTIPIENT");
        this.cstIpiSai = vo.asBigDecimal("CSTIPISAI");
        this.dtCertifNfeFim = vo.asTimestamp("DTCERTIFNFEFIM");
        this.dtCertifNfeIni = vo.asTimestamp("DTCERTIFNFEINI");
        this.emailContador = vo.asString("EMAILCONTADOR");
        this.emiteExped = vo.asString("EMITEEXPED");
        this.empDestinoWms = vo.asBigDecimal("EMPDESTINOWMS");
        this.empSoma = vo.asBigDecimal("EMPSOMA");
        this.endeCktIndef = vo.asBigDecimal("ENDECKTINDEF");
        this.endeMovIndef = vo.asBigDecimal("ENDEMOVINDEF");
        this.entPenBalcaoWms = vo.asString("ENTPENBALCAOWMS");
        this.flex = vo.asString("FLEX");
        this.fragmentaEstWms = vo.asString("FRAGMENTAESTWMS");
        this.frasEnfse = vo.asString("FRASENFSE");
        this.freteSepConstransp = vo.asString("FRETESEPCONSTRANSP");
        this.freteSepSemPre = vo.asString("FRETESEPSEMPRE");
        this.geraGnre = vo.asString("GERAGNRE");
        this.gerarLivros = vo.asString("GERARLIVROS");
        this.gerarProdLivEnt = vo.asString("GERARPRODLIVENT");
        this.gerarProdOrigKit = vo.asString("GERARPRODORIGKIT");
        this.geraNotaEnt = vo.asString("GERANOTAENT");
        this.gravarObsNota = vo.asString("GRAVAROBSNOTA");
        this.gravarObsPadrao = vo.asString("GRAVAROBSPADRAO");
        this.gravarSerieNota = vo.asString("GRAVARSERIENOTA");
        this.impEtiqSepOc = vo.asString("IMPETIQSEPOC");
        this.impEtiqVolConf = vo.asString("IMPETIQVOLCONF");
        this.impEtqVol = vo.asBigDecimal("IMPETQVOL");
        this.impExped = vo.asString("IMPEXPED");
        this.incentCult = vo.asString("INCENTCULT");
        this.indEscrit = vo.asBigDecimal("INDESCRIT");
        this.integraWmsProd = vo.asString("INTEGRAWMSPROD");
        this.ipiIncIcms = vo.asString("IPIINCICMS");
        this.ipiNaoIncid = vo.asString("IPINAOINCID");
        this.layoutDanfe = vo.asString("LAYOUTDANFE");
        this.livro1Para1Tgfite = vo.asString("LIVRO1PARA1TGFITE");
        this.localPad = vo.asBigDecimal("LOCALPAD");
        this.logoDanfe = vo.asString("LOGODANFE");
        this.marcaNotRps = vo.asString("MARCANOTRPS");
        this.maxCredIndeniz = vo.asBigDecimal("MAXCREDINDENIZ");
        this.maxDebIndeniz = vo.asBigDecimal("MAXDEBINDENIZ");
        this.codEmpMatrizNfse = vo.asBigDecimal("CODEMPMATRIZNFSE");
        this.codEmpOc = vo.asBigDecimal("CODEMPOC");
        this.codEndAvaria = vo.asBigDecimal("CODENDAVARIA");
        this.codLancBcoRec = vo.asBigDecimal("CODLANCBCOREC");
        this.codLocAlterc = vo.asBigDecimal("CODLOCALTERC");
        this.codModDanfe = vo.asBigDecimal("CODMODDANFE");
        this.codModDanfeContingencia = vo.asBigDecimal("CODMODDANFECONTINGENCIA");
        this.codParcCtb = vo.asBigDecimal("CODPARCCTB");
        this.codTab = vo.asBigDecimal("CODTAB");
        this.codTabCalc = vo.asBigDecimal("CODTABCALC");
        this.codTipOperComp = vo.asBigDecimal("CODTIPOPERCOMP");
        this.codTrib20Red = vo.asString("CODTRIB20RED");
        this.codTrib30 = vo.asString("CODTRIB30");
        this.codTrib40Isent = vo.asString("CODTRIB40ISENT");
        this.codTrib41NaoTrib = vo.asString("CODTRIB41NAOTRIB");
        this.codTrib50Susp = vo.asString("CODTRIB50SUSP");
        this.codTrib51Dif = vo.asString("CODTRIB51DIF");
        this.codTrib60StAnt = vo.asString("CODTRIB60STANT");
        this.codTrib70RedSt = vo.asString("CODTRIB70REDST");
        this.codTrib90Out = vo.asString("CODTRIB90OUT");
        this.compIpi = vo.asString("COMPIPI");
        this.compIpiSepIcm = vo.asString("COMPIPISEPICM");
        this.complItemNota = vo.asString("COMPLITEMNOTA");
        this.consEntRpendWms = vo.asString("CONSENTRPENDWMS");
        this.consOutrosImp = vo.asString("CONSOUTROSIMP");
        this.consVlrLiqNfse = vo.asString("CONSVLRLIQNFSE");
        this.contingenciaNfe = vo.asString("CONTINGENCIANFE");
        this.copiasDanfe = vo.asBigDecimal("COPIASDANFE");
        this.copiasDanfeConting = vo.asBigDecimal("COPIASDANFECONTING");
        this.codEndDiverg = vo.asBigDecimal("CODENDDIVERG");
        this.codEndPerda = vo.asBigDecimal("CODENDPERDA");
        this.partIcMeta = vo.asBigDecimal("PARTICMETA");
        this.percCfFab = vo.asBigDecimal("PERCCFFAB");
        this.percCfOutros = vo.asBigDecimal("PERCCFOUTROS");
        this.percCfServico = vo.asBigDecimal("PERCCFSERVICO");
        this.percCofins = vo.asBigDecimal("PERCCOFINS");
        this.percCsl = vo.asBigDecimal("PERCCSL");
        this.percCusVar = vo.asBigDecimal("PERCCUSVAR");
        this.percMargem = vo.asBigDecimal("PERCMARGEM");
        this.percPis = vo.asBigDecimal("PERCPIS");
        this.perfilEfd = vo.asString("PERFILEFD");
        this.perProj = vo.asString("PERPROJ");
        this.prodEpe = vo.asString("PRODEPE");
        this.projOnline = vo.asString("PROJONLINE");
        this.rastrEstoque = vo.asString("RASTRESTOQUE");
        this.reabCorrecaoWms = vo.asString("REABCORRECAOWMS");
        this.recMinTare = vo.asString("RECMINTARE");
        this.reg54Seq997St = vo.asString("REG54SEQ997ST");
        this.regimeEspTribIss = vo.asString("REGIMEESPTRIBISS");
        this.saldoLivQuinz = vo.asString("SALDOLIVQUINZ");
        this.codTrib61 = vo.asString("CODTRIB61");
        this.prefixSerieNacional = vo.asString("PREFIXSERIENACIONAL");
        this.saldoLivQuinzIpi = vo.asString("SALDOLIVQUINZIPI");
        this.senhaNfse = vo.asString("SENHANFSE");
        this.serieAcompCf = vo.asString("SERIEACOMPCF");
        this.serieDevWms = vo.asString("SERIEDEVWMS");
        this.stInclusa = vo.asString("STINCLUSA");
        this.telContador = vo.asString("TELCONTADOR");
        this.temCofins = vo.asString("TEMCOFINS");
        this.temCssl = vo.asString("TEMCSSL");
        this.temPis = vo.asString("TEMPIS");
        this.temReaIcms = vo.asString("TEMREAICMS");
        this.tipoAtividade = vo.asBigDecimal("TIPOATIVIDADE");
        this.tipoAtividadePisCofins = vo.asBigDecimal("TIPOATIVIDADEPISCOFINS");
        this.tipoCorteWms = vo.asString("TIPOCORTEWMS");
        this.tipoDanfe = vo.asString("TIPODANFE");
        this.tipoEnvioNfe = vo.asString("TIPOENVIONFE");
        this.tipoImpressora = vo.asString("TIPOIMPRESSORA");
        this.tiraServLrContab = vo.asString("TIRASERVLRCONTAB");
        this.topDevolucaoWms = vo.asBigDecimal("TOPDEVOLUCAOWMS");
        this.topEntradaWms = vo.asBigDecimal("TOPENTRADAWMS");
        this.topEnvWmsAgrup = vo.asBigDecimal("TOPENVWMSAGRUP");
        this.tpAssinante = vo.asBigDecimal("TPASSINANTE");
        this.tpAssinanteInf = vo.asString("TPASSINANTEINF");
        this.tpLigacao = vo.asBigDecimal("TPLIGACAO");
        this.tpLigacaoInf = vo.asString("TPLIGACAOINF");
        this.trabComIpi = vo.asString("TRABCOMIPI");
        this.tratarDifParc = vo.asString("TRATARDIFPARC");
        this.tratarTribut = vo.asString("TRATARTRIBUT");
        this.tratarTributDefEmp = vo.asString("TRATARTRIBUTDEFEMP");
        this.tratoCWms = vo.asString("TRATOCWMS");
        this.ufCrcContador = vo.asString("UFCRCCONTADOR");
        this.ultAutorPag = vo.asBigDecimal("ULTAUTORPAG");
        this.ultDupl = vo.asBigDecimal("ULTDUPL");
        this.ultPagCiapModc = vo.asBigDecimal("ULTPAGCIAPMODC");
        this.ultPagLivEntrad = vo.asBigDecimal("ULTPAGLIVENTRAD");
        this.ultPagLivIcms = vo.asBigDecimal("ULTPAGLIVICMS");
        this.ultPagLivIpi = vo.asBigDecimal("ULTPAGLIVIPI");
        this.ultPagLivIss = vo.asBigDecimal("ULTPAGLIVISS");
        this.ultPagLivSaida = vo.asBigDecimal("ULTPAGLIVSAIDA");
        this.usaMovVertWms = vo.asString("USAMOVVERTWMS");
        this.usaTributItens = vo.asString("USATRIBUTITENS");
        this.usuarioNfse = vo.asString("USUARIONFSE");
        this.utilizaWms = vo.asString("UTILIZAWMS");
        this.versaoNfe = vo.asBigDecimal("VERSAONFE");
        this.vlrLiqItemNfe = vo.asString("VLRLIQITEMNFE");
        this.wmsCodEndGar = vo.asBigDecimal("WMSCODENDGAR");
        this.wmsLocalAjEst = vo.asBigDecimal("WMSLOCALAJEST");
        this.wmsUsaRegVolFat = vo.asString("WMSUSAREGVOLFAT");
        this.dtInicioKardex = vo.asTimestamp("DTINICIOKARDEX");
        this.gerLdPerTri = vo.asString("GERLDPERTRI");
        this.icmsSctTd = vo.asString("ICMSSCTTD");
        this.maxNotasLoteNfe = vo.asBigDecimal("MAXNOTASLOTENFE");
        this.modDupl = vo.asBigDecimal("MODDUPL");
        this.modExped = vo.asBigDecimal("MODEXPED");
        this.natPessoaJuridica = vo.asString("NATPESSOAJURIDICA");
        this.nfe = vo.asString("NFE");
        this.nfse = vo.asString("NFSE");
        this.nomeContador = vo.asString("NOMECONTADOR");
        this.ccm = vo.asString("CCM");
        this.agrupaServFat = vo.asString("AGRUPASERVFAT");
        this.altContador = vo.asString("ALTCONTADOR");
        this.arqModBoleto = vo.asString("ARQMODBOLETO");
        this.notaSaiPerdaWms = vo.asBigDecimal("NOTASAIPERDAWMS");
        this.nuRfe = vo.asBigDecimal("NURFE");
        this.nuRfeCartaCorr = vo.asBigDecimal("NURFECARTACORR");
        this.calcIss = vo.asString("CALCISS");
        this.calPercPis = vo.asBigDecimal("CALPERCPIS");
        this.codCenCus = vo.asBigDecimal("CODCENCUS");
        this.codCenCusDesp = vo.asBigDecimal("CODCENCUSDESP");
        this.codCtabCoipad = vo.asBigDecimal("CODCTABCOIPAD");
        this.codCtactb1 = vo.asBigDecimal("CODCTACTB1");
        this.codCtactb2 = vo.asBigDecimal("CODCTACTB2");
        this.codCtactb3 = vo.asBigDecimal("CODCTACTB3");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEmpMatrizEfd = vo.asBigDecimal("CODEMPMATRIZEFD");
        this.codEndSobra = vo.asBigDecimal("CODENDSOBRA");
        this.codEndWms = vo.asBigDecimal("CODENDWMS");
        this.codFormPrec = vo.asBigDecimal("CODFORMPREC");
        this.codGrupoTensao = vo.asString("CODGRUPOTENSAO");
        this.notaSaiAjustEst = vo.asBigDecimal("NOTASAIAJUSTEST");
        this.utilizaMde = vo.asString("UTILIZAMDE");
        this.ativo = vo.asString("ATIVO");
        this.calcFunRural = vo.asString("CALCFUNRURAL");
        this.calcIcms = vo.asString("CALCICMS");
        this.calcIrrf = vo.asString("CALCIRRF");
        this.notaEntAjustEst = vo.asBigDecimal("NOTAENTAJUSTEST");
        this.notaEntSobraWms = vo.asBigDecimal("NOTAENTSOBRAWMS");
        this.codTrib53 = vo.asString("CODTRIB53");
        this.envRespContNfe = vo.asString("ENVRESPCONTNFE");
        this.tpObsFing4000 = vo.asBigDecimal("TPOBSFING4000");
        this.tpObsNotag4000 = vo.asBigDecimal("TPOBSNOTAG4000");
        this.gerObsFing4000 = vo.asString("GEROBSFING4000");
        this.codBcoIpi = vo.asBigDecimal("CODBCOIPI");
        this.tipTransmNfse = vo.asString("TIPTRANSMNFSE");
        this.codParcNfce = vo.asBigDecimal("CODPARCNFCE");
        this.incentFiscalIssqn = vo.asString("INCENTFISCALISSQN");
        this.serieTopDifMenor = vo.asString("SERIETOPDIFMENOR");
        this.serieTopDifMaior = vo.asString("SERIETOPDIFMAIOR");
        this.tipIcmsTopEntSimNac = vo.asString("TIPICMSTOPENTSIMNAC");
        this.codEnqIpiEnt = vo.asBigDecimal("CODENQIPIENT");
        this.codMeta = vo.asBigDecimal("CODMETA");
        this.codModNfceCompl = vo.asBigDecimal("CODMODNFCECOMPL");
        this.codModNfceSimpl = vo.asBigDecimal("CODMODNFCESIMPL");
        this.codEnqIpiSai = vo.asBigDecimal("CODENQIPISAI");
        this.topSaidaDifPesoWms = vo.asBigDecimal("TOPSAIDADIFPESOWMS");
        this.codTabAlt = vo.asBigDecimal("CODTABALT");
        this.codSmtp = vo.asBigDecimal("CODSMTP");
        this.topEntDifPesoWms = vo.asBigDecimal("TOPENTDIFPESOWMS");
        this.codTipParc = vo.asBigDecimal("CODTIPPARC");
        this.corAgendado = vo.asBigDecimal("CORAGENDADO");
        this.corAtendido = vo.asBigDecimal("CORATENDIDO");
        this.corBloqueado = vo.asBigDecimal("CORBLOQUEADO");
        this.corEncaixado = vo.asBigDecimal("CORENCAIXADO");
        this.corFaturado = vo.asBigDecimal("CORFATURADO");
        this.corFixado = vo.asBigDecimal("CORFIXADO");
        this.horaFinal = vo.asBigDecimal("HORAFINAL");
        this.horaInicial = vo.asBigDecimal("HORAINICIAL");
        this.intervalo = vo.asBigDecimal("INTERVALO");
        this.notaModeloDAgenda = vo.asBigDecimal("NOTAMODELODAGENDA");
        this.qtdLimiteMes = vo.asBigDecimal("QTDLIMITEMES");
        this.validaCpfCnpj = vo.asString("VALIDACPFCNPJ");
        this.wmsUsaEtiqPal = vo.asString("WMSUSAETIQPAL");
        this.gerObsNotag4000 = vo.asString("GEROBSNOTAG4000");
        this.margSegPcp = vo.asBigDecimal("MARGSEGPCP");
        this.seqTokenNfce = vo.asBigDecimal("SEQTOKENNFCE");
        this.tokenNfce = vo.asString("TOKENNFCE");
        this.tpAmbMdfe = vo.asString("TPAMBMDFE");
        this.vlrLiqItemNfce = vo.asString("VLRLIQITEMNFCE");
        this.chaveDigitalAgiliblue = vo.asString("CHAVEDIGITALAGILIBLUE");
        this.codUsuNfse = vo.asString("CODUSUNFSE");
        this.codContrInfse = vo.asString("CODCONTRINFSE");
        this.temDenuesPont = vo.asString("TEMDENUESPONT");
        this.przTolCancNota = vo.asBigDecimal("PRZTOLCANCNOTA");
        this.przRegCancNota = vo.asBigDecimal("PRZREGCANCNOTA");
        this.serNaoTribBaseIss = vo.asString("SERNAOTRIBBASEISS");
        this.codEndArmIndef = vo.asBigDecimal("CODENDARMINDEF");
        this.copiasDacte = vo.asBigDecimal("COPIASDACTE");
        this.tpAmbCte = vo.asString("TPAMBCTE");
        this.codModDacte = vo.asBigDecimal("CODMODDACTE");
        this.tipoEnvioCte = vo.asString("TIPOENVIOCTE");
        this.contingenciaCte = vo.asString("CONTINGENCIACTE");
        this.tipoDacte = vo.asString("TIPODACTE");
        this.jobKeyNdd = vo.asString("JOBKEYNDD");
        this.conectorNfse = vo.asString("CONECTORNFSE");
        this.codCtactbDesc = vo.asBigDecimal("CODCTACTBDESC");
        this.codCtactbJuros = vo.asBigDecimal("CODCTACTBJUROS");
        this.codCtactbMult = vo.asBigDecimal("CODCTACTBMULT");
        this.codEndCrossdock = vo.asBigDecimal("CODENDCROSSDOCK");
        this.codTrib90CredDeb = vo.asString("CODTRIB90CREDDEB");
        this.conIcmsMajFcpInt = vo.asString("CONICMSMAJFCPINT");
        this.consDevEvtr2050 = vo.asString("CONSDEVEVTR2050");
        this.consIdBenef = vo.asString("CONSIDBENEF");
        this.contingenciaNfce = vo.asString("CONTINGENCIANFCE");
        this.copiasDanfce = vo.asBigDecimal("COPIASDANFCE");
        this.descRedDifCiap = vo.asString("DESCREDDIFCIAP");
        this.difAliqFcpInt = vo.asString("DIFALIQFCPINT");
        this.emailNotfeCreinf = vo.asString("EMAILNOTFECREINF");
        this.envEmailConf = vo.asString("ENVEMAILCONF");
        this.envioSincronoCte = vo.asString("ENVIOSINCRONOCTE");
        this.envioSincronoNfce = vo.asString("ENVIOSINCRONONFCE");
        this.envioSincronoNfe = vo.asString("ENVIOSINCRONONFE");
        this.gerarRetencao = vo.asBigDecimal("GERARRETENCAO");
        this.gerarTaxFinEmbNfe = vo.asString("GERARTAXFINEMBNFE");
        this.igCertifSmtpXml = vo.asString("IGCERTIFSMTPXML");
        this.insXmlPorImpSmtpXml = vo.asString("INSXMLPORIMPSMTPXML");
        this.intConsSmtpXml = vo.asBigDecimal("INTCONSSMTPXML");
        this.nfseStAntConsFinal = vo.asString("NFSESTANTCONSFINAL");
        this.notaEntAjustEstCons = vo.asBigDecimal("NOTAENTAJUSTESTCONS");
        this.notaEntAjustEstCter = vo.asBigDecimal("NOTAENTAJUSTESTCTER");
        this.notaEntAjustEstDter = vo.asBigDecimal("NOTAENTAJUSTESTDTER");
        this.notaSaiAjustBem = vo.asBigDecimal("NOTASAIAJUSTBEM");
        this.notaSaiAjustEstCons = vo.asBigDecimal("NOTASAIAJUSTESTCONS");
        this.notaSaiAjustEstCter = vo.asBigDecimal("NOTASAIAJUSTESTCTER");
        this.notaSaiAjustEstDter = vo.asBigDecimal("NOTASAIAJUSTESTDTER");
        this.numDocR2020 = vo.asString("NUMDOCR2020");
        this.nuNotaDemFx = vo.asBigDecimal("NUNOTADEMFX");
        this.nuNotaModFx = vo.asBigDecimal("NUNOTAMODFX");
        this.nuNotaTrcFx = vo.asBigDecimal("NUNOTATRCFX");
        this.origProdComIpi = vo.asString("ORIGPRODCOMIPI");
        this.permOutroUsuSepPed = vo.asString("PERMOUTROUSUSEPPED");
        this.portaSmtpXml = vo.asBigDecimal("PORTASMTPXML");
        this.progAquisAlim = vo.asString("PROGAQUISALIM");
        this.proxExecSmtpXml = vo.asTimestamp("PROXEXECSMTPXML");
        this.qrcodeNfceVersao2 = vo.asString("QRCODENFCEVERSAO2");
        this.redIssBcPisConf = vo.asString("REDISSBCPISCONF");
        this.redStCompBcPisCofins = vo.asString("REDSTCOMPBCPISCOFINS");
        this.senhaSmtpXml = vo.asString("SENHASMTPXML");
        this.servidorSmtpXml = vo.asString("SERVIDORSMTPXML");
        this.suprimirEmailDest = vo.asString("SUPRIMIREMAILDEST");
        this.tipConexSmtpXml = vo.asString("TIPCONEXSMTPXML");
        this.tipDataEvtServ = vo.asString("TIPDATAEVTSERV");
        this.tipGerInfGveicGreb = vo.asString("TIPGERINFGVEICGREB");
        this.tipoEnvioNfce = vo.asString("TIPOENVIONFCE");
        this.ultNsuCte = vo.asString("ULTNSUCTE");
        this.usaCodBarrasConcatWms = vo.asString("USACODBARRASCONCATWMS");
        this.usaNomeComplItem = vo.asString("USANOMECOMPLITEM");
        this.usaRecParcial = vo.asString("USARECPARCIAL");
        this.usaStExtNotaRestSt = vo.asString("USASTEXTNOTARESTST");
        this.usuarioSmtpXml = vo.asString("USUARIOSMTPXML");
        this.utilizaDfeTransp = vo.asString("UTILIZADFETRANSP");
        this.utilizaExploteSep = vo.asString("UTILIZAEXPLOTESEP");
        this.utilizaSepPulmao = vo.asString("UTILIZASEPPULMAO");
        this.utilizaTriCrossdocking = vo.asString("UTILIZATRICROSSDOCKING");
        this.versaoNt = vo.asBigDecimal("VERSAONT");
        this.versaoNtCte = vo.asBigDecimal("VERSAONTCTE");
        this.versaoNtMdfe = vo.asBigDecimal("VERSAONTMDFE");
        this.wmsArmTotalCol = vo.asString("WMSARMTOTALCOL");
        this.wmsInfoPesoDetVol = vo.asString("WMSINFOPESODETVOL");
        this.wmsMultiUsuConf = vo.asString("WMSMULTIUSUCONF");
        this.wmsUsaImpFechaVol = vo.asString("WMSUSAIMPFECHAVOL");
        this.wmsUsaRegVolRec = vo.asString("WMSUSAREGVOLREC");
        this.aedfe = vo.asString("AEDFE");
        this.atualCbeneffat = vo.asString("ATUALCBENEFFAT");
        this.calcIcmsStNaoCont = vo.asString("CALCICMSSTNAOCONT");
        this.codTabCkc = vo.asBigDecimal("CODTABCKC");
        this.reabCompleto = vo.asString("REABCOMPLETO");
        this.aliqCfBonif = vo.asBigDecimal("ALIQCFBONIF");
        this.aliqPisBonif = vo.asBigDecimal("ALIQPISBONIF");
        this.codCtactbBonif = vo.asBigDecimal("CODCTACTBBONIF");
        this.codStPisCfBonif = vo.asString("CODSTPISCFBONIF");
        this.mdfeDocSemisPropria = vo.asString("MDFEDOCSEMISPROPRIA");
        this.nuRfeCartaCorrCte = vo.asBigDecimal("NURFECARTACORRCTE");
        this.tribPisCfBonif = vo.asString("TRIBPISCFBONIF");
        this.gerLivIcmsEmpSn = vo.asString("GERLIVICMSEMPSN");
        this.codForDifAliq = vo.asBigDecimal("CODFORDIFALIQ");
        this.defCstIpi00 = vo.asString("DEFCSTIPI00");
        this.defCstIpi01 = vo.asString("DEFCSTIPI01");
        this.defCstIpi02 = vo.asString("DEFCSTIPI02");
        this.defCstIpi03 = vo.asString("DEFCSTIPI03");
        this.defCstIpi04 = vo.asString("DEFCSTIPI04");
        this.defCstIpi05 = vo.asString("DEFCSTIPI05");
        this.defCstIpi49 = vo.asString("DEFCSTIPI49");
        this.defCstIpi50 = vo.asString("DEFCSTIPI50");
        this.defCstIpi51 = vo.asString("DEFCSTIPI51");
        this.defCstIpi52 = vo.asString("DEFCSTIPI52");
        this.defCstIpi53 = vo.asString("DEFCSTIPI53");
        this.defCstIpi54 = vo.asString("DEFCSTIPI54");
        this.defCstIpi55 = vo.asString("DEFCSTIPI55");
        this.defCstIpi99 = vo.asString("DEFCSTIPI99");
        this.ipiTributDefEmp = vo.asString("IPITRIBUTDEFEMP");
        this.escritCompraEmissProp = vo.asString("ESCRITCOMPRAEMISSPROP");
        this.geraNotaEntCanc = vo.asString("GERANOTAENTCANC");
        this.metCalcDifIcms = vo.asString("METCALCDIFICMS");
        this.pesMaxSepAgru = vo.asBigDecimal("PESMAXSEPAGRU");
        this.usaSepAgrupProd = vo.asString("USASEPAGRUPPROD");
        this.qtPedSepAgr = vo.asBigDecimal("QTPEDSEPAGR");
        this.qtCheckSep = vo.asBigDecimal("QTCHECKSEP");
        this.volCheckSepProd = vo.asBigDecimal("VOLCHECKSEPPROD");
        this.consRepIcmsBasePisCof = vo.asString("CONSREPICMSBASEPISCOF");
        this.aliqPisDesc = vo.asBigDecimal("ALIQPISDESC");
        this.aliqCfJuros = vo.asBigDecimal("ALIQCFJUROS");
        this.localPadEconect = vo.asBigDecimal("LOCALPADECONECT");
        this.aliqCfDesc = vo.asBigDecimal("ALIQCFDESC");
        this.jobMdEndDigital = vo.asString("JOBMDENDDIGITAL");
        this.codStPisCfDesc = vo.asString("CODSTPISCFDESC");
        this.codStPisCfJuros = vo.asString("CODSTPISCFJUROS");
        this.aliqPisJuros = vo.asBigDecimal("ALIQPISJUROS");
        this.tribPisCfDesc = vo.asString("TRIBPISCFDESC");
        this.tribPisCfJuros = vo.asString("TRIBPISCFJUROS");
        this.aliqPisMult = vo.asBigDecimal("ALIQPISMULT");
        this.aliqCfMult = vo.asBigDecimal("ALIQCFMULT");
        this.codStPisCfMult = vo.asString("CODSTPISCFMULT");
        this.tribPisCfMult = vo.asString("TRIBPISCFMULT");
        this.certificadoPix = vo.asString("CERTIFICADOPIX");
        this.impCteEmisProp = vo.asString("IMPCTEEMISPROP");
        this.codEndRetExp = vo.asBigDecimal("CODENDRETEXP");
        this.redIcmsBcPisConfins = vo.asString("REDICMSBCPISCONFINS");
        this.ultNsu = vo.asString("ULTNSU");
        this.usaInfoAdConfPed = vo.asString("USAINFOADCONFPED");
        this.nfseObsIterps = vo.asBigDecimal("NFSEOBSITERPS");
        this.qtdCarNfseObsIterps = vo.asBigDecimal("QTDCARNFSEOBSITERPS");
        this.caepf = vo.asString("CAEPF");
        this.cafir = vo.asString("CAFIR");
        this.gerAlcdpr = vo.asString("GERALCDPR");
        this.tipoExploracao = vo.asString("TIPOEXPLORACAO");
        this.baixaFinPreEmissNfce = vo.asString("BAIXAFINPREEMISSNFCE");
        this.icmsNormalDifIcmsSn = vo.asString("ICMSNORMALDIFICMSSN");
        this.dirFcpfResp = vo.asString("DIRFCPFRESP");
        this.dirFDepDecJud = vo.asString("DIRFDEPDECJUD");
        this.dirFDepFunInv = vo.asString("DIRFDEPFUNINV");
        this.dirFdhevento = vo.asTimestamp("DIRFDHEVENTO");
        this.dirFentImune = vo.asString("DIRFENTIMUNE");
        this.dirFnatDecl = vo.asString("DIRFNATDECL");
        this.dirFpgExt = vo.asString("DIRFPGEXT");
        this.dirFpgFundPub = vo.asString("DIRFPGFUNDPUB");
        this.dirFplPriAss = vo.asString("DIRFPLPRIASS");
        this.dirFsitEsp = vo.asString("DIRFSITESP");
        this.dirFsocost = vo.asString("DIRFSOCOST");
        this.tempPremiacaoEstadual = vo.asString("TEMPPREMIACAOESTADUAL");
        this.codClassifEstab = vo.asBigDecimal("CODCLASSIFESTAB");
        this.redPisBcPisCofins = vo.asString("REDPISBCPISCOFINS");
        this.nuRfeProducao = vo.asBigDecimal("NURFEPRODUCAO");
        this.impressoraEtqSep = vo.asString("IMPRESSORAETQSEP");
        this.filtroAliqIcmsSql = vo.asString("FILTROALIQICMSSQL");
        this.clasConsAgua = vo.asString("CLASCONSAGUA");
        this.clasConsEnerg = vo.asString("CLASCONSENERG");
        this.clasConsGas = vo.asString("CLASCONSGAS");
        this.identEct = vo.asString("IDENTECT");
        this.wmsDocAsepBalcao = vo.asString("WMSDOCASEPBALCAO");
        this.efdh010 = vo.asString("EFDH010");
        this.efdh010Prter = vo.asString("EFDH010PRTER");
        this.efdh010Ter = vo.asString("EFDH010TER");
        this.utilizaExplote = vo.asString("UTILIZAEXPLOTE");
        this.codRelMinutaOdp = vo.asBigDecimal("CODRELMINUTAODP");
        this.senhaEct = vo.asString("SENHAECT");
        this.dtRefPreProdFictReinf = vo.asTimestamp("DTREFPREPRODFICTREINF");
        this.dtRefPreProdReaisReinf = vo.asTimestamp("DTREFPREPRODREAISREINF");
        this.dtRefProdReinf = vo.asTimestamp("DTREFPRODREINF");
        this.dtValFinReinf = vo.asTimestamp("DTVALFINREINF");
        this.dtValIniReinf = vo.asTimestamp("DTVALINIREINF");
        this.empAdmPubDir = vo.asString("EMPADMPUBDIR");
        this.entregaEcd = vo.asString("ENTREGAECD");
        this.identEctRastreio = vo.asString("IDENTECTRASTREIO");
        this.impNfeEmissProp = vo.asString("IMPNFEEMISSPROP");
        this.partCanalVerde = vo.asString("PARTCANALVERDE");
        this.ambienteReinf = vo.asBigDecimal("AMBIENTEREINF");
        this.camConvPref = vo.asString("CAMCONVPREF");
        this.cnpjEfrVinc = vo.asString("CNPJEFRVINC");
        this.desonerafolhaCprb = vo.asString("DESONERAFOLHACPRB");
        this.respEntReinf = vo.asBigDecimal("RESPENTREINF");
        this.senhaEctRastreio = vo.asString("SENHAECTRASTREIO");
        this.sitEmpReinf = vo.asBigDecimal("SITEMPREINF");
        this.tipCtactbEfd = vo.asString("TIPCTACTBEFD");
        this.topCorBanEconect = vo.asBigDecimal("TOPCORBANECONECT");
        this.tribReinf = vo.asBigDecimal("TRIBREINF");
        this.versaoCte = vo.asBigDecimal("VERSAOCTE");
        this.vinculoEfr = vo.asString("VINCULOEFR");
        this.nroMaxProd = vo.asBigDecimal("NROMAXPROD");
        this.tpOempresa = vo.asBigDecimal("TPOEMPRESA");
        this.versaoMdfe = vo.asBigDecimal("VERSAOMDFE");
        this.transpCarga = vo.asString("TRANSPCARGA");
        this.usaDtValLotNfe = vo.asString("USADTVALLOTNFE");
        this.usaDtFabLotNfe = vo.asString("USADTFABLOTNFE");
        this.modEtqVol = vo.asBigDecimal("MODETQVOL");
        this.igPermCompProds = vo.asString("IGPERMCOMPPRODS");
        this.impressoraEtqVol = vo.asString("IMPRESSORAETQVOL");
        this.chaveAcessoNfse = vo.asString("CHAVEACESSONFSE");
        this.codLojaEconect = vo.asBigDecimal("CODLOJAECONECT");
        this.topRecargaCelEconect = vo.asBigDecimal("TOPRECARGACELECONECT");
        this.topNfceEconect = vo.asBigDecimal("TOPNFCEECONECT");
        this.topSateConect = vo.asBigDecimal("TOPSATECONECT");
        this.wmsCodEndFlut = vo.asBigDecimal("WMSCODENDFLUT");
        this.usaTrocoCheckout = vo.asString("USATROCOCHECKOUT");
        this.codEmpOrigMovFin = vo.asBigDecimal("CODEMPORIGMOVFIN");
        this.calcVencGnreApu = vo.asString("CALCVENCGNREAPU");
        this.gerObsIpiRegEnt = vo.asString("GEROBSIPIREGENT");
        this.gerCteCredPisCof = vo.asString("GERCTECREDPISCOF");
        this.ger0220UndForn = vo.asString("GER0220UNDFORN");
        this.gerChaveRefSig = vo.asString("GERCHAVEREFSIG");
        this.proibDigConfEnt = vo.asString("PROIBDIGCONFENT");
        this.qtdConfEntWms = vo.asBigDecimal("QTDCONFENTWMS");
        this.empCentralMovFin = vo.asString("EMPCENTRALMOVFIN");
        this.codModEmailNfe = vo.asBigDecimal("CODMODEMAILNFE");
        this.codModDanfeSimplifNfe = vo.asBigDecimal("CODMODDANFESIMPLIFNFE");
        this.gerCiapCompEfd = vo.asString("GERCIAPCOMPEFD");
        this.modEmailLibLim = vo.asBigDecimal("MODEMAILLIBLIM");
        this.tokenNfse = vo.asString("TOKENNFSE");
        this.efdCodBco = vo.asBigDecimal("EFDCODBCO");
        this.efdCodCenCus = vo.asBigDecimal("EFDCODCENCUS");
        this.efdCodCtabCoInt = vo.asBigDecimal("EFDCODCTABCOINT");
        this.efdCodNatDespRecIcms = vo.asBigDecimal("EFDCODNATDESPRECICMS");
        this.efdCodTipOper = vo.asBigDecimal("EFDCODTIPOPER");
        this.efdCodTipTit = vo.asBigDecimal("EFDCODTIPTIT");
        this.efdDiaVenc = vo.asBigDecimal("EFDDIAVENC");
        this.efdTipReenchNota = vo.asString("EFDTIPREENCHNOTA");
        this.intFinObriIcmsStRec = vo.asString("INTFINOBRIICMSSTREC");
        this.wmsRastSerMed = vo.asString("WMSRASTSERMED");
        this.codRespRetc180 = vo.asString("CODRESPRETC180");
        this.vlrBaseStc180 = vo.asString("VLRBASESTC180");
        this.vlrStc180 = vo.asString("VLRSTC180");
        this.topSangSupri = vo.asBigDecimal("TOPSANGSUPRI");
        this.usaVlrMedTransfEmp = vo.asString("USAVLRMEDTRANSFEMP");
        this.topDespesa = vo.asBigDecimal("TOPDESPESA");
        this.usaIndPresTopFat = vo.asString("USAINDPRESTOPFAT");
        this.tipoImpKitFox = vo.asString("TIPOIMPKITFOX");
        this.apiKeyPixCheckout = vo.asString("APIKEYPIXCHECKOUT");
        this.bancoPixCheckout = vo.asBigDecimal("BANCOPIXCHECKOUT");
        this.clientIdPixCheckout = vo.asString("CLIENTIDPIXCHECKOUT");
        this.clientSecretPixCheckout = vo.asString("CLIENTSECRETPIXCHECKOUT");
        this.cstNRedIcmsBcPisCof = vo.asString("CSTNREDICMSBCPISCOF");
        this.consDevNfeReinf = vo.asString("CONSDEVNFEREINF");
        this.ambienteGnre = vo.asString("AMBIENTEGNRE");
        this.codEmpMatrizGnre = vo.asBigDecimal("CODEMPMATRIZGNRE");
        this.versaoGnre = vo.asString("VERSAOGNRE");
        this.codEmpGrupoFrete = vo.asBigDecimal("CODEMPGRUPOFRETE");
        this.calcFetHab = vo.asString("CALCFETHAB");
        this.msgInfAdicFetHab = vo.asString("MSGINFADICFETHAB");
        this.aliqFunttel = vo.asBigDecimal("ALIQFUNTTEL");
        this.aliqFust = vo.asBigDecimal("ALIQFUST");
        this.fistel = vo.asString("FISTEL");
        this.vlrIcmsOpAnt = vo.asString("VLRICMSOPANT");
        this.vlrStFcpOpAnt = vo.asString("VLRSTFCPOPANT");
        this.vlrStOpAnt = vo.asString("VLRSTOPANT");
        this.vlrUnitIcmsOp = vo.asString("VLRUNITICMSOP");
        this.inibeReabMaxPicking = vo.asString("INIBEREABMAXPICKING");
        this.tratSobFinConf = vo.asString("TRATSOBFINCONF");
        this.conEstOrigProd = vo.asBigDecimal("CONESTORIGPROD");
        this.vlrUnitMerc = vo.asString("VLRUNITMERC");
        this.redDifAlBcPisCof = vo.asString("REDDIFALBCPISCOF");
        this.entAutTarMapa = vo.asString("ENTAUTTARMAPA");
        this.priorCodNat = vo.asBigDecimal("PRIORCODNAT");
        this.envRespContCte = vo.asString("ENVRESPCONTCTE");
        this.consDevTerevtr2050 = vo.asString("CONSDEVTEREVTR2050");
        this.envInutNotaExc = vo.asString("ENVINUTNOTAEXC");
        this.jusInutNotaExc = vo.asString("JUSINUTNOTAEXC");
        this.wmsDocArep = vo.asString("WMSDOCAREP");
        this.deduzFcpBcPisCofins = vo.asString("DEDUZFCPBCPISCOFINS");
        this.sepPulParcial = vo.asString("SEPPULPARCIAL");
        this.obtStAntMedEnt = vo.asString("OBTSTANTMEDENT");
        this.calcIcmsAt = vo.asString("CALCICMSAT");
        this.proibEscCheckoutPed = vo.asString("PROIBESCCHECKOUTPED");
        this.nfeCanExtCanMes = vo.asString("NFECANEXTCANMES");
        this.envMdfSinc = vo.asString("ENVMDFSINC");
        this.wmsPerSepProdAp = vo.asString("WMSPERSEPPRODAP");
        this.consIdQtCarcDesc = vo.asString("CONSIDQTCARCDESC");
        this.envLeiTranspDesc = vo.asString("ENVLEITRANSPDESC");
        this.envLeiTranspTotoBs = vo.asString("ENVLEITRANSPTOTOBS");
        this.cgcProcurador = vo.asString("CGCPROCURADOR");
        this.inibLoqRegConf = vo.asString("INIBLOQREGCONF");
        this.blqNfaCompNfcPend = vo.asString("BLQNFACOMPNFCPEND");
        this.difAliqDespAcess = vo.asString("DIFALIQDESPACESS");
        this.complRestituicaoIcmsSt = vo.asString("COMPLRESTITUICAOICMSST");
        this.calcPisCfsFin = vo.asString("CALCPISCFSFIN");
        this.isAliqIntSexC = vo.asString("ISALIQINTSEXC");
        this.tipIcmsFenvalBem = vo.asBigDecimal("TIPICMSFENVALBEM");
        this.chavePixCheckout = vo.asString("CHAVEPIXCHECKOUT");
        this.urlPixCheckout = vo.asString("URLPIXCHECKOUT");
        this.calcVlrAquisBem = vo.asBigDecimal("CALCVLRAQUISBEM");
        this.inibeLote = vo.asString("INIBELOTE");
        this.contBaiBemSubImprec = vo.asString("CONTBAIBEMSUBIMPREC");
        this.codCtaPixTef = vo.asBigDecimal("CODCTAPIXTEF");
        this.credIcmsCombus = vo.asString("CREDICMSCOMBUS");
        this.credIcmsRemg = vo.asString("CREDICMSREMG");
        this.descricao = vo.asString("DESCRICAO");
        this.descrNat = vo.asString("DESCRNAT");
        this.desTipIdevCom = vo.asString("DESTIPIDEVCOM");
        this.natCanPix = vo.asBigDecimal("NATCANPIX");
        this.rupturaEst = vo.asString("RUPTURAEST");
        this.somarFcpBcCiap = vo.asString("SOMARFCPBCCIAP");
        this.tipoPix = vo.asString("TIPOPIX");
        this.topCanPixFin = vo.asBigDecimal("TOPCANPIXFIN");
        this.topCanPixPag = vo.asBigDecimal("TOPCANPIXPAG");
        this.topCanPixRec = vo.asBigDecimal("TOPCANPIXREC");
        this.usaMedDiaImp = vo.asString("USAMEDDIAIMP");
        this.codCenCusIpi = vo.asBigDecimal("CODCENCUSIPI");
        this.codCtabCoIpi = vo.asBigDecimal("CODCTABCOIPI");
        this.codEmpImposto = vo.asBigDecimal("CODEMPIMPOSTO");
        this.codModRetEstWms = vo.asBigDecimal("CODMODRETESTWMS");
        this.codNatIpi = vo.asBigDecimal("CODNATIPI");
        this.codParcIpi = vo.asBigDecimal("CODPARCIPI");
        this.codReceitaIpi = vo.asString("CODRECEITAIPI");
        this.codReceitaReinf = vo.asString("CODRECEITAREINF");
        this.codTipOperIpi = vo.asBigDecimal("CODTIPOPERIPI");
        this.codTipTitIpi = vo.asBigDecimal("CODTIPTITIPI");
        this.consDifParcOutIcms = vo.asString("CONSDIFPARCOUTICMS");
        this.ctactbAnlRegApur = vo.asString("CTACTBANLREGAPUR");
        this.desRestrFcpCst = vo.asString("DESRESTRFCPCST");
        this.desRestrFcpStCst = vo.asString("DESRESTRFCPSTCST");
        this.diaVencIpi = vo.asBigDecimal("DIAVENCIPI");
        this.dtObito = vo.asTimestamp("DTOBITO");
        this.dtOpJuros = vo.asString("DTOPJUROS");
        this.dtOpMulta = vo.asString("DTOPMULTA");
        this.dtRefPreProdReaisReinfG4000 = vo.asTimestamp("DTREFPREPRODREAISREINFG4000");
        this.dtRefProdReinfG4000 = vo.asTimestamp("DTREFPRODREINFG4000");
        this.dtTransfFinsLucr = vo.asTimestamp("DTTRANSFFINSLUCR");
        this.envInfIssSomDevido = vo.asString("ENVINFISSSOMDEVIDO");
        this.estrNcredIcmsSt = vo.asString("ESTRNCREDICMSST");
        this.gerMultPlacres = vo.asString("GERMULTPLACRES");
        this.indTipLayoutK010 = vo.asBigDecimal("INDTIPLAYOUTK010");
        this.indUniao = vo.asBigDecimal("INDUNIAO");
        this.integrarIpiFin = vo.asString("INTEGRARIPIFIN");
        this.modEstCpaWms = vo.asBigDecimal("MODESTCPAWMS");
        this.notaEntAjusteReclas = vo.asBigDecimal("NOTAENTAJUSTERECLAS");
        this.notaSaiAjusteReclas = vo.asBigDecimal("NOTASAIAJUSTERECLAS");
        this.origDescontos = vo.asBigDecimal("ORIGDESCONTOS");
        this.redStBcPisCofins = vo.asString("REDSTBCPISCOFINS");
        this.stInclusa70 = vo.asString("STINCLUSA70");
        this.tipCtactbEfdf = vo.asString("TIPCTACTBEFDF");
        this.tipDataEvtPag = vo.asString("TIPDATAEVTPAG");
        this.tipDataEvtPagXir = vo.asString("TIPDATAEVTPAGXIR");
        this.tokenIbpt = vo.asString("TOKENIBPT");
        this.usaCusMedIcMpro = vo.asString("USACUSMEDICMPRO");
        this.usaCustoMedioMps = vo.asString("USACUSTOMEDIOMPS");
        this.desApCprodEpe = vo.asString("DESAPCPRODEPE");
        this.regApurTribSn = vo.asString("REGAPURTRIBSN");
        this.status = vo.asBigDecimal("STATUS");
        this.geraDeducaoPf = vo.asString("GERADEDUCAOPF");
        this.credIcmsCst60Am = vo.asString("CREDICMSCST60AM");
        this.denunCesPcte = vo.asString("DENUNCESPCTE");
        this.prazoRcancCte = vo.asBigDecimal("PRAZORCANCCTE");
        this.prazoTcancCte = vo.asBigDecimal("PRAZOTCANCCTE");
        this.teraCpCte = vo.asString("TERACPCTE");
        this.aplCalcDifAliqFrt = vo.asString("APLCALCDIFALIQFRT");
        return this;
   }
}
