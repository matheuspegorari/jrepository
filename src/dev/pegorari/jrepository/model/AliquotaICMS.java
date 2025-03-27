package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AliquotaICMS extends AbstractSankhyaEntity<AliquotaICMS> {
   public BigDecimal getAliqFrete() {
        return this.getVo().asBigDecimal("ALIQFRETE");
   }

   public void setAliqFrete(BigDecimal aliqFrete) {
        markAsChanged("ALIQFRETE", aliqFrete);
   }

   public BigDecimal getAliqSubtrib() {
        return this.getVo().asBigDecimal("ALIQSUBTRIB");
   }

   public void setAliqSubtrib(BigDecimal aliqSubtrib) {
        markAsChanged("ALIQSUBTRIB", aliqSubtrib);
   }

   public BigDecimal getAliqUfDest() {
        return this.getVo().asBigDecimal("ALIQUFDEST");
   }

   public void setAliqUfDest(BigDecimal aliqUfDest) {
        markAsChanged("ALIQUFDEST", aliqUfDest);
   }

   public BigDecimal getAliquota() {
        return this.getVo().asBigDecimal("ALIQUOTA");
   }

   public void setAliquota(BigDecimal aliquota) {
        markAsChanged("ALIQUOTA", aliquota);
   }

   public String getBaseStRed() {
        return this.getVo().asString("BASESTRED");
   }

   public void setBaseStRed(String baseStRed) {
        markAsChanged("BASESTRED", baseStRed);
   }

   public String getBaseStUfDest() {
        return this.getVo().asString("BASESTUFDEST");
   }

   public void setBaseStUfDest(String baseStUfDest) {
        markAsChanged("BASESTUFDEST", baseStUfDest);
   }

   public BigDecimal getBaseIcmMod() {
        return this.getVo().asBigDecimal("BASICMMOD");
   }

   public void setBaseIcmMod(BigDecimal baseIcmMod) {
        markAsChanged("BASICMMOD", baseIcmMod);
   }

   public BigDecimal getBaseIcmStMod() {
        return this.getVo().asBigDecimal("BASICMSTMOD");
   }

   public void setBaseIcmStMod(BigDecimal baseIcmStMod) {
        markAsChanged("BASICMSTMOD", baseIcmStMod);
   }

   public String getCalcStExtraNota() {
        return this.getVo().asString("CALCSTEXTRANOTA");
   }

   public void setCalcStExtraNota(String calcStExtraNota) {
        markAsChanged("CALCSTEXTRANOTA", calcStExtraNota);
   }

   public String getCodAntecipSt() {
        return this.getVo().asString("CODANTECIPST");
   }

   public void setCodAntecipSt(String codAntecipSt) {
        markAsChanged("CODANTECIPST", codAntecipSt);
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

   public BigDecimal getCodRestricao() {
        return this.getVo().asBigDecimal("CODRESTRICAO");
   }

   public void setCodRestricao(BigDecimal codRestricao) {
        markAsChanged("CODRESTRICAO", codRestricao);
   }

   public BigDecimal getCodRestricao2() {
        return this.getVo().asBigDecimal("CODRESTRICAO2");
   }

   public void setCodRestricao2(BigDecimal codRestricao2) {
        markAsChanged("CODRESTRICAO2", codRestricao2);
   }

   public BigDecimal getCodTab() {
        return this.getVo().asBigDecimal("CODTAB");
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
   }

   public BigDecimal getCodTabIcms() {
        return this.getVo().asBigDecimal("CODTABICMS");
   }

   public void setCodTabIcms(BigDecimal codTabIcms) {
        markAsChanged("CODTABICMS", codTabIcms);
   }

   public BigDecimal getCodTrib() {
        return this.getVo().asBigDecimal("CODTRIB");
   }

   public void setCodTrib(BigDecimal codTrib) {
        markAsChanged("CODTRIB", codTrib);
   }

   public String getConvProduz() {
        return this.getVo().asString("CONVPRODUZ");
   }

   public void setConvProduz(String convProduz) {
        markAsChanged("CONVPRODUZ", convProduz);
   }

   public BigDecimal getCsosn() {
        return this.getVo().asBigDecimal("CSOSN");
   }

   public void setCsosn(BigDecimal csosn) {
        markAsChanged("CSOSN", csosn);
   }

   public BigDecimal getCodTabStAnt() {
        return this.getVo().asBigDecimal("CODTABSTANT");
   }

   public void setCodTabStAnt(BigDecimal codTabStAnt) {
        markAsChanged("CODTABSTANT", codTabStAnt);
   }

   public BigDecimal getCodTabStUfDest() {
        return this.getVo().asBigDecimal("CODTABSTUFDEST");
   }

   public void setCodTabStUfDest(BigDecimal codTabStUfDest) {
        markAsChanged("CODTABSTUFDEST", codTabStUfDest);
   }

   public String getCusComIcmsBaseSt() {
        return this.getVo().asString("CUSCOMICMSBASEST");
   }

   public void setCusComIcmsBaseSt(String cusComIcmsBaseSt) {
        markAsChanged("CUSCOMICMSBASEST", cusComIcmsBaseSt);
   }

   public String getDescrRestricao() {
        return this.getVo().asString("DESCRRESTRICAO");
   }

   public void setDescrRestricao(String descrRestricao) {
        markAsChanged("DESCRRESTRICAO", descrRestricao);
   }

   public String getDescrRestricao2() {
        return this.getVo().asString("DESCRRESTRICAO2");
   }

   public void setDescrRestricao2(String descrRestricao2) {
        markAsChanged("DESCRRESTRICAO2", descrRestricao2);
   }

   public String getMaiorBaseIcms() {
        return this.getVo().asString("MAIORBASEICMS");
   }

   public void setMaiorBaseIcms(String maiorBaseIcms) {
        markAsChanged("MAIORBASEICMS", maiorBaseIcms);
   }

   public String getMaiorBaseSt() {
        return this.getVo().asString("MAIORBASEST");
   }

   public void setMaiorBaseSt(String maiorBaseSt) {
        markAsChanged("MAIORBASEST", maiorBaseSt);
   }

   public BigDecimal getMargLucro() {
        return this.getVo().asBigDecimal("MARGLUCRO");
   }

   public void setMargLucro(BigDecimal margLucro) {
        markAsChanged("MARGLUCRO", margLucro);
   }

   public BigDecimal getMvaStUfDest() {
        return this.getVo().asBigDecimal("MVASTUFDEST");
   }

   public void setMvaStUfDest(BigDecimal mvaStUfDest) {
        markAsChanged("MVASTUFDEST", mvaStUfDest);
   }

   public BigDecimal getOutOrga() {
        return this.getVo().asBigDecimal("OUTORGA");
   }

   public void setOutOrga(BigDecimal outOrga) {
        markAsChanged("OUTORGA", outOrga);
   }

   public String getProEmprego() {
        return this.getVo().asString("PROEMPREGO");
   }

   public void setProEmprego(String proEmprego) {
        markAsChanged("PROEMPREGO", proEmprego);
   }

   public BigDecimal getRedBase() {
        return this.getVo().asBigDecimal("REDBASE");
   }

   public void setRedBase(BigDecimal redBase) {
        markAsChanged("REDBASE", redBase);
   }

   public BigDecimal getRedBaseFrete() {
        return this.getVo().asBigDecimal("REDBASEFRETE");
   }

   public void setRedBaseFrete(BigDecimal redBaseFrete) {
        markAsChanged("REDBASEFRETE", redBaseFrete);
   }

   public BigDecimal getRedBaseSt() {
        return this.getVo().asBigDecimal("REDBASEST");
   }

   public void setRedBaseSt(BigDecimal redBaseSt) {
        markAsChanged("REDBASEST", redBaseSt);
   }

   public String getRedIcms() {
        return this.getVo().asString("REDICMS");
   }

   public void setRedIcms(String redIcms) {
        markAsChanged("REDICMS", redIcms);
   }

   public String getRepIcms() {
        return this.getVo().asString("REPICMS");
   }

   public void setRepIcms(String repIcms) {
        markAsChanged("REPICMS", repIcms);
   }

   public String getRepRedBase() {
        return this.getVo().asString("REPREDBASE");
   }

   public void setRepRedBase(String repRedBase) {
        markAsChanged("REPREDBASE", repRedBase);
   }

   public String getRepRedBase2() {
        return this.getVo().asString("REPREDBASE2");
   }

   public void setRepRedBase2(String repRedBase2) {
        markAsChanged("REPREDBASE2", repRedBase2);
   }

   public String getTipRestricao() {
        return this.getVo().asString("TIPRESTRICAO");
   }

   public void setTipRestricao(String tipRestricao) {
        markAsChanged("TIPRESTRICAO", tipRestricao);
   }

   public String getTipRestricao2() {
        return this.getVo().asString("TIPRESTRICAO2");
   }

   public void setTipRestricao2(String tipRestricao2) {
        markAsChanged("TIPRESTRICAO2", tipRestricao2);
   }

   public BigDecimal getUfDest() {
        return this.getVo().asBigDecimal("UFDEST");
   }

   public void setUfDest(BigDecimal ufDest) {
        markAsChanged("UFDEST", ufDest);
   }

   public BigDecimal getUfOrig() {
        return this.getVo().asBigDecimal("UFORIG");
   }

   public void setUfOrig(BigDecimal ufOrig) {
        markAsChanged("UFORIG", ufOrig);
   }

   public String getZerar() {
        return this.getVo().asString("ZERAR");
   }

   public void setZerar(String zerar) {
        markAsChanged("ZERAR", zerar);
   }

   public String getZerarStNeg() {
        return this.getVo().asString("ZERARSTNEG");
   }

   public void setZerarStNeg(String zerarStNeg) {
        markAsChanged("ZERARSTNEG", zerarStNeg);
   }

   public BigDecimal getPercIcmsFcp() {
        return this.getVo().asBigDecimal("PERCICMSFCP");
   }

   public void setPercIcmsFcp(BigDecimal percIcmsFcp) {
        markAsChanged("PERCICMSFCP", percIcmsFcp);
   }

   public BigDecimal getPercMinSubtrib() {
        return this.getVo().asBigDecimal("PERCMINSUBTRIB");
   }

   public void setPercMinSubtrib(BigDecimal percMinSubtrib) {
        markAsChanged("PERCMINSUBTRIB", percMinSubtrib);
   }

   public BigDecimal getIdAliq() {
        return this.getVo().asBigDecimal("IDALIQ");
   }

   public void setIdAliq(BigDecimal idAliq) {
        markAsChanged("IDALIQ", idAliq);
   }

   public String getTabCfop() {
        return this.getVo().asString("TABCFOP");
   }

   public void setTabCfop(String tabCfop) {
        markAsChanged("TABCFOP", tabCfop);
   }

   public String getCalcMvaAjustado() {
        return this.getVo().asString("CALCMVAAJUSTADO");
   }

   public void setCalcMvaAjustado(String calcMvaAjustado) {
        markAsChanged("CALCMVAAJUSTADO", calcMvaAjustado);
   }

   public BigDecimal getAliqIntDest() {
        return this.getVo().asBigDecimal("ALIQINTDEST");
   }

   public void setAliqIntDest(BigDecimal aliqIntDest) {
        markAsChanged("ALIQINTDEST", aliqIntDest);
   }

   public String getCalcRepRedDentro() {
        return this.getVo().asString("CALCREPREDDENTRO");
   }

   public void setCalcRepRedDentro(String calcRepRedDentro) {
        markAsChanged("CALCREPREDDENTRO", calcRepRedDentro);
   }

   public BigDecimal getCodFormBaseIcms() {
        return this.getVo().asBigDecimal("CODFORMBASICM");
   }

   public void setCodFormBaseIcms(BigDecimal codFormBaseIcms) {
        markAsChanged("CODFORMBASICM", codFormBaseIcms);
   }

   public String getFormaRepIcms() {
        return this.getVo().asString("FORMAREPICMS");
   }

   public void setFormaRepIcms(String formaRepIcms) {
        markAsChanged("FORMAREPICMS", formaRepIcms);
   }

   public String getIcmsDifPositiva() {
        return this.getVo().asString("ICMSDIFPOSITIVA");
   }

   public void setIcmsDifPositiva(String icmsDifPositiva) {
        markAsChanged("ICMSDIFPOSITIVA", icmsDifPositiva);
   }

   public BigDecimal getMargLucroEst() {
        return this.getVo().asBigDecimal("MARGLUCROEST");
   }

   public void setMargLucroEst(BigDecimal margLucroEst) {
        markAsChanged("MARGLUCROEST", margLucroEst);
   }

   public BigDecimal getPercMultCalcDp() {
        return this.getVo().asBigDecimal("PERCMULTCALCDP");
   }

   public void setPercMultCalcDp(BigDecimal percMultCalcDp) {
        markAsChanged("PERCMULTCALCDP", percMultCalcDp);
   }

   public BigDecimal getPercRedBaseIcmsEfet() {
        return this.getVo().asBigDecimal("PERCREDBASEICMSEFET");
   }

   public void setPercRedBaseIcmsEfet(BigDecimal percRedBaseIcmsEfet) {
        markAsChanged("PERCREDBASEICMSEFET", percRedBaseIcmsEfet);
   }

   public BigDecimal getPercTravaMed() {
        return this.getVo().asBigDecimal("PERCTRAVAMED");
   }

   public void setPercTravaMed(BigDecimal percTravaMed) {
        markAsChanged("PERCTRAVAMED", percTravaMed);
   }

   public BigDecimal getRedBaseEstrangeira() {
        return this.getVo().asBigDecimal("REDBASEESTRANGEIRA");
   }

   public void setRedBaseEstrangeira(BigDecimal redBaseEstrangeira) {
        markAsChanged("REDBASEESTRANGEIRA", redBaseEstrangeira);
   }

   public String getStSutri4302014Mg() {
        return this.getVo().asString("STSUTRI4302014MG");
   }

   public void setStSutri4302014Mg(String stSutri4302014Mg) {
        markAsChanged("STSUTRI4302014MG", stSutri4302014Mg);
   }

   public String getCalcDifIcmsDentro() {
        return this.getVo().asString("CALCDIFICMSDENTRO");
   }

   public void setCalcDifIcmsDentro(String calcDifIcmsDentro) {
        markAsChanged("CALCDIFICMSDENTRO", calcDifIcmsDentro);
   }

   public BigDecimal getAliqIcmsEfet() {
        return this.getVo().asBigDecimal("ALIQICMSEFET");
   }

   public void setAliqIcmsEfet(BigDecimal aliqIcmsEfet) {
        markAsChanged("ALIQICMSEFET", aliqIcmsEfet);
   }

   public String getBaseFcpInt() {
        return this.getVo().asString("BASEFCPINT");
   }

   public void setBaseFcpInt(String baseFcpInt) {
        markAsChanged("BASEFCPINT", baseFcpInt);
   }

   public BigDecimal getAliqEstrangeira() {
        return this.getVo().asBigDecimal("ALIQESTRANGEIRA");
   }

   public void setAliqEstrangeira(BigDecimal aliqEstrangeira) {
        markAsChanged("ALIQESTRANGEIRA", aliqEstrangeira);
   }

   public String getDesconsideraRedBase() {
        return this.getVo().asString("DESCONSIDERAREDBASE");
   }

   public void setDesconsideraRedBase(String desconsideraRedBase) {
        markAsChanged("DESCONSIDERAREDBASE", desconsideraRedBase);
   }

   public BigDecimal getRepPercBaseIcms() {
        return this.getVo().asBigDecimal("REPPERCBASEICMS");
   }

   public void setRepPercBaseIcms(BigDecimal repPercBaseIcms) {
        markAsChanged("REPPERCBASEICMS", repPercBaseIcms);
   }

   public String getRepDifAlFcp() {
        return this.getVo().asString("REPDIFALFCP");
   }

   public void setRepDifAlFcp(String repDifAlFcp) {
        markAsChanged("REPDIFALFCP", repDifAlFcp);
   }

   public BigDecimal getPercIcmsFcpInt() {
        return this.getVo().asBigDecimal("PERCICMSFCPINT");
   }

   public void setPercIcmsFcpInt(BigDecimal percIcmsFcpInt) {
        markAsChanged("PERCICMSFCPINT", percIcmsFcpInt);
   }

   public BigDecimal getPercStFcpInt() {
        return this.getVo().asBigDecimal("PERCSTFCPINT");
   }

   public void setPercStFcpInt(BigDecimal percStFcpInt) {
        markAsChanged("PERCSTFCPINT", percStFcpInt);
   }

   public String getMvaOriginal() {
        return this.getVo().asString("MVAORIGINAL");
   }

   public void setMvaOriginal(String mvaOriginal) {
        markAsChanged("MVAORIGINAL", mvaOriginal);
   }

   public String getZerarDifAlRem() {
        return this.getVo().asString("ZERARDIFALREM");
   }

   public void setZerarDifAlRem(String zerarDifAlRem) {
        markAsChanged("ZERARDIFALREM", zerarDifAlRem);
   }

   public BigDecimal getTipCalcStEspec() {
        return this.getVo().asBigDecimal("TIPCALCSTESPEC");
   }

   public void setTipCalcStEspec(BigDecimal tipCalcStEspec) {
        markAsChanged("TIPCALCSTESPEC", tipCalcStEspec);
   }

   public String getPautaVlrStFixo() {
        return this.getVo().asString("PAUTAVLRSTFIXO");
   }

   public void setPautaVlrStFixo(String pautaVlrStFixo) {
        markAsChanged("PAUTAVLRSTFIXO", pautaVlrStFixo);
   }

   public BigDecimal getAliqIcmsLimiteCalcSt() {
        return this.getVo().asBigDecimal("ALIQICMSLIMITECALCST");
   }

   public void setAliqIcmsLimiteCalcSt(BigDecimal aliqIcmsLimiteCalcSt) {
        markAsChanged("ALIQICMSLIMITECALCST", aliqIcmsLimiteCalcSt);
   }

   public String getCalcStLivreCom() {
        return this.getVo().asString("CALCSTLIVRECOM");
   }

   public void setCalcStLivreCom(String calcStLivreCom) {
        markAsChanged("CALCSTLIVRECOM", calcStLivreCom);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getIcmsUfOrigDifEmit() {
        return this.getVo().asString("ICMSUFORIGDIFEMIT");
   }

   public void setIcmsUfOrigDifEmit(String icmsUfOrigDifEmit) {
        markAsChanged("ICMSUFORIGDIFEMIT", icmsUfOrigDifEmit);
   }

   public BigDecimal getPercCargaTribMedia() {
        return this.getVo().asBigDecimal("PERCCARGATRIBMEDIA");
   }

   public void setPercCargaTribMedia(BigDecimal percCargaTribMedia) {
        markAsChanged("PERCCARGATRIBMEDIA", percCargaTribMedia);
   }

   public String getMvaSimplificado() {
        return this.getVo().asString("MVASIMPLIFICADO");
   }

   public void setMvaSimplificado(String mvaSimplificado) {
        markAsChanged("MVASIMPLIFICADO", mvaSimplificado);
   }

   public BigDecimal getTipCalcDifAl() {
        return this.getVo().asBigDecimal("TIPCALCDIFAL");
   }

   public void setTipCalcDifAl(BigDecimal tipCalcDifAl) {
        markAsChanged("TIPCALCDIFAL", tipCalcDifAl);
   }

   public BigDecimal getPercRedBaseDest() {
        return this.getVo().asBigDecimal("PERCREDBASEDEST");
   }

   public void setPercRedBaseDest(BigDecimal percRedBaseDest) {
        markAsChanged("PERCREDBASEDEST", percRedBaseDest);
   }

   public String getStCat137Sp() {
        return this.getVo().asString("STCAT137SP");
   }

   public void setStCat137Sp(String stCat137Sp) {
        markAsChanged("STCAT137SP", stCat137Sp);
   }

   public String getCalcStConsuTri() {
        return this.getVo().asString("CALCSTCONSUTRI");
   }

   public void setCalcStConsuTri(String calcStConsuTri) {
        markAsChanged("CALCSTCONSUTRI", calcStConsuTri);
   }

   public String getConsidIpivLroProp() {
        return this.getVo().asString("CONSIDIPIVLROPPROP");
   }

   public void setConsidIpivLroProp(String considIpivLroProp) {
        markAsChanged("CONSIDIPIVLROPPROP", considIpivLroProp);
   }

   public BigDecimal getPercPmpf() {
        return this.getVo().asBigDecimal("PERCPMPF");
   }

   public void setPercPmpf(BigDecimal percPmpf) {
        markAsChanged("PERCPMPF", percPmpf);
   }

   public String getCalcRedPreIcmCon() {
        return this.getVo().asString("CALCREDPREICMCON");
   }

   public void setCalcRedPreIcmCon(String calcRedPreIcmCon) {
        markAsChanged("CALCREDPREICMCON", calcRedPreIcmCon);
   }

   public String getNaoConsidMva() {
        return this.getVo().asString("NAOCONSIDMVA");
   }

   public void setNaoConsidMva(String naoConsidMva) {
        markAsChanged("NAOCONSIDMVA", naoConsidMva);
   }

   public BigDecimal getPercRedPreIcmCon() {
        return this.getVo().asBigDecimal("PERCREDPREICMCON");
   }

   public void setPercRedPreIcmCon(BigDecimal percRedPreIcmCon) {
        markAsChanged("PERCREDPREICMCON", percRedPreIcmCon);
   }

   public BigDecimal getCodTabStFarPop() {
        return this.getVo().asBigDecimal("CODTABSTFARPOP");
   }

   public void setCodTabStFarPop(BigDecimal codTabStFarPop) {
        markAsChanged("CODTABSTFARPOP", codTabStFarPop);
   }

   public BigDecimal getCodTabStPmpf() {
        return this.getVo().asBigDecimal("CODTABSTPMPF");
   }

   public void setCodTabStPmpf(BigDecimal codTabStPmpf) {
        markAsChanged("CODTABSTPMPF", codTabStPmpf);
   }

   public BigDecimal getAliqIcmsCargTribRed() {
        return this.getVo().asBigDecimal("ALIQICMSCARGTRIBRED");
   }

   public void setAliqIcmsCargTribRed(BigDecimal aliqIcmsCargTribRed) {
        markAsChanged("ALIQICMSCARGTRIBRED", aliqIcmsCargTribRed);
   }

   public BigDecimal getAliqStCargTribRed() {
        return this.getVo().asBigDecimal("ALIQSTCARGTRIBRED");
   }

   public void setAliqStCargTribRed(BigDecimal aliqStCargTribRed) {
        markAsChanged("ALIQSTCARGTRIBRED", aliqStCargTribRed);
   }

   public String getCalcPerRedBaseIcms() {
        return this.getVo().asString("CALPERREDBASEICMS");
   }

   public void setCalcPerRedBaseIcms(String calcPerRedBaseIcms) {
        markAsChanged("CALPERREDBASEICMS", calcPerRedBaseIcms);
   }

   public String getCalcPerRedBaseSt() {
        return this.getVo().asString("CALPERREDBASEST");
   }

   public void setCalcPerRedBaseSt(String calcPerRedBaseSt) {
        markAsChanged("CALPERREDBASEST", calcPerRedBaseSt);
   }

   public BigDecimal getAliqIcmsEspSt() {
        return this.getVo().asBigDecimal("ALIQICMSESPST");
   }

   public void setAliqIcmsEspSt(BigDecimal aliqIcmsEspSt) {
        markAsChanged("ALIQICMSESPST", aliqIcmsEspSt);
   }

   public BigDecimal getPercUsaquDecpe() {
        return this.getVo().asBigDecimal("PERCUSAQUDECPE");
   }

   public void setPercUsaquDecpe(BigDecimal percUsaquDecpe) {
        markAsChanged("PERCUSAQUDECPE", percUsaquDecpe);
   }

   public String getTipCusAquDecpe() {
        return this.getVo().asString("TIPCUSAQUDECPE");
   }

   public void setTipCusAquDecpe(String tipCusAquDecpe) {
        markAsChanged("TIPCUSAQUDECPE", tipCusAquDecpe);
   }

   public BigDecimal getTipCalcFcpStEspec() {
        return this.getVo().asBigDecimal("TIPCALCFCPSTESPEC");
   }

   public void setTipCalcFcpStEspec(BigDecimal tipCalcFcpStEspec) {
        markAsChanged("TIPCALCFCPSTESPEC", tipCalcFcpStEspec);
   }

   public String getCalcRepRedSt() {
        return this.getVo().asString("CALCREPREDST");
   }

   public void setCalcRepRedSt(String calcRepRedSt) {
        markAsChanged("CALCREPREDST", calcRepRedSt);
   }

   public BigDecimal getCodMotDesoneraSt() {
        return this.getVo().asBigDecimal("CODMOTDESONERAST");
   }

   public void setCodMotDesoneraSt(BigDecimal codMotDesoneraSt) {
        markAsChanged("CODMOTDESONERAST", codMotDesoneraSt);
   }

   public String getCaracTrib() {
        return this.getVo().asString("CARACTRIB");
   }

   public void setCaracTrib(String caracTrib) {
        markAsChanged("CARACTRIB", caracTrib);
   }

   public String getFinalidade() {
        return this.getVo().asString("FINALIDADE");
   }

   public void setFinalidade(String finalidade) {
        markAsChanged("FINALIDADE", finalidade);
   }

   public BigDecimal getAliqIcmsAt() {
        return this.getVo().asBigDecimal("ALIQICMSAT");
   }

   public void setAliqIcmsAt(BigDecimal aliqIcmsAt) {
        markAsChanged("ALIQICMSAT", aliqIcmsAt);
   }

   public BigDecimal getAliqIcmsAtImp() {
        return this.getVo().asBigDecimal("ALIQICMSATIMP");
   }

   public void setAliqIcmsAtImp(BigDecimal aliqIcmsAtImp) {
        markAsChanged("ALIQICMSATIMP", aliqIcmsAtImp);
   }

   public BigDecimal getAliqIcmsAtInt() {
        return this.getVo().asBigDecimal("ALIQICMSATINT");
   }

   public void setAliqIcmsAtInt(BigDecimal aliqIcmsAtInt) {
        markAsChanged("ALIQICMSATINT", aliqIcmsAtInt);
   }

   public BigDecimal getCodFormBcIcmsAt() {
        return this.getVo().asBigDecimal("CODFORMBCICMSAT");
   }

   public void setCodFormBcIcmsAt(BigDecimal codFormBcIcmsAt) {
        markAsChanged("CODFORMBCICMSAT", codFormBcIcmsAt);
   }

   public String getRegraCalcBcIcmsAt() {
        return this.getVo().asString("REGRACALCBCICMSAT");
   }

   public void setRegraCalcBcIcmsAt(String regraCalcBcIcmsAt) {
        markAsChanged("REGRACALCBCICMSAT", regraCalcBcIcmsAt);
   }

   public String getRegraDeIcmsAt() {
        return this.getVo().asString("REGRADEDICMSAT");
   }

   public void setRegraDeIcmsAt(String regraDeIcmsAt) {
        markAsChanged("REGRADEDICMSAT", regraDeIcmsAt);
   }

   public BigDecimal getCodFormBaseDifAl() {
        return this.getVo().asBigDecimal("CODFORMBASDIFAL");
   }

   public void setCodFormBaseDifAl(BigDecimal codFormBaseDifAl) {
        markAsChanged("CODFORMBASDIFAL", codFormBaseDifAl);
   }

   public String getCalcStDecpr() {
        return this.getVo().asString("CALCSTDECPR");
   }

   public void setCalcStDecpr(String calcStDecpr) {
        markAsChanged("CALCSTDECPR", calcStDecpr);
   }

   public BigDecimal getCodFormCalcDifAl() {
        return this.getVo().asBigDecimal("CODFORMCALCDIFAL");
   }

   public void setCodFormCalcDifAl(BigDecimal codFormCalcDifAl) {
        markAsChanged("CODFORMCALCDIFAL", codFormCalcDifAl);
   }

   public BigDecimal getCredPresDecpr() {
        return this.getVo().asBigDecimal("CREDPRESDECPR");
   }

   public void setCredPresDecpr(BigDecimal credPresDecpr) {
        markAsChanged("CREDPRESDECPR", credPresDecpr);
   }

   public String getDesIcmsSn() {
        return this.getVo().asString("DESICMSSN");
   }

   public void setDesIcmsSn(String desIcmsSn) {
        markAsChanged("DESICMSSN", desIcmsSn);
   }

   public BigDecimal getFormCalcFcpDifAl() {
        return this.getVo().asBigDecimal("FORMCALFCPDIFAL");
   }

   public void setFormCalcFcpDifAl(BigDecimal formCalcFcpDifAl) {
        markAsChanged("FORMCALFCPDIFAL", formCalcFcpDifAl);
   }

   public BigDecimal getPercUsaquDecpeEst() {
        return this.getVo().asBigDecimal("PERCUSAQUDECPEEST");
   }

   public void setPercUsaquDecpeEst(BigDecimal percUsaquDecpeEst) {
        markAsChanged("PERCUSAQUDECPEEST", percUsaquDecpeEst);
   }

   public BigDecimal getAliqConsFin() {
        return this.getVo().asBigDecimal("ALIQCONSFIN");
   }

   public void setAliqConsFin(BigDecimal aliqConsFin) {
        markAsChanged("ALIQCONSFIN", aliqConsFin);
   }

   public String getCodBen() {
        return this.getVo().asString("CODBEN");
   }

   public void setCodBen(String codBen) {
        markAsChanged("CODBEN", codBen);
   }

   public BigDecimal getCodFormVa() {
        return this.getVo().asBigDecimal("CODFORMVA");
   }

   public void setCodFormVa(BigDecimal codFormVa) {
        markAsChanged("CODFORMVA", codFormVa);
   }

   public BigDecimal getPercRedPr() {
        return this.getVo().asBigDecimal("PERCREDPR");
   }

   public void setPercRedPr(BigDecimal percRedPr) {
        markAsChanged("PERCREDPR", percRedPr);
   }

   public String getConsPmvAbcIcm() {
        return this.getVo().asString("CONSPMVABCICM");
   }

   public void setConsPmvAbcIcm(String consPmvAbcIcm) {
        markAsChanged("CONSPMVABCICM", consPmvAbcIcm);
   }

   public String getCalcAliFcpSt() {
        return this.getVo().asString("CALCALIFCPST");
   }

   public void setCalcAliFcpSt(String calcAliFcpSt) {
        markAsChanged("CALCALIFCPST", calcAliFcpSt);
   }

   public BigDecimal getAliqAdRemIcms() {
        return this.getVo().asBigDecimal("ALIQADREMICMS");
   }

   public void setAliqAdRemIcms(BigDecimal aliqAdRemIcms) {
        markAsChanged("ALIQADREMICMS", aliqAdRemIcms);
   }

   public BigDecimal getMotRedAdRem() {
        return this.getVo().asBigDecimal("MOTREDADREM");
   }

   public void setMotRedAdRem(BigDecimal motRedAdRem) {
        markAsChanged("MOTREDADREM", motRedAdRem);
   }

   public BigDecimal getPercAliqAdRemIcms() {
        return this.getVo().asBigDecimal("PERCALIQADREMICMS");
   }

   public void setPercAliqAdRemIcms(BigDecimal percAliqAdRemIcms) {
        markAsChanged("PERCALIQADREMICMS", percAliqAdRemIcms);
   }

   public BigDecimal getPercIcmsMonoRet() {
        return this.getVo().asBigDecimal("PERCICMSMONORET");
   }

   public void setPercIcmsMonoRet(BigDecimal percIcmsMonoRet) {
        markAsChanged("PERCICMSMONORET", percIcmsMonoRet);
   }

   @Override
   public String getTableName() {
        return "TGFICM";
   }

   @Override
   public String getEntityName() {
        return "AliquotaICMS";
   }

   @Override
   public AliquotaICMS fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
