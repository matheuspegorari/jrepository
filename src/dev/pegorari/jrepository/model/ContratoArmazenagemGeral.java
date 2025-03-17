package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ContratoArmazenagemGeral implements SankhyaEntity<ContratoArmazenagemGeral> {

   private String temIrf;
   private String temIss;
   private String temMed;
   private BigDecimal qtdGerarPrev;
   private BigDecimal qtdParcPgCom;
   private BigDecimal qtdPrev;
   private BigDecimal recDesp;
   private String referencia;
   private String retEmiss;
   private String tipo;
   private String acessaHistSubos;
   private String ambiente;
   private String ativo;
   private String clausContrato;
   private BigDecimal codCencus;
   private BigDecimal codContato;
   private BigDecimal codCriterio;
   private BigDecimal codEmp;
   private BigDecimal codImplant;
   private BigDecimal codMoeAltReaj;
   private BigDecimal codMoeda;
   private BigDecimal codMonSankhya;
   private BigDecimal codNat;
   private BigDecimal codParc;
   private BigDecimal codParcPrest;
   private BigDecimal codParcSec;
   private BigDecimal codProj;
   private BigDecimal codProjSint;
   private BigDecimal codTipVenda;
   private BigDecimal codUsu;
   private String colorFatForaSeq;
   private BigDecimal contCompleto;
   private BigDecimal contDesInstal;
   private BigDecimal contInstal;
   private BigDecimal diaFimMed;
   private BigDecimal diaPag;
   private String diaUtil;
   private Timestamp dtBaseReaj;
   private Timestamp dtContrato;
   private Timestamp dtEnvioEmail;
   private Timestamp dtRefProxFat;
   private Timestamp dtRefUltFat;
   private Timestamp dtTermino;
   private Timestamp dtVencto;
   private BigDecimal duracao;
   private String equipamento;
   private String feriadoEst;
   private String feriadoMun;
   private String feriadoNac;
   private BigDecimal freqReaj;
   private BigDecimal freqVisitas;
   private BigDecimal gatilho;
   private String gerarNf;
   private String imprime;
   private String imprPrecIndiv;
   private BigDecimal numContrato;
   private BigDecimal numContratoOrigem;
   private BigDecimal nuNotaPedLoc;
   private BigDecimal nuSla;
   private String observacoes;
   private BigDecimal parcelaAtual;
   private BigDecimal parcelaFat;
   private BigDecimal parcelaQtd;
   private BigDecimal percIrf;
   private BigDecimal percIss;
   private BigDecimal percLoc;
   private BigDecimal prazoVencto;
   private BigDecimal qtdFinPend;
   private BigDecimal vlrFinPend;
   private BigDecimal vlrOriginal;
   private BigDecimal vlrServicos;
   private BigDecimal vlrTotal;
   private String tipoContrato;
   private BigDecimal tipoTitulo;
   private String tipPag;
   private BigDecimal totalContrato;
   private BigDecimal totalFaturado;
   private BigDecimal totalProvPendente;
   private BigDecimal valor;
   private String contrOrgPublico;
   private String faturProrata;
   private String grupoFaturProrata;
   private String serFaturCon;
   private BigDecimal topFaturCon;
   private String controlocBens;
   private BigDecimal qtdProvisao;
   private BigDecimal codCid;
   private String reajusteNegativo;
   private String locacaoBem;
   private String gerarFinNota;
   private BigDecimal codUsuAlter;
   private String temCriRatesp;
   private BigDecimal codServEx;
   private String numContin;
   private String cobProporCar;
   private BigDecimal codCencusAr;
   private BigDecimal codCencusEx;
   private BigDecimal codNatAr;
   private BigDecimal codNatEx;
   private BigDecimal codSaf;
   private BigDecimal codTipVendaAr;
   private BigDecimal codTipVendaEx;
   private String defTipA;
   private BigDecimal diaCareCar;
   private BigDecimal diaCarenc;
   private BigDecimal diaCarencEx;
   private BigDecimal padClass;
   private String percObra;
   private String percObraAr;
   private String percDesc;
   private String percDescon;
   private BigDecimal quebraTec;
   private BigDecimal respPagar;
   private String sitCont;
   private BigDecimal tabPrecUmi;
   private BigDecimal tabPrecUmiAr;
   private String tipCobr;
   private String tipoArm;
   private BigDecimal tipoTituloAr;
   private BigDecimal tipoTituloEx;
   private String tipQuebra;
   private String ultTabUmi;
   private BigDecimal umiDpadra;
   private BigDecimal uniConvSc;
   private String valPedFin;
   private String cobProQue;
   private BigDecimal codObs;
   private String diaFixo;
   private BigDecimal prazoMensal;
   private BigDecimal nuNota;
   private String tipIsencao;
   private BigDecimal codClc;
   private BigDecimal nuNotaRefArmaze;
   private BigDecimal nuNotaRefExprec;
   private BigDecimal numCstc;
   private Timestamp dtRefArmaze;
   private Timestamp dtRefExprec;
   private String formFatArmaze;
   private String formFatExprec;
   private BigDecimal valQuebTrans;
   private String cifFob;
   private String endereco;
   private String inscEst;
   private String nomeParc;
   private BigDecimal qtdePrevista;
   private BigDecimal codProd;
   private Timestamp dtFinEntrega;
   private Timestamp dtIniEntrega;
   private String exigePedidoPes;
   private String modalidade;
   private BigDecimal percTolExced;
   private BigDecimal qtdNeg;
   private String tipCon;
   private BigDecimal totNeg;
   private BigDecimal valNegSc;
   private String regLaudSaida;
   private String grupo;
   private BigDecimal ppAutAsc;

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

   public String getTemMed() {
        return temMed;
   }

   public void setTemMed(String temMed) {
        this.temMed = temMed;
   }

   public BigDecimal getQtdGerarPrev() {
        return qtdGerarPrev;
   }

   public void setQtdGerarPrev(BigDecimal qtdGerarPrev) {
        this.qtdGerarPrev = qtdGerarPrev;
   }

   public BigDecimal getQtdParcPgCom() {
        return qtdParcPgCom;
   }

   public void setQtdParcPgCom(BigDecimal qtdParcPgCom) {
        this.qtdParcPgCom = qtdParcPgCom;
   }

   public BigDecimal getQtdPrev() {
        return qtdPrev;
   }

   public void setQtdPrev(BigDecimal qtdPrev) {
        this.qtdPrev = qtdPrev;
   }

   public BigDecimal getRecDesp() {
        return recDesp;
   }

   public void setRecDesp(BigDecimal recDesp) {
        this.recDesp = recDesp;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        this.referencia = referencia;
   }

   public String getRetEmiss() {
        return retEmiss;
   }

   public void setRetEmiss(String retEmiss) {
        this.retEmiss = retEmiss;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getAcessaHistSubos() {
        return acessaHistSubos;
   }

   public void setAcessaHistSubos(String acessaHistSubos) {
        this.acessaHistSubos = acessaHistSubos;
   }

   public String getAmbiente() {
        return ambiente;
   }

   public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public String getClausContrato() {
        return clausContrato;
   }

   public void setClausContrato(String clausContrato) {
        this.clausContrato = clausContrato;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        this.codCencus = codCencus;
   }

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        this.codContato = codContato;
   }

   public BigDecimal getCodCriterio() {
        return codCriterio;
   }

   public void setCodCriterio(BigDecimal codCriterio) {
        this.codCriterio = codCriterio;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodImplant() {
        return codImplant;
   }

   public void setCodImplant(BigDecimal codImplant) {
        this.codImplant = codImplant;
   }

   public BigDecimal getCodMoeAltReaj() {
        return codMoeAltReaj;
   }

   public void setCodMoeAltReaj(BigDecimal codMoeAltReaj) {
        this.codMoeAltReaj = codMoeAltReaj;
   }

   public BigDecimal getCodMoeda() {
        return codMoeda;
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        this.codMoeda = codMoeda;
   }

   public BigDecimal getCodMonSankhya() {
        return codMonSankhya;
   }

   public void setCodMonSankhya(BigDecimal codMonSankhya) {
        this.codMonSankhya = codMonSankhya;
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

   public BigDecimal getCodParcPrest() {
        return codParcPrest;
   }

   public void setCodParcPrest(BigDecimal codParcPrest) {
        this.codParcPrest = codParcPrest;
   }

   public BigDecimal getCodParcSec() {
        return codParcSec;
   }

   public void setCodParcSec(BigDecimal codParcSec) {
        this.codParcSec = codParcSec;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        this.codProj = codProj;
   }

   public BigDecimal getCodProjSint() {
        return codProjSint;
   }

   public void setCodProjSint(BigDecimal codProjSint) {
        this.codProjSint = codProjSint;
   }

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        this.codTipVenda = codTipVenda;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getColorFatForaSeq() {
        return colorFatForaSeq;
   }

   public void setColorFatForaSeq(String colorFatForaSeq) {
        this.colorFatForaSeq = colorFatForaSeq;
   }

   public BigDecimal getContCompleto() {
        return contCompleto;
   }

   public void setContCompleto(BigDecimal contCompleto) {
        this.contCompleto = contCompleto;
   }

   public BigDecimal getContDesInstal() {
        return contDesInstal;
   }

   public void setContDesInstal(BigDecimal contDesInstal) {
        this.contDesInstal = contDesInstal;
   }

   public BigDecimal getContInstal() {
        return contInstal;
   }

   public void setContInstal(BigDecimal contInstal) {
        this.contInstal = contInstal;
   }

   public BigDecimal getDiaFimMed() {
        return diaFimMed;
   }

   public void setDiaFimMed(BigDecimal diaFimMed) {
        this.diaFimMed = diaFimMed;
   }

   public BigDecimal getDiaPag() {
        return diaPag;
   }

   public void setDiaPag(BigDecimal diaPag) {
        this.diaPag = diaPag;
   }

   public String getDiaUtil() {
        return diaUtil;
   }

   public void setDiaUtil(String diaUtil) {
        this.diaUtil = diaUtil;
   }

   public Timestamp getDtBaseReaj() {
        return dtBaseReaj;
   }

   public void setDtBaseReaj(Timestamp dtBaseReaj) {
        this.dtBaseReaj = dtBaseReaj;
   }

   public Timestamp getDtContrato() {
        return dtContrato;
   }

   public void setDtContrato(Timestamp dtContrato) {
        this.dtContrato = dtContrato;
   }

   public Timestamp getDtEnvioEmail() {
        return dtEnvioEmail;
   }

   public void setDtEnvioEmail(Timestamp dtEnvioEmail) {
        this.dtEnvioEmail = dtEnvioEmail;
   }

   public Timestamp getDtRefProxFat() {
        return dtRefProxFat;
   }

   public void setDtRefProxFat(Timestamp dtRefProxFat) {
        this.dtRefProxFat = dtRefProxFat;
   }

   public Timestamp getDtRefUltFat() {
        return dtRefUltFat;
   }

   public void setDtRefUltFat(Timestamp dtRefUltFat) {
        this.dtRefUltFat = dtRefUltFat;
   }

   public Timestamp getDtTermino() {
        return dtTermino;
   }

   public void setDtTermino(Timestamp dtTermino) {
        this.dtTermino = dtTermino;
   }

   public Timestamp getDtVencto() {
        return dtVencto;
   }

   public void setDtVencto(Timestamp dtVencto) {
        this.dtVencto = dtVencto;
   }

   public BigDecimal getDuracao() {
        return duracao;
   }

   public void setDuracao(BigDecimal duracao) {
        this.duracao = duracao;
   }

   public String getEquipamento() {
        return equipamento;
   }

   public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
   }

   public String getFeriadoEst() {
        return feriadoEst;
   }

   public void setFeriadoEst(String feriadoEst) {
        this.feriadoEst = feriadoEst;
   }

   public String getFeriadoMun() {
        return feriadoMun;
   }

   public void setFeriadoMun(String feriadoMun) {
        this.feriadoMun = feriadoMun;
   }

   public String getFeriadoNac() {
        return feriadoNac;
   }

   public void setFeriadoNac(String feriadoNac) {
        this.feriadoNac = feriadoNac;
   }

   public BigDecimal getFreqReaj() {
        return freqReaj;
   }

   public void setFreqReaj(BigDecimal freqReaj) {
        this.freqReaj = freqReaj;
   }

   public BigDecimal getFreqVisitas() {
        return freqVisitas;
   }

   public void setFreqVisitas(BigDecimal freqVisitas) {
        this.freqVisitas = freqVisitas;
   }

   public BigDecimal getGatilho() {
        return gatilho;
   }

   public void setGatilho(BigDecimal gatilho) {
        this.gatilho = gatilho;
   }

   public String getGerarNf() {
        return gerarNf;
   }

   public void setGerarNf(String gerarNf) {
        this.gerarNf = gerarNf;
   }

   public String getImprime() {
        return imprime;
   }

   public void setImprime(String imprime) {
        this.imprime = imprime;
   }

   public String getImprPrecIndiv() {
        return imprPrecIndiv;
   }

   public void setImprPrecIndiv(String imprPrecIndiv) {
        this.imprPrecIndiv = imprPrecIndiv;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        this.numContrato = numContrato;
   }

   public BigDecimal getNumContratoOrigem() {
        return numContratoOrigem;
   }

   public void setNumContratoOrigem(BigDecimal numContratoOrigem) {
        this.numContratoOrigem = numContratoOrigem;
   }

   public BigDecimal getNuNotaPedLoc() {
        return nuNotaPedLoc;
   }

   public void setNuNotaPedLoc(BigDecimal nuNotaPedLoc) {
        this.nuNotaPedLoc = nuNotaPedLoc;
   }

   public BigDecimal getNuSla() {
        return nuSla;
   }

   public void setNuSla(BigDecimal nuSla) {
        this.nuSla = nuSla;
   }

   public String getObservacoes() {
        return observacoes;
   }

   public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
   }

   public BigDecimal getParcelaAtual() {
        return parcelaAtual;
   }

   public void setParcelaAtual(BigDecimal parcelaAtual) {
        this.parcelaAtual = parcelaAtual;
   }

   public BigDecimal getParcelaFat() {
        return parcelaFat;
   }

   public void setParcelaFat(BigDecimal parcelaFat) {
        this.parcelaFat = parcelaFat;
   }

   public BigDecimal getParcelaQtd() {
        return parcelaQtd;
   }

   public void setParcelaQtd(BigDecimal parcelaQtd) {
        this.parcelaQtd = parcelaQtd;
   }

   public BigDecimal getPercIrf() {
        return percIrf;
   }

   public void setPercIrf(BigDecimal percIrf) {
        this.percIrf = percIrf;
   }

   public BigDecimal getPercIss() {
        return percIss;
   }

   public void setPercIss(BigDecimal percIss) {
        this.percIss = percIss;
   }

   public BigDecimal getPercLoc() {
        return percLoc;
   }

   public void setPercLoc(BigDecimal percLoc) {
        this.percLoc = percLoc;
   }

   public BigDecimal getPrazoVencto() {
        return prazoVencto;
   }

   public void setPrazoVencto(BigDecimal prazoVencto) {
        this.prazoVencto = prazoVencto;
   }

   public BigDecimal getQtdFinPend() {
        return qtdFinPend;
   }

   public void setQtdFinPend(BigDecimal qtdFinPend) {
        this.qtdFinPend = qtdFinPend;
   }

   public BigDecimal getVlrFinPend() {
        return vlrFinPend;
   }

   public void setVlrFinPend(BigDecimal vlrFinPend) {
        this.vlrFinPend = vlrFinPend;
   }

   public BigDecimal getVlrOriginal() {
        return vlrOriginal;
   }

   public void setVlrOriginal(BigDecimal vlrOriginal) {
        this.vlrOriginal = vlrOriginal;
   }

   public BigDecimal getVlrServicos() {
        return vlrServicos;
   }

   public void setVlrServicos(BigDecimal vlrServicos) {
        this.vlrServicos = vlrServicos;
   }

   public BigDecimal getVlrTotal() {
        return vlrTotal;
   }

   public void setVlrTotal(BigDecimal vlrTotal) {
        this.vlrTotal = vlrTotal;
   }

   public String getTipoContrato() {
        return tipoContrato;
   }

   public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
   }

   public BigDecimal getTipoTitulo() {
        return tipoTitulo;
   }

   public void setTipoTitulo(BigDecimal tipoTitulo) {
        this.tipoTitulo = tipoTitulo;
   }

   public String getTipPag() {
        return tipPag;
   }

   public void setTipPag(String tipPag) {
        this.tipPag = tipPag;
   }

   public BigDecimal getTotalContrato() {
        return totalContrato;
   }

   public void setTotalContrato(BigDecimal totalContrato) {
        this.totalContrato = totalContrato;
   }

   public BigDecimal getTotalFaturado() {
        return totalFaturado;
   }

   public void setTotalFaturado(BigDecimal totalFaturado) {
        this.totalFaturado = totalFaturado;
   }

   public BigDecimal getTotalProvPendente() {
        return totalProvPendente;
   }

   public void setTotalProvPendente(BigDecimal totalProvPendente) {
        this.totalProvPendente = totalProvPendente;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        this.valor = valor;
   }

   public String getContrOrgPublico() {
        return contrOrgPublico;
   }

   public void setContrOrgPublico(String contrOrgPublico) {
        this.contrOrgPublico = contrOrgPublico;
   }

   public String getFaturProrata() {
        return faturProrata;
   }

   public void setFaturProrata(String faturProrata) {
        this.faturProrata = faturProrata;
   }

   public String getGrupoFaturProrata() {
        return grupoFaturProrata;
   }

   public void setGrupoFaturProrata(String grupoFaturProrata) {
        this.grupoFaturProrata = grupoFaturProrata;
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

   public String getControlocBens() {
        return controlocBens;
   }

   public void setControlocBens(String controlocBens) {
        this.controlocBens = controlocBens;
   }

   public BigDecimal getQtdProvisao() {
        return qtdProvisao;
   }

   public void setQtdProvisao(BigDecimal qtdProvisao) {
        this.qtdProvisao = qtdProvisao;
   }

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        this.codCid = codCid;
   }

   public String getReajusteNegativo() {
        return reajusteNegativo;
   }

   public void setReajusteNegativo(String reajusteNegativo) {
        this.reajusteNegativo = reajusteNegativo;
   }

   public String getLocacaoBem() {
        return locacaoBem;
   }

   public void setLocacaoBem(String locacaoBem) {
        this.locacaoBem = locacaoBem;
   }

   public String getGerarFinNota() {
        return gerarFinNota;
   }

   public void setGerarFinNota(String gerarFinNota) {
        this.gerarFinNota = gerarFinNota;
   }

   public BigDecimal getCodUsuAlter() {
        return codUsuAlter;
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        this.codUsuAlter = codUsuAlter;
   }

   public String getTemCriRatesp() {
        return temCriRatesp;
   }

   public void setTemCriRatesp(String temCriRatesp) {
        this.temCriRatesp = temCriRatesp;
   }

   public BigDecimal getCodServEx() {
        return codServEx;
   }

   public void setCodServEx(BigDecimal codServEx) {
        this.codServEx = codServEx;
   }

   public String getNumContin() {
        return numContin;
   }

   public void setNumContin(String numContin) {
        this.numContin = numContin;
   }

   public String getCobProporCar() {
        return cobProporCar;
   }

   public void setCobProporCar(String cobProporCar) {
        this.cobProporCar = cobProporCar;
   }

   public BigDecimal getCodCencusAr() {
        return codCencusAr;
   }

   public void setCodCencusAr(BigDecimal codCencusAr) {
        this.codCencusAr = codCencusAr;
   }

   public BigDecimal getCodCencusEx() {
        return codCencusEx;
   }

   public void setCodCencusEx(BigDecimal codCencusEx) {
        this.codCencusEx = codCencusEx;
   }

   public BigDecimal getCodNatAr() {
        return codNatAr;
   }

   public void setCodNatAr(BigDecimal codNatAr) {
        this.codNatAr = codNatAr;
   }

   public BigDecimal getCodNatEx() {
        return codNatEx;
   }

   public void setCodNatEx(BigDecimal codNatEx) {
        this.codNatEx = codNatEx;
   }

   public BigDecimal getCodSaf() {
        return codSaf;
   }

   public void setCodSaf(BigDecimal codSaf) {
        this.codSaf = codSaf;
   }

   public BigDecimal getCodTipVendaAr() {
        return codTipVendaAr;
   }

   public void setCodTipVendaAr(BigDecimal codTipVendaAr) {
        this.codTipVendaAr = codTipVendaAr;
   }

   public BigDecimal getCodTipVendaEx() {
        return codTipVendaEx;
   }

   public void setCodTipVendaEx(BigDecimal codTipVendaEx) {
        this.codTipVendaEx = codTipVendaEx;
   }

   public String getDefTipA() {
        return defTipA;
   }

   public void setDefTipA(String defTipA) {
        this.defTipA = defTipA;
   }

   public BigDecimal getDiaCareCar() {
        return diaCareCar;
   }

   public void setDiaCareCar(BigDecimal diaCareCar) {
        this.diaCareCar = diaCareCar;
   }

   public BigDecimal getDiaCarenc() {
        return diaCarenc;
   }

   public void setDiaCarenc(BigDecimal diaCarenc) {
        this.diaCarenc = diaCarenc;
   }

   public BigDecimal getDiaCarencEx() {
        return diaCarencEx;
   }

   public void setDiaCarencEx(BigDecimal diaCarencEx) {
        this.diaCarencEx = diaCarencEx;
   }

   public BigDecimal getPadClass() {
        return padClass;
   }

   public void setPadClass(BigDecimal padClass) {
        this.padClass = padClass;
   }

   public String getPercObra() {
        return percObra;
   }

   public void setPercObra(String percObra) {
        this.percObra = percObra;
   }

   public String getPercObraAr() {
        return percObraAr;
   }

   public void setPercObraAr(String percObraAr) {
        this.percObraAr = percObraAr;
   }

   public String getPercDesc() {
        return percDesc;
   }

   public void setPercDesc(String percDesc) {
        this.percDesc = percDesc;
   }

   public String getPercDescon() {
        return percDescon;
   }

   public void setPercDescon(String percDescon) {
        this.percDescon = percDescon;
   }

   public BigDecimal getQuebraTec() {
        return quebraTec;
   }

   public void setQuebraTec(BigDecimal quebraTec) {
        this.quebraTec = quebraTec;
   }

   public BigDecimal getRespPagar() {
        return respPagar;
   }

   public void setRespPagar(BigDecimal respPagar) {
        this.respPagar = respPagar;
   }

   public String getSitCont() {
        return sitCont;
   }

   public void setSitCont(String sitCont) {
        this.sitCont = sitCont;
   }

   public BigDecimal getTabPrecUmi() {
        return tabPrecUmi;
   }

   public void setTabPrecUmi(BigDecimal tabPrecUmi) {
        this.tabPrecUmi = tabPrecUmi;
   }

   public BigDecimal getTabPrecUmiAr() {
        return tabPrecUmiAr;
   }

   public void setTabPrecUmiAr(BigDecimal tabPrecUmiAr) {
        this.tabPrecUmiAr = tabPrecUmiAr;
   }

   public String getTipCobr() {
        return tipCobr;
   }

   public void setTipCobr(String tipCobr) {
        this.tipCobr = tipCobr;
   }

   public String getTipoArm() {
        return tipoArm;
   }

   public void setTipoArm(String tipoArm) {
        this.tipoArm = tipoArm;
   }

   public BigDecimal getTipoTituloAr() {
        return tipoTituloAr;
   }

   public void setTipoTituloAr(BigDecimal tipoTituloAr) {
        this.tipoTituloAr = tipoTituloAr;
   }

   public BigDecimal getTipoTituloEx() {
        return tipoTituloEx;
   }

   public void setTipoTituloEx(BigDecimal tipoTituloEx) {
        this.tipoTituloEx = tipoTituloEx;
   }

   public String getTipQuebra() {
        return tipQuebra;
   }

   public void setTipQuebra(String tipQuebra) {
        this.tipQuebra = tipQuebra;
   }

   public String getUltTabUmi() {
        return ultTabUmi;
   }

   public void setUltTabUmi(String ultTabUmi) {
        this.ultTabUmi = ultTabUmi;
   }

   public BigDecimal getUmiDpadra() {
        return umiDpadra;
   }

   public void setUmiDpadra(BigDecimal umiDpadra) {
        this.umiDpadra = umiDpadra;
   }

   public BigDecimal getUniConvSc() {
        return uniConvSc;
   }

   public void setUniConvSc(BigDecimal uniConvSc) {
        this.uniConvSc = uniConvSc;
   }

   public String getValPedFin() {
        return valPedFin;
   }

   public void setValPedFin(String valPedFin) {
        this.valPedFin = valPedFin;
   }

   public String getCobProQue() {
        return cobProQue;
   }

   public void setCobProQue(String cobProQue) {
        this.cobProQue = cobProQue;
   }

   public BigDecimal getCodObs() {
        return codObs;
   }

   public void setCodObs(BigDecimal codObs) {
        this.codObs = codObs;
   }

   public String getDiaFixo() {
        return diaFixo;
   }

   public void setDiaFixo(String diaFixo) {
        this.diaFixo = diaFixo;
   }

   public BigDecimal getPrazoMensal() {
        return prazoMensal;
   }

   public void setPrazoMensal(BigDecimal prazoMensal) {
        this.prazoMensal = prazoMensal;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public String getTipIsencao() {
        return tipIsencao;
   }

   public void setTipIsencao(String tipIsencao) {
        this.tipIsencao = tipIsencao;
   }

   public BigDecimal getCodClc() {
        return codClc;
   }

   public void setCodClc(BigDecimal codClc) {
        this.codClc = codClc;
   }

   public BigDecimal getNuNotaRefArmaze() {
        return nuNotaRefArmaze;
   }

   public void setNuNotaRefArmaze(BigDecimal nuNotaRefArmaze) {
        this.nuNotaRefArmaze = nuNotaRefArmaze;
   }

   public BigDecimal getNuNotaRefExprec() {
        return nuNotaRefExprec;
   }

   public void setNuNotaRefExprec(BigDecimal nuNotaRefExprec) {
        this.nuNotaRefExprec = nuNotaRefExprec;
   }

   public BigDecimal getNumCstc() {
        return numCstc;
   }

   public void setNumCstc(BigDecimal numCstc) {
        this.numCstc = numCstc;
   }

   public Timestamp getDtRefArmaze() {
        return dtRefArmaze;
   }

   public void setDtRefArmaze(Timestamp dtRefArmaze) {
        this.dtRefArmaze = dtRefArmaze;
   }

   public Timestamp getDtRefExprec() {
        return dtRefExprec;
   }

   public void setDtRefExprec(Timestamp dtRefExprec) {
        this.dtRefExprec = dtRefExprec;
   }

   public String getFormFatArmaze() {
        return formFatArmaze;
   }

   public void setFormFatArmaze(String formFatArmaze) {
        this.formFatArmaze = formFatArmaze;
   }

   public String getFormFatExprec() {
        return formFatExprec;
   }

   public void setFormFatExprec(String formFatExprec) {
        this.formFatExprec = formFatExprec;
   }

   public BigDecimal getValQuebTrans() {
        return valQuebTrans;
   }

   public void setValQuebTrans(BigDecimal valQuebTrans) {
        this.valQuebTrans = valQuebTrans;
   }

   public String getCifFob() {
        return cifFob;
   }

   public void setCifFob(String cifFob) {
        this.cifFob = cifFob;
   }

   public String getEndereco() {
        return endereco;
   }

   public void setEndereco(String endereco) {
        this.endereco = endereco;
   }

   public String getInscEst() {
        return inscEst;
   }

   public void setInscEst(String inscEst) {
        this.inscEst = inscEst;
   }

   public String getNomeParc() {
        return nomeParc;
   }

   public void setNomeParc(String nomeParc) {
        this.nomeParc = nomeParc;
   }

   public BigDecimal getQtdePrevista() {
        return qtdePrevista;
   }

   public void setQtdePrevista(BigDecimal qtdePrevista) {
        this.qtdePrevista = qtdePrevista;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public Timestamp getDtFinEntrega() {
        return dtFinEntrega;
   }

   public void setDtFinEntrega(Timestamp dtFinEntrega) {
        this.dtFinEntrega = dtFinEntrega;
   }

   public Timestamp getDtIniEntrega() {
        return dtIniEntrega;
   }

   public void setDtIniEntrega(Timestamp dtIniEntrega) {
        this.dtIniEntrega = dtIniEntrega;
   }

   public String getExigePedidoPes() {
        return exigePedidoPes;
   }

   public void setExigePedidoPes(String exigePedidoPes) {
        this.exigePedidoPes = exigePedidoPes;
   }

   public String getModalidade() {
        return modalidade;
   }

   public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
   }

   public BigDecimal getPercTolExced() {
        return percTolExced;
   }

   public void setPercTolExced(BigDecimal percTolExced) {
        this.percTolExced = percTolExced;
   }

   public BigDecimal getQtdNeg() {
        return qtdNeg;
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        this.qtdNeg = qtdNeg;
   }

   public String getTipCon() {
        return tipCon;
   }

   public void setTipCon(String tipCon) {
        this.tipCon = tipCon;
   }

   public BigDecimal getTotNeg() {
        return totNeg;
   }

   public void setTotNeg(BigDecimal totNeg) {
        this.totNeg = totNeg;
   }

   public BigDecimal getValNegSc() {
        return valNegSc;
   }

   public void setValNegSc(BigDecimal valNegSc) {
        this.valNegSc = valNegSc;
   }

   public String getRegLaudSaida() {
        return regLaudSaida;
   }

   public void setRegLaudSaida(String regLaudSaida) {
        this.regLaudSaida = regLaudSaida;
   }

   public String getGrupo() {
        return grupo;
   }

   public void setGrupo(String grupo) {
        this.grupo = grupo;
   }

   public BigDecimal getPpAutAsc() {
        return ppAutAsc;
   }

   public void setPpAutAsc(BigDecimal ppAutAsc) {
        this.ppAutAsc = ppAutAsc;
   }

   @Override
   public String getEntityName() {
        return "ContratoArmazenagemGeral";
   }

   @Override
   public ContratoArmazenagemGeral fromVO(DynamicVO vo) {
        this.temIrf = vo.asString("TEMIRF");
        this.temIss = vo.asString("TEMISS");
        this.temMed = vo.asString("TEMMED");
        this.qtdGerarPrev = vo.asBigDecimal("QTDGERARPREV");
        this.qtdParcPgCom = vo.asBigDecimal("QTDPARCPGCOM");
        this.qtdPrev = vo.asBigDecimal("QTDPREV");
        this.recDesp = vo.asBigDecimal("RECDESP");
        this.referencia = vo.asString("REFERENCIA");
        this.retEmiss = vo.asString("RETEMISS");
        this.tipo = vo.asString("TIPO");
        this.acessaHistSubos = vo.asString("ACESSAHISTSUBOS");
        this.ambiente = vo.asString("AMBIENTE");
        this.ativo = vo.asString("ATIVO");
        this.clausContrato = vo.asString("CLAUSCONTRATO");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codContato = vo.asBigDecimal("CODCONTATO");
        this.codCriterio = vo.asBigDecimal("CODCRITERIO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codImplant = vo.asBigDecimal("CODIMPLANT");
        this.codMoeAltReaj = vo.asBigDecimal("CODMOEALTREAJ");
        this.codMoeda = vo.asBigDecimal("CODMOEDA");
        this.codMonSankhya = vo.asBigDecimal("CODMONSANKHYA");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codParcPrest = vo.asBigDecimal("CODPARCPREST");
        this.codParcSec = vo.asBigDecimal("CODPARCSEC");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.codProjSint = vo.asBigDecimal("CODPROJSINT");
        this.codTipVenda = vo.asBigDecimal("CODTIPVENDA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.colorFatForaSeq = vo.asString("COLORFATFORASEQ");
        this.contCompleto = vo.asBigDecimal("CONTCOMPLETO");
        this.contDesInstal = vo.asBigDecimal("CONTDESINSTAL");
        this.contInstal = vo.asBigDecimal("CONTINSTAL");
        this.diaFimMed = vo.asBigDecimal("DIAFIMMED");
        this.diaPag = vo.asBigDecimal("DIAPAG");
        this.diaUtil = vo.asString("DIAUTIL");
        this.dtBaseReaj = vo.asTimestamp("DTBASEREAJ");
        this.dtContrato = vo.asTimestamp("DTCONTRATO");
        this.dtEnvioEmail = vo.asTimestamp("DTENVIOEMAIL");
        this.dtRefProxFat = vo.asTimestamp("DTREFPROXFAT");
        this.dtRefUltFat = vo.asTimestamp("DTREFULTFAT");
        this.dtTermino = vo.asTimestamp("DTTERMINO");
        this.dtVencto = vo.asTimestamp("DTVENCTO");
        this.duracao = vo.asBigDecimal("DURACAO");
        this.equipamento = vo.asString("EQUIPAMENTO");
        this.feriadoEst = vo.asString("FERIADOEST");
        this.feriadoMun = vo.asString("FERIADOMUN");
        this.feriadoNac = vo.asString("FERIADONAC");
        this.freqReaj = vo.asBigDecimal("FREQREAJ");
        this.freqVisitas = vo.asBigDecimal("FREQVISITAS");
        this.gatilho = vo.asBigDecimal("GATILHO");
        this.gerarNf = vo.asString("GERARNF");
        this.imprime = vo.asString("IMPRIME");
        this.imprPrecIndiv = vo.asString("IMPRPRECINDIV");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.numContratoOrigem = vo.asBigDecimal("NUMCONTRATOORIGEM");
        this.nuNotaPedLoc = vo.asBigDecimal("NUNOTAPEDLOC");
        this.nuSla = vo.asBigDecimal("NUSLA");
        this.observacoes = vo.asString("OBSERVACOES");
        this.parcelaAtual = vo.asBigDecimal("PARCELAATUAL");
        this.parcelaFat = vo.asBigDecimal("PARCELAFAT");
        this.parcelaQtd = vo.asBigDecimal("PARCELAQTD");
        this.percIrf = vo.asBigDecimal("PERCIRF");
        this.percIss = vo.asBigDecimal("PERCISS");
        this.percLoc = vo.asBigDecimal("PERCLOC");
        this.prazoVencto = vo.asBigDecimal("PRAZOVENCTO");
        this.qtdFinPend = vo.asBigDecimal("QTDFINPEND");
        this.vlrFinPend = vo.asBigDecimal("VLRFINPEND");
        this.vlrOriginal = vo.asBigDecimal("VLRORIGINAL");
        this.vlrServicos = vo.asBigDecimal("VLRSERVICOS");
        this.vlrTotal = vo.asBigDecimal("VLRTOTAL");
        this.tipoContrato = vo.asString("TIPOCONTRATO");
        this.tipoTitulo = vo.asBigDecimal("TIPOTITULO");
        this.tipPag = vo.asString("TIPPAG");
        this.totalContrato = vo.asBigDecimal("TOTALCONTRATO");
        this.totalFaturado = vo.asBigDecimal("TOTALFATURADO");
        this.totalProvPendente = vo.asBigDecimal("TOTALPROVPENDENTE");
        this.valor = vo.asBigDecimal("VALOR");
        this.contrOrgPublico = vo.asString("CONTRORGPUBLICO");
        this.faturProrata = vo.asString("FATURPRORATA");
        this.grupoFaturProrata = vo.asString("GRUPOFATURPRORATA");
        this.serFaturCon = vo.asString("SERFATURCON");
        this.topFaturCon = vo.asBigDecimal("TOPFATURCON");
        this.controlocBens = vo.asString("CONTROLOCBENS");
        this.qtdProvisao = vo.asBigDecimal("QTDPROVISAO");
        this.codCid = vo.asBigDecimal("CODCID");
        this.reajusteNegativo = vo.asString("REAJUSTENEGATIVO");
        this.locacaoBem = vo.asString("LOCACAOBEM");
        this.gerarFinNota = vo.asString("GERARFINNOTA");
        this.codUsuAlter = vo.asBigDecimal("CODUSUALTER");
        this.temCriRatesp = vo.asString("TEMCRIRATESP");
        this.codServEx = vo.asBigDecimal("CODSERVEX");
        this.numContin = vo.asString("NUMCONTIN");
        this.cobProporCar = vo.asString("COBPROPORCAR");
        this.codCencusAr = vo.asBigDecimal("CODCENCUSAR");
        this.codCencusEx = vo.asBigDecimal("CODCENCUSEX");
        this.codNatAr = vo.asBigDecimal("CODNATAR");
        this.codNatEx = vo.asBigDecimal("CODNATEX");
        this.codSaf = vo.asBigDecimal("CODSAF");
        this.codTipVendaAr = vo.asBigDecimal("CODTIPVENDAAR");
        this.codTipVendaEx = vo.asBigDecimal("CODTIPVENDAEX");
        this.defTipA = vo.asString("DEFTIPA");
        this.diaCareCar = vo.asBigDecimal("DIACARECAR");
        this.diaCarenc = vo.asBigDecimal("DIACARENC");
        this.diaCarencEx = vo.asBigDecimal("DIACARENCEX");
        this.padClass = vo.asBigDecimal("PADCLASS");
        this.percObra = vo.asString("PERCOBRA");
        this.percObraAr = vo.asString("PERCOBRAAR");
        this.percDesc = vo.asString("PERCDESC");
        this.percDescon = vo.asString("PERCDESCON");
        this.quebraTec = vo.asBigDecimal("QUEBRATEC");
        this.respPagar = vo.asBigDecimal("RESPPAGAR");
        this.sitCont = vo.asString("SITCONT");
        this.tabPrecUmi = vo.asBigDecimal("TABPRECUMI");
        this.tabPrecUmiAr = vo.asBigDecimal("TABPRECUMIAR");
        this.tipCobr = vo.asString("TIPCOBR");
        this.tipoArm = vo.asString("TIPOARM");
        this.tipoTituloAr = vo.asBigDecimal("TIPOTITULOAR");
        this.tipoTituloEx = vo.asBigDecimal("TIPOTITULOEX");
        this.tipQuebra = vo.asString("TIPQUEBRA");
        this.ultTabUmi = vo.asString("ULTTABUMI");
        this.umiDpadra = vo.asBigDecimal("UMIDPADRA");
        this.uniConvSc = vo.asBigDecimal("UNICONVSC");
        this.valPedFin = vo.asString("VALPEDFIN");
        this.cobProQue = vo.asString("COBPROQUE");
        this.codObs = vo.asBigDecimal("CODOBS");
        this.diaFixo = vo.asString("DIAFIXO");
        this.prazoMensal = vo.asBigDecimal("PRAZOMENSAL");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.tipIsencao = vo.asString("TIPISENCAO");
        this.codClc = vo.asBigDecimal("CODCLC");
        this.nuNotaRefArmaze = vo.asBigDecimal("NUNOTAREFARMAZE");
        this.nuNotaRefExprec = vo.asBigDecimal("NUNOTAREFEXPREC");
        this.numCstc = vo.asBigDecimal("NUMCSTC");
        this.dtRefArmaze = vo.asTimestamp("DTREFARMAZE");
        this.dtRefExprec = vo.asTimestamp("DTREFEXPREC");
        this.formFatArmaze = vo.asString("FORMFATARMAZE");
        this.formFatExprec = vo.asString("FORMFATEXPREC");
        this.valQuebTrans = vo.asBigDecimal("VALQUEBTRANS");
        this.cifFob = vo.asString("CIFFOB");
        this.endereco = vo.asString("ENDERECO");
        this.inscEst = vo.asString("INSCEST");
        this.nomeParc = vo.asString("NOMEPARC");
        this.qtdePrevista = vo.asBigDecimal("QTDEPREVISTA");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.dtFinEntrega = vo.asTimestamp("DTFINENTREGA");
        this.dtIniEntrega = vo.asTimestamp("DTINIENTREGA");
        this.exigePedidoPes = vo.asString("EXIGEPEDIDOPES");
        this.modalidade = vo.asString("MODALIDADE");
        this.percTolExced = vo.asBigDecimal("PERCTOLEXCED");
        this.qtdNeg = vo.asBigDecimal("QTDNEG");
        this.tipCon = vo.asString("TIPCON");
        this.totNeg = vo.asBigDecimal("TOTNEG");
        this.valNegSc = vo.asBigDecimal("VALNEGSC");
        this.regLaudSaida = vo.asString("REGLAUDSAIDA");
        this.grupo = vo.asString("GRUPO");
        this.ppAutAsc = vo.asBigDecimal("PPAUTASC");
        return this;
   }
}
