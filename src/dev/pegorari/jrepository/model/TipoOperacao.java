package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TipoOperacao implements SankhyaEntity<TipoOperacao> {

   private String usarPrecoCusto;
   private String usoProdSeparacao;
   private String valTbCompCr;
   private String valVctLaudoEst;
   private String vendIte;
   private BigDecimal codModNfse;
   private BigDecimal codModRps;
   private String codNatOperIss;
   private String calcDifAlPart;
   private String valSitCadSefaz;
   private String transfCbGlobal;
   private String transfWms;
   private String travafimImp;
   private String usaCusMedBaseSt;
   private String usarConfCega;
   private String aceitaFatAcima;
   private String agrupaProdNfe;
   private String agrupaServFat;
   private String altItemParcFat;
   private String altNfConf;
   private BigDecimal analiseGiro;
   private String armazenagem;
   private String ativo;
   private String atualAcdc;
   private String atualBem;
   private String atualCom;
   private String atualComOs;
   private String atualCtb;
   private String atualDatRecWms;
   private String atualEst;
   private BigDecimal atualEstMp;
   private String atualEstTerc;
   private BigDecimal atualFin;
   private String atualFinTerc;
   private BigDecimal atualIndeniz;
   private String atualizarAteio;
   private String atualLivFis;
   private String atualLivIss;
   private String atualPrecoFat;
   private BigDecimal atualTransg;
   private String atualUltimaComp;
   private String atualUltimaVend;
   private String autDigital;
   private String avisarComp;
   private String baseIcmsFreteCalcSt;
   private String baseNumeracao;
   private String bloqEstVenc;
   private String bonificacao;
   private String busCmpTerc;
   private String calcDifIcms;
   private String calcIcms;
   private String camGerEdiConf;
   private String classifIcms;
   private BigDecimal codCfoCombustLubrif;
   private BigDecimal codCfoEntrada;
   private BigDecimal codCfoEntradaFora;
   private BigDecimal codCfoSaida;
   private BigDecimal codCfoSaidaFora;
   private BigDecimal codCfoTerc;
   private BigDecimal codCfps;
   private String descRemail;
   private String utilizaWms;
   private String valEst;
   private String validaAgrupMin;
   private String validaAtraso;
   private String validaData;
   private String validaMediaNegoc;
   private String integSerCon;
   private String marcarNaoPendente;
   private String mpNumAutLote;
   private String naoIncConf;
   private String natBcCred;
   private String natOperSped;
   private String nfe;
   private String nfeEstorno;
   private String nfeSemDtEntSai;
   private String nfse;
   private String nfsePorNat;
   private BigDecimal nucCo;
   private BigDecimal nuLayout;
   private String numSomAut;
   private BigDecimal nuNotaModelo;
   private String obterVlrMoedaFat;
   private String oc;
   private String pedFrete;
   private String pendente;
   private String permConfParcialWms;
   private String pesaItem;
   private String pisPropDestaque;
   private String pisPropEmbalagem;
   private String pisPropFrete;
   private String pisPropJuro;
   private String pisPropSeg;
   private String pisStPropDestaque;
   private String pisStPropEmbalagem;
   private String pisStPropFrete;
   private String pisStPropJuro;
   private String pisStPropSeg;
   private String podeAjustarOrigProdWms;
   private String podeFixar;
   private String podePesagem;
   private String podeTransfEnt;
   private String precifica;
   private String prodRep;
   private String provisEntrega;
   private String ratAutProd;
   private String refNfe;
   private String sepBalcao;
   private String solCompra;
   private String somarCofinsSt;
   private String somarIpi;
   private String somarPisSt;
   private String somarSubst;
   private String statusBaixaEst;
   private String statusLote;
   private String stPropDestaque;
   private String stPropEmbalagem;
   private String stPropFrete;
   private String stPropFreteExt;
   private String stPropJuro;
   private String stPropSeg;
   private String sugereLocalParc;
   private String temCofins;
   private String temCsl;
   private String temFinOrigem;
   private String temFunRural;
   private String temIcms;
   private String temIi;
   private String temIndex;
   private String temIpi;
   private String temIrf;
   private String temIss;
   private String temPis;
   private String temReaIcms;
   private String temVavtCon;
   private String tipAltDtVenc;
   private String tipAtualFin;
   private String tipAtualWms;
   private String tipFatServ;
   private String tipIcms;
   private String tipIpi;
   private String tipIvaSubst;
   private String tipMov;
   private String tipMovBemsPed;
   private String tipoImpKit;
   private String tipoNumeracao;
   private BigDecimal vlrBasePgto;
   private BigDecimal vlrMinAp;
   private String ipiEmbut;
   private String ipiIncIcms;
   private String ipiPropDestaque;
   private String ipiPropEmbalagem;
   private String ipiPropFrete;
   private String ipiPropJuro;
   private String ipiPropSeg;
   private String laudoItem;
   private String gerar1400Sped;
   private String usaAliqNatRatF100;
   private String valNum;
   private String impNaoConf;
   private String impNotaAdicional;
   private BigDecimal codRemedi;
   private BigDecimal codTipOper;
   private BigDecimal codTipOperDeneg;
   private BigDecimal codTipOperDestino;
   private BigDecimal codTipOperPenRet;
   private BigDecimal codTipOperRem;
   private BigDecimal codTipOperSeparacao;
   private BigDecimal codTrib;
   private BigDecimal codUsu;
   private String cofinsPropDestaque;
   private String cofinsPropEmbalagem;
   private String cofinsPropFrete;
   private String cofinsPropJuro;
   private String cofinsPropSeg;
   private String cofinsStPropDestaque;
   private String cofinsStPropEmbalagem;
   private String cofinsStPropFrete;
   private String cofinsStPropJuro;
   private String cofinsStPropSeg;
   private String complemento;
   private String confCfop;
   private String confImposto;
   private String consignacao;
   private String contLaudoSint;
   private String copiaDtPrevOrig;
   private String copiarLiber;
   private BigDecimal cstIpiEnt;
   private BigDecimal cstIpiSai;
   private BigDecimal codModDad;
   private BigDecimal codModDoc;
   private String codModDocIss;
   private BigDecimal codModNf;
   private String icmsPropJuro;
   private String icmsPropSeg;
   private String cupomFiscal;
   private String dentroEstado;
   private String descROper;
   private Timestamp dhAlter;
   private String digInfImporta;
   private String digPureza;
   private String editaAnaliseRentab;
   private String emiteBoleta;
   private String emiteNota;
   private String empFuncDif;
   private String enviarWmsConf;
   private String envWmsConfirmada;
   private String execIte;
   private String exigAnalItens;
   private String exigeAgendaWms;
   private String exigeConf;
   private String exigeCotacao;
   private String exigeDtVal;
   private String exigeGar;
   private String exigeLaudo;
   private String exigeLib;
   private String exigeLibSempre;
   private String exigePedFret;
   private String exigeTransp;
   private BigDecimal expGrs;
   private String exporta;
   private String expTes;
   private String fatContPorPeso;
   private String fatEntProd;
   private String fatEstConf;
   private String geraAmostraLaudo;
   private String geraBonPre;
   private String geraGnre;
   private String geraPlanProd;
   private String geraRparcDest;
   private String geraRtagJnfe;
   private BigDecimal goldEv;
   private BigDecimal golMpSinal;
   private BigDecimal golSinal;
   private String graHisAltPed;
   private String grupo;
   private String icmsPropDestaque;
   private String icmsPropEmbalagem;
   private String icmsPropFrete;
   private String fatForaPlanEnt;
   private String geraEndEntrNfe;
   private String exigeConfirmacaoMde;
   private BigDecimal codModCfeCanc;
   private String constOpApurSimp;
   private String gerInfoEfdPag;
   private String ignExpAutLot;
   private String numProcesso;
   private String permDestVbatPrebCus;
   private String redStbCpIsCofins;
   private String usaTabAltEmp;
   private BigDecimal codEnqIpiSai;
   private BigDecimal codEnqIpiEnt;
   private String permFinMenorVlrNota;
   private String produEtLoc;
   private BigDecimal percMinBaseInss;
   private String ajustavp;
   private BigDecimal codMoedaVp;
   private String indPresNfce;
   private BigDecimal topAtendimento;
   private BigDecimal topBackOrder;
   private String indNatFrt;
   private String infContrato;
   private String integraEvento;
   private String valTotNotaGerLiv;
   private String operComMoeda;
   private BigDecimal percTolVarVlrUnit;
   private BigDecimal cat1799SpcCo;
   private String cte;
   private BigDecimal tipServCte;
   private BigDecimal codTopDenegCte;
   private String tipoCte;
   private String valVariaCvlrUnit;
   private BigDecimal confValEvent68;
   private String dataRetroFat;
   private BigDecimal consVlrRemRetInd;
   private String devSemDestaqueIpi;
   private String devSemDestaqueSt;
   private String geraDemandaMps;
   private String gerCorApon;
   private String ignorarAgrupMinDev;
   private String redIcmsBcPisConfins;
   private String salvarConfSemPerg;
   private String semCredIpiSt;
   private String semMoedaFin;
   private String tipModalCte;
   private String usaRecParcial;
   private String valSitCadRf;
   private String vlrLiqItemNfe;
   private String calcFetHab;
   private String exigeAnaliseCred;
   private String indTipRec;
   private String calcFcpInt;
   private String consAuxiliar;
   private String descQtdGruDescPro;
   private String reservaSemLote;
   private String permiteCnaeDifNota;
   private String ignoraComplItem;
   private String outDespStExtNota;
   private String estoqueMpTerceiro;
   private String redPisBcPisCofins;
   private String calcPesoConfirm;
   private String aplicLeiTransp;
   private String envGarantia;
   private String distStVlrUnitFat;
   private String simulacAutoFrete;
   private String icmsOrigEstPed;
   private BigDecimal codCtacTbEfd;
   private String ligOrigOrig;
   private String indTerc;
   private String movEndFlutuante;
   private String usaServTabIrFinsS;
   private String descOnfse;
   private String aplicTabIrFinsS;
   private String formRecIss;
   private BigDecimal natEfdContM410M810;
   private BigDecimal nufOp;
   private String orcamento;
   private String descOnslCdPr;
   private BigDecimal codModRo;
   private BigDecimal codLocalImpXml;
   private String impXmlMantDespAces;
   private String codContaRural;
   private String arredQtdUnAlt;
   private String consNfeRelCancEfd;
   private String ignoraMppVpa;
   private String topPisCofRedAquis;
   private BigDecimal tipComplCust;
   private BigDecimal nuLayoutCvr;
   private String descTopadrCst1400;
   private String calcFunTtelTop;
   private String calcFustTop;
   private String calcStFrtXtNotProp;
   private BigDecimal codInterm;
   private String intermed;
   private String valEstMaximo;
   private String ignObsOrigRem;
   private String descConsidPedXml;
   private String operacaoAmostra;
   private String atualEstWmsTerc;
   private String descConsidNfeOrigem;
   private String dedFcpBcPisCofins;
   private String armTipApu;
   private String calcPisCfsFin;
   private String confVlrEvent68;
   private String calcIcmsRegTts;
   private String recBrutaCiap;
   private String atuSaldoCont;
   private String usaVendaMais;
   private String descCstBcPisCf;
   private String valDispEstDev;

   public String getUsarPrecoCusto() {
        return usarPrecoCusto;
   }

   public void setUsarPrecoCusto(String usarPrecoCusto) {
        this.usarPrecoCusto = usarPrecoCusto;
   }

   public String getUsoProdSeparacao() {
        return usoProdSeparacao;
   }

   public void setUsoProdSeparacao(String usoProdSeparacao) {
        this.usoProdSeparacao = usoProdSeparacao;
   }

   public String getValTbCompCr() {
        return valTbCompCr;
   }

   public void setValTbCompCr(String valTbCompCr) {
        this.valTbCompCr = valTbCompCr;
   }

   public String getValVctLaudoEst() {
        return valVctLaudoEst;
   }

   public void setValVctLaudoEst(String valVctLaudoEst) {
        this.valVctLaudoEst = valVctLaudoEst;
   }

   public String getVendIte() {
        return vendIte;
   }

   public void setVendIte(String vendIte) {
        this.vendIte = vendIte;
   }

   public BigDecimal getCodModNfse() {
        return codModNfse;
   }

   public void setCodModNfse(BigDecimal codModNfse) {
        this.codModNfse = codModNfse;
   }

   public BigDecimal getCodModRps() {
        return codModRps;
   }

   public void setCodModRps(BigDecimal codModRps) {
        this.codModRps = codModRps;
   }

   public String getCodNatOperIss() {
        return codNatOperIss;
   }

   public void setCodNatOperIss(String codNatOperIss) {
        this.codNatOperIss = codNatOperIss;
   }

   public String getCalcDifAlPart() {
        return calcDifAlPart;
   }

   public void setCalcDifAlPart(String calcDifAlPart) {
        this.calcDifAlPart = calcDifAlPart;
   }

   public String getValSitCadSefaz() {
        return valSitCadSefaz;
   }

   public void setValSitCadSefaz(String valSitCadSefaz) {
        this.valSitCadSefaz = valSitCadSefaz;
   }

   public String getTransfCbGlobal() {
        return transfCbGlobal;
   }

   public void setTransfCbGlobal(String transfCbGlobal) {
        this.transfCbGlobal = transfCbGlobal;
   }

   public String getTransfWms() {
        return transfWms;
   }

   public void setTransfWms(String transfWms) {
        this.transfWms = transfWms;
   }

   public String getTravafimImp() {
        return travafimImp;
   }

   public void setTravafimImp(String travafimImp) {
        this.travafimImp = travafimImp;
   }

   public String getUsaCusMedBaseSt() {
        return usaCusMedBaseSt;
   }

   public void setUsaCusMedBaseSt(String usaCusMedBaseSt) {
        this.usaCusMedBaseSt = usaCusMedBaseSt;
   }

   public String getUsarConfCega() {
        return usarConfCega;
   }

   public void setUsarConfCega(String usarConfCega) {
        this.usarConfCega = usarConfCega;
   }

   public String getAceitaFatAcima() {
        return aceitaFatAcima;
   }

   public void setAceitaFatAcima(String aceitaFatAcima) {
        this.aceitaFatAcima = aceitaFatAcima;
   }

   public String getAgrupaProdNfe() {
        return agrupaProdNfe;
   }

   public void setAgrupaProdNfe(String agrupaProdNfe) {
        this.agrupaProdNfe = agrupaProdNfe;
   }

   public String getAgrupaServFat() {
        return agrupaServFat;
   }

   public void setAgrupaServFat(String agrupaServFat) {
        this.agrupaServFat = agrupaServFat;
   }

   public String getAltItemParcFat() {
        return altItemParcFat;
   }

   public void setAltItemParcFat(String altItemParcFat) {
        this.altItemParcFat = altItemParcFat;
   }

   public String getAltNfConf() {
        return altNfConf;
   }

   public void setAltNfConf(String altNfConf) {
        this.altNfConf = altNfConf;
   }

   public BigDecimal getAnaliseGiro() {
        return analiseGiro;
   }

   public void setAnaliseGiro(BigDecimal analiseGiro) {
        this.analiseGiro = analiseGiro;
   }

   public String getArmazenagem() {
        return armazenagem;
   }

   public void setArmazenagem(String armazenagem) {
        this.armazenagem = armazenagem;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public String getAtualAcdc() {
        return atualAcdc;
   }

   public void setAtualAcdc(String atualAcdc) {
        this.atualAcdc = atualAcdc;
   }

   public String getAtualBem() {
        return atualBem;
   }

   public void setAtualBem(String atualBem) {
        this.atualBem = atualBem;
   }

   public String getAtualCom() {
        return atualCom;
   }

   public void setAtualCom(String atualCom) {
        this.atualCom = atualCom;
   }

   public String getAtualComOs() {
        return atualComOs;
   }

   public void setAtualComOs(String atualComOs) {
        this.atualComOs = atualComOs;
   }

   public String getAtualCtb() {
        return atualCtb;
   }

   public void setAtualCtb(String atualCtb) {
        this.atualCtb = atualCtb;
   }

   public String getAtualDatRecWms() {
        return atualDatRecWms;
   }

   public void setAtualDatRecWms(String atualDatRecWms) {
        this.atualDatRecWms = atualDatRecWms;
   }

   public String getAtualEst() {
        return atualEst;
   }

   public void setAtualEst(String atualEst) {
        this.atualEst = atualEst;
   }

   public BigDecimal getAtualEstMp() {
        return atualEstMp;
   }

   public void setAtualEstMp(BigDecimal atualEstMp) {
        this.atualEstMp = atualEstMp;
   }

   public String getAtualEstTerc() {
        return atualEstTerc;
   }

   public void setAtualEstTerc(String atualEstTerc) {
        this.atualEstTerc = atualEstTerc;
   }

   public BigDecimal getAtualFin() {
        return atualFin;
   }

   public void setAtualFin(BigDecimal atualFin) {
        this.atualFin = atualFin;
   }

   public String getAtualFinTerc() {
        return atualFinTerc;
   }

   public void setAtualFinTerc(String atualFinTerc) {
        this.atualFinTerc = atualFinTerc;
   }

   public BigDecimal getAtualIndeniz() {
        return atualIndeniz;
   }

   public void setAtualIndeniz(BigDecimal atualIndeniz) {
        this.atualIndeniz = atualIndeniz;
   }

   public String getAtualizarAteio() {
        return atualizarAteio;
   }

   public void setAtualizarAteio(String atualizarAteio) {
        this.atualizarAteio = atualizarAteio;
   }

   public String getAtualLivFis() {
        return atualLivFis;
   }

   public void setAtualLivFis(String atualLivFis) {
        this.atualLivFis = atualLivFis;
   }

   public String getAtualLivIss() {
        return atualLivIss;
   }

   public void setAtualLivIss(String atualLivIss) {
        this.atualLivIss = atualLivIss;
   }

   public String getAtualPrecoFat() {
        return atualPrecoFat;
   }

   public void setAtualPrecoFat(String atualPrecoFat) {
        this.atualPrecoFat = atualPrecoFat;
   }

   public BigDecimal getAtualTransg() {
        return atualTransg;
   }

   public void setAtualTransg(BigDecimal atualTransg) {
        this.atualTransg = atualTransg;
   }

   public String getAtualUltimaComp() {
        return atualUltimaComp;
   }

   public void setAtualUltimaComp(String atualUltimaComp) {
        this.atualUltimaComp = atualUltimaComp;
   }

   public String getAtualUltimaVend() {
        return atualUltimaVend;
   }

   public void setAtualUltimaVend(String atualUltimaVend) {
        this.atualUltimaVend = atualUltimaVend;
   }

   public String getAutDigital() {
        return autDigital;
   }

   public void setAutDigital(String autDigital) {
        this.autDigital = autDigital;
   }

   public String getAvisarComp() {
        return avisarComp;
   }

   public void setAvisarComp(String avisarComp) {
        this.avisarComp = avisarComp;
   }

   public String getBaseIcmsFreteCalcSt() {
        return baseIcmsFreteCalcSt;
   }

   public void setBaseIcmsFreteCalcSt(String baseIcmsFreteCalcSt) {
        this.baseIcmsFreteCalcSt = baseIcmsFreteCalcSt;
   }

   public String getBaseNumeracao() {
        return baseNumeracao;
   }

   public void setBaseNumeracao(String baseNumeracao) {
        this.baseNumeracao = baseNumeracao;
   }

   public String getBloqEstVenc() {
        return bloqEstVenc;
   }

   public void setBloqEstVenc(String bloqEstVenc) {
        this.bloqEstVenc = bloqEstVenc;
   }

   public String getBonificacao() {
        return bonificacao;
   }

   public void setBonificacao(String bonificacao) {
        this.bonificacao = bonificacao;
   }

   public String getBusCmpTerc() {
        return busCmpTerc;
   }

   public void setBusCmpTerc(String busCmpTerc) {
        this.busCmpTerc = busCmpTerc;
   }

   public String getCalcDifIcms() {
        return calcDifIcms;
   }

   public void setCalcDifIcms(String calcDifIcms) {
        this.calcDifIcms = calcDifIcms;
   }

   public String getCalcIcms() {
        return calcIcms;
   }

   public void setCalcIcms(String calcIcms) {
        this.calcIcms = calcIcms;
   }

   public String getCamGerEdiConf() {
        return camGerEdiConf;
   }

   public void setCamGerEdiConf(String camGerEdiConf) {
        this.camGerEdiConf = camGerEdiConf;
   }

   public String getClassifIcms() {
        return classifIcms;
   }

   public void setClassifIcms(String classifIcms) {
        this.classifIcms = classifIcms;
   }

   public BigDecimal getCodCfoCombustLubrif() {
        return codCfoCombustLubrif;
   }

   public void setCodCfoCombustLubrif(BigDecimal codCfoCombustLubrif) {
        this.codCfoCombustLubrif = codCfoCombustLubrif;
   }

   public BigDecimal getCodCfoEntrada() {
        return codCfoEntrada;
   }

   public void setCodCfoEntrada(BigDecimal codCfoEntrada) {
        this.codCfoEntrada = codCfoEntrada;
   }

   public BigDecimal getCodCfoEntradaFora() {
        return codCfoEntradaFora;
   }

   public void setCodCfoEntradaFora(BigDecimal codCfoEntradaFora) {
        this.codCfoEntradaFora = codCfoEntradaFora;
   }

   public BigDecimal getCodCfoSaida() {
        return codCfoSaida;
   }

   public void setCodCfoSaida(BigDecimal codCfoSaida) {
        this.codCfoSaida = codCfoSaida;
   }

   public BigDecimal getCodCfoSaidaFora() {
        return codCfoSaidaFora;
   }

   public void setCodCfoSaidaFora(BigDecimal codCfoSaidaFora) {
        this.codCfoSaidaFora = codCfoSaidaFora;
   }

   public BigDecimal getCodCfoTerc() {
        return codCfoTerc;
   }

   public void setCodCfoTerc(BigDecimal codCfoTerc) {
        this.codCfoTerc = codCfoTerc;
   }

   public BigDecimal getCodCfps() {
        return codCfps;
   }

   public void setCodCfps(BigDecimal codCfps) {
        this.codCfps = codCfps;
   }

   public String getDescRemail() {
        return descRemail;
   }

   public void setDescRemail(String descRemail) {
        this.descRemail = descRemail;
   }

   public String getUtilizaWms() {
        return utilizaWms;
   }

   public void setUtilizaWms(String utilizaWms) {
        this.utilizaWms = utilizaWms;
   }

   public String getValEst() {
        return valEst;
   }

   public void setValEst(String valEst) {
        this.valEst = valEst;
   }

   public String getValidaAgrupMin() {
        return validaAgrupMin;
   }

   public void setValidaAgrupMin(String validaAgrupMin) {
        this.validaAgrupMin = validaAgrupMin;
   }

   public String getValidaAtraso() {
        return validaAtraso;
   }

   public void setValidaAtraso(String validaAtraso) {
        this.validaAtraso = validaAtraso;
   }

   public String getValidaData() {
        return validaData;
   }

   public void setValidaData(String validaData) {
        this.validaData = validaData;
   }

   public String getValidaMediaNegoc() {
        return validaMediaNegoc;
   }

   public void setValidaMediaNegoc(String validaMediaNegoc) {
        this.validaMediaNegoc = validaMediaNegoc;
   }

   public String getIntegSerCon() {
        return integSerCon;
   }

   public void setIntegSerCon(String integSerCon) {
        this.integSerCon = integSerCon;
   }

   public String getMarcarNaoPendente() {
        return marcarNaoPendente;
   }

   public void setMarcarNaoPendente(String marcarNaoPendente) {
        this.marcarNaoPendente = marcarNaoPendente;
   }

   public String getMpNumAutLote() {
        return mpNumAutLote;
   }

   public void setMpNumAutLote(String mpNumAutLote) {
        this.mpNumAutLote = mpNumAutLote;
   }

   public String getNaoIncConf() {
        return naoIncConf;
   }

   public void setNaoIncConf(String naoIncConf) {
        this.naoIncConf = naoIncConf;
   }

   public String getNatBcCred() {
        return natBcCred;
   }

   public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
   }

   public String getNatOperSped() {
        return natOperSped;
   }

   public void setNatOperSped(String natOperSped) {
        this.natOperSped = natOperSped;
   }

   public String getNfe() {
        return nfe;
   }

   public void setNfe(String nfe) {
        this.nfe = nfe;
   }

   public String getNfeEstorno() {
        return nfeEstorno;
   }

   public void setNfeEstorno(String nfeEstorno) {
        this.nfeEstorno = nfeEstorno;
   }

   public String getNfeSemDtEntSai() {
        return nfeSemDtEntSai;
   }

   public void setNfeSemDtEntSai(String nfeSemDtEntSai) {
        this.nfeSemDtEntSai = nfeSemDtEntSai;
   }

   public String getNfse() {
        return nfse;
   }

   public void setNfse(String nfse) {
        this.nfse = nfse;
   }

   public String getNfsePorNat() {
        return nfsePorNat;
   }

   public void setNfsePorNat(String nfsePorNat) {
        this.nfsePorNat = nfsePorNat;
   }

   public BigDecimal getNucCo() {
        return nucCo;
   }

   public void setNucCo(BigDecimal nucCo) {
        this.nucCo = nucCo;
   }

   public BigDecimal getNuLayout() {
        return nuLayout;
   }

   public void setNuLayout(BigDecimal nuLayout) {
        this.nuLayout = nuLayout;
   }

   public String getNumSomAut() {
        return numSomAut;
   }

   public void setNumSomAut(String numSomAut) {
        this.numSomAut = numSomAut;
   }

   public BigDecimal getNuNotaModelo() {
        return nuNotaModelo;
   }

   public void setNuNotaModelo(BigDecimal nuNotaModelo) {
        this.nuNotaModelo = nuNotaModelo;
   }

   public String getObterVlrMoedaFat() {
        return obterVlrMoedaFat;
   }

   public void setObterVlrMoedaFat(String obterVlrMoedaFat) {
        this.obterVlrMoedaFat = obterVlrMoedaFat;
   }

   public String getOc() {
        return oc;
   }

   public void setOc(String oc) {
        this.oc = oc;
   }

   public String getPedFrete() {
        return pedFrete;
   }

   public void setPedFrete(String pedFrete) {
        this.pedFrete = pedFrete;
   }

   public String getPendente() {
        return pendente;
   }

   public void setPendente(String pendente) {
        this.pendente = pendente;
   }

   public String getPermConfParcialWms() {
        return permConfParcialWms;
   }

   public void setPermConfParcialWms(String permConfParcialWms) {
        this.permConfParcialWms = permConfParcialWms;
   }

   public String getPesaItem() {
        return pesaItem;
   }

   public void setPesaItem(String pesaItem) {
        this.pesaItem = pesaItem;
   }

   public String getPisPropDestaque() {
        return pisPropDestaque;
   }

   public void setPisPropDestaque(String pisPropDestaque) {
        this.pisPropDestaque = pisPropDestaque;
   }

   public String getPisPropEmbalagem() {
        return pisPropEmbalagem;
   }

   public void setPisPropEmbalagem(String pisPropEmbalagem) {
        this.pisPropEmbalagem = pisPropEmbalagem;
   }

   public String getPisPropFrete() {
        return pisPropFrete;
   }

   public void setPisPropFrete(String pisPropFrete) {
        this.pisPropFrete = pisPropFrete;
   }

   public String getPisPropJuro() {
        return pisPropJuro;
   }

   public void setPisPropJuro(String pisPropJuro) {
        this.pisPropJuro = pisPropJuro;
   }

   public String getPisPropSeg() {
        return pisPropSeg;
   }

   public void setPisPropSeg(String pisPropSeg) {
        this.pisPropSeg = pisPropSeg;
   }

   public String getPisStPropDestaque() {
        return pisStPropDestaque;
   }

   public void setPisStPropDestaque(String pisStPropDestaque) {
        this.pisStPropDestaque = pisStPropDestaque;
   }

   public String getPisStPropEmbalagem() {
        return pisStPropEmbalagem;
   }

   public void setPisStPropEmbalagem(String pisStPropEmbalagem) {
        this.pisStPropEmbalagem = pisStPropEmbalagem;
   }

   public String getPisStPropFrete() {
        return pisStPropFrete;
   }

   public void setPisStPropFrete(String pisStPropFrete) {
        this.pisStPropFrete = pisStPropFrete;
   }

   public String getPisStPropJuro() {
        return pisStPropJuro;
   }

   public void setPisStPropJuro(String pisStPropJuro) {
        this.pisStPropJuro = pisStPropJuro;
   }

   public String getPisStPropSeg() {
        return pisStPropSeg;
   }

   public void setPisStPropSeg(String pisStPropSeg) {
        this.pisStPropSeg = pisStPropSeg;
   }

   public String getPodeAjustarOrigProdWms() {
        return podeAjustarOrigProdWms;
   }

   public void setPodeAjustarOrigProdWms(String podeAjustarOrigProdWms) {
        this.podeAjustarOrigProdWms = podeAjustarOrigProdWms;
   }

   public String getPodeFixar() {
        return podeFixar;
   }

   public void setPodeFixar(String podeFixar) {
        this.podeFixar = podeFixar;
   }

   public String getPodePesagem() {
        return podePesagem;
   }

   public void setPodePesagem(String podePesagem) {
        this.podePesagem = podePesagem;
   }

   public String getPodeTransfEnt() {
        return podeTransfEnt;
   }

   public void setPodeTransfEnt(String podeTransfEnt) {
        this.podeTransfEnt = podeTransfEnt;
   }

   public String getPrecifica() {
        return precifica;
   }

   public void setPrecifica(String precifica) {
        this.precifica = precifica;
   }

   public String getProdRep() {
        return prodRep;
   }

   public void setProdRep(String prodRep) {
        this.prodRep = prodRep;
   }

   public String getProvisEntrega() {
        return provisEntrega;
   }

   public void setProvisEntrega(String provisEntrega) {
        this.provisEntrega = provisEntrega;
   }

   public String getRatAutProd() {
        return ratAutProd;
   }

   public void setRatAutProd(String ratAutProd) {
        this.ratAutProd = ratAutProd;
   }

   public String getRefNfe() {
        return refNfe;
   }

   public void setRefNfe(String refNfe) {
        this.refNfe = refNfe;
   }

   public String getSepBalcao() {
        return sepBalcao;
   }

   public void setSepBalcao(String sepBalcao) {
        this.sepBalcao = sepBalcao;
   }

   public String getSolCompra() {
        return solCompra;
   }

   public void setSolCompra(String solCompra) {
        this.solCompra = solCompra;
   }

   public String getSomarCofinsSt() {
        return somarCofinsSt;
   }

   public void setSomarCofinsSt(String somarCofinsSt) {
        this.somarCofinsSt = somarCofinsSt;
   }

   public String getSomarIpi() {
        return somarIpi;
   }

   public void setSomarIpi(String somarIpi) {
        this.somarIpi = somarIpi;
   }

   public String getSomarPisSt() {
        return somarPisSt;
   }

   public void setSomarPisSt(String somarPisSt) {
        this.somarPisSt = somarPisSt;
   }

   public String getSomarSubst() {
        return somarSubst;
   }

   public void setSomarSubst(String somarSubst) {
        this.somarSubst = somarSubst;
   }

   public String getStatusBaixaEst() {
        return statusBaixaEst;
   }

   public void setStatusBaixaEst(String statusBaixaEst) {
        this.statusBaixaEst = statusBaixaEst;
   }

   public String getStatusLote() {
        return statusLote;
   }

   public void setStatusLote(String statusLote) {
        this.statusLote = statusLote;
   }

   public String getStPropDestaque() {
        return stPropDestaque;
   }

   public void setStPropDestaque(String stPropDestaque) {
        this.stPropDestaque = stPropDestaque;
   }

   public String getStPropEmbalagem() {
        return stPropEmbalagem;
   }

   public void setStPropEmbalagem(String stPropEmbalagem) {
        this.stPropEmbalagem = stPropEmbalagem;
   }

   public String getStPropFrete() {
        return stPropFrete;
   }

   public void setStPropFrete(String stPropFrete) {
        this.stPropFrete = stPropFrete;
   }

   public String getStPropFreteExt() {
        return stPropFreteExt;
   }

   public void setStPropFreteExt(String stPropFreteExt) {
        this.stPropFreteExt = stPropFreteExt;
   }

   public String getStPropJuro() {
        return stPropJuro;
   }

   public void setStPropJuro(String stPropJuro) {
        this.stPropJuro = stPropJuro;
   }

   public String getStPropSeg() {
        return stPropSeg;
   }

   public void setStPropSeg(String stPropSeg) {
        this.stPropSeg = stPropSeg;
   }

   public String getSugereLocalParc() {
        return sugereLocalParc;
   }

   public void setSugereLocalParc(String sugereLocalParc) {
        this.sugereLocalParc = sugereLocalParc;
   }

   public String getTemCofins() {
        return temCofins;
   }

   public void setTemCofins(String temCofins) {
        this.temCofins = temCofins;
   }

   public String getTemCsl() {
        return temCsl;
   }

   public void setTemCsl(String temCsl) {
        this.temCsl = temCsl;
   }

   public String getTemFinOrigem() {
        return temFinOrigem;
   }

   public void setTemFinOrigem(String temFinOrigem) {
        this.temFinOrigem = temFinOrigem;
   }

   public String getTemFunRural() {
        return temFunRural;
   }

   public void setTemFunRural(String temFunRural) {
        this.temFunRural = temFunRural;
   }

   public String getTemIcms() {
        return temIcms;
   }

   public void setTemIcms(String temIcms) {
        this.temIcms = temIcms;
   }

   public String getTemIi() {
        return temIi;
   }

   public void setTemIi(String temIi) {
        this.temIi = temIi;
   }

   public String getTemIndex() {
        return temIndex;
   }

   public void setTemIndex(String temIndex) {
        this.temIndex = temIndex;
   }

   public String getTemIpi() {
        return temIpi;
   }

   public void setTemIpi(String temIpi) {
        this.temIpi = temIpi;
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

   public String getTemVavtCon() {
        return temVavtCon;
   }

   public void setTemVavtCon(String temVavtCon) {
        this.temVavtCon = temVavtCon;
   }

   public String getTipAltDtVenc() {
        return tipAltDtVenc;
   }

   public void setTipAltDtVenc(String tipAltDtVenc) {
        this.tipAltDtVenc = tipAltDtVenc;
   }

   public String getTipAtualFin() {
        return tipAtualFin;
   }

   public void setTipAtualFin(String tipAtualFin) {
        this.tipAtualFin = tipAtualFin;
   }

   public String getTipAtualWms() {
        return tipAtualWms;
   }

   public void setTipAtualWms(String tipAtualWms) {
        this.tipAtualWms = tipAtualWms;
   }

   public String getTipFatServ() {
        return tipFatServ;
   }

   public void setTipFatServ(String tipFatServ) {
        this.tipFatServ = tipFatServ;
   }

   public String getTipIcms() {
        return tipIcms;
   }

   public void setTipIcms(String tipIcms) {
        this.tipIcms = tipIcms;
   }

   public String getTipIpi() {
        return tipIpi;
   }

   public void setTipIpi(String tipIpi) {
        this.tipIpi = tipIpi;
   }

   public String getTipIvaSubst() {
        return tipIvaSubst;
   }

   public void setTipIvaSubst(String tipIvaSubst) {
        this.tipIvaSubst = tipIvaSubst;
   }

   public String getTipMov() {
        return tipMov;
   }

   public void setTipMov(String tipMov) {
        this.tipMov = tipMov;
   }

   public String getTipMovBemsPed() {
        return tipMovBemsPed;
   }

   public void setTipMovBemsPed(String tipMovBemsPed) {
        this.tipMovBemsPed = tipMovBemsPed;
   }

   public String getTipoImpKit() {
        return tipoImpKit;
   }

   public void setTipoImpKit(String tipoImpKit) {
        this.tipoImpKit = tipoImpKit;
   }

   public String getTipoNumeracao() {
        return tipoNumeracao;
   }

   public void setTipoNumeracao(String tipoNumeracao) {
        this.tipoNumeracao = tipoNumeracao;
   }

   public BigDecimal getVlrBasePgto() {
        return vlrBasePgto;
   }

   public void setVlrBasePgto(BigDecimal vlrBasePgto) {
        this.vlrBasePgto = vlrBasePgto;
   }

   public BigDecimal getVlrMinAp() {
        return vlrMinAp;
   }

   public void setVlrMinAp(BigDecimal vlrMinAp) {
        this.vlrMinAp = vlrMinAp;
   }

   public String getIpiEmbut() {
        return ipiEmbut;
   }

   public void setIpiEmbut(String ipiEmbut) {
        this.ipiEmbut = ipiEmbut;
   }

   public String getIpiIncIcms() {
        return ipiIncIcms;
   }

   public void setIpiIncIcms(String ipiIncIcms) {
        this.ipiIncIcms = ipiIncIcms;
   }

   public String getIpiPropDestaque() {
        return ipiPropDestaque;
   }

   public void setIpiPropDestaque(String ipiPropDestaque) {
        this.ipiPropDestaque = ipiPropDestaque;
   }

   public String getIpiPropEmbalagem() {
        return ipiPropEmbalagem;
   }

   public void setIpiPropEmbalagem(String ipiPropEmbalagem) {
        this.ipiPropEmbalagem = ipiPropEmbalagem;
   }

   public String getIpiPropFrete() {
        return ipiPropFrete;
   }

   public void setIpiPropFrete(String ipiPropFrete) {
        this.ipiPropFrete = ipiPropFrete;
   }

   public String getIpiPropJuro() {
        return ipiPropJuro;
   }

   public void setIpiPropJuro(String ipiPropJuro) {
        this.ipiPropJuro = ipiPropJuro;
   }

   public String getIpiPropSeg() {
        return ipiPropSeg;
   }

   public void setIpiPropSeg(String ipiPropSeg) {
        this.ipiPropSeg = ipiPropSeg;
   }

   public String getLaudoItem() {
        return laudoItem;
   }

   public void setLaudoItem(String laudoItem) {
        this.laudoItem = laudoItem;
   }

   public String getGerar1400Sped() {
        return gerar1400Sped;
   }

   public void setGerar1400Sped(String gerar1400Sped) {
        this.gerar1400Sped = gerar1400Sped;
   }

   public String getUsaAliqNatRatF100() {
        return usaAliqNatRatF100;
   }

   public void setUsaAliqNatRatF100(String usaAliqNatRatF100) {
        this.usaAliqNatRatF100 = usaAliqNatRatF100;
   }

   public String getValNum() {
        return valNum;
   }

   public void setValNum(String valNum) {
        this.valNum = valNum;
   }

   public String getImpNaoConf() {
        return impNaoConf;
   }

   public void setImpNaoConf(String impNaoConf) {
        this.impNaoConf = impNaoConf;
   }

   public String getImpNotaAdicional() {
        return impNotaAdicional;
   }

   public void setImpNotaAdicional(String impNotaAdicional) {
        this.impNotaAdicional = impNotaAdicional;
   }

   public BigDecimal getCodRemedi() {
        return codRemedi;
   }

   public void setCodRemedi(BigDecimal codRemedi) {
        this.codRemedi = codRemedi;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCodTipOperDeneg() {
        return codTipOperDeneg;
   }

   public void setCodTipOperDeneg(BigDecimal codTipOperDeneg) {
        this.codTipOperDeneg = codTipOperDeneg;
   }

   public BigDecimal getCodTipOperDestino() {
        return codTipOperDestino;
   }

   public void setCodTipOperDestino(BigDecimal codTipOperDestino) {
        this.codTipOperDestino = codTipOperDestino;
   }

   public BigDecimal getCodTipOperPenRet() {
        return codTipOperPenRet;
   }

   public void setCodTipOperPenRet(BigDecimal codTipOperPenRet) {
        this.codTipOperPenRet = codTipOperPenRet;
   }

   public BigDecimal getCodTipOperRem() {
        return codTipOperRem;
   }

   public void setCodTipOperRem(BigDecimal codTipOperRem) {
        this.codTipOperRem = codTipOperRem;
   }

   public BigDecimal getCodTipOperSeparacao() {
        return codTipOperSeparacao;
   }

   public void setCodTipOperSeparacao(BigDecimal codTipOperSeparacao) {
        this.codTipOperSeparacao = codTipOperSeparacao;
   }

   public BigDecimal getCodTrib() {
        return codTrib;
   }

   public void setCodTrib(BigDecimal codTrib) {
        this.codTrib = codTrib;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getCofinsPropDestaque() {
        return cofinsPropDestaque;
   }

   public void setCofinsPropDestaque(String cofinsPropDestaque) {
        this.cofinsPropDestaque = cofinsPropDestaque;
   }

   public String getCofinsPropEmbalagem() {
        return cofinsPropEmbalagem;
   }

   public void setCofinsPropEmbalagem(String cofinsPropEmbalagem) {
        this.cofinsPropEmbalagem = cofinsPropEmbalagem;
   }

   public String getCofinsPropFrete() {
        return cofinsPropFrete;
   }

   public void setCofinsPropFrete(String cofinsPropFrete) {
        this.cofinsPropFrete = cofinsPropFrete;
   }

   public String getCofinsPropJuro() {
        return cofinsPropJuro;
   }

   public void setCofinsPropJuro(String cofinsPropJuro) {
        this.cofinsPropJuro = cofinsPropJuro;
   }

   public String getCofinsPropSeg() {
        return cofinsPropSeg;
   }

   public void setCofinsPropSeg(String cofinsPropSeg) {
        this.cofinsPropSeg = cofinsPropSeg;
   }

   public String getCofinsStPropDestaque() {
        return cofinsStPropDestaque;
   }

   public void setCofinsStPropDestaque(String cofinsStPropDestaque) {
        this.cofinsStPropDestaque = cofinsStPropDestaque;
   }

   public String getCofinsStPropEmbalagem() {
        return cofinsStPropEmbalagem;
   }

   public void setCofinsStPropEmbalagem(String cofinsStPropEmbalagem) {
        this.cofinsStPropEmbalagem = cofinsStPropEmbalagem;
   }

   public String getCofinsStPropFrete() {
        return cofinsStPropFrete;
   }

   public void setCofinsStPropFrete(String cofinsStPropFrete) {
        this.cofinsStPropFrete = cofinsStPropFrete;
   }

   public String getCofinsStPropJuro() {
        return cofinsStPropJuro;
   }

   public void setCofinsStPropJuro(String cofinsStPropJuro) {
        this.cofinsStPropJuro = cofinsStPropJuro;
   }

   public String getCofinsStPropSeg() {
        return cofinsStPropSeg;
   }

   public void setCofinsStPropSeg(String cofinsStPropSeg) {
        this.cofinsStPropSeg = cofinsStPropSeg;
   }

   public String getComplemento() {
        return complemento;
   }

   public void setComplemento(String complemento) {
        this.complemento = complemento;
   }

   public String getConfCfop() {
        return confCfop;
   }

   public void setConfCfop(String confCfop) {
        this.confCfop = confCfop;
   }

   public String getConfImposto() {
        return confImposto;
   }

   public void setConfImposto(String confImposto) {
        this.confImposto = confImposto;
   }

   public String getConsignacao() {
        return consignacao;
   }

   public void setConsignacao(String consignacao) {
        this.consignacao = consignacao;
   }

   public String getContLaudoSint() {
        return contLaudoSint;
   }

   public void setContLaudoSint(String contLaudoSint) {
        this.contLaudoSint = contLaudoSint;
   }

   public String getCopiaDtPrevOrig() {
        return copiaDtPrevOrig;
   }

   public void setCopiaDtPrevOrig(String copiaDtPrevOrig) {
        this.copiaDtPrevOrig = copiaDtPrevOrig;
   }

   public String getCopiarLiber() {
        return copiarLiber;
   }

   public void setCopiarLiber(String copiarLiber) {
        this.copiarLiber = copiarLiber;
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

   public BigDecimal getCodModDad() {
        return codModDad;
   }

   public void setCodModDad(BigDecimal codModDad) {
        this.codModDad = codModDad;
   }

   public BigDecimal getCodModDoc() {
        return codModDoc;
   }

   public void setCodModDoc(BigDecimal codModDoc) {
        this.codModDoc = codModDoc;
   }

   public String getCodModDocIss() {
        return codModDocIss;
   }

   public void setCodModDocIss(String codModDocIss) {
        this.codModDocIss = codModDocIss;
   }

   public BigDecimal getCodModNf() {
        return codModNf;
   }

   public void setCodModNf(BigDecimal codModNf) {
        this.codModNf = codModNf;
   }

   public String getIcmsPropJuro() {
        return icmsPropJuro;
   }

   public void setIcmsPropJuro(String icmsPropJuro) {
        this.icmsPropJuro = icmsPropJuro;
   }

   public String getIcmsPropSeg() {
        return icmsPropSeg;
   }

   public void setIcmsPropSeg(String icmsPropSeg) {
        this.icmsPropSeg = icmsPropSeg;
   }

   public String getCupomFiscal() {
        return cupomFiscal;
   }

   public void setCupomFiscal(String cupomFiscal) {
        this.cupomFiscal = cupomFiscal;
   }

   public String getDentroEstado() {
        return dentroEstado;
   }

   public void setDentroEstado(String dentroEstado) {
        this.dentroEstado = dentroEstado;
   }

   public String getDescROper() {
        return descROper;
   }

   public void setDescROper(String descROper) {
        this.descROper = descROper;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public String getDigInfImporta() {
        return digInfImporta;
   }

   public void setDigInfImporta(String digInfImporta) {
        this.digInfImporta = digInfImporta;
   }

   public String getDigPureza() {
        return digPureza;
   }

   public void setDigPureza(String digPureza) {
        this.digPureza = digPureza;
   }

   public String getEditaAnaliseRentab() {
        return editaAnaliseRentab;
   }

   public void setEditaAnaliseRentab(String editaAnaliseRentab) {
        this.editaAnaliseRentab = editaAnaliseRentab;
   }

   public String getEmiteBoleta() {
        return emiteBoleta;
   }

   public void setEmiteBoleta(String emiteBoleta) {
        this.emiteBoleta = emiteBoleta;
   }

   public String getEmiteNota() {
        return emiteNota;
   }

   public void setEmiteNota(String emiteNota) {
        this.emiteNota = emiteNota;
   }

   public String getEmpFuncDif() {
        return empFuncDif;
   }

   public void setEmpFuncDif(String empFuncDif) {
        this.empFuncDif = empFuncDif;
   }

   public String getEnviarWmsConf() {
        return enviarWmsConf;
   }

   public void setEnviarWmsConf(String enviarWmsConf) {
        this.enviarWmsConf = enviarWmsConf;
   }

   public String getEnvWmsConfirmada() {
        return envWmsConfirmada;
   }

   public void setEnvWmsConfirmada(String envWmsConfirmada) {
        this.envWmsConfirmada = envWmsConfirmada;
   }

   public String getExecIte() {
        return execIte;
   }

   public void setExecIte(String execIte) {
        this.execIte = execIte;
   }

   public String getExigAnalItens() {
        return exigAnalItens;
   }

   public void setExigAnalItens(String exigAnalItens) {
        this.exigAnalItens = exigAnalItens;
   }

   public String getExigeAgendaWms() {
        return exigeAgendaWms;
   }

   public void setExigeAgendaWms(String exigeAgendaWms) {
        this.exigeAgendaWms = exigeAgendaWms;
   }

   public String getExigeConf() {
        return exigeConf;
   }

   public void setExigeConf(String exigeConf) {
        this.exigeConf = exigeConf;
   }

   public String getExigeCotacao() {
        return exigeCotacao;
   }

   public void setExigeCotacao(String exigeCotacao) {
        this.exigeCotacao = exigeCotacao;
   }

   public String getExigeDtVal() {
        return exigeDtVal;
   }

   public void setExigeDtVal(String exigeDtVal) {
        this.exigeDtVal = exigeDtVal;
   }

   public String getExigeGar() {
        return exigeGar;
   }

   public void setExigeGar(String exigeGar) {
        this.exigeGar = exigeGar;
   }

   public String getExigeLaudo() {
        return exigeLaudo;
   }

   public void setExigeLaudo(String exigeLaudo) {
        this.exigeLaudo = exigeLaudo;
   }

   public String getExigeLib() {
        return exigeLib;
   }

   public void setExigeLib(String exigeLib) {
        this.exigeLib = exigeLib;
   }

   public String getExigeLibSempre() {
        return exigeLibSempre;
   }

   public void setExigeLibSempre(String exigeLibSempre) {
        this.exigeLibSempre = exigeLibSempre;
   }

   public String getExigePedFret() {
        return exigePedFret;
   }

   public void setExigePedFret(String exigePedFret) {
        this.exigePedFret = exigePedFret;
   }

   public String getExigeTransp() {
        return exigeTransp;
   }

   public void setExigeTransp(String exigeTransp) {
        this.exigeTransp = exigeTransp;
   }

   public BigDecimal getExpGrs() {
        return expGrs;
   }

   public void setExpGrs(BigDecimal expGrs) {
        this.expGrs = expGrs;
   }

   public String getExporta() {
        return exporta;
   }

   public void setExporta(String exporta) {
        this.exporta = exporta;
   }

   public String getExpTes() {
        return expTes;
   }

   public void setExpTes(String expTes) {
        this.expTes = expTes;
   }

   public String getFatContPorPeso() {
        return fatContPorPeso;
   }

   public void setFatContPorPeso(String fatContPorPeso) {
        this.fatContPorPeso = fatContPorPeso;
   }

   public String getFatEntProd() {
        return fatEntProd;
   }

   public void setFatEntProd(String fatEntProd) {
        this.fatEntProd = fatEntProd;
   }

   public String getFatEstConf() {
        return fatEstConf;
   }

   public void setFatEstConf(String fatEstConf) {
        this.fatEstConf = fatEstConf;
   }

   public String getGeraAmostraLaudo() {
        return geraAmostraLaudo;
   }

   public void setGeraAmostraLaudo(String geraAmostraLaudo) {
        this.geraAmostraLaudo = geraAmostraLaudo;
   }

   public String getGeraBonPre() {
        return geraBonPre;
   }

   public void setGeraBonPre(String geraBonPre) {
        this.geraBonPre = geraBonPre;
   }

   public String getGeraGnre() {
        return geraGnre;
   }

   public void setGeraGnre(String geraGnre) {
        this.geraGnre = geraGnre;
   }

   public String getGeraPlanProd() {
        return geraPlanProd;
   }

   public void setGeraPlanProd(String geraPlanProd) {
        this.geraPlanProd = geraPlanProd;
   }

   public String getGeraRparcDest() {
        return geraRparcDest;
   }

   public void setGeraRparcDest(String geraRparcDest) {
        this.geraRparcDest = geraRparcDest;
   }

   public String getGeraRtagJnfe() {
        return geraRtagJnfe;
   }

   public void setGeraRtagJnfe(String geraRtagJnfe) {
        this.geraRtagJnfe = geraRtagJnfe;
   }

   public BigDecimal getGoldEv() {
        return goldEv;
   }

   public void setGoldEv(BigDecimal goldEv) {
        this.goldEv = goldEv;
   }

   public BigDecimal getGolMpSinal() {
        return golMpSinal;
   }

   public void setGolMpSinal(BigDecimal golMpSinal) {
        this.golMpSinal = golMpSinal;
   }

   public BigDecimal getGolSinal() {
        return golSinal;
   }

   public void setGolSinal(BigDecimal golSinal) {
        this.golSinal = golSinal;
   }

   public String getGraHisAltPed() {
        return graHisAltPed;
   }

   public void setGraHisAltPed(String graHisAltPed) {
        this.graHisAltPed = graHisAltPed;
   }

   public String getGrupo() {
        return grupo;
   }

   public void setGrupo(String grupo) {
        this.grupo = grupo;
   }

   public String getIcmsPropDestaque() {
        return icmsPropDestaque;
   }

   public void setIcmsPropDestaque(String icmsPropDestaque) {
        this.icmsPropDestaque = icmsPropDestaque;
   }

   public String getIcmsPropEmbalagem() {
        return icmsPropEmbalagem;
   }

   public void setIcmsPropEmbalagem(String icmsPropEmbalagem) {
        this.icmsPropEmbalagem = icmsPropEmbalagem;
   }

   public String getIcmsPropFrete() {
        return icmsPropFrete;
   }

   public void setIcmsPropFrete(String icmsPropFrete) {
        this.icmsPropFrete = icmsPropFrete;
   }

   public String getFatForaPlanEnt() {
        return fatForaPlanEnt;
   }

   public void setFatForaPlanEnt(String fatForaPlanEnt) {
        this.fatForaPlanEnt = fatForaPlanEnt;
   }

   public String getGeraEndEntrNfe() {
        return geraEndEntrNfe;
   }

   public void setGeraEndEntrNfe(String geraEndEntrNfe) {
        this.geraEndEntrNfe = geraEndEntrNfe;
   }

   public String getExigeConfirmacaoMde() {
        return exigeConfirmacaoMde;
   }

   public void setExigeConfirmacaoMde(String exigeConfirmacaoMde) {
        this.exigeConfirmacaoMde = exigeConfirmacaoMde;
   }

   public BigDecimal getCodModCfeCanc() {
        return codModCfeCanc;
   }

   public void setCodModCfeCanc(BigDecimal codModCfeCanc) {
        this.codModCfeCanc = codModCfeCanc;
   }

   public String getConstOpApurSimp() {
        return constOpApurSimp;
   }

   public void setConstOpApurSimp(String constOpApurSimp) {
        this.constOpApurSimp = constOpApurSimp;
   }

   public String getGerInfoEfdPag() {
        return gerInfoEfdPag;
   }

   public void setGerInfoEfdPag(String gerInfoEfdPag) {
        this.gerInfoEfdPag = gerInfoEfdPag;
   }

   public String getIgnExpAutLot() {
        return ignExpAutLot;
   }

   public void setIgnExpAutLot(String ignExpAutLot) {
        this.ignExpAutLot = ignExpAutLot;
   }

   public String getNumProcesso() {
        return numProcesso;
   }

   public void setNumProcesso(String numProcesso) {
        this.numProcesso = numProcesso;
   }

   public String getPermDestVbatPrebCus() {
        return permDestVbatPrebCus;
   }

   public void setPermDestVbatPrebCus(String permDestVbatPrebCus) {
        this.permDestVbatPrebCus = permDestVbatPrebCus;
   }

   public String getRedStbCpIsCofins() {
        return redStbCpIsCofins;
   }

   public void setRedStbCpIsCofins(String redStbCpIsCofins) {
        this.redStbCpIsCofins = redStbCpIsCofins;
   }

   public String getUsaTabAltEmp() {
        return usaTabAltEmp;
   }

   public void setUsaTabAltEmp(String usaTabAltEmp) {
        this.usaTabAltEmp = usaTabAltEmp;
   }

   public BigDecimal getCodEnqIpiSai() {
        return codEnqIpiSai;
   }

   public void setCodEnqIpiSai(BigDecimal codEnqIpiSai) {
        this.codEnqIpiSai = codEnqIpiSai;
   }

   public BigDecimal getCodEnqIpiEnt() {
        return codEnqIpiEnt;
   }

   public void setCodEnqIpiEnt(BigDecimal codEnqIpiEnt) {
        this.codEnqIpiEnt = codEnqIpiEnt;
   }

   public String getPermFinMenorVlrNota() {
        return permFinMenorVlrNota;
   }

   public void setPermFinMenorVlrNota(String permFinMenorVlrNota) {
        this.permFinMenorVlrNota = permFinMenorVlrNota;
   }

   public String getProduEtLoc() {
        return produEtLoc;
   }

   public void setProduEtLoc(String produEtLoc) {
        this.produEtLoc = produEtLoc;
   }

   public BigDecimal getPercMinBaseInss() {
        return percMinBaseInss;
   }

   public void setPercMinBaseInss(BigDecimal percMinBaseInss) {
        this.percMinBaseInss = percMinBaseInss;
   }

   public String getAjustavp() {
        return ajustavp;
   }

   public void setAjustavp(String ajustavp) {
        this.ajustavp = ajustavp;
   }

   public BigDecimal getCodMoedaVp() {
        return codMoedaVp;
   }

   public void setCodMoedaVp(BigDecimal codMoedaVp) {
        this.codMoedaVp = codMoedaVp;
   }

   public String getIndPresNfce() {
        return indPresNfce;
   }

   public void setIndPresNfce(String indPresNfce) {
        this.indPresNfce = indPresNfce;
   }

   public BigDecimal getTopAtendimento() {
        return topAtendimento;
   }

   public void setTopAtendimento(BigDecimal topAtendimento) {
        this.topAtendimento = topAtendimento;
   }

   public BigDecimal getTopBackOrder() {
        return topBackOrder;
   }

   public void setTopBackOrder(BigDecimal topBackOrder) {
        this.topBackOrder = topBackOrder;
   }

   public String getIndNatFrt() {
        return indNatFrt;
   }

   public void setIndNatFrt(String indNatFrt) {
        this.indNatFrt = indNatFrt;
   }

   public String getInfContrato() {
        return infContrato;
   }

   public void setInfContrato(String infContrato) {
        this.infContrato = infContrato;
   }

   public String getIntegraEvento() {
        return integraEvento;
   }

   public void setIntegraEvento(String integraEvento) {
        this.integraEvento = integraEvento;
   }

   public String getValTotNotaGerLiv() {
        return valTotNotaGerLiv;
   }

   public void setValTotNotaGerLiv(String valTotNotaGerLiv) {
        this.valTotNotaGerLiv = valTotNotaGerLiv;
   }

   public String getOperComMoeda() {
        return operComMoeda;
   }

   public void setOperComMoeda(String operComMoeda) {
        this.operComMoeda = operComMoeda;
   }

   public BigDecimal getPercTolVarVlrUnit() {
        return percTolVarVlrUnit;
   }

   public void setPercTolVarVlrUnit(BigDecimal percTolVarVlrUnit) {
        this.percTolVarVlrUnit = percTolVarVlrUnit;
   }

   public BigDecimal getCat1799SpcCo() {
        return cat1799SpcCo;
   }

   public void setCat1799SpcCo(BigDecimal cat1799SpcCo) {
        this.cat1799SpcCo = cat1799SpcCo;
   }

   public String getCte() {
        return cte;
   }

   public void setCte(String cte) {
        this.cte = cte;
   }

   public BigDecimal getTipServCte() {
        return tipServCte;
   }

   public void setTipServCte(BigDecimal tipServCte) {
        this.tipServCte = tipServCte;
   }

   public BigDecimal getCodTopDenegCte() {
        return codTopDenegCte;
   }

   public void setCodTopDenegCte(BigDecimal codTopDenegCte) {
        this.codTopDenegCte = codTopDenegCte;
   }

   public String getTipoCte() {
        return tipoCte;
   }

   public void setTipoCte(String tipoCte) {
        this.tipoCte = tipoCte;
   }

   public String getValVariaCvlrUnit() {
        return valVariaCvlrUnit;
   }

   public void setValVariaCvlrUnit(String valVariaCvlrUnit) {
        this.valVariaCvlrUnit = valVariaCvlrUnit;
   }

   public BigDecimal getConfValEvent68() {
        return confValEvent68;
   }

   public void setConfValEvent68(BigDecimal confValEvent68) {
        this.confValEvent68 = confValEvent68;
   }

   public String getDataRetroFat() {
        return dataRetroFat;
   }

   public void setDataRetroFat(String dataRetroFat) {
        this.dataRetroFat = dataRetroFat;
   }

   public BigDecimal getConsVlrRemRetInd() {
        return consVlrRemRetInd;
   }

   public void setConsVlrRemRetInd(BigDecimal consVlrRemRetInd) {
        this.consVlrRemRetInd = consVlrRemRetInd;
   }

   public String getDevSemDestaqueIpi() {
        return devSemDestaqueIpi;
   }

   public void setDevSemDestaqueIpi(String devSemDestaqueIpi) {
        this.devSemDestaqueIpi = devSemDestaqueIpi;
   }

   public String getDevSemDestaqueSt() {
        return devSemDestaqueSt;
   }

   public void setDevSemDestaqueSt(String devSemDestaqueSt) {
        this.devSemDestaqueSt = devSemDestaqueSt;
   }

   public String getGeraDemandaMps() {
        return geraDemandaMps;
   }

   public void setGeraDemandaMps(String geraDemandaMps) {
        this.geraDemandaMps = geraDemandaMps;
   }

   public String getGerCorApon() {
        return gerCorApon;
   }

   public void setGerCorApon(String gerCorApon) {
        this.gerCorApon = gerCorApon;
   }

   public String getIgnorarAgrupMinDev() {
        return ignorarAgrupMinDev;
   }

   public void setIgnorarAgrupMinDev(String ignorarAgrupMinDev) {
        this.ignorarAgrupMinDev = ignorarAgrupMinDev;
   }

   public String getRedIcmsBcPisConfins() {
        return redIcmsBcPisConfins;
   }

   public void setRedIcmsBcPisConfins(String redIcmsBcPisConfins) {
        this.redIcmsBcPisConfins = redIcmsBcPisConfins;
   }

   public String getSalvarConfSemPerg() {
        return salvarConfSemPerg;
   }

   public void setSalvarConfSemPerg(String salvarConfSemPerg) {
        this.salvarConfSemPerg = salvarConfSemPerg;
   }

   public String getSemCredIpiSt() {
        return semCredIpiSt;
   }

   public void setSemCredIpiSt(String semCredIpiSt) {
        this.semCredIpiSt = semCredIpiSt;
   }

   public String getSemMoedaFin() {
        return semMoedaFin;
   }

   public void setSemMoedaFin(String semMoedaFin) {
        this.semMoedaFin = semMoedaFin;
   }

   public String getTipModalCte() {
        return tipModalCte;
   }

   public void setTipModalCte(String tipModalCte) {
        this.tipModalCte = tipModalCte;
   }

   public String getUsaRecParcial() {
        return usaRecParcial;
   }

   public void setUsaRecParcial(String usaRecParcial) {
        this.usaRecParcial = usaRecParcial;
   }

   public String getValSitCadRf() {
        return valSitCadRf;
   }

   public void setValSitCadRf(String valSitCadRf) {
        this.valSitCadRf = valSitCadRf;
   }

   public String getVlrLiqItemNfe() {
        return vlrLiqItemNfe;
   }

   public void setVlrLiqItemNfe(String vlrLiqItemNfe) {
        this.vlrLiqItemNfe = vlrLiqItemNfe;
   }

   public String getCalcFetHab() {
        return calcFetHab;
   }

   public void setCalcFetHab(String calcFetHab) {
        this.calcFetHab = calcFetHab;
   }

   public String getExigeAnaliseCred() {
        return exigeAnaliseCred;
   }

   public void setExigeAnaliseCred(String exigeAnaliseCred) {
        this.exigeAnaliseCred = exigeAnaliseCred;
   }

   public String getIndTipRec() {
        return indTipRec;
   }

   public void setIndTipRec(String indTipRec) {
        this.indTipRec = indTipRec;
   }

   public String getCalcFcpInt() {
        return calcFcpInt;
   }

   public void setCalcFcpInt(String calcFcpInt) {
        this.calcFcpInt = calcFcpInt;
   }

   public String getConsAuxiliar() {
        return consAuxiliar;
   }

   public void setConsAuxiliar(String consAuxiliar) {
        this.consAuxiliar = consAuxiliar;
   }

   public String getDescQtdGruDescPro() {
        return descQtdGruDescPro;
   }

   public void setDescQtdGruDescPro(String descQtdGruDescPro) {
        this.descQtdGruDescPro = descQtdGruDescPro;
   }

   public String getReservaSemLote() {
        return reservaSemLote;
   }

   public void setReservaSemLote(String reservaSemLote) {
        this.reservaSemLote = reservaSemLote;
   }

   public String getPermiteCnaeDifNota() {
        return permiteCnaeDifNota;
   }

   public void setPermiteCnaeDifNota(String permiteCnaeDifNota) {
        this.permiteCnaeDifNota = permiteCnaeDifNota;
   }

   public String getIgnoraComplItem() {
        return ignoraComplItem;
   }

   public void setIgnoraComplItem(String ignoraComplItem) {
        this.ignoraComplItem = ignoraComplItem;
   }

   public String getOutDespStExtNota() {
        return outDespStExtNota;
   }

   public void setOutDespStExtNota(String outDespStExtNota) {
        this.outDespStExtNota = outDespStExtNota;
   }

   public String getEstoqueMpTerceiro() {
        return estoqueMpTerceiro;
   }

   public void setEstoqueMpTerceiro(String estoqueMpTerceiro) {
        this.estoqueMpTerceiro = estoqueMpTerceiro;
   }

   public String getRedPisBcPisCofins() {
        return redPisBcPisCofins;
   }

   public void setRedPisBcPisCofins(String redPisBcPisCofins) {
        this.redPisBcPisCofins = redPisBcPisCofins;
   }

   public String getCalcPesoConfirm() {
        return calcPesoConfirm;
   }

   public void setCalcPesoConfirm(String calcPesoConfirm) {
        this.calcPesoConfirm = calcPesoConfirm;
   }

   public String getAplicLeiTransp() {
        return aplicLeiTransp;
   }

   public void setAplicLeiTransp(String aplicLeiTransp) {
        this.aplicLeiTransp = aplicLeiTransp;
   }

   public String getEnvGarantia() {
        return envGarantia;
   }

   public void setEnvGarantia(String envGarantia) {
        this.envGarantia = envGarantia;
   }

   public String getDistStVlrUnitFat() {
        return distStVlrUnitFat;
   }

   public void setDistStVlrUnitFat(String distStVlrUnitFat) {
        this.distStVlrUnitFat = distStVlrUnitFat;
   }

   public String getSimulacAutoFrete() {
        return simulacAutoFrete;
   }

   public void setSimulacAutoFrete(String simulacAutoFrete) {
        this.simulacAutoFrete = simulacAutoFrete;
   }

   public String getIcmsOrigEstPed() {
        return icmsOrigEstPed;
   }

   public void setIcmsOrigEstPed(String icmsOrigEstPed) {
        this.icmsOrigEstPed = icmsOrigEstPed;
   }

   public BigDecimal getCodCtacTbEfd() {
        return codCtacTbEfd;
   }

   public void setCodCtacTbEfd(BigDecimal codCtacTbEfd) {
        this.codCtacTbEfd = codCtacTbEfd;
   }

   public String getLigOrigOrig() {
        return ligOrigOrig;
   }

   public void setLigOrigOrig(String ligOrigOrig) {
        this.ligOrigOrig = ligOrigOrig;
   }

   public String getIndTerc() {
        return indTerc;
   }

   public void setIndTerc(String indTerc) {
        this.indTerc = indTerc;
   }

   public String getMovEndFlutuante() {
        return movEndFlutuante;
   }

   public void setMovEndFlutuante(String movEndFlutuante) {
        this.movEndFlutuante = movEndFlutuante;
   }

   public String getUsaServTabIrFinsS() {
        return usaServTabIrFinsS;
   }

   public void setUsaServTabIrFinsS(String usaServTabIrFinsS) {
        this.usaServTabIrFinsS = usaServTabIrFinsS;
   }

   public String getDescOnfse() {
        return descOnfse;
   }

   public void setDescOnfse(String descOnfse) {
        this.descOnfse = descOnfse;
   }

   public String getAplicTabIrFinsS() {
        return aplicTabIrFinsS;
   }

   public void setAplicTabIrFinsS(String aplicTabIrFinsS) {
        this.aplicTabIrFinsS = aplicTabIrFinsS;
   }

   public String getFormRecIss() {
        return formRecIss;
   }

   public void setFormRecIss(String formRecIss) {
        this.formRecIss = formRecIss;
   }

   public BigDecimal getNatEfdContM410M810() {
        return natEfdContM410M810;
   }

   public void setNatEfdContM410M810(BigDecimal natEfdContM410M810) {
        this.natEfdContM410M810 = natEfdContM410M810;
   }

   public BigDecimal getNufOp() {
        return nufOp;
   }

   public void setNufOp(BigDecimal nufOp) {
        this.nufOp = nufOp;
   }

   public String getOrcamento() {
        return orcamento;
   }

   public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
   }

   public String getDescOnslCdPr() {
        return descOnslCdPr;
   }

   public void setDescOnslCdPr(String descOnslCdPr) {
        this.descOnslCdPr = descOnslCdPr;
   }

   public BigDecimal getCodModRo() {
        return codModRo;
   }

   public void setCodModRo(BigDecimal codModRo) {
        this.codModRo = codModRo;
   }

   public BigDecimal getCodLocalImpXml() {
        return codLocalImpXml;
   }

   public void setCodLocalImpXml(BigDecimal codLocalImpXml) {
        this.codLocalImpXml = codLocalImpXml;
   }

   public String getImpXmlMantDespAces() {
        return impXmlMantDespAces;
   }

   public void setImpXmlMantDespAces(String impXmlMantDespAces) {
        this.impXmlMantDespAces = impXmlMantDespAces;
   }

   public String getCodContaRural() {
        return codContaRural;
   }

   public void setCodContaRural(String codContaRural) {
        this.codContaRural = codContaRural;
   }

   public String getArredQtdUnAlt() {
        return arredQtdUnAlt;
   }

   public void setArredQtdUnAlt(String arredQtdUnAlt) {
        this.arredQtdUnAlt = arredQtdUnAlt;
   }

   public String getConsNfeRelCancEfd() {
        return consNfeRelCancEfd;
   }

   public void setConsNfeRelCancEfd(String consNfeRelCancEfd) {
        this.consNfeRelCancEfd = consNfeRelCancEfd;
   }

   public String getIgnoraMppVpa() {
        return ignoraMppVpa;
   }

   public void setIgnoraMppVpa(String ignoraMppVpa) {
        this.ignoraMppVpa = ignoraMppVpa;
   }

   public String getTopPisCofRedAquis() {
        return topPisCofRedAquis;
   }

   public void setTopPisCofRedAquis(String topPisCofRedAquis) {
        this.topPisCofRedAquis = topPisCofRedAquis;
   }

   public BigDecimal getTipComplCust() {
        return tipComplCust;
   }

   public void setTipComplCust(BigDecimal tipComplCust) {
        this.tipComplCust = tipComplCust;
   }

   public BigDecimal getNuLayoutCvr() {
        return nuLayoutCvr;
   }

   public void setNuLayoutCvr(BigDecimal nuLayoutCvr) {
        this.nuLayoutCvr = nuLayoutCvr;
   }

   public String getDescTopadrCst1400() {
        return descTopadrCst1400;
   }

   public void setDescTopadrCst1400(String descTopadrCst1400) {
        this.descTopadrCst1400 = descTopadrCst1400;
   }

   public String getCalcFunTtelTop() {
        return calcFunTtelTop;
   }

   public void setCalcFunTtelTop(String calcFunTtelTop) {
        this.calcFunTtelTop = calcFunTtelTop;
   }

   public String getCalcFustTop() {
        return calcFustTop;
   }

   public void setCalcFustTop(String calcFustTop) {
        this.calcFustTop = calcFustTop;
   }

   public String getCalcStFrtXtNotProp() {
        return calcStFrtXtNotProp;
   }

   public void setCalcStFrtXtNotProp(String calcStFrtXtNotProp) {
        this.calcStFrtXtNotProp = calcStFrtXtNotProp;
   }

   public BigDecimal getCodInterm() {
        return codInterm;
   }

   public void setCodInterm(BigDecimal codInterm) {
        this.codInterm = codInterm;
   }

   public String getIntermed() {
        return intermed;
   }

   public void setIntermed(String intermed) {
        this.intermed = intermed;
   }

   public String getValEstMaximo() {
        return valEstMaximo;
   }

   public void setValEstMaximo(String valEstMaximo) {
        this.valEstMaximo = valEstMaximo;
   }

   public String getIgnObsOrigRem() {
        return ignObsOrigRem;
   }

   public void setIgnObsOrigRem(String ignObsOrigRem) {
        this.ignObsOrigRem = ignObsOrigRem;
   }

   public String getDescConsidPedXml() {
        return descConsidPedXml;
   }

   public void setDescConsidPedXml(String descConsidPedXml) {
        this.descConsidPedXml = descConsidPedXml;
   }

   public String getOperacaoAmostra() {
        return operacaoAmostra;
   }

   public void setOperacaoAmostra(String operacaoAmostra) {
        this.operacaoAmostra = operacaoAmostra;
   }

   public String getAtualEstWmsTerc() {
        return atualEstWmsTerc;
   }

   public void setAtualEstWmsTerc(String atualEstWmsTerc) {
        this.atualEstWmsTerc = atualEstWmsTerc;
   }

   public String getDescConsidNfeOrigem() {
        return descConsidNfeOrigem;
   }

   public void setDescConsidNfeOrigem(String descConsidNfeOrigem) {
        this.descConsidNfeOrigem = descConsidNfeOrigem;
   }

   public String getDedFcpBcPisCofins() {
        return dedFcpBcPisCofins;
   }

   public void setDedFcpBcPisCofins(String dedFcpBcPisCofins) {
        this.dedFcpBcPisCofins = dedFcpBcPisCofins;
   }

   public String getArmTipApu() {
        return armTipApu;
   }

   public void setArmTipApu(String armTipApu) {
        this.armTipApu = armTipApu;
   }

   public String getCalcPisCfsFin() {
        return calcPisCfsFin;
   }

   public void setCalcPisCfsFin(String calcPisCfsFin) {
        this.calcPisCfsFin = calcPisCfsFin;
   }

   public String getConfVlrEvent68() {
        return confVlrEvent68;
   }

   public void setConfVlrEvent68(String confVlrEvent68) {
        this.confVlrEvent68 = confVlrEvent68;
   }

   public String getCalcIcmsRegTts() {
        return calcIcmsRegTts;
   }

   public void setCalcIcmsRegTts(String calcIcmsRegTts) {
        this.calcIcmsRegTts = calcIcmsRegTts;
   }

   public String getRecBrutaCiap() {
        return recBrutaCiap;
   }

   public void setRecBrutaCiap(String recBrutaCiap) {
        this.recBrutaCiap = recBrutaCiap;
   }

   public String getAtuSaldoCont() {
        return atuSaldoCont;
   }

   public void setAtuSaldoCont(String atuSaldoCont) {
        this.atuSaldoCont = atuSaldoCont;
   }

   public String getUsaVendaMais() {
        return usaVendaMais;
   }

   public void setUsaVendaMais(String usaVendaMais) {
        this.usaVendaMais = usaVendaMais;
   }

   public String getDescCstBcPisCf() {
        return descCstBcPisCf;
   }

   public void setDescCstBcPisCf(String descCstBcPisCf) {
        this.descCstBcPisCf = descCstBcPisCf;
   }

   public String getValDispEstDev() {
        return valDispEstDev;
   }

   public void setValDispEstDev(String valDispEstDev) {
        this.valDispEstDev = valDispEstDev;
   }

   @Override
   public String getEntityName() {
        return "TipoOperacao";
   }

   @Override
   public TipoOperacao fromVO(DynamicVO vo) {
        this.usarPrecoCusto = vo.asString("USARPRECOCUSTO");
        this.usoProdSeparacao = vo.asString("USOPRODSEPARACAO");
        this.valTbCompCr = vo.asString("VALTBCOMPCR");
        this.valVctLaudoEst = vo.asString("VALVCTLAUDOEST");
        this.vendIte = vo.asString("VENDITE");
        this.codModNfse = vo.asBigDecimal("CODMODNFSE");
        this.codModRps = vo.asBigDecimal("CODMODRPS");
        this.codNatOperIss = vo.asString("CODNATOPERISS");
        this.calcDifAlPart = vo.asString("CALCDIFALPART");
        this.valSitCadSefaz = vo.asString("VALSITCADSEFAZ");
        this.transfCbGlobal = vo.asString("TRANSFCBGLOBAL");
        this.transfWms = vo.asString("TRANSFWMS");
        this.travafimImp = vo.asString("TRAVAFIMIMP");
        this.usaCusMedBaseSt = vo.asString("USACUSMEDBASEST");
        this.usarConfCega = vo.asString("USARCONFCEGA");
        this.aceitaFatAcima = vo.asString("ACEITAFATACIMA");
        this.agrupaProdNfe = vo.asString("AGRUPAPRODNFE");
        this.agrupaServFat = vo.asString("AGRUPASERVFAT");
        this.altItemParcFat = vo.asString("ALTITEMPARCFAT");
        this.altNfConf = vo.asString("ALTNFCONF");
        this.analiseGiro = vo.asBigDecimal("ANALISEGIRO");
        this.armazenagem = vo.asString("ARMAZENAGEM");
        this.ativo = vo.asString("ATIVO");
        this.atualAcdc = vo.asString("ATUALACDC");
        this.atualBem = vo.asString("ATUALBEM");
        this.atualCom = vo.asString("ATUALCOM");
        this.atualComOs = vo.asString("ATUALCOMOS");
        this.atualCtb = vo.asString("ATUALCTB");
        this.atualDatRecWms = vo.asString("ATUALDATRECWMS");
        this.atualEst = vo.asString("ATUALEST");
        this.atualEstMp = vo.asBigDecimal("ATUALESTMP");
        this.atualEstTerc = vo.asString("ATUALESTTERC");
        this.atualFin = vo.asBigDecimal("ATUALFIN");
        this.atualFinTerc = vo.asString("ATUALFINTERC");
        this.atualIndeniz = vo.asBigDecimal("ATUALINDENIZ");
        this.atualizarAteio = vo.asString("ATUALIZARATEIO");
        this.atualLivFis = vo.asString("ATUALLIVFIS");
        this.atualLivIss = vo.asString("ATUALLIVISS");
        this.atualPrecoFat = vo.asString("ATUALPRECOFAT");
        this.atualTransg = vo.asBigDecimal("ATUALTRANSG");
        this.atualUltimaComp = vo.asString("ATUALULTIMACOMP");
        this.atualUltimaVend = vo.asString("ATUALULTIMAVEND");
        this.autDigital = vo.asString("AUTDIGITAL");
        this.avisarComp = vo.asString("AVISARCOMP");
        this.baseIcmsFreteCalcSt = vo.asString("BASEICMSFRETECALCST");
        this.baseNumeracao = vo.asString("BASENUMERACAO");
        this.bloqEstVenc = vo.asString("BLOQESTVENC");
        this.bonificacao = vo.asString("BONIFICACAO");
        this.busCmpTerc = vo.asString("BUSCMPTERC");
        this.calcDifIcms = vo.asString("CALCDIFICMS");
        this.calcIcms = vo.asString("CALCICMS");
        this.camGerEdiConf = vo.asString("CAMGEREDICONF");
        this.classifIcms = vo.asString("CLASSIFICMS");
        this.codCfoCombustLubrif = vo.asBigDecimal("CODCFOCOMBUSTLUBRIF");
        this.codCfoEntrada = vo.asBigDecimal("CODCFOENTRADA");
        this.codCfoEntradaFora = vo.asBigDecimal("CODCFOENTRADAFORA");
        this.codCfoSaida = vo.asBigDecimal("CODCFOSAIDA");
        this.codCfoSaidaFora = vo.asBigDecimal("CODCFOSAIDAFORA");
        this.codCfoTerc = vo.asBigDecimal("CODCFOTERC");
        this.codCfps = vo.asBigDecimal("CODCFPS");
        this.descRemail = vo.asString("DESCREMAIL");
        this.utilizaWms = vo.asString("UTILIZAWMS");
        this.valEst = vo.asString("VALEST");
        this.validaAgrupMin = vo.asString("VALIDAAGRUPMIN");
        this.validaAtraso = vo.asString("VALIDAATRASO");
        this.validaData = vo.asString("VALIDADATA");
        this.validaMediaNegoc = vo.asString("VALIDAMEDIANEGOC");
        this.integSerCon = vo.asString("INTEGSERCON");
        this.marcarNaoPendente = vo.asString("MARCARNAOPENDENTE");
        this.mpNumAutLote = vo.asString("MPNUMAUTLOTE");
        this.naoIncConf = vo.asString("NAOINCCONF");
        this.natBcCred = vo.asString("NATBCCRED");
        this.natOperSped = vo.asString("NATOPERSPED");
        this.nfe = vo.asString("NFE");
        this.nfeEstorno = vo.asString("NFEESTORNO");
        this.nfeSemDtEntSai = vo.asString("NFESEMDTENTSAI");
        this.nfse = vo.asString("NFSE");
        this.nfsePorNat = vo.asString("NFSEPORNAT");
        this.nucCo = vo.asBigDecimal("NUCCO");
        this.nuLayout = vo.asBigDecimal("NULAYOUT");
        this.numSomAut = vo.asString("NUMSOMAUT");
        this.nuNotaModelo = vo.asBigDecimal("NUNOTAMODELO");
        this.obterVlrMoedaFat = vo.asString("OBTERVLRMOEDAFAT");
        this.oc = vo.asString("OC");
        this.pedFrete = vo.asString("PEDFRETE");
        this.pendente = vo.asString("PENDENTE");
        this.permConfParcialWms = vo.asString("PERMCONFPARCIALWMS");
        this.pesaItem = vo.asString("PESAITEM");
        this.pisPropDestaque = vo.asString("PISPROPDESTAQUE");
        this.pisPropEmbalagem = vo.asString("PISPROPEMBALAGEM");
        this.pisPropFrete = vo.asString("PISPROPFRETE");
        this.pisPropJuro = vo.asString("PISPROPJURO");
        this.pisPropSeg = vo.asString("PISPROPSEG");
        this.pisStPropDestaque = vo.asString("PISSTPROPDESTAQUE");
        this.pisStPropEmbalagem = vo.asString("PISSTPROPEMBALAGEM");
        this.pisStPropFrete = vo.asString("PISSTPROPFRETE");
        this.pisStPropJuro = vo.asString("PISSTPROPJURO");
        this.pisStPropSeg = vo.asString("PISSTPROPSEG");
        this.podeAjustarOrigProdWms = vo.asString("PODEAJUSTARORIGPRODWMS");
        this.podeFixar = vo.asString("PODEFIXAR");
        this.podePesagem = vo.asString("PODEPESAGEM");
        this.podeTransfEnt = vo.asString("PODETRANSFENT");
        this.precifica = vo.asString("PRECIFICA");
        this.prodRep = vo.asString("PRODREP");
        this.provisEntrega = vo.asString("PROVISENTREGA");
        this.ratAutProd = vo.asString("RATAUTPROD");
        this.refNfe = vo.asString("REFNFE");
        this.sepBalcao = vo.asString("SEPBALCAO");
        this.solCompra = vo.asString("SOLCOMPRA");
        this.somarCofinsSt = vo.asString("SOMARCOFINSST");
        this.somarIpi = vo.asString("SOMARIPI");
        this.somarPisSt = vo.asString("SOMARPISST");
        this.somarSubst = vo.asString("SOMARSUBST");
        this.statusBaixaEst = vo.asString("STATUSBAIXAEST");
        this.statusLote = vo.asString("STATUSLOTE");
        this.stPropDestaque = vo.asString("STPROPDESTAQUE");
        this.stPropEmbalagem = vo.asString("STPROPEMBALAGEM");
        this.stPropFrete = vo.asString("STPROPFRETE");
        this.stPropFreteExt = vo.asString("STPROPFRETEEXT");
        this.stPropJuro = vo.asString("STPROPJURO");
        this.stPropSeg = vo.asString("STPROPSEG");
        this.sugereLocalParc = vo.asString("SUGERELOCALPARC");
        this.temCofins = vo.asString("TEMCOFINS");
        this.temCsl = vo.asString("TEMCSL");
        this.temFinOrigem = vo.asString("TEMFINORIGEM");
        this.temFunRural = vo.asString("TEMFUNRURAL");
        this.temIcms = vo.asString("TEMICMS");
        this.temIi = vo.asString("TEMII");
        this.temIndex = vo.asString("TEMINDEX");
        this.temIpi = vo.asString("TEMIPI");
        this.temIrf = vo.asString("TEMIRF");
        this.temIss = vo.asString("TEMISS");
        this.temPis = vo.asString("TEMPIS");
        this.temReaIcms = vo.asString("TEMREAICMS");
        this.temVavtCon = vo.asString("TEMVAVTCON");
        this.tipAltDtVenc = vo.asString("TIPALTDTVENC");
        this.tipAtualFin = vo.asString("TIPATUALFIN");
        this.tipAtualWms = vo.asString("TIPATUALWMS");
        this.tipFatServ = vo.asString("TIPFATSERV");
        this.tipIcms = vo.asString("TIPICMS");
        this.tipIpi = vo.asString("TIPIPI");
        this.tipIvaSubst = vo.asString("TIPIVASUBST");
        this.tipMov = vo.asString("TIPMOV");
        this.tipMovBemsPed = vo.asString("TIPMOVBEMSPED");
        this.tipoImpKit = vo.asString("TIPOIMPKIT");
        this.tipoNumeracao = vo.asString("TIPONUMERACAO");
        this.vlrBasePgto = vo.asBigDecimal("VLRBASEPGTO");
        this.vlrMinAp = vo.asBigDecimal("VLRMINAP");
        this.ipiEmbut = vo.asString("IPIEMBUT");
        this.ipiIncIcms = vo.asString("IPIINCICMS");
        this.ipiPropDestaque = vo.asString("IPIPROPDESTAQUE");
        this.ipiPropEmbalagem = vo.asString("IPIPROPEMBALAGEM");
        this.ipiPropFrete = vo.asString("IPIPROPFRETE");
        this.ipiPropJuro = vo.asString("IPIPROPJURO");
        this.ipiPropSeg = vo.asString("IPIPROPSEG");
        this.laudoItem = vo.asString("LAUDOITEM");
        this.gerar1400Sped = vo.asString("GERAR1400SPED");
        this.usaAliqNatRatF100 = vo.asString("USAALIQNATRATF100");
        this.valNum = vo.asString("VALNUM");
        this.impNaoConf = vo.asString("IMPNAOCONF");
        this.impNotaAdicional = vo.asString("IMPNOTAADICIONAL");
        this.codRemedi = vo.asBigDecimal("CODREMEDI");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.codTipOperDeneg = vo.asBigDecimal("CODTIPOPERDENEG");
        this.codTipOperDestino = vo.asBigDecimal("CODTIPOPERDESTINO");
        this.codTipOperPenRet = vo.asBigDecimal("CODTIPOPERPENRET");
        this.codTipOperRem = vo.asBigDecimal("CODTIPOPERREM");
        this.codTipOperSeparacao = vo.asBigDecimal("CODTIPOPERSEPARACAO");
        this.codTrib = vo.asBigDecimal("CODTRIB");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.cofinsPropDestaque = vo.asString("COFINSPROPDESTAQUE");
        this.cofinsPropEmbalagem = vo.asString("COFINSPROPEMBALAGEM");
        this.cofinsPropFrete = vo.asString("COFINSPROPFRETE");
        this.cofinsPropJuro = vo.asString("COFINSPROPJURO");
        this.cofinsPropSeg = vo.asString("COFINSPROPSEG");
        this.cofinsStPropDestaque = vo.asString("COFINSSTPROPDESTAQUE");
        this.cofinsStPropEmbalagem = vo.asString("COFINSSTPROPEMBALAGEM");
        this.cofinsStPropFrete = vo.asString("COFINSSTPROPFRETE");
        this.cofinsStPropJuro = vo.asString("COFINSSTPROPJURO");
        this.cofinsStPropSeg = vo.asString("COFINSSTPROPSEG");
        this.complemento = vo.asString("COMPLEMENTO");
        this.confCfop = vo.asString("CONFCFOP");
        this.confImposto = vo.asString("CONFIMPOSTO");
        this.consignacao = vo.asString("CONSIGNACAO");
        this.contLaudoSint = vo.asString("CONTLAUDOSINT");
        this.copiaDtPrevOrig = vo.asString("COPIADTPREVORIG");
        this.copiarLiber = vo.asString("COPIARLIBER");
        this.cstIpiEnt = vo.asBigDecimal("CSTIPIENT");
        this.cstIpiSai = vo.asBigDecimal("CSTIPISAI");
        this.codModDad = vo.asBigDecimal("CODMODDAD");
        this.codModDoc = vo.asBigDecimal("CODMODDOC");
        this.codModDocIss = vo.asString("CODMODDOCISS");
        this.codModNf = vo.asBigDecimal("CODMODNF");
        this.icmsPropJuro = vo.asString("ICMSPROPJURO");
        this.icmsPropSeg = vo.asString("ICMSPROPSEG");
        this.cupomFiscal = vo.asString("CUPOMFISCAL");
        this.dentroEstado = vo.asString("DENTROESTADO");
        this.descROper = vo.asString("DESCROPER");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.digInfImporta = vo.asString("DIGINFIMPORTA");
        this.digPureza = vo.asString("DIGPUREZA");
        this.editaAnaliseRentab = vo.asString("EDITAANALISERENTAB");
        this.emiteBoleta = vo.asString("EMITEBOLETA");
        this.emiteNota = vo.asString("EMITENOTA");
        this.empFuncDif = vo.asString("EMPFUNCDIF");
        this.enviarWmsConf = vo.asString("ENVIARWMSCONF");
        this.envWmsConfirmada = vo.asString("ENVWMSCONFIRMADA");
        this.execIte = vo.asString("EXECITE");
        this.exigAnalItens = vo.asString("EXIGANALITENS");
        this.exigeAgendaWms = vo.asString("EXIGEAGENDAWMS");
        this.exigeConf = vo.asString("EXIGECONF");
        this.exigeCotacao = vo.asString("EXIGECOTACAO");
        this.exigeDtVal = vo.asString("EXIGEDTVAL");
        this.exigeGar = vo.asString("EXIGEGAR");
        this.exigeLaudo = vo.asString("EXIGELAUDO");
        this.exigeLib = vo.asString("EXIGELIB");
        this.exigeLibSempre = vo.asString("EXIGELIBSEMPRE");
        this.exigePedFret = vo.asString("EXIGEPEDFRET");
        this.exigeTransp = vo.asString("EXIGETRANSP");
        this.expGrs = vo.asBigDecimal("EXPGRS");
        this.exporta = vo.asString("EXPORTA");
        this.expTes = vo.asString("EXPTES");
        this.fatContPorPeso = vo.asString("FATCONTPORPESO");
        this.fatEntProd = vo.asString("FATENTPROD");
        this.fatEstConf = vo.asString("FATESTCONF");
        this.geraAmostraLaudo = vo.asString("GERAAMOSTRALAUDO");
        this.geraBonPre = vo.asString("GERABONPRE");
        this.geraGnre = vo.asString("GERAGNRE");
        this.geraPlanProd = vo.asString("GERAPLANPROD");
        this.geraRparcDest = vo.asString("GERARPARCDEST");
        this.geraRtagJnfe = vo.asString("GERARTAGJNFE");
        this.goldEv = vo.asBigDecimal("GOLDEV");
        this.golMpSinal = vo.asBigDecimal("GOLMPSINAL");
        this.golSinal = vo.asBigDecimal("GOLSINAL");
        this.graHisAltPed = vo.asString("GRAHISALTPED");
        this.grupo = vo.asString("GRUPO");
        this.icmsPropDestaque = vo.asString("ICMSPROPDESTAQUE");
        this.icmsPropEmbalagem = vo.asString("ICMSPROPEMBALAGEM");
        this.icmsPropFrete = vo.asString("ICMSPROPFRETE");
        this.fatForaPlanEnt = vo.asString("FATFORAPLANENT");
        this.geraEndEntrNfe = vo.asString("GERAENDENTRNFE");
        this.exigeConfirmacaoMde = vo.asString("EXIGECONFIRMACAOMDE");
        this.codModCfeCanc = vo.asBigDecimal("CODMODCFECANC");
        this.constOpApurSimp = vo.asString("CONSTOPAPURSIMP");
        this.gerInfoEfdPag = vo.asString("GERINFOEFDPAG");
        this.ignExpAutLot = vo.asString("IGNEXPAUTLOT");
        this.numProcesso = vo.asString("NUMPROCESSO");
        this.permDestVbatPrebCus = vo.asString("PERMDESTVBATPREBCUS");
        this.redStbCpIsCofins = vo.asString("REDSTBCPISCOFINS");
        this.usaTabAltEmp = vo.asString("USATABALTEMP");
        this.codEnqIpiSai = vo.asBigDecimal("CODENQIPISAI");
        this.codEnqIpiEnt = vo.asBigDecimal("CODENQIPIENT");
        this.permFinMenorVlrNota = vo.asString("PERMFINMENORVLRNOTA");
        this.produEtLoc = vo.asString("PRODUETLOC");
        this.percMinBaseInss = vo.asBigDecimal("PERCMINBASEINSS");
        this.ajustavp = vo.asString("AJUSTAVP");
        this.codMoedaVp = vo.asBigDecimal("CODMOEDAVP");
        this.indPresNfce = vo.asString("INDPRESNFCE");
        this.topAtendimento = vo.asBigDecimal("TOPATENDIMENTO");
        this.topBackOrder = vo.asBigDecimal("TOPBACKORDER");
        this.indNatFrt = vo.asString("INDNATFRT");
        this.infContrato = vo.asString("INFCONTRATO");
        this.integraEvento = vo.asString("INTEGRAEVENTO");
        this.valTotNotaGerLiv = vo.asString("VALTOTNOTAGERLIV");
        this.operComMoeda = vo.asString("OPERCOMMOEDA");
        this.percTolVarVlrUnit = vo.asBigDecimal("PERCTOLVARVLRUNIT");
        this.cat1799SpcCo = vo.asBigDecimal("CAT1799SPCCO");
        this.cte = vo.asString("CTE");
        this.tipServCte = vo.asBigDecimal("TIPSERVCTE");
        this.codTopDenegCte = vo.asBigDecimal("CODTOPDENEGCTE");
        this.tipoCte = vo.asString("TIPOCTE");
        this.valVariaCvlrUnit = vo.asString("VALVARIACVLRUNIT");
        this.confValEvent68 = vo.asBigDecimal("CONFVALEVENT68");
        this.dataRetroFat = vo.asString("DATARETROFAT");
        this.consVlrRemRetInd = vo.asBigDecimal("CONSVLRREMRETIND");
        this.devSemDestaqueIpi = vo.asString("DEVSEMDESTAQUEIPI");
        this.devSemDestaqueSt = vo.asString("DEVSEMDESTAQUEST");
        this.geraDemandaMps = vo.asString("GERADEMANDAMPS");
        this.gerCorApon = vo.asString("GERCORAPON");
        this.ignorarAgrupMinDev = vo.asString("IGNORARAGRUPMINDEV");
        this.redIcmsBcPisConfins = vo.asString("REDICMSBCPISCONFINS");
        this.salvarConfSemPerg = vo.asString("SALVARCONFSEMPERG");
        this.semCredIpiSt = vo.asString("SEMCREDIPIST");
        this.semMoedaFin = vo.asString("SEMMOEDAFIN");
        this.tipModalCte = vo.asString("TIPMODALCTE");
        this.usaRecParcial = vo.asString("USARECPARCIAL");
        this.valSitCadRf = vo.asString("VALSITCADRF");
        this.vlrLiqItemNfe = vo.asString("VLRLIQITEMNFE");
        this.calcFetHab = vo.asString("CALCFETHAB");
        this.exigeAnaliseCred = vo.asString("EXIGEANALISECRED");
        this.indTipRec = vo.asString("INDTIPREC");
        this.calcFcpInt = vo.asString("CALCFCPINT");
        this.consAuxiliar = vo.asString("CONSAUXILIAR");
        this.descQtdGruDescPro = vo.asString("DESCQTDGRUDESCPRO");
        this.reservaSemLote = vo.asString("RESERVASEMLOTE");
        this.permiteCnaeDifNota = vo.asString("PERMITECNAEDIFNOTA");
        this.ignoraComplItem = vo.asString("IGNORACOMPLITEM");
        this.outDespStExtNota = vo.asString("OUTDESPSTEXTNOTA");
        this.estoqueMpTerceiro = vo.asString("ESTOQUEMPTERCEIRO");
        this.redPisBcPisCofins = vo.asString("REDPISBCPISCOFINS");
        this.calcPesoConfirm = vo.asString("CALCPESOCONFIRM");
        this.aplicLeiTransp = vo.asString("APLICLEITRANSP");
        this.envGarantia = vo.asString("ENVGARANTIA");
        this.distStVlrUnitFat = vo.asString("DISTSTVLRUNITFAT");
        this.simulacAutoFrete = vo.asString("SIMULACAUTOFRETE");
        this.icmsOrigEstPed = vo.asString("ICMSORIGESTPED");
        this.codCtacTbEfd = vo.asBigDecimal("CODCTACTBEFD");
        this.ligOrigOrig = vo.asString("LIGORIGORIG");
        this.indTerc = vo.asString("INDTERC");
        this.movEndFlutuante = vo.asString("MOVENDFLUTUANTE");
        this.usaServTabIrFinsS = vo.asString("USASERVTABIRFINSS");
        this.descOnfse = vo.asString("DESCONFSE");
        this.aplicTabIrFinsS = vo.asString("APLICTABIRFINSS");
        this.formRecIss = vo.asString("FORMRECISS");
        this.natEfdContM410M810 = vo.asBigDecimal("NATEFDCONTM410M810");
        this.nufOp = vo.asBigDecimal("NUFOP");
        this.orcamento = vo.asString("ORCAMENTO");
        this.descOnslCdPr = vo.asString("DESCONSLCDPR");
        this.codModRo = vo.asBigDecimal("CODMODRO");
        this.codLocalImpXml = vo.asBigDecimal("CODLOCALIMPXML");
        this.impXmlMantDespAces = vo.asString("IMPXMLMANTDESPACES");
        this.codContaRural = vo.asString("CODCONTARURAL");
        this.arredQtdUnAlt = vo.asString("ARREDQTDUNALT");
        this.consNfeRelCancEfd = vo.asString("CONSNFERELCANCEFD");
        this.ignoraMppVpa = vo.asString("IGNORAMPPVPA");
        this.topPisCofRedAquis = vo.asString("TOPPISCOFREDAQUIS");
        this.tipComplCust = vo.asBigDecimal("TIPCOMPLCUST");
        this.nuLayoutCvr = vo.asBigDecimal("NULAYOUTCVR");
        this.descTopadrCst1400 = vo.asString("DESCTOPADRCST1400");
        this.calcFunTtelTop = vo.asString("CALCFUNTTELTOP");
        this.calcFustTop = vo.asString("CALCFUSTTOP");
        this.calcStFrtXtNotProp = vo.asString("CALCSTFRTXTNOTPROP");
        this.codInterm = vo.asBigDecimal("CODINTERM");
        this.intermed = vo.asString("INTERMED");
        this.valEstMaximo = vo.asString("VALESTMAXIMO");
        this.ignObsOrigRem = vo.asString("IGNOBSORIGREM");
        this.descConsidPedXml = vo.asString("DESCCONSIDPEDXML");
        this.operacaoAmostra = vo.asString("OPERACAOAMOSTRA");
        this.atualEstWmsTerc = vo.asString("ATUALESTWMSTERC");
        this.descConsidNfeOrigem = vo.asString("DESCCONSIDNFEORIGEM");
        this.dedFcpBcPisCofins = vo.asString("DEDFCPBCPISCOFINS");
        this.armTipApu = vo.asString("ARMTIPAPU");
        this.calcPisCfsFin = vo.asString("CALCPISCFSFIN");
        this.confVlrEvent68 = vo.asString("CONFVLREVENT68");
        this.calcIcmsRegTts = vo.asString("CALCICMSREGTTS");
        this.recBrutaCiap = vo.asString("RECBRUTACIAP");
        this.atuSaldoCont = vo.asString("ATUSALDOCONT");
        this.usaVendaMais = vo.asString("USAVENDAMAIS");
        this.descCstBcPisCf = vo.asString("DESCCSTBCPISCF");
        this.valDispEstDev = vo.asString("VALDISPESTDEV");
        return this;
   }
}
