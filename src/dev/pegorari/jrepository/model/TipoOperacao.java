package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TipoOperacao extends AbstractSankhyaEntity<TipoOperacao> {
   public String getUsarPrecoCusto() {
        return this.getVo().asString("USARPRECOCUSTO");
   }

   public void setUsarPrecoCusto(String usarPrecoCusto) {
        markAsChanged("USARPRECOCUSTO", usarPrecoCusto);
   }

   public String getUsoProdSeparacao() {
        return this.getVo().asString("USOPRODSEPARACAO");
   }

   public void setUsoProdSeparacao(String usoProdSeparacao) {
        markAsChanged("USOPRODSEPARACAO", usoProdSeparacao);
   }

   public String getValTbCompCr() {
        return this.getVo().asString("VALTBCOMPCR");
   }

   public void setValTbCompCr(String valTbCompCr) {
        markAsChanged("VALTBCOMPCR", valTbCompCr);
   }

   public String getValVctLaudoEst() {
        return this.getVo().asString("VALVCTLAUDOEST");
   }

   public void setValVctLaudoEst(String valVctLaudoEst) {
        markAsChanged("VALVCTLAUDOEST", valVctLaudoEst);
   }

   public String getVendIte() {
        return this.getVo().asString("VENDITE");
   }

   public void setVendIte(String vendIte) {
        markAsChanged("VENDITE", vendIte);
   }

   public BigDecimal getCodModNfse() {
        return this.getVo().asBigDecimal("CODMODNFSE");
   }

   public void setCodModNfse(BigDecimal codModNfse) {
        markAsChanged("CODMODNFSE", codModNfse);
   }

   public BigDecimal getCodModRps() {
        return this.getVo().asBigDecimal("CODMODRPS");
   }

   public void setCodModRps(BigDecimal codModRps) {
        markAsChanged("CODMODRPS", codModRps);
   }

   public String getCodNatOperIss() {
        return this.getVo().asString("CODNATOPERISS");
   }

   public void setCodNatOperIss(String codNatOperIss) {
        markAsChanged("CODNATOPERISS", codNatOperIss);
   }

   public String getCalcDifAlPart() {
        return this.getVo().asString("CALCDIFALPART");
   }

   public void setCalcDifAlPart(String calcDifAlPart) {
        markAsChanged("CALCDIFALPART", calcDifAlPart);
   }

   public String getValSitCadSefaz() {
        return this.getVo().asString("VALSITCADSEFAZ");
   }

   public void setValSitCadSefaz(String valSitCadSefaz) {
        markAsChanged("VALSITCADSEFAZ", valSitCadSefaz);
   }

   public String getTransfCbGlobal() {
        return this.getVo().asString("TRANSFCBGLOBAL");
   }

   public void setTransfCbGlobal(String transfCbGlobal) {
        markAsChanged("TRANSFCBGLOBAL", transfCbGlobal);
   }

   public String getTransfWms() {
        return this.getVo().asString("TRANSFWMS");
   }

   public void setTransfWms(String transfWms) {
        markAsChanged("TRANSFWMS", transfWms);
   }

   public String getTravafimImp() {
        return this.getVo().asString("TRAVAFIMIMP");
   }

   public void setTravafimImp(String travafimImp) {
        markAsChanged("TRAVAFIMIMP", travafimImp);
   }

   public String getUsaCusMedBaseSt() {
        return this.getVo().asString("USACUSMEDBASEST");
   }

   public void setUsaCusMedBaseSt(String usaCusMedBaseSt) {
        markAsChanged("USACUSMEDBASEST", usaCusMedBaseSt);
   }

   public String getUsarConfCega() {
        return this.getVo().asString("USARCONFCEGA");
   }

   public void setUsarConfCega(String usarConfCega) {
        markAsChanged("USARCONFCEGA", usarConfCega);
   }

   public String getAceitaFatAcima() {
        return this.getVo().asString("ACEITAFATACIMA");
   }

   public void setAceitaFatAcima(String aceitaFatAcima) {
        markAsChanged("ACEITAFATACIMA", aceitaFatAcima);
   }

   public String getAgrupaProdNfe() {
        return this.getVo().asString("AGRUPAPRODNFE");
   }

   public void setAgrupaProdNfe(String agrupaProdNfe) {
        markAsChanged("AGRUPAPRODNFE", agrupaProdNfe);
   }

   public String getAgrupaServFat() {
        return this.getVo().asString("AGRUPASERVFAT");
   }

   public void setAgrupaServFat(String agrupaServFat) {
        markAsChanged("AGRUPASERVFAT", agrupaServFat);
   }

   public String getAltItemParcFat() {
        return this.getVo().asString("ALTITEMPARCFAT");
   }

   public void setAltItemParcFat(String altItemParcFat) {
        markAsChanged("ALTITEMPARCFAT", altItemParcFat);
   }

   public String getAltNfConf() {
        return this.getVo().asString("ALTNFCONF");
   }

   public void setAltNfConf(String altNfConf) {
        markAsChanged("ALTNFCONF", altNfConf);
   }

   public BigDecimal getAnaliseGiro() {
        return this.getVo().asBigDecimal("ANALISEGIRO");
   }

   public void setAnaliseGiro(BigDecimal analiseGiro) {
        markAsChanged("ANALISEGIRO", analiseGiro);
   }

   public String getArmazenagem() {
        return this.getVo().asString("ARMAZENAGEM");
   }

   public void setArmazenagem(String armazenagem) {
        markAsChanged("ARMAZENAGEM", armazenagem);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getAtualAcdc() {
        return this.getVo().asString("ATUALACDC");
   }

   public void setAtualAcdc(String atualAcdc) {
        markAsChanged("ATUALACDC", atualAcdc);
   }

   public String getAtualBem() {
        return this.getVo().asString("ATUALBEM");
   }

   public void setAtualBem(String atualBem) {
        markAsChanged("ATUALBEM", atualBem);
   }

   public String getAtualCom() {
        return this.getVo().asString("ATUALCOM");
   }

   public void setAtualCom(String atualCom) {
        markAsChanged("ATUALCOM", atualCom);
   }

   public String getAtualComOs() {
        return this.getVo().asString("ATUALCOMOS");
   }

   public void setAtualComOs(String atualComOs) {
        markAsChanged("ATUALCOMOS", atualComOs);
   }

   public String getAtualCtb() {
        return this.getVo().asString("ATUALCTB");
   }

   public void setAtualCtb(String atualCtb) {
        markAsChanged("ATUALCTB", atualCtb);
   }

   public String getAtualDatRecWms() {
        return this.getVo().asString("ATUALDATRECWMS");
   }

   public void setAtualDatRecWms(String atualDatRecWms) {
        markAsChanged("ATUALDATRECWMS", atualDatRecWms);
   }

   public String getAtualEst() {
        return this.getVo().asString("ATUALEST");
   }

   public void setAtualEst(String atualEst) {
        markAsChanged("ATUALEST", atualEst);
   }

   public BigDecimal getAtualEstMp() {
        return this.getVo().asBigDecimal("ATUALESTMP");
   }

   public void setAtualEstMp(BigDecimal atualEstMp) {
        markAsChanged("ATUALESTMP", atualEstMp);
   }

   public String getAtualEstTerc() {
        return this.getVo().asString("ATUALESTTERC");
   }

   public void setAtualEstTerc(String atualEstTerc) {
        markAsChanged("ATUALESTTERC", atualEstTerc);
   }

   public BigDecimal getAtualFin() {
        return this.getVo().asBigDecimal("ATUALFIN");
   }

   public void setAtualFin(BigDecimal atualFin) {
        markAsChanged("ATUALFIN", atualFin);
   }

   public String getAtualFinTerc() {
        return this.getVo().asString("ATUALFINTERC");
   }

   public void setAtualFinTerc(String atualFinTerc) {
        markAsChanged("ATUALFINTERC", atualFinTerc);
   }

   public BigDecimal getAtualIndeniz() {
        return this.getVo().asBigDecimal("ATUALINDENIZ");
   }

   public void setAtualIndeniz(BigDecimal atualIndeniz) {
        markAsChanged("ATUALINDENIZ", atualIndeniz);
   }

   public String getAtualizarAteio() {
        return this.getVo().asString("ATUALIZARATEIO");
   }

   public void setAtualizarAteio(String atualizarAteio) {
        markAsChanged("ATUALIZARATEIO", atualizarAteio);
   }

   public String getAtualLivFis() {
        return this.getVo().asString("ATUALLIVFIS");
   }

   public void setAtualLivFis(String atualLivFis) {
        markAsChanged("ATUALLIVFIS", atualLivFis);
   }

   public String getAtualLivIss() {
        return this.getVo().asString("ATUALLIVISS");
   }

   public void setAtualLivIss(String atualLivIss) {
        markAsChanged("ATUALLIVISS", atualLivIss);
   }

   public String getAtualPrecoFat() {
        return this.getVo().asString("ATUALPRECOFAT");
   }

   public void setAtualPrecoFat(String atualPrecoFat) {
        markAsChanged("ATUALPRECOFAT", atualPrecoFat);
   }

   public BigDecimal getAtualTransg() {
        return this.getVo().asBigDecimal("ATUALTRANSG");
   }

   public void setAtualTransg(BigDecimal atualTransg) {
        markAsChanged("ATUALTRANSG", atualTransg);
   }

   public String getAtualUltimaComp() {
        return this.getVo().asString("ATUALULTIMACOMP");
   }

   public void setAtualUltimaComp(String atualUltimaComp) {
        markAsChanged("ATUALULTIMACOMP", atualUltimaComp);
   }

   public String getAtualUltimaVend() {
        return this.getVo().asString("ATUALULTIMAVEND");
   }

   public void setAtualUltimaVend(String atualUltimaVend) {
        markAsChanged("ATUALULTIMAVEND", atualUltimaVend);
   }

   public String getAutDigital() {
        return this.getVo().asString("AUTDIGITAL");
   }

   public void setAutDigital(String autDigital) {
        markAsChanged("AUTDIGITAL", autDigital);
   }

   public String getAvisarComp() {
        return this.getVo().asString("AVISARCOMP");
   }

   public void setAvisarComp(String avisarComp) {
        markAsChanged("AVISARCOMP", avisarComp);
   }

   public String getBaseIcmsFreteCalcSt() {
        return this.getVo().asString("BASEICMSFRETECALCST");
   }

   public void setBaseIcmsFreteCalcSt(String baseIcmsFreteCalcSt) {
        markAsChanged("BASEICMSFRETECALCST", baseIcmsFreteCalcSt);
   }

   public String getBaseNumeracao() {
        return this.getVo().asString("BASENUMERACAO");
   }

   public void setBaseNumeracao(String baseNumeracao) {
        markAsChanged("BASENUMERACAO", baseNumeracao);
   }

   public String getBloqEstVenc() {
        return this.getVo().asString("BLOQESTVENC");
   }

   public void setBloqEstVenc(String bloqEstVenc) {
        markAsChanged("BLOQESTVENC", bloqEstVenc);
   }

   public String getBonificacao() {
        return this.getVo().asString("BONIFICACAO");
   }

   public void setBonificacao(String bonificacao) {
        markAsChanged("BONIFICACAO", bonificacao);
   }

   public String getBusCmpTerc() {
        return this.getVo().asString("BUSCMPTERC");
   }

   public void setBusCmpTerc(String busCmpTerc) {
        markAsChanged("BUSCMPTERC", busCmpTerc);
   }

   public String getCalcDifIcms() {
        return this.getVo().asString("CALCDIFICMS");
   }

   public void setCalcDifIcms(String calcDifIcms) {
        markAsChanged("CALCDIFICMS", calcDifIcms);
   }

   public String getCalcIcms() {
        return this.getVo().asString("CALCICMS");
   }

   public void setCalcIcms(String calcIcms) {
        markAsChanged("CALCICMS", calcIcms);
   }

   public String getCamGerEdiConf() {
        return this.getVo().asString("CAMGEREDICONF");
   }

   public void setCamGerEdiConf(String camGerEdiConf) {
        markAsChanged("CAMGEREDICONF", camGerEdiConf);
   }

   public String getClassifIcms() {
        return this.getVo().asString("CLASSIFICMS");
   }

   public void setClassifIcms(String classifIcms) {
        markAsChanged("CLASSIFICMS", classifIcms);
   }

   public BigDecimal getCodCfoCombustLubrif() {
        return this.getVo().asBigDecimal("CODCFO_COMBUST_LUBRIF");
   }

   public void setCodCfoCombustLubrif(BigDecimal codCfoCombustLubrif) {
        markAsChanged("CODCFO_COMBUST_LUBRIF", codCfoCombustLubrif);
   }

   public BigDecimal getCodCfoEntrada() {
        return this.getVo().asBigDecimal("CODCFO_ENTRADA");
   }

   public void setCodCfoEntrada(BigDecimal codCfoEntrada) {
        markAsChanged("CODCFO_ENTRADA", codCfoEntrada);
   }

   public BigDecimal getCodCfoEntradaFora() {
        return this.getVo().asBigDecimal("CODCFO_ENTRADA_FORA");
   }

   public void setCodCfoEntradaFora(BigDecimal codCfoEntradaFora) {
        markAsChanged("CODCFO_ENTRADA_FORA", codCfoEntradaFora);
   }

   public BigDecimal getCodCfoSaida() {
        return this.getVo().asBigDecimal("CODCFO_SAIDA");
   }

   public void setCodCfoSaida(BigDecimal codCfoSaida) {
        markAsChanged("CODCFO_SAIDA", codCfoSaida);
   }

   public BigDecimal getCodCfoSaidaFora() {
        return this.getVo().asBigDecimal("CODCFO_SAIDA_FORA");
   }

   public void setCodCfoSaidaFora(BigDecimal codCfoSaidaFora) {
        markAsChanged("CODCFO_SAIDA_FORA", codCfoSaidaFora);
   }

   public BigDecimal getCodCfoTerc() {
        return this.getVo().asBigDecimal("CODCFO_TERC");
   }

   public void setCodCfoTerc(BigDecimal codCfoTerc) {
        markAsChanged("CODCFO_TERC", codCfoTerc);
   }

   public BigDecimal getCodCfps() {
        return this.getVo().asBigDecimal("CODCFPS");
   }

   public void setCodCfps(BigDecimal codCfps) {
        markAsChanged("CODCFPS", codCfps);
   }

   public String getDescRemail() {
        return this.getVo().asString("DESCREMAIL");
   }

   public void setDescRemail(String descRemail) {
        markAsChanged("DESCREMAIL", descRemail);
   }

   public String getUtilizaWms() {
        return this.getVo().asString("UTILIZAWMS");
   }

   public void setUtilizaWms(String utilizaWms) {
        markAsChanged("UTILIZAWMS", utilizaWms);
   }

   public String getValEst() {
        return this.getVo().asString("VALEST");
   }

   public void setValEst(String valEst) {
        markAsChanged("VALEST", valEst);
   }

   public String getValidaAgrupMin() {
        return this.getVo().asString("VALIDAAGRUPMIN");
   }

   public void setValidaAgrupMin(String validaAgrupMin) {
        markAsChanged("VALIDAAGRUPMIN", validaAgrupMin);
   }

   public String getValidaAtraso() {
        return this.getVo().asString("VALIDAATRASO");
   }

   public void setValidaAtraso(String validaAtraso) {
        markAsChanged("VALIDAATRASO", validaAtraso);
   }

   public String getValidaData() {
        return this.getVo().asString("VALIDADATA");
   }

   public void setValidaData(String validaData) {
        markAsChanged("VALIDADATA", validaData);
   }

   public String getValidaMediaNegoc() {
        return this.getVo().asString("VALIDAMEDIANEGOC");
   }

   public void setValidaMediaNegoc(String validaMediaNegoc) {
        markAsChanged("VALIDAMEDIANEGOC", validaMediaNegoc);
   }

   public String getIntegSerCon() {
        return this.getVo().asString("INTEGSERCON");
   }

   public void setIntegSerCon(String integSerCon) {
        markAsChanged("INTEGSERCON", integSerCon);
   }

   public String getMarcarNaoPendente() {
        return this.getVo().asString("MARCARNAOPENDENTE");
   }

   public void setMarcarNaoPendente(String marcarNaoPendente) {
        markAsChanged("MARCARNAOPENDENTE", marcarNaoPendente);
   }

   public String getMpNumAutLote() {
        return this.getVo().asString("MPNUMAUTLOTE");
   }

   public void setMpNumAutLote(String mpNumAutLote) {
        markAsChanged("MPNUMAUTLOTE", mpNumAutLote);
   }

   public String getNaoIncConf() {
        return this.getVo().asString("NAOINCCONF");
   }

   public void setNaoIncConf(String naoIncConf) {
        markAsChanged("NAOINCCONF", naoIncConf);
   }

   public String getNatBcCred() {
        return this.getVo().asString("NATBCCRED");
   }

   public void setNatBcCred(String natBcCred) {
        markAsChanged("NATBCCRED", natBcCred);
   }

   public String getNatOperSped() {
        return this.getVo().asString("NATOPERSPED");
   }

   public void setNatOperSped(String natOperSped) {
        markAsChanged("NATOPERSPED", natOperSped);
   }

   public String getNfe() {
        return this.getVo().asString("NFE");
   }

   public void setNfe(String nfe) {
        markAsChanged("NFE", nfe);
   }

   public String getNfeEstorno() {
        return this.getVo().asString("NFEESTORNO");
   }

   public void setNfeEstorno(String nfeEstorno) {
        markAsChanged("NFEESTORNO", nfeEstorno);
   }

   public String getNfeSemDtEntSai() {
        return this.getVo().asString("NFESEMDTENTSAI");
   }

   public void setNfeSemDtEntSai(String nfeSemDtEntSai) {
        markAsChanged("NFESEMDTENTSAI", nfeSemDtEntSai);
   }

   public String getNfse() {
        return this.getVo().asString("NFSE");
   }

   public void setNfse(String nfse) {
        markAsChanged("NFSE", nfse);
   }

   public String getNfsePorNat() {
        return this.getVo().asString("NFSEPORNAT");
   }

   public void setNfsePorNat(String nfsePorNat) {
        markAsChanged("NFSEPORNAT", nfsePorNat);
   }

   public BigDecimal getNucCo() {
        return this.getVo().asBigDecimal("NUCCO");
   }

   public void setNucCo(BigDecimal nucCo) {
        markAsChanged("NUCCO", nucCo);
   }

   public BigDecimal getNuLayout() {
        return this.getVo().asBigDecimal("NULAYOUT");
   }

   public void setNuLayout(BigDecimal nuLayout) {
        markAsChanged("NULAYOUT", nuLayout);
   }

   public String getNumSomAut() {
        return this.getVo().asString("NUMSOMAUT");
   }

   public void setNumSomAut(String numSomAut) {
        markAsChanged("NUMSOMAUT", numSomAut);
   }

   public BigDecimal getNuNotaModelo() {
        return this.getVo().asBigDecimal("NUNOTAMODELO");
   }

   public void setNuNotaModelo(BigDecimal nuNotaModelo) {
        markAsChanged("NUNOTAMODELO", nuNotaModelo);
   }

   public String getObterVlrMoedaFat() {
        return this.getVo().asString("OBTERVLRMOEDAFAT");
   }

   public void setObterVlrMoedaFat(String obterVlrMoedaFat) {
        markAsChanged("OBTERVLRMOEDAFAT", obterVlrMoedaFat);
   }

   public String getOc() {
        return this.getVo().asString("OC");
   }

   public void setOc(String oc) {
        markAsChanged("OC", oc);
   }

   public String getPedFrete() {
        return this.getVo().asString("PEDFRETE");
   }

   public void setPedFrete(String pedFrete) {
        markAsChanged("PEDFRETE", pedFrete);
   }

   public String getPendente() {
        return this.getVo().asString("PENDENTE");
   }

   public void setPendente(String pendente) {
        markAsChanged("PENDENTE", pendente);
   }

   public String getPermConfParcialWms() {
        return this.getVo().asString("PERMCONFPARCIALWMS");
   }

   public void setPermConfParcialWms(String permConfParcialWms) {
        markAsChanged("PERMCONFPARCIALWMS", permConfParcialWms);
   }

   public String getPesaItem() {
        return this.getVo().asString("PESAITEM");
   }

   public void setPesaItem(String pesaItem) {
        markAsChanged("PESAITEM", pesaItem);
   }

   public String getPisPropDestaque() {
        return this.getVo().asString("PISPROPDESTAQUE");
   }

   public void setPisPropDestaque(String pisPropDestaque) {
        markAsChanged("PISPROPDESTAQUE", pisPropDestaque);
   }

   public String getPisPropEmbalagem() {
        return this.getVo().asString("PISPROPEMBALAGEM");
   }

   public void setPisPropEmbalagem(String pisPropEmbalagem) {
        markAsChanged("PISPROPEMBALAGEM", pisPropEmbalagem);
   }

   public String getPisPropFrete() {
        return this.getVo().asString("PISPROPFRETE");
   }

   public void setPisPropFrete(String pisPropFrete) {
        markAsChanged("PISPROPFRETE", pisPropFrete);
   }

   public String getPisPropJuro() {
        return this.getVo().asString("PISPROPJURO");
   }

   public void setPisPropJuro(String pisPropJuro) {
        markAsChanged("PISPROPJURO", pisPropJuro);
   }

   public String getPisPropSeg() {
        return this.getVo().asString("PISPROPSEG");
   }

   public void setPisPropSeg(String pisPropSeg) {
        markAsChanged("PISPROPSEG", pisPropSeg);
   }

   public String getPisStPropDestaque() {
        return this.getVo().asString("PISSTPROPDESTAQUE");
   }

   public void setPisStPropDestaque(String pisStPropDestaque) {
        markAsChanged("PISSTPROPDESTAQUE", pisStPropDestaque);
   }

   public String getPisStPropEmbalagem() {
        return this.getVo().asString("PISSTPROPEMBALAGEM");
   }

   public void setPisStPropEmbalagem(String pisStPropEmbalagem) {
        markAsChanged("PISSTPROPEMBALAGEM", pisStPropEmbalagem);
   }

   public String getPisStPropFrete() {
        return this.getVo().asString("PISSTPROPFRETE");
   }

   public void setPisStPropFrete(String pisStPropFrete) {
        markAsChanged("PISSTPROPFRETE", pisStPropFrete);
   }

   public String getPisStPropJuro() {
        return this.getVo().asString("PISSTPROPJURO");
   }

   public void setPisStPropJuro(String pisStPropJuro) {
        markAsChanged("PISSTPROPJURO", pisStPropJuro);
   }

   public String getPisStPropSeg() {
        return this.getVo().asString("PISSTPROPSEG");
   }

   public void setPisStPropSeg(String pisStPropSeg) {
        markAsChanged("PISSTPROPSEG", pisStPropSeg);
   }

   public String getPodeAjustarOrigProdWms() {
        return this.getVo().asString("PODEAJUSTARORIGPRODWMS");
   }

   public void setPodeAjustarOrigProdWms(String podeAjustarOrigProdWms) {
        markAsChanged("PODEAJUSTARORIGPRODWMS", podeAjustarOrigProdWms);
   }

   public String getPodeFixar() {
        return this.getVo().asString("PODEFIXAR");
   }

   public void setPodeFixar(String podeFixar) {
        markAsChanged("PODEFIXAR", podeFixar);
   }

   public String getPodePesagem() {
        return this.getVo().asString("PODEPESAGEM");
   }

   public void setPodePesagem(String podePesagem) {
        markAsChanged("PODEPESAGEM", podePesagem);
   }

   public String getPodeTransfEnt() {
        return this.getVo().asString("PODETRANSFENT");
   }

   public void setPodeTransfEnt(String podeTransfEnt) {
        markAsChanged("PODETRANSFENT", podeTransfEnt);
   }

   public String getPrecifica() {
        return this.getVo().asString("PRECIFICA");
   }

   public void setPrecifica(String precifica) {
        markAsChanged("PRECIFICA", precifica);
   }

   public String getProdRep() {
        return this.getVo().asString("PRODREP");
   }

   public void setProdRep(String prodRep) {
        markAsChanged("PRODREP", prodRep);
   }

   public String getProvisEntrega() {
        return this.getVo().asString("PROVISENTREGA");
   }

   public void setProvisEntrega(String provisEntrega) {
        markAsChanged("PROVISENTREGA", provisEntrega);
   }

   public String getRatAutProd() {
        return this.getVo().asString("RATAUTPROD");
   }

   public void setRatAutProd(String ratAutProd) {
        markAsChanged("RATAUTPROD", ratAutProd);
   }

   public String getRefNfe() {
        return this.getVo().asString("REFNFE");
   }

   public void setRefNfe(String refNfe) {
        markAsChanged("REFNFE", refNfe);
   }

   public String getSepBalcao() {
        return this.getVo().asString("SEPBALCAO");
   }

   public void setSepBalcao(String sepBalcao) {
        markAsChanged("SEPBALCAO", sepBalcao);
   }

   public String getSolCompra() {
        return this.getVo().asString("SOLCOMPRA");
   }

   public void setSolCompra(String solCompra) {
        markAsChanged("SOLCOMPRA", solCompra);
   }

   public String getSomarCofinsSt() {
        return this.getVo().asString("SOMARCOFINSST");
   }

   public void setSomarCofinsSt(String somarCofinsSt) {
        markAsChanged("SOMARCOFINSST", somarCofinsSt);
   }

   public String getSomarIpi() {
        return this.getVo().asString("SOMARIPI");
   }

   public void setSomarIpi(String somarIpi) {
        markAsChanged("SOMARIPI", somarIpi);
   }

   public String getSomarPisSt() {
        return this.getVo().asString("SOMARPISST");
   }

   public void setSomarPisSt(String somarPisSt) {
        markAsChanged("SOMARPISST", somarPisSt);
   }

   public String getSomarSubst() {
        return this.getVo().asString("SOMASUBST");
   }

   public void setSomarSubst(String somarSubst) {
        markAsChanged("SOMASUBST", somarSubst);
   }

   public String getStatusBaixaEst() {
        return this.getVo().asString("STATUSBAIXAEST");
   }

   public void setStatusBaixaEst(String statusBaixaEst) {
        markAsChanged("STATUSBAIXAEST", statusBaixaEst);
   }

   public String getStatusLote() {
        return this.getVo().asString("STATUSLOTE");
   }

   public void setStatusLote(String statusLote) {
        markAsChanged("STATUSLOTE", statusLote);
   }

   public String getStPropDestaque() {
        return this.getVo().asString("STPROPDESTAQUE");
   }

   public void setStPropDestaque(String stPropDestaque) {
        markAsChanged("STPROPDESTAQUE", stPropDestaque);
   }

   public String getStPropEmbalagem() {
        return this.getVo().asString("STPROPEMBALAGEM");
   }

   public void setStPropEmbalagem(String stPropEmbalagem) {
        markAsChanged("STPROPEMBALAGEM", stPropEmbalagem);
   }

   public String getStPropFrete() {
        return this.getVo().asString("STPROPFRETE");
   }

   public void setStPropFrete(String stPropFrete) {
        markAsChanged("STPROPFRETE", stPropFrete);
   }

   public String getStPropFreteExt() {
        return this.getVo().asString("STPROPFRETEEXT");
   }

   public void setStPropFreteExt(String stPropFreteExt) {
        markAsChanged("STPROPFRETEEXT", stPropFreteExt);
   }

   public String getStPropJuro() {
        return this.getVo().asString("STPROPJURO");
   }

   public void setStPropJuro(String stPropJuro) {
        markAsChanged("STPROPJURO", stPropJuro);
   }

   public String getStPropSeg() {
        return this.getVo().asString("STPROPSEG");
   }

   public void setStPropSeg(String stPropSeg) {
        markAsChanged("STPROPSEG", stPropSeg);
   }

   public String getSugereLocalParc() {
        return this.getVo().asString("SUGERELOCALPARC");
   }

   public void setSugereLocalParc(String sugereLocalParc) {
        markAsChanged("SUGERELOCALPARC", sugereLocalParc);
   }

   public String getTemCofins() {
        return this.getVo().asString("TEMCOFINS");
   }

   public void setTemCofins(String temCofins) {
        markAsChanged("TEMCOFINS", temCofins);
   }

   public String getTemCsl() {
        return this.getVo().asString("TEMCSL");
   }

   public void setTemCsl(String temCsl) {
        markAsChanged("TEMCSL", temCsl);
   }

   public String getTemFinOrigem() {
        return this.getVo().asString("TEMFINORIGEM");
   }

   public void setTemFinOrigem(String temFinOrigem) {
        markAsChanged("TEMFINORIGEM", temFinOrigem);
   }

   public String getTemFunRural() {
        return this.getVo().asString("TEMFUNRURAL");
   }

   public void setTemFunRural(String temFunRural) {
        markAsChanged("TEMFUNRURAL", temFunRural);
   }

   public String getTemIcms() {
        return this.getVo().asString("TEMICMS");
   }

   public void setTemIcms(String temIcms) {
        markAsChanged("TEMICMS", temIcms);
   }

   public String getTemIi() {
        return this.getVo().asString("TEMII");
   }

   public void setTemIi(String temIi) {
        markAsChanged("TEMII", temIi);
   }

   public String getTemIndex() {
        return this.getVo().asString("TEMINDEX");
   }

   public void setTemIndex(String temIndex) {
        markAsChanged("TEMINDEX", temIndex);
   }

   public String getTemIpi() {
        return this.getVo().asString("TEMIPI");
   }

   public void setTemIpi(String temIpi) {
        markAsChanged("TEMIPI", temIpi);
   }

   public String getTemIrf() {
        return this.getVo().asString("TEMIRF");
   }

   public void setTemIrf(String temIrf) {
        markAsChanged("TEMIRF", temIrf);
   }

   public String getTemIss() {
        return this.getVo().asString("TEMISS");
   }

   public void setTemIss(String temIss) {
        markAsChanged("TEMISS", temIss);
   }

   public String getTemPis() {
        return this.getVo().asString("TEMPIS");
   }

   public void setTemPis(String temPis) {
        markAsChanged("TEMPIS", temPis);
   }

   public String getTemReaIcms() {
        return this.getVo().asString("TEMREAICMS");
   }

   public void setTemReaIcms(String temReaIcms) {
        markAsChanged("TEMREAICMS", temReaIcms);
   }

   public String getTemVavtcOn() {
        return this.getVo().asString("TEMVAVTCON");
   }

   public void setTemVavtcOn(String temVavtcOn) {
        markAsChanged("TEMVAVTCON", temVavtcOn);
   }

   public String getTipAltDtVenc() {
        return this.getVo().asString("TIPALTDTVENC");
   }

   public void setTipAltDtVenc(String tipAltDtVenc) {
        markAsChanged("TIPALTDTVENC", tipAltDtVenc);
   }

   public String getTipAtualFin() {
        return this.getVo().asString("TIPATUALFIN");
   }

   public void setTipAtualFin(String tipAtualFin) {
        markAsChanged("TIPATUALFIN", tipAtualFin);
   }

   public String getTipAtualWms() {
        return this.getVo().asString("TIPATUALWMS");
   }

   public void setTipAtualWms(String tipAtualWms) {
        markAsChanged("TIPATUALWMS", tipAtualWms);
   }

   public String getTipFatServ() {
        return this.getVo().asString("TIPFATSERV");
   }

   public void setTipFatServ(String tipFatServ) {
        markAsChanged("TIPFATSERV", tipFatServ);
   }

   public String getTipIcms() {
        return this.getVo().asString("TIPICMS");
   }

   public void setTipIcms(String tipIcms) {
        markAsChanged("TIPICMS", tipIcms);
   }

   public String getTipIpi() {
        return this.getVo().asString("TIPIPI");
   }

   public void setTipIpi(String tipIpi) {
        markAsChanged("TIPIPI", tipIpi);
   }

   public String getTipIvaSubst() {
        return this.getVo().asString("TIPIVASUBST");
   }

   public void setTipIvaSubst(String tipIvaSubst) {
        markAsChanged("TIPIVASUBST", tipIvaSubst);
   }

   public String getTipMov() {
        return this.getVo().asString("TIPMOV");
   }

   public void setTipMov(String tipMov) {
        markAsChanged("TIPMOV", tipMov);
   }

   public String getTipMovBemSped() {
        return this.getVo().asString("TIPMOVBEMSPED");
   }

   public void setTipMovBemSped(String tipMovBemSped) {
        markAsChanged("TIPMOVBEMSPED", tipMovBemSped);
   }

   public String getTipoImpKit() {
        return this.getVo().asString("TIPOIMPKIT");
   }

   public void setTipoImpKit(String tipoImpKit) {
        markAsChanged("TIPOIMPKIT", tipoImpKit);
   }

   public String getTipoNumeracao() {
        return this.getVo().asString("TIPONUMERACAO");
   }

   public void setTipoNumeracao(String tipoNumeracao) {
        markAsChanged("TIPONUMERACAO", tipoNumeracao);
   }

   public BigDecimal getVlrBasePgto() {
        return this.getVo().asBigDecimal("VLRBASEPGTO");
   }

   public void setVlrBasePgto(BigDecimal vlrBasePgto) {
        markAsChanged("VLRBASEPGTO", vlrBasePgto);
   }

   public BigDecimal getVlrMinAp() {
        return this.getVo().asBigDecimal("VLRMINAP");
   }

   public void setVlrMinAp(BigDecimal vlrMinAp) {
        markAsChanged("VLRMINAP", vlrMinAp);
   }

   public String getIpiEmbut() {
        return this.getVo().asString("IPIEMBUT");
   }

   public void setIpiEmbut(String ipiEmbut) {
        markAsChanged("IPIEMBUT", ipiEmbut);
   }

   public String getIpiIncIcms() {
        return this.getVo().asString("IPIINCICMS");
   }

   public void setIpiIncIcms(String ipiIncIcms) {
        markAsChanged("IPIINCICMS", ipiIncIcms);
   }

   public String getIpiPropDestaque() {
        return this.getVo().asString("IPIPROPDESTAQUE");
   }

   public void setIpiPropDestaque(String ipiPropDestaque) {
        markAsChanged("IPIPROPDESTAQUE", ipiPropDestaque);
   }

   public String getIpiPropEmbalagem() {
        return this.getVo().asString("IPIPROPEMBALAGEM");
   }

   public void setIpiPropEmbalagem(String ipiPropEmbalagem) {
        markAsChanged("IPIPROPEMBALAGEM", ipiPropEmbalagem);
   }

   public String getIpiPropFrete() {
        return this.getVo().asString("IPIPROPFRETE");
   }

   public void setIpiPropFrete(String ipiPropFrete) {
        markAsChanged("IPIPROPFRETE", ipiPropFrete);
   }

   public String getIpiPropJuro() {
        return this.getVo().asString("IPIPROPJURO");
   }

   public void setIpiPropJuro(String ipiPropJuro) {
        markAsChanged("IPIPROPJURO", ipiPropJuro);
   }

   public String getIpiPropSeg() {
        return this.getVo().asString("IPIPROPSEG");
   }

   public void setIpiPropSeg(String ipiPropSeg) {
        markAsChanged("IPIPROPSEG", ipiPropSeg);
   }

   public String getLaudoItem() {
        return this.getVo().asString("LAUDOITEM");
   }

   public void setLaudoItem(String laudoItem) {
        markAsChanged("LAUDOITEM", laudoItem);
   }

   public String getGerar1400Sped() {
        return this.getVo().asString("GERAR1400SPED");
   }

   public void setGerar1400Sped(String gerar1400Sped) {
        markAsChanged("GERAR1400SPED", gerar1400Sped);
   }

   public String getUsaAliqNatRatF100() {
        return this.getVo().asString("USAALIQNATRATF100");
   }

   public void setUsaAliqNatRatF100(String usaAliqNatRatF100) {
        markAsChanged("USAALIQNATRATF100", usaAliqNatRatF100);
   }

   public String getValNum() {
        return this.getVo().asString("VALNUM");
   }

   public void setValNum(String valNum) {
        markAsChanged("VALNUM", valNum);
   }

   public String getImpNaoConf() {
        return this.getVo().asString("IMPNAOCONF");
   }

   public void setImpNaoConf(String impNaoConf) {
        markAsChanged("IMPNAOCONF", impNaoConf);
   }

   public String getImpNotaAdicional() {
        return this.getVo().asString("IMPNOTAADICIONAL");
   }

   public void setImpNotaAdicional(String impNotaAdicional) {
        markAsChanged("IMPNOTAADICIONAL", impNotaAdicional);
   }

   public BigDecimal getCodRemEdi() {
        return this.getVo().asBigDecimal("CODREMEDI");
   }

   public void setCodRemEdi(BigDecimal codRemEdi) {
        markAsChanged("CODREMEDI", codRemEdi);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public BigDecimal getCodTipOperDeneg() {
        return this.getVo().asBigDecimal("CODTIPOPERDENEG");
   }

   public void setCodTipOperDeneg(BigDecimal codTipOperDeneg) {
        markAsChanged("CODTIPOPERDENEG", codTipOperDeneg);
   }

   public BigDecimal getCodTipOperDestino() {
        return this.getVo().asBigDecimal("CODTIPOPERDESTINO");
   }

   public void setCodTipOperDestino(BigDecimal codTipOperDestino) {
        markAsChanged("CODTIPOPERDESTINO", codTipOperDestino);
   }

   public BigDecimal getCodTipOperPenRet() {
        return this.getVo().asBigDecimal("CODTIPOPERPENRET");
   }

   public void setCodTipOperPenRet(BigDecimal codTipOperPenRet) {
        markAsChanged("CODTIPOPERPENRET", codTipOperPenRet);
   }

   public BigDecimal getCodTipOperRem() {
        return this.getVo().asBigDecimal("CODTIPOPERREM");
   }

   public void setCodTipOperRem(BigDecimal codTipOperRem) {
        markAsChanged("CODTIPOPERREM", codTipOperRem);
   }

   public BigDecimal getCodTipOperSeparacao() {
        return this.getVo().asBigDecimal("CODTIPOPERSEPARACAO");
   }

   public void setCodTipOperSeparacao(BigDecimal codTipOperSeparacao) {
        markAsChanged("CODTIPOPERSEPARACAO", codTipOperSeparacao);
   }

   public BigDecimal getCodTrib() {
        return this.getVo().asBigDecimal("CODTRIB");
   }

   public void setCodTrib(BigDecimal codTrib) {
        markAsChanged("CODTRIB", codTrib);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getCofinsPropDestaque() {
        return this.getVo().asString("COFINSPROPDESTAQUE");
   }

   public void setCofinsPropDestaque(String cofinsPropDestaque) {
        markAsChanged("COFINSPROPDESTAQUE", cofinsPropDestaque);
   }

   public String getCofinsPropEmbalagem() {
        return this.getVo().asString("COFINSPROPEMBALAGEM");
   }

   public void setCofinsPropEmbalagem(String cofinsPropEmbalagem) {
        markAsChanged("COFINSPROPEMBALAGEM", cofinsPropEmbalagem);
   }

   public String getCofinsPropFrete() {
        return this.getVo().asString("COFINSPROPFRETE");
   }

   public void setCofinsPropFrete(String cofinsPropFrete) {
        markAsChanged("COFINSPROPFRETE", cofinsPropFrete);
   }

   public String getCofinsPropJuro() {
        return this.getVo().asString("COFINSPROPJURO");
   }

   public void setCofinsPropJuro(String cofinsPropJuro) {
        markAsChanged("COFINSPROPJURO", cofinsPropJuro);
   }

   public String getCofinsPropSeg() {
        return this.getVo().asString("COFINSPROPSEG");
   }

   public void setCofinsPropSeg(String cofinsPropSeg) {
        markAsChanged("COFINSPROPSEG", cofinsPropSeg);
   }

   public String getCofinsStPropDestaque() {
        return this.getVo().asString("COFINSSTPROPDESTAQUE");
   }

   public void setCofinsStPropDestaque(String cofinsStPropDestaque) {
        markAsChanged("COFINSSTPROPDESTAQUE", cofinsStPropDestaque);
   }

   public String getCofinsStPropEmbalagem() {
        return this.getVo().asString("COFINSSTPROPEMBALAGEM");
   }

   public void setCofinsStPropEmbalagem(String cofinsStPropEmbalagem) {
        markAsChanged("COFINSSTPROPEMBALAGEM", cofinsStPropEmbalagem);
   }

   public String getCofinsStPropFrete() {
        return this.getVo().asString("COFINSSTPROPFRETE");
   }

   public void setCofinsStPropFrete(String cofinsStPropFrete) {
        markAsChanged("COFINSSTPROPFRETE", cofinsStPropFrete);
   }

   public String getCofinsStPropJuro() {
        return this.getVo().asString("COFINSSTPROPJURO");
   }

   public void setCofinsStPropJuro(String cofinsStPropJuro) {
        markAsChanged("COFINSSTPROPJURO", cofinsStPropJuro);
   }

   public String getCofinsStPropSeg() {
        return this.getVo().asString("COFINSSTPROPSEG");
   }

   public void setCofinsStPropSeg(String cofinsStPropSeg) {
        markAsChanged("COFINSSTPROPSEG", cofinsStPropSeg);
   }

   public String getComplemento() {
        return this.getVo().asString("COMPLEMENTO");
   }

   public void setComplemento(String complemento) {
        markAsChanged("COMPLEMENTO", complemento);
   }

   public String getConfCfop() {
        return this.getVo().asString("CONFCFOP");
   }

   public void setConfCfop(String confCfop) {
        markAsChanged("CONFCFOP", confCfop);
   }

   public String getConfImposto() {
        return this.getVo().asString("CONFIMPOSTO");
   }

   public void setConfImposto(String confImposto) {
        markAsChanged("CONFIMPOSTO", confImposto);
   }

   public String getConsignacao() {
        return this.getVo().asString("CONSIGNACAO");
   }

   public void setConsignacao(String consignacao) {
        markAsChanged("CONSIGNACAO", consignacao);
   }

   public String getContLaudoSint() {
        return this.getVo().asString("CONTLAUDOSINT");
   }

   public void setContLaudoSint(String contLaudoSint) {
        markAsChanged("CONTLAUDOSINT", contLaudoSint);
   }

   public String getCopiaDtPrevOrig() {
        return this.getVo().asString("COPIADTPREVORIG");
   }

   public void setCopiaDtPrevOrig(String copiaDtPrevOrig) {
        markAsChanged("COPIADTPREVORIG", copiaDtPrevOrig);
   }

   public String getCopiarLiber() {
        return this.getVo().asString("COPIARLIBER");
   }

   public void setCopiarLiber(String copiarLiber) {
        markAsChanged("COPIARLIBER", copiarLiber);
   }

   public BigDecimal getCstIpiEnt() {
        return this.getVo().asBigDecimal("CSTIPIENT");
   }

   public void setCstIpiEnt(BigDecimal cstIpiEnt) {
        markAsChanged("CSTIPIENT", cstIpiEnt);
   }

   public BigDecimal getCstIpiSai() {
        return this.getVo().asBigDecimal("CSTIPISAI");
   }

   public void setCstIpiSai(BigDecimal cstIpiSai) {
        markAsChanged("CSTIPISAI", cstIpiSai);
   }

   public BigDecimal getCodModDad() {
        return this.getVo().asBigDecimal("CODMODDAD");
   }

   public void setCodModDad(BigDecimal codModDad) {
        markAsChanged("CODMODDAD", codModDad);
   }

   public BigDecimal getCodModDoc() {
        return this.getVo().asBigDecimal("CODMODDOC");
   }

   public void setCodModDoc(BigDecimal codModDoc) {
        markAsChanged("CODMODDOC", codModDoc);
   }

   public String getCodModDocIss() {
        return this.getVo().asString("CODMODDOCISS");
   }

   public void setCodModDocIss(String codModDocIss) {
        markAsChanged("CODMODDOCISS", codModDocIss);
   }

   public BigDecimal getCodModNf() {
        return this.getVo().asBigDecimal("CODMODNF");
   }

   public void setCodModNf(BigDecimal codModNf) {
        markAsChanged("CODMODNF", codModNf);
   }

   public String getIcmsPropJuro() {
        return this.getVo().asString("ICMSPROPJURO");
   }

   public void setIcmsPropJuro(String icmsPropJuro) {
        markAsChanged("ICMSPROPJURO", icmsPropJuro);
   }

   public String getIcmsPropSeg() {
        return this.getVo().asString("ICMSPROPSEG");
   }

   public void setIcmsPropSeg(String icmsPropSeg) {
        markAsChanged("ICMSPROPSEG", icmsPropSeg);
   }

   public String getCupomFiscal() {
        return this.getVo().asString("CUPOMFISCAL");
   }

   public void setCupomFiscal(String cupomFiscal) {
        markAsChanged("CUPOMFISCAL", cupomFiscal);
   }

   public String getDentroEstado() {
        return this.getVo().asString("DENTROESTADO");
   }

   public void setDentroEstado(String dentroEstado) {
        markAsChanged("DENTROESTADO", dentroEstado);
   }

   public String getDescROper() {
        return this.getVo().asString("DESCROPER");
   }

   public void setDescROper(String descROper) {
        markAsChanged("DESCROPER", descROper);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public String getDigInfImporta() {
        return this.getVo().asString("DIGINFIMPORTA");
   }

   public void setDigInfImporta(String digInfImporta) {
        markAsChanged("DIGINFIMPORTA", digInfImporta);
   }

   public String getDigPureza() {
        return this.getVo().asString("DIGPUREZA");
   }

   public void setDigPureza(String digPureza) {
        markAsChanged("DIGPUREZA", digPureza);
   }

   public String getEditaAnaliseRentab() {
        return this.getVo().asString("EDITANALISERENTAB");
   }

   public void setEditaAnaliseRentab(String editaAnaliseRentab) {
        markAsChanged("EDITANALISERENTAB", editaAnaliseRentab);
   }

   public String getEmiteBoleta() {
        return this.getVo().asString("EMITEBOLETA");
   }

   public void setEmiteBoleta(String emiteBoleta) {
        markAsChanged("EMITEBOLETA", emiteBoleta);
   }

   public String getEmiteNota() {
        return this.getVo().asString("EMITENOTA");
   }

   public void setEmiteNota(String emiteNota) {
        markAsChanged("EMITENOTA", emiteNota);
   }

   public String getEmpFuncDif() {
        return this.getVo().asString("EMPFUNCDIF");
   }

   public void setEmpFuncDif(String empFuncDif) {
        markAsChanged("EMPFUNCDIF", empFuncDif);
   }

   public String getEnviarWmsConf() {
        return this.getVo().asString("ENVIARWMSCONF");
   }

   public void setEnviarWmsConf(String enviarWmsConf) {
        markAsChanged("ENVIARWMSCONF", enviarWmsConf);
   }

   public String getEnvWmsConfirmada() {
        return this.getVo().asString("ENVWMSCONFIRMADA");
   }

   public void setEnvWmsConfirmada(String envWmsConfirmada) {
        markAsChanged("ENVWMSCONFIRMADA", envWmsConfirmada);
   }

   public String getExecIte() {
        return this.getVo().asString("EXECITE");
   }

   public void setExecIte(String execIte) {
        markAsChanged("EXECITE", execIte);
   }

   public String getExigeAnalItens() {
        return this.getVo().asString("EXIGANALITENS");
   }

   public void setExigeAnalItens(String exigeAnalItens) {
        markAsChanged("EXIGANALITENS", exigeAnalItens);
   }

   public String getExigeAgendaWms() {
        return this.getVo().asString("EXIGEAGENDAWMS");
   }

   public void setExigeAgendaWms(String exigeAgendaWms) {
        markAsChanged("EXIGEAGENDAWMS", exigeAgendaWms);
   }

   public String getExigeConf() {
        return this.getVo().asString("EXIGECONF");
   }

   public void setExigeConf(String exigeConf) {
        markAsChanged("EXIGECONF", exigeConf);
   }

   public String getExigeCotacao() {
        return this.getVo().asString("EXIGECOTACAO");
   }

   public void setExigeCotacao(String exigeCotacao) {
        markAsChanged("EXIGECOTACAO", exigeCotacao);
   }

   public String getExigeDtVal() {
        return this.getVo().asString("EXIGEDTVAL");
   }

   public void setExigeDtVal(String exigeDtVal) {
        markAsChanged("EXIGEDTVAL", exigeDtVal);
   }

   public String getExigeGar() {
        return this.getVo().asString("EXIGEGAR");
   }

   public void setExigeGar(String exigeGar) {
        markAsChanged("EXIGEGAR", exigeGar);
   }

   public String getExigeLaudo() {
        return this.getVo().asString("EXIGELAUDO");
   }

   public void setExigeLaudo(String exigeLaudo) {
        markAsChanged("EXIGELAUDO", exigeLaudo);
   }

   public String getExigeLib() {
        return this.getVo().asString("EXIGELIB");
   }

   public void setExigeLib(String exigeLib) {
        markAsChanged("EXIGELIB", exigeLib);
   }

   public String getExigeLibSempre() {
        return this.getVo().asString("EXIGELIBSEMPRE");
   }

   public void setExigeLibSempre(String exigeLibSempre) {
        markAsChanged("EXIGELIBSEMPRE", exigeLibSempre);
   }

   public String getExigePedFret() {
        return this.getVo().asString("EXIGEPEDFRET");
   }

   public void setExigePedFret(String exigePedFret) {
        markAsChanged("EXIGEPEDFRET", exigePedFret);
   }

   public String getExigeTransp() {
        return this.getVo().asString("EXIGETRANSP");
   }

   public void setExigeTransp(String exigeTransp) {
        markAsChanged("EXIGETRANSP", exigeTransp);
   }

   public BigDecimal getExpGrs() {
        return this.getVo().asBigDecimal("EXPGRS");
   }

   public void setExpGrs(BigDecimal expGrs) {
        markAsChanged("EXPGRS", expGrs);
   }

   public String getExporta() {
        return this.getVo().asString("EXPORTA");
   }

   public void setExporta(String exporta) {
        markAsChanged("EXPORTA", exporta);
   }

   public String getExpTes() {
        return this.getVo().asString("EXPTES");
   }

   public void setExpTes(String expTes) {
        markAsChanged("EXPTES", expTes);
   }

   public String getFatContPorPeso() {
        return this.getVo().asString("FATCONTPORPESO");
   }

   public void setFatContPorPeso(String fatContPorPeso) {
        markAsChanged("FATCONTPORPESO", fatContPorPeso);
   }

   public String getFatEntProd() {
        return this.getVo().asString("FATENTPROD");
   }

   public void setFatEntProd(String fatEntProd) {
        markAsChanged("FATENTPROD", fatEntProd);
   }

   public String getFatEstConf() {
        return this.getVo().asString("FATESTCONF");
   }

   public void setFatEstConf(String fatEstConf) {
        markAsChanged("FATESTCONF", fatEstConf);
   }

   public String getGeraAmostraLaudo() {
        return this.getVo().asString("GERAAMOSTRALAUDO");
   }

   public void setGeraAmostraLaudo(String geraAmostraLaudo) {
        markAsChanged("GERAAMOSTRALAUDO", geraAmostraLaudo);
   }

   public String getGeraBonPre() {
        return this.getVo().asString("GERABONPRE");
   }

   public void setGeraBonPre(String geraBonPre) {
        markAsChanged("GERABONPRE", geraBonPre);
   }

   public String getGeraGnre() {
        return this.getVo().asString("GERAGNRE");
   }

   public void setGeraGnre(String geraGnre) {
        markAsChanged("GERAGNRE", geraGnre);
   }

   public String getGeraPlanProd() {
        return this.getVo().asString("GERAPLANPROD");
   }

   public void setGeraPlanProd(String geraPlanProd) {
        markAsChanged("GERAPLANPROD", geraPlanProd);
   }

   public String getGeraRParcDest() {
        return this.getVo().asString("GERARPARCDEST");
   }

   public void setGeraRParcDest(String geraRParcDest) {
        markAsChanged("GERARPARCDEST", geraRParcDest);
   }

   public String getGeraRTagJNfe() {
        return this.getVo().asString("GERARTAGJNFE");
   }

   public void setGeraRTagJNfe(String geraRTagJNfe) {
        markAsChanged("GERARTAGJNFE", geraRTagJNfe);
   }

   public BigDecimal getGolDev() {
        return this.getVo().asBigDecimal("GOLDEV");
   }

   public void setGolDev(BigDecimal golDev) {
        markAsChanged("GOLDEV", golDev);
   }

   public BigDecimal getGolMpSinal() {
        return this.getVo().asBigDecimal("GOLMPSINAL");
   }

   public void setGolMpSinal(BigDecimal golMpSinal) {
        markAsChanged("GOLMPSINAL", golMpSinal);
   }

   public BigDecimal getGolSinal() {
        return this.getVo().asBigDecimal("GOLSINAL");
   }

   public void setGolSinal(BigDecimal golSinal) {
        markAsChanged("GOLSINAL", golSinal);
   }

   public String getGraHisAltPed() {
        return this.getVo().asString("GRAHISALTPED");
   }

   public void setGraHisAltPed(String graHisAltPed) {
        markAsChanged("GRAHISALTPED", graHisAltPed);
   }

   public String getGrupo() {
        return this.getVo().asString("GRUPO");
   }

   public void setGrupo(String grupo) {
        markAsChanged("GRUPO", grupo);
   }

   public String getIcmsPropDestaque() {
        return this.getVo().asString("ICMSPROPDESTAQUE");
   }

   public void setIcmsPropDestaque(String icmsPropDestaque) {
        markAsChanged("ICMSPROPDESTAQUE", icmsPropDestaque);
   }

   public String getIcmsPropEmbalagem() {
        return this.getVo().asString("ICMSPROPEMBALAGEM");
   }

   public void setIcmsPropEmbalagem(String icmsPropEmbalagem) {
        markAsChanged("ICMSPROPEMBALAGEM", icmsPropEmbalagem);
   }

   public String getIcmsPropFrete() {
        return this.getVo().asString("ICMSPROPFRETE");
   }

   public void setIcmsPropFrete(String icmsPropFrete) {
        markAsChanged("ICMSPROPFRETE", icmsPropFrete);
   }

   public String getFatForaPlanEnt() {
        return this.getVo().asString("FATFORAPLANENT");
   }

   public void setFatForaPlanEnt(String fatForaPlanEnt) {
        markAsChanged("FATFORAPLANENT", fatForaPlanEnt);
   }

   public String getGeraEndEntrNfe() {
        return this.getVo().asString("GERAENDENTRNFE");
   }

   public void setGeraEndEntrNfe(String geraEndEntrNfe) {
        markAsChanged("GERAENDENTRNFE", geraEndEntrNfe);
   }

   public String getExigeConfirmacaoMde() {
        return this.getVo().asString("EXIGECONFIRMACAOMDE");
   }

   public void setExigeConfirmacaoMde(String exigeConfirmacaoMde) {
        markAsChanged("EXIGECONFIRMACAOMDE", exigeConfirmacaoMde);
   }

   public BigDecimal getCodModCfecanc() {
        return this.getVo().asBigDecimal("CODMODCFECANC");
   }

   public void setCodModCfecanc(BigDecimal codModCfecanc) {
        markAsChanged("CODMODCFECANC", codModCfecanc);
   }

   public String getConstOpApurSimp() {
        return this.getVo().asString("CONSTOPAPURSIMP");
   }

   public void setConstOpApurSimp(String constOpApurSimp) {
        markAsChanged("CONSTOPAPURSIMP", constOpApurSimp);
   }

   public String getGerInfoEfdPag() {
        return this.getVo().asString("GERINFOEFDPAG");
   }

   public void setGerInfoEfdPag(String gerInfoEfdPag) {
        markAsChanged("GERINFOEFDPAG", gerInfoEfdPag);
   }

   public String getIgnExpAutLot() {
        return this.getVo().asString("IGNEXPAUTLOT");
   }

   public void setIgnExpAutLot(String ignExpAutLot) {
        markAsChanged("IGNEXPAUTLOT", ignExpAutLot);
   }

   public String getNumProcesso() {
        return this.getVo().asString("NUMPROCESSO");
   }

   public void setNumProcesso(String numProcesso) {
        markAsChanged("NUMPROCESSO", numProcesso);
   }

   public String getPermDestVbatPrebCus() {
        return this.getVo().asString("PERMDESTVBATPREBCUS");
   }

   public void setPermDestVbatPrebCus(String permDestVbatPrebCus) {
        markAsChanged("PERMDESTVBATPREBCUS", permDestVbatPrebCus);
   }

   public String getRedStbCpIsCofins() {
        return this.getVo().asString("REDSTBCPISCOFINS");
   }

   public void setRedStbCpIsCofins(String redStbCpIsCofins) {
        markAsChanged("REDSTBCPISCOFINS", redStbCpIsCofins);
   }

   public String getUsaTabAltEmp() {
        return this.getVo().asString("USATABALTEMP");
   }

   public void setUsaTabAltEmp(String usaTabAltEmp) {
        markAsChanged("USATABALTEMP", usaTabAltEmp);
   }

   public BigDecimal getCodEnqIpiSai() {
        return this.getVo().asBigDecimal("CODENQIPISAI");
   }

   public void setCodEnqIpiSai(BigDecimal codEnqIpiSai) {
        markAsChanged("CODENQIPISAI", codEnqIpiSai);
   }

   public BigDecimal getCodEnqIpiEnt() {
        return this.getVo().asBigDecimal("CODENQIPIENT");
   }

   public void setCodEnqIpiEnt(BigDecimal codEnqIpiEnt) {
        markAsChanged("CODENQIPIENT", codEnqIpiEnt);
   }

   public String getPermFinMenorVlrNota() {
        return this.getVo().asString("PERMFINMENORVLRNOTA");
   }

   public void setPermFinMenorVlrNota(String permFinMenorVlrNota) {
        markAsChanged("PERMFINMENORVLRNOTA", permFinMenorVlrNota);
   }

   public String getProdUetLoc() {
        return this.getVo().asString("PRODUETLOC");
   }

   public void setProdUetLoc(String prodUetLoc) {
        markAsChanged("PRODUETLOC", prodUetLoc);
   }

   public BigDecimal getPercMinBaseInss() {
        return this.getVo().asBigDecimal("PERCMINBASEINSS");
   }

   public void setPercMinBaseInss(BigDecimal percMinBaseInss) {
        markAsChanged("PERCMINBASEINSS", percMinBaseInss);
   }

   public String getAjustaVp() {
        return this.getVo().asString("AJUSTAVP");
   }

   public void setAjustaVp(String ajustaVp) {
        markAsChanged("AJUSTAVP", ajustaVp);
   }

   public BigDecimal getCodMoedaVp() {
        return this.getVo().asBigDecimal("CODMOEDAVP");
   }

   public void setCodMoedaVp(BigDecimal codMoedaVp) {
        markAsChanged("CODMOEDAVP", codMoedaVp);
   }

   public String getIndPresNfce() {
        return this.getVo().asString("INDPRESNFCE");
   }

   public void setIndPresNfce(String indPresNfce) {
        markAsChanged("INDPRESNFCE", indPresNfce);
   }

   public BigDecimal getTopAtendimento() {
        return this.getVo().asBigDecimal("TOPATENDIMENTO");
   }

   public void setTopAtendimento(BigDecimal topAtendimento) {
        markAsChanged("TOPATENDIMENTO", topAtendimento);
   }

   public BigDecimal getTopBackOrder() {
        return this.getVo().asBigDecimal("TOPBACKORDER");
   }

   public void setTopBackOrder(BigDecimal topBackOrder) {
        markAsChanged("TOPBACKORDER", topBackOrder);
   }

   public String getIndNatFrt() {
        return this.getVo().asString("INDNATFRT");
   }

   public void setIndNatFrt(String indNatFrt) {
        markAsChanged("INDNATFRT", indNatFrt);
   }

   public String getInfContrato() {
        return this.getVo().asString("INFCONTRATO");
   }

   public void setInfContrato(String infContrato) {
        markAsChanged("INFCONTRATO", infContrato);
   }

   public String getIntegraEvento() {
        return this.getVo().asString("INTEGRAEVENTO");
   }

   public void setIntegraEvento(String integraEvento) {
        markAsChanged("INTEGRAEVENTO", integraEvento);
   }

   public String getValTotNotaGerLiv() {
        return this.getVo().asString("VALTOTNOTAGERLIV");
   }

   public void setValTotNotaGerLiv(String valTotNotaGerLiv) {
        markAsChanged("VALTOTNOTAGERLIV", valTotNotaGerLiv);
   }

   public String getOperComMoeda() {
        return this.getVo().asString("OPERCOMMOEDA");
   }

   public void setOperComMoeda(String operComMoeda) {
        markAsChanged("OPERCOMMOEDA", operComMoeda);
   }

   public BigDecimal getPercTolVarVlrUnit() {
        return this.getVo().asBigDecimal("PERCTOLVARVLRUNIT");
   }

   public void setPercTolVarVlrUnit(BigDecimal percTolVarVlrUnit) {
        markAsChanged("PERCTOLVARVLRUNIT", percTolVarVlrUnit);
   }

   public BigDecimal getCat1799SpcCo() {
        return this.getVo().asBigDecimal("CAT1799SPCCO");
   }

   public void setCat1799SpcCo(BigDecimal cat1799SpcCo) {
        markAsChanged("CAT1799SPCCO", cat1799SpcCo);
   }

   public String getCte() {
        return this.getVo().asString("CTE");
   }

   public void setCte(String cte) {
        markAsChanged("CTE", cte);
   }

   public BigDecimal getTipServCte() {
        return this.getVo().asBigDecimal("TIPSERVCTE");
   }

   public void setTipServCte(BigDecimal tipServCte) {
        markAsChanged("TIPSERVCTE", tipServCte);
   }

   public BigDecimal getCodTopDenegCte() {
        return this.getVo().asBigDecimal("CODTOPDENEGCTE");
   }

   public void setCodTopDenegCte(BigDecimal codTopDenegCte) {
        markAsChanged("CODTOPDENEGCTE", codTopDenegCte);
   }

   public String getTipoCte() {
        return this.getVo().asString("TIPOCTE");
   }

   public void setTipoCte(String tipoCte) {
        markAsChanged("TIPOCTE", tipoCte);
   }

   public String getValVarIaCvlrUnit() {
        return this.getVo().asString("VALVARIACVLRUNIT");
   }

   public void setValVarIaCvlrUnit(String valVarIaCvlrUnit) {
        markAsChanged("VALVARIACVLRUNIT", valVarIaCvlrUnit);
   }

   public BigDecimal getConfValEvent68() {
        return this.getVo().asBigDecimal("CONFVALEVENT68");
   }

   public void setConfValEvent68(BigDecimal confValEvent68) {
        markAsChanged("CONFVALEVENT68", confValEvent68);
   }

   public String getDataRetroFat() {
        return this.getVo().asString("DATARETROFAT");
   }

   public void setDataRetroFat(String dataRetroFat) {
        markAsChanged("DATARETROFAT", dataRetroFat);
   }

   public BigDecimal getConsVlrRemRetInd() {
        return this.getVo().asBigDecimal("CONSVLRREMRETIND");
   }

   public void setConsVlrRemRetInd(BigDecimal consVlrRemRetInd) {
        markAsChanged("CONSVLRREMRETIND", consVlrRemRetInd);
   }

   public String getDevSemDestaqueIpi() {
        return this.getVo().asString("DEVSEMDESTAQUEIPI");
   }

   public void setDevSemDestaqueIpi(String devSemDestaqueIpi) {
        markAsChanged("DEVSEMDESTAQUEIPI", devSemDestaqueIpi);
   }

   public String getDevSemDestaqueSt() {
        return this.getVo().asString("DEVSEMDESTAQUEST");
   }

   public void setDevSemDestaqueSt(String devSemDestaqueSt) {
        markAsChanged("DEVSEMDESTAQUEST", devSemDestaqueSt);
   }

   public String getGeraDemandaMps() {
        return this.getVo().asString("GERADEMANDAMPS");
   }

   public void setGeraDemandaMps(String geraDemandaMps) {
        markAsChanged("GERADEMANDAMPS", geraDemandaMps);
   }

   public String getGerCorApon() {
        return this.getVo().asString("GERCORAPON");
   }

   public void setGerCorApon(String gerCorApon) {
        markAsChanged("GERCORAPON", gerCorApon);
   }

   public String getIgnoraAgrupMinDev() {
        return this.getVo().asString("IGNORARAGRUPMINDEV");
   }

   public void setIgnoraAgrupMinDev(String ignoraAgrupMinDev) {
        markAsChanged("IGNORARAGRUPMINDEV", ignoraAgrupMinDev);
   }

   public String getRedIcmsBcPisConfins() {
        return this.getVo().asString("REDICMSBCPISCONFINS");
   }

   public void setRedIcmsBcPisConfins(String redIcmsBcPisConfins) {
        markAsChanged("REDICMSBCPISCONFINS", redIcmsBcPisConfins);
   }

   public String getSalvarConfSemPerg() {
        return this.getVo().asString("SALVARCONFSEMPERG");
   }

   public void setSalvarConfSemPerg(String salvarConfSemPerg) {
        markAsChanged("SALVARCONFSEMPERG", salvarConfSemPerg);
   }

   public String getSemCredIpiSt() {
        return this.getVo().asString("SEMCREDIPIST");
   }

   public void setSemCredIpiSt(String semCredIpiSt) {
        markAsChanged("SEMCREDIPIST", semCredIpiSt);
   }

   public String getSemMoedaFin() {
        return this.getVo().asString("SEMMOEDAFIN");
   }

   public void setSemMoedaFin(String semMoedaFin) {
        markAsChanged("SEMMOEDAFIN", semMoedaFin);
   }

   public String getTipModalCte() {
        return this.getVo().asString("TIPMODALCTE");
   }

   public void setTipModalCte(String tipModalCte) {
        markAsChanged("TIPMODALCTE", tipModalCte);
   }

   public String getUsaRecParcial() {
        return this.getVo().asString("USARECPARCIAL");
   }

   public void setUsaRecParcial(String usaRecParcial) {
        markAsChanged("USARECPARCIAL", usaRecParcial);
   }

   public String getValSitCadRf() {
        return this.getVo().asString("VALSITCADRF");
   }

   public void setValSitCadRf(String valSitCadRf) {
        markAsChanged("VALSITCADRF", valSitCadRf);
   }

   public String getVlrLiqItemNfe() {
        return this.getVo().asString("VLRLIQITEMNFE");
   }

   public void setVlrLiqItemNfe(String vlrLiqItemNfe) {
        markAsChanged("VLRLIQITEMNFE", vlrLiqItemNfe);
   }

   public String getCalcFetHab() {
        return this.getVo().asString("CALCFETHAB");
   }

   public void setCalcFetHab(String calcFetHab) {
        markAsChanged("CALCFETHAB", calcFetHab);
   }

   public String getExigeAnaliseCred() {
        return this.getVo().asString("EXIGEANALISECRED");
   }

   public void setExigeAnaliseCred(String exigeAnaliseCred) {
        markAsChanged("EXIGEANALISECRED", exigeAnaliseCred);
   }

   public String getIndTipRec() {
        return this.getVo().asString("INDTIPREC");
   }

   public void setIndTipRec(String indTipRec) {
        markAsChanged("INDTIPREC", indTipRec);
   }

   public String getCalcFcpInt() {
        return this.getVo().asString("CALCFCPINT");
   }

   public void setCalcFcpInt(String calcFcpInt) {
        markAsChanged("CALCFCPINT", calcFcpInt);
   }

   public String getConsAuxiliar() {
        return this.getVo().asString("CONSAUXILIAR");
   }

   public void setConsAuxiliar(String consAuxiliar) {
        markAsChanged("CONSAUXILIAR", consAuxiliar);
   }

   public String getDescQtdGruDescPro() {
        return this.getVo().asString("DESCQTDGRUDESCPRO");
   }

   public void setDescQtdGruDescPro(String descQtdGruDescPro) {
        markAsChanged("DESCQTDGRUDESCPRO", descQtdGruDescPro);
   }

   public String getReservaSemLote() {
        return this.getVo().asString("RESERVASEMLOTE");
   }

   public void setReservaSemLote(String reservaSemLote) {
        markAsChanged("RESERVASEMLOTE", reservaSemLote);
   }

   public String getPermiteCnaeDifNota() {
        return this.getVo().asString("PERMITECNAEDIFNOTA");
   }

   public void setPermiteCnaeDifNota(String permiteCnaeDifNota) {
        markAsChanged("PERMITECNAEDIFNOTA", permiteCnaeDifNota);
   }

   public String getIgnoraComplItem() {
        return this.getVo().asString("IGNORACOMPLITEM");
   }

   public void setIgnoraComplItem(String ignoraComplItem) {
        markAsChanged("IGNORACOMPLITEM", ignoraComplItem);
   }

   public String getOutDespStExtNota() {
        return this.getVo().asString("OUTDESPSTEXTNOTA");
   }

   public void setOutDespStExtNota(String outDespStExtNota) {
        markAsChanged("OUTDESPSTEXTNOTA", outDespStExtNota);
   }

   public String getEstoqueMpTerceiro() {
        return this.getVo().asString("ESTOQUEMPTERCEIRO");
   }

   public void setEstoqueMpTerceiro(String estoqueMpTerceiro) {
        markAsChanged("ESTOQUEMPTERCEIRO", estoqueMpTerceiro);
   }

   public String getRedPisBcPisCofins() {
        return this.getVo().asString("REDPISBCPISCOFINS");
   }

   public void setRedPisBcPisCofins(String redPisBcPisCofins) {
        markAsChanged("REDPISBCPISCOFINS", redPisBcPisCofins);
   }

   public String getCalcPesoConfirm() {
        return this.getVo().asString("CALCPESOCONFIRM");
   }

   public void setCalcPesoConfirm(String calcPesoConfirm) {
        markAsChanged("CALCPESOCONFIRM", calcPesoConfirm);
   }

   public String getAplicLeiTransp() {
        return this.getVo().asString("APLICLEITRANSP");
   }

   public void setAplicLeiTransp(String aplicLeiTransp) {
        markAsChanged("APLICLEITRANSP", aplicLeiTransp);
   }

   public String getEnvGarantia() {
        return this.getVo().asString("ENVGARANTIA");
   }

   public void setEnvGarantia(String envGarantia) {
        markAsChanged("ENVGARANTIA", envGarantia);
   }

   public String getDistStVlrUnitFat() {
        return this.getVo().asString("DISTSTVLRUNITFAT");
   }

   public void setDistStVlrUnitFat(String distStVlrUnitFat) {
        markAsChanged("DISTSTVLRUNITFAT", distStVlrUnitFat);
   }

   public String getSimulacAutoFrete() {
        return this.getVo().asString("SIMULACAUTOFRETE");
   }

   public void setSimulacAutoFrete(String simulacAutoFrete) {
        markAsChanged("SIMULACAUTOFRETE", simulacAutoFrete);
   }

   public String getIcmsOrigEstPed() {
        return this.getVo().asString("ICMSORIGESTPED");
   }

   public void setIcmsOrigEstPed(String icmsOrigEstPed) {
        markAsChanged("ICMSORIGESTPED", icmsOrigEstPed);
   }

   public BigDecimal getCodCtaCtbEfd() {
        return this.getVo().asBigDecimal("CODCTACTBEFD");
   }

   public void setCodCtaCtbEfd(BigDecimal codCtaCtbEfd) {
        markAsChanged("CODCTACTBEFD", codCtaCtbEfd);
   }

   public String getLigOrigOrig() {
        return this.getVo().asString("LIGORIGORIG");
   }

   public void setLigOrigOrig(String ligOrigOrig) {
        markAsChanged("LIGORIGORIG", ligOrigOrig);
   }

   public String getIndTerc() {
        return this.getVo().asString("INDTERC");
   }

   public void setIndTerc(String indTerc) {
        markAsChanged("INDTERC", indTerc);
   }

   public String getMovEndFlutuante() {
        return this.getVo().asString("MOVENDFLUTUANTE");
   }

   public void setMovEndFlutuante(String movEndFlutuante) {
        markAsChanged("MOVENDFLUTUANTE", movEndFlutuante);
   }

   public String getUsaServTabIrFinsS() {
        return this.getVo().asString("USASERVTABIRFINSS");
   }

   public void setUsaServTabIrFinsS(String usaServTabIrFinsS) {
        markAsChanged("USASERVTABIRFINSS", usaServTabIrFinsS);
   }

   public String getDescOnNfse() {
        return this.getVo().asString("DESCONNFSE");
   }

   public void setDescOnNfse(String descOnNfse) {
        markAsChanged("DESCONNFSE", descOnNfse);
   }

   public String getAplicTabIrFinsS() {
        return this.getVo().asString("APLICTABIRFINSS");
   }

   public void setAplicTabIrFinsS(String aplicTabIrFinsS) {
        markAsChanged("APLICTABIRFINSS", aplicTabIrFinsS);
   }

   public String getFormRecIss() {
        return this.getVo().asString("FORMRECISS");
   }

   public void setFormRecIss(String formRecIss) {
        markAsChanged("FORMRECISS", formRecIss);
   }

   public BigDecimal getNatEfdContM410M810() {
        return this.getVo().asBigDecimal("NATEFDCONTM410M810");
   }

   public void setNatEfdContM410M810(BigDecimal natEfdContM410M810) {
        markAsChanged("NATEFDCONTM410M810", natEfdContM410M810);
   }

   public BigDecimal getNuFop() {
        return this.getVo().asBigDecimal("NUFOP");
   }

   public void setNuFop(BigDecimal nuFop) {
        markAsChanged("NUFOP", nuFop);
   }

   public String getOrcamento() {
        return this.getVo().asString("ORCAMENTO");
   }

   public void setOrcamento(String orcamento) {
        markAsChanged("ORCAMENTO", orcamento);
   }

   public String getDescOnSlcdPr() {
        return this.getVo().asString("DESCONSLCDPR");
   }

   public void setDescOnSlcdPr(String descOnSlcdPr) {
        markAsChanged("DESCONSLCDPR", descOnSlcdPr);
   }

   public BigDecimal getCodModRo() {
        return this.getVo().asBigDecimal("CODMODRO");
   }

   public void setCodModRo(BigDecimal codModRo) {
        markAsChanged("CODMODRO", codModRo);
   }

   public BigDecimal getCodLocalImpXml() {
        return this.getVo().asBigDecimal("CODLOCALIMPXML");
   }

   public void setCodLocalImpXml(BigDecimal codLocalImpXml) {
        markAsChanged("CODLOCALIMPXML", codLocalImpXml);
   }

   public String getImpXmlMantDespAces() {
        return this.getVo().asString("IMPXMLMANTDESPACES");
   }

   public void setImpXmlMantDespAces(String impXmlMantDespAces) {
        markAsChanged("IMPXMLMANTDESPACES", impXmlMantDespAces);
   }

   public String getCodContaRural() {
        return this.getVo().asString("CODCONTARURAL");
   }

   public void setCodContaRural(String codContaRural) {
        markAsChanged("CODCONTARURAL", codContaRural);
   }

   public String getArredQtdUnAlt() {
        return this.getVo().asString("ARREDQTDUNALT");
   }

   public void setArredQtdUnAlt(String arredQtdUnAlt) {
        markAsChanged("ARREDQTDUNALT", arredQtdUnAlt);
   }

   public String getConsNfeRelCancEfd() {
        return this.getVo().asString("CONSNFERELCANCEFD");
   }

   public void setConsNfeRelCancEfd(String consNfeRelCancEfd) {
        markAsChanged("CONSNFERELCANCEFD", consNfeRelCancEfd);
   }

   public String getIgnoraMppVpa() {
        return this.getVo().asString("IGNORAMPPVPA");
   }

   public void setIgnoraMppVpa(String ignoraMppVpa) {
        markAsChanged("IGNORAMPPVPA", ignoraMppVpa);
   }

   public String getTopPisCofRedAquis() {
        return this.getVo().asString("TOPPISCOFREDAQUIS");
   }

   public void setTopPisCofRedAquis(String topPisCofRedAquis) {
        markAsChanged("TOPPISCOFREDAQUIS", topPisCofRedAquis);
   }

   public BigDecimal getTipComplCust() {
        return this.getVo().asBigDecimal("TIPCOMPLCUST");
   }

   public void setTipComplCust(BigDecimal tipComplCust) {
        markAsChanged("TIPCOMPLCUST", tipComplCust);
   }

   public BigDecimal getNuLayoutCvr() {
        return this.getVo().asBigDecimal("NULAYOUTCVR");
   }

   public void setNuLayoutCvr(BigDecimal nuLayoutCvr) {
        markAsChanged("NULAYOUTCVR", nuLayoutCvr);
   }

   public String getDescTopAdrCst1400() {
        return this.getVo().asString("DESTOPADRCST1400");
   }

   public void setDescTopAdrCst1400(String descTopAdrCst1400) {
        markAsChanged("DESTOPADRCST1400", descTopAdrCst1400);
   }

   public String getCalcFunTtelTop() {
        return this.getVo().asString("CALCFUNTTELTOP");
   }

   public void setCalcFunTtelTop(String calcFunTtelTop) {
        markAsChanged("CALCFUNTTELTOP", calcFunTtelTop);
   }

   public String getCalcFustTop() {
        return this.getVo().asString("CALCFUSTTOP");
   }

   public void setCalcFustTop(String calcFustTop) {
        markAsChanged("CALCFUSTTOP", calcFustTop);
   }

   public String getCalcStFrtXtNotProp() {
        return this.getVo().asString("CALCSTFRTXTNOTPROP");
   }

   public void setCalcStFrtXtNotProp(String calcStFrtXtNotProp) {
        markAsChanged("CALCSTFRTXTNOTPROP", calcStFrtXtNotProp);
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

   public String getValEstMaximo() {
        return this.getVo().asString("VALESTMAXIMO");
   }

   public void setValEstMaximo(String valEstMaximo) {
        markAsChanged("VALESTMAXIMO", valEstMaximo);
   }

   public String getIgnObsOrigRem() {
        return this.getVo().asString("IGNOBSORIGREM");
   }

   public void setIgnObsOrigRem(String ignObsOrigRem) {
        markAsChanged("IGNOBSORIGREM", ignObsOrigRem);
   }

   public String getDescOnSidPedXml() {
        return this.getVo().asString("DESCONSIDPEDXML");
   }

   public void setDescOnSidPedXml(String descOnSidPedXml) {
        markAsChanged("DESCONSIDPEDXML", descOnSidPedXml);
   }

   public String getOperacaoAmostra() {
        return this.getVo().asString("OPERACAOAMOSTRA");
   }

   public void setOperacaoAmostra(String operacaoAmostra) {
        markAsChanged("OPERACAOAMOSTRA", operacaoAmostra);
   }

   public String getAtualEstWmsTerc() {
        return this.getVo().asString("ATUALESTWMSTERC");
   }

   public void setAtualEstWmsTerc(String atualEstWmsTerc) {
        markAsChanged("ATUALESTWMSTERC", atualEstWmsTerc);
   }

   public String getDescOnSidNfeOrigem() {
        return this.getVo().asString("DESCONSIDNFEORIGEM");
   }

   public void setDescOnSidNfeOrigem(String descOnSidNfeOrigem) {
        markAsChanged("DESCONSIDNFEORIGEM", descOnSidNfeOrigem);
   }

   public String getDedFcpBcPisCofins() {
        return this.getVo().asString("DEDFCPBCPISCOFINS");
   }

   public void setDedFcpBcPisCofins(String dedFcpBcPisCofins) {
        markAsChanged("DEDFCPBCPISCOFINS", dedFcpBcPisCofins);
   }

   public String getArmTipApu() {
        return this.getVo().asString("ARMTIPAPU");
   }

   public void setArmTipApu(String armTipApu) {
        markAsChanged("ARMTIPAPU", armTipApu);
   }

   public String getCalcPisCfsFin() {
        return this.getVo().asString("CALCPISCFSFIN");
   }

   public void setCalcPisCfsFin(String calcPisCfsFin) {
        markAsChanged("CALCPISCFSFIN", calcPisCfsFin);
   }

   public String getConfVlrEvent68() {
        return this.getVo().asString("CONFVLREVENT68");
   }

   public void setConfVlrEvent68(String confVlrEvent68) {
        markAsChanged("CONFVLREVENT68", confVlrEvent68);
   }

   public String getCalcIcmsRegTts() {
        return this.getVo().asString("CALCICMSREGTTS");
   }

   public void setCalcIcmsRegTts(String calcIcmsRegTts) {
        markAsChanged("CALCICMSREGTTS", calcIcmsRegTts);
   }

   public String getRecBrutaCiap() {
        return this.getVo().asString("RECBRUTACIAP");
   }

   public void setRecBrutaCiap(String recBrutaCiap) {
        markAsChanged("RECBRUTACIAP", recBrutaCiap);
   }

   public String getAtuSaldoCont() {
        return this.getVo().asString("ATUSALDOCONT");
   }

   public void setAtuSaldoCont(String atuSaldoCont) {
        markAsChanged("ATUSALDOCONT", atuSaldoCont);
   }

   public String getUsaVendaMais() {
        return this.getVo().asString("USAVENDAMAIS");
   }

   public void setUsaVendaMais(String usaVendaMais) {
        markAsChanged("USAVENDAMAIS", usaVendaMais);
   }

   public String getDescCstBcPisCf() {
        return this.getVo().asString("DESCCSTBCPISCF");
   }

   public void setDescCstBcPisCf(String descCstBcPisCf) {
        markAsChanged("DESCCSTBCPISCF", descCstBcPisCf);
   }

   public String getValDispEstDev() {
        return this.getVo().asString("VALDISPESTDEV");
   }

   public void setValDispEstDev(String valDispEstDev) {
        markAsChanged("VALDISPESTDEV", valDispEstDev);
   }

   @Override
   public String getTableName() {
        return "TGFTOP";
   }

   @Override
   public String getEntityName() {
        return "TipoOperacao";
   }

   @Override
   public TipoOperacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
