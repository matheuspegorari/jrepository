package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Contrato extends AbstractSankhyaEntity<Contrato> {
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
   private String temCrIratEsp;
   private BigDecimal codServEx;
   private String numContIn;
   private String cobPropOrCar;
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
   private BigDecimal nuNotaRefExpRec;
   private BigDecimal numCstc;
   private Timestamp dtRefArmaze;
   private Timestamp dtRefExpRec;
   private String formFatArmaze;
   private String formFatExpRec;
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

   public String getTemMed() {
        return temMed;
   }

   public void setTemMed(String temMed) {
        markAsChanged("TEMMED", temMed);
        this.temMed = temMed;
   }

   public BigDecimal getQtdGerarPrev() {
        return qtdGerarPrev;
   }

   public void setQtdGerarPrev(BigDecimal qtdGerarPrev) {
        markAsChanged("QTDGERARPREV", qtdGerarPrev);
        this.qtdGerarPrev = qtdGerarPrev;
   }

   public BigDecimal getQtdParcPgCom() {
        return qtdParcPgCom;
   }

   public void setQtdParcPgCom(BigDecimal qtdParcPgCom) {
        markAsChanged("QTDPARCPGCOM", qtdParcPgCom);
        this.qtdParcPgCom = qtdParcPgCom;
   }

   public BigDecimal getQtdPrev() {
        return qtdPrev;
   }

   public void setQtdPrev(BigDecimal qtdPrev) {
        markAsChanged("QTDPREV", qtdPrev);
        this.qtdPrev = qtdPrev;
   }

   public BigDecimal getRecDesp() {
        return recDesp;
   }

   public void setRecDesp(BigDecimal recDesp) {
        markAsChanged("RECDESP", recDesp);
        this.recDesp = recDesp;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public String getRetEmiss() {
        return retEmiss;
   }

   public void setRetEmiss(String retEmiss) {
        markAsChanged("RETEMISS", retEmiss);
        this.retEmiss = retEmiss;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public String getAcessaHistSubos() {
        return acessaHistSubos;
   }

   public void setAcessaHistSubos(String acessaHistSubos) {
        markAsChanged("ACESSAHISTSUBOS", acessaHistSubos);
        this.acessaHistSubos = acessaHistSubos;
   }

   public String getAmbiente() {
        return ambiente;
   }

   public void setAmbiente(String ambiente) {
        markAsChanged("AMBIENTE", ambiente);
        this.ambiente = ambiente;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public String getClausContrato() {
        return clausContrato;
   }

   public void setClausContrato(String clausContrato) {
        markAsChanged("CLAUSCONTRATO", clausContrato);
        this.clausContrato = clausContrato;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
        this.codCencus = codCencus;
   }

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
        this.codContato = codContato;
   }

   public BigDecimal getCodCriterio() {
        return codCriterio;
   }

   public void setCodCriterio(BigDecimal codCriterio) {
        markAsChanged("CODCRITERIO", codCriterio);
        this.codCriterio = codCriterio;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodImplant() {
        return codImplant;
   }

   public void setCodImplant(BigDecimal codImplant) {
        markAsChanged("CODIMPLANT", codImplant);
        this.codImplant = codImplant;
   }

   public BigDecimal getCodMoeAltReaj() {
        return codMoeAltReaj;
   }

   public void setCodMoeAltReaj(BigDecimal codMoeAltReaj) {
        markAsChanged("CODMOEALTREAJ", codMoeAltReaj);
        this.codMoeAltReaj = codMoeAltReaj;
   }

   public BigDecimal getCodMoeda() {
        return codMoeda;
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
        this.codMoeda = codMoeda;
   }

   public BigDecimal getCodMonSankhya() {
        return codMonSankhya;
   }

   public void setCodMonSankhya(BigDecimal codMonSankhya) {
        markAsChanged("CODMONSANKHYA", codMonSankhya);
        this.codMonSankhya = codMonSankhya;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
        this.codNat = codNat;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodParcPrest() {
        return codParcPrest;
   }

   public void setCodParcPrest(BigDecimal codParcPrest) {
        markAsChanged("CODPARCPREST", codParcPrest);
        this.codParcPrest = codParcPrest;
   }

   public BigDecimal getCodParcSec() {
        return codParcSec;
   }

   public void setCodParcSec(BigDecimal codParcSec) {
        markAsChanged("CODPARCSEC", codParcSec);
        this.codParcSec = codParcSec;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
        this.codProj = codProj;
   }

   public BigDecimal getCodProjSint() {
        return codProjSint;
   }

   public void setCodProjSint(BigDecimal codProjSint) {
        markAsChanged("CODPROJSINT", codProjSint);
        this.codProjSint = codProjSint;
   }

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
        this.codTipVenda = codTipVenda;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getColorFatForaSeq() {
        return colorFatForaSeq;
   }

   public void setColorFatForaSeq(String colorFatForaSeq) {
        markAsChanged("COLORFATFORASEQ", colorFatForaSeq);
        this.colorFatForaSeq = colorFatForaSeq;
   }

   public BigDecimal getContCompleto() {
        return contCompleto;
   }

   public void setContCompleto(BigDecimal contCompleto) {
        markAsChanged("CONTCOMPLETO", contCompleto);
        this.contCompleto = contCompleto;
   }

   public BigDecimal getContDesInstal() {
        return contDesInstal;
   }

   public void setContDesInstal(BigDecimal contDesInstal) {
        markAsChanged("CONTDESINSTAL", contDesInstal);
        this.contDesInstal = contDesInstal;
   }

   public BigDecimal getContInstal() {
        return contInstal;
   }

   public void setContInstal(BigDecimal contInstal) {
        markAsChanged("CONTINSTAL", contInstal);
        this.contInstal = contInstal;
   }

   public BigDecimal getDiaFimMed() {
        return diaFimMed;
   }

   public void setDiaFimMed(BigDecimal diaFimMed) {
        markAsChanged("DIAFIMMED", diaFimMed);
        this.diaFimMed = diaFimMed;
   }

   public BigDecimal getDiaPag() {
        return diaPag;
   }

   public void setDiaPag(BigDecimal diaPag) {
        markAsChanged("DIAPAG", diaPag);
        this.diaPag = diaPag;
   }

   public String getDiaUtil() {
        return diaUtil;
   }

   public void setDiaUtil(String diaUtil) {
        markAsChanged("DIAUTIL", diaUtil);
        this.diaUtil = diaUtil;
   }

   public Timestamp getDtBaseReaj() {
        return dtBaseReaj;
   }

   public void setDtBaseReaj(Timestamp dtBaseReaj) {
        markAsChanged("DTBASEREAJ", dtBaseReaj);
        this.dtBaseReaj = dtBaseReaj;
   }

   public Timestamp getDtContrato() {
        return dtContrato;
   }

   public void setDtContrato(Timestamp dtContrato) {
        markAsChanged("DTCONTRATO", dtContrato);
        this.dtContrato = dtContrato;
   }

   public Timestamp getDtEnvioEmail() {
        return dtEnvioEmail;
   }

   public void setDtEnvioEmail(Timestamp dtEnvioEmail) {
        markAsChanged("DTENVIOEMAIL", dtEnvioEmail);
        this.dtEnvioEmail = dtEnvioEmail;
   }

   public Timestamp getDtRefProxFat() {
        return dtRefProxFat;
   }

   public void setDtRefProxFat(Timestamp dtRefProxFat) {
        markAsChanged("DTREFPROXFAT", dtRefProxFat);
        this.dtRefProxFat = dtRefProxFat;
   }

   public Timestamp getDtRefUltFat() {
        return dtRefUltFat;
   }

   public void setDtRefUltFat(Timestamp dtRefUltFat) {
        markAsChanged("DTREFULTFAT", dtRefUltFat);
        this.dtRefUltFat = dtRefUltFat;
   }

   public Timestamp getDtTermino() {
        return dtTermino;
   }

   public void setDtTermino(Timestamp dtTermino) {
        markAsChanged("DTTERMINO", dtTermino);
        this.dtTermino = dtTermino;
   }

   public Timestamp getDtVencto() {
        return dtVencto;
   }

   public void setDtVencto(Timestamp dtVencto) {
        markAsChanged("DTVENCTO", dtVencto);
        this.dtVencto = dtVencto;
   }

   public BigDecimal getDuracao() {
        return duracao;
   }

   public void setDuracao(BigDecimal duracao) {
        markAsChanged("DURACAO", duracao);
        this.duracao = duracao;
   }

   public String getEquipamento() {
        return equipamento;
   }

   public void setEquipamento(String equipamento) {
        markAsChanged("EQUIPAMENTO", equipamento);
        this.equipamento = equipamento;
   }

   public String getFeriadoEst() {
        return feriadoEst;
   }

   public void setFeriadoEst(String feriadoEst) {
        markAsChanged("FERIADOEST", feriadoEst);
        this.feriadoEst = feriadoEst;
   }

   public String getFeriadoMun() {
        return feriadoMun;
   }

   public void setFeriadoMun(String feriadoMun) {
        markAsChanged("FERIADOMUN", feriadoMun);
        this.feriadoMun = feriadoMun;
   }

   public String getFeriadoNac() {
        return feriadoNac;
   }

   public void setFeriadoNac(String feriadoNac) {
        markAsChanged("FERIADONAC", feriadoNac);
        this.feriadoNac = feriadoNac;
   }

   public BigDecimal getFreqReaj() {
        return freqReaj;
   }

   public void setFreqReaj(BigDecimal freqReaj) {
        markAsChanged("FREQREAJ", freqReaj);
        this.freqReaj = freqReaj;
   }

   public BigDecimal getFreqVisitas() {
        return freqVisitas;
   }

   public void setFreqVisitas(BigDecimal freqVisitas) {
        markAsChanged("FREQVISITAS", freqVisitas);
        this.freqVisitas = freqVisitas;
   }

   public BigDecimal getGatilho() {
        return gatilho;
   }

   public void setGatilho(BigDecimal gatilho) {
        markAsChanged("GATILHO", gatilho);
        this.gatilho = gatilho;
   }

   public String getGerarNf() {
        return gerarNf;
   }

   public void setGerarNf(String gerarNf) {
        markAsChanged("GERARNF", gerarNf);
        this.gerarNf = gerarNf;
   }

   public String getImprime() {
        return imprime;
   }

   public void setImprime(String imprime) {
        markAsChanged("IMPRIME", imprime);
        this.imprime = imprime;
   }

   public String getImprPrecIndiv() {
        return imprPrecIndiv;
   }

   public void setImprPrecIndiv(String imprPrecIndiv) {
        markAsChanged("IMPRPRECINDIV", imprPrecIndiv);
        this.imprPrecIndiv = imprPrecIndiv;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
        this.numContrato = numContrato;
   }

   public BigDecimal getNumContratoOrigem() {
        return numContratoOrigem;
   }

   public void setNumContratoOrigem(BigDecimal numContratoOrigem) {
        markAsChanged("NUMCONTRATOORIGEM", numContratoOrigem);
        this.numContratoOrigem = numContratoOrigem;
   }

   public BigDecimal getNuNotaPedLoc() {
        return nuNotaPedLoc;
   }

   public void setNuNotaPedLoc(BigDecimal nuNotaPedLoc) {
        markAsChanged("NUNOTAPEDLOC", nuNotaPedLoc);
        this.nuNotaPedLoc = nuNotaPedLoc;
   }

   public BigDecimal getNuSla() {
        return nuSla;
   }

   public void setNuSla(BigDecimal nuSla) {
        markAsChanged("NUSLA", nuSla);
        this.nuSla = nuSla;
   }

   public String getObservacoes() {
        return observacoes;
   }

   public void setObservacoes(String observacoes) {
        markAsChanged("OBSERVACOES", observacoes);
        this.observacoes = observacoes;
   }

   public BigDecimal getParcelaAtual() {
        return parcelaAtual;
   }

   public void setParcelaAtual(BigDecimal parcelaAtual) {
        markAsChanged("PARCELAATUAL", parcelaAtual);
        this.parcelaAtual = parcelaAtual;
   }

   public BigDecimal getParcelaFat() {
        return parcelaFat;
   }

   public void setParcelaFat(BigDecimal parcelaFat) {
        markAsChanged("PARCELAFAT", parcelaFat);
        this.parcelaFat = parcelaFat;
   }

   public BigDecimal getParcelaQtd() {
        return parcelaQtd;
   }

   public void setParcelaQtd(BigDecimal parcelaQtd) {
        markAsChanged("PARCELAQTD", parcelaQtd);
        this.parcelaQtd = parcelaQtd;
   }

   public BigDecimal getPercIrf() {
        return percIrf;
   }

   public void setPercIrf(BigDecimal percIrf) {
        markAsChanged("PERCIRF", percIrf);
        this.percIrf = percIrf;
   }

   public BigDecimal getPercIss() {
        return percIss;
   }

   public void setPercIss(BigDecimal percIss) {
        markAsChanged("PERCISS", percIss);
        this.percIss = percIss;
   }

   public BigDecimal getPercLoc() {
        return percLoc;
   }

   public void setPercLoc(BigDecimal percLoc) {
        markAsChanged("PERCLOC", percLoc);
        this.percLoc = percLoc;
   }

   public BigDecimal getPrazoVencto() {
        return prazoVencto;
   }

   public void setPrazoVencto(BigDecimal prazoVencto) {
        markAsChanged("PRAZOVENCTO", prazoVencto);
        this.prazoVencto = prazoVencto;
   }

   public BigDecimal getQtdFinPend() {
        return qtdFinPend;
   }

   public void setQtdFinPend(BigDecimal qtdFinPend) {
        markAsChanged("QTDFINPEND", qtdFinPend);
        this.qtdFinPend = qtdFinPend;
   }

   public BigDecimal getVlrFinPend() {
        return vlrFinPend;
   }

   public void setVlrFinPend(BigDecimal vlrFinPend) {
        markAsChanged("VLRFINPEND", vlrFinPend);
        this.vlrFinPend = vlrFinPend;
   }

   public BigDecimal getVlrOriginal() {
        return vlrOriginal;
   }

   public void setVlrOriginal(BigDecimal vlrOriginal) {
        markAsChanged("VLRORIGINAL", vlrOriginal);
        this.vlrOriginal = vlrOriginal;
   }

   public BigDecimal getVlrServicos() {
        return vlrServicos;
   }

   public void setVlrServicos(BigDecimal vlrServicos) {
        markAsChanged("VLRSERVICOS", vlrServicos);
        this.vlrServicos = vlrServicos;
   }

   public BigDecimal getVlrTotal() {
        return vlrTotal;
   }

   public void setVlrTotal(BigDecimal vlrTotal) {
        markAsChanged("VLRTOTAL", vlrTotal);
        this.vlrTotal = vlrTotal;
   }

   public String getTipoContrato() {
        return tipoContrato;
   }

   public void setTipoContrato(String tipoContrato) {
        markAsChanged("TIPOCONTRATO", tipoContrato);
        this.tipoContrato = tipoContrato;
   }

   public BigDecimal getTipoTitulo() {
        return tipoTitulo;
   }

   public void setTipoTitulo(BigDecimal tipoTitulo) {
        markAsChanged("TIPOTITULO", tipoTitulo);
        this.tipoTitulo = tipoTitulo;
   }

   public String getTipPag() {
        return tipPag;
   }

   public void setTipPag(String tipPag) {
        markAsChanged("TIPPAG", tipPag);
        this.tipPag = tipPag;
   }

   public BigDecimal getTotalContrato() {
        return totalContrato;
   }

   public void setTotalContrato(BigDecimal totalContrato) {
        markAsChanged("TOTALCONTRATO", totalContrato);
        this.totalContrato = totalContrato;
   }

   public BigDecimal getTotalFaturado() {
        return totalFaturado;
   }

   public void setTotalFaturado(BigDecimal totalFaturado) {
        markAsChanged("TOTALFATURADO", totalFaturado);
        this.totalFaturado = totalFaturado;
   }

   public BigDecimal getTotalProvPendente() {
        return totalProvPendente;
   }

   public void setTotalProvPendente(BigDecimal totalProvPendente) {
        markAsChanged("TOTALPROVPENDENTE", totalProvPendente);
        this.totalProvPendente = totalProvPendente;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
        this.valor = valor;
   }

   public String getContrOrgPublico() {
        return contrOrgPublico;
   }

   public void setContrOrgPublico(String contrOrgPublico) {
        markAsChanged("CONTRORGPUBLICO", contrOrgPublico);
        this.contrOrgPublico = contrOrgPublico;
   }

   public String getFaturProrata() {
        return faturProrata;
   }

   public void setFaturProrata(String faturProrata) {
        markAsChanged("FATURPRORATA", faturProrata);
        this.faturProrata = faturProrata;
   }

   public String getGrupoFaturProrata() {
        return grupoFaturProrata;
   }

   public void setGrupoFaturProrata(String grupoFaturProrata) {
        markAsChanged("GRUPOFATURPRORATA", grupoFaturProrata);
        this.grupoFaturProrata = grupoFaturProrata;
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

   public String getControlocBens() {
        return controlocBens;
   }

   public void setControlocBens(String controlocBens) {
        markAsChanged("CONTROLOCBENS", controlocBens);
        this.controlocBens = controlocBens;
   }

   public BigDecimal getQtdProvisao() {
        return qtdProvisao;
   }

   public void setQtdProvisao(BigDecimal qtdProvisao) {
        markAsChanged("QTDPROVISAO", qtdProvisao);
        this.qtdProvisao = qtdProvisao;
   }

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
        this.codCid = codCid;
   }

   public String getReajusteNegativo() {
        return reajusteNegativo;
   }

   public void setReajusteNegativo(String reajusteNegativo) {
        markAsChanged("REAJUSTENEGATIVO", reajusteNegativo);
        this.reajusteNegativo = reajusteNegativo;
   }

   public String getLocacaoBem() {
        return locacaoBem;
   }

   public void setLocacaoBem(String locacaoBem) {
        markAsChanged("LOCACAOBEM", locacaoBem);
        this.locacaoBem = locacaoBem;
   }

   public String getGerarFinNota() {
        return gerarFinNota;
   }

   public void setGerarFinNota(String gerarFinNota) {
        markAsChanged("GERARFINNOTA", gerarFinNota);
        this.gerarFinNota = gerarFinNota;
   }

   public BigDecimal getCodUsuAlter() {
        return codUsuAlter;
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        markAsChanged("CODUSUALTER", codUsuAlter);
        this.codUsuAlter = codUsuAlter;
   }

   public String getTemCrIratEsp() {
        return temCrIratEsp;
   }

   public void setTemCrIratEsp(String temCrIratEsp) {
        markAsChanged("TEMCRIRATESP", temCrIratEsp);
        this.temCrIratEsp = temCrIratEsp;
   }

   public BigDecimal getCodServEx() {
        return codServEx;
   }

   public void setCodServEx(BigDecimal codServEx) {
        markAsChanged("CODSERVEX", codServEx);
        this.codServEx = codServEx;
   }

   public String getNumContIn() {
        return numContIn;
   }

   public void setNumContIn(String numContIn) {
        markAsChanged("NUMCONTIN", numContIn);
        this.numContIn = numContIn;
   }

   public String getCobPropOrCar() {
        return cobPropOrCar;
   }

   public void setCobPropOrCar(String cobPropOrCar) {
        markAsChanged("COBPROPORCAR", cobPropOrCar);
        this.cobPropOrCar = cobPropOrCar;
   }

   public BigDecimal getCodCencusAr() {
        return codCencusAr;
   }

   public void setCodCencusAr(BigDecimal codCencusAr) {
        markAsChanged("CODCENCUSAR", codCencusAr);
        this.codCencusAr = codCencusAr;
   }

   public BigDecimal getCodCencusEx() {
        return codCencusEx;
   }

   public void setCodCencusEx(BigDecimal codCencusEx) {
        markAsChanged("CODCENCUSEX", codCencusEx);
        this.codCencusEx = codCencusEx;
   }

   public BigDecimal getCodNatAr() {
        return codNatAr;
   }

   public void setCodNatAr(BigDecimal codNatAr) {
        markAsChanged("CODNATAR", codNatAr);
        this.codNatAr = codNatAr;
   }

   public BigDecimal getCodNatEx() {
        return codNatEx;
   }

   public void setCodNatEx(BigDecimal codNatEx) {
        markAsChanged("CODNATEX", codNatEx);
        this.codNatEx = codNatEx;
   }

   public BigDecimal getCodSaf() {
        return codSaf;
   }

   public void setCodSaf(BigDecimal codSaf) {
        markAsChanged("CODSAF", codSaf);
        this.codSaf = codSaf;
   }

   public BigDecimal getCodTipVendaAr() {
        return codTipVendaAr;
   }

   public void setCodTipVendaAr(BigDecimal codTipVendaAr) {
        markAsChanged("CODTIPVENDAAR", codTipVendaAr);
        this.codTipVendaAr = codTipVendaAr;
   }

   public BigDecimal getCodTipVendaEx() {
        return codTipVendaEx;
   }

   public void setCodTipVendaEx(BigDecimal codTipVendaEx) {
        markAsChanged("CODTIPVENDAEX", codTipVendaEx);
        this.codTipVendaEx = codTipVendaEx;
   }

   public String getDefTipA() {
        return defTipA;
   }

   public void setDefTipA(String defTipA) {
        markAsChanged("DEFTIPA", defTipA);
        this.defTipA = defTipA;
   }

   public BigDecimal getDiaCareCar() {
        return diaCareCar;
   }

   public void setDiaCareCar(BigDecimal diaCareCar) {
        markAsChanged("DIACARECAR", diaCareCar);
        this.diaCareCar = diaCareCar;
   }

   public BigDecimal getDiaCarenc() {
        return diaCarenc;
   }

   public void setDiaCarenc(BigDecimal diaCarenc) {
        markAsChanged("DIACARENC", diaCarenc);
        this.diaCarenc = diaCarenc;
   }

   public BigDecimal getDiaCarencEx() {
        return diaCarencEx;
   }

   public void setDiaCarencEx(BigDecimal diaCarencEx) {
        markAsChanged("DIACARENCEX", diaCarencEx);
        this.diaCarencEx = diaCarencEx;
   }

   public BigDecimal getPadClass() {
        return padClass;
   }

   public void setPadClass(BigDecimal padClass) {
        markAsChanged("PADCLASS", padClass);
        this.padClass = padClass;
   }

   public String getPercObra() {
        return percObra;
   }

   public void setPercObra(String percObra) {
        markAsChanged("PERCOBRA", percObra);
        this.percObra = percObra;
   }

   public String getPercObraAr() {
        return percObraAr;
   }

   public void setPercObraAr(String percObraAr) {
        markAsChanged("PERCOBRAAR", percObraAr);
        this.percObraAr = percObraAr;
   }

   public String getPercDesc() {
        return percDesc;
   }

   public void setPercDesc(String percDesc) {
        markAsChanged("PERDESC", percDesc);
        this.percDesc = percDesc;
   }

   public String getPercDescon() {
        return percDescon;
   }

   public void setPercDescon(String percDescon) {
        markAsChanged("PERDESCON", percDescon);
        this.percDescon = percDescon;
   }

   public BigDecimal getQuebraTec() {
        return quebraTec;
   }

   public void setQuebraTec(BigDecimal quebraTec) {
        markAsChanged("QUEBRATEC", quebraTec);
        this.quebraTec = quebraTec;
   }

   public BigDecimal getRespPagar() {
        return respPagar;
   }

   public void setRespPagar(BigDecimal respPagar) {
        markAsChanged("RESPPAGAR", respPagar);
        this.respPagar = respPagar;
   }

   public String getSitCont() {
        return sitCont;
   }

   public void setSitCont(String sitCont) {
        markAsChanged("SITCONT", sitCont);
        this.sitCont = sitCont;
   }

   public BigDecimal getTabPrecUmi() {
        return tabPrecUmi;
   }

   public void setTabPrecUmi(BigDecimal tabPrecUmi) {
        markAsChanged("TABPRECUMI", tabPrecUmi);
        this.tabPrecUmi = tabPrecUmi;
   }

   public BigDecimal getTabPrecUmiAr() {
        return tabPrecUmiAr;
   }

   public void setTabPrecUmiAr(BigDecimal tabPrecUmiAr) {
        markAsChanged("TABPRECUMIAR", tabPrecUmiAr);
        this.tabPrecUmiAr = tabPrecUmiAr;
   }

   public String getTipCobr() {
        return tipCobr;
   }

   public void setTipCobr(String tipCobr) {
        markAsChanged("TIPCOBR", tipCobr);
        this.tipCobr = tipCobr;
   }

   public String getTipoArm() {
        return tipoArm;
   }

   public void setTipoArm(String tipoArm) {
        markAsChanged("TIPOARM", tipoArm);
        this.tipoArm = tipoArm;
   }

   public BigDecimal getTipoTituloAr() {
        return tipoTituloAr;
   }

   public void setTipoTituloAr(BigDecimal tipoTituloAr) {
        markAsChanged("TIPOTITULOAR", tipoTituloAr);
        this.tipoTituloAr = tipoTituloAr;
   }

   public BigDecimal getTipoTituloEx() {
        return tipoTituloEx;
   }

   public void setTipoTituloEx(BigDecimal tipoTituloEx) {
        markAsChanged("TIPOTITULOEX", tipoTituloEx);
        this.tipoTituloEx = tipoTituloEx;
   }

   public String getTipQuebra() {
        return tipQuebra;
   }

   public void setTipQuebra(String tipQuebra) {
        markAsChanged("TIPQUEBRA", tipQuebra);
        this.tipQuebra = tipQuebra;
   }

   public String getUltTabUmi() {
        return ultTabUmi;
   }

   public void setUltTabUmi(String ultTabUmi) {
        markAsChanged("ULTTABUMI", ultTabUmi);
        this.ultTabUmi = ultTabUmi;
   }

   public BigDecimal getUmiDpadra() {
        return umiDpadra;
   }

   public void setUmiDpadra(BigDecimal umiDpadra) {
        markAsChanged("UMIDPADRA", umiDpadra);
        this.umiDpadra = umiDpadra;
   }

   public BigDecimal getUniConvSc() {
        return uniConvSc;
   }

   public void setUniConvSc(BigDecimal uniConvSc) {
        markAsChanged("UNICONVSC", uniConvSc);
        this.uniConvSc = uniConvSc;
   }

   public String getValPedFin() {
        return valPedFin;
   }

   public void setValPedFin(String valPedFin) {
        markAsChanged("VALPEDFIN", valPedFin);
        this.valPedFin = valPedFin;
   }

   public String getCobProQue() {
        return cobProQue;
   }

   public void setCobProQue(String cobProQue) {
        markAsChanged("COBPROQUE", cobProQue);
        this.cobProQue = cobProQue;
   }

   public BigDecimal getCodObs() {
        return codObs;
   }

   public void setCodObs(BigDecimal codObs) {
        markAsChanged("CODOBS", codObs);
        this.codObs = codObs;
   }

   public String getDiaFixo() {
        return diaFixo;
   }

   public void setDiaFixo(String diaFixo) {
        markAsChanged("DIAFIXO", diaFixo);
        this.diaFixo = diaFixo;
   }

   public BigDecimal getPrazoMensal() {
        return prazoMensal;
   }

   public void setPrazoMensal(BigDecimal prazoMensal) {
        markAsChanged("PRAZOMENSAL", prazoMensal);
        this.prazoMensal = prazoMensal;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public String getTipIsencao() {
        return tipIsencao;
   }

   public void setTipIsencao(String tipIsencao) {
        markAsChanged("TIPISENCAO", tipIsencao);
        this.tipIsencao = tipIsencao;
   }

   public BigDecimal getCodClc() {
        return codClc;
   }

   public void setCodClc(BigDecimal codClc) {
        markAsChanged("CODCLC", codClc);
        this.codClc = codClc;
   }

   public BigDecimal getNuNotaRefArmaze() {
        return nuNotaRefArmaze;
   }

   public void setNuNotaRefArmaze(BigDecimal nuNotaRefArmaze) {
        markAsChanged("NUNOTAREFARMAZE", nuNotaRefArmaze);
        this.nuNotaRefArmaze = nuNotaRefArmaze;
   }

   public BigDecimal getNuNotaRefExpRec() {
        return nuNotaRefExpRec;
   }

   public void setNuNotaRefExpRec(BigDecimal nuNotaRefExpRec) {
        markAsChanged("NUNOTAREFEXPREC", nuNotaRefExpRec);
        this.nuNotaRefExpRec = nuNotaRefExpRec;
   }

   public BigDecimal getNumCstc() {
        return numCstc;
   }

   public void setNumCstc(BigDecimal numCstc) {
        markAsChanged("NUMCSTC", numCstc);
        this.numCstc = numCstc;
   }

   public Timestamp getDtRefArmaze() {
        return dtRefArmaze;
   }

   public void setDtRefArmaze(Timestamp dtRefArmaze) {
        markAsChanged("DTREFARMAZE", dtRefArmaze);
        this.dtRefArmaze = dtRefArmaze;
   }

   public Timestamp getDtRefExpRec() {
        return dtRefExpRec;
   }

   public void setDtRefExpRec(Timestamp dtRefExpRec) {
        markAsChanged("DTREFEXPREC", dtRefExpRec);
        this.dtRefExpRec = dtRefExpRec;
   }

   public String getFormFatArmaze() {
        return formFatArmaze;
   }

   public void setFormFatArmaze(String formFatArmaze) {
        markAsChanged("FORMFATARMAZE", formFatArmaze);
        this.formFatArmaze = formFatArmaze;
   }

   public String getFormFatExpRec() {
        return formFatExpRec;
   }

   public void setFormFatExpRec(String formFatExpRec) {
        markAsChanged("FORMFATEXPREC", formFatExpRec);
        this.formFatExpRec = formFatExpRec;
   }

   public BigDecimal getValQuebTrans() {
        return valQuebTrans;
   }

   public void setValQuebTrans(BigDecimal valQuebTrans) {
        markAsChanged("VALQUEBTRANS", valQuebTrans);
        this.valQuebTrans = valQuebTrans;
   }

   public String getCifFob() {
        return cifFob;
   }

   public void setCifFob(String cifFob) {
        markAsChanged("CIF_FOB", cifFob);
        this.cifFob = cifFob;
   }

   public String getEndereco() {
        return endereco;
   }

   public void setEndereco(String endereco) {
        markAsChanged("ENDERECO", endereco);
        this.endereco = endereco;
   }

   public String getInscEst() {
        return inscEst;
   }

   public void setInscEst(String inscEst) {
        markAsChanged("INSCEST", inscEst);
        this.inscEst = inscEst;
   }

   public String getNomeParc() {
        return nomeParc;
   }

   public void setNomeParc(String nomeParc) {
        markAsChanged("NOMEPARC", nomeParc);
        this.nomeParc = nomeParc;
   }

   public BigDecimal getQtdePrevista() {
        return qtdePrevista;
   }

   public void setQtdePrevista(BigDecimal qtdePrevista) {
        markAsChanged("QTDEPREVISTA", qtdePrevista);
        this.qtdePrevista = qtdePrevista;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public Timestamp getDtFinEntrega() {
        return dtFinEntrega;
   }

   public void setDtFinEntrega(Timestamp dtFinEntrega) {
        markAsChanged("DTFINENTREGA", dtFinEntrega);
        this.dtFinEntrega = dtFinEntrega;
   }

   public Timestamp getDtIniEntrega() {
        return dtIniEntrega;
   }

   public void setDtIniEntrega(Timestamp dtIniEntrega) {
        markAsChanged("DTINIENTREGA", dtIniEntrega);
        this.dtIniEntrega = dtIniEntrega;
   }

   public String getExigePedidoPes() {
        return exigePedidoPes;
   }

   public void setExigePedidoPes(String exigePedidoPes) {
        markAsChanged("EXIGEPEDIDOPES", exigePedidoPes);
        this.exigePedidoPes = exigePedidoPes;
   }

   public String getModalidade() {
        return modalidade;
   }

   public void setModalidade(String modalidade) {
        markAsChanged("MODALIDADE", modalidade);
        this.modalidade = modalidade;
   }

   public BigDecimal getPercTolExced() {
        return percTolExced;
   }

   public void setPercTolExced(BigDecimal percTolExced) {
        markAsChanged("PERCTOLEXCED", percTolExced);
        this.percTolExced = percTolExced;
   }

   public BigDecimal getQtdNeg() {
        return qtdNeg;
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        markAsChanged("QTDNEG", qtdNeg);
        this.qtdNeg = qtdNeg;
   }

   public String getTipCon() {
        return tipCon;
   }

   public void setTipCon(String tipCon) {
        markAsChanged("TIPCON", tipCon);
        this.tipCon = tipCon;
   }

   public BigDecimal getTotNeg() {
        return totNeg;
   }

   public void setTotNeg(BigDecimal totNeg) {
        markAsChanged("TOTNEG", totNeg);
        this.totNeg = totNeg;
   }

   public BigDecimal getValNegSc() {
        return valNegSc;
   }

   public void setValNegSc(BigDecimal valNegSc) {
        markAsChanged("VALNEGSC", valNegSc);
        this.valNegSc = valNegSc;
   }

   public String getRegLaudSaida() {
        return regLaudSaida;
   }

   public void setRegLaudSaida(String regLaudSaida) {
        markAsChanged("REGLAUDSAIDA", regLaudSaida);
        this.regLaudSaida = regLaudSaida;
   }

   public String getGrupo() {
        return grupo;
   }

   public void setGrupo(String grupo) {
        markAsChanged("GRUPO", grupo);
        this.grupo = grupo;
   }

   public BigDecimal getPpAutAsc() {
        return ppAutAsc;
   }

   public void setPpAutAsc(BigDecimal ppAutAsc) {
        markAsChanged("PPAUTASC", ppAutAsc);
        this.ppAutAsc = ppAutAsc;
   }

   @Override
   public String getTableName() {
        return "TCSCON";
   }

   @Override
   public String getEntityName() {
        return "Contrato";
   }

   @Override
   public Contrato fromVO(DynamicVO vo) {
        this.setVo(vo);
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
        this.temCrIratEsp = vo.asString("TEMCRIRATESP");
        this.codServEx = vo.asBigDecimal("CODSERVEX");
        this.numContIn = vo.asString("NUMCONTIN");
        this.cobPropOrCar = vo.asString("COBPROPORCAR");
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
        this.percDesc = vo.asString("PERDESC");
        this.percDescon = vo.asString("PERDESCON");
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
        this.nuNotaRefExpRec = vo.asBigDecimal("NUNOTAREFEXPREC");
        this.numCstc = vo.asBigDecimal("NUMCSTC");
        this.dtRefArmaze = vo.asTimestamp("DTREFARMAZE");
        this.dtRefExpRec = vo.asTimestamp("DTREFEXPREC");
        this.formFatArmaze = vo.asString("FORMFATARMAZE");
        this.formFatExpRec = vo.asString("FORMFATEXPREC");
        this.valQuebTrans = vo.asBigDecimal("VALQUEBTRANS");
        this.cifFob = vo.asString("CIF_FOB");
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
