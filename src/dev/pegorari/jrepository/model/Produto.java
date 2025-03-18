package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Produto extends AbstractSankhyaEntity<Produto> {
   private BigDecimal codProdSubkit;
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
   private String apuraProdEpe;
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
   private String lisContEst;
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
   private String componObrig;
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
   private String geraPlProd;
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
   private String implAudLote;
   private String impOrdemCorte;
   private String indEspProdEpe;
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
   private String tipContEst;
   private String tipContEstWms;
   private BigDecimal tipGtinNfe;
   private String tipLancNota;
   private String tipo;
   private String tipSerNfe;
   private String tipSubst;
   private String titContEst;
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
   private String idenCorRelato;
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
   private String nroProcesso;
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
   private String gerImpNRetReinfaQ;
   private BigDecimal aliqFetHab;
   private String codVolFetHab;
   private String calcFuntTelPro;
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

   public BigDecimal getCodProdSubkit() {
        return codProdSubkit;
   }

   public void setCodProdSubkit(BigDecimal codProdSubkit) {
        markAsChanged("CODPRODSUBKIT", codProdSubkit);
        this.codProdSubkit = codProdSubkit;
   }

   public String getEnqReintegra() {
        return enqReintegra;
   }

   public void setEnqReintegra(String enqReintegra) {
        markAsChanged("ENQREINTEGRA", enqReintegra);
        this.enqReintegra = enqReintegra;
   }

   public BigDecimal getMargLucro() {
        return margLucro;
   }

   public void setMargLucro(BigDecimal margLucro) {
        markAsChanged("MARGLUCRO", margLucro);
        this.margLucro = margLucro;
   }

   public BigDecimal getCodGProd() {
        return codGProd;
   }

   public void setCodGProd(BigDecimal codGProd) {
        markAsChanged("CODGPROD", codGProd);
        this.codGProd = codGProd;
   }

   public BigDecimal getCodEspecSt() {
        return codEspecSt;
   }

   public void setCodEspecSt(BigDecimal codEspecSt) {
        markAsChanged("CODESPECST", codEspecSt);
        this.codEspecSt = codEspecSt;
   }

   public BigDecimal getCodAnp() {
        return codAnp;
   }

   public void setCodAnp(BigDecimal codAnp) {
        markAsChanged("CODANP", codAnp);
        this.codAnp = codAnp;
   }

   public BigDecimal getCodAreaSep() {
        return codAreaSep;
   }

   public void setCodAreaSep(BigDecimal codAreaSep) {
        markAsChanged("CODAREASEP", codAreaSep);
        this.codAreaSep = codAreaSep;
   }

   public BigDecimal getCodFormaPonta() {
        return codFormaPonta;
   }

   public void setCodFormaPonta(BigDecimal codFormaPonta) {
        markAsChanged("CODFORMAPONTA", codFormaPonta);
        this.codFormaPonta = codFormaPonta;
   }

   public BigDecimal getCodFormPrec() {
        return codFormPrec;
   }

   public void setCodFormPrec(BigDecimal codFormPrec) {
        markAsChanged("CODFORMPREC", codFormPrec);
        this.codFormPrec = codFormPrec;
   }

   public BigDecimal getCodGar() {
        return codGar;
   }

   public void setCodGar(BigDecimal codGar) {
        markAsChanged("CODGAR", codGar);
        this.codGar = codGar;
   }

   public BigDecimal getCodGenero() {
        return codGenero;
   }

   public void setCodGenero(BigDecimal codGenero) {
        markAsChanged("CODGENERO", codGenero);
        this.codGenero = codGenero;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getCodIcmsFast() {
        return codIcmsFast;
   }

   public void setCodIcmsFast(BigDecimal codIcmsFast) {
        markAsChanged("CODICMSFAST", codIcmsFast);
        this.codIcmsFast = codIcmsFast;
   }

   public BigDecimal getCodIpi() {
        return codIpi;
   }

   public void setCodIpi(BigDecimal codIpi) {
        markAsChanged("CODIPI", codIpi);
        this.codIpi = codIpi;
   }

   public BigDecimal getCodLocalPadrao() {
        return codLocalPadrao;
   }

   public void setCodLocalPadrao(BigDecimal codLocalPadrao) {
        markAsChanged("CODLOCALPADRAO", codLocalPadrao);
        this.codLocalPadrao = codLocalPadrao;
   }

   public BigDecimal getCodLst() {
        return codLst;
   }

   public void setCodLst(BigDecimal codLst) {
        markAsChanged("CODLST", codLst);
        this.codLst = codLst;
   }

   public BigDecimal getMedAux() {
        return medAux;
   }

   public void setMedAux(BigDecimal medAux) {
        markAsChanged("MEDAUX", medAux);
        this.medAux = medAux;
   }

   public String getModoAplic() {
        return modoAplic;
   }

   public void setModoAplic(String modoAplic) {
        markAsChanged("MODOAPLIC", modoAplic);
        this.modoAplic = modoAplic;
   }

   public String getMotivoIncexc() {
        return motivoIncexc;
   }

   public void setMotivoIncexc(String motivoIncexc) {
        markAsChanged("MOTIVOINCEXC", motivoIncexc);
        this.motivoIncexc = motivoIncexc;
   }

   public BigDecimal getMultipVenda() {
        return multipVenda;
   }

   public void setMultipVenda(BigDecimal multipVenda) {
        markAsChanged("MULTIPVENDA", multipVenda);
        this.multipVenda = multipVenda;
   }

   public BigDecimal getMvaAjustado() {
        return mvaAjustado;
   }

   public void setMvaAjustado(BigDecimal mvaAjustado) {
        markAsChanged("MVAAJUSTADO", mvaAjustado);
        this.mvaAjustado = mvaAjustado;
   }

   public String getNaturezaOperDes() {
        return naturezaOperDes;
   }

   public void setNaturezaOperDes(String naturezaOperDes) {
        markAsChanged("NATUREZAOPERDES", naturezaOperDes);
        this.naturezaOperDes = naturezaOperDes;
   }

   public String getNcm() {
        return ncm;
   }

   public void setNcm(String ncm) {
        markAsChanged("NCM", ncm);
        this.ncm = ncm;
   }

   public BigDecimal getAcrescMax() {
        return acrescMax;
   }

   public void setAcrescMax(BigDecimal acrescMax) {
        markAsChanged("ACRESCMAX", acrescMax);
        this.acrescMax = acrescMax;
   }

   public BigDecimal getAgrupCompMinimo() {
        return agrupCompMinimo;
   }

   public void setAgrupCompMinimo(BigDecimal agrupCompMinimo) {
        markAsChanged("AGRUPCOMPMINIMO", agrupCompMinimo);
        this.agrupCompMinimo = agrupCompMinimo;
   }

   public BigDecimal getAgrupMin() {
        return agrupMin;
   }

   public void setAgrupMin(BigDecimal agrupMin) {
        markAsChanged("AGRUPMIN", agrupMin);
        this.agrupMin = agrupMin;
   }

   public String getAlertaEstMin() {
        return alertaEstMin;
   }

   public void setAlertaEstMin(String alertaEstMin) {
        markAsChanged("ALERTAESTMIN", alertaEstMin);
        this.alertaEstMin = alertaEstMin;
   }

   public BigDecimal getAliqIcmsIntEfd() {
        return aliqIcmsIntEfd;
   }

   public void setAliqIcmsIntEfd(BigDecimal aliqIcmsIntEfd) {
        markAsChanged("ALIQICMSINTEFD", aliqIcmsIntEfd);
        this.aliqIcmsIntEfd = aliqIcmsIntEfd;
   }

   public BigDecimal getAltura() {
        return altura;
   }

   public void setAltura(BigDecimal altura) {
        markAsChanged("ALTURA", altura);
        this.altura = altura;
   }

   public String getAp1RctEgo() {
        return ap1RctEgo;
   }

   public void setAp1RctEgo(String ap1RctEgo) {
        markAsChanged("AP1RCTEGO", ap1RctEgo);
        this.ap1RctEgo = ap1RctEgo;
   }

   public BigDecimal getAplicacao() {
        return aplicacao;
   }

   public void setAplicacao(BigDecimal aplicacao) {
        markAsChanged("APLICACAO", aplicacao);
        this.aplicacao = aplicacao;
   }

   public String getAplicaSazo() {
        return aplicaSazo;
   }

   public void setAplicaSazo(String aplicaSazo) {
        markAsChanged("APLICASAZO", aplicaSazo);
        this.aplicaSazo = aplicaSazo;
   }

   public String getApresDetalhe() {
        return apresDetalhe;
   }

   public void setApresDetalhe(String apresDetalhe) {
        markAsChanged("APRESDETALHE", apresDetalhe);
        this.apresDetalhe = apresDetalhe;
   }

   public String getApresForm() {
        return apresForm;
   }

   public void setApresForm(String apresForm) {
        markAsChanged("APRESFORM", apresForm);
        this.apresForm = apresForm;
   }

   public String getApuraProdEpe() {
        return apuraProdEpe;
   }

   public void setApuraProdEpe(String apuraProdEpe) {
        markAsChanged("APURAPRODEPE", apuraProdEpe);
        this.apuraProdEpe = apuraProdEpe;
   }

   public BigDecimal getArredAgrup() {
        return arredAgrup;
   }

   public void setArredAgrup(BigDecimal arredAgrup) {
        markAsChanged("ARREDAGRUP", arredAgrup);
        this.arredAgrup = arredAgrup;
   }

   public BigDecimal getArredPreco() {
        return arredPreco;
   }

   public void setArredPreco(BigDecimal arredPreco) {
        markAsChanged("ARREDPRECO", arredPreco);
        this.arredPreco = arredPreco;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public String getBalanca() {
        return balanca;
   }

   public void setBalanca(String balanca) {
        markAsChanged("BALANCA", balanca);
        this.balanca = balanca;
   }

   public String getCalcGiro() {
        return calcGiro;
   }

   public void setCalcGiro(String calcGiro) {
        markAsChanged("CALCULOGIRO", calcGiro);
        this.calcGiro = calcGiro;
   }

   public BigDecimal getCamadas() {
        return camadas;
   }

   public void setCamadas(BigDecimal camadas) {
        markAsChanged("CAMADAS", camadas);
        this.camadas = camadas;
   }

   public String getCaracteristicas() {
        return caracteristicas;
   }

   public void setCaracteristicas(String caracteristicas) {
        markAsChanged("CARACTERISTICAS", caracteristicas);
        this.caracteristicas = caracteristicas;
   }

   public BigDecimal getCarencia() {
        return carencia;
   }

   public void setCarencia(BigDecimal carencia) {
        markAsChanged("CARENCIA", carencia);
        this.carencia = carencia;
   }

   public String getCientifico() {
        return cientifico;
   }

   public void setCientifico(String cientifico) {
        markAsChanged("CIENTIFICO", cientifico);
        this.cientifico = cientifico;
   }

   public BigDecimal getClasseAgt() {
        return classeAgt;
   }

   public void setClasseAgt(BigDecimal classeAgt) {
        markAsChanged("CLASSEAGT", classeAgt);
        this.classeAgt = classeAgt;
   }

   public BigDecimal getClasseTox() {
        return classeTox;
   }

   public void setClasseTox(BigDecimal classeTox) {
        markAsChanged("CLASSETOX", classeTox);
        this.classeTox = classeTox;
   }

   public BigDecimal getClassUbTrib() {
        return classUbTrib;
   }

   public void setClassUbTrib(BigDecimal classUbTrib) {
        markAsChanged("CLASSUBTRIB", classUbTrib);
        this.classUbTrib = classUbTrib;
   }

   public BigDecimal getCnae() {
        return cnae;
   }

   public void setCnae(BigDecimal cnae) {
        markAsChanged("CNAE", cnae);
        this.cnae = cnae;
   }

   public String getLisContEst() {
        return lisContEst;
   }

   public void setLisContEst(String lisContEst) {
        markAsChanged("LISCONTEST", lisContEst);
        this.lisContEst = lisContEst;
   }

   public String getLocal() {
        return local;
   }

   public void setLocal(String local) {
        markAsChanged("LOCAL", local);
        this.local = local;
   }

   public String getLocalizacao() {
        return localizacao;
   }

   public void setLocalizacao(String localizacao) {
        markAsChanged("LOCALIZACAO", localizacao);
        this.localizacao = localizacao;
   }

   public BigDecimal getLoteCompMinimo() {
        return loteCompMinimo;
   }

   public void setLoteCompMinimo(BigDecimal loteCompMinimo) {
        markAsChanged("LOTECOMPMINIMO", loteCompMinimo);
        this.loteCompMinimo = loteCompMinimo;
   }

   public BigDecimal getLoteCompras() {
        return loteCompras;
   }

   public void setLoteCompras(BigDecimal loteCompras) {
        markAsChanged("LOTECOMPRAS", loteCompras);
        this.loteCompras = loteCompras;
   }

   public BigDecimal getM3() {
        return m3;
   }

   public void setM3(BigDecimal m3) {
        markAsChanged("M3", m3);
        this.m3 = m3;
   }

   public String getManejoInt() {
        return manejoInt;
   }

   public void setManejoInt(String manejoInt) {
        markAsChanged("MANEJOINT", manejoInt);
        this.manejoInt = manejoInt;
   }

   public String getMarca() {
        return marca;
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
        this.marca = marca;
   }

   public String getNomeTab() {
        return nomeTab;
   }

   public void setNomeTab(String nomeTab) {
        markAsChanged("NOMETAB", nomeTab);
        this.nomeTab = nomeTab;
   }

   public String getNotifConf() {
        return notifConf;
   }

   public void setNotifConf(String notifConf) {
        markAsChanged("NOTIFCONF", notifConf);
        this.notifConf = notifConf;
   }

   public BigDecimal getCodMoeda() {
        return codMoeda;
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
        this.codMoeda = codMoeda;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
        this.codNat = codNat;
   }

   public BigDecimal getCodPais() {
        return codPais;
   }

   public void setCodPais(BigDecimal codPais) {
        markAsChanged("CODPAIS", codPais);
        this.codPais = codPais;
   }

   public BigDecimal getCodParcForn() {
        return codParcForn;
   }

   public void setCodParcForn(BigDecimal codParcForn) {
        markAsChanged("CODPARCFORN", codParcForn);
        this.codParcForn = codParcForn;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodProdAgrupApt() {
        return codProdAgrupApt;
   }

   public void setCodProdAgrupApt(BigDecimal codProdAgrupApt) {
        markAsChanged("CODPRODAGRUPAPT", codProdAgrupApt);
        this.codProdAgrupApt = codProdAgrupApt;
   }

   public BigDecimal getCodProdAgrupAptEnc() {
        return codProdAgrupAptEnc;
   }

   public void setCodProdAgrupAptEnc(BigDecimal codProdAgrupAptEnc) {
        markAsChanged("CODPRODAGRUPAPTENC", codProdAgrupAptEnc);
        this.codProdAgrupAptEnc = codProdAgrupAptEnc;
   }

   public String getCodProdRoi() {
        return codProdRoi;
   }

   public void setCodProdRoi(String codProdRoi) {
        markAsChanged("CODPRODROI", codProdRoi);
        this.codProdRoi = codProdRoi;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
        this.codProj = codProj;
   }

   public String getCodRegMapa() {
        return codRegMapa;
   }

   public void setCodRegMapa(String codRegMapa) {
        markAsChanged("CODREGMAPA", codRegMapa);
        this.codRegMapa = codRegMapa;
   }

   public BigDecimal getCodRfa() {
        return codRfa;
   }

   public void setCodRfa(BigDecimal codRfa) {
        markAsChanged("CODRFA", codRfa);
        this.codRfa = codRfa;
   }

   public BigDecimal getCodTab() {
        return codTab;
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
        this.codTab = codTab;
   }

   public String getCodTribMunIss() {
        return codTribMunIss;
   }

   public void setCodTribMunIss(String codTribMunIss) {
        markAsChanged("CODTRIBMUNISS", codTribMunIss);
        this.codTribMunIss = codTribMunIss;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public String getCodVolCompra() {
        return codVolCompra;
   }

   public void setCodVolCompra(String codVolCompra) {
        markAsChanged("CODVOLCOMPRA", codVolCompra);
        this.codVolCompra = codVolCompra;
   }

   public String getCodVolPlan() {
        return codVolPlan;
   }

   public void setCodVolPlan(String codVolPlan) {
        markAsChanged("CODVOLPLAN", codVolPlan);
        this.codVolPlan = codVolPlan;
   }

   public String getCodVolRes() {
        return codVolRes;
   }

   public void setCodVolRes(String codVolRes) {
        markAsChanged("CODVOLRES", codVolRes);
        this.codVolRes = codVolRes;
   }

   public BigDecimal getComGer() {
        return comGer;
   }

   public void setComGer(BigDecimal comGer) {
        markAsChanged("COMGER", comGer);
        this.comGer = comGer;
   }

   public String getComplDesc() {
        return complDesc;
   }

   public void setComplDesc(String complDesc) {
        markAsChanged("COMPLDESC", complDesc);
        this.complDesc = complDesc;
   }

   public String getComponObrig() {
        return componObrig;
   }

   public void setComponObrig(String componObrig) {
        markAsChanged("COMPONOBRIG", componObrig);
        this.componObrig = componObrig;
   }

   public BigDecimal getComVend() {
        return comVend;
   }

   public void setComVend(BigDecimal comVend) {
        markAsChanged("COMVEND", comVend);
        this.comVend = comVend;
   }

   public String getConcentracao() {
        return concentracao;
   }

   public void setConcentracao(String concentracao) {
        markAsChanged("CONCENTRACAO", concentracao);
        this.concentracao = concentracao;
   }

   public String getConfCegaPeso() {
        return confCegaPeso;
   }

   public void setConfCegaPeso(String confCegaPeso) {
        markAsChanged("CONFCEGAPESO", confCegaPeso);
        this.confCegaPeso = confCegaPeso;
   }

   public String getConfere() {
        return confere;
   }

   public void setConfere(String confere) {
        markAsChanged("CONFERE", confere);
        this.confere = confere;
   }

   public BigDecimal getConverVol() {
        return converVol;
   }

   public void setConverVol(BigDecimal converVol) {
        markAsChanged("CONVERVOL", converVol);
        this.converVol = converVol;
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

   public String getCultura() {
        return cultura;
   }

   public void setCultura(String cultura) {
        markAsChanged("CULTURA", cultura);
        this.cultura = cultura;
   }

   public BigDecimal getDecCusto() {
        return decCusto;
   }

   public void setDecCusto(BigDecimal decCusto) {
        markAsChanged("DECCUSTO", decCusto);
        this.decCusto = decCusto;
   }

   public BigDecimal getDecQtd() {
        return decQtd;
   }

   public void setDecQtd(BigDecimal decQtd) {
        markAsChanged("DECQTD", decQtd);
        this.decQtd = decQtd;
   }

   public BigDecimal getDecVlr() {
        return decVlr;
   }

   public void setDecVlr(BigDecimal decVlr) {
        markAsChanged("DECVLR", decVlr);
        this.decVlr = decVlr;
   }

   public BigDecimal getDescMax() {
        return descMax;
   }

   public void setDescMax(BigDecimal descMax) {
        markAsChanged("DESCMAX", descMax);
        this.descMax = descMax;
   }

   public BigDecimal getDescMaxFlex() {
        return descMaxFlex;
   }

   public void setDescMaxFlex(BigDecimal descMaxFlex) {
        markAsChanged("DESCMAXFLEX", descMaxFlex);
        this.descMaxFlex = descMaxFlex;
   }

   public String getDescrProd() {
        return descrProd;
   }

   public void setDescrProd(String descrProd) {
        markAsChanged("DESCRPROD", descrProd);
        this.descrProd = descrProd;
   }

   public String getDescrProdNfe() {
        return descrProdNfe;
   }

   public void setDescrProdNfe(String descrProdNfe) {
        markAsChanged("DESCRPRODNFE", descrProdNfe);
        this.descrProdNfe = descrProdNfe;
   }

   public BigDecimal getDesvioMax() {
        return desvioMax;
   }

   public void setDesvioMax(BigDecimal desvioMax) {
        markAsChanged("DESVIOMAX", desvioMax);
        this.desvioMax = desvioMax;
   }

   public BigDecimal getDiasExpedicao() {
        return diasExpedicao;
   }

   public void setDiasExpedicao(BigDecimal diasExpedicao) {
        markAsChanged("DIASEXPEDICAO", diasExpedicao);
        this.diasExpedicao = diasExpedicao;
   }

   public String getDimensoes() {
        return dimensoes;
   }

   public void setDimensoes(String dimensoes) {
        markAsChanged("DIMENSOES", dimensoes);
        this.dimensoes = dimensoes;
   }

   public BigDecimal getDosagem() {
        return dosagem;
   }

   public void setDosagem(BigDecimal dosagem) {
        markAsChanged("DOSAGEM", dosagem);
        this.dosagem = dosagem;
   }

   public BigDecimal getDosagemPor() {
        return dosagemPor;
   }

   public void setDosagemPor(BigDecimal dosagemPor) {
        markAsChanged("DOSAGEMPOR", dosagemPor);
        this.dosagemPor = dosagemPor;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtAlterEmq() {
        return dtAlterEmq;
   }

   public void setDtAlterEmq(Timestamp dtAlterEmq) {
        markAsChanged("DTALTEREMQ", dtAlterEmq);
        this.dtAlterEmq = dtAlterEmq;
   }

   public Timestamp getDtAlterEsq() {
        return dtAlterEsq;
   }

   public void setDtAlterEsq(Timestamp dtAlterEsq) {
        markAsChanged("DTALTERESQ", dtAlterEsq);
        this.dtAlterEsq = dtAlterEsq;
   }

   public String getDtValDif() {
        return dtValDif;
   }

   public void setDtValDif(String dtValDif) {
        markAsChanged("DTVALDIF", dtValDif);
        this.dtValDif = dtValDif;
   }

   public String getEndImagem() {
        return endImagem;
   }

   public void setEndImagem(String endImagem) {
        markAsChanged("ENDIMAGEM", endImagem);
        this.endImagem = endImagem;
   }

   public String getEndModRotulo() {
        return endModRotulo;
   }

   public void setEndModRotulo(String endModRotulo) {
        markAsChanged("ENDMODROTULO", endModRotulo);
        this.endModRotulo = endModRotulo;
   }

   public String getEpocaAplic() {
        return epocaAplic;
   }

   public void setEpocaAplic(String epocaAplic) {
        markAsChanged("EPOCAAPLIC", epocaAplic);
        this.epocaAplic = epocaAplic;
   }

   public BigDecimal getEspessura() {
        return espessura;
   }

   public void setEspessura(BigDecimal espessura) {
        markAsChanged("ESPESSURA", espessura);
        this.espessura = espessura;
   }

   public BigDecimal getEstMax() {
        return estMax;
   }

   public void setEstMax(BigDecimal estMax) {
        markAsChanged("ESTMAX", estMax);
        this.estMax = estMax;
   }

   public BigDecimal getEstMaxDias() {
        return estMaxDias;
   }

   public void setEstMaxDias(BigDecimal estMaxDias) {
        markAsChanged("ESTMAXDIAS", estMaxDias);
        this.estMaxDias = estMaxDias;
   }

   public BigDecimal getEstMaxQtd() {
        return estMaxQtd;
   }

   public void setEstMaxQtd(BigDecimal estMaxQtd) {
        markAsChanged("ESTMAXQTD", estMaxQtd);
        this.estMaxQtd = estMaxQtd;
   }

   public BigDecimal getEstMin() {
        return estMin;
   }

   public void setEstMin(BigDecimal estMin) {
        markAsChanged("ESTMIN", estMin);
        this.estMin = estMin;
   }

   public BigDecimal getEstSegDias() {
        return estSegDias;
   }

   public void setEstSegDias(BigDecimal estSegDias) {
        markAsChanged("ESTSEGDIAS", estSegDias);
        this.estSegDias = estSegDias;
   }

   public BigDecimal getEstSegQtd() {
        return estSegQtd;
   }

   public void setEstSegQtd(BigDecimal estSegQtd) {
        markAsChanged("ESTSEGQTD", estSegQtd);
        this.estSegQtd = estSegQtd;
   }

   public String getExcluirConf() {
        return excluirConf;
   }

   public void setExcluirConf(String excluirConf) {
        markAsChanged("EXCLUIRCONF", excluirConf);
        this.excluirConf = excluirConf;
   }

   public String getExigeBenefic() {
        return exigeBenefic;
   }

   public void setExigeBenefic(String exigeBenefic) {
        markAsChanged("EXIGEBENEFIC", exigeBenefic);
        this.exigeBenefic = exigeBenefic;
   }

   public String getFabricante() {
        return fabricante;
   }

   public void setFabricante(String fabricante) {
        markAsChanged("FABRICANTE", fabricante);
        this.fabricante = fabricante;
   }

   public String getFatTotal() {
        return fatTotal;
   }

   public void setFatTotal(String fatTotal) {
        markAsChanged("FATTOTAL", fatTotal);
        this.fatTotal = fatTotal;
   }

   public String getFlex() {
        return flex;
   }

   public void setFlex(String flex) {
        markAsChanged("FLEX", flex);
        this.flex = flex;
   }

   public String getFormulacao() {
        return formulacao;
   }

   public void setFormulacao(String formulacao) {
        markAsChanged("FORMULACAO", formulacao);
        this.formulacao = formulacao;
   }

   public String getGeraPlProd() {
        return geraPlProd;
   }

   public void setGeraPlProd(String geraPlProd) {
        markAsChanged("GERAPLAPROD", geraPlProd);
        this.geraPlProd = geraPlProd;
   }

   public String getGrupoCofins() {
        return grupoCofins;
   }

   public void setGrupoCofins(String grupoCofins) {
        markAsChanged("GRUPOCOFINS", grupoCofins);
        this.grupoCofins = grupoCofins;
   }

   public String getGrupoCssl() {
        return grupoCssl;
   }

   public void setGrupoCssl(String grupoCssl) {
        markAsChanged("GRUPOCSSL", grupoCssl);
        this.grupoCssl = grupoCssl;
   }

   public String getGrupoDescProd() {
        return grupoDescProd;
   }

   public void setGrupoDescProd(String grupoDescProd) {
        markAsChanged("GRUPODESCPROD", grupoDescProd);
        this.grupoDescProd = grupoDescProd;
   }

   public BigDecimal getGrupoIcms() {
        return grupoIcms;
   }

   public void setGrupoIcms(BigDecimal grupoIcms) {
        markAsChanged("GRUPOICMS", grupoIcms);
        this.grupoIcms = grupoIcms;
   }

   public String getGrupoPis() {
        return grupoPis;
   }

   public void setGrupoPis(String grupoPis) {
        markAsChanged("GRUPOPIS", grupoPis);
        this.grupoPis = grupoPis;
   }

   public BigDecimal getGrupoQuimico() {
        return grupoQuimico;
   }

   public void setGrupoQuimico(BigDecimal grupoQuimico) {
        markAsChanged("GRUPOQUIMICO", grupoQuimico);
        this.grupoQuimico = grupoQuimico;
   }

   public String getHomePage() {
        return homePage;
   }

   public void setHomePage(String homePage) {
        markAsChanged("HOMEPAGE", homePage);
        this.homePage = homePage;
   }

   public String getHrDobrada() {
        return hrDobrada;
   }

   public void setHrDobrada(String hrDobrada) {
        markAsChanged("HRDOBRADA", hrDobrada);
        this.hrDobrada = hrDobrada;
   }

   public String getIcmsGerencia() {
        return icmsGerencia;
   }

   public void setIcmsGerencia(String icmsGerencia) {
        markAsChanged("ICMSGERENCIA", icmsGerencia);
        this.icmsGerencia = icmsGerencia;
   }

   public BigDecimal getIdenImob() {
        return idenImob;
   }

   public void setIdenImob(BigDecimal idenImob) {
        markAsChanged("IDENTIMOB", idenImob);
        this.idenImob = idenImob;
   }

   public byte[] getImagem() {
        return imagem;
   }

   public void setImagem(byte[] imagem) {
        markAsChanged("IMAGEM", imagem);
        this.imagem = imagem;
   }

   public String getImpEtiqConf() {
        return impEtiqConf;
   }

   public void setImpEtiqConf(String impEtiqConf) {
        markAsChanged("IMPETIQCONF", impEtiqConf);
        this.impEtiqConf = impEtiqConf;
   }

   public String getImplAudLote() {
        return implAudLote;
   }

   public void setImplAudLote(String implAudLote) {
        markAsChanged("IMPLAUDOLOTE", implAudLote);
        this.implAudLote = implAudLote;
   }

   public String getImpOrdemCorte() {
        return impOrdemCorte;
   }

   public void setImpOrdemCorte(String impOrdemCorte) {
        markAsChanged("IMPORDEMCORTE", impOrdemCorte);
        this.impOrdemCorte = impOrdemCorte;
   }

   public String getIndEspProdEpe() {
        return indEspProdEpe;
   }

   public void setIndEspProdEpe(String indEspProdEpe) {
        markAsChanged("INDESPPRODEPE", indEspProdEpe);
        this.indEspProdEpe = indEspProdEpe;
   }

   public String getInfPureza() {
        return infPureza;
   }

   public void setInfPureza(String infPureza) {
        markAsChanged("INFPUREZA", infPureza);
        this.infPureza = infPureza;
   }

   public BigDecimal getIntervalo() {
        return intervalo;
   }

   public void setIntervalo(BigDecimal intervalo) {
        markAsChanged("INTERVALO", intervalo);
        this.intervalo = intervalo;
   }

   public BigDecimal getLargura() {
        return largura;
   }

   public void setLargura(BigDecimal largura) {
        markAsChanged("LARGURA", largura);
        this.largura = largura;
   }

   public BigDecimal getLastro() {
        return lastro;
   }

   public void setLastro(BigDecimal lastro) {
        markAsChanged("LASTRO", lastro);
        this.lastro = lastro;
   }

   public BigDecimal getLeadTime() {
        return leadTime;
   }

   public void setLeadTime(BigDecimal leadTime) {
        markAsChanged("LEADTIME", leadTime);
        this.leadTime = leadTime;
   }

   public String getCodAutCodif() {
        return codAutCodif;
   }

   public void setCodAutCodif(String codAutCodif) {
        markAsChanged("CODAUTCODIF", codAutCodif);
        this.codAutCodif = codAutCodif;
   }

   public String getCodBarBalanca() {
        return codBarBalanca;
   }

   public void setCodBarBalanca(String codBarBalanca) {
        markAsChanged("CODBARBALANCA", codBarBalanca);
        this.codBarBalanca = codBarBalanca;
   }

   public BigDecimal getCodCenCus() {
        return codCenCus;
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        markAsChanged("CODCENCUS", codCenCus);
        this.codCenCus = codCenCus;
   }

   public BigDecimal getCodCos() {
        return codCos;
   }

   public void setCodCos(BigDecimal codCos) {
        markAsChanged("CODCOS", codCos);
        this.codCos = codCos;
   }

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodCtaCtb2() {
        return codCtaCtb2;
   }

   public void setCodCtaCtb2(BigDecimal codCtaCtb2) {
        markAsChanged("CODCTACTB2", codCtaCtb2);
        this.codCtaCtb2 = codCtaCtb2;
   }

   public BigDecimal getCodCtaCtb3() {
        return codCtaCtb3;
   }

   public void setCodCtaCtb3(BigDecimal codCtaCtb3) {
        markAsChanged("CODCTACTB3", codCtaCtb3);
        this.codCtaCtb3 = codCtaCtb3;
   }

   public BigDecimal getCodCtaCtb4() {
        return codCtaCtb4;
   }

   public void setCodCtaCtb4(BigDecimal codCtaCtb4) {
        markAsChanged("CODCTACTB4", codCtaCtb4);
        this.codCtaCtb4 = codCtaCtb4;
   }

   public String getCodFci() {
        return codFci;
   }

   public void setCodFci(String codFci) {
        markAsChanged("CODFCI", codFci);
        this.codFci = codFci;
   }

   public BigDecimal getCodFiltro() {
        return codFiltro;
   }

   public void setCodFiltro(BigDecimal codFiltro) {
        markAsChanged("CODFILTRO", codFiltro);
        this.codFiltro = codFiltro;
   }

   public String getTipoKit() {
        return tipoKit;
   }

   public void setTipoKit(String tipoKit) {
        markAsChanged("TIPOKIT", tipoKit);
        this.tipoKit = tipoKit;
   }

   public BigDecimal getCodConfKit() {
        return codConfKit;
   }

   public void setCodConfKit(BigDecimal codConfKit) {
        markAsChanged("CODCONFKIT", codConfKit);
        this.codConfKit = codConfKit;
   }

   public BigDecimal getCodExNcm() {
        return codExNcm;
   }

   public void setCodExNcm(BigDecimal codExNcm) {
        markAsChanged("CODEXNCM", codExNcm);
        this.codExNcm = codExNcm;
   }

   public BigDecimal getPercInss() {
        return percInss;
   }

   public void setPercInss(BigDecimal percInss) {
        markAsChanged("PERCINSS", percInss);
        this.percInss = percInss;
   }

   public BigDecimal getPercIrf() {
        return percIrf;
   }

   public void setPercIrf(BigDecimal percIrf) {
        markAsChanged("PERCIRF", percIrf);
        this.percIrf = percIrf;
   }

   public BigDecimal getPercQuebraTec() {
        return percQuebraTec;
   }

   public void setPercQuebraTec(BigDecimal percQuebraTec) {
        markAsChanged("PERCQUEBRATEC", percQuebraTec);
        this.percQuebraTec = percQuebraTec;
   }

   public String getPermCompProd() {
        return permCompProd;
   }

   public void setPermCompProd(String permCompProd) {
        markAsChanged("PERMCOMPPROD", permCompProd);
        this.permCompProd = permCompProd;
   }

   public BigDecimal getPesoBruto() {
        return pesoBruto;
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
        this.pesoBruto = pesoBruto;
   }

   public BigDecimal getPesoLiq() {
        return pesoLiq;
   }

   public void setPesoLiq(BigDecimal pesoLiq) {
        markAsChanged("PESOLIQ", pesoLiq);
        this.pesoLiq = pesoLiq;
   }

   public BigDecimal getPrazoVal() {
        return prazoVal;
   }

   public void setPrazoVal(BigDecimal prazoVal) {
        markAsChanged("PRAZOVAL", prazoVal);
        this.prazoVal = prazoVal;
   }

   public BigDecimal getPrincAtivo() {
        return princAtivo;
   }

   public void setPrincAtivo(BigDecimal princAtivo) {
        markAsChanged("PRINCATIVO", princAtivo);
        this.princAtivo = princAtivo;
   }

   public BigDecimal getProdutoNfe() {
        return produtoNfe;
   }

   public void setProdutoNfe(BigDecimal produtoNfe) {
        markAsChanged("PRODUTONFE", produtoNfe);
        this.produtoNfe = produtoNfe;
   }

   public String getPromocao() {
        return promocao;
   }

   public void setPromocao(String promocao) {
        markAsChanged("PROMOCAO", promocao);
        this.promocao = promocao;
   }

   public BigDecimal getQtdEmb() {
        return qtdEmb;
   }

   public void setQtdEmb(BigDecimal qtdEmb) {
        markAsChanged("QTDEMB", qtdEmb);
        this.qtdEmb = qtdEmb;
   }

   public BigDecimal getQtdNfLaudosInt() {
        return qtdNfLaudosInt;
   }

   public void setQtdNfLaudosInt(BigDecimal qtdNfLaudosInt) {
        markAsChanged("QTDNFLAUDOSINT", qtdNfLaudosInt);
        this.qtdNfLaudosInt = qtdNfLaudosInt;
   }

   public String getRastrEstoque() {
        return rastrEstoque;
   }

   public void setRastrEstoque(String rastrEstoque) {
        markAsChanged("RASTRESTOQUE", rastrEstoque);
        this.rastrEstoque = rastrEstoque;
   }

   public String getReceituario() {
        return receituario;
   }

   public void setReceituario(String receituario) {
        markAsChanged("RECEITUARIO", receituario);
        this.receituario = receituario;
   }

   public String getRecupAvaria() {
        return recupAvaria;
   }

   public void setRecupAvaria(String recupAvaria) {
        markAsChanged("RECUPAVARIA", recupAvaria);
        this.recupAvaria = recupAvaria;
   }

   public BigDecimal getRedBaseInss() {
        return redBaseInss;
   }

   public void setRedBaseInss(BigDecimal redBaseInss) {
        markAsChanged("REDBASEINSS", redBaseInss);
        this.redBaseInss = redBaseInss;
   }

   public BigDecimal getRedBaseIrf() {
        return redBaseIrf;
   }

   public void setRedBaseIrf(BigDecimal redBaseIrf) {
        markAsChanged("REDBASEIRF", redBaseIrf);
        this.redBaseIrf = redBaseIrf;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public String getRefForn() {
        return refForn;
   }

   public void setRefForn(String refForn) {
        markAsChanged("REFFORN", refForn);
        this.refForn = refForn;
   }

   public String getRegraWms() {
        return regraWms;
   }

   public void setRegraWms(String regraWms) {
        markAsChanged("REGRAWMS", regraWms);
        this.regraWms = regraWms;
   }

   public String getRemeter() {
        return remeter;
   }

   public void setRemeter(String remeter) {
        markAsChanged("REMETER", remeter);
        this.remeter = remeter;
   }

   public String getRendimento() {
        return rendimento;
   }

   public void setRendimento(String rendimento) {
        markAsChanged("RENDIMENTO", rendimento);
        this.rendimento = rendimento;
   }

   public BigDecimal getRendimentoHa() {
        return rendimentoHa;
   }

   public void setRendimentoHa(BigDecimal rendimentoHa) {
        markAsChanged("RENDIMENTOHA", rendimentoHa);
        this.rendimentoHa = rendimentoHa;
   }

   public String getSelecionado() {
        return selecionado;
   }

   public void setSelecionado(String selecionado) {
        markAsChanged("SELECIONADO", selecionado);
        this.selecionado = selecionado;
   }

   public BigDecimal getShelfLife() {
        return shelfLife;
   }

   public void setShelfLife(BigDecimal shelfLife) {
        markAsChanged("SHELFLIFE", shelfLife);
        this.shelfLife = shelfLife;
   }

   public BigDecimal getShelfLifeMin() {
        return shelfLifeMin;
   }

   public void setShelfLifeMin(BigDecimal shelfLifeMin) {
        markAsChanged("SHELFLIFEMIN", shelfLifeMin);
        this.shelfLifeMin = shelfLifeMin;
   }

   public String getSolCompra() {
        return solCompra;
   }

   public void setSolCompra(String solCompra) {
        markAsChanged("SOLCOMPRA", solCompra);
        this.solCompra = solCompra;
   }

   public String getStatusIncexc() {
        return statusIncexc;
   }

   public void setStatusIncexc(String statusIncexc) {
        markAsChanged("STATUSINCEXC", statusIncexc);
        this.statusIncexc = statusIncexc;
   }

   public BigDecimal getTamLote() {
        return tamLote;
   }

   public void setTamLote(BigDecimal tamLote) {
        markAsChanged("TAMLOTE", tamLote);
        this.tamLote = tamLote;
   }

   public BigDecimal getTamSerie() {
        return tamSerie;
   }

   public void setTamSerie(BigDecimal tamSerie) {
        markAsChanged("TAMSERIE", tamSerie);
        this.tamSerie = tamSerie;
   }

   public String getTemCiap() {
        return temCiap;
   }

   public void setTemCiap(String temCiap) {
        markAsChanged("TEMCIAP", temCiap);
        this.temCiap = temCiap;
   }

   public String getTemComissao() {
        return temComissao;
   }

   public void setTemComissao(String temComissao) {
        markAsChanged("TEMCOMISSAO", temComissao);
        this.temComissao = temComissao;
   }

   public String getTemCredPisCofinsDepr() {
        return temCredPisCofinsDepr;
   }

   public void setTemCredPisCofinsDepr(String temCredPisCofinsDepr) {
        markAsChanged("TEMCREDPISCOFINSDEPR", temCredPisCofinsDepr);
        this.temCredPisCofinsDepr = temCredPisCofinsDepr;
   }

   public String getTemIcms() {
        return temIcms;
   }

   public void setTemIcms(String temIcms) {
        markAsChanged("TEMICMS", temIcms);
        this.temIcms = temIcms;
   }

   public String getTemInss() {
        return temInss;
   }

   public void setTemInss(String temInss) {
        markAsChanged("TEMINSS", temInss);
        this.temInss = temInss;
   }

   public String getTemIpiCompra() {
        return temIpiCompra;
   }

   public void setTemIpiCompra(String temIpiCompra) {
        markAsChanged("TEMIPICOMPRA", temIpiCompra);
        this.temIpiCompra = temIpiCompra;
   }

   public String getTemIpiVenda() {
        return temIpiVenda;
   }

   public void setTemIpiVenda(String temIpiVenda) {
        markAsChanged("TEMIPIVENDA", temIpiVenda);
        this.temIpiVenda = temIpiVenda;
   }

   public String getTemIrf() {
        return temIrf;
   }

   public void setTemIrf(String temIrf) {
        markAsChanged("TEMIRF", temIrf);
        this.temIrf = temIrf;
   }

   public String getTemIss() {
        return temIss;
   }

   public void setTemIss(String temIss) {
        markAsChanged("TEMISS", temIss);
        this.temIss = temIss;
   }

   public Timestamp getTempoServ() {
        return tempoServ;
   }

   public void setTempoServ(Timestamp tempoServ) {
        markAsChanged("TEMPOSERV", tempoServ);
        this.tempoServ = tempoServ;
   }

   public String getTipContEst() {
        return tipContEst;
   }

   public void setTipContEst(String tipContEst) {
        markAsChanged("TIPCONTEST", tipContEst);
        this.tipContEst = tipContEst;
   }

   public String getTipContEstWms() {
        return tipContEstWms;
   }

   public void setTipContEstWms(String tipContEstWms) {
        markAsChanged("TIPCONTESTWMS", tipContEstWms);
        this.tipContEstWms = tipContEstWms;
   }

   public BigDecimal getTipGtinNfe() {
        return tipGtinNfe;
   }

   public void setTipGtinNfe(BigDecimal tipGtinNfe) {
        markAsChanged("TIPGTINNFE", tipGtinNfe);
        this.tipGtinNfe = tipGtinNfe;
   }

   public String getTipLancNota() {
        return tipLancNota;
   }

   public void setTipLancNota(String tipLancNota) {
        markAsChanged("TIPLANCNOTA", tipLancNota);
        this.tipLancNota = tipLancNota;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public String getTipSerNfe() {
        return tipSerNfe;
   }

   public void setTipSerNfe(String tipSerNfe) {
        markAsChanged("TIPSERNFE", tipSerNfe);
        this.tipSerNfe = tipSerNfe;
   }

   public String getTipSubst() {
        return tipSubst;
   }

   public void setTipSubst(String tipSubst) {
        markAsChanged("TIPSUBST", tipSubst);
        this.tipSubst = tipSubst;
   }

   public String getTitContEst() {
        return titContEst;
   }

   public void setTitContEst(String titContEst) {
        markAsChanged("TITCONTEST", titContEst);
        this.titContEst = titContEst;
   }

   public String getUnidade() {
        return unidade;
   }

   public void setUnidade(String unidade) {
        markAsChanged("UNIDADE", unidade);
        this.unidade = unidade;
   }

   public String getUnidMinArmaz() {
        return unidMinArmaz;
   }

   public void setUnidMinArmaz(String unidMinArmaz) {
        markAsChanged("UNIDMINARMAZ", unidMinArmaz);
        this.unidMinArmaz = unidMinArmaz;
   }

   public String getUsaCodBarrasQtd() {
        return usaCodBarrasQtd;
   }

   public void setUsaCodBarrasQtd(String usaCodBarrasQtd) {
        markAsChanged("USACODBARRASQTD", usaCodBarrasQtd);
        this.usaCodBarrasQtd = usaCodBarrasQtd;
   }

   public String getUsaImpAgrupMin() {
        return usaImpAgrupMin;
   }

   public void setUsaImpAgrupMin(String usaImpAgrupMin) {
        markAsChanged("USAIMPAGRUPMIN", usaImpAgrupMin);
        this.usaImpAgrupMin = usaImpAgrupMin;
   }

   public String getUsaLocal() {
        return usaLocal;
   }

   public void setUsaLocal(String usaLocal) {
        markAsChanged("USALOCAL", usaLocal);
        this.usaLocal = usaLocal;
   }

   public String getUsaSerieFab() {
        return usaSerieFab;
   }

   public void setUsaSerieFab(String usaSerieFab) {
        markAsChanged("USASERIEFAB", usaSerieFab);
        this.usaSerieFab = usaSerieFab;
   }

   public String getUsaSerieSepWms() {
        return usaSerieSepWms;
   }

   public void setUsaSerieSepWms(String usaSerieSepWms) {
        markAsChanged("USASERIESEPWMS", usaSerieSepWms);
        this.usaSerieSepWms = usaSerieSepWms;
   }

   public String getUsaStatusLote() {
        return usaStatusLote;
   }

   public void setUsaStatusLote(String usaStatusLote) {
        markAsChanged("USASTATUSLOTE", usaStatusLote);
        this.usaStatusLote = usaStatusLote;
   }

   public String getUsoProd() {
        return usoProd;
   }

   public void setUsoProd(String usoProd) {
        markAsChanged("USOPROD", usoProd);
        this.usoProd = usoProd;
   }

   public BigDecimal getUtilImob() {
        return utilImob;
   }

   public void setUtilImob(BigDecimal utilImob) {
        markAsChanged("UTILIMOB", utilImob);
        this.utilImob = utilImob;
   }

   public String getUtilizaWms() {
        return utilizaWms;
   }

   public void setUtilizaWms(String utilizaWms) {
        markAsChanged("UTILIZAWMS", utilizaWms);
        this.utilizaWms = utilizaWms;
   }

   public String getValCapM3() {
        return valCapM3;
   }

   public void setValCapM3(String valCapM3) {
        markAsChanged("VALCAPM3", valCapM3);
        this.valCapM3 = valCapM3;
   }

   public String getValCbGlobal() {
        return valCbGlobal;
   }

   public void setValCbGlobal(String valCbGlobal) {
        markAsChanged("VALCBGLOBAL", valCbGlobal);
        this.valCbGlobal = valCbGlobal;
   }

   public String getVenCompIndiv() {
        return venCompIndiv;
   }

   public void setVenCompIndiv(String venCompIndiv) {
        markAsChanged("VENCOMPINDIV", venCompIndiv);
        this.venCompIndiv = venCompIndiv;
   }

   public BigDecimal getVlrComerc() {
        return vlrComerc;
   }

   public void setVlrComerc(BigDecimal vlrComerc) {
        markAsChanged("VLRCOMERC", vlrComerc);
        this.vlrComerc = vlrComerc;
   }

   public BigDecimal getVlrParcImpExt() {
        return vlrParcImpExt;
   }

   public void setVlrParcImpExt(BigDecimal vlrParcImpExt) {
        markAsChanged("VLRPARCIMPEXT", vlrParcImpExt);
        this.vlrParcImpExt = vlrParcImpExt;
   }

   public String getVolDosagem() {
        return volDosagem;
   }

   public void setVolDosagem(String volDosagem) {
        markAsChanged("VOLDOSAGEM", volDosagem);
        this.volDosagem = volDosagem;
   }

   public String getVolDosagemPor() {
        return volDosagemPor;
   }

   public void setVolDosagemPor(String volDosagemPor) {
        markAsChanged("VOLDOSAGEMPOR", volDosagemPor);
        this.volDosagemPor = volDosagemPor;
   }

   public BigDecimal getPercTolPesoMenorSep() {
        return percTolPesoMenorSep;
   }

   public void setPercTolPesoMenorSep(BigDecimal percTolPesoMenorSep) {
        markAsChanged("PERCTOLPESOMENORSEP", percTolPesoMenorSep);
        this.percTolPesoMenorSep = percTolPesoMenorSep;
   }

   public String getUsaLoteDtFab() {
        return usaLoteDtFab;
   }

   public void setUsaLoteDtFab(String usaLoteDtFab) {
        markAsChanged("USALOTEDTFAB", usaLoteDtFab);
        this.usaLoteDtFab = usaLoteDtFab;
   }

   public String getUsaLoteDtVal() {
        return usaLoteDtVal;
   }

   public void setUsaLoteDtVal(String usaLoteDtVal) {
        markAsChanged("USALOTEDTVAL", usaLoteDtVal);
        this.usaLoteDtVal = usaLoteDtVal;
   }

   public String getDescVenConsul() {
        return descVenConsul;
   }

   public void setDescVenConsul(String descVenConsul) {
        markAsChanged("DESCVENCONSUL", descVenConsul);
        this.descVenConsul = descVenConsul;
   }

   public BigDecimal getCodFiltroReq() {
        return codFiltroReq;
   }

   public void setCodFiltroReq(BigDecimal codFiltroReq) {
        markAsChanged("CODFILTROREQ", codFiltroReq);
        this.codFiltroReq = codFiltroReq;
   }

   public String getControlMedic() {
        return controlMedic;
   }

   public void setControlMedic(String controlMedic) {
        markAsChanged("CONTROLMEDIC", controlMedic);
        this.controlMedic = controlMedic;
   }

   public BigDecimal getCodEnqIpiEnt() {
        return codEnqIpiEnt;
   }

   public void setCodEnqIpiEnt(BigDecimal codEnqIpiEnt) {
        markAsChanged("CODENQIPIENT", codEnqIpiEnt);
        this.codEnqIpiEnt = codEnqIpiEnt;
   }

   public BigDecimal getCodEnqIpiSai() {
        return codEnqIpiSai;
   }

   public void setCodEnqIpiSai(BigDecimal codEnqIpiSai) {
        markAsChanged("CODENQIPISAI", codEnqIpiSai);
        this.codEnqIpiSai = codEnqIpiSai;
   }

   public BigDecimal getAliqGeral() {
        return aliqGeral;
   }

   public void setAliqGeral(BigDecimal aliqGeral) {
        markAsChanged("ALIQGERAL", aliqGeral);
        this.aliqGeral = aliqGeral;
   }

   public BigDecimal getMvaPadrao() {
        return mvaPadrao;
   }

   public void setMvaPadrao(BigDecimal mvaPadrao) {
        markAsChanged("MVAPADRAO", mvaPadrao);
        this.mvaPadrao = mvaPadrao;
   }

   public BigDecimal getGrupoIcms2() {
        return grupoIcms2;
   }

   public void setGrupoIcms2(BigDecimal grupoIcms2) {
        markAsChanged("GRUPOICMS2", grupoIcms2);
        this.grupoIcms2 = grupoIcms2;
   }

   public String getUsaContPesoVar() {
        return usaContPesoVar;
   }

   public void setUsaContPesoVar(String usaContPesoVar) {
        markAsChanged("USACONTPESOVAR", usaContPesoVar);
        this.usaContPesoVar = usaContPesoVar;
   }

   public BigDecimal getPercTolPesoMaior() {
        return percTolPesoMaior;
   }

   public void setPercTolPesoMaior(BigDecimal percTolPesoMaior) {
        markAsChanged("PERCTOLPESOMAIOR", percTolPesoMaior);
        this.percTolPesoMaior = percTolPesoMaior;
   }

   public BigDecimal getPercTolPesoMaiorSep() {
        return percTolPesoMaiorSep;
   }

   public void setPercTolPesoMaiorSep(BigDecimal percTolPesoMaiorSep) {
        markAsChanged("PERCTOLPESOMAIORSEP", percTolPesoMaiorSep);
        this.percTolPesoMaiorSep = percTolPesoMaiorSep;
   }

   public BigDecimal getPercTolPesoMenor() {
        return percTolPesoMenor;
   }

   public void setPercTolPesoMenor(BigDecimal percTolPesoMenor) {
        markAsChanged("PERCTOLPESOMENOR", percTolPesoMenor);
        this.percTolPesoMenor = percTolPesoMenor;
   }

   public String getCodVolPesoVar() {
        return codVolPesoVar;
   }

   public void setCodVolPesoVar(String codVolPesoVar) {
        markAsChanged("CODVOLPESOVAR", codVolPesoVar);
        this.codVolPesoVar = codVolPesoVar;
   }

   public BigDecimal getPercCmtImp() {
        return percCmtImp;
   }

   public void setPercCmtImp(BigDecimal percCmtImp) {
        markAsChanged("PERCCMTIMP", percCmtImp);
        this.percCmtImp = percCmtImp;
   }

   public BigDecimal getPercCmtNac() {
        return percCmtNac;
   }

   public void setPercCmtNac(BigDecimal percCmtNac) {
        markAsChanged("PERCCMTNAC", percCmtNac);
        this.percCmtNac = percCmtNac;
   }

   public String getSerFaturCon() {
        return serFaturCon;
   }

   public void setSerFaturCon(String serFaturCon) {
        markAsChanged("SERFATURCON", serFaturCon);
        this.serFaturCon = serFaturCon;
   }

   public BigDecimal getTopFaturCon() {
        return topFaturCon;
   }

   public void setTopFaturCon(BigDecimal topFaturCon) {
        markAsChanged("TOPFATURCON", topFaturCon);
        this.topFaturCon = topFaturCon;
   }

   public BigDecimal getNumItemRea() {
        return numItemRea;
   }

   public void setNumItemRea(BigDecimal numItemRea) {
        markAsChanged("NUMITEMREA", numItemRea);
        this.numItemRea = numItemRea;
   }

   public String getObsEtiqueta() {
        return obsEtiqueta;
   }

   public void setObsEtiqueta(String obsEtiqueta) {
        markAsChanged("OBSETIQUETA", obsEtiqueta);
        this.obsEtiqueta = obsEtiqueta;
   }

   public String getOrigProd() {
        return origProd;
   }

   public void setOrigProd(String origProd) {
        markAsChanged("ORIGPROD", origProd);
        this.origProd = origProd;
   }

   public String getPadrao() {
        return padrao;
   }

   public void setPadrao(String padrao) {
        markAsChanged("PADRAO", padrao);
        this.padrao = padrao;
   }

   public BigDecimal getPercAumentCusto() {
        return percAumentCusto;
   }

   public void setPercAumentCusto(BigDecimal percAumentCusto) {
        markAsChanged("PERCAUMENTCUSTO", percAumentCusto);
        this.percAumentCusto = percAumentCusto;
   }

   public String getExigeLastroCamadas() {
        return exigeLastroCamadas;
   }

   public void setExigeLastroCamadas(String exigeLastroCamadas) {
        markAsChanged("EXIGELASTROCAMADAS", exigeLastroCamadas);
        this.exigeLastroCamadas = exigeLastroCamadas;
   }

   public String getFixoAgenda() {
        return fixoAgenda;
   }

   public void setFixoAgenda(String fixoAgenda) {
        markAsChanged("FIXOAGENDA", fixoAgenda);
        this.fixoAgenda = fixoAgenda;
   }

   public Timestamp getDtSubst() {
        return dtSubst;
   }

   public void setDtSubst(Timestamp dtSubst) {
        markAsChanged("DTSUBST", dtSubst);
        this.dtSubst = dtSubst;
   }

   public BigDecimal getCodProdSubst() {
        return codProdSubst;
   }

   public void setCodProdSubst(BigDecimal codProdSubst) {
        markAsChanged("CODPRODSUBST", codProdSubst);
        this.codProdSubst = codProdSubst;
   }

   public String getCat1799Spres() {
        return cat1799Spres;
   }

   public void setCat1799Spres(String cat1799Spres) {
        markAsChanged("CAT1799SPRES", cat1799Spres);
        this.cat1799Spres = cat1799Spres;
   }

   public BigDecimal getCodComp() {
        return codComp;
   }

   public void setCodComp(BigDecimal codComp) {
        markAsChanged("CODCOMP", codComp);
        this.codComp = codComp;
   }

   public String getVisivelAppOs() {
        return visivelAppOs;
   }

   public void setVisivelAppOs(String visivelAppOs) {
        markAsChanged("VISIVELAPPOS", visivelAppOs);
        this.visivelAppOs = visivelAppOs;
   }

   public BigDecimal getCodParcConsig() {
        return codParcConsig;
   }

   public void setCodParcConsig(BigDecimal codParcConsig) {
        markAsChanged("CODPARCCONSIG", codParcConsig);
        this.codParcConsig = codParcConsig;
   }

   public String getTipoItemSped() {
        return tipoItemSped;
   }

   public void setTipoItemSped(String tipoItemSped) {
        markAsChanged("TIPOITEMSPED", tipoItemSped);
        this.tipoItemSped = tipoItemSped;
   }

   public BigDecimal getCodIdCnae() {
        return codIdCnae;
   }

   public void setCodIdCnae(BigDecimal codIdCnae) {
        markAsChanged("CODIDCNAE", codIdCnae);
        this.codIdCnae = codIdCnae;
   }

   public BigDecimal getCodNbs() {
        return codNbs;
   }

   public void setCodNbs(BigDecimal codNbs) {
        markAsChanged("CODNBS", codNbs);
        this.codNbs = codNbs;
   }

   public String getConsProdCat42() {
        return consProdCat42;
   }

   public void setConsProdCat42(String consProdCat42) {
        markAsChanged("CONSPRODCAT42", consProdCat42);
        this.consProdCat42 = consProdCat42;
   }

   public BigDecimal getDesvioMaxTolConfSep() {
        return desvioMaxTolConfSep;
   }

   public void setDesvioMaxTolConfSep(BigDecimal desvioMaxTolConfSep) {
        markAsChanged("DESVIOMAXTOLCONFSEP", desvioMaxTolConfSep);
        this.desvioMaxTolConfSep = desvioMaxTolConfSep;
   }

   public BigDecimal getDesvioMinTolConfSep() {
        return desvioMinTolConfSep;
   }

   public void setDesvioMinTolConfSep(BigDecimal desvioMinTolConfSep) {
        markAsChanged("DESVIOMINTOLCONFSEP", desvioMinTolConfSep);
        this.desvioMinTolConfSep = desvioMinTolConfSep;
   }

   public String getFragmentaLote() {
        return fragmentaLote;
   }

   public void setFragmentaLote(String fragmentaLote) {
        markAsChanged("FRAGMENTALOTE", fragmentaLote);
        this.fragmentaLote = fragmentaLote;
   }

   public BigDecimal getGrupoTransg() {
        return grupoTransg;
   }

   public void setGrupoTransg(BigDecimal grupoTransg) {
        markAsChanged("GRUPOTRANSG", grupoTransg);
        this.grupoTransg = grupoTransg;
   }

   public String getMotIsencaoAnvisa() {
        return motIsencaoAnvisa;
   }

   public void setMotIsencaoAnvisa(String motIsencaoAnvisa) {
        markAsChanged("MOTISENCAOANVISA", motIsencaoAnvisa);
        this.motIsencaoAnvisa = motIsencaoAnvisa;
   }

   public BigDecimal getPercRedBaseIcmsEfet() {
        return percRedBaseIcmsEfet;
   }

   public void setPercRedBaseIcmsEfet(BigDecimal percRedBaseIcmsEfet) {
        markAsChanged("PERCREDBASEICMSEFET", percRedBaseIcmsEfet);
        this.percRedBaseIcmsEfet = percRedBaseIcmsEfet;
   }

   public String getRegistrarPeso() {
        return registrarPeso;
   }

   public void setRegistrarPeso(String registrarPeso) {
        markAsChanged("REGISTRARPESO", registrarPeso);
        this.registrarPeso = registrarPeso;
   }

   public String getServPrestTer() {
        return servPrestTer;
   }

   public void setServPrestTer(String servPrestTer) {
        markAsChanged("SERVPRESTTER", servPrestTer);
        this.servPrestTer = servPrestTer;
   }

   public BigDecimal getTempMaxima() {
        return tempMaxima;
   }

   public void setTempMaxima(BigDecimal tempMaxima) {
        markAsChanged("TEMPMAXIMA", tempMaxima);
        this.tempMaxima = tempMaxima;
   }

   public String getControlado() {
        return controlado;
   }

   public void setControlado(String controlado) {
        markAsChanged("CONTROLADO", controlado);
        this.controlado = controlado;
   }

   public BigDecimal getTempMinima() {
        return tempMinima;
   }

   public void setTempMinima(BigDecimal tempMinima) {
        markAsChanged("TEMPMINIMA", tempMinima);
        this.tempMinima = tempMinima;
   }

   public String getTermolabil() {
        return termolabil;
   }

   public void setTermolabil(String termolabil) {
        markAsChanged("TERMOLABIL", termolabil);
        this.termolabil = termolabil;
   }

   public String getListaLpm() {
        return listaLpm;
   }

   public void setListaLpm(String listaLpm) {
        markAsChanged("LISTALPM", listaLpm);
        this.listaLpm = listaLpm;
   }

   public String getOneroso() {
        return oneroso;
   }

   public void setOneroso(String oneroso) {
        markAsChanged("ONEROSO", oneroso);
        this.oneroso = oneroso;
   }

   public String getRefMercMed() {
        return refMercMed;
   }

   public void setRefMercMed(String refMercMed) {
        markAsChanged("REFMERCMED", refMercMed);
        this.refMercMed = refMercMed;
   }

   public String getIdenPortaria() {
        return idenPortaria;
   }

   public void setIdenPortaria(String idenPortaria) {
        markAsChanged("IDENPORTARIA", idenPortaria);
        this.idenPortaria = idenPortaria;
   }

   public BigDecimal getCodPat() {
        return codPat;
   }

   public void setCodPat(BigDecimal codPat) {
        markAsChanged("CODPAT", codPat);
        this.codPat = codPat;
   }

   public BigDecimal getCodTer() {
        return codTer;
   }

   public void setCodTer(BigDecimal codTer) {
        markAsChanged("CODTER", codTer);
        this.codTer = codTer;
   }

   public String getIdenOtc() {
        return idenOtc;
   }

   public void setIdenOtc(String idenOtc) {
        markAsChanged("IDENOTC", idenOtc);
        this.idenOtc = idenOtc;
   }

   public String getIdenCosme() {
        return idenCosme;
   }

   public void setIdenCosme(String idenCosme) {
        markAsChanged("IDENCOSME", idenCosme);
        this.idenCosme = idenCosme;
   }

   public String getIdenCorRelato() {
        return idenCorRelato;
   }

   public void setIdenCorRelato(String idenCorRelato) {
        markAsChanged("IDENCORRELATO", idenCorRelato);
        this.idenCorRelato = idenCorRelato;
   }

   public BigDecimal getCodCpr() {
        return codCpr;
   }

   public void setCodCpr(BigDecimal codCpr) {
        markAsChanged("CODCPR", codCpr);
        this.codCpr = codCpr;
   }

   public BigDecimal getSeqSte() {
        return seqSte;
   }

   public void setSeqSte(BigDecimal seqSte) {
        markAsChanged("SEQSTE", seqSte);
        this.seqSte = seqSte;
   }

   public BigDecimal getCodCat() {
        return codCat;
   }

   public void setCodCat(BigDecimal codCat) {
        markAsChanged("CODCAT", codCat);
        this.codCat = codCat;
   }

   public BigDecimal getStatusMed() {
        return statusMed;
   }

   public void setStatusMed(BigDecimal statusMed) {
        markAsChanged("STATUSMED", statusMed);
        this.statusMed = statusMed;
   }

   public BigDecimal getSeqSca() {
        return seqSca;
   }

   public void setSeqSca(BigDecimal seqSca) {
        markAsChanged("SEQSCA", seqSca);
        this.seqSca = seqSca;
   }

   public String getProdFalta() {
        return prodFalta;
   }

   public void setProdFalta(String prodFalta) {
        markAsChanged("PRODFALTA", prodFalta);
        this.prodFalta = prodFalta;
   }

   public BigDecimal getCodFab() {
        return codFab;
   }

   public void setCodFab(BigDecimal codFab) {
        markAsChanged("CODFAB", codFab);
        this.codFab = codFab;
   }

   public BigDecimal getSeqSpr() {
        return seqSpr;
   }

   public void setSeqSpr(BigDecimal seqSpr) {
        markAsChanged("SEQSPR", seqSpr);
        this.seqSpr = seqSpr;
   }

   public BigDecimal getQtdIdentif() {
        return qtdIdentif;
   }

   public void setQtdIdentif(BigDecimal qtdIdentif) {
        markAsChanged("QTDIDENTIF", qtdIdentif);
        this.qtdIdentif = qtdIdentif;
   }

   public String getTipoIdentif() {
        return tipoIdentif;
   }

   public void setTipoIdentif(String tipoIdentif) {
        markAsChanged("TIPOIDENTIF", tipoIdentif);
        this.tipoIdentif = tipoIdentif;
   }

   public String getTemMedicao() {
        return temMedicao;
   }

   public void setTemMedicao(String temMedicao) {
        markAsChanged("TEMMEDICAO", temMedicao);
        this.temMedicao = temMedicao;
   }

   public BigDecimal getTipoSn() {
        return tipoSn;
   }

   public void setTipoSn(BigDecimal tipoSn) {
        markAsChanged("TIPOSN", tipoSn);
        this.tipoSn = tipoSn;
   }

   public BigDecimal getCodServTelecom() {
        return codServTelecom;
   }

   public void setCodServTelecom(BigDecimal codServTelecom) {
        markAsChanged("CODSERVTELECOM", codServTelecom);
        this.codServTelecom = codServTelecom;
   }

   public String getTipoContagem() {
        return tipoContagem;
   }

   public void setTipoContagem(String tipoContagem) {
        markAsChanged("TIPOCONTAGEM", tipoContagem);
        this.tipoContagem = tipoContagem;
   }

   public String getCodAnvisa() {
        return codAnvisa;
   }

   public void setCodAnvisa(String codAnvisa) {
        markAsChanged("CODANVISA", codAnvisa);
        this.codAnvisa = codAnvisa;
   }

   public String getDescrAnp() {
        return descrAnp;
   }

   public void setDescrAnp(String descrAnp) {
        markAsChanged("DESCRANP", descrAnp);
        this.descrAnp = descrAnp;
   }

   public BigDecimal getPercMistGlp() {
        return percMistGlp;
   }

   public void setPercMistGlp(BigDecimal percMistGlp) {
        markAsChanged("PERCMISTGLP", percMistGlp);
        this.percMistGlp = percMistGlp;
   }

   public BigDecimal getOrdemMedida() {
        return ordemMedida;
   }

   public void setOrdemMedida(BigDecimal ordemMedida) {
        markAsChanged("ORDEMMEDIDA", ordemMedida);
        this.ordemMedida = ordemMedida;
   }

   public BigDecimal getCodMarca() {
        return codMarca;
   }

   public void setCodMarca(BigDecimal codMarca) {
        markAsChanged("CODMARCA", codMarca);
        this.codMarca = codMarca;
   }

   public String getTemRastroLote() {
        return temRastroLote;
   }

   public void setTemRastroLote(String temRastroLote) {
        markAsChanged("TEMRASTROLOTE", temRastroLote);
        this.temRastroLote = temRastroLote;
   }

   public String getArmazeLote() {
        return armazeLote;
   }

   public void setArmazeLote(String armazeLote) {
        markAsChanged("ARMAZELOTE", armazeLote);
        this.armazeLote = armazeLote;
   }

   public BigDecimal getMvaOriginalDrCst() {
        return mvaOriginalDrCst;
   }

   public void setMvaOriginalDrCst(BigDecimal mvaOriginalDrCst) {
        markAsChanged("MVAORIGINALDRCST", mvaOriginalDrCst);
        this.mvaOriginalDrCst = mvaOriginalDrCst;
   }

   public String getCodFciCalc() {
        return codFciCalc;
   }

   public void setCodFciCalc(String codFciCalc) {
        markAsChanged("CODFCICALC", codFciCalc);
        this.codFciCalc = codFciCalc;
   }

   public BigDecimal getVlrComercCalc() {
        return vlrComercCalc;
   }

   public void setVlrComercCalc(BigDecimal vlrComercCalc) {
        markAsChanged("VLRCOMERCCALC", vlrComercCalc);
        this.vlrComercCalc = vlrComercCalc;
   }

   public BigDecimal getVlrParcImpExtCalc() {
        return vlrParcImpExtCalc;
   }

   public void setVlrParcImpExtCalc(BigDecimal vlrParcImpExtCalc) {
        markAsChanged("VLRPARCIMPEXTCALC", vlrParcImpExtCalc);
        this.vlrParcImpExtCalc = vlrParcImpExtCalc;
   }

   public String getCodBarComp() {
        return codBarComp;
   }

   public void setCodBarComp(String codBarComp) {
        markAsChanged("CODBARCOMP", codBarComp);
        this.codBarComp = codBarComp;
   }

   public BigDecimal getIncPesoBruto() {
        return incPesoBruto;
   }

   public void setIncPesoBruto(BigDecimal incPesoBruto) {
        markAsChanged("INCPESOBRUTO", incPesoBruto);
        this.incPesoBruto = incPesoBruto;
   }

   public BigDecimal getIncPesoLiquido() {
        return incPesoLiquido;
   }

   public void setIncPesoLiquido(BigDecimal incPesoLiquido) {
        markAsChanged("INCPESOLIQUIDO", incPesoLiquido);
        this.incPesoLiquido = incPesoLiquido;
   }

   public BigDecimal getNuRfe() {
        return nuRfe;
   }

   public void setNuRfe(BigDecimal nuRfe) {
        markAsChanged("NURFE", nuRfe);
        this.nuRfe = nuRfe;
   }

   public BigDecimal getModEtiqSepWms() {
        return modEtiqSepWms;
   }

   public void setModEtiqSepWms(BigDecimal modEtiqSepWms) {
        markAsChanged("MODETIQSEPWMS", modEtiqSepWms);
        this.modEtiqSepWms = modEtiqSepWms;
   }

   public String getImpEtiqSepWms() {
        return impEtiqSepWms;
   }

   public void setImpEtiqSepWms(String impEtiqSepWms) {
        markAsChanged("IMPETIQSEPWMS", impEtiqSepWms);
        this.impEtiqSepWms = impEtiqSepWms;
   }

   public String getNroProcesso() {
        return nroProcesso;
   }

   public void setNroProcesso(String nroProcesso) {
        markAsChanged("NROPROCESSO", nroProcesso);
        this.nroProcesso = nroProcesso;
   }

   public BigDecimal getPercCmtMun() {
        return percCmtMun;
   }

   public void setPercCmtMun(BigDecimal percCmtMun) {
        markAsChanged("PERCCMTMUN", percCmtMun);
        this.percCmtMun = percCmtMun;
   }

   public BigDecimal getPercCmtFed() {
        return percCmtFed;
   }

   public void setPercCmtFed(BigDecimal percCmtFed) {
        markAsChanged("PERCCMTFED", percCmtFed);
        this.percCmtFed = percCmtFed;
   }

   public BigDecimal getPercCmtEst() {
        return percCmtEst;
   }

   public void setPercCmtEst(BigDecimal percCmtEst) {
        markAsChanged("PERCCMTEST", percCmtEst);
        this.percCmtEst = percCmtEst;
   }

   public BigDecimal getCorFontConsPreco() {
        return corFontConsPreco;
   }

   public void setCorFontConsPreco(BigDecimal corFontConsPreco) {
        markAsChanged("CORFONTCONSPRECO", corFontConsPreco);
        this.corFontConsPreco = corFontConsPreco;
   }

   public BigDecimal getCorFundoConsPreco() {
        return corFundoConsPreco;
   }

   public void setCorFundoConsPreco(BigDecimal corFundoConsPreco) {
        markAsChanged("CORFUNDOCONSPRECO", corFundoConsPreco);
        this.corFundoConsPreco = corFundoConsPreco;
   }

   public String getCalcDifAl() {
        return calcDifAl;
   }

   public void setCalcDifAl(String calcDifAl) {
        markAsChanged("CALCDIFAL", calcDifAl);
        this.calcDifAl = calcDifAl;
   }

   public BigDecimal getClassifCessaoObra() {
        return classifCessaoObra;
   }

   public void setClassifCessaoObra(BigDecimal classifCessaoObra) {
        markAsChanged("CLASSIFCESSAOOBRA", classifCessaoObra);
        this.classifCessaoObra = classifCessaoObra;
   }

   public String getCnpjFabricante() {
        return cnpjFabricante;
   }

   public void setCnpjFabricante(String cnpjFabricante) {
        markAsChanged("CNPJFABRICANTE", cnpjFabricante);
        this.cnpjFabricante = cnpjFabricante;
   }

   public String getCodAgregacao() {
        return codAgregacao;
   }

   public void setCodAgregacao(String codAgregacao) {
        markAsChanged("CODAGREGACAO", codAgregacao);
        this.codAgregacao = codAgregacao;
   }

   public String getCodAtivReintegra() {
        return codAtivReintegra;
   }

   public void setCodAtivReintegra(String codAtivReintegra) {
        markAsChanged("CODATIVREINTEGRA", codAtivReintegra);
        this.codAtivReintegra = codAtivReintegra;
   }

   public String getCodBenefNauf() {
        return codBenefNauf;
   }

   public void setCodBenefNauf(String codBenefNauf) {
        markAsChanged("CODBENEFNAUF", codBenefNauf);
        this.codBenefNauf = codBenefNauf;
   }

   public String getCodCprb() {
        return codCprb;
   }

   public void setCodCprb(String codCprb) {
        markAsChanged("CODCPRB", codCprb);
        this.codCprb = codCprb;
   }

   public BigDecimal getCodCtaCtbEfd() {
        return codCtaCtbEfd;
   }

   public void setCodCtaCtbEfd(BigDecimal codCtaCtbEfd) {
        markAsChanged("CODCTACTBEFD", codCtaCtbEfd);
        this.codCtaCtbEfd = codCtaCtbEfd;
   }

   public BigDecimal getCodFiltroCta() {
        return codFiltroCta;
   }

   public void setCodFiltroCta(BigDecimal codFiltroCta) {
        markAsChanged("CODFILTROCTA", codFiltroCta);
        this.codFiltroCta = codFiltroCta;
   }

   public String getComercializacaoAgri() {
        return comercializacaoAgri;
   }

   public void setComercializacaoAgri(String comercializacaoAgri) {
        markAsChanged("COMERCIALIZACAOAGRI", comercializacaoAgri);
        this.comercializacaoAgri = comercializacaoAgri;
   }

   public String getIndEscala() {
        return indEscala;
   }

   public void setIndEscala(String indEscala) {
        markAsChanged("INDESCALA", indEscala);
        this.indEscala = indEscala;
   }

   public BigDecimal getObraConstCivil() {
        return obraConstCivil;
   }

   public void setObraConstCivil(BigDecimal obraConstCivil) {
        markAsChanged("OBRACONSTCIVIL", obraConstCivil);
        this.obraConstCivil = obraConstCivil;
   }

   public BigDecimal getPercInssEspecial() {
        return percInssEspecial;
   }

   public void setPercInssEspecial(BigDecimal percInssEspecial) {
        markAsChanged("PERCINSSESPECIAL", percInssEspecial);
        this.percInssEspecial = percInssEspecial;
   }

   public BigDecimal getPercMistGni() {
        return percMistGni;
   }

   public void setPercMistGni(BigDecimal percMistGni) {
        markAsChanged("PERCMISTGNI", percMistGni);
        this.percMistGni = percMistGni;
   }

   public String getUtilizaEndFlut() {
        return utilizaEndFlut;
   }

   public void setUtilizaEndFlut(String utilizaEndFlut) {
        markAsChanged("UTILIZAENDFLUT", utilizaEndFlut);
        this.utilizaEndFlut = utilizaEndFlut;
   }

   public BigDecimal getPercMistGnn() {
        return percMistGnn;
   }

   public void setPercMistGnn(BigDecimal percMistGnn) {
        markAsChanged("PERCMISTGNN", percMistGnn);
        this.percMistGnn = percMistGnn;
   }

   public BigDecimal getQtdAgrupamentoMtz() {
        return qtdAgrupamentoMtz;
   }

   public void setQtdAgrupamentoMtz(BigDecimal qtdAgrupamentoMtz) {
        markAsChanged("QTDAGRUPAMENTOMTZ", qtdAgrupamentoMtz);
        this.qtdAgrupamentoMtz = qtdAgrupamentoMtz;
   }

   public String getTipoInssEspecial() {
        return tipoInssEspecial;
   }

   public void setTipoInssEspecial(String tipoInssEspecial) {
        markAsChanged("TIPOINSSESPECIAL", tipoInssEspecial);
        this.tipoInssEspecial = tipoInssEspecial;
   }

   public BigDecimal getVlrPartidaGlp() {
        return vlrPartidaGlp;
   }

   public void setVlrPartidaGlp(BigDecimal vlrPartidaGlp) {
        markAsChanged("VLRPARTIDAGLP", vlrPartidaGlp);
        this.vlrPartidaGlp = vlrPartidaGlp;
   }

   public String getIntegraEconect() {
        return integraEconect;
   }

   public void setIntegraEconect(String integraEconect) {
        markAsChanged("INTEGRAECONECT", integraEconect);
        this.integraEconect = integraEconect;
   }

   public BigDecimal getMaxMultEconect() {
        return maxMultEconect;
   }

   public void setMaxMultEconect(BigDecimal maxMultEconect) {
        markAsChanged("MAXMULTECONECT", maxMultEconect);
        this.maxMultEconect = maxMultEconect;
   }

   public String getUtilSmartCard() {
        return utilSmartCard;
   }

   public void setUtilSmartCard(String utilSmartCard) {
        markAsChanged("UTILSMARTCARD", utilSmartCard);
        this.utilSmartCard = utilSmartCard;
   }

   public BigDecimal getNatEfdContM410M810() {
        return natEfdContM410M810;
   }

   public void setNatEfdContM410M810(BigDecimal natEfdContM410M810) {
        markAsChanged("NATEFDCONTM410M810", natEfdContM410M810);
        this.natEfdContM410M810 = natEfdContM410M810;
   }

   public BigDecimal getCodVtp() {
        return codVtp;
   }

   public void setCodVtp(BigDecimal codVtp) {
        markAsChanged("CODVTP", codVtp);
        this.codVtp = codVtp;
   }

   public String getIndTipRefBcIcmsSt() {
        return indTipRefBcIcmsSt;
   }

   public void setIndTipRefBcIcmsSt(String indTipRefBcIcmsSt) {
        markAsChanged("INDTIPREFBCICMSST", indTipRefBcIcmsSt);
        this.indTipRefBcIcmsSt = indTipRefBcIcmsSt;
   }

   public String getConEstOrigProd() {
        return conEstOrigProd;
   }

   public void setConEstOrigProd(String conEstOrigProd) {
        markAsChanged("CONESTORIGPROD", conEstOrigProd);
        this.conEstOrigProd = conEstOrigProd;
   }

   public BigDecimal getTamanhoMedioPeca() {
        return tamanhoMedioPeca;
   }

   public void setTamanhoMedioPeca(BigDecimal tamanhoMedioPeca) {
        markAsChanged("TAMANHOMEDIOPECA", tamanhoMedioPeca);
        this.tamanhoMedioPeca = tamanhoMedioPeca;
   }

   public String getStatusNcm() {
        return statusNcm;
   }

   public void setStatusNcm(String statusNcm) {
        markAsChanged("STATUSNCM", statusNcm);
        this.statusNcm = statusNcm;
   }

   public String getWmsProdRastSerMed() {
        return wmsProdRastSerMed;
   }

   public void setWmsProdRastSerMed(String wmsProdRastSerMed) {
        markAsChanged("WMSPRODRASTSERMED", wmsProdRastSerMed);
        this.wmsProdRastSerMed = wmsProdRastSerMed;
   }

   public String getServDespNTrib() {
        return servDespNTrib;
   }

   public void setServDespNTrib(String servDespNTrib) {
        markAsChanged("SERVDESPNTRIB", servDespNTrib);
        this.servDespNTrib = servDespNTrib;
   }

   public String getProdAliadrCst() {
        return prodAliadrCst;
   }

   public void setProdAliadrCst(String prodAliadrCst) {
        markAsChanged("PRODALIADRCST", prodAliadrCst);
        this.prodAliadrCst = prodAliadrCst;
   }

   public String getGerImpNRetReinfaQ() {
        return gerImpNRetReinfaQ;
   }

   public void setGerImpNRetReinfaQ(String gerImpNRetReinfaQ) {
        markAsChanged("GERIMPNRETREINFAQ", gerImpNRetReinfaQ);
        this.gerImpNRetReinfaQ = gerImpNRetReinfaQ;
   }

   public BigDecimal getAliqFetHab() {
        return aliqFetHab;
   }

   public void setAliqFetHab(BigDecimal aliqFetHab) {
        markAsChanged("ALIQFETHAB", aliqFetHab);
        this.aliqFetHab = aliqFetHab;
   }

   public String getCodVolFetHab() {
        return codVolFetHab;
   }

   public void setCodVolFetHab(String codVolFetHab) {
        markAsChanged("CODVOLFETHAB", codVolFetHab);
        this.codVolFetHab = codVolFetHab;
   }

   public String getCalcFuntTelPro() {
        return calcFuntTelPro;
   }

   public void setCalcFuntTelPro(String calcFuntTelPro) {
        markAsChanged("CALCFUNTTELPRO", calcFuntTelPro);
        this.calcFuntTelPro = calcFuntTelPro;
   }

   public String getCalcFustPro() {
        return calcFustPro;
   }

   public void setCalcFustPro(String calcFustPro) {
        markAsChanged("CALCFUSTPRO", calcFustPro);
        this.calcFustPro = calcFustPro;
   }

   public BigDecimal getTipUtilCom() {
        return tipUtilCom;
   }

   public void setTipUtilCom(BigDecimal tipUtilCom) {
        markAsChanged("TIPUTILCOM", tipUtilCom);
        this.tipUtilCom = tipUtilCom;
   }

   public String getCodBarDifGtin() {
        return codBarDifGtin;
   }

   public void setCodBarDifGtin(String codBarDifGtin) {
        markAsChanged("CODBARDIFGTIN", codBarDifGtin);
        this.codBarDifGtin = codBarDifGtin;
   }

   public String getCodBarTribDifGtin() {
        return codBarTribDifGtin;
   }

   public void setCodBarTribDifGtin(String codBarTribDifGtin) {
        markAsChanged("CODBARTRIBDIFGTIN", codBarTribDifGtin);
        this.codBarTribDifGtin = codBarTribDifGtin;
   }

   public String getProdInterno() {
        return prodInterno;
   }

   public void setProdInterno(String prodInterno) {
        markAsChanged("PRODINTERNO", prodInterno);
        this.prodInterno = prodInterno;
   }

   public BigDecimal getAliqImp() {
        return aliqImp;
   }

   public void setAliqImp(BigDecimal aliqImp) {
        markAsChanged("ALIQIMP", aliqImp);
        this.aliqImp = aliqImp;
   }

   public BigDecimal getAliqNac() {
        return aliqNac;
   }

   public void setAliqNac(BigDecimal aliqNac) {
        markAsChanged("ALIQNAC", aliqNac);
        this.aliqNac = aliqNac;
   }

   public String getAtuNuVersao() {
        return atuNuVersao;
   }

   public void setAtuNuVersao(String atuNuVersao) {
        markAsChanged("ATUNUVERSAO", atuNuVersao);
        this.atuNuVersao = atuNuVersao;
   }

   public BigDecimal getIntegraFox() {
        return integraFox;
   }

   public void setIntegraFox(BigDecimal integraFox) {
        markAsChanged("INTEGRAFOX", integraFox);
        this.integraFox = integraFox;
   }

   public BigDecimal getNuVersao() {
        return nuVersao;
   }

   public void setNuVersao(BigDecimal nuVersao) {
        markAsChanged("NUVERSAO", nuVersao);
        this.nuVersao = nuVersao;
   }

   public char[] getGradePadrao() {
        return gradePadrao;
   }

   public void setGradePadrao(char[] gradePadrao) {
        markAsChanged("GRADEPADRAO", gradePadrao);
        this.gradePadrao = gradePadrao;
   }

   public BigDecimal getIdGrade() {
        return idGrade;
   }

   public void setIdGrade(BigDecimal idGrade) {
        markAsChanged("IDGRADE", idGrade);
        this.idGrade = idGrade;
   }

   public BigDecimal getPercentSepPul() {
        return percentSepPul;
   }

   public void setPercentSepPul(BigDecimal percentSepPul) {
        markAsChanged("PERCENTSEPPUL", percentSepPul);
        this.percentSepPul = percentSepPul;
   }

   public String getObtStAntMedEnt() {
        return obtStAntMedEnt;
   }

   public void setObtStAntMedEnt(String obtStAntMedEnt) {
        markAsChanged("OBTSTANTMEDENT", obtStAntMedEnt);
        this.obtStAntMedEnt = obtStAntMedEnt;
   }

   public String getDescProdDrCst() {
        return descProdDrCst;
   }

   public void setDescProdDrCst(String descProdDrCst) {
        markAsChanged("DESCPRODDRCST", descProdDrCst);
        this.descProdDrCst = descProdDrCst;
   }

   public BigDecimal getAliqInternaCat42() {
        return aliqInternaCat42;
   }

   public void setAliqInternaCat42(BigDecimal aliqInternaCat42) {
        markAsChanged("ALIQINTERNACAT42", aliqInternaCat42);
        this.aliqInternaCat42 = aliqInternaCat42;
   }

   public String getDesDescCalcPis() {
        return desDescCalcPis;
   }

   public void setDesDescCalcPis(String desDescCalcPis) {
        markAsChanged("DESDESCCALCPIS", desDescCalcPis);
        this.desDescCalcPis = desDescCalcPis;
   }

   public BigDecimal getAliqFecop() {
        return aliqFecop;
   }

   public void setAliqFecop(BigDecimal aliqFecop) {
        markAsChanged("ALIQFECOP", aliqFecop);
        this.aliqFecop = aliqFecop;
   }

   public BigDecimal getMvaOriginalAdrCst() {
        return mvaOriginalAdrCst;
   }

   public void setMvaOriginalAdrCst(BigDecimal mvaOriginalAdrCst) {
        markAsChanged("MVAORIGINALADRCST", mvaOriginalAdrCst);
        this.mvaOriginalAdrCst = mvaOriginalAdrCst;
   }

   public String getParticipaAdrCst() {
        return participaAdrCst;
   }

   public void setParticipaAdrCst(String participaAdrCst) {
        markAsChanged("PARTICIPAADRCST", participaAdrCst);
        this.participaAdrCst = participaAdrCst;
   }

   public String getProdSujFecop() {
        return prodSujFecop;
   }

   public void setProdSujFecop(String prodSujFecop) {
        markAsChanged("PRODSUJFECOP", prodSujFecop);
        this.prodSujFecop = prodSujFecop;
   }

   public String getCalRupturaEstoque() {
        return calRupturaEstoque;
   }

   public void setCalRupturaEstoque(String calRupturaEstoque) {
        markAsChanged("CALRUPTURAESTOQUE", calRupturaEstoque);
        this.calRupturaEstoque = calRupturaEstoque;
   }

   public String getCodVolKanban() {
        return codVolKanban;
   }

   public void setCodVolKanban(String codVolKanban) {
        markAsChanged("CODVOLKANBAN", codVolKanban);
        this.codVolKanban = codVolKanban;
   }

   public String getBloqVendaFrac() {
        return bloqVendaFrac;
   }

   public void setBloqVendaFrac(String bloqVendaFrac) {
        markAsChanged("BLOQVENDAFRAC", bloqVendaFrac);
        this.bloqVendaFrac = bloqVendaFrac;
   }

   public BigDecimal getCodNatRend() {
        return codNatRend;
   }

   public void setCodNatRend(BigDecimal codNatRend) {
        markAsChanged("CODNATREND", codNatRend);
        this.codNatRend = codNatRend;
   }

   public BigDecimal getTpIrrfExt() {
        return tpIrrfExt;
   }

   public void setTpIrrfExt(BigDecimal tpIrrfExt) {
        markAsChanged("TPIRRFEXT", tpIrrfExt);
        this.tpIrrfExt = tpIrrfExt;
   }

   public BigDecimal getPercIndMistura() {
        return percIndMistura;
   }

   public void setPercIndMistura(BigDecimal percIndMistura) {
        markAsChanged("PERCINDMISTURA", percIndMistura);
        this.percIndMistura = percIndMistura;
   }

   public String getOpExpFetHab() {
        return opExpFetHab;
   }

   public void setOpExpFetHab(String opExpFetHab) {
        markAsChanged("OPEEXPFETHAB", opExpFetHab);
        this.opExpFetHab = opExpFetHab;
   }

   public String getOpeIntEstFetHab() {
        return opeIntEstFetHab;
   }

   public void setOpeIntEstFetHab(String opeIntEstFetHab) {
        markAsChanged("OPEINTESTFETHAB", opeIntEstFetHab);
        this.opeIntEstFetHab = opeIntEstFetHab;
   }

   public String getOpeIntFetHab() {
        return opeIntFetHab;
   }

   public void setOpeIntFetHab(String opeIntFetHab) {
        markAsChanged("OPEINTFETHAB", opeIntFetHab);
        this.opeIntFetHab = opeIntFetHab;
   }

   @Override
   public String getTableName() {
        return "TGFPRO";
   }

   @Override
   public String getEntityName() {
        return "Produto";
   }

   @Override
   public Produto fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codProdSubkit = vo.asBigDecimal("CODPRODSUBKIT");
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
        this.apuraProdEpe = vo.asString("APURAPRODEPE");
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
        this.lisContEst = vo.asString("LISCONTEST");
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
        this.componObrig = vo.asString("COMPONOBRIG");
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
        this.geraPlProd = vo.asString("GERAPLAPROD");
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
        this.implAudLote = vo.asString("IMPLAUDOLOTE");
        this.impOrdemCorte = vo.asString("IMPORDEMCORTE");
        this.indEspProdEpe = vo.asString("INDESPPRODEPE");
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
        this.tipContEst = vo.asString("TIPCONTEST");
        this.tipContEstWms = vo.asString("TIPCONTESTWMS");
        this.tipGtinNfe = vo.asBigDecimal("TIPGTINNFE");
        this.tipLancNota = vo.asString("TIPLANCNOTA");
        this.tipo = vo.asString("TIPO");
        this.tipSerNfe = vo.asString("TIPSERNFE");
        this.tipSubst = vo.asString("TIPSUBST");
        this.titContEst = vo.asString("TITCONTEST");
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
        this.idenCorRelato = vo.asString("IDENCORRELATO");
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
        this.nroProcesso = vo.asString("NROPROCESSO");
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
        this.gerImpNRetReinfaQ = vo.asString("GERIMPNRETREINFAQ");
        this.aliqFetHab = vo.asBigDecimal("ALIQFETHAB");
        this.codVolFetHab = vo.asString("CODVOLFETHAB");
        this.calcFuntTelPro = vo.asString("CALCFUNTTELPRO");
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
