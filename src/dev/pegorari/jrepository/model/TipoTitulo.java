package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TipoTitulo extends AbstractSankhyaEntity<TipoTitulo> {
   private String ativo;
   private String baixaCerto;
   private BigDecimal carencia;
   private BigDecimal cartaoDesc;
   private BigDecimal cartaoTaxa;
   private BigDecimal codCtaCtb;
   private BigDecimal codCtaCtb2;
   private BigDecimal codCtaCtb3;
   private BigDecimal codDetRecGnre;
   private BigDecimal codGrupoTipTit;
   private BigDecimal codMoeda;
   private BigDecimal codParcTef;
   private BigDecimal codProdGnre;
   private BigDecimal codRecGnre;
   private BigDecimal codTipTit;
   private String conferencia;
   private String descTipTit;
   private String espDoc;
   private String exibBaix;
   private String exigBaixaAcerto;
   private BigDecimal expGrs;
   private String expTes;
   private String fastBaixa;
   private String fastUsa;
   private String fiscal;
   private String grupoLimCred;
   private byte[] imagem;
   private String impBolReneg;
   private BigDecimal indTit;
   private String infCmc7;
   private BigDecimal percCusVar;
   private BigDecimal percJuros;
   private BigDecimal percMulta;
   private BigDecimal prazo;
   private String subTipoVenda;
   private String transfBaix;
   private String transfDif;
   private String transfPend;
   private String validaQtdMaxTitVencidos;
   private BigDecimal vlrCusVar;
   private String impComprovante;
   private String ajustavp;
   private String tpAgNfce;
   private String utilizaPos;
   private String arredPrimeiraParc;
   private BigDecimal qtdParcelCtf;
   private String recebAntAprov;
   private String timUsadoLocacao;
   private String truncParcela;
   private String tipDocRural;
   private BigDecimal nroParcelas;
   private String operacaoCtf;
   private String tipVenc;
   private BigDecimal diaVenc;
   private String codBandeiraEconect;
   private BigDecimal codFinalizadora;
   private BigDecimal grupoFinalizadora;
   private String integraEconect;
   private String convenioEconect;
   private String indReceFdCont;
   private String infCompleFdCont;
   private BigDecimal nroParcelasMax;
   private String alteraSimulTpv;
   private String descTpagNfce;
   private String ultilizaPdvWeb;
   private String proibImpBol;
   private BigDecimal vlrParcMinCart;
   private String consDiasUteis;
   private String credenciadoraCfe;
   private String nsuOpcionalPos;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public String getBaixaCerto() {
        return baixaCerto;
   }

   public void setBaixaCerto(String baixaCerto) {
        markAsChanged("BAIXACERTO", baixaCerto);
        this.baixaCerto = baixaCerto;
   }

   public BigDecimal getCarencia() {
        return carencia;
   }

   public void setCarencia(BigDecimal carencia) {
        markAsChanged("CARENCIA", carencia);
        this.carencia = carencia;
   }

   public BigDecimal getCartaoDesc() {
        return cartaoDesc;
   }

   public void setCartaoDesc(BigDecimal cartaoDesc) {
        markAsChanged("CARTAODESC", cartaoDesc);
        this.cartaoDesc = cartaoDesc;
   }

   public BigDecimal getCartaoTaxa() {
        return cartaoTaxa;
   }

   public void setCartaoTaxa(BigDecimal cartaoTaxa) {
        markAsChanged("CARTAOTAXA", cartaoTaxa);
        this.cartaoTaxa = cartaoTaxa;
   }

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodCtaCtb2() {
        return codCtaCtb2;
   }

   public void setCodCtaCtb2(BigDecimal codCtaCtb2) {
        markAsChanged("CODCTACTB2", codCtaCtb2);
        this.codCtaCtb2 = codCtaCtb2;
   }

   public BigDecimal getCodCtaCtb3() {
        return codCtaCtb3;
   }

   public void setCodCtaCtb3(BigDecimal codCtaCtb3) {
        markAsChanged("CODCTACTB3", codCtaCtb3);
        this.codCtaCtb3 = codCtaCtb3;
   }

   public BigDecimal getCodDetRecGnre() {
        return codDetRecGnre;
   }

   public void setCodDetRecGnre(BigDecimal codDetRecGnre) {
        markAsChanged("CODDETRECGNRE", codDetRecGnre);
        this.codDetRecGnre = codDetRecGnre;
   }

   public BigDecimal getCodGrupoTipTit() {
        return codGrupoTipTit;
   }

   public void setCodGrupoTipTit(BigDecimal codGrupoTipTit) {
        markAsChanged("CODGRUPOTIPTIT", codGrupoTipTit);
        this.codGrupoTipTit = codGrupoTipTit;
   }

   public BigDecimal getCodMoeda() {
        return codMoeda;
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
        this.codMoeda = codMoeda;
   }

   public BigDecimal getCodParcTef() {
        return codParcTef;
   }

   public void setCodParcTef(BigDecimal codParcTef) {
        markAsChanged("CODPARCTEF", codParcTef);
        this.codParcTef = codParcTef;
   }

   public BigDecimal getCodProdGnre() {
        return codProdGnre;
   }

   public void setCodProdGnre(BigDecimal codProdGnre) {
        markAsChanged("CODPRODGNRE", codProdGnre);
        this.codProdGnre = codProdGnre;
   }

   public BigDecimal getCodRecGnre() {
        return codRecGnre;
   }

   public void setCodRecGnre(BigDecimal codRecGnre) {
        markAsChanged("CODRECGNRE", codRecGnre);
        this.codRecGnre = codRecGnre;
   }

   public BigDecimal getCodTipTit() {
        return codTipTit;
   }

   public void setCodTipTit(BigDecimal codTipTit) {
        markAsChanged("CODTIPTIT", codTipTit);
        this.codTipTit = codTipTit;
   }

   public String getConferencia() {
        return conferencia;
   }

   public void setConferencia(String conferencia) {
        markAsChanged("CONFERENCIA", conferencia);
        this.conferencia = conferencia;
   }

   public String getDescTipTit() {
        return descTipTit;
   }

   public void setDescTipTit(String descTipTit) {
        markAsChanged("DESCRTIPTIT", descTipTit);
        this.descTipTit = descTipTit;
   }

   public String getEspDoc() {
        return espDoc;
   }

   public void setEspDoc(String espDoc) {
        markAsChanged("ESPDOC", espDoc);
        this.espDoc = espDoc;
   }

   public String getExibBaix() {
        return exibBaix;
   }

   public void setExibBaix(String exibBaix) {
        markAsChanged("EXIBBAIX", exibBaix);
        this.exibBaix = exibBaix;
   }

   public String getExigBaixaAcerto() {
        return exigBaixaAcerto;
   }

   public void setExigBaixaAcerto(String exigBaixaAcerto) {
        markAsChanged("EXIGBAIXAACERTO", exigBaixaAcerto);
        this.exigBaixaAcerto = exigBaixaAcerto;
   }

   public BigDecimal getExpGrs() {
        return expGrs;
   }

   public void setExpGrs(BigDecimal expGrs) {
        markAsChanged("EXPGRS", expGrs);
        this.expGrs = expGrs;
   }

   public String getExpTes() {
        return expTes;
   }

   public void setExpTes(String expTes) {
        markAsChanged("EXPTES", expTes);
        this.expTes = expTes;
   }

   public String getFastBaixa() {
        return fastBaixa;
   }

   public void setFastBaixa(String fastBaixa) {
        markAsChanged("FASTBAIXA", fastBaixa);
        this.fastBaixa = fastBaixa;
   }

   public String getFastUsa() {
        return fastUsa;
   }

   public void setFastUsa(String fastUsa) {
        markAsChanged("FASTUSA", fastUsa);
        this.fastUsa = fastUsa;
   }

   public String getFiscal() {
        return fiscal;
   }

   public void setFiscal(String fiscal) {
        markAsChanged("FISCAL", fiscal);
        this.fiscal = fiscal;
   }

   public String getGrupoLimCred() {
        return grupoLimCred;
   }

   public void setGrupoLimCred(String grupoLimCred) {
        markAsChanged("GRUPOLIMCRED", grupoLimCred);
        this.grupoLimCred = grupoLimCred;
   }

   public byte[] getImagem() {
        return imagem;
   }

   public void setImagem(byte[] imagem) {
        markAsChanged("IMAGEM", imagem);
        this.imagem = imagem;
   }

   public String getImpBolReneg() {
        return impBolReneg;
   }

   public void setImpBolReneg(String impBolReneg) {
        markAsChanged("IMPBOLRENEG", impBolReneg);
        this.impBolReneg = impBolReneg;
   }

   public BigDecimal getIndTit() {
        return indTit;
   }

   public void setIndTit(BigDecimal indTit) {
        markAsChanged("INDTIT", indTit);
        this.indTit = indTit;
   }

   public String getInfCmc7() {
        return infCmc7;
   }

   public void setInfCmc7(String infCmc7) {
        markAsChanged("INFCMC7", infCmc7);
        this.infCmc7 = infCmc7;
   }

   public BigDecimal getPercCusVar() {
        return percCusVar;
   }

   public void setPercCusVar(BigDecimal percCusVar) {
        markAsChanged("PERCCUSVAR", percCusVar);
        this.percCusVar = percCusVar;
   }

   public BigDecimal getPercJuros() {
        return percJuros;
   }

   public void setPercJuros(BigDecimal percJuros) {
        markAsChanged("PERCJUROS", percJuros);
        this.percJuros = percJuros;
   }

   public BigDecimal getPercMulta() {
        return percMulta;
   }

   public void setPercMulta(BigDecimal percMulta) {
        markAsChanged("PERCMULTA", percMulta);
        this.percMulta = percMulta;
   }

   public BigDecimal getPrazo() {
        return prazo;
   }

   public void setPrazo(BigDecimal prazo) {
        markAsChanged("PRAZO", prazo);
        this.prazo = prazo;
   }

   public String getSubTipoVenda() {
        return subTipoVenda;
   }

   public void setSubTipoVenda(String subTipoVenda) {
        markAsChanged("SUBTIPOVENDA", subTipoVenda);
        this.subTipoVenda = subTipoVenda;
   }

   public String getTransfBaix() {
        return transfBaix;
   }

   public void setTransfBaix(String transfBaix) {
        markAsChanged("TRANSFBAIX", transfBaix);
        this.transfBaix = transfBaix;
   }

   public String getTransfDif() {
        return transfDif;
   }

   public void setTransfDif(String transfDif) {
        markAsChanged("TRANSFDIF", transfDif);
        this.transfDif = transfDif;
   }

   public String getTransfPend() {
        return transfPend;
   }

   public void setTransfPend(String transfPend) {
        markAsChanged("TRANSFPEND", transfPend);
        this.transfPend = transfPend;
   }

   public String getValidaQtdMaxTitVencidos() {
        return validaQtdMaxTitVencidos;
   }

   public void setValidaQtdMaxTitVencidos(String validaQtdMaxTitVencidos) {
        markAsChanged("VALIDAQTDMAXTITVENCIDOS", validaQtdMaxTitVencidos);
        this.validaQtdMaxTitVencidos = validaQtdMaxTitVencidos;
   }

   public BigDecimal getVlrCusVar() {
        return vlrCusVar;
   }

   public void setVlrCusVar(BigDecimal vlrCusVar) {
        markAsChanged("VLRCUSVAR", vlrCusVar);
        this.vlrCusVar = vlrCusVar;
   }

   public String getImpComprovante() {
        return impComprovante;
   }

   public void setImpComprovante(String impComprovante) {
        markAsChanged("IMPCOMPROVANTE", impComprovante);
        this.impComprovante = impComprovante;
   }

   public String getAjustavp() {
        return ajustavp;
   }

   public void setAjustavp(String ajustavp) {
        markAsChanged("AJUSTAVP", ajustavp);
        this.ajustavp = ajustavp;
   }

   public String getTpAgNfce() {
        return tpAgNfce;
   }

   public void setTpAgNfce(String tpAgNfce) {
        markAsChanged("TPAGNFCE", tpAgNfce);
        this.tpAgNfce = tpAgNfce;
   }

   public String getUtilizaPos() {
        return utilizaPos;
   }

   public void setUtilizaPos(String utilizaPos) {
        markAsChanged("UTILIZAPOS", utilizaPos);
        this.utilizaPos = utilizaPos;
   }

   public String getArredPrimeiraParc() {
        return arredPrimeiraParc;
   }

   public void setArredPrimeiraParc(String arredPrimeiraParc) {
        markAsChanged("ARREDPRIMEIRAPARC", arredPrimeiraParc);
        this.arredPrimeiraParc = arredPrimeiraParc;
   }

   public BigDecimal getQtdParcelCtf() {
        return qtdParcelCtf;
   }

   public void setQtdParcelCtf(BigDecimal qtdParcelCtf) {
        markAsChanged("QTDPARCELCTF", qtdParcelCtf);
        this.qtdParcelCtf = qtdParcelCtf;
   }

   public String getRecebAntAprov() {
        return recebAntAprov;
   }

   public void setRecebAntAprov(String recebAntAprov) {
        markAsChanged("RECEBANTAPROV", recebAntAprov);
        this.recebAntAprov = recebAntAprov;
   }

   public String getTimUsadoLocacao() {
        return timUsadoLocacao;
   }

   public void setTimUsadoLocacao(String timUsadoLocacao) {
        markAsChanged("TIMUSADOLOCACAO", timUsadoLocacao);
        this.timUsadoLocacao = timUsadoLocacao;
   }

   public String getTruncParcela() {
        return truncParcela;
   }

   public void setTruncParcela(String truncParcela) {
        markAsChanged("TRUNCPARCELA", truncParcela);
        this.truncParcela = truncParcela;
   }

   public String getTipDocRural() {
        return tipDocRural;
   }

   public void setTipDocRural(String tipDocRural) {
        markAsChanged("TIPDOCRURAL", tipDocRural);
        this.tipDocRural = tipDocRural;
   }

   public BigDecimal getNroParcelas() {
        return nroParcelas;
   }

   public void setNroParcelas(BigDecimal nroParcelas) {
        markAsChanged("NROPARCELAS", nroParcelas);
        this.nroParcelas = nroParcelas;
   }

   public String getOperacaoCtf() {
        return operacaoCtf;
   }

   public void setOperacaoCtf(String operacaoCtf) {
        markAsChanged("OPERACAOCTF", operacaoCtf);
        this.operacaoCtf = operacaoCtf;
   }

   public String getTipVenc() {
        return tipVenc;
   }

   public void setTipVenc(String tipVenc) {
        markAsChanged("TIPVENC", tipVenc);
        this.tipVenc = tipVenc;
   }

   public BigDecimal getDiaVenc() {
        return diaVenc;
   }

   public void setDiaVenc(BigDecimal diaVenc) {
        markAsChanged("DIAVENC", diaVenc);
        this.diaVenc = diaVenc;
   }

   public String getCodBandeiraEconect() {
        return codBandeiraEconect;
   }

   public void setCodBandeiraEconect(String codBandeiraEconect) {
        markAsChanged("CODBANDEIRAECONECT", codBandeiraEconect);
        this.codBandeiraEconect = codBandeiraEconect;
   }

   public BigDecimal getCodFinalizadora() {
        return codFinalizadora;
   }

   public void setCodFinalizadora(BigDecimal codFinalizadora) {
        markAsChanged("CODFINALIZADORA", codFinalizadora);
        this.codFinalizadora = codFinalizadora;
   }

   public BigDecimal getGrupoFinalizadora() {
        return grupoFinalizadora;
   }

   public void setGrupoFinalizadora(BigDecimal grupoFinalizadora) {
        markAsChanged("GRUPOFINALIZADORA", grupoFinalizadora);
        this.grupoFinalizadora = grupoFinalizadora;
   }

   public String getIntegraEconect() {
        return integraEconect;
   }

   public void setIntegraEconect(String integraEconect) {
        markAsChanged("INTEGRAECONECT", integraEconect);
        this.integraEconect = integraEconect;
   }

   public String getConvenioEconect() {
        return convenioEconect;
   }

   public void setConvenioEconect(String convenioEconect) {
        markAsChanged("CONVENIOECONECT", convenioEconect);
        this.convenioEconect = convenioEconect;
   }

   public String getIndReceFdCont() {
        return indReceFdCont;
   }

   public void setIndReceFdCont(String indReceFdCont) {
        markAsChanged("INDRECEFDCONT", indReceFdCont);
        this.indReceFdCont = indReceFdCont;
   }

   public String getInfCompleFdCont() {
        return infCompleFdCont;
   }

   public void setInfCompleFdCont(String infCompleFdCont) {
        markAsChanged("INFCOMPLEFDCONT", infCompleFdCont);
        this.infCompleFdCont = infCompleFdCont;
   }

   public BigDecimal getNroParcelasMax() {
        return nroParcelasMax;
   }

   public void setNroParcelasMax(BigDecimal nroParcelasMax) {
        markAsChanged("NROPARCELASMAX", nroParcelasMax);
        this.nroParcelasMax = nroParcelasMax;
   }

   public String getAlteraSimulTpv() {
        return alteraSimulTpv;
   }

   public void setAlteraSimulTpv(String alteraSimulTpv) {
        markAsChanged("ALTERASIMULTPV", alteraSimulTpv);
        this.alteraSimulTpv = alteraSimulTpv;
   }

   public String getDescTpagNfce() {
        return descTpagNfce;
   }

   public void setDescTpagNfce(String descTpagNfce) {
        markAsChanged("DESCRTPAGNFCE", descTpagNfce);
        this.descTpagNfce = descTpagNfce;
   }

   public String getUltilizaPdvWeb() {
        return ultilizaPdvWeb;
   }

   public void setUltilizaPdvWeb(String ultilizaPdvWeb) {
        markAsChanged("ULTILIZAPDVWEB", ultilizaPdvWeb);
        this.ultilizaPdvWeb = ultilizaPdvWeb;
   }

   public String getProibImpBol() {
        return proibImpBol;
   }

   public void setProibImpBol(String proibImpBol) {
        markAsChanged("PROIBIMPBOL", proibImpBol);
        this.proibImpBol = proibImpBol;
   }

   public BigDecimal getVlrParcMinCart() {
        return vlrParcMinCart;
   }

   public void setVlrParcMinCart(BigDecimal vlrParcMinCart) {
        markAsChanged("VLRPARCMINCART", vlrParcMinCart);
        this.vlrParcMinCart = vlrParcMinCart;
   }

   public String getConsDiasUteis() {
        return consDiasUteis;
   }

   public void setConsDiasUteis(String consDiasUteis) {
        markAsChanged("CONSDIASUTEIS", consDiasUteis);
        this.consDiasUteis = consDiasUteis;
   }

   public String getCredenciadoraCfe() {
        return credenciadoraCfe;
   }

   public void setCredenciadoraCfe(String credenciadoraCfe) {
        markAsChanged("CREDENCIADORACFE", credenciadoraCfe);
        this.credenciadoraCfe = credenciadoraCfe;
   }

   public String getNsuOpcionalPos() {
        return nsuOpcionalPos;
   }

   public void setNsuOpcionalPos(String nsuOpcionalPos) {
        markAsChanged("NSUOPCIONALPOS", nsuOpcionalPos);
        this.nsuOpcionalPos = nsuOpcionalPos;
   }

   @Override
   public String getTableName() {
        return "TGFTIT";
   }

   @Override
   public String getEntityName() {
        return "TipoTitulo";
   }

   @Override
   public TipoTitulo fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.ativo = vo.asString("ATIVO");
        this.baixaCerto = vo.asString("BAIXACERTO");
        this.carencia = vo.asBigDecimal("CARENCIA");
        this.cartaoDesc = vo.asBigDecimal("CARTAODESC");
        this.cartaoTaxa = vo.asBigDecimal("CARTAOTAXA");
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.codCtaCtb2 = vo.asBigDecimal("CODCTACTB2");
        this.codCtaCtb3 = vo.asBigDecimal("CODCTACTB3");
        this.codDetRecGnre = vo.asBigDecimal("CODDETRECGNRE");
        this.codGrupoTipTit = vo.asBigDecimal("CODGRUPOTIPTIT");
        this.codMoeda = vo.asBigDecimal("CODMOEDA");
        this.codParcTef = vo.asBigDecimal("CODPARCTEF");
        this.codProdGnre = vo.asBigDecimal("CODPRODGNRE");
        this.codRecGnre = vo.asBigDecimal("CODRECGNRE");
        this.codTipTit = vo.asBigDecimal("CODTIPTIT");
        this.conferencia = vo.asString("CONFERENCIA");
        this.descTipTit = vo.asString("DESCRTIPTIT");
        this.espDoc = vo.asString("ESPDOC");
        this.exibBaix = vo.asString("EXIBBAIX");
        this.exigBaixaAcerto = vo.asString("EXIGBAIXAACERTO");
        this.expGrs = vo.asBigDecimal("EXPGRS");
        this.expTes = vo.asString("EXPTES");
        this.fastBaixa = vo.asString("FASTBAIXA");
        this.fastUsa = vo.asString("FASTUSA");
        this.fiscal = vo.asString("FISCAL");
        this.grupoLimCred = vo.asString("GRUPOLIMCRED");
        this.imagem = vo.asBlob("IMAGEM");
        this.impBolReneg = vo.asString("IMPBOLRENEG");
        this.indTit = vo.asBigDecimal("INDTIT");
        this.infCmc7 = vo.asString("INFCMC7");
        this.percCusVar = vo.asBigDecimal("PERCCUSVAR");
        this.percJuros = vo.asBigDecimal("PERCJUROS");
        this.percMulta = vo.asBigDecimal("PERCMULTA");
        this.prazo = vo.asBigDecimal("PRAZO");
        this.subTipoVenda = vo.asString("SUBTIPOVENDA");
        this.transfBaix = vo.asString("TRANSFBAIX");
        this.transfDif = vo.asString("TRANSFDIF");
        this.transfPend = vo.asString("TRANSFPEND");
        this.validaQtdMaxTitVencidos = vo.asString("VALIDAQTDMAXTITVENCIDOS");
        this.vlrCusVar = vo.asBigDecimal("VLRCUSVAR");
        this.impComprovante = vo.asString("IMPCOMPROVANTE");
        this.ajustavp = vo.asString("AJUSTAVP");
        this.tpAgNfce = vo.asString("TPAGNFCE");
        this.utilizaPos = vo.asString("UTILIZAPOS");
        this.arredPrimeiraParc = vo.asString("ARREDPRIMEIRAPARC");
        this.qtdParcelCtf = vo.asBigDecimal("QTDPARCELCTF");
        this.recebAntAprov = vo.asString("RECEBANTAPROV");
        this.timUsadoLocacao = vo.asString("TIMUSADOLOCACAO");
        this.truncParcela = vo.asString("TRUNCPARCELA");
        this.tipDocRural = vo.asString("TIPDOCRURAL");
        this.nroParcelas = vo.asBigDecimal("NROPARCELAS");
        this.operacaoCtf = vo.asString("OPERACAOCTF");
        this.tipVenc = vo.asString("TIPVENC");
        this.diaVenc = vo.asBigDecimal("DIAVENC");
        this.codBandeiraEconect = vo.asString("CODBANDEIRAECONECT");
        this.codFinalizadora = vo.asBigDecimal("CODFINALIZADORA");
        this.grupoFinalizadora = vo.asBigDecimal("GRUPOFINALIZADORA");
        this.integraEconect = vo.asString("INTEGRAECONECT");
        this.convenioEconect = vo.asString("CONVENIOECONECT");
        this.indReceFdCont = vo.asString("INDRECEFDCONT");
        this.infCompleFdCont = vo.asString("INFCOMPLEFDCONT");
        this.nroParcelasMax = vo.asBigDecimal("NROPARCELASMAX");
        this.alteraSimulTpv = vo.asString("ALTERASIMULTPV");
        this.descTpagNfce = vo.asString("DESCRTPAGNFCE");
        this.ultilizaPdvWeb = vo.asString("ULTILIZAPDVWEB");
        this.proibImpBol = vo.asString("PROIBIMPBOL");
        this.vlrParcMinCart = vo.asBigDecimal("VLRPARCMINCART");
        this.consDiasUteis = vo.asString("CONSDIASUTEIS");
        this.credenciadoraCfe = vo.asString("CREDENCIADORACFE");
        this.nsuOpcionalPos = vo.asString("NSUOPCIONALPOS");
        return this;
   }
}
