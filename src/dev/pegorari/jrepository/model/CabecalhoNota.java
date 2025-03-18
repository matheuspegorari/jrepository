package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoNota extends AbstractSankhyaEntity<CabecalhoNota> {
   private BigDecimal codObsPadrao;
   private BigDecimal codParc;
   private BigDecimal codParcConsignatario;
   private BigDecimal codParcDest;
   private BigDecimal codParcRedespacho;
   private BigDecimal codParcRemetente;
   private BigDecimal codTipVenda;
   private BigDecimal codTpd;
   private BigDecimal codUsu;
   private BigDecimal codUsuComprador;
   private BigDecimal codUsuInc;
   private BigDecimal codVeiculo;
   private BigDecimal codVend;
   private BigDecimal codVendTec;
   private BigDecimal codVtp;
   private BigDecimal comGer;
   private BigDecimal comissao;
   private String confirmada;
   private BigDecimal danfe;
   private String descrHistAc;
   private Timestamp dhProtoc;
   private Timestamp dhRegDpec;
   private Timestamp dhTipOper;
   private Timestamp dhTipVenda;
   private String digital;
   private Timestamp dtAdiam;
   private Timestamp dtAlter;
   private Timestamp dtContab;
   private Timestamp dtEntSai;
   private Timestamp dtEnvioPmb;
   private Timestamp dtEnvSuf;
   private Timestamp dtFatur;
   private Timestamp dtMov;
   private Timestamp dtNeg;
   private Timestamp dtPrevent;
   private Timestamp dtVal;
   private BigDecimal hrAdiam;
   private Timestamp hrEntSai;
   private BigDecimal hrMov;
   private BigDecimal icmsFrete;
   private BigDecimal ipiEmb;
   private String irFretido;
   private String issRetido;
   private BigDecimal kmVeiculo;
   private String lacres;
   private String libConf;
   private String libPendente;
   private String localColeta;
   private String localEntrega;
   private BigDecimal m3;
   private BigDecimal m3AEntregar;
   private String marca;
   private String modeloNfDes;
   private String naturezaOperDes;
   private String notasCf;
   private BigDecimal nroCaixa;
   private BigDecimal nroRedz;
   private BigDecimal nuConfAtual;
   private BigDecimal nuLotEnfe;
   private BigDecimal nuLotEnfse;
   private BigDecimal numAleatorio;
   private BigDecimal numCf;
   private BigDecimal numContrato;
   private BigDecimal numCotacao;
   private String numeracaoVolumes;
   private String numNfse;
   private BigDecimal numNota;
   private BigDecimal numOs;
   private String numPedido2;
   private String numProtoc;
   private String numRegDpec;
   private BigDecimal nuNota;
   private BigDecimal nuNotaPedFret;
   private BigDecimal nuPca;
   private BigDecimal nuRd8;
   private BigDecimal nuRem;
   private BigDecimal nuTransf;
   private String observacao;
   private String observacaoAc;
   private BigDecimal occN48;
   private BigDecimal ordemCarga;
   private String pedidoImpresso;
   private String pendente;
   private BigDecimal percDesc;
   private BigDecimal peso;
   private BigDecimal pesoAEntregar;
   private BigDecimal pesoBruto;
   private BigDecimal pesoBrutoItens;
   private String placa;
   private BigDecimal qtdVol;
   private String rateado;
   private String retornadoAc;
   private BigDecimal seqCarga;
   private BigDecimal codParcTransp;
   private BigDecimal codProj;
   private String serieNfDes;
   private String serieNota;
   private BigDecimal codSite;
   private BigDecimal codTipOper;
   private BigDecimal aliqIrf;
   private String antt;
   private String aprovado;
   private BigDecimal baseCofins;
   private BigDecimal baseCofinsSt;
   private BigDecimal baseIcms;
   private BigDecimal baseIcmsFrete;
   private BigDecimal baseInss;
   private BigDecimal baseIpi;
   private BigDecimal baseIrf;
   private BigDecimal baseIss;
   private BigDecimal basePis;
   private BigDecimal basePisSt;
   private BigDecimal baseSubstit;
   private BigDecimal baseSubstSemRed;
   private String chaveNfe;
   private String cifFob;
   private BigDecimal codCc;
   private BigDecimal codCencus;
   private BigDecimal codCid;
   private BigDecimal codContato;
   private BigDecimal codDoca;
   private BigDecimal codEmp;
   private BigDecimal codEmpFunc;
   private BigDecimal codEmpNegoc;
   private BigDecimal codFunc;
   private String codGrupoTensao;
   private BigDecimal codHistAc;
   private BigDecimal codLocalOrig;
   private BigDecimal codMaq;
   private BigDecimal codModDocNota;
   private BigDecimal tpLigacao;
   private BigDecimal troco;
   private BigDecimal ufVeiculo;
   private Timestamp vencFrete;
   private Timestamp vencIpi;
   private BigDecimal vlrCofins;
   private BigDecimal vlrCofinsSt;
   private BigDecimal vlrCompensacao;
   private BigDecimal vlrDescServ;
   private BigDecimal vlrDescTot;
   private BigDecimal vlrDescTotItem;
   private BigDecimal vlrDestaque;
   private BigDecimal vlrEmb;
   private BigDecimal vlrFrete;
   private BigDecimal vlrFreteCpl;
   private BigDecimal vlrIcms;
   private BigDecimal vlrIcmsEmb;
   private BigDecimal vlrIcmsSeg;
   private BigDecimal vlrIndeniz;
   private BigDecimal vlrIndenizDist;
   private BigDecimal vlrInss;
   private BigDecimal vlrIpi;
   private BigDecimal vlrIrf;
   private BigDecimal vlrIss;
   private BigDecimal vlrJuro;
   private BigDecimal vlrJuroDist;
   private BigDecimal vlrMercadoria;
   private BigDecimal vlrMoeda;
   private BigDecimal vlrNota;
   private BigDecimal vlrOutros;
   private BigDecimal vlrPis;
   private BigDecimal vlrPisSt;
   private BigDecimal vlrRepRedTot;
   private BigDecimal vlrRoyalt;
   private BigDecimal vlrSeg;
   private BigDecimal vlrStExtraNotaTot;
   private BigDecimal vlrSubst;
   private BigDecimal vlrVendor;
   private String volume;
   private String tipMov;
   private String tipNotaPmb;
   private BigDecimal tipOptAgjNfe;
   private BigDecimal totalCustoProd;
   private BigDecimal totalCustoServ;
   private BigDecimal totDispDesc;
   private String tpAmbNfe;
   private BigDecimal tpAssinante;
   private BigDecimal tpEmisNfe;
   private BigDecimal tpEmisNfse;
   private BigDecimal codMoeda;
   private BigDecimal codMotorista;
   private BigDecimal codNat;
   private String modEntrega;
   private String notaEmpenho;
   private BigDecimal vlrFreteTotal;
   private BigDecimal codParcTranspFinal;
   private BigDecimal situacaoWms;
   private String viaTransp;
   private String ufAdquirente;
   private String cnpjAdquirente;
   private String tipProcImp;
   private String prodPred;
   private BigDecimal pesoLiqItens;
   private BigDecimal vlrDescTotItemMoe;
   private BigDecimal vlrTotLiqItemMoe;
   private String cteLotacao;
   private String chaveCte;
   private BigDecimal reboque3;
   private String situacaoCte;
   private String lotacao;
   private BigDecimal tpEmisCte;
   private String tpAmbCte;
   private BigDecimal numAleatorioCte;
   private String statusCte;
   private Timestamp dtDeclara;
   private BigDecimal reboque1;
   private BigDecimal reboque2;
   private String cpfCnpjAdquirente;
   private Timestamp dtEntSaiInfo;
   private String indPresNfce;
   private String locEmbarq;
   private String nomeAdquirente;
   private String ufEmbarq;
   private String chaveNfse;
   private String produetLoc;
   private Timestamp dhEmissEpec;
   private BigDecimal nuNotaSub;
   private BigDecimal tipServCte;
   private String tipoCte;
   private Timestamp dtRemRet;
   private BigDecimal idIproc;
   private String statusWms;
   private BigDecimal vlrIcmsFcp;
   private BigDecimal vlrIcmsDifAlDest;
   private BigDecimal vlrIcmsDifAlRem;
   private BigDecimal nuLoteCte;
   private String numProtocCte;
   private Timestamp dhProtocCte;
   private String pesoLiquiManual;
   private String pesoBrutoManual;
   private String codObra;
   private String codArt;
   private BigDecimal codParcDescargaMdfe;
   private BigDecimal codGuf;
   private String confirmNotaFat;
   private String direcaoViag;
   private Timestamp dtRef;
   private Timestamp dtRef2;
   private Timestamp dtRef3;
   private BigDecimal freteVlrPago;
   private String idBalsa01;
   private String idBalsa02;
   private String idBalsa03;
   private String idNavio;
   private String irInNavio;
   private String nfeDevRecusa;
   private BigDecimal nuCfr;
   private String permAlterCentral;
   private BigDecimal timContratoLtv;
   private BigDecimal timContratoVenda;
   private BigDecimal timNuFinOrig;
   private BigDecimal timNuNotaMod;
   private String timOrigem;
   private BigDecimal vlrAfrmm;
   private BigDecimal vlrFreteCalc;
   private String vlrLiqItemNfe;
   private BigDecimal vlrPrestaAfrmm;
   private BigDecimal vlrRepRedTotSemDesc;
   private String agrupFinNota;
   private BigDecimal codCidOrigem;
   private BigDecimal codCidDestino;
   private String classifIcms;
   private BigDecimal nuFop;
   private BigDecimal codUfEntrega;
   private BigDecimal codUfOrigem;
   private BigDecimal codContatoEntrega;
   private BigDecimal codUfDestino;
   private BigDecimal codCidEntrega;
   private String statusConferencia;
   private String statusNfe;
   private String statusNfse;
   private String statusNota;
   private String tipFrete;
   private String tipIpiEmb;
   private String tipLiberacao;
   private BigDecimal ciot;
   private String regEspTribut;
   private String exigeIssqn;
   private String sitEspecialResp;
   private String motNaoReterIssqn;
   private String chaveNfeRef;
   private String clasCons;
   private String fusoEmissEpec;
   private String formPgtCte;
   private BigDecimal codCidPrest;
   private BigDecimal descTermAcord;
   private String termAcordNota;
   private BigDecimal vlrIcmsFcpInt;
   private BigDecimal vlrStFcpInt;
   private BigDecimal vlrStFcpIntAnt;
   private String tpAmbNfse;
   private BigDecimal timCodProd;
   private String timDescProd;
   private String nfseId;
   private String premiacaoEstadual;
   private BigDecimal codDocArrecad;
   private String numDocArrecad;
   private BigDecimal vlrIcmsDiferido;
   private String latitude;
   private String longitude;
   private BigDecimal nuPedFrete;
   private BigDecimal nuOdp;
   private String codRastreamentoEct;
   private BigDecimal codCidFimCte;
   private BigDecimal codCidIniCte;
   private String cteGlobal;
   private BigDecimal vlrCargaAverb;
   private BigDecimal percDescFob;
   private BigDecimal sumVlrIiOutNota;
   private Timestamp dhViagem;
   private BigDecimal nuSessao;
   private BigDecimal tpFretamento;
   private BigDecimal codParcRetirada;
   private String notaPorPedidoPdv;
   private String chaveCteRef;
   private BigDecimal valorDesonPisCofins;
   private BigDecimal codInterm;
   private String intermed;
   private BigDecimal vlrFetHab;
   private String fistel;
   private String md5ModComTel;
   private BigDecimal numCstc;
   private String numTermTel;
   private BigDecimal qtdUsu;
   private BigDecimal tipClienteServCom;
   private String indNegModal;
   private BigDecimal baseIcmsStFrete;
   private BigDecimal icmsStFrete;
   private BigDecimal vlrRepRedSt;
   private BigDecimal baseIcmsAt;
   private BigDecimal vlrIcmsAt;
   private BigDecimal codCheckout;
   private BigDecimal clienteIdParceria;
   private BigDecimal idDescParceria;
   private BigDecimal idPontuacaoParceria;
   private BigDecimal vlrDescParceria;
   private BigDecimal qtdProdDistintos;
   private String disDesautImpEmb;
   private String contabilizado;
   private BigDecimal nuNotaRec;
   private BigDecimal nuRecebimento;
   private String retGerWms;
   private String retornoEquipFiscal;
   private BigDecimal somIcmsNfeNac;
   private BigDecimal somPisCofNfeNac;
   private String statusCfe;
   private Timestamp dtValAutVendaMais;
   private String histConfig;
   private String serieNfse;
   private String cpfRespTec;
   private BigDecimal numGuia;
   private String numReceitaGro;
   private String serieGuia;
   private String tipoGuia;
   private String ufEmissao;
   private String caracAd;
   private String caracSer;
   private BigDecimal somDespAdUnfeNac;
   private String codAuthVm;
   private String numProtocInCte;
   private String statusVm;
   private String numProtocInNfe;
   private BigDecimal vlrRepTerc;
   private String chvNfeIneRef;
   private Timestamp dtEscrCont;
   private String modRecebPdvWeb;
   private String statusAutorizacaoVm;

   public BigDecimal getCodObsPadrao() {
        return codObsPadrao;
   }

   public void setCodObsPadrao(BigDecimal codObsPadrao) {
        markAsChanged("CODOBSPADRAO", codObsPadrao);
        this.codObsPadrao = codObsPadrao;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodParcConsignatario() {
        return codParcConsignatario;
   }

   public void setCodParcConsignatario(BigDecimal codParcConsignatario) {
        markAsChanged("CODPARCCONSIGNATARIO", codParcConsignatario);
        this.codParcConsignatario = codParcConsignatario;
   }

   public BigDecimal getCodParcDest() {
        return codParcDest;
   }

   public void setCodParcDest(BigDecimal codParcDest) {
        markAsChanged("CODPARCDEST", codParcDest);
        this.codParcDest = codParcDest;
   }

   public BigDecimal getCodParcRedespacho() {
        return codParcRedespacho;
   }

   public void setCodParcRedespacho(BigDecimal codParcRedespacho) {
        markAsChanged("CODPARCREDESPACHO", codParcRedespacho);
        this.codParcRedespacho = codParcRedespacho;
   }

   public BigDecimal getCodParcRemetente() {
        return codParcRemetente;
   }

   public void setCodParcRemetente(BigDecimal codParcRemetente) {
        markAsChanged("CODPARCREMETENTE", codParcRemetente);
        this.codParcRemetente = codParcRemetente;
   }

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
        this.codTipVenda = codTipVenda;
   }

   public BigDecimal getCodTpd() {
        return codTpd;
   }

   public void setCodTpd(BigDecimal codTpd) {
        markAsChanged("CODTPD", codTpd);
        this.codTpd = codTpd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuComprador() {
        return codUsuComprador;
   }

   public void setCodUsuComprador(BigDecimal codUsuComprador) {
        markAsChanged("CODUSUCOMPRADOR", codUsuComprador);
        this.codUsuComprador = codUsuComprador;
   }

   public BigDecimal getCodUsuInc() {
        return codUsuInc;
   }

   public void setCodUsuInc(BigDecimal codUsuInc) {
        markAsChanged("CODUSUINC", codUsuInc);
        this.codUsuInc = codUsuInc;
   }

   public BigDecimal getCodVeiculo() {
        return codVeiculo;
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
        this.codVeiculo = codVeiculo;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
        this.codVend = codVend;
   }

   public BigDecimal getCodVendTec() {
        return codVendTec;
   }

   public void setCodVendTec(BigDecimal codVendTec) {
        markAsChanged("CODVENDTEC", codVendTec);
        this.codVendTec = codVendTec;
   }

   public BigDecimal getCodVtp() {
        return codVtp;
   }

   public void setCodVtp(BigDecimal codVtp) {
        markAsChanged("CODVTP", codVtp);
        this.codVtp = codVtp;
   }

   public BigDecimal getComGer() {
        return comGer;
   }

   public void setComGer(BigDecimal comGer) {
        markAsChanged("COMGER", comGer);
        this.comGer = comGer;
   }

   public BigDecimal getComissao() {
        return comissao;
   }

   public void setComissao(BigDecimal comissao) {
        markAsChanged("COMISSAO", comissao);
        this.comissao = comissao;
   }

   public String getConfirmada() {
        return confirmada;
   }

   public void setConfirmada(String confirmada) {
        markAsChanged("CONFIRMADA", confirmada);
        this.confirmada = confirmada;
   }

   public BigDecimal getDanfe() {
        return danfe;
   }

   public void setDanfe(BigDecimal danfe) {
        markAsChanged("DANFE", danfe);
        this.danfe = danfe;
   }

   public String getDescrHistAc() {
        return descrHistAc;
   }

   public void setDescrHistAc(String descrHistAc) {
        markAsChanged("DESCRHISTAC", descrHistAc);
        this.descrHistAc = descrHistAc;
   }

   public Timestamp getDhProtoc() {
        return dhProtoc;
   }

   public void setDhProtoc(Timestamp dhProtoc) {
        markAsChanged("DHPROTOC", dhProtoc);
        this.dhProtoc = dhProtoc;
   }

   public Timestamp getDhRegDpec() {
        return dhRegDpec;
   }

   public void setDhRegDpec(Timestamp dhRegDpec) {
        markAsChanged("DHREGDPEC", dhRegDpec);
        this.dhRegDpec = dhRegDpec;
   }

   public Timestamp getDhTipOper() {
        return dhTipOper;
   }

   public void setDhTipOper(Timestamp dhTipOper) {
        markAsChanged("DHTIPOPER", dhTipOper);
        this.dhTipOper = dhTipOper;
   }

   public Timestamp getDhTipVenda() {
        return dhTipVenda;
   }

   public void setDhTipVenda(Timestamp dhTipVenda) {
        markAsChanged("DHTIPVENDA", dhTipVenda);
        this.dhTipVenda = dhTipVenda;
   }

   public String getDigital() {
        return digital;
   }

   public void setDigital(String digital) {
        markAsChanged("DIGITAL", digital);
        this.digital = digital;
   }

   public Timestamp getDtAdiam() {
        return dtAdiam;
   }

   public void setDtAdiam(Timestamp dtAdiam) {
        markAsChanged("DTADIAM", dtAdiam);
        this.dtAdiam = dtAdiam;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtContab() {
        return dtContab;
   }

   public void setDtContab(Timestamp dtContab) {
        markAsChanged("DTCONTAB", dtContab);
        this.dtContab = dtContab;
   }

   public Timestamp getDtEntSai() {
        return dtEntSai;
   }

   public void setDtEntSai(Timestamp dtEntSai) {
        markAsChanged("DTENTSAI", dtEntSai);
        this.dtEntSai = dtEntSai;
   }

   public Timestamp getDtEnvioPmb() {
        return dtEnvioPmb;
   }

   public void setDtEnvioPmb(Timestamp dtEnvioPmb) {
        markAsChanged("DTENVIOPMB", dtEnvioPmb);
        this.dtEnvioPmb = dtEnvioPmb;
   }

   public Timestamp getDtEnvSuf() {
        return dtEnvSuf;
   }

   public void setDtEnvSuf(Timestamp dtEnvSuf) {
        markAsChanged("DTENVSUF", dtEnvSuf);
        this.dtEnvSuf = dtEnvSuf;
   }

   public Timestamp getDtFatur() {
        return dtFatur;
   }

   public void setDtFatur(Timestamp dtFatur) {
        markAsChanged("DTFATUR", dtFatur);
        this.dtFatur = dtFatur;
   }

   public Timestamp getDtMov() {
        return dtMov;
   }

   public void setDtMov(Timestamp dtMov) {
        markAsChanged("DTMOV", dtMov);
        this.dtMov = dtMov;
   }

   public Timestamp getDtNeg() {
        return dtNeg;
   }

   public void setDtNeg(Timestamp dtNeg) {
        markAsChanged("DTNEG", dtNeg);
        this.dtNeg = dtNeg;
   }

   public Timestamp getDtPrevent() {
        return dtPrevent;
   }

   public void setDtPrevent(Timestamp dtPrevent) {
        markAsChanged("DTPREVENT", dtPrevent);
        this.dtPrevent = dtPrevent;
   }

   public Timestamp getDtVal() {
        return dtVal;
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
        this.dtVal = dtVal;
   }

   public BigDecimal getHrAdiam() {
        return hrAdiam;
   }

   public void setHrAdiam(BigDecimal hrAdiam) {
        markAsChanged("HRADIAM", hrAdiam);
        this.hrAdiam = hrAdiam;
   }

   public Timestamp getHrEntSai() {
        return hrEntSai;
   }

   public void setHrEntSai(Timestamp hrEntSai) {
        markAsChanged("HRENTSAI", hrEntSai);
        this.hrEntSai = hrEntSai;
   }

   public BigDecimal getHrMov() {
        return hrMov;
   }

   public void setHrMov(BigDecimal hrMov) {
        markAsChanged("HRMOV", hrMov);
        this.hrMov = hrMov;
   }

   public BigDecimal getIcmsFrete() {
        return icmsFrete;
   }

   public void setIcmsFrete(BigDecimal icmsFrete) {
        markAsChanged("ICMSFRETE", icmsFrete);
        this.icmsFrete = icmsFrete;
   }

   public BigDecimal getIpiEmb() {
        return ipiEmb;
   }

   public void setIpiEmb(BigDecimal ipiEmb) {
        markAsChanged("IPIEMB", ipiEmb);
        this.ipiEmb = ipiEmb;
   }

   public String getIrFretido() {
        return irFretido;
   }

   public void setIrFretido(String irFretido) {
        markAsChanged("IRFRETIDO", irFretido);
        this.irFretido = irFretido;
   }

   public String getIssRetido() {
        return issRetido;
   }

   public void setIssRetido(String issRetido) {
        markAsChanged("ISSRETIDO", issRetido);
        this.issRetido = issRetido;
   }

   public BigDecimal getKmVeiculo() {
        return kmVeiculo;
   }

   public void setKmVeiculo(BigDecimal kmVeiculo) {
        markAsChanged("KMVEICULO", kmVeiculo);
        this.kmVeiculo = kmVeiculo;
   }

   public String getLacres() {
        return lacres;
   }

   public void setLacres(String lacres) {
        markAsChanged("LACRES", lacres);
        this.lacres = lacres;
   }

   public String getLibConf() {
        return libConf;
   }

   public void setLibConf(String libConf) {
        markAsChanged("LIBCONF", libConf);
        this.libConf = libConf;
   }

   public String getLibPendente() {
        return libPendente;
   }

   public void setLibPendente(String libPendente) {
        markAsChanged("LIBPENDENTE", libPendente);
        this.libPendente = libPendente;
   }

   public String getLocalColeta() {
        return localColeta;
   }

   public void setLocalColeta(String localColeta) {
        markAsChanged("LOCALCOLETA", localColeta);
        this.localColeta = localColeta;
   }

   public String getLocalEntrega() {
        return localEntrega;
   }

   public void setLocalEntrega(String localEntrega) {
        markAsChanged("LOCALENTREGA", localEntrega);
        this.localEntrega = localEntrega;
   }

   public BigDecimal getM3() {
        return m3;
   }

   public void setM3(BigDecimal m3) {
        markAsChanged("M3", m3);
        this.m3 = m3;
   }

   public BigDecimal getM3AEntregar() {
        return m3AEntregar;
   }

   public void setM3AEntregar(BigDecimal m3AEntregar) {
        markAsChanged("M3AENTREGAR", m3AEntregar);
        this.m3AEntregar = m3AEntregar;
   }

   public String getMarca() {
        return marca;
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
        this.marca = marca;
   }

   public String getModeloNfDes() {
        return modeloNfDes;
   }

   public void setModeloNfDes(String modeloNfDes) {
        markAsChanged("MODELONFDES", modeloNfDes);
        this.modeloNfDes = modeloNfDes;
   }

   public String getNaturezaOperDes() {
        return naturezaOperDes;
   }

   public void setNaturezaOperDes(String naturezaOperDes) {
        markAsChanged("NATUREZAOPERDES", naturezaOperDes);
        this.naturezaOperDes = naturezaOperDes;
   }

   public String getNotasCf() {
        return notasCf;
   }

   public void setNotasCf(String notasCf) {
        markAsChanged("NOTASCF", notasCf);
        this.notasCf = notasCf;
   }

   public BigDecimal getNroCaixa() {
        return nroCaixa;
   }

   public void setNroCaixa(BigDecimal nroCaixa) {
        markAsChanged("NROCAIXA", nroCaixa);
        this.nroCaixa = nroCaixa;
   }

   public BigDecimal getNroRedz() {
        return nroRedz;
   }

   public void setNroRedz(BigDecimal nroRedz) {
        markAsChanged("NROREDZ", nroRedz);
        this.nroRedz = nroRedz;
   }

   public BigDecimal getNuConfAtual() {
        return nuConfAtual;
   }

   public void setNuConfAtual(BigDecimal nuConfAtual) {
        markAsChanged("NUCONFATUAL", nuConfAtual);
        this.nuConfAtual = nuConfAtual;
   }

   public BigDecimal getNuLotEnfe() {
        return nuLotEnfe;
   }

   public void setNuLotEnfe(BigDecimal nuLotEnfe) {
        markAsChanged("NULOTENFE", nuLotEnfe);
        this.nuLotEnfe = nuLotEnfe;
   }

   public BigDecimal getNuLotEnfse() {
        return nuLotEnfse;
   }

   public void setNuLotEnfse(BigDecimal nuLotEnfse) {
        markAsChanged("NULOTENFSE", nuLotEnfse);
        this.nuLotEnfse = nuLotEnfse;
   }

   public BigDecimal getNumAleatorio() {
        return numAleatorio;
   }

   public void setNumAleatorio(BigDecimal numAleatorio) {
        markAsChanged("NUMALEATORIO", numAleatorio);
        this.numAleatorio = numAleatorio;
   }

   public BigDecimal getNumCf() {
        return numCf;
   }

   public void setNumCf(BigDecimal numCf) {
        markAsChanged("NUMCF", numCf);
        this.numCf = numCf;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
        this.numContrato = numContrato;
   }

   public BigDecimal getNumCotacao() {
        return numCotacao;
   }

   public void setNumCotacao(BigDecimal numCotacao) {
        markAsChanged("NUMCOTACAO", numCotacao);
        this.numCotacao = numCotacao;
   }

   public String getNumeracaoVolumes() {
        return numeracaoVolumes;
   }

   public void setNumeracaoVolumes(String numeracaoVolumes) {
        markAsChanged("NUMERACAOVOLUMES", numeracaoVolumes);
        this.numeracaoVolumes = numeracaoVolumes;
   }

   public String getNumNfse() {
        return numNfse;
   }

   public void setNumNfse(String numNfse) {
        markAsChanged("NUMNFSE", numNfse);
        this.numNfse = numNfse;
   }

   public BigDecimal getNumNota() {
        return numNota;
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
        this.numNota = numNota;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
        this.numOs = numOs;
   }

   public String getNumPedido2() {
        return numPedido2;
   }

   public void setNumPedido2(String numPedido2) {
        markAsChanged("NUMPEDIDO2", numPedido2);
        this.numPedido2 = numPedido2;
   }

   public String getNumProtoc() {
        return numProtoc;
   }

   public void setNumProtoc(String numProtoc) {
        markAsChanged("NUMPROTOC", numProtoc);
        this.numProtoc = numProtoc;
   }

   public String getNumRegDpec() {
        return numRegDpec;
   }

   public void setNumRegDpec(String numRegDpec) {
        markAsChanged("NUMREGDPEC", numRegDpec);
        this.numRegDpec = numRegDpec;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getNuNotaPedFret() {
        return nuNotaPedFret;
   }

   public void setNuNotaPedFret(BigDecimal nuNotaPedFret) {
        markAsChanged("NUNOTAPEDFRET", nuNotaPedFret);
        this.nuNotaPedFret = nuNotaPedFret;
   }

   public BigDecimal getNuPca() {
        return nuPca;
   }

   public void setNuPca(BigDecimal nuPca) {
        markAsChanged("NUPCA", nuPca);
        this.nuPca = nuPca;
   }

   public BigDecimal getNuRd8() {
        return nuRd8;
   }

   public void setNuRd8(BigDecimal nuRd8) {
        markAsChanged("NURD8", nuRd8);
        this.nuRd8 = nuRd8;
   }

   public BigDecimal getNuRem() {
        return nuRem;
   }

   public void setNuRem(BigDecimal nuRem) {
        markAsChanged("NUREM", nuRem);
        this.nuRem = nuRem;
   }

   public BigDecimal getNuTransf() {
        return nuTransf;
   }

   public void setNuTransf(BigDecimal nuTransf) {
        markAsChanged("NUTRANSF", nuTransf);
        this.nuTransf = nuTransf;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public String getObservacaoAc() {
        return observacaoAc;
   }

   public void setObservacaoAc(String observacaoAc) {
        markAsChanged("OBSERVACAOAC", observacaoAc);
        this.observacaoAc = observacaoAc;
   }

   public BigDecimal getOccN48() {
        return occN48;
   }

   public void setOccN48(BigDecimal occN48) {
        markAsChanged("OCCN48", occN48);
        this.occN48 = occN48;
   }

   public BigDecimal getOrdemCarga() {
        return ordemCarga;
   }

   public void setOrdemCarga(BigDecimal ordemCarga) {
        markAsChanged("ORDEMCARGA", ordemCarga);
        this.ordemCarga = ordemCarga;
   }

   public String getPedidoImpresso() {
        return pedidoImpresso;
   }

   public void setPedidoImpresso(String pedidoImpresso) {
        markAsChanged("PEDIDOIMPRESSO", pedidoImpresso);
        this.pedidoImpresso = pedidoImpresso;
   }

   public String getPendente() {
        return pendente;
   }

   public void setPendente(String pendente) {
        markAsChanged("PENDENTE", pendente);
        this.pendente = pendente;
   }

   public BigDecimal getPercDesc() {
        return percDesc;
   }

   public void setPercDesc(BigDecimal percDesc) {
        markAsChanged("PERCDESC", percDesc);
        this.percDesc = percDesc;
   }

   public BigDecimal getPeso() {
        return peso;
   }

   public void setPeso(BigDecimal peso) {
        markAsChanged("PESO", peso);
        this.peso = peso;
   }

   public BigDecimal getPesoAEntregar() {
        return pesoAEntregar;
   }

   public void setPesoAEntregar(BigDecimal pesoAEntregar) {
        markAsChanged("PESOAENTREGAR", pesoAEntregar);
        this.pesoAEntregar = pesoAEntregar;
   }

   public BigDecimal getPesoBruto() {
        return pesoBruto;
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
        this.pesoBruto = pesoBruto;
   }

   public BigDecimal getPesoBrutoItens() {
        return pesoBrutoItens;
   }

   public void setPesoBrutoItens(BigDecimal pesoBrutoItens) {
        markAsChanged("PESOBRUTOITENS", pesoBrutoItens);
        this.pesoBrutoItens = pesoBrutoItens;
   }

   public String getPlaca() {
        return placa;
   }

   public void setPlaca(String placa) {
        markAsChanged("PLACA", placa);
        this.placa = placa;
   }

   public BigDecimal getQtdVol() {
        return qtdVol;
   }

   public void setQtdVol(BigDecimal qtdVol) {
        markAsChanged("QTDVOL", qtdVol);
        this.qtdVol = qtdVol;
   }

   public String getRateado() {
        return rateado;
   }

   public void setRateado(String rateado) {
        markAsChanged("RATEADO", rateado);
        this.rateado = rateado;
   }

   public String getRetornadoAc() {
        return retornadoAc;
   }

   public void setRetornadoAc(String retornadoAc) {
        markAsChanged("RETORNADOAC", retornadoAc);
        this.retornadoAc = retornadoAc;
   }

   public BigDecimal getSeqCarga() {
        return seqCarga;
   }

   public void setSeqCarga(BigDecimal seqCarga) {
        markAsChanged("SEQCARGA", seqCarga);
        this.seqCarga = seqCarga;
   }

   public BigDecimal getCodParcTransp() {
        return codParcTransp;
   }

   public void setCodParcTransp(BigDecimal codParcTransp) {
        markAsChanged("CODPARCTRANSP", codParcTransp);
        this.codParcTransp = codParcTransp;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
        this.codProj = codProj;
   }

   public String getSerieNfDes() {
        return serieNfDes;
   }

   public void setSerieNfDes(String serieNfDes) {
        markAsChanged("SERIENFDES", serieNfDes);
        this.serieNfDes = serieNfDes;
   }

   public String getSerieNota() {
        return serieNota;
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
        this.serieNota = serieNota;
   }

   public BigDecimal getCodSite() {
        return codSite;
   }

   public void setCodSite(BigDecimal codSite) {
        markAsChanged("CODSITE", codSite);
        this.codSite = codSite;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
        this.codTipOper = codTipOper;
   }

   public BigDecimal getAliqIrf() {
        return aliqIrf;
   }

   public void setAliqIrf(BigDecimal aliqIrf) {
        markAsChanged("ALIQIRF", aliqIrf);
        this.aliqIrf = aliqIrf;
   }

   public String getAntt() {
        return antt;
   }

   public void setAntt(String antt) {
        markAsChanged("ANTT", antt);
        this.antt = antt;
   }

   public String getAprovado() {
        return aprovado;
   }

   public void setAprovado(String aprovado) {
        markAsChanged("APROVADO", aprovado);
        this.aprovado = aprovado;
   }

   public BigDecimal getBaseCofins() {
        return baseCofins;
   }

   public void setBaseCofins(BigDecimal baseCofins) {
        markAsChanged("BASECOFINS", baseCofins);
        this.baseCofins = baseCofins;
   }

   public BigDecimal getBaseCofinsSt() {
        return baseCofinsSt;
   }

   public void setBaseCofinsSt(BigDecimal baseCofinsSt) {
        markAsChanged("BASECOFINSST", baseCofinsSt);
        this.baseCofinsSt = baseCofinsSt;
   }

   public BigDecimal getBaseIcms() {
        return baseIcms;
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        markAsChanged("BASEICMS", baseIcms);
        this.baseIcms = baseIcms;
   }

   public BigDecimal getBaseIcmsFrete() {
        return baseIcmsFrete;
   }

   public void setBaseIcmsFrete(BigDecimal baseIcmsFrete) {
        markAsChanged("BASEICMSFRETE", baseIcmsFrete);
        this.baseIcmsFrete = baseIcmsFrete;
   }

   public BigDecimal getBaseInss() {
        return baseInss;
   }

   public void setBaseInss(BigDecimal baseInss) {
        markAsChanged("BASEINSS", baseInss);
        this.baseInss = baseInss;
   }

   public BigDecimal getBaseIpi() {
        return baseIpi;
   }

   public void setBaseIpi(BigDecimal baseIpi) {
        markAsChanged("BASEIPI", baseIpi);
        this.baseIpi = baseIpi;
   }

   public BigDecimal getBaseIrf() {
        return baseIrf;
   }

   public void setBaseIrf(BigDecimal baseIrf) {
        markAsChanged("BASEIRF", baseIrf);
        this.baseIrf = baseIrf;
   }

   public BigDecimal getBaseIss() {
        return baseIss;
   }

   public void setBaseIss(BigDecimal baseIss) {
        markAsChanged("BASEISS", baseIss);
        this.baseIss = baseIss;
   }

   public BigDecimal getBasePis() {
        return basePis;
   }

   public void setBasePis(BigDecimal basePis) {
        markAsChanged("BASEPIS", basePis);
        this.basePis = basePis;
   }

   public BigDecimal getBasePisSt() {
        return basePisSt;
   }

   public void setBasePisSt(BigDecimal basePisSt) {
        markAsChanged("BASEPISST", basePisSt);
        this.basePisSt = basePisSt;
   }

   public BigDecimal getBaseSubstit() {
        return baseSubstit;
   }

   public void setBaseSubstit(BigDecimal baseSubstit) {
        markAsChanged("BASESUBSTIT", baseSubstit);
        this.baseSubstit = baseSubstit;
   }

   public BigDecimal getBaseSubstSemRed() {
        return baseSubstSemRed;
   }

   public void setBaseSubstSemRed(BigDecimal baseSubstSemRed) {
        markAsChanged("BASESUBSTSEMRED", baseSubstSemRed);
        this.baseSubstSemRed = baseSubstSemRed;
   }

   public String getChaveNfe() {
        return chaveNfe;
   }

   public void setChaveNfe(String chaveNfe) {
        markAsChanged("CHAVENFE", chaveNfe);
        this.chaveNfe = chaveNfe;
   }

   public String getCifFob() {
        return cifFob;
   }

   public void setCifFob(String cifFob) {
        markAsChanged("CIF_FOB", cifFob);
        this.cifFob = cifFob;
   }

   public BigDecimal getCodCc() {
        return codCc;
   }

   public void setCodCc(BigDecimal codCc) {
        markAsChanged("CODCC", codCc);
        this.codCc = codCc;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
        this.codCencus = codCencus;
   }

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
        this.codCid = codCid;
   }

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
        this.codContato = codContato;
   }

   public BigDecimal getCodDoca() {
        return codDoca;
   }

   public void setCodDoca(BigDecimal codDoca) {
        markAsChanged("CODDOCA", codDoca);
        this.codDoca = codDoca;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEmpFunc() {
        return codEmpFunc;
   }

   public void setCodEmpFunc(BigDecimal codEmpFunc) {
        markAsChanged("CODEMPFUNC", codEmpFunc);
        this.codEmpFunc = codEmpFunc;
   }

   public BigDecimal getCodEmpNegoc() {
        return codEmpNegoc;
   }

   public void setCodEmpNegoc(BigDecimal codEmpNegoc) {
        markAsChanged("CODEMPNEGOC", codEmpNegoc);
        this.codEmpNegoc = codEmpNegoc;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
        this.codFunc = codFunc;
   }

   public String getCodGrupoTensao() {
        return codGrupoTensao;
   }

   public void setCodGrupoTensao(String codGrupoTensao) {
        markAsChanged("CODGRUPOTENSAO", codGrupoTensao);
        this.codGrupoTensao = codGrupoTensao;
   }

   public BigDecimal getCodHistAc() {
        return codHistAc;
   }

   public void setCodHistAc(BigDecimal codHistAc) {
        markAsChanged("CODHISTAC", codHistAc);
        this.codHistAc = codHistAc;
   }

   public BigDecimal getCodLocalOrig() {
        return codLocalOrig;
   }

   public void setCodLocalOrig(BigDecimal codLocalOrig) {
        markAsChanged("CODLOCALORIG", codLocalOrig);
        this.codLocalOrig = codLocalOrig;
   }

   public BigDecimal getCodMaq() {
        return codMaq;
   }

   public void setCodMaq(BigDecimal codMaq) {
        markAsChanged("CODMAQ", codMaq);
        this.codMaq = codMaq;
   }

   public BigDecimal getCodModDocNota() {
        return codModDocNota;
   }

   public void setCodModDocNota(BigDecimal codModDocNota) {
        markAsChanged("CODMODDOCNOTA", codModDocNota);
        this.codModDocNota = codModDocNota;
   }

   public BigDecimal getTpLigacao() {
        return tpLigacao;
   }

   public void setTpLigacao(BigDecimal tpLigacao) {
        markAsChanged("TPLIGACAO", tpLigacao);
        this.tpLigacao = tpLigacao;
   }

   public BigDecimal getTroco() {
        return troco;
   }

   public void setTroco(BigDecimal troco) {
        markAsChanged("TROCO", troco);
        this.troco = troco;
   }

   public BigDecimal getUfVeiculo() {
        return ufVeiculo;
   }

   public void setUfVeiculo(BigDecimal ufVeiculo) {
        markAsChanged("UFVEICULO", ufVeiculo);
        this.ufVeiculo = ufVeiculo;
   }

   public Timestamp getVencFrete() {
        return vencFrete;
   }

   public void setVencFrete(Timestamp vencFrete) {
        markAsChanged("VENCFRETE", vencFrete);
        this.vencFrete = vencFrete;
   }

   public Timestamp getVencIpi() {
        return vencIpi;
   }

   public void setVencIpi(Timestamp vencIpi) {
        markAsChanged("VENCIPI", vencIpi);
        this.vencIpi = vencIpi;
   }

   public BigDecimal getVlrCofins() {
        return vlrCofins;
   }

   public void setVlrCofins(BigDecimal vlrCofins) {
        markAsChanged("VLRCOFINS", vlrCofins);
        this.vlrCofins = vlrCofins;
   }

   public BigDecimal getVlrCofinsSt() {
        return vlrCofinsSt;
   }

   public void setVlrCofinsSt(BigDecimal vlrCofinsSt) {
        markAsChanged("VLRCOFINSST", vlrCofinsSt);
        this.vlrCofinsSt = vlrCofinsSt;
   }

   public BigDecimal getVlrCompensacao() {
        return vlrCompensacao;
   }

   public void setVlrCompensacao(BigDecimal vlrCompensacao) {
        markAsChanged("VLRCOMPENSACAO", vlrCompensacao);
        this.vlrCompensacao = vlrCompensacao;
   }

   public BigDecimal getVlrDescServ() {
        return vlrDescServ;
   }

   public void setVlrDescServ(BigDecimal vlrDescServ) {
        markAsChanged("VLRDESCSERV", vlrDescServ);
        this.vlrDescServ = vlrDescServ;
   }

   public BigDecimal getVlrDescTot() {
        return vlrDescTot;
   }

   public void setVlrDescTot(BigDecimal vlrDescTot) {
        markAsChanged("VLRDESCTOT", vlrDescTot);
        this.vlrDescTot = vlrDescTot;
   }

   public BigDecimal getVlrDescTotItem() {
        return vlrDescTotItem;
   }

   public void setVlrDescTotItem(BigDecimal vlrDescTotItem) {
        markAsChanged("VLRDESCTOTITEM", vlrDescTotItem);
        this.vlrDescTotItem = vlrDescTotItem;
   }

   public BigDecimal getVlrDestaque() {
        return vlrDestaque;
   }

   public void setVlrDestaque(BigDecimal vlrDestaque) {
        markAsChanged("VLRDESTAQUE", vlrDestaque);
        this.vlrDestaque = vlrDestaque;
   }

   public BigDecimal getVlrEmb() {
        return vlrEmb;
   }

   public void setVlrEmb(BigDecimal vlrEmb) {
        markAsChanged("VLREMB", vlrEmb);
        this.vlrEmb = vlrEmb;
   }

   public BigDecimal getVlrFrete() {
        return vlrFrete;
   }

   public void setVlrFrete(BigDecimal vlrFrete) {
        markAsChanged("VLRFRETE", vlrFrete);
        this.vlrFrete = vlrFrete;
   }

   public BigDecimal getVlrFreteCpl() {
        return vlrFreteCpl;
   }

   public void setVlrFreteCpl(BigDecimal vlrFreteCpl) {
        markAsChanged("VLRFRETECPL", vlrFreteCpl);
        this.vlrFreteCpl = vlrFreteCpl;
   }

   public BigDecimal getVlrIcms() {
        return vlrIcms;
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
        this.vlrIcms = vlrIcms;
   }

   public BigDecimal getVlrIcmsEmb() {
        return vlrIcmsEmb;
   }

   public void setVlrIcmsEmb(BigDecimal vlrIcmsEmb) {
        markAsChanged("VLRICMSEMB", vlrIcmsEmb);
        this.vlrIcmsEmb = vlrIcmsEmb;
   }

   public BigDecimal getVlrIcmsSeg() {
        return vlrIcmsSeg;
   }

   public void setVlrIcmsSeg(BigDecimal vlrIcmsSeg) {
        markAsChanged("VLRICMSSEG", vlrIcmsSeg);
        this.vlrIcmsSeg = vlrIcmsSeg;
   }

   public BigDecimal getVlrIndeniz() {
        return vlrIndeniz;
   }

   public void setVlrIndeniz(BigDecimal vlrIndeniz) {
        markAsChanged("VLRINDENIZ", vlrIndeniz);
        this.vlrIndeniz = vlrIndeniz;
   }

   public BigDecimal getVlrIndenizDist() {
        return vlrIndenizDist;
   }

   public void setVlrIndenizDist(BigDecimal vlrIndenizDist) {
        markAsChanged("VLRINDENIZDIST", vlrIndenizDist);
        this.vlrIndenizDist = vlrIndenizDist;
   }

   public BigDecimal getVlrInss() {
        return vlrInss;
   }

   public void setVlrInss(BigDecimal vlrInss) {
        markAsChanged("VLRINSS", vlrInss);
        this.vlrInss = vlrInss;
   }

   public BigDecimal getVlrIpi() {
        return vlrIpi;
   }

   public void setVlrIpi(BigDecimal vlrIpi) {
        markAsChanged("VLRIPI", vlrIpi);
        this.vlrIpi = vlrIpi;
   }

   public BigDecimal getVlrIrf() {
        return vlrIrf;
   }

   public void setVlrIrf(BigDecimal vlrIrf) {
        markAsChanged("VLRIRF", vlrIrf);
        this.vlrIrf = vlrIrf;
   }

   public BigDecimal getVlrIss() {
        return vlrIss;
   }

   public void setVlrIss(BigDecimal vlrIss) {
        markAsChanged("VLRISS", vlrIss);
        this.vlrIss = vlrIss;
   }

   public BigDecimal getVlrJuro() {
        return vlrJuro;
   }

   public void setVlrJuro(BigDecimal vlrJuro) {
        markAsChanged("VLRJURO", vlrJuro);
        this.vlrJuro = vlrJuro;
   }

   public BigDecimal getVlrJuroDist() {
        return vlrJuroDist;
   }

   public void setVlrJuroDist(BigDecimal vlrJuroDist) {
        markAsChanged("VLRJURODIST", vlrJuroDist);
        this.vlrJuroDist = vlrJuroDist;
   }

   public BigDecimal getVlrMercadoria() {
        return vlrMercadoria;
   }

   public void setVlrMercadoria(BigDecimal vlrMercadoria) {
        markAsChanged("VLRMERCADORIA", vlrMercadoria);
        this.vlrMercadoria = vlrMercadoria;
   }

   public BigDecimal getVlrMoeda() {
        return vlrMoeda;
   }

   public void setVlrMoeda(BigDecimal vlrMoeda) {
        markAsChanged("VLRMOEDA", vlrMoeda);
        this.vlrMoeda = vlrMoeda;
   }

   public BigDecimal getVlrNota() {
        return vlrNota;
   }

   public void setVlrNota(BigDecimal vlrNota) {
        markAsChanged("VLRNOTA", vlrNota);
        this.vlrNota = vlrNota;
   }

   public BigDecimal getVlrOutros() {
        return vlrOutros;
   }

   public void setVlrOutros(BigDecimal vlrOutros) {
        markAsChanged("VLROUTROS", vlrOutros);
        this.vlrOutros = vlrOutros;
   }

   public BigDecimal getVlrPis() {
        return vlrPis;
   }

   public void setVlrPis(BigDecimal vlrPis) {
        markAsChanged("VLRPIS", vlrPis);
        this.vlrPis = vlrPis;
   }

   public BigDecimal getVlrPisSt() {
        return vlrPisSt;
   }

   public void setVlrPisSt(BigDecimal vlrPisSt) {
        markAsChanged("VLRPISST", vlrPisSt);
        this.vlrPisSt = vlrPisSt;
   }

   public BigDecimal getVlrRepRedTot() {
        return vlrRepRedTot;
   }

   public void setVlrRepRedTot(BigDecimal vlrRepRedTot) {
        markAsChanged("VLRREPREDTOT", vlrRepRedTot);
        this.vlrRepRedTot = vlrRepRedTot;
   }

   public BigDecimal getVlrRoyalt() {
        return vlrRoyalt;
   }

   public void setVlrRoyalt(BigDecimal vlrRoyalt) {
        markAsChanged("VLRROYALT", vlrRoyalt);
        this.vlrRoyalt = vlrRoyalt;
   }

   public BigDecimal getVlrSeg() {
        return vlrSeg;
   }

   public void setVlrSeg(BigDecimal vlrSeg) {
        markAsChanged("VLRSEG", vlrSeg);
        this.vlrSeg = vlrSeg;
   }

   public BigDecimal getVlrStExtraNotaTot() {
        return vlrStExtraNotaTot;
   }

   public void setVlrStExtraNotaTot(BigDecimal vlrStExtraNotaTot) {
        markAsChanged("VLRSTEXTRANOTATOT", vlrStExtraNotaTot);
        this.vlrStExtraNotaTot = vlrStExtraNotaTot;
   }

   public BigDecimal getVlrSubst() {
        return vlrSubst;
   }

   public void setVlrSubst(BigDecimal vlrSubst) {
        markAsChanged("VLRSUBST", vlrSubst);
        this.vlrSubst = vlrSubst;
   }

   public BigDecimal getVlrVendor() {
        return vlrVendor;
   }

   public void setVlrVendor(BigDecimal vlrVendor) {
        markAsChanged("VLRVENDOR", vlrVendor);
        this.vlrVendor = vlrVendor;
   }

   public String getVolume() {
        return volume;
   }

   public void setVolume(String volume) {
        markAsChanged("VOLUME", volume);
        this.volume = volume;
   }

   public String getTipMov() {
        return tipMov;
   }

   public void setTipMov(String tipMov) {
        markAsChanged("TIPMOV", tipMov);
        this.tipMov = tipMov;
   }

   public String getTipNotaPmb() {
        return tipNotaPmb;
   }

   public void setTipNotaPmb(String tipNotaPmb) {
        markAsChanged("TIPNOTAPMB", tipNotaPmb);
        this.tipNotaPmb = tipNotaPmb;
   }

   public BigDecimal getTipOptAgjNfe() {
        return tipOptAgjNfe;
   }

   public void setTipOptAgjNfe(BigDecimal tipOptAgjNfe) {
        markAsChanged("TIPOPTAGJNFE", tipOptAgjNfe);
        this.tipOptAgjNfe = tipOptAgjNfe;
   }

   public BigDecimal getTotalCustoProd() {
        return totalCustoProd;
   }

   public void setTotalCustoProd(BigDecimal totalCustoProd) {
        markAsChanged("TOTALCUSTOPROD", totalCustoProd);
        this.totalCustoProd = totalCustoProd;
   }

   public BigDecimal getTotalCustoServ() {
        return totalCustoServ;
   }

   public void setTotalCustoServ(BigDecimal totalCustoServ) {
        markAsChanged("TOTALCUSTOSERV", totalCustoServ);
        this.totalCustoServ = totalCustoServ;
   }

   public BigDecimal getTotDispDesc() {
        return totDispDesc;
   }

   public void setTotDispDesc(BigDecimal totDispDesc) {
        markAsChanged("TOTDISPDESC", totDispDesc);
        this.totDispDesc = totDispDesc;
   }

   public String getTpAmbNfe() {
        return tpAmbNfe;
   }

   public void setTpAmbNfe(String tpAmbNfe) {
        markAsChanged("TPAMBNFE", tpAmbNfe);
        this.tpAmbNfe = tpAmbNfe;
   }

   public BigDecimal getTpAssinante() {
        return tpAssinante;
   }

   public void setTpAssinante(BigDecimal tpAssinante) {
        markAsChanged("TPASSINANTE", tpAssinante);
        this.tpAssinante = tpAssinante;
   }

   public BigDecimal getTpEmisNfe() {
        return tpEmisNfe;
   }

   public void setTpEmisNfe(BigDecimal tpEmisNfe) {
        markAsChanged("TPEMISNFE", tpEmisNfe);
        this.tpEmisNfe = tpEmisNfe;
   }

   public BigDecimal getTpEmisNfse() {
        return tpEmisNfse;
   }

   public void setTpEmisNfse(BigDecimal tpEmisNfse) {
        markAsChanged("TPEMISNFSE", tpEmisNfse);
        this.tpEmisNfse = tpEmisNfse;
   }

   public BigDecimal getCodMoeda() {
        return codMoeda;
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
        this.codMoeda = codMoeda;
   }

   public BigDecimal getCodMotorista() {
        return codMotorista;
   }

   public void setCodMotorista(BigDecimal codMotorista) {
        markAsChanged("CODMOTORISTA", codMotorista);
        this.codMotorista = codMotorista;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
        this.codNat = codNat;
   }

   public String getModEntrega() {
        return modEntrega;
   }

   public void setModEntrega(String modEntrega) {
        markAsChanged("MODENTREGA", modEntrega);
        this.modEntrega = modEntrega;
   }

   public String getNotaEmpenho() {
        return notaEmpenho;
   }

   public void setNotaEmpenho(String notaEmpenho) {
        markAsChanged("NOTAEMPENHO", notaEmpenho);
        this.notaEmpenho = notaEmpenho;
   }

   public BigDecimal getVlrFreteTotal() {
        return vlrFreteTotal;
   }

   public void setVlrFreteTotal(BigDecimal vlrFreteTotal) {
        markAsChanged("VLRFRETETOTAL", vlrFreteTotal);
        this.vlrFreteTotal = vlrFreteTotal;
   }

   public BigDecimal getCodParcTranspFinal() {
        return codParcTranspFinal;
   }

   public void setCodParcTranspFinal(BigDecimal codParcTranspFinal) {
        markAsChanged("CODPARCTRANSPFINAL", codParcTranspFinal);
        this.codParcTranspFinal = codParcTranspFinal;
   }

   public BigDecimal getSituacaoWms() {
        return situacaoWms;
   }

   public void setSituacaoWms(BigDecimal situacaoWms) {
        markAsChanged("SITUACAOWMS", situacaoWms);
        this.situacaoWms = situacaoWms;
   }

   public String getViaTransp() {
        return viaTransp;
   }

   public void setViaTransp(String viaTransp) {
        markAsChanged("VIATRANSP", viaTransp);
        this.viaTransp = viaTransp;
   }

   public String getUfAdquirente() {
        return ufAdquirente;
   }

   public void setUfAdquirente(String ufAdquirente) {
        markAsChanged("UFADQUIRENTE", ufAdquirente);
        this.ufAdquirente = ufAdquirente;
   }

   public String getCnpjAdquirente() {
        return cnpjAdquirente;
   }

   public void setCnpjAdquirente(String cnpjAdquirente) {
        markAsChanged("CNPJADQUIRENTE", cnpjAdquirente);
        this.cnpjAdquirente = cnpjAdquirente;
   }

   public String getTipProcImp() {
        return tipProcImp;
   }

   public void setTipProcImp(String tipProcImp) {
        markAsChanged("TIPPROCIMP", tipProcImp);
        this.tipProcImp = tipProcImp;
   }

   public String getProdPred() {
        return prodPred;
   }

   public void setProdPred(String prodPred) {
        markAsChanged("PRODPRED", prodPred);
        this.prodPred = prodPred;
   }

   public BigDecimal getPesoLiqItens() {
        return pesoLiqItens;
   }

   public void setPesoLiqItens(BigDecimal pesoLiqItens) {
        markAsChanged("PESOLIQITENS", pesoLiqItens);
        this.pesoLiqItens = pesoLiqItens;
   }

   public BigDecimal getVlrDescTotItemMoe() {
        return vlrDescTotItemMoe;
   }

   public void setVlrDescTotItemMoe(BigDecimal vlrDescTotItemMoe) {
        markAsChanged("VLRDESCTOTITEMMOE", vlrDescTotItemMoe);
        this.vlrDescTotItemMoe = vlrDescTotItemMoe;
   }

   public BigDecimal getVlrTotLiqItemMoe() {
        return vlrTotLiqItemMoe;
   }

   public void setVlrTotLiqItemMoe(BigDecimal vlrTotLiqItemMoe) {
        markAsChanged("VLRTOTLIQITEMMOE", vlrTotLiqItemMoe);
        this.vlrTotLiqItemMoe = vlrTotLiqItemMoe;
   }

   public String getCteLotacao() {
        return cteLotacao;
   }

   public void setCteLotacao(String cteLotacao) {
        markAsChanged("CTELOTACAO", cteLotacao);
        this.cteLotacao = cteLotacao;
   }

   public String getChaveCte() {
        return chaveCte;
   }

   public void setChaveCte(String chaveCte) {
        markAsChanged("CHAVECTE", chaveCte);
        this.chaveCte = chaveCte;
   }

   public BigDecimal getReboque3() {
        return reboque3;
   }

   public void setReboque3(BigDecimal reboque3) {
        markAsChanged("REBOQUE3", reboque3);
        this.reboque3 = reboque3;
   }

   public String getSituacaoCte() {
        return situacaoCte;
   }

   public void setSituacaoCte(String situacaoCte) {
        markAsChanged("SITUACAOCTE", situacaoCte);
        this.situacaoCte = situacaoCte;
   }

   public String getLotacao() {
        return lotacao;
   }

   public void setLotacao(String lotacao) {
        markAsChanged("LOTACAO", lotacao);
        this.lotacao = lotacao;
   }

   public BigDecimal getTpEmisCte() {
        return tpEmisCte;
   }

   public void setTpEmisCte(BigDecimal tpEmisCte) {
        markAsChanged("TPEMISCTE", tpEmisCte);
        this.tpEmisCte = tpEmisCte;
   }

   public String getTpAmbCte() {
        return tpAmbCte;
   }

   public void setTpAmbCte(String tpAmbCte) {
        markAsChanged("TPAMBCTE", tpAmbCte);
        this.tpAmbCte = tpAmbCte;
   }

   public BigDecimal getNumAleatorioCte() {
        return numAleatorioCte;
   }

   public void setNumAleatorioCte(BigDecimal numAleatorioCte) {
        markAsChanged("NUMALEATORIOCTE", numAleatorioCte);
        this.numAleatorioCte = numAleatorioCte;
   }

   public String getStatusCte() {
        return statusCte;
   }

   public void setStatusCte(String statusCte) {
        markAsChanged("STATUSCTE", statusCte);
        this.statusCte = statusCte;
   }

   public Timestamp getDtDeclara() {
        return dtDeclara;
   }

   public void setDtDeclara(Timestamp dtDeclara) {
        markAsChanged("DTDECLARA", dtDeclara);
        this.dtDeclara = dtDeclara;
   }

   public BigDecimal getReboque1() {
        return reboque1;
   }

   public void setReboque1(BigDecimal reboque1) {
        markAsChanged("REBOQUE1", reboque1);
        this.reboque1 = reboque1;
   }

   public BigDecimal getReboque2() {
        return reboque2;
   }

   public void setReboque2(BigDecimal reboque2) {
        markAsChanged("REBOQUE2", reboque2);
        this.reboque2 = reboque2;
   }

   public String getCpfCnpjAdquirente() {
        return cpfCnpjAdquirente;
   }

   public void setCpfCnpjAdquirente(String cpfCnpjAdquirente) {
        markAsChanged("CPFCNPJADQUIRENTE", cpfCnpjAdquirente);
        this.cpfCnpjAdquirente = cpfCnpjAdquirente;
   }

   public Timestamp getDtEntSaiInfo() {
        return dtEntSaiInfo;
   }

   public void setDtEntSaiInfo(Timestamp dtEntSaiInfo) {
        markAsChanged("DTENTSAIINFO", dtEntSaiInfo);
        this.dtEntSaiInfo = dtEntSaiInfo;
   }

   public String getIndPresNfce() {
        return indPresNfce;
   }

   public void setIndPresNfce(String indPresNfce) {
        markAsChanged("INDPRESNFCE", indPresNfce);
        this.indPresNfce = indPresNfce;
   }

   public String getLocEmbarq() {
        return locEmbarq;
   }

   public void setLocEmbarq(String locEmbarq) {
        markAsChanged("LOCEMBARQ", locEmbarq);
        this.locEmbarq = locEmbarq;
   }

   public String getNomeAdquirente() {
        return nomeAdquirente;
   }

   public void setNomeAdquirente(String nomeAdquirente) {
        markAsChanged("NOMEADQUIRENTE", nomeAdquirente);
        this.nomeAdquirente = nomeAdquirente;
   }

   public String getUfEmbarq() {
        return ufEmbarq;
   }

   public void setUfEmbarq(String ufEmbarq) {
        markAsChanged("UFEMBARQ", ufEmbarq);
        this.ufEmbarq = ufEmbarq;
   }

   public String getChaveNfse() {
        return chaveNfse;
   }

   public void setChaveNfse(String chaveNfse) {
        markAsChanged("CHAVENFSE", chaveNfse);
        this.chaveNfse = chaveNfse;
   }

   public String getProduetLoc() {
        return produetLoc;
   }

   public void setProduetLoc(String produetLoc) {
        markAsChanged("PRODUETLOC", produetLoc);
        this.produetLoc = produetLoc;
   }

   public Timestamp getDhEmissEpec() {
        return dhEmissEpec;
   }

   public void setDhEmissEpec(Timestamp dhEmissEpec) {
        markAsChanged("DHEMISSEPEC", dhEmissEpec);
        this.dhEmissEpec = dhEmissEpec;
   }

   public BigDecimal getNuNotaSub() {
        return nuNotaSub;
   }

   public void setNuNotaSub(BigDecimal nuNotaSub) {
        markAsChanged("NUNOTASUB", nuNotaSub);
        this.nuNotaSub = nuNotaSub;
   }

   public BigDecimal getTipServCte() {
        return tipServCte;
   }

   public void setTipServCte(BigDecimal tipServCte) {
        markAsChanged("TIPSERVCTE", tipServCte);
        this.tipServCte = tipServCte;
   }

   public String getTipoCte() {
        return tipoCte;
   }

   public void setTipoCte(String tipoCte) {
        markAsChanged("TIPOCTE", tipoCte);
        this.tipoCte = tipoCte;
   }

   public Timestamp getDtRemRet() {
        return dtRemRet;
   }

   public void setDtRemRet(Timestamp dtRemRet) {
        markAsChanged("DTREMRET", dtRemRet);
        this.dtRemRet = dtRemRet;
   }

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
        this.idIproc = idIproc;
   }

   public String getStatusWms() {
        return statusWms;
   }

   public void setStatusWms(String statusWms) {
        markAsChanged("STATUSWMS", statusWms);
        this.statusWms = statusWms;
   }

   public BigDecimal getVlrIcmsFcp() {
        return vlrIcmsFcp;
   }

   public void setVlrIcmsFcp(BigDecimal vlrIcmsFcp) {
        markAsChanged("VLRICMSFCP", vlrIcmsFcp);
        this.vlrIcmsFcp = vlrIcmsFcp;
   }

   public BigDecimal getVlrIcmsDifAlDest() {
        return vlrIcmsDifAlDest;
   }

   public void setVlrIcmsDifAlDest(BigDecimal vlrIcmsDifAlDest) {
        markAsChanged("VLRICMSDIFALDEST", vlrIcmsDifAlDest);
        this.vlrIcmsDifAlDest = vlrIcmsDifAlDest;
   }

   public BigDecimal getVlrIcmsDifAlRem() {
        return vlrIcmsDifAlRem;
   }

   public void setVlrIcmsDifAlRem(BigDecimal vlrIcmsDifAlRem) {
        markAsChanged("VLRICMSDIFALREM", vlrIcmsDifAlRem);
        this.vlrIcmsDifAlRem = vlrIcmsDifAlRem;
   }

   public BigDecimal getNuLoteCte() {
        return nuLoteCte;
   }

   public void setNuLoteCte(BigDecimal nuLoteCte) {
        markAsChanged("NULOTECTE", nuLoteCte);
        this.nuLoteCte = nuLoteCte;
   }

   public String getNumProtocCte() {
        return numProtocCte;
   }

   public void setNumProtocCte(String numProtocCte) {
        markAsChanged("NUMPROTOCCTE", numProtocCte);
        this.numProtocCte = numProtocCte;
   }

   public Timestamp getDhProtocCte() {
        return dhProtocCte;
   }

   public void setDhProtocCte(Timestamp dhProtocCte) {
        markAsChanged("DHPROTOCCTE", dhProtocCte);
        this.dhProtocCte = dhProtocCte;
   }

   public String getPesoLiquiManual() {
        return pesoLiquiManual;
   }

   public void setPesoLiquiManual(String pesoLiquiManual) {
        markAsChanged("PESOLIQUIMANUAL", pesoLiquiManual);
        this.pesoLiquiManual = pesoLiquiManual;
   }

   public String getPesoBrutoManual() {
        return pesoBrutoManual;
   }

   public void setPesoBrutoManual(String pesoBrutoManual) {
        markAsChanged("PESOBRUTOMANUAL", pesoBrutoManual);
        this.pesoBrutoManual = pesoBrutoManual;
   }

   public String getCodObra() {
        return codObra;
   }

   public void setCodObra(String codObra) {
        markAsChanged("CODOBRA", codObra);
        this.codObra = codObra;
   }

   public String getCodArt() {
        return codArt;
   }

   public void setCodArt(String codArt) {
        markAsChanged("CODART", codArt);
        this.codArt = codArt;
   }

   public BigDecimal getCodParcDescargaMdfe() {
        return codParcDescargaMdfe;
   }

   public void setCodParcDescargaMdfe(BigDecimal codParcDescargaMdfe) {
        markAsChanged("CODPARCDESCARGAMDFE", codParcDescargaMdfe);
        this.codParcDescargaMdfe = codParcDescargaMdfe;
   }

   public BigDecimal getCodGuf() {
        return codGuf;
   }

   public void setCodGuf(BigDecimal codGuf) {
        markAsChanged("CODGUF", codGuf);
        this.codGuf = codGuf;
   }

   public String getConfirmNotaFat() {
        return confirmNotaFat;
   }

   public void setConfirmNotaFat(String confirmNotaFat) {
        markAsChanged("CONFIRMNOTAFAT", confirmNotaFat);
        this.confirmNotaFat = confirmNotaFat;
   }

   public String getDirecaoViag() {
        return direcaoViag;
   }

   public void setDirecaoViag(String direcaoViag) {
        markAsChanged("DIRECAOVIAG", direcaoViag);
        this.direcaoViag = direcaoViag;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
        this.dtRef = dtRef;
   }

   public Timestamp getDtRef2() {
        return dtRef2;
   }

   public void setDtRef2(Timestamp dtRef2) {
        markAsChanged("DTREF2", dtRef2);
        this.dtRef2 = dtRef2;
   }

   public Timestamp getDtRef3() {
        return dtRef3;
   }

   public void setDtRef3(Timestamp dtRef3) {
        markAsChanged("DTREF3", dtRef3);
        this.dtRef3 = dtRef3;
   }

   public BigDecimal getFreteVlrPago() {
        return freteVlrPago;
   }

   public void setFreteVlrPago(BigDecimal freteVlrPago) {
        markAsChanged("FRETEVLRPAGO", freteVlrPago);
        this.freteVlrPago = freteVlrPago;
   }

   public String getIdBalsa01() {
        return idBalsa01;
   }

   public void setIdBalsa01(String idBalsa01) {
        markAsChanged("IDBALSA01", idBalsa01);
        this.idBalsa01 = idBalsa01;
   }

   public String getIdBalsa02() {
        return idBalsa02;
   }

   public void setIdBalsa02(String idBalsa02) {
        markAsChanged("IDBALSA02", idBalsa02);
        this.idBalsa02 = idBalsa02;
   }

   public String getIdBalsa03() {
        return idBalsa03;
   }

   public void setIdBalsa03(String idBalsa03) {
        markAsChanged("IDBALSA03", idBalsa03);
        this.idBalsa03 = idBalsa03;
   }

   public String getIdNavio() {
        return idNavio;
   }

   public void setIdNavio(String idNavio) {
        markAsChanged("IDNAVIO", idNavio);
        this.idNavio = idNavio;
   }

   public String getIrInNavio() {
        return irInNavio;
   }

   public void setIrInNavio(String irInNavio) {
        markAsChanged("IRINNAVIO", irInNavio);
        this.irInNavio = irInNavio;
   }

   public String getNfeDevRecusa() {
        return nfeDevRecusa;
   }

   public void setNfeDevRecusa(String nfeDevRecusa) {
        markAsChanged("NFEDEVRECUSA", nfeDevRecusa);
        this.nfeDevRecusa = nfeDevRecusa;
   }

   public BigDecimal getNuCfr() {
        return nuCfr;
   }

   public void setNuCfr(BigDecimal nuCfr) {
        markAsChanged("NUCFR", nuCfr);
        this.nuCfr = nuCfr;
   }

   public String getPermAlterCentral() {
        return permAlterCentral;
   }

   public void setPermAlterCentral(String permAlterCentral) {
        markAsChanged("PERMALTERCENTRAL", permAlterCentral);
        this.permAlterCentral = permAlterCentral;
   }

   public BigDecimal getTimContratoLtv() {
        return timContratoLtv;
   }

   public void setTimContratoLtv(BigDecimal timContratoLtv) {
        markAsChanged("TIMCONTRATOLTV", timContratoLtv);
        this.timContratoLtv = timContratoLtv;
   }

   public BigDecimal getTimContratoVenda() {
        return timContratoVenda;
   }

   public void setTimContratoVenda(BigDecimal timContratoVenda) {
        markAsChanged("TIMCONTRATOVENDA", timContratoVenda);
        this.timContratoVenda = timContratoVenda;
   }

   public BigDecimal getTimNuFinOrig() {
        return timNuFinOrig;
   }

   public void setTimNuFinOrig(BigDecimal timNuFinOrig) {
        markAsChanged("TIMNUFINORIG", timNuFinOrig);
        this.timNuFinOrig = timNuFinOrig;
   }

   public BigDecimal getTimNuNotaMod() {
        return timNuNotaMod;
   }

   public void setTimNuNotaMod(BigDecimal timNuNotaMod) {
        markAsChanged("TIMNUNOTAMOD", timNuNotaMod);
        this.timNuNotaMod = timNuNotaMod;
   }

   public String getTimOrigem() {
        return timOrigem;
   }

   public void setTimOrigem(String timOrigem) {
        markAsChanged("TIMORIGEM", timOrigem);
        this.timOrigem = timOrigem;
   }

   public BigDecimal getVlrAfrmm() {
        return vlrAfrmm;
   }

   public void setVlrAfrmm(BigDecimal vlrAfrmm) {
        markAsChanged("VLRAFRMM", vlrAfrmm);
        this.vlrAfrmm = vlrAfrmm;
   }

   public BigDecimal getVlrFreteCalc() {
        return vlrFreteCalc;
   }

   public void setVlrFreteCalc(BigDecimal vlrFreteCalc) {
        markAsChanged("VLRFRETECALC", vlrFreteCalc);
        this.vlrFreteCalc = vlrFreteCalc;
   }

   public String getVlrLiqItemNfe() {
        return vlrLiqItemNfe;
   }

   public void setVlrLiqItemNfe(String vlrLiqItemNfe) {
        markAsChanged("VLRLIQITEMNFE", vlrLiqItemNfe);
        this.vlrLiqItemNfe = vlrLiqItemNfe;
   }

   public BigDecimal getVlrPrestaAfrmm() {
        return vlrPrestaAfrmm;
   }

   public void setVlrPrestaAfrmm(BigDecimal vlrPrestaAfrmm) {
        markAsChanged("VLRPRESTAFRMM", vlrPrestaAfrmm);
        this.vlrPrestaAfrmm = vlrPrestaAfrmm;
   }

   public BigDecimal getVlrRepRedTotSemDesc() {
        return vlrRepRedTotSemDesc;
   }

   public void setVlrRepRedTotSemDesc(BigDecimal vlrRepRedTotSemDesc) {
        markAsChanged("VLRREPREDTOTSEMDESC", vlrRepRedTotSemDesc);
        this.vlrRepRedTotSemDesc = vlrRepRedTotSemDesc;
   }

   public String getAgrupFinNota() {
        return agrupFinNota;
   }

   public void setAgrupFinNota(String agrupFinNota) {
        markAsChanged("AGRUPFINNOTA", agrupFinNota);
        this.agrupFinNota = agrupFinNota;
   }

   public BigDecimal getCodCidOrigem() {
        return codCidOrigem;
   }

   public void setCodCidOrigem(BigDecimal codCidOrigem) {
        markAsChanged("CODCIDORIGEM", codCidOrigem);
        this.codCidOrigem = codCidOrigem;
   }

   public BigDecimal getCodCidDestino() {
        return codCidDestino;
   }

   public void setCodCidDestino(BigDecimal codCidDestino) {
        markAsChanged("CODCIDDESTINO", codCidDestino);
        this.codCidDestino = codCidDestino;
   }

   public String getClassifIcms() {
        return classifIcms;
   }

   public void setClassifIcms(String classifIcms) {
        markAsChanged("CLASSIFICMS", classifIcms);
        this.classifIcms = classifIcms;
   }

   public BigDecimal getNuFop() {
        return nuFop;
   }

   public void setNuFop(BigDecimal nuFop) {
        markAsChanged("NUFOP", nuFop);
        this.nuFop = nuFop;
   }

   public BigDecimal getCodUfEntrega() {
        return codUfEntrega;
   }

   public void setCodUfEntrega(BigDecimal codUfEntrega) {
        markAsChanged("CODUFENTREGA", codUfEntrega);
        this.codUfEntrega = codUfEntrega;
   }

   public BigDecimal getCodUfOrigem() {
        return codUfOrigem;
   }

   public void setCodUfOrigem(BigDecimal codUfOrigem) {
        markAsChanged("CODUFORIGEM", codUfOrigem);
        this.codUfOrigem = codUfOrigem;
   }

   public BigDecimal getCodContatoEntrega() {
        return codContatoEntrega;
   }

   public void setCodContatoEntrega(BigDecimal codContatoEntrega) {
        markAsChanged("CODCONTATOENTREGA", codContatoEntrega);
        this.codContatoEntrega = codContatoEntrega;
   }

   public BigDecimal getCodUfDestino() {
        return codUfDestino;
   }

   public void setCodUfDestino(BigDecimal codUfDestino) {
        markAsChanged("CODUFDESTINO", codUfDestino);
        this.codUfDestino = codUfDestino;
   }

   public BigDecimal getCodCidEntrega() {
        return codCidEntrega;
   }

   public void setCodCidEntrega(BigDecimal codCidEntrega) {
        markAsChanged("CODCIDENTREGA", codCidEntrega);
        this.codCidEntrega = codCidEntrega;
   }

   public String getStatusConferencia() {
        return statusConferencia;
   }

   public void setStatusConferencia(String statusConferencia) {
        markAsChanged("STATUSCONFERENCIA", statusConferencia);
        this.statusConferencia = statusConferencia;
   }

   public String getStatusNfe() {
        return statusNfe;
   }

   public void setStatusNfe(String statusNfe) {
        markAsChanged("STATUSNFE", statusNfe);
        this.statusNfe = statusNfe;
   }

   public String getStatusNfse() {
        return statusNfse;
   }

   public void setStatusNfse(String statusNfse) {
        markAsChanged("STATUSNFSE", statusNfse);
        this.statusNfse = statusNfse;
   }

   public String getStatusNota() {
        return statusNota;
   }

   public void setStatusNota(String statusNota) {
        markAsChanged("STATUSNOTA", statusNota);
        this.statusNota = statusNota;
   }

   public String getTipFrete() {
        return tipFrete;
   }

   public void setTipFrete(String tipFrete) {
        markAsChanged("TIPFRETE", tipFrete);
        this.tipFrete = tipFrete;
   }

   public String getTipIpiEmb() {
        return tipIpiEmb;
   }

   public void setTipIpiEmb(String tipIpiEmb) {
        markAsChanged("TIPIPIEMB", tipIpiEmb);
        this.tipIpiEmb = tipIpiEmb;
   }

   public String getTipLiberacao() {
        return tipLiberacao;
   }

   public void setTipLiberacao(String tipLiberacao) {
        markAsChanged("TIPLIBERACAO", tipLiberacao);
        this.tipLiberacao = tipLiberacao;
   }

   public BigDecimal getCiot() {
        return ciot;
   }

   public void setCiot(BigDecimal ciot) {
        markAsChanged("CIOT", ciot);
        this.ciot = ciot;
   }

   public String getRegEspTribut() {
        return regEspTribut;
   }

   public void setRegEspTribut(String regEspTribut) {
        markAsChanged("REGESPTRIBUT", regEspTribut);
        this.regEspTribut = regEspTribut;
   }

   public String getExigeIssqn() {
        return exigeIssqn;
   }

   public void setExigeIssqn(String exigeIssqn) {
        markAsChanged("EXIGEISSQN", exigeIssqn);
        this.exigeIssqn = exigeIssqn;
   }

   public String getSitEspecialResp() {
        return sitEspecialResp;
   }

   public void setSitEspecialResp(String sitEspecialResp) {
        markAsChanged("SITESPECIALRESP", sitEspecialResp);
        this.sitEspecialResp = sitEspecialResp;
   }

   public String getMotNaoReterIssqn() {
        return motNaoReterIssqn;
   }

   public void setMotNaoReterIssqn(String motNaoReterIssqn) {
        markAsChanged("MOTNAORETERISSQN", motNaoReterIssqn);
        this.motNaoReterIssqn = motNaoReterIssqn;
   }

   public String getChaveNfeRef() {
        return chaveNfeRef;
   }

   public void setChaveNfeRef(String chaveNfeRef) {
        markAsChanged("CHAVENFEREF", chaveNfeRef);
        this.chaveNfeRef = chaveNfeRef;
   }

   public String getClasCons() {
        return clasCons;
   }

   public void setClasCons(String clasCons) {
        markAsChanged("CLASCONS", clasCons);
        this.clasCons = clasCons;
   }

   public String getFusoEmissEpec() {
        return fusoEmissEpec;
   }

   public void setFusoEmissEpec(String fusoEmissEpec) {
        markAsChanged("FUSOEMISSEPEC", fusoEmissEpec);
        this.fusoEmissEpec = fusoEmissEpec;
   }

   public String getFormPgtCte() {
        return formPgtCte;
   }

   public void setFormPgtCte(String formPgtCte) {
        markAsChanged("FORMPGTCTE", formPgtCte);
        this.formPgtCte = formPgtCte;
   }

   public BigDecimal getCodCidPrest() {
        return codCidPrest;
   }

   public void setCodCidPrest(BigDecimal codCidPrest) {
        markAsChanged("CODCIDPREST", codCidPrest);
        this.codCidPrest = codCidPrest;
   }

   public BigDecimal getDescTermAcord() {
        return descTermAcord;
   }

   public void setDescTermAcord(BigDecimal descTermAcord) {
        markAsChanged("DESCTERMACORD", descTermAcord);
        this.descTermAcord = descTermAcord;
   }

   public String getTermAcordNota() {
        return termAcordNota;
   }

   public void setTermAcordNota(String termAcordNota) {
        markAsChanged("TERMACORDNOTA", termAcordNota);
        this.termAcordNota = termAcordNota;
   }

   public BigDecimal getVlrIcmsFcpInt() {
        return vlrIcmsFcpInt;
   }

   public void setVlrIcmsFcpInt(BigDecimal vlrIcmsFcpInt) {
        markAsChanged("VLRICMSFCPINT", vlrIcmsFcpInt);
        this.vlrIcmsFcpInt = vlrIcmsFcpInt;
   }

   public BigDecimal getVlrStFcpInt() {
        return vlrStFcpInt;
   }

   public void setVlrStFcpInt(BigDecimal vlrStFcpInt) {
        markAsChanged("VLRSTFCPINT", vlrStFcpInt);
        this.vlrStFcpInt = vlrStFcpInt;
   }

   public BigDecimal getVlrStFcpIntAnt() {
        return vlrStFcpIntAnt;
   }

   public void setVlrStFcpIntAnt(BigDecimal vlrStFcpIntAnt) {
        markAsChanged("VLRSTFCPINTANT", vlrStFcpIntAnt);
        this.vlrStFcpIntAnt = vlrStFcpIntAnt;
   }

   public String getTpAmbNfse() {
        return tpAmbNfse;
   }

   public void setTpAmbNfse(String tpAmbNfse) {
        markAsChanged("TPAMBNFSE", tpAmbNfse);
        this.tpAmbNfse = tpAmbNfse;
   }

   public BigDecimal getTimCodProd() {
        return timCodProd;
   }

   public void setTimCodProd(BigDecimal timCodProd) {
        markAsChanged("TIMCODPROD", timCodProd);
        this.timCodProd = timCodProd;
   }

   public String getTimDescProd() {
        return timDescProd;
   }

   public void setTimDescProd(String timDescProd) {
        markAsChanged("TIMDESCPROD", timDescProd);
        this.timDescProd = timDescProd;
   }

   public String getNfseId() {
        return nfseId;
   }

   public void setNfseId(String nfseId) {
        markAsChanged("NFSEID", nfseId);
        this.nfseId = nfseId;
   }

   public String getPremiacaoEstadual() {
        return premiacaoEstadual;
   }

   public void setPremiacaoEstadual(String premiacaoEstadual) {
        markAsChanged("PREMIACAOESTADUAL", premiacaoEstadual);
        this.premiacaoEstadual = premiacaoEstadual;
   }

   public BigDecimal getCodDocArrecad() {
        return codDocArrecad;
   }

   public void setCodDocArrecad(BigDecimal codDocArrecad) {
        markAsChanged("CODDOCARRECAD", codDocArrecad);
        this.codDocArrecad = codDocArrecad;
   }

   public String getNumDocArrecad() {
        return numDocArrecad;
   }

   public void setNumDocArrecad(String numDocArrecad) {
        markAsChanged("NUMDOCARRECAD", numDocArrecad);
        this.numDocArrecad = numDocArrecad;
   }

   public BigDecimal getVlrIcmsDiferido() {
        return vlrIcmsDiferido;
   }

   public void setVlrIcmsDiferido(BigDecimal vlrIcmsDiferido) {
        markAsChanged("VLRICMSDIFERIDO", vlrIcmsDiferido);
        this.vlrIcmsDiferido = vlrIcmsDiferido;
   }

   public String getLatitude() {
        return latitude;
   }

   public void setLatitude(String latitude) {
        markAsChanged("LATITUDE", latitude);
        this.latitude = latitude;
   }

   public String getLongitude() {
        return longitude;
   }

   public void setLongitude(String longitude) {
        markAsChanged("LONGITUDE", longitude);
        this.longitude = longitude;
   }

   public BigDecimal getNuPedFrete() {
        return nuPedFrete;
   }

   public void setNuPedFrete(BigDecimal nuPedFrete) {
        markAsChanged("NUPEDFRETE", nuPedFrete);
        this.nuPedFrete = nuPedFrete;
   }

   public BigDecimal getNuOdp() {
        return nuOdp;
   }

   public void setNuOdp(BigDecimal nuOdp) {
        markAsChanged("NUODP", nuOdp);
        this.nuOdp = nuOdp;
   }

   public String getCodRastreamentoEct() {
        return codRastreamentoEct;
   }

   public void setCodRastreamentoEct(String codRastreamentoEct) {
        markAsChanged("CODRASTREAMENTOECT", codRastreamentoEct);
        this.codRastreamentoEct = codRastreamentoEct;
   }

   public BigDecimal getCodCidFimCte() {
        return codCidFimCte;
   }

   public void setCodCidFimCte(BigDecimal codCidFimCte) {
        markAsChanged("CODCIDFIMCTE", codCidFimCte);
        this.codCidFimCte = codCidFimCte;
   }

   public BigDecimal getCodCidIniCte() {
        return codCidIniCte;
   }

   public void setCodCidIniCte(BigDecimal codCidIniCte) {
        markAsChanged("CODCIDINICTE", codCidIniCte);
        this.codCidIniCte = codCidIniCte;
   }

   public String getCteGlobal() {
        return cteGlobal;
   }

   public void setCteGlobal(String cteGlobal) {
        markAsChanged("CTEGLOBAL", cteGlobal);
        this.cteGlobal = cteGlobal;
   }

   public BigDecimal getVlrCargaAverb() {
        return vlrCargaAverb;
   }

   public void setVlrCargaAverb(BigDecimal vlrCargaAverb) {
        markAsChanged("VLRCARGAAVERB", vlrCargaAverb);
        this.vlrCargaAverb = vlrCargaAverb;
   }

   public BigDecimal getPercDescFob() {
        return percDescFob;
   }

   public void setPercDescFob(BigDecimal percDescFob) {
        markAsChanged("PERCDESCFOB", percDescFob);
        this.percDescFob = percDescFob;
   }

   public BigDecimal getSumVlrIiOutNota() {
        return sumVlrIiOutNota;
   }

   public void setSumVlrIiOutNota(BigDecimal sumVlrIiOutNota) {
        markAsChanged("SUMVLRIIOUTNOTA", sumVlrIiOutNota);
        this.sumVlrIiOutNota = sumVlrIiOutNota;
   }

   public Timestamp getDhViagem() {
        return dhViagem;
   }

   public void setDhViagem(Timestamp dhViagem) {
        markAsChanged("DHVIAGEM", dhViagem);
        this.dhViagem = dhViagem;
   }

   public BigDecimal getNuSessao() {
        return nuSessao;
   }

   public void setNuSessao(BigDecimal nuSessao) {
        markAsChanged("NUSESSAO", nuSessao);
        this.nuSessao = nuSessao;
   }

   public BigDecimal getTpFretamento() {
        return tpFretamento;
   }

   public void setTpFretamento(BigDecimal tpFretamento) {
        markAsChanged("TPFRETAMENTO", tpFretamento);
        this.tpFretamento = tpFretamento;
   }

   public BigDecimal getCodParcRetirada() {
        return codParcRetirada;
   }

   public void setCodParcRetirada(BigDecimal codParcRetirada) {
        markAsChanged("CODPARCRETIRADA", codParcRetirada);
        this.codParcRetirada = codParcRetirada;
   }

   public String getNotaPorPedidoPdv() {
        return notaPorPedidoPdv;
   }

   public void setNotaPorPedidoPdv(String notaPorPedidoPdv) {
        markAsChanged("NOTAPORPEDIDOPDV", notaPorPedidoPdv);
        this.notaPorPedidoPdv = notaPorPedidoPdv;
   }

   public String getChaveCteRef() {
        return chaveCteRef;
   }

   public void setChaveCteRef(String chaveCteRef) {
        markAsChanged("CHAVECTEREF", chaveCteRef);
        this.chaveCteRef = chaveCteRef;
   }

   public BigDecimal getValorDesonPisCofins() {
        return valorDesonPisCofins;
   }

   public void setValorDesonPisCofins(BigDecimal valorDesonPisCofins) {
        markAsChanged("VALORDESONPISCOFINS", valorDesonPisCofins);
        this.valorDesonPisCofins = valorDesonPisCofins;
   }

   public BigDecimal getCodInterm() {
        return codInterm;
   }

   public void setCodInterm(BigDecimal codInterm) {
        markAsChanged("CODINTERM", codInterm);
        this.codInterm = codInterm;
   }

   public String getIntermed() {
        return intermed;
   }

   public void setIntermed(String intermed) {
        markAsChanged("INTERMED", intermed);
        this.intermed = intermed;
   }

   public BigDecimal getVlrFetHab() {
        return vlrFetHab;
   }

   public void setVlrFetHab(BigDecimal vlrFetHab) {
        markAsChanged("VLRFETHAB", vlrFetHab);
        this.vlrFetHab = vlrFetHab;
   }

   public String getFistel() {
        return fistel;
   }

   public void setFistel(String fistel) {
        markAsChanged("FISTEL", fistel);
        this.fistel = fistel;
   }

   public String getMd5ModComTel() {
        return md5ModComTel;
   }

   public void setMd5ModComTel(String md5ModComTel) {
        markAsChanged("MD5MODCOMTEL", md5ModComTel);
        this.md5ModComTel = md5ModComTel;
   }

   public BigDecimal getNumCstc() {
        return numCstc;
   }

   public void setNumCstc(BigDecimal numCstc) {
        markAsChanged("NUMCSTC", numCstc);
        this.numCstc = numCstc;
   }

   public String getNumTermTel() {
        return numTermTel;
   }

   public void setNumTermTel(String numTermTel) {
        markAsChanged("NUMTERMTEL", numTermTel);
        this.numTermTel = numTermTel;
   }

   public BigDecimal getQtdUsu() {
        return qtdUsu;
   }

   public void setQtdUsu(BigDecimal qtdUsu) {
        markAsChanged("QTDUSU", qtdUsu);
        this.qtdUsu = qtdUsu;
   }

   public BigDecimal getTipClienteServCom() {
        return tipClienteServCom;
   }

   public void setTipClienteServCom(BigDecimal tipClienteServCom) {
        markAsChanged("TIPCLIENTESERVCOM", tipClienteServCom);
        this.tipClienteServCom = tipClienteServCom;
   }

   public String getIndNegModal() {
        return indNegModal;
   }

   public void setIndNegModal(String indNegModal) {
        markAsChanged("INDNEGMODAL", indNegModal);
        this.indNegModal = indNegModal;
   }

   public BigDecimal getBaseIcmsStFrete() {
        return baseIcmsStFrete;
   }

   public void setBaseIcmsStFrete(BigDecimal baseIcmsStFrete) {
        markAsChanged("BASEICMSSTFRETE", baseIcmsStFrete);
        this.baseIcmsStFrete = baseIcmsStFrete;
   }

   public BigDecimal getIcmsStFrete() {
        return icmsStFrete;
   }

   public void setIcmsStFrete(BigDecimal icmsStFrete) {
        markAsChanged("ICMSSTFRETE", icmsStFrete);
        this.icmsStFrete = icmsStFrete;
   }

   public BigDecimal getVlrRepRedSt() {
        return vlrRepRedSt;
   }

   public void setVlrRepRedSt(BigDecimal vlrRepRedSt) {
        markAsChanged("VLRREPREDST", vlrRepRedSt);
        this.vlrRepRedSt = vlrRepRedSt;
   }

   public BigDecimal getBaseIcmsAt() {
        return baseIcmsAt;
   }

   public void setBaseIcmsAt(BigDecimal baseIcmsAt) {
        markAsChanged("BASEICMSAT", baseIcmsAt);
        this.baseIcmsAt = baseIcmsAt;
   }

   public BigDecimal getVlrIcmsAt() {
        return vlrIcmsAt;
   }

   public void setVlrIcmsAt(BigDecimal vlrIcmsAt) {
        markAsChanged("VLRICMSAT", vlrIcmsAt);
        this.vlrIcmsAt = vlrIcmsAt;
   }

   public BigDecimal getCodCheckout() {
        return codCheckout;
   }

   public void setCodCheckout(BigDecimal codCheckout) {
        markAsChanged("CODCHECKOUT", codCheckout);
        this.codCheckout = codCheckout;
   }

   public BigDecimal getClienteIdParceria() {
        return clienteIdParceria;
   }

   public void setClienteIdParceria(BigDecimal clienteIdParceria) {
        markAsChanged("CLIENTEIDPARCERIA", clienteIdParceria);
        this.clienteIdParceria = clienteIdParceria;
   }

   public BigDecimal getIdDescParceria() {
        return idDescParceria;
   }

   public void setIdDescParceria(BigDecimal idDescParceria) {
        markAsChanged("IDDESCPARCERIA", idDescParceria);
        this.idDescParceria = idDescParceria;
   }

   public BigDecimal getIdPontuacaoParceria() {
        return idPontuacaoParceria;
   }

   public void setIdPontuacaoParceria(BigDecimal idPontuacaoParceria) {
        markAsChanged("IDPONTUACAOPARCERIA", idPontuacaoParceria);
        this.idPontuacaoParceria = idPontuacaoParceria;
   }

   public BigDecimal getVlrDescParceria() {
        return vlrDescParceria;
   }

   public void setVlrDescParceria(BigDecimal vlrDescParceria) {
        markAsChanged("VLRDESCPARCERIA", vlrDescParceria);
        this.vlrDescParceria = vlrDescParceria;
   }

   public BigDecimal getQtdProdDistintos() {
        return qtdProdDistintos;
   }

   public void setQtdProdDistintos(BigDecimal qtdProdDistintos) {
        markAsChanged("QTDPRODDISTINTOS", qtdProdDistintos);
        this.qtdProdDistintos = qtdProdDistintos;
   }

   public String getDisDesautImpEmb() {
        return disDesautImpEmb;
   }

   public void setDisDesautImpEmb(String disDesautImpEmb) {
        markAsChanged("DISDESAUTIMPEMB", disDesautImpEmb);
        this.disDesautImpEmb = disDesautImpEmb;
   }

   public String getContabilizado() {
        return contabilizado;
   }

   public void setContabilizado(String contabilizado) {
        markAsChanged("CONTABILIZADO", contabilizado);
        this.contabilizado = contabilizado;
   }

   public BigDecimal getNuNotaRec() {
        return nuNotaRec;
   }

   public void setNuNotaRec(BigDecimal nuNotaRec) {
        markAsChanged("NUNOTAREC", nuNotaRec);
        this.nuNotaRec = nuNotaRec;
   }

   public BigDecimal getNuRecebimento() {
        return nuRecebimento;
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        markAsChanged("NURECEBIMENTO", nuRecebimento);
        this.nuRecebimento = nuRecebimento;
   }

   public String getRetGerWms() {
        return retGerWms;
   }

   public void setRetGerWms(String retGerWms) {
        markAsChanged("RETGERWMS", retGerWms);
        this.retGerWms = retGerWms;
   }

   public String getRetornoEquipFiscal() {
        return retornoEquipFiscal;
   }

   public void setRetornoEquipFiscal(String retornoEquipFiscal) {
        markAsChanged("RETORNOEQUIPFISCAL", retornoEquipFiscal);
        this.retornoEquipFiscal = retornoEquipFiscal;
   }

   public BigDecimal getSomIcmsNfeNac() {
        return somIcmsNfeNac;
   }

   public void setSomIcmsNfeNac(BigDecimal somIcmsNfeNac) {
        markAsChanged("SOMICMSNFENAC", somIcmsNfeNac);
        this.somIcmsNfeNac = somIcmsNfeNac;
   }

   public BigDecimal getSomPisCofNfeNac() {
        return somPisCofNfeNac;
   }

   public void setSomPisCofNfeNac(BigDecimal somPisCofNfeNac) {
        markAsChanged("SOMPISCOFNFENAC", somPisCofNfeNac);
        this.somPisCofNfeNac = somPisCofNfeNac;
   }

   public String getStatusCfe() {
        return statusCfe;
   }

   public void setStatusCfe(String statusCfe) {
        markAsChanged("STATUSCFE", statusCfe);
        this.statusCfe = statusCfe;
   }

   public Timestamp getDtValAutVendaMais() {
        return dtValAutVendaMais;
   }

   public void setDtValAutVendaMais(Timestamp dtValAutVendaMais) {
        markAsChanged("DTVALAUTVENDAMAIS", dtValAutVendaMais);
        this.dtValAutVendaMais = dtValAutVendaMais;
   }

   public String getHistConfig() {
        return histConfig;
   }

   public void setHistConfig(String histConfig) {
        markAsChanged("HISTCONFIG", histConfig);
        this.histConfig = histConfig;
   }

   public String getSerieNfse() {
        return serieNfse;
   }

   public void setSerieNfse(String serieNfse) {
        markAsChanged("SERIENFSE", serieNfse);
        this.serieNfse = serieNfse;
   }

   public String getCpfRespTec() {
        return cpfRespTec;
   }

   public void setCpfRespTec(String cpfRespTec) {
        markAsChanged("CPFRESPTEC", cpfRespTec);
        this.cpfRespTec = cpfRespTec;
   }

   public BigDecimal getNumGuia() {
        return numGuia;
   }

   public void setNumGuia(BigDecimal numGuia) {
        markAsChanged("NUMGUIA", numGuia);
        this.numGuia = numGuia;
   }

   public String getNumReceitaGro() {
        return numReceitaGro;
   }

   public void setNumReceitaGro(String numReceitaGro) {
        markAsChanged("NUMRECEITAGRO", numReceitaGro);
        this.numReceitaGro = numReceitaGro;
   }

   public String getSerieGuia() {
        return serieGuia;
   }

   public void setSerieGuia(String serieGuia) {
        markAsChanged("SERIEGUIA", serieGuia);
        this.serieGuia = serieGuia;
   }

   public String getTipoGuia() {
        return tipoGuia;
   }

   public void setTipoGuia(String tipoGuia) {
        markAsChanged("TIPOGUIA", tipoGuia);
        this.tipoGuia = tipoGuia;
   }

   public String getUfEmissao() {
        return ufEmissao;
   }

   public void setUfEmissao(String ufEmissao) {
        markAsChanged("UFEMISSAO", ufEmissao);
        this.ufEmissao = ufEmissao;
   }

   public String getCaracAd() {
        return caracAd;
   }

   public void setCaracAd(String caracAd) {
        markAsChanged("CARACAD", caracAd);
        this.caracAd = caracAd;
   }

   public String getCaracSer() {
        return caracSer;
   }

   public void setCaracSer(String caracSer) {
        markAsChanged("CARACSER", caracSer);
        this.caracSer = caracSer;
   }

   public BigDecimal getSomDespAdUnfeNac() {
        return somDespAdUnfeNac;
   }

   public void setSomDespAdUnfeNac(BigDecimal somDespAdUnfeNac) {
        markAsChanged("SOMDESPADUNFENAC", somDespAdUnfeNac);
        this.somDespAdUnfeNac = somDespAdUnfeNac;
   }

   public String getCodAuthVm() {
        return codAuthVm;
   }

   public void setCodAuthVm(String codAuthVm) {
        markAsChanged("CODAUTHVM", codAuthVm);
        this.codAuthVm = codAuthVm;
   }

   public String getNumProtocInCte() {
        return numProtocInCte;
   }

   public void setNumProtocInCte(String numProtocInCte) {
        markAsChanged("NUMPROTOCINCTE", numProtocInCte);
        this.numProtocInCte = numProtocInCte;
   }

   public String getStatusVm() {
        return statusVm;
   }

   public void setStatusVm(String statusVm) {
        markAsChanged("STATUSVM", statusVm);
        this.statusVm = statusVm;
   }

   public String getNumProtocInNfe() {
        return numProtocInNfe;
   }

   public void setNumProtocInNfe(String numProtocInNfe) {
        markAsChanged("NUMPROTOCINNFE", numProtocInNfe);
        this.numProtocInNfe = numProtocInNfe;
   }

   public BigDecimal getVlrRepTerc() {
        return vlrRepTerc;
   }

   public void setVlrRepTerc(BigDecimal vlrRepTerc) {
        markAsChanged("VLRREPTERC", vlrRepTerc);
        this.vlrRepTerc = vlrRepTerc;
   }

   public String getChvNfeIneRef() {
        return chvNfeIneRef;
   }

   public void setChvNfeIneRef(String chvNfeIneRef) {
        markAsChanged("CHVNFEINEREF", chvNfeIneRef);
        this.chvNfeIneRef = chvNfeIneRef;
   }

   public Timestamp getDtEscrCont() {
        return dtEscrCont;
   }

   public void setDtEscrCont(Timestamp dtEscrCont) {
        markAsChanged("DTESCRCONT", dtEscrCont);
        this.dtEscrCont = dtEscrCont;
   }

   public String getModRecebPdvWeb() {
        return modRecebPdvWeb;
   }

   public void setModRecebPdvWeb(String modRecebPdvWeb) {
        markAsChanged("MODRECEBPDVWEB", modRecebPdvWeb);
        this.modRecebPdvWeb = modRecebPdvWeb;
   }

   public String getStatusAutorizacaoVm() {
        return statusAutorizacaoVm;
   }

   public void setStatusAutorizacaoVm(String statusAutorizacaoVm) {
        markAsChanged("STATUSAUTORIZACAOVM", statusAutorizacaoVm);
        this.statusAutorizacaoVm = statusAutorizacaoVm;
   }

   @Override
   public String getTableName() {
        return "TGFCAB";
   }

   @Override
   public String getEntityName() {
        return "CabecalhoNota";
   }

   @Override
   public CabecalhoNota fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codObsPadrao = vo.asBigDecimal("CODOBSPADRAO");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codParcConsignatario = vo.asBigDecimal("CODPARCCONSIGNATARIO");
        this.codParcDest = vo.asBigDecimal("CODPARCDEST");
        this.codParcRedespacho = vo.asBigDecimal("CODPARCREDESPACHO");
        this.codParcRemetente = vo.asBigDecimal("CODPARCREMETENTE");
        this.codTipVenda = vo.asBigDecimal("CODTIPVENDA");
        this.codTpd = vo.asBigDecimal("CODTPD");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuComprador = vo.asBigDecimal("CODUSUCOMPRADOR");
        this.codUsuInc = vo.asBigDecimal("CODUSUINC");
        this.codVeiculo = vo.asBigDecimal("CODVEICULO");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.codVendTec = vo.asBigDecimal("CODVENDTEC");
        this.codVtp = vo.asBigDecimal("CODVTP");
        this.comGer = vo.asBigDecimal("COMGER");
        this.comissao = vo.asBigDecimal("COMISSAO");
        this.confirmada = vo.asString("CONFIRMADA");
        this.danfe = vo.asBigDecimal("DANFE");
        this.descrHistAc = vo.asString("DESCRHISTAC");
        this.dhProtoc = vo.asTimestamp("DHPROTOC");
        this.dhRegDpec = vo.asTimestamp("DHREGDPEC");
        this.dhTipOper = vo.asTimestamp("DHTIPOPER");
        this.dhTipVenda = vo.asTimestamp("DHTIPVENDA");
        this.digital = vo.asString("DIGITAL");
        this.dtAdiam = vo.asTimestamp("DTADIAM");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtContab = vo.asTimestamp("DTCONTAB");
        this.dtEntSai = vo.asTimestamp("DTENTSAI");
        this.dtEnvioPmb = vo.asTimestamp("DTENVIOPMB");
        this.dtEnvSuf = vo.asTimestamp("DTENVSUF");
        this.dtFatur = vo.asTimestamp("DTFATUR");
        this.dtMov = vo.asTimestamp("DTMOV");
        this.dtNeg = vo.asTimestamp("DTNEG");
        this.dtPrevent = vo.asTimestamp("DTPREVENT");
        this.dtVal = vo.asTimestamp("DTVAL");
        this.hrAdiam = vo.asBigDecimal("HRADIAM");
        this.hrEntSai = vo.asTimestamp("HRENTSAI");
        this.hrMov = vo.asBigDecimal("HRMOV");
        this.icmsFrete = vo.asBigDecimal("ICMSFRETE");
        this.ipiEmb = vo.asBigDecimal("IPIEMB");
        this.irFretido = vo.asString("IRFRETIDO");
        this.issRetido = vo.asString("ISSRETIDO");
        this.kmVeiculo = vo.asBigDecimal("KMVEICULO");
        this.lacres = vo.asString("LACRES");
        this.libConf = vo.asString("LIBCONF");
        this.libPendente = vo.asString("LIBPENDENTE");
        this.localColeta = vo.asString("LOCALCOLETA");
        this.localEntrega = vo.asString("LOCALENTREGA");
        this.m3 = vo.asBigDecimal("M3");
        this.m3AEntregar = vo.asBigDecimal("M3AENTREGAR");
        this.marca = vo.asString("MARCA");
        this.modeloNfDes = vo.asString("MODELONFDES");
        this.naturezaOperDes = vo.asString("NATUREZAOPERDES");
        this.notasCf = vo.asString("NOTASCF");
        this.nroCaixa = vo.asBigDecimal("NROCAIXA");
        this.nroRedz = vo.asBigDecimal("NROREDZ");
        this.nuConfAtual = vo.asBigDecimal("NUCONFATUAL");
        this.nuLotEnfe = vo.asBigDecimal("NULOTENFE");
        this.nuLotEnfse = vo.asBigDecimal("NULOTENFSE");
        this.numAleatorio = vo.asBigDecimal("NUMALEATORIO");
        this.numCf = vo.asBigDecimal("NUMCF");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.numCotacao = vo.asBigDecimal("NUMCOTACAO");
        this.numeracaoVolumes = vo.asString("NUMERACAOVOLUMES");
        this.numNfse = vo.asString("NUMNFSE");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.numOs = vo.asBigDecimal("NUMOS");
        this.numPedido2 = vo.asString("NUMPEDIDO2");
        this.numProtoc = vo.asString("NUMPROTOC");
        this.numRegDpec = vo.asString("NUMREGDPEC");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuNotaPedFret = vo.asBigDecimal("NUNOTAPEDFRET");
        this.nuPca = vo.asBigDecimal("NUPCA");
        this.nuRd8 = vo.asBigDecimal("NURD8");
        this.nuRem = vo.asBigDecimal("NUREM");
        this.nuTransf = vo.asBigDecimal("NUTRANSF");
        this.observacao = vo.asString("OBSERVACAO");
        this.observacaoAc = vo.asString("OBSERVACAOAC");
        this.occN48 = vo.asBigDecimal("OCCN48");
        this.ordemCarga = vo.asBigDecimal("ORDEMCARGA");
        this.pedidoImpresso = vo.asString("PEDIDOIMPRESSO");
        this.pendente = vo.asString("PENDENTE");
        this.percDesc = vo.asBigDecimal("PERCDESC");
        this.peso = vo.asBigDecimal("PESO");
        this.pesoAEntregar = vo.asBigDecimal("PESOAENTREGAR");
        this.pesoBruto = vo.asBigDecimal("PESOBRUTO");
        this.pesoBrutoItens = vo.asBigDecimal("PESOBRUTOITENS");
        this.placa = vo.asString("PLACA");
        this.qtdVol = vo.asBigDecimal("QTDVOL");
        this.rateado = vo.asString("RATEADO");
        this.retornadoAc = vo.asString("RETORNADOAC");
        this.seqCarga = vo.asBigDecimal("SEQCARGA");
        this.codParcTransp = vo.asBigDecimal("CODPARCTRANSP");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.serieNfDes = vo.asString("SERIENFDES");
        this.serieNota = vo.asString("SERIENOTA");
        this.codSite = vo.asBigDecimal("CODSITE");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.aliqIrf = vo.asBigDecimal("ALIQIRF");
        this.antt = vo.asString("ANTT");
        this.aprovado = vo.asString("APROVADO");
        this.baseCofins = vo.asBigDecimal("BASECOFINS");
        this.baseCofinsSt = vo.asBigDecimal("BASECOFINSST");
        this.baseIcms = vo.asBigDecimal("BASEICMS");
        this.baseIcmsFrete = vo.asBigDecimal("BASEICMSFRETE");
        this.baseInss = vo.asBigDecimal("BASEINSS");
        this.baseIpi = vo.asBigDecimal("BASEIPI");
        this.baseIrf = vo.asBigDecimal("BASEIRF");
        this.baseIss = vo.asBigDecimal("BASEISS");
        this.basePis = vo.asBigDecimal("BASEPIS");
        this.basePisSt = vo.asBigDecimal("BASEPISST");
        this.baseSubstit = vo.asBigDecimal("BASESUBSTIT");
        this.baseSubstSemRed = vo.asBigDecimal("BASESUBSTSEMRED");
        this.chaveNfe = vo.asString("CHAVENFE");
        this.cifFob = vo.asString("CIF_FOB");
        this.codCc = vo.asBigDecimal("CODCC");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codCid = vo.asBigDecimal("CODCID");
        this.codContato = vo.asBigDecimal("CODCONTATO");
        this.codDoca = vo.asBigDecimal("CODDOCA");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEmpFunc = vo.asBigDecimal("CODEMPFUNC");
        this.codEmpNegoc = vo.asBigDecimal("CODEMPNEGOC");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codGrupoTensao = vo.asString("CODGRUPOTENSAO");
        this.codHistAc = vo.asBigDecimal("CODHISTAC");
        this.codLocalOrig = vo.asBigDecimal("CODLOCALORIG");
        this.codMaq = vo.asBigDecimal("CODMAQ");
        this.codModDocNota = vo.asBigDecimal("CODMODDOCNOTA");
        this.tpLigacao = vo.asBigDecimal("TPLIGACAO");
        this.troco = vo.asBigDecimal("TROCO");
        this.ufVeiculo = vo.asBigDecimal("UFVEICULO");
        this.vencFrete = vo.asTimestamp("VENCFRETE");
        this.vencIpi = vo.asTimestamp("VENCIPI");
        this.vlrCofins = vo.asBigDecimal("VLRCOFINS");
        this.vlrCofinsSt = vo.asBigDecimal("VLRCOFINSST");
        this.vlrCompensacao = vo.asBigDecimal("VLRCOMPENSACAO");
        this.vlrDescServ = vo.asBigDecimal("VLRDESCSERV");
        this.vlrDescTot = vo.asBigDecimal("VLRDESCTOT");
        this.vlrDescTotItem = vo.asBigDecimal("VLRDESCTOTITEM");
        this.vlrDestaque = vo.asBigDecimal("VLRDESTAQUE");
        this.vlrEmb = vo.asBigDecimal("VLREMB");
        this.vlrFrete = vo.asBigDecimal("VLRFRETE");
        this.vlrFreteCpl = vo.asBigDecimal("VLRFRETECPL");
        this.vlrIcms = vo.asBigDecimal("VLRICMS");
        this.vlrIcmsEmb = vo.asBigDecimal("VLRICMSEMB");
        this.vlrIcmsSeg = vo.asBigDecimal("VLRICMSSEG");
        this.vlrIndeniz = vo.asBigDecimal("VLRINDENIZ");
        this.vlrIndenizDist = vo.asBigDecimal("VLRINDENIZDIST");
        this.vlrInss = vo.asBigDecimal("VLRINSS");
        this.vlrIpi = vo.asBigDecimal("VLRIPI");
        this.vlrIrf = vo.asBigDecimal("VLRIRF");
        this.vlrIss = vo.asBigDecimal("VLRISS");
        this.vlrJuro = vo.asBigDecimal("VLRJURO");
        this.vlrJuroDist = vo.asBigDecimal("VLRJURODIST");
        this.vlrMercadoria = vo.asBigDecimal("VLRMERCADORIA");
        this.vlrMoeda = vo.asBigDecimal("VLRMOEDA");
        this.vlrNota = vo.asBigDecimal("VLRNOTA");
        this.vlrOutros = vo.asBigDecimal("VLROUTROS");
        this.vlrPis = vo.asBigDecimal("VLRPIS");
        this.vlrPisSt = vo.asBigDecimal("VLRPISST");
        this.vlrRepRedTot = vo.asBigDecimal("VLRREPREDTOT");
        this.vlrRoyalt = vo.asBigDecimal("VLRROYALT");
        this.vlrSeg = vo.asBigDecimal("VLRSEG");
        this.vlrStExtraNotaTot = vo.asBigDecimal("VLRSTEXTRANOTATOT");
        this.vlrSubst = vo.asBigDecimal("VLRSUBST");
        this.vlrVendor = vo.asBigDecimal("VLRVENDOR");
        this.volume = vo.asString("VOLUME");
        this.tipMov = vo.asString("TIPMOV");
        this.tipNotaPmb = vo.asString("TIPNOTAPMB");
        this.tipOptAgjNfe = vo.asBigDecimal("TIPOPTAGJNFE");
        this.totalCustoProd = vo.asBigDecimal("TOTALCUSTOPROD");
        this.totalCustoServ = vo.asBigDecimal("TOTALCUSTOSERV");
        this.totDispDesc = vo.asBigDecimal("TOTDISPDESC");
        this.tpAmbNfe = vo.asString("TPAMBNFE");
        this.tpAssinante = vo.asBigDecimal("TPASSINANTE");
        this.tpEmisNfe = vo.asBigDecimal("TPEMISNFE");
        this.tpEmisNfse = vo.asBigDecimal("TPEMISNFSE");
        this.codMoeda = vo.asBigDecimal("CODMOEDA");
        this.codMotorista = vo.asBigDecimal("CODMOTORISTA");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.modEntrega = vo.asString("MODENTREGA");
        this.notaEmpenho = vo.asString("NOTAEMPENHO");
        this.vlrFreteTotal = vo.asBigDecimal("VLRFRETETOTAL");
        this.codParcTranspFinal = vo.asBigDecimal("CODPARCTRANSPFINAL");
        this.situacaoWms = vo.asBigDecimal("SITUACAOWMS");
        this.viaTransp = vo.asString("VIATRANSP");
        this.ufAdquirente = vo.asString("UFADQUIRENTE");
        this.cnpjAdquirente = vo.asString("CNPJADQUIRENTE");
        this.tipProcImp = vo.asString("TIPPROCIMP");
        this.prodPred = vo.asString("PRODPRED");
        this.pesoLiqItens = vo.asBigDecimal("PESOLIQITENS");
        this.vlrDescTotItemMoe = vo.asBigDecimal("VLRDESCTOTITEMMOE");
        this.vlrTotLiqItemMoe = vo.asBigDecimal("VLRTOTLIQITEMMOE");
        this.cteLotacao = vo.asString("CTELOTACAO");
        this.chaveCte = vo.asString("CHAVECTE");
        this.reboque3 = vo.asBigDecimal("REBOQUE3");
        this.situacaoCte = vo.asString("SITUACAOCTE");
        this.lotacao = vo.asString("LOTACAO");
        this.tpEmisCte = vo.asBigDecimal("TPEMISCTE");
        this.tpAmbCte = vo.asString("TPAMBCTE");
        this.numAleatorioCte = vo.asBigDecimal("NUMALEATORIOCTE");
        this.statusCte = vo.asString("STATUSCTE");
        this.dtDeclara = vo.asTimestamp("DTDECLARA");
        this.reboque1 = vo.asBigDecimal("REBOQUE1");
        this.reboque2 = vo.asBigDecimal("REBOQUE2");
        this.cpfCnpjAdquirente = vo.asString("CPFCNPJADQUIRENTE");
        this.dtEntSaiInfo = vo.asTimestamp("DTENTSAIINFO");
        this.indPresNfce = vo.asString("INDPRESNFCE");
        this.locEmbarq = vo.asString("LOCEMBARQ");
        this.nomeAdquirente = vo.asString("NOMEADQUIRENTE");
        this.ufEmbarq = vo.asString("UFEMBARQ");
        this.chaveNfse = vo.asString("CHAVENFSE");
        this.produetLoc = vo.asString("PRODUETLOC");
        this.dhEmissEpec = vo.asTimestamp("DHEMISSEPEC");
        this.nuNotaSub = vo.asBigDecimal("NUNOTASUB");
        this.tipServCte = vo.asBigDecimal("TIPSERVCTE");
        this.tipoCte = vo.asString("TIPOCTE");
        this.dtRemRet = vo.asTimestamp("DTREMRET");
        this.idIproc = vo.asBigDecimal("IDIPROC");
        this.statusWms = vo.asString("STATUSWMS");
        this.vlrIcmsFcp = vo.asBigDecimal("VLRICMSFCP");
        this.vlrIcmsDifAlDest = vo.asBigDecimal("VLRICMSDIFALDEST");
        this.vlrIcmsDifAlRem = vo.asBigDecimal("VLRICMSDIFALREM");
        this.nuLoteCte = vo.asBigDecimal("NULOTECTE");
        this.numProtocCte = vo.asString("NUMPROTOCCTE");
        this.dhProtocCte = vo.asTimestamp("DHPROTOCCTE");
        this.pesoLiquiManual = vo.asString("PESOLIQUIMANUAL");
        this.pesoBrutoManual = vo.asString("PESOBRUTOMANUAL");
        this.codObra = vo.asString("CODOBRA");
        this.codArt = vo.asString("CODART");
        this.codParcDescargaMdfe = vo.asBigDecimal("CODPARCDESCARGAMDFE");
        this.codGuf = vo.asBigDecimal("CODGUF");
        this.confirmNotaFat = vo.asString("CONFIRMNOTAFAT");
        this.direcaoViag = vo.asString("DIRECAOVIAG");
        this.dtRef = vo.asTimestamp("DTREF");
        this.dtRef2 = vo.asTimestamp("DTREF2");
        this.dtRef3 = vo.asTimestamp("DTREF3");
        this.freteVlrPago = vo.asBigDecimal("FRETEVLRPAGO");
        this.idBalsa01 = vo.asString("IDBALSA01");
        this.idBalsa02 = vo.asString("IDBALSA02");
        this.idBalsa03 = vo.asString("IDBALSA03");
        this.idNavio = vo.asString("IDNAVIO");
        this.irInNavio = vo.asString("IRINNAVIO");
        this.nfeDevRecusa = vo.asString("NFEDEVRECUSA");
        this.nuCfr = vo.asBigDecimal("NUCFR");
        this.permAlterCentral = vo.asString("PERMALTERCENTRAL");
        this.timContratoLtv = vo.asBigDecimal("TIMCONTRATOLTV");
        this.timContratoVenda = vo.asBigDecimal("TIMCONTRATOVENDA");
        this.timNuFinOrig = vo.asBigDecimal("TIMNUFINORIG");
        this.timNuNotaMod = vo.asBigDecimal("TIMNUNOTAMOD");
        this.timOrigem = vo.asString("TIMORIGEM");
        this.vlrAfrmm = vo.asBigDecimal("VLRAFRMM");
        this.vlrFreteCalc = vo.asBigDecimal("VLRFRETECALC");
        this.vlrLiqItemNfe = vo.asString("VLRLIQITEMNFE");
        this.vlrPrestaAfrmm = vo.asBigDecimal("VLRPRESTAFRMM");
        this.vlrRepRedTotSemDesc = vo.asBigDecimal("VLRREPREDTOTSEMDESC");
        this.agrupFinNota = vo.asString("AGRUPFINNOTA");
        this.codCidOrigem = vo.asBigDecimal("CODCIDORIGEM");
        this.codCidDestino = vo.asBigDecimal("CODCIDDESTINO");
        this.classifIcms = vo.asString("CLASSIFICMS");
        this.nuFop = vo.asBigDecimal("NUFOP");
        this.codUfEntrega = vo.asBigDecimal("CODUFENTREGA");
        this.codUfOrigem = vo.asBigDecimal("CODUFORIGEM");
        this.codContatoEntrega = vo.asBigDecimal("CODCONTATOENTREGA");
        this.codUfDestino = vo.asBigDecimal("CODUFDESTINO");
        this.codCidEntrega = vo.asBigDecimal("CODCIDENTREGA");
        this.statusConferencia = vo.asString("STATUSCONFERENCIA");
        this.statusNfe = vo.asString("STATUSNFE");
        this.statusNfse = vo.asString("STATUSNFSE");
        this.statusNota = vo.asString("STATUSNOTA");
        this.tipFrete = vo.asString("TIPFRETE");
        this.tipIpiEmb = vo.asString("TIPIPIEMB");
        this.tipLiberacao = vo.asString("TIPLIBERACAO");
        this.ciot = vo.asBigDecimal("CIOT");
        this.regEspTribut = vo.asString("REGESPTRIBUT");
        this.exigeIssqn = vo.asString("EXIGEISSQN");
        this.sitEspecialResp = vo.asString("SITESPECIALRESP");
        this.motNaoReterIssqn = vo.asString("MOTNAORETERISSQN");
        this.chaveNfeRef = vo.asString("CHAVENFEREF");
        this.clasCons = vo.asString("CLASCONS");
        this.fusoEmissEpec = vo.asString("FUSOEMISSEPEC");
        this.formPgtCte = vo.asString("FORMPGTCTE");
        this.codCidPrest = vo.asBigDecimal("CODCIDPREST");
        this.descTermAcord = vo.asBigDecimal("DESCTERMACORD");
        this.termAcordNota = vo.asString("TERMACORDNOTA");
        this.vlrIcmsFcpInt = vo.asBigDecimal("VLRICMSFCPINT");
        this.vlrStFcpInt = vo.asBigDecimal("VLRSTFCPINT");
        this.vlrStFcpIntAnt = vo.asBigDecimal("VLRSTFCPINTANT");
        this.tpAmbNfse = vo.asString("TPAMBNFSE");
        this.timCodProd = vo.asBigDecimal("TIMCODPROD");
        this.timDescProd = vo.asString("TIMDESCPROD");
        this.nfseId = vo.asString("NFSEID");
        this.premiacaoEstadual = vo.asString("PREMIACAOESTADUAL");
        this.codDocArrecad = vo.asBigDecimal("CODDOCARRECAD");
        this.numDocArrecad = vo.asString("NUMDOCARRECAD");
        this.vlrIcmsDiferido = vo.asBigDecimal("VLRICMSDIFERIDO");
        this.latitude = vo.asString("LATITUDE");
        this.longitude = vo.asString("LONGITUDE");
        this.nuPedFrete = vo.asBigDecimal("NUPEDFRETE");
        this.nuOdp = vo.asBigDecimal("NUODP");
        this.codRastreamentoEct = vo.asString("CODRASTREAMENTOECT");
        this.codCidFimCte = vo.asBigDecimal("CODCIDFIMCTE");
        this.codCidIniCte = vo.asBigDecimal("CODCIDINICTE");
        this.cteGlobal = vo.asString("CTEGLOBAL");
        this.vlrCargaAverb = vo.asBigDecimal("VLRCARGAAVERB");
        this.percDescFob = vo.asBigDecimal("PERCDESCFOB");
        this.sumVlrIiOutNota = vo.asBigDecimal("SUMVLRIIOUTNOTA");
        this.dhViagem = vo.asTimestamp("DHVIAGEM");
        this.nuSessao = vo.asBigDecimal("NUSESSAO");
        this.tpFretamento = vo.asBigDecimal("TPFRETAMENTO");
        this.codParcRetirada = vo.asBigDecimal("CODPARCRETIRADA");
        this.notaPorPedidoPdv = vo.asString("NOTAPORPEDIDOPDV");
        this.chaveCteRef = vo.asString("CHAVECTEREF");
        this.valorDesonPisCofins = vo.asBigDecimal("VALORDESONPISCOFINS");
        this.codInterm = vo.asBigDecimal("CODINTERM");
        this.intermed = vo.asString("INTERMED");
        this.vlrFetHab = vo.asBigDecimal("VLRFETHAB");
        this.fistel = vo.asString("FISTEL");
        this.md5ModComTel = vo.asString("MD5MODCOMTEL");
        this.numCstc = vo.asBigDecimal("NUMCSTC");
        this.numTermTel = vo.asString("NUMTERMTEL");
        this.qtdUsu = vo.asBigDecimal("QTDUSU");
        this.tipClienteServCom = vo.asBigDecimal("TIPCLIENTESERVCOM");
        this.indNegModal = vo.asString("INDNEGMODAL");
        this.baseIcmsStFrete = vo.asBigDecimal("BASEICMSSTFRETE");
        this.icmsStFrete = vo.asBigDecimal("ICMSSTFRETE");
        this.vlrRepRedSt = vo.asBigDecimal("VLRREPREDST");
        this.baseIcmsAt = vo.asBigDecimal("BASEICMSAT");
        this.vlrIcmsAt = vo.asBigDecimal("VLRICMSAT");
        this.codCheckout = vo.asBigDecimal("CODCHECKOUT");
        this.clienteIdParceria = vo.asBigDecimal("CLIENTEIDPARCERIA");
        this.idDescParceria = vo.asBigDecimal("IDDESCPARCERIA");
        this.idPontuacaoParceria = vo.asBigDecimal("IDPONTUACAOPARCERIA");
        this.vlrDescParceria = vo.asBigDecimal("VLRDESCPARCERIA");
        this.qtdProdDistintos = vo.asBigDecimal("QTDPRODDISTINTOS");
        this.disDesautImpEmb = vo.asString("DISDESAUTIMPEMB");
        this.contabilizado = vo.asString("CONTABILIZADO");
        this.nuNotaRec = vo.asBigDecimal("NUNOTAREC");
        this.nuRecebimento = vo.asBigDecimal("NURECEBIMENTO");
        this.retGerWms = vo.asString("RETGERWMS");
        this.retornoEquipFiscal = vo.asString("RETORNOEQUIPFISCAL");
        this.somIcmsNfeNac = vo.asBigDecimal("SOMICMSNFENAC");
        this.somPisCofNfeNac = vo.asBigDecimal("SOMPISCOFNFENAC");
        this.statusCfe = vo.asString("STATUSCFE");
        this.dtValAutVendaMais = vo.asTimestamp("DTVALAUTVENDAMAIS");
        this.histConfig = vo.asString("HISTCONFIG");
        this.serieNfse = vo.asString("SERIENFSE");
        this.cpfRespTec = vo.asString("CPFRESPTEC");
        this.numGuia = vo.asBigDecimal("NUMGUIA");
        this.numReceitaGro = vo.asString("NUMRECEITAGRO");
        this.serieGuia = vo.asString("SERIEGUIA");
        this.tipoGuia = vo.asString("TIPOGUIA");
        this.ufEmissao = vo.asString("UFEMISSAO");
        this.caracAd = vo.asString("CARACAD");
        this.caracSer = vo.asString("CARACSER");
        this.somDespAdUnfeNac = vo.asBigDecimal("SOMDESPADUNFENAC");
        this.codAuthVm = vo.asString("CODAUTHVM");
        this.numProtocInCte = vo.asString("NUMPROTOCINCTE");
        this.statusVm = vo.asString("STATUSVM");
        this.numProtocInNfe = vo.asString("NUMPROTOCINNFE");
        this.vlrRepTerc = vo.asBigDecimal("VLRREPTERC");
        this.chvNfeIneRef = vo.asString("CHVNFEINEREF");
        this.dtEscrCont = vo.asTimestamp("DTESCRCONT");
        this.modRecebPdvWeb = vo.asString("MODRECEBPDVWEB");
        this.statusAutorizacaoVm = vo.asString("STATUSAUTORIZACAOVM");
        return this;
   }
}
