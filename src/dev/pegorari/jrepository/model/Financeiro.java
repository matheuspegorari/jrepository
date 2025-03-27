package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Financeiro extends AbstractSankhyaEntity<Financeiro> {
   public String getTipMulta() {
        return this.getVo().asString("TIPMULTA");
   }

   public void setTipMulta(String tipMulta) {
        markAsChanged("TIPMULTA", tipMulta);
   }

   public BigDecimal getVlrALiberar() {
        return this.getVo().asBigDecimal("VLRALIBERAR");
   }

   public void setVlrALiberar(BigDecimal vlrALiberar) {
        markAsChanged("VLRALIBERAR", vlrALiberar);
   }

   public BigDecimal getVlrAtual() {
        return this.getVo().asBigDecimal("VLRATUAL");
   }

   public void setVlrAtual(BigDecimal vlrAtual) {
        markAsChanged("VLRATUAL", vlrAtual);
   }

   public BigDecimal getVlrBaixa() {
        return this.getVo().asBigDecimal("VLRBAIXA");
   }

   public void setVlrBaixa(BigDecimal vlrBaixa) {
        markAsChanged("VLRBAIXA", vlrBaixa);
   }

   public BigDecimal getVlrCessao() {
        return this.getVo().asBigDecimal("VLRCESSAO");
   }

   public void setVlrCessao(BigDecimal vlrCessao) {
        markAsChanged("VLRCESSAO", vlrCessao);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuBaixa() {
        return this.getVo().asBigDecimal("CODUSUBAIXA");
   }

   public void setCodUsuBaixa(BigDecimal codUsuBaixa) {
        markAsChanged("CODUSUBAIXA", codUsuBaixa);
   }

   public BigDecimal getCodVeiculo() {
        return this.getVo().asBigDecimal("CODVEICULO");
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
   }

   public String getAgenciaCmc7() {
        return this.getVo().asString("AGENCIA_CMC7");
   }

   public void setAgenciaCmc7(String agenciaCmc7) {
        markAsChanged("AGENCIA_CMC7", agenciaCmc7);
   }

   public BigDecimal getAliqIcms() {
        return this.getVo().asBigDecimal("ALIQICMS");
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        markAsChanged("ALIQICMS", aliqIcms);
   }

   public BigDecimal getAtraso() {
        return this.getVo().asBigDecimal("ATRASO");
   }

   public void setAtraso(BigDecimal atraso) {
        markAsChanged("ATRASO", atraso);
   }

   public String getAutorizado() {
        return this.getVo().asString("AUTORIZADO");
   }

   public void setAutorizado(String autorizado) {
        markAsChanged("AUTORIZADO", autorizado);
   }

   public BigDecimal getBaseIcms() {
        return this.getVo().asBigDecimal("BASEICMS");
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        markAsChanged("BASEICMS", baseIcms);
   }

   public BigDecimal getCarta() {
        return this.getVo().asBigDecimal("CARTA");
   }

   public void setCarta(BigDecimal carta) {
        markAsChanged("CARTA", carta);
   }

   public BigDecimal getCartaoDesc() {
        return this.getVo().asBigDecimal("CARTAODESC");
   }

   public void setCartaoDesc(BigDecimal cartaoDesc) {
        markAsChanged("CARTAODESC", cartaoDesc);
   }

   public String getCgcCpfCmc7() {
        return this.getVo().asString("CGC_CPF_CMC7");
   }

   public void setCgcCpfCmc7(String cgcCpfCmc7) {
        markAsChanged("CGC_CPF_CMC7", cgcCpfCmc7);
   }

   public String getCgcCpfParc() {
        return this.getVo().asString("CGC_CPF_PARC");
   }

   public void setCgcCpfParc(String cgcCpfParc) {
        markAsChanged("CGC_CPF_PARC", cgcCpfParc);
   }

   public String getChaveCte() {
        return this.getVo().asString("CHAVECTE");
   }

   public void setChaveCte(String chaveCte) {
        markAsChanged("CHAVECTE", chaveCte);
   }

   public String getChaveCteRef() {
        return this.getVo().asString("CHAVECTEREF");
   }

   public void setChaveCteRef(String chaveCteRef) {
        markAsChanged("CHAVECTEREF", chaveCteRef);
   }

   public String getCodBarra() {
        return this.getVo().asString("CODBARRA");
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
   }

   public BigDecimal getCodBco() {
        return this.getVo().asBigDecimal("CODBCO");
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
   }

   public BigDecimal getCodBcoCmc7() {
        return this.getVo().asBigDecimal("CODBCO_CMC7");
   }

   public void setCodBcoCmc7(BigDecimal codBcoCmc7) {
        markAsChanged("CODBCO_CMC7", codBcoCmc7);
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

   public BigDecimal getCodCfo() {
        return this.getVo().asBigDecimal("CODCFO");
   }

   public void setCodCfo(BigDecimal codCfo) {
        markAsChanged("CODCFO", codCfo);
   }

   public BigDecimal getCodContato() {
        return this.getVo().asBigDecimal("CODCONTATO");
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
   }

   public BigDecimal getCodCtaBcoInt() {
        return this.getVo().asBigDecimal("CODCTABCOINT");
   }

   public void setCodCtaBcoInt(BigDecimal codCtaBcoInt) {
        markAsChanged("CODCTABCOINT", codCtaBcoInt);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEmpBaixa() {
        return this.getVo().asBigDecimal("CODEMPBAIXA");
   }

   public void setCodEmpBaixa(BigDecimal codEmpBaixa) {
        markAsChanged("CODEMPBAIXA", codEmpBaixa);
   }

   public BigDecimal getCodFunc() {
        return this.getVo().asBigDecimal("CODFUNC");
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
   }

   public BigDecimal getCodHistAc() {
        return this.getVo().asBigDecimal("CODHISTAC");
   }

   public void setCodHistAc(BigDecimal codHistAc) {
        markAsChanged("CODHISTAC", codHistAc);
   }

   public String getCodigoBarra() {
        return this.getVo().asString("CODIGOBARRA");
   }

   public void setCodigoBarra(String codigoBarra) {
        markAsChanged("CODIGOBARRA", codigoBarra);
   }

   public BigDecimal getCodLanc() {
        return this.getVo().asBigDecimal("CODLANC");
   }

   public void setCodLanc(BigDecimal codLanc) {
        markAsChanged("CODLANC", codLanc);
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

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getVlrDesc() {
        return this.getVo().asBigDecimal("VLRDESC");
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        markAsChanged("VLRDESC", vlrDesc);
   }

   public BigDecimal getVlrDescEmbut() {
        return this.getVo().asBigDecimal("VLRDESCEMBUT");
   }

   public void setVlrDescEmbut(BigDecimal vlrDescEmbut) {
        markAsChanged("VLRDESCEMBUT", vlrDescEmbut);
   }

   public BigDecimal getVlrDesdob() {
        return this.getVo().asBigDecimal("VLRDESDOB");
   }

   public void setVlrDesdob(BigDecimal vlrDesdob) {
        markAsChanged("VLRDESDOB", vlrDesdob);
   }

   public BigDecimal getVlrFatCartao() {
        return this.getVo().asBigDecimal("VLRFATCARTAO");
   }

   public void setVlrFatCartao(BigDecimal vlrFatCartao) {
        markAsChanged("VLRFATCARTAO", vlrFatCartao);
   }

   public BigDecimal getVlrIcms() {
        return this.getVo().asBigDecimal("VLRICMS");
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
   }

   public BigDecimal getVlrInss() {
        return this.getVo().asBigDecimal("VLRINSS");
   }

   public void setVlrInss(BigDecimal vlrInss) {
        markAsChanged("VLRINSS", vlrInss);
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

   public BigDecimal getVlrJuroCalc() {
        return this.getVo().asBigDecimal("VLRJUROCALC");
   }

   public void setVlrJuroCalc(BigDecimal vlrJuroCalc) {
        markAsChanged("VLRJUROCALC", vlrJuroCalc);
   }

   public BigDecimal getVlrJuroEmbut() {
        return this.getVo().asBigDecimal("VLRJUROEMBUT");
   }

   public void setVlrJuroEmbut(BigDecimal vlrJuroEmbut) {
        markAsChanged("VLRJUROEMBUT", vlrJuroEmbut);
   }

   public BigDecimal getVlrJuroLib() {
        return this.getVo().asBigDecimal("VLRJUROLIB");
   }

   public void setVlrJuroLib(BigDecimal vlrJuroLib) {
        markAsChanged("VLRJUROLIB", vlrJuroLib);
   }

   public BigDecimal getVlrJuroNegoc() {
        return this.getVo().asBigDecimal("VLRJURONEGOC");
   }

   public void setVlrJuroNegoc(BigDecimal vlrJuroNegoc) {
        markAsChanged("VLRJURONEGOC", vlrJuroNegoc);
   }

   public BigDecimal getCodParcMatriz() {
        return this.getVo().asBigDecimal("CODPARCMATRIZ");
   }

   public void setCodParcMatriz(BigDecimal codParcMatriz) {
        markAsChanged("CODPARCMATRIZ", codParcMatriz);
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

   public BigDecimal getCodTipOperBaixa() {
        return this.getVo().asBigDecimal("CODTIPOPERBAIXA");
   }

   public void setCodTipOperBaixa(BigDecimal codTipOperBaixa) {
        markAsChanged("CODTIPOPERBAIXA", codTipOperBaixa);
   }

   public BigDecimal getCodTipTit() {
        return this.getVo().asBigDecimal("CODTIPTIT");
   }

   public void setCodTipTit(BigDecimal codTipTit) {
        markAsChanged("CODTIPTIT", codTipTit);
   }

   public String getBaixaApi() {
        return this.getVo().asString("BAIXAAPI");
   }

   public void setBaixaApi(String baixaApi) {
        markAsChanged("BAIXAAPI", baixaApi);
   }

   public BigDecimal getVlrLiquido() {
        return this.getVo().asBigDecimal("VLRLIQUIDO");
   }

   public void setVlrLiquido(BigDecimal vlrLiquido) {
        markAsChanged("VLRLIQUIDO", vlrLiquido);
   }

   public BigDecimal getVlrMoeda() {
        return this.getVo().asBigDecimal("VLRMOEDA");
   }

   public void setVlrMoeda(BigDecimal vlrMoeda) {
        markAsChanged("VLRMOEDA", vlrMoeda);
   }

   public BigDecimal getVlrMoedaBaixa() {
        return this.getVo().asBigDecimal("VLRMOEDABAIXA");
   }

   public void setVlrMoedaBaixa(BigDecimal vlrMoedaBaixa) {
        markAsChanged("VLRMOEDABAIXA", vlrMoedaBaixa);
   }

   public BigDecimal getVlrMulta() {
        return this.getVo().asBigDecimal("VLRMULTA");
   }

   public void setVlrMulta(BigDecimal vlrMulta) {
        markAsChanged("VLRMULTA", vlrMulta);
   }

   public BigDecimal getVlrMultaCalc() {
        return this.getVo().asBigDecimal("VLRMULTACALC");
   }

   public void setVlrMultaCalc(BigDecimal vlrMultaCalc) {
        markAsChanged("VLRMULTACALC", vlrMultaCalc);
   }

   public BigDecimal getVlrMultaEmbut() {
        return this.getVo().asBigDecimal("VLRMULTAEMBUT");
   }

   public void setVlrMultaEmbut(BigDecimal vlrMultaEmbut) {
        markAsChanged("VLRMULTAEMBUT", vlrMultaEmbut);
   }

   public BigDecimal getVlrMultaLib() {
        return this.getVo().asBigDecimal("VLRMULTALIB");
   }

   public void setVlrMultaLib(BigDecimal vlrMultaLib) {
        markAsChanged("VLRMULTALIB", vlrMultaLib);
   }

   public BigDecimal getVlrMultaNegoc() {
        return this.getVo().asBigDecimal("VLRMULTANEGOC");
   }

   public void setVlrMultaNegoc(BigDecimal vlrMultaNegoc) {
        markAsChanged("VLRMULTANEGOC", vlrMultaNegoc);
   }

   public BigDecimal getVlrProv() {
        return this.getVo().asBigDecimal("VLRPROV");
   }

   public void setVlrProv(BigDecimal vlrProv) {
        markAsChanged("VLRPROV", vlrProv);
   }

   public BigDecimal getVlrTotalCalc() {
        return this.getVo().asBigDecimal("VLRTOTALCALC");
   }

   public void setVlrTotalCalc(BigDecimal vlrTotalCalc) {
        markAsChanged("VLRTOTALCALC", vlrTotalCalc);
   }

   public BigDecimal getVlrTroco() {
        return this.getVo().asBigDecimal("VLRTROCO");
   }

   public void setVlrTroco(BigDecimal vlrTroco) {
        markAsChanged("VLRTROCO", vlrTroco);
   }

   public BigDecimal getVlrVarCambial() {
        return this.getVo().asBigDecimal("VLRVARCAMBIAL");
   }

   public void setVlrVarCambial(BigDecimal vlrVarCambial) {
        markAsChanged("VLRVARCAMBIAL", vlrVarCambial);
   }

   public BigDecimal getVlrVendor() {
        return this.getVo().asBigDecimal("VLRVENDOR");
   }

   public void setVlrVendor(BigDecimal vlrVendor) {
        markAsChanged("VLRVENDOR", vlrVendor);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public String getSerieEntSafFix() {
        return this.getVo().asString("SERIEENTSAFFIX");
   }

   public void setSerieEntSafFix(String serieEntSafFix) {
        markAsChanged("SERIEENTSAFFIX", serieEntSafFix);
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

   public String getSerieNotaCompl() {
        return this.getVo().asString("SERIENOTACOMPL");
   }

   public void setSerieNotaCompl(String serieNotaCompl) {
        markAsChanged("SERIENOTACOMPL", serieNotaCompl);
   }

   public String getStatusGnre() {
        return this.getVo().asString("STATUSGNRE");
   }

   public void setStatusGnre(String statusGnre) {
        markAsChanged("STATUSGNRE", statusGnre);
   }

   public String getRetornadoAc() {
        return this.getVo().asString("RETORNADOAC");
   }

   public void setRetornadoAc(String retornadoAc) {
        markAsChanged("RETORNADOAC", retornadoAc);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getContabilizadoPdd() {
        return this.getVo().asString("CONTABILIZADOPDD");
   }

   public void setContabilizadoPdd(String contabilizadoPdd) {
        markAsChanged("CONTABILIZADOPDD", contabilizadoPdd);
   }

   public String getContaCmc7() {
        return this.getVo().asString("CONTA_CMC7");
   }

   public void setContaCmc7(String contaCmc7) {
        markAsChanged("CONTA_CMC7", contaCmc7);
   }

   public BigDecimal getStatusLib() {
        return this.getVo().asBigDecimal("STATUSLIB");
   }

   public void setStatusLib(BigDecimal statusLib) {
        markAsChanged("STATUSLIB", statusLib);
   }

   public String getTipJuro() {
        return this.getVo().asString("TIPJURO");
   }

   public void setTipJuro(String tipJuro) {
        markAsChanged("TIPJURO", tipJuro);
   }

   public String getTipMarcCheq() {
        return this.getVo().asString("TIPMARCCHEQ");
   }

   public void setTipMarcCheq(String tipMarcCheq) {
        markAsChanged("TIPMARCCHEQ", tipMarcCheq);
   }

   public BigDecimal getVlrCheque() {
        return this.getVo().asBigDecimal("VLRCHEQUE");
   }

   public void setVlrCheque(BigDecimal vlrCheque) {
        markAsChanged("VLRCHEQUE", vlrCheque);
   }

   public BigDecimal getCodUsuCobr() {
        return this.getVo().asBigDecimal("CODUSUCOBR");
   }

   public void setCodUsuCobr(BigDecimal codUsuCobr) {
        markAsChanged("CODUSUCOBR", codUsuCobr);
   }

   public BigDecimal getVlrDescCalc() {
        return this.getVo().asBigDecimal("VLRDESCCALC");
   }

   public void setVlrDescCalc(BigDecimal vlrDescCalc) {
        markAsChanged("VLRDESCCALC", vlrDescCalc);
   }

   public BigDecimal getJurosAvp() {
        return this.getVo().asBigDecimal("JUROSAVP");
   }

   public void setJurosAvp(BigDecimal jurosAvp) {
        markAsChanged("JUROSAVP", jurosAvp);
   }

   public String getRateadoCab() {
        return this.getVo().asString("RATEADOCAB");
   }

   public void setRateadoCab(String rateadoCab) {
        markAsChanged("RATEADOCAB", rateadoCab);
   }

   public String getTpAgNfce() {
        return this.getVo().asString("TPAGNFCE");
   }

   public void setTpAgNfce(String tpAgNfce) {
        markAsChanged("TPAGNFCE", tpAgNfce);
   }

   public BigDecimal getValorPresente() {
        return this.getVo().asBigDecimal("VALORPRESENTE");
   }

   public void setValorPresente(BigDecimal valorPresente) {
        markAsChanged("VALORPRESENTE", valorPresente);
   }

   public String getCtaBcoBaixa() {
        return this.getVo().asString("CTABCOBAIXA");
   }

   public void setCtaBcoBaixa(String ctaBcoBaixa) {
        markAsChanged("CTABCOBAIXA", ctaBcoBaixa);
   }

   public String getDescAlineaCheqDev() {
        return this.getVo().asString("DESCALINEACHEQDEV");
   }

   public void setDescAlineaCheqDev(String descAlineaCheqDev) {
        markAsChanged("DESCALINEACHEQDEV", descAlineaCheqDev);
   }

   public String getDescrHistAc() {
        return this.getVo().asString("DESCRHISTAC");
   }

   public void setDescrHistAc(String descrHistAc) {
        markAsChanged("DESCRHISTAC", descrHistAc);
   }

   public String getDescrLancBco() {
        return this.getVo().asString("DESCRLANCBCO");
   }

   public void setDescrLancBco(String descrLancBco) {
        markAsChanged("DESCRLANCBCO", descrLancBco);
   }

   public String getDesdobDupl() {
        return this.getVo().asString("DESDOBDUPL");
   }

   public void setDesdobDupl(String desdobDupl) {
        markAsChanged("DESDOBDUPL", desdobDupl);
   }

   public String getDesdobramento() {
        return this.getVo().asString("DESDOBRAMENTO");
   }

   public void setDesdobramento(String desdobramento) {
        markAsChanged("DESDOBRAMENTO", desdobramento);
   }

   public BigDecimal getDespCart() {
        return this.getVo().asBigDecimal("DESPCART");
   }

   public void setDespCart(BigDecimal despCart) {
        markAsChanged("DESPCART", despCart);
   }

   public Timestamp getDhBaixa() {
        return this.getVo().asTimestamp("DHBAIXA");
   }

   public void setDhBaixa(Timestamp dhBaixa) {
        markAsChanged("DHBAIXA", dhBaixa);
   }

   public Timestamp getDhMov() {
        return this.getVo().asTimestamp("DHMOV");
   }

   public void setDhMov(Timestamp dhMov) {
        markAsChanged("DHMOV", dhMov);
   }

   public Timestamp getDhTipOper() {
        return this.getVo().asTimestamp("DHTIPOPER");
   }

   public void setDhTipOper(Timestamp dhTipOper) {
        markAsChanged("DHTIPOPER", dhTipOper);
   }

   public Timestamp getDhTipOperBaixa() {
        return this.getVo().asTimestamp("DHTIPOPERBAIXA");
   }

   public void setDhTipOperBaixa(Timestamp dhTipOperBaixa) {
        markAsChanged("DHTIPOPERBAIXA", dhTipOperBaixa);
   }

   public String getDigSafra() {
        return this.getVo().asString("DIGSAFRA");
   }

   public void setDigSafra(String digSafra) {
        markAsChanged("DIGSAFRA", digSafra);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtBaixaPrev() {
        return this.getVo().asTimestamp("DTBAIXAPREV");
   }

   public void setDtBaixaPrev(Timestamp dtBaixaPrev) {
        markAsChanged("DTBAIXAPREV", dtBaixaPrev);
   }

   public Timestamp getDtContab() {
        return this.getVo().asTimestamp("DTCONTAB");
   }

   public void setDtContab(Timestamp dtContab) {
        markAsChanged("DTCONTAB", dtContab);
   }

   public Timestamp getDtContabBaixa() {
        return this.getVo().asTimestamp("DTCONTABBAIXA");
   }

   public void setDtContabBaixa(Timestamp dtContabBaixa) {
        markAsChanged("DTCONTABBAIXA", dtContabBaixa);
   }

   public Timestamp getDtEntSai() {
        return this.getVo().asTimestamp("DTENTSAI");
   }

   public void setDtEntSai(Timestamp dtEntSai) {
        markAsChanged("DTENTSAI", dtEntSai);
   }

   public Timestamp getDtNeg() {
        return this.getVo().asTimestamp("DTNEG");
   }

   public void setDtNeg(Timestamp dtNeg) {
        markAsChanged("DTNEG", dtNeg);
   }

   public Timestamp getDtNegFilter() {
        return this.getVo().asTimestamp("DTNEGFILTER");
   }

   public void setDtNegFilter(Timestamp dtNegFilter) {
        markAsChanged("DTNEGFILTER", dtNegFilter);
   }

   public Timestamp getDtVenc() {
        return this.getVo().asTimestamp("DTVENC");
   }

   public void setDtVenc(Timestamp dtVenc) {
        markAsChanged("DTVENC", dtVenc);
   }

   public Timestamp getDtVencInic() {
        return this.getVo().asTimestamp("DTVENCINIC");
   }

   public void setDtVencInic(Timestamp dtVencInic) {
        markAsChanged("DTVENCINIC", dtVencInic);
   }

   public String getHistorico() {
        return this.getVo().asString("HISTORICO");
   }

   public void setHistorico(String historico) {
        markAsChanged("HISTORICO", historico);
   }

   public String getBloqVar() {
        return this.getVo().asString("BLOQVAR");
   }

   public void setBloqVar(String bloqVar) {
        markAsChanged("BLOQVAR", bloqVar);
   }

   public BigDecimal getIdLoteFdic() {
        return this.getVo().asBigDecimal("IDLOTEFDIC");
   }

   public void setIdLoteFdic(BigDecimal idLoteFdic) {
        markAsChanged("IDLOTEFDIC", idLoteFdic);
   }

   public String getInssRetido() {
        return this.getVo().asString("INSSRETIDO");
   }

   public void setInssRetido(String inssRetido) {
        markAsChanged("INSSRETIDO", inssRetido);
   }

   public String getIrfRetido() {
        return this.getVo().asString("IRFRETIDO");
   }

   public void setIrfRetido(String irfRetido) {
        markAsChanged("IRFRETIDO", irfRetido);
   }

   public String getIssRetido() {
        return this.getVo().asString("ISSRETIDO");
   }

   public void setIssRetido(String issRetido) {
        markAsChanged("ISSRETIDO", issRetido);
   }

   public String getLinhaDigitavel() {
        return this.getVo().asString("LINHADIGITAVEL");
   }

   public void setLinhaDigitavel(String linhaDigitavel) {
        markAsChanged("LINHADIGITAVEL", linhaDigitavel);
   }

   public BigDecimal getM2() {
        return this.getVo().asBigDecimal("M2");
   }

   public void setM2(BigDecimal m2) {
        markAsChanged("M2", m2);
   }

   public String getModeloNfDes() {
        return this.getVo().asString("MODELONFDES");
   }

   public void setModeloNfDes(String modeloNfDes) {
        markAsChanged("MODELONFDES", modeloNfDes);
   }

   public String getMostrarEneg() {
        return this.getVo().asString("MOSTRARENEG");
   }

   public void setMostrarEneg(String mostrarEneg) {
        markAsChanged("MOSTRARENEG", mostrarEneg);
   }

   public String getNaturezaOperDes() {
        return this.getVo().asString("NATUREZAOPERDES");
   }

   public void setNaturezaOperDes(String naturezaOperDes) {
        markAsChanged("NATUREZAOPERDES", naturezaOperDes);
   }

   public BigDecimal getNfComplFix() {
        return this.getVo().asBigDecimal("NFCOMPLFIX");
   }

   public void setNfComplFix(BigDecimal nfComplFix) {
        markAsChanged("NFCOMPLFIX", nfComplFix);
   }

   public String getNfEntSeqFix() {
        return this.getVo().asString("NFENTSEQFIX");
   }

   public void setNfEntSeqFix(String nfEntSeqFix) {
        markAsChanged("NFENTSEQFIX", nfEntSeqFix);
   }

   public String getNomeEmitenteCmc7() {
        return this.getVo().asString("NOMEEMITENTE_CMC7");
   }

   public void setNomeEmitenteCmc7(String nomeEmitenteCmc7) {
        markAsChanged("NOMEEMITENTE_CMC7", nomeEmitenteCmc7);
   }

   public String getNossoNum() {
        return this.getVo().asString("NOSSONUM");
   }

   public void setNossoNum(String nossoNum) {
        markAsChanged("NOSSONUM", nossoNum);
   }

   public String getNroCessaoFdic() {
        return this.getVo().asString("NROCESSAOFDIC");
   }

   public void setNroCessaoFdic(String nroCessaoFdic) {
        markAsChanged("NROCESSAOFDIC", nroCessaoFdic);
   }

   public BigDecimal getNroLoteGnre() {
        return this.getVo().asBigDecimal("NROLOTEGNRE");
   }

   public void setNroLoteGnre(BigDecimal nroLoteGnre) {
        markAsChanged("NROLOTEGNRE", nroLoteGnre);
   }

   public BigDecimal getNuApon() {
        return this.getVo().asBigDecimal("NUAPONTA");
   }

   public void setNuApon(BigDecimal nuApon) {
        markAsChanged("NUAPONTA", nuApon);
   }

   public BigDecimal getNuBco() {
        return this.getVo().asBigDecimal("NUBCO");
   }

   public void setNuBco(BigDecimal nuBco) {
        markAsChanged("NUBCO", nuBco);
   }

   public BigDecimal getNuCcr() {
        return this.getVo().asBigDecimal("NUCCR");
   }

   public void setNuCcr(BigDecimal nuCcr) {
        markAsChanged("NUCCR", nuCcr);
   }

   public BigDecimal getNuCompens() {
        return this.getVo().asBigDecimal("NUCOMPENS");
   }

   public void setNuCompens(BigDecimal nuCompens) {
        markAsChanged("NUCOMPENS", nuCompens);
   }

   public BigDecimal getNuDev() {
        return this.getVo().asBigDecimal("NUDEV");
   }

   public void setNuDev(BigDecimal nuDev) {
        markAsChanged("NUDEV", nuDev);
   }

   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
   }

   public BigDecimal getNuFtc() {
        return this.getVo().asBigDecimal("NUFTC");
   }

   public void setNuFtc(BigDecimal nuFtc) {
        markAsChanged("NUFTC", nuFtc);
   }

   public BigDecimal getNumBor() {
        return this.getVo().asBigDecimal("NUMBOR");
   }

   public void setNumBor(BigDecimal numBor) {
        markAsChanged("NUMBOR", numBor);
   }

   public BigDecimal getNumComplFix() {
        return this.getVo().asBigDecimal("NUMCOMPLFIX");
   }

   public void setNumComplFix(BigDecimal numComplFix) {
        markAsChanged("NUMCOMPLFIX", numComplFix);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public BigDecimal getNumDupl() {
        return this.getVo().asBigDecimal("NUMDUPL");
   }

   public void setNumDupl(BigDecimal numDupl) {
        markAsChanged("NUMDUPL", numDupl);
   }

   public BigDecimal getNumEntSafFix() {
        return this.getVo().asBigDecimal("NUMENTSAFFIX");
   }

   public void setNumEntSafFix(BigDecimal numEntSafFix) {
        markAsChanged("NUMENTSAFFIX", numEntSafFix);
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

   public BigDecimal getNumRemessa() {
        return this.getVo().asBigDecimal("NUMREMESSA");
   }

   public void setNumRemessa(BigDecimal numRemessa) {
        markAsChanged("NUMREMESSA", numRemessa);
   }

   public BigDecimal getNumTransf() {
        return this.getVo().asBigDecimal("NUMTRANSF");
   }

   public void setNumTransf(BigDecimal numTransf) {
        markAsChanged("NUMTRANSF", numTransf);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuPed() {
        return this.getVo().asBigDecimal("NUPED");
   }

   public void setNuPed(BigDecimal nuPed) {
        markAsChanged("NUPED", nuPed);
   }

   public BigDecimal getNuReneg() {
        return this.getVo().asBigDecimal("NURENEG");
   }

   public void setNuReneg(BigDecimal nuReneg) {
        markAsChanged("NURENEG", nuReneg);
   }

   public String getObservacaoAc() {
        return this.getVo().asString("OBSERVACAOAC");
   }

   public void setObservacaoAc(String observacaoAc) {
        markAsChanged("OBSERVACAOAC", observacaoAc);
   }

   public BigDecimal getOrdemCarga() {
        return this.getVo().asBigDecimal("ORDEMCARGA");
   }

   public void setOrdemCarga(BigDecimal ordemCarga) {
        markAsChanged("ORDEMCARGA", ordemCarga);
   }

   public String getOrigem() {
        return this.getVo().asString("ORIGEM");
   }

   public void setOrigem(String origem) {
        markAsChanged("ORIGEM", origem);
   }

   public String getParcReneg() {
        return this.getVo().asString("PARCRENEG");
   }

   public void setParcReneg(String parcReneg) {
        markAsChanged("PARCRENEG", parcReneg);
   }

   public String getPdd() {
        return this.getVo().asString("PDD");
   }

   public void setPdd(String pdd) {
        markAsChanged("PDD", pdd);
   }

   public String getPertenceAc() {
        return this.getVo().asString("PERTENCEAC");
   }

   public void setPertenceAc(String pertenceAc) {
        markAsChanged("PERTENCEAC", pertenceAc);
   }

   public BigDecimal getPrazo() {
        return this.getVo().asBigDecimal("PRAZO");
   }

   public void setPrazo(BigDecimal prazo) {
        markAsChanged("PRAZO", prazo);
   }

   public String getProvisao() {
        return this.getVo().asString("PROVISAO");
   }

   public void setProvisao(String provisao) {
        markAsChanged("PROVISAO", provisao);
   }

   public String getRateado() {
        return this.getVo().asString("RATEADO");
   }

   public void setRateado(String rateado) {
        markAsChanged("RATEADO", rateado);
   }

   public BigDecimal getRecDesp() {
        return this.getVo().asBigDecimal("RECDESP");
   }

   public void setRecDesp(BigDecimal recDesp) {
        markAsChanged("RECDESP", recDesp);
   }

   public String getRecDespFilter() {
        return this.getVo().asString("RECDESPFILTER");
   }

   public void setRecDespFilter(String recDespFilter) {
        markAsChanged("RECDESPFILTER", recDespFilter);
   }

   public String getRejeicaoGnre() {
        return this.getVo().asString("REJEICAOGNRE");
   }

   public void setRejeicaoGnre(String rejeicaoGnre) {
        markAsChanged("REJEICAOGNRE", rejeicaoGnre);
   }

   public String getChequeRastreadoCmc7() {
        return this.getVo().asString("CHEQUERASTREADO_CMC7");
   }

   public void setChequeRastreadoCmc7(String chequeRastreadoCmc7) {
        markAsChanged("CHEQUERASTREADO_CMC7", chequeRastreadoCmc7);
   }

   public BigDecimal getCodIptu() {
        return this.getVo().asBigDecimal("CODIPTU");
   }

   public void setCodIptu(BigDecimal codIptu) {
        markAsChanged("CODIPTU", codIptu);
   }

   public BigDecimal getCodRegua() {
        return this.getVo().asBigDecimal("CODREGUA");
   }

   public void setCodRegua(BigDecimal codRegua) {
        markAsChanged("CODREGUA", codRegua);
   }

   public BigDecimal getIdUnico() {
        return this.getVo().asBigDecimal("IDUNICO");
   }

   public void setIdUnico(BigDecimal idUnico) {
        markAsChanged("IDUNICO", idUnico);
   }

   public BigDecimal getNuChq() {
        return this.getVo().asBigDecimal("NUCHQ");
   }

   public void setNuChq(BigDecimal nuChq) {
        markAsChanged("NUCHQ", nuChq);
   }

   public BigDecimal getSeqCaixa() {
        return this.getVo().asBigDecimal("SEQCAIXA");
   }

   public void setSeqCaixa(BigDecimal seqCaixa) {
        markAsChanged("SEQCAIXA", seqCaixa);
   }

   public String getTimBloqueada() {
        return this.getVo().asString("TIMBLOQUEADA");
   }

   public void setTimBloqueada(String timBloqueada) {
        markAsChanged("TIMBLOQUEADA", timBloqueada);
   }

   public BigDecimal getTimContaLanc() {
        return this.getVo().asBigDecimal("TIMCONTALANC");
   }

   public void setTimContaLanc(BigDecimal timContaLanc) {
        markAsChanged("TIMCONTALANC", timContaLanc);
   }

   public BigDecimal getTimContaRep() {
        return this.getVo().asBigDecimal("TIMCONTAREP");
   }

   public void setTimContaRep(BigDecimal timContaRep) {
        markAsChanged("TIMCONTAREP", timContaRep);
   }

   public BigDecimal getTimContratoAdm() {
        return this.getVo().asBigDecimal("TIMCONTRATOADM");
   }

   public void setTimContratoAdm(BigDecimal timContratoAdm) {
        markAsChanged("TIMCONTRATOADM", timContratoAdm);
   }

   public BigDecimal getTimContratoLoc() {
        return this.getVo().asBigDecimal("TIMCONTRATOLOC");
   }

   public void setTimContratoLoc(BigDecimal timContratoLoc) {
        markAsChanged("TIMCONTRATOLOC", timContratoLoc);
   }

   public BigDecimal getTimContratoLtv() {
        return this.getVo().asBigDecimal("TIMCONTRATOLTV");
   }

   public void setTimContratoLtv(BigDecimal timContratoLtv) {
        markAsChanged("TIMCONTRATOLTV", timContratoLtv);
   }

   public Timestamp getTimDataDeJur() {
        return this.getVo().asTimestamp("TIMDATADEJUR");
   }

   public void setTimDataDeJur(Timestamp timDataDeJur) {
        markAsChanged("TIMDATADEJUR", timDataDeJur);
   }

   public Timestamp getTimDhBaixa() {
        return this.getVo().asTimestamp("TIMDHBAIXA");
   }

   public void setTimDhBaixa(Timestamp timDhBaixa) {
        markAsChanged("TIMDHBAIXA", timDhBaixa);
   }

   public Timestamp getTimDhGerRepasse() {
        return this.getVo().asTimestamp("TIMDHGERREPASSE");
   }

   public void setTimDhGerRepasse(Timestamp timDhGerRepasse) {
        markAsChanged("TIMDHGERREPASSE", timDhGerRepasse);
   }

   public Timestamp getTimDhGerRepParcial() {
        return this.getVo().asTimestamp("TIMDHGERREPPARCIAL");
   }

   public void setTimDhGerRepParcial(Timestamp timDhGerRepParcial) {
        markAsChanged("TIMDHGERREPPARCIAL", timDhGerRepParcial);
   }

   public Timestamp getTimDtImpBol() {
        return this.getVo().asTimestamp("TIMDTIMPBOL");
   }

   public void setTimDtImpBol(Timestamp timDtImpBol) {
        markAsChanged("TIMDTIMPBOL", timDtImpBol);
   }

   public Timestamp getTimDtImpBolLocal() {
        return this.getVo().asTimestamp("TIMDTIMPBOLLOCAL");
   }

   public void setTimDtImpBolLocal(Timestamp timDtImpBolLocal) {
        markAsChanged("TIMDTIMPBOLLOCAL", timDtImpBolLocal);
   }

   public Timestamp getTimDtRepasse() {
        return this.getVo().asTimestamp("TIMDTREPASSE");
   }

   public void setTimDtRepasse(Timestamp timDtRepasse) {
        markAsChanged("TIMDTREPASSE", timDtRepasse);
   }

   public Timestamp getTimDtRepParcial() {
        return this.getVo().asTimestamp("TIMDTREPPARCIAL");
   }

   public void setTimDtRepParcial(Timestamp timDtRepParcial) {
        markAsChanged("TIMDTREPPARCIAL", timDtRepParcial);
   }

   public String getTimEstagio() {
        return this.getVo().asString("TIMESTAGIO");
   }

   public void setTimEstagio(String timEstagio) {
        markAsChanged("TIMESTAGIO", timEstagio);
   }

   public BigDecimal getTimFechamento() {
        return this.getVo().asBigDecimal("TIMFECHAMENTO");
   }

   public void setTimFechamento(BigDecimal timFechamento) {
        markAsChanged("TIMFECHAMENTO", timFechamento);
   }

   public BigDecimal getTimFechamentoAlu() {
        return this.getVo().asBigDecimal("TIMFECHAMENTOALU");
   }

   public void setTimFechamentoAlu(BigDecimal timFechamentoAlu) {
        markAsChanged("TIMFECHAMENTOALU", timFechamentoAlu);
   }

   public BigDecimal getTimFinGarantOrig() {
        return this.getVo().asBigDecimal("TIMFINGARANTORIG");
   }

   public void setTimFinGarantOrig(BigDecimal timFinGarantOrig) {
        markAsChanged("TIMFINGARANTORIG", timFinGarantOrig);
   }

   public BigDecimal getTimImovel() {
        return this.getVo().asBigDecimal("TIMIMOVEL");
   }

   public void setTimImovel(BigDecimal timImovel) {
        markAsChanged("TIMIMOVEL", timImovel);
   }

   public BigDecimal getTimNegociacao() {
        return this.getVo().asBigDecimal("TIMNEGOCIACAO");
   }

   public void setTimNegociacao(BigDecimal timNegociacao) {
        markAsChanged("TIMNEGOCIACAO", timNegociacao);
   }

   public String getTimNomeAdvogado() {
        return this.getVo().asString("TIMNOMEADVOGADO");
   }

   public void setTimNomeAdvogado(String timNomeAdvogado) {
        markAsChanged("TIMNOMEADVOGADO", timNomeAdvogado);
   }

   public BigDecimal getTimNuFinOrig() {
        return this.getVo().asBigDecimal("TIMNUFINORIG");
   }

   public void setTimNuFinOrig(BigDecimal timNuFinOrig) {
        markAsChanged("TIMNUFINORIG", timNuFinOrig);
   }

   public BigDecimal getTimNumReg() {
        return this.getVo().asBigDecimal("TIMNUMREG");
   }

   public void setTimNumReg(BigDecimal timNumReg) {
        markAsChanged("TIMNUMREG", timNumReg);
   }

   public String getTimOrigem() {
        return this.getVo().asString("TIMORIGEM");
   }

   public void setTimOrigem(String timOrigem) {
        markAsChanged("TIMORIGEM", timOrigem);
   }

   public String getTimOrigReneg() {
        return this.getVo().asString("TIMORIGRENEG");
   }

   public void setTimOrigReneg(String timOrigReneg) {
        markAsChanged("TIMORIGRENEG", timOrigReneg);
   }

   public BigDecimal getTimParcela() {
        return this.getVo().asBigDecimal("TIMPARCELA");
   }

   public void setTimParcela(BigDecimal timParcela) {
        markAsChanged("TIMPARCELA", timParcela);
   }

   public BigDecimal getTimRenegCanclote() {
        return this.getVo().asBigDecimal("TIMRENEGCANCLOTE");
   }

   public void setTimRenegCanclote(BigDecimal timRenegCanclote) {
        markAsChanged("TIMRENEGCANCLOTE", timRenegCanclote);
   }

   public BigDecimal getTimRenegImv() {
        return this.getVo().asBigDecimal("TIMRENEGIMV");
   }

   public void setTimRenegImv(BigDecimal timRenegImv) {
        markAsChanged("TIMRENEGIMV", timRenegImv);
   }

   public BigDecimal getTimRenegLote() {
        return this.getVo().asBigDecimal("TIMRENEGLOTE");
   }

   public void setTimRenegLote(BigDecimal timRenegLote) {
        markAsChanged("TIMRENEGLOTE", timRenegLote);
   }

   public BigDecimal getTimRepInteligente() {
        return this.getVo().asBigDecimal("TIMREPINTELIGENTE");
   }

   public void setTimRepInteligente(BigDecimal timRepInteligente) {
        markAsChanged("TIMREPINTELIGENTE", timRepInteligente);
   }

   public String getTimRepParcial() {
        return this.getVo().asString("TIMREPPARCIAL");
   }

   public void setTimRepParcial(String timRepParcial) {
        markAsChanged("TIMREPPARCIAL", timRepParcial);
   }

   public BigDecimal getTimRescisaoLoc() {
        return this.getVo().asBigDecimal("TIMRESCISAOLOC");
   }

   public void setTimRescisaoLoc(BigDecimal timRescisaoLoc) {
        markAsChanged("TIMRESCISAOLOC", timRescisaoLoc);
   }

   public BigDecimal getTimRescisaoLtv() {
        return this.getVo().asBigDecimal("TIMRESCISAOLTV");
   }

   public void setTimRescisaoLtv(BigDecimal timRescisaoLtv) {
        markAsChanged("TIMRESCISAOLTV", timRescisaoLtv);
   }

   public BigDecimal getTimTipoIntermed() {
        return this.getVo().asBigDecimal("TIMTIPOINTERMED");
   }

   public void setTimTipoIntermed(BigDecimal timTipoIntermed) {
        markAsChanged("TIMTIPOINTERMED", timTipoIntermed);
   }

   public String getTimTxAdmGerAlu() {
        return this.getVo().asString("TIMTXADMGERALU");
   }

   public void setTimTxAdmGerAlu(String timTxAdmGerAlu) {
        markAsChanged("TIMTXADMGERALU", timTxAdmGerAlu);
   }

   public BigDecimal getTimVendaImv() {
        return this.getVo().asBigDecimal("TIMVENDAIMV");
   }

   public void setTimVendaImv(BigDecimal timVendaImv) {
        markAsChanged("TIMVENDAIMV", timVendaImv);
   }

   public BigDecimal getTimVendaLote() {
        return this.getVo().asBigDecimal("TIMVENDALOTE");
   }

   public void setTimVendaLote(BigDecimal timVendaLote) {
        markAsChanged("TIMVENDALOTE", timVendaLote);
   }

   public BigDecimal getTimVlrAluguel() {
        return this.getVo().asBigDecimal("TIMVLRALUGUEL");
   }

   public void setTimVlrAluguel(BigDecimal timVlrAluguel) {
        markAsChanged("TIMVLRALUGUEL", timVlrAluguel);
   }

   public BigDecimal getTimVlrAmortContrato() {
        return this.getVo().asBigDecimal("TIMVLRAMORTCONTRATO");
   }

   public void setTimVlrAmortContrato(BigDecimal timVlrAmortContrato) {
        markAsChanged("TIMVLRAMORTCONTRATO", timVlrAmortContrato);
   }

   public BigDecimal getTimVlrCorrMonet() {
        return this.getVo().asBigDecimal("TIMVLRCORRMONET");
   }

   public void setTimVlrCorrMonet(BigDecimal timVlrCorrMonet) {
        markAsChanged("TIMVLRCORRMONET", timVlrCorrMonet);
   }

   public BigDecimal getTimVlrJuroContrato() {
        return this.getVo().asBigDecimal("TIMVLRJUROCONTRATO");
   }

   public void setTimVlrJuroContrato(BigDecimal timVlrJuroContrato) {
        markAsChanged("TIMVLRJUROCONTRATO", timVlrJuroContrato);
   }

   public BigDecimal getCodObsPadrao() {
        return this.getVo().asBigDecimal("CODOBSPADRAO");
   }

   public void setCodObsPadrao(BigDecimal codObsPadrao) {
        markAsChanged("CODOBSPADRAO", codObsPadrao);
   }

   public BigDecimal getTimSac() {
        return this.getVo().asBigDecimal("TIMSAC");
   }

   public void setTimSac(BigDecimal timSac) {
        markAsChanged("TIMSAC", timSac);
   }

   public BigDecimal getAbatimentoCan() {
        return this.getVo().asBigDecimal("ABATIMENTOCAN");
   }

   public void setAbatimentoCan(BigDecimal abatimentoCan) {
        markAsChanged("ABATIMENTOCAN", abatimentoCan);
   }

   public BigDecimal getAbatimento() {
        return this.getVo().asBigDecimal("ABATIMENTO");
   }

   public void setAbatimento(BigDecimal abatimento) {
        markAsChanged("ABATIMENTO", abatimento);
   }

   public BigDecimal getCodImovelRural() {
        return this.getVo().asBigDecimal("CODIMOVELRURAL");
   }

   public void setCodImovelRural(BigDecimal codImovelRural) {
        markAsChanged("CODIMOVELRURAL", codImovelRural);
   }

   public String getRecAdiantamentoRural() {
        return this.getVo().asString("RECADIANTAMENTORURAL");
   }

   public void setRecAdiantamentoRural(String recAdiantamentoRural) {
        markAsChanged("RECADIANTAMENTORURAL", recAdiantamentoRural);
   }

   public Timestamp getDtPrazo() {
        return this.getVo().asTimestamp("DTPRAZO");
   }

   public void setDtPrazo(Timestamp dtPrazo) {
        markAsChanged("DTPRAZO", dtPrazo);
   }

   public BigDecimal getBaseIrf() {
        return this.getVo().asBigDecimal("BASEIRF");
   }

   public void setBaseIrf(BigDecimal baseIrf) {
        markAsChanged("BASEIRF", baseIrf);
   }

   public BigDecimal getBaseInss() {
        return this.getVo().asBigDecimal("BASEINSS");
   }

   public void setBaseInss(BigDecimal baseInss) {
        markAsChanged("BASEINSS", baseInss);
   }

   public BigDecimal getClassifCessaoObra() {
        return this.getVo().asBigDecimal("CLASSIFCESSAOOBRA");
   }

   public void setClassifCessaoObra(BigDecimal classifCessaoObra) {
        markAsChanged("CLASSIFCESSAOOBRA", classifCessaoObra);
   }

   public BigDecimal getCodCbe() {
        return this.getVo().asBigDecimal("CODCBE");
   }

   public void setCodCbe(BigDecimal codCbe) {
        markAsChanged("CODCBE", codCbe);
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

   public BigDecimal getCodLst() {
        return this.getVo().asBigDecimal("CODLST");
   }

   public void setCodLst(BigDecimal codLst) {
        markAsChanged("CODLST", codLst);
   }

   public String getCodObra() {
        return this.getVo().asString("CODOBRA");
   }

   public void setCodObra(String codObra) {
        markAsChanged("CODOBRA", codObra);
   }

   public BigDecimal getCodTrib() {
        return this.getVo().asBigDecimal("CODTRIB");
   }

   public void setCodTrib(BigDecimal codTrib) {
        markAsChanged("CODTRIB", codTrib);
   }

   public String getCustasProcessuais() {
        return this.getVo().asString("CUSTASPROCESSUAIS");
   }

   public void setCustasProcessuais(String custasProcessuais) {
        markAsChanged("CUSTASPROCESSUAIS", custasProcessuais);
   }

   public String getDepositoJudicial() {
        return this.getVo().asString("DEPOSITOJUDICIAL");
   }

   public void setDepositoJudicial(String depositoJudicial) {
        markAsChanged("DEPOSITOJUDICIAL", depositoJudicial);
   }

   public String getDespAdvogado() {
        return this.getVo().asString("DESPADVOGADO");
   }

   public void setDespAdvogado(String despAdvogado) {
        markAsChanged("DESPADVOGADO", despAdvogado);
   }

   public String getExigeIssqn() {
        return this.getVo().asString("EXIGEISSQN");
   }

   public void setExigeIssqn(String exigeIssqn) {
        markAsChanged("EXIGEISSQN", exigeIssqn);
   }

   public String getMotNaoReterIssqn() {
        return this.getVo().asString("MOTNAORETERISSQN");
   }

   public void setMotNaoReterIssqn(String motNaoReterIssqn) {
        markAsChanged("MOTNAORETERISSQN", motNaoReterIssqn);
   }

   public String getNumProcAdmJudic() {
        return this.getVo().asString("NUMPROCADMJUDIC");
   }

   public void setNumProcAdmJudic(String numProcAdmJudic) {
        markAsChanged("NUMPROCADMJUDIC", numProcAdmJudic);
   }

   public BigDecimal getObraConstCivil() {
        return this.getVo().asBigDecimal("OBRACONSTCIVIL");
   }

   public void setObraConstCivil(BigDecimal obraConstCivil) {
        markAsChanged("OBRACONSTCIVIL", obraConstCivil);
   }

   public String getRegEspTribut() {
        return this.getVo().asString("REGESPTRIBUT");
   }

   public void setRegEspTribut(String regEspTribut) {
        markAsChanged("REGESPTRIBUT", regEspTribut);
   }

   public String getSitEspecialResp() {
        return this.getVo().asString("SITESPECIALRESP");
   }

   public void setSitEspecialResp(String sitEspecialResp) {
        markAsChanged("SITESPECIALRESP", sitEspecialResp);
   }

   public String getRecebCartao() {
        return this.getVo().asString("RECEBCARTAO");
   }

   public void setRecebCartao(String recebCartao) {
        markAsChanged("RECEBCARTAO", recebCartao);
   }

   public BigDecimal getVlrJurosMaisMulta() {
        return this.getVo().asBigDecimal("VLRJUROSMAISMULTA");
   }

   public void setVlrJurosMaisMulta(BigDecimal vlrJurosMaisMulta) {
        markAsChanged("VLRJUROSMAISMULTA", vlrJurosMaisMulta);
   }

   public BigDecimal getAtrasoInicial() {
        return this.getVo().asBigDecimal("ATRASOINICIAL");
   }

   public void setAtrasoInicial(BigDecimal atrasoInicial) {
        markAsChanged("ATRASOINICIAL", atrasoInicial);
   }

   public BigDecimal getPrazoInicial() {
        return this.getVo().asBigDecimal("PRAZOINICIAL");
   }

   public void setPrazoInicial(BigDecimal prazoInicial) {
        markAsChanged("PRAZOINICIAL", prazoInicial);
   }

   public BigDecimal getPercDesc() {
        return this.getVo().asBigDecimal("PERCDESC");
   }

   public void setPercDesc(BigDecimal percDesc) {
        markAsChanged("PERCDESC", percDesc);
   }

   public String getMonioCorem() {
        return this.getVo().asString("MONIOCOREM");
   }

   public void setMonioCorem(String monioCorem) {
        markAsChanged("MONIOCOREM", monioCorem);
   }

   public BigDecimal getNuCkc() {
        return this.getVo().asBigDecimal("NUCKC");
   }

   public void setNuCkc(BigDecimal nuCkc) {
        markAsChanged("NUCKC", nuCkc);
   }

   public String getChaveNfeGnre() {
        return this.getVo().asString("CHAVENFEGNRE");
   }

   public void setChaveNfeGnre(String chaveNfeGnre) {
        markAsChanged("CHAVENFEGNRE", chaveNfeGnre);
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

   public String getConciliado() {
        return this.getVo().asString("CONCILIADO");
   }

   public void setConciliado(String conciliado) {
        markAsChanged("CONCILIADO", conciliado);
   }

   public Timestamp getDhConcil() {
        return this.getVo().asTimestamp("DHCONCIL");
   }

   public void setDhConcil(Timestamp dhConcil) {
        markAsChanged("DHCONCIL", dhConcil);
   }

   public String getEmvPix() {
        return this.getVo().asString("EMVPIX");
   }

   public void setEmvPix(String emvPix) {
        markAsChanged("EMVPIX", emvPix);
   }

   public String getChavePix() {
        return this.getVo().asString("CHAVEPIX");
   }

   public void setChavePix(String chavePix) {
        markAsChanged("CHAVEPIX", chavePix);
   }

   public Timestamp getDtInitRefApuracao() {
        return this.getVo().asTimestamp("DTINITREFAPURACAO");
   }

   public void setDtInitRefApuracao(Timestamp dtInitRefApuracao) {
        markAsChanged("DTINITREFAPURACAO", dtInitRefApuracao);
   }

   public String getIdTransacaoPix() {
        return this.getVo().asString("IDTRANSACAOPIX");
   }

   public void setIdTransacaoPix(String idTransacaoPix) {
        markAsChanged("IDTRANSACAOPIX", idTransacaoPix);
   }

   public BigDecimal getSubTipoVenda() {
        return this.getVo().asBigDecimal("SUBTIPOVENDA");
   }

   public void setSubTipoVenda(BigDecimal subTipoVenda) {
        markAsChanged("SUBTIPOVENDA", subTipoVenda);
   }

   public BigDecimal getTrocoPdv() {
        return this.getVo().asBigDecimal("TROCOPDV");
   }

   public void setTrocoPdv(BigDecimal trocoPdv) {
        markAsChanged("TROCOPDV", trocoPdv);
   }

   public String getTipApuracao() {
        return this.getVo().asString("TIPAPURACAO");
   }

   public void setTipApuracao(String tipApuracao) {
        markAsChanged("TIPAPURACAO", tipApuracao);
   }

   public String getDescrTpagNfce() {
        return this.getVo().asString("DESCRTPAGNFCE");
   }

   public void setDescrTpagNfce(String descrTpagNfce) {
        markAsChanged("DESCRTPAGNFCE", descrTpagNfce);
   }

   public Timestamp getDtAntecipacao() {
        return this.getVo().asTimestamp("DTANTECIPACAO");
   }

   public void setDtAntecipacao(Timestamp dtAntecipacao) {
        markAsChanged("DTANTECIPACAO", dtAntecipacao);
   }

   public BigDecimal getNuAntBanc() {
        return this.getVo().asBigDecimal("NUANTBANC");
   }

   public void setNuAntBanc(BigDecimal nuAntBanc) {
        markAsChanged("NUANTBANC", nuAntBanc);
   }

   public String getAntecipado() {
        return this.getVo().asString("ANTECIPADO");
   }

   public void setAntecipado(String antecipado) {
        markAsChanged("ANTECIPADO", antecipado);
   }

   public Timestamp getDtEntSaiInfo() {
        return this.getVo().asTimestamp("DTENTSAIINFO");
   }

   public void setDtEntSaiInfo(Timestamp dtEntSaiInfo) {
        markAsChanged("DTENTSAIINFO", dtEntSaiInfo);
   }

   public BigDecimal getVlrGnreDois() {
        return this.getVo().asBigDecimal("VLRGNREDOIS");
   }

   public void setVlrGnreDois(BigDecimal vlrGnreDois) {
        markAsChanged("VLRGNREDOIS", vlrGnreDois);
   }

   public String getRecebido() {
        return this.getVo().asString("RECEBIDO");
   }

   public void setRecebido(String recebido) {
        markAsChanged("RECEBIDO", recebido);
   }

   public Timestamp getRefAtCon() {
        return this.getVo().asTimestamp("REFATCON");
   }

   public void setRefAtCon(Timestamp refAtCon) {
        markAsChanged("REFATCON", refAtCon);
   }

   public String getCodReceita() {
        return this.getVo().asString("CODRECEITA");
   }

   public void setCodReceita(String codReceita) {
        markAsChanged("CODRECEITA", codReceita);
   }

   public String getContabilizado() {
        return this.getVo().asString("CONTABILIZADO");
   }

   public void setContabilizado(String contabilizado) {
        markAsChanged("CONTABILIZADO", contabilizado);
   }

   public Timestamp getDtIntegracaoIpi() {
        return this.getVo().asTimestamp("DTINTEGRACAOIPI");
   }

   public void setDtIntegracaoIpi(Timestamp dtIntegracaoIpi) {
        markAsChanged("DTINTEGRACAOIPI", dtIntegracaoIpi);
   }

   public Timestamp getDtReferencia() {
        return this.getVo().asTimestamp("DTREFERENCIA");
   }

   public void setDtReferencia(Timestamp dtReferencia) {
        markAsChanged("DTREFERENCIA", dtReferencia);
   }

   public String getNumDocArrecad() {
        return this.getVo().asString("NUMDOCARRECAD");
   }

   public void setNumDocArrecad(String numDocArrecad) {
        markAsChanged("NUMDOCARRECAD", numDocArrecad);
   }

   public BigDecimal getNuVerba() {
        return this.getVo().asBigDecimal("NUVERBA");
   }

   public void setNuVerba(BigDecimal nuVerba) {
        markAsChanged("NUVERBA", nuVerba);
   }

   public BigDecimal getVlrDesdobCalc() {
        return this.getVo().asBigDecimal("VLRDESDOBCALC");
   }

   public void setVlrDesdobCalc(BigDecimal vlrDesdobCalc) {
        markAsChanged("VLRDESDOBCALC", vlrDesdobCalc);
   }

   public BigDecimal getVlrLancOrig() {
        return this.getVo().asBigDecimal("VLRLANCORIG");
   }

   public void setVlrLancOrig(BigDecimal vlrLancOrig) {
        markAsChanged("VLRLANCORIG", vlrLancOrig);
   }

   public BigDecimal getNroImport() {
        return this.getVo().asBigDecimal("NROIMPORT");
   }

   public void setNroImport(BigDecimal nroImport) {
        markAsChanged("NROIMPORT", nroImport);
   }

   public BigDecimal getNuCaixa() {
        return this.getVo().asBigDecimal("NUCAIXA");
   }

   public void setNuCaixa(BigDecimal nuCaixa) {
        markAsChanged("NUCAIXA", nuCaixa);
   }

   public String getSangDespPdv() {
        return this.getVo().asString("SANGDESPDV");
   }

   public void setSangDespPdv(String sangDespPdv) {
        markAsChanged("SANGDESPDV", sangDespPdv);
   }

   public String getCodPror() {
        return this.getVo().asString("CODPROR");
   }

   public void setCodPror(String codPror) {
        markAsChanged("CODPROR", codPror);
   }

   public BigDecimal getCodUsuPror() {
        return this.getVo().asBigDecimal("CODUSUPROR");
   }

   public void setCodUsuPror(BigDecimal codUsuPror) {
        markAsChanged("CODUSUPROR", codUsuPror);
   }

   public Timestamp getDtPror() {
        return this.getVo().asTimestamp("DTPROR");
   }

   public void setDtPror(Timestamp dtPror) {
        markAsChanged("DTPROR", dtPror);
   }

   public Timestamp getNvDtVenc() {
        return this.getVo().asTimestamp("NVDTVENC");
   }

   public void setNvDtVenc(Timestamp nvDtVenc) {
        markAsChanged("NVDTVENC", nvDtVenc);
   }

   public String getPendenteCriarDesp() {
        return this.getVo().asString("PENDENTECRIARDESP");
   }

   public void setPendenteCriarDesp(String pendenteCriarDesp) {
        markAsChanged("PENDENTECRIARDESP", pendenteCriarDesp);
   }

   public String getProrrogado() {
        return this.getVo().asString("PRORROGADO");
   }

   public void setProrrogado(String prorrogado) {
        markAsChanged("PRORROGADO", prorrogado);
   }

   public String getNumOcorrencias() {
        return this.getVo().asString("NUMOCORRENCIAS");
   }

   public void setNumOcorrencias(String numOcorrencias) {
        markAsChanged("NUMOCORRENCIAS", numOcorrencias);
   }

   public String getMetodoCalcIrrf() {
        return this.getVo().asString("METODOCALCIRRF");
   }

   public void setMetodoCalcIrrf(String metodoCalcIrrf) {
        markAsChanged("METODOCALCIRRF", metodoCalcIrrf);
   }

   public BigDecimal getVlrIcmsXmlCte() {
        return this.getVo().asBigDecimal("VLRICMSXMLCTE");
   }

   public void setVlrIcmsXmlCte(BigDecimal vlrIcmsXmlCte) {
        markAsChanged("VLRICMSXMLCTE", vlrIcmsXmlCte);
   }

   public BigDecimal getPixTef() {
        return this.getVo().asBigDecimal("PIXTEF");
   }

   public void setPixTef(BigDecimal pixTef) {
        markAsChanged("PIXTEF", pixTef);
   }

   public String getCodOperacaoVendaMais() {
        return this.getVo().asString("CODOPERACAOVENDAMAIS");
   }

   public void setCodOperacaoVendaMais(String codOperacaoVendaMais) {
        markAsChanged("CODOPERACAOVENDAMAIS", codOperacaoVendaMais);
   }

   public Timestamp getDhAprovacaoVendaMais() {
        return this.getVo().asTimestamp("DHAPROVACAOVENDAMAIS");
   }

   public void setDhAprovacaoVendaMais(Timestamp dhAprovacaoVendaMais) {
        markAsChanged("DHAPROVACAOVENDAMAIS", dhAprovacaoVendaMais);
   }

   public Timestamp getDhImpressao() {
        return this.getVo().asTimestamp("DH_IMPRESSAO");
   }

   public void setDhImpressao(Timestamp dhImpressao) {
        markAsChanged("DH_IMPRESSAO", dhImpressao);
   }

   public BigDecimal getTaxaVendaMais() {
        return this.getVo().asBigDecimal("TAXAVENDAMAIS");
   }

   public void setTaxaVendaMais(BigDecimal taxaVendaMais) {
        markAsChanged("TAXAVENDAMAIS", taxaVendaMais);
   }

   public String getVendaMais() {
        return this.getVo().asString("VENDAMAIS");
   }

   public void setVendaMais(String vendaMais) {
        markAsChanged("VENDAMAIS", vendaMais);
   }

   @Override
   public String getTableName() {
        return "TGFFIN";
   }

   @Override
   public String getEntityName() {
        return "Financeiro";
   }

   @Override
   public Financeiro fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
