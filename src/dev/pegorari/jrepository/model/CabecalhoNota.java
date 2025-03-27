package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoNota extends AbstractSankhyaEntity<CabecalhoNota> {
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

   public BigDecimal getCodTipVenda() {
        return this.getVo().asBigDecimal("CODTIPVENDA");
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
   }

   public BigDecimal getCodTpd() {
        return this.getVo().asBigDecimal("CODTPD");
   }

   public void setCodTpd(BigDecimal codTpd) {
        markAsChanged("CODTPD", codTpd);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuComprador() {
        return this.getVo().asBigDecimal("CODUSUCOMPRADOR");
   }

   public void setCodUsuComprador(BigDecimal codUsuComprador) {
        markAsChanged("CODUSUCOMPRADOR", codUsuComprador);
   }

   public BigDecimal getCodUsuInc() {
        return this.getVo().asBigDecimal("CODUSUINC");
   }

   public void setCodUsuInc(BigDecimal codUsuInc) {
        markAsChanged("CODUSUINC", codUsuInc);
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

   public BigDecimal getCodVendTec() {
        return this.getVo().asBigDecimal("CODVENDTEC");
   }

   public void setCodVendTec(BigDecimal codVendTec) {
        markAsChanged("CODVENDTEC", codVendTec);
   }

   public BigDecimal getCodVtp() {
        return this.getVo().asBigDecimal("CODVTP");
   }

   public void setCodVtp(BigDecimal codVtp) {
        markAsChanged("CODVTP", codVtp);
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

   public String getConfirmada() {
        return this.getVo().asString("CONFIRMADA");
   }

   public void setConfirmada(String confirmada) {
        markAsChanged("CONFIRMADA", confirmada);
   }

   public BigDecimal getDanfe() {
        return this.getVo().asBigDecimal("DANFE");
   }

   public void setDanfe(BigDecimal danfe) {
        markAsChanged("DANFE", danfe);
   }

   public String getDescrHistAc() {
        return this.getVo().asString("DESCRHISTAC");
   }

   public void setDescrHistAc(String descrHistAc) {
        markAsChanged("DESCRHISTAC", descrHistAc);
   }

   public Timestamp getDhProtoc() {
        return this.getVo().asTimestamp("DHPROTOC");
   }

   public void setDhProtoc(Timestamp dhProtoc) {
        markAsChanged("DHPROTOC", dhProtoc);
   }

   public Timestamp getDhRegDpec() {
        return this.getVo().asTimestamp("DHREGDPEC");
   }

   public void setDhRegDpec(Timestamp dhRegDpec) {
        markAsChanged("DHREGDPEC", dhRegDpec);
   }

   public Timestamp getDhTipOper() {
        return this.getVo().asTimestamp("DHTIPOPER");
   }

   public void setDhTipOper(Timestamp dhTipOper) {
        markAsChanged("DHTIPOPER", dhTipOper);
   }

   public Timestamp getDhTipVenda() {
        return this.getVo().asTimestamp("DHTIPVENDA");
   }

   public void setDhTipVenda(Timestamp dhTipVenda) {
        markAsChanged("DHTIPVENDA", dhTipVenda);
   }

   public String getDigital() {
        return this.getVo().asString("DIGITAL");
   }

   public void setDigital(String digital) {
        markAsChanged("DIGITAL", digital);
   }

   public Timestamp getDtAdiam() {
        return this.getVo().asTimestamp("DTADIAM");
   }

   public void setDtAdiam(Timestamp dtAdiam) {
        markAsChanged("DTADIAM", dtAdiam);
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

   public Timestamp getDtEnvioPmb() {
        return this.getVo().asTimestamp("DTENVIOPMB");
   }

   public void setDtEnvioPmb(Timestamp dtEnvioPmb) {
        markAsChanged("DTENVIOPMB", dtEnvioPmb);
   }

   public Timestamp getDtEnvSuf() {
        return this.getVo().asTimestamp("DTENVSUF");
   }

   public void setDtEnvSuf(Timestamp dtEnvSuf) {
        markAsChanged("DTENVSUF", dtEnvSuf);
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

   public Timestamp getDtPrevent() {
        return this.getVo().asTimestamp("DTPREVENT");
   }

   public void setDtPrevent(Timestamp dtPrevent) {
        markAsChanged("DTPREVENT", dtPrevent);
   }

   public Timestamp getDtVal() {
        return this.getVo().asTimestamp("DTVAL");
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
   }

   public BigDecimal getHrAdiam() {
        return this.getVo().asBigDecimal("HRADIAM");
   }

   public void setHrAdiam(BigDecimal hrAdiam) {
        markAsChanged("HRADIAM", hrAdiam);
   }

   public Timestamp getHrEntSai() {
        return this.getVo().asTimestamp("HRENTSAI");
   }

   public void setHrEntSai(Timestamp hrEntSai) {
        markAsChanged("HRENTSAI", hrEntSai);
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

   public String getLacres() {
        return this.getVo().asString("LACRES");
   }

   public void setLacres(String lacres) {
        markAsChanged("LACRES", lacres);
   }

   public String getLibConf() {
        return this.getVo().asString("LIBCONF");
   }

   public void setLibConf(String libConf) {
        markAsChanged("LIBCONF", libConf);
   }

   public String getLibPendente() {
        return this.getVo().asString("LIBPENDENTE");
   }

   public void setLibPendente(String libPendente) {
        markAsChanged("LIBPENDENTE", libPendente);
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

   public BigDecimal getM3() {
        return this.getVo().asBigDecimal("M3");
   }

   public void setM3(BigDecimal m3) {
        markAsChanged("M3", m3);
   }

   public BigDecimal getM3AEntregar() {
        return this.getVo().asBigDecimal("M3AENTREGAR");
   }

   public void setM3AEntregar(BigDecimal m3AEntregar) {
        markAsChanged("M3AENTREGAR", m3AEntregar);
   }

   public String getMarca() {
        return this.getVo().asString("MARCA");
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
   }

   public String getModeloNfDes() {
        return this.getVo().asString("MODELONFDES");
   }

   public void setModeloNfDes(String modeloNfDes) {
        markAsChanged("MODELONFDES", modeloNfDes);
   }

   public String getNaturezaOperDes() {
        return this.getVo().asString("NATUREZAOPERDES");
   }

   public void setNaturezaOperDes(String naturezaOperDes) {
        markAsChanged("NATUREZAOPERDES", naturezaOperDes);
   }

   public String getNotasCf() {
        return this.getVo().asString("NOTASCF");
   }

   public void setNotasCf(String notasCf) {
        markAsChanged("NOTASCF", notasCf);
   }

   public BigDecimal getNroCaixa() {
        return this.getVo().asBigDecimal("NROCAIXA");
   }

   public void setNroCaixa(BigDecimal nroCaixa) {
        markAsChanged("NROCAIXA", nroCaixa);
   }

   public BigDecimal getNroRedz() {
        return this.getVo().asBigDecimal("NROREDZ");
   }

   public void setNroRedz(BigDecimal nroRedz) {
        markAsChanged("NROREDZ", nroRedz);
   }

   public BigDecimal getNuConfAtual() {
        return this.getVo().asBigDecimal("NUCONFATUAL");
   }

   public void setNuConfAtual(BigDecimal nuConfAtual) {
        markAsChanged("NUCONFATUAL", nuConfAtual);
   }

   public BigDecimal getNuLotEnfe() {
        return this.getVo().asBigDecimal("NULOTENFE");
   }

   public void setNuLotEnfe(BigDecimal nuLotEnfe) {
        markAsChanged("NULOTENFE", nuLotEnfe);
   }

   public BigDecimal getNuLotEnfse() {
        return this.getVo().asBigDecimal("NULOTENFSE");
   }

   public void setNuLotEnfse(BigDecimal nuLotEnfse) {
        markAsChanged("NULOTENFSE", nuLotEnfse);
   }

   public BigDecimal getNumAleatorio() {
        return this.getVo().asBigDecimal("NUMALEATORIO");
   }

   public void setNumAleatorio(BigDecimal numAleatorio) {
        markAsChanged("NUMALEATORIO", numAleatorio);
   }

   public BigDecimal getNumCf() {
        return this.getVo().asBigDecimal("NUMCF");
   }

   public void setNumCf(BigDecimal numCf) {
        markAsChanged("NUMCF", numCf);
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

   public String getNumeracaoVolumes() {
        return this.getVo().asString("NUMERACAOVOLUMES");
   }

   public void setNumeracaoVolumes(String numeracaoVolumes) {
        markAsChanged("NUMERACAOVOLUMES", numeracaoVolumes);
   }

   public String getNumNfse() {
        return this.getVo().asString("NUMNFSE");
   }

   public void setNumNfse(String numNfse) {
        markAsChanged("NUMNFSE", numNfse);
   }

   public BigDecimal getNumNota() {
        return this.getVo().asBigDecimal("NUMNOTA");
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
   }

   public BigDecimal getNumOs() {
        return this.getVo().asBigDecimal("NUMOS");
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
   }

   public String getNumPedido2() {
        return this.getVo().asString("NUMPEDIDO2");
   }

   public void setNumPedido2(String numPedido2) {
        markAsChanged("NUMPEDIDO2", numPedido2);
   }

   public String getNumProtoc() {
        return this.getVo().asString("NUMPROTOC");
   }

   public void setNumProtoc(String numProtoc) {
        markAsChanged("NUMPROTOC", numProtoc);
   }

   public String getNumRegDpec() {
        return this.getVo().asString("NUMREGDPEC");
   }

   public void setNumRegDpec(String numRegDpec) {
        markAsChanged("NUMREGDPEC", numRegDpec);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuNotaPedFret() {
        return this.getVo().asBigDecimal("NUNOTAPEDFRET");
   }

   public void setNuNotaPedFret(BigDecimal nuNotaPedFret) {
        markAsChanged("NUNOTAPEDFRET", nuNotaPedFret);
   }

   public BigDecimal getNuPca() {
        return this.getVo().asBigDecimal("NUPCA");
   }

   public void setNuPca(BigDecimal nuPca) {
        markAsChanged("NUPCA", nuPca);
   }

   public BigDecimal getNuRd8() {
        return this.getVo().asBigDecimal("NURD8");
   }

   public void setNuRd8(BigDecimal nuRd8) {
        markAsChanged("NURD8", nuRd8);
   }

   public BigDecimal getNuRem() {
        return this.getVo().asBigDecimal("NUREM");
   }

   public void setNuRem(BigDecimal nuRem) {
        markAsChanged("NUREM", nuRem);
   }

   public BigDecimal getNuTransf() {
        return this.getVo().asBigDecimal("NUTRANSF");
   }

   public void setNuTransf(BigDecimal nuTransf) {
        markAsChanged("NUTRANSF", nuTransf);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getObservacaoAc() {
        return this.getVo().asString("OBSERVACAOAC");
   }

   public void setObservacaoAc(String observacaoAc) {
        markAsChanged("OBSERVACAOAC", observacaoAc);
   }

   public BigDecimal getOccN48() {
        return this.getVo().asBigDecimal("OCCN48");
   }

   public void setOccN48(BigDecimal occN48) {
        markAsChanged("OCCN48", occN48);
   }

   public BigDecimal getOrdemCarga() {
        return this.getVo().asBigDecimal("ORDEMCARGA");
   }

   public void setOrdemCarga(BigDecimal ordemCarga) {
        markAsChanged("ORDEMCARGA", ordemCarga);
   }

   public String getPedidoImpresso() {
        return this.getVo().asString("PEDIDOIMPRESSO");
   }

   public void setPedidoImpresso(String pedidoImpresso) {
        markAsChanged("PEDIDOIMPRESSO", pedidoImpresso);
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

   public BigDecimal getPesoAEntregar() {
        return this.getVo().asBigDecimal("PESOAENTREGAR");
   }

   public void setPesoAEntregar(BigDecimal pesoAEntregar) {
        markAsChanged("PESOAENTREGAR", pesoAEntregar);
   }

   public BigDecimal getPesoBruto() {
        return this.getVo().asBigDecimal("PESOBRUTO");
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
   }

   public BigDecimal getPesoBrutoItens() {
        return this.getVo().asBigDecimal("PESOBRUTOITENS");
   }

   public void setPesoBrutoItens(BigDecimal pesoBrutoItens) {
        markAsChanged("PESOBRUTOITENS", pesoBrutoItens);
   }

   public String getPlaca() {
        return this.getVo().asString("PLACA");
   }

   public void setPlaca(String placa) {
        markAsChanged("PLACA", placa);
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

   public String getRetornadoAc() {
        return this.getVo().asString("RETORNADOAC");
   }

   public void setRetornadoAc(String retornadoAc) {
        markAsChanged("RETORNADOAC", retornadoAc);
   }

   public BigDecimal getSeqCarga() {
        return this.getVo().asBigDecimal("SEQCARGA");
   }

   public void setSeqCarga(BigDecimal seqCarga) {
        markAsChanged("SEQCARGA", seqCarga);
   }

   public BigDecimal getCodParcTransp() {
        return this.getVo().asBigDecimal("CODPARCTRANSP");
   }

   public void setCodParcTransp(BigDecimal codParcTransp) {
        markAsChanged("CODPARCTRANSP", codParcTransp);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public String getSerieNfDes() {
        return this.getVo().asString("SERIENFDES");
   }

   public void setSerieNfDes(String serieNfDes) {
        markAsChanged("SERIENFDES", serieNfDes);
   }

   public String getSerieNota() {
        return this.getVo().asString("SERIENOTA");
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
   }

   public BigDecimal getCodSite() {
        return this.getVo().asBigDecimal("CODSITE");
   }

   public void setCodSite(BigDecimal codSite) {
        markAsChanged("CODSITE", codSite);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public BigDecimal getAliqIrf() {
        return this.getVo().asBigDecimal("ALIQIRF");
   }

   public void setAliqIrf(BigDecimal aliqIrf) {
        markAsChanged("ALIQIRF", aliqIrf);
   }

   public String getAntt() {
        return this.getVo().asString("ANTT");
   }

   public void setAntt(String antt) {
        markAsChanged("ANTT", antt);
   }

   public String getAprovado() {
        return this.getVo().asString("APROVADO");
   }

   public void setAprovado(String aprovado) {
        markAsChanged("APROVADO", aprovado);
   }

   public BigDecimal getBaseCofins() {
        return this.getVo().asBigDecimal("BASECOFINS");
   }

   public void setBaseCofins(BigDecimal baseCofins) {
        markAsChanged("BASECOFINS", baseCofins);
   }

   public BigDecimal getBaseCofinsSt() {
        return this.getVo().asBigDecimal("BASECOFINSST");
   }

   public void setBaseCofinsSt(BigDecimal baseCofinsSt) {
        markAsChanged("BASECOFINSST", baseCofinsSt);
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

   public BigDecimal getBaseIrf() {
        return this.getVo().asBigDecimal("BASEIRF");
   }

   public void setBaseIrf(BigDecimal baseIrf) {
        markAsChanged("BASEIRF", baseIrf);
   }

   public BigDecimal getBaseIss() {
        return this.getVo().asBigDecimal("BASEISS");
   }

   public void setBaseIss(BigDecimal baseIss) {
        markAsChanged("BASEISS", baseIss);
   }

   public BigDecimal getBasePis() {
        return this.getVo().asBigDecimal("BASEPIS");
   }

   public void setBasePis(BigDecimal basePis) {
        markAsChanged("BASEPIS", basePis);
   }

   public BigDecimal getBasePisSt() {
        return this.getVo().asBigDecimal("BASEPISST");
   }

   public void setBasePisSt(BigDecimal basePisSt) {
        markAsChanged("BASEPISST", basePisSt);
   }

   public BigDecimal getBaseSubstit() {
        return this.getVo().asBigDecimal("BASESUBSTIT");
   }

   public void setBaseSubstit(BigDecimal baseSubstit) {
        markAsChanged("BASESUBSTIT", baseSubstit);
   }

   public BigDecimal getBaseSubstSemRed() {
        return this.getVo().asBigDecimal("BASESUBSTSEMRED");
   }

   public void setBaseSubstSemRed(BigDecimal baseSubstSemRed) {
        markAsChanged("BASESUBSTSEMRED", baseSubstSemRed);
   }

   public String getChaveNfe() {
        return this.getVo().asString("CHAVENFE");
   }

   public void setChaveNfe(String chaveNfe) {
        markAsChanged("CHAVENFE", chaveNfe);
   }

   public String getCifFob() {
        return this.getVo().asString("CIF_FOB");
   }

   public void setCifFob(String cifFob) {
        markAsChanged("CIF_FOB", cifFob);
   }

   public BigDecimal getCodCc() {
        return this.getVo().asBigDecimal("CODCC");
   }

   public void setCodCc(BigDecimal codCc) {
        markAsChanged("CODCC", codCc);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public BigDecimal getCodContato() {
        return this.getVo().asBigDecimal("CODCONTATO");
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
   }

   public BigDecimal getCodDoca() {
        return this.getVo().asBigDecimal("CODDOCA");
   }

   public void setCodDoca(BigDecimal codDoca) {
        markAsChanged("CODDOCA", codDoca);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEmpFunc() {
        return this.getVo().asBigDecimal("CODEMPFUNC");
   }

   public void setCodEmpFunc(BigDecimal codEmpFunc) {
        markAsChanged("CODEMPFUNC", codEmpFunc);
   }

   public BigDecimal getCodEmpNegoc() {
        return this.getVo().asBigDecimal("CODEMPNEGOC");
   }

   public void setCodEmpNegoc(BigDecimal codEmpNegoc) {
        markAsChanged("CODEMPNEGOC", codEmpNegoc);
   }

   public BigDecimal getCodFunc() {
        return this.getVo().asBigDecimal("CODFUNC");
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
   }

   public String getCodGrupoTensao() {
        return this.getVo().asString("CODGRUPOTENSAO");
   }

   public void setCodGrupoTensao(String codGrupoTensao) {
        markAsChanged("CODGRUPOTENSAO", codGrupoTensao);
   }

   public BigDecimal getCodHistAc() {
        return this.getVo().asBigDecimal("CODHISTAC");
   }

   public void setCodHistAc(BigDecimal codHistAc) {
        markAsChanged("CODHISTAC", codHistAc);
   }

   public BigDecimal getCodLocalOrig() {
        return this.getVo().asBigDecimal("CODLOCALORIG");
   }

   public void setCodLocalOrig(BigDecimal codLocalOrig) {
        markAsChanged("CODLOCALORIG", codLocalOrig);
   }

   public BigDecimal getCodMaq() {
        return this.getVo().asBigDecimal("CODMAQ");
   }

   public void setCodMaq(BigDecimal codMaq) {
        markAsChanged("CODMAQ", codMaq);
   }

   public BigDecimal getCodModDocNota() {
        return this.getVo().asBigDecimal("CODMODDOCNOTA");
   }

   public void setCodModDocNota(BigDecimal codModDocNota) {
        markAsChanged("CODMODDOCNOTA", codModDocNota);
   }

   public BigDecimal getTpLigacao() {
        return this.getVo().asBigDecimal("TPLIGACAO");
   }

   public void setTpLigacao(BigDecimal tpLigacao) {
        markAsChanged("TPLIGACAO", tpLigacao);
   }

   public BigDecimal getTroco() {
        return this.getVo().asBigDecimal("TROCO");
   }

   public void setTroco(BigDecimal troco) {
        markAsChanged("TROCO", troco);
   }

   public BigDecimal getUfVeiculo() {
        return this.getVo().asBigDecimal("UFVEICULO");
   }

   public void setUfVeiculo(BigDecimal ufVeiculo) {
        markAsChanged("UFVEICULO", ufVeiculo);
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

   public BigDecimal getVlrCofins() {
        return this.getVo().asBigDecimal("VLRCOFINS");
   }

   public void setVlrCofins(BigDecimal vlrCofins) {
        markAsChanged("VLRCOFINS", vlrCofins);
   }

   public BigDecimal getVlrCofinsSt() {
        return this.getVo().asBigDecimal("VLRCOFINSST");
   }

   public void setVlrCofinsSt(BigDecimal vlrCofinsSt) {
        markAsChanged("VLRCOFINSST", vlrCofinsSt);
   }

   public BigDecimal getVlrCompensacao() {
        return this.getVo().asBigDecimal("VLRCOMPENSACAO");
   }

   public void setVlrCompensacao(BigDecimal vlrCompensacao) {
        markAsChanged("VLRCOMPENSACAO", vlrCompensacao);
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

   public BigDecimal getVlrFreteCpl() {
        return this.getVo().asBigDecimal("VLRFRETECPL");
   }

   public void setVlrFreteCpl(BigDecimal vlrFreteCpl) {
        markAsChanged("VLRFRETECPL", vlrFreteCpl);
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

   public BigDecimal getVlrIndeniz() {
        return this.getVo().asBigDecimal("VLRINDENIZ");
   }

   public void setVlrIndeniz(BigDecimal vlrIndeniz) {
        markAsChanged("VLRINDENIZ", vlrIndeniz);
   }

   public BigDecimal getVlrIndenizDist() {
        return this.getVo().asBigDecimal("VLRINDENIZDIST");
   }

   public void setVlrIndenizDist(BigDecimal vlrIndenizDist) {
        markAsChanged("VLRINDENIZDIST", vlrIndenizDist);
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

   public BigDecimal getVlrJuroDist() {
        return this.getVo().asBigDecimal("VLRJURODIST");
   }

   public void setVlrJuroDist(BigDecimal vlrJuroDist) {
        markAsChanged("VLRJURODIST", vlrJuroDist);
   }

   public BigDecimal getVlrMercadoria() {
        return this.getVo().asBigDecimal("VLRMERCADORIA");
   }

   public void setVlrMercadoria(BigDecimal vlrMercadoria) {
        markAsChanged("VLRMERCADORIA", vlrMercadoria);
   }

   public BigDecimal getVlrMoeda() {
        return this.getVo().asBigDecimal("VLRMOEDA");
   }

   public void setVlrMoeda(BigDecimal vlrMoeda) {
        markAsChanged("VLRMOEDA", vlrMoeda);
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

   public BigDecimal getVlrPis() {
        return this.getVo().asBigDecimal("VLRPIS");
   }

   public void setVlrPis(BigDecimal vlrPis) {
        markAsChanged("VLRPIS", vlrPis);
   }

   public BigDecimal getVlrPisSt() {
        return this.getVo().asBigDecimal("VLRPISST");
   }

   public void setVlrPisSt(BigDecimal vlrPisSt) {
        markAsChanged("VLRPISST", vlrPisSt);
   }

   public BigDecimal getVlrRepRedTot() {
        return this.getVo().asBigDecimal("VLRREPREDTOT");
   }

   public void setVlrRepRedTot(BigDecimal vlrRepRedTot) {
        markAsChanged("VLRREPREDTOT", vlrRepRedTot);
   }

   public BigDecimal getVlrRoyalt() {
        return this.getVo().asBigDecimal("VLRROYALT");
   }

   public void setVlrRoyalt(BigDecimal vlrRoyalt) {
        markAsChanged("VLRROYALT", vlrRoyalt);
   }

   public BigDecimal getVlrSeg() {
        return this.getVo().asBigDecimal("VLRSEG");
   }

   public void setVlrSeg(BigDecimal vlrSeg) {
        markAsChanged("VLRSEG", vlrSeg);
   }

   public BigDecimal getVlrStExtraNotaTot() {
        return this.getVo().asBigDecimal("VLRSTEXTRANOTATOT");
   }

   public void setVlrStExtraNotaTot(BigDecimal vlrStExtraNotaTot) {
        markAsChanged("VLRSTEXTRANOTATOT", vlrStExtraNotaTot);
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

   public String getTipMov() {
        return this.getVo().asString("TIPMOV");
   }

   public void setTipMov(String tipMov) {
        markAsChanged("TIPMOV", tipMov);
   }

   public String getTipNotaPmb() {
        return this.getVo().asString("TIPNOTAPMB");
   }

   public void setTipNotaPmb(String tipNotaPmb) {
        markAsChanged("TIPNOTAPMB", tipNotaPmb);
   }

   public BigDecimal getTipOptAgjNfe() {
        return this.getVo().asBigDecimal("TIPOPTAGJNFE");
   }

   public void setTipOptAgjNfe(BigDecimal tipOptAgjNfe) {
        markAsChanged("TIPOPTAGJNFE", tipOptAgjNfe);
   }

   public BigDecimal getTotalCustoProd() {
        return this.getVo().asBigDecimal("TOTALCUSTOPROD");
   }

   public void setTotalCustoProd(BigDecimal totalCustoProd) {
        markAsChanged("TOTALCUSTOPROD", totalCustoProd);
   }

   public BigDecimal getTotalCustoServ() {
        return this.getVo().asBigDecimal("TOTALCUSTOSERV");
   }

   public void setTotalCustoServ(BigDecimal totalCustoServ) {
        markAsChanged("TOTALCUSTOSERV", totalCustoServ);
   }

   public BigDecimal getTotDispDesc() {
        return this.getVo().asBigDecimal("TOTDISPDESC");
   }

   public void setTotDispDesc(BigDecimal totDispDesc) {
        markAsChanged("TOTDISPDESC", totDispDesc);
   }

   public String getTpAmbNfe() {
        return this.getVo().asString("TPAMBNFE");
   }

   public void setTpAmbNfe(String tpAmbNfe) {
        markAsChanged("TPAMBNFE", tpAmbNfe);
   }

   public BigDecimal getTpAssinante() {
        return this.getVo().asBigDecimal("TPASSINANTE");
   }

   public void setTpAssinante(BigDecimal tpAssinante) {
        markAsChanged("TPASSINANTE", tpAssinante);
   }

   public BigDecimal getTpEmisNfe() {
        return this.getVo().asBigDecimal("TPEMISNFE");
   }

   public void setTpEmisNfe(BigDecimal tpEmisNfe) {
        markAsChanged("TPEMISNFE", tpEmisNfe);
   }

   public BigDecimal getTpEmisNfse() {
        return this.getVo().asBigDecimal("TPEMISNFSE");
   }

   public void setTpEmisNfse(BigDecimal tpEmisNfse) {
        markAsChanged("TPEMISNFSE", tpEmisNfse);
   }

   public BigDecimal getCodMoeda() {
        return this.getVo().asBigDecimal("CODMOEDA");
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
   }

   public BigDecimal getCodMotorista() {
        return this.getVo().asBigDecimal("CODMOTORISTA");
   }

   public void setCodMotorista(BigDecimal codMotorista) {
        markAsChanged("CODMOTORISTA", codMotorista);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public String getModEntrega() {
        return this.getVo().asString("MODENTREGA");
   }

   public void setModEntrega(String modEntrega) {
        markAsChanged("MODENTREGA", modEntrega);
   }

   public String getNotaEmpenho() {
        return this.getVo().asString("NOTAEMPENHO");
   }

   public void setNotaEmpenho(String notaEmpenho) {
        markAsChanged("NOTAEMPENHO", notaEmpenho);
   }

   public BigDecimal getVlrFreteTotal() {
        return this.getVo().asBigDecimal("VLRFRETETOTAL");
   }

   public void setVlrFreteTotal(BigDecimal vlrFreteTotal) {
        markAsChanged("VLRFRETETOTAL", vlrFreteTotal);
   }

   public BigDecimal getCodParcTranspFinal() {
        return this.getVo().asBigDecimal("CODPARCTRANSPFINAL");
   }

   public void setCodParcTranspFinal(BigDecimal codParcTranspFinal) {
        markAsChanged("CODPARCTRANSPFINAL", codParcTranspFinal);
   }

   public BigDecimal getSituacaoWms() {
        return this.getVo().asBigDecimal("SITUACAOWMS");
   }

   public void setSituacaoWms(BigDecimal situacaoWms) {
        markAsChanged("SITUACAOWMS", situacaoWms);
   }

   public String getViaTransp() {
        return this.getVo().asString("VIATRANSP");
   }

   public void setViaTransp(String viaTransp) {
        markAsChanged("VIATRANSP", viaTransp);
   }

   public String getUfAdquirente() {
        return this.getVo().asString("UFADQUIRENTE");
   }

   public void setUfAdquirente(String ufAdquirente) {
        markAsChanged("UFADQUIRENTE", ufAdquirente);
   }

   public String getCnpjAdquirente() {
        return this.getVo().asString("CNPJADQUIRENTE");
   }

   public void setCnpjAdquirente(String cnpjAdquirente) {
        markAsChanged("CNPJADQUIRENTE", cnpjAdquirente);
   }

   public String getTipProcImp() {
        return this.getVo().asString("TIPPROCIMP");
   }

   public void setTipProcImp(String tipProcImp) {
        markAsChanged("TIPPROCIMP", tipProcImp);
   }

   public String getProdPred() {
        return this.getVo().asString("PRODPRED");
   }

   public void setProdPred(String prodPred) {
        markAsChanged("PRODPRED", prodPred);
   }

   public BigDecimal getPesoLiqItens() {
        return this.getVo().asBigDecimal("PESOLIQITENS");
   }

   public void setPesoLiqItens(BigDecimal pesoLiqItens) {
        markAsChanged("PESOLIQITENS", pesoLiqItens);
   }

   public BigDecimal getVlrDescTotItemMoe() {
        return this.getVo().asBigDecimal("VLRDESCTOTITEMMOE");
   }

   public void setVlrDescTotItemMoe(BigDecimal vlrDescTotItemMoe) {
        markAsChanged("VLRDESCTOTITEMMOE", vlrDescTotItemMoe);
   }

   public BigDecimal getVlrTotLiqItemMoe() {
        return this.getVo().asBigDecimal("VLRTOTLIQITEMMOE");
   }

   public void setVlrTotLiqItemMoe(BigDecimal vlrTotLiqItemMoe) {
        markAsChanged("VLRTOTLIQITEMMOE", vlrTotLiqItemMoe);
   }

   public String getCteLotacao() {
        return this.getVo().asString("CTELOTACAO");
   }

   public void setCteLotacao(String cteLotacao) {
        markAsChanged("CTELOTACAO", cteLotacao);
   }

   public String getChaveCte() {
        return this.getVo().asString("CHAVECTE");
   }

   public void setChaveCte(String chaveCte) {
        markAsChanged("CHAVECTE", chaveCte);
   }

   public BigDecimal getReboque3() {
        return this.getVo().asBigDecimal("REBOQUE3");
   }

   public void setReboque3(BigDecimal reboque3) {
        markAsChanged("REBOQUE3", reboque3);
   }

   public String getSituacaoCte() {
        return this.getVo().asString("SITUACAOCTE");
   }

   public void setSituacaoCte(String situacaoCte) {
        markAsChanged("SITUACAOCTE", situacaoCte);
   }

   public String getLotacao() {
        return this.getVo().asString("LOTACAO");
   }

   public void setLotacao(String lotacao) {
        markAsChanged("LOTACAO", lotacao);
   }

   public BigDecimal getTpEmisCte() {
        return this.getVo().asBigDecimal("TPEMISCTE");
   }

   public void setTpEmisCte(BigDecimal tpEmisCte) {
        markAsChanged("TPEMISCTE", tpEmisCte);
   }

   public String getTpAmbCte() {
        return this.getVo().asString("TPAMBCTE");
   }

   public void setTpAmbCte(String tpAmbCte) {
        markAsChanged("TPAMBCTE", tpAmbCte);
   }

   public BigDecimal getNumAleatorioCte() {
        return this.getVo().asBigDecimal("NUMALEATORIOCTE");
   }

   public void setNumAleatorioCte(BigDecimal numAleatorioCte) {
        markAsChanged("NUMALEATORIOCTE", numAleatorioCte);
   }

   public String getStatusCte() {
        return this.getVo().asString("STATUSCTE");
   }

   public void setStatusCte(String statusCte) {
        markAsChanged("STATUSCTE", statusCte);
   }

   public Timestamp getDtDeclara() {
        return this.getVo().asTimestamp("DTDECLARA");
   }

   public void setDtDeclara(Timestamp dtDeclara) {
        markAsChanged("DTDECLARA", dtDeclara);
   }

   public BigDecimal getReboque1() {
        return this.getVo().asBigDecimal("REBOQUE1");
   }

   public void setReboque1(BigDecimal reboque1) {
        markAsChanged("REBOQUE1", reboque1);
   }

   public BigDecimal getReboque2() {
        return this.getVo().asBigDecimal("REBOQUE2");
   }

   public void setReboque2(BigDecimal reboque2) {
        markAsChanged("REBOQUE2", reboque2);
   }

   public String getCpfCnpjAdquirente() {
        return this.getVo().asString("CPFCNPJADQUIRENTE");
   }

   public void setCpfCnpjAdquirente(String cpfCnpjAdquirente) {
        markAsChanged("CPFCNPJADQUIRENTE", cpfCnpjAdquirente);
   }

   public Timestamp getDtEntSaiInfo() {
        return this.getVo().asTimestamp("DTENTSAIINFO");
   }

   public void setDtEntSaiInfo(Timestamp dtEntSaiInfo) {
        markAsChanged("DTENTSAIINFO", dtEntSaiInfo);
   }

   public String getIndPresNfce() {
        return this.getVo().asString("INDPRESNFCE");
   }

   public void setIndPresNfce(String indPresNfce) {
        markAsChanged("INDPRESNFCE", indPresNfce);
   }

   public String getLocEmbarq() {
        return this.getVo().asString("LOCEMBARQ");
   }

   public void setLocEmbarq(String locEmbarq) {
        markAsChanged("LOCEMBARQ", locEmbarq);
   }

   public String getNomeAdquirente() {
        return this.getVo().asString("NOMEADQUIRENTE");
   }

   public void setNomeAdquirente(String nomeAdquirente) {
        markAsChanged("NOMEADQUIRENTE", nomeAdquirente);
   }

   public String getUfEmbarq() {
        return this.getVo().asString("UFEMBARQ");
   }

   public void setUfEmbarq(String ufEmbarq) {
        markAsChanged("UFEMBARQ", ufEmbarq);
   }

   public String getChaveNfse() {
        return this.getVo().asString("CHAVENFSE");
   }

   public void setChaveNfse(String chaveNfse) {
        markAsChanged("CHAVENFSE", chaveNfse);
   }

   public String getProduetLoc() {
        return this.getVo().asString("PRODUETLOC");
   }

   public void setProduetLoc(String produetLoc) {
        markAsChanged("PRODUETLOC", produetLoc);
   }

   public Timestamp getDhEmissEpec() {
        return this.getVo().asTimestamp("DHEMISSEPEC");
   }

   public void setDhEmissEpec(Timestamp dhEmissEpec) {
        markAsChanged("DHEMISSEPEC", dhEmissEpec);
   }

   public BigDecimal getNuNotaSub() {
        return this.getVo().asBigDecimal("NUNOTASUB");
   }

   public void setNuNotaSub(BigDecimal nuNotaSub) {
        markAsChanged("NUNOTASUB", nuNotaSub);
   }

   public BigDecimal getTipServCte() {
        return this.getVo().asBigDecimal("TIPSERVCTE");
   }

   public void setTipServCte(BigDecimal tipServCte) {
        markAsChanged("TIPSERVCTE", tipServCte);
   }

   public String getTipoCte() {
        return this.getVo().asString("TIPOCTE");
   }

   public void setTipoCte(String tipoCte) {
        markAsChanged("TIPOCTE", tipoCte);
   }

   public Timestamp getDtRemRet() {
        return this.getVo().asTimestamp("DTREMRET");
   }

   public void setDtRemRet(Timestamp dtRemRet) {
        markAsChanged("DTREMRET", dtRemRet);
   }

   public BigDecimal getIdIproc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
   }

   public String getStatusWms() {
        return this.getVo().asString("STATUSWMS");
   }

   public void setStatusWms(String statusWms) {
        markAsChanged("STATUSWMS", statusWms);
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

   public BigDecimal getNuLoteCte() {
        return this.getVo().asBigDecimal("NULOTECTE");
   }

   public void setNuLoteCte(BigDecimal nuLoteCte) {
        markAsChanged("NULOTECTE", nuLoteCte);
   }

   public String getNumProtocCte() {
        return this.getVo().asString("NUMPROTOCCTE");
   }

   public void setNumProtocCte(String numProtocCte) {
        markAsChanged("NUMPROTOCCTE", numProtocCte);
   }

   public Timestamp getDhProtocCte() {
        return this.getVo().asTimestamp("DHPROTOCCTE");
   }

   public void setDhProtocCte(Timestamp dhProtocCte) {
        markAsChanged("DHPROTOCCTE", dhProtocCte);
   }

   public String getPesoLiquiManual() {
        return this.getVo().asString("PESOLIQUIMANUAL");
   }

   public void setPesoLiquiManual(String pesoLiquiManual) {
        markAsChanged("PESOLIQUIMANUAL", pesoLiquiManual);
   }

   public String getPesoBrutoManual() {
        return this.getVo().asString("PESOBRUTOMANUAL");
   }

   public void setPesoBrutoManual(String pesoBrutoManual) {
        markAsChanged("PESOBRUTOMANUAL", pesoBrutoManual);
   }

   public String getCodObra() {
        return this.getVo().asString("CODOBRA");
   }

   public void setCodObra(String codObra) {
        markAsChanged("CODOBRA", codObra);
   }

   public String getCodArt() {
        return this.getVo().asString("CODART");
   }

   public void setCodArt(String codArt) {
        markAsChanged("CODART", codArt);
   }

   public BigDecimal getCodParcDescargaMdfe() {
        return this.getVo().asBigDecimal("CODPARCDESCARGAMDFE");
   }

   public void setCodParcDescargaMdfe(BigDecimal codParcDescargaMdfe) {
        markAsChanged("CODPARCDESCARGAMDFE", codParcDescargaMdfe);
   }

   public BigDecimal getCodGuf() {
        return this.getVo().asBigDecimal("CODGUF");
   }

   public void setCodGuf(BigDecimal codGuf) {
        markAsChanged("CODGUF", codGuf);
   }

   public String getConfirmNotaFat() {
        return this.getVo().asString("CONFIRMNOTAFAT");
   }

   public void setConfirmNotaFat(String confirmNotaFat) {
        markAsChanged("CONFIRMNOTAFAT", confirmNotaFat);
   }

   public String getDirecaoViag() {
        return this.getVo().asString("DIRECAOVIAG");
   }

   public void setDirecaoViag(String direcaoViag) {
        markAsChanged("DIRECAOVIAG", direcaoViag);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public Timestamp getDtRef2() {
        return this.getVo().asTimestamp("DTREF2");
   }

   public void setDtRef2(Timestamp dtRef2) {
        markAsChanged("DTREF2", dtRef2);
   }

   public Timestamp getDtRef3() {
        return this.getVo().asTimestamp("DTREF3");
   }

   public void setDtRef3(Timestamp dtRef3) {
        markAsChanged("DTREF3", dtRef3);
   }

   public BigDecimal getFreteVlrPago() {
        return this.getVo().asBigDecimal("FRETEVLRPAGO");
   }

   public void setFreteVlrPago(BigDecimal freteVlrPago) {
        markAsChanged("FRETEVLRPAGO", freteVlrPago);
   }

   public String getIdBalsa01() {
        return this.getVo().asString("IDBALSA01");
   }

   public void setIdBalsa01(String idBalsa01) {
        markAsChanged("IDBALSA01", idBalsa01);
   }

   public String getIdBalsa02() {
        return this.getVo().asString("IDBALSA02");
   }

   public void setIdBalsa02(String idBalsa02) {
        markAsChanged("IDBALSA02", idBalsa02);
   }

   public String getIdBalsa03() {
        return this.getVo().asString("IDBALSA03");
   }

   public void setIdBalsa03(String idBalsa03) {
        markAsChanged("IDBALSA03", idBalsa03);
   }

   public String getIdNavio() {
        return this.getVo().asString("IDNAVIO");
   }

   public void setIdNavio(String idNavio) {
        markAsChanged("IDNAVIO", idNavio);
   }

   public String getIrInNavio() {
        return this.getVo().asString("IRINNAVIO");
   }

   public void setIrInNavio(String irInNavio) {
        markAsChanged("IRINNAVIO", irInNavio);
   }

   public String getNfeDevRecusa() {
        return this.getVo().asString("NFEDEVRECUSA");
   }

   public void setNfeDevRecusa(String nfeDevRecusa) {
        markAsChanged("NFEDEVRECUSA", nfeDevRecusa);
   }

   public BigDecimal getNuCfr() {
        return this.getVo().asBigDecimal("NUCFR");
   }

   public void setNuCfr(BigDecimal nuCfr) {
        markAsChanged("NUCFR", nuCfr);
   }

   public String getPermAlterCentral() {
        return this.getVo().asString("PERMALTERCENTRAL");
   }

   public void setPermAlterCentral(String permAlterCentral) {
        markAsChanged("PERMALTERCENTRAL", permAlterCentral);
   }

   public BigDecimal getTimContratoLtv() {
        return this.getVo().asBigDecimal("TIMCONTRATOLTV");
   }

   public void setTimContratoLtv(BigDecimal timContratoLtv) {
        markAsChanged("TIMCONTRATOLTV", timContratoLtv);
   }

   public BigDecimal getTimContratoVenda() {
        return this.getVo().asBigDecimal("TIMCONTRATOVENDA");
   }

   public void setTimContratoVenda(BigDecimal timContratoVenda) {
        markAsChanged("TIMCONTRATOVENDA", timContratoVenda);
   }

   public BigDecimal getTimNuFinOrig() {
        return this.getVo().asBigDecimal("TIMNUFINORIG");
   }

   public void setTimNuFinOrig(BigDecimal timNuFinOrig) {
        markAsChanged("TIMNUFINORIG", timNuFinOrig);
   }

   public BigDecimal getTimNuNotaMod() {
        return this.getVo().asBigDecimal("TIMNUNOTAMOD");
   }

   public void setTimNuNotaMod(BigDecimal timNuNotaMod) {
        markAsChanged("TIMNUNOTAMOD", timNuNotaMod);
   }

   public String getTimOrigem() {
        return this.getVo().asString("TIMORIGEM");
   }

   public void setTimOrigem(String timOrigem) {
        markAsChanged("TIMORIGEM", timOrigem);
   }

   public BigDecimal getVlrAfrmm() {
        return this.getVo().asBigDecimal("VLRAFRMM");
   }

   public void setVlrAfrmm(BigDecimal vlrAfrmm) {
        markAsChanged("VLRAFRMM", vlrAfrmm);
   }

   public BigDecimal getVlrFreteCalc() {
        return this.getVo().asBigDecimal("VLRFRETECALC");
   }

   public void setVlrFreteCalc(BigDecimal vlrFreteCalc) {
        markAsChanged("VLRFRETECALC", vlrFreteCalc);
   }

   public String getVlrLiqItemNfe() {
        return this.getVo().asString("VLRLIQITEMNFE");
   }

   public void setVlrLiqItemNfe(String vlrLiqItemNfe) {
        markAsChanged("VLRLIQITEMNFE", vlrLiqItemNfe);
   }

   public BigDecimal getVlrPrestaAfrmm() {
        return this.getVo().asBigDecimal("VLRPRESTAFRMM");
   }

   public void setVlrPrestaAfrmm(BigDecimal vlrPrestaAfrmm) {
        markAsChanged("VLRPRESTAFRMM", vlrPrestaAfrmm);
   }

   public BigDecimal getVlrRepRedTotSemDesc() {
        return this.getVo().asBigDecimal("VLRREPREDTOTSEMDESC");
   }

   public void setVlrRepRedTotSemDesc(BigDecimal vlrRepRedTotSemDesc) {
        markAsChanged("VLRREPREDTOTSEMDESC", vlrRepRedTotSemDesc);
   }

   public String getAgrupFinNota() {
        return this.getVo().asString("AGRUPFINNOTA");
   }

   public void setAgrupFinNota(String agrupFinNota) {
        markAsChanged("AGRUPFINNOTA", agrupFinNota);
   }

   public BigDecimal getCodCidOrigem() {
        return this.getVo().asBigDecimal("CODCIDORIGEM");
   }

   public void setCodCidOrigem(BigDecimal codCidOrigem) {
        markAsChanged("CODCIDORIGEM", codCidOrigem);
   }

   public BigDecimal getCodCidDestino() {
        return this.getVo().asBigDecimal("CODCIDDESTINO");
   }

   public void setCodCidDestino(BigDecimal codCidDestino) {
        markAsChanged("CODCIDDESTINO", codCidDestino);
   }

   public String getClassifIcms() {
        return this.getVo().asString("CLASSIFICMS");
   }

   public void setClassifIcms(String classifIcms) {
        markAsChanged("CLASSIFICMS", classifIcms);
   }

   public BigDecimal getNuFop() {
        return this.getVo().asBigDecimal("NUFOP");
   }

   public void setNuFop(BigDecimal nuFop) {
        markAsChanged("NUFOP", nuFop);
   }

   public BigDecimal getCodUfEntrega() {
        return this.getVo().asBigDecimal("CODUFENTREGA");
   }

   public void setCodUfEntrega(BigDecimal codUfEntrega) {
        markAsChanged("CODUFENTREGA", codUfEntrega);
   }

   public BigDecimal getCodUfOrigem() {
        return this.getVo().asBigDecimal("CODUFORIGEM");
   }

   public void setCodUfOrigem(BigDecimal codUfOrigem) {
        markAsChanged("CODUFORIGEM", codUfOrigem);
   }

   public BigDecimal getCodContatoEntrega() {
        return this.getVo().asBigDecimal("CODCONTATOENTREGA");
   }

   public void setCodContatoEntrega(BigDecimal codContatoEntrega) {
        markAsChanged("CODCONTATOENTREGA", codContatoEntrega);
   }

   public BigDecimal getCodUfDestino() {
        return this.getVo().asBigDecimal("CODUFDESTINO");
   }

   public void setCodUfDestino(BigDecimal codUfDestino) {
        markAsChanged("CODUFDESTINO", codUfDestino);
   }

   public BigDecimal getCodCidEntrega() {
        return this.getVo().asBigDecimal("CODCIDENTREGA");
   }

   public void setCodCidEntrega(BigDecimal codCidEntrega) {
        markAsChanged("CODCIDENTREGA", codCidEntrega);
   }

   public String getStatusConferencia() {
        return this.getVo().asString("STATUSCONFERENCIA");
   }

   public void setStatusConferencia(String statusConferencia) {
        markAsChanged("STATUSCONFERENCIA", statusConferencia);
   }

   public String getStatusNfe() {
        return this.getVo().asString("STATUSNFE");
   }

   public void setStatusNfe(String statusNfe) {
        markAsChanged("STATUSNFE", statusNfe);
   }

   public String getStatusNfse() {
        return this.getVo().asString("STATUSNFSE");
   }

   public void setStatusNfse(String statusNfse) {
        markAsChanged("STATUSNFSE", statusNfse);
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

   public String getTipLiberacao() {
        return this.getVo().asString("TIPLIBERACAO");
   }

   public void setTipLiberacao(String tipLiberacao) {
        markAsChanged("TIPLIBERACAO", tipLiberacao);
   }

   public BigDecimal getCiot() {
        return this.getVo().asBigDecimal("CIOT");
   }

   public void setCiot(BigDecimal ciot) {
        markAsChanged("CIOT", ciot);
   }

   public String getRegEspTribut() {
        return this.getVo().asString("REGESPTRIBUT");
   }

   public void setRegEspTribut(String regEspTribut) {
        markAsChanged("REGESPTRIBUT", regEspTribut);
   }

   public String getExigeIssqn() {
        return this.getVo().asString("EXIGEISSQN");
   }

   public void setExigeIssqn(String exigeIssqn) {
        markAsChanged("EXIGEISSQN", exigeIssqn);
   }

   public String getSitEspecialResp() {
        return this.getVo().asString("SITESPECIALRESP");
   }

   public void setSitEspecialResp(String sitEspecialResp) {
        markAsChanged("SITESPECIALRESP", sitEspecialResp);
   }

   public String getMotNaoReterIssqn() {
        return this.getVo().asString("MOTNAORETERISSQN");
   }

   public void setMotNaoReterIssqn(String motNaoReterIssqn) {
        markAsChanged("MOTNAORETERISSQN", motNaoReterIssqn);
   }

   public String getChaveNfeRef() {
        return this.getVo().asString("CHAVENFEREF");
   }

   public void setChaveNfeRef(String chaveNfeRef) {
        markAsChanged("CHAVENFEREF", chaveNfeRef);
   }

   public String getClasCons() {
        return this.getVo().asString("CLASCONS");
   }

   public void setClasCons(String clasCons) {
        markAsChanged("CLASCONS", clasCons);
   }

   public String getFusoEmissEpec() {
        return this.getVo().asString("FUSOEMISSEPEC");
   }

   public void setFusoEmissEpec(String fusoEmissEpec) {
        markAsChanged("FUSOEMISSEPEC", fusoEmissEpec);
   }

   public String getFormPgtCte() {
        return this.getVo().asString("FORMPGTCTE");
   }

   public void setFormPgtCte(String formPgtCte) {
        markAsChanged("FORMPGTCTE", formPgtCte);
   }

   public BigDecimal getCodCidPrest() {
        return this.getVo().asBigDecimal("CODCIDPREST");
   }

   public void setCodCidPrest(BigDecimal codCidPrest) {
        markAsChanged("CODCIDPREST", codCidPrest);
   }

   public BigDecimal getDescTermAcord() {
        return this.getVo().asBigDecimal("DESCTERMACORD");
   }

   public void setDescTermAcord(BigDecimal descTermAcord) {
        markAsChanged("DESCTERMACORD", descTermAcord);
   }

   public String getTermAcordNota() {
        return this.getVo().asString("TERMACORDNOTA");
   }

   public void setTermAcordNota(String termAcordNota) {
        markAsChanged("TERMACORDNOTA", termAcordNota);
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

   public BigDecimal getVlrStFcpIntAnt() {
        return this.getVo().asBigDecimal("VLRSTFCPINTANT");
   }

   public void setVlrStFcpIntAnt(BigDecimal vlrStFcpIntAnt) {
        markAsChanged("VLRSTFCPINTANT", vlrStFcpIntAnt);
   }

   public String getTpAmbNfse() {
        return this.getVo().asString("TPAMBNFSE");
   }

   public void setTpAmbNfse(String tpAmbNfse) {
        markAsChanged("TPAMBNFSE", tpAmbNfse);
   }

   public BigDecimal getTimCodProd() {
        return this.getVo().asBigDecimal("TIMCODPROD");
   }

   public void setTimCodProd(BigDecimal timCodProd) {
        markAsChanged("TIMCODPROD", timCodProd);
   }

   public String getTimDescProd() {
        return this.getVo().asString("TIMDESCPROD");
   }

   public void setTimDescProd(String timDescProd) {
        markAsChanged("TIMDESCPROD", timDescProd);
   }

   public String getNfseId() {
        return this.getVo().asString("NFSEID");
   }

   public void setNfseId(String nfseId) {
        markAsChanged("NFSEID", nfseId);
   }

   public String getPremiacaoEstadual() {
        return this.getVo().asString("PREMIACAOESTADUAL");
   }

   public void setPremiacaoEstadual(String premiacaoEstadual) {
        markAsChanged("PREMIACAOESTADUAL", premiacaoEstadual);
   }

   public BigDecimal getCodDocArrecad() {
        return this.getVo().asBigDecimal("CODDOCARRECAD");
   }

   public void setCodDocArrecad(BigDecimal codDocArrecad) {
        markAsChanged("CODDOCARRECAD", codDocArrecad);
   }

   public String getNumDocArrecad() {
        return this.getVo().asString("NUMDOCARRECAD");
   }

   public void setNumDocArrecad(String numDocArrecad) {
        markAsChanged("NUMDOCARRECAD", numDocArrecad);
   }

   public BigDecimal getVlrIcmsDiferido() {
        return this.getVo().asBigDecimal("VLRICMSDIFERIDO");
   }

   public void setVlrIcmsDiferido(BigDecimal vlrIcmsDiferido) {
        markAsChanged("VLRICMSDIFERIDO", vlrIcmsDiferido);
   }

   public String getLatitude() {
        return this.getVo().asString("LATITUDE");
   }

   public void setLatitude(String latitude) {
        markAsChanged("LATITUDE", latitude);
   }

   public String getLongitude() {
        return this.getVo().asString("LONGITUDE");
   }

   public void setLongitude(String longitude) {
        markAsChanged("LONGITUDE", longitude);
   }

   public BigDecimal getNuPedFrete() {
        return this.getVo().asBigDecimal("NUPEDFRETE");
   }

   public void setNuPedFrete(BigDecimal nuPedFrete) {
        markAsChanged("NUPEDFRETE", nuPedFrete);
   }

   public BigDecimal getNuOdp() {
        return this.getVo().asBigDecimal("NUODP");
   }

   public void setNuOdp(BigDecimal nuOdp) {
        markAsChanged("NUODP", nuOdp);
   }

   public String getCodRastreamentoEct() {
        return this.getVo().asString("CODRASTREAMENTOECT");
   }

   public void setCodRastreamentoEct(String codRastreamentoEct) {
        markAsChanged("CODRASTREAMENTOECT", codRastreamentoEct);
   }

   public BigDecimal getCodCidFimCte() {
        return this.getVo().asBigDecimal("CODCIDFIMCTE");
   }

   public void setCodCidFimCte(BigDecimal codCidFimCte) {
        markAsChanged("CODCIDFIMCTE", codCidFimCte);
   }

   public BigDecimal getCodCidIniCte() {
        return this.getVo().asBigDecimal("CODCIDINICTE");
   }

   public void setCodCidIniCte(BigDecimal codCidIniCte) {
        markAsChanged("CODCIDINICTE", codCidIniCte);
   }

   public String getCteGlobal() {
        return this.getVo().asString("CTEGLOBAL");
   }

   public void setCteGlobal(String cteGlobal) {
        markAsChanged("CTEGLOBAL", cteGlobal);
   }

   public BigDecimal getVlrCargaAverb() {
        return this.getVo().asBigDecimal("VLRCARGAAVERB");
   }

   public void setVlrCargaAverb(BigDecimal vlrCargaAverb) {
        markAsChanged("VLRCARGAAVERB", vlrCargaAverb);
   }

   public BigDecimal getPercDescFob() {
        return this.getVo().asBigDecimal("PERCDESCFOB");
   }

   public void setPercDescFob(BigDecimal percDescFob) {
        markAsChanged("PERCDESCFOB", percDescFob);
   }

   public BigDecimal getSumVlrIiOutNota() {
        return this.getVo().asBigDecimal("SUMVLRIIOUTNOTA");
   }

   public void setSumVlrIiOutNota(BigDecimal sumVlrIiOutNota) {
        markAsChanged("SUMVLRIIOUTNOTA", sumVlrIiOutNota);
   }

   public Timestamp getDhViagem() {
        return this.getVo().asTimestamp("DHVIAGEM");
   }

   public void setDhViagem(Timestamp dhViagem) {
        markAsChanged("DHVIAGEM", dhViagem);
   }

   public BigDecimal getNuSessao() {
        return this.getVo().asBigDecimal("NUSESSAO");
   }

   public void setNuSessao(BigDecimal nuSessao) {
        markAsChanged("NUSESSAO", nuSessao);
   }

   public BigDecimal getTpFretamento() {
        return this.getVo().asBigDecimal("TPFRETAMENTO");
   }

   public void setTpFretamento(BigDecimal tpFretamento) {
        markAsChanged("TPFRETAMENTO", tpFretamento);
   }

   public BigDecimal getCodParcRetirada() {
        return this.getVo().asBigDecimal("CODPARCRETIRADA");
   }

   public void setCodParcRetirada(BigDecimal codParcRetirada) {
        markAsChanged("CODPARCRETIRADA", codParcRetirada);
   }

   public String getNotaPorPedidoPdv() {
        return this.getVo().asString("NOTAPORPEDIDOPDV");
   }

   public void setNotaPorPedidoPdv(String notaPorPedidoPdv) {
        markAsChanged("NOTAPORPEDIDOPDV", notaPorPedidoPdv);
   }

   public String getChaveCteRef() {
        return this.getVo().asString("CHAVECTEREF");
   }

   public void setChaveCteRef(String chaveCteRef) {
        markAsChanged("CHAVECTEREF", chaveCteRef);
   }

   public BigDecimal getValorDesonPisCofins() {
        return this.getVo().asBigDecimal("VALORDESONPISCOFINS");
   }

   public void setValorDesonPisCofins(BigDecimal valorDesonPisCofins) {
        markAsChanged("VALORDESONPISCOFINS", valorDesonPisCofins);
   }

   public BigDecimal getCodInterm() {
        return this.getVo().asBigDecimal("CODINTERM");
   }

   public void setCodInterm(BigDecimal codInterm) {
        markAsChanged("CODINTERM", codInterm);
   }

   public String getIntermed() {
        return this.getVo().asString("INTERMED");
   }

   public void setIntermed(String intermed) {
        markAsChanged("INTERMED", intermed);
   }

   public BigDecimal getVlrFetHab() {
        return this.getVo().asBigDecimal("VLRFETHAB");
   }

   public void setVlrFetHab(BigDecimal vlrFetHab) {
        markAsChanged("VLRFETHAB", vlrFetHab);
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

   public String getIndNegModal() {
        return this.getVo().asString("INDNEGMODAL");
   }

   public void setIndNegModal(String indNegModal) {
        markAsChanged("INDNEGMODAL", indNegModal);
   }

   public BigDecimal getBaseIcmsStFrete() {
        return this.getVo().asBigDecimal("BASEICMSSTFRETE");
   }

   public void setBaseIcmsStFrete(BigDecimal baseIcmsStFrete) {
        markAsChanged("BASEICMSSTFRETE", baseIcmsStFrete);
   }

   public BigDecimal getIcmsStFrete() {
        return this.getVo().asBigDecimal("ICMSSTFRETE");
   }

   public void setIcmsStFrete(BigDecimal icmsStFrete) {
        markAsChanged("ICMSSTFRETE", icmsStFrete);
   }

   public BigDecimal getVlrRepRedSt() {
        return this.getVo().asBigDecimal("VLRREPREDST");
   }

   public void setVlrRepRedSt(BigDecimal vlrRepRedSt) {
        markAsChanged("VLRREPREDST", vlrRepRedSt);
   }

   public BigDecimal getBaseIcmsAt() {
        return this.getVo().asBigDecimal("BASEICMSAT");
   }

   public void setBaseIcmsAt(BigDecimal baseIcmsAt) {
        markAsChanged("BASEICMSAT", baseIcmsAt);
   }

   public BigDecimal getVlrIcmsAt() {
        return this.getVo().asBigDecimal("VLRICMSAT");
   }

   public void setVlrIcmsAt(BigDecimal vlrIcmsAt) {
        markAsChanged("VLRICMSAT", vlrIcmsAt);
   }

   public BigDecimal getCodCheckout() {
        return this.getVo().asBigDecimal("CODCHECKOUT");
   }

   public void setCodCheckout(BigDecimal codCheckout) {
        markAsChanged("CODCHECKOUT", codCheckout);
   }

   public BigDecimal getClienteIdParceria() {
        return this.getVo().asBigDecimal("CLIENTEIDPARCERIA");
   }

   public void setClienteIdParceria(BigDecimal clienteIdParceria) {
        markAsChanged("CLIENTEIDPARCERIA", clienteIdParceria);
   }

   public BigDecimal getIdDescParceria() {
        return this.getVo().asBigDecimal("IDDESCPARCERIA");
   }

   public void setIdDescParceria(BigDecimal idDescParceria) {
        markAsChanged("IDDESCPARCERIA", idDescParceria);
   }

   public BigDecimal getIdPontuacaoParceria() {
        return this.getVo().asBigDecimal("IDPONTUACAOPARCERIA");
   }

   public void setIdPontuacaoParceria(BigDecimal idPontuacaoParceria) {
        markAsChanged("IDPONTUACAOPARCERIA", idPontuacaoParceria);
   }

   public BigDecimal getVlrDescParceria() {
        return this.getVo().asBigDecimal("VLRDESCPARCERIA");
   }

   public void setVlrDescParceria(BigDecimal vlrDescParceria) {
        markAsChanged("VLRDESCPARCERIA", vlrDescParceria);
   }

   public BigDecimal getQtdProdDistintos() {
        return this.getVo().asBigDecimal("QTDPRODDISTINTOS");
   }

   public void setQtdProdDistintos(BigDecimal qtdProdDistintos) {
        markAsChanged("QTDPRODDISTINTOS", qtdProdDistintos);
   }

   public String getDisDesautImpEmb() {
        return this.getVo().asString("DISDESAUTIMPEMB");
   }

   public void setDisDesautImpEmb(String disDesautImpEmb) {
        markAsChanged("DISDESAUTIMPEMB", disDesautImpEmb);
   }

   public String getContabilizado() {
        return this.getVo().asString("CONTABILIZADO");
   }

   public void setContabilizado(String contabilizado) {
        markAsChanged("CONTABILIZADO", contabilizado);
   }

   public BigDecimal getNuNotaRec() {
        return this.getVo().asBigDecimal("NUNOTAREC");
   }

   public void setNuNotaRec(BigDecimal nuNotaRec) {
        markAsChanged("NUNOTAREC", nuNotaRec);
   }

   public BigDecimal getNuRecebimento() {
        return this.getVo().asBigDecimal("NURECEBIMENTO");
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        markAsChanged("NURECEBIMENTO", nuRecebimento);
   }

   public String getRetGerWms() {
        return this.getVo().asString("RETGERWMS");
   }

   public void setRetGerWms(String retGerWms) {
        markAsChanged("RETGERWMS", retGerWms);
   }

   public String getRetornoEquipFiscal() {
        return this.getVo().asString("RETORNOEQUIPFISCAL");
   }

   public void setRetornoEquipFiscal(String retornoEquipFiscal) {
        markAsChanged("RETORNOEQUIPFISCAL", retornoEquipFiscal);
   }

   public BigDecimal getSomIcmsNfeNac() {
        return this.getVo().asBigDecimal("SOMICMSNFENAC");
   }

   public void setSomIcmsNfeNac(BigDecimal somIcmsNfeNac) {
        markAsChanged("SOMICMSNFENAC", somIcmsNfeNac);
   }

   public BigDecimal getSomPisCofNfeNac() {
        return this.getVo().asBigDecimal("SOMPISCOFNFENAC");
   }

   public void setSomPisCofNfeNac(BigDecimal somPisCofNfeNac) {
        markAsChanged("SOMPISCOFNFENAC", somPisCofNfeNac);
   }

   public String getStatusCfe() {
        return this.getVo().asString("STATUSCFE");
   }

   public void setStatusCfe(String statusCfe) {
        markAsChanged("STATUSCFE", statusCfe);
   }

   public Timestamp getDtValAutVendaMais() {
        return this.getVo().asTimestamp("DTVALAUTVENDAMAIS");
   }

   public void setDtValAutVendaMais(Timestamp dtValAutVendaMais) {
        markAsChanged("DTVALAUTVENDAMAIS", dtValAutVendaMais);
   }

   public String getHistConfig() {
        return this.getVo().asString("HISTCONFIG");
   }

   public void setHistConfig(String histConfig) {
        markAsChanged("HISTCONFIG", histConfig);
   }

   public String getSerieNfse() {
        return this.getVo().asString("SERIENFSE");
   }

   public void setSerieNfse(String serieNfse) {
        markAsChanged("SERIENFSE", serieNfse);
   }

   public String getCpfRespTec() {
        return this.getVo().asString("CPFRESPTEC");
   }

   public void setCpfRespTec(String cpfRespTec) {
        markAsChanged("CPFRESPTEC", cpfRespTec);
   }

   public BigDecimal getNumGuia() {
        return this.getVo().asBigDecimal("NUMGUIA");
   }

   public void setNumGuia(BigDecimal numGuia) {
        markAsChanged("NUMGUIA", numGuia);
   }

   public String getNumReceitaGro() {
        return this.getVo().asString("NUMRECEITAGRO");
   }

   public void setNumReceitaGro(String numReceitaGro) {
        markAsChanged("NUMRECEITAGRO", numReceitaGro);
   }

   public String getSerieGuia() {
        return this.getVo().asString("SERIEGUIA");
   }

   public void setSerieGuia(String serieGuia) {
        markAsChanged("SERIEGUIA", serieGuia);
   }

   public String getTipoGuia() {
        return this.getVo().asString("TIPOGUIA");
   }

   public void setTipoGuia(String tipoGuia) {
        markAsChanged("TIPOGUIA", tipoGuia);
   }

   public String getUfEmissao() {
        return this.getVo().asString("UFEMISSAO");
   }

   public void setUfEmissao(String ufEmissao) {
        markAsChanged("UFEMISSAO", ufEmissao);
   }

   public String getCaracAd() {
        return this.getVo().asString("CARACAD");
   }

   public void setCaracAd(String caracAd) {
        markAsChanged("CARACAD", caracAd);
   }

   public String getCaracSer() {
        return this.getVo().asString("CARACSER");
   }

   public void setCaracSer(String caracSer) {
        markAsChanged("CARACSER", caracSer);
   }

   public BigDecimal getSomDespAdUnfeNac() {
        return this.getVo().asBigDecimal("SOMDESPADUNFENAC");
   }

   public void setSomDespAdUnfeNac(BigDecimal somDespAdUnfeNac) {
        markAsChanged("SOMDESPADUNFENAC", somDespAdUnfeNac);
   }

   public String getCodAuthVm() {
        return this.getVo().asString("CODAUTHVM");
   }

   public void setCodAuthVm(String codAuthVm) {
        markAsChanged("CODAUTHVM", codAuthVm);
   }

   public String getNumProtocInCte() {
        return this.getVo().asString("NUMPROTOCINCTE");
   }

   public void setNumProtocInCte(String numProtocInCte) {
        markAsChanged("NUMPROTOCINCTE", numProtocInCte);
   }

   public String getStatusVm() {
        return this.getVo().asString("STATUSVM");
   }

   public void setStatusVm(String statusVm) {
        markAsChanged("STATUSVM", statusVm);
   }

   public String getNumProtocInNfe() {
        return this.getVo().asString("NUMPROTOCINNFE");
   }

   public void setNumProtocInNfe(String numProtocInNfe) {
        markAsChanged("NUMPROTOCINNFE", numProtocInNfe);
   }

   public BigDecimal getVlrRepTerc() {
        return this.getVo().asBigDecimal("VLRREPTERC");
   }

   public void setVlrRepTerc(BigDecimal vlrRepTerc) {
        markAsChanged("VLRREPTERC", vlrRepTerc);
   }

   public String getChvNfeIneRef() {
        return this.getVo().asString("CHVNFEINEREF");
   }

   public void setChvNfeIneRef(String chvNfeIneRef) {
        markAsChanged("CHVNFEINEREF", chvNfeIneRef);
   }

   public Timestamp getDtEscrCont() {
        return this.getVo().asTimestamp("DTESCRCONT");
   }

   public void setDtEscrCont(Timestamp dtEscrCont) {
        markAsChanged("DTESCRCONT", dtEscrCont);
   }

   public String getModRecebPdvWeb() {
        return this.getVo().asString("MODRECEBPDVWEB");
   }

   public void setModRecebPdvWeb(String modRecebPdvWeb) {
        markAsChanged("MODRECEBPDVWEB", modRecebPdvWeb);
   }

   public String getStatusAutorizacaoVm() {
        return this.getVo().asString("STATUSAUTORIZACAOVM");
   }

   public void setStatusAutorizacaoVm(String statusAutorizacaoVm) {
        markAsChanged("STATUSAUTORIZACAOVM", statusAutorizacaoVm);
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
        this.setVo(vo);
        return this;
   }
}
