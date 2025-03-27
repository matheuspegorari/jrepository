package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Produto extends AbstractSankhyaEntity<Produto> {
   public BigDecimal getCodProdSubkit() {
        return this.getVo().asBigDecimal("CODPRODSUBKIT");
   }

   public void setCodProdSubkit(BigDecimal codProdSubkit) {
        markAsChanged("CODPRODSUBKIT", codProdSubkit);
   }

   public String getEnqReintegra() {
        return this.getVo().asString("ENQREINTEGRA");
   }

   public void setEnqReintegra(String enqReintegra) {
        markAsChanged("ENQREINTEGRA", enqReintegra);
   }

   public BigDecimal getMargLucro() {
        return this.getVo().asBigDecimal("MARGLUCRO");
   }

   public void setMargLucro(BigDecimal margLucro) {
        markAsChanged("MARGLUCRO", margLucro);
   }

   public BigDecimal getCodGProd() {
        return this.getVo().asBigDecimal("CODGPROD");
   }

   public void setCodGProd(BigDecimal codGProd) {
        markAsChanged("CODGPROD", codGProd);
   }

   public BigDecimal getCodEspecSt() {
        return this.getVo().asBigDecimal("CODESPECST");
   }

   public void setCodEspecSt(BigDecimal codEspecSt) {
        markAsChanged("CODESPECST", codEspecSt);
   }

   public BigDecimal getCodAnp() {
        return this.getVo().asBigDecimal("CODANP");
   }

   public void setCodAnp(BigDecimal codAnp) {
        markAsChanged("CODANP", codAnp);
   }

   public BigDecimal getCodAreaSep() {
        return this.getVo().asBigDecimal("CODAREASEP");
   }

   public void setCodAreaSep(BigDecimal codAreaSep) {
        markAsChanged("CODAREASEP", codAreaSep);
   }

   public BigDecimal getCodFormaPonta() {
        return this.getVo().asBigDecimal("CODFORMAPONTA");
   }

   public void setCodFormaPonta(BigDecimal codFormaPonta) {
        markAsChanged("CODFORMAPONTA", codFormaPonta);
   }

   public BigDecimal getCodFormPrec() {
        return this.getVo().asBigDecimal("CODFORMPREC");
   }

   public void setCodFormPrec(BigDecimal codFormPrec) {
        markAsChanged("CODFORMPREC", codFormPrec);
   }

   public BigDecimal getCodGar() {
        return this.getVo().asBigDecimal("CODGAR");
   }

   public void setCodGar(BigDecimal codGar) {
        markAsChanged("CODGAR", codGar);
   }

   public BigDecimal getCodGenero() {
        return this.getVo().asBigDecimal("CODGENERO");
   }

   public void setCodGenero(BigDecimal codGenero) {
        markAsChanged("CODGENERO", codGenero);
   }

   public BigDecimal getCodGrupoProd() {
        return this.getVo().asBigDecimal("CODGRUPOPROD");
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
   }

   public BigDecimal getCodIcmsFast() {
        return this.getVo().asBigDecimal("CODICMSFAST");
   }

   public void setCodIcmsFast(BigDecimal codIcmsFast) {
        markAsChanged("CODICMSFAST", codIcmsFast);
   }

   public BigDecimal getCodIpi() {
        return this.getVo().asBigDecimal("CODIPI");
   }

   public void setCodIpi(BigDecimal codIpi) {
        markAsChanged("CODIPI", codIpi);
   }

   public BigDecimal getCodLocalPadrao() {
        return this.getVo().asBigDecimal("CODLOCALPADRAO");
   }

   public void setCodLocalPadrao(BigDecimal codLocalPadrao) {
        markAsChanged("CODLOCALPADRAO", codLocalPadrao);
   }

   public BigDecimal getCodLst() {
        return this.getVo().asBigDecimal("CODLST");
   }

   public void setCodLst(BigDecimal codLst) {
        markAsChanged("CODLST", codLst);
   }

   public BigDecimal getMedAux() {
        return this.getVo().asBigDecimal("MEDAUX");
   }

   public void setMedAux(BigDecimal medAux) {
        markAsChanged("MEDAUX", medAux);
   }

   public String getModoAplic() {
        return this.getVo().asString("MODOAPLIC");
   }

   public void setModoAplic(String modoAplic) {
        markAsChanged("MODOAPLIC", modoAplic);
   }

   public String getMotivoIncexc() {
        return this.getVo().asString("MOTIVOINCEXC");
   }

   public void setMotivoIncexc(String motivoIncexc) {
        markAsChanged("MOTIVOINCEXC", motivoIncexc);
   }

   public BigDecimal getMultipVenda() {
        return this.getVo().asBigDecimal("MULTIPVENDA");
   }

   public void setMultipVenda(BigDecimal multipVenda) {
        markAsChanged("MULTIPVENDA", multipVenda);
   }

   public BigDecimal getMvaAjustado() {
        return this.getVo().asBigDecimal("MVAAJUSTADO");
   }

   public void setMvaAjustado(BigDecimal mvaAjustado) {
        markAsChanged("MVAAJUSTADO", mvaAjustado);
   }

   public String getNaturezaOperDes() {
        return this.getVo().asString("NATUREZAOPERDES");
   }

   public void setNaturezaOperDes(String naturezaOperDes) {
        markAsChanged("NATUREZAOPERDES", naturezaOperDes);
   }

   public String getNcm() {
        return this.getVo().asString("NCM");
   }

   public void setNcm(String ncm) {
        markAsChanged("NCM", ncm);
   }

   public BigDecimal getAcrescMax() {
        return this.getVo().asBigDecimal("ACRESCMAX");
   }

   public void setAcrescMax(BigDecimal acrescMax) {
        markAsChanged("ACRESCMAX", acrescMax);
   }

   public BigDecimal getAgrupCompMinimo() {
        return this.getVo().asBigDecimal("AGRUPCOMPMINIMO");
   }

   public void setAgrupCompMinimo(BigDecimal agrupCompMinimo) {
        markAsChanged("AGRUPCOMPMINIMO", agrupCompMinimo);
   }

   public BigDecimal getAgrupMin() {
        return this.getVo().asBigDecimal("AGRUPMIN");
   }

   public void setAgrupMin(BigDecimal agrupMin) {
        markAsChanged("AGRUPMIN", agrupMin);
   }

   public String getAlertaEstMin() {
        return this.getVo().asString("ALERTAESTMIN");
   }

   public void setAlertaEstMin(String alertaEstMin) {
        markAsChanged("ALERTAESTMIN", alertaEstMin);
   }

   public BigDecimal getAliqIcmsIntEfd() {
        return this.getVo().asBigDecimal("ALIQICMSINTEFD");
   }

   public void setAliqIcmsIntEfd(BigDecimal aliqIcmsIntEfd) {
        markAsChanged("ALIQICMSINTEFD", aliqIcmsIntEfd);
   }

   public BigDecimal getAltura() {
        return this.getVo().asBigDecimal("ALTURA");
   }

   public void setAltura(BigDecimal altura) {
        markAsChanged("ALTURA", altura);
   }

   public String getAp1RctEgo() {
        return this.getVo().asString("AP1RCTEGO");
   }

   public void setAp1RctEgo(String ap1RctEgo) {
        markAsChanged("AP1RCTEGO", ap1RctEgo);
   }

   public BigDecimal getAplicacao() {
        return this.getVo().asBigDecimal("APLICACAO");
   }

   public void setAplicacao(BigDecimal aplicacao) {
        markAsChanged("APLICACAO", aplicacao);
   }

   public String getAplicaSazo() {
        return this.getVo().asString("APLICASAZO");
   }

   public void setAplicaSazo(String aplicaSazo) {
        markAsChanged("APLICASAZO", aplicaSazo);
   }

   public String getApresDetalhe() {
        return this.getVo().asString("APRESDETALHE");
   }

   public void setApresDetalhe(String apresDetalhe) {
        markAsChanged("APRESDETALHE", apresDetalhe);
   }

   public String getApresForm() {
        return this.getVo().asString("APRESFORM");
   }

   public void setApresForm(String apresForm) {
        markAsChanged("APRESFORM", apresForm);
   }

   public String getApuraProdEpe() {
        return this.getVo().asString("APURAPRODEPE");
   }

   public void setApuraProdEpe(String apuraProdEpe) {
        markAsChanged("APURAPRODEPE", apuraProdEpe);
   }

   public BigDecimal getArredAgrup() {
        return this.getVo().asBigDecimal("ARREDAGRUP");
   }

   public void setArredAgrup(BigDecimal arredAgrup) {
        markAsChanged("ARREDAGRUP", arredAgrup);
   }

   public BigDecimal getArredPreco() {
        return this.getVo().asBigDecimal("ARREDPRECO");
   }

   public void setArredPreco(BigDecimal arredPreco) {
        markAsChanged("ARREDPRECO", arredPreco);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getBalanca() {
        return this.getVo().asString("BALANCA");
   }

   public void setBalanca(String balanca) {
        markAsChanged("BALANCA", balanca);
   }

   public String getCalcGiro() {
        return this.getVo().asString("CALCULOGIRO");
   }

   public void setCalcGiro(String calcGiro) {
        markAsChanged("CALCULOGIRO", calcGiro);
   }

   public BigDecimal getCamadas() {
        return this.getVo().asBigDecimal("CAMADAS");
   }

   public void setCamadas(BigDecimal camadas) {
        markAsChanged("CAMADAS", camadas);
   }

   public String getCaracteristicas() {
        return this.getVo().asString("CARACTERISTICAS");
   }

   public void setCaracteristicas(String caracteristicas) {
        markAsChanged("CARACTERISTICAS", caracteristicas);
   }

   public BigDecimal getCarencia() {
        return this.getVo().asBigDecimal("CARENCIA");
   }

   public void setCarencia(BigDecimal carencia) {
        markAsChanged("CARENCIA", carencia);
   }

   public String getCientifico() {
        return this.getVo().asString("CIENTIFICO");
   }

   public void setCientifico(String cientifico) {
        markAsChanged("CIENTIFICO", cientifico);
   }

   public BigDecimal getClasseAgt() {
        return this.getVo().asBigDecimal("CLASSEAGT");
   }

   public void setClasseAgt(BigDecimal classeAgt) {
        markAsChanged("CLASSEAGT", classeAgt);
   }

   public BigDecimal getClasseTox() {
        return this.getVo().asBigDecimal("CLASSETOX");
   }

   public void setClasseTox(BigDecimal classeTox) {
        markAsChanged("CLASSETOX", classeTox);
   }

   public BigDecimal getClassUbTrib() {
        return this.getVo().asBigDecimal("CLASSUBTRIB");
   }

   public void setClassUbTrib(BigDecimal classUbTrib) {
        markAsChanged("CLASSUBTRIB", classUbTrib);
   }

   public BigDecimal getCnae() {
        return this.getVo().asBigDecimal("CNAE");
   }

   public void setCnae(BigDecimal cnae) {
        markAsChanged("CNAE", cnae);
   }

   public String getLisContEst() {
        return this.getVo().asString("LISCONTEST");
   }

   public void setLisContEst(String lisContEst) {
        markAsChanged("LISCONTEST", lisContEst);
   }

   public String getLocal() {
        return this.getVo().asString("LOCAL");
   }

   public void setLocal(String local) {
        markAsChanged("LOCAL", local);
   }

   public String getLocalizacao() {
        return this.getVo().asString("LOCALIZACAO");
   }

   public void setLocalizacao(String localizacao) {
        markAsChanged("LOCALIZACAO", localizacao);
   }

   public BigDecimal getLoteCompMinimo() {
        return this.getVo().asBigDecimal("LOTECOMPMINIMO");
   }

   public void setLoteCompMinimo(BigDecimal loteCompMinimo) {
        markAsChanged("LOTECOMPMINIMO", loteCompMinimo);
   }

   public BigDecimal getLoteCompras() {
        return this.getVo().asBigDecimal("LOTECOMPRAS");
   }

   public void setLoteCompras(BigDecimal loteCompras) {
        markAsChanged("LOTECOMPRAS", loteCompras);
   }

   public BigDecimal getM3() {
        return this.getVo().asBigDecimal("M3");
   }

   public void setM3(BigDecimal m3) {
        markAsChanged("M3", m3);
   }

   public String getManejoInt() {
        return this.getVo().asString("MANEJOINT");
   }

   public void setManejoInt(String manejoInt) {
        markAsChanged("MANEJOINT", manejoInt);
   }

   public String getMarca() {
        return this.getVo().asString("MARCA");
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
   }

   public String getNomeTab() {
        return this.getVo().asString("NOMETAB");
   }

   public void setNomeTab(String nomeTab) {
        markAsChanged("NOMETAB", nomeTab);
   }

   public String getNotifConf() {
        return this.getVo().asString("NOTIFCONF");
   }

   public void setNotifConf(String notifConf) {
        markAsChanged("NOTIFCONF", notifConf);
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

   public BigDecimal getCodPais() {
        return this.getVo().asBigDecimal("CODPAIS");
   }

   public void setCodPais(BigDecimal codPais) {
        markAsChanged("CODPAIS", codPais);
   }

   public BigDecimal getCodParcForn() {
        return this.getVo().asBigDecimal("CODPARCFORN");
   }

   public void setCodParcForn(BigDecimal codParcForn) {
        markAsChanged("CODPARCFORN", codParcForn);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodProdAgrupApt() {
        return this.getVo().asBigDecimal("CODPRODAGRUPAPT");
   }

   public void setCodProdAgrupApt(BigDecimal codProdAgrupApt) {
        markAsChanged("CODPRODAGRUPAPT", codProdAgrupApt);
   }

   public BigDecimal getCodProdAgrupAptEnc() {
        return this.getVo().asBigDecimal("CODPRODAGRUPAPTENC");
   }

   public void setCodProdAgrupAptEnc(BigDecimal codProdAgrupAptEnc) {
        markAsChanged("CODPRODAGRUPAPTENC", codProdAgrupAptEnc);
   }

   public String getCodProdRoi() {
        return this.getVo().asString("CODPRODROI");
   }

   public void setCodProdRoi(String codProdRoi) {
        markAsChanged("CODPRODROI", codProdRoi);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public String getCodRegMapa() {
        return this.getVo().asString("CODREGMAPA");
   }

   public void setCodRegMapa(String codRegMapa) {
        markAsChanged("CODREGMAPA", codRegMapa);
   }

   public BigDecimal getCodRfa() {
        return this.getVo().asBigDecimal("CODRFA");
   }

   public void setCodRfa(BigDecimal codRfa) {
        markAsChanged("CODRFA", codRfa);
   }

   public BigDecimal getCodTab() {
        return this.getVo().asBigDecimal("CODTAB");
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
   }

   public String getCodTribMunIss() {
        return this.getVo().asString("CODTRIBMUNISS");
   }

   public void setCodTribMunIss(String codTribMunIss) {
        markAsChanged("CODTRIBMUNISS", codTribMunIss);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getCodVolCompra() {
        return this.getVo().asString("CODVOLCOMPRA");
   }

   public void setCodVolCompra(String codVolCompra) {
        markAsChanged("CODVOLCOMPRA", codVolCompra);
   }

   public String getCodVolPlan() {
        return this.getVo().asString("CODVOLPLAN");
   }

   public void setCodVolPlan(String codVolPlan) {
        markAsChanged("CODVOLPLAN", codVolPlan);
   }

   public String getCodVolRes() {
        return this.getVo().asString("CODVOLRES");
   }

   public void setCodVolRes(String codVolRes) {
        markAsChanged("CODVOLRES", codVolRes);
   }

   public BigDecimal getComGer() {
        return this.getVo().asBigDecimal("COMGER");
   }

   public void setComGer(BigDecimal comGer) {
        markAsChanged("COMGER", comGer);
   }

   public String getComplDesc() {
        return this.getVo().asString("COMPLDESC");
   }

   public void setComplDesc(String complDesc) {
        markAsChanged("COMPLDESC", complDesc);
   }

   public String getComponObrig() {
        return this.getVo().asString("COMPONOBRIG");
   }

   public void setComponObrig(String componObrig) {
        markAsChanged("COMPONOBRIG", componObrig);
   }

   public BigDecimal getComVend() {
        return this.getVo().asBigDecimal("COMVEND");
   }

   public void setComVend(BigDecimal comVend) {
        markAsChanged("COMVEND", comVend);
   }

   public String getConcentracao() {
        return this.getVo().asString("CONCENTRACAO");
   }

   public void setConcentracao(String concentracao) {
        markAsChanged("CONCENTRACAO", concentracao);
   }

   public String getConfCegaPeso() {
        return this.getVo().asString("CONFCEGAPESO");
   }

   public void setConfCegaPeso(String confCegaPeso) {
        markAsChanged("CONFCEGAPESO", confCegaPeso);
   }

   public String getConfere() {
        return this.getVo().asString("CONFERE");
   }

   public void setConfere(String confere) {
        markAsChanged("CONFERE", confere);
   }

   public BigDecimal getConverVol() {
        return this.getVo().asBigDecimal("CONVERVOL");
   }

   public void setConverVol(BigDecimal converVol) {
        markAsChanged("CONVERVOL", converVol);
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

   public String getCultura() {
        return this.getVo().asString("CULTURA");
   }

   public void setCultura(String cultura) {
        markAsChanged("CULTURA", cultura);
   }

   public BigDecimal getDecCusto() {
        return this.getVo().asBigDecimal("DECCUSTO");
   }

   public void setDecCusto(BigDecimal decCusto) {
        markAsChanged("DECCUSTO", decCusto);
   }

   public BigDecimal getDecQtd() {
        return this.getVo().asBigDecimal("DECQTD");
   }

   public void setDecQtd(BigDecimal decQtd) {
        markAsChanged("DECQTD", decQtd);
   }

   public BigDecimal getDecVlr() {
        return this.getVo().asBigDecimal("DECVLR");
   }

   public void setDecVlr(BigDecimal decVlr) {
        markAsChanged("DECVLR", decVlr);
   }

   public BigDecimal getDescMax() {
        return this.getVo().asBigDecimal("DESCMAX");
   }

   public void setDescMax(BigDecimal descMax) {
        markAsChanged("DESCMAX", descMax);
   }

   public BigDecimal getDescMaxFlex() {
        return this.getVo().asBigDecimal("DESCMAXFLEX");
   }

   public void setDescMaxFlex(BigDecimal descMaxFlex) {
        markAsChanged("DESCMAXFLEX", descMaxFlex);
   }

   public String getDescrProd() {
        return this.getVo().asString("DESCRPROD");
   }

   public void setDescrProd(String descrProd) {
        markAsChanged("DESCRPROD", descrProd);
   }

   public String getDescrProdNfe() {
        return this.getVo().asString("DESCRPRODNFE");
   }

   public void setDescrProdNfe(String descrProdNfe) {
        markAsChanged("DESCRPRODNFE", descrProdNfe);
   }

   public BigDecimal getDesvioMax() {
        return this.getVo().asBigDecimal("DESVIOMAX");
   }

   public void setDesvioMax(BigDecimal desvioMax) {
        markAsChanged("DESVIOMAX", desvioMax);
   }

   public BigDecimal getDiasExpedicao() {
        return this.getVo().asBigDecimal("DIASEXPEDICAO");
   }

   public void setDiasExpedicao(BigDecimal diasExpedicao) {
        markAsChanged("DIASEXPEDICAO", diasExpedicao);
   }

   public String getDimensoes() {
        return this.getVo().asString("DIMENSOES");
   }

   public void setDimensoes(String dimensoes) {
        markAsChanged("DIMENSOES", dimensoes);
   }

   public BigDecimal getDosagem() {
        return this.getVo().asBigDecimal("DOSAGEM");
   }

   public void setDosagem(BigDecimal dosagem) {
        markAsChanged("DOSAGEM", dosagem);
   }

   public BigDecimal getDosagemPor() {
        return this.getVo().asBigDecimal("DOSAGEMPOR");
   }

   public void setDosagemPor(BigDecimal dosagemPor) {
        markAsChanged("DOSAGEMPOR", dosagemPor);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtAlterEmq() {
        return this.getVo().asTimestamp("DTALTEREMQ");
   }

   public void setDtAlterEmq(Timestamp dtAlterEmq) {
        markAsChanged("DTALTEREMQ", dtAlterEmq);
   }

   public Timestamp getDtAlterEsq() {
        return this.getVo().asTimestamp("DTALTERESQ");
   }

   public void setDtAlterEsq(Timestamp dtAlterEsq) {
        markAsChanged("DTALTERESQ", dtAlterEsq);
   }

   public String getDtValDif() {
        return this.getVo().asString("DTVALDIF");
   }

   public void setDtValDif(String dtValDif) {
        markAsChanged("DTVALDIF", dtValDif);
   }

   public String getEndImagem() {
        return this.getVo().asString("ENDIMAGEM");
   }

   public void setEndImagem(String endImagem) {
        markAsChanged("ENDIMAGEM", endImagem);
   }

   public String getEndModRotulo() {
        return this.getVo().asString("ENDMODROTULO");
   }

   public void setEndModRotulo(String endModRotulo) {
        markAsChanged("ENDMODROTULO", endModRotulo);
   }

   public String getEpocaAplic() {
        return this.getVo().asString("EPOCAAPLIC");
   }

   public void setEpocaAplic(String epocaAplic) {
        markAsChanged("EPOCAAPLIC", epocaAplic);
   }

   public BigDecimal getEspessura() {
        return this.getVo().asBigDecimal("ESPESSURA");
   }

   public void setEspessura(BigDecimal espessura) {
        markAsChanged("ESPESSURA", espessura);
   }

   public BigDecimal getEstMax() {
        return this.getVo().asBigDecimal("ESTMAX");
   }

   public void setEstMax(BigDecimal estMax) {
        markAsChanged("ESTMAX", estMax);
   }

   public BigDecimal getEstMaxDias() {
        return this.getVo().asBigDecimal("ESTMAXDIAS");
   }

   public void setEstMaxDias(BigDecimal estMaxDias) {
        markAsChanged("ESTMAXDIAS", estMaxDias);
   }

   public BigDecimal getEstMaxQtd() {
        return this.getVo().asBigDecimal("ESTMAXQTD");
   }

   public void setEstMaxQtd(BigDecimal estMaxQtd) {
        markAsChanged("ESTMAXQTD", estMaxQtd);
   }

   public BigDecimal getEstMin() {
        return this.getVo().asBigDecimal("ESTMIN");
   }

   public void setEstMin(BigDecimal estMin) {
        markAsChanged("ESTMIN", estMin);
   }

   public BigDecimal getEstSegDias() {
        return this.getVo().asBigDecimal("ESTSEGDIAS");
   }

   public void setEstSegDias(BigDecimal estSegDias) {
        markAsChanged("ESTSEGDIAS", estSegDias);
   }

   public BigDecimal getEstSegQtd() {
        return this.getVo().asBigDecimal("ESTSEGQTD");
   }

   public void setEstSegQtd(BigDecimal estSegQtd) {
        markAsChanged("ESTSEGQTD", estSegQtd);
   }

   public String getExcluirConf() {
        return this.getVo().asString("EXCLUIRCONF");
   }

   public void setExcluirConf(String excluirConf) {
        markAsChanged("EXCLUIRCONF", excluirConf);
   }

   public String getExigeBenefic() {
        return this.getVo().asString("EXIGEBENEFIC");
   }

   public void setExigeBenefic(String exigeBenefic) {
        markAsChanged("EXIGEBENEFIC", exigeBenefic);
   }

   public String getFabricante() {
        return this.getVo().asString("FABRICANTE");
   }

   public void setFabricante(String fabricante) {
        markAsChanged("FABRICANTE", fabricante);
   }

   public String getFatTotal() {
        return this.getVo().asString("FATTOTAL");
   }

   public void setFatTotal(String fatTotal) {
        markAsChanged("FATTOTAL", fatTotal);
   }

   public String getFlex() {
        return this.getVo().asString("FLEX");
   }

   public void setFlex(String flex) {
        markAsChanged("FLEX", flex);
   }

   public String getFormulacao() {
        return this.getVo().asString("FORMULACAO");
   }

   public void setFormulacao(String formulacao) {
        markAsChanged("FORMULACAO", formulacao);
   }

   public String getGeraPlProd() {
        return this.getVo().asString("GERAPLAPROD");
   }

   public void setGeraPlProd(String geraPlProd) {
        markAsChanged("GERAPLAPROD", geraPlProd);
   }

   public String getGrupoCofins() {
        return this.getVo().asString("GRUPOCOFINS");
   }

   public void setGrupoCofins(String grupoCofins) {
        markAsChanged("GRUPOCOFINS", grupoCofins);
   }

   public String getGrupoCssl() {
        return this.getVo().asString("GRUPOCSSL");
   }

   public void setGrupoCssl(String grupoCssl) {
        markAsChanged("GRUPOCSSL", grupoCssl);
   }

   public String getGrupoDescProd() {
        return this.getVo().asString("GRUPODESCPROD");
   }

   public void setGrupoDescProd(String grupoDescProd) {
        markAsChanged("GRUPODESCPROD", grupoDescProd);
   }

   public BigDecimal getGrupoIcms() {
        return this.getVo().asBigDecimal("GRUPOICMS");
   }

   public void setGrupoIcms(BigDecimal grupoIcms) {
        markAsChanged("GRUPOICMS", grupoIcms);
   }

   public String getGrupoPis() {
        return this.getVo().asString("GRUPOPIS");
   }

   public void setGrupoPis(String grupoPis) {
        markAsChanged("GRUPOPIS", grupoPis);
   }

   public BigDecimal getGrupoQuimico() {
        return this.getVo().asBigDecimal("GRUPOQUIMICO");
   }

   public void setGrupoQuimico(BigDecimal grupoQuimico) {
        markAsChanged("GRUPOQUIMICO", grupoQuimico);
   }

   public String getHomePage() {
        return this.getVo().asString("HOMEPAGE");
   }

   public void setHomePage(String homePage) {
        markAsChanged("HOMEPAGE", homePage);
   }

   public String getHrDobrada() {
        return this.getVo().asString("HRDOBRADA");
   }

   public void setHrDobrada(String hrDobrada) {
        markAsChanged("HRDOBRADA", hrDobrada);
   }

   public String getIcmsGerencia() {
        return this.getVo().asString("ICMSGERENCIA");
   }

   public void setIcmsGerencia(String icmsGerencia) {
        markAsChanged("ICMSGERENCIA", icmsGerencia);
   }

   public BigDecimal getIdenImob() {
        return this.getVo().asBigDecimal("IDENTIMOB");
   }

   public void setIdenImob(BigDecimal idenImob) {
        markAsChanged("IDENTIMOB", idenImob);
   }

   public byte[] getImagem() {
        return this.getVo().asBlob("IMAGEM");
   }

   public void setImagem(byte[] imagem) {
        markAsChanged("IMAGEM", imagem);
   }

   public String getImpEtiqConf() {
        return this.getVo().asString("IMPETIQCONF");
   }

   public void setImpEtiqConf(String impEtiqConf) {
        markAsChanged("IMPETIQCONF", impEtiqConf);
   }

   public String getImplAudLote() {
        return this.getVo().asString("IMPLAUDOLOTE");
   }

   public void setImplAudLote(String implAudLote) {
        markAsChanged("IMPLAUDOLOTE", implAudLote);
   }

   public String getImpOrdemCorte() {
        return this.getVo().asString("IMPORDEMCORTE");
   }

   public void setImpOrdemCorte(String impOrdemCorte) {
        markAsChanged("IMPORDEMCORTE", impOrdemCorte);
   }

   public String getIndEspProdEpe() {
        return this.getVo().asString("INDESPPRODEPE");
   }

   public void setIndEspProdEpe(String indEspProdEpe) {
        markAsChanged("INDESPPRODEPE", indEspProdEpe);
   }

   public String getInfPureza() {
        return this.getVo().asString("INFPUREZA");
   }

   public void setInfPureza(String infPureza) {
        markAsChanged("INFPUREZA", infPureza);
   }

   public BigDecimal getIntervalo() {
        return this.getVo().asBigDecimal("INTERVALO");
   }

   public void setIntervalo(BigDecimal intervalo) {
        markAsChanged("INTERVALO", intervalo);
   }

   public BigDecimal getLargura() {
        return this.getVo().asBigDecimal("LARGURA");
   }

   public void setLargura(BigDecimal largura) {
        markAsChanged("LARGURA", largura);
   }

   public BigDecimal getLastro() {
        return this.getVo().asBigDecimal("LASTRO");
   }

   public void setLastro(BigDecimal lastro) {
        markAsChanged("LASTRO", lastro);
   }

   public BigDecimal getLeadTime() {
        return this.getVo().asBigDecimal("LEADTIME");
   }

   public void setLeadTime(BigDecimal leadTime) {
        markAsChanged("LEADTIME", leadTime);
   }

   public String getCodAutCodif() {
        return this.getVo().asString("CODAUTCODIF");
   }

   public void setCodAutCodif(String codAutCodif) {
        markAsChanged("CODAUTCODIF", codAutCodif);
   }

   public String getCodBarBalanca() {
        return this.getVo().asString("CODBARBALANCA");
   }

   public void setCodBarBalanca(String codBarBalanca) {
        markAsChanged("CODBARBALANCA", codBarBalanca);
   }

   public BigDecimal getCodCenCus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        markAsChanged("CODCENCUS", codCenCus);
   }

   public BigDecimal getCodCos() {
        return this.getVo().asBigDecimal("CODCOS");
   }

   public void setCodCos(BigDecimal codCos) {
        markAsChanged("CODCOS", codCos);
   }

   public BigDecimal getCodCtaCtb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
   }

   public BigDecimal getCodCtaCtb2() {
        return this.getVo().asBigDecimal("CODCTACTB2");
   }

   public void setCodCtaCtb2(BigDecimal codCtaCtb2) {
        markAsChanged("CODCTACTB2", codCtaCtb2);
   }

   public BigDecimal getCodCtaCtb3() {
        return this.getVo().asBigDecimal("CODCTACTB3");
   }

   public void setCodCtaCtb3(BigDecimal codCtaCtb3) {
        markAsChanged("CODCTACTB3", codCtaCtb3);
   }

   public BigDecimal getCodCtaCtb4() {
        return this.getVo().asBigDecimal("CODCTACTB4");
   }

   public void setCodCtaCtb4(BigDecimal codCtaCtb4) {
        markAsChanged("CODCTACTB4", codCtaCtb4);
   }

   public String getCodFci() {
        return this.getVo().asString("CODFCI");
   }

   public void setCodFci(String codFci) {
        markAsChanged("CODFCI", codFci);
   }

   public BigDecimal getCodFiltro() {
        return this.getVo().asBigDecimal("CODFILTRO");
   }

   public void setCodFiltro(BigDecimal codFiltro) {
        markAsChanged("CODFILTRO", codFiltro);
   }

   public String getTipoKit() {
        return this.getVo().asString("TIPOKIT");
   }

   public void setTipoKit(String tipoKit) {
        markAsChanged("TIPOKIT", tipoKit);
   }

   public BigDecimal getCodConfKit() {
        return this.getVo().asBigDecimal("CODCONFKIT");
   }

   public void setCodConfKit(BigDecimal codConfKit) {
        markAsChanged("CODCONFKIT", codConfKit);
   }

   public BigDecimal getCodExNcm() {
        return this.getVo().asBigDecimal("CODEXNCM");
   }

   public void setCodExNcm(BigDecimal codExNcm) {
        markAsChanged("CODEXNCM", codExNcm);
   }

   public BigDecimal getPercInss() {
        return this.getVo().asBigDecimal("PERCINSS");
   }

   public void setPercInss(BigDecimal percInss) {
        markAsChanged("PERCINSS", percInss);
   }

   public BigDecimal getPercIrf() {
        return this.getVo().asBigDecimal("PERCIRF");
   }

   public void setPercIrf(BigDecimal percIrf) {
        markAsChanged("PERCIRF", percIrf);
   }

   public BigDecimal getPercQuebraTec() {
        return this.getVo().asBigDecimal("PERCQUEBRATEC");
   }

   public void setPercQuebraTec(BigDecimal percQuebraTec) {
        markAsChanged("PERCQUEBRATEC", percQuebraTec);
   }

   public String getPermCompProd() {
        return this.getVo().asString("PERMCOMPPROD");
   }

   public void setPermCompProd(String permCompProd) {
        markAsChanged("PERMCOMPPROD", permCompProd);
   }

   public BigDecimal getPesoBruto() {
        return this.getVo().asBigDecimal("PESOBRUTO");
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
   }

   public BigDecimal getPesoLiq() {
        return this.getVo().asBigDecimal("PESOLIQ");
   }

   public void setPesoLiq(BigDecimal pesoLiq) {
        markAsChanged("PESOLIQ", pesoLiq);
   }

   public BigDecimal getPrazoVal() {
        return this.getVo().asBigDecimal("PRAZOVAL");
   }

   public void setPrazoVal(BigDecimal prazoVal) {
        markAsChanged("PRAZOVAL", prazoVal);
   }

   public BigDecimal getPrincAtivo() {
        return this.getVo().asBigDecimal("PRINCATIVO");
   }

   public void setPrincAtivo(BigDecimal princAtivo) {
        markAsChanged("PRINCATIVO", princAtivo);
   }

   public BigDecimal getProdutoNfe() {
        return this.getVo().asBigDecimal("PRODUTONFE");
   }

   public void setProdutoNfe(BigDecimal produtoNfe) {
        markAsChanged("PRODUTONFE", produtoNfe);
   }

   public String getPromocao() {
        return this.getVo().asString("PROMOCAO");
   }

   public void setPromocao(String promocao) {
        markAsChanged("PROMOCAO", promocao);
   }

   public BigDecimal getQtdEmb() {
        return this.getVo().asBigDecimal("QTDEMB");
   }

   public void setQtdEmb(BigDecimal qtdEmb) {
        markAsChanged("QTDEMB", qtdEmb);
   }

   public BigDecimal getQtdNfLaudosInt() {
        return this.getVo().asBigDecimal("QTDNFLAUDOSINT");
   }

   public void setQtdNfLaudosInt(BigDecimal qtdNfLaudosInt) {
        markAsChanged("QTDNFLAUDOSINT", qtdNfLaudosInt);
   }

   public String getRastrEstoque() {
        return this.getVo().asString("RASTRESTOQUE");
   }

   public void setRastrEstoque(String rastrEstoque) {
        markAsChanged("RASTRESTOQUE", rastrEstoque);
   }

   public String getReceituario() {
        return this.getVo().asString("RECEITUARIO");
   }

   public void setReceituario(String receituario) {
        markAsChanged("RECEITUARIO", receituario);
   }

   public String getRecupAvaria() {
        return this.getVo().asString("RECUPAVARIA");
   }

   public void setRecupAvaria(String recupAvaria) {
        markAsChanged("RECUPAVARIA", recupAvaria);
   }

   public BigDecimal getRedBaseInss() {
        return this.getVo().asBigDecimal("REDBASEINSS");
   }

   public void setRedBaseInss(BigDecimal redBaseInss) {
        markAsChanged("REDBASEINSS", redBaseInss);
   }

   public BigDecimal getRedBaseIrf() {
        return this.getVo().asBigDecimal("REDBASEIRF");
   }

   public void setRedBaseIrf(BigDecimal redBaseIrf) {
        markAsChanged("REDBASEIRF", redBaseIrf);
   }

   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public String getRefForn() {
        return this.getVo().asString("REFFORN");
   }

   public void setRefForn(String refForn) {
        markAsChanged("REFFORN", refForn);
   }

   public String getRegraWms() {
        return this.getVo().asString("REGRAWMS");
   }

   public void setRegraWms(String regraWms) {
        markAsChanged("REGRAWMS", regraWms);
   }

   public String getRemeter() {
        return this.getVo().asString("REMETER");
   }

   public void setRemeter(String remeter) {
        markAsChanged("REMETER", remeter);
   }

   public String getRendimento() {
        return this.getVo().asString("RENDIMENTO");
   }

   public void setRendimento(String rendimento) {
        markAsChanged("RENDIMENTO", rendimento);
   }

   public BigDecimal getRendimentoHa() {
        return this.getVo().asBigDecimal("RENDIMENTOHA");
   }

   public void setRendimentoHa(BigDecimal rendimentoHa) {
        markAsChanged("RENDIMENTOHA", rendimentoHa);
   }

   public String getSelecionado() {
        return this.getVo().asString("SELECIONADO");
   }

   public void setSelecionado(String selecionado) {
        markAsChanged("SELECIONADO", selecionado);
   }

   public BigDecimal getShelfLife() {
        return this.getVo().asBigDecimal("SHELFLIFE");
   }

   public void setShelfLife(BigDecimal shelfLife) {
        markAsChanged("SHELFLIFE", shelfLife);
   }

   public BigDecimal getShelfLifeMin() {
        return this.getVo().asBigDecimal("SHELFLIFEMIN");
   }

   public void setShelfLifeMin(BigDecimal shelfLifeMin) {
        markAsChanged("SHELFLIFEMIN", shelfLifeMin);
   }

   public String getSolCompra() {
        return this.getVo().asString("SOLCOMPRA");
   }

   public void setSolCompra(String solCompra) {
        markAsChanged("SOLCOMPRA", solCompra);
   }

   public String getStatusIncexc() {
        return this.getVo().asString("STATUSINCEXC");
   }

   public void setStatusIncexc(String statusIncexc) {
        markAsChanged("STATUSINCEXC", statusIncexc);
   }

   public BigDecimal getTamLote() {
        return this.getVo().asBigDecimal("TAMLOTE");
   }

   public void setTamLote(BigDecimal tamLote) {
        markAsChanged("TAMLOTE", tamLote);
   }

   public BigDecimal getTamSerie() {
        return this.getVo().asBigDecimal("TAMSERIE");
   }

   public void setTamSerie(BigDecimal tamSerie) {
        markAsChanged("TAMSERIE", tamSerie);
   }

   public String getTemCiap() {
        return this.getVo().asString("TEMCIAP");
   }

   public void setTemCiap(String temCiap) {
        markAsChanged("TEMCIAP", temCiap);
   }

   public String getTemComissao() {
        return this.getVo().asString("TEMCOMISSAO");
   }

   public void setTemComissao(String temComissao) {
        markAsChanged("TEMCOMISSAO", temComissao);
   }

   public String getTemCredPisCofinsDepr() {
        return this.getVo().asString("TEMCREDPISCOFINSDEPR");
   }

   public void setTemCredPisCofinsDepr(String temCredPisCofinsDepr) {
        markAsChanged("TEMCREDPISCOFINSDEPR", temCredPisCofinsDepr);
   }

   public String getTemIcms() {
        return this.getVo().asString("TEMICMS");
   }

   public void setTemIcms(String temIcms) {
        markAsChanged("TEMICMS", temIcms);
   }

   public String getTemInss() {
        return this.getVo().asString("TEMINSS");
   }

   public void setTemInss(String temInss) {
        markAsChanged("TEMINSS", temInss);
   }

   public String getTemIpiCompra() {
        return this.getVo().asString("TEMIPICOMPRA");
   }

   public void setTemIpiCompra(String temIpiCompra) {
        markAsChanged("TEMIPICOMPRA", temIpiCompra);
   }

   public String getTemIpiVenda() {
        return this.getVo().asString("TEMIPIVENDA");
   }

   public void setTemIpiVenda(String temIpiVenda) {
        markAsChanged("TEMIPIVENDA", temIpiVenda);
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

   public Timestamp getTempoServ() {
        return this.getVo().asTimestamp("TEMPOSERV");
   }

   public void setTempoServ(Timestamp tempoServ) {
        markAsChanged("TEMPOSERV", tempoServ);
   }

   public String getTipContEst() {
        return this.getVo().asString("TIPCONTEST");
   }

   public void setTipContEst(String tipContEst) {
        markAsChanged("TIPCONTEST", tipContEst);
   }

   public String getTipContEstWms() {
        return this.getVo().asString("TIPCONTESTWMS");
   }

   public void setTipContEstWms(String tipContEstWms) {
        markAsChanged("TIPCONTESTWMS", tipContEstWms);
   }

   public BigDecimal getTipGtinNfe() {
        return this.getVo().asBigDecimal("TIPGTINNFE");
   }

   public void setTipGtinNfe(BigDecimal tipGtinNfe) {
        markAsChanged("TIPGTINNFE", tipGtinNfe);
   }

   public String getTipLancNota() {
        return this.getVo().asString("TIPLANCNOTA");
   }

   public void setTipLancNota(String tipLancNota) {
        markAsChanged("TIPLANCNOTA", tipLancNota);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getTipSerNfe() {
        return this.getVo().asString("TIPSERNFE");
   }

   public void setTipSerNfe(String tipSerNfe) {
        markAsChanged("TIPSERNFE", tipSerNfe);
   }

   public String getTipSubst() {
        return this.getVo().asString("TIPSUBST");
   }

   public void setTipSubst(String tipSubst) {
        markAsChanged("TIPSUBST", tipSubst);
   }

   public String getTitContEst() {
        return this.getVo().asString("TITCONTEST");
   }

   public void setTitContEst(String titContEst) {
        markAsChanged("TITCONTEST", titContEst);
   }

   public String getUnidade() {
        return this.getVo().asString("UNIDADE");
   }

   public void setUnidade(String unidade) {
        markAsChanged("UNIDADE", unidade);
   }

   public String getUnidMinArmaz() {
        return this.getVo().asString("UNIDMINARMAZ");
   }

   public void setUnidMinArmaz(String unidMinArmaz) {
        markAsChanged("UNIDMINARMAZ", unidMinArmaz);
   }

   public String getUsaCodBarrasQtd() {
        return this.getVo().asString("USACODBARRASQTD");
   }

   public void setUsaCodBarrasQtd(String usaCodBarrasQtd) {
        markAsChanged("USACODBARRASQTD", usaCodBarrasQtd);
   }

   public String getUsaImpAgrupMin() {
        return this.getVo().asString("USAIMPAGRUPMIN");
   }

   public void setUsaImpAgrupMin(String usaImpAgrupMin) {
        markAsChanged("USAIMPAGRUPMIN", usaImpAgrupMin);
   }

   public String getUsaLocal() {
        return this.getVo().asString("USALOCAL");
   }

   public void setUsaLocal(String usaLocal) {
        markAsChanged("USALOCAL", usaLocal);
   }

   public String getUsaSerieFab() {
        return this.getVo().asString("USASERIEFAB");
   }

   public void setUsaSerieFab(String usaSerieFab) {
        markAsChanged("USASERIEFAB", usaSerieFab);
   }

   public String getUsaSerieSepWms() {
        return this.getVo().asString("USASERIESEPWMS");
   }

   public void setUsaSerieSepWms(String usaSerieSepWms) {
        markAsChanged("USASERIESEPWMS", usaSerieSepWms);
   }

   public String getUsaStatusLote() {
        return this.getVo().asString("USASTATUSLOTE");
   }

   public void setUsaStatusLote(String usaStatusLote) {
        markAsChanged("USASTATUSLOTE", usaStatusLote);
   }

   public String getUsoProd() {
        return this.getVo().asString("USOPROD");
   }

   public void setUsoProd(String usoProd) {
        markAsChanged("USOPROD", usoProd);
   }

   public BigDecimal getUtilImob() {
        return this.getVo().asBigDecimal("UTILIMOB");
   }

   public void setUtilImob(BigDecimal utilImob) {
        markAsChanged("UTILIMOB", utilImob);
   }

   public String getUtilizaWms() {
        return this.getVo().asString("UTILIZAWMS");
   }

   public void setUtilizaWms(String utilizaWms) {
        markAsChanged("UTILIZAWMS", utilizaWms);
   }

   public String getValCapM3() {
        return this.getVo().asString("VALCAPM3");
   }

   public void setValCapM3(String valCapM3) {
        markAsChanged("VALCAPM3", valCapM3);
   }

   public String getValCbGlobal() {
        return this.getVo().asString("VALCBGLOBAL");
   }

   public void setValCbGlobal(String valCbGlobal) {
        markAsChanged("VALCBGLOBAL", valCbGlobal);
   }

   public String getVenCompIndiv() {
        return this.getVo().asString("VENCOMPINDIV");
   }

   public void setVenCompIndiv(String venCompIndiv) {
        markAsChanged("VENCOMPINDIV", venCompIndiv);
   }

   public BigDecimal getVlrComerc() {
        return this.getVo().asBigDecimal("VLRCOMERC");
   }

   public void setVlrComerc(BigDecimal vlrComerc) {
        markAsChanged("VLRCOMERC", vlrComerc);
   }

   public BigDecimal getVlrParcImpExt() {
        return this.getVo().asBigDecimal("VLRPARCIMPEXT");
   }

   public void setVlrParcImpExt(BigDecimal vlrParcImpExt) {
        markAsChanged("VLRPARCIMPEXT", vlrParcImpExt);
   }

   public String getVolDosagem() {
        return this.getVo().asString("VOLDOSAGEM");
   }

   public void setVolDosagem(String volDosagem) {
        markAsChanged("VOLDOSAGEM", volDosagem);
   }

   public String getVolDosagemPor() {
        return this.getVo().asString("VOLDOSAGEMPOR");
   }

   public void setVolDosagemPor(String volDosagemPor) {
        markAsChanged("VOLDOSAGEMPOR", volDosagemPor);
   }

   public BigDecimal getPercTolPesoMenorSep() {
        return this.getVo().asBigDecimal("PERCTOLPESOMENORSEP");
   }

   public void setPercTolPesoMenorSep(BigDecimal percTolPesoMenorSep) {
        markAsChanged("PERCTOLPESOMENORSEP", percTolPesoMenorSep);
   }

   public String getUsaLoteDtFab() {
        return this.getVo().asString("USALOTEDTFAB");
   }

   public void setUsaLoteDtFab(String usaLoteDtFab) {
        markAsChanged("USALOTEDTFAB", usaLoteDtFab);
   }

   public String getUsaLoteDtVal() {
        return this.getVo().asString("USALOTEDTVAL");
   }

   public void setUsaLoteDtVal(String usaLoteDtVal) {
        markAsChanged("USALOTEDTVAL", usaLoteDtVal);
   }

   public String getDescVenConsul() {
        return this.getVo().asString("DESCVENCONSUL");
   }

   public void setDescVenConsul(String descVenConsul) {
        markAsChanged("DESCVENCONSUL", descVenConsul);
   }

   public BigDecimal getCodFiltroReq() {
        return this.getVo().asBigDecimal("CODFILTROREQ");
   }

   public void setCodFiltroReq(BigDecimal codFiltroReq) {
        markAsChanged("CODFILTROREQ", codFiltroReq);
   }

   public String getControlMedic() {
        return this.getVo().asString("CONTROLMEDIC");
   }

   public void setControlMedic(String controlMedic) {
        markAsChanged("CONTROLMEDIC", controlMedic);
   }

   public BigDecimal getCodEnqIpiEnt() {
        return this.getVo().asBigDecimal("CODENQIPIENT");
   }

   public void setCodEnqIpiEnt(BigDecimal codEnqIpiEnt) {
        markAsChanged("CODENQIPIENT", codEnqIpiEnt);
   }

   public BigDecimal getCodEnqIpiSai() {
        return this.getVo().asBigDecimal("CODENQIPISAI");
   }

   public void setCodEnqIpiSai(BigDecimal codEnqIpiSai) {
        markAsChanged("CODENQIPISAI", codEnqIpiSai);
   }

   public BigDecimal getAliqGeral() {
        return this.getVo().asBigDecimal("ALIQGERAL");
   }

   public void setAliqGeral(BigDecimal aliqGeral) {
        markAsChanged("ALIQGERAL", aliqGeral);
   }

   public BigDecimal getMvaPadrao() {
        return this.getVo().asBigDecimal("MVAPADRAO");
   }

   public void setMvaPadrao(BigDecimal mvaPadrao) {
        markAsChanged("MVAPADRAO", mvaPadrao);
   }

   public BigDecimal getGrupoIcms2() {
        return this.getVo().asBigDecimal("GRUPOICMS2");
   }

   public void setGrupoIcms2(BigDecimal grupoIcms2) {
        markAsChanged("GRUPOICMS2", grupoIcms2);
   }

   public String getUsaContPesoVar() {
        return this.getVo().asString("USACONTPESOVAR");
   }

   public void setUsaContPesoVar(String usaContPesoVar) {
        markAsChanged("USACONTPESOVAR", usaContPesoVar);
   }

   public BigDecimal getPercTolPesoMaior() {
        return this.getVo().asBigDecimal("PERCTOLPESOMAIOR");
   }

   public void setPercTolPesoMaior(BigDecimal percTolPesoMaior) {
        markAsChanged("PERCTOLPESOMAIOR", percTolPesoMaior);
   }

   public BigDecimal getPercTolPesoMaiorSep() {
        return this.getVo().asBigDecimal("PERCTOLPESOMAIORSEP");
   }

   public void setPercTolPesoMaiorSep(BigDecimal percTolPesoMaiorSep) {
        markAsChanged("PERCTOLPESOMAIORSEP", percTolPesoMaiorSep);
   }

   public BigDecimal getPercTolPesoMenor() {
        return this.getVo().asBigDecimal("PERCTOLPESOMENOR");
   }

   public void setPercTolPesoMenor(BigDecimal percTolPesoMenor) {
        markAsChanged("PERCTOLPESOMENOR", percTolPesoMenor);
   }

   public String getCodVolPesoVar() {
        return this.getVo().asString("CODVOLPESOVAR");
   }

   public void setCodVolPesoVar(String codVolPesoVar) {
        markAsChanged("CODVOLPESOVAR", codVolPesoVar);
   }

   public BigDecimal getPercCmtImp() {
        return this.getVo().asBigDecimal("PERCCMTIMP");
   }

   public void setPercCmtImp(BigDecimal percCmtImp) {
        markAsChanged("PERCCMTIMP", percCmtImp);
   }

   public BigDecimal getPercCmtNac() {
        return this.getVo().asBigDecimal("PERCCMTNAC");
   }

   public void setPercCmtNac(BigDecimal percCmtNac) {
        markAsChanged("PERCCMTNAC", percCmtNac);
   }

   public String getSerFaturCon() {
        return this.getVo().asString("SERFATURCON");
   }

   public void setSerFaturCon(String serFaturCon) {
        markAsChanged("SERFATURCON", serFaturCon);
   }

   public BigDecimal getTopFaturCon() {
        return this.getVo().asBigDecimal("TOPFATURCON");
   }

   public void setTopFaturCon(BigDecimal topFaturCon) {
        markAsChanged("TOPFATURCON", topFaturCon);
   }

   public BigDecimal getNumItemRea() {
        return this.getVo().asBigDecimal("NUMITEMREA");
   }

   public void setNumItemRea(BigDecimal numItemRea) {
        markAsChanged("NUMITEMREA", numItemRea);
   }

   public String getObsEtiqueta() {
        return this.getVo().asString("OBSETIQUETA");
   }

   public void setObsEtiqueta(String obsEtiqueta) {
        markAsChanged("OBSETIQUETA", obsEtiqueta);
   }

   public String getOrigProd() {
        return this.getVo().asString("ORIGPROD");
   }

   public void setOrigProd(String origProd) {
        markAsChanged("ORIGPROD", origProd);
   }

   public String getPadrao() {
        return this.getVo().asString("PADRAO");
   }

   public void setPadrao(String padrao) {
        markAsChanged("PADRAO", padrao);
   }

   public BigDecimal getPercAumentCusto() {
        return this.getVo().asBigDecimal("PERCAUMENTCUSTO");
   }

   public void setPercAumentCusto(BigDecimal percAumentCusto) {
        markAsChanged("PERCAUMENTCUSTO", percAumentCusto);
   }

   public String getExigeLastroCamadas() {
        return this.getVo().asString("EXIGELASTROCAMADAS");
   }

   public void setExigeLastroCamadas(String exigeLastroCamadas) {
        markAsChanged("EXIGELASTROCAMADAS", exigeLastroCamadas);
   }

   public String getFixoAgenda() {
        return this.getVo().asString("FIXOAGENDA");
   }

   public void setFixoAgenda(String fixoAgenda) {
        markAsChanged("FIXOAGENDA", fixoAgenda);
   }

   public Timestamp getDtSubst() {
        return this.getVo().asTimestamp("DTSUBST");
   }

   public void setDtSubst(Timestamp dtSubst) {
        markAsChanged("DTSUBST", dtSubst);
   }

   public BigDecimal getCodProdSubst() {
        return this.getVo().asBigDecimal("CODPRODSUBST");
   }

   public void setCodProdSubst(BigDecimal codProdSubst) {
        markAsChanged("CODPRODSUBST", codProdSubst);
   }

   public String getCat1799Spres() {
        return this.getVo().asString("CAT1799SPRES");
   }

   public void setCat1799Spres(String cat1799Spres) {
        markAsChanged("CAT1799SPRES", cat1799Spres);
   }

   public BigDecimal getCodComp() {
        return this.getVo().asBigDecimal("CODCOMP");
   }

   public void setCodComp(BigDecimal codComp) {
        markAsChanged("CODCOMP", codComp);
   }

   public String getVisivelAppOs() {
        return this.getVo().asString("VISIVELAPPOS");
   }

   public void setVisivelAppOs(String visivelAppOs) {
        markAsChanged("VISIVELAPPOS", visivelAppOs);
   }

   public BigDecimal getCodParcConsig() {
        return this.getVo().asBigDecimal("CODPARCCONSIG");
   }

   public void setCodParcConsig(BigDecimal codParcConsig) {
        markAsChanged("CODPARCCONSIG", codParcConsig);
   }

   public String getTipoItemSped() {
        return this.getVo().asString("TIPOITEMSPED");
   }

   public void setTipoItemSped(String tipoItemSped) {
        markAsChanged("TIPOITEMSPED", tipoItemSped);
   }

   public BigDecimal getCodIdCnae() {
        return this.getVo().asBigDecimal("CODIDCNAE");
   }

   public void setCodIdCnae(BigDecimal codIdCnae) {
        markAsChanged("CODIDCNAE", codIdCnae);
   }

   public BigDecimal getCodNbs() {
        return this.getVo().asBigDecimal("CODNBS");
   }

   public void setCodNbs(BigDecimal codNbs) {
        markAsChanged("CODNBS", codNbs);
   }

   public String getConsProdCat42() {
        return this.getVo().asString("CONSPRODCAT42");
   }

   public void setConsProdCat42(String consProdCat42) {
        markAsChanged("CONSPRODCAT42", consProdCat42);
   }

   public BigDecimal getDesvioMaxTolConfSep() {
        return this.getVo().asBigDecimal("DESVIOMAXTOLCONFSEP");
   }

   public void setDesvioMaxTolConfSep(BigDecimal desvioMaxTolConfSep) {
        markAsChanged("DESVIOMAXTOLCONFSEP", desvioMaxTolConfSep);
   }

   public BigDecimal getDesvioMinTolConfSep() {
        return this.getVo().asBigDecimal("DESVIOMINTOLCONFSEP");
   }

   public void setDesvioMinTolConfSep(BigDecimal desvioMinTolConfSep) {
        markAsChanged("DESVIOMINTOLCONFSEP", desvioMinTolConfSep);
   }

   public String getFragmentaLote() {
        return this.getVo().asString("FRAGMENTALOTE");
   }

   public void setFragmentaLote(String fragmentaLote) {
        markAsChanged("FRAGMENTALOTE", fragmentaLote);
   }

   public BigDecimal getGrupoTransg() {
        return this.getVo().asBigDecimal("GRUPOTRANSG");
   }

   public void setGrupoTransg(BigDecimal grupoTransg) {
        markAsChanged("GRUPOTRANSG", grupoTransg);
   }

   public String getMotIsencaoAnvisa() {
        return this.getVo().asString("MOTISENCAOANVISA");
   }

   public void setMotIsencaoAnvisa(String motIsencaoAnvisa) {
        markAsChanged("MOTISENCAOANVISA", motIsencaoAnvisa);
   }

   public BigDecimal getPercRedBaseIcmsEfet() {
        return this.getVo().asBigDecimal("PERCREDBASEICMSEFET");
   }

   public void setPercRedBaseIcmsEfet(BigDecimal percRedBaseIcmsEfet) {
        markAsChanged("PERCREDBASEICMSEFET", percRedBaseIcmsEfet);
   }

   public String getRegistrarPeso() {
        return this.getVo().asString("REGISTRARPESO");
   }

   public void setRegistrarPeso(String registrarPeso) {
        markAsChanged("REGISTRARPESO", registrarPeso);
   }

   public String getServPrestTer() {
        return this.getVo().asString("SERVPRESTTER");
   }

   public void setServPrestTer(String servPrestTer) {
        markAsChanged("SERVPRESTTER", servPrestTer);
   }

   public BigDecimal getTempMaxima() {
        return this.getVo().asBigDecimal("TEMPMAXIMA");
   }

   public void setTempMaxima(BigDecimal tempMaxima) {
        markAsChanged("TEMPMAXIMA", tempMaxima);
   }

   public String getControlado() {
        return this.getVo().asString("CONTROLADO");
   }

   public void setControlado(String controlado) {
        markAsChanged("CONTROLADO", controlado);
   }

   public BigDecimal getTempMinima() {
        return this.getVo().asBigDecimal("TEMPMINIMA");
   }

   public void setTempMinima(BigDecimal tempMinima) {
        markAsChanged("TEMPMINIMA", tempMinima);
   }

   public String getTermolabil() {
        return this.getVo().asString("TERMOLABIL");
   }

   public void setTermolabil(String termolabil) {
        markAsChanged("TERMOLABIL", termolabil);
   }

   public String getListaLpm() {
        return this.getVo().asString("LISTALPM");
   }

   public void setListaLpm(String listaLpm) {
        markAsChanged("LISTALPM", listaLpm);
   }

   public String getOneroso() {
        return this.getVo().asString("ONEROSO");
   }

   public void setOneroso(String oneroso) {
        markAsChanged("ONEROSO", oneroso);
   }

   public String getRefMercMed() {
        return this.getVo().asString("REFMERCMED");
   }

   public void setRefMercMed(String refMercMed) {
        markAsChanged("REFMERCMED", refMercMed);
   }

   public String getIdenPortaria() {
        return this.getVo().asString("IDENPORTARIA");
   }

   public void setIdenPortaria(String idenPortaria) {
        markAsChanged("IDENPORTARIA", idenPortaria);
   }

   public BigDecimal getCodPat() {
        return this.getVo().asBigDecimal("CODPAT");
   }

   public void setCodPat(BigDecimal codPat) {
        markAsChanged("CODPAT", codPat);
   }

   public BigDecimal getCodTer() {
        return this.getVo().asBigDecimal("CODTER");
   }

   public void setCodTer(BigDecimal codTer) {
        markAsChanged("CODTER", codTer);
   }

   public String getIdenOtc() {
        return this.getVo().asString("IDENOTC");
   }

   public void setIdenOtc(String idenOtc) {
        markAsChanged("IDENOTC", idenOtc);
   }

   public String getIdenCosme() {
        return this.getVo().asString("IDENCOSME");
   }

   public void setIdenCosme(String idenCosme) {
        markAsChanged("IDENCOSME", idenCosme);
   }

   public String getIdenCorRelato() {
        return this.getVo().asString("IDENCORRELATO");
   }

   public void setIdenCorRelato(String idenCorRelato) {
        markAsChanged("IDENCORRELATO", idenCorRelato);
   }

   public BigDecimal getCodCpr() {
        return this.getVo().asBigDecimal("CODCPR");
   }

   public void setCodCpr(BigDecimal codCpr) {
        markAsChanged("CODCPR", codCpr);
   }

   public BigDecimal getSeqSte() {
        return this.getVo().asBigDecimal("SEQSTE");
   }

   public void setSeqSte(BigDecimal seqSte) {
        markAsChanged("SEQSTE", seqSte);
   }

   public BigDecimal getCodCat() {
        return this.getVo().asBigDecimal("CODCAT");
   }

   public void setCodCat(BigDecimal codCat) {
        markAsChanged("CODCAT", codCat);
   }

   public BigDecimal getStatusMed() {
        return this.getVo().asBigDecimal("STATUSMED");
   }

   public void setStatusMed(BigDecimal statusMed) {
        markAsChanged("STATUSMED", statusMed);
   }

   public BigDecimal getSeqSca() {
        return this.getVo().asBigDecimal("SEQSCA");
   }

   public void setSeqSca(BigDecimal seqSca) {
        markAsChanged("SEQSCA", seqSca);
   }

   public String getProdFalta() {
        return this.getVo().asString("PRODFALTA");
   }

   public void setProdFalta(String prodFalta) {
        markAsChanged("PRODFALTA", prodFalta);
   }

   public BigDecimal getCodFab() {
        return this.getVo().asBigDecimal("CODFAB");
   }

   public void setCodFab(BigDecimal codFab) {
        markAsChanged("CODFAB", codFab);
   }

   public BigDecimal getSeqSpr() {
        return this.getVo().asBigDecimal("SEQSPR");
   }

   public void setSeqSpr(BigDecimal seqSpr) {
        markAsChanged("SEQSPR", seqSpr);
   }

   public BigDecimal getQtdIdentif() {
        return this.getVo().asBigDecimal("QTDIDENTIF");
   }

   public void setQtdIdentif(BigDecimal qtdIdentif) {
        markAsChanged("QTDIDENTIF", qtdIdentif);
   }

   public String getTipoIdentif() {
        return this.getVo().asString("TIPOIDENTIF");
   }

   public void setTipoIdentif(String tipoIdentif) {
        markAsChanged("TIPOIDENTIF", tipoIdentif);
   }

   public String getTemMedicao() {
        return this.getVo().asString("TEMMEDICAO");
   }

   public void setTemMedicao(String temMedicao) {
        markAsChanged("TEMMEDICAO", temMedicao);
   }

   public BigDecimal getTipoSn() {
        return this.getVo().asBigDecimal("TIPOSN");
   }

   public void setTipoSn(BigDecimal tipoSn) {
        markAsChanged("TIPOSN", tipoSn);
   }

   public BigDecimal getCodServTelecom() {
        return this.getVo().asBigDecimal("CODSERVTELECOM");
   }

   public void setCodServTelecom(BigDecimal codServTelecom) {
        markAsChanged("CODSERVTELECOM", codServTelecom);
   }

   public String getTipoContagem() {
        return this.getVo().asString("TIPOCONTAGEM");
   }

   public void setTipoContagem(String tipoContagem) {
        markAsChanged("TIPOCONTAGEM", tipoContagem);
   }

   public String getCodAnvisa() {
        return this.getVo().asString("CODANVISA");
   }

   public void setCodAnvisa(String codAnvisa) {
        markAsChanged("CODANVISA", codAnvisa);
   }

   public String getDescrAnp() {
        return this.getVo().asString("DESCRANP");
   }

   public void setDescrAnp(String descrAnp) {
        markAsChanged("DESCRANP", descrAnp);
   }

   public BigDecimal getPercMistGlp() {
        return this.getVo().asBigDecimal("PERCMISTGLP");
   }

   public void setPercMistGlp(BigDecimal percMistGlp) {
        markAsChanged("PERCMISTGLP", percMistGlp);
   }

   public BigDecimal getOrdemMedida() {
        return this.getVo().asBigDecimal("ORDEMMEDIDA");
   }

   public void setOrdemMedida(BigDecimal ordemMedida) {
        markAsChanged("ORDEMMEDIDA", ordemMedida);
   }

   public BigDecimal getCodMarca() {
        return this.getVo().asBigDecimal("CODMARCA");
   }

   public void setCodMarca(BigDecimal codMarca) {
        markAsChanged("CODMARCA", codMarca);
   }

   public String getTemRastroLote() {
        return this.getVo().asString("TEMRASTROLOTE");
   }

   public void setTemRastroLote(String temRastroLote) {
        markAsChanged("TEMRASTROLOTE", temRastroLote);
   }

   public String getArmazeLote() {
        return this.getVo().asString("ARMAZELOTE");
   }

   public void setArmazeLote(String armazeLote) {
        markAsChanged("ARMAZELOTE", armazeLote);
   }

   public BigDecimal getMvaOriginalDrCst() {
        return this.getVo().asBigDecimal("MVAORIGINALDRCST");
   }

   public void setMvaOriginalDrCst(BigDecimal mvaOriginalDrCst) {
        markAsChanged("MVAORIGINALDRCST", mvaOriginalDrCst);
   }

   public String getCodFciCalc() {
        return this.getVo().asString("CODFCICALC");
   }

   public void setCodFciCalc(String codFciCalc) {
        markAsChanged("CODFCICALC", codFciCalc);
   }

   public BigDecimal getVlrComercCalc() {
        return this.getVo().asBigDecimal("VLRCOMERCCALC");
   }

   public void setVlrComercCalc(BigDecimal vlrComercCalc) {
        markAsChanged("VLRCOMERCCALC", vlrComercCalc);
   }

   public BigDecimal getVlrParcImpExtCalc() {
        return this.getVo().asBigDecimal("VLRPARCIMPEXTCALC");
   }

   public void setVlrParcImpExtCalc(BigDecimal vlrParcImpExtCalc) {
        markAsChanged("VLRPARCIMPEXTCALC", vlrParcImpExtCalc);
   }

   public String getCodBarComp() {
        return this.getVo().asString("CODBARCOMP");
   }

   public void setCodBarComp(String codBarComp) {
        markAsChanged("CODBARCOMP", codBarComp);
   }

   public BigDecimal getIncPesoBruto() {
        return this.getVo().asBigDecimal("INCPESOBRUTO");
   }

   public void setIncPesoBruto(BigDecimal incPesoBruto) {
        markAsChanged("INCPESOBRUTO", incPesoBruto);
   }

   public BigDecimal getIncPesoLiquido() {
        return this.getVo().asBigDecimal("INCPESOLIQUIDO");
   }

   public void setIncPesoLiquido(BigDecimal incPesoLiquido) {
        markAsChanged("INCPESOLIQUIDO", incPesoLiquido);
   }

   public BigDecimal getNuRfe() {
        return this.getVo().asBigDecimal("NURFE");
   }

   public void setNuRfe(BigDecimal nuRfe) {
        markAsChanged("NURFE", nuRfe);
   }

   public BigDecimal getModEtiqSepWms() {
        return this.getVo().asBigDecimal("MODETIQSEPWMS");
   }

   public void setModEtiqSepWms(BigDecimal modEtiqSepWms) {
        markAsChanged("MODETIQSEPWMS", modEtiqSepWms);
   }

   public String getImpEtiqSepWms() {
        return this.getVo().asString("IMPETIQSEPWMS");
   }

   public void setImpEtiqSepWms(String impEtiqSepWms) {
        markAsChanged("IMPETIQSEPWMS", impEtiqSepWms);
   }

   public String getNroProcesso() {
        return this.getVo().asString("NROPROCESSO");
   }

   public void setNroProcesso(String nroProcesso) {
        markAsChanged("NROPROCESSO", nroProcesso);
   }

   public BigDecimal getPercCmtMun() {
        return this.getVo().asBigDecimal("PERCCMTMUN");
   }

   public void setPercCmtMun(BigDecimal percCmtMun) {
        markAsChanged("PERCCMTMUN", percCmtMun);
   }

   public BigDecimal getPercCmtFed() {
        return this.getVo().asBigDecimal("PERCCMTFED");
   }

   public void setPercCmtFed(BigDecimal percCmtFed) {
        markAsChanged("PERCCMTFED", percCmtFed);
   }

   public BigDecimal getPercCmtEst() {
        return this.getVo().asBigDecimal("PERCCMTEST");
   }

   public void setPercCmtEst(BigDecimal percCmtEst) {
        markAsChanged("PERCCMTEST", percCmtEst);
   }

   public BigDecimal getCorFontConsPreco() {
        return this.getVo().asBigDecimal("CORFONTCONSPRECO");
   }

   public void setCorFontConsPreco(BigDecimal corFontConsPreco) {
        markAsChanged("CORFONTCONSPRECO", corFontConsPreco);
   }

   public BigDecimal getCorFundoConsPreco() {
        return this.getVo().asBigDecimal("CORFUNDOCONSPRECO");
   }

   public void setCorFundoConsPreco(BigDecimal corFundoConsPreco) {
        markAsChanged("CORFUNDOCONSPRECO", corFundoConsPreco);
   }

   public String getCalcDifAl() {
        return this.getVo().asString("CALCDIFAL");
   }

   public void setCalcDifAl(String calcDifAl) {
        markAsChanged("CALCDIFAL", calcDifAl);
   }

   public BigDecimal getClassifCessaoObra() {
        return this.getVo().asBigDecimal("CLASSIFCESSAOOBRA");
   }

   public void setClassifCessaoObra(BigDecimal classifCessaoObra) {
        markAsChanged("CLASSIFCESSAOOBRA", classifCessaoObra);
   }

   public String getCnpjFabricante() {
        return this.getVo().asString("CNPJFABRICANTE");
   }

   public void setCnpjFabricante(String cnpjFabricante) {
        markAsChanged("CNPJFABRICANTE", cnpjFabricante);
   }

   public String getCodAgregacao() {
        return this.getVo().asString("CODAGREGACAO");
   }

   public void setCodAgregacao(String codAgregacao) {
        markAsChanged("CODAGREGACAO", codAgregacao);
   }

   public String getCodAtivReintegra() {
        return this.getVo().asString("CODATIVREINTEGRA");
   }

   public void setCodAtivReintegra(String codAtivReintegra) {
        markAsChanged("CODATIVREINTEGRA", codAtivReintegra);
   }

   public String getCodBenefNauf() {
        return this.getVo().asString("CODBENEFNAUF");
   }

   public void setCodBenefNauf(String codBenefNauf) {
        markAsChanged("CODBENEFNAUF", codBenefNauf);
   }

   public String getCodCprb() {
        return this.getVo().asString("CODCPRB");
   }

   public void setCodCprb(String codCprb) {
        markAsChanged("CODCPRB", codCprb);
   }

   public BigDecimal getCodCtaCtbEfd() {
        return this.getVo().asBigDecimal("CODCTACTBEFD");
   }

   public void setCodCtaCtbEfd(BigDecimal codCtaCtbEfd) {
        markAsChanged("CODCTACTBEFD", codCtaCtbEfd);
   }

   public BigDecimal getCodFiltroCta() {
        return this.getVo().asBigDecimal("CODFILTROCTA");
   }

   public void setCodFiltroCta(BigDecimal codFiltroCta) {
        markAsChanged("CODFILTROCTA", codFiltroCta);
   }

   public String getComercializacaoAgri() {
        return this.getVo().asString("COMERCIALIZACAOAGRI");
   }

   public void setComercializacaoAgri(String comercializacaoAgri) {
        markAsChanged("COMERCIALIZACAOAGRI", comercializacaoAgri);
   }

   public String getIndEscala() {
        return this.getVo().asString("INDESCALA");
   }

   public void setIndEscala(String indEscala) {
        markAsChanged("INDESCALA", indEscala);
   }

   public BigDecimal getObraConstCivil() {
        return this.getVo().asBigDecimal("OBRACONSTCIVIL");
   }

   public void setObraConstCivil(BigDecimal obraConstCivil) {
        markAsChanged("OBRACONSTCIVIL", obraConstCivil);
   }

   public BigDecimal getPercInssEspecial() {
        return this.getVo().asBigDecimal("PERCINSSESPECIAL");
   }

   public void setPercInssEspecial(BigDecimal percInssEspecial) {
        markAsChanged("PERCINSSESPECIAL", percInssEspecial);
   }

   public BigDecimal getPercMistGni() {
        return this.getVo().asBigDecimal("PERCMISTGNI");
   }

   public void setPercMistGni(BigDecimal percMistGni) {
        markAsChanged("PERCMISTGNI", percMistGni);
   }

   public String getUtilizaEndFlut() {
        return this.getVo().asString("UTILIZAENDFLUT");
   }

   public void setUtilizaEndFlut(String utilizaEndFlut) {
        markAsChanged("UTILIZAENDFLUT", utilizaEndFlut);
   }

   public BigDecimal getPercMistGnn() {
        return this.getVo().asBigDecimal("PERCMISTGNN");
   }

   public void setPercMistGnn(BigDecimal percMistGnn) {
        markAsChanged("PERCMISTGNN", percMistGnn);
   }

   public BigDecimal getQtdAgrupamentoMtz() {
        return this.getVo().asBigDecimal("QTDAGRUPAMENTOMTZ");
   }

   public void setQtdAgrupamentoMtz(BigDecimal qtdAgrupamentoMtz) {
        markAsChanged("QTDAGRUPAMENTOMTZ", qtdAgrupamentoMtz);
   }

   public String getTipoInssEspecial() {
        return this.getVo().asString("TIPOINSSESPECIAL");
   }

   public void setTipoInssEspecial(String tipoInssEspecial) {
        markAsChanged("TIPOINSSESPECIAL", tipoInssEspecial);
   }

   public BigDecimal getVlrPartidaGlp() {
        return this.getVo().asBigDecimal("VLRPARTIDAGLP");
   }

   public void setVlrPartidaGlp(BigDecimal vlrPartidaGlp) {
        markAsChanged("VLRPARTIDAGLP", vlrPartidaGlp);
   }

   public String getIntegraEconect() {
        return this.getVo().asString("INTEGRAECONECT");
   }

   public void setIntegraEconect(String integraEconect) {
        markAsChanged("INTEGRAECONECT", integraEconect);
   }

   public BigDecimal getMaxMultEconect() {
        return this.getVo().asBigDecimal("MAXMULTECONECT");
   }

   public void setMaxMultEconect(BigDecimal maxMultEconect) {
        markAsChanged("MAXMULTECONECT", maxMultEconect);
   }

   public String getUtilSmartCard() {
        return this.getVo().asString("UTILSMARTCARD");
   }

   public void setUtilSmartCard(String utilSmartCard) {
        markAsChanged("UTILSMARTCARD", utilSmartCard);
   }

   public BigDecimal getNatEfdContM410M810() {
        return this.getVo().asBigDecimal("NATEFDCONTM410M810");
   }

   public void setNatEfdContM410M810(BigDecimal natEfdContM410M810) {
        markAsChanged("NATEFDCONTM410M810", natEfdContM410M810);
   }

   public BigDecimal getCodVtp() {
        return this.getVo().asBigDecimal("CODVTP");
   }

   public void setCodVtp(BigDecimal codVtp) {
        markAsChanged("CODVTP", codVtp);
   }

   public String getIndTipRefBcIcmsSt() {
        return this.getVo().asString("INDTIPREFBCICMSST");
   }

   public void setIndTipRefBcIcmsSt(String indTipRefBcIcmsSt) {
        markAsChanged("INDTIPREFBCICMSST", indTipRefBcIcmsSt);
   }

   public String getConEstOrigProd() {
        return this.getVo().asString("CONESTORIGPROD");
   }

   public void setConEstOrigProd(String conEstOrigProd) {
        markAsChanged("CONESTORIGPROD", conEstOrigProd);
   }

   public BigDecimal getTamanhoMedioPeca() {
        return this.getVo().asBigDecimal("TAMANHOMEDIOPECA");
   }

   public void setTamanhoMedioPeca(BigDecimal tamanhoMedioPeca) {
        markAsChanged("TAMANHOMEDIOPECA", tamanhoMedioPeca);
   }

   public String getStatusNcm() {
        return this.getVo().asString("STATUSNCM");
   }

   public void setStatusNcm(String statusNcm) {
        markAsChanged("STATUSNCM", statusNcm);
   }

   public String getWmsProdRastSerMed() {
        return this.getVo().asString("WMSPRODRASTSERMED");
   }

   public void setWmsProdRastSerMed(String wmsProdRastSerMed) {
        markAsChanged("WMSPRODRASTSERMED", wmsProdRastSerMed);
   }

   public String getServDespNTrib() {
        return this.getVo().asString("SERVDESPNTRIB");
   }

   public void setServDespNTrib(String servDespNTrib) {
        markAsChanged("SERVDESPNTRIB", servDespNTrib);
   }

   public String getProdAliadrCst() {
        return this.getVo().asString("PRODALIADRCST");
   }

   public void setProdAliadrCst(String prodAliadrCst) {
        markAsChanged("PRODALIADRCST", prodAliadrCst);
   }

   public String getGerImpNRetReinfaQ() {
        return this.getVo().asString("GERIMPNRETREINFAQ");
   }

   public void setGerImpNRetReinfaQ(String gerImpNRetReinfaQ) {
        markAsChanged("GERIMPNRETREINFAQ", gerImpNRetReinfaQ);
   }

   public BigDecimal getAliqFetHab() {
        return this.getVo().asBigDecimal("ALIQFETHAB");
   }

   public void setAliqFetHab(BigDecimal aliqFetHab) {
        markAsChanged("ALIQFETHAB", aliqFetHab);
   }

   public String getCodVolFetHab() {
        return this.getVo().asString("CODVOLFETHAB");
   }

   public void setCodVolFetHab(String codVolFetHab) {
        markAsChanged("CODVOLFETHAB", codVolFetHab);
   }

   public String getCalcFuntTelPro() {
        return this.getVo().asString("CALCFUNTTELPRO");
   }

   public void setCalcFuntTelPro(String calcFuntTelPro) {
        markAsChanged("CALCFUNTTELPRO", calcFuntTelPro);
   }

   public String getCalcFustPro() {
        return this.getVo().asString("CALCFUSTPRO");
   }

   public void setCalcFustPro(String calcFustPro) {
        markAsChanged("CALCFUSTPRO", calcFustPro);
   }

   public BigDecimal getTipUtilCom() {
        return this.getVo().asBigDecimal("TIPUTILCOM");
   }

   public void setTipUtilCom(BigDecimal tipUtilCom) {
        markAsChanged("TIPUTILCOM", tipUtilCom);
   }

   public String getCodBarDifGtin() {
        return this.getVo().asString("CODBARDIFGTIN");
   }

   public void setCodBarDifGtin(String codBarDifGtin) {
        markAsChanged("CODBARDIFGTIN", codBarDifGtin);
   }

   public String getCodBarTribDifGtin() {
        return this.getVo().asString("CODBARTRIBDIFGTIN");
   }

   public void setCodBarTribDifGtin(String codBarTribDifGtin) {
        markAsChanged("CODBARTRIBDIFGTIN", codBarTribDifGtin);
   }

   public String getProdInterno() {
        return this.getVo().asString("PRODINTERNO");
   }

   public void setProdInterno(String prodInterno) {
        markAsChanged("PRODINTERNO", prodInterno);
   }

   public BigDecimal getAliqImp() {
        return this.getVo().asBigDecimal("ALIQIMP");
   }

   public void setAliqImp(BigDecimal aliqImp) {
        markAsChanged("ALIQIMP", aliqImp);
   }

   public BigDecimal getAliqNac() {
        return this.getVo().asBigDecimal("ALIQNAC");
   }

   public void setAliqNac(BigDecimal aliqNac) {
        markAsChanged("ALIQNAC", aliqNac);
   }

   public String getAtuNuVersao() {
        return this.getVo().asString("ATUNUVERSAO");
   }

   public void setAtuNuVersao(String atuNuVersao) {
        markAsChanged("ATUNUVERSAO", atuNuVersao);
   }

   public BigDecimal getIntegraFox() {
        return this.getVo().asBigDecimal("INTEGRAFOX");
   }

   public void setIntegraFox(BigDecimal integraFox) {
        markAsChanged("INTEGRAFOX", integraFox);
   }

   public BigDecimal getNuVersao() {
        return this.getVo().asBigDecimal("NUVERSAO");
   }

   public void setNuVersao(BigDecimal nuVersao) {
        markAsChanged("NUVERSAO", nuVersao);
   }

   public char[] getGradePadrao() {
        return this.getVo().asClob("GRADEPADRAO");
   }

   public void setGradePadrao(char[] gradePadrao) {
        markAsChanged("GRADEPADRAO", gradePadrao);
   }

   public BigDecimal getIdGrade() {
        return this.getVo().asBigDecimal("IDGRADE");
   }

   public void setIdGrade(BigDecimal idGrade) {
        markAsChanged("IDGRADE", idGrade);
   }

   public BigDecimal getPercentSepPul() {
        return this.getVo().asBigDecimal("PERCENTSEPPUL");
   }

   public void setPercentSepPul(BigDecimal percentSepPul) {
        markAsChanged("PERCENTSEPPUL", percentSepPul);
   }

   public String getObtStAntMedEnt() {
        return this.getVo().asString("OBTSTANTMEDENT");
   }

   public void setObtStAntMedEnt(String obtStAntMedEnt) {
        markAsChanged("OBTSTANTMEDENT", obtStAntMedEnt);
   }

   public String getDescProdDrCst() {
        return this.getVo().asString("DESCPRODDRCST");
   }

   public void setDescProdDrCst(String descProdDrCst) {
        markAsChanged("DESCPRODDRCST", descProdDrCst);
   }

   public BigDecimal getAliqInternaCat42() {
        return this.getVo().asBigDecimal("ALIQINTERNACAT42");
   }

   public void setAliqInternaCat42(BigDecimal aliqInternaCat42) {
        markAsChanged("ALIQINTERNACAT42", aliqInternaCat42);
   }

   public String getDesDescCalcPis() {
        return this.getVo().asString("DESDESCCALCPIS");
   }

   public void setDesDescCalcPis(String desDescCalcPis) {
        markAsChanged("DESDESCCALCPIS", desDescCalcPis);
   }

   public BigDecimal getAliqFecop() {
        return this.getVo().asBigDecimal("ALIQFECOP");
   }

   public void setAliqFecop(BigDecimal aliqFecop) {
        markAsChanged("ALIQFECOP", aliqFecop);
   }

   public BigDecimal getMvaOriginalAdrCst() {
        return this.getVo().asBigDecimal("MVAORIGINALADRCST");
   }

   public void setMvaOriginalAdrCst(BigDecimal mvaOriginalAdrCst) {
        markAsChanged("MVAORIGINALADRCST", mvaOriginalAdrCst);
   }

   public String getParticipaAdrCst() {
        return this.getVo().asString("PARTICIPAADRCST");
   }

   public void setParticipaAdrCst(String participaAdrCst) {
        markAsChanged("PARTICIPAADRCST", participaAdrCst);
   }

   public String getProdSujFecop() {
        return this.getVo().asString("PRODSUJFECOP");
   }

   public void setProdSujFecop(String prodSujFecop) {
        markAsChanged("PRODSUJFECOP", prodSujFecop);
   }

   public String getCalRupturaEstoque() {
        return this.getVo().asString("CALRUPTURAESTOQUE");
   }

   public void setCalRupturaEstoque(String calRupturaEstoque) {
        markAsChanged("CALRUPTURAESTOQUE", calRupturaEstoque);
   }

   public String getCodVolKanban() {
        return this.getVo().asString("CODVOLKANBAN");
   }

   public void setCodVolKanban(String codVolKanban) {
        markAsChanged("CODVOLKANBAN", codVolKanban);
   }

   public String getBloqVendaFrac() {
        return this.getVo().asString("BLOQVENDAFRAC");
   }

   public void setBloqVendaFrac(String bloqVendaFrac) {
        markAsChanged("BLOQVENDAFRAC", bloqVendaFrac);
   }

   public BigDecimal getCodNatRend() {
        return this.getVo().asBigDecimal("CODNATREND");
   }

   public void setCodNatRend(BigDecimal codNatRend) {
        markAsChanged("CODNATREND", codNatRend);
   }

   public BigDecimal getTpIrrfExt() {
        return this.getVo().asBigDecimal("TPIRRFEXT");
   }

   public void setTpIrrfExt(BigDecimal tpIrrfExt) {
        markAsChanged("TPIRRFEXT", tpIrrfExt);
   }

   public BigDecimal getPercIndMistura() {
        return this.getVo().asBigDecimal("PERCINDMISTURA");
   }

   public void setPercIndMistura(BigDecimal percIndMistura) {
        markAsChanged("PERCINDMISTURA", percIndMistura);
   }

   public String getOpExpFetHab() {
        return this.getVo().asString("OPEEXPFETHAB");
   }

   public void setOpExpFetHab(String opExpFetHab) {
        markAsChanged("OPEEXPFETHAB", opExpFetHab);
   }

   public String getOpeIntEstFetHab() {
        return this.getVo().asString("OPEINTESTFETHAB");
   }

   public void setOpeIntEstFetHab(String opeIntEstFetHab) {
        markAsChanged("OPEINTESTFETHAB", opeIntEstFetHab);
   }

   public String getOpeIntFetHab() {
        return this.getVo().asString("OPEINTFETHAB");
   }

   public void setOpeIntFetHab(String opeIntFetHab) {
        markAsChanged("OPEINTFETHAB", opeIntFetHab);
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
        this.setVo(vo);
        return this;
   }
}
