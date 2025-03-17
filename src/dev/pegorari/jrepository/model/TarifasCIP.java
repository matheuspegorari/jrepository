package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TarifasCIP extends AbstractSankhyaEntity<TarifasCIP> {
   private BigDecimal codProdSubKit;
   private String enqReintegra;
   private BigDecimal margLucro;
   private BigDecimal codGProd;
   private BigDecimal codEspecSt;
   private BigDecimal codAnp;
   private BigDecimal codAreaSep;
   private BigDecimal codFormaPonta;
   private BigDecimal codFormPrec;
   private BigDecimal codGar;
   private BigDecimal codGenero;
   private BigDecimal codGrupoProd;
   private BigDecimal codIcmsFast;
   private BigDecimal codIpi;
   private BigDecimal codLocalPadrao;
   private BigDecimal codLst;
   private BigDecimal medAux;
   private String modoAplic;
   private String motivoIncexc;
   private BigDecimal multipVenda;
   private BigDecimal mvaAjustado;
   private String naturezaOperDes;
   private String ncm;
   private BigDecimal acrescMax;
   private BigDecimal agrupCompMinimo;
   private BigDecimal agrupMin;
   private String alertaEstMin;
   private BigDecimal aliqIcmsIntEfd;
   private BigDecimal altura;
   private String ap1RctEgo;
   private BigDecimal aplicacao;
   private String aplicaSazo;
   private String apresDetalhe;
   private String apresForm;
   private String apuraProdepe;
   private BigDecimal arredAgrup;
   private BigDecimal arredPreco;
   private String ativo;
   private String balanca;
   private String calcGiro;
   private BigDecimal camadas;
   private String caracteristicas;
   private BigDecimal carencia;
   private String cientifico;
   private BigDecimal classeAgt;
   private BigDecimal classeTox;
   private BigDecimal classUbTrib;
   private BigDecimal cnae;
   private String lisContest;
   private String local;
   private String localizacao;
   private BigDecimal loteCompMinimo;
   private BigDecimal loteCompras;
   private BigDecimal m3;
   private String manejoInt;
   private String marca;
   private String nomeTab;
   private String notifConf;
   private BigDecimal codMoeda;
   private BigDecimal codNat;
   private BigDecimal codPais;
   private BigDecimal codParcForn;
   private BigDecimal codProd;
   private BigDecimal codProdAgrupApt;
   private BigDecimal codProdAgrupAptEnc;
   private String codProdRoi;
   private BigDecimal codProj;
   private String codRegMapa;
   private BigDecimal codRfa;
   private BigDecimal codTab;
   private String codTribMunIss;
   private BigDecimal codUsu;
   private String codVol;
   private String codVolCompra;
   private String codVolPlan;
   private String codVolRes;
   private BigDecimal comGer;
   private String complDesc;
   private String compoNoBrig;
   private BigDecimal comVend;
   private String concentracao;
   private String confCegaPeso;
   private String confere;
   private BigDecimal converVol;
   private BigDecimal cstIpiEnt;
   private BigDecimal cstIpiSai;
   private String cultura;
   private BigDecimal decCusto;
   private BigDecimal decQtd;
   private BigDecimal decVlr;
   private BigDecimal descMax;
   private BigDecimal descMaxFlex;
   private String descrProd;
   private String descrProdNfe;
   private BigDecimal desvioMax;
   private BigDecimal diasExpedicao;
   private String dimensoes;
   private BigDecimal dosagem;
   private BigDecimal dosagemPor;
   private Timestamp dtAlter;
   private Timestamp dtAlterEmq;
   private Timestamp dtAlterEsq;
   private String dtValDif;
   private String endImagem;
   private String endModRotulo;
   private String epocaAplic;
   private BigDecimal espessura;
   private BigDecimal estMax;
   private BigDecimal estMaxDias;
   private BigDecimal estMaxQtd;
   private BigDecimal estMin;
   private BigDecimal estSegDias;
   private BigDecimal estSegQtd;
   private String excluirConf;
   private String exigeBenefic;
   private String fabricante;
   private String fatTotal;
   private String flex;
   private String formulacao;
   private String geraPlAProd;
   private String grupoCofins;
   private String grupoCssl;
   private String grupoDescProd;
   private BigDecimal grupoIcms;
   private String grupoPis;
   private BigDecimal grupoQuimico;
   private String homePage;
   private String hrDobrada;
   private String icmsGerencia;
   private BigDecimal idenImob;
   private byte[] imagem;
   private String impEtiqConf;
   private String impLaudoLote;
   private String impOrdemCorte;
   private String indEspProdepe;
   private String infPureza;
   private BigDecimal intervalo;
   private BigDecimal largura;
   private BigDecimal lastro;
   private BigDecimal leadTime;
   private String codAutCodif;
   private String codBarBalanca;
   private BigDecimal codCenCus;
   private BigDecimal codCos;
   private BigDecimal codCtaCtb;
   private BigDecimal codCtaCtb2;
   private BigDecimal codCtaCtb3;
   private BigDecimal codCtaCtb4;
   private String codFci;
   private BigDecimal codFiltro;
   private String tipoKit;
   private BigDecimal codConfKit;
   private BigDecimal codExNcm;
   private BigDecimal percInss;
   private BigDecimal percIrf;
   private BigDecimal percQuebraTec;
   private String permCompProd;
   private BigDecimal pesoBruto;
   private BigDecimal pesoLiq;
   private BigDecimal prazoVal;
   private BigDecimal princAtivo;
   private BigDecimal produtoNfe;
   private String promocao;
   private BigDecimal qtdEmb;
   private BigDecimal qtdNfLaudosInt;
   private String rastrEstoque;
   private String receituario;
   private String recupAvaria;
   private BigDecimal redBaseInss;
   private BigDecimal redBaseIrf;
   private String referencia;
   private String refForn;
   private String regraWms;
   private String remeter;
   private String rendimento;
   private BigDecimal rendimentoHa;
   private String selecionado;
   private BigDecimal shelfLife;
   private BigDecimal shelfLifeMin;
   private String solCompra;
   private String statusIncexc;
   private BigDecimal tamLote;
   private BigDecimal tamSerie;
   private String temCiap;
   private String temComissao;
   private String temCredPisCofinsDepr;
   private String temIcms;
   private String temInss;
   private String temIpiCompra;
   private String temIpiVenda;
   private String temIrf;
   private String temIss;
   private Timestamp tempoServ;
   private String tipContest;
   private String tipContestWms;
   private BigDecimal tipGtinNfe;
   private String tipLancNota;
   private String tipo;
   private String tipSerNfe;
   private String tipSubst;
   private String titContest;
   private String unidade;
   private String unidMinArmaz;
   private String usaCodBarrasQtd;
   private String usaImpAgrupMin;
   private String usaLocal;
   private String usaSerieFab;
   private String usaSerieSepWms;
   private String usaStatusLote;
   private String usoProd;
   private BigDecimal utilImob;
   private String utilizaWms;
   private String valCapM3;
   private String valCbGlobal;
   private String venCompIndiv;
   private BigDecimal vlrComerc;
   private BigDecimal vlrParcImpExt;
   private String volDosagem;
   private String volDosagemPor;
   private BigDecimal percTolPesoMenorSep;
   private String usaLoteDtFab;
   private String usaLoteDtVal;
   private String descVenConsul;
   private BigDecimal codFiltroReq;
   private String controlMedic;
   private BigDecimal codEnqIpiEnt;
   private BigDecimal codEnqIpiSai;
   private BigDecimal aliqGeral;
   private BigDecimal mvaPadrao;
   private BigDecimal grupoIcms2;
   private String usaContPesoVar;
   private BigDecimal percTolPesoMaior;
   private BigDecimal percTolPesoMaiorSep;
   private BigDecimal percTolPesoMenor;
   private String codVolPesoVar;
   private BigDecimal percCmtImp;
   private BigDecimal percCmtNac;
   private String serFaturCon;
   private BigDecimal topFaturCon;
   private BigDecimal numItemRea;
   private String obsEtiqueta;
   private String origProd;
   private String padrao;
   private BigDecimal percAumentCusto;
   private String exigeLastroCamadas;
   private String fixoAgenda;
   private Timestamp dtSubst;
   private BigDecimal codProdSubst;
   private String cat1799Spres;
   private BigDecimal codComp;
   private String visivelAppOs;
   private BigDecimal codParcConsig;
   private String tipoItemSped;
   private BigDecimal codIdCnae;
   private BigDecimal codNbs;
   private String consProdCat42;
   private BigDecimal desvioMaxTolConfSep;
   private BigDecimal desvioMinTolConfSep;
   private String fragmentaLote;
   private BigDecimal grupoTransg;
   private String motIsencaoAnvisa;
   private BigDecimal percRedBaseIcmsEfet;
   private String registrarPeso;
   private String servPrestTer;
   private BigDecimal tempMaxima;
   private String controlado;
   private BigDecimal tempMinima;
   private String termolabil;
   private String listaLpm;
   private String oneroso;
   private String refMercMed;
   private String idenPortaria;
   private BigDecimal codPat;
   private BigDecimal codTer;
   private String idenOtc;
   private String idenCosme;
   private String idenCorrelato;
   private BigDecimal codCpr;
   private BigDecimal seqSte;
   private BigDecimal codCat;
   private BigDecimal statusMed;
   private BigDecimal seqSca;
   private String prodFalta;
   private BigDecimal codFab;
   private BigDecimal seqSpr;
   private BigDecimal qtdIdentif;
   private String tipoIdentif;
   private String temMedicao;
   private BigDecimal tipoSn;
   private BigDecimal codServTelecom;
   private String tipoContagem;
   private String codAnvisa;
   private String descrAnp;
   private BigDecimal percMistGlp;
   private BigDecimal ordemMedida;
   private BigDecimal codMarca;
   private String temRastroLote;
   private String armazeLote;
   private BigDecimal mvaOriginalDrCst;
   private String codFciCalc;
   private BigDecimal vlrComercCalc;
   private BigDecimal vlrParcImpExtCalc;
   private String codBarComp;
   private BigDecimal incPesoBruto;
   private BigDecimal incPesoLiquido;
   private BigDecimal nuRfe;
   private BigDecimal modEtiqSepWms;
   private String impEtiqSepWms;
   private String nrProcesso;
   private BigDecimal percCmtMun;
   private BigDecimal percCmtFed;
   private BigDecimal percCmtEst;
   private BigDecimal corFontConsPreco;
   private BigDecimal corFundoConsPreco;
   private String calcDifAl;
   private BigDecimal classifCessaoObra;
   private String cnpjFabricante;
   private String codAgregacao;
   private String codAtivReintegra;
   private String codBenefNauf;
   private String codCprb;
   private BigDecimal codCtaCtbEfd;
   private BigDecimal codFiltroCta;
   private String comercializacaoAgri;
   private String indEscala;
   private BigDecimal obraConstCivil;
   private BigDecimal percInssEspecial;
   private BigDecimal percMistGni;
   private String utilizaEndFlut;
   private BigDecimal percMistGnn;
   private BigDecimal qtdAgrupamentoMtz;
   private String tipoInssEspecial;
   private BigDecimal vlrPartidaGlp;
   private String integraEconect;
   private BigDecimal maxMultEconect;
   private String utilSmartCard;
   private BigDecimal natEfdContM410M810;
   private BigDecimal codVtp;
   private String indTipRefBcIcmsSt;
   private String conEstOrigProd;
   private BigDecimal tamanhoMedioPeca;
   private String statusNcm;
   private String wmsProdRastSerMed;
   private String servDespNTrib;
   private String prodAliadrCst;
   private String gerImpNRetReinfaq;
   private BigDecimal aliqFetHab;
   private String codVolFetHab;
   private String calcFunTtelPro;
   private String calcFustPro;
   private BigDecimal tipUtilCom;
   private String codBarDifGtin;
   private String codBarTribDifGtin;
   private String prodInterno;
   private BigDecimal aliqImp;
   private BigDecimal aliqNac;
   private String atuNuVersao;
   private BigDecimal integraFox;
   private BigDecimal nuVersao;
   private char[] gradePadrao;
   private BigDecimal idGrade;
   private BigDecimal percentSepPul;
   private String obtStAntMedEnt;
   private String descProdDrCst;
   private BigDecimal aliqInternaCat42;
   private String desDescCalcPis;
   private BigDecimal aliqFecop;
   private BigDecimal mvaOriginalAdrCst;
   private String participaAdrCst;
   private String prodSujFecop;
   private String calRupturaEstoque;
   private String codVolKanban;
   private String bloqVendaFrac;
   private BigDecimal codNatRend;
   private BigDecimal tpIrrfExt;
   private BigDecimal percIndMistura;
   private String opExpFetHab;
   private String opeIntEstFetHab;
   private String opeIntFetHab;

   public BigDecimal getCodProdSubKit() {
        return codProdSubKit;
   }

   public void setCodProdSubKit(BigDecimal codProdSubKit) {
        this.codProdSubKit = codProdSubKit;
   }

   public String getEnqReintegra() {
        return enqReintegra;
   }

   public void setEnqReintegra(String enqReintegra) {
        this.enqReintegra = enqReintegra;
   }

   public BigDecimal getMargLucro() {
        return margLucro;
   }

   public void setMargLucro(BigDecimal margLucro) {
        this.margLucro = margLucro;
   }

   public BigDecimal getCodGProd() {
        return codGProd;
   }

   public void setCodGProd(BigDecimal codGProd) {
        this.codGProd = codGProd;
   }

   public BigDecimal getCodEspecSt() {
        return codEspecSt;
   }

   public void setCodEspecSt(BigDecimal codEspecSt) {
        this.codEspecSt = codEspecSt;
   }

   public BigDecimal getCodAnp() {
        return codAnp;
   }

   public void setCodAnp(BigDecimal codAnp) {
        this.codAnp = codAnp;
   }

   public BigDecimal getCodAreaSep() {
        return codAreaSep;
   }

   public void setCodAreaSep(BigDecimal codAreaSep) {
        this.codAreaSep = codAreaSep;
   }

   public BigDecimal getCodFormaPonta() {
        return codFormaPonta;
   }

   public void setCodFormaPonta(BigDecimal codFormaPonta) {
        this.codFormaPonta = codFormaPonta;
   }

   public BigDecimal getCodFormPrec() {
        return codFormPrec;
   }

   public void setCodFormPrec(BigDecimal codFormPrec) {
        this.codFormPrec = codFormPrec;
   }

   public BigDecimal getCodGar() {
        return codGar;
   }

   public void setCodGar(BigDecimal codGar) {
        this.codGar = codGar;
   }

   public BigDecimal getCodGenero() {
        return codGenero;
   }

   public void setCodGenero(BigDecimal codGenero) {
        this.codGenero = codGenero;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getCodIcmsFast() {
        return codIcmsFast;
   }

   public void setCodIcmsFast(BigDecimal codIcmsFast) {
        this.codIcmsFast = codIcmsFast;
   }

   public BigDecimal getCodIpi() {
        return codIpi;
   }

   public void setCodIpi(BigDecimal codIpi) {
        this.codIpi = codIpi;
   }

   public BigDecimal getCodLocalPadrao() {
        return codLocalPadrao;
   }

   public void setCodLocalPadrao(BigDecimal codLocalPadrao) {
        this.codLocalPadrao = codLocalPadrao;
   }

   public BigDecimal getCodLst() {
        return codLst;
   }

   public void setCodLst(BigDecimal codLst) {
        this.codLst = codLst;
   }

   public BigDecimal getMedAux() {
        return medAux;
   }

   public void setMedAux(BigDecimal medAux) {
        this.medAux = medAux;
   }

   public String getModoAplic() {
        return modoAplic;
   }

   public void setModoAplic(String modoAplic) {
        this.modoAplic = modoAplic;
   }

   public String getMotivoIncexc() {
        return motivoIncexc;
   }

   public void setMotivoIncexc(String motivoIncexc) {
        this.motivoIncexc = motivoIncexc;
   }

   public BigDecimal getMultipVenda() {
        return multipVenda;
   }

   public void setMultipVenda(BigDecimal multipVenda) {
        this.multipVenda = multipVenda;
   }

   public BigDecimal getMvaAjustado() {
        return mvaAjustado;
   }

   public void setMvaAjustado(BigDecimal mvaAjustado) {
        this.mvaAjustado = mvaAjustado;
   }

   public String getNaturezaOperDes() {
        return naturezaOperDes;
   }

   public void setNaturezaOperDes(String naturezaOperDes) {
        this.naturezaOperDes = naturezaOperDes;
   }

   public String getNcm() {
        return ncm;
   }

   public void setNcm(String ncm) {
        this.ncm = ncm;
   }

   public BigDecimal getAcrescMax() {
        return acrescMax;
   }

   public void setAcrescMax(BigDecimal acrescMax) {
        this.acrescMax = acrescMax;
   }

   public BigDecimal getAgrupCompMinimo() {
        return agrupCompMinimo;
   }

   public void setAgrupCompMinimo(BigDecimal agrupCompMinimo) {
        this.agrupCompMinimo = agrupCompMinimo;
   }

   public BigDecimal getAgrupMin() {
        return agrupMin;
   }

   public void setAgrupMin(BigDecimal agrupMin) {
        this.agrupMin = agrupMin;
   }

   public String getAlertaEstMin() {
        return alertaEstMin;
   }

   public void setAlertaEstMin(String alertaEstMin) {
        this.alertaEstMin = alertaEstMin;
   }

   public BigDecimal getAliqIcmsIntEfd() {
        return aliqIcmsIntEfd;
   }

   public void setAliqIcmsIntEfd(BigDecimal aliqIcmsIntEfd) {
        this.aliqIcmsIntEfd = aliqIcmsIntEfd;
   }

   public BigDecimal getAltura() {
        return altura;
   }

   public void setAltura(BigDecimal altura) {
        this.altura = altura;
   }

   public String getAp1RctEgo() {
        return ap1RctEgo;
   }

   public void setAp1RctEgo(String ap1RctEgo) {
        this.ap1RctEgo = ap1RctEgo;
   }

   public BigDecimal getAplicacao() {
        return aplicacao;
   }

   public void setAplicacao(BigDecimal aplicacao) {
        this.aplicacao = aplicacao;
   }

   public String getAplicaSazo() {
        return aplicaSazo;
   }

   public void setAplicaSazo(String aplicaSazo) {
        this.aplicaSazo = aplicaSazo;
   }

   public String getApresDetalhe() {
        return apresDetalhe;
   }

   public void setApresDetalhe(String apresDetalhe) {
        this.apresDetalhe = apresDetalhe;
   }

   public String getApresForm() {
        return apresForm;
   }

   public void setApresForm(String apresForm) {
        this.apresForm = apresForm;
   }

   public String getApuraProdepe() {
        return apuraProdepe;
   }

   public void setApuraProdepe(String apuraProdepe) {
        this.apuraProdepe = apuraProdepe;
   }

   public BigDecimal getArredAgrup() {
        return arredAgrup;
   }

   public void setArredAgrup(BigDecimal arredAgrup) {
        this.arredAgrup = arredAgrup;
   }

   public BigDecimal getArredPreco() {
        return arredPreco;
   }

   public void setArredPreco(BigDecimal arredPreco) {
        this.arredPreco = arredPreco;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public String getBalanca() {
        return balanca;
   }

   public void setBalanca(String balanca) {
        this.balanca = balanca;
   }

   public String getCalcGiro() {
        return calcGiro;
   }

   public void setCalcGiro(String calcGiro) {
        this.calcGiro = calcGiro;
   }

   public BigDecimal getCamadas() {
        return camadas;
   }

   public void setCamadas(BigDecimal camadas) {
        this.camadas = camadas;
   }

   public String getCaracteristicas() {
        return caracteristicas;
   }

   public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
   }

   public BigDecimal getCarencia() {
        return carencia;
   }

   public void setCarencia(BigDecimal carencia) {
        this.carencia = carencia;
   }

   public String getCientifico() {
        return cientifico;
   }

   public void setCientifico(String cientifico) {
        this.cientifico = cientifico;
   }

   public BigDecimal getClasseAgt() {
        return classeAgt;
   }

   public void setClasseAgt(BigDecimal classeAgt) {
        this.classeAgt = classeAgt;
   }

   public BigDecimal getClasseTox() {
        return classeTox;
   }

   public void setClasseTox(BigDecimal classeTox) {
        this.classeTox = classeTox;
   }

   public BigDecimal getClassUbTrib() {
        return classUbTrib;
   }

   public void setClassUbTrib(BigDecimal classUbTrib) {
        this.classUbTrib = classUbTrib;
   }

   public BigDecimal getCnae() {
        return cnae;
   }

   public void setCnae(BigDecimal cnae) {
        this.cnae = cnae;
   }

   public String getLisContest() {
        return lisContest;
   }

   public void setLisContest(String lisContest) {
        this.lisContest = lisContest;
   }

   public String getLocal() {
        return local;
   }

   public void setLocal(String local) {
        this.local = local;
   }

   public String getLocalizacao() {
        return localizacao;
   }

   public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
   }

   public BigDecimal getLoteCompMinimo() {
        return loteCompMinimo;
   }

   public void setLoteCompMinimo(BigDecimal loteCompMinimo) {
        this.loteCompMinimo = loteCompMinimo;
   }

   public BigDecimal getLoteCompras() {
        return loteCompras;
   }

   public void setLoteCompras(BigDecimal loteCompras) {
        this.loteCompras = loteCompras;
   }

   public BigDecimal getM3() {
        return m3;
   }

   public void setM3(BigDecimal m3) {
        this.m3 = m3;
   }

   public String getManejoInt() {
        return manejoInt;
   }

   public void setManejoInt(String manejoInt) {
        this.manejoInt = manejoInt;
   }

   public String getMarca() {
        return marca;
   }

   public void setMarca(String marca) {
        this.marca = marca;
   }

   public String getNomeTab() {
        return nomeTab;
   }

   public void setNomeTab(String nomeTab) {
        this.nomeTab = nomeTab;
   }

   public String getNotifConf() {
        return notifConf;
   }

   public void setNotifConf(String notifConf) {
        this.notifConf = notifConf;
   }

   public BigDecimal getCodMoeda() {
        return codMoeda;
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        this.codMoeda = codMoeda;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        this.codNat = codNat;
   }

   public BigDecimal getCodPais() {
        return codPais;
   }

   public void setCodPais(BigDecimal codPais) {
        this.codPais = codPais;
   }

   public BigDecimal getCodParcForn() {
        return codParcForn;
   }

   public void setCodParcForn(BigDecimal codParcForn) {
        this.codParcForn = codParcForn;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodProdAgrupApt() {
        return codProdAgrupApt;
   }

   public void setCodProdAgrupApt(BigDecimal codProdAgrupApt) {
        this.codProdAgrupApt = codProdAgrupApt;
   }

   public BigDecimal getCodProdAgrupAptEnc() {
        return codProdAgrupAptEnc;
   }

   public void setCodProdAgrupAptEnc(BigDecimal codProdAgrupAptEnc) {
        this.codProdAgrupAptEnc = codProdAgrupAptEnc;
   }

   public String getCodProdRoi() {
        return codProdRoi;
   }

   public void setCodProdRoi(String codProdRoi) {
        this.codProdRoi = codProdRoi;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        this.codProj = codProj;
   }

   public String getCodRegMapa() {
        return codRegMapa;
   }

   public void setCodRegMapa(String codRegMapa) {
        this.codRegMapa = codRegMapa;
   }

   public BigDecimal getCodRfa() {
        return codRfa;
   }

   public void setCodRfa(BigDecimal codRfa) {
        this.codRfa = codRfa;
   }

   public BigDecimal getCodTab() {
        return codTab;
   }

   public void setCodTab(BigDecimal codTab) {
        this.codTab = codTab;
   }

   public String getCodTribMunIss() {
        return codTribMunIss;
   }

   public void setCodTribMunIss(String codTribMunIss) {
        this.codTribMunIss = codTribMunIss;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public String getCodVolCompra() {
        return codVolCompra;
   }

   public void setCodVolCompra(String codVolCompra) {
        this.codVolCompra = codVolCompra;
   }

   public String getCodVolPlan() {
        return codVolPlan;
   }

   public void setCodVolPlan(String codVolPlan) {
        this.codVolPlan = codVolPlan;
   }

   public String getCodVolRes() {
        return codVolRes;
   }

   public void setCodVolRes(String codVolRes) {
        this.codVolRes = codVolRes;
   }

   public BigDecimal getComGer() {
        return comGer;
   }

   public void setComGer(BigDecimal comGer) {
        this.comGer = comGer;
   }

   public String getComplDesc() {
        return complDesc;
   }

   public void setComplDesc(String complDesc) {
        this.complDesc = complDesc;
   }

   public String getCompoNoBrig() {
        return compoNoBrig;
   }

   public void setCompoNoBrig(String compoNoBrig) {
        this.compoNoBrig = compoNoBrig;
   }

   public BigDecimal getComVend() {
        return comVend;
   }

   public void setComVend(BigDecimal comVend) {
        this.comVend = comVend;
   }

   public String getConcentracao() {
        return concentracao;
   }

   public void setConcentracao(String concentracao) {
        this.concentracao = concentracao;
   }

   public String getConfCegaPeso() {
        return confCegaPeso;
   }

   public void setConfCegaPeso(String confCegaPeso) {
        this.confCegaPeso = confCegaPeso;
   }

   public String getConfere() {
        return confere;
   }

   public void setConfere(String confere) {
        this.confere = confere;
   }

   public BigDecimal getConverVol() {
        return converVol;
   }

   public void setConverVol(BigDecimal converVol) {
        this.converVol = converVol;
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

   public String getCultura() {
        return cultura;
   }

   public void setCultura(String cultura) {
        this.cultura = cultura;
   }

   public BigDecimal getDecCusto() {
        return decCusto;
   }

   public void setDecCusto(BigDecimal decCusto) {
        this.decCusto = decCusto;
   }

   public BigDecimal getDecQtd() {
        return decQtd;
   }

   public void setDecQtd(BigDecimal decQtd) {
        this.decQtd = decQtd;
   }

   public BigDecimal getDecVlr() {
        return decVlr;
   }

   public void setDecVlr(BigDecimal decVlr) {
        this.decVlr = decVlr;
   }

   public BigDecimal getDescMax() {
        return descMax;
   }

   public void setDescMax(BigDecimal descMax) {
        this.descMax = descMax;
   }

   public BigDecimal getDescMaxFlex() {
        return descMaxFlex;
   }

   public void setDescMaxFlex(BigDecimal descMaxFlex) {
        this.descMaxFlex = descMaxFlex;
   }

   public String getDescrProd() {
        return descrProd;
   }

   public void setDescrProd(String descrProd) {
        this.descrProd = descrProd;
   }

   public String getDescrProdNfe() {
        return descrProdNfe;
   }

   public void setDescrProdNfe(String descrProdNfe) {
        this.descrProdNfe = descrProdNfe;
   }

   public BigDecimal getDesvioMax() {
        return desvioMax;
   }

   public void setDesvioMax(BigDecimal desvioMax) {
        this.desvioMax = desvioMax;
   }

   public BigDecimal getDiasExpedicao() {
        return diasExpedicao;
   }

   public void setDiasExpedicao(BigDecimal diasExpedicao) {
        this.diasExpedicao = diasExpedicao;
   }

   public String getDimensoes() {
        return dimensoes;
   }

   public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
   }

   public BigDecimal getDosagem() {
        return dosagem;
   }

   public void setDosagem(BigDecimal dosagem) {
        this.dosagem = dosagem;
   }

   public BigDecimal getDosagemPor() {
        return dosagemPor;
   }

   public void setDosagemPor(BigDecimal dosagemPor) {
        this.dosagemPor = dosagemPor;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtAlterEmq() {
        return dtAlterEmq;
   }

   public void setDtAlterEmq(Timestamp dtAlterEmq) {
        this.dtAlterEmq = dtAlterEmq;
   }

   public Timestamp getDtAlterEsq() {
        return dtAlterEsq;
   }

   public void setDtAlterEsq(Timestamp dtAlterEsq) {
        this.dtAlterEsq = dtAlterEsq;
   }

   public String getDtValDif() {
        return dtValDif;
   }

   public void setDtValDif(String dtValDif) {
        this.dtValDif = dtValDif;
   }

   public String getEndImagem() {
        return endImagem;
   }

   public void setEndImagem(String endImagem) {
        this.endImagem = endImagem;
   }

   public String getEndModRotulo() {
        return endModRotulo;
   }

   public void setEndModRotulo(String endModRotulo) {
        this.endModRotulo = endModRotulo;
   }

   public String getEpocaAplic() {
        return epocaAplic;
   }

   public void setEpocaAplic(String epocaAplic) {
        this.epocaAplic = epocaAplic;
   }

   public BigDecimal getEspessura() {
        return espessura;
   }

   public void setEspessura(BigDecimal espessura) {
        this.espessura = espessura;
   }

   public BigDecimal getEstMax() {
        return estMax;
   }

   public void setEstMax(BigDecimal estMax) {
        this.estMax = estMax;
   }

   public BigDecimal getEstMaxDias() {
        return estMaxDias;
   }

   public void setEstMaxDias(BigDecimal estMaxDias) {
        this.estMaxDias = estMaxDias;
   }

   public BigDecimal getEstMaxQtd() {
        return estMaxQtd;
   }

   public void setEstMaxQtd(BigDecimal estMaxQtd) {
        this.estMaxQtd = estMaxQtd;
   }

   public BigDecimal getEstMin() {
        return estMin;
   }

   public void setEstMin(BigDecimal estMin) {
        this.estMin = estMin;
   }

   public BigDecimal getEstSegDias() {
        return estSegDias;
   }

   public void setEstSegDias(BigDecimal estSegDias) {
        this.estSegDias = estSegDias;
   }

   public BigDecimal getEstSegQtd() {
        return estSegQtd;
   }

   public void setEstSegQtd(BigDecimal estSegQtd) {
        this.estSegQtd = estSegQtd;
   }

   public String getExcluirConf() {
        return excluirConf;
   }

   public void setExcluirConf(String excluirConf) {
        this.excluirConf = excluirConf;
   }

   public String getExigeBenefic() {
        return exigeBenefic;
   }

   public void setExigeBenefic(String exigeBenefic) {
        this.exigeBenefic = exigeBenefic;
   }

   public String getFabricante() {
        return fabricante;
   }

   public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
   }

   public String getFatTotal() {
        return fatTotal;
   }

   public void setFatTotal(String fatTotal) {
        this.fatTotal = fatTotal;
   }

   public String getFlex() {
        return flex;
   }

   public void setFlex(String flex) {
        this.flex = flex;
   }

   public String getFormulacao() {
        return formulacao;
   }

   public void setFormulacao(String formulacao) {
        this.formulacao = formulacao;
   }

   public String getGeraPlAProd() {
        return geraPlAProd;
   }

   public void setGeraPlAProd(String geraPlAProd) {
        this.geraPlAProd = geraPlAProd;
   }

   public String getGrupoCofins() {
        return grupoCofins;
   }

   public void setGrupoCofins(String grupoCofins) {
        this.grupoCofins = grupoCofins;
   }

   public String getGrupoCssl() {
        return grupoCssl;
   }

   public void setGrupoCssl(String grupoCssl) {
        this.grupoCssl = grupoCssl;
   }

   public String getGrupoDescProd() {
        return grupoDescProd;
   }

   public void setGrupoDescProd(String grupoDescProd) {
        this.grupoDescProd = grupoDescProd;
   }

   public BigDecimal getGrupoIcms() {
        return grupoIcms;
   }

   public void setGrupoIcms(BigDecimal grupoIcms) {
        this.grupoIcms = grupoIcms;
   }

   public String getGrupoPis() {
        return grupoPis;
   }

   public void setGrupoPis(String grupoPis) {
        this.grupoPis = grupoPis;
   }

   public BigDecimal getGrupoQuimico() {
        return grupoQuimico;
   }

   public void setGrupoQuimico(BigDecimal grupoQuimico) {
        this.grupoQuimico = grupoQuimico;
   }

   public String getHomePage() {
        return homePage;
   }

   public void setHomePage(String homePage) {
        this.homePage = homePage;
   }

   public String getHrDobrada() {
        return hrDobrada;
   }

   public void setHrDobrada(String hrDobrada) {
        this.hrDobrada = hrDobrada;
   }

   public String getIcmsGerencia() {
        return icmsGerencia;
   }

   public void setIcmsGerencia(String icmsGerencia) {
        this.icmsGerencia = icmsGerencia;
   }

   public BigDecimal getIdenImob() {
        return idenImob;
   }

   public void setIdenImob(BigDecimal idenImob) {
        this.idenImob = idenImob;
   }

   public byte[] getImagem() {
        return imagem;
   }

   public void setImagem(byte[] imagem) {
        this.imagem = imagem;
   }

   public String getImpEtiqConf() {
        return impEtiqConf;
   }

   public void setImpEtiqConf(String impEtiqConf) {
        this.impEtiqConf = impEtiqConf;
   }

   public String getImpLaudoLote() {
        return impLaudoLote;
   }

   public void setImpLaudoLote(String impLaudoLote) {
        this.impLaudoLote = impLaudoLote;
   }

   public String getImpOrdemCorte() {
        return impOrdemCorte;
   }

   public void setImpOrdemCorte(String impOrdemCorte) {
        this.impOrdemCorte = impOrdemCorte;
   }

   public String getIndEspProdepe() {
        return indEspProdepe;
   }

   public void setIndEspProdepe(String indEspProdepe) {
        this.indEspProdepe = indEspProdepe;
   }

   public String getInfPureza() {
        return infPureza;
   }

   public void setInfPureza(String infPureza) {
        this.infPureza = infPureza;
   }

   public BigDecimal getIntervalo() {
        return intervalo;
   }

   public void setIntervalo(BigDecimal intervalo) {
        this.intervalo = intervalo;
   }

   public BigDecimal getLargura() {
        return largura;
   }

   public void setLargura(BigDecimal largura) {
        this.largura = largura;
   }

   public BigDecimal getLastro() {
        return lastro;
   }

   public void setLastro(BigDecimal lastro) {
        this.lastro = lastro;
   }

   public BigDecimal getLeadTime() {
        return leadTime;
   }

   public void setLeadTime(BigDecimal leadTime) {
        this.leadTime = leadTime;
   }

   public String getCodAutCodif() {
        return codAutCodif;
   }

   public void setCodAutCodif(String codAutCodif) {
        this.codAutCodif = codAutCodif;
   }

   public String getCodBarBalanca() {
        return codBarBalanca;
   }

   public void setCodBarBalanca(String codBarBalanca) {
        this.codBarBalanca = codBarBalanca;
   }

   public BigDecimal getCodCenCus() {
        return codCenCus;
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        this.codCenCus = codCenCus;
   }

   public BigDecimal getCodCos() {
        return codCos;
   }

   public void setCodCos(BigDecimal codCos) {
        this.codCos = codCos;
   }

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodCtaCtb2() {
        return codCtaCtb2;
   }

   public void setCodCtaCtb2(BigDecimal codCtaCtb2) {
        this.codCtaCtb2 = codCtaCtb2;
   }

   public BigDecimal getCodCtaCtb3() {
        return codCtaCtb3;
   }

   public void setCodCtaCtb3(BigDecimal codCtaCtb3) {
        this.codCtaCtb3 = codCtaCtb3;
   }

   public BigDecimal getCodCtaCtb4() {
        return codCtaCtb4;
   }

   public void setCodCtaCtb4(BigDecimal codCtaCtb4) {
        this.codCtaCtb4 = codCtaCtb4;
   }

   public String getCodFci() {
        return codFci;
   }

   public void setCodFci(String codFci) {
        this.codFci = codFci;
   }

   public BigDecimal getCodFiltro() {
        return codFiltro;
   }

   public void setCodFiltro(BigDecimal codFiltro) {
        this.codFiltro = codFiltro;
   }

   public String getTipoKit() {
        return tipoKit;
   }

   public void setTipoKit(String tipoKit) {
        this.tipoKit = tipoKit;
   }

   public BigDecimal getCodConfKit() {
        return codConfKit;
   }

   public void setCodConfKit(BigDecimal codConfKit) {
        this.codConfKit = codConfKit;
   }

   public BigDecimal getCodExNcm() {
        return codExNcm;
   }

   public void setCodExNcm(BigDecimal codExNcm) {
        this.codExNcm = codExNcm;
   }

   public BigDecimal getPercInss() {
        return percInss;
   }

   public void setPercInss(BigDecimal percInss) {
        this.percInss = percInss;
   }

   public BigDecimal getPercIrf() {
        return percIrf;
   }

   public void setPercIrf(BigDecimal percIrf) {
        this.percIrf = percIrf;
   }

   public BigDecimal getPercQuebraTec() {
        return percQuebraTec;
   }

   public void setPercQuebraTec(BigDecimal percQuebraTec) {
        this.percQuebraTec = percQuebraTec;
   }

   public String getPermCompProd() {
        return permCompProd;
   }

   public void setPermCompProd(String permCompProd) {
        this.permCompProd = permCompProd;
   }

   public BigDecimal getPesoBruto() {
        return pesoBruto;
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
   }

   public BigDecimal getPesoLiq() {
        return pesoLiq;
   }

   public void setPesoLiq(BigDecimal pesoLiq) {
        this.pesoLiq = pesoLiq;
   }

   public BigDecimal getPrazoVal() {
        return prazoVal;
   }

   public void setPrazoVal(BigDecimal prazoVal) {
        this.prazoVal = prazoVal;
   }

   public BigDecimal getPrincAtivo() {
        return princAtivo;
   }

   public void setPrincAtivo(BigDecimal princAtivo) {
        this.princAtivo = princAtivo;
   }

   public BigDecimal getProdutoNfe() {
        return produtoNfe;
   }

   public void setProdutoNfe(BigDecimal produtoNfe) {
        this.produtoNfe = produtoNfe;
   }

   public String getPromocao() {
        return promocao;
   }

   public void setPromocao(String promocao) {
        this.promocao = promocao;
   }

   public BigDecimal getQtdEmb() {
        return qtdEmb;
   }

   public void setQtdEmb(BigDecimal qtdEmb) {
        this.qtdEmb = qtdEmb;
   }

   public BigDecimal getQtdNfLaudosInt() {
        return qtdNfLaudosInt;
   }

   public void setQtdNfLaudosInt(BigDecimal qtdNfLaudosInt) {
        this.qtdNfLaudosInt = qtdNfLaudosInt;
   }

   public String getRastrEstoque() {
        return rastrEstoque;
   }

   public void setRastrEstoque(String rastrEstoque) {
        this.rastrEstoque = rastrEstoque;
   }

   public String getReceituario() {
        return receituario;
   }

   public void setReceituario(String receituario) {
        this.receituario = receituario;
   }

   public String getRecupAvaria() {
        return recupAvaria;
   }

   public void setRecupAvaria(String recupAvaria) {
        this.recupAvaria = recupAvaria;
   }

   public BigDecimal getRedBaseInss() {
        return redBaseInss;
   }

   public void setRedBaseInss(BigDecimal redBaseInss) {
        this.redBaseInss = redBaseInss;
   }

   public BigDecimal getRedBaseIrf() {
        return redBaseIrf;
   }

   public void setRedBaseIrf(BigDecimal redBaseIrf) {
        this.redBaseIrf = redBaseIrf;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        this.referencia = referencia;
   }

   public String getRefForn() {
        return refForn;
   }

   public void setRefForn(String refForn) {
        this.refForn = refForn;
   }

   public String getRegraWms() {
        return regraWms;
   }

   public void setRegraWms(String regraWms) {
        this.regraWms = regraWms;
   }

   public String getRemeter() {
        return remeter;
   }

   public void setRemeter(String remeter) {
        this.remeter = remeter;
   }

   public String getRendimento() {
        return rendimento;
   }

   public void setRendimento(String rendimento) {
        this.rendimento = rendimento;
   }

   public BigDecimal getRendimentoHa() {
        return rendimentoHa;
   }

   public void setRendimentoHa(BigDecimal rendimentoHa) {
        this.rendimentoHa = rendimentoHa;
   }

   public String getSelecionado() {
        return selecionado;
   }

   public void setSelecionado(String selecionado) {
        this.selecionado = selecionado;
   }

   public BigDecimal getShelfLife() {
        return shelfLife;
   }

   public void setShelfLife(BigDecimal shelfLife) {
        this.shelfLife = shelfLife;
   }

   public BigDecimal getShelfLifeMin() {
        return shelfLifeMin;
   }

   public void setShelfLifeMin(BigDecimal shelfLifeMin) {
        this.shelfLifeMin = shelfLifeMin;
   }

   public String getSolCompra() {
        return solCompra;
   }

   public void setSolCompra(String solCompra) {
        this.solCompra = solCompra;
   }

   public String getStatusIncexc() {
        return statusIncexc;
   }

   public void setStatusIncexc(String statusIncexc) {
        this.statusIncexc = statusIncexc;
   }

   public BigDecimal getTamLote() {
        return tamLote;
   }

   public void setTamLote(BigDecimal tamLote) {
        this.tamLote = tamLote;
   }

   public BigDecimal getTamSerie() {
        return tamSerie;
   }

   public void setTamSerie(BigDecimal tamSerie) {
        this.tamSerie = tamSerie;
   }

   public String getTemCiap() {
        return temCiap;
   }

   public void setTemCiap(String temCiap) {
        this.temCiap = temCiap;
   }

   public String getTemComissao() {
        return temComissao;
   }

   public void setTemComissao(String temComissao) {
        this.temComissao = temComissao;
   }

   public String getTemCredPisCofinsDepr() {
        return temCredPisCofinsDepr;
   }

   public void setTemCredPisCofinsDepr(String temCredPisCofinsDepr) {
        this.temCredPisCofinsDepr = temCredPisCofinsDepr;
   }

   public String getTemIcms() {
        return temIcms;
   }

   public void setTemIcms(String temIcms) {
        this.temIcms = temIcms;
   }

   public String getTemInss() {
        return temInss;
   }

   public void setTemInss(String temInss) {
        this.temInss = temInss;
   }

   public String getTemIpiCompra() {
        return temIpiCompra;
   }

   public void setTemIpiCompra(String temIpiCompra) {
        this.temIpiCompra = temIpiCompra;
   }

   public String getTemIpiVenda() {
        return temIpiVenda;
   }

   public void setTemIpiVenda(String temIpiVenda) {
        this.temIpiVenda = temIpiVenda;
   }

   public String getTemIrf() {
        return temIrf;
   }

   public void setTemIrf(String temIrf) {
        this.temIrf = temIrf;
   }

   public String getTemIss() {
        return temIss;
   }

   public void setTemIss(String temIss) {
        this.temIss = temIss;
   }

   public Timestamp getTempoServ() {
        return tempoServ;
   }

   public void setTempoServ(Timestamp tempoServ) {
        this.tempoServ = tempoServ;
   }

   public String getTipContest() {
        return tipContest;
   }

   public void setTipContest(String tipContest) {
        this.tipContest = tipContest;
   }

   public String getTipContestWms() {
        return tipContestWms;
   }

   public void setTipContestWms(String tipContestWms) {
        this.tipContestWms = tipContestWms;
   }

   public BigDecimal getTipGtinNfe() {
        return tipGtinNfe;
   }

   public void setTipGtinNfe(BigDecimal tipGtinNfe) {
        this.tipGtinNfe = tipGtinNfe;
   }

   public String getTipLancNota() {
        return tipLancNota;
   }

   public void setTipLancNota(String tipLancNota) {
        this.tipLancNota = tipLancNota;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getTipSerNfe() {
        return tipSerNfe;
   }

   public void setTipSerNfe(String tipSerNfe) {
        this.tipSerNfe = tipSerNfe;
   }

   public String getTipSubst() {
        return tipSubst;
   }

   public void setTipSubst(String tipSubst) {
        this.tipSubst = tipSubst;
   }

   public String getTitContest() {
        return titContest;
   }

   public void setTitContest(String titContest) {
        this.titContest = titContest;
   }

   public String getUnidade() {
        return unidade;
   }

   public void setUnidade(String unidade) {
        this.unidade = unidade;
   }

   public String getUnidMinArmaz() {
        return unidMinArmaz;
   }

   public void setUnidMinArmaz(String unidMinArmaz) {
        this.unidMinArmaz = unidMinArmaz;
   }

   public String getUsaCodBarrasQtd() {
        return usaCodBarrasQtd;
   }

   public void setUsaCodBarrasQtd(String usaCodBarrasQtd) {
        this.usaCodBarrasQtd = usaCodBarrasQtd;
   }

   public String getUsaImpAgrupMin() {
        return usaImpAgrupMin;
   }

   public void setUsaImpAgrupMin(String usaImpAgrupMin) {
        this.usaImpAgrupMin = usaImpAgrupMin;
   }

   public String getUsaLocal() {
        return usaLocal;
   }

   public void setUsaLocal(String usaLocal) {
        this.usaLocal = usaLocal;
   }

   public String getUsaSerieFab() {
        return usaSerieFab;
   }

   public void setUsaSerieFab(String usaSerieFab) {
        this.usaSerieFab = usaSerieFab;
   }

   public String getUsaSerieSepWms() {
        return usaSerieSepWms;
   }

   public void setUsaSerieSepWms(String usaSerieSepWms) {
        this.usaSerieSepWms = usaSerieSepWms;
   }

   public String getUsaStatusLote() {
        return usaStatusLote;
   }

   public void setUsaStatusLote(String usaStatusLote) {
        this.usaStatusLote = usaStatusLote;
   }

   public String getUsoProd() {
        return usoProd;
   }

   public void setUsoProd(String usoProd) {
        this.usoProd = usoProd;
   }

   public BigDecimal getUtilImob() {
        return utilImob;
   }

   public void setUtilImob(BigDecimal utilImob) {
        this.utilImob = utilImob;
   }

   public String getUtilizaWms() {
        return utilizaWms;
   }

   public void setUtilizaWms(String utilizaWms) {
        this.utilizaWms = utilizaWms;
   }

   public String getValCapM3() {
        return valCapM3;
   }

   public void setValCapM3(String valCapM3) {
        this.valCapM3 = valCapM3;
   }

   public String getValCbGlobal() {
        return valCbGlobal;
   }

   public void setValCbGlobal(String valCbGlobal) {
        this.valCbGlobal = valCbGlobal;
   }

   public String getVenCompIndiv() {
        return venCompIndiv;
   }

   public void setVenCompIndiv(String venCompIndiv) {
        this.venCompIndiv = venCompIndiv;
   }

   public BigDecimal getVlrComerc() {
        return vlrComerc;
   }

   public void setVlrComerc(BigDecimal vlrComerc) {
        this.vlrComerc = vlrComerc;
   }

   public BigDecimal getVlrParcImpExt() {
        return vlrParcImpExt;
   }

   public void setVlrParcImpExt(BigDecimal vlrParcImpExt) {
        this.vlrParcImpExt = vlrParcImpExt;
   }

   public String getVolDosagem() {
        return volDosagem;
   }

   public void setVolDosagem(String volDosagem) {
        this.volDosagem = volDosagem;
   }

   public String getVolDosagemPor() {
        return volDosagemPor;
   }

   public void setVolDosagemPor(String volDosagemPor) {
        this.volDosagemPor = volDosagemPor;
   }

   public BigDecimal getPercTolPesoMenorSep() {
        return percTolPesoMenorSep;
   }

   public void setPercTolPesoMenorSep(BigDecimal percTolPesoMenorSep) {
        this.percTolPesoMenorSep = percTolPesoMenorSep;
   }

   public String getUsaLoteDtFab() {
        return usaLoteDtFab;
   }

   public void setUsaLoteDtFab(String usaLoteDtFab) {
        this.usaLoteDtFab = usaLoteDtFab;
   }

   public String getUsaLoteDtVal() {
        return usaLoteDtVal;
   }

   public void setUsaLoteDtVal(String usaLoteDtVal) {
        this.usaLoteDtVal = usaLoteDtVal;
   }

   public String getDescVenConsul() {
        return descVenConsul;
   }

   public void setDescVenConsul(String descVenConsul) {
        this.descVenConsul = descVenConsul;
   }

   public BigDecimal getCodFiltroReq() {
        return codFiltroReq;
   }

   public void setCodFiltroReq(BigDecimal codFiltroReq) {
        this.codFiltroReq = codFiltroReq;
   }

   public String getControlMedic() {
        return controlMedic;
   }

   public void setControlMedic(String controlMedic) {
        this.controlMedic = controlMedic;
   }

   public BigDecimal getCodEnqIpiEnt() {
        return codEnqIpiEnt;
   }

   public void setCodEnqIpiEnt(BigDecimal codEnqIpiEnt) {
        this.codEnqIpiEnt = codEnqIpiEnt;
   }

   public BigDecimal getCodEnqIpiSai() {
        return codEnqIpiSai;
   }

   public void setCodEnqIpiSai(BigDecimal codEnqIpiSai) {
        this.codEnqIpiSai = codEnqIpiSai;
   }

   public BigDecimal getAliqGeral() {
        return aliqGeral;
   }

   public void setAliqGeral(BigDecimal aliqGeral) {
        this.aliqGeral = aliqGeral;
   }

   public BigDecimal getMvaPadrao() {
        return mvaPadrao;
   }

   public void setMvaPadrao(BigDecimal mvaPadrao) {
        this.mvaPadrao = mvaPadrao;
   }

   public BigDecimal getGrupoIcms2() {
        return grupoIcms2;
   }

   public void setGrupoIcms2(BigDecimal grupoIcms2) {
        this.grupoIcms2 = grupoIcms2;
   }

   public String getUsaContPesoVar() {
        return usaContPesoVar;
   }

   public void setUsaContPesoVar(String usaContPesoVar) {
        this.usaContPesoVar = usaContPesoVar;
   }

   public BigDecimal getPercTolPesoMaior() {
        return percTolPesoMaior;
   }

   public void setPercTolPesoMaior(BigDecimal percTolPesoMaior) {
        this.percTolPesoMaior = percTolPesoMaior;
   }

   public BigDecimal getPercTolPesoMaiorSep() {
        return percTolPesoMaiorSep;
   }

   public void setPercTolPesoMaiorSep(BigDecimal percTolPesoMaiorSep) {
        this.percTolPesoMaiorSep = percTolPesoMaiorSep;
   }

   public BigDecimal getPercTolPesoMenor() {
        return percTolPesoMenor;
   }

   public void setPercTolPesoMenor(BigDecimal percTolPesoMenor) {
        this.percTolPesoMenor = percTolPesoMenor;
   }

   public String getCodVolPesoVar() {
        return codVolPesoVar;
   }

   public void setCodVolPesoVar(String codVolPesoVar) {
        this.codVolPesoVar = codVolPesoVar;
   }

   public BigDecimal getPercCmtImp() {
        return percCmtImp;
   }

   public void setPercCmtImp(BigDecimal percCmtImp) {
        this.percCmtImp = percCmtImp;
   }

   public BigDecimal getPercCmtNac() {
        return percCmtNac;
   }

   public void setPercCmtNac(BigDecimal percCmtNac) {
        this.percCmtNac = percCmtNac;
   }

   public String getSerFaturCon() {
        return serFaturCon;
   }

   public void setSerFaturCon(String serFaturCon) {
        this.serFaturCon = serFaturCon;
   }

   public BigDecimal getTopFaturCon() {
        return topFaturCon;
   }

   public void setTopFaturCon(BigDecimal topFaturCon) {
        this.topFaturCon = topFaturCon;
   }

   public BigDecimal getNumItemRea() {
        return numItemRea;
   }

   public void setNumItemRea(BigDecimal numItemRea) {
        this.numItemRea = numItemRea;
   }

   public String getObsEtiqueta() {
        return obsEtiqueta;
   }

   public void setObsEtiqueta(String obsEtiqueta) {
        this.obsEtiqueta = obsEtiqueta;
   }

   public String getOrigProd() {
        return origProd;
   }

   public void setOrigProd(String origProd) {
        this.origProd = origProd;
   }

   public String getPadrao() {
        return padrao;
   }

   public void setPadrao(String padrao) {
        this.padrao = padrao;
   }

   public BigDecimal getPercAumentCusto() {
        return percAumentCusto;
   }

   public void setPercAumentCusto(BigDecimal percAumentCusto) {
        this.percAumentCusto = percAumentCusto;
   }

   public String getExigeLastroCamadas() {
        return exigeLastroCamadas;
   }

   public void setExigeLastroCamadas(String exigeLastroCamadas) {
        this.exigeLastroCamadas = exigeLastroCamadas;
   }

   public String getFixoAgenda() {
        return fixoAgenda;
   }

   public void setFixoAgenda(String fixoAgenda) {
        this.fixoAgenda = fixoAgenda;
   }

   public Timestamp getDtSubst() {
        return dtSubst;
   }

   public void setDtSubst(Timestamp dtSubst) {
        this.dtSubst = dtSubst;
   }

   public BigDecimal getCodProdSubst() {
        return codProdSubst;
   }

   public void setCodProdSubst(BigDecimal codProdSubst) {
        this.codProdSubst = codProdSubst;
   }

   public String getCat1799Spres() {
        return cat1799Spres;
   }

   public void setCat1799Spres(String cat1799Spres) {
        this.cat1799Spres = cat1799Spres;
   }

   public BigDecimal getCodComp() {
        return codComp;
   }

   public void setCodComp(BigDecimal codComp) {
        this.codComp = codComp;
   }

   public String getVisivelAppOs() {
        return visivelAppOs;
   }

   public void setVisivelAppOs(String visivelAppOs) {
        this.visivelAppOs = visivelAppOs;
   }

   public BigDecimal getCodParcConsig() {
        return codParcConsig;
   }

   public void setCodParcConsig(BigDecimal codParcConsig) {
        this.codParcConsig = codParcConsig;
   }

   public String getTipoItemSped() {
        return tipoItemSped;
   }

   public void setTipoItemSped(String tipoItemSped) {
        this.tipoItemSped = tipoItemSped;
   }

   public BigDecimal getCodIdCnae() {
        return codIdCnae;
   }

   public void setCodIdCnae(BigDecimal codIdCnae) {
        this.codIdCnae = codIdCnae;
   }

   public BigDecimal getCodNbs() {
        return codNbs;
   }

   public void setCodNbs(BigDecimal codNbs) {
        this.codNbs = codNbs;
   }

   public String getConsProdCat42() {
        return consProdCat42;
   }

   public void setConsProdCat42(String consProdCat42) {
        this.consProdCat42 = consProdCat42;
   }

   public BigDecimal getDesvioMaxTolConfSep() {
        return desvioMaxTolConfSep;
   }

   public void setDesvioMaxTolConfSep(BigDecimal desvioMaxTolConfSep) {
        this.desvioMaxTolConfSep = desvioMaxTolConfSep;
   }

   public BigDecimal getDesvioMinTolConfSep() {
        return desvioMinTolConfSep;
   }

   public void setDesvioMinTolConfSep(BigDecimal desvioMinTolConfSep) {
        this.desvioMinTolConfSep = desvioMinTolConfSep;
   }

   public String getFragmentaLote() {
        return fragmentaLote;
   }

   public void setFragmentaLote(String fragmentaLote) {
        this.fragmentaLote = fragmentaLote;
   }

   public BigDecimal getGrupoTransg() {
        return grupoTransg;
   }

   public void setGrupoTransg(BigDecimal grupoTransg) {
        this.grupoTransg = grupoTransg;
   }

   public String getMotIsencaoAnvisa() {
        return motIsencaoAnvisa;
   }

   public void setMotIsencaoAnvisa(String motIsencaoAnvisa) {
        this.motIsencaoAnvisa = motIsencaoAnvisa;
   }

   public BigDecimal getPercRedBaseIcmsEfet() {
        return percRedBaseIcmsEfet;
   }

   public void setPercRedBaseIcmsEfet(BigDecimal percRedBaseIcmsEfet) {
        this.percRedBaseIcmsEfet = percRedBaseIcmsEfet;
   }

   public String getRegistrarPeso() {
        return registrarPeso;
   }

   public void setRegistrarPeso(String registrarPeso) {
        this.registrarPeso = registrarPeso;
   }

   public String getServPrestTer() {
        return servPrestTer;
   }

   public void setServPrestTer(String servPrestTer) {
        this.servPrestTer = servPrestTer;
   }

   public BigDecimal getTempMaxima() {
        return tempMaxima;
   }

   public void setTempMaxima(BigDecimal tempMaxima) {
        this.tempMaxima = tempMaxima;
   }

   public String getControlado() {
        return controlado;
   }

   public void setControlado(String controlado) {
        this.controlado = controlado;
   }

   public BigDecimal getTempMinima() {
        return tempMinima;
   }

   public void setTempMinima(BigDecimal tempMinima) {
        this.tempMinima = tempMinima;
   }

   public String getTermolabil() {
        return termolabil;
   }

   public void setTermolabil(String termolabil) {
        this.termolabil = termolabil;
   }

   public String getListaLpm() {
        return listaLpm;
   }

   public void setListaLpm(String listaLpm) {
        this.listaLpm = listaLpm;
   }

   public String getOneroso() {
        return oneroso;
   }

   public void setOneroso(String oneroso) {
        this.oneroso = oneroso;
   }

   public String getRefMercMed() {
        return refMercMed;
   }

   public void setRefMercMed(String refMercMed) {
        this.refMercMed = refMercMed;
   }

   public String getIdenPortaria() {
        return idenPortaria;
   }

   public void setIdenPortaria(String idenPortaria) {
        this.idenPortaria = idenPortaria;
   }

   public BigDecimal getCodPat() {
        return codPat;
   }

   public void setCodPat(BigDecimal codPat) {
        this.codPat = codPat;
   }

   public BigDecimal getCodTer() {
        return codTer;
   }

   public void setCodTer(BigDecimal codTer) {
        this.codTer = codTer;
   }

   public String getIdenOtc() {
        return idenOtc;
   }

   public void setIdenOtc(String idenOtc) {
        this.idenOtc = idenOtc;
   }

   public String getIdenCosme() {
        return idenCosme;
   }

   public void setIdenCosme(String idenCosme) {
        this.idenCosme = idenCosme;
   }

   public String getIdenCorrelato() {
        return idenCorrelato;
   }

   public void setIdenCorrelato(String idenCorrelato) {
        this.idenCorrelato = idenCorrelato;
   }

   public BigDecimal getCodCpr() {
        return codCpr;
   }

   public void setCodCpr(BigDecimal codCpr) {
        this.codCpr = codCpr;
   }

   public BigDecimal getSeqSte() {
        return seqSte;
   }

   public void setSeqSte(BigDecimal seqSte) {
        this.seqSte = seqSte;
   }

   public BigDecimal getCodCat() {
        return codCat;
   }

   public void setCodCat(BigDecimal codCat) {
        this.codCat = codCat;
   }

   public BigDecimal getStatusMed() {
        return statusMed;
   }

   public void setStatusMed(BigDecimal statusMed) {
        this.statusMed = statusMed;
   }

   public BigDecimal getSeqSca() {
        return seqSca;
   }

   public void setSeqSca(BigDecimal seqSca) {
        this.seqSca = seqSca;
   }

   public String getProdFalta() {
        return prodFalta;
   }

   public void setProdFalta(String prodFalta) {
        this.prodFalta = prodFalta;
   }

   public BigDecimal getCodFab() {
        return codFab;
   }

   public void setCodFab(BigDecimal codFab) {
        this.codFab = codFab;
   }

   public BigDecimal getSeqSpr() {
        return seqSpr;
   }

   public void setSeqSpr(BigDecimal seqSpr) {
        this.seqSpr = seqSpr;
   }

   public BigDecimal getQtdIdentif() {
        return qtdIdentif;
   }

   public void setQtdIdentif(BigDecimal qtdIdentif) {
        this.qtdIdentif = qtdIdentif;
   }

   public String getTipoIdentif() {
        return tipoIdentif;
   }

   public void setTipoIdentif(String tipoIdentif) {
        this.tipoIdentif = tipoIdentif;
   }

   public String getTemMedicao() {
        return temMedicao;
   }

   public void setTemMedicao(String temMedicao) {
        this.temMedicao = temMedicao;
   }

   public BigDecimal getTipoSn() {
        return tipoSn;
   }

   public void setTipoSn(BigDecimal tipoSn) {
        this.tipoSn = tipoSn;
   }

   public BigDecimal getCodServTelecom() {
        return codServTelecom;
   }

   public void setCodServTelecom(BigDecimal codServTelecom) {
        this.codServTelecom = codServTelecom;
   }

   public String getTipoContagem() {
        return tipoContagem;
   }

   public void setTipoContagem(String tipoContagem) {
        this.tipoContagem = tipoContagem;
   }

   public String getCodAnvisa() {
        return codAnvisa;
   }

   public void setCodAnvisa(String codAnvisa) {
        this.codAnvisa = codAnvisa;
   }

   public String getDescrAnp() {
        return descrAnp;
   }

   public void setDescrAnp(String descrAnp) {
        this.descrAnp = descrAnp;
   }

   public BigDecimal getPercMistGlp() {
        return percMistGlp;
   }

   public void setPercMistGlp(BigDecimal percMistGlp) {
        this.percMistGlp = percMistGlp;
   }

   public BigDecimal getOrdemMedida() {
        return ordemMedida;
   }

   public void setOrdemMedida(BigDecimal ordemMedida) {
        this.ordemMedida = ordemMedida;
   }

   public BigDecimal getCodMarca() {
        return codMarca;
   }

   public void setCodMarca(BigDecimal codMarca) {
        this.codMarca = codMarca;
   }

   public String getTemRastroLote() {
        return temRastroLote;
   }

   public void setTemRastroLote(String temRastroLote) {
        this.temRastroLote = temRastroLote;
   }

   public String getArmazeLote() {
        return armazeLote;
   }

   public void setArmazeLote(String armazeLote) {
        this.armazeLote = armazeLote;
   }

   public BigDecimal getMvaOriginalDrCst() {
        return mvaOriginalDrCst;
   }

   public void setMvaOriginalDrCst(BigDecimal mvaOriginalDrCst) {
        this.mvaOriginalDrCst = mvaOriginalDrCst;
   }

   public String getCodFciCalc() {
        return codFciCalc;
   }

   public void setCodFciCalc(String codFciCalc) {
        this.codFciCalc = codFciCalc;
   }

   public BigDecimal getVlrComercCalc() {
        return vlrComercCalc;
   }

   public void setVlrComercCalc(BigDecimal vlrComercCalc) {
        this.vlrComercCalc = vlrComercCalc;
   }

   public BigDecimal getVlrParcImpExtCalc() {
        return vlrParcImpExtCalc;
   }

   public void setVlrParcImpExtCalc(BigDecimal vlrParcImpExtCalc) {
        this.vlrParcImpExtCalc = vlrParcImpExtCalc;
   }

   public String getCodBarComp() {
        return codBarComp;
   }

   public void setCodBarComp(String codBarComp) {
        this.codBarComp = codBarComp;
   }

   public BigDecimal getIncPesoBruto() {
        return incPesoBruto;
   }

   public void setIncPesoBruto(BigDecimal incPesoBruto) {
        this.incPesoBruto = incPesoBruto;
   }

   public BigDecimal getIncPesoLiquido() {
        return incPesoLiquido;
   }

   public void setIncPesoLiquido(BigDecimal incPesoLiquido) {
        this.incPesoLiquido = incPesoLiquido;
   }

   public BigDecimal getNuRfe() {
        return nuRfe;
   }

   public void setNuRfe(BigDecimal nuRfe) {
        this.nuRfe = nuRfe;
   }

   public BigDecimal getModEtiqSepWms() {
        return modEtiqSepWms;
   }

   public void setModEtiqSepWms(BigDecimal modEtiqSepWms) {
        this.modEtiqSepWms = modEtiqSepWms;
   }

   public String getImpEtiqSepWms() {
        return impEtiqSepWms;
   }

   public void setImpEtiqSepWms(String impEtiqSepWms) {
        this.impEtiqSepWms = impEtiqSepWms;
   }

   public String getNrProcesso() {
        return nrProcesso;
   }

   public void setNrProcesso(String nrProcesso) {
        this.nrProcesso = nrProcesso;
   }

   public BigDecimal getPercCmtMun() {
        return percCmtMun;
   }

   public void setPercCmtMun(BigDecimal percCmtMun) {
        this.percCmtMun = percCmtMun;
   }

   public BigDecimal getPercCmtFed() {
        return percCmtFed;
   }

   public void setPercCmtFed(BigDecimal percCmtFed) {
        this.percCmtFed = percCmtFed;
   }

   public BigDecimal getPercCmtEst() {
        return percCmtEst;
   }

   public void setPercCmtEst(BigDecimal percCmtEst) {
        this.percCmtEst = percCmtEst;
   }

   public BigDecimal getCorFontConsPreco() {
        return corFontConsPreco;
   }

   public void setCorFontConsPreco(BigDecimal corFontConsPreco) {
        this.corFontConsPreco = corFontConsPreco;
   }

   public BigDecimal getCorFundoConsPreco() {
        return corFundoConsPreco;
   }

   public void setCorFundoConsPreco(BigDecimal corFundoConsPreco) {
        this.corFundoConsPreco = corFundoConsPreco;
   }

   public String getCalcDifAl() {
        return calcDifAl;
   }

   public void setCalcDifAl(String calcDifAl) {
        this.calcDifAl = calcDifAl;
   }

   public BigDecimal getClassifCessaoObra() {
        return classifCessaoObra;
   }

   public void setClassifCessaoObra(BigDecimal classifCessaoObra) {
        this.classifCessaoObra = classifCessaoObra;
   }

   public String getCnpjFabricante() {
        return cnpjFabricante;
   }

   public void setCnpjFabricante(String cnpjFabricante) {
        this.cnpjFabricante = cnpjFabricante;
   }

   public String getCodAgregacao() {
        return codAgregacao;
   }

   public void setCodAgregacao(String codAgregacao) {
        this.codAgregacao = codAgregacao;
   }

   public String getCodAtivReintegra() {
        return codAtivReintegra;
   }

   public void setCodAtivReintegra(String codAtivReintegra) {
        this.codAtivReintegra = codAtivReintegra;
   }

   public String getCodBenefNauf() {
        return codBenefNauf;
   }

   public void setCodBenefNauf(String codBenefNauf) {
        this.codBenefNauf = codBenefNauf;
   }

   public String getCodCprb() {
        return codCprb;
   }

   public void setCodCprb(String codCprb) {
        this.codCprb = codCprb;
   }

   public BigDecimal getCodCtaCtbEfd() {
        return codCtaCtbEfd;
   }

   public void setCodCtaCtbEfd(BigDecimal codCtaCtbEfd) {
        this.codCtaCtbEfd = codCtaCtbEfd;
   }

   public BigDecimal getCodFiltroCta() {
        return codFiltroCta;
   }

   public void setCodFiltroCta(BigDecimal codFiltroCta) {
        this.codFiltroCta = codFiltroCta;
   }

   public String getComercializacaoAgri() {
        return comercializacaoAgri;
   }

   public void setComercializacaoAgri(String comercializacaoAgri) {
        this.comercializacaoAgri = comercializacaoAgri;
   }

   public String getIndEscala() {
        return indEscala;
   }

   public void setIndEscala(String indEscala) {
        this.indEscala = indEscala;
   }

   public BigDecimal getObraConstCivil() {
        return obraConstCivil;
   }

   public void setObraConstCivil(BigDecimal obraConstCivil) {
        this.obraConstCivil = obraConstCivil;
   }

   public BigDecimal getPercInssEspecial() {
        return percInssEspecial;
   }

   public void setPercInssEspecial(BigDecimal percInssEspecial) {
        this.percInssEspecial = percInssEspecial;
   }

   public BigDecimal getPercMistGni() {
        return percMistGni;
   }

   public void setPercMistGni(BigDecimal percMistGni) {
        this.percMistGni = percMistGni;
   }

   public String getUtilizaEndFlut() {
        return utilizaEndFlut;
   }

   public void setUtilizaEndFlut(String utilizaEndFlut) {
        this.utilizaEndFlut = utilizaEndFlut;
   }

   public BigDecimal getPercMistGnn() {
        return percMistGnn;
   }

   public void setPercMistGnn(BigDecimal percMistGnn) {
        this.percMistGnn = percMistGnn;
   }

   public BigDecimal getQtdAgrupamentoMtz() {
        return qtdAgrupamentoMtz;
   }

   public void setQtdAgrupamentoMtz(BigDecimal qtdAgrupamentoMtz) {
        this.qtdAgrupamentoMtz = qtdAgrupamentoMtz;
   }

   public String getTipoInssEspecial() {
        return tipoInssEspecial;
   }

   public void setTipoInssEspecial(String tipoInssEspecial) {
        this.tipoInssEspecial = tipoInssEspecial;
   }

   public BigDecimal getVlrPartidaGlp() {
        return vlrPartidaGlp;
   }

   public void setVlrPartidaGlp(BigDecimal vlrPartidaGlp) {
        this.vlrPartidaGlp = vlrPartidaGlp;
   }

   public String getIntegraEconect() {
        return integraEconect;
   }

   public void setIntegraEconect(String integraEconect) {
        this.integraEconect = integraEconect;
   }

   public BigDecimal getMaxMultEconect() {
        return maxMultEconect;
   }

   public void setMaxMultEconect(BigDecimal maxMultEconect) {
        this.maxMultEconect = maxMultEconect;
   }

   public String getUtilSmartCard() {
        return utilSmartCard;
   }

   public void setUtilSmartCard(String utilSmartCard) {
        this.utilSmartCard = utilSmartCard;
   }

   public BigDecimal getNatEfdContM410M810() {
        return natEfdContM410M810;
   }

   public void setNatEfdContM410M810(BigDecimal natEfdContM410M810) {
        this.natEfdContM410M810 = natEfdContM410M810;
   }

   public BigDecimal getCodVtp() {
        return codVtp;
   }

   public void setCodVtp(BigDecimal codVtp) {
        this.codVtp = codVtp;
   }

   public String getIndTipRefBcIcmsSt() {
        return indTipRefBcIcmsSt;
   }

   public void setIndTipRefBcIcmsSt(String indTipRefBcIcmsSt) {
        this.indTipRefBcIcmsSt = indTipRefBcIcmsSt;
   }

   public String getConEstOrigProd() {
        return conEstOrigProd;
   }

   public void setConEstOrigProd(String conEstOrigProd) {
        this.conEstOrigProd = conEstOrigProd;
   }

   public BigDecimal getTamanhoMedioPeca() {
        return tamanhoMedioPeca;
   }

   public void setTamanhoMedioPeca(BigDecimal tamanhoMedioPeca) {
        this.tamanhoMedioPeca = tamanhoMedioPeca;
   }

   public String getStatusNcm() {
        return statusNcm;
   }

   public void setStatusNcm(String statusNcm) {
        this.statusNcm = statusNcm;
   }

   public String getWmsProdRastSerMed() {
        return wmsProdRastSerMed;
   }

   public void setWmsProdRastSerMed(String wmsProdRastSerMed) {
        this.wmsProdRastSerMed = wmsProdRastSerMed;
   }

   public String getServDespNTrib() {
        return servDespNTrib;
   }

   public void setServDespNTrib(String servDespNTrib) {
        this.servDespNTrib = servDespNTrib;
   }

   public String getProdAliadrCst() {
        return prodAliadrCst;
   }

   public void setProdAliadrCst(String prodAliadrCst) {
        this.prodAliadrCst = prodAliadrCst;
   }

   public String getGerImpNRetReinfaq() {
        return gerImpNRetReinfaq;
   }

   public void setGerImpNRetReinfaq(String gerImpNRetReinfaq) {
        this.gerImpNRetReinfaq = gerImpNRetReinfaq;
   }

   public BigDecimal getAliqFetHab() {
        return aliqFetHab;
   }

   public void setAliqFetHab(BigDecimal aliqFetHab) {
        this.aliqFetHab = aliqFetHab;
   }

   public String getCodVolFetHab() {
        return codVolFetHab;
   }

   public void setCodVolFetHab(String codVolFetHab) {
        this.codVolFetHab = codVolFetHab;
   }

   public String getCalcFunTtelPro() {
        return calcFunTtelPro;
   }

   public void setCalcFunTtelPro(String calcFunTtelPro) {
        this.calcFunTtelPro = calcFunTtelPro;
   }

   public String getCalcFustPro() {
        return calcFustPro;
   }

   public void setCalcFustPro(String calcFustPro) {
        this.calcFustPro = calcFustPro;
   }

   public BigDecimal getTipUtilCom() {
        return tipUtilCom;
   }

   public void setTipUtilCom(BigDecimal tipUtilCom) {
        this.tipUtilCom = tipUtilCom;
   }

   public String getCodBarDifGtin() {
        return codBarDifGtin;
   }

   public void setCodBarDifGtin(String codBarDifGtin) {
        this.codBarDifGtin = codBarDifGtin;
   }

   public String getCodBarTribDifGtin() {
        return codBarTribDifGtin;
   }

   public void setCodBarTribDifGtin(String codBarTribDifGtin) {
        this.codBarTribDifGtin = codBarTribDifGtin;
   }

   public String getProdInterno() {
        return prodInterno;
   }

   public void setProdInterno(String prodInterno) {
        this.prodInterno = prodInterno;
   }

   public BigDecimal getAliqImp() {
        return aliqImp;
   }

   public void setAliqImp(BigDecimal aliqImp) {
        this.aliqImp = aliqImp;
   }

   public BigDecimal getAliqNac() {
        return aliqNac;
   }

   public void setAliqNac(BigDecimal aliqNac) {
        this.aliqNac = aliqNac;
   }

   public String getAtuNuVersao() {
        return atuNuVersao;
   }

   public void setAtuNuVersao(String atuNuVersao) {
        this.atuNuVersao = atuNuVersao;
   }

   public BigDecimal getIntegraFox() {
        return integraFox;
   }

   public void setIntegraFox(BigDecimal integraFox) {
        this.integraFox = integraFox;
   }

   public BigDecimal getNuVersao() {
        return nuVersao;
   }

   public void setNuVersao(BigDecimal nuVersao) {
        this.nuVersao = nuVersao;
   }

   public char[] getGradePadrao() {
        return gradePadrao;
   }

   public void setGradePadrao(char[] gradePadrao) {
        this.gradePadrao = gradePadrao;
   }

   public BigDecimal getIdGrade() {
        return idGrade;
   }

   public void setIdGrade(BigDecimal idGrade) {
        this.idGrade = idGrade;
   }

   public BigDecimal getPercentSepPul() {
        return percentSepPul;
   }

   public void setPercentSepPul(BigDecimal percentSepPul) {
        this.percentSepPul = percentSepPul;
   }

   public String getObtStAntMedEnt() {
        return obtStAntMedEnt;
   }

   public void setObtStAntMedEnt(String obtStAntMedEnt) {
        this.obtStAntMedEnt = obtStAntMedEnt;
   }

   public String getDescProdDrCst() {
        return descProdDrCst;
   }

   public void setDescProdDrCst(String descProdDrCst) {
        this.descProdDrCst = descProdDrCst;
   }

   public BigDecimal getAliqInternaCat42() {
        return aliqInternaCat42;
   }

   public void setAliqInternaCat42(BigDecimal aliqInternaCat42) {
        this.aliqInternaCat42 = aliqInternaCat42;
   }

   public String getDesDescCalcPis() {
        return desDescCalcPis;
   }

   public void setDesDescCalcPis(String desDescCalcPis) {
        this.desDescCalcPis = desDescCalcPis;
   }

   public BigDecimal getAliqFecop() {
        return aliqFecop;
   }

   public void setAliqFecop(BigDecimal aliqFecop) {
        this.aliqFecop = aliqFecop;
   }

   public BigDecimal getMvaOriginalAdrCst() {
        return mvaOriginalAdrCst;
   }

   public void setMvaOriginalAdrCst(BigDecimal mvaOriginalAdrCst) {
        this.mvaOriginalAdrCst = mvaOriginalAdrCst;
   }

   public String getParticipaAdrCst() {
        return participaAdrCst;
   }

   public void setParticipaAdrCst(String participaAdrCst) {
        this.participaAdrCst = participaAdrCst;
   }

   public String getProdSujFecop() {
        return prodSujFecop;
   }

   public void setProdSujFecop(String prodSujFecop) {
        this.prodSujFecop = prodSujFecop;
   }

   public String getCalRupturaEstoque() {
        return calRupturaEstoque;
   }

   public void setCalRupturaEstoque(String calRupturaEstoque) {
        this.calRupturaEstoque = calRupturaEstoque;
   }

   public String getCodVolKanban() {
        return codVolKanban;
   }

   public void setCodVolKanban(String codVolKanban) {
        this.codVolKanban = codVolKanban;
   }

   public String getBloqVendaFrac() {
        return bloqVendaFrac;
   }

   public void setBloqVendaFrac(String bloqVendaFrac) {
        this.bloqVendaFrac = bloqVendaFrac;
   }

   public BigDecimal getCodNatRend() {
        return codNatRend;
   }

   public void setCodNatRend(BigDecimal codNatRend) {
        this.codNatRend = codNatRend;
   }

   public BigDecimal getTpIrrfExt() {
        return tpIrrfExt;
   }

   public void setTpIrrfExt(BigDecimal tpIrrfExt) {
        this.tpIrrfExt = tpIrrfExt;
   }

   public BigDecimal getPercIndMistura() {
        return percIndMistura;
   }

   public void setPercIndMistura(BigDecimal percIndMistura) {
        this.percIndMistura = percIndMistura;
   }

   public String getOpExpFetHab() {
        return opExpFetHab;
   }

   public void setOpExpFetHab(String opExpFetHab) {
        this.opExpFetHab = opExpFetHab;
   }

   public String getOpeIntEstFetHab() {
        return opeIntEstFetHab;
   }

   public void setOpeIntEstFetHab(String opeIntEstFetHab) {
        this.opeIntEstFetHab = opeIntEstFetHab;
   }

   public String getOpeIntFetHab() {
        return opeIntFetHab;
   }

   public void setOpeIntFetHab(String opeIntFetHab) {
        this.opeIntFetHab = opeIntFetHab;
   }

   @Override
   public String getTableName() {
        return "TGFPRO";
   }

   @Override
   public String getEntityName() {
        return "TarifasCIP";
   }

   @Override
   public TarifasCIP fromVO(DynamicVO vo) {
        this.codProdSubKit = vo.asBigDecimal("CODPRODSUBKIT");
        this.enqReintegra = vo.asString("ENQREINTEGRA");
        this.margLucro = vo.asBigDecimal("MARGLUCRO");
        this.codGProd = vo.asBigDecimal("CODGPROD");
        this.codEspecSt = vo.asBigDecimal("CODESPECST");
        this.codAnp = vo.asBigDecimal("CODANP");
        this.codAreaSep = vo.asBigDecimal("CODAREASEP");
        this.codFormaPonta = vo.asBigDecimal("CODFORMAPONTA");
        this.codFormPrec = vo.asBigDecimal("CODFORMPREC");
        this.codGar = vo.asBigDecimal("CODGAR");
        this.codGenero = vo.asBigDecimal("CODGENERO");
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        this.codIcmsFast = vo.asBigDecimal("CODICMSFAST");
        this.codIpi = vo.asBigDecimal("CODIPI");
        this.codLocalPadrao = vo.asBigDecimal("CODLOCALPADRAO");
        this.codLst = vo.asBigDecimal("CODLST");
        this.medAux = vo.asBigDecimal("MEDAUX");
        this.modoAplic = vo.asString("MODOAPLIC");
        this.motivoIncexc = vo.asString("MOTIVOINCEXC");
        this.multipVenda = vo.asBigDecimal("MULTIPVENDA");
        this.mvaAjustado = vo.asBigDecimal("MVAAJUSTADO");
        this.naturezaOperDes = vo.asString("NATUREZAOPERDES");
        this.ncm = vo.asString("NCM");
        this.acrescMax = vo.asBigDecimal("ACRESCMAX");
        this.agrupCompMinimo = vo.asBigDecimal("AGRUPCOMPMINIMO");
        this.agrupMin = vo.asBigDecimal("AGRUPMIN");
        this.alertaEstMin = vo.asString("ALERTAESTMIN");
        this.aliqIcmsIntEfd = vo.asBigDecimal("ALIQICMSINTEFD");
        this.altura = vo.asBigDecimal("ALTURA");
        this.ap1RctEgo = vo.asString("AP1RCTEGO");
        this.aplicacao = vo.asBigDecimal("APLICACAO");
        this.aplicaSazo = vo.asString("APLICASAZO");
        this.apresDetalhe = vo.asString("APRESDETALHE");
        this.apresForm = vo.asString("APRESFORM");
        this.apuraProdepe = vo.asString("APURAPRODEPE");
        this.arredAgrup = vo.asBigDecimal("ARREDAGRUP");
        this.arredPreco = vo.asBigDecimal("ARREDPRECO");
        this.ativo = vo.asString("ATIVO");
        this.balanca = vo.asString("BALANCA");
        this.calcGiro = vo.asString("CALCULOGIRO");
        this.camadas = vo.asBigDecimal("CAMADAS");
        this.caracteristicas = vo.asString("CARACTERISTICAS");
        this.carencia = vo.asBigDecimal("CARENCIA");
        this.cientifico = vo.asString("CIENTIFICO");
        this.classeAgt = vo.asBigDecimal("CLASSEAGT");
        this.classeTox = vo.asBigDecimal("CLASSETOX");
        this.classUbTrib = vo.asBigDecimal("CLASSUBTRIB");
        this.cnae = vo.asBigDecimal("CNAE");
        this.lisContest = vo.asString("LISCONTEST");
        this.local = vo.asString("LOCAL");
        this.localizacao = vo.asString("LOCALIZACAO");
        this.loteCompMinimo = vo.asBigDecimal("LOTECOMPMINIMO");
        this.loteCompras = vo.asBigDecimal("LOTECOMPRAS");
        this.m3 = vo.asBigDecimal("M3");
        this.manejoInt = vo.asString("MANEJOINT");
        this.marca = vo.asString("MARCA");
        this.nomeTab = vo.asString("NOMETAB");
        this.notifConf = vo.asString("NOTIFCONF");
        this.codMoeda = vo.asBigDecimal("CODMOEDA");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codPais = vo.asBigDecimal("CODPAIS");
        this.codParcForn = vo.asBigDecimal("CODPARCFORN");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codProdAgrupApt = vo.asBigDecimal("CODPRODAGRUPAPT");
        this.codProdAgrupAptEnc = vo.asBigDecimal("CODPRODAGRUPAPTENC");
        this.codProdRoi = vo.asString("CODPRODROI");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.codRegMapa = vo.asString("CODREGMAPA");
        this.codRfa = vo.asBigDecimal("CODRFA");
        this.codTab = vo.asBigDecimal("CODTAB");
        this.codTribMunIss = vo.asString("CODTRIBMUNISS");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVol = vo.asString("CODVOL");
        this.codVolCompra = vo.asString("CODVOLCOMPRA");
        this.codVolPlan = vo.asString("CODVOLPLAN");
        this.codVolRes = vo.asString("CODVOLRES");
        this.comGer = vo.asBigDecimal("COMGER");
        this.complDesc = vo.asString("COMPLDESC");
        this.compoNoBrig = vo.asString("COMPONOBRIG");
        this.comVend = vo.asBigDecimal("COMVEND");
        this.concentracao = vo.asString("CONCENTRACAO");
        this.confCegaPeso = vo.asString("CONFCEGAPESO");
        this.confere = vo.asString("CONFERE");
        this.converVol = vo.asBigDecimal("CONVERVOL");
        this.cstIpiEnt = vo.asBigDecimal("CSTIPIENT");
        this.cstIpiSai = vo.asBigDecimal("CSTIPISAI");
        this.cultura = vo.asString("CULTURA");
        this.decCusto = vo.asBigDecimal("DECCUSTO");
        this.decQtd = vo.asBigDecimal("DECQTD");
        this.decVlr = vo.asBigDecimal("DECVLR");
        this.descMax = vo.asBigDecimal("DESCMAX");
        this.descMaxFlex = vo.asBigDecimal("DESCMAXFLEX");
        this.descrProd = vo.asString("DESCRPROD");
        this.descrProdNfe = vo.asString("DESCRPRODNFE");
        this.desvioMax = vo.asBigDecimal("DESVIOMAX");
        this.diasExpedicao = vo.asBigDecimal("DIASEXPEDICAO");
        this.dimensoes = vo.asString("DIMENSOES");
        this.dosagem = vo.asBigDecimal("DOSAGEM");
        this.dosagemPor = vo.asBigDecimal("DOSAGEMPOR");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtAlterEmq = vo.asTimestamp("DTALTEREMQ");
        this.dtAlterEsq = vo.asTimestamp("DTALTERESQ");
        this.dtValDif = vo.asString("DTVALDIF");
        this.endImagem = vo.asString("ENDIMAGEM");
        this.endModRotulo = vo.asString("ENDMODROTULO");
        this.epocaAplic = vo.asString("EPOCAAPLIC");
        this.espessura = vo.asBigDecimal("ESPESSURA");
        this.estMax = vo.asBigDecimal("ESTMAX");
        this.estMaxDias = vo.asBigDecimal("ESTMAXDIAS");
        this.estMaxQtd = vo.asBigDecimal("ESTMAXQTD");
        this.estMin = vo.asBigDecimal("ESTMIN");
        this.estSegDias = vo.asBigDecimal("ESTSEGDIAS");
        this.estSegQtd = vo.asBigDecimal("ESTSEGQTD");
        this.excluirConf = vo.asString("EXCLUIRCONF");
        this.exigeBenefic = vo.asString("EXIGEBENEFIC");
        this.fabricante = vo.asString("FABRICANTE");
        this.fatTotal = vo.asString("FATTOTAL");
        this.flex = vo.asString("FLEX");
        this.formulacao = vo.asString("FORMULACAO");
        this.geraPlAProd = vo.asString("GERAPLAPROD");
        this.grupoCofins = vo.asString("GRUPOCOFINS");
        this.grupoCssl = vo.asString("GRUPOCSSL");
        this.grupoDescProd = vo.asString("GRUPODESCPROD");
        this.grupoIcms = vo.asBigDecimal("GRUPOICMS");
        this.grupoPis = vo.asString("GRUPOPIS");
        this.grupoQuimico = vo.asBigDecimal("GRUPOQUIMICO");
        this.homePage = vo.asString("HOMEPAGE");
        this.hrDobrada = vo.asString("HRDOBRADA");
        this.icmsGerencia = vo.asString("ICMSGERENCIA");
        this.idenImob = vo.asBigDecimal("IDENTIMOB");
        this.imagem = vo.asBlob("IMAGEM");
        this.impEtiqConf = vo.asString("IMPETIQCONF");
        this.impLaudoLote = vo.asString("IMPLAUDOLOTE");
        this.impOrdemCorte = vo.asString("IMPORDEMCORTE");
        this.indEspProdepe = vo.asString("INDESPPRODEPE");
        this.infPureza = vo.asString("INFPUREZA");
        this.intervalo = vo.asBigDecimal("INTERVALO");
        this.largura = vo.asBigDecimal("LARGURA");
        this.lastro = vo.asBigDecimal("LASTRO");
        this.leadTime = vo.asBigDecimal("LEADTIME");
        this.codAutCodif = vo.asString("CODAUTCODIF");
        this.codBarBalanca = vo.asString("CODBARBALANCA");
        this.codCenCus = vo.asBigDecimal("CODCENCUS");
        this.codCos = vo.asBigDecimal("CODCOS");
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.codCtaCtb2 = vo.asBigDecimal("CODCTACTB2");
        this.codCtaCtb3 = vo.asBigDecimal("CODCTACTB3");
        this.codCtaCtb4 = vo.asBigDecimal("CODCTACTB4");
        this.codFci = vo.asString("CODFCI");
        this.codFiltro = vo.asBigDecimal("CODFILTRO");
        this.tipoKit = vo.asString("TIPOKIT");
        this.codConfKit = vo.asBigDecimal("CODCONFKIT");
        this.codExNcm = vo.asBigDecimal("CODEXNCM");
        this.percInss = vo.asBigDecimal("PERCINSS");
        this.percIrf = vo.asBigDecimal("PERCIRF");
        this.percQuebraTec = vo.asBigDecimal("PERCQUEBRATEC");
        this.permCompProd = vo.asString("PERMCOMPPROD");
        this.pesoBruto = vo.asBigDecimal("PESOBRUTO");
        this.pesoLiq = vo.asBigDecimal("PESOLIQ");
        this.prazoVal = vo.asBigDecimal("PRAZOVAL");
        this.princAtivo = vo.asBigDecimal("PRINCATIVO");
        this.produtoNfe = vo.asBigDecimal("PRODUTONFE");
        this.promocao = vo.asString("PROMOCAO");
        this.qtdEmb = vo.asBigDecimal("QTDEMB");
        this.qtdNfLaudosInt = vo.asBigDecimal("QTDNFLAUDOSINT");
        this.rastrEstoque = vo.asString("RASTRESTOQUE");
        this.receituario = vo.asString("RECEITUARIO");
        this.recupAvaria = vo.asString("RECUPAVARIA");
        this.redBaseInss = vo.asBigDecimal("REDBASEINSS");
        this.redBaseIrf = vo.asBigDecimal("REDBASEIRF");
        this.referencia = vo.asString("REFERENCIA");
        this.refForn = vo.asString("REFFORN");
        this.regraWms = vo.asString("REGRAWMS");
        this.remeter = vo.asString("REMETER");
        this.rendimento = vo.asString("RENDIMENTO");
        this.rendimentoHa = vo.asBigDecimal("RENDIMENTOHA");
        this.selecionado = vo.asString("SELECIONADO");
        this.shelfLife = vo.asBigDecimal("SHELFLIFE");
        this.shelfLifeMin = vo.asBigDecimal("SHELFLIFEMIN");
        this.solCompra = vo.asString("SOLCOMPRA");
        this.statusIncexc = vo.asString("STATUSINCEXC");
        this.tamLote = vo.asBigDecimal("TAMLOTE");
        this.tamSerie = vo.asBigDecimal("TAMSERIE");
        this.temCiap = vo.asString("TEMCIAP");
        this.temComissao = vo.asString("TEMCOMISSAO");
        this.temCredPisCofinsDepr = vo.asString("TEMCREDPISCOFINSDEPR");
        this.temIcms = vo.asString("TEMICMS");
        this.temInss = vo.asString("TEMINSS");
        this.temIpiCompra = vo.asString("TEMIPICOMPRA");
        this.temIpiVenda = vo.asString("TEMIPIVENDA");
        this.temIrf = vo.asString("TEMIRF");
        this.temIss = vo.asString("TEMISS");
        this.tempoServ = vo.asTimestamp("TEMPOSERV");
        this.tipContest = vo.asString("TIPCONTEST");
        this.tipContestWms = vo.asString("TIPCONTESTWMS");
        this.tipGtinNfe = vo.asBigDecimal("TIPGTINNFE");
        this.tipLancNota = vo.asString("TIPLANCNOTA");
        this.tipo = vo.asString("TIPO");
        this.tipSerNfe = vo.asString("TIPSERNFE");
        this.tipSubst = vo.asString("TIPSUBST");
        this.titContest = vo.asString("TITCONTEST");
        this.unidade = vo.asString("UNIDADE");
        this.unidMinArmaz = vo.asString("UNIDMINARMAZ");
        this.usaCodBarrasQtd = vo.asString("USACODBARRASQTD");
        this.usaImpAgrupMin = vo.asString("USAIMPAGRUPMIN");
        this.usaLocal = vo.asString("USALOCAL");
        this.usaSerieFab = vo.asString("USASERIEFAB");
        this.usaSerieSepWms = vo.asString("USASERIESEPWMS");
        this.usaStatusLote = vo.asString("USASTATUSLOTE");
        this.usoProd = vo.asString("USOPROD");
        this.utilImob = vo.asBigDecimal("UTILIMOB");
        this.utilizaWms = vo.asString("UTILIZAWMS");
        this.valCapM3 = vo.asString("VALCAPM3");
        this.valCbGlobal = vo.asString("VALCBGLOBAL");
        this.venCompIndiv = vo.asString("VENCOMPINDIV");
        this.vlrComerc = vo.asBigDecimal("VLRCOMERC");
        this.vlrParcImpExt = vo.asBigDecimal("VLRPARCIMPEXT");
        this.volDosagem = vo.asString("VOLDOSAGEM");
        this.volDosagemPor = vo.asString("VOLDOSAGEMPOR");
        this.percTolPesoMenorSep = vo.asBigDecimal("PERCTOLPESOMENORSEP");
        this.usaLoteDtFab = vo.asString("USALOTEDTFAB");
        this.usaLoteDtVal = vo.asString("USALOTEDTVAL");
        this.descVenConsul = vo.asString("DESCVENCONSUL");
        this.codFiltroReq = vo.asBigDecimal("CODFILTROREQ");
        this.controlMedic = vo.asString("CONTROLMEDIC");
        this.codEnqIpiEnt = vo.asBigDecimal("CODENQIPIENT");
        this.codEnqIpiSai = vo.asBigDecimal("CODENQIPISAI");
        this.aliqGeral = vo.asBigDecimal("ALIQGERAL");
        this.mvaPadrao = vo.asBigDecimal("MVAPADRAO");
        this.grupoIcms2 = vo.asBigDecimal("GRUPOICMS2");
        this.usaContPesoVar = vo.asString("USACONTPESOVAR");
        this.percTolPesoMaior = vo.asBigDecimal("PERCTOLPESOMAIOR");
        this.percTolPesoMaiorSep = vo.asBigDecimal("PERCTOLPESOMAIORSEP");
        this.percTolPesoMenor = vo.asBigDecimal("PERCTOLPESOMENOR");
        this.codVolPesoVar = vo.asString("CODVOLPESOVAR");
        this.percCmtImp = vo.asBigDecimal("PERCCMTIMP");
        this.percCmtNac = vo.asBigDecimal("PERCCMTNAC");
        this.serFaturCon = vo.asString("SERFATURCON");
        this.topFaturCon = vo.asBigDecimal("TOPFATURCON");
        this.numItemRea = vo.asBigDecimal("NUMITEMREA");
        this.obsEtiqueta = vo.asString("OBSETIQUETA");
        this.origProd = vo.asString("ORIGPROD");
        this.padrao = vo.asString("PADRAO");
        this.percAumentCusto = vo.asBigDecimal("PERCAUMENTCUSTO");
        this.exigeLastroCamadas = vo.asString("EXIGELASTROCAMADAS");
        this.fixoAgenda = vo.asString("FIXOAGENDA");
        this.dtSubst = vo.asTimestamp("DTSUBST");
        this.codProdSubst = vo.asBigDecimal("CODPRODSUBST");
        this.cat1799Spres = vo.asString("CAT1799SPRES");
        this.codComp = vo.asBigDecimal("CODCOMP");
        this.visivelAppOs = vo.asString("VISIVELAPPOS");
        this.codParcConsig = vo.asBigDecimal("CODPARCCONSIG");
        this.tipoItemSped = vo.asString("TIPOITEMSPED");
        this.codIdCnae = vo.asBigDecimal("CODIDCNAE");
        this.codNbs = vo.asBigDecimal("CODNBS");
        this.consProdCat42 = vo.asString("CONSPRODCAT42");
        this.desvioMaxTolConfSep = vo.asBigDecimal("DESVIOMAXTOLCONFSEP");
        this.desvioMinTolConfSep = vo.asBigDecimal("DESVIOMINTOLCONFSEP");
        this.fragmentaLote = vo.asString("FRAGMENTALOTE");
        this.grupoTransg = vo.asBigDecimal("GRUPOTRANSG");
        this.motIsencaoAnvisa = vo.asString("MOTISENCAOANVISA");
        this.percRedBaseIcmsEfet = vo.asBigDecimal("PERCREDBASEICMSEFET");
        this.registrarPeso = vo.asString("REGISTRARPESO");
        this.servPrestTer = vo.asString("SERVPRESTTER");
        this.tempMaxima = vo.asBigDecimal("TEMPMAXIMA");
        this.controlado = vo.asString("CONTROLADO");
        this.tempMinima = vo.asBigDecimal("TEMPMINIMA");
        this.termolabil = vo.asString("TERMOLABIL");
        this.listaLpm = vo.asString("LISTALPM");
        this.oneroso = vo.asString("ONEROSO");
        this.refMercMed = vo.asString("REFMERCMED");
        this.idenPortaria = vo.asString("IDENPORTARIA");
        this.codPat = vo.asBigDecimal("CODPAT");
        this.codTer = vo.asBigDecimal("CODTER");
        this.idenOtc = vo.asString("IDENOTC");
        this.idenCosme = vo.asString("IDENCOSME");
        this.idenCorrelato = vo.asString("IDENCORRELATO");
        this.codCpr = vo.asBigDecimal("CODCPR");
        this.seqSte = vo.asBigDecimal("SEQSTE");
        this.codCat = vo.asBigDecimal("CODCAT");
        this.statusMed = vo.asBigDecimal("STATUSMED");
        this.seqSca = vo.asBigDecimal("SEQSCA");
        this.prodFalta = vo.asString("PRODFALTA");
        this.codFab = vo.asBigDecimal("CODFAB");
        this.seqSpr = vo.asBigDecimal("SEQSPR");
        this.qtdIdentif = vo.asBigDecimal("QTDIDENTIF");
        this.tipoIdentif = vo.asString("TIPOIDENTIF");
        this.temMedicao = vo.asString("TEMMEDICAO");
        this.tipoSn = vo.asBigDecimal("TIPOSN");
        this.codServTelecom = vo.asBigDecimal("CODSERVTELECOM");
        this.tipoContagem = vo.asString("TIPOCONTAGEM");
        this.codAnvisa = vo.asString("CODANVISA");
        this.descrAnp = vo.asString("DESCRANP");
        this.percMistGlp = vo.asBigDecimal("PERCMISTGLP");
        this.ordemMedida = vo.asBigDecimal("ORDEMMEDIDA");
        this.codMarca = vo.asBigDecimal("CODMARCA");
        this.temRastroLote = vo.asString("TEMRASTROLOTE");
        this.armazeLote = vo.asString("ARMAZELOTE");
        this.mvaOriginalDrCst = vo.asBigDecimal("MVAORIGINALDRCST");
        this.codFciCalc = vo.asString("CODFCICALC");
        this.vlrComercCalc = vo.asBigDecimal("VLRCOMERCCALC");
        this.vlrParcImpExtCalc = vo.asBigDecimal("VLRPARCIMPEXTCALC");
        this.codBarComp = vo.asString("CODBARCOMP");
        this.incPesoBruto = vo.asBigDecimal("INCPESOBRUTO");
        this.incPesoLiquido = vo.asBigDecimal("INCPESOLIQUIDO");
        this.nuRfe = vo.asBigDecimal("NURFE");
        this.modEtiqSepWms = vo.asBigDecimal("MODETIQSEPWMS");
        this.impEtiqSepWms = vo.asString("IMPETIQSEPWMS");
        this.nrProcesso = vo.asString("NROPROCESSO");
        this.percCmtMun = vo.asBigDecimal("PERCCMTMUN");
        this.percCmtFed = vo.asBigDecimal("PERCCMTFED");
        this.percCmtEst = vo.asBigDecimal("PERCCMTEST");
        this.corFontConsPreco = vo.asBigDecimal("CORFONTCONSPRECO");
        this.corFundoConsPreco = vo.asBigDecimal("CORFUNDOCONSPRECO");
        this.calcDifAl = vo.asString("CALCDIFAL");
        this.classifCessaoObra = vo.asBigDecimal("CLASSIFCESSAOOBRA");
        this.cnpjFabricante = vo.asString("CNPJFABRICANTE");
        this.codAgregacao = vo.asString("CODAGREGACAO");
        this.codAtivReintegra = vo.asString("CODATIVREINTEGRA");
        this.codBenefNauf = vo.asString("CODBENEFNAUF");
        this.codCprb = vo.asString("CODCPRB");
        this.codCtaCtbEfd = vo.asBigDecimal("CODCTACTBEFD");
        this.codFiltroCta = vo.asBigDecimal("CODFILTROCTA");
        this.comercializacaoAgri = vo.asString("COMERCIALIZACAOAGRI");
        this.indEscala = vo.asString("INDESCALA");
        this.obraConstCivil = vo.asBigDecimal("OBRACONSTCIVIL");
        this.percInssEspecial = vo.asBigDecimal("PERCINSSESPECIAL");
        this.percMistGni = vo.asBigDecimal("PERCMISTGNI");
        this.utilizaEndFlut = vo.asString("UTILIZAENDFLUT");
        this.percMistGnn = vo.asBigDecimal("PERCMISTGNN");
        this.qtdAgrupamentoMtz = vo.asBigDecimal("QTDAGRUPAMENTOMTZ");
        this.tipoInssEspecial = vo.asString("TIPOINSSESPECIAL");
        this.vlrPartidaGlp = vo.asBigDecimal("VLRPARTIDAGLP");
        this.integraEconect = vo.asString("INTEGRAECONECT");
        this.maxMultEconect = vo.asBigDecimal("MAXMULTECONECT");
        this.utilSmartCard = vo.asString("UTILSMARTCARD");
        this.natEfdContM410M810 = vo.asBigDecimal("NATEFDCONTM410M810");
        this.codVtp = vo.asBigDecimal("CODVTP");
        this.indTipRefBcIcmsSt = vo.asString("INDTIPREFBCICMSST");
        this.conEstOrigProd = vo.asString("CONESTORIGPROD");
        this.tamanhoMedioPeca = vo.asBigDecimal("TAMANHOMEDIOPECA");
        this.statusNcm = vo.asString("STATUSNCM");
        this.wmsProdRastSerMed = vo.asString("WMSPRODRASTSERMED");
        this.servDespNTrib = vo.asString("SERVDESPNTRIB");
        this.prodAliadrCst = vo.asString("PRODALIADRCST");
        this.gerImpNRetReinfaq = vo.asString("GERIMPNRETREINFAQ");
        this.aliqFetHab = vo.asBigDecimal("ALIQFETHAB");
        this.codVolFetHab = vo.asString("CODVOLFETHAB");
        this.calcFunTtelPro = vo.asString("CALCFUNTTELPRO");
        this.calcFustPro = vo.asString("CALCFUSTPRO");
        this.tipUtilCom = vo.asBigDecimal("TIPUTILCOM");
        this.codBarDifGtin = vo.asString("CODBARDIFGTIN");
        this.codBarTribDifGtin = vo.asString("CODBARTRIBDIFGTIN");
        this.prodInterno = vo.asString("PRODINTERNO");
        this.aliqImp = vo.asBigDecimal("ALIQIMP");
        this.aliqNac = vo.asBigDecimal("ALIQNAC");
        this.atuNuVersao = vo.asString("ATUNUVERSAO");
        this.integraFox = vo.asBigDecimal("INTEGRAFOX");
        this.nuVersao = vo.asBigDecimal("NUVERSAO");
        this.gradePadrao = vo.asClob("GRADEPADRAO");
        this.idGrade = vo.asBigDecimal("IDGRADE");
        this.percentSepPul = vo.asBigDecimal("PERCENTSEPPUL");
        this.obtStAntMedEnt = vo.asString("OBTSTANTMEDENT");
        this.descProdDrCst = vo.asString("DESCPRODDRCST");
        this.aliqInternaCat42 = vo.asBigDecimal("ALIQINTERNACAT42");
        this.desDescCalcPis = vo.asString("DESDESCCALCPIS");
        this.aliqFecop = vo.asBigDecimal("ALIQFECOP");
        this.mvaOriginalAdrCst = vo.asBigDecimal("MVAORIGINALADRCST");
        this.participaAdrCst = vo.asString("PARTICIPAADRCST");
        this.prodSujFecop = vo.asString("PRODSUJFECOP");
        this.calRupturaEstoque = vo.asString("CALRUPTURAESTOQUE");
        this.codVolKanban = vo.asString("CODVOLKANBAN");
        this.bloqVendaFrac = vo.asString("BLOQVENDAFRAC");
        this.codNatRend = vo.asBigDecimal("CODNATREND");
        this.tpIrrfExt = vo.asBigDecimal("TPIRRFEXT");
        this.percIndMistura = vo.asBigDecimal("PERCINDMISTURA");
        this.opExpFetHab = vo.asString("OPEEXPFETHAB");
        this.opeIntEstFetHab = vo.asString("OPEINTESTFETHAB");
        this.opeIntFetHab = vo.asString("OPEINTFETHAB");
        return this;
   }
}
