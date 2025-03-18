package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EmpresaFinanceiro extends AbstractSankhyaEntity<EmpresaFinanceiro> {
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
   private String gerNotaEnt;
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
   private BigDecimal codTipOperaComp;
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
   private String consEntrPendWms;
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
   private String percProj;
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
   private String ufCrContador;
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
   private String icmsScttd;
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
   private BigDecimal calcPercPis;
   private BigDecimal codCenCus;
   private BigDecimal codCenCusDesp;
   private BigDecimal codCtabCoIpad;
   private BigDecimal codCtActb1;
   private BigDecimal codCtActb2;
   private BigDecimal codCtActb3;
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
   private BigDecimal tpObsFinG4000;
   private BigDecimal tpObsNotaG4000;
   private String gerObsFinG4000;
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
   private BigDecimal codenqipisai;
   private BigDecimal topsaidadifpesowms;
   private BigDecimal codtabalt;
   private BigDecimal codsmtp;
   private BigDecimal topentdifpesowms;
   private BigDecimal codtipparc;
   private BigDecimal coragendado;
   private BigDecimal coratendido;
   private BigDecimal corbloqueado;
   private BigDecimal corencaixado;
   private BigDecimal corfaturado;
   private BigDecimal corfixado;
   private BigDecimal horafinal;
   private BigDecimal horainicial;
   private BigDecimal intervalo;
   private BigDecimal notamodelodagenda;
   private BigDecimal qtdlimitemes;
   private String validacpfcnpj;
   private String wmsusaeqipal;
   private String gerobsnotag4000;
   private BigDecimal margsegpcp;
   private BigDecimal seqtokennfce;
   private String tokennfce;
   private String tpambmdfe;
   private String vlrliqitemnfce;
   private String chavedigitalagiliblue;
   private String codusunfse;
   private String codcontrinfse;
   private String temdenuespont;
   private BigDecimal prztolcannota;
   private BigDecimal przregcannota;
   private String sernatribbaseiss;
   private BigDecimal codendarmindef;
   private BigDecimal copiasdacte;
   private String tpambcte;
   private BigDecimal codmoddacte;
   private String tipoenviocte;
   private String contingenciacte;
   private String tipodacte;
   private String jobkeyndd;
   private String conectornfse;
   private BigDecimal codctactbdesc;
   private BigDecimal codctactbjuros;
   private BigDecimal codctactbmult;
   private BigDecimal codendcrossdock;
   private String codtrib90creddeb;
   private String conicmsmajfcpint;
   private String consdevevtr2050;
   private String considbenef;
   private String contingencianfce;
   private BigDecimal copiasdanfce;
   private String descredifciap;
   private String difaliqfcpint;
   private String emailnotfecreinf;
   private String envemailconf;
   private String enviosincronocte;
   private String enviosincrononfce;
   private String enviosincrononfe;
   private BigDecimal gerarretencao;
   private String gerartaxfinembnfe;
   private String igcertifsmtpxml;
   private String insxmlporimpsmtpxml;
   private BigDecimal intconssmtpxml;
   private String nfestantconsfinal;
   private BigDecimal notaentajustestcons;
   private BigDecimal notaentajustestcter;
   private BigDecimal notaentajustestdter;
   private BigDecimal notasaiajustbem;
   private BigDecimal notasaiajustestcons;
   private BigDecimal notasaiajustestcter;
   private BigDecimal notasaiajustestdter;
   private String numdocr2020;
   private BigDecimal nunotademfx;
   private BigDecimal nunotamodfx;
   private BigDecimal nunotatrcfx;
   private String origprodcomipi;
   private String permoutroususepped;
   private BigDecimal portasmtpxml;
   private String progaquisalim;
   private Timestamp proxexecsmtpxml;
   private String qrcodenfceversao2;
   private String redissbcpisconf;
   private String redstcompbcpiscofins;
   private String senhasmtpxml;
   private String servidorsmtpxml;
   private String suprimiremaildest;
   private String tipconexsmtpxml;
   private String tipdataevtserv;
   private String tipgerinfgveicgreb;
   private String tipoenvionfce;
   private String ultnsucte;
   private String usacodbarrasconcatwms;
   private String usanomecomplitem;
   private String usarecparcial;
   private String usasttextnotarestst;
   private String usuariosmtpxml;
   private String utilizadfetransp;
   private String utilizaexplotesep;
   private String utilizaseppulmao;
   private String utilizatricrossdocking;
   private BigDecimal versaoNt;
   private BigDecimal versaoNtCte;
   private BigDecimal versaoNtMdfe;
   private String wmsArmTotalCol;
   private String wmsInfoPesoDetVol;
   private String wmsMultiUsuConf;
   private String wmsUsaImpFechaVol;
   private String wmsUsaRegVolRec;
   private String aedFe;
   private String atualCbEnefFat;
   private String calcIcmsStNaoCont;
   private BigDecimal codTabCkc;
   private String reabCompleto;
   private BigDecimal aliqCfBonif;
   private BigDecimal aliqPisBonif;
   private BigDecimal codCtaCtbBonif;
   private String codStPisCfBonif;
   private String mdfeDocSemIsProp;
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
   private String gerNotaEntCanc;
   private String metCalcDifIcms;
   private BigDecimal pesMaxSepaGru;
   private String usaSepaGruProd;
   private BigDecimal qtPedSepaGr;
   private BigDecimal qtCheckSep;
   private BigDecimal volCheckSepRod;
   private String consRepIcmsBasePisCof;
   private BigDecimal aliqPisDesc;
   private BigDecimal aliqCfJuros;
   private BigDecimal localPadEConect;
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
   private BigDecimal nfSeObsIterPs;
   private BigDecimal qtdCarNfSeObsIterPs;
   private String caepf;
   private String cafir;
   private String gerAlcdPr;
   private String tipoExploracao;
   private String baixaFinPreEmissNfce;
   private String icmsNormalDifIcmsSn;
   private String dirFcpfResp;
   private String dirFDepDecJud;
   private String dirFDepFunInv;
   private Timestamp dirFdhEvento;
   private String dirFEntImune;
   private String dirFNatDecl;
   private String dirFPgExt;
   private String dirFPgFundPub;
   private String dirFPlPriAss;
   private String dirFSitEsp;
   private String dirFSocost;
   private String tempRemicaoEstadual;
   private BigDecimal codClassifEstab;
   private String redPisBcPisCofins;
   private BigDecimal nuRfeProducao;
   private String impressoraEtqSep;
   private String filtroAliqIcmsSql;
   private String clasConsAgua;
   private String clasConsEnerg;
   private String clasConsGas;
   private String identEct;
   private String wmsDocASepBalcao;
   private String efdh010;
   private String efdh010PrTer;
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
   private String tipCtActbEfd;
   private BigDecimal topCorBanEconect;
   private BigDecimal tribReinf;
   private BigDecimal versaoCte;
   private String vinculoEfr;
   private BigDecimal nroMaxProd;
   private BigDecimal tpoEmpresa;
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
   private BigDecimal topSatEconect;
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
   private BigDecimal efdCodCtaBcoInt;
   private BigDecimal efdCodNatDespRecIcms;
   private BigDecimal efdCodTipoPer;
   private BigDecimal efdCodTipTit;
   private BigDecimal efdDiaVenc;
   private String efdTipoReenchNota;
   private String intFinObricmsStRec;
   private String wmsRastSerMed;
   private String codRespRetC180;
   private String vlrBaseStC180;
   private String vlrStC180;
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
   private BigDecimal aliqFuntTel;
   private BigDecimal aliqFust;
   private String fisTel;
   private String vlrIcmsOpAnt;
   private String vlrStFcpOpAnt;
   private String vlrStOpAnt;
   private String vlrUnitIcmsOp;
   private String iniBereabMaxPicking;
   private String tratSobFinConf;
   private BigDecimal conEstOrigProd;
   private String vlrUnitMerc;
   private String redDifAlBcPisCof;
   private String entAutTarMapa;
   private BigDecimal priorCodNat;
   private String envRespContCte;
   private String consDevTerevTr2050;
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
   private String wmsPersEpProdAp;
   private String considQtCarDesc;
   private String envLeiTranspDesc;
   private String envLeiTranspTotObs;
   private String cgcProcurador;
   private String iniBloqRegConf;
   private String blqNfaCompNfcPend;
   private String difAliqDespAcess;
   private String complRestituicaoIcmsSt;
   private String calcPisCfsFin;
   private String isAliqIntSexC;
   private BigDecimal tipIcmsFenValBem;
   private String chavePixCheckout;
   private String urlPixCheckout;
   private BigDecimal calcVlrAquisBem;
   private String iniBelote;
   private String contBaiBemSubImprec;
   private BigDecimal codCtaPixTef;
   private String credIcmsCombus;
   private String credIcmsRemg;
   private String descricao;
   private String descrNat;
   private String desTipIdEvCom;
   private BigDecimal natCanPix;
   private String rupturaEst;
   private String somarFcpBcCiap;
   private String tipoPix;
   private BigDecimal topCanPixFin;
   private BigDecimal topCanPixPag;
   private BigDecimal topCanPixRec;
   private String usaMedDiaImp;
   private BigDecimal codCenCusIpi;
   private BigDecimal codCtaBcoIpi;
   private BigDecimal codEmpImposto;
   private BigDecimal codModRetEstWms;
   private BigDecimal codNatIpi;
   private BigDecimal codParCipi;
   private String codReceitaIpi;
   private String codReceitaReinf;
   private BigDecimal codTipoPerIpi;
   private BigDecimal codTipTitIpi;
   private String consDifParCoutIcms;
   private String ctaCtbAnlRegApur;
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
   private String gerMultPlacRes;
   private BigDecimal indTipoLayoutK010;
   private BigDecimal indUniao;
   private String integrarIpiFin;
   private BigDecimal modEstCpaWms;
   private BigDecimal notaEntAjusteReclas;
   private BigDecimal notaSaiAjusteReclas;
   private BigDecimal origDescontos;
   private String redStBcPisCofins;
   private String stInclusA70;
   private String tipCtaCtbEfdF;
   private String tipDataEvtPag;
   private String tipDataEvtPagXir;
   private String tokenIbpt;
   private String usaCusMedIcmsPro;
   private String usaCustoMedioMps;
   private String desApCProDepE;
   private String regApurTribSn;
   private BigDecimal status;
   private String geraDeducaoPf;
   private String credIcmsCst60Am;
   private String denuncEspCte;
   private BigDecimal prazoRCancCte;
   private BigDecimal prazoTCancCte;
   private String terAcpCte;
   private String aplCalcDifAliqFrt;

   public BigDecimal getCodLancBcoPag() {
        return codLancBcoPag;
   }

   public void setCodLancBcoPag(BigDecimal codLancBcoPag) {
        markAsChanged("CODLANCBCOPAG", codLancBcoPag);
        this.codLancBcoPag = codLancBcoPag;
   }

   public String getCorTeFaltaWms() {
        return corTeFaltaWms;
   }

   public void setCorTeFaltaWms(String corTeFaltaWms) {
        markAsChanged("CORTEFALTAWMS", corTeFaltaWms);
        this.corTeFaltaWms = corTeFaltaWms;
   }

   public String getCpfContador() {
        return cpfContador;
   }

   public void setCpfContador(String cpfContador) {
        markAsChanged("CPFCONTADOR", cpfContador);
        this.cpfContador = cpfContador;
   }

   public String getCrcContador() {
        return crcContador;
   }

   public void setCrcContador(String crcContador) {
        markAsChanged("CRCCONTADOR", crcContador);
        this.crcContador = crcContador;
   }

   public String getCredCofins() {
        return credCofins;
   }

   public void setCredCofins(String credCofins) {
        markAsChanged("CREDCOFINS", credCofins);
        this.credCofins = credCofins;
   }

   public String getCredPis() {
        return credPis;
   }

   public void setCredPis(String credPis) {
        markAsChanged("CREDPIS", credPis);
        this.credPis = credPis;
   }

   public BigDecimal getCstIpiEnt() {
        return cstIpiEnt;
   }

   public void setCstIpiEnt(BigDecimal cstIpiEnt) {
        markAsChanged("CSTIPIENT", cstIpiEnt);
        this.cstIpiEnt = cstIpiEnt;
   }

   public BigDecimal getCstIpiSai() {
        return cstIpiSai;
   }

   public void setCstIpiSai(BigDecimal cstIpiSai) {
        markAsChanged("CSTIPISAI", cstIpiSai);
        this.cstIpiSai = cstIpiSai;
   }

   public Timestamp getDtCertifNfeFim() {
        return dtCertifNfeFim;
   }

   public void setDtCertifNfeFim(Timestamp dtCertifNfeFim) {
        markAsChanged("DTCERTIFNFEFIM", dtCertifNfeFim);
        this.dtCertifNfeFim = dtCertifNfeFim;
   }

   public Timestamp getDtCertifNfeIni() {
        return dtCertifNfeIni;
   }

   public void setDtCertifNfeIni(Timestamp dtCertifNfeIni) {
        markAsChanged("DTCERTIFNFEINI", dtCertifNfeIni);
        this.dtCertifNfeIni = dtCertifNfeIni;
   }

   public String getEmailContador() {
        return emailContador;
   }

   public void setEmailContador(String emailContador) {
        markAsChanged("EMAILCONTADOR", emailContador);
        this.emailContador = emailContador;
   }

   public String getEmiteExped() {
        return emiteExped;
   }

   public void setEmiteExped(String emiteExped) {
        markAsChanged("EMITEEXPED", emiteExped);
        this.emiteExped = emiteExped;
   }

   public BigDecimal getEmpDestinoWms() {
        return empDestinoWms;
   }

   public void setEmpDestinoWms(BigDecimal empDestinoWms) {
        markAsChanged("EMPDESTINOWMS", empDestinoWms);
        this.empDestinoWms = empDestinoWms;
   }

   public BigDecimal getEmpSoma() {
        return empSoma;
   }

   public void setEmpSoma(BigDecimal empSoma) {
        markAsChanged("EMPSOMA", empSoma);
        this.empSoma = empSoma;
   }

   public BigDecimal getEndeCktIndef() {
        return endeCktIndef;
   }

   public void setEndeCktIndef(BigDecimal endeCktIndef) {
        markAsChanged("ENDECKTINDEF", endeCktIndef);
        this.endeCktIndef = endeCktIndef;
   }

   public BigDecimal getEndeMovIndef() {
        return endeMovIndef;
   }

   public void setEndeMovIndef(BigDecimal endeMovIndef) {
        markAsChanged("ENDEMOVINDEF", endeMovIndef);
        this.endeMovIndef = endeMovIndef;
   }

   public String getEntPenBalcaoWms() {
        return entPenBalcaoWms;
   }

   public void setEntPenBalcaoWms(String entPenBalcaoWms) {
        markAsChanged("ENTPENBALCAOWMS", entPenBalcaoWms);
        this.entPenBalcaoWms = entPenBalcaoWms;
   }

   public String getFlex() {
        return flex;
   }

   public void setFlex(String flex) {
        markAsChanged("FLEX", flex);
        this.flex = flex;
   }

   public String getFragmentaEstWms() {
        return fragmentaEstWms;
   }

   public void setFragmentaEstWms(String fragmentaEstWms) {
        markAsChanged("FRAGMENTAESTWMS", fragmentaEstWms);
        this.fragmentaEstWms = fragmentaEstWms;
   }

   public String getFrasEnfse() {
        return frasEnfse;
   }

   public void setFrasEnfse(String frasEnfse) {
        markAsChanged("FRASENFSE", frasEnfse);
        this.frasEnfse = frasEnfse;
   }

   public String getFreteSepConstransp() {
        return freteSepConstransp;
   }

   public void setFreteSepConstransp(String freteSepConstransp) {
        markAsChanged("FRETESEPCONSTRANSP", freteSepConstransp);
        this.freteSepConstransp = freteSepConstransp;
   }

   public String getFreteSepSemPre() {
        return freteSepSemPre;
   }

   public void setFreteSepSemPre(String freteSepSemPre) {
        markAsChanged("FRETESEPSEMPRE", freteSepSemPre);
        this.freteSepSemPre = freteSepSemPre;
   }

   public String getGeraGnre() {
        return geraGnre;
   }

   public void setGeraGnre(String geraGnre) {
        markAsChanged("GERAGNRE", geraGnre);
        this.geraGnre = geraGnre;
   }

   public String getGerarLivros() {
        return gerarLivros;
   }

   public void setGerarLivros(String gerarLivros) {
        markAsChanged("GERARLIVROS", gerarLivros);
        this.gerarLivros = gerarLivros;
   }

   public String getGerarProdLivEnt() {
        return gerarProdLivEnt;
   }

   public void setGerarProdLivEnt(String gerarProdLivEnt) {
        markAsChanged("GERARPRODLIVENT", gerarProdLivEnt);
        this.gerarProdLivEnt = gerarProdLivEnt;
   }

   public String getGerarProdOrigKit() {
        return gerarProdOrigKit;
   }

   public void setGerarProdOrigKit(String gerarProdOrigKit) {
        markAsChanged("GERARPRODORIGKIT", gerarProdOrigKit);
        this.gerarProdOrigKit = gerarProdOrigKit;
   }

   public String getGerNotaEnt() {
        return gerNotaEnt;
   }

   public void setGerNotaEnt(String gerNotaEnt) {
        markAsChanged("GERNOTAENT", gerNotaEnt);
        this.gerNotaEnt = gerNotaEnt;
   }

   public String getGravarObsNota() {
        return gravarObsNota;
   }

   public void setGravarObsNota(String gravarObsNota) {
        markAsChanged("GRAVAROBSNOTA", gravarObsNota);
        this.gravarObsNota = gravarObsNota;
   }

   public String getGravarObsPadrao() {
        return gravarObsPadrao;
   }

   public void setGravarObsPadrao(String gravarObsPadrao) {
        markAsChanged("GRAVAROBSPADRAO", gravarObsPadrao);
        this.gravarObsPadrao = gravarObsPadrao;
   }

   public String getGravarSerieNota() {
        return gravarSerieNota;
   }

   public void setGravarSerieNota(String gravarSerieNota) {
        markAsChanged("GRAVARSERIENOTA", gravarSerieNota);
        this.gravarSerieNota = gravarSerieNota;
   }

   public String getImpEtiqSepOc() {
        return impEtiqSepOc;
   }

   public void setImpEtiqSepOc(String impEtiqSepOc) {
        markAsChanged("IMPETIQSEPOC", impEtiqSepOc);
        this.impEtiqSepOc = impEtiqSepOc;
   }

   public String getImpEtiqVolConf() {
        return impEtiqVolConf;
   }

   public void setImpEtiqVolConf(String impEtiqVolConf) {
        markAsChanged("IMPETIQVOLCONF", impEtiqVolConf);
        this.impEtiqVolConf = impEtiqVolConf;
   }

   public BigDecimal getImpEtqVol() {
        return impEtqVol;
   }

   public void setImpEtqVol(BigDecimal impEtqVol) {
        markAsChanged("IMPETQVOL", impEtqVol);
        this.impEtqVol = impEtqVol;
   }

   public String getImpExped() {
        return impExped;
   }

   public void setImpExped(String impExped) {
        markAsChanged("IMPEXPED", impExped);
        this.impExped = impExped;
   }

   public String getIncentCult() {
        return incentCult;
   }

   public void setIncentCult(String incentCult) {
        markAsChanged("INCENTCULT", incentCult);
        this.incentCult = incentCult;
   }

   public BigDecimal getIndEscrit() {
        return indEscrit;
   }

   public void setIndEscrit(BigDecimal indEscrit) {
        markAsChanged("INDESCRIT", indEscrit);
        this.indEscrit = indEscrit;
   }

   public String getIntegraWmsProd() {
        return integraWmsProd;
   }

   public void setIntegraWmsProd(String integraWmsProd) {
        markAsChanged("INTEGRAWMSPROD", integraWmsProd);
        this.integraWmsProd = integraWmsProd;
   }

   public String getIpiIncIcms() {
        return ipiIncIcms;
   }

   public void setIpiIncIcms(String ipiIncIcms) {
        markAsChanged("IPIINCICMS", ipiIncIcms);
        this.ipiIncIcms = ipiIncIcms;
   }

   public String getIpiNaoIncid() {
        return ipiNaoIncid;
   }

   public void setIpiNaoIncid(String ipiNaoIncid) {
        markAsChanged("IPINAOINCID", ipiNaoIncid);
        this.ipiNaoIncid = ipiNaoIncid;
   }

   public String getLayoutDanfe() {
        return layoutDanfe;
   }

   public void setLayoutDanfe(String layoutDanfe) {
        markAsChanged("LAYOUTDANFE", layoutDanfe);
        this.layoutDanfe = layoutDanfe;
   }

   public String getLivro1Para1Tgfite() {
        return livro1Para1Tgfite;
   }

   public void setLivro1Para1Tgfite(String livro1Para1Tgfite) {
        markAsChanged("LIVRO1PARA1TGFITE", livro1Para1Tgfite);
        this.livro1Para1Tgfite = livro1Para1Tgfite;
   }

   public BigDecimal getLocalPad() {
        return localPad;
   }

   public void setLocalPad(BigDecimal localPad) {
        markAsChanged("LOCALPAD", localPad);
        this.localPad = localPad;
   }

   public String getLogoDanfe() {
        return logoDanfe;
   }

   public void setLogoDanfe(String logoDanfe) {
        markAsChanged("LOGODANFE", logoDanfe);
        this.logoDanfe = logoDanfe;
   }

   public String getMarcaNotRps() {
        return marcaNotRps;
   }

   public void setMarcaNotRps(String marcaNotRps) {
        markAsChanged("MARCANOTRPS", marcaNotRps);
        this.marcaNotRps = marcaNotRps;
   }

   public BigDecimal getMaxCredIndeniz() {
        return maxCredIndeniz;
   }

   public void setMaxCredIndeniz(BigDecimal maxCredIndeniz) {
        markAsChanged("MAXCREDINDENIZ", maxCredIndeniz);
        this.maxCredIndeniz = maxCredIndeniz;
   }

   public BigDecimal getMaxDebIndeniz() {
        return maxDebIndeniz;
   }

   public void setMaxDebIndeniz(BigDecimal maxDebIndeniz) {
        markAsChanged("MAXDEBINDENIZ", maxDebIndeniz);
        this.maxDebIndeniz = maxDebIndeniz;
   }

   public BigDecimal getCodEmpMatrizNfse() {
        return codEmpMatrizNfse;
   }

   public void setCodEmpMatrizNfse(BigDecimal codEmpMatrizNfse) {
        markAsChanged("CODEMPMATRIZNFSE", codEmpMatrizNfse);
        this.codEmpMatrizNfse = codEmpMatrizNfse;
   }

   public BigDecimal getCodEmpOc() {
        return codEmpOc;
   }

   public void setCodEmpOc(BigDecimal codEmpOc) {
        markAsChanged("CODEMPOC", codEmpOc);
        this.codEmpOc = codEmpOc;
   }

   public BigDecimal getCodEndAvaria() {
        return codEndAvaria;
   }

   public void setCodEndAvaria(BigDecimal codEndAvaria) {
        markAsChanged("CODENDAVARIA", codEndAvaria);
        this.codEndAvaria = codEndAvaria;
   }

   public BigDecimal getCodLancBcoRec() {
        return codLancBcoRec;
   }

   public void setCodLancBcoRec(BigDecimal codLancBcoRec) {
        markAsChanged("CODLANCBCOREC", codLancBcoRec);
        this.codLancBcoRec = codLancBcoRec;
   }

   public BigDecimal getCodLocAlterc() {
        return codLocAlterc;
   }

   public void setCodLocAlterc(BigDecimal codLocAlterc) {
        markAsChanged("CODLOCALTERC", codLocAlterc);
        this.codLocAlterc = codLocAlterc;
   }

   public BigDecimal getCodModDanfe() {
        return codModDanfe;
   }

   public void setCodModDanfe(BigDecimal codModDanfe) {
        markAsChanged("CODMODDANFE", codModDanfe);
        this.codModDanfe = codModDanfe;
   }

   public BigDecimal getCodModDanfeContingencia() {
        return codModDanfeContingencia;
   }

   public void setCodModDanfeContingencia(BigDecimal codModDanfeContingencia) {
        markAsChanged("CODMODDANFECONTINGENCIA", codModDanfeContingencia);
        this.codModDanfeContingencia = codModDanfeContingencia;
   }

   public BigDecimal getCodParcCtb() {
        return codParcCtb;
   }

   public void setCodParcCtb(BigDecimal codParcCtb) {
        markAsChanged("CODPARCCTB", codParcCtb);
        this.codParcCtb = codParcCtb;
   }

   public BigDecimal getCodTab() {
        return codTab;
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
        this.codTab = codTab;
   }

   public BigDecimal getCodTabCalc() {
        return codTabCalc;
   }

   public void setCodTabCalc(BigDecimal codTabCalc) {
        markAsChanged("CODTABCALC", codTabCalc);
        this.codTabCalc = codTabCalc;
   }

   public BigDecimal getCodTipOperaComp() {
        return codTipOperaComp;
   }

   public void setCodTipOperaComp(BigDecimal codTipOperaComp) {
        markAsChanged("CODTIPOPERACOMP", codTipOperaComp);
        this.codTipOperaComp = codTipOperaComp;
   }

   public String getCodTrib20Red() {
        return codTrib20Red;
   }

   public void setCodTrib20Red(String codTrib20Red) {
        markAsChanged("CODTRIB20RED", codTrib20Red);
        this.codTrib20Red = codTrib20Red;
   }

   public String getCodTrib30() {
        return codTrib30;
   }

   public void setCodTrib30(String codTrib30) {
        markAsChanged("CODTRIB30", codTrib30);
        this.codTrib30 = codTrib30;
   }

   public String getCodTrib40Isent() {
        return codTrib40Isent;
   }

   public void setCodTrib40Isent(String codTrib40Isent) {
        markAsChanged("CODTRIB40ISENT", codTrib40Isent);
        this.codTrib40Isent = codTrib40Isent;
   }

   public String getCodTrib41NaoTrib() {
        return codTrib41NaoTrib;
   }

   public void setCodTrib41NaoTrib(String codTrib41NaoTrib) {
        markAsChanged("CODTRIB41NAOTRIB", codTrib41NaoTrib);
        this.codTrib41NaoTrib = codTrib41NaoTrib;
   }

   public String getCodTrib50Susp() {
        return codTrib50Susp;
   }

   public void setCodTrib50Susp(String codTrib50Susp) {
        markAsChanged("CODTRIB50SUSP", codTrib50Susp);
        this.codTrib50Susp = codTrib50Susp;
   }

   public String getCodTrib51Dif() {
        return codTrib51Dif;
   }

   public void setCodTrib51Dif(String codTrib51Dif) {
        markAsChanged("CODTRIB51DIF", codTrib51Dif);
        this.codTrib51Dif = codTrib51Dif;
   }

   public String getCodTrib60StAnt() {
        return codTrib60StAnt;
   }

   public void setCodTrib60StAnt(String codTrib60StAnt) {
        markAsChanged("CODTRIB60STANT", codTrib60StAnt);
        this.codTrib60StAnt = codTrib60StAnt;
   }

   public String getCodTrib70RedSt() {
        return codTrib70RedSt;
   }

   public void setCodTrib70RedSt(String codTrib70RedSt) {
        markAsChanged("CODTRIB70REDST", codTrib70RedSt);
        this.codTrib70RedSt = codTrib70RedSt;
   }

   public String getCodTrib90Out() {
        return codTrib90Out;
   }

   public void setCodTrib90Out(String codTrib90Out) {
        markAsChanged("CODTRIB90OUT", codTrib90Out);
        this.codTrib90Out = codTrib90Out;
   }

   public String getCompIpi() {
        return compIpi;
   }

   public void setCompIpi(String compIpi) {
        markAsChanged("COMPIPI", compIpi);
        this.compIpi = compIpi;
   }

   public String getCompIpiSepIcm() {
        return compIpiSepIcm;
   }

   public void setCompIpiSepIcm(String compIpiSepIcm) {
        markAsChanged("COMPIPISEPICM", compIpiSepIcm);
        this.compIpiSepIcm = compIpiSepIcm;
   }

   public String getComplItemNota() {
        return complItemNota;
   }

   public void setComplItemNota(String complItemNota) {
        markAsChanged("COMPLITEMNOTA", complItemNota);
        this.complItemNota = complItemNota;
   }

   public String getConsEntrPendWms() {
        return consEntrPendWms;
   }

   public void setConsEntrPendWms(String consEntrPendWms) {
        markAsChanged("CONSENTRPENDWMS", consEntrPendWms);
        this.consEntrPendWms = consEntrPendWms;
   }

   public String getConsOutrosImp() {
        return consOutrosImp;
   }

   public void setConsOutrosImp(String consOutrosImp) {
        markAsChanged("CONSOUTROSIMP", consOutrosImp);
        this.consOutrosImp = consOutrosImp;
   }

   public String getConsVlrLiqNfse() {
        return consVlrLiqNfse;
   }

   public void setConsVlrLiqNfse(String consVlrLiqNfse) {
        markAsChanged("CONSVLRLIQNFSE", consVlrLiqNfse);
        this.consVlrLiqNfse = consVlrLiqNfse;
   }

   public String getContingenciaNfe() {
        return contingenciaNfe;
   }

   public void setContingenciaNfe(String contingenciaNfe) {
        markAsChanged("CONTINGENCIANFE", contingenciaNfe);
        this.contingenciaNfe = contingenciaNfe;
   }

   public BigDecimal getCopiasDanfe() {
        return copiasDanfe;
   }

   public void setCopiasDanfe(BigDecimal copiasDanfe) {
        markAsChanged("COPIASDANFE", copiasDanfe);
        this.copiasDanfe = copiasDanfe;
   }

   public BigDecimal getCopiasDanfeConting() {
        return copiasDanfeConting;
   }

   public void setCopiasDanfeConting(BigDecimal copiasDanfeConting) {
        markAsChanged("COPIASDANFECONTING", copiasDanfeConting);
        this.copiasDanfeConting = copiasDanfeConting;
   }

   public BigDecimal getCodEndDiverg() {
        return codEndDiverg;
   }

   public void setCodEndDiverg(BigDecimal codEndDiverg) {
        markAsChanged("CODENDDIVERG", codEndDiverg);
        this.codEndDiverg = codEndDiverg;
   }

   public BigDecimal getCodEndPerda() {
        return codEndPerda;
   }

   public void setCodEndPerda(BigDecimal codEndPerda) {
        markAsChanged("CODENDPERDA", codEndPerda);
        this.codEndPerda = codEndPerda;
   }

   public BigDecimal getPartIcMeta() {
        return partIcMeta;
   }

   public void setPartIcMeta(BigDecimal partIcMeta) {
        markAsChanged("PARTICMETA", partIcMeta);
        this.partIcMeta = partIcMeta;
   }

   public BigDecimal getPercCfFab() {
        return percCfFab;
   }

   public void setPercCfFab(BigDecimal percCfFab) {
        markAsChanged("PERCCFFAB", percCfFab);
        this.percCfFab = percCfFab;
   }

   public BigDecimal getPercCfOutros() {
        return percCfOutros;
   }

   public void setPercCfOutros(BigDecimal percCfOutros) {
        markAsChanged("PERCCFOUTROS", percCfOutros);
        this.percCfOutros = percCfOutros;
   }

   public BigDecimal getPercCfServico() {
        return percCfServico;
   }

   public void setPercCfServico(BigDecimal percCfServico) {
        markAsChanged("PERCCFSERVICO", percCfServico);
        this.percCfServico = percCfServico;
   }

   public BigDecimal getPercCofins() {
        return percCofins;
   }

   public void setPercCofins(BigDecimal percCofins) {
        markAsChanged("PERCCOFINS", percCofins);
        this.percCofins = percCofins;
   }

   public BigDecimal getPercCsl() {
        return percCsl;
   }

   public void setPercCsl(BigDecimal percCsl) {
        markAsChanged("PERCCSL", percCsl);
        this.percCsl = percCsl;
   }

   public BigDecimal getPercCusVar() {
        return percCusVar;
   }

   public void setPercCusVar(BigDecimal percCusVar) {
        markAsChanged("PERCCUSVAR", percCusVar);
        this.percCusVar = percCusVar;
   }

   public BigDecimal getPercMargem() {
        return percMargem;
   }

   public void setPercMargem(BigDecimal percMargem) {
        markAsChanged("PERCMARGEM", percMargem);
        this.percMargem = percMargem;
   }

   public BigDecimal getPercPis() {
        return percPis;
   }

   public void setPercPis(BigDecimal percPis) {
        markAsChanged("PERCPIS", percPis);
        this.percPis = percPis;
   }

   public String getPerfilEfd() {
        return perfilEfd;
   }

   public void setPerfilEfd(String perfilEfd) {
        markAsChanged("PERFILEFD", perfilEfd);
        this.perfilEfd = perfilEfd;
   }

   public String getPercProj() {
        return percProj;
   }

   public void setPercProj(String percProj) {
        markAsChanged("PERPROJ", percProj);
        this.percProj = percProj;
   }

   public String getProdEpe() {
        return prodEpe;
   }

   public void setProdEpe(String prodEpe) {
        markAsChanged("PRODEPE", prodEpe);
        this.prodEpe = prodEpe;
   }

   public String getProjOnline() {
        return projOnline;
   }

   public void setProjOnline(String projOnline) {
        markAsChanged("PROJONLINE", projOnline);
        this.projOnline = projOnline;
   }

   public String getRastrEstoque() {
        return rastrEstoque;
   }

   public void setRastrEstoque(String rastrEstoque) {
        markAsChanged("RASTRESTOQUE", rastrEstoque);
        this.rastrEstoque = rastrEstoque;
   }

   public String getReabCorrecaoWms() {
        return reabCorrecaoWms;
   }

   public void setReabCorrecaoWms(String reabCorrecaoWms) {
        markAsChanged("REABCORRECAOWMS", reabCorrecaoWms);
        this.reabCorrecaoWms = reabCorrecaoWms;
   }

   public String getRecMinTare() {
        return recMinTare;
   }

   public void setRecMinTare(String recMinTare) {
        markAsChanged("RECMINTARE", recMinTare);
        this.recMinTare = recMinTare;
   }

   public String getReg54Seq997St() {
        return reg54Seq997St;
   }

   public void setReg54Seq997St(String reg54Seq997St) {
        markAsChanged("REG54SEQ997ST", reg54Seq997St);
        this.reg54Seq997St = reg54Seq997St;
   }

   public String getRegimeEspTribIss() {
        return regimeEspTribIss;
   }

   public void setRegimeEspTribIss(String regimeEspTribIss) {
        markAsChanged("REGIMEESPTRIBISS", regimeEspTribIss);
        this.regimeEspTribIss = regimeEspTribIss;
   }

   public String getSaldoLivQuinz() {
        return saldoLivQuinz;
   }

   public void setSaldoLivQuinz(String saldoLivQuinz) {
        markAsChanged("SALDOLIVQUINZ", saldoLivQuinz);
        this.saldoLivQuinz = saldoLivQuinz;
   }

   public String getCodTrib61() {
        return codTrib61;
   }

   public void setCodTrib61(String codTrib61) {
        markAsChanged("CODTRIB61", codTrib61);
        this.codTrib61 = codTrib61;
   }

   public String getPrefixSerieNacional() {
        return prefixSerieNacional;
   }

   public void setPrefixSerieNacional(String prefixSerieNacional) {
        markAsChanged("PREFIXSERIENACIONAL", prefixSerieNacional);
        this.prefixSerieNacional = prefixSerieNacional;
   }

   public String getSaldoLivQuinzIpi() {
        return saldoLivQuinzIpi;
   }

   public void setSaldoLivQuinzIpi(String saldoLivQuinzIpi) {
        markAsChanged("SALDOLIVQUINZIPI", saldoLivQuinzIpi);
        this.saldoLivQuinzIpi = saldoLivQuinzIpi;
   }

   public String getSenhaNfse() {
        return senhaNfse;
   }

   public void setSenhaNfse(String senhaNfse) {
        markAsChanged("SENHANFSE", senhaNfse);
        this.senhaNfse = senhaNfse;
   }

   public String getSerieAcompCf() {
        return serieAcompCf;
   }

   public void setSerieAcompCf(String serieAcompCf) {
        markAsChanged("SERIEACOMPCF", serieAcompCf);
        this.serieAcompCf = serieAcompCf;
   }

   public String getSerieDevWms() {
        return serieDevWms;
   }

   public void setSerieDevWms(String serieDevWms) {
        markAsChanged("SERIEDEVWMS", serieDevWms);
        this.serieDevWms = serieDevWms;
   }

   public String getStInclusa() {
        return stInclusa;
   }

   public void setStInclusa(String stInclusa) {
        markAsChanged("STINCLUSA", stInclusa);
        this.stInclusa = stInclusa;
   }

   public String getTelContador() {
        return telContador;
   }

   public void setTelContador(String telContador) {
        markAsChanged("TELCONTADOR", telContador);
        this.telContador = telContador;
   }

   public String getTemCofins() {
        return temCofins;
   }

   public void setTemCofins(String temCofins) {
        markAsChanged("TEMCOFINS", temCofins);
        this.temCofins = temCofins;
   }

   public String getTemCssl() {
        return temCssl;
   }

   public void setTemCssl(String temCssl) {
        markAsChanged("TEMCSSL", temCssl);
        this.temCssl = temCssl;
   }

   public String getTemPis() {
        return temPis;
   }

   public void setTemPis(String temPis) {
        markAsChanged("TEMPIS", temPis);
        this.temPis = temPis;
   }

   public String getTemReaIcms() {
        return temReaIcms;
   }

   public void setTemReaIcms(String temReaIcms) {
        markAsChanged("TEMREAICMS", temReaIcms);
        this.temReaIcms = temReaIcms;
   }

   public BigDecimal getTipoAtividade() {
        return tipoAtividade;
   }

   public void setTipoAtividade(BigDecimal tipoAtividade) {
        markAsChanged("TIPOATIVIDADE", tipoAtividade);
        this.tipoAtividade = tipoAtividade;
   }

   public BigDecimal getTipoAtividadePisCofins() {
        return tipoAtividadePisCofins;
   }

   public void setTipoAtividadePisCofins(BigDecimal tipoAtividadePisCofins) {
        markAsChanged("TIPOATIVIDADEPISCOFINS", tipoAtividadePisCofins);
        this.tipoAtividadePisCofins = tipoAtividadePisCofins;
   }

   public String getTipoCorteWms() {
        return tipoCorteWms;
   }

   public void setTipoCorteWms(String tipoCorteWms) {
        markAsChanged("TIPOCORTEWMS", tipoCorteWms);
        this.tipoCorteWms = tipoCorteWms;
   }

   public String getTipoDanfe() {
        return tipoDanfe;
   }

   public void setTipoDanfe(String tipoDanfe) {
        markAsChanged("TIPODANFE", tipoDanfe);
        this.tipoDanfe = tipoDanfe;
   }

   public String getTipoEnvioNfe() {
        return tipoEnvioNfe;
   }

   public void setTipoEnvioNfe(String tipoEnvioNfe) {
        markAsChanged("TIPOENVIONFE", tipoEnvioNfe);
        this.tipoEnvioNfe = tipoEnvioNfe;
   }

   public String getTipoImpressora() {
        return tipoImpressora;
   }

   public void setTipoImpressora(String tipoImpressora) {
        markAsChanged("TIPOIMPRESSORA", tipoImpressora);
        this.tipoImpressora = tipoImpressora;
   }

   public String getTiraServLrContab() {
        return tiraServLrContab;
   }

   public void setTiraServLrContab(String tiraServLrContab) {
        markAsChanged("TIRASERVLRCONTAB", tiraServLrContab);
        this.tiraServLrContab = tiraServLrContab;
   }

   public BigDecimal getTopDevolucaoWms() {
        return topDevolucaoWms;
   }

   public void setTopDevolucaoWms(BigDecimal topDevolucaoWms) {
        markAsChanged("TOPDEVOLUCAOWMS", topDevolucaoWms);
        this.topDevolucaoWms = topDevolucaoWms;
   }

   public BigDecimal getTopEntradaWms() {
        return topEntradaWms;
   }

   public void setTopEntradaWms(BigDecimal topEntradaWms) {
        markAsChanged("TOPENTRADAWMS", topEntradaWms);
        this.topEntradaWms = topEntradaWms;
   }

   public BigDecimal getTopEnvWmsAgrup() {
        return topEnvWmsAgrup;
   }

   public void setTopEnvWmsAgrup(BigDecimal topEnvWmsAgrup) {
        markAsChanged("TOPENVWMSAGRUP", topEnvWmsAgrup);
        this.topEnvWmsAgrup = topEnvWmsAgrup;
   }

   public BigDecimal getTpAssinante() {
        return tpAssinante;
   }

   public void setTpAssinante(BigDecimal tpAssinante) {
        markAsChanged("TPASSINANTE", tpAssinante);
        this.tpAssinante = tpAssinante;
   }

   public String getTpAssinanteInf() {
        return tpAssinanteInf;
   }

   public void setTpAssinanteInf(String tpAssinanteInf) {
        markAsChanged("TPASSINANTEINF", tpAssinanteInf);
        this.tpAssinanteInf = tpAssinanteInf;
   }

   public BigDecimal getTpLigacao() {
        return tpLigacao;
   }

   public void setTpLigacao(BigDecimal tpLigacao) {
        markAsChanged("TPLIGACAO", tpLigacao);
        this.tpLigacao = tpLigacao;
   }

   public String getTpLigacaoInf() {
        return tpLigacaoInf;
   }

   public void setTpLigacaoInf(String tpLigacaoInf) {
        markAsChanged("TPLIGACAOINF", tpLigacaoInf);
        this.tpLigacaoInf = tpLigacaoInf;
   }

   public String getTrabComIpi() {
        return trabComIpi;
   }

   public void setTrabComIpi(String trabComIpi) {
        markAsChanged("TRABCOMIPI", trabComIpi);
        this.trabComIpi = trabComIpi;
   }

   public String getTratarDifParc() {
        return tratarDifParc;
   }

   public void setTratarDifParc(String tratarDifParc) {
        markAsChanged("TRATARDIFPARC", tratarDifParc);
        this.tratarDifParc = tratarDifParc;
   }

   public String getTratarTribut() {
        return tratarTribut;
   }

   public void setTratarTribut(String tratarTribut) {
        markAsChanged("TRATARTRIBUT", tratarTribut);
        this.tratarTribut = tratarTribut;
   }

   public String getTratarTributDefEmp() {
        return tratarTributDefEmp;
   }

   public void setTratarTributDefEmp(String tratarTributDefEmp) {
        markAsChanged("TRATARTRIBUTDEFEMP", tratarTributDefEmp);
        this.tratarTributDefEmp = tratarTributDefEmp;
   }

   public String getTratoCWms() {
        return tratoCWms;
   }

   public void setTratoCWms(String tratoCWms) {
        markAsChanged("TRATOCWMS", tratoCWms);
        this.tratoCWms = tratoCWms;
   }

   public String getUfCrContador() {
        return ufCrContador;
   }

   public void setUfCrContador(String ufCrContador) {
        markAsChanged("UFCRCCONTADOR", ufCrContador);
        this.ufCrContador = ufCrContador;
   }

   public BigDecimal getUltAutorPag() {
        return ultAutorPag;
   }

   public void setUltAutorPag(BigDecimal ultAutorPag) {
        markAsChanged("ULTAUTORPAG", ultAutorPag);
        this.ultAutorPag = ultAutorPag;
   }

   public BigDecimal getUltDupl() {
        return ultDupl;
   }

   public void setUltDupl(BigDecimal ultDupl) {
        markAsChanged("ULTDUPL", ultDupl);
        this.ultDupl = ultDupl;
   }

   public BigDecimal getUltPagCiapModc() {
        return ultPagCiapModc;
   }

   public void setUltPagCiapModc(BigDecimal ultPagCiapModc) {
        markAsChanged("ULTPAGCIAPMODC", ultPagCiapModc);
        this.ultPagCiapModc = ultPagCiapModc;
   }

   public BigDecimal getUltPagLivEntrad() {
        return ultPagLivEntrad;
   }

   public void setUltPagLivEntrad(BigDecimal ultPagLivEntrad) {
        markAsChanged("ULTPAGLIVENTRAD", ultPagLivEntrad);
        this.ultPagLivEntrad = ultPagLivEntrad;
   }

   public BigDecimal getUltPagLivIcms() {
        return ultPagLivIcms;
   }

   public void setUltPagLivIcms(BigDecimal ultPagLivIcms) {
        markAsChanged("ULTPAGLIVICMS", ultPagLivIcms);
        this.ultPagLivIcms = ultPagLivIcms;
   }

   public BigDecimal getUltPagLivIpi() {
        return ultPagLivIpi;
   }

   public void setUltPagLivIpi(BigDecimal ultPagLivIpi) {
        markAsChanged("ULTPAGLIVIPI", ultPagLivIpi);
        this.ultPagLivIpi = ultPagLivIpi;
   }

   public BigDecimal getUltPagLivIss() {
        return ultPagLivIss;
   }

   public void setUltPagLivIss(BigDecimal ultPagLivIss) {
        markAsChanged("ULTPAGLIVISS", ultPagLivIss);
        this.ultPagLivIss = ultPagLivIss;
   }

   public BigDecimal getUltPagLivSaida() {
        return ultPagLivSaida;
   }

   public void setUltPagLivSaida(BigDecimal ultPagLivSaida) {
        markAsChanged("ULTPAGLIVSAIDA", ultPagLivSaida);
        this.ultPagLivSaida = ultPagLivSaida;
   }

   public String getUsaMovVertWms() {
        return usaMovVertWms;
   }

   public void setUsaMovVertWms(String usaMovVertWms) {
        markAsChanged("USAMOVVERTWMS", usaMovVertWms);
        this.usaMovVertWms = usaMovVertWms;
   }

   public String getUsaTributItens() {
        return usaTributItens;
   }

   public void setUsaTributItens(String usaTributItens) {
        markAsChanged("USATRIBUTITENS", usaTributItens);
        this.usaTributItens = usaTributItens;
   }

   public String getUsuarioNfse() {
        return usuarioNfse;
   }

   public void setUsuarioNfse(String usuarioNfse) {
        markAsChanged("USUARIONFSE", usuarioNfse);
        this.usuarioNfse = usuarioNfse;
   }

   public String getUtilizaWms() {
        return utilizaWms;
   }

   public void setUtilizaWms(String utilizaWms) {
        markAsChanged("UTILIZAWMS", utilizaWms);
        this.utilizaWms = utilizaWms;
   }

   public BigDecimal getVersaoNfe() {
        return versaoNfe;
   }

   public void setVersaoNfe(BigDecimal versaoNfe) {
        markAsChanged("VERSAONFE", versaoNfe);
        this.versaoNfe = versaoNfe;
   }

   public String getVlrLiqItemNfe() {
        return vlrLiqItemNfe;
   }

   public void setVlrLiqItemNfe(String vlrLiqItemNfe) {
        markAsChanged("VLRLIQITEMNFE", vlrLiqItemNfe);
        this.vlrLiqItemNfe = vlrLiqItemNfe;
   }

   public BigDecimal getWmsCodEndGar() {
        return wmsCodEndGar;
   }

   public void setWmsCodEndGar(BigDecimal wmsCodEndGar) {
        markAsChanged("WMSCODENDGAR", wmsCodEndGar);
        this.wmsCodEndGar = wmsCodEndGar;
   }

   public BigDecimal getWmsLocalAjEst() {
        return wmsLocalAjEst;
   }

   public void setWmsLocalAjEst(BigDecimal wmsLocalAjEst) {
        markAsChanged("WMSLOCALAJEST", wmsLocalAjEst);
        this.wmsLocalAjEst = wmsLocalAjEst;
   }

   public String getWmsUsaRegVolFat() {
        return wmsUsaRegVolFat;
   }

   public void setWmsUsaRegVolFat(String wmsUsaRegVolFat) {
        markAsChanged("WMSUSAREGVOLFAT", wmsUsaRegVolFat);
        this.wmsUsaRegVolFat = wmsUsaRegVolFat;
   }

   public Timestamp getDtInicioKardex() {
        return dtInicioKardex;
   }

   public void setDtInicioKardex(Timestamp dtInicioKardex) {
        markAsChanged("DTINICIOKARDEX", dtInicioKardex);
        this.dtInicioKardex = dtInicioKardex;
   }

   public String getGerLdPerTri() {
        return gerLdPerTri;
   }

   public void setGerLdPerTri(String gerLdPerTri) {
        markAsChanged("GERLDPERTRI", gerLdPerTri);
        this.gerLdPerTri = gerLdPerTri;
   }

   public String getIcmsScttd() {
        return icmsScttd;
   }

   public void setIcmsScttd(String icmsScttd) {
        markAsChanged("ICMSSCTTD", icmsScttd);
        this.icmsScttd = icmsScttd;
   }

   public BigDecimal getMaxNotasLoteNfe() {
        return maxNotasLoteNfe;
   }

   public void setMaxNotasLoteNfe(BigDecimal maxNotasLoteNfe) {
        markAsChanged("MAXNOTASLOTENFE", maxNotasLoteNfe);
        this.maxNotasLoteNfe = maxNotasLoteNfe;
   }

   public BigDecimal getModDupl() {
        return modDupl;
   }

   public void setModDupl(BigDecimal modDupl) {
        markAsChanged("MODDUPL", modDupl);
        this.modDupl = modDupl;
   }

   public BigDecimal getModExped() {
        return modExped;
   }

   public void setModExped(BigDecimal modExped) {
        markAsChanged("MODEXPED", modExped);
        this.modExped = modExped;
   }

   public String getNatPessoaJuridica() {
        return natPessoaJuridica;
   }

   public void setNatPessoaJuridica(String natPessoaJuridica) {
        markAsChanged("NATPESSOAJURIDICA", natPessoaJuridica);
        this.natPessoaJuridica = natPessoaJuridica;
   }

   public String getNfe() {
        return nfe;
   }

   public void setNfe(String nfe) {
        markAsChanged("NFE", nfe);
        this.nfe = nfe;
   }

   public String getNfse() {
        return nfse;
   }

   public void setNfse(String nfse) {
        markAsChanged("NFSE", nfse);
        this.nfse = nfse;
   }

   public String getNomeContador() {
        return nomeContador;
   }

   public void setNomeContador(String nomeContador) {
        markAsChanged("NOMECONTADOR", nomeContador);
        this.nomeContador = nomeContador;
   }

   public String getCcm() {
        return ccm;
   }

   public void setCcm(String ccm) {
        markAsChanged("CCM", ccm);
        this.ccm = ccm;
   }

   public String getAgrupaServFat() {
        return agrupaServFat;
   }

   public void setAgrupaServFat(String agrupaServFat) {
        markAsChanged("AGRUPASERVFAT", agrupaServFat);
        this.agrupaServFat = agrupaServFat;
   }

   public String getAltContador() {
        return altContador;
   }

   public void setAltContador(String altContador) {
        markAsChanged("ALTCONTADOR", altContador);
        this.altContador = altContador;
   }

   public String getArqModBoleto() {
        return arqModBoleto;
   }

   public void setArqModBoleto(String arqModBoleto) {
        markAsChanged("ARQMODBOLETO", arqModBoleto);
        this.arqModBoleto = arqModBoleto;
   }

   public BigDecimal getNotaSaiPerdaWms() {
        return notaSaiPerdaWms;
   }

   public void setNotaSaiPerdaWms(BigDecimal notaSaiPerdaWms) {
        markAsChanged("NOTASAIPERDAWMS", notaSaiPerdaWms);
        this.notaSaiPerdaWms = notaSaiPerdaWms;
   }

   public BigDecimal getNuRfe() {
        return nuRfe;
   }

   public void setNuRfe(BigDecimal nuRfe) {
        markAsChanged("NURFE", nuRfe);
        this.nuRfe = nuRfe;
   }

   public BigDecimal getNuRfeCartaCorr() {
        return nuRfeCartaCorr;
   }

   public void setNuRfeCartaCorr(BigDecimal nuRfeCartaCorr) {
        markAsChanged("NURFECARTACORR", nuRfeCartaCorr);
        this.nuRfeCartaCorr = nuRfeCartaCorr;
   }

   public String getCalcIss() {
        return calcIss;
   }

   public void setCalcIss(String calcIss) {
        markAsChanged("CALCISS", calcIss);
        this.calcIss = calcIss;
   }

   public BigDecimal getCalcPercPis() {
        return calcPercPis;
   }

   public void setCalcPercPis(BigDecimal calcPercPis) {
        markAsChanged("CALPERCPIS", calcPercPis);
        this.calcPercPis = calcPercPis;
   }

   public BigDecimal getCodCenCus() {
        return codCenCus;
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        markAsChanged("CODCENCUS", codCenCus);
        this.codCenCus = codCenCus;
   }

   public BigDecimal getCodCenCusDesp() {
        return codCenCusDesp;
   }

   public void setCodCenCusDesp(BigDecimal codCenCusDesp) {
        markAsChanged("CODCENCUSDESP", codCenCusDesp);
        this.codCenCusDesp = codCenCusDesp;
   }

   public BigDecimal getCodCtabCoIpad() {
        return codCtabCoIpad;
   }

   public void setCodCtabCoIpad(BigDecimal codCtabCoIpad) {
        markAsChanged("CODCTABCOIPAD", codCtabCoIpad);
        this.codCtabCoIpad = codCtabCoIpad;
   }

   public BigDecimal getCodCtActb1() {
        return codCtActb1;
   }

   public void setCodCtActb1(BigDecimal codCtActb1) {
        markAsChanged("CODCTACTB_1", codCtActb1);
        this.codCtActb1 = codCtActb1;
   }

   public BigDecimal getCodCtActb2() {
        return codCtActb2;
   }

   public void setCodCtActb2(BigDecimal codCtActb2) {
        markAsChanged("CODCTACTB_2", codCtActb2);
        this.codCtActb2 = codCtActb2;
   }

   public BigDecimal getCodCtActb3() {
        return codCtActb3;
   }

   public void setCodCtActb3(BigDecimal codCtActb3) {
        markAsChanged("CODCTACTB_3", codCtActb3);
        this.codCtActb3 = codCtActb3;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEmpMatrizEfd() {
        return codEmpMatrizEfd;
   }

   public void setCodEmpMatrizEfd(BigDecimal codEmpMatrizEfd) {
        markAsChanged("CODEMPMATRIZEFD", codEmpMatrizEfd);
        this.codEmpMatrizEfd = codEmpMatrizEfd;
   }

   public BigDecimal getCodEndSobra() {
        return codEndSobra;
   }

   public void setCodEndSobra(BigDecimal codEndSobra) {
        markAsChanged("CODENDSOBRA", codEndSobra);
        this.codEndSobra = codEndSobra;
   }

   public BigDecimal getCodEndWms() {
        return codEndWms;
   }

   public void setCodEndWms(BigDecimal codEndWms) {
        markAsChanged("CODENDWMS", codEndWms);
        this.codEndWms = codEndWms;
   }

   public BigDecimal getCodFormPrec() {
        return codFormPrec;
   }

   public void setCodFormPrec(BigDecimal codFormPrec) {
        markAsChanged("CODFORMPREC", codFormPrec);
        this.codFormPrec = codFormPrec;
   }

   public String getCodGrupoTensao() {
        return codGrupoTensao;
   }

   public void setCodGrupoTensao(String codGrupoTensao) {
        markAsChanged("CODGRUPOTENSAO", codGrupoTensao);
        this.codGrupoTensao = codGrupoTensao;
   }

   public BigDecimal getNotaSaiAjustEst() {
        return notaSaiAjustEst;
   }

   public void setNotaSaiAjustEst(BigDecimal notaSaiAjustEst) {
        markAsChanged("NOTASAIAJUSTEST", notaSaiAjustEst);
        this.notaSaiAjustEst = notaSaiAjustEst;
   }

   public String getUtilizaMde() {
        return utilizaMde;
   }

   public void setUtilizaMde(String utilizaMde) {
        markAsChanged("UTILIZAMDE", utilizaMde);
        this.utilizaMde = utilizaMde;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public String getCalcFunRural() {
        return calcFunRural;
   }

   public void setCalcFunRural(String calcFunRural) {
        markAsChanged("CALCFUNRURAL", calcFunRural);
        this.calcFunRural = calcFunRural;
   }

   public String getCalcIcms() {
        return calcIcms;
   }

   public void setCalcIcms(String calcIcms) {
        markAsChanged("CALCICMS", calcIcms);
        this.calcIcms = calcIcms;
   }

   public String getCalcIrrf() {
        return calcIrrf;
   }

   public void setCalcIrrf(String calcIrrf) {
        markAsChanged("CALCIRRF", calcIrrf);
        this.calcIrrf = calcIrrf;
   }

   public BigDecimal getNotaEntAjustEst() {
        return notaEntAjustEst;
   }

   public void setNotaEntAjustEst(BigDecimal notaEntAjustEst) {
        markAsChanged("NOTAENTAJUSTEST", notaEntAjustEst);
        this.notaEntAjustEst = notaEntAjustEst;
   }

   public BigDecimal getNotaEntSobraWms() {
        return notaEntSobraWms;
   }

   public void setNotaEntSobraWms(BigDecimal notaEntSobraWms) {
        markAsChanged("NOTAENTSOBRAWMS", notaEntSobraWms);
        this.notaEntSobraWms = notaEntSobraWms;
   }

   public String getCodTrib53() {
        return codTrib53;
   }

   public void setCodTrib53(String codTrib53) {
        markAsChanged("CODTRIB53", codTrib53);
        this.codTrib53 = codTrib53;
   }

   public String getEnvRespContNfe() {
        return envRespContNfe;
   }

   public void setEnvRespContNfe(String envRespContNfe) {
        markAsChanged("ENVRESPCONTNFE", envRespContNfe);
        this.envRespContNfe = envRespContNfe;
   }

   public BigDecimal getTpObsFinG4000() {
        return tpObsFinG4000;
   }

   public void setTpObsFinG4000(BigDecimal tpObsFinG4000) {
        markAsChanged("TPOBSFING4000", tpObsFinG4000);
        this.tpObsFinG4000 = tpObsFinG4000;
   }

   public BigDecimal getTpObsNotaG4000() {
        return tpObsNotaG4000;
   }

   public void setTpObsNotaG4000(BigDecimal tpObsNotaG4000) {
        markAsChanged("TPOBSNOTAG4000", tpObsNotaG4000);
        this.tpObsNotaG4000 = tpObsNotaG4000;
   }

   public String getGerObsFinG4000() {
        return gerObsFinG4000;
   }

   public void setGerObsFinG4000(String gerObsFinG4000) {
        markAsChanged("GEROBSFING4000", gerObsFinG4000);
        this.gerObsFinG4000 = gerObsFinG4000;
   }

   public BigDecimal getCodBcoIpi() {
        return codBcoIpi;
   }

   public void setCodBcoIpi(BigDecimal codBcoIpi) {
        markAsChanged("CODBCOIPI", codBcoIpi);
        this.codBcoIpi = codBcoIpi;
   }

   public String getTipTransmNfse() {
        return tipTransmNfse;
   }

   public void setTipTransmNfse(String tipTransmNfse) {
        markAsChanged("TIPTRANSMNFSE", tipTransmNfse);
        this.tipTransmNfse = tipTransmNfse;
   }

   public BigDecimal getCodParcNfce() {
        return codParcNfce;
   }

   public void setCodParcNfce(BigDecimal codParcNfce) {
        markAsChanged("CODPARCNFCE", codParcNfce);
        this.codParcNfce = codParcNfce;
   }

   public String getIncentFiscalIssqn() {
        return incentFiscalIssqn;
   }

   public void setIncentFiscalIssqn(String incentFiscalIssqn) {
        markAsChanged("INCENTFISCALISSQN", incentFiscalIssqn);
        this.incentFiscalIssqn = incentFiscalIssqn;
   }

   public String getSerieTopDifMenor() {
        return serieTopDifMenor;
   }

   public void setSerieTopDifMenor(String serieTopDifMenor) {
        markAsChanged("SERIETOPDIFMENOR", serieTopDifMenor);
        this.serieTopDifMenor = serieTopDifMenor;
   }

   public String getSerieTopDifMaior() {
        return serieTopDifMaior;
   }

   public void setSerieTopDifMaior(String serieTopDifMaior) {
        markAsChanged("SERIETOPDIFMAIOR", serieTopDifMaior);
        this.serieTopDifMaior = serieTopDifMaior;
   }

   public String getTipIcmsTopEntSimNac() {
        return tipIcmsTopEntSimNac;
   }

   public void setTipIcmsTopEntSimNac(String tipIcmsTopEntSimNac) {
        markAsChanged("TIPICMSTOPENTSIMNAC", tipIcmsTopEntSimNac);
        this.tipIcmsTopEntSimNac = tipIcmsTopEntSimNac;
   }

   public BigDecimal getCodEnqIpiEnt() {
        return codEnqIpiEnt;
   }

   public void setCodEnqIpiEnt(BigDecimal codEnqIpiEnt) {
        markAsChanged("CODENQIPIENT", codEnqIpiEnt);
        this.codEnqIpiEnt = codEnqIpiEnt;
   }

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
        this.codMeta = codMeta;
   }

   public BigDecimal getCodModNfceCompl() {
        return codModNfceCompl;
   }

   public void setCodModNfceCompl(BigDecimal codModNfceCompl) {
        markAsChanged("CODMODNFCECOMPL", codModNfceCompl);
        this.codModNfceCompl = codModNfceCompl;
   }

   public BigDecimal getCodModNfceSimpl() {
        return codModNfceSimpl;
   }

   public void setCodModNfceSimpl(BigDecimal codModNfceSimpl) {
        markAsChanged("CODMODNFCESIMPL", codModNfceSimpl);
        this.codModNfceSimpl = codModNfceSimpl;
   }

   public BigDecimal getCodenqipisai() {
        return codenqipisai;
   }

   public void setCodenqipisai(BigDecimal codenqipisai) {
        markAsChanged("CODENQIPISAI", codenqipisai);
        this.codenqipisai = codenqipisai;
   }

   public BigDecimal getTopsaidadifpesowms() {
        return topsaidadifpesowms;
   }

   public void setTopsaidadifpesowms(BigDecimal topsaidadifpesowms) {
        markAsChanged("TOPSAIDADIFPESOWMS", topsaidadifpesowms);
        this.topsaidadifpesowms = topsaidadifpesowms;
   }

   public BigDecimal getCodtabalt() {
        return codtabalt;
   }

   public void setCodtabalt(BigDecimal codtabalt) {
        markAsChanged("CODTABALT", codtabalt);
        this.codtabalt = codtabalt;
   }

   public BigDecimal getCodsmtp() {
        return codsmtp;
   }

   public void setCodsmtp(BigDecimal codsmtp) {
        markAsChanged("CODSMTP", codsmtp);
        this.codsmtp = codsmtp;
   }

   public BigDecimal getTopentdifpesowms() {
        return topentdifpesowms;
   }

   public void setTopentdifpesowms(BigDecimal topentdifpesowms) {
        markAsChanged("TOPENTDIFPESOWMS", topentdifpesowms);
        this.topentdifpesowms = topentdifpesowms;
   }

   public BigDecimal getCodtipparc() {
        return codtipparc;
   }

   public void setCodtipparc(BigDecimal codtipparc) {
        markAsChanged("CODTIPPARC", codtipparc);
        this.codtipparc = codtipparc;
   }

   public BigDecimal getCoragendado() {
        return coragendado;
   }

   public void setCoragendado(BigDecimal coragendado) {
        markAsChanged("CORAGENDADO", coragendado);
        this.coragendado = coragendado;
   }

   public BigDecimal getCoratendido() {
        return coratendido;
   }

   public void setCoratendido(BigDecimal coratendido) {
        markAsChanged("CORATENDIDO", coratendido);
        this.coratendido = coratendido;
   }

   public BigDecimal getCorbloqueado() {
        return corbloqueado;
   }

   public void setCorbloqueado(BigDecimal corbloqueado) {
        markAsChanged("CORBLOQUEADO", corbloqueado);
        this.corbloqueado = corbloqueado;
   }

   public BigDecimal getCorencaixado() {
        return corencaixado;
   }

   public void setCorencaixado(BigDecimal corencaixado) {
        markAsChanged("CORENCAIXADO", corencaixado);
        this.corencaixado = corencaixado;
   }

   public BigDecimal getCorfaturado() {
        return corfaturado;
   }

   public void setCorfaturado(BigDecimal corfaturado) {
        markAsChanged("CORFATURADO", corfaturado);
        this.corfaturado = corfaturado;
   }

   public BigDecimal getCorfixado() {
        return corfixado;
   }

   public void setCorfixado(BigDecimal corfixado) {
        markAsChanged("CORFIXADO", corfixado);
        this.corfixado = corfixado;
   }

   public BigDecimal getHorafinal() {
        return horafinal;
   }

   public void setHorafinal(BigDecimal horafinal) {
        markAsChanged("HORAFINAL", horafinal);
        this.horafinal = horafinal;
   }

   public BigDecimal getHorainicial() {
        return horainicial;
   }

   public void setHorainicial(BigDecimal horainicial) {
        markAsChanged("HORAINICIAL", horainicial);
        this.horainicial = horainicial;
   }

   public BigDecimal getIntervalo() {
        return intervalo;
   }

   public void setIntervalo(BigDecimal intervalo) {
        markAsChanged("INTERVALO", intervalo);
        this.intervalo = intervalo;
   }

   public BigDecimal getNotamodelodagenda() {
        return notamodelodagenda;
   }

   public void setNotamodelodagenda(BigDecimal notamodelodagenda) {
        markAsChanged("NOTAMODELODAGENDA", notamodelodagenda);
        this.notamodelodagenda = notamodelodagenda;
   }

   public BigDecimal getQtdlimitemes() {
        return qtdlimitemes;
   }

   public void setQtdlimitemes(BigDecimal qtdlimitemes) {
        markAsChanged("QTDLIMITEMES", qtdlimitemes);
        this.qtdlimitemes = qtdlimitemes;
   }

   public String getValidacpfcnpj() {
        return validacpfcnpj;
   }

   public void setValidacpfcnpj(String validacpfcnpj) {
        markAsChanged("VALIDACPFCNPJ", validacpfcnpj);
        this.validacpfcnpj = validacpfcnpj;
   }

   public String getWmsusaeqipal() {
        return wmsusaeqipal;
   }

   public void setWmsusaeqipal(String wmsusaeqipal) {
        markAsChanged("WMSUSAETIQPAL", wmsusaeqipal);
        this.wmsusaeqipal = wmsusaeqipal;
   }

   public String getGerobsnotag4000() {
        return gerobsnotag4000;
   }

   public void setGerobsnotag4000(String gerobsnotag4000) {
        markAsChanged("GEROBSNOTAG4000", gerobsnotag4000);
        this.gerobsnotag4000 = gerobsnotag4000;
   }

   public BigDecimal getMargsegpcp() {
        return margsegpcp;
   }

   public void setMargsegpcp(BigDecimal margsegpcp) {
        markAsChanged("MARGSEGPCP", margsegpcp);
        this.margsegpcp = margsegpcp;
   }

   public BigDecimal getSeqtokennfce() {
        return seqtokennfce;
   }

   public void setSeqtokennfce(BigDecimal seqtokennfce) {
        markAsChanged("SEQTOKENNFCE", seqtokennfce);
        this.seqtokennfce = seqtokennfce;
   }

   public String getTokennfce() {
        return tokennfce;
   }

   public void setTokennfce(String tokennfce) {
        markAsChanged("TOKENNFCE", tokennfce);
        this.tokennfce = tokennfce;
   }

   public String getTpambmdfe() {
        return tpambmdfe;
   }

   public void setTpambmdfe(String tpambmdfe) {
        markAsChanged("TPAMBMDFE", tpambmdfe);
        this.tpambmdfe = tpambmdfe;
   }

   public String getVlrliqitemnfce() {
        return vlrliqitemnfce;
   }

   public void setVlrliqitemnfce(String vlrliqitemnfce) {
        markAsChanged("VLRLIQITEMNFCE", vlrliqitemnfce);
        this.vlrliqitemnfce = vlrliqitemnfce;
   }

   public String getChavedigitalagiliblue() {
        return chavedigitalagiliblue;
   }

   public void setChavedigitalagiliblue(String chavedigitalagiliblue) {
        markAsChanged("CHAVEDIGITALAGILIBLUE", chavedigitalagiliblue);
        this.chavedigitalagiliblue = chavedigitalagiliblue;
   }

   public String getCodusunfse() {
        return codusunfse;
   }

   public void setCodusunfse(String codusunfse) {
        markAsChanged("CODUSUNFSE", codusunfse);
        this.codusunfse = codusunfse;
   }

   public String getCodcontrinfse() {
        return codcontrinfse;
   }

   public void setCodcontrinfse(String codcontrinfse) {
        markAsChanged("CODCONTRINFSE", codcontrinfse);
        this.codcontrinfse = codcontrinfse;
   }

   public String getTemdenuespont() {
        return temdenuespont;
   }

   public void setTemdenuespont(String temdenuespont) {
        markAsChanged("TEMDENUESPONT", temdenuespont);
        this.temdenuespont = temdenuespont;
   }

   public BigDecimal getPrztolcannota() {
        return prztolcannota;
   }

   public void setPrztolcannota(BigDecimal prztolcannota) {
        markAsChanged("PRZTOLCANNOTA", prztolcannota);
        this.prztolcannota = prztolcannota;
   }

   public BigDecimal getPrzregcannota() {
        return przregcannota;
   }

   public void setPrzregcannota(BigDecimal przregcannota) {
        markAsChanged("PRZREGCANNOTA", przregcannota);
        this.przregcannota = przregcannota;
   }

   public String getSernatribbaseiss() {
        return sernatribbaseiss;
   }

   public void setSernatribbaseiss(String sernatribbaseiss) {
        markAsChanged("SERNAOTRIBBASEISS", sernatribbaseiss);
        this.sernatribbaseiss = sernatribbaseiss;
   }

   public BigDecimal getCodendarmindef() {
        return codendarmindef;
   }

   public void setCodendarmindef(BigDecimal codendarmindef) {
        markAsChanged("CODENDARMINDEF", codendarmindef);
        this.codendarmindef = codendarmindef;
   }

   public BigDecimal getCopiasdacte() {
        return copiasdacte;
   }

   public void setCopiasdacte(BigDecimal copiasdacte) {
        markAsChanged("COPIASDACTE", copiasdacte);
        this.copiasdacte = copiasdacte;
   }

   public String getTpambcte() {
        return tpambcte;
   }

   public void setTpambcte(String tpambcte) {
        markAsChanged("TPAMBCTE", tpambcte);
        this.tpambcte = tpambcte;
   }

   public BigDecimal getCodmoddacte() {
        return codmoddacte;
   }

   public void setCodmoddacte(BigDecimal codmoddacte) {
        markAsChanged("CODMODDACTE", codmoddacte);
        this.codmoddacte = codmoddacte;
   }

   public String getTipoenviocte() {
        return tipoenviocte;
   }

   public void setTipoenviocte(String tipoenviocte) {
        markAsChanged("TIPOENVIOCTE", tipoenviocte);
        this.tipoenviocte = tipoenviocte;
   }

   public String getContingenciacte() {
        return contingenciacte;
   }

   public void setContingenciacte(String contingenciacte) {
        markAsChanged("CONTINGENCIACTE", contingenciacte);
        this.contingenciacte = contingenciacte;
   }

   public String getTipodacte() {
        return tipodacte;
   }

   public void setTipodacte(String tipodacte) {
        markAsChanged("TIPODACTE", tipodacte);
        this.tipodacte = tipodacte;
   }

   public String getJobkeyndd() {
        return jobkeyndd;
   }

   public void setJobkeyndd(String jobkeyndd) {
        markAsChanged("JOBKEYNDD", jobkeyndd);
        this.jobkeyndd = jobkeyndd;
   }

   public String getConectornfse() {
        return conectornfse;
   }

   public void setConectornfse(String conectornfse) {
        markAsChanged("CONECTORNFSE", conectornfse);
        this.conectornfse = conectornfse;
   }

   public BigDecimal getCodctactbdesc() {
        return codctactbdesc;
   }

   public void setCodctactbdesc(BigDecimal codctactbdesc) {
        markAsChanged("CODCTACTBDESC", codctactbdesc);
        this.codctactbdesc = codctactbdesc;
   }

   public BigDecimal getCodctactbjuros() {
        return codctactbjuros;
   }

   public void setCodctactbjuros(BigDecimal codctactbjuros) {
        markAsChanged("CODCTACTBJUROS", codctactbjuros);
        this.codctactbjuros = codctactbjuros;
   }

   public BigDecimal getCodctactbmult() {
        return codctactbmult;
   }

   public void setCodctactbmult(BigDecimal codctactbmult) {
        markAsChanged("CODCTACTBMULT", codctactbmult);
        this.codctactbmult = codctactbmult;
   }

   public BigDecimal getCodendcrossdock() {
        return codendcrossdock;
   }

   public void setCodendcrossdock(BigDecimal codendcrossdock) {
        markAsChanged("CODENDCROSSDOCK", codendcrossdock);
        this.codendcrossdock = codendcrossdock;
   }

   public String getCodtrib90creddeb() {
        return codtrib90creddeb;
   }

   public void setCodtrib90creddeb(String codtrib90creddeb) {
        markAsChanged("CODTRIB90CREDDEB", codtrib90creddeb);
        this.codtrib90creddeb = codtrib90creddeb;
   }

   public String getConicmsmajfcpint() {
        return conicmsmajfcpint;
   }

   public void setConicmsmajfcpint(String conicmsmajfcpint) {
        markAsChanged("CONICMSMAJFCPINT", conicmsmajfcpint);
        this.conicmsmajfcpint = conicmsmajfcpint;
   }

   public String getConsdevevtr2050() {
        return consdevevtr2050;
   }

   public void setConsdevevtr2050(String consdevevtr2050) {
        markAsChanged("CONSDEVEVTR2050", consdevevtr2050);
        this.consdevevtr2050 = consdevevtr2050;
   }

   public String getConsidbenef() {
        return considbenef;
   }

   public void setConsidbenef(String considbenef) {
        markAsChanged("CONSIDBENEF", considbenef);
        this.considbenef = considbenef;
   }

   public String getContingencianfce() {
        return contingencianfce;
   }

   public void setContingencianfce(String contingencianfce) {
        markAsChanged("CONTINGENCIANFCE", contingencianfce);
        this.contingencianfce = contingencianfce;
   }

   public BigDecimal getCopiasdanfce() {
        return copiasdanfce;
   }

   public void setCopiasdanfce(BigDecimal copiasdanfce) {
        markAsChanged("COPIASDANFCE", copiasdanfce);
        this.copiasdanfce = copiasdanfce;
   }

   public String getDescredifciap() {
        return descredifciap;
   }

   public void setDescredifciap(String descredifciap) {
        markAsChanged("DESCREDDIFCIAP", descredifciap);
        this.descredifciap = descredifciap;
   }

   public String getDifaliqfcpint() {
        return difaliqfcpint;
   }

   public void setDifaliqfcpint(String difaliqfcpint) {
        markAsChanged("DIFALIQFCPINT", difaliqfcpint);
        this.difaliqfcpint = difaliqfcpint;
   }

   public String getEmailnotfecreinf() {
        return emailnotfecreinf;
   }

   public void setEmailnotfecreinf(String emailnotfecreinf) {
        markAsChanged("EMAILNOTFECREINF", emailnotfecreinf);
        this.emailnotfecreinf = emailnotfecreinf;
   }

   public String getEnvemailconf() {
        return envemailconf;
   }

   public void setEnvemailconf(String envemailconf) {
        markAsChanged("ENVEMAILCONF", envemailconf);
        this.envemailconf = envemailconf;
   }

   public String getEnviosincronocte() {
        return enviosincronocte;
   }

   public void setEnviosincronocte(String enviosincronocte) {
        markAsChanged("ENVIOSINCRONOCTE", enviosincronocte);
        this.enviosincronocte = enviosincronocte;
   }

   public String getEnviosincrononfce() {
        return enviosincrononfce;
   }

   public void setEnviosincrononfce(String enviosincrononfce) {
        markAsChanged("ENVIOSINCRONONFCE", enviosincrononfce);
        this.enviosincrononfce = enviosincrononfce;
   }

   public String getEnviosincrononfe() {
        return enviosincrononfe;
   }

   public void setEnviosincrononfe(String enviosincrononfe) {
        markAsChanged("ENVIOSINCRONONFE", enviosincrononfe);
        this.enviosincrononfe = enviosincrononfe;
   }

   public BigDecimal getGerarretencao() {
        return gerarretencao;
   }

   public void setGerarretencao(BigDecimal gerarretencao) {
        markAsChanged("GERARRETENCAO", gerarretencao);
        this.gerarretencao = gerarretencao;
   }

   public String getGerartaxfinembnfe() {
        return gerartaxfinembnfe;
   }

   public void setGerartaxfinembnfe(String gerartaxfinembnfe) {
        markAsChanged("GERARTAXFINEMBNFE", gerartaxfinembnfe);
        this.gerartaxfinembnfe = gerartaxfinembnfe;
   }

   public String getIgcertifsmtpxml() {
        return igcertifsmtpxml;
   }

   public void setIgcertifsmtpxml(String igcertifsmtpxml) {
        markAsChanged("IGCERTIFSMTPXML", igcertifsmtpxml);
        this.igcertifsmtpxml = igcertifsmtpxml;
   }

   public String getInsxmlporimpsmtpxml() {
        return insxmlporimpsmtpxml;
   }

   public void setInsxmlporimpsmtpxml(String insxmlporimpsmtpxml) {
        markAsChanged("INSXMLPORIMPSMTPXML", insxmlporimpsmtpxml);
        this.insxmlporimpsmtpxml = insxmlporimpsmtpxml;
   }

   public BigDecimal getIntconssmtpxml() {
        return intconssmtpxml;
   }

   public void setIntconssmtpxml(BigDecimal intconssmtpxml) {
        markAsChanged("INTCONSSMTPXML", intconssmtpxml);
        this.intconssmtpxml = intconssmtpxml;
   }

   public String getNfestantconsfinal() {
        return nfestantconsfinal;
   }

   public void setNfestantconsfinal(String nfestantconsfinal) {
        markAsChanged("NFESTANTCONSFINAL", nfestantconsfinal);
        this.nfestantconsfinal = nfestantconsfinal;
   }

   public BigDecimal getNotaentajustestcons() {
        return notaentajustestcons;
   }

   public void setNotaentajustestcons(BigDecimal notaentajustestcons) {
        markAsChanged("NOTAENTAJUSTESTCONS", notaentajustestcons);
        this.notaentajustestcons = notaentajustestcons;
   }

   public BigDecimal getNotaentajustestcter() {
        return notaentajustestcter;
   }

   public void setNotaentajustestcter(BigDecimal notaentajustestcter) {
        markAsChanged("NOTAENTAJUSTESTCTER", notaentajustestcter);
        this.notaentajustestcter = notaentajustestcter;
   }

   public BigDecimal getNotaentajustestdter() {
        return notaentajustestdter;
   }

   public void setNotaentajustestdter(BigDecimal notaentajustestdter) {
        markAsChanged("NOTAENTAJUSTESTDTER", notaentajustestdter);
        this.notaentajustestdter = notaentajustestdter;
   }

   public BigDecimal getNotasaiajustbem() {
        return notasaiajustbem;
   }

   public void setNotasaiajustbem(BigDecimal notasaiajustbem) {
        markAsChanged("NOTASAIAJUSTBEM", notasaiajustbem);
        this.notasaiajustbem = notasaiajustbem;
   }

   public BigDecimal getNotasaiajustestcons() {
        return notasaiajustestcons;
   }

   public void setNotasaiajustestcons(BigDecimal notasaiajustestcons) {
        markAsChanged("NOTASAIAJUSTESTCONS", notasaiajustestcons);
        this.notasaiajustestcons = notasaiajustestcons;
   }

   public BigDecimal getNotasaiajustestcter() {
        return notasaiajustestcter;
   }

   public void setNotasaiajustestcter(BigDecimal notasaiajustestcter) {
        markAsChanged("NOTASAIAJUSTESTCTER", notasaiajustestcter);
        this.notasaiajustestcter = notasaiajustestcter;
   }

   public BigDecimal getNotasaiajustestdter() {
        return notasaiajustestdter;
   }

   public void setNotasaiajustestdter(BigDecimal notasaiajustestdter) {
        markAsChanged("NOTASAIAJUSTESTDTER", notasaiajustestdter);
        this.notasaiajustestdter = notasaiajustestdter;
   }

   public String getNumdocr2020() {
        return numdocr2020;
   }

   public void setNumdocr2020(String numdocr2020) {
        markAsChanged("NUMDOCR2020", numdocr2020);
        this.numdocr2020 = numdocr2020;
   }

   public BigDecimal getNunotademfx() {
        return nunotademfx;
   }

   public void setNunotademfx(BigDecimal nunotademfx) {
        markAsChanged("NUNOTADEMFX", nunotademfx);
        this.nunotademfx = nunotademfx;
   }

   public BigDecimal getNunotamodfx() {
        return nunotamodfx;
   }

   public void setNunotamodfx(BigDecimal nunotamodfx) {
        markAsChanged("NUNOTAMODFX", nunotamodfx);
        this.nunotamodfx = nunotamodfx;
   }

   public BigDecimal getNunotatrcfx() {
        return nunotatrcfx;
   }

   public void setNunotatrcfx(BigDecimal nunotatrcfx) {
        markAsChanged("NUNOTATRCFX", nunotatrcfx);
        this.nunotatrcfx = nunotatrcfx;
   }

   public String getOrigprodcomipi() {
        return origprodcomipi;
   }

   public void setOrigprodcomipi(String origprodcomipi) {
        markAsChanged("ORIGPRODCOMIPI", origprodcomipi);
        this.origprodcomipi = origprodcomipi;
   }

   public String getPermoutroususepped() {
        return permoutroususepped;
   }

   public void setPermoutroususepped(String permoutroususepped) {
        markAsChanged("PERMOUTROUSUSEPPED", permoutroususepped);
        this.permoutroususepped = permoutroususepped;
   }

   public BigDecimal getPortasmtpxml() {
        return portasmtpxml;
   }

   public void setPortasmtpxml(BigDecimal portasmtpxml) {
        markAsChanged("PORTASMTPXML", portasmtpxml);
        this.portasmtpxml = portasmtpxml;
   }

   public String getProgaquisalim() {
        return progaquisalim;
   }

   public void setProgaquisalim(String progaquisalim) {
        markAsChanged("PROGAQUISALIM", progaquisalim);
        this.progaquisalim = progaquisalim;
   }

   public Timestamp getProxexecsmtpxml() {
        return proxexecsmtpxml;
   }

   public void setProxexecsmtpxml(Timestamp proxexecsmtpxml) {
        markAsChanged("PROXEXECSMTPXML", proxexecsmtpxml);
        this.proxexecsmtpxml = proxexecsmtpxml;
   }

   public String getQrcodenfceversao2() {
        return qrcodenfceversao2;
   }

   public void setQrcodenfceversao2(String qrcodenfceversao2) {
        markAsChanged("QRCODENFCEVERSAO2", qrcodenfceversao2);
        this.qrcodenfceversao2 = qrcodenfceversao2;
   }

   public String getRedissbcpisconf() {
        return redissbcpisconf;
   }

   public void setRedissbcpisconf(String redissbcpisconf) {
        markAsChanged("REDISSBCPISCONF", redissbcpisconf);
        this.redissbcpisconf = redissbcpisconf;
   }

   public String getRedstcompbcpiscofins() {
        return redstcompbcpiscofins;
   }

   public void setRedstcompbcpiscofins(String redstcompbcpiscofins) {
        markAsChanged("REDSTCOMPBCPISCOFINS", redstcompbcpiscofins);
        this.redstcompbcpiscofins = redstcompbcpiscofins;
   }

   public String getSenhasmtpxml() {
        return senhasmtpxml;
   }

   public void setSenhasmtpxml(String senhasmtpxml) {
        markAsChanged("SENHASMTPXML", senhasmtpxml);
        this.senhasmtpxml = senhasmtpxml;
   }

   public String getServidorsmtpxml() {
        return servidorsmtpxml;
   }

   public void setServidorsmtpxml(String servidorsmtpxml) {
        markAsChanged("SERVIDORSMTPXML", servidorsmtpxml);
        this.servidorsmtpxml = servidorsmtpxml;
   }

   public String getSuprimiremaildest() {
        return suprimiremaildest;
   }

   public void setSuprimiremaildest(String suprimiremaildest) {
        markAsChanged("SUPRIMIREMAILDEST", suprimiremaildest);
        this.suprimiremaildest = suprimiremaildest;
   }

   public String getTipconexsmtpxml() {
        return tipconexsmtpxml;
   }

   public void setTipconexsmtpxml(String tipconexsmtpxml) {
        markAsChanged("TIPCONEXSMTPXML", tipconexsmtpxml);
        this.tipconexsmtpxml = tipconexsmtpxml;
   }

   public String getTipdataevtserv() {
        return tipdataevtserv;
   }

   public void setTipdataevtserv(String tipdataevtserv) {
        markAsChanged("TIPDATAEVTSERV", tipdataevtserv);
        this.tipdataevtserv = tipdataevtserv;
   }

   public String getTipgerinfgveicgreb() {
        return tipgerinfgveicgreb;
   }

   public void setTipgerinfgveicgreb(String tipgerinfgveicgreb) {
        markAsChanged("TIPGERINFGVEICGREB", tipgerinfgveicgreb);
        this.tipgerinfgveicgreb = tipgerinfgveicgreb;
   }

   public String getTipoenvionfce() {
        return tipoenvionfce;
   }

   public void setTipoenvionfce(String tipoenvionfce) {
        markAsChanged("TIPOENVIONFCE", tipoenvionfce);
        this.tipoenvionfce = tipoenvionfce;
   }

   public String getUltnsucte() {
        return ultnsucte;
   }

   public void setUltnsucte(String ultnsucte) {
        markAsChanged("ULTNSUCTE", ultnsucte);
        this.ultnsucte = ultnsucte;
   }

   public String getUsacodbarrasconcatwms() {
        return usacodbarrasconcatwms;
   }

   public void setUsacodbarrasconcatwms(String usacodbarrasconcatwms) {
        markAsChanged("USACODBARRASCONCATWMS", usacodbarrasconcatwms);
        this.usacodbarrasconcatwms = usacodbarrasconcatwms;
   }

   public String getUsanomecomplitem() {
        return usanomecomplitem;
   }

   public void setUsanomecomplitem(String usanomecomplitem) {
        markAsChanged("USANOMECOMPLITEM", usanomecomplitem);
        this.usanomecomplitem = usanomecomplitem;
   }

   public String getUsarecparcial() {
        return usarecparcial;
   }

   public void setUsarecparcial(String usarecparcial) {
        markAsChanged("USARECPARCIAL", usarecparcial);
        this.usarecparcial = usarecparcial;
   }

   public String getUsasttextnotarestst() {
        return usasttextnotarestst;
   }

   public void setUsasttextnotarestst(String usasttextnotarestst) {
        markAsChanged("USASTEXTNOTARESTST", usasttextnotarestst);
        this.usasttextnotarestst = usasttextnotarestst;
   }

   public String getUsuariosmtpxml() {
        return usuariosmtpxml;
   }

   public void setUsuariosmtpxml(String usuariosmtpxml) {
        markAsChanged("USUARIOSMTPXML", usuariosmtpxml);
        this.usuariosmtpxml = usuariosmtpxml;
   }

   public String getUtilizadfetransp() {
        return utilizadfetransp;
   }

   public void setUtilizadfetransp(String utilizadfetransp) {
        markAsChanged("UTILIZADFETRANSP", utilizadfetransp);
        this.utilizadfetransp = utilizadfetransp;
   }

   public String getUtilizaexplotesep() {
        return utilizaexplotesep;
   }

   public void setUtilizaexplotesep(String utilizaexplotesep) {
        markAsChanged("UTILIZAEXPLOTESEP", utilizaexplotesep);
        this.utilizaexplotesep = utilizaexplotesep;
   }

   public String getUtilizaseppulmao() {
        return utilizaseppulmao;
   }

   public void setUtilizaseppulmao(String utilizaseppulmao) {
        markAsChanged("UTILIZASEPPULMAO", utilizaseppulmao);
        this.utilizaseppulmao = utilizaseppulmao;
   }

   public String getUtilizatricrossdocking() {
        return utilizatricrossdocking;
   }

   public void setUtilizatricrossdocking(String utilizatricrossdocking) {
        markAsChanged("UTILIZATRICROSSDOCKING", utilizatricrossdocking);
        this.utilizatricrossdocking = utilizatricrossdocking;
   }

   public BigDecimal getVersaoNt() {
        return versaoNt;
   }

   public void setVersaoNt(BigDecimal versaoNt) {
        markAsChanged("VERSAONT", versaoNt);
        this.versaoNt = versaoNt;
   }

   public BigDecimal getVersaoNtCte() {
        return versaoNtCte;
   }

   public void setVersaoNtCte(BigDecimal versaoNtCte) {
        markAsChanged("VERSAONTCTE", versaoNtCte);
        this.versaoNtCte = versaoNtCte;
   }

   public BigDecimal getVersaoNtMdfe() {
        return versaoNtMdfe;
   }

   public void setVersaoNtMdfe(BigDecimal versaoNtMdfe) {
        markAsChanged("VERSAONTMDFE", versaoNtMdfe);
        this.versaoNtMdfe = versaoNtMdfe;
   }

   public String getWmsArmTotalCol() {
        return wmsArmTotalCol;
   }

   public void setWmsArmTotalCol(String wmsArmTotalCol) {
        markAsChanged("WMSARMTOTALCOL", wmsArmTotalCol);
        this.wmsArmTotalCol = wmsArmTotalCol;
   }

   public String getWmsInfoPesoDetVol() {
        return wmsInfoPesoDetVol;
   }

   public void setWmsInfoPesoDetVol(String wmsInfoPesoDetVol) {
        markAsChanged("WMSINFOPESODETVOL", wmsInfoPesoDetVol);
        this.wmsInfoPesoDetVol = wmsInfoPesoDetVol;
   }

   public String getWmsMultiUsuConf() {
        return wmsMultiUsuConf;
   }

   public void setWmsMultiUsuConf(String wmsMultiUsuConf) {
        markAsChanged("WMSMULTIUSUCONF", wmsMultiUsuConf);
        this.wmsMultiUsuConf = wmsMultiUsuConf;
   }

   public String getWmsUsaImpFechaVol() {
        return wmsUsaImpFechaVol;
   }

   public void setWmsUsaImpFechaVol(String wmsUsaImpFechaVol) {
        markAsChanged("WMSUSAIMPFECHAVOL", wmsUsaImpFechaVol);
        this.wmsUsaImpFechaVol = wmsUsaImpFechaVol;
   }

   public String getWmsUsaRegVolRec() {
        return wmsUsaRegVolRec;
   }

   public void setWmsUsaRegVolRec(String wmsUsaRegVolRec) {
        markAsChanged("WMSUSAREGVOLREC", wmsUsaRegVolRec);
        this.wmsUsaRegVolRec = wmsUsaRegVolRec;
   }

   public String getAedFe() {
        return aedFe;
   }

   public void setAedFe(String aedFe) {
        markAsChanged("AEDFE", aedFe);
        this.aedFe = aedFe;
   }

   public String getAtualCbEnefFat() {
        return atualCbEnefFat;
   }

   public void setAtualCbEnefFat(String atualCbEnefFat) {
        markAsChanged("ATUALCBENEFFAT", atualCbEnefFat);
        this.atualCbEnefFat = atualCbEnefFat;
   }

   public String getCalcIcmsStNaoCont() {
        return calcIcmsStNaoCont;
   }

   public void setCalcIcmsStNaoCont(String calcIcmsStNaoCont) {
        markAsChanged("CALCICMSSTNAOCONT", calcIcmsStNaoCont);
        this.calcIcmsStNaoCont = calcIcmsStNaoCont;
   }

   public BigDecimal getCodTabCkc() {
        return codTabCkc;
   }

   public void setCodTabCkc(BigDecimal codTabCkc) {
        markAsChanged("CODTABCKC", codTabCkc);
        this.codTabCkc = codTabCkc;
   }

   public String getReabCompleto() {
        return reabCompleto;
   }

   public void setReabCompleto(String reabCompleto) {
        markAsChanged("REABCOMPLETO", reabCompleto);
        this.reabCompleto = reabCompleto;
   }

   public BigDecimal getAliqCfBonif() {
        return aliqCfBonif;
   }

   public void setAliqCfBonif(BigDecimal aliqCfBonif) {
        markAsChanged("ALIQCFBONIF", aliqCfBonif);
        this.aliqCfBonif = aliqCfBonif;
   }

   public BigDecimal getAliqPisBonif() {
        return aliqPisBonif;
   }

   public void setAliqPisBonif(BigDecimal aliqPisBonif) {
        markAsChanged("ALIQPISBONIF", aliqPisBonif);
        this.aliqPisBonif = aliqPisBonif;
   }

   public BigDecimal getCodCtaCtbBonif() {
        return codCtaCtbBonif;
   }

   public void setCodCtaCtbBonif(BigDecimal codCtaCtbBonif) {
        markAsChanged("CODCTACTBBONIF", codCtaCtbBonif);
        this.codCtaCtbBonif = codCtaCtbBonif;
   }

   public String getCodStPisCfBonif() {
        return codStPisCfBonif;
   }

   public void setCodStPisCfBonif(String codStPisCfBonif) {
        markAsChanged("CODSTPISCFBONIF", codStPisCfBonif);
        this.codStPisCfBonif = codStPisCfBonif;
   }

   public String getMdfeDocSemIsProp() {
        return mdfeDocSemIsProp;
   }

   public void setMdfeDocSemIsProp(String mdfeDocSemIsProp) {
        markAsChanged("MDFEDOCSEMISPROPRIA", mdfeDocSemIsProp);
        this.mdfeDocSemIsProp = mdfeDocSemIsProp;
   }

   public BigDecimal getNuRfeCartaCorrCte() {
        return nuRfeCartaCorrCte;
   }

   public void setNuRfeCartaCorrCte(BigDecimal nuRfeCartaCorrCte) {
        markAsChanged("NURFECARTACORRCTE", nuRfeCartaCorrCte);
        this.nuRfeCartaCorrCte = nuRfeCartaCorrCte;
   }

   public String getTribPisCfBonif() {
        return tribPisCfBonif;
   }

   public void setTribPisCfBonif(String tribPisCfBonif) {
        markAsChanged("TRIBPISCFBONIF", tribPisCfBonif);
        this.tribPisCfBonif = tribPisCfBonif;
   }

   public String getGerLivIcmsEmpSn() {
        return gerLivIcmsEmpSn;
   }

   public void setGerLivIcmsEmpSn(String gerLivIcmsEmpSn) {
        markAsChanged("GERLIVICMSEMPSN", gerLivIcmsEmpSn);
        this.gerLivIcmsEmpSn = gerLivIcmsEmpSn;
   }

   public BigDecimal getCodForDifAliq() {
        return codForDifAliq;
   }

   public void setCodForDifAliq(BigDecimal codForDifAliq) {
        markAsChanged("CODFORDIFALIQ", codForDifAliq);
        this.codForDifAliq = codForDifAliq;
   }

   public String getDefCstIpi00() {
        return defCstIpi00;
   }

   public void setDefCstIpi00(String defCstIpi00) {
        markAsChanged("DEFCSTIPI00", defCstIpi00);
        this.defCstIpi00 = defCstIpi00;
   }

   public String getDefCstIpi01() {
        return defCstIpi01;
   }

   public void setDefCstIpi01(String defCstIpi01) {
        markAsChanged("DEFCSTIPI01", defCstIpi01);
        this.defCstIpi01 = defCstIpi01;
   }

   public String getDefCstIpi02() {
        return defCstIpi02;
   }

   public void setDefCstIpi02(String defCstIpi02) {
        markAsChanged("DEFCSTIPI02", defCstIpi02);
        this.defCstIpi02 = defCstIpi02;
   }

   public String getDefCstIpi03() {
        return defCstIpi03;
   }

   public void setDefCstIpi03(String defCstIpi03) {
        markAsChanged("DEFCSTIPI03", defCstIpi03);
        this.defCstIpi03 = defCstIpi03;
   }

   public String getDefCstIpi04() {
        return defCstIpi04;
   }

   public void setDefCstIpi04(String defCstIpi04) {
        markAsChanged("DEFCSTIPI04", defCstIpi04);
        this.defCstIpi04 = defCstIpi04;
   }

   public String getDefCstIpi05() {
        return defCstIpi05;
   }

   public void setDefCstIpi05(String defCstIpi05) {
        markAsChanged("DEFCSTIPI05", defCstIpi05);
        this.defCstIpi05 = defCstIpi05;
   }

   public String getDefCstIpi49() {
        return defCstIpi49;
   }

   public void setDefCstIpi49(String defCstIpi49) {
        markAsChanged("DEFCSTIPI49", defCstIpi49);
        this.defCstIpi49 = defCstIpi49;
   }

   public String getDefCstIpi50() {
        return defCstIpi50;
   }

   public void setDefCstIpi50(String defCstIpi50) {
        markAsChanged("DEFCSTIPI50", defCstIpi50);
        this.defCstIpi50 = defCstIpi50;
   }

   public String getDefCstIpi51() {
        return defCstIpi51;
   }

   public void setDefCstIpi51(String defCstIpi51) {
        markAsChanged("DEFCSTIPI51", defCstIpi51);
        this.defCstIpi51 = defCstIpi51;
   }

   public String getDefCstIpi52() {
        return defCstIpi52;
   }

   public void setDefCstIpi52(String defCstIpi52) {
        markAsChanged("DEFCSTIPI52", defCstIpi52);
        this.defCstIpi52 = defCstIpi52;
   }

   public String getDefCstIpi53() {
        return defCstIpi53;
   }

   public void setDefCstIpi53(String defCstIpi53) {
        markAsChanged("DEFCSTIPI53", defCstIpi53);
        this.defCstIpi53 = defCstIpi53;
   }

   public String getDefCstIpi54() {
        return defCstIpi54;
   }

   public void setDefCstIpi54(String defCstIpi54) {
        markAsChanged("DEFCSTIPI54", defCstIpi54);
        this.defCstIpi54 = defCstIpi54;
   }

   public String getDefCstIpi55() {
        return defCstIpi55;
   }

   public void setDefCstIpi55(String defCstIpi55) {
        markAsChanged("DEFCSTIPI55", defCstIpi55);
        this.defCstIpi55 = defCstIpi55;
   }

   public String getDefCstIpi99() {
        return defCstIpi99;
   }

   public void setDefCstIpi99(String defCstIpi99) {
        markAsChanged("DEFCSTIPI99", defCstIpi99);
        this.defCstIpi99 = defCstIpi99;
   }

   public String getIpiTributDefEmp() {
        return ipiTributDefEmp;
   }

   public void setIpiTributDefEmp(String ipiTributDefEmp) {
        markAsChanged("IPITRIBUTDEFEMP", ipiTributDefEmp);
        this.ipiTributDefEmp = ipiTributDefEmp;
   }

   public String getEscritCompraEmissProp() {
        return escritCompraEmissProp;
   }

   public void setEscritCompraEmissProp(String escritCompraEmissProp) {
        markAsChanged("ESCRITCOMPRAEMISSPROP", escritCompraEmissProp);
        this.escritCompraEmissProp = escritCompraEmissProp;
   }

   public String getGerNotaEntCanc() {
        return gerNotaEntCanc;
   }

   public void setGerNotaEntCanc(String gerNotaEntCanc) {
        markAsChanged("GERNOTAENTCANC", gerNotaEntCanc);
        this.gerNotaEntCanc = gerNotaEntCanc;
   }

   public String getMetCalcDifIcms() {
        return metCalcDifIcms;
   }

   public void setMetCalcDifIcms(String metCalcDifIcms) {
        markAsChanged("METCALCDIFICMS", metCalcDifIcms);
        this.metCalcDifIcms = metCalcDifIcms;
   }

   public BigDecimal getPesMaxSepaGru() {
        return pesMaxSepaGru;
   }

   public void setPesMaxSepaGru(BigDecimal pesMaxSepaGru) {
        markAsChanged("PESMAXSEPAGRU", pesMaxSepaGru);
        this.pesMaxSepaGru = pesMaxSepaGru;
   }

   public String getUsaSepaGruProd() {
        return usaSepaGruProd;
   }

   public void setUsaSepaGruProd(String usaSepaGruProd) {
        markAsChanged("USASEPAGRUPROD", usaSepaGruProd);
        this.usaSepaGruProd = usaSepaGruProd;
   }

   public BigDecimal getQtPedSepaGr() {
        return qtPedSepaGr;
   }

   public void setQtPedSepaGr(BigDecimal qtPedSepaGr) {
        markAsChanged("QTPEDSEPAGR", qtPedSepaGr);
        this.qtPedSepaGr = qtPedSepaGr;
   }

   public BigDecimal getQtCheckSep() {
        return qtCheckSep;
   }

   public void setQtCheckSep(BigDecimal qtCheckSep) {
        markAsChanged("QTCHECKSEP", qtCheckSep);
        this.qtCheckSep = qtCheckSep;
   }

   public BigDecimal getVolCheckSepRod() {
        return volCheckSepRod;
   }

   public void setVolCheckSepRod(BigDecimal volCheckSepRod) {
        markAsChanged("VOLCHECKSEPROD", volCheckSepRod);
        this.volCheckSepRod = volCheckSepRod;
   }

   public String getConsRepIcmsBasePisCof() {
        return consRepIcmsBasePisCof;
   }

   public void setConsRepIcmsBasePisCof(String consRepIcmsBasePisCof) {
        markAsChanged("CONSREPICMSBASEPISCOF", consRepIcmsBasePisCof);
        this.consRepIcmsBasePisCof = consRepIcmsBasePisCof;
   }

   public BigDecimal getAliqPisDesc() {
        return aliqPisDesc;
   }

   public void setAliqPisDesc(BigDecimal aliqPisDesc) {
        markAsChanged("ALIQPISDESC", aliqPisDesc);
        this.aliqPisDesc = aliqPisDesc;
   }

   public BigDecimal getAliqCfJuros() {
        return aliqCfJuros;
   }

   public void setAliqCfJuros(BigDecimal aliqCfJuros) {
        markAsChanged("ALIQCFJUROS", aliqCfJuros);
        this.aliqCfJuros = aliqCfJuros;
   }

   public BigDecimal getLocalPadEConect() {
        return localPadEConect;
   }

   public void setLocalPadEConect(BigDecimal localPadEConect) {
        markAsChanged("LOCALPADECONECT", localPadEConect);
        this.localPadEConect = localPadEConect;
   }

   public BigDecimal getAliqCfDesc() {
        return aliqCfDesc;
   }

   public void setAliqCfDesc(BigDecimal aliqCfDesc) {
        markAsChanged("ALIQCFDESC", aliqCfDesc);
        this.aliqCfDesc = aliqCfDesc;
   }

   public String getJobMdEndDigital() {
        return jobMdEndDigital;
   }

   public void setJobMdEndDigital(String jobMdEndDigital) {
        markAsChanged("JOBMDENDDIGITAL", jobMdEndDigital);
        this.jobMdEndDigital = jobMdEndDigital;
   }

   public String getCodStPisCfDesc() {
        return codStPisCfDesc;
   }

   public void setCodStPisCfDesc(String codStPisCfDesc) {
        markAsChanged("CODSTPISCFDESC", codStPisCfDesc);
        this.codStPisCfDesc = codStPisCfDesc;
   }

   public String getCodStPisCfJuros() {
        return codStPisCfJuros;
   }

   public void setCodStPisCfJuros(String codStPisCfJuros) {
        markAsChanged("CODSTPISCFJUROS", codStPisCfJuros);
        this.codStPisCfJuros = codStPisCfJuros;
   }

   public BigDecimal getAliqPisJuros() {
        return aliqPisJuros;
   }

   public void setAliqPisJuros(BigDecimal aliqPisJuros) {
        markAsChanged("ALIQPISJUROS", aliqPisJuros);
        this.aliqPisJuros = aliqPisJuros;
   }

   public String getTribPisCfDesc() {
        return tribPisCfDesc;
   }

   public void setTribPisCfDesc(String tribPisCfDesc) {
        markAsChanged("TRIBPISCFDESC", tribPisCfDesc);
        this.tribPisCfDesc = tribPisCfDesc;
   }

   public String getTribPisCfJuros() {
        return tribPisCfJuros;
   }

   public void setTribPisCfJuros(String tribPisCfJuros) {
        markAsChanged("TRIBPISCFJUROS", tribPisCfJuros);
        this.tribPisCfJuros = tribPisCfJuros;
   }

   public BigDecimal getAliqPisMult() {
        return aliqPisMult;
   }

   public void setAliqPisMult(BigDecimal aliqPisMult) {
        markAsChanged("ALIQPISMULT", aliqPisMult);
        this.aliqPisMult = aliqPisMult;
   }

   public BigDecimal getAliqCfMult() {
        return aliqCfMult;
   }

   public void setAliqCfMult(BigDecimal aliqCfMult) {
        markAsChanged("ALIQCFMULT", aliqCfMult);
        this.aliqCfMult = aliqCfMult;
   }

   public String getCodStPisCfMult() {
        return codStPisCfMult;
   }

   public void setCodStPisCfMult(String codStPisCfMult) {
        markAsChanged("CODSTPISCFMULT", codStPisCfMult);
        this.codStPisCfMult = codStPisCfMult;
   }

   public String getTribPisCfMult() {
        return tribPisCfMult;
   }

   public void setTribPisCfMult(String tribPisCfMult) {
        markAsChanged("TRIBPISCFMULT", tribPisCfMult);
        this.tribPisCfMult = tribPisCfMult;
   }

   public String getCertificadoPix() {
        return certificadoPix;
   }

   public void setCertificadoPix(String certificadoPix) {
        markAsChanged("CERTIFICADOPIX", certificadoPix);
        this.certificadoPix = certificadoPix;
   }

   public String getImpCteEmisProp() {
        return impCteEmisProp;
   }

   public void setImpCteEmisProp(String impCteEmisProp) {
        markAsChanged("IMPCTEEMISPROP", impCteEmisProp);
        this.impCteEmisProp = impCteEmisProp;
   }

   public BigDecimal getCodEndRetExp() {
        return codEndRetExp;
   }

   public void setCodEndRetExp(BigDecimal codEndRetExp) {
        markAsChanged("CODENDRETEXP", codEndRetExp);
        this.codEndRetExp = codEndRetExp;
   }

   public String getRedIcmsBcPisConfins() {
        return redIcmsBcPisConfins;
   }

   public void setRedIcmsBcPisConfins(String redIcmsBcPisConfins) {
        markAsChanged("REDICMSBCPISCONFINS", redIcmsBcPisConfins);
        this.redIcmsBcPisConfins = redIcmsBcPisConfins;
   }

   public String getUltNsu() {
        return ultNsu;
   }

   public void setUltNsu(String ultNsu) {
        markAsChanged("ULTNSU", ultNsu);
        this.ultNsu = ultNsu;
   }

   public String getUsaInfoAdConfPed() {
        return usaInfoAdConfPed;
   }

   public void setUsaInfoAdConfPed(String usaInfoAdConfPed) {
        markAsChanged("USAINFOADCONFPED", usaInfoAdConfPed);
        this.usaInfoAdConfPed = usaInfoAdConfPed;
   }

   public BigDecimal getNfSeObsIterPs() {
        return nfSeObsIterPs;
   }

   public void setNfSeObsIterPs(BigDecimal nfSeObsIterPs) {
        markAsChanged("NFSEOBSITERPS", nfSeObsIterPs);
        this.nfSeObsIterPs = nfSeObsIterPs;
   }

   public BigDecimal getQtdCarNfSeObsIterPs() {
        return qtdCarNfSeObsIterPs;
   }

   public void setQtdCarNfSeObsIterPs(BigDecimal qtdCarNfSeObsIterPs) {
        markAsChanged("QTDCARNFSEOBSITERPS", qtdCarNfSeObsIterPs);
        this.qtdCarNfSeObsIterPs = qtdCarNfSeObsIterPs;
   }

   public String getCaepf() {
        return caepf;
   }

   public void setCaepf(String caepf) {
        markAsChanged("CAEPF", caepf);
        this.caepf = caepf;
   }

   public String getCafir() {
        return cafir;
   }

   public void setCafir(String cafir) {
        markAsChanged("CAFIR", cafir);
        this.cafir = cafir;
   }

   public String getGerAlcdPr() {
        return gerAlcdPr;
   }

   public void setGerAlcdPr(String gerAlcdPr) {
        markAsChanged("GERALCDPR", gerAlcdPr);
        this.gerAlcdPr = gerAlcdPr;
   }

   public String getTipoExploracao() {
        return tipoExploracao;
   }

   public void setTipoExploracao(String tipoExploracao) {
        markAsChanged("TIPOEXPLORACAO", tipoExploracao);
        this.tipoExploracao = tipoExploracao;
   }

   public String getBaixaFinPreEmissNfce() {
        return baixaFinPreEmissNfce;
   }

   public void setBaixaFinPreEmissNfce(String baixaFinPreEmissNfce) {
        markAsChanged("BAIXAFINPREEMISSNFCE", baixaFinPreEmissNfce);
        this.baixaFinPreEmissNfce = baixaFinPreEmissNfce;
   }

   public String getIcmsNormalDifIcmsSn() {
        return icmsNormalDifIcmsSn;
   }

   public void setIcmsNormalDifIcmsSn(String icmsNormalDifIcmsSn) {
        markAsChanged("ICMSNORMALDIFICMSSN", icmsNormalDifIcmsSn);
        this.icmsNormalDifIcmsSn = icmsNormalDifIcmsSn;
   }

   public String getDirFcpfResp() {
        return dirFcpfResp;
   }

   public void setDirFcpfResp(String dirFcpfResp) {
        markAsChanged("DIRFCPFRESP", dirFcpfResp);
        this.dirFcpfResp = dirFcpfResp;
   }

   public String getDirFDepDecJud() {
        return dirFDepDecJud;
   }

   public void setDirFDepDecJud(String dirFDepDecJud) {
        markAsChanged("DIRFDEPDECJUD", dirFDepDecJud);
        this.dirFDepDecJud = dirFDepDecJud;
   }

   public String getDirFDepFunInv() {
        return dirFDepFunInv;
   }

   public void setDirFDepFunInv(String dirFDepFunInv) {
        markAsChanged("DIRFDEPFUNINV", dirFDepFunInv);
        this.dirFDepFunInv = dirFDepFunInv;
   }

   public Timestamp getDirFdhEvento() {
        return dirFdhEvento;
   }

   public void setDirFdhEvento(Timestamp dirFdhEvento) {
        markAsChanged("DIRFDHEVENTO", dirFdhEvento);
        this.dirFdhEvento = dirFdhEvento;
   }

   public String getDirFEntImune() {
        return dirFEntImune;
   }

   public void setDirFEntImune(String dirFEntImune) {
        markAsChanged("DIRFENTIMUNE", dirFEntImune);
        this.dirFEntImune = dirFEntImune;
   }

   public String getDirFNatDecl() {
        return dirFNatDecl;
   }

   public void setDirFNatDecl(String dirFNatDecl) {
        markAsChanged("DIRFNATDECL", dirFNatDecl);
        this.dirFNatDecl = dirFNatDecl;
   }

   public String getDirFPgExt() {
        return dirFPgExt;
   }

   public void setDirFPgExt(String dirFPgExt) {
        markAsChanged("DIRFPGEXT", dirFPgExt);
        this.dirFPgExt = dirFPgExt;
   }

   public String getDirFPgFundPub() {
        return dirFPgFundPub;
   }

   public void setDirFPgFundPub(String dirFPgFundPub) {
        markAsChanged("DIRFPGFUNDPUB", dirFPgFundPub);
        this.dirFPgFundPub = dirFPgFundPub;
   }

   public String getDirFPlPriAss() {
        return dirFPlPriAss;
   }

   public void setDirFPlPriAss(String dirFPlPriAss) {
        markAsChanged("DIRFPLPRIASS", dirFPlPriAss);
        this.dirFPlPriAss = dirFPlPriAss;
   }

   public String getDirFSitEsp() {
        return dirFSitEsp;
   }

   public void setDirFSitEsp(String dirFSitEsp) {
        markAsChanged("DIRFSITESP", dirFSitEsp);
        this.dirFSitEsp = dirFSitEsp;
   }

   public String getDirFSocost() {
        return dirFSocost;
   }

   public void setDirFSocost(String dirFSocost) {
        markAsChanged("DIRFSOCOST", dirFSocost);
        this.dirFSocost = dirFSocost;
   }

   public String getTempRemicaoEstadual() {
        return tempRemicaoEstadual;
   }

   public void setTempRemicaoEstadual(String tempRemicaoEstadual) {
        markAsChanged("TEMPREMIACAOESTADUAL", tempRemicaoEstadual);
        this.tempRemicaoEstadual = tempRemicaoEstadual;
   }

   public BigDecimal getCodClassifEstab() {
        return codClassifEstab;
   }

   public void setCodClassifEstab(BigDecimal codClassifEstab) {
        markAsChanged("CODCLASSIFESTAB", codClassifEstab);
        this.codClassifEstab = codClassifEstab;
   }

   public String getRedPisBcPisCofins() {
        return redPisBcPisCofins;
   }

   public void setRedPisBcPisCofins(String redPisBcPisCofins) {
        markAsChanged("REDPISBCPISCOFINS", redPisBcPisCofins);
        this.redPisBcPisCofins = redPisBcPisCofins;
   }

   public BigDecimal getNuRfeProducao() {
        return nuRfeProducao;
   }

   public void setNuRfeProducao(BigDecimal nuRfeProducao) {
        markAsChanged("NURFEPRODUCAO", nuRfeProducao);
        this.nuRfeProducao = nuRfeProducao;
   }

   public String getImpressoraEtqSep() {
        return impressoraEtqSep;
   }

   public void setImpressoraEtqSep(String impressoraEtqSep) {
        markAsChanged("IMPRESSORAETQSEP", impressoraEtqSep);
        this.impressoraEtqSep = impressoraEtqSep;
   }

   public String getFiltroAliqIcmsSql() {
        return filtroAliqIcmsSql;
   }

   public void setFiltroAliqIcmsSql(String filtroAliqIcmsSql) {
        markAsChanged("FILTROALIQICMSSQL", filtroAliqIcmsSql);
        this.filtroAliqIcmsSql = filtroAliqIcmsSql;
   }

   public String getClasConsAgua() {
        return clasConsAgua;
   }

   public void setClasConsAgua(String clasConsAgua) {
        markAsChanged("CLASCONS_AGUA", clasConsAgua);
        this.clasConsAgua = clasConsAgua;
   }

   public String getClasConsEnerg() {
        return clasConsEnerg;
   }

   public void setClasConsEnerg(String clasConsEnerg) {
        markAsChanged("CLASCONS_ENERG", clasConsEnerg);
        this.clasConsEnerg = clasConsEnerg;
   }

   public String getClasConsGas() {
        return clasConsGas;
   }

   public void setClasConsGas(String clasConsGas) {
        markAsChanged("CLASCONS_GAS", clasConsGas);
        this.clasConsGas = clasConsGas;
   }

   public String getIdentEct() {
        return identEct;
   }

   public void setIdentEct(String identEct) {
        markAsChanged("IDENTECT", identEct);
        this.identEct = identEct;
   }

   public String getWmsDocASepBalcao() {
        return wmsDocASepBalcao;
   }

   public void setWmsDocASepBalcao(String wmsDocASepBalcao) {
        markAsChanged("WMSDOCASEPBALCAO", wmsDocASepBalcao);
        this.wmsDocASepBalcao = wmsDocASepBalcao;
   }

   public String getEfdh010() {
        return efdh010;
   }

   public void setEfdh010(String efdh010) {
        markAsChanged("EFDH010", efdh010);
        this.efdh010 = efdh010;
   }

   public String getEfdh010PrTer() {
        return efdh010PrTer;
   }

   public void setEfdh010PrTer(String efdh010PrTer) {
        markAsChanged("EFDH010_PRTER", efdh010PrTer);
        this.efdh010PrTer = efdh010PrTer;
   }

   public String getEfdh010Ter() {
        return efdh010Ter;
   }

   public void setEfdh010Ter(String efdh010Ter) {
        markAsChanged("EFDH010_TER", efdh010Ter);
        this.efdh010Ter = efdh010Ter;
   }

   public String getUtilizaExplote() {
        return utilizaExplote;
   }

   public void setUtilizaExplote(String utilizaExplote) {
        markAsChanged("UTILIZAEXPLOTE", utilizaExplote);
        this.utilizaExplote = utilizaExplote;
   }

   public BigDecimal getCodRelMinutaOdp() {
        return codRelMinutaOdp;
   }

   public void setCodRelMinutaOdp(BigDecimal codRelMinutaOdp) {
        markAsChanged("CODRELMINUTAODP", codRelMinutaOdp);
        this.codRelMinutaOdp = codRelMinutaOdp;
   }

   public String getSenhaEct() {
        return senhaEct;
   }

   public void setSenhaEct(String senhaEct) {
        markAsChanged("SENHAECT", senhaEct);
        this.senhaEct = senhaEct;
   }

   public Timestamp getDtRefPreProdFictReinf() {
        return dtRefPreProdFictReinf;
   }

   public void setDtRefPreProdFictReinf(Timestamp dtRefPreProdFictReinf) {
        markAsChanged("DTREFPREPRODFICTREINF", dtRefPreProdFictReinf);
        this.dtRefPreProdFictReinf = dtRefPreProdFictReinf;
   }

   public Timestamp getDtRefPreProdReaisReinf() {
        return dtRefPreProdReaisReinf;
   }

   public void setDtRefPreProdReaisReinf(Timestamp dtRefPreProdReaisReinf) {
        markAsChanged("DTREFPREPRODREAISREINF", dtRefPreProdReaisReinf);
        this.dtRefPreProdReaisReinf = dtRefPreProdReaisReinf;
   }

   public Timestamp getDtRefProdReinf() {
        return dtRefProdReinf;
   }

   public void setDtRefProdReinf(Timestamp dtRefProdReinf) {
        markAsChanged("DTREFPRODREINF", dtRefProdReinf);
        this.dtRefProdReinf = dtRefProdReinf;
   }

   public Timestamp getDtValFinReinf() {
        return dtValFinReinf;
   }

   public void setDtValFinReinf(Timestamp dtValFinReinf) {
        markAsChanged("DTVALFINREINF", dtValFinReinf);
        this.dtValFinReinf = dtValFinReinf;
   }

   public Timestamp getDtValIniReinf() {
        return dtValIniReinf;
   }

   public void setDtValIniReinf(Timestamp dtValIniReinf) {
        markAsChanged("DTVALINIREINF", dtValIniReinf);
        this.dtValIniReinf = dtValIniReinf;
   }

   public String getEmpAdmPubDir() {
        return empAdmPubDir;
   }

   public void setEmpAdmPubDir(String empAdmPubDir) {
        markAsChanged("EMPADMPUBDIR", empAdmPubDir);
        this.empAdmPubDir = empAdmPubDir;
   }

   public String getEntregaEcd() {
        return entregaEcd;
   }

   public void setEntregaEcd(String entregaEcd) {
        markAsChanged("ENTREGAECD", entregaEcd);
        this.entregaEcd = entregaEcd;
   }

   public String getIdentEctRastreio() {
        return identEctRastreio;
   }

   public void setIdentEctRastreio(String identEctRastreio) {
        markAsChanged("IDENTECTRASTREIO", identEctRastreio);
        this.identEctRastreio = identEctRastreio;
   }

   public String getImpNfeEmissProp() {
        return impNfeEmissProp;
   }

   public void setImpNfeEmissProp(String impNfeEmissProp) {
        markAsChanged("IMPNFEEMISSPROP", impNfeEmissProp);
        this.impNfeEmissProp = impNfeEmissProp;
   }

   public String getPartCanalVerde() {
        return partCanalVerde;
   }

   public void setPartCanalVerde(String partCanalVerde) {
        markAsChanged("PARTCANALVERDE", partCanalVerde);
        this.partCanalVerde = partCanalVerde;
   }

   public BigDecimal getAmbienteReinf() {
        return ambienteReinf;
   }

   public void setAmbienteReinf(BigDecimal ambienteReinf) {
        markAsChanged("AMBIENTEREINF", ambienteReinf);
        this.ambienteReinf = ambienteReinf;
   }

   public String getCamConvPref() {
        return camConvPref;
   }

   public void setCamConvPref(String camConvPref) {
        markAsChanged("CAMCONVPREF", camConvPref);
        this.camConvPref = camConvPref;
   }

   public String getCnpjEfrVinc() {
        return cnpjEfrVinc;
   }

   public void setCnpjEfrVinc(String cnpjEfrVinc) {
        markAsChanged("CNPJEFRVINC", cnpjEfrVinc);
        this.cnpjEfrVinc = cnpjEfrVinc;
   }

   public String getDesonerafolhaCprb() {
        return desonerafolhaCprb;
   }

   public void setDesonerafolhaCprb(String desonerafolhaCprb) {
        markAsChanged("DESONERAFOLHACPRB", desonerafolhaCprb);
        this.desonerafolhaCprb = desonerafolhaCprb;
   }

   public BigDecimal getRespEntReinf() {
        return respEntReinf;
   }

   public void setRespEntReinf(BigDecimal respEntReinf) {
        markAsChanged("RESPENTREINF", respEntReinf);
        this.respEntReinf = respEntReinf;
   }

   public String getSenhaEctRastreio() {
        return senhaEctRastreio;
   }

   public void setSenhaEctRastreio(String senhaEctRastreio) {
        markAsChanged("SENHAECTRASTREIO", senhaEctRastreio);
        this.senhaEctRastreio = senhaEctRastreio;
   }

   public BigDecimal getSitEmpReinf() {
        return sitEmpReinf;
   }

   public void setSitEmpReinf(BigDecimal sitEmpReinf) {
        markAsChanged("SITEMPREINF", sitEmpReinf);
        this.sitEmpReinf = sitEmpReinf;
   }

   public String getTipCtActbEfd() {
        return tipCtActbEfd;
   }

   public void setTipCtActbEfd(String tipCtActbEfd) {
        markAsChanged("TIPCTACTBEFD", tipCtActbEfd);
        this.tipCtActbEfd = tipCtActbEfd;
   }

   public BigDecimal getTopCorBanEconect() {
        return topCorBanEconect;
   }

   public void setTopCorBanEconect(BigDecimal topCorBanEconect) {
        markAsChanged("TOPCORBANECONECT", topCorBanEconect);
        this.topCorBanEconect = topCorBanEconect;
   }

   public BigDecimal getTribReinf() {
        return tribReinf;
   }

   public void setTribReinf(BigDecimal tribReinf) {
        markAsChanged("TRIBREINF", tribReinf);
        this.tribReinf = tribReinf;
   }

   public BigDecimal getVersaoCte() {
        return versaoCte;
   }

   public void setVersaoCte(BigDecimal versaoCte) {
        markAsChanged("VERSAOCTE", versaoCte);
        this.versaoCte = versaoCte;
   }

   public String getVinculoEfr() {
        return vinculoEfr;
   }

   public void setVinculoEfr(String vinculoEfr) {
        markAsChanged("VINCULOEFR", vinculoEfr);
        this.vinculoEfr = vinculoEfr;
   }

   public BigDecimal getNroMaxProd() {
        return nroMaxProd;
   }

   public void setNroMaxProd(BigDecimal nroMaxProd) {
        markAsChanged("NROMAXPROD", nroMaxProd);
        this.nroMaxProd = nroMaxProd;
   }

   public BigDecimal getTpoEmpresa() {
        return tpoEmpresa;
   }

   public void setTpoEmpresa(BigDecimal tpoEmpresa) {
        markAsChanged("TPOEMPRESA", tpoEmpresa);
        this.tpoEmpresa = tpoEmpresa;
   }

   public BigDecimal getVersaoMdfe() {
        return versaoMdfe;
   }

   public void setVersaoMdfe(BigDecimal versaoMdfe) {
        markAsChanged("VERSAOMDFE", versaoMdfe);
        this.versaoMdfe = versaoMdfe;
   }

   public String getTranspCarga() {
        return transpCarga;
   }

   public void setTranspCarga(String transpCarga) {
        markAsChanged("TRANSPCARGA", transpCarga);
        this.transpCarga = transpCarga;
   }

   public String getUsaDtValLotNfe() {
        return usaDtValLotNfe;
   }

   public void setUsaDtValLotNfe(String usaDtValLotNfe) {
        markAsChanged("USADTVALLOTNFE", usaDtValLotNfe);
        this.usaDtValLotNfe = usaDtValLotNfe;
   }

   public String getUsaDtFabLotNfe() {
        return usaDtFabLotNfe;
   }

   public void setUsaDtFabLotNfe(String usaDtFabLotNfe) {
        markAsChanged("USADTFABLOTNFE", usaDtFabLotNfe);
        this.usaDtFabLotNfe = usaDtFabLotNfe;
   }

   public BigDecimal getModEtqVol() {
        return modEtqVol;
   }

   public void setModEtqVol(BigDecimal modEtqVol) {
        markAsChanged("MODETQVOL", modEtqVol);
        this.modEtqVol = modEtqVol;
   }

   public String getIgPermCompProds() {
        return igPermCompProds;
   }

   public void setIgPermCompProds(String igPermCompProds) {
        markAsChanged("IGPERMCOMPPRODS", igPermCompProds);
        this.igPermCompProds = igPermCompProds;
   }

   public String getImpressoraEtqVol() {
        return impressoraEtqVol;
   }

   public void setImpressoraEtqVol(String impressoraEtqVol) {
        markAsChanged("IMPRESSORAETQVOL", impressoraEtqVol);
        this.impressoraEtqVol = impressoraEtqVol;
   }

   public String getChaveAcessoNfse() {
        return chaveAcessoNfse;
   }

   public void setChaveAcessoNfse(String chaveAcessoNfse) {
        markAsChanged("CHAVEACESSONFSE", chaveAcessoNfse);
        this.chaveAcessoNfse = chaveAcessoNfse;
   }

   public BigDecimal getCodLojaEconect() {
        return codLojaEconect;
   }

   public void setCodLojaEconect(BigDecimal codLojaEconect) {
        markAsChanged("CODLOJAECONECT", codLojaEconect);
        this.codLojaEconect = codLojaEconect;
   }

   public BigDecimal getTopRecargaCelEconect() {
        return topRecargaCelEconect;
   }

   public void setTopRecargaCelEconect(BigDecimal topRecargaCelEconect) {
        markAsChanged("TOPRECARGACELECONECT", topRecargaCelEconect);
        this.topRecargaCelEconect = topRecargaCelEconect;
   }

   public BigDecimal getTopNfceEconect() {
        return topNfceEconect;
   }

   public void setTopNfceEconect(BigDecimal topNfceEconect) {
        markAsChanged("TOPNFCEECONECT", topNfceEconect);
        this.topNfceEconect = topNfceEconect;
   }

   public BigDecimal getTopSatEconect() {
        return topSatEconect;
   }

   public void setTopSatEconect(BigDecimal topSatEconect) {
        markAsChanged("TOPSATECONECT", topSatEconect);
        this.topSatEconect = topSatEconect;
   }

   public BigDecimal getWmsCodEndFlut() {
        return wmsCodEndFlut;
   }

   public void setWmsCodEndFlut(BigDecimal wmsCodEndFlut) {
        markAsChanged("WMSCODENDFLUT", wmsCodEndFlut);
        this.wmsCodEndFlut = wmsCodEndFlut;
   }

   public String getUsaTrocoCheckout() {
        return usaTrocoCheckout;
   }

   public void setUsaTrocoCheckout(String usaTrocoCheckout) {
        markAsChanged("USATROCOCHECKOUT", usaTrocoCheckout);
        this.usaTrocoCheckout = usaTrocoCheckout;
   }

   public BigDecimal getCodEmpOrigMovFin() {
        return codEmpOrigMovFin;
   }

   public void setCodEmpOrigMovFin(BigDecimal codEmpOrigMovFin) {
        markAsChanged("CODEMPORIGMOVFIN", codEmpOrigMovFin);
        this.codEmpOrigMovFin = codEmpOrigMovFin;
   }

   public String getCalcVencGnreApu() {
        return calcVencGnreApu;
   }

   public void setCalcVencGnreApu(String calcVencGnreApu) {
        markAsChanged("CALCVENCGNREAPU", calcVencGnreApu);
        this.calcVencGnreApu = calcVencGnreApu;
   }

   public String getGerObsIpiRegEnt() {
        return gerObsIpiRegEnt;
   }

   public void setGerObsIpiRegEnt(String gerObsIpiRegEnt) {
        markAsChanged("GEROBSIPIREGENT", gerObsIpiRegEnt);
        this.gerObsIpiRegEnt = gerObsIpiRegEnt;
   }

   public String getGerCteCredPisCof() {
        return gerCteCredPisCof;
   }

   public void setGerCteCredPisCof(String gerCteCredPisCof) {
        markAsChanged("GERCTECREDPISCOF", gerCteCredPisCof);
        this.gerCteCredPisCof = gerCteCredPisCof;
   }

   public String getGer0220UndForn() {
        return ger0220UndForn;
   }

   public void setGer0220UndForn(String ger0220UndForn) {
        markAsChanged("GER0220UNDFORN", ger0220UndForn);
        this.ger0220UndForn = ger0220UndForn;
   }

   public String getGerChaveRefSig() {
        return gerChaveRefSig;
   }

   public void setGerChaveRefSig(String gerChaveRefSig) {
        markAsChanged("GERCHAVEREFSIG", gerChaveRefSig);
        this.gerChaveRefSig = gerChaveRefSig;
   }

   public String getProibDigConfEnt() {
        return proibDigConfEnt;
   }

   public void setProibDigConfEnt(String proibDigConfEnt) {
        markAsChanged("PROIBDIGCONFENT", proibDigConfEnt);
        this.proibDigConfEnt = proibDigConfEnt;
   }

   public BigDecimal getQtdConfEntWms() {
        return qtdConfEntWms;
   }

   public void setQtdConfEntWms(BigDecimal qtdConfEntWms) {
        markAsChanged("QTDCONFENTWMS", qtdConfEntWms);
        this.qtdConfEntWms = qtdConfEntWms;
   }

   public String getEmpCentralMovFin() {
        return empCentralMovFin;
   }

   public void setEmpCentralMovFin(String empCentralMovFin) {
        markAsChanged("EMPCENTRALMOVFIN", empCentralMovFin);
        this.empCentralMovFin = empCentralMovFin;
   }

   public BigDecimal getCodModEmailNfe() {
        return codModEmailNfe;
   }

   public void setCodModEmailNfe(BigDecimal codModEmailNfe) {
        markAsChanged("CODMODEMAILNFE", codModEmailNfe);
        this.codModEmailNfe = codModEmailNfe;
   }

   public BigDecimal getCodModDanfeSimplifNfe() {
        return codModDanfeSimplifNfe;
   }

   public void setCodModDanfeSimplifNfe(BigDecimal codModDanfeSimplifNfe) {
        markAsChanged("CODMODDANFESIMPLIFNFE", codModDanfeSimplifNfe);
        this.codModDanfeSimplifNfe = codModDanfeSimplifNfe;
   }

   public String getGerCiapCompEfd() {
        return gerCiapCompEfd;
   }

   public void setGerCiapCompEfd(String gerCiapCompEfd) {
        markAsChanged("GERCIAPCOMPEFD", gerCiapCompEfd);
        this.gerCiapCompEfd = gerCiapCompEfd;
   }

   public BigDecimal getModEmailLibLim() {
        return modEmailLibLim;
   }

   public void setModEmailLibLim(BigDecimal modEmailLibLim) {
        markAsChanged("MODEMAILLIBLIM", modEmailLibLim);
        this.modEmailLibLim = modEmailLibLim;
   }

   public String getTokenNfse() {
        return tokenNfse;
   }

   public void setTokenNfse(String tokenNfse) {
        markAsChanged("TOKENNFSE", tokenNfse);
        this.tokenNfse = tokenNfse;
   }

   public BigDecimal getEfdCodBco() {
        return efdCodBco;
   }

   public void setEfdCodBco(BigDecimal efdCodBco) {
        markAsChanged("EFDCODBCO", efdCodBco);
        this.efdCodBco = efdCodBco;
   }

   public BigDecimal getEfdCodCenCus() {
        return efdCodCenCus;
   }

   public void setEfdCodCenCus(BigDecimal efdCodCenCus) {
        markAsChanged("EFDCODCENCUS", efdCodCenCus);
        this.efdCodCenCus = efdCodCenCus;
   }

   public BigDecimal getEfdCodCtaBcoInt() {
        return efdCodCtaBcoInt;
   }

   public void setEfdCodCtaBcoInt(BigDecimal efdCodCtaBcoInt) {
        markAsChanged("EFDCODCTABCOINT", efdCodCtaBcoInt);
        this.efdCodCtaBcoInt = efdCodCtaBcoInt;
   }

   public BigDecimal getEfdCodNatDespRecIcms() {
        return efdCodNatDespRecIcms;
   }

   public void setEfdCodNatDespRecIcms(BigDecimal efdCodNatDespRecIcms) {
        markAsChanged("EFDCODNATDESPRECICMS", efdCodNatDespRecIcms);
        this.efdCodNatDespRecIcms = efdCodNatDespRecIcms;
   }

   public BigDecimal getEfdCodTipoPer() {
        return efdCodTipoPer;
   }

   public void setEfdCodTipoPer(BigDecimal efdCodTipoPer) {
        markAsChanged("EFDCODTIPOPER", efdCodTipoPer);
        this.efdCodTipoPer = efdCodTipoPer;
   }

   public BigDecimal getEfdCodTipTit() {
        return efdCodTipTit;
   }

   public void setEfdCodTipTit(BigDecimal efdCodTipTit) {
        markAsChanged("EFDCODTIPTIT", efdCodTipTit);
        this.efdCodTipTit = efdCodTipTit;
   }

   public BigDecimal getEfdDiaVenc() {
        return efdDiaVenc;
   }

   public void setEfdDiaVenc(BigDecimal efdDiaVenc) {
        markAsChanged("EFDDIAVENC", efdDiaVenc);
        this.efdDiaVenc = efdDiaVenc;
   }

   public String getEfdTipoReenchNota() {
        return efdTipoReenchNota;
   }

   public void setEfdTipoReenchNota(String efdTipoReenchNota) {
        markAsChanged("EFDTIPREENCHNOTA", efdTipoReenchNota);
        this.efdTipoReenchNota = efdTipoReenchNota;
   }

   public String getIntFinObricmsStRec() {
        return intFinObricmsStRec;
   }

   public void setIntFinObricmsStRec(String intFinObricmsStRec) {
        markAsChanged("INTFINOBRICMSSTREC", intFinObricmsStRec);
        this.intFinObricmsStRec = intFinObricmsStRec;
   }

   public String getWmsRastSerMed() {
        return wmsRastSerMed;
   }

   public void setWmsRastSerMed(String wmsRastSerMed) {
        markAsChanged("WMSRASTSERMED", wmsRastSerMed);
        this.wmsRastSerMed = wmsRastSerMed;
   }

   public String getCodRespRetC180() {
        return codRespRetC180;
   }

   public void setCodRespRetC180(String codRespRetC180) {
        markAsChanged("CODRESPRETC180", codRespRetC180);
        this.codRespRetC180 = codRespRetC180;
   }

   public String getVlrBaseStC180() {
        return vlrBaseStC180;
   }

   public void setVlrBaseStC180(String vlrBaseStC180) {
        markAsChanged("VLRBASESTC180", vlrBaseStC180);
        this.vlrBaseStC180 = vlrBaseStC180;
   }

   public String getVlrStC180() {
        return vlrStC180;
   }

   public void setVlrStC180(String vlrStC180) {
        markAsChanged("VLRSTC180", vlrStC180);
        this.vlrStC180 = vlrStC180;
   }

   public BigDecimal getTopSangSupri() {
        return topSangSupri;
   }

   public void setTopSangSupri(BigDecimal topSangSupri) {
        markAsChanged("TOPSANGSUPRI", topSangSupri);
        this.topSangSupri = topSangSupri;
   }

   public String getUsaVlrMedTransfEmp() {
        return usaVlrMedTransfEmp;
   }

   public void setUsaVlrMedTransfEmp(String usaVlrMedTransfEmp) {
        markAsChanged("USAVLRMEDTRANSFEMP", usaVlrMedTransfEmp);
        this.usaVlrMedTransfEmp = usaVlrMedTransfEmp;
   }

   public BigDecimal getTopDespesa() {
        return topDespesa;
   }

   public void setTopDespesa(BigDecimal topDespesa) {
        markAsChanged("TOPDESPESA", topDespesa);
        this.topDespesa = topDespesa;
   }

   public String getUsaIndPresTopFat() {
        return usaIndPresTopFat;
   }

   public void setUsaIndPresTopFat(String usaIndPresTopFat) {
        markAsChanged("USAINDPRESTOPFAT", usaIndPresTopFat);
        this.usaIndPresTopFat = usaIndPresTopFat;
   }

   public String getTipoImpKitFox() {
        return tipoImpKitFox;
   }

   public void setTipoImpKitFox(String tipoImpKitFox) {
        markAsChanged("TIPOIMPKITFOX", tipoImpKitFox);
        this.tipoImpKitFox = tipoImpKitFox;
   }

   public String getApiKeyPixCheckout() {
        return apiKeyPixCheckout;
   }

   public void setApiKeyPixCheckout(String apiKeyPixCheckout) {
        markAsChanged("APIKEYPIXCHECKOUT", apiKeyPixCheckout);
        this.apiKeyPixCheckout = apiKeyPixCheckout;
   }

   public BigDecimal getBancoPixCheckout() {
        return bancoPixCheckout;
   }

   public void setBancoPixCheckout(BigDecimal bancoPixCheckout) {
        markAsChanged("BANCOPIXCHECKOUT", bancoPixCheckout);
        this.bancoPixCheckout = bancoPixCheckout;
   }

   public String getClientIdPixCheckout() {
        return clientIdPixCheckout;
   }

   public void setClientIdPixCheckout(String clientIdPixCheckout) {
        markAsChanged("CLIENTIDPIXCHECKOUT", clientIdPixCheckout);
        this.clientIdPixCheckout = clientIdPixCheckout;
   }

   public String getClientSecretPixCheckout() {
        return clientSecretPixCheckout;
   }

   public void setClientSecretPixCheckout(String clientSecretPixCheckout) {
        markAsChanged("CLIENTSECRETPIXCHECKOUT", clientSecretPixCheckout);
        this.clientSecretPixCheckout = clientSecretPixCheckout;
   }

   public String getCstNRedIcmsBcPisCof() {
        return cstNRedIcmsBcPisCof;
   }

   public void setCstNRedIcmsBcPisCof(String cstNRedIcmsBcPisCof) {
        markAsChanged("CSTNREDICMSBCPISCOF", cstNRedIcmsBcPisCof);
        this.cstNRedIcmsBcPisCof = cstNRedIcmsBcPisCof;
   }

   public String getConsDevNfeReinf() {
        return consDevNfeReinf;
   }

   public void setConsDevNfeReinf(String consDevNfeReinf) {
        markAsChanged("CONSDEVNFEREINF", consDevNfeReinf);
        this.consDevNfeReinf = consDevNfeReinf;
   }

   public String getAmbienteGnre() {
        return ambienteGnre;
   }

   public void setAmbienteGnre(String ambienteGnre) {
        markAsChanged("AMBIENTEGNRE", ambienteGnre);
        this.ambienteGnre = ambienteGnre;
   }

   public BigDecimal getCodEmpMatrizGnre() {
        return codEmpMatrizGnre;
   }

   public void setCodEmpMatrizGnre(BigDecimal codEmpMatrizGnre) {
        markAsChanged("CODEMPMATRIZGNRE", codEmpMatrizGnre);
        this.codEmpMatrizGnre = codEmpMatrizGnre;
   }

   public String getVersaoGnre() {
        return versaoGnre;
   }

   public void setVersaoGnre(String versaoGnre) {
        markAsChanged("VERSAOGNRE", versaoGnre);
        this.versaoGnre = versaoGnre;
   }

   public BigDecimal getCodEmpGrupoFrete() {
        return codEmpGrupoFrete;
   }

   public void setCodEmpGrupoFrete(BigDecimal codEmpGrupoFrete) {
        markAsChanged("CODEMPGRUPFRETE", codEmpGrupoFrete);
        this.codEmpGrupoFrete = codEmpGrupoFrete;
   }

   public String getCalcFetHab() {
        return calcFetHab;
   }

   public void setCalcFetHab(String calcFetHab) {
        markAsChanged("CALCFETHAB", calcFetHab);
        this.calcFetHab = calcFetHab;
   }

   public String getMsgInfAdicFetHab() {
        return msgInfAdicFetHab;
   }

   public void setMsgInfAdicFetHab(String msgInfAdicFetHab) {
        markAsChanged("MSGINFADICFETHAB", msgInfAdicFetHab);
        this.msgInfAdicFetHab = msgInfAdicFetHab;
   }

   public BigDecimal getAliqFuntTel() {
        return aliqFuntTel;
   }

   public void setAliqFuntTel(BigDecimal aliqFuntTel) {
        markAsChanged("ALIQFUNTTEL", aliqFuntTel);
        this.aliqFuntTel = aliqFuntTel;
   }

   public BigDecimal getAliqFust() {
        return aliqFust;
   }

   public void setAliqFust(BigDecimal aliqFust) {
        markAsChanged("ALIQFUST", aliqFust);
        this.aliqFust = aliqFust;
   }

   public String getFisTel() {
        return fisTel;
   }

   public void setFisTel(String fisTel) {
        markAsChanged("FISTEL", fisTel);
        this.fisTel = fisTel;
   }

   public String getVlrIcmsOpAnt() {
        return vlrIcmsOpAnt;
   }

   public void setVlrIcmsOpAnt(String vlrIcmsOpAnt) {
        markAsChanged("VLRICMSOPANT", vlrIcmsOpAnt);
        this.vlrIcmsOpAnt = vlrIcmsOpAnt;
   }

   public String getVlrStFcpOpAnt() {
        return vlrStFcpOpAnt;
   }

   public void setVlrStFcpOpAnt(String vlrStFcpOpAnt) {
        markAsChanged("VLRSTFCPOPANT", vlrStFcpOpAnt);
        this.vlrStFcpOpAnt = vlrStFcpOpAnt;
   }

   public String getVlrStOpAnt() {
        return vlrStOpAnt;
   }

   public void setVlrStOpAnt(String vlrStOpAnt) {
        markAsChanged("VLRSTOPANT", vlrStOpAnt);
        this.vlrStOpAnt = vlrStOpAnt;
   }

   public String getVlrUnitIcmsOp() {
        return vlrUnitIcmsOp;
   }

   public void setVlrUnitIcmsOp(String vlrUnitIcmsOp) {
        markAsChanged("VLRUNITICMSOP", vlrUnitIcmsOp);
        this.vlrUnitIcmsOp = vlrUnitIcmsOp;
   }

   public String getIniBereabMaxPicking() {
        return iniBereabMaxPicking;
   }

   public void setIniBereabMaxPicking(String iniBereabMaxPicking) {
        markAsChanged("INIBEREABMAXPICKING", iniBereabMaxPicking);
        this.iniBereabMaxPicking = iniBereabMaxPicking;
   }

   public String getTratSobFinConf() {
        return tratSobFinConf;
   }

   public void setTratSobFinConf(String tratSobFinConf) {
        markAsChanged("TRATSOBFINCONF", tratSobFinConf);
        this.tratSobFinConf = tratSobFinConf;
   }

   public BigDecimal getConEstOrigProd() {
        return conEstOrigProd;
   }

   public void setConEstOrigProd(BigDecimal conEstOrigProd) {
        markAsChanged("CONESTORIGPROD", conEstOrigProd);
        this.conEstOrigProd = conEstOrigProd;
   }

   public String getVlrUnitMerc() {
        return vlrUnitMerc;
   }

   public void setVlrUnitMerc(String vlrUnitMerc) {
        markAsChanged("VLRUNITMERC", vlrUnitMerc);
        this.vlrUnitMerc = vlrUnitMerc;
   }

   public String getRedDifAlBcPisCof() {
        return redDifAlBcPisCof;
   }

   public void setRedDifAlBcPisCof(String redDifAlBcPisCof) {
        markAsChanged("REDDIFALBCPISCOF", redDifAlBcPisCof);
        this.redDifAlBcPisCof = redDifAlBcPisCof;
   }

   public String getEntAutTarMapa() {
        return entAutTarMapa;
   }

   public void setEntAutTarMapa(String entAutTarMapa) {
        markAsChanged("ENTAUTTARMAPA", entAutTarMapa);
        this.entAutTarMapa = entAutTarMapa;
   }

   public BigDecimal getPriorCodNat() {
        return priorCodNat;
   }

   public void setPriorCodNat(BigDecimal priorCodNat) {
        markAsChanged("PRIORCODNAT", priorCodNat);
        this.priorCodNat = priorCodNat;
   }

   public String getEnvRespContCte() {
        return envRespContCte;
   }

   public void setEnvRespContCte(String envRespContCte) {
        markAsChanged("ENVRESPCONTCTE", envRespContCte);
        this.envRespContCte = envRespContCte;
   }

   public String getConsDevTerevTr2050() {
        return consDevTerevTr2050;
   }

   public void setConsDevTerevTr2050(String consDevTerevTr2050) {
        markAsChanged("CONSDEVTEREVTR2050", consDevTerevTr2050);
        this.consDevTerevTr2050 = consDevTerevTr2050;
   }

   public String getEnvInutNotaExc() {
        return envInutNotaExc;
   }

   public void setEnvInutNotaExc(String envInutNotaExc) {
        markAsChanged("ENVINUTNOTAEXC", envInutNotaExc);
        this.envInutNotaExc = envInutNotaExc;
   }

   public String getJusInutNotaExc() {
        return jusInutNotaExc;
   }

   public void setJusInutNotaExc(String jusInutNotaExc) {
        markAsChanged("JUSINUTNOTAEXC", jusInutNotaExc);
        this.jusInutNotaExc = jusInutNotaExc;
   }

   public String getWmsDocArep() {
        return wmsDocArep;
   }

   public void setWmsDocArep(String wmsDocArep) {
        markAsChanged("WMSDOCAREP", wmsDocArep);
        this.wmsDocArep = wmsDocArep;
   }

   public String getDeduzFcpBcPisCofins() {
        return deduzFcpBcPisCofins;
   }

   public void setDeduzFcpBcPisCofins(String deduzFcpBcPisCofins) {
        markAsChanged("DEDUZFCPBCPISCOFINS", deduzFcpBcPisCofins);
        this.deduzFcpBcPisCofins = deduzFcpBcPisCofins;
   }

   public String getSepPulParcial() {
        return sepPulParcial;
   }

   public void setSepPulParcial(String sepPulParcial) {
        markAsChanged("SEPPULPARCIAL", sepPulParcial);
        this.sepPulParcial = sepPulParcial;
   }

   public String getObtStAntMedEnt() {
        return obtStAntMedEnt;
   }

   public void setObtStAntMedEnt(String obtStAntMedEnt) {
        markAsChanged("OBTSTANTMEDENT", obtStAntMedEnt);
        this.obtStAntMedEnt = obtStAntMedEnt;
   }

   public String getCalcIcmsAt() {
        return calcIcmsAt;
   }

   public void setCalcIcmsAt(String calcIcmsAt) {
        markAsChanged("CALCICMSAT", calcIcmsAt);
        this.calcIcmsAt = calcIcmsAt;
   }

   public String getProibEscCheckoutPed() {
        return proibEscCheckoutPed;
   }

   public void setProibEscCheckoutPed(String proibEscCheckoutPed) {
        markAsChanged("PROIBESCCHECKOUTPED", proibEscCheckoutPed);
        this.proibEscCheckoutPed = proibEscCheckoutPed;
   }

   public String getNfeCanExtCanMes() {
        return nfeCanExtCanMes;
   }

   public void setNfeCanExtCanMes(String nfeCanExtCanMes) {
        markAsChanged("NFECANEXTCANMES", nfeCanExtCanMes);
        this.nfeCanExtCanMes = nfeCanExtCanMes;
   }

   public String getEnvMdfSinc() {
        return envMdfSinc;
   }

   public void setEnvMdfSinc(String envMdfSinc) {
        markAsChanged("ENVMDFSINC", envMdfSinc);
        this.envMdfSinc = envMdfSinc;
   }

   public String getWmsPersEpProdAp() {
        return wmsPersEpProdAp;
   }

   public void setWmsPersEpProdAp(String wmsPersEpProdAp) {
        markAsChanged("WMSPERSEPPRODAP", wmsPersEpProdAp);
        this.wmsPersEpProdAp = wmsPersEpProdAp;
   }

   public String getConsidQtCarDesc() {
        return considQtCarDesc;
   }

   public void setConsidQtCarDesc(String considQtCarDesc) {
        markAsChanged("CONSIDQTCARCDESC", considQtCarDesc);
        this.considQtCarDesc = considQtCarDesc;
   }

   public String getEnvLeiTranspDesc() {
        return envLeiTranspDesc;
   }

   public void setEnvLeiTranspDesc(String envLeiTranspDesc) {
        markAsChanged("ENVLEITRANSPDESC", envLeiTranspDesc);
        this.envLeiTranspDesc = envLeiTranspDesc;
   }

   public String getEnvLeiTranspTotObs() {
        return envLeiTranspTotObs;
   }

   public void setEnvLeiTranspTotObs(String envLeiTranspTotObs) {
        markAsChanged("ENVLEITRANSPTOTOBS", envLeiTranspTotObs);
        this.envLeiTranspTotObs = envLeiTranspTotObs;
   }

   public String getCgcProcurador() {
        return cgcProcurador;
   }

   public void setCgcProcurador(String cgcProcurador) {
        markAsChanged("CGCPROCURADOR", cgcProcurador);
        this.cgcProcurador = cgcProcurador;
   }

   public String getIniBloqRegConf() {
        return iniBloqRegConf;
   }

   public void setIniBloqRegConf(String iniBloqRegConf) {
        markAsChanged("INIBLOQREGCONF", iniBloqRegConf);
        this.iniBloqRegConf = iniBloqRegConf;
   }

   public String getBlqNfaCompNfcPend() {
        return blqNfaCompNfcPend;
   }

   public void setBlqNfaCompNfcPend(String blqNfaCompNfcPend) {
        markAsChanged("BLQNFACOMPNFCPEND", blqNfaCompNfcPend);
        this.blqNfaCompNfcPend = blqNfaCompNfcPend;
   }

   public String getDifAliqDespAcess() {
        return difAliqDespAcess;
   }

   public void setDifAliqDespAcess(String difAliqDespAcess) {
        markAsChanged("DIFALIQDESPACESS", difAliqDespAcess);
        this.difAliqDespAcess = difAliqDespAcess;
   }

   public String getComplRestituicaoIcmsSt() {
        return complRestituicaoIcmsSt;
   }

   public void setComplRestituicaoIcmsSt(String complRestituicaoIcmsSt) {
        markAsChanged("COMPLRESTITUICAOICMSST", complRestituicaoIcmsSt);
        this.complRestituicaoIcmsSt = complRestituicaoIcmsSt;
   }

   public String getCalcPisCfsFin() {
        return calcPisCfsFin;
   }

   public void setCalcPisCfsFin(String calcPisCfsFin) {
        markAsChanged("CALCPISCFSFIN", calcPisCfsFin);
        this.calcPisCfsFin = calcPisCfsFin;
   }

   public String getIsAliqIntSexC() {
        return isAliqIntSexC;
   }

   public void setIsAliqIntSexC(String isAliqIntSexC) {
        markAsChanged("ISALIQINTSEXC", isAliqIntSexC);
        this.isAliqIntSexC = isAliqIntSexC;
   }

   public BigDecimal getTipIcmsFenValBem() {
        return tipIcmsFenValBem;
   }

   public void setTipIcmsFenValBem(BigDecimal tipIcmsFenValBem) {
        markAsChanged("TIPICMSFENVALBEM", tipIcmsFenValBem);
        this.tipIcmsFenValBem = tipIcmsFenValBem;
   }

   public String getChavePixCheckout() {
        return chavePixCheckout;
   }

   public void setChavePixCheckout(String chavePixCheckout) {
        markAsChanged("CHAVEPIXCHECKOUT", chavePixCheckout);
        this.chavePixCheckout = chavePixCheckout;
   }

   public String getUrlPixCheckout() {
        return urlPixCheckout;
   }

   public void setUrlPixCheckout(String urlPixCheckout) {
        markAsChanged("URLPIXCHECKOUT", urlPixCheckout);
        this.urlPixCheckout = urlPixCheckout;
   }

   public BigDecimal getCalcVlrAquisBem() {
        return calcVlrAquisBem;
   }

   public void setCalcVlrAquisBem(BigDecimal calcVlrAquisBem) {
        markAsChanged("CALCVLRAQUISBEM", calcVlrAquisBem);
        this.calcVlrAquisBem = calcVlrAquisBem;
   }

   public String getIniBelote() {
        return iniBelote;
   }

   public void setIniBelote(String iniBelote) {
        markAsChanged("INIBELOTE", iniBelote);
        this.iniBelote = iniBelote;
   }

   public String getContBaiBemSubImprec() {
        return contBaiBemSubImprec;
   }

   public void setContBaiBemSubImprec(String contBaiBemSubImprec) {
        markAsChanged("CONTBAIBEMSUBIMPREC", contBaiBemSubImprec);
        this.contBaiBemSubImprec = contBaiBemSubImprec;
   }

   public BigDecimal getCodCtaPixTef() {
        return codCtaPixTef;
   }

   public void setCodCtaPixTef(BigDecimal codCtaPixTef) {
        markAsChanged("CODCTAPIXTEF", codCtaPixTef);
        this.codCtaPixTef = codCtaPixTef;
   }

   public String getCredIcmsCombus() {
        return credIcmsCombus;
   }

   public void setCredIcmsCombus(String credIcmsCombus) {
        markAsChanged("CREDICMSCOMBUS", credIcmsCombus);
        this.credIcmsCombus = credIcmsCombus;
   }

   public String getCredIcmsRemg() {
        return credIcmsRemg;
   }

   public void setCredIcmsRemg(String credIcmsRemg) {
        markAsChanged("CREDICMSREMG", credIcmsRemg);
        this.credIcmsRemg = credIcmsRemg;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getDescrNat() {
        return descrNat;
   }

   public void setDescrNat(String descrNat) {
        markAsChanged("DESCRNAT", descrNat);
        this.descrNat = descrNat;
   }

   public String getDesTipIdEvCom() {
        return desTipIdEvCom;
   }

   public void setDesTipIdEvCom(String desTipIdEvCom) {
        markAsChanged("DESTIPIDEVCOM", desTipIdEvCom);
        this.desTipIdEvCom = desTipIdEvCom;
   }

   public BigDecimal getNatCanPix() {
        return natCanPix;
   }

   public void setNatCanPix(BigDecimal natCanPix) {
        markAsChanged("NATCANPIX", natCanPix);
        this.natCanPix = natCanPix;
   }

   public String getRupturaEst() {
        return rupturaEst;
   }

   public void setRupturaEst(String rupturaEst) {
        markAsChanged("RUPTURAEST", rupturaEst);
        this.rupturaEst = rupturaEst;
   }

   public String getSomarFcpBcCiap() {
        return somarFcpBcCiap;
   }

   public void setSomarFcpBcCiap(String somarFcpBcCiap) {
        markAsChanged("SOMARFCPBCCIAP", somarFcpBcCiap);
        this.somarFcpBcCiap = somarFcpBcCiap;
   }

   public String getTipoPix() {
        return tipoPix;
   }

   public void setTipoPix(String tipoPix) {
        markAsChanged("TIPOPIX", tipoPix);
        this.tipoPix = tipoPix;
   }

   public BigDecimal getTopCanPixFin() {
        return topCanPixFin;
   }

   public void setTopCanPixFin(BigDecimal topCanPixFin) {
        markAsChanged("TOPCANPIXFIN", topCanPixFin);
        this.topCanPixFin = topCanPixFin;
   }

   public BigDecimal getTopCanPixPag() {
        return topCanPixPag;
   }

   public void setTopCanPixPag(BigDecimal topCanPixPag) {
        markAsChanged("TOPCANPIXPAG", topCanPixPag);
        this.topCanPixPag = topCanPixPag;
   }

   public BigDecimal getTopCanPixRec() {
        return topCanPixRec;
   }

   public void setTopCanPixRec(BigDecimal topCanPixRec) {
        markAsChanged("TOPCANPIXREC", topCanPixRec);
        this.topCanPixRec = topCanPixRec;
   }

   public String getUsaMedDiaImp() {
        return usaMedDiaImp;
   }

   public void setUsaMedDiaImp(String usaMedDiaImp) {
        markAsChanged("USAMEDDIAIMP", usaMedDiaImp);
        this.usaMedDiaImp = usaMedDiaImp;
   }

   public BigDecimal getCodCenCusIpi() {
        return codCenCusIpi;
   }

   public void setCodCenCusIpi(BigDecimal codCenCusIpi) {
        markAsChanged("CODCENCUSIPI", codCenCusIpi);
        this.codCenCusIpi = codCenCusIpi;
   }

   public BigDecimal getCodCtaBcoIpi() {
        return codCtaBcoIpi;
   }

   public void setCodCtaBcoIpi(BigDecimal codCtaBcoIpi) {
        markAsChanged("CODCTABCOIPI", codCtaBcoIpi);
        this.codCtaBcoIpi = codCtaBcoIpi;
   }

   public BigDecimal getCodEmpImposto() {
        return codEmpImposto;
   }

   public void setCodEmpImposto(BigDecimal codEmpImposto) {
        markAsChanged("CODEMPIMPOSTO", codEmpImposto);
        this.codEmpImposto = codEmpImposto;
   }

   public BigDecimal getCodModRetEstWms() {
        return codModRetEstWms;
   }

   public void setCodModRetEstWms(BigDecimal codModRetEstWms) {
        markAsChanged("CODMODRETESTWMS", codModRetEstWms);
        this.codModRetEstWms = codModRetEstWms;
   }

   public BigDecimal getCodNatIpi() {
        return codNatIpi;
   }

   public void setCodNatIpi(BigDecimal codNatIpi) {
        markAsChanged("CODNATIPI", codNatIpi);
        this.codNatIpi = codNatIpi;
   }

   public BigDecimal getCodParCipi() {
        return codParCipi;
   }

   public void setCodParCipi(BigDecimal codParCipi) {
        markAsChanged("CODPARCIPI", codParCipi);
        this.codParCipi = codParCipi;
   }

   public String getCodReceitaIpi() {
        return codReceitaIpi;
   }

   public void setCodReceitaIpi(String codReceitaIpi) {
        markAsChanged("CODRECEITAIPI", codReceitaIpi);
        this.codReceitaIpi = codReceitaIpi;
   }

   public String getCodReceitaReinf() {
        return codReceitaReinf;
   }

   public void setCodReceitaReinf(String codReceitaReinf) {
        markAsChanged("CODRECEITAREINF", codReceitaReinf);
        this.codReceitaReinf = codReceitaReinf;
   }

   public BigDecimal getCodTipoPerIpi() {
        return codTipoPerIpi;
   }

   public void setCodTipoPerIpi(BigDecimal codTipoPerIpi) {
        markAsChanged("CODTIPOPERIPI", codTipoPerIpi);
        this.codTipoPerIpi = codTipoPerIpi;
   }

   public BigDecimal getCodTipTitIpi() {
        return codTipTitIpi;
   }

   public void setCodTipTitIpi(BigDecimal codTipTitIpi) {
        markAsChanged("CODTIPTITIPI", codTipTitIpi);
        this.codTipTitIpi = codTipTitIpi;
   }

   public String getConsDifParCoutIcms() {
        return consDifParCoutIcms;
   }

   public void setConsDifParCoutIcms(String consDifParCoutIcms) {
        markAsChanged("CONSDIFPARCOUTICMS", consDifParCoutIcms);
        this.consDifParCoutIcms = consDifParCoutIcms;
   }

   public String getCtaCtbAnlRegApur() {
        return ctaCtbAnlRegApur;
   }

   public void setCtaCtbAnlRegApur(String ctaCtbAnlRegApur) {
        markAsChanged("CTACTBANLREGAPUR", ctaCtbAnlRegApur);
        this.ctaCtbAnlRegApur = ctaCtbAnlRegApur;
   }

   public String getDesRestrFcpCst() {
        return desRestrFcpCst;
   }

   public void setDesRestrFcpCst(String desRestrFcpCst) {
        markAsChanged("DESRESTRFCPCST", desRestrFcpCst);
        this.desRestrFcpCst = desRestrFcpCst;
   }

   public String getDesRestrFcpStCst() {
        return desRestrFcpStCst;
   }

   public void setDesRestrFcpStCst(String desRestrFcpStCst) {
        markAsChanged("DESRESTRFCPSTCST", desRestrFcpStCst);
        this.desRestrFcpStCst = desRestrFcpStCst;
   }

   public BigDecimal getDiaVencIpi() {
        return diaVencIpi;
   }

   public void setDiaVencIpi(BigDecimal diaVencIpi) {
        markAsChanged("DIAVENCIPI", diaVencIpi);
        this.diaVencIpi = diaVencIpi;
   }

   public Timestamp getDtObito() {
        return dtObito;
   }

   public void setDtObito(Timestamp dtObito) {
        markAsChanged("DTOBITO", dtObito);
        this.dtObito = dtObito;
   }

   public String getDtOpJuros() {
        return dtOpJuros;
   }

   public void setDtOpJuros(String dtOpJuros) {
        markAsChanged("DTOPJUROS", dtOpJuros);
        this.dtOpJuros = dtOpJuros;
   }

   public String getDtOpMulta() {
        return dtOpMulta;
   }

   public void setDtOpMulta(String dtOpMulta) {
        markAsChanged("DTOPMULTA", dtOpMulta);
        this.dtOpMulta = dtOpMulta;
   }

   public Timestamp getDtRefPreProdReaisReinfG4000() {
        return dtRefPreProdReaisReinfG4000;
   }

   public void setDtRefPreProdReaisReinfG4000(Timestamp dtRefPreProdReaisReinfG4000) {
        markAsChanged("DTREFPREPRODREAISREINFG4000", dtRefPreProdReaisReinfG4000);
        this.dtRefPreProdReaisReinfG4000 = dtRefPreProdReaisReinfG4000;
   }

   public Timestamp getDtRefProdReinfG4000() {
        return dtRefProdReinfG4000;
   }

   public void setDtRefProdReinfG4000(Timestamp dtRefProdReinfG4000) {
        markAsChanged("DTREFPRODREINFG4000", dtRefProdReinfG4000);
        this.dtRefProdReinfG4000 = dtRefProdReinfG4000;
   }

   public Timestamp getDtTransfFinsLucr() {
        return dtTransfFinsLucr;
   }

   public void setDtTransfFinsLucr(Timestamp dtTransfFinsLucr) {
        markAsChanged("DTTRANSFFINSLUCR", dtTransfFinsLucr);
        this.dtTransfFinsLucr = dtTransfFinsLucr;
   }

   public String getEnvInfIssSomDevido() {
        return envInfIssSomDevido;
   }

   public void setEnvInfIssSomDevido(String envInfIssSomDevido) {
        markAsChanged("ENVINFISSSOMDEVIDO", envInfIssSomDevido);
        this.envInfIssSomDevido = envInfIssSomDevido;
   }

   public String getEstrNcredIcmsSt() {
        return estrNcredIcmsSt;
   }

   public void setEstrNcredIcmsSt(String estrNcredIcmsSt) {
        markAsChanged("ESTRNCREDICMSST", estrNcredIcmsSt);
        this.estrNcredIcmsSt = estrNcredIcmsSt;
   }

   public String getGerMultPlacRes() {
        return gerMultPlacRes;
   }

   public void setGerMultPlacRes(String gerMultPlacRes) {
        markAsChanged("GERMULTPLACRES", gerMultPlacRes);
        this.gerMultPlacRes = gerMultPlacRes;
   }

   public BigDecimal getIndTipoLayoutK010() {
        return indTipoLayoutK010;
   }

   public void setIndTipoLayoutK010(BigDecimal indTipoLayoutK010) {
        markAsChanged("INDTIPLAYOUTK010", indTipoLayoutK010);
        this.indTipoLayoutK010 = indTipoLayoutK010;
   }

   public BigDecimal getIndUniao() {
        return indUniao;
   }

   public void setIndUniao(BigDecimal indUniao) {
        markAsChanged("INDUNIAO", indUniao);
        this.indUniao = indUniao;
   }

   public String getIntegrarIpiFin() {
        return integrarIpiFin;
   }

   public void setIntegrarIpiFin(String integrarIpiFin) {
        markAsChanged("INTEGRARIPIFIN", integrarIpiFin);
        this.integrarIpiFin = integrarIpiFin;
   }

   public BigDecimal getModEstCpaWms() {
        return modEstCpaWms;
   }

   public void setModEstCpaWms(BigDecimal modEstCpaWms) {
        markAsChanged("MODESTCPAWMS", modEstCpaWms);
        this.modEstCpaWms = modEstCpaWms;
   }

   public BigDecimal getNotaEntAjusteReclas() {
        return notaEntAjusteReclas;
   }

   public void setNotaEntAjusteReclas(BigDecimal notaEntAjusteReclas) {
        markAsChanged("NOTAENTAJUSTERECLAS", notaEntAjusteReclas);
        this.notaEntAjusteReclas = notaEntAjusteReclas;
   }

   public BigDecimal getNotaSaiAjusteReclas() {
        return notaSaiAjusteReclas;
   }

   public void setNotaSaiAjusteReclas(BigDecimal notaSaiAjusteReclas) {
        markAsChanged("NOTASAIAJUSTERECLAS", notaSaiAjusteReclas);
        this.notaSaiAjusteReclas = notaSaiAjusteReclas;
   }

   public BigDecimal getOrigDescontos() {
        return origDescontos;
   }

   public void setOrigDescontos(BigDecimal origDescontos) {
        markAsChanged("ORIGDESCONTOS", origDescontos);
        this.origDescontos = origDescontos;
   }

   public String getRedStBcPisCofins() {
        return redStBcPisCofins;
   }

   public void setRedStBcPisCofins(String redStBcPisCofins) {
        markAsChanged("REDSTBCPISCOFINS", redStBcPisCofins);
        this.redStBcPisCofins = redStBcPisCofins;
   }

   public String getStInclusA70() {
        return stInclusA70;
   }

   public void setStInclusA70(String stInclusA70) {
        markAsChanged("STINCLUSA70", stInclusA70);
        this.stInclusA70 = stInclusA70;
   }

   public String getTipCtaCtbEfdF() {
        return tipCtaCtbEfdF;
   }

   public void setTipCtaCtbEfdF(String tipCtaCtbEfdF) {
        markAsChanged("TIPCTACTBEFDF", tipCtaCtbEfdF);
        this.tipCtaCtbEfdF = tipCtaCtbEfdF;
   }

   public String getTipDataEvtPag() {
        return tipDataEvtPag;
   }

   public void setTipDataEvtPag(String tipDataEvtPag) {
        markAsChanged("TIPDATAEVTPAG", tipDataEvtPag);
        this.tipDataEvtPag = tipDataEvtPag;
   }

   public String getTipDataEvtPagXir() {
        return tipDataEvtPagXir;
   }

   public void setTipDataEvtPagXir(String tipDataEvtPagXir) {
        markAsChanged("TIPDATAEVTPAGXIR", tipDataEvtPagXir);
        this.tipDataEvtPagXir = tipDataEvtPagXir;
   }

   public String getTokenIbpt() {
        return tokenIbpt;
   }

   public void setTokenIbpt(String tokenIbpt) {
        markAsChanged("TOKENIBPT", tokenIbpt);
        this.tokenIbpt = tokenIbpt;
   }

   public String getUsaCusMedIcmsPro() {
        return usaCusMedIcmsPro;
   }

   public void setUsaCusMedIcmsPro(String usaCusMedIcmsPro) {
        markAsChanged("USACUSMEDICMPRO", usaCusMedIcmsPro);
        this.usaCusMedIcmsPro = usaCusMedIcmsPro;
   }

   public String getUsaCustoMedioMps() {
        return usaCustoMedioMps;
   }

   public void setUsaCustoMedioMps(String usaCustoMedioMps) {
        markAsChanged("USACUSTOMEDIOMPS", usaCustoMedioMps);
        this.usaCustoMedioMps = usaCustoMedioMps;
   }

   public String getDesApCProDepE() {
        return desApCProDepE;
   }

   public void setDesApCProDepE(String desApCProDepE) {
        markAsChanged("DESAPCPRODEPE", desApCProDepE);
        this.desApCProDepE = desApCProDepE;
   }

   public String getRegApurTribSn() {
        return regApurTribSn;
   }

   public void setRegApurTribSn(String regApurTribSn) {
        markAsChanged("REGAPURTRIBSN", regApurTribSn);
        this.regApurTribSn = regApurTribSn;
   }

   public BigDecimal getStatus() {
        return status;
   }

   public void setStatus(BigDecimal status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public String getGeraDeducaoPf() {
        return geraDeducaoPf;
   }

   public void setGeraDeducaoPf(String geraDeducaoPf) {
        markAsChanged("GERADEDUCAOPF", geraDeducaoPf);
        this.geraDeducaoPf = geraDeducaoPf;
   }

   public String getCredIcmsCst60Am() {
        return credIcmsCst60Am;
   }

   public void setCredIcmsCst60Am(String credIcmsCst60Am) {
        markAsChanged("CREDICMSCST60AM", credIcmsCst60Am);
        this.credIcmsCst60Am = credIcmsCst60Am;
   }

   public String getDenuncEspCte() {
        return denuncEspCte;
   }

   public void setDenuncEspCte(String denuncEspCte) {
        markAsChanged("DENUNCESPCTE", denuncEspCte);
        this.denuncEspCte = denuncEspCte;
   }

   public BigDecimal getPrazoRCancCte() {
        return prazoRCancCte;
   }

   public void setPrazoRCancCte(BigDecimal prazoRCancCte) {
        markAsChanged("PRAZORCANCCTE", prazoRCancCte);
        this.prazoRCancCte = prazoRCancCte;
   }

   public BigDecimal getPrazoTCancCte() {
        return prazoTCancCte;
   }

   public void setPrazoTCancCte(BigDecimal prazoTCancCte) {
        markAsChanged("PRAZOTCANCCTE", prazoTCancCte);
        this.prazoTCancCte = prazoTCancCte;
   }

   public String getTerAcpCte() {
        return terAcpCte;
   }

   public void setTerAcpCte(String terAcpCte) {
        markAsChanged("TERACPCTE", terAcpCte);
        this.terAcpCte = terAcpCte;
   }

   public String getAplCalcDifAliqFrt() {
        return aplCalcDifAliqFrt;
   }

   public void setAplCalcDifAliqFrt(String aplCalcDifAliqFrt) {
        markAsChanged("APLCALCDIFALIQFRT", aplCalcDifAliqFrt);
        this.aplCalcDifAliqFrt = aplCalcDifAliqFrt;
   }

   @Override
   public String getTableName() {
        return "TGFEMP";
   }

   @Override
   public String getEntityName() {
        return "EmpresaFinanceiro";
   }

   @Override
   public EmpresaFinanceiro fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
        this.gerNotaEnt = vo.asString("GERNOTAENT");
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
        this.codTipOperaComp = vo.asBigDecimal("CODTIPOPERACOMP");
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
        this.consEntrPendWms = vo.asString("CONSENTRPENDWMS");
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
        this.percProj = vo.asString("PERPROJ");
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
        this.ufCrContador = vo.asString("UFCRCCONTADOR");
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
        this.icmsScttd = vo.asString("ICMSSCTTD");
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
        this.calcPercPis = vo.asBigDecimal("CALPERCPIS");
        this.codCenCus = vo.asBigDecimal("CODCENCUS");
        this.codCenCusDesp = vo.asBigDecimal("CODCENCUSDESP");
        this.codCtabCoIpad = vo.asBigDecimal("CODCTABCOIPAD");
        this.codCtActb1 = vo.asBigDecimal("CODCTACTB_1");
        this.codCtActb2 = vo.asBigDecimal("CODCTACTB_2");
        this.codCtActb3 = vo.asBigDecimal("CODCTACTB_3");
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
        this.tpObsFinG4000 = vo.asBigDecimal("TPOBSFING4000");
        this.tpObsNotaG4000 = vo.asBigDecimal("TPOBSNOTAG4000");
        this.gerObsFinG4000 = vo.asString("GEROBSFING4000");
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
        this.codenqipisai = vo.asBigDecimal("CODENQIPISAI");
        this.topsaidadifpesowms = vo.asBigDecimal("TOPSAIDADIFPESOWMS");
        this.codtabalt = vo.asBigDecimal("CODTABALT");
        this.codsmtp = vo.asBigDecimal("CODSMTP");
        this.topentdifpesowms = vo.asBigDecimal("TOPENTDIFPESOWMS");
        this.codtipparc = vo.asBigDecimal("CODTIPPARC");
        this.coragendado = vo.asBigDecimal("CORAGENDADO");
        this.coratendido = vo.asBigDecimal("CORATENDIDO");
        this.corbloqueado = vo.asBigDecimal("CORBLOQUEADO");
        this.corencaixado = vo.asBigDecimal("CORENCAIXADO");
        this.corfaturado = vo.asBigDecimal("CORFATURADO");
        this.corfixado = vo.asBigDecimal("CORFIXADO");
        this.horafinal = vo.asBigDecimal("HORAFINAL");
        this.horainicial = vo.asBigDecimal("HORAINICIAL");
        this.intervalo = vo.asBigDecimal("INTERVALO");
        this.notamodelodagenda = vo.asBigDecimal("NOTAMODELODAGENDA");
        this.qtdlimitemes = vo.asBigDecimal("QTDLIMITEMES");
        this.validacpfcnpj = vo.asString("VALIDACPFCNPJ");
        this.wmsusaeqipal = vo.asString("WMSUSAETIQPAL");
        this.gerobsnotag4000 = vo.asString("GEROBSNOTAG4000");
        this.margsegpcp = vo.asBigDecimal("MARGSEGPCP");
        this.seqtokennfce = vo.asBigDecimal("SEQTOKENNFCE");
        this.tokennfce = vo.asString("TOKENNFCE");
        this.tpambmdfe = vo.asString("TPAMBMDFE");
        this.vlrliqitemnfce = vo.asString("VLRLIQITEMNFCE");
        this.chavedigitalagiliblue = vo.asString("CHAVEDIGITALAGILIBLUE");
        this.codusunfse = vo.asString("CODUSUNFSE");
        this.codcontrinfse = vo.asString("CODCONTRINFSE");
        this.temdenuespont = vo.asString("TEMDENUESPONT");
        this.prztolcannota = vo.asBigDecimal("PRZTOLCANNOTA");
        this.przregcannota = vo.asBigDecimal("PRZREGCANNOTA");
        this.sernatribbaseiss = vo.asString("SERNAOTRIBBASEISS");
        this.codendarmindef = vo.asBigDecimal("CODENDARMINDEF");
        this.copiasdacte = vo.asBigDecimal("COPIASDACTE");
        this.tpambcte = vo.asString("TPAMBCTE");
        this.codmoddacte = vo.asBigDecimal("CODMODDACTE");
        this.tipoenviocte = vo.asString("TIPOENVIOCTE");
        this.contingenciacte = vo.asString("CONTINGENCIACTE");
        this.tipodacte = vo.asString("TIPODACTE");
        this.jobkeyndd = vo.asString("JOBKEYNDD");
        this.conectornfse = vo.asString("CONECTORNFSE");
        this.codctactbdesc = vo.asBigDecimal("CODCTACTBDESC");
        this.codctactbjuros = vo.asBigDecimal("CODCTACTBJUROS");
        this.codctactbmult = vo.asBigDecimal("CODCTACTBMULT");
        this.codendcrossdock = vo.asBigDecimal("CODENDCROSSDOCK");
        this.codtrib90creddeb = vo.asString("CODTRIB90CREDDEB");
        this.conicmsmajfcpint = vo.asString("CONICMSMAJFCPINT");
        this.consdevevtr2050 = vo.asString("CONSDEVEVTR2050");
        this.considbenef = vo.asString("CONSIDBENEF");
        this.contingencianfce = vo.asString("CONTINGENCIANFCE");
        this.copiasdanfce = vo.asBigDecimal("COPIASDANFCE");
        this.descredifciap = vo.asString("DESCREDDIFCIAP");
        this.difaliqfcpint = vo.asString("DIFALIQFCPINT");
        this.emailnotfecreinf = vo.asString("EMAILNOTFECREINF");
        this.envemailconf = vo.asString("ENVEMAILCONF");
        this.enviosincronocte = vo.asString("ENVIOSINCRONOCTE");
        this.enviosincrononfce = vo.asString("ENVIOSINCRONONFCE");
        this.enviosincrononfe = vo.asString("ENVIOSINCRONONFE");
        this.gerarretencao = vo.asBigDecimal("GERARRETENCAO");
        this.gerartaxfinembnfe = vo.asString("GERARTAXFINEMBNFE");
        this.igcertifsmtpxml = vo.asString("IGCERTIFSMTPXML");
        this.insxmlporimpsmtpxml = vo.asString("INSXMLPORIMPSMTPXML");
        this.intconssmtpxml = vo.asBigDecimal("INTCONSSMTPXML");
        this.nfestantconsfinal = vo.asString("NFESTANTCONSFINAL");
        this.notaentajustestcons = vo.asBigDecimal("NOTAENTAJUSTESTCONS");
        this.notaentajustestcter = vo.asBigDecimal("NOTAENTAJUSTESTCTER");
        this.notaentajustestdter = vo.asBigDecimal("NOTAENTAJUSTESTDTER");
        this.notasaiajustbem = vo.asBigDecimal("NOTASAIAJUSTBEM");
        this.notasaiajustestcons = vo.asBigDecimal("NOTASAIAJUSTESTCONS");
        this.notasaiajustestcter = vo.asBigDecimal("NOTASAIAJUSTESTCTER");
        this.notasaiajustestdter = vo.asBigDecimal("NOTASAIAJUSTESTDTER");
        this.numdocr2020 = vo.asString("NUMDOCR2020");
        this.nunotademfx = vo.asBigDecimal("NUNOTADEMFX");
        this.nunotamodfx = vo.asBigDecimal("NUNOTAMODFX");
        this.nunotatrcfx = vo.asBigDecimal("NUNOTATRCFX");
        this.origprodcomipi = vo.asString("ORIGPRODCOMIPI");
        this.permoutroususepped = vo.asString("PERMOUTROUSUSEPPED");
        this.portasmtpxml = vo.asBigDecimal("PORTASMTPXML");
        this.progaquisalim = vo.asString("PROGAQUISALIM");
        this.proxexecsmtpxml = vo.asTimestamp("PROXEXECSMTPXML");
        this.qrcodenfceversao2 = vo.asString("QRCODENFCEVERSAO2");
        this.redissbcpisconf = vo.asString("REDISSBCPISCONF");
        this.redstcompbcpiscofins = vo.asString("REDSTCOMPBCPISCOFINS");
        this.senhasmtpxml = vo.asString("SENHASMTPXML");
        this.servidorsmtpxml = vo.asString("SERVIDORSMTPXML");
        this.suprimiremaildest = vo.asString("SUPRIMIREMAILDEST");
        this.tipconexsmtpxml = vo.asString("TIPCONEXSMTPXML");
        this.tipdataevtserv = vo.asString("TIPDATAEVTSERV");
        this.tipgerinfgveicgreb = vo.asString("TIPGERINFGVEICGREB");
        this.tipoenvionfce = vo.asString("TIPOENVIONFCE");
        this.ultnsucte = vo.asString("ULTNSUCTE");
        this.usacodbarrasconcatwms = vo.asString("USACODBARRASCONCATWMS");
        this.usanomecomplitem = vo.asString("USANOMECOMPLITEM");
        this.usarecparcial = vo.asString("USARECPARCIAL");
        this.usasttextnotarestst = vo.asString("USASTEXTNOTARESTST");
        this.usuariosmtpxml = vo.asString("USUARIOSMTPXML");
        this.utilizadfetransp = vo.asString("UTILIZADFETRANSP");
        this.utilizaexplotesep = vo.asString("UTILIZAEXPLOTESEP");
        this.utilizaseppulmao = vo.asString("UTILIZASEPPULMAO");
        this.utilizatricrossdocking = vo.asString("UTILIZATRICROSSDOCKING");
        this.versaoNt = vo.asBigDecimal("VERSAONT");
        this.versaoNtCte = vo.asBigDecimal("VERSAONTCTE");
        this.versaoNtMdfe = vo.asBigDecimal("VERSAONTMDFE");
        this.wmsArmTotalCol = vo.asString("WMSARMTOTALCOL");
        this.wmsInfoPesoDetVol = vo.asString("WMSINFOPESODETVOL");
        this.wmsMultiUsuConf = vo.asString("WMSMULTIUSUCONF");
        this.wmsUsaImpFechaVol = vo.asString("WMSUSAIMPFECHAVOL");
        this.wmsUsaRegVolRec = vo.asString("WMSUSAREGVOLREC");
        this.aedFe = vo.asString("AEDFE");
        this.atualCbEnefFat = vo.asString("ATUALCBENEFFAT");
        this.calcIcmsStNaoCont = vo.asString("CALCICMSSTNAOCONT");
        this.codTabCkc = vo.asBigDecimal("CODTABCKC");
        this.reabCompleto = vo.asString("REABCOMPLETO");
        this.aliqCfBonif = vo.asBigDecimal("ALIQCFBONIF");
        this.aliqPisBonif = vo.asBigDecimal("ALIQPISBONIF");
        this.codCtaCtbBonif = vo.asBigDecimal("CODCTACTBBONIF");
        this.codStPisCfBonif = vo.asString("CODSTPISCFBONIF");
        this.mdfeDocSemIsProp = vo.asString("MDFEDOCSEMISPROPRIA");
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
        this.gerNotaEntCanc = vo.asString("GERNOTAENTCANC");
        this.metCalcDifIcms = vo.asString("METCALCDIFICMS");
        this.pesMaxSepaGru = vo.asBigDecimal("PESMAXSEPAGRU");
        this.usaSepaGruProd = vo.asString("USASEPAGRUPROD");
        this.qtPedSepaGr = vo.asBigDecimal("QTPEDSEPAGR");
        this.qtCheckSep = vo.asBigDecimal("QTCHECKSEP");
        this.volCheckSepRod = vo.asBigDecimal("VOLCHECKSEPROD");
        this.consRepIcmsBasePisCof = vo.asString("CONSREPICMSBASEPISCOF");
        this.aliqPisDesc = vo.asBigDecimal("ALIQPISDESC");
        this.aliqCfJuros = vo.asBigDecimal("ALIQCFJUROS");
        this.localPadEConect = vo.asBigDecimal("LOCALPADECONECT");
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
        this.nfSeObsIterPs = vo.asBigDecimal("NFSEOBSITERPS");
        this.qtdCarNfSeObsIterPs = vo.asBigDecimal("QTDCARNFSEOBSITERPS");
        this.caepf = vo.asString("CAEPF");
        this.cafir = vo.asString("CAFIR");
        this.gerAlcdPr = vo.asString("GERALCDPR");
        this.tipoExploracao = vo.asString("TIPOEXPLORACAO");
        this.baixaFinPreEmissNfce = vo.asString("BAIXAFINPREEMISSNFCE");
        this.icmsNormalDifIcmsSn = vo.asString("ICMSNORMALDIFICMSSN");
        this.dirFcpfResp = vo.asString("DIRFCPFRESP");
        this.dirFDepDecJud = vo.asString("DIRFDEPDECJUD");
        this.dirFDepFunInv = vo.asString("DIRFDEPFUNINV");
        this.dirFdhEvento = vo.asTimestamp("DIRFDHEVENTO");
        this.dirFEntImune = vo.asString("DIRFENTIMUNE");
        this.dirFNatDecl = vo.asString("DIRFNATDECL");
        this.dirFPgExt = vo.asString("DIRFPGEXT");
        this.dirFPgFundPub = vo.asString("DIRFPGFUNDPUB");
        this.dirFPlPriAss = vo.asString("DIRFPLPRIASS");
        this.dirFSitEsp = vo.asString("DIRFSITESP");
        this.dirFSocost = vo.asString("DIRFSOCOST");
        this.tempRemicaoEstadual = vo.asString("TEMPREMIACAOESTADUAL");
        this.codClassifEstab = vo.asBigDecimal("CODCLASSIFESTAB");
        this.redPisBcPisCofins = vo.asString("REDPISBCPISCOFINS");
        this.nuRfeProducao = vo.asBigDecimal("NURFEPRODUCAO");
        this.impressoraEtqSep = vo.asString("IMPRESSORAETQSEP");
        this.filtroAliqIcmsSql = vo.asString("FILTROALIQICMSSQL");
        this.clasConsAgua = vo.asString("CLASCONS_AGUA");
        this.clasConsEnerg = vo.asString("CLASCONS_ENERG");
        this.clasConsGas = vo.asString("CLASCONS_GAS");
        this.identEct = vo.asString("IDENTECT");
        this.wmsDocASepBalcao = vo.asString("WMSDOCASEPBALCAO");
        this.efdh010 = vo.asString("EFDH010");
        this.efdh010PrTer = vo.asString("EFDH010_PRTER");
        this.efdh010Ter = vo.asString("EFDH010_TER");
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
        this.tipCtActbEfd = vo.asString("TIPCTACTBEFD");
        this.topCorBanEconect = vo.asBigDecimal("TOPCORBANECONECT");
        this.tribReinf = vo.asBigDecimal("TRIBREINF");
        this.versaoCte = vo.asBigDecimal("VERSAOCTE");
        this.vinculoEfr = vo.asString("VINCULOEFR");
        this.nroMaxProd = vo.asBigDecimal("NROMAXPROD");
        this.tpoEmpresa = vo.asBigDecimal("TPOEMPRESA");
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
        this.topSatEconect = vo.asBigDecimal("TOPSATECONECT");
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
        this.efdCodCtaBcoInt = vo.asBigDecimal("EFDCODCTABCOINT");
        this.efdCodNatDespRecIcms = vo.asBigDecimal("EFDCODNATDESPRECICMS");
        this.efdCodTipoPer = vo.asBigDecimal("EFDCODTIPOPER");
        this.efdCodTipTit = vo.asBigDecimal("EFDCODTIPTIT");
        this.efdDiaVenc = vo.asBigDecimal("EFDDIAVENC");
        this.efdTipoReenchNota = vo.asString("EFDTIPREENCHNOTA");
        this.intFinObricmsStRec = vo.asString("INTFINOBRICMSSTREC");
        this.wmsRastSerMed = vo.asString("WMSRASTSERMED");
        this.codRespRetC180 = vo.asString("CODRESPRETC180");
        this.vlrBaseStC180 = vo.asString("VLRBASESTC180");
        this.vlrStC180 = vo.asString("VLRSTC180");
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
        this.codEmpGrupoFrete = vo.asBigDecimal("CODEMPGRUPFRETE");
        this.calcFetHab = vo.asString("CALCFETHAB");
        this.msgInfAdicFetHab = vo.asString("MSGINFADICFETHAB");
        this.aliqFuntTel = vo.asBigDecimal("ALIQFUNTTEL");
        this.aliqFust = vo.asBigDecimal("ALIQFUST");
        this.fisTel = vo.asString("FISTEL");
        this.vlrIcmsOpAnt = vo.asString("VLRICMSOPANT");
        this.vlrStFcpOpAnt = vo.asString("VLRSTFCPOPANT");
        this.vlrStOpAnt = vo.asString("VLRSTOPANT");
        this.vlrUnitIcmsOp = vo.asString("VLRUNITICMSOP");
        this.iniBereabMaxPicking = vo.asString("INIBEREABMAXPICKING");
        this.tratSobFinConf = vo.asString("TRATSOBFINCONF");
        this.conEstOrigProd = vo.asBigDecimal("CONESTORIGPROD");
        this.vlrUnitMerc = vo.asString("VLRUNITMERC");
        this.redDifAlBcPisCof = vo.asString("REDDIFALBCPISCOF");
        this.entAutTarMapa = vo.asString("ENTAUTTARMAPA");
        this.priorCodNat = vo.asBigDecimal("PRIORCODNAT");
        this.envRespContCte = vo.asString("ENVRESPCONTCTE");
        this.consDevTerevTr2050 = vo.asString("CONSDEVTEREVTR2050");
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
        this.wmsPersEpProdAp = vo.asString("WMSPERSEPPRODAP");
        this.considQtCarDesc = vo.asString("CONSIDQTCARCDESC");
        this.envLeiTranspDesc = vo.asString("ENVLEITRANSPDESC");
        this.envLeiTranspTotObs = vo.asString("ENVLEITRANSPTOTOBS");
        this.cgcProcurador = vo.asString("CGCPROCURADOR");
        this.iniBloqRegConf = vo.asString("INIBLOQREGCONF");
        this.blqNfaCompNfcPend = vo.asString("BLQNFACOMPNFCPEND");
        this.difAliqDespAcess = vo.asString("DIFALIQDESPACESS");
        this.complRestituicaoIcmsSt = vo.asString("COMPLRESTITUICAOICMSST");
        this.calcPisCfsFin = vo.asString("CALCPISCFSFIN");
        this.isAliqIntSexC = vo.asString("ISALIQINTSEXC");
        this.tipIcmsFenValBem = vo.asBigDecimal("TIPICMSFENVALBEM");
        this.chavePixCheckout = vo.asString("CHAVEPIXCHECKOUT");
        this.urlPixCheckout = vo.asString("URLPIXCHECKOUT");
        this.calcVlrAquisBem = vo.asBigDecimal("CALCVLRAQUISBEM");
        this.iniBelote = vo.asString("INIBELOTE");
        this.contBaiBemSubImprec = vo.asString("CONTBAIBEMSUBIMPREC");
        this.codCtaPixTef = vo.asBigDecimal("CODCTAPIXTEF");
        this.credIcmsCombus = vo.asString("CREDICMSCOMBUS");
        this.credIcmsRemg = vo.asString("CREDICMSREMG");
        this.descricao = vo.asString("DESCRICAO");
        this.descrNat = vo.asString("DESCRNAT");
        this.desTipIdEvCom = vo.asString("DESTIPIDEVCOM");
        this.natCanPix = vo.asBigDecimal("NATCANPIX");
        this.rupturaEst = vo.asString("RUPTURAEST");
        this.somarFcpBcCiap = vo.asString("SOMARFCPBCCIAP");
        this.tipoPix = vo.asString("TIPOPIX");
        this.topCanPixFin = vo.asBigDecimal("TOPCANPIXFIN");
        this.topCanPixPag = vo.asBigDecimal("TOPCANPIXPAG");
        this.topCanPixRec = vo.asBigDecimal("TOPCANPIXREC");
        this.usaMedDiaImp = vo.asString("USAMEDDIAIMP");
        this.codCenCusIpi = vo.asBigDecimal("CODCENCUSIPI");
        this.codCtaBcoIpi = vo.asBigDecimal("CODCTABCOIPI");
        this.codEmpImposto = vo.asBigDecimal("CODEMPIMPOSTO");
        this.codModRetEstWms = vo.asBigDecimal("CODMODRETESTWMS");
        this.codNatIpi = vo.asBigDecimal("CODNATIPI");
        this.codParCipi = vo.asBigDecimal("CODPARCIPI");
        this.codReceitaIpi = vo.asString("CODRECEITAIPI");
        this.codReceitaReinf = vo.asString("CODRECEITAREINF");
        this.codTipoPerIpi = vo.asBigDecimal("CODTIPOPERIPI");
        this.codTipTitIpi = vo.asBigDecimal("CODTIPTITIPI");
        this.consDifParCoutIcms = vo.asString("CONSDIFPARCOUTICMS");
        this.ctaCtbAnlRegApur = vo.asString("CTACTBANLREGAPUR");
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
        this.gerMultPlacRes = vo.asString("GERMULTPLACRES");
        this.indTipoLayoutK010 = vo.asBigDecimal("INDTIPLAYOUTK010");
        this.indUniao = vo.asBigDecimal("INDUNIAO");
        this.integrarIpiFin = vo.asString("INTEGRARIPIFIN");
        this.modEstCpaWms = vo.asBigDecimal("MODESTCPAWMS");
        this.notaEntAjusteReclas = vo.asBigDecimal("NOTAENTAJUSTERECLAS");
        this.notaSaiAjusteReclas = vo.asBigDecimal("NOTASAIAJUSTERECLAS");
        this.origDescontos = vo.asBigDecimal("ORIGDESCONTOS");
        this.redStBcPisCofins = vo.asString("REDSTBCPISCOFINS");
        this.stInclusA70 = vo.asString("STINCLUSA70");
        this.tipCtaCtbEfdF = vo.asString("TIPCTACTBEFDF");
        this.tipDataEvtPag = vo.asString("TIPDATAEVTPAG");
        this.tipDataEvtPagXir = vo.asString("TIPDATAEVTPAGXIR");
        this.tokenIbpt = vo.asString("TOKENIBPT");
        this.usaCusMedIcmsPro = vo.asString("USACUSMEDICMPRO");
        this.usaCustoMedioMps = vo.asString("USACUSTOMEDIOMPS");
        this.desApCProDepE = vo.asString("DESAPCPRODEPE");
        this.regApurTribSn = vo.asString("REGAPURTRIBSN");
        this.status = vo.asBigDecimal("STATUS");
        this.geraDeducaoPf = vo.asString("GERADEDUCAOPF");
        this.credIcmsCst60Am = vo.asString("CREDICMSCST60AM");
        this.denuncEspCte = vo.asString("DENUNCESPCTE");
        this.prazoRCancCte = vo.asBigDecimal("PRAZORCANCCTE");
        this.prazoTCancCte = vo.asBigDecimal("PRAZOTCANCCTE");
        this.terAcpCte = vo.asString("TERACPCTE");
        this.aplCalcDifAliqFrt = vo.asString("APLCALCDIFALIQFRT");
        return this;
   }
}
