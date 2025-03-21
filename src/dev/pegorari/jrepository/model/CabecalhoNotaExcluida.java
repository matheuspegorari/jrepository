package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoNotaExcluida extends AbstractSankhyaEntity<CabecalhoNotaExcluida> {
   private BigDecimal codParctranspFinal;
   private BigDecimal vlrFreteTotal;
   private String numNfse;
   private Timestamp dhTipVenda;
   private Timestamp dtAlter;
   private Timestamp dtContab;
   private Timestamp dtEntSai;
   private Timestamp dtFatur;
   private Timestamp dtMov;
   private Timestamp dtNeg;
   private Timestamp dtVal;
   private String hostname;
   private BigDecimal hrMov;
   private BigDecimal icmsFrete;
   private BigDecimal ipiEmb;
   private String irFretido;
   private String issRetido;
   private BigDecimal kmVeiculo;
   private String localColeta;
   private String localEntrega;
   private String notaScf;
   private BigDecimal nroRedz;
   private String ntUsername;
   private BigDecimal numContrato;
   private BigDecimal numCotacao;
   private BigDecimal numNota;
   private BigDecimal nuNota;
   private String observacao;
   private BigDecimal ordemCarga;
   private String pendente;
   private BigDecimal percDesc;
   private BigDecimal peso;
   private BigDecimal qtdVol;
   private String rateado;
   private BigDecimal seqCarga;
   private String serieNota;
   private String statusNota;
   private String tipFrete;
   private String tipIpiEmb;
   private String tipMov;
   private Timestamp vencFrete;
   private Timestamp vencIpi;
   private BigDecimal vlrDescServ;
   private BigDecimal vlrDescTot;
   private BigDecimal vlrDescTotItem;
   private BigDecimal vlrDestaque;
   private BigDecimal vlrEmb;
   private BigDecimal vlrFrete;
   private BigDecimal vlrIcmsFcp;
   private BigDecimal vlrIcmsDifAlDest;
   private BigDecimal vlrIcmsDifAlRem;
   private BigDecimal vlrIcms;
   private BigDecimal vlrIcmsEmb;
   private BigDecimal vlrIcmsSeg;
   private BigDecimal vlrInss;
   private BigDecimal vlrIpi;
   private BigDecimal vlrIrf;
   private BigDecimal vlrIss;
   private BigDecimal vlrJuro;
   private BigDecimal vlrMercadoria;
   private BigDecimal vlrNota;
   private BigDecimal vlrOutros;
   private BigDecimal vlrRepredTot;
   private BigDecimal vlrSeg;
   private BigDecimal vlrSubst;
   private BigDecimal vlrVendor;
   private String volume;
   private String aprovado;
   private BigDecimal baseIcms;
   private BigDecimal baseIcmsFrete;
   private BigDecimal baseInss;
   private BigDecimal baseIpi;
   private BigDecimal baseIss;
   private BigDecimal baseSubstit;
   private String cifFob;
   private BigDecimal codCencus;
   private BigDecimal codContato;
   private BigDecimal codEmp;
   private BigDecimal codEmpNegoc;
   private BigDecimal codMaq;
   private BigDecimal codMoeda;
   private BigDecimal codNat;
   private BigDecimal codObsPadrao;
   private BigDecimal codParc;
   private BigDecimal codParcConsignatario;
   private BigDecimal codParcDest;
   private BigDecimal codParcRedespacho;
   private BigDecimal codParcRemetente;
   private BigDecimal codParctransp;
   private BigDecimal codProj;
   private BigDecimal codTipOper;
   private BigDecimal codTipVenda;
   private BigDecimal codUsu;
   private BigDecimal codVeiculo;
   private BigDecimal codVend;
   private BigDecimal comGer;
   private BigDecimal comissao;
   private Timestamp dhExclusao;
   private Timestamp dhTipOper;
   private BigDecimal vlrStFcpIntAnt;
   private BigDecimal vlrIcmsFcpInt;
   private BigDecimal vlrStFcpInt;
   private String fistel;
   private String md5ModComTel;
   private BigDecimal numCstc;
   private String numTermTel;
   private BigDecimal qtdUsu;
   private BigDecimal tipClienteServCom;

   public BigDecimal getCodParctranspFinal() {
        return codParctranspFinal;
   }

   public void setCodParctranspFinal(BigDecimal codParctranspFinal) {
        markAsChanged("CODPARCTRANSPFINAL", codParctranspFinal);
        this.codParctranspFinal = codParctranspFinal;
   }

   public BigDecimal getVlrFreteTotal() {
        return vlrFreteTotal;
   }

   public void setVlrFreteTotal(BigDecimal vlrFreteTotal) {
        markAsChanged("VLRFRETETOTAL", vlrFreteTotal);
        this.vlrFreteTotal = vlrFreteTotal;
   }

   public String getNumNfse() {
        return numNfse;
   }

   public void setNumNfse(String numNfse) {
        markAsChanged("NUMNFSE", numNfse);
        this.numNfse = numNfse;
   }

   public Timestamp getDhTipVenda() {
        return dhTipVenda;
   }

   public void setDhTipVenda(Timestamp dhTipVenda) {
        markAsChanged("DHTIPVENDA", dhTipVenda);
        this.dhTipVenda = dhTipVenda;
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

   public Timestamp getDtVal() {
        return dtVal;
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
        this.dtVal = dtVal;
   }

   public String getHostname() {
        return hostname;
   }

   public void setHostname(String hostname) {
        markAsChanged("HOSTNAME", hostname);
        this.hostname = hostname;
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

   public String getNotaScf() {
        return notaScf;
   }

   public void setNotaScf(String notaScf) {
        markAsChanged("NOTASCF", notaScf);
        this.notaScf = notaScf;
   }

   public BigDecimal getNroRedz() {
        return nroRedz;
   }

   public void setNroRedz(BigDecimal nroRedz) {
        markAsChanged("NROREDZ", nroRedz);
        this.nroRedz = nroRedz;
   }

   public String getNtUsername() {
        return ntUsername;
   }

   public void setNtUsername(String ntUsername) {
        markAsChanged("NT_USERNAME", ntUsername);
        this.ntUsername = ntUsername;
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

   public BigDecimal getNumNota() {
        return numNota;
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
        this.numNota = numNota;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public BigDecimal getOrdemCarga() {
        return ordemCarga;
   }

   public void setOrdemCarga(BigDecimal ordemCarga) {
        markAsChanged("ORDEMCARGA", ordemCarga);
        this.ordemCarga = ordemCarga;
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

   public BigDecimal getSeqCarga() {
        return seqCarga;
   }

   public void setSeqCarga(BigDecimal seqCarga) {
        markAsChanged("SEQCARGA", seqCarga);
        this.seqCarga = seqCarga;
   }

   public String getSerieNota() {
        return serieNota;
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
        this.serieNota = serieNota;
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

   public String getTipMov() {
        return tipMov;
   }

   public void setTipMov(String tipMov) {
        markAsChanged("TIPMOV", tipMov);
        this.tipMov = tipMov;
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

   public BigDecimal getVlrMercadoria() {
        return vlrMercadoria;
   }

   public void setVlrMercadoria(BigDecimal vlrMercadoria) {
        markAsChanged("VLRMERCADORIA", vlrMercadoria);
        this.vlrMercadoria = vlrMercadoria;
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

   public BigDecimal getVlrRepredTot() {
        return vlrRepredTot;
   }

   public void setVlrRepredTot(BigDecimal vlrRepredTot) {
        markAsChanged("VLRREPREDTOT", vlrRepredTot);
        this.vlrRepredTot = vlrRepredTot;
   }

   public BigDecimal getVlrSeg() {
        return vlrSeg;
   }

   public void setVlrSeg(BigDecimal vlrSeg) {
        markAsChanged("VLRSEG", vlrSeg);
        this.vlrSeg = vlrSeg;
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

   public String getAprovado() {
        return aprovado;
   }

   public void setAprovado(String aprovado) {
        markAsChanged("APROVADO", aprovado);
        this.aprovado = aprovado;
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

   public BigDecimal getBaseIss() {
        return baseIss;
   }

   public void setBaseIss(BigDecimal baseIss) {
        markAsChanged("BASEISS", baseIss);
        this.baseIss = baseIss;
   }

   public BigDecimal getBaseSubstit() {
        return baseSubstit;
   }

   public void setBaseSubstit(BigDecimal baseSubstit) {
        markAsChanged("BASESUBSTIT", baseSubstit);
        this.baseSubstit = baseSubstit;
   }

   public String getCifFob() {
        return cifFob;
   }

   public void setCifFob(String cifFob) {
        markAsChanged("CIF_FOB", cifFob);
        this.cifFob = cifFob;
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

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEmpNegoc() {
        return codEmpNegoc;
   }

   public void setCodEmpNegoc(BigDecimal codEmpNegoc) {
        markAsChanged("CODEMPNEGOC", codEmpNegoc);
        this.codEmpNegoc = codEmpNegoc;
   }

   public BigDecimal getCodMaq() {
        return codMaq;
   }

   public void setCodMaq(BigDecimal codMaq) {
        markAsChanged("CODMAQ", codMaq);
        this.codMaq = codMaq;
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

   public BigDecimal getCodParctransp() {
        return codParctransp;
   }

   public void setCodParctransp(BigDecimal codParctransp) {
        markAsChanged("CODPARCTRANSP", codParctransp);
        this.codParctransp = codParctransp;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
        this.codProj = codProj;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
        this.codTipOper = codTipOper;
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

   public Timestamp getDhExclusao() {
        return dhExclusao;
   }

   public void setDhExclusao(Timestamp dhExclusao) {
        markAsChanged("DHEXCLUSAO", dhExclusao);
        this.dhExclusao = dhExclusao;
   }

   public Timestamp getDhTipOper() {
        return dhTipOper;
   }

   public void setDhTipOper(Timestamp dhTipOper) {
        markAsChanged("DHTIPOPER", dhTipOper);
        this.dhTipOper = dhTipOper;
   }

   public BigDecimal getVlrStFcpIntAnt() {
        return vlrStFcpIntAnt;
   }

   public void setVlrStFcpIntAnt(BigDecimal vlrStFcpIntAnt) {
        markAsChanged("VLRSTFCPINTANT", vlrStFcpIntAnt);
        this.vlrStFcpIntAnt = vlrStFcpIntAnt;
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

   @Override
   public String getTableName() {
        return "TGFCAB_EXC";
   }

   @Override
   public String getEntityName() {
        return "CabecalhoNotaExcluida";
   }

   @Override
   public CabecalhoNotaExcluida fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codParctranspFinal = vo.asBigDecimal("CODPARCTRANSPFINAL");
        this.vlrFreteTotal = vo.asBigDecimal("VLRFRETETOTAL");
        this.numNfse = vo.asString("NUMNFSE");
        this.dhTipVenda = vo.asTimestamp("DHTIPVENDA");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtContab = vo.asTimestamp("DTCONTAB");
        this.dtEntSai = vo.asTimestamp("DTENTSAI");
        this.dtFatur = vo.asTimestamp("DTFATUR");
        this.dtMov = vo.asTimestamp("DTMOV");
        this.dtNeg = vo.asTimestamp("DTNEG");
        this.dtVal = vo.asTimestamp("DTVAL");
        this.hostname = vo.asString("HOSTNAME");
        this.hrMov = vo.asBigDecimal("HRMOV");
        this.icmsFrete = vo.asBigDecimal("ICMSFRETE");
        this.ipiEmb = vo.asBigDecimal("IPIEMB");
        this.irFretido = vo.asString("IRFRETIDO");
        this.issRetido = vo.asString("ISSRETIDO");
        this.kmVeiculo = vo.asBigDecimal("KMVEICULO");
        this.localColeta = vo.asString("LOCALCOLETA");
        this.localEntrega = vo.asString("LOCALENTREGA");
        this.notaScf = vo.asString("NOTASCF");
        this.nroRedz = vo.asBigDecimal("NROREDZ");
        this.ntUsername = vo.asString("NT_USERNAME");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.numCotacao = vo.asBigDecimal("NUMCOTACAO");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.observacao = vo.asString("OBSERVACAO");
        this.ordemCarga = vo.asBigDecimal("ORDEMCARGA");
        this.pendente = vo.asString("PENDENTE");
        this.percDesc = vo.asBigDecimal("PERCDESC");
        this.peso = vo.asBigDecimal("PESO");
        this.qtdVol = vo.asBigDecimal("QTDVOL");
        this.rateado = vo.asString("RATEADO");
        this.seqCarga = vo.asBigDecimal("SEQCARGA");
        this.serieNota = vo.asString("SERIENOTA");
        this.statusNota = vo.asString("STATUSNOTA");
        this.tipFrete = vo.asString("TIPFRETE");
        this.tipIpiEmb = vo.asString("TIPIPIEMB");
        this.tipMov = vo.asString("TIPMOV");
        this.vencFrete = vo.asTimestamp("VENCFRETE");
        this.vencIpi = vo.asTimestamp("VENCIPI");
        this.vlrDescServ = vo.asBigDecimal("VLRDESCSERV");
        this.vlrDescTot = vo.asBigDecimal("VLRDESCTOT");
        this.vlrDescTotItem = vo.asBigDecimal("VLRDESCTOTITEM");
        this.vlrDestaque = vo.asBigDecimal("VLRDESTAQUE");
        this.vlrEmb = vo.asBigDecimal("VLREMB");
        this.vlrFrete = vo.asBigDecimal("VLRFRETE");
        this.vlrIcmsFcp = vo.asBigDecimal("VLRICMSFCP");
        this.vlrIcmsDifAlDest = vo.asBigDecimal("VLRICMSDIFALDEST");
        this.vlrIcmsDifAlRem = vo.asBigDecimal("VLRICMSDIFALREM");
        this.vlrIcms = vo.asBigDecimal("VLRICMS");
        this.vlrIcmsEmb = vo.asBigDecimal("VLRICMSEMB");
        this.vlrIcmsSeg = vo.asBigDecimal("VLRICMSSEG");
        this.vlrInss = vo.asBigDecimal("VLRINSS");
        this.vlrIpi = vo.asBigDecimal("VLRIPI");
        this.vlrIrf = vo.asBigDecimal("VLRIRF");
        this.vlrIss = vo.asBigDecimal("VLRISS");
        this.vlrJuro = vo.asBigDecimal("VLRJURO");
        this.vlrMercadoria = vo.asBigDecimal("VLRMERCADORIA");
        this.vlrNota = vo.asBigDecimal("VLRNOTA");
        this.vlrOutros = vo.asBigDecimal("VLROUTROS");
        this.vlrRepredTot = vo.asBigDecimal("VLRREPREDTOT");
        this.vlrSeg = vo.asBigDecimal("VLRSEG");
        this.vlrSubst = vo.asBigDecimal("VLRSUBST");
        this.vlrVendor = vo.asBigDecimal("VLRVENDOR");
        this.volume = vo.asString("VOLUME");
        this.aprovado = vo.asString("APROVADO");
        this.baseIcms = vo.asBigDecimal("BASEICMS");
        this.baseIcmsFrete = vo.asBigDecimal("BASEICMSFRETE");
        this.baseInss = vo.asBigDecimal("BASEINSS");
        this.baseIpi = vo.asBigDecimal("BASEIPI");
        this.baseIss = vo.asBigDecimal("BASEISS");
        this.baseSubstit = vo.asBigDecimal("BASESUBSTIT");
        this.cifFob = vo.asString("CIF_FOB");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codContato = vo.asBigDecimal("CODCONTATO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEmpNegoc = vo.asBigDecimal("CODEMPNEGOC");
        this.codMaq = vo.asBigDecimal("CODMAQ");
        this.codMoeda = vo.asBigDecimal("CODMOEDA");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codObsPadrao = vo.asBigDecimal("CODOBSPADRAO");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codParcConsignatario = vo.asBigDecimal("CODPARCCONSIGNATARIO");
        this.codParcDest = vo.asBigDecimal("CODPARCDEST");
        this.codParcRedespacho = vo.asBigDecimal("CODPARCREDESPACHO");
        this.codParcRemetente = vo.asBigDecimal("CODPARCREMETENTE");
        this.codParctransp = vo.asBigDecimal("CODPARCTRANSP");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.codTipVenda = vo.asBigDecimal("CODTIPVENDA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVeiculo = vo.asBigDecimal("CODVEICULO");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.comGer = vo.asBigDecimal("COMGER");
        this.comissao = vo.asBigDecimal("COMISSAO");
        this.dhExclusao = vo.asTimestamp("DHEXCLUSAO");
        this.dhTipOper = vo.asTimestamp("DHTIPOPER");
        this.vlrStFcpIntAnt = vo.asBigDecimal("VLRSTFCPINTANT");
        this.vlrIcmsFcpInt = vo.asBigDecimal("VLRICMSFCPINT");
        this.vlrStFcpInt = vo.asBigDecimal("VLRSTFCPINT");
        this.fistel = vo.asString("FISTEL");
        this.md5ModComTel = vo.asString("MD5MODCOMTEL");
        this.numCstc = vo.asBigDecimal("NUMCSTC");
        this.numTermTel = vo.asString("NUMTERMTEL");
        this.qtdUsu = vo.asBigDecimal("QTDUSU");
        this.tipClienteServCom = vo.asBigDecimal("TIPCLIENTESERVCOM");
        return this;
   }
}
