package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Financiamento implements SankhyaEntity<Financiamento> {

   private String tipMulta;
   private BigDecimal vlrALiberar;
   private BigDecimal vlrAtual;
   private BigDecimal vlrBaixa;
   private BigDecimal vlrCessao;
   private BigDecimal codUsu;
   private BigDecimal codUsuBaixa;
   private BigDecimal codVeiculo;
   private String agenciaCmc7;
   private BigDecimal aliqIcms;
   private BigDecimal atraso;
   private String autorizado;
   private BigDecimal baseIcms;
   private BigDecimal carta;
   private BigDecimal cartaoDesc;
   private String cgcCpfCmc7;
   private String cgcCpfParc;
   private String chaveCte;
   private String chaveCteRef;
   private String codBarra;
   private BigDecimal codBco;
   private BigDecimal codBcoCmc7;
   private BigDecimal codCc;
   private BigDecimal codCencus;
   private BigDecimal codCfo;
   private BigDecimal codContato;
   private BigDecimal codCtabcoInt;
   private BigDecimal codEmp;
   private BigDecimal codEmpBaixa;
   private BigDecimal codFunc;
   private BigDecimal codHistAc;
   private String codigoBarra;
   private BigDecimal codLanc;
   private BigDecimal codMoeda;
   private BigDecimal codNat;
   private BigDecimal codParc;
   private BigDecimal vlrDesc;
   private BigDecimal vlrDescEmbut;
   private BigDecimal vlrDesdob;
   private BigDecimal vlrFatCartao;
   private BigDecimal vlrIcms;
   private BigDecimal vlrInss;
   private BigDecimal vlrIrf;
   private BigDecimal vlrIss;
   private BigDecimal vlrJuro;
   private BigDecimal vlrJuroCalc;
   private BigDecimal vlrJuroEmbut;
   private BigDecimal vlrJuroLib;
   private BigDecimal vlrJuroNegoc;
   private BigDecimal codParcMatriz;
   private BigDecimal codProj;
   private BigDecimal codTipOper;
   private BigDecimal codTipOperBaixa;
   private BigDecimal codTipTit;
   private String baixaApi;
   private BigDecimal vlrLiquido;
   private BigDecimal vlrMoeda;
   private BigDecimal vlrMoedaBaixa;
   private BigDecimal vlrMulta;
   private BigDecimal vlrMultaCalc;
   private BigDecimal vlrMultaEmbut;
   private BigDecimal vlrMultaLib;
   private BigDecimal vlrMultaNegoc;
   private BigDecimal vlrProv;
   private BigDecimal vlrTotalCalc;
   private BigDecimal vlrTroco;
   private BigDecimal vlrVarCambial;
   private BigDecimal vlrVendor;
   private BigDecimal codVend;
   private String serieEntSafFix;
   private String serieNfDes;
   private String serieNota;
   private String serieNotaCompl;
   private String statusGnre;
   private String retornadoAc;
   private BigDecimal sequencia;
   private String contabilizadoPdd;
   private String contaCmc7;
   private BigDecimal statusLib;
   private String tipJuro;
   private String tipMarcCheq;
   private BigDecimal vlrCheque;
   private BigDecimal codUsuCobr;
   private BigDecimal vlrDescCalc;
   private BigDecimal jurosAvp;
   private String rateadoCab;
   private String tpAgNfce;
   private BigDecimal valorPresente;
   private String ctabcoBaixa;
   private String descAlineaCheqDev;
   private String descrHistAc;
   private String descrLancBco;
   private String desdobDupl;
   private String desdobramento;
   private BigDecimal despCart;
   private Timestamp dhBaixa;
   private Timestamp dhMov;
   private Timestamp dhTipOper;
   private Timestamp dhTipOperBaixa;
   private String digSafra;
   private Timestamp dtAlter;
   private Timestamp dtBaixaPrev;
   private Timestamp dtContab;
   private Timestamp dtContabBaixa;
   private Timestamp dtEntSai;
   private Timestamp dtNeg;
   private Timestamp dtNegFilter;
   private Timestamp dtVenc;
   private Timestamp dtVencInic;
   private String historico;
   private String bloqVar;
   private BigDecimal idLoteFdic;
   private String inssRetido;
   private String irfRetido;
   private String issRetido;
   private String linhaDigitavel;
   private BigDecimal m2;
   private String modeloNfDes;
   private String mostrarEneg;
   private String naturezaOperDes;
   private BigDecimal nfComplFix;
   private String nfEntSeqFix;
   private String nomeEmitenteCmc7;
   private String nossoNum;
   private String nroCessaoFdic;
   private BigDecimal nroLoteGnre;
   private BigDecimal nuAponta;
   private BigDecimal nuBco;
   private BigDecimal nuCcr;
   private BigDecimal nuCompens;
   private BigDecimal nuDev;
   private BigDecimal nuFin;
   private BigDecimal nuFtc;
   private BigDecimal numBor;
   private BigDecimal numComplFix;
   private BigDecimal numContrato;
   private BigDecimal numDupl;
   private BigDecimal numEntSafFix;
   private String numNfse;
   private BigDecimal numNota;
   private BigDecimal numOs;
   private BigDecimal numRemessa;
   private BigDecimal numTransf;
   private BigDecimal nuNota;
   private BigDecimal nuPed;
   private BigDecimal nuReneg;
   private String observacaoAc;
   private BigDecimal ordemCarga;
   private String origem;
   private String parcReneg;
   private String pdd;
   private String pertenceAc;
   private BigDecimal prazo;
   private String provisao;
   private String rateado;
   private BigDecimal recDesp;
   private String recDespFilter;
   private String rejeicaoGnre;
   private String chequeRastreadoCmc7;
   private BigDecimal codIptu;
   private BigDecimal codRegua;
   private BigDecimal idUnico;
   private BigDecimal nuChq;
   private BigDecimal seqCaixa;
   private String timBloqueada;
   private BigDecimal timContaLanc;
   private BigDecimal timContaRep;
   private BigDecimal timContratoAdm;
   private BigDecimal timContratoLoc;
   private BigDecimal timContratoLtv;
   private Timestamp timDataDeJur;
   private Timestamp timDhBaixa;
   private Timestamp timDhGerRepasse;
   private Timestamp timDhGerRepParcial;
   private Timestamp timDtImpBol;
   private Timestamp timDtImpBolLocal;
   private Timestamp timDtRepasse;
   private Timestamp timDtRepParcial;
   private String timEstagio;
   private BigDecimal timFechamento;
   private BigDecimal timFechamentoAlu;
   private BigDecimal timFinGarantOrig;
   private BigDecimal timImovel;
   private BigDecimal timNegociacao;
   private String timNomeAdvogado;
   private BigDecimal timNuFinOrig;
   private BigDecimal timNumReg;
   private String timOrigem;
   private String timOrigReneg;
   private BigDecimal timParcela;
   private BigDecimal timRenegCancLote;
   private BigDecimal timRenegImv;
   private BigDecimal timRenegLote;
   private BigDecimal timRepInteligente;
   private String timRepParcial;
   private BigDecimal timRescisaoLoc;
   private BigDecimal timRescisaoLtv;
   private BigDecimal timTipoIntermed;
   private String timTxAdmGerAlu;
   private BigDecimal timVendaImv;
   private BigDecimal timVendaLote;
   private BigDecimal timVlrAluguel;
   private BigDecimal timVlrAmortContrato;
   private BigDecimal timVlrCorrMonet;
   private BigDecimal timVlrJuroContrato;
   private BigDecimal codObsPadrao;
   private BigDecimal timSac;
   private BigDecimal abatimentoCan;
   private BigDecimal abatimento;
   private BigDecimal codImovelRural;
   private String recAdiantamentoRural;
   private Timestamp dtPrazo;
   private BigDecimal baseIrf;
   private BigDecimal baseInss;
   private BigDecimal classifCessaoObra;
   private BigDecimal codCbe;
   private BigDecimal codCidFimCte;
   private BigDecimal codCidIniCte;
   private BigDecimal codLst;
   private String codObra;
   private BigDecimal codTrib;
   private String custasProcessuais;
   private String depositoJudicial;
   private String despAdvogado;
   private String exigeIssqn;
   private String motNaoReterIssqn;
   private String numProcAdmJudic;
   private BigDecimal obraConstCivil;
   private String regEspTribut;
   private String sitEspecialResp;
   private String recebCartao;
   private BigDecimal vlrJurosMaisMulta;
   private BigDecimal atrasoInicial;
   private BigDecimal prazoInicial;
   private BigDecimal percDesc;
   private String monioCorEm;
   private BigDecimal nuCkc;
   private String chaveNfeGnre;
   private String indReceFdCont;
   private String infCompleFdCont;
   private String conciliado;
   private Timestamp dhConcil;
   private String emvPix;
   private String chavePix;
   private Timestamp dtInitRefApuracao;
   private String idTransacaoPix;
   private BigDecimal subTipoVenda;
   private BigDecimal trocoPdv;
   private String tipApuracao;
   private String descrTpagNfce;
   private Timestamp dtAntecipacao;
   private BigDecimal nuAntBanc;
   private String antecipado;
   private Timestamp dtEntSaiInfo;
   private BigDecimal vlrGnreDois;
   private String recebido;
   private Timestamp refAtCon;
   private String codReceita;
   private String contabilizado;
   private Timestamp dtIntegracaoIpi;
   private Timestamp dtReferencia;
   private String numDocArrecad;
   private BigDecimal nuVerba;
   private BigDecimal vlrDesdobCalc;
   private BigDecimal vlrLancOrig;
   private BigDecimal nroImport;
   private BigDecimal nuCaixa;
   private String sangDespPdv;
   private String codPror;
   private BigDecimal codUsuPror;
   private Timestamp dtPror;
   private Timestamp nvDtVenc;
   private String pendenteCriarDesp;
   private String prorrogado;
   private String numOcorrencias;
   private String metodoCalcIrrf;
   private BigDecimal vlrIcmsXmlCte;
   private BigDecimal pixTef;
   private String codOperacaoVendaMais;
   private Timestamp dhAprovacaoVendaMais;
   private Timestamp dhImpressao;
   private BigDecimal taxaVendaMais;
   private String vendaMais;

   public String getTipMulta() {
        return tipMulta;
   }

   public void setTipMulta(String tipMulta) {
        this.tipMulta = tipMulta;
   }

   public BigDecimal getVlrALiberar() {
        return vlrALiberar;
   }

   public void setVlrALiberar(BigDecimal vlrALiberar) {
        this.vlrALiberar = vlrALiberar;
   }

   public BigDecimal getVlrAtual() {
        return vlrAtual;
   }

   public void setVlrAtual(BigDecimal vlrAtual) {
        this.vlrAtual = vlrAtual;
   }

   public BigDecimal getVlrBaixa() {
        return vlrBaixa;
   }

   public void setVlrBaixa(BigDecimal vlrBaixa) {
        this.vlrBaixa = vlrBaixa;
   }

   public BigDecimal getVlrCessao() {
        return vlrCessao;
   }

   public void setVlrCessao(BigDecimal vlrCessao) {
        this.vlrCessao = vlrCessao;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuBaixa() {
        return codUsuBaixa;
   }

   public void setCodUsuBaixa(BigDecimal codUsuBaixa) {
        this.codUsuBaixa = codUsuBaixa;
   }

   public BigDecimal getCodVeiculo() {
        return codVeiculo;
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        this.codVeiculo = codVeiculo;
   }

   public String getAgenciaCmc7() {
        return agenciaCmc7;
   }

   public void setAgenciaCmc7(String agenciaCmc7) {
        this.agenciaCmc7 = agenciaCmc7;
   }

   public BigDecimal getAliqIcms() {
        return aliqIcms;
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
   }

   public BigDecimal getAtraso() {
        return atraso;
   }

   public void setAtraso(BigDecimal atraso) {
        this.atraso = atraso;
   }

   public String getAutorizado() {
        return autorizado;
   }

   public void setAutorizado(String autorizado) {
        this.autorizado = autorizado;
   }

   public BigDecimal getBaseIcms() {
        return baseIcms;
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        this.baseIcms = baseIcms;
   }

   public BigDecimal getCarta() {
        return carta;
   }

   public void setCarta(BigDecimal carta) {
        this.carta = carta;
   }

   public BigDecimal getCartaoDesc() {
        return cartaoDesc;
   }

   public void setCartaoDesc(BigDecimal cartaoDesc) {
        this.cartaoDesc = cartaoDesc;
   }

   public String getCgcCpfCmc7() {
        return cgcCpfCmc7;
   }

   public void setCgcCpfCmc7(String cgcCpfCmc7) {
        this.cgcCpfCmc7 = cgcCpfCmc7;
   }

   public String getCgcCpfParc() {
        return cgcCpfParc;
   }

   public void setCgcCpfParc(String cgcCpfParc) {
        this.cgcCpfParc = cgcCpfParc;
   }

   public String getChaveCte() {
        return chaveCte;
   }

   public void setChaveCte(String chaveCte) {
        this.chaveCte = chaveCte;
   }

   public String getChaveCteRef() {
        return chaveCteRef;
   }

   public void setChaveCteRef(String chaveCteRef) {
        this.chaveCteRef = chaveCteRef;
   }

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
   }

   public BigDecimal getCodBco() {
        return codBco;
   }

   public void setCodBco(BigDecimal codBco) {
        this.codBco = codBco;
   }

   public BigDecimal getCodBcoCmc7() {
        return codBcoCmc7;
   }

   public void setCodBcoCmc7(BigDecimal codBcoCmc7) {
        this.codBcoCmc7 = codBcoCmc7;
   }

   public BigDecimal getCodCc() {
        return codCc;
   }

   public void setCodCc(BigDecimal codCc) {
        this.codCc = codCc;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        this.codCencus = codCencus;
   }

   public BigDecimal getCodCfo() {
        return codCfo;
   }

   public void setCodCfo(BigDecimal codCfo) {
        this.codCfo = codCfo;
   }

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        this.codContato = codContato;
   }

   public BigDecimal getCodCtabcoInt() {
        return codCtabcoInt;
   }

   public void setCodCtabcoInt(BigDecimal codCtabcoInt) {
        this.codCtabcoInt = codCtabcoInt;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEmpBaixa() {
        return codEmpBaixa;
   }

   public void setCodEmpBaixa(BigDecimal codEmpBaixa) {
        this.codEmpBaixa = codEmpBaixa;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        this.codFunc = codFunc;
   }

   public BigDecimal getCodHistAc() {
        return codHistAc;
   }

   public void setCodHistAc(BigDecimal codHistAc) {
        this.codHistAc = codHistAc;
   }

   public String getCodigoBarra() {
        return codigoBarra;
   }

   public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
   }

   public BigDecimal getCodLanc() {
        return codLanc;
   }

   public void setCodLanc(BigDecimal codLanc) {
        this.codLanc = codLanc;
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

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getVlrDesc() {
        return vlrDesc;
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        this.vlrDesc = vlrDesc;
   }

   public BigDecimal getVlrDescEmbut() {
        return vlrDescEmbut;
   }

   public void setVlrDescEmbut(BigDecimal vlrDescEmbut) {
        this.vlrDescEmbut = vlrDescEmbut;
   }

   public BigDecimal getVlrDesdob() {
        return vlrDesdob;
   }

   public void setVlrDesdob(BigDecimal vlrDesdob) {
        this.vlrDesdob = vlrDesdob;
   }

   public BigDecimal getVlrFatCartao() {
        return vlrFatCartao;
   }

   public void setVlrFatCartao(BigDecimal vlrFatCartao) {
        this.vlrFatCartao = vlrFatCartao;
   }

   public BigDecimal getVlrIcms() {
        return vlrIcms;
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        this.vlrIcms = vlrIcms;
   }

   public BigDecimal getVlrInss() {
        return vlrInss;
   }

   public void setVlrInss(BigDecimal vlrInss) {
        this.vlrInss = vlrInss;
   }

   public BigDecimal getVlrIrf() {
        return vlrIrf;
   }

   public void setVlrIrf(BigDecimal vlrIrf) {
        this.vlrIrf = vlrIrf;
   }

   public BigDecimal getVlrIss() {
        return vlrIss;
   }

   public void setVlrIss(BigDecimal vlrIss) {
        this.vlrIss = vlrIss;
   }

   public BigDecimal getVlrJuro() {
        return vlrJuro;
   }

   public void setVlrJuro(BigDecimal vlrJuro) {
        this.vlrJuro = vlrJuro;
   }

   public BigDecimal getVlrJuroCalc() {
        return vlrJuroCalc;
   }

   public void setVlrJuroCalc(BigDecimal vlrJuroCalc) {
        this.vlrJuroCalc = vlrJuroCalc;
   }

   public BigDecimal getVlrJuroEmbut() {
        return vlrJuroEmbut;
   }

   public void setVlrJuroEmbut(BigDecimal vlrJuroEmbut) {
        this.vlrJuroEmbut = vlrJuroEmbut;
   }

   public BigDecimal getVlrJuroLib() {
        return vlrJuroLib;
   }

   public void setVlrJuroLib(BigDecimal vlrJuroLib) {
        this.vlrJuroLib = vlrJuroLib;
   }

   public BigDecimal getVlrJuroNegoc() {
        return vlrJuroNegoc;
   }

   public void setVlrJuroNegoc(BigDecimal vlrJuroNegoc) {
        this.vlrJuroNegoc = vlrJuroNegoc;
   }

   public BigDecimal getCodParcMatriz() {
        return codParcMatriz;
   }

   public void setCodParcMatriz(BigDecimal codParcMatriz) {
        this.codParcMatriz = codParcMatriz;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        this.codProj = codProj;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCodTipOperBaixa() {
        return codTipOperBaixa;
   }

   public void setCodTipOperBaixa(BigDecimal codTipOperBaixa) {
        this.codTipOperBaixa = codTipOperBaixa;
   }

   public BigDecimal getCodTipTit() {
        return codTipTit;
   }

   public void setCodTipTit(BigDecimal codTipTit) {
        this.codTipTit = codTipTit;
   }

   public String getBaixaApi() {
        return baixaApi;
   }

   public void setBaixaApi(String baixaApi) {
        this.baixaApi = baixaApi;
   }

   public BigDecimal getVlrLiquido() {
        return vlrLiquido;
   }

   public void setVlrLiquido(BigDecimal vlrLiquido) {
        this.vlrLiquido = vlrLiquido;
   }

   public BigDecimal getVlrMoeda() {
        return vlrMoeda;
   }

   public void setVlrMoeda(BigDecimal vlrMoeda) {
        this.vlrMoeda = vlrMoeda;
   }

   public BigDecimal getVlrMoedaBaixa() {
        return vlrMoedaBaixa;
   }

   public void setVlrMoedaBaixa(BigDecimal vlrMoedaBaixa) {
        this.vlrMoedaBaixa = vlrMoedaBaixa;
   }

   public BigDecimal getVlrMulta() {
        return vlrMulta;
   }

   public void setVlrMulta(BigDecimal vlrMulta) {
        this.vlrMulta = vlrMulta;
   }

   public BigDecimal getVlrMultaCalc() {
        return vlrMultaCalc;
   }

   public void setVlrMultaCalc(BigDecimal vlrMultaCalc) {
        this.vlrMultaCalc = vlrMultaCalc;
   }

   public BigDecimal getVlrMultaEmbut() {
        return vlrMultaEmbut;
   }

   public void setVlrMultaEmbut(BigDecimal vlrMultaEmbut) {
        this.vlrMultaEmbut = vlrMultaEmbut;
   }

   public BigDecimal getVlrMultaLib() {
        return vlrMultaLib;
   }

   public void setVlrMultaLib(BigDecimal vlrMultaLib) {
        this.vlrMultaLib = vlrMultaLib;
   }

   public BigDecimal getVlrMultaNegoc() {
        return vlrMultaNegoc;
   }

   public void setVlrMultaNegoc(BigDecimal vlrMultaNegoc) {
        this.vlrMultaNegoc = vlrMultaNegoc;
   }

   public BigDecimal getVlrProv() {
        return vlrProv;
   }

   public void setVlrProv(BigDecimal vlrProv) {
        this.vlrProv = vlrProv;
   }

   public BigDecimal getVlrTotalCalc() {
        return vlrTotalCalc;
   }

   public void setVlrTotalCalc(BigDecimal vlrTotalCalc) {
        this.vlrTotalCalc = vlrTotalCalc;
   }

   public BigDecimal getVlrTroco() {
        return vlrTroco;
   }

   public void setVlrTroco(BigDecimal vlrTroco) {
        this.vlrTroco = vlrTroco;
   }

   public BigDecimal getVlrVarCambial() {
        return vlrVarCambial;
   }

   public void setVlrVarCambial(BigDecimal vlrVarCambial) {
        this.vlrVarCambial = vlrVarCambial;
   }

   public BigDecimal getVlrVendor() {
        return vlrVendor;
   }

   public void setVlrVendor(BigDecimal vlrVendor) {
        this.vlrVendor = vlrVendor;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        this.codVend = codVend;
   }

   public String getSerieEntSafFix() {
        return serieEntSafFix;
   }

   public void setSerieEntSafFix(String serieEntSafFix) {
        this.serieEntSafFix = serieEntSafFix;
   }

   public String getSerieNfDes() {
        return serieNfDes;
   }

   public void setSerieNfDes(String serieNfDes) {
        this.serieNfDes = serieNfDes;
   }

   public String getSerieNota() {
        return serieNota;
   }

   public void setSerieNota(String serieNota) {
        this.serieNota = serieNota;
   }

   public String getSerieNotaCompl() {
        return serieNotaCompl;
   }

   public void setSerieNotaCompl(String serieNotaCompl) {
        this.serieNotaCompl = serieNotaCompl;
   }

   public String getStatusGnre() {
        return statusGnre;
   }

   public void setStatusGnre(String statusGnre) {
        this.statusGnre = statusGnre;
   }

   public String getRetornadoAc() {
        return retornadoAc;
   }

   public void setRetornadoAc(String retornadoAc) {
        this.retornadoAc = retornadoAc;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getContabilizadoPdd() {
        return contabilizadoPdd;
   }

   public void setContabilizadoPdd(String contabilizadoPdd) {
        this.contabilizadoPdd = contabilizadoPdd;
   }

   public String getContaCmc7() {
        return contaCmc7;
   }

   public void setContaCmc7(String contaCmc7) {
        this.contaCmc7 = contaCmc7;
   }

   public BigDecimal getStatusLib() {
        return statusLib;
   }

   public void setStatusLib(BigDecimal statusLib) {
        this.statusLib = statusLib;
   }

   public String getTipJuro() {
        return tipJuro;
   }

   public void setTipJuro(String tipJuro) {
        this.tipJuro = tipJuro;
   }

   public String getTipMarcCheq() {
        return tipMarcCheq;
   }

   public void setTipMarcCheq(String tipMarcCheq) {
        this.tipMarcCheq = tipMarcCheq;
   }

   public BigDecimal getVlrCheque() {
        return vlrCheque;
   }

   public void setVlrCheque(BigDecimal vlrCheque) {
        this.vlrCheque = vlrCheque;
   }

   public BigDecimal getCodUsuCobr() {
        return codUsuCobr;
   }

   public void setCodUsuCobr(BigDecimal codUsuCobr) {
        this.codUsuCobr = codUsuCobr;
   }

   public BigDecimal getVlrDescCalc() {
        return vlrDescCalc;
   }

   public void setVlrDescCalc(BigDecimal vlrDescCalc) {
        this.vlrDescCalc = vlrDescCalc;
   }

   public BigDecimal getJurosAvp() {
        return jurosAvp;
   }

   public void setJurosAvp(BigDecimal jurosAvp) {
        this.jurosAvp = jurosAvp;
   }

   public String getRateadoCab() {
        return rateadoCab;
   }

   public void setRateadoCab(String rateadoCab) {
        this.rateadoCab = rateadoCab;
   }

   public String getTpAgNfce() {
        return tpAgNfce;
   }

   public void setTpAgNfce(String tpAgNfce) {
        this.tpAgNfce = tpAgNfce;
   }

   public BigDecimal getValorPresente() {
        return valorPresente;
   }

   public void setValorPresente(BigDecimal valorPresente) {
        this.valorPresente = valorPresente;
   }

   public String getCtabcoBaixa() {
        return ctabcoBaixa;
   }

   public void setCtabcoBaixa(String ctabcoBaixa) {
        this.ctabcoBaixa = ctabcoBaixa;
   }

   public String getDescAlineaCheqDev() {
        return descAlineaCheqDev;
   }

   public void setDescAlineaCheqDev(String descAlineaCheqDev) {
        this.descAlineaCheqDev = descAlineaCheqDev;
   }

   public String getDescrHistAc() {
        return descrHistAc;
   }

   public void setDescrHistAc(String descrHistAc) {
        this.descrHistAc = descrHistAc;
   }

   public String getDescrLancBco() {
        return descrLancBco;
   }

   public void setDescrLancBco(String descrLancBco) {
        this.descrLancBco = descrLancBco;
   }

   public String getDesdobDupl() {
        return desdobDupl;
   }

   public void setDesdobDupl(String desdobDupl) {
        this.desdobDupl = desdobDupl;
   }

   public String getDesdobramento() {
        return desdobramento;
   }

   public void setDesdobramento(String desdobramento) {
        this.desdobramento = desdobramento;
   }

   public BigDecimal getDespCart() {
        return despCart;
   }

   public void setDespCart(BigDecimal despCart) {
        this.despCart = despCart;
   }

   public Timestamp getDhBaixa() {
        return dhBaixa;
   }

   public void setDhBaixa(Timestamp dhBaixa) {
        this.dhBaixa = dhBaixa;
   }

   public Timestamp getDhMov() {
        return dhMov;
   }

   public void setDhMov(Timestamp dhMov) {
        this.dhMov = dhMov;
   }

   public Timestamp getDhTipOper() {
        return dhTipOper;
   }

   public void setDhTipOper(Timestamp dhTipOper) {
        this.dhTipOper = dhTipOper;
   }

   public Timestamp getDhTipOperBaixa() {
        return dhTipOperBaixa;
   }

   public void setDhTipOperBaixa(Timestamp dhTipOperBaixa) {
        this.dhTipOperBaixa = dhTipOperBaixa;
   }

   public String getDigSafra() {
        return digSafra;
   }

   public void setDigSafra(String digSafra) {
        this.digSafra = digSafra;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtBaixaPrev() {
        return dtBaixaPrev;
   }

   public void setDtBaixaPrev(Timestamp dtBaixaPrev) {
        this.dtBaixaPrev = dtBaixaPrev;
   }

   public Timestamp getDtContab() {
        return dtContab;
   }

   public void setDtContab(Timestamp dtContab) {
        this.dtContab = dtContab;
   }

   public Timestamp getDtContabBaixa() {
        return dtContabBaixa;
   }

   public void setDtContabBaixa(Timestamp dtContabBaixa) {
        this.dtContabBaixa = dtContabBaixa;
   }

   public Timestamp getDtEntSai() {
        return dtEntSai;
   }

   public void setDtEntSai(Timestamp dtEntSai) {
        this.dtEntSai = dtEntSai;
   }

   public Timestamp getDtNeg() {
        return dtNeg;
   }

   public void setDtNeg(Timestamp dtNeg) {
        this.dtNeg = dtNeg;
   }

   public Timestamp getDtNegFilter() {
        return dtNegFilter;
   }

   public void setDtNegFilter(Timestamp dtNegFilter) {
        this.dtNegFilter = dtNegFilter;
   }

   public Timestamp getDtVenc() {
        return dtVenc;
   }

   public void setDtVenc(Timestamp dtVenc) {
        this.dtVenc = dtVenc;
   }

   public Timestamp getDtVencInic() {
        return dtVencInic;
   }

   public void setDtVencInic(Timestamp dtVencInic) {
        this.dtVencInic = dtVencInic;
   }

   public String getHistorico() {
        return historico;
   }

   public void setHistorico(String historico) {
        this.historico = historico;
   }

   public String getBloqVar() {
        return bloqVar;
   }

   public void setBloqVar(String bloqVar) {
        this.bloqVar = bloqVar;
   }

   public BigDecimal getIdLoteFdic() {
        return idLoteFdic;
   }

   public void setIdLoteFdic(BigDecimal idLoteFdic) {
        this.idLoteFdic = idLoteFdic;
   }

   public String getInssRetido() {
        return inssRetido;
   }

   public void setInssRetido(String inssRetido) {
        this.inssRetido = inssRetido;
   }

   public String getIrfRetido() {
        return irfRetido;
   }

   public void setIrfRetido(String irfRetido) {
        this.irfRetido = irfRetido;
   }

   public String getIssRetido() {
        return issRetido;
   }

   public void setIssRetido(String issRetido) {
        this.issRetido = issRetido;
   }

   public String getLinhaDigitavel() {
        return linhaDigitavel;
   }

   public void setLinhaDigitavel(String linhaDigitavel) {
        this.linhaDigitavel = linhaDigitavel;
   }

   public BigDecimal getM2() {
        return m2;
   }

   public void setM2(BigDecimal m2) {
        this.m2 = m2;
   }

   public String getModeloNfDes() {
        return modeloNfDes;
   }

   public void setModeloNfDes(String modeloNfDes) {
        this.modeloNfDes = modeloNfDes;
   }

   public String getMostrarEneg() {
        return mostrarEneg;
   }

   public void setMostrarEneg(String mostrarEneg) {
        this.mostrarEneg = mostrarEneg;
   }

   public String getNaturezaOperDes() {
        return naturezaOperDes;
   }

   public void setNaturezaOperDes(String naturezaOperDes) {
        this.naturezaOperDes = naturezaOperDes;
   }

   public BigDecimal getNfComplFix() {
        return nfComplFix;
   }

   public void setNfComplFix(BigDecimal nfComplFix) {
        this.nfComplFix = nfComplFix;
   }

   public String getNfEntSeqFix() {
        return nfEntSeqFix;
   }

   public void setNfEntSeqFix(String nfEntSeqFix) {
        this.nfEntSeqFix = nfEntSeqFix;
   }

   public String getNomeEmitenteCmc7() {
        return nomeEmitenteCmc7;
   }

   public void setNomeEmitenteCmc7(String nomeEmitenteCmc7) {
        this.nomeEmitenteCmc7 = nomeEmitenteCmc7;
   }

   public String getNossoNum() {
        return nossoNum;
   }

   public void setNossoNum(String nossoNum) {
        this.nossoNum = nossoNum;
   }

   public String getNroCessaoFdic() {
        return nroCessaoFdic;
   }

   public void setNroCessaoFdic(String nroCessaoFdic) {
        this.nroCessaoFdic = nroCessaoFdic;
   }

   public BigDecimal getNroLoteGnre() {
        return nroLoteGnre;
   }

   public void setNroLoteGnre(BigDecimal nroLoteGnre) {
        this.nroLoteGnre = nroLoteGnre;
   }

   public BigDecimal getNuAponta() {
        return nuAponta;
   }

   public void setNuAponta(BigDecimal nuAponta) {
        this.nuAponta = nuAponta;
   }

   public BigDecimal getNuBco() {
        return nuBco;
   }

   public void setNuBco(BigDecimal nuBco) {
        this.nuBco = nuBco;
   }

   public BigDecimal getNuCcr() {
        return nuCcr;
   }

   public void setNuCcr(BigDecimal nuCcr) {
        this.nuCcr = nuCcr;
   }

   public BigDecimal getNuCompens() {
        return nuCompens;
   }

   public void setNuCompens(BigDecimal nuCompens) {
        this.nuCompens = nuCompens;
   }

   public BigDecimal getNuDev() {
        return nuDev;
   }

   public void setNuDev(BigDecimal nuDev) {
        this.nuDev = nuDev;
   }

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        this.nuFin = nuFin;
   }

   public BigDecimal getNuFtc() {
        return nuFtc;
   }

   public void setNuFtc(BigDecimal nuFtc) {
        this.nuFtc = nuFtc;
   }

   public BigDecimal getNumBor() {
        return numBor;
   }

   public void setNumBor(BigDecimal numBor) {
        this.numBor = numBor;
   }

   public BigDecimal getNumComplFix() {
        return numComplFix;
   }

   public void setNumComplFix(BigDecimal numComplFix) {
        this.numComplFix = numComplFix;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        this.numContrato = numContrato;
   }

   public BigDecimal getNumDupl() {
        return numDupl;
   }

   public void setNumDupl(BigDecimal numDupl) {
        this.numDupl = numDupl;
   }

   public BigDecimal getNumEntSafFix() {
        return numEntSafFix;
   }

   public void setNumEntSafFix(BigDecimal numEntSafFix) {
        this.numEntSafFix = numEntSafFix;
   }

   public String getNumNfse() {
        return numNfse;
   }

   public void setNumNfse(String numNfse) {
        this.numNfse = numNfse;
   }

   public BigDecimal getNumNota() {
        return numNota;
   }

   public void setNumNota(BigDecimal numNota) {
        this.numNota = numNota;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        this.numOs = numOs;
   }

   public BigDecimal getNumRemessa() {
        return numRemessa;
   }

   public void setNumRemessa(BigDecimal numRemessa) {
        this.numRemessa = numRemessa;
   }

   public BigDecimal getNumTransf() {
        return numTransf;
   }

   public void setNumTransf(BigDecimal numTransf) {
        this.numTransf = numTransf;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getNuPed() {
        return nuPed;
   }

   public void setNuPed(BigDecimal nuPed) {
        this.nuPed = nuPed;
   }

   public BigDecimal getNuReneg() {
        return nuReneg;
   }

   public void setNuReneg(BigDecimal nuReneg) {
        this.nuReneg = nuReneg;
   }

   public String getObservacaoAc() {
        return observacaoAc;
   }

   public void setObservacaoAc(String observacaoAc) {
        this.observacaoAc = observacaoAc;
   }

   public BigDecimal getOrdemCarga() {
        return ordemCarga;
   }

   public void setOrdemCarga(BigDecimal ordemCarga) {
        this.ordemCarga = ordemCarga;
   }

   public String getOrigem() {
        return origem;
   }

   public void setOrigem(String origem) {
        this.origem = origem;
   }

   public String getParcReneg() {
        return parcReneg;
   }

   public void setParcReneg(String parcReneg) {
        this.parcReneg = parcReneg;
   }

   public String getPdd() {
        return pdd;
   }

   public void setPdd(String pdd) {
        this.pdd = pdd;
   }

   public String getPertenceAc() {
        return pertenceAc;
   }

   public void setPertenceAc(String pertenceAc) {
        this.pertenceAc = pertenceAc;
   }

   public BigDecimal getPrazo() {
        return prazo;
   }

   public void setPrazo(BigDecimal prazo) {
        this.prazo = prazo;
   }

   public String getProvisao() {
        return provisao;
   }

   public void setProvisao(String provisao) {
        this.provisao = provisao;
   }

   public String getRateado() {
        return rateado;
   }

   public void setRateado(String rateado) {
        this.rateado = rateado;
   }

   public BigDecimal getRecDesp() {
        return recDesp;
   }

   public void setRecDesp(BigDecimal recDesp) {
        this.recDesp = recDesp;
   }

   public String getRecDespFilter() {
        return recDespFilter;
   }

   public void setRecDespFilter(String recDespFilter) {
        this.recDespFilter = recDespFilter;
   }

   public String getRejeicaoGnre() {
        return rejeicaoGnre;
   }

   public void setRejeicaoGnre(String rejeicaoGnre) {
        this.rejeicaoGnre = rejeicaoGnre;
   }

   public String getChequeRastreadoCmc7() {
        return chequeRastreadoCmc7;
   }

   public void setChequeRastreadoCmc7(String chequeRastreadoCmc7) {
        this.chequeRastreadoCmc7 = chequeRastreadoCmc7;
   }

   public BigDecimal getCodIptu() {
        return codIptu;
   }

   public void setCodIptu(BigDecimal codIptu) {
        this.codIptu = codIptu;
   }

   public BigDecimal getCodRegua() {
        return codRegua;
   }

   public void setCodRegua(BigDecimal codRegua) {
        this.codRegua = codRegua;
   }

   public BigDecimal getIdUnico() {
        return idUnico;
   }

   public void setIdUnico(BigDecimal idUnico) {
        this.idUnico = idUnico;
   }

   public BigDecimal getNuChq() {
        return nuChq;
   }

   public void setNuChq(BigDecimal nuChq) {
        this.nuChq = nuChq;
   }

   public BigDecimal getSeqCaixa() {
        return seqCaixa;
   }

   public void setSeqCaixa(BigDecimal seqCaixa) {
        this.seqCaixa = seqCaixa;
   }

   public String getTimBloqueada() {
        return timBloqueada;
   }

   public void setTimBloqueada(String timBloqueada) {
        this.timBloqueada = timBloqueada;
   }

   public BigDecimal getTimContaLanc() {
        return timContaLanc;
   }

   public void setTimContaLanc(BigDecimal timContaLanc) {
        this.timContaLanc = timContaLanc;
   }

   public BigDecimal getTimContaRep() {
        return timContaRep;
   }

   public void setTimContaRep(BigDecimal timContaRep) {
        this.timContaRep = timContaRep;
   }

   public BigDecimal getTimContratoAdm() {
        return timContratoAdm;
   }

   public void setTimContratoAdm(BigDecimal timContratoAdm) {
        this.timContratoAdm = timContratoAdm;
   }

   public BigDecimal getTimContratoLoc() {
        return timContratoLoc;
   }

   public void setTimContratoLoc(BigDecimal timContratoLoc) {
        this.timContratoLoc = timContratoLoc;
   }

   public BigDecimal getTimContratoLtv() {
        return timContratoLtv;
   }

   public void setTimContratoLtv(BigDecimal timContratoLtv) {
        this.timContratoLtv = timContratoLtv;
   }

   public Timestamp getTimDataDeJur() {
        return timDataDeJur;
   }

   public void setTimDataDeJur(Timestamp timDataDeJur) {
        this.timDataDeJur = timDataDeJur;
   }

   public Timestamp getTimDhBaixa() {
        return timDhBaixa;
   }

   public void setTimDhBaixa(Timestamp timDhBaixa) {
        this.timDhBaixa = timDhBaixa;
   }

   public Timestamp getTimDhGerRepasse() {
        return timDhGerRepasse;
   }

   public void setTimDhGerRepasse(Timestamp timDhGerRepasse) {
        this.timDhGerRepasse = timDhGerRepasse;
   }

   public Timestamp getTimDhGerRepParcial() {
        return timDhGerRepParcial;
   }

   public void setTimDhGerRepParcial(Timestamp timDhGerRepParcial) {
        this.timDhGerRepParcial = timDhGerRepParcial;
   }

   public Timestamp getTimDtImpBol() {
        return timDtImpBol;
   }

   public void setTimDtImpBol(Timestamp timDtImpBol) {
        this.timDtImpBol = timDtImpBol;
   }

   public Timestamp getTimDtImpBolLocal() {
        return timDtImpBolLocal;
   }

   public void setTimDtImpBolLocal(Timestamp timDtImpBolLocal) {
        this.timDtImpBolLocal = timDtImpBolLocal;
   }

   public Timestamp getTimDtRepasse() {
        return timDtRepasse;
   }

   public void setTimDtRepasse(Timestamp timDtRepasse) {
        this.timDtRepasse = timDtRepasse;
   }

   public Timestamp getTimDtRepParcial() {
        return timDtRepParcial;
   }

   public void setTimDtRepParcial(Timestamp timDtRepParcial) {
        this.timDtRepParcial = timDtRepParcial;
   }

   public String getTimEstagio() {
        return timEstagio;
   }

   public void setTimEstagio(String timEstagio) {
        this.timEstagio = timEstagio;
   }

   public BigDecimal getTimFechamento() {
        return timFechamento;
   }

   public void setTimFechamento(BigDecimal timFechamento) {
        this.timFechamento = timFechamento;
   }

   public BigDecimal getTimFechamentoAlu() {
        return timFechamentoAlu;
   }

   public void setTimFechamentoAlu(BigDecimal timFechamentoAlu) {
        this.timFechamentoAlu = timFechamentoAlu;
   }

   public BigDecimal getTimFinGarantOrig() {
        return timFinGarantOrig;
   }

   public void setTimFinGarantOrig(BigDecimal timFinGarantOrig) {
        this.timFinGarantOrig = timFinGarantOrig;
   }

   public BigDecimal getTimImovel() {
        return timImovel;
   }

   public void setTimImovel(BigDecimal timImovel) {
        this.timImovel = timImovel;
   }

   public BigDecimal getTimNegociacao() {
        return timNegociacao;
   }

   public void setTimNegociacao(BigDecimal timNegociacao) {
        this.timNegociacao = timNegociacao;
   }

   public String getTimNomeAdvogado() {
        return timNomeAdvogado;
   }

   public void setTimNomeAdvogado(String timNomeAdvogado) {
        this.timNomeAdvogado = timNomeAdvogado;
   }

   public BigDecimal getTimNuFinOrig() {
        return timNuFinOrig;
   }

   public void setTimNuFinOrig(BigDecimal timNuFinOrig) {
        this.timNuFinOrig = timNuFinOrig;
   }

   public BigDecimal getTimNumReg() {
        return timNumReg;
   }

   public void setTimNumReg(BigDecimal timNumReg) {
        this.timNumReg = timNumReg;
   }

   public String getTimOrigem() {
        return timOrigem;
   }

   public void setTimOrigem(String timOrigem) {
        this.timOrigem = timOrigem;
   }

   public String getTimOrigReneg() {
        return timOrigReneg;
   }

   public void setTimOrigReneg(String timOrigReneg) {
        this.timOrigReneg = timOrigReneg;
   }

   public BigDecimal getTimParcela() {
        return timParcela;
   }

   public void setTimParcela(BigDecimal timParcela) {
        this.timParcela = timParcela;
   }

   public BigDecimal getTimRenegCancLote() {
        return timRenegCancLote;
   }

   public void setTimRenegCancLote(BigDecimal timRenegCancLote) {
        this.timRenegCancLote = timRenegCancLote;
   }

   public BigDecimal getTimRenegImv() {
        return timRenegImv;
   }

   public void setTimRenegImv(BigDecimal timRenegImv) {
        this.timRenegImv = timRenegImv;
   }

   public BigDecimal getTimRenegLote() {
        return timRenegLote;
   }

   public void setTimRenegLote(BigDecimal timRenegLote) {
        this.timRenegLote = timRenegLote;
   }

   public BigDecimal getTimRepInteligente() {
        return timRepInteligente;
   }

   public void setTimRepInteligente(BigDecimal timRepInteligente) {
        this.timRepInteligente = timRepInteligente;
   }

   public String getTimRepParcial() {
        return timRepParcial;
   }

   public void setTimRepParcial(String timRepParcial) {
        this.timRepParcial = timRepParcial;
   }

   public BigDecimal getTimRescisaoLoc() {
        return timRescisaoLoc;
   }

   public void setTimRescisaoLoc(BigDecimal timRescisaoLoc) {
        this.timRescisaoLoc = timRescisaoLoc;
   }

   public BigDecimal getTimRescisaoLtv() {
        return timRescisaoLtv;
   }

   public void setTimRescisaoLtv(BigDecimal timRescisaoLtv) {
        this.timRescisaoLtv = timRescisaoLtv;
   }

   public BigDecimal getTimTipoIntermed() {
        return timTipoIntermed;
   }

   public void setTimTipoIntermed(BigDecimal timTipoIntermed) {
        this.timTipoIntermed = timTipoIntermed;
   }

   public String getTimTxAdmGerAlu() {
        return timTxAdmGerAlu;
   }

   public void setTimTxAdmGerAlu(String timTxAdmGerAlu) {
        this.timTxAdmGerAlu = timTxAdmGerAlu;
   }

   public BigDecimal getTimVendaImv() {
        return timVendaImv;
   }

   public void setTimVendaImv(BigDecimal timVendaImv) {
        this.timVendaImv = timVendaImv;
   }

   public BigDecimal getTimVendaLote() {
        return timVendaLote;
   }

   public void setTimVendaLote(BigDecimal timVendaLote) {
        this.timVendaLote = timVendaLote;
   }

   public BigDecimal getTimVlrAluguel() {
        return timVlrAluguel;
   }

   public void setTimVlrAluguel(BigDecimal timVlrAluguel) {
        this.timVlrAluguel = timVlrAluguel;
   }

   public BigDecimal getTimVlrAmortContrato() {
        return timVlrAmortContrato;
   }

   public void setTimVlrAmortContrato(BigDecimal timVlrAmortContrato) {
        this.timVlrAmortContrato = timVlrAmortContrato;
   }

   public BigDecimal getTimVlrCorrMonet() {
        return timVlrCorrMonet;
   }

   public void setTimVlrCorrMonet(BigDecimal timVlrCorrMonet) {
        this.timVlrCorrMonet = timVlrCorrMonet;
   }

   public BigDecimal getTimVlrJuroContrato() {
        return timVlrJuroContrato;
   }

   public void setTimVlrJuroContrato(BigDecimal timVlrJuroContrato) {
        this.timVlrJuroContrato = timVlrJuroContrato;
   }

   public BigDecimal getCodObsPadrao() {
        return codObsPadrao;
   }

   public void setCodObsPadrao(BigDecimal codObsPadrao) {
        this.codObsPadrao = codObsPadrao;
   }

   public BigDecimal getTimSac() {
        return timSac;
   }

   public void setTimSac(BigDecimal timSac) {
        this.timSac = timSac;
   }

   public BigDecimal getAbatimentoCan() {
        return abatimentoCan;
   }

   public void setAbatimentoCan(BigDecimal abatimentoCan) {
        this.abatimentoCan = abatimentoCan;
   }

   public BigDecimal getAbatimento() {
        return abatimento;
   }

   public void setAbatimento(BigDecimal abatimento) {
        this.abatimento = abatimento;
   }

   public BigDecimal getCodImovelRural() {
        return codImovelRural;
   }

   public void setCodImovelRural(BigDecimal codImovelRural) {
        this.codImovelRural = codImovelRural;
   }

   public String getRecAdiantamentoRural() {
        return recAdiantamentoRural;
   }

   public void setRecAdiantamentoRural(String recAdiantamentoRural) {
        this.recAdiantamentoRural = recAdiantamentoRural;
   }

   public Timestamp getDtPrazo() {
        return dtPrazo;
   }

   public void setDtPrazo(Timestamp dtPrazo) {
        this.dtPrazo = dtPrazo;
   }

   public BigDecimal getBaseIrf() {
        return baseIrf;
   }

   public void setBaseIrf(BigDecimal baseIrf) {
        this.baseIrf = baseIrf;
   }

   public BigDecimal getBaseInss() {
        return baseInss;
   }

   public void setBaseInss(BigDecimal baseInss) {
        this.baseInss = baseInss;
   }

   public BigDecimal getClassifCessaoObra() {
        return classifCessaoObra;
   }

   public void setClassifCessaoObra(BigDecimal classifCessaoObra) {
        this.classifCessaoObra = classifCessaoObra;
   }

   public BigDecimal getCodCbe() {
        return codCbe;
   }

   public void setCodCbe(BigDecimal codCbe) {
        this.codCbe = codCbe;
   }

   public BigDecimal getCodCidFimCte() {
        return codCidFimCte;
   }

   public void setCodCidFimCte(BigDecimal codCidFimCte) {
        this.codCidFimCte = codCidFimCte;
   }

   public BigDecimal getCodCidIniCte() {
        return codCidIniCte;
   }

   public void setCodCidIniCte(BigDecimal codCidIniCte) {
        this.codCidIniCte = codCidIniCte;
   }

   public BigDecimal getCodLst() {
        return codLst;
   }

   public void setCodLst(BigDecimal codLst) {
        this.codLst = codLst;
   }

   public String getCodObra() {
        return codObra;
   }

   public void setCodObra(String codObra) {
        this.codObra = codObra;
   }

   public BigDecimal getCodTrib() {
        return codTrib;
   }

   public void setCodTrib(BigDecimal codTrib) {
        this.codTrib = codTrib;
   }

   public String getCustasProcessuais() {
        return custasProcessuais;
   }

   public void setCustasProcessuais(String custasProcessuais) {
        this.custasProcessuais = custasProcessuais;
   }

   public String getDepositoJudicial() {
        return depositoJudicial;
   }

   public void setDepositoJudicial(String depositoJudicial) {
        this.depositoJudicial = depositoJudicial;
   }

   public String getDespAdvogado() {
        return despAdvogado;
   }

   public void setDespAdvogado(String despAdvogado) {
        this.despAdvogado = despAdvogado;
   }

   public String getExigeIssqn() {
        return exigeIssqn;
   }

   public void setExigeIssqn(String exigeIssqn) {
        this.exigeIssqn = exigeIssqn;
   }

   public String getMotNaoReterIssqn() {
        return motNaoReterIssqn;
   }

   public void setMotNaoReterIssqn(String motNaoReterIssqn) {
        this.motNaoReterIssqn = motNaoReterIssqn;
   }

   public String getNumProcAdmJudic() {
        return numProcAdmJudic;
   }

   public void setNumProcAdmJudic(String numProcAdmJudic) {
        this.numProcAdmJudic = numProcAdmJudic;
   }

   public BigDecimal getObraConstCivil() {
        return obraConstCivil;
   }

   public void setObraConstCivil(BigDecimal obraConstCivil) {
        this.obraConstCivil = obraConstCivil;
   }

   public String getRegEspTribut() {
        return regEspTribut;
   }

   public void setRegEspTribut(String regEspTribut) {
        this.regEspTribut = regEspTribut;
   }

   public String getSitEspecialResp() {
        return sitEspecialResp;
   }

   public void setSitEspecialResp(String sitEspecialResp) {
        this.sitEspecialResp = sitEspecialResp;
   }

   public String getRecebCartao() {
        return recebCartao;
   }

   public void setRecebCartao(String recebCartao) {
        this.recebCartao = recebCartao;
   }

   public BigDecimal getVlrJurosMaisMulta() {
        return vlrJurosMaisMulta;
   }

   public void setVlrJurosMaisMulta(BigDecimal vlrJurosMaisMulta) {
        this.vlrJurosMaisMulta = vlrJurosMaisMulta;
   }

   public BigDecimal getAtrasoInicial() {
        return atrasoInicial;
   }

   public void setAtrasoInicial(BigDecimal atrasoInicial) {
        this.atrasoInicial = atrasoInicial;
   }

   public BigDecimal getPrazoInicial() {
        return prazoInicial;
   }

   public void setPrazoInicial(BigDecimal prazoInicial) {
        this.prazoInicial = prazoInicial;
   }

   public BigDecimal getPercDesc() {
        return percDesc;
   }

   public void setPercDesc(BigDecimal percDesc) {
        this.percDesc = percDesc;
   }

   public String getMonioCorEm() {
        return monioCorEm;
   }

   public void setMonioCorEm(String monioCorEm) {
        this.monioCorEm = monioCorEm;
   }

   public BigDecimal getNuCkc() {
        return nuCkc;
   }

   public void setNuCkc(BigDecimal nuCkc) {
        this.nuCkc = nuCkc;
   }

   public String getChaveNfeGnre() {
        return chaveNfeGnre;
   }

   public void setChaveNfeGnre(String chaveNfeGnre) {
        this.chaveNfeGnre = chaveNfeGnre;
   }

   public String getIndReceFdCont() {
        return indReceFdCont;
   }

   public void setIndReceFdCont(String indReceFdCont) {
        this.indReceFdCont = indReceFdCont;
   }

   public String getInfCompleFdCont() {
        return infCompleFdCont;
   }

   public void setInfCompleFdCont(String infCompleFdCont) {
        this.infCompleFdCont = infCompleFdCont;
   }

   public String getConciliado() {
        return conciliado;
   }

   public void setConciliado(String conciliado) {
        this.conciliado = conciliado;
   }

   public Timestamp getDhConcil() {
        return dhConcil;
   }

   public void setDhConcil(Timestamp dhConcil) {
        this.dhConcil = dhConcil;
   }

   public String getEmvPix() {
        return emvPix;
   }

   public void setEmvPix(String emvPix) {
        this.emvPix = emvPix;
   }

   public String getChavePix() {
        return chavePix;
   }

   public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
   }

   public Timestamp getDtInitRefApuracao() {
        return dtInitRefApuracao;
   }

   public void setDtInitRefApuracao(Timestamp dtInitRefApuracao) {
        this.dtInitRefApuracao = dtInitRefApuracao;
   }

   public String getIdTransacaoPix() {
        return idTransacaoPix;
   }

   public void setIdTransacaoPix(String idTransacaoPix) {
        this.idTransacaoPix = idTransacaoPix;
   }

   public BigDecimal getSubTipoVenda() {
        return subTipoVenda;
   }

   public void setSubTipoVenda(BigDecimal subTipoVenda) {
        this.subTipoVenda = subTipoVenda;
   }

   public BigDecimal getTrocoPdv() {
        return trocoPdv;
   }

   public void setTrocoPdv(BigDecimal trocoPdv) {
        this.trocoPdv = trocoPdv;
   }

   public String getTipApuracao() {
        return tipApuracao;
   }

   public void setTipApuracao(String tipApuracao) {
        this.tipApuracao = tipApuracao;
   }

   public String getDescrTpagNfce() {
        return descrTpagNfce;
   }

   public void setDescrTpagNfce(String descrTpagNfce) {
        this.descrTpagNfce = descrTpagNfce;
   }

   public Timestamp getDtAntecipacao() {
        return dtAntecipacao;
   }

   public void setDtAntecipacao(Timestamp dtAntecipacao) {
        this.dtAntecipacao = dtAntecipacao;
   }

   public BigDecimal getNuAntBanc() {
        return nuAntBanc;
   }

   public void setNuAntBanc(BigDecimal nuAntBanc) {
        this.nuAntBanc = nuAntBanc;
   }

   public String getAntecipado() {
        return antecipado;
   }

   public void setAntecipado(String antecipado) {
        this.antecipado = antecipado;
   }

   public Timestamp getDtEntSaiInfo() {
        return dtEntSaiInfo;
   }

   public void setDtEntSaiInfo(Timestamp dtEntSaiInfo) {
        this.dtEntSaiInfo = dtEntSaiInfo;
   }

   public BigDecimal getVlrGnreDois() {
        return vlrGnreDois;
   }

   public void setVlrGnreDois(BigDecimal vlrGnreDois) {
        this.vlrGnreDois = vlrGnreDois;
   }

   public String getRecebido() {
        return recebido;
   }

   public void setRecebido(String recebido) {
        this.recebido = recebido;
   }

   public Timestamp getRefAtCon() {
        return refAtCon;
   }

   public void setRefAtCon(Timestamp refAtCon) {
        this.refAtCon = refAtCon;
   }

   public String getCodReceita() {
        return codReceita;
   }

   public void setCodReceita(String codReceita) {
        this.codReceita = codReceita;
   }

   public String getContabilizado() {
        return contabilizado;
   }

   public void setContabilizado(String contabilizado) {
        this.contabilizado = contabilizado;
   }

   public Timestamp getDtIntegracaoIpi() {
        return dtIntegracaoIpi;
   }

   public void setDtIntegracaoIpi(Timestamp dtIntegracaoIpi) {
        this.dtIntegracaoIpi = dtIntegracaoIpi;
   }

   public Timestamp getDtReferencia() {
        return dtReferencia;
   }

   public void setDtReferencia(Timestamp dtReferencia) {
        this.dtReferencia = dtReferencia;
   }

   public String getNumDocArrecad() {
        return numDocArrecad;
   }

   public void setNumDocArrecad(String numDocArrecad) {
        this.numDocArrecad = numDocArrecad;
   }

   public BigDecimal getNuVerba() {
        return nuVerba;
   }

   public void setNuVerba(BigDecimal nuVerba) {
        this.nuVerba = nuVerba;
   }

   public BigDecimal getVlrDesdobCalc() {
        return vlrDesdobCalc;
   }

   public void setVlrDesdobCalc(BigDecimal vlrDesdobCalc) {
        this.vlrDesdobCalc = vlrDesdobCalc;
   }

   public BigDecimal getVlrLancOrig() {
        return vlrLancOrig;
   }

   public void setVlrLancOrig(BigDecimal vlrLancOrig) {
        this.vlrLancOrig = vlrLancOrig;
   }

   public BigDecimal getNroImport() {
        return nroImport;
   }

   public void setNroImport(BigDecimal nroImport) {
        this.nroImport = nroImport;
   }

   public BigDecimal getNuCaixa() {
        return nuCaixa;
   }

   public void setNuCaixa(BigDecimal nuCaixa) {
        this.nuCaixa = nuCaixa;
   }

   public String getSangDespPdv() {
        return sangDespPdv;
   }

   public void setSangDespPdv(String sangDespPdv) {
        this.sangDespPdv = sangDespPdv;
   }

   public String getCodPror() {
        return codPror;
   }

   public void setCodPror(String codPror) {
        this.codPror = codPror;
   }

   public BigDecimal getCodUsuPror() {
        return codUsuPror;
   }

   public void setCodUsuPror(BigDecimal codUsuPror) {
        this.codUsuPror = codUsuPror;
   }

   public Timestamp getDtPror() {
        return dtPror;
   }

   public void setDtPror(Timestamp dtPror) {
        this.dtPror = dtPror;
   }

   public Timestamp getNvDtVenc() {
        return nvDtVenc;
   }

   public void setNvDtVenc(Timestamp nvDtVenc) {
        this.nvDtVenc = nvDtVenc;
   }

   public String getPendenteCriarDesp() {
        return pendenteCriarDesp;
   }

   public void setPendenteCriarDesp(String pendenteCriarDesp) {
        this.pendenteCriarDesp = pendenteCriarDesp;
   }

   public String getProrrogado() {
        return prorrogado;
   }

   public void setProrrogado(String prorrogado) {
        this.prorrogado = prorrogado;
   }

   public String getNumOcorrencias() {
        return numOcorrencias;
   }

   public void setNumOcorrencias(String numOcorrencias) {
        this.numOcorrencias = numOcorrencias;
   }

   public String getMetodoCalcIrrf() {
        return metodoCalcIrrf;
   }

   public void setMetodoCalcIrrf(String metodoCalcIrrf) {
        this.metodoCalcIrrf = metodoCalcIrrf;
   }

   public BigDecimal getVlrIcmsXmlCte() {
        return vlrIcmsXmlCte;
   }

   public void setVlrIcmsXmlCte(BigDecimal vlrIcmsXmlCte) {
        this.vlrIcmsXmlCte = vlrIcmsXmlCte;
   }

   public BigDecimal getPixTef() {
        return pixTef;
   }

   public void setPixTef(BigDecimal pixTef) {
        this.pixTef = pixTef;
   }

   public String getCodOperacaoVendaMais() {
        return codOperacaoVendaMais;
   }

   public void setCodOperacaoVendaMais(String codOperacaoVendaMais) {
        this.codOperacaoVendaMais = codOperacaoVendaMais;
   }

   public Timestamp getDhAprovacaoVendaMais() {
        return dhAprovacaoVendaMais;
   }

   public void setDhAprovacaoVendaMais(Timestamp dhAprovacaoVendaMais) {
        this.dhAprovacaoVendaMais = dhAprovacaoVendaMais;
   }

   public Timestamp getDhImpressao() {
        return dhImpressao;
   }

   public void setDhImpressao(Timestamp dhImpressao) {
        this.dhImpressao = dhImpressao;
   }

   public BigDecimal getTaxaVendaMais() {
        return taxaVendaMais;
   }

   public void setTaxaVendaMais(BigDecimal taxaVendaMais) {
        this.taxaVendaMais = taxaVendaMais;
   }

   public String getVendaMais() {
        return vendaMais;
   }

   public void setVendaMais(String vendaMais) {
        this.vendaMais = vendaMais;
   }

   @Override
   public String getEntityName() {
        return "Financiamento";
   }

   @Override
   public Financiamento fromVO(DynamicVO vo) {
        this.tipMulta = vo.asString("TIPMULTA");
        this.vlrALiberar = vo.asBigDecimal("VLRALIBERAR");
        this.vlrAtual = vo.asBigDecimal("VLRATUAL");
        this.vlrBaixa = vo.asBigDecimal("VLRBAIXA");
        this.vlrCessao = vo.asBigDecimal("VLRCESSAO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuBaixa = vo.asBigDecimal("CODUSUBAIXA");
        this.codVeiculo = vo.asBigDecimal("CODVEICULO");
        this.agenciaCmc7 = vo.asString("AGENCIACMC7");
        this.aliqIcms = vo.asBigDecimal("ALIQICMS");
        this.atraso = vo.asBigDecimal("ATRASO");
        this.autorizado = vo.asString("AUTORIZADO");
        this.baseIcms = vo.asBigDecimal("BASEICMS");
        this.carta = vo.asBigDecimal("CARTA");
        this.cartaoDesc = vo.asBigDecimal("CARTAODESC");
        this.cgcCpfCmc7 = vo.asString("CGCCPFCMC7");
        this.cgcCpfParc = vo.asString("CGCCPFPARC");
        this.chaveCte = vo.asString("CHAVECTE");
        this.chaveCteRef = vo.asString("CHAVECTEREF");
        this.codBarra = vo.asString("CODBARRA");
        this.codBco = vo.asBigDecimal("CODBCO");
        this.codBcoCmc7 = vo.asBigDecimal("CODBCOCMC7");
        this.codCc = vo.asBigDecimal("CODCC");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codCfo = vo.asBigDecimal("CODCFO");
        this.codContato = vo.asBigDecimal("CODCONTATO");
        this.codCtabcoInt = vo.asBigDecimal("CODCTABCOINT");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEmpBaixa = vo.asBigDecimal("CODEMPBAIXA");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codHistAc = vo.asBigDecimal("CODHISTAC");
        this.codigoBarra = vo.asString("CODIGOBARRA");
        this.codLanc = vo.asBigDecimal("CODLANC");
        this.codMoeda = vo.asBigDecimal("CODMOEDA");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.vlrDesc = vo.asBigDecimal("VLRDESC");
        this.vlrDescEmbut = vo.asBigDecimal("VLRDESCEMBUT");
        this.vlrDesdob = vo.asBigDecimal("VLRDESDOB");
        this.vlrFatCartao = vo.asBigDecimal("VLRFATCARTAO");
        this.vlrIcms = vo.asBigDecimal("VLRICMS");
        this.vlrInss = vo.asBigDecimal("VLRINSS");
        this.vlrIrf = vo.asBigDecimal("VLRIRF");
        this.vlrIss = vo.asBigDecimal("VLRISS");
        this.vlrJuro = vo.asBigDecimal("VLRJURO");
        this.vlrJuroCalc = vo.asBigDecimal("VLRJUROCALC");
        this.vlrJuroEmbut = vo.asBigDecimal("VLRJUROEMBUT");
        this.vlrJuroLib = vo.asBigDecimal("VLRJUROLIB");
        this.vlrJuroNegoc = vo.asBigDecimal("VLRJURONEGOC");
        this.codParcMatriz = vo.asBigDecimal("CODPARCMATRIZ");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.codTipOperBaixa = vo.asBigDecimal("CODTIPOPERBAIXA");
        this.codTipTit = vo.asBigDecimal("CODTIPTIT");
        this.baixaApi = vo.asString("BAIXAAPI");
        this.vlrLiquido = vo.asBigDecimal("VLRLIQUIDO");
        this.vlrMoeda = vo.asBigDecimal("VLRMOEDA");
        this.vlrMoedaBaixa = vo.asBigDecimal("VLRMOEDABAIXA");
        this.vlrMulta = vo.asBigDecimal("VLRMULTA");
        this.vlrMultaCalc = vo.asBigDecimal("VLRMULTACALC");
        this.vlrMultaEmbut = vo.asBigDecimal("VLRMULTAEMBUT");
        this.vlrMultaLib = vo.asBigDecimal("VLRMULTALIB");
        this.vlrMultaNegoc = vo.asBigDecimal("VLRMULTANEGOC");
        this.vlrProv = vo.asBigDecimal("VLRPROV");
        this.vlrTotalCalc = vo.asBigDecimal("VLRTOTALCALC");
        this.vlrTroco = vo.asBigDecimal("VLRTROCO");
        this.vlrVarCambial = vo.asBigDecimal("VLRVARCAMBIAL");
        this.vlrVendor = vo.asBigDecimal("VLRVENDOR");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.serieEntSafFix = vo.asString("SERIEENTSAFFIX");
        this.serieNfDes = vo.asString("SERIENFDES");
        this.serieNota = vo.asString("SERIENOTA");
        this.serieNotaCompl = vo.asString("SERIENOTACOMPL");
        this.statusGnre = vo.asString("STATUSGNRE");
        this.retornadoAc = vo.asString("RETORNADOAC");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.contabilizadoPdd = vo.asString("CONTABILIZADOPDD");
        this.contaCmc7 = vo.asString("CONTACMC7");
        this.statusLib = vo.asBigDecimal("STATUSLIB");
        this.tipJuro = vo.asString("TIPJURO");
        this.tipMarcCheq = vo.asString("TIPMARCCHEQ");
        this.vlrCheque = vo.asBigDecimal("VLRCHEQUE");
        this.codUsuCobr = vo.asBigDecimal("CODUSUCOBR");
        this.vlrDescCalc = vo.asBigDecimal("VLRDESCCALC");
        this.jurosAvp = vo.asBigDecimal("JUROSAVP");
        this.rateadoCab = vo.asString("RATEADOCAB");
        this.tpAgNfce = vo.asString("TPAGNFCE");
        this.valorPresente = vo.asBigDecimal("VALORPRESENTE");
        this.ctabcoBaixa = vo.asString("CTABCOBAIXA");
        this.descAlineaCheqDev = vo.asString("DESCALINEACHEQDEV");
        this.descrHistAc = vo.asString("DESCRHISTAC");
        this.descrLancBco = vo.asString("DESCRLANCBCO");
        this.desdobDupl = vo.asString("DESDOBDUPL");
        this.desdobramento = vo.asString("DESDOBRAMENTO");
        this.despCart = vo.asBigDecimal("DESPCART");
        this.dhBaixa = vo.asTimestamp("DHBAIXA");
        this.dhMov = vo.asTimestamp("DHMOV");
        this.dhTipOper = vo.asTimestamp("DHTIPOPER");
        this.dhTipOperBaixa = vo.asTimestamp("DHTIPOPERBAIXA");
        this.digSafra = vo.asString("DIGSAFRA");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtBaixaPrev = vo.asTimestamp("DTBAIXAPREV");
        this.dtContab = vo.asTimestamp("DTCONTAB");
        this.dtContabBaixa = vo.asTimestamp("DTCONTABBAIXA");
        this.dtEntSai = vo.asTimestamp("DTENTSAI");
        this.dtNeg = vo.asTimestamp("DTNEG");
        this.dtNegFilter = vo.asTimestamp("DTNEGFILTER");
        this.dtVenc = vo.asTimestamp("DTVENC");
        this.dtVencInic = vo.asTimestamp("DTVENCINIC");
        this.historico = vo.asString("HISTORICO");
        this.bloqVar = vo.asString("BLOQVAR");
        this.idLoteFdic = vo.asBigDecimal("IDLOTEFDIC");
        this.inssRetido = vo.asString("INSSRETIDO");
        this.irfRetido = vo.asString("IRFRETIDO");
        this.issRetido = vo.asString("ISSRETIDO");
        this.linhaDigitavel = vo.asString("LINHADIGITAVEL");
        this.m2 = vo.asBigDecimal("M2");
        this.modeloNfDes = vo.asString("MODELONFDES");
        this.mostrarEneg = vo.asString("MOSTRARENEG");
        this.naturezaOperDes = vo.asString("NATUREZAOPERDES");
        this.nfComplFix = vo.asBigDecimal("NFCOMPLFIX");
        this.nfEntSeqFix = vo.asString("NFENTSEQFIX");
        this.nomeEmitenteCmc7 = vo.asString("NOMEEMITENTECMC7");
        this.nossoNum = vo.asString("NOSSONUM");
        this.nroCessaoFdic = vo.asString("NROCESSAOFDIC");
        this.nroLoteGnre = vo.asBigDecimal("NROLOTEGNRE");
        this.nuAponta = vo.asBigDecimal("NUAPONTA");
        this.nuBco = vo.asBigDecimal("NUBCO");
        this.nuCcr = vo.asBigDecimal("NUCCR");
        this.nuCompens = vo.asBigDecimal("NUCOMPENS");
        this.nuDev = vo.asBigDecimal("NUDEV");
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.nuFtc = vo.asBigDecimal("NUFTC");
        this.numBor = vo.asBigDecimal("NUMBOR");
        this.numComplFix = vo.asBigDecimal("NUMCOMPLFIX");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.numDupl = vo.asBigDecimal("NUMDUPL");
        this.numEntSafFix = vo.asBigDecimal("NUMENTSAFFIX");
        this.numNfse = vo.asString("NUMNFSE");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.numOs = vo.asBigDecimal("NUMOS");
        this.numRemessa = vo.asBigDecimal("NUMREMESSA");
        this.numTransf = vo.asBigDecimal("NUMTRANSF");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuPed = vo.asBigDecimal("NUPED");
        this.nuReneg = vo.asBigDecimal("NURENEG");
        this.observacaoAc = vo.asString("OBSERVACAOAC");
        this.ordemCarga = vo.asBigDecimal("ORDEMCARGA");
        this.origem = vo.asString("ORIGEM");
        this.parcReneg = vo.asString("PARCRENEG");
        this.pdd = vo.asString("PDD");
        this.pertenceAc = vo.asString("PERTENCEAC");
        this.prazo = vo.asBigDecimal("PRAZO");
        this.provisao = vo.asString("PROVISAO");
        this.rateado = vo.asString("RATEADO");
        this.recDesp = vo.asBigDecimal("RECDESP");
        this.recDespFilter = vo.asString("RECDESPFILTER");
        this.rejeicaoGnre = vo.asString("REJEICAOGNRE");
        this.chequeRastreadoCmc7 = vo.asString("CHEQUERASTREADOCMC7");
        this.codIptu = vo.asBigDecimal("CODIPTU");
        this.codRegua = vo.asBigDecimal("CODREGUA");
        this.idUnico = vo.asBigDecimal("IDUNICO");
        this.nuChq = vo.asBigDecimal("NUCHQ");
        this.seqCaixa = vo.asBigDecimal("SEQCAIXA");
        this.timBloqueada = vo.asString("TIMBLOQUEADA");
        this.timContaLanc = vo.asBigDecimal("TIMCONTALANC");
        this.timContaRep = vo.asBigDecimal("TIMCONTAREP");
        this.timContratoAdm = vo.asBigDecimal("TIMCONTRATOADM");
        this.timContratoLoc = vo.asBigDecimal("TIMCONTRATOLOC");
        this.timContratoLtv = vo.asBigDecimal("TIMCONTRATOLTV");
        this.timDataDeJur = vo.asTimestamp("TIMDATADEJUR");
        this.timDhBaixa = vo.asTimestamp("TIMDHBAIXA");
        this.timDhGerRepasse = vo.asTimestamp("TIMDHGERREPASSE");
        this.timDhGerRepParcial = vo.asTimestamp("TIMDHGERREPPARCIAL");
        this.timDtImpBol = vo.asTimestamp("TIMDTIMPBOL");
        this.timDtImpBolLocal = vo.asTimestamp("TIMDTIMPBOLLOCAL");
        this.timDtRepasse = vo.asTimestamp("TIMDTREPASSE");
        this.timDtRepParcial = vo.asTimestamp("TIMDTREPPARCIAL");
        this.timEstagio = vo.asString("TIMESTAGIO");
        this.timFechamento = vo.asBigDecimal("TIMFECHAMENTO");
        this.timFechamentoAlu = vo.asBigDecimal("TIMFECHAMENTOALU");
        this.timFinGarantOrig = vo.asBigDecimal("TIMFINGARANTORIG");
        this.timImovel = vo.asBigDecimal("TIMIMOVEL");
        this.timNegociacao = vo.asBigDecimal("TIMNEGOCIACAO");
        this.timNomeAdvogado = vo.asString("TIMNOMEADVOGADO");
        this.timNuFinOrig = vo.asBigDecimal("TIMNUFINORIG");
        this.timNumReg = vo.asBigDecimal("TIMNUMREG");
        this.timOrigem = vo.asString("TIMORIGEM");
        this.timOrigReneg = vo.asString("TIMORIGRENEG");
        this.timParcela = vo.asBigDecimal("TIMPARCELA");
        this.timRenegCancLote = vo.asBigDecimal("TIMRENEGCANCLOTE");
        this.timRenegImv = vo.asBigDecimal("TIMRENEGIMV");
        this.timRenegLote = vo.asBigDecimal("TIMRENEGLOTE");
        this.timRepInteligente = vo.asBigDecimal("TIMREPINTELIGENTE");
        this.timRepParcial = vo.asString("TIMREPPARCIAL");
        this.timRescisaoLoc = vo.asBigDecimal("TIMRESCISAOLOC");
        this.timRescisaoLtv = vo.asBigDecimal("TIMRESCISAOLTV");
        this.timTipoIntermed = vo.asBigDecimal("TIMTIPOINTERMED");
        this.timTxAdmGerAlu = vo.asString("TIMTXADMGERALU");
        this.timVendaImv = vo.asBigDecimal("TIMVENDAIMV");
        this.timVendaLote = vo.asBigDecimal("TIMVENDALOTE");
        this.timVlrAluguel = vo.asBigDecimal("TIMVLRALUGUEL");
        this.timVlrAmortContrato = vo.asBigDecimal("TIMVLRAMORTCONTRATO");
        this.timVlrCorrMonet = vo.asBigDecimal("TIMVLRCORRMONET");
        this.timVlrJuroContrato = vo.asBigDecimal("TIMVLRJUROCONTRATO");
        this.codObsPadrao = vo.asBigDecimal("CODOBSPADRAO");
        this.timSac = vo.asBigDecimal("TIMSAC");
        this.abatimentoCan = vo.asBigDecimal("ABATIMENTOCAN");
        this.abatimento = vo.asBigDecimal("ABATIMENTO");
        this.codImovelRural = vo.asBigDecimal("CODIMOVELRURAL");
        this.recAdiantamentoRural = vo.asString("RECADIANTAMENTORURAL");
        this.dtPrazo = vo.asTimestamp("DTPRAZO");
        this.baseIrf = vo.asBigDecimal("BASEIRF");
        this.baseInss = vo.asBigDecimal("BASEINSS");
        this.classifCessaoObra = vo.asBigDecimal("CLASSIFCESSAOOBRA");
        this.codCbe = vo.asBigDecimal("CODCBE");
        this.codCidFimCte = vo.asBigDecimal("CODCIDFIMCTE");
        this.codCidIniCte = vo.asBigDecimal("CODCIDINICTE");
        this.codLst = vo.asBigDecimal("CODLST");
        this.codObra = vo.asString("CODOBRA");
        this.codTrib = vo.asBigDecimal("CODTRIB");
        this.custasProcessuais = vo.asString("CUSTASPROCESSUAIS");
        this.depositoJudicial = vo.asString("DEPOSITOJUDICIAL");
        this.despAdvogado = vo.asString("DESPADVOGADO");
        this.exigeIssqn = vo.asString("EXIGEISSQN");
        this.motNaoReterIssqn = vo.asString("MOTNAORETERISSQN");
        this.numProcAdmJudic = vo.asString("NUMPROCADMJUDIC");
        this.obraConstCivil = vo.asBigDecimal("OBRACONSTCIVIL");
        this.regEspTribut = vo.asString("REGESPTRIBUT");
        this.sitEspecialResp = vo.asString("SITESPECIALRESP");
        this.recebCartao = vo.asString("RECEBCARTAO");
        this.vlrJurosMaisMulta = vo.asBigDecimal("VLRJUROSMAISMULTA");
        this.atrasoInicial = vo.asBigDecimal("ATRASOINICIAL");
        this.prazoInicial = vo.asBigDecimal("PRAZOINICIAL");
        this.percDesc = vo.asBigDecimal("PERCDESC");
        this.monioCorEm = vo.asString("MONIOCOREM");
        this.nuCkc = vo.asBigDecimal("NUCKC");
        this.chaveNfeGnre = vo.asString("CHAVENFEGNRE");
        this.indReceFdCont = vo.asString("INDRECEFDCONT");
        this.infCompleFdCont = vo.asString("INFCOMPLEFDCONT");
        this.conciliado = vo.asString("CONCILIADO");
        this.dhConcil = vo.asTimestamp("DHCONCIL");
        this.emvPix = vo.asString("EMVPIX");
        this.chavePix = vo.asString("CHAVEPIX");
        this.dtInitRefApuracao = vo.asTimestamp("DTINITREFAPURACAO");
        this.idTransacaoPix = vo.asString("IDTRANSACAOPIX");
        this.subTipoVenda = vo.asBigDecimal("SUBTIPOVENDA");
        this.trocoPdv = vo.asBigDecimal("TROCOPDV");
        this.tipApuracao = vo.asString("TIPAPURACAO");
        this.descrTpagNfce = vo.asString("DESCRTPAGNFCE");
        this.dtAntecipacao = vo.asTimestamp("DTANTECIPACAO");
        this.nuAntBanc = vo.asBigDecimal("NUANTBANC");
        this.antecipado = vo.asString("ANTECIPADO");
        this.dtEntSaiInfo = vo.asTimestamp("DTENTSAIINFO");
        this.vlrGnreDois = vo.asBigDecimal("VLRGNREDOIS");
        this.recebido = vo.asString("RECEBIDO");
        this.refAtCon = vo.asTimestamp("REFATCON");
        this.codReceita = vo.asString("CODRECEITA");
        this.contabilizado = vo.asString("CONTABILIZADO");
        this.dtIntegracaoIpi = vo.asTimestamp("DTINTEGRACAOIPI");
        this.dtReferencia = vo.asTimestamp("DTREFERENCIA");
        this.numDocArrecad = vo.asString("NUMDOCARRECAD");
        this.nuVerba = vo.asBigDecimal("NUVERBA");
        this.vlrDesdobCalc = vo.asBigDecimal("VLRDESDOBCALC");
        this.vlrLancOrig = vo.asBigDecimal("VLRLANCORIG");
        this.nroImport = vo.asBigDecimal("NROIMPORT");
        this.nuCaixa = vo.asBigDecimal("NUCAIXA");
        this.sangDespPdv = vo.asString("SANGDESPPDV");
        this.codPror = vo.asString("CODPROR");
        this.codUsuPror = vo.asBigDecimal("CODUSUPROR");
        this.dtPror = vo.asTimestamp("DTPROR");
        this.nvDtVenc = vo.asTimestamp("NVDTVENC");
        this.pendenteCriarDesp = vo.asString("PENDENTECRIARDESP");
        this.prorrogado = vo.asString("PRORROGADO");
        this.numOcorrencias = vo.asString("NUMOCORRENCIAS");
        this.metodoCalcIrrf = vo.asString("METODOCALCIRRF");
        this.vlrIcmsXmlCte = vo.asBigDecimal("VLRICMSXMLCTE");
        this.pixTef = vo.asBigDecimal("PIXTEF");
        this.codOperacaoVendaMais = vo.asString("CODOPERACAOVENDAMAIS");
        this.dhAprovacaoVendaMais = vo.asTimestamp("DHAPROVACAOVENDAMAIS");
        this.dhImpressao = vo.asTimestamp("DHIMPRESSAO");
        this.taxaVendaMais = vo.asBigDecimal("TAXAVENDAMAIS");
        this.vendaMais = vo.asString("VENDAMAIS");
        return this;
   }
}
