package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoNotaExcluida extends AbstractSankhyaEntity<CabecalhoNotaExcluida> {
   public BigDecimal getCodParctranspFinal() {
        return this.getVo().asBigDecimal("CODPARCTRANSPFINAL");
   }

   public void setCodParctranspFinal(BigDecimal codParctranspFinal) {
        markAsChanged("CODPARCTRANSPFINAL", codParctranspFinal);
   }

   public BigDecimal getVlrFreteTotal() {
        return this.getVo().asBigDecimal("VLRFRETETOTAL");
   }

   public void setVlrFreteTotal(BigDecimal vlrFreteTotal) {
        markAsChanged("VLRFRETETOTAL", vlrFreteTotal);
   }

   public String getNumNfse() {
        return this.getVo().asString("NUMNFSE");
   }

   public void setNumNfse(String numNfse) {
        markAsChanged("NUMNFSE", numNfse);
   }

   public Timestamp getDhTipVenda() {
        return this.getVo().asTimestamp("DHTIPVENDA");
   }

   public void setDhTipVenda(Timestamp dhTipVenda) {
        markAsChanged("DHTIPVENDA", dhTipVenda);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtContab() {
        return this.getVo().asTimestamp("DTCONTAB");
   }

   public void setDtContab(Timestamp dtContab) {
        markAsChanged("DTCONTAB", dtContab);
   }

   public Timestamp getDtEntSai() {
        return this.getVo().asTimestamp("DTENTSAI");
   }

   public void setDtEntSai(Timestamp dtEntSai) {
        markAsChanged("DTENTSAI", dtEntSai);
   }

   public Timestamp getDtFatur() {
        return this.getVo().asTimestamp("DTFATUR");
   }

   public void setDtFatur(Timestamp dtFatur) {
        markAsChanged("DTFATUR", dtFatur);
   }

   public Timestamp getDtMov() {
        return this.getVo().asTimestamp("DTMOV");
   }

   public void setDtMov(Timestamp dtMov) {
        markAsChanged("DTMOV", dtMov);
   }

   public Timestamp getDtNeg() {
        return this.getVo().asTimestamp("DTNEG");
   }

   public void setDtNeg(Timestamp dtNeg) {
        markAsChanged("DTNEG", dtNeg);
   }

   public Timestamp getDtVal() {
        return this.getVo().asTimestamp("DTVAL");
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
   }

   public String getHostname() {
        return this.getVo().asString("HOSTNAME");
   }

   public void setHostname(String hostname) {
        markAsChanged("HOSTNAME", hostname);
   }

   public BigDecimal getHrMov() {
        return this.getVo().asBigDecimal("HRMOV");
   }

   public void setHrMov(BigDecimal hrMov) {
        markAsChanged("HRMOV", hrMov);
   }

   public BigDecimal getIcmsFrete() {
        return this.getVo().asBigDecimal("ICMSFRETE");
   }

   public void setIcmsFrete(BigDecimal icmsFrete) {
        markAsChanged("ICMSFRETE", icmsFrete);
   }

   public BigDecimal getIpiEmb() {
        return this.getVo().asBigDecimal("IPIEMB");
   }

   public void setIpiEmb(BigDecimal ipiEmb) {
        markAsChanged("IPIEMB", ipiEmb);
   }

   public String getIrFretido() {
        return this.getVo().asString("IRFRETIDO");
   }

   public void setIrFretido(String irFretido) {
        markAsChanged("IRFRETIDO", irFretido);
   }

   public String getIssRetido() {
        return this.getVo().asString("ISSRETIDO");
   }

   public void setIssRetido(String issRetido) {
        markAsChanged("ISSRETIDO", issRetido);
   }

   public BigDecimal getKmVeiculo() {
        return this.getVo().asBigDecimal("KMVEICULO");
   }

   public void setKmVeiculo(BigDecimal kmVeiculo) {
        markAsChanged("KMVEICULO", kmVeiculo);
   }

   public String getLocalColeta() {
        return this.getVo().asString("LOCALCOLETA");
   }

   public void setLocalColeta(String localColeta) {
        markAsChanged("LOCALCOLETA", localColeta);
   }

   public String getLocalEntrega() {
        return this.getVo().asString("LOCALENTREGA");
   }

   public void setLocalEntrega(String localEntrega) {
        markAsChanged("LOCALENTREGA", localEntrega);
   }

   public String getNotaScf() {
        return this.getVo().asString("NOTASCF");
   }

   public void setNotaScf(String notaScf) {
        markAsChanged("NOTASCF", notaScf);
   }

   public BigDecimal getNroRedz() {
        return this.getVo().asBigDecimal("NROREDZ");
   }

   public void setNroRedz(BigDecimal nroRedz) {
        markAsChanged("NROREDZ", nroRedz);
   }

   public String getNtUsername() {
        return this.getVo().asString("NT_USERNAME");
   }

   public void setNtUsername(String ntUsername) {
        markAsChanged("NT_USERNAME", ntUsername);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public BigDecimal getNumCotacao() {
        return this.getVo().asBigDecimal("NUMCOTACAO");
   }

   public void setNumCotacao(BigDecimal numCotacao) {
        markAsChanged("NUMCOTACAO", numCotacao);
   }

   public BigDecimal getNumNota() {
        return this.getVo().asBigDecimal("NUMNOTA");
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public BigDecimal getOrdemCarga() {
        return this.getVo().asBigDecimal("ORDEMCARGA");
   }

   public void setOrdemCarga(BigDecimal ordemCarga) {
        markAsChanged("ORDEMCARGA", ordemCarga);
   }

   public String getPendente() {
        return this.getVo().asString("PENDENTE");
   }

   public void setPendente(String pendente) {
        markAsChanged("PENDENTE", pendente);
   }

   public BigDecimal getPercDesc() {
        return this.getVo().asBigDecimal("PERCDESC");
   }

   public void setPercDesc(BigDecimal percDesc) {
        markAsChanged("PERCDESC", percDesc);
   }

   public BigDecimal getPeso() {
        return this.getVo().asBigDecimal("PESO");
   }

   public void setPeso(BigDecimal peso) {
        markAsChanged("PESO", peso);
   }

   public BigDecimal getQtdVol() {
        return this.getVo().asBigDecimal("QTDVOL");
   }

   public void setQtdVol(BigDecimal qtdVol) {
        markAsChanged("QTDVOL", qtdVol);
   }

   public String getRateado() {
        return this.getVo().asString("RATEADO");
   }

   public void setRateado(String rateado) {
        markAsChanged("RATEADO", rateado);
   }

   public BigDecimal getSeqCarga() {
        return this.getVo().asBigDecimal("SEQCARGA");
   }

   public void setSeqCarga(BigDecimal seqCarga) {
        markAsChanged("SEQCARGA", seqCarga);
   }

   public String getSerieNota() {
        return this.getVo().asString("SERIENOTA");
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
   }

   public String getStatusNota() {
        return this.getVo().asString("STATUSNOTA");
   }

   public void setStatusNota(String statusNota) {
        markAsChanged("STATUSNOTA", statusNota);
   }

   public String getTipFrete() {
        return this.getVo().asString("TIPFRETE");
   }

   public void setTipFrete(String tipFrete) {
        markAsChanged("TIPFRETE", tipFrete);
   }

   public String getTipIpiEmb() {
        return this.getVo().asString("TIPIPIEMB");
   }

   public void setTipIpiEmb(String tipIpiEmb) {
        markAsChanged("TIPIPIEMB", tipIpiEmb);
   }

   public String getTipMov() {
        return this.getVo().asString("TIPMOV");
   }

   public void setTipMov(String tipMov) {
        markAsChanged("TIPMOV", tipMov);
   }

   public Timestamp getVencFrete() {
        return this.getVo().asTimestamp("VENCFRETE");
   }

   public void setVencFrete(Timestamp vencFrete) {
        markAsChanged("VENCFRETE", vencFrete);
   }

   public Timestamp getVencIpi() {
        return this.getVo().asTimestamp("VENCIPI");
   }

   public void setVencIpi(Timestamp vencIpi) {
        markAsChanged("VENCIPI", vencIpi);
   }

   public BigDecimal getVlrDescServ() {
        return this.getVo().asBigDecimal("VLRDESCSERV");
   }

   public void setVlrDescServ(BigDecimal vlrDescServ) {
        markAsChanged("VLRDESCSERV", vlrDescServ);
   }

   public BigDecimal getVlrDescTot() {
        return this.getVo().asBigDecimal("VLRDESCTOT");
   }

   public void setVlrDescTot(BigDecimal vlrDescTot) {
        markAsChanged("VLRDESCTOT", vlrDescTot);
   }

   public BigDecimal getVlrDescTotItem() {
        return this.getVo().asBigDecimal("VLRDESCTOTITEM");
   }

   public void setVlrDescTotItem(BigDecimal vlrDescTotItem) {
        markAsChanged("VLRDESCTOTITEM", vlrDescTotItem);
   }

   public BigDecimal getVlrDestaque() {
        return this.getVo().asBigDecimal("VLRDESTAQUE");
   }

   public void setVlrDestaque(BigDecimal vlrDestaque) {
        markAsChanged("VLRDESTAQUE", vlrDestaque);
   }

   public BigDecimal getVlrEmb() {
        return this.getVo().asBigDecimal("VLREMB");
   }

   public void setVlrEmb(BigDecimal vlrEmb) {
        markAsChanged("VLREMB", vlrEmb);
   }

   public BigDecimal getVlrFrete() {
        return this.getVo().asBigDecimal("VLRFRETE");
   }

   public void setVlrFrete(BigDecimal vlrFrete) {
        markAsChanged("VLRFRETE", vlrFrete);
   }

   public BigDecimal getVlrIcmsFcp() {
        return this.getVo().asBigDecimal("VLRICMSFCP");
   }

   public void setVlrIcmsFcp(BigDecimal vlrIcmsFcp) {
        markAsChanged("VLRICMSFCP", vlrIcmsFcp);
   }

   public BigDecimal getVlrIcmsDifAlDest() {
        return this.getVo().asBigDecimal("VLRICMSDIFALDEST");
   }

   public void setVlrIcmsDifAlDest(BigDecimal vlrIcmsDifAlDest) {
        markAsChanged("VLRICMSDIFALDEST", vlrIcmsDifAlDest);
   }

   public BigDecimal getVlrIcmsDifAlRem() {
        return this.getVo().asBigDecimal("VLRICMSDIFALREM");
   }

   public void setVlrIcmsDifAlRem(BigDecimal vlrIcmsDifAlRem) {
        markAsChanged("VLRICMSDIFALREM", vlrIcmsDifAlRem);
   }

   public BigDecimal getVlrIcms() {
        return this.getVo().asBigDecimal("VLRICMS");
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
   }

   public BigDecimal getVlrIcmsEmb() {
        return this.getVo().asBigDecimal("VLRICMSEMB");
   }

   public void setVlrIcmsEmb(BigDecimal vlrIcmsEmb) {
        markAsChanged("VLRICMSEMB", vlrIcmsEmb);
   }

   public BigDecimal getVlrIcmsSeg() {
        return this.getVo().asBigDecimal("VLRICMSSEG");
   }

   public void setVlrIcmsSeg(BigDecimal vlrIcmsSeg) {
        markAsChanged("VLRICMSSEG", vlrIcmsSeg);
   }

   public BigDecimal getVlrInss() {
        return this.getVo().asBigDecimal("VLRINSS");
   }

   public void setVlrInss(BigDecimal vlrInss) {
        markAsChanged("VLRINSS", vlrInss);
   }

   public BigDecimal getVlrIpi() {
        return this.getVo().asBigDecimal("VLRIPI");
   }

   public void setVlrIpi(BigDecimal vlrIpi) {
        markAsChanged("VLRIPI", vlrIpi);
   }

   public BigDecimal getVlrIrf() {
        return this.getVo().asBigDecimal("VLRIRF");
   }

   public void setVlrIrf(BigDecimal vlrIrf) {
        markAsChanged("VLRIRF", vlrIrf);
   }

   public BigDecimal getVlrIss() {
        return this.getVo().asBigDecimal("VLRISS");
   }

   public void setVlrIss(BigDecimal vlrIss) {
        markAsChanged("VLRISS", vlrIss);
   }

   public BigDecimal getVlrJuro() {
        return this.getVo().asBigDecimal("VLRJURO");
   }

   public void setVlrJuro(BigDecimal vlrJuro) {
        markAsChanged("VLRJURO", vlrJuro);
   }

   public BigDecimal getVlrMercadoria() {
        return this.getVo().asBigDecimal("VLRMERCADORIA");
   }

   public void setVlrMercadoria(BigDecimal vlrMercadoria) {
        markAsChanged("VLRMERCADORIA", vlrMercadoria);
   }

   public BigDecimal getVlrNota() {
        return this.getVo().asBigDecimal("VLRNOTA");
   }

   public void setVlrNota(BigDecimal vlrNota) {
        markAsChanged("VLRNOTA", vlrNota);
   }

   public BigDecimal getVlrOutros() {
        return this.getVo().asBigDecimal("VLROUTROS");
   }

   public void setVlrOutros(BigDecimal vlrOutros) {
        markAsChanged("VLROUTROS", vlrOutros);
   }

   public BigDecimal getVlrRepredTot() {
        return this.getVo().asBigDecimal("VLRREPREDTOT");
   }

   public void setVlrRepredTot(BigDecimal vlrRepredTot) {
        markAsChanged("VLRREPREDTOT", vlrRepredTot);
   }

   public BigDecimal getVlrSeg() {
        return this.getVo().asBigDecimal("VLRSEG");
   }

   public void setVlrSeg(BigDecimal vlrSeg) {
        markAsChanged("VLRSEG", vlrSeg);
   }

   public BigDecimal getVlrSubst() {
        return this.getVo().asBigDecimal("VLRSUBST");
   }

   public void setVlrSubst(BigDecimal vlrSubst) {
        markAsChanged("VLRSUBST", vlrSubst);
   }

   public BigDecimal getVlrVendor() {
        return this.getVo().asBigDecimal("VLRVENDOR");
   }

   public void setVlrVendor(BigDecimal vlrVendor) {
        markAsChanged("VLRVENDOR", vlrVendor);
   }

   public String getVolume() {
        return this.getVo().asString("VOLUME");
   }

   public void setVolume(String volume) {
        markAsChanged("VOLUME", volume);
   }

   public String getAprovado() {
        return this.getVo().asString("APROVADO");
   }

   public void setAprovado(String aprovado) {
        markAsChanged("APROVADO", aprovado);
   }

   public BigDecimal getBaseIcms() {
        return this.getVo().asBigDecimal("BASEICMS");
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        markAsChanged("BASEICMS", baseIcms);
   }

   public BigDecimal getBaseIcmsFrete() {
        return this.getVo().asBigDecimal("BASEICMSFRETE");
   }

   public void setBaseIcmsFrete(BigDecimal baseIcmsFrete) {
        markAsChanged("BASEICMSFRETE", baseIcmsFrete);
   }

   public BigDecimal getBaseInss() {
        return this.getVo().asBigDecimal("BASEINSS");
   }

   public void setBaseInss(BigDecimal baseInss) {
        markAsChanged("BASEINSS", baseInss);
   }

   public BigDecimal getBaseIpi() {
        return this.getVo().asBigDecimal("BASEIPI");
   }

   public void setBaseIpi(BigDecimal baseIpi) {
        markAsChanged("BASEIPI", baseIpi);
   }

   public BigDecimal getBaseIss() {
        return this.getVo().asBigDecimal("BASEISS");
   }

   public void setBaseIss(BigDecimal baseIss) {
        markAsChanged("BASEISS", baseIss);
   }

   public BigDecimal getBaseSubstit() {
        return this.getVo().asBigDecimal("BASESUBSTIT");
   }

   public void setBaseSubstit(BigDecimal baseSubstit) {
        markAsChanged("BASESUBSTIT", baseSubstit);
   }

   public String getCifFob() {
        return this.getVo().asString("CIF_FOB");
   }

   public void setCifFob(String cifFob) {
        markAsChanged("CIF_FOB", cifFob);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodContato() {
        return this.getVo().asBigDecimal("CODCONTATO");
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEmpNegoc() {
        return this.getVo().asBigDecimal("CODEMPNEGOC");
   }

   public void setCodEmpNegoc(BigDecimal codEmpNegoc) {
        markAsChanged("CODEMPNEGOC", codEmpNegoc);
   }

   public BigDecimal getCodMaq() {
        return this.getVo().asBigDecimal("CODMAQ");
   }

   public void setCodMaq(BigDecimal codMaq) {
        markAsChanged("CODMAQ", codMaq);
   }

   public BigDecimal getCodMoeda() {
        return this.getVo().asBigDecimal("CODMOEDA");
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getCodObsPadrao() {
        return this.getVo().asBigDecimal("CODOBSPADRAO");
   }

   public void setCodObsPadrao(BigDecimal codObsPadrao) {
        markAsChanged("CODOBSPADRAO", codObsPadrao);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodParcConsignatario() {
        return this.getVo().asBigDecimal("CODPARCCONSIGNATARIO");
   }

   public void setCodParcConsignatario(BigDecimal codParcConsignatario) {
        markAsChanged("CODPARCCONSIGNATARIO", codParcConsignatario);
   }

   public BigDecimal getCodParcDest() {
        return this.getVo().asBigDecimal("CODPARCDEST");
   }

   public void setCodParcDest(BigDecimal codParcDest) {
        markAsChanged("CODPARCDEST", codParcDest);
   }

   public BigDecimal getCodParcRedespacho() {
        return this.getVo().asBigDecimal("CODPARCREDESPACHO");
   }

   public void setCodParcRedespacho(BigDecimal codParcRedespacho) {
        markAsChanged("CODPARCREDESPACHO", codParcRedespacho);
   }

   public BigDecimal getCodParcRemetente() {
        return this.getVo().asBigDecimal("CODPARCREMETENTE");
   }

   public void setCodParcRemetente(BigDecimal codParcRemetente) {
        markAsChanged("CODPARCREMETENTE", codParcRemetente);
   }

   public BigDecimal getCodParctransp() {
        return this.getVo().asBigDecimal("CODPARCTRANSP");
   }

   public void setCodParctransp(BigDecimal codParctransp) {
        markAsChanged("CODPARCTRANSP", codParctransp);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public BigDecimal getCodTipVenda() {
        return this.getVo().asBigDecimal("CODTIPVENDA");
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodVeiculo() {
        return this.getVo().asBigDecimal("CODVEICULO");
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public BigDecimal getComGer() {
        return this.getVo().asBigDecimal("COMGER");
   }

   public void setComGer(BigDecimal comGer) {
        markAsChanged("COMGER", comGer);
   }

   public BigDecimal getComissao() {
        return this.getVo().asBigDecimal("COMISSAO");
   }

   public void setComissao(BigDecimal comissao) {
        markAsChanged("COMISSAO", comissao);
   }

   public Timestamp getDhExclusao() {
        return this.getVo().asTimestamp("DHEXCLUSAO");
   }

   public void setDhExclusao(Timestamp dhExclusao) {
        markAsChanged("DHEXCLUSAO", dhExclusao);
   }

   public Timestamp getDhTipOper() {
        return this.getVo().asTimestamp("DHTIPOPER");
   }

   public void setDhTipOper(Timestamp dhTipOper) {
        markAsChanged("DHTIPOPER", dhTipOper);
   }

   public BigDecimal getVlrStFcpIntAnt() {
        return this.getVo().asBigDecimal("VLRSTFCPINTANT");
   }

   public void setVlrStFcpIntAnt(BigDecimal vlrStFcpIntAnt) {
        markAsChanged("VLRSTFCPINTANT", vlrStFcpIntAnt);
   }

   public BigDecimal getVlrIcmsFcpInt() {
        return this.getVo().asBigDecimal("VLRICMSFCPINT");
   }

   public void setVlrIcmsFcpInt(BigDecimal vlrIcmsFcpInt) {
        markAsChanged("VLRICMSFCPINT", vlrIcmsFcpInt);
   }

   public BigDecimal getVlrStFcpInt() {
        return this.getVo().asBigDecimal("VLRSTFCPINT");
   }

   public void setVlrStFcpInt(BigDecimal vlrStFcpInt) {
        markAsChanged("VLRSTFCPINT", vlrStFcpInt);
   }

   public String getFistel() {
        return this.getVo().asString("FISTEL");
   }

   public void setFistel(String fistel) {
        markAsChanged("FISTEL", fistel);
   }

   public String getMd5ModComTel() {
        return this.getVo().asString("MD5MODCOMTEL");
   }

   public void setMd5ModComTel(String md5ModComTel) {
        markAsChanged("MD5MODCOMTEL", md5ModComTel);
   }

   public BigDecimal getNumCstc() {
        return this.getVo().asBigDecimal("NUMCSTC");
   }

   public void setNumCstc(BigDecimal numCstc) {
        markAsChanged("NUMCSTC", numCstc);
   }

   public String getNumTermTel() {
        return this.getVo().asString("NUMTERMTEL");
   }

   public void setNumTermTel(String numTermTel) {
        markAsChanged("NUMTERMTEL", numTermTel);
   }

   public BigDecimal getQtdUsu() {
        return this.getVo().asBigDecimal("QTDUSU");
   }

   public void setQtdUsu(BigDecimal qtdUsu) {
        markAsChanged("QTDUSU", qtdUsu);
   }

   public BigDecimal getTipClienteServCom() {
        return this.getVo().asBigDecimal("TIPCLIENTESERVCOM");
   }

   public void setTipClienteServCom(BigDecimal tipClienteServCom) {
        markAsChanged("TIPCLIENTESERVCOM", tipClienteServCom);
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
        this.setVo(vo);
        return this;
   }
}
