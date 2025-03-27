package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemNota extends AbstractSankhyaEntity<ItemNota> {
   public BigDecimal getAliqIcms() {
        return this.getVo().asBigDecimal("ALIQICMS");
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        markAsChanged("ALIQICMS", aliqIcms);
   }

   public BigDecimal getAliqIcmsRed() {
        return this.getVo().asBigDecimal("ALIQICMSRED");
   }

   public void setAliqIcmsRed(BigDecimal aliqIcmsRed) {
        markAsChanged("ALIQICMSRED", aliqIcmsRed);
   }

   public BigDecimal getAliqIpi() {
        return this.getVo().asBigDecimal("ALIQIPI");
   }

   public void setAliqIpi(BigDecimal aliqIpi) {
        markAsChanged("ALIQIPI", aliqIpi);
   }

   public BigDecimal getAliqIss() {
        return this.getVo().asBigDecimal("ALIQISS");
   }

   public void setAliqIss(BigDecimal aliqIss) {
        markAsChanged("ALIQISS", aliqIss);
   }

   public BigDecimal getVlrIcmsUfDest() {
        return this.getVo().asBigDecimal("VLRICMSUFDEST");
   }

   public void setVlrIcmsUfDest(BigDecimal vlrIcmsUfDest) {
        markAsChanged("VLRICMSUFDEST", vlrIcmsUfDest);
   }

   public BigDecimal getVlrIpi() {
        return this.getVo().asBigDecimal("VLRIPI");
   }

   public void setVlrIpi(BigDecimal vlrIpi) {
        markAsChanged("VLRIPI", vlrIpi);
   }

   public BigDecimal getVlrIss() {
        return this.getVo().asBigDecimal("VLRISS");
   }

   public void setVlrIss(BigDecimal vlrIss) {
        markAsChanged("VLRISS", vlrIss);
   }

   public BigDecimal getVlrLiqProm() {
        return this.getVo().asBigDecimal("VLRLIQPROM");
   }

   public void setVlrLiqProm(BigDecimal vlrLiqProm) {
        markAsChanged("VLRLIQPROM", vlrLiqProm);
   }

   public BigDecimal getVlrPromo() {
        return this.getVo().asBigDecimal("VLRPROMO");
   }

   public void setVlrPromo(BigDecimal vlrPromo) {
        markAsChanged("VLRPROMO", vlrPromo);
   }

   public BigDecimal getVlrPtoPureza() {
        return this.getVo().asBigDecimal("VLRPTOPUREZA");
   }

   public void setVlrPtoPureza(BigDecimal vlrPtoPureza) {
        markAsChanged("VLRPTOPUREZA", vlrPtoPureza);
   }

   public BigDecimal getVlrRepRed() {
        return this.getVo().asBigDecimal("VLRREPRED");
   }

   public void setVlrRepRed(BigDecimal vlrRepRed) {
        markAsChanged("VLRREPRED", vlrRepRed);
   }

   public BigDecimal getVlrRetencao() {
        return this.getVo().asBigDecimal("VLRRETENCAO");
   }

   public void setVlrRetencao(BigDecimal vlrRetencao) {
        markAsChanged("VLRRETENCAO", vlrRetencao);
   }

   public BigDecimal getVlrStExtraNota() {
        return this.getVo().asBigDecimal("VLRSTEXTRANOTA");
   }

   public void setVlrStExtraNota(BigDecimal vlrStExtraNota) {
        markAsChanged("VLRSTEXTRANOTA", vlrStExtraNota);
   }

   public BigDecimal getVlrSubst() {
        return this.getVo().asBigDecimal("VLRSUBST");
   }

   public void setVlrSubst(BigDecimal vlrSubst) {
        markAsChanged("VLRSUBST", vlrSubst);
   }

   public BigDecimal getVlrSubstAnt() {
        return this.getVo().asBigDecimal("VLRSUBSTANT");
   }

   public void setVlrSubstAnt(BigDecimal vlrSubstAnt) {
        markAsChanged("VLRSUBSTANT", vlrSubstAnt);
   }

   public BigDecimal getVlrSugerido() {
        return this.getVo().asBigDecimal("VLRSUGERIDO");
   }

   public void setVlrSugerido(BigDecimal vlrSugerido) {
        markAsChanged("VLRSUGERIDO", vlrSugerido);
   }

   public BigDecimal getVlrTot() {
        return this.getVo().asBigDecimal("VLRTOT");
   }

   public void setVlrTot(BigDecimal vlrTot) {
        markAsChanged("VLRTOT", vlrTot);
   }

   public BigDecimal getVlrTotLiq() {
        return this.getVo().asBigDecimal("VLRTOTLIQ");
   }

   public void setVlrTotLiq(BigDecimal vlrTotLiq) {
        markAsChanged("VLRTOTLIQ", vlrTotLiq);
   }

   public BigDecimal getVlrTroca() {
        return this.getVo().asBigDecimal("VLRTROCA");
   }

   public void setVlrTroca(BigDecimal vlrTroca) {
        markAsChanged("VLRTROCA", vlrTroca);
   }

   public BigDecimal getVlrUnidPad() {
        return this.getVo().asBigDecimal("VLRUNIDPAD");
   }

   public void setVlrUnidPad(BigDecimal vlrUnidPad) {
        markAsChanged("VLRUNIDPAD", vlrUnidPad);
   }

   public BigDecimal getVlrUnit() {
        return this.getVo().asBigDecimal("VLRUNIT");
   }

   public void setVlrUnit(BigDecimal vlrUnit) {
        markAsChanged("VLRUNIT", vlrUnit);
   }

   public BigDecimal getVlrUnitDolar() {
        return this.getVo().asBigDecimal("VLRUNITDOLAR");
   }

   public void setVlrUnitDolar(BigDecimal vlrUnitDolar) {
        markAsChanged("VLRUNITDOLAR", vlrUnitDolar);
   }

   public BigDecimal getVlrUnitLiq() {
        return this.getVo().asBigDecimal("VLRUNITLIQ");
   }

   public void setVlrUnitLiq(BigDecimal vlrUnitLiq) {
        markAsChanged("VLRUNITLIQ", vlrUnitLiq);
   }

   public BigDecimal getVlrDescBonif() {
        return this.getVo().asBigDecimal("VLRDESCBONIF");
   }

   public void setVlrDescBonif(BigDecimal vlrDescBonif) {
        markAsChanged("VLRDESCBONIF", vlrDescBonif);
   }

   public BigDecimal getBasicmMod() {
        return this.getVo().asBigDecimal("BASICMMOD");
   }

   public void setBasicmMod(BigDecimal basicmMod) {
        markAsChanged("BASICMMOD", basicmMod);
   }

   public BigDecimal getBasicmStMod() {
        return this.getVo().asBigDecimal("BASICMSTMOD");
   }

   public void setBasicmStMod(BigDecimal basicmStMod) {
        markAsChanged("BASICMSTMOD", basicmStMod);
   }

   public String getCodAntecipSt() {
        return this.getVo().asString("CODANTECIPST");
   }

   public void setCodAntecipSt(String codAntecipSt) {
        markAsChanged("CODANTECIPST", codAntecipSt);
   }

   public BigDecimal getNumeroOs() {
        return this.getVo().asBigDecimal("NUMEROOS");
   }

   public void setNumeroOs(BigDecimal numeroOs) {
        markAsChanged("NUMEROOS", numeroOs);
   }

   public BigDecimal getAtualEstoque() {
        return this.getVo().asBigDecimal("ATUALESTOQUE");
   }

   public void setAtualEstoque(BigDecimal atualEstoque) {
        markAsChanged("ATUALESTOQUE", atualEstoque);
   }

   public String getAtualEstTerc() {
        return this.getVo().asString("ATUALESTTERC");
   }

   public void setAtualEstTerc(String atualEstTerc) {
        markAsChanged("ATUALESTTERC", atualEstTerc);
   }

   public BigDecimal getBaseIcms() {
        return this.getVo().asBigDecimal("BASEICMS");
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        markAsChanged("BASEICMS", baseIcms);
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

   public BigDecimal getBaseStAnt() {
        return this.getVo().asBigDecimal("BASESTANT");
   }

   public void setBaseStAnt(BigDecimal baseStAnt) {
        markAsChanged("BASESTANT", baseStAnt);
   }

   public BigDecimal getBaseStUfDest() {
        return this.getVo().asBigDecimal("BASESTUFDEST");
   }

   public void setBaseStUfDest(BigDecimal baseStUfDest) {
        markAsChanged("BASESTUFDEST", baseStUfDest);
   }

   public BigDecimal getBaseSubstit() {
        return this.getVo().asBigDecimal("BASESUBSTIT");
   }

   public void setBaseSubstit(BigDecimal baseSubstit) {
        markAsChanged("BASESUBSTIT", baseSubstit);
   }

   public BigDecimal getVlrDescDigitado() {
        return this.getVo().asBigDecimal("VLRDESCDIGITADO");
   }

   public void setVlrDescDigitado(BigDecimal vlrDescDigitado) {
        markAsChanged("VLRDESCDIGITADO", vlrDescDigitado);
   }

   public BigDecimal getVlrIcms() {
        return this.getVo().asBigDecimal("VLRICMS");
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
   }

   public BigDecimal getVlrIcmsAnt() {
        return this.getVo().asBigDecimal("VLRICMSANT");
   }

   public void setVlrIcmsAnt(BigDecimal vlrIcmsAnt) {
        markAsChanged("VLRICMSANT", vlrIcmsAnt);
   }

   public String getTerceiros() {
        return this.getVo().asString("TERCEIROS");
   }

   public void setTerceiros(String terceiros) {
        markAsChanged("TERCEIROS", terceiros);
   }

   public String getUsoProd() {
        return this.getVo().asString("USOPROD");
   }

   public void setUsoProd(String usoProd) {
        markAsChanged("USOPROD", usoProd);
   }

   public BigDecimal getVariacaoFcp() {
        return this.getVo().asBigDecimal("VARIACAOFCP");
   }

   public void setVariacaoFcp(BigDecimal variacaoFcp) {
        markAsChanged("VARIACAOFCP", variacaoFcp);
   }

   public BigDecimal getVlrAcrescDesc() {
        return this.getVo().asBigDecimal("VLRACRESCDESC");
   }

   public void setVlrAcrescDesc(BigDecimal vlrAcrescDesc) {
        markAsChanged("VLRACRESCDESC", vlrAcrescDesc);
   }

   public BigDecimal getVlrCom() {
        return this.getVo().asBigDecimal("VLRCOM");
   }

   public void setVlrCom(BigDecimal vlrCom) {
        markAsChanged("VLRCOM", vlrCom);
   }

   public BigDecimal getVlrComGer() {
        return this.getVo().asBigDecimal("VLRCOMGER");
   }

   public void setVlrComGer(BigDecimal vlrComGer) {
        markAsChanged("VLRCOMGER", vlrComGer);
   }

   public BigDecimal getVlrCus() {
        return this.getVo().asBigDecimal("VLRCUS");
   }

   public void setVlrCus(BigDecimal vlrCus) {
        markAsChanged("VLRCUS", vlrCus);
   }

   public String getCodVolParc() {
        return this.getVo().asString("CODVOLPARC");
   }

   public void setCodVolParc(String codVolParc) {
        markAsChanged("CODVOLPARC", codVolParc);
   }

   public BigDecimal getVlrDesc() {
        return this.getVo().asBigDecimal("VLRDESC");
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        markAsChanged("VLRDESC", vlrDesc);
   }

   public BigDecimal getVlrTotLiqMoe() {
        return this.getVo().asBigDecimal("VLRTOTLIQMOE");
   }

   public void setVlrTotLiqMoe(BigDecimal vlrTotLiqMoe) {
        markAsChanged("VLRTOTLIQMOE", vlrTotLiqMoe);
   }

   public BigDecimal getVlrTotMoe() {
        return this.getVo().asBigDecimal("VLRTOTMOE");
   }

   public void setVlrTotMoe(BigDecimal vlrTotMoe) {
        markAsChanged("VLRTOTMOE", vlrTotMoe);
   }

   public BigDecimal getVlrDescMoe() {
        return this.getVo().asBigDecimal("VLRDESCMOE");
   }

   public void setVlrDescMoe(BigDecimal vlrDescMoe) {
        markAsChanged("VLRDESCMOE", vlrDescMoe);
   }

   public BigDecimal getVlrUnitMoe() {
        return this.getVo().asBigDecimal("VLRUNITMOE");
   }

   public void setVlrUnitMoe(BigDecimal vlrUnitMoe) {
        markAsChanged("VLRUNITMOE", vlrUnitMoe);
   }

   public BigDecimal getCodEspecSt() {
        return this.getVo().asBigDecimal("CODESPECST");
   }

   public void setCodEspecSt(BigDecimal codEspecSt) {
        markAsChanged("CODESPECST", codEspecSt);
   }

   public BigDecimal getIdAliqIcms() {
        return this.getVo().asBigDecimal("IDALIQICMS");
   }

   public void setIdAliqIcms(BigDecimal idAliqIcms) {
        markAsChanged("IDALIQICMS", idAliqIcms);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public BigDecimal getVlrUnitLoc() {
        return this.getVo().asBigDecimal("VLRUNITLOC");
   }

   public void setVlrUnitLoc(BigDecimal vlrUnitLoc) {
        markAsChanged("VLRUNITLOC", vlrUnitLoc);
   }

   public BigDecimal getCodEnqIpi() {
        return this.getVo().asBigDecimal("CODENQIPI");
   }

   public void setCodEnqIpi(BigDecimal codEnqIpi) {
        markAsChanged("CODENQIPI", codEnqIpi);
   }

   public BigDecimal getVlrUnitLiqMoe() {
        return this.getVo().asBigDecimal("VLRUNITLIQMOE");
   }

   public void setVlrUnitLiqMoe(BigDecimal vlrUnitLiqMoe) {
        markAsChanged("VLRUNITLIQMOE", vlrUnitLiqMoe);
   }

   public BigDecimal getBaseSubstitAnt() {
        return this.getVo().asBigDecimal("BASESUBSTITANT");
   }

   public void setBaseSubstitAnt(BigDecimal baseSubstitAnt) {
        markAsChanged("BASESUBSTITANT", baseSubstitAnt);
   }

   public BigDecimal getBaseSubstitSemRed() {
        return this.getVo().asBigDecimal("BASESUBSTSEMRED");
   }

   public void setBaseSubstitSemRed(BigDecimal baseSubstitSemRed) {
        markAsChanged("BASESUBSTSEMRED", baseSubstitSemRed);
   }

   public BigDecimal getCodCav() {
        return this.getVo().asBigDecimal("CODCAV");
   }

   public void setCodCav(BigDecimal codCav) {
        markAsChanged("CODCAV", codCav);
   }

   public BigDecimal getCodCfo() {
        return this.getVo().asBigDecimal("CODCFO");
   }

   public void setCodCfo(BigDecimal codCfo) {
        markAsChanged("CODCFO", codCfo);
   }

   public BigDecimal getCodCfps() {
        return this.getVo().asBigDecimal("CODCFPS");
   }

   public void setCodCfps(BigDecimal codCfps) {
        markAsChanged("CODCFPS", codCfps);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodExec() {
        return this.getVo().asBigDecimal("CODEXEC");
   }

   public void setCodExec(BigDecimal codExec) {
        markAsChanged("CODEXEC", codExec);
   }

   public BigDecimal getCodLocalDest() {
        return this.getVo().asBigDecimal("CODLOCALDEST");
   }

   public void setCodLocalDest(BigDecimal codLocalDest) {
        markAsChanged("CODLOCALDEST", codLocalDest);
   }

   public BigDecimal getCodLocalOrig() {
        return this.getVo().asBigDecimal("CODLOCALORIG");
   }

   public void setCodLocalOrig(BigDecimal codLocalOrig) {
        markAsChanged("CODLOCALORIG", codLocalOrig);
   }

   public BigDecimal getCodMotDesoneraIcms() {
        return this.getVo().asBigDecimal("CODMOTDESONERAICMS");
   }

   public void setCodMotDesoneraIcms(BigDecimal codMotDesoneraIcms) {
        markAsChanged("CODMOTDESONERAICMS", codMotDesoneraIcms);
   }

   public BigDecimal getCodObsPadrao() {
        return this.getVo().asBigDecimal("CODOBSPADRAO");
   }

   public void setCodObsPadrao(BigDecimal codObsPadrao) {
        markAsChanged("CODOBSPADRAO", codObsPadrao);
   }

   public BigDecimal getCodParceExec() {
        return this.getVo().asBigDecimal("CODPARCEXEC");
   }

   public void setCodParceExec(BigDecimal codParceExec) {
        markAsChanged("CODPARCEXEC", codParceExec);
   }

   public BigDecimal getCodProc() {
        return this.getVo().asBigDecimal("CODPROC");
   }

   public void setCodProc(BigDecimal codProc) {
        markAsChanged("CODPROC", codProc);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodPromo() {
        return this.getVo().asBigDecimal("CODPROMO");
   }

   public void setCodPromo(BigDecimal codPromo) {
        markAsChanged("CODPROMO", codPromo);
   }

   public BigDecimal getCodTpa() {
        return this.getVo().asBigDecimal("CODTPA");
   }

   public void setCodTpa(BigDecimal codTpa) {
        markAsChanged("CODTPA", codTpa);
   }

   public BigDecimal getCodTrib() {
        return this.getVo().asBigDecimal("CODTRIB");
   }

   public void setCodTrib(BigDecimal codTrib) {
        markAsChanged("CODTRIB", codTrib);
   }

   public BigDecimal getCodTribIss() {
        return this.getVo().asBigDecimal("CODTRIBISS");
   }

   public void setCodTribIss(BigDecimal codTribIss) {
        markAsChanged("CODTRIBISS", codTribIss);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getCodVolPad() {
        return this.getVo().asString("CODVOLPAD");
   }

   public void setCodVolPad(String codVolPad) {
        markAsChanged("CODVOLPAD", codVolPad);
   }

   public String getComplDesc() {
        return this.getVo().asString("COMPLDESC");
   }

   public void setComplDesc(String complDesc) {
        markAsChanged("COMPLDESC", complDesc);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public String getControleDest() {
        return this.getVo().asString("CONTROLEDEST");
   }

   public void setControleDest(String controleDest) {
        markAsChanged("CONTROLEDEST", controleDest);
   }

   public BigDecimal getCsosn() {
        return this.getVo().asBigDecimal("CSOSN");
   }

   public void setCsosn(BigDecimal csosn) {
        markAsChanged("CSOSN", csosn);
   }

   public BigDecimal getCstIpi() {
        return this.getVo().asBigDecimal("CSTIPI");
   }

   public void setCstIpi(BigDecimal cstIpi) {
        markAsChanged("CSTIPI", cstIpi);
   }

   public BigDecimal getCusto() {
        return this.getVo().asBigDecimal("CUSTO");
   }

   public void setCusto(BigDecimal custo) {
        markAsChanged("CUSTO", custo);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtVigor() {
        return this.getVo().asTimestamp("DTVIGOR");
   }

   public void setDtVigor(Timestamp dtVigor) {
        markAsChanged("DTVIGOR", dtVigor);
   }

   public String getEndImagem() {
        return this.getVo().asString("ENDIMAGEM");
   }

   public void setEndImagem(String endImagem) {
        markAsChanged("ENDIMAGEM", endImagem);
   }

   public BigDecimal getEspessura() {
        return this.getVo().asBigDecimal("ESPESSURA");
   }

   public void setEspessura(BigDecimal espessura) {
        markAsChanged("ESPESSURA", espessura);
   }

   public BigDecimal getEstoque() {
        return this.getVo().asBigDecimal("ESTOQUE");
   }

   public void setEstoque(BigDecimal estoque) {
        markAsChanged("ESTOQUE", estoque);
   }

   public String getFaturar() {
        return this.getVo().asString("FATURAR");
   }

   public void setFaturar(String faturar) {
        markAsChanged("FATURAR", faturar);
   }

   public BigDecimal getGrupoTransg() {
        return this.getVo().asBigDecimal("GRUPOTRANSG");
   }

   public void setGrupoTransg(BigDecimal grupoTransg) {
        markAsChanged("GRUPOTRANSG", grupoTransg);
   }

   public String getGtinNfe() {
        return this.getVo().asString("GTINNFE");
   }

   public void setGtinNfe(String gtinNfe) {
        markAsChanged("GTINNFE", gtinNfe);
   }

   public String getGtinTribNfe() {
        return this.getVo().asString("GTINTRIBNFE");
   }

   public void setGtinTribNfe(String gtinTribNfe) {
        markAsChanged("GTINTRIBNFE", gtinTribNfe);
   }

   public BigDecimal getLargura() {
        return this.getVo().asBigDecimal("LARGURA");
   }

   public void setLargura(BigDecimal largura) {
        markAsChanged("LARGURA", largura);
   }

   public BigDecimal getM3() {
        return this.getVo().asBigDecimal("M3");
   }

   public void setM3(BigDecimal m3) {
        markAsChanged("M3", m3);
   }

   public String getMarca() {
        return this.getVo().asString("MARCA");
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
   }

   public String getNcm() {
        return this.getVo().asString("NCM");
   }

   public void setNcm(String ncm) {
        markAsChanged("NCM", ncm);
   }

   public String getNrSerieReserva() {
        return this.getVo().asString("NRSERIERESERVA");
   }

   public void setNrSerieReserva(String nrSerieReserva) {
        markAsChanged("NRSERIERESERVA", nrSerieReserva);
   }

   public String getNumPedido2() {
        return this.getVo().asString("NUMPEDIDO2");
   }

   public void setNumPedido2(String numPedido2) {
        markAsChanged("NUMPEDIDO2", numPedido2);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuPromocao() {
        return this.getVo().asBigDecimal("NUPROMOCAO");
   }

   public void setNuPromocao(BigDecimal nuPromocao) {
        markAsChanged("NUPROMOCAO", nuPromocao);
   }

   public BigDecimal getNuTab() {
        return this.getVo().asBigDecimal("NUTAB");
   }

   public void setNuTab(BigDecimal nuTab) {
        markAsChanged("NUTAB", nuTab);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getOrigProd() {
        return this.getVo().asString("ORIGPROD");
   }

   public void setOrigProd(String origProd) {
        markAsChanged("ORIGPROD", origProd);
   }

   public String getPendente() {
        return this.getVo().asString("PENDENTE");
   }

   public void setPendente(String pendente) {
        markAsChanged("PENDENTE", pendente);
   }

   public BigDecimal getPercCom() {
        return this.getVo().asBigDecimal("PERCCOM");
   }

   public void setPercCom(BigDecimal percCom) {
        markAsChanged("PERCCOM", percCom);
   }

   public BigDecimal getPercComGer() {
        return this.getVo().asBigDecimal("PERCCOMGER");
   }

   public void setPercComGer(BigDecimal percComGer) {
        markAsChanged("PERCCOMGER", percComGer);
   }

   public BigDecimal getPercDesc() {
        return this.getVo().asBigDecimal("PERCDESC");
   }

   public void setPercDesc(BigDecimal percDesc) {
        markAsChanged("PERCDESC", percDesc);
   }

   public BigDecimal getPercDescBase() {
        return this.getVo().asBigDecimal("PERCDESCBASE");
   }

   public void setPercDescBase(BigDecimal percDescBase) {
        markAsChanged("PERCDESCBASE", percDescBase);
   }

   public BigDecimal getPercDescBonif() {
        return this.getVo().asBigDecimal("PERCDESCBONIF");
   }

   public void setPercDescBonif(BigDecimal percDescBonif) {
        markAsChanged("PERCDESCBONIF", percDescBonif);
   }

   public BigDecimal getPercDescDigitado() {
        return this.getVo().asBigDecimal("PERCDESCDIGITADO");
   }

   public void setPercDescDigitado(BigDecimal percDescDigitado) {
        markAsChanged("PERCDESCDIGITADO", percDescDigitado);
   }

   public BigDecimal getPercDescProm() {
        return this.getVo().asBigDecimal("PERCDESCPROM");
   }

   public void setPercDescProm(BigDecimal percDescProm) {
        markAsChanged("PERCDESCPROM", percDescProm);
   }

   public BigDecimal getPercDescTgfdes() {
        return this.getVo().asBigDecimal("PERCDESCTGFDES");
   }

   public void setPercDescTgfdes(BigDecimal percDescTgfdes) {
        markAsChanged("PERCDESCTGFDES", percDescTgfdes);
   }

   public BigDecimal getPercGermin() {
        return this.getVo().asBigDecimal("PERCGERMIN");
   }

   public void setPercGermin(BigDecimal percGermin) {
        markAsChanged("PERCGERMIN", percGermin);
   }

   public BigDecimal getPercPureza() {
        return this.getVo().asBigDecimal("PERCPUREZA");
   }

   public void setPercPureza(BigDecimal percPureza) {
        markAsChanged("PERCPUREZA", percPureza);
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

   public BigDecimal getPrecoBase() {
        return this.getVo().asBigDecimal("PRECOBASE");
   }

   public void setPrecoBase(BigDecimal precoBase) {
        markAsChanged("PRECOBASE", precoBase);
   }

   public BigDecimal getPrecoBaseQtd() {
        return this.getVo().asBigDecimal("PRECOBASEQTD");
   }

   public void setPrecoBaseQtd(BigDecimal precoBaseQtd) {
        markAsChanged("PRECOBASEQTD", precoBaseQtd);
   }

   public String getProdutoNfe() {
        return this.getVo().asString("PRODUTONFE");
   }

   public void setProdutoNfe(String produtoNfe) {
        markAsChanged("PRODUTONFE", produtoNfe);
   }

   public BigDecimal getQtdConferida() {
        return this.getVo().asBigDecimal("QTDCONFERIDA");
   }

   public void setQtdConferida(BigDecimal qtdConferida) {
        markAsChanged("QTDCONFERIDA", qtdConferida);
   }

   public BigDecimal getQtdEntregue() {
        return this.getVo().asBigDecimal("QTDENTREGUE");
   }

   public void setQtdEntregue(BigDecimal qtdEntregue) {
        markAsChanged("QTDENTREGUE", qtdEntregue);
   }

   public BigDecimal getQtdFat() {
        return this.getVo().asBigDecimal("QTDFAT");
   }

   public void setQtdFat(BigDecimal qtdFat) {
        markAsChanged("QTDFAT", qtdFat);
   }

   public BigDecimal getQtdFixada() {
        return this.getVo().asBigDecimal("QTDFIXADA");
   }

   public void setQtdFixada(BigDecimal qtdFixada) {
        markAsChanged("QTDFIXADA", qtdFixada);
   }

   public BigDecimal getQtdFormula() {
        return this.getVo().asBigDecimal("QTDFORMULA");
   }

   public void setQtdFormula(BigDecimal qtdFormula) {
        markAsChanged("QTDFORMULA", qtdFormula);
   }

   public BigDecimal getQtdNeg() {
        return this.getVo().asBigDecimal("QTDNEG");
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        markAsChanged("QTDNEG", qtdNeg);
   }

   public BigDecimal getQtdPeca() {
        return this.getVo().asBigDecimal("QTDPECA");
   }

   public void setQtdPeca(BigDecimal qtdPeca) {
        markAsChanged("QTDPECA", qtdPeca);
   }

   public BigDecimal getQtdPendente() {
        return this.getVo().asBigDecimal("QTDPENDENTE");
   }

   public void setQtdPendente(BigDecimal qtdPendente) {
        markAsChanged("QTDPENDENTE", qtdPendente);
   }

   public BigDecimal getQtdUnidPad() {
        return this.getVo().asBigDecimal("QTDUNIDPAD");
   }

   public void setQtdUnidPad(BigDecimal qtdUnidPad) {
        markAsChanged("QTDUNIDPAD", qtdUnidPad);
   }

   public BigDecimal getQtdWms() {
        return this.getVo().asBigDecimal("QTDWMS");
   }

   public void setQtdWms(BigDecimal qtdWms) {
        markAsChanged("QTDWMS", qtdWms);
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

   public String getReserva() {
        return this.getVo().asString("RESERVA");
   }

   public void setReserva(String reserva) {
        markAsChanged("RESERVA", reserva);
   }

   public String getSeqPedido2() {
        return this.getVo().asString("SEQPEDIDO2");
   }

   public void setSeqPedido2(String seqPedido2) {
        markAsChanged("SEQPEDIDO2", seqPedido2);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getSolCompra() {
        return this.getVo().asString("SOLCOMPRA");
   }

   public void setSolCompra(String solCompra) {
        markAsChanged("SOLCOMPRA", solCompra);
   }

   public String getStatusLote() {
        return this.getVo().asString("STATUSLOTE");
   }

   public void setStatusLote(String statusLote) {
        markAsChanged("STATUSLOTE", statusLote);
   }

   public String getStatusNota() {
        return this.getVo().asString("STATUSNOTA");
   }

   public void setStatusNota(String statusNota) {
        markAsChanged("STATUSNOTA", statusNota);
   }

   public String getAltPreco() {
        return this.getVo().asString("ALTPRECO");
   }

   public void setAltPreco(String altPreco) {
        markAsChanged("ALTPRECO", altPreco);
   }

   public BigDecimal getAltura() {
        return this.getVo().asBigDecimal("ALTURA");
   }

   public void setAltura(BigDecimal altura) {
        markAsChanged("ALTURA", altura);
   }

   public BigDecimal getQtdVol() {
        return this.getVo().asBigDecimal("QTDVOL");
   }

   public void setQtdVol(BigDecimal qtdVol) {
        markAsChanged("QTDVOL", qtdVol);
   }

   public Timestamp getDtInicio() {
        return this.getVo().asTimestamp("DTINICIO");
   }

   public void setDtInicio(Timestamp dtInicio) {
        markAsChanged("DTINICIO", dtInicio);
   }

   public BigDecimal getAliqStExtraNota() {
        return this.getVo().asBigDecimal("ALIQSTEXTRANOTA");
   }

   public void setAliqStExtraNota(BigDecimal aliqStExtraNota) {
        markAsChanged("ALIQSTEXTRANOTA", aliqStExtraNota);
   }

   public BigDecimal getAliqStFcpStAnt() {
        return this.getVo().asBigDecimal("ALIQSTFCPSTANT");
   }

   public void setAliqStFcpStAnt(BigDecimal aliqStFcpStAnt) {
        markAsChanged("ALIQSTFCPSTANT", aliqStFcpStAnt);
   }

   public BigDecimal getBaseStExtraNota() {
        return this.getVo().asBigDecimal("BASESTEXTRANOTA");
   }

   public void setBaseStExtraNota(BigDecimal baseStExtraNota) {
        markAsChanged("BASESTEXTRANOTA", baseStExtraNota);
   }

   public String getOrigemBusca() {
        return this.getVo().asString("ORIGEMBUSCA");
   }

   public void setOrigemBusca(String origemBusca) {
        markAsChanged("ORIGEMBUSCA", origemBusca);
   }

   public BigDecimal getProdutoPesquisado() {
        return this.getVo().asBigDecimal("PRODUTOPESQUISADO");
   }

   public void setProdutoPesquisado(BigDecimal produtoPesquisado) {
        markAsChanged("PRODUTOPESQUISADO", produtoPesquisado);
   }

   public BigDecimal getQtdTribExport() {
        return this.getVo().asBigDecimal("QTDTRIBEXPORT");
   }

   public void setQtdTribExport(BigDecimal qtdTribExport) {
        markAsChanged("QTDTRIBEXPORT", qtdTribExport);
   }

   public BigDecimal getReservado() {
        return this.getVo().asBigDecimal("RESERVADO");
   }

   public void setReservado(BigDecimal reservado) {
        markAsChanged("RESERVADO", reservado);
   }

   public BigDecimal getVlrRepRedSemDesc() {
        return this.getVo().asBigDecimal("VLRREPREDSEMDESC");
   }

   public void setVlrRepRedSemDesc(BigDecimal vlrRepRedSemDesc) {
        markAsChanged("VLRREPREDSEMDESC", vlrRepRedSemDesc);
   }

   public BigDecimal getVlrTotLiqRef() {
        return this.getVo().asBigDecimal("VLRTOTLIQREF");
   }

   public void setVlrTotLiqRef(BigDecimal vlrTotLiqRef) {
        markAsChanged("VLRTOTLIQREF", vlrTotLiqRef);
   }

   public BigDecimal getVlrVendaPromo() {
        return this.getVo().asBigDecimal("VLRVENDAPROMO");
   }

   public void setVlrVendaPromo(BigDecimal vlrVendaPromo) {
        markAsChanged("VLRVENDAPROMO", vlrVendaPromo);
   }

   public BigDecimal getNuFop() {
        return this.getVo().asBigDecimal("NUFOP");
   }

   public void setNuFop(BigDecimal nuFop) {
        markAsChanged("NUFOP", nuFop);
   }

   public BigDecimal getSequenciaFiscal() {
        return this.getVo().asBigDecimal("SEQUENCIAFISCAL");
   }

   public void setSequenciaFiscal(BigDecimal sequenciaFiscal) {
        markAsChanged("SEQUENCIAFISCAL", sequenciaFiscal);
   }

   public BigDecimal getCodLocalTerc() {
        return this.getVo().asBigDecimal("CODLOCALTERC");
   }

   public void setCodLocalTerc(BigDecimal codLocalTerc) {
        markAsChanged("CODLOCALTERC", codLocalTerc);
   }

   public BigDecimal getPercStFcpIntAnt() {
        return this.getVo().asBigDecimal("PERCSTFCPINTANT");
   }

   public void setPercStFcpIntAnt(BigDecimal percStFcpIntAnt) {
        markAsChanged("PERCSTFCPINTANT", percStFcpIntAnt);
   }

   public BigDecimal getVlrStFcpIntAnt() {
        return this.getVo().asBigDecimal("VLRSTFCPINTANT");
   }

   public void setVlrStFcpIntAnt(BigDecimal vlrStFcpIntAnt) {
        markAsChanged("VLRSTFCPINTANT", vlrStFcpIntAnt);
   }

   public BigDecimal getBaseStFcpIntAnt() {
        return this.getVo().asBigDecimal("BASESTFCPINTANT");
   }

   public void setBaseStFcpIntAnt(BigDecimal baseStFcpIntAnt) {
        markAsChanged("BASESTFCPINTANT", baseStFcpIntAnt);
   }

   public String getIndEscala() {
        return this.getVo().asString("INDESCALA");
   }

   public void setIndEscala(String indEscala) {
        markAsChanged("INDESCALA", indEscala);
   }

   public String getCodBenefNauf() {
        return this.getVo().asString("CODBENEFNAUF");
   }

   public void setCodBenefNauf(String codBenefNauf) {
        markAsChanged("CODBENEFNAUF", codBenefNauf);
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

   public BigDecimal getPercRedVlrIpi() {
        return this.getVo().asBigDecimal("PERCREDVLRIPI");
   }

   public void setPercRedVlrIpi(BigDecimal percRedVlrIpi) {
        markAsChanged("PERCREDVLRIPI", percRedVlrIpi);
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

   public BigDecimal getBaseCalcStExtraNota() {
        return this.getVo().asBigDecimal("BASECALCSTEXTRANOTA");
   }

   public void setBaseCalcStExtraNota(BigDecimal baseCalcStExtraNota) {
        markAsChanged("BASECALCSTEXTRANOTA", baseCalcStExtraNota);
   }

   public BigDecimal getMargLucro() {
        return this.getVo().asBigDecimal("MARGLUCRO");
   }

   public void setMargLucro(BigDecimal margLucro) {
        markAsChanged("MARGLUCRO", margLucro);
   }

   public BigDecimal getRedBaseSt() {
        return this.getVo().asBigDecimal("REDBASEST");
   }

   public void setRedBaseSt(BigDecimal redBaseSt) {
        markAsChanged("REDBASEST", redBaseSt);
   }

   public BigDecimal getVlrIcmsDiferido() {
        return this.getVo().asBigDecimal("VLRICMSDIFERIDO");
   }

   public void setVlrIcmsDiferido(BigDecimal vlrIcmsDiferido) {
        markAsChanged("VLRICMSDIFERIDO", vlrIcmsDiferido);
   }

   public String getTipoSeparacao() {
        return this.getVo().asString("TIPOSEPARACAO");
   }

   public void setTipoSeparacao(String tipoSeparacao) {
        markAsChanged("TIPOSEPARACAO", tipoSeparacao);
   }

   public String getNroProcesso() {
        return this.getVo().asString("NROPROCESSO");
   }

   public void setNroProcesso(String nroProcesso) {
        markAsChanged("NROPROCESSO", nroProcesso);
   }

   public BigDecimal getBaseSubstitUnitOrig() {
        return this.getVo().asBigDecimal("BASESUBSTITUNITORIG");
   }

   public void setBaseSubstitUnitOrig(BigDecimal baseSubstitUnitOrig) {
        markAsChanged("BASESUBSTITUNITORIG", baseSubstitUnitOrig);
   }

   public BigDecimal getVlrSubstitUnitOrig() {
        return this.getVo().asBigDecimal("VLRSUBSTUNITORIG");
   }

   public void setVlrSubstitUnitOrig(BigDecimal vlrSubstitUnitOrig) {
        markAsChanged("VLRSUBSTUNITORIG", vlrSubstitUnitOrig);
   }

   public BigDecimal getPercDescFornecedor() {
        return this.getVo().asBigDecimal("PERCDESCFORNECEDOR");
   }

   public void setPercDescFornecedor(BigDecimal percDescFornecedor) {
        markAsChanged("PERCDESCFORNECEDOR", percDescFornecedor);
   }

   public String getStatusProc() {
        return this.getVo().asString("STATUSPROC");
   }

   public void setStatusProc(String statusProc) {
        markAsChanged("STATUSPROC", statusProc);
   }

   public String getOperAtual() {
        return this.getVo().asString("OPERATUAL");
   }

   public void setOperAtual(String operAtual) {
        markAsChanged("OPERATUAL", operAtual);
   }

   public String getGeraProducao() {
        return this.getVo().asString("GERAPRODUCAO");
   }

   public void setGeraProducao(String geraProducao) {
        markAsChanged("GERAPRODUCAO", geraProducao);
   }

   public BigDecimal getIcmsStFrete() {
        return this.getVo().asBigDecimal("ICMSSTFRETE");
   }

   public void setIcmsStFrete(BigDecimal icmsStFrete) {
        markAsChanged("ICMSSTFRETE", icmsStFrete);
   }

   public BigDecimal getIdAliqIcmsDifIcms() {
        return this.getVo().asBigDecimal("IDALIQICMSDIFICMS");
   }

   public void setIdAliqIcmsDifIcms(BigDecimal idAliqIcmsDifIcms) {
        markAsChanged("IDALIQICMSDIFICMS", idAliqIcmsDifIcms);
   }

   public String getCodBarraPdv() {
        return this.getVo().asString("CODBARRAPDV");
   }

   public void setCodBarraPdv(String codBarraPdv) {
        markAsChanged("CODBARRAPDV", codBarraPdv);
   }

   public BigDecimal getAliqFetHab() {
        return this.getVo().asBigDecimal("ALIQFETHAB");
   }

   public void setAliqFetHab(BigDecimal aliqFetHab) {
        markAsChanged("ALIQFETHAB", aliqFetHab);
   }

   public BigDecimal getVlrFetHab() {
        return this.getVo().asBigDecimal("VLRFETHAB");
   }

   public void setVlrFetHab(BigDecimal vlrFetHab) {
        markAsChanged("VLRFETHAB", vlrFetHab);
   }

   public String getCodSit08Efd() {
        return this.getVo().asString("CODSIT08EFD");
   }

   public void setCodSit08Efd(String codSit08Efd) {
        markAsChanged("CODSIT08EFD", codSit08Efd);
   }

   public BigDecimal getAliqFuntTel() {
        return this.getVo().asBigDecimal("ALIQFUNTTEL");
   }

   public void setAliqFuntTel(BigDecimal aliqFuntTel) {
        markAsChanged("ALIQFUNTTEL", aliqFuntTel);
   }

   public BigDecimal getAliqFust() {
        return this.getVo().asBigDecimal("ALIQFUST");
   }

   public void setAliqFust(BigDecimal aliqFust) {
        markAsChanged("ALIQFUST", aliqFust);
   }

   public BigDecimal getBaseFuntTel() {
        return this.getVo().asBigDecimal("BASEFUNTTEL");
   }

   public void setBaseFuntTel(BigDecimal baseFuntTel) {
        markAsChanged("BASEFUNTTEL", baseFuntTel);
   }

   public BigDecimal getBaseFust() {
        return this.getVo().asBigDecimal("BASEFUST");
   }

   public void setBaseFust(BigDecimal baseFust) {
        markAsChanged("BASEFUST", baseFust);
   }

   public BigDecimal getVlrFuntTel() {
        return this.getVo().asBigDecimal("VLRFUNTTEL");
   }

   public void setVlrFuntTel(BigDecimal vlrFuntTel) {
        markAsChanged("VLRFUNTTEL", vlrFuntTel);
   }

   public BigDecimal getVlrFust() {
        return this.getVo().asBigDecimal("VLRFUST");
   }

   public void setVlrFust(BigDecimal vlrFust) {
        markAsChanged("VLRFUST", vlrFust);
   }

   public BigDecimal getTipUtilCom() {
        return this.getVo().asBigDecimal("TIPUTILCOM");
   }

   public void setTipUtilCom(BigDecimal tipUtilCom) {
        markAsChanged("TIPUTILCOM", tipUtilCom);
   }

   public BigDecimal getPercUsaquDecpe() {
        return this.getVo().asBigDecimal("PERCUSAQUDECPE");
   }

   public void setPercUsaquDecpe(BigDecimal percUsaquDecpe) {
        markAsChanged("PERCUSAQUDECPE", percUsaquDecpe);
   }

   public BigDecimal getVlrCusAquDecpe() {
        return this.getVo().asBigDecimal("VLRCUSAQUDECPE");
   }

   public void setVlrCusAquDecpe(BigDecimal vlrCusAquDecpe) {
        markAsChanged("VLRCUSAQUDECPE", vlrCusAquDecpe);
   }

   public BigDecimal getBaseIcmsStFrete() {
        return this.getVo().asBigDecimal("BASEICMSSTFRETE");
   }

   public void setBaseIcmsStFrete(BigDecimal baseIcmsStFrete) {
        markAsChanged("BASEICMSSTFRETE", baseIcmsStFrete);
   }

   public BigDecimal getCodMotDesoneraSt() {
        return this.getVo().asBigDecimal("CODMOTDESONERAST");
   }

   public void setCodMotDesoneraSt(BigDecimal codMotDesoneraSt) {
        markAsChanged("CODMOTDESONERAST", codMotDesoneraSt);
   }

   public BigDecimal getVlrRepRedSt() {
        return this.getVo().asBigDecimal("VLRREPREDST");
   }

   public void setVlrRepRedSt(BigDecimal vlrRepRedSt) {
        markAsChanged("VLRREPREDST", vlrRepRedSt);
   }

   public String getUnidade() {
        return this.getVo().asString("UNIDADE");
   }

   public void setUnidade(String unidade) {
        markAsChanged("UNIDADE", unidade);
   }

   public String getTipEntrega() {
        return this.getVo().asString("TIPENTREGA");
   }

   public void setTipEntrega(String tipEntrega) {
        markAsChanged("TIPENTREGA", tipEntrega);
   }

   public BigDecimal getAliqIcmsAt() {
        return this.getVo().asBigDecimal("ALIQICMSAT");
   }

   public void setAliqIcmsAt(BigDecimal aliqIcmsAt) {
        markAsChanged("ALIQICMSAT", aliqIcmsAt);
   }

   public BigDecimal getAliqInterIcmsAt() {
        return this.getVo().asBigDecimal("ALIQINTERICMSAT");
   }

   public void setAliqInterIcmsAt(BigDecimal aliqInterIcmsAt) {
        markAsChanged("ALIQINTERICMSAT", aliqInterIcmsAt);
   }

   public BigDecimal getBaseIcmsAt() {
        return this.getVo().asBigDecimal("BASEICMSAT");
   }

   public void setBaseIcmsAt(BigDecimal baseIcmsAt) {
        markAsChanged("BASEICMSAT", baseIcmsAt);
   }

   public BigDecimal getIdAliqIcmsAt() {
        return this.getVo().asBigDecimal("IDALIQICMSAT");
   }

   public void setIdAliqIcmsAt(BigDecimal idAliqIcmsAt) {
        markAsChanged("IDALIQICMSAT", idAliqIcmsAt);
   }

   public BigDecimal getVlrIcmsAt() {
        return this.getVo().asBigDecimal("VLRICMSAT");
   }

   public void setVlrIcmsAt(BigDecimal vlrIcmsAt) {
        markAsChanged("VLRICMSAT", vlrIcmsAt);
   }

   public BigDecimal getIdDescParceria() {
        return this.getVo().asBigDecimal("IDDESCPARCERIA");
   }

   public void setIdDescParceria(BigDecimal idDescParceria) {
        markAsChanged("IDDESCPARCERIA", idDescParceria);
   }

   public BigDecimal getVlrDescParceria() {
        return this.getVo().asBigDecimal("VLRDESCPARCERIA");
   }

   public void setVlrDescParceria(BigDecimal vlrDescParceria) {
        markAsChanged("VLRDESCPARCERIA", vlrDescParceria);
   }

   public String getCodFci() {
        return this.getVo().asString("CODFCI");
   }

   public void setCodFci(String codFci) {
        markAsChanged("CODFCI", codFci);
   }

   public BigDecimal getPercUsaquDecpeEst() {
        return this.getVo().asBigDecimal("PERCUSAQUDECPEEST");
   }

   public void setPercUsaquDecpeEst(BigDecimal percUsaquDecpeEst) {
        markAsChanged("PERCUSAQUDECPEEST", percUsaquDecpeEst);
   }

   public BigDecimal getCodIpi() {
        return this.getVo().asBigDecimal("CODIPI");
   }

   public void setCodIpi(BigDecimal codIpi) {
        markAsChanged("CODIPI", codIpi);
   }

   public BigDecimal getIdAliqIss() {
        return this.getVo().asBigDecimal("IDALIQISS");
   }

   public void setIdAliqIss(BigDecimal idAliqIss) {
        markAsChanged("IDALIQISS", idAliqIss);
   }

   public BigDecimal getCodNatRend() {
        return this.getVo().asBigDecimal("CODNATREND");
   }

   public void setCodNatRend(BigDecimal codNatRend) {
        markAsChanged("CODNATREND", codNatRend);
   }

   public String getIndRepDes() {
        return this.getVo().asString("INDREPDES");
   }

   public void setIndRepDes(String indRepDes) {
        markAsChanged("INDREPDES", indRepDes);
   }

   @Override
   public String getTableName() {
        return "TGFITE";
   }

   @Override
   public String getEntityName() {
        return "ItemNota";
   }

   @Override
   public ItemNota fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
