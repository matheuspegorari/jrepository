package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TipoTitulo extends AbstractSankhyaEntity<TipoTitulo> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getBaixaCerto() {
        return this.getVo().asString("BAIXACERTO");
   }

   public void setBaixaCerto(String baixaCerto) {
        markAsChanged("BAIXACERTO", baixaCerto);
   }

   public BigDecimal getCarencia() {
        return this.getVo().asBigDecimal("CARENCIA");
   }

   public void setCarencia(BigDecimal carencia) {
        markAsChanged("CARENCIA", carencia);
   }

   public BigDecimal getCartaoDesc() {
        return this.getVo().asBigDecimal("CARTAODESC");
   }

   public void setCartaoDesc(BigDecimal cartaoDesc) {
        markAsChanged("CARTAODESC", cartaoDesc);
   }

   public BigDecimal getCartaoTaxa() {
        return this.getVo().asBigDecimal("CARTAOTAXA");
   }

   public void setCartaoTaxa(BigDecimal cartaoTaxa) {
        markAsChanged("CARTAOTAXA", cartaoTaxa);
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

   public BigDecimal getCodDetRecGnre() {
        return this.getVo().asBigDecimal("CODDETRECGNRE");
   }

   public void setCodDetRecGnre(BigDecimal codDetRecGnre) {
        markAsChanged("CODDETRECGNRE", codDetRecGnre);
   }

   public BigDecimal getCodGrupoTipTit() {
        return this.getVo().asBigDecimal("CODGRUPOTIPTIT");
   }

   public void setCodGrupoTipTit(BigDecimal codGrupoTipTit) {
        markAsChanged("CODGRUPOTIPTIT", codGrupoTipTit);
   }

   public BigDecimal getCodMoeda() {
        return this.getVo().asBigDecimal("CODMOEDA");
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
   }

   public BigDecimal getCodParcTef() {
        return this.getVo().asBigDecimal("CODPARCTEF");
   }

   public void setCodParcTef(BigDecimal codParcTef) {
        markAsChanged("CODPARCTEF", codParcTef);
   }

   public BigDecimal getCodProdGnre() {
        return this.getVo().asBigDecimal("CODPRODGNRE");
   }

   public void setCodProdGnre(BigDecimal codProdGnre) {
        markAsChanged("CODPRODGNRE", codProdGnre);
   }

   public BigDecimal getCodRecGnre() {
        return this.getVo().asBigDecimal("CODRECGNRE");
   }

   public void setCodRecGnre(BigDecimal codRecGnre) {
        markAsChanged("CODRECGNRE", codRecGnre);
   }

   public BigDecimal getCodTipTit() {
        return this.getVo().asBigDecimal("CODTIPTIT");
   }

   public void setCodTipTit(BigDecimal codTipTit) {
        markAsChanged("CODTIPTIT", codTipTit);
   }

   public String getConferencia() {
        return this.getVo().asString("CONFERENCIA");
   }

   public void setConferencia(String conferencia) {
        markAsChanged("CONFERENCIA", conferencia);
   }

   public String getDescTipTit() {
        return this.getVo().asString("DESCRTIPTIT");
   }

   public void setDescTipTit(String descTipTit) {
        markAsChanged("DESCRTIPTIT", descTipTit);
   }

   public String getEspDoc() {
        return this.getVo().asString("ESPDOC");
   }

   public void setEspDoc(String espDoc) {
        markAsChanged("ESPDOC", espDoc);
   }

   public String getExibBaix() {
        return this.getVo().asString("EXIBBAIX");
   }

   public void setExibBaix(String exibBaix) {
        markAsChanged("EXIBBAIX", exibBaix);
   }

   public String getExigBaixaAcerto() {
        return this.getVo().asString("EXIGBAIXAACERTO");
   }

   public void setExigBaixaAcerto(String exigBaixaAcerto) {
        markAsChanged("EXIGBAIXAACERTO", exigBaixaAcerto);
   }

   public BigDecimal getExpGrs() {
        return this.getVo().asBigDecimal("EXPGRS");
   }

   public void setExpGrs(BigDecimal expGrs) {
        markAsChanged("EXPGRS", expGrs);
   }

   public String getExpTes() {
        return this.getVo().asString("EXPTES");
   }

   public void setExpTes(String expTes) {
        markAsChanged("EXPTES", expTes);
   }

   public String getFastBaixa() {
        return this.getVo().asString("FASTBAIXA");
   }

   public void setFastBaixa(String fastBaixa) {
        markAsChanged("FASTBAIXA", fastBaixa);
   }

   public String getFastUsa() {
        return this.getVo().asString("FASTUSA");
   }

   public void setFastUsa(String fastUsa) {
        markAsChanged("FASTUSA", fastUsa);
   }

   public String getFiscal() {
        return this.getVo().asString("FISCAL");
   }

   public void setFiscal(String fiscal) {
        markAsChanged("FISCAL", fiscal);
   }

   public String getGrupoLimCred() {
        return this.getVo().asString("GRUPOLIMCRED");
   }

   public void setGrupoLimCred(String grupoLimCred) {
        markAsChanged("GRUPOLIMCRED", grupoLimCred);
   }

   public byte[] getImagem() {
        return this.getVo().asBlob("IMAGEM");
   }

   public void setImagem(byte[] imagem) {
        markAsChanged("IMAGEM", imagem);
   }

   public String getImpBolReneg() {
        return this.getVo().asString("IMPBOLRENEG");
   }

   public void setImpBolReneg(String impBolReneg) {
        markAsChanged("IMPBOLRENEG", impBolReneg);
   }

   public BigDecimal getIndTit() {
        return this.getVo().asBigDecimal("INDTIT");
   }

   public void setIndTit(BigDecimal indTit) {
        markAsChanged("INDTIT", indTit);
   }

   public String getInfCmc7() {
        return this.getVo().asString("INFCMC7");
   }

   public void setInfCmc7(String infCmc7) {
        markAsChanged("INFCMC7", infCmc7);
   }

   public BigDecimal getPercCusVar() {
        return this.getVo().asBigDecimal("PERCCUSVAR");
   }

   public void setPercCusVar(BigDecimal percCusVar) {
        markAsChanged("PERCCUSVAR", percCusVar);
   }

   public BigDecimal getPercJuros() {
        return this.getVo().asBigDecimal("PERCJUROS");
   }

   public void setPercJuros(BigDecimal percJuros) {
        markAsChanged("PERCJUROS", percJuros);
   }

   public BigDecimal getPercMulta() {
        return this.getVo().asBigDecimal("PERCMULTA");
   }

   public void setPercMulta(BigDecimal percMulta) {
        markAsChanged("PERCMULTA", percMulta);
   }

   public BigDecimal getPrazo() {
        return this.getVo().asBigDecimal("PRAZO");
   }

   public void setPrazo(BigDecimal prazo) {
        markAsChanged("PRAZO", prazo);
   }

   public String getSubTipoVenda() {
        return this.getVo().asString("SUBTIPOVENDA");
   }

   public void setSubTipoVenda(String subTipoVenda) {
        markAsChanged("SUBTIPOVENDA", subTipoVenda);
   }

   public String getTransfBaix() {
        return this.getVo().asString("TRANSFBAIX");
   }

   public void setTransfBaix(String transfBaix) {
        markAsChanged("TRANSFBAIX", transfBaix);
   }

   public String getTransfDif() {
        return this.getVo().asString("TRANSFDIF");
   }

   public void setTransfDif(String transfDif) {
        markAsChanged("TRANSFDIF", transfDif);
   }

   public String getTransfPend() {
        return this.getVo().asString("TRANSFPEND");
   }

   public void setTransfPend(String transfPend) {
        markAsChanged("TRANSFPEND", transfPend);
   }

   public String getValidaQtdMaxTitVencidos() {
        return this.getVo().asString("VALIDAQTDMAXTITVENCIDOS");
   }

   public void setValidaQtdMaxTitVencidos(String validaQtdMaxTitVencidos) {
        markAsChanged("VALIDAQTDMAXTITVENCIDOS", validaQtdMaxTitVencidos);
   }

   public BigDecimal getVlrCusVar() {
        return this.getVo().asBigDecimal("VLRCUSVAR");
   }

   public void setVlrCusVar(BigDecimal vlrCusVar) {
        markAsChanged("VLRCUSVAR", vlrCusVar);
   }

   public String getImpComprovante() {
        return this.getVo().asString("IMPCOMPROVANTE");
   }

   public void setImpComprovante(String impComprovante) {
        markAsChanged("IMPCOMPROVANTE", impComprovante);
   }

   public String getAjustavp() {
        return this.getVo().asString("AJUSTAVP");
   }

   public void setAjustavp(String ajustavp) {
        markAsChanged("AJUSTAVP", ajustavp);
   }

   public String getTpAgNfce() {
        return this.getVo().asString("TPAGNFCE");
   }

   public void setTpAgNfce(String tpAgNfce) {
        markAsChanged("TPAGNFCE", tpAgNfce);
   }

   public String getUtilizaPos() {
        return this.getVo().asString("UTILIZAPOS");
   }

   public void setUtilizaPos(String utilizaPos) {
        markAsChanged("UTILIZAPOS", utilizaPos);
   }

   public String getArredPrimeiraParc() {
        return this.getVo().asString("ARREDPRIMEIRAPARC");
   }

   public void setArredPrimeiraParc(String arredPrimeiraParc) {
        markAsChanged("ARREDPRIMEIRAPARC", arredPrimeiraParc);
   }

   public BigDecimal getQtdParcelCtf() {
        return this.getVo().asBigDecimal("QTDPARCELCTF");
   }

   public void setQtdParcelCtf(BigDecimal qtdParcelCtf) {
        markAsChanged("QTDPARCELCTF", qtdParcelCtf);
   }

   public String getRecebAntAprov() {
        return this.getVo().asString("RECEBANTAPROV");
   }

   public void setRecebAntAprov(String recebAntAprov) {
        markAsChanged("RECEBANTAPROV", recebAntAprov);
   }

   public String getTimUsadoLocacao() {
        return this.getVo().asString("TIMUSADOLOCACAO");
   }

   public void setTimUsadoLocacao(String timUsadoLocacao) {
        markAsChanged("TIMUSADOLOCACAO", timUsadoLocacao);
   }

   public String getTruncParcela() {
        return this.getVo().asString("TRUNCPARCELA");
   }

   public void setTruncParcela(String truncParcela) {
        markAsChanged("TRUNCPARCELA", truncParcela);
   }

   public String getTipDocRural() {
        return this.getVo().asString("TIPDOCRURAL");
   }

   public void setTipDocRural(String tipDocRural) {
        markAsChanged("TIPDOCRURAL", tipDocRural);
   }

   public BigDecimal getNroParcelas() {
        return this.getVo().asBigDecimal("NROPARCELAS");
   }

   public void setNroParcelas(BigDecimal nroParcelas) {
        markAsChanged("NROPARCELAS", nroParcelas);
   }

   public String getOperacaoCtf() {
        return this.getVo().asString("OPERACAOCTF");
   }

   public void setOperacaoCtf(String operacaoCtf) {
        markAsChanged("OPERACAOCTF", operacaoCtf);
   }

   public String getTipVenc() {
        return this.getVo().asString("TIPVENC");
   }

   public void setTipVenc(String tipVenc) {
        markAsChanged("TIPVENC", tipVenc);
   }

   public BigDecimal getDiaVenc() {
        return this.getVo().asBigDecimal("DIAVENC");
   }

   public void setDiaVenc(BigDecimal diaVenc) {
        markAsChanged("DIAVENC", diaVenc);
   }

   public String getCodBandeiraEconect() {
        return this.getVo().asString("CODBANDEIRAECONECT");
   }

   public void setCodBandeiraEconect(String codBandeiraEconect) {
        markAsChanged("CODBANDEIRAECONECT", codBandeiraEconect);
   }

   public BigDecimal getCodFinalizadora() {
        return this.getVo().asBigDecimal("CODFINALIZADORA");
   }

   public void setCodFinalizadora(BigDecimal codFinalizadora) {
        markAsChanged("CODFINALIZADORA", codFinalizadora);
   }

   public BigDecimal getGrupoFinalizadora() {
        return this.getVo().asBigDecimal("GRUPOFINALIZADORA");
   }

   public void setGrupoFinalizadora(BigDecimal grupoFinalizadora) {
        markAsChanged("GRUPOFINALIZADORA", grupoFinalizadora);
   }

   public String getIntegraEconect() {
        return this.getVo().asString("INTEGRAECONECT");
   }

   public void setIntegraEconect(String integraEconect) {
        markAsChanged("INTEGRAECONECT", integraEconect);
   }

   public String getConvenioEconect() {
        return this.getVo().asString("CONVENIOECONECT");
   }

   public void setConvenioEconect(String convenioEconect) {
        markAsChanged("CONVENIOECONECT", convenioEconect);
   }

   public String getIndReceFdCont() {
        return this.getVo().asString("INDRECEFDCONT");
   }

   public void setIndReceFdCont(String indReceFdCont) {
        markAsChanged("INDRECEFDCONT", indReceFdCont);
   }

   public String getInfCompleFdCont() {
        return this.getVo().asString("INFCOMPLEFDCONT");
   }

   public void setInfCompleFdCont(String infCompleFdCont) {
        markAsChanged("INFCOMPLEFDCONT", infCompleFdCont);
   }

   public BigDecimal getNroParcelasMax() {
        return this.getVo().asBigDecimal("NROPARCELASMAX");
   }

   public void setNroParcelasMax(BigDecimal nroParcelasMax) {
        markAsChanged("NROPARCELASMAX", nroParcelasMax);
   }

   public String getAlteraSimulTpv() {
        return this.getVo().asString("ALTERASIMULTPV");
   }

   public void setAlteraSimulTpv(String alteraSimulTpv) {
        markAsChanged("ALTERASIMULTPV", alteraSimulTpv);
   }

   public String getDescTpagNfce() {
        return this.getVo().asString("DESCRTPAGNFCE");
   }

   public void setDescTpagNfce(String descTpagNfce) {
        markAsChanged("DESCRTPAGNFCE", descTpagNfce);
   }

   public String getUltilizaPdvWeb() {
        return this.getVo().asString("ULTILIZAPDVWEB");
   }

   public void setUltilizaPdvWeb(String ultilizaPdvWeb) {
        markAsChanged("ULTILIZAPDVWEB", ultilizaPdvWeb);
   }

   public String getProibImpBol() {
        return this.getVo().asString("PROIBIMPBOL");
   }

   public void setProibImpBol(String proibImpBol) {
        markAsChanged("PROIBIMPBOL", proibImpBol);
   }

   public BigDecimal getVlrParcMinCart() {
        return this.getVo().asBigDecimal("VLRPARCMINCART");
   }

   public void setVlrParcMinCart(BigDecimal vlrParcMinCart) {
        markAsChanged("VLRPARCMINCART", vlrParcMinCart);
   }

   public String getConsDiasUteis() {
        return this.getVo().asString("CONSDIASUTEIS");
   }

   public void setConsDiasUteis(String consDiasUteis) {
        markAsChanged("CONSDIASUTEIS", consDiasUteis);
   }

   public String getCredenciadoraCfe() {
        return this.getVo().asString("CREDENCIADORACFE");
   }

   public void setCredenciadoraCfe(String credenciadoraCfe) {
        markAsChanged("CREDENCIADORACFE", credenciadoraCfe);
   }

   public String getNsuOpcionalPos() {
        return this.getVo().asString("NSUOPCIONALPOS");
   }

   public void setNsuOpcionalPos(String nsuOpcionalPos) {
        markAsChanged("NSUOPCIONALPOS", nsuOpcionalPos);
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
        this.setVo(vo);
        return this;
   }
}
