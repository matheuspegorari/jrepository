package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class AliquotaICMS implements SankhyaEntity<AliquotaICMS> {

   private BigDecimal aliqFrete;
   private BigDecimal aliqSubtrib;
   private BigDecimal aliqUfdest;
   private BigDecimal aliquota;
   private String baseStRed;
   private String baseStUfdest;
   private BigDecimal baseIcmMod;
   private BigDecimal baseIcmStMod;
   private String calcStExtraNota;
   private String codAntecipSt;
   private BigDecimal codMotDesoneraIcms;
   private BigDecimal codObsPadrao;
   private BigDecimal codRestricao;
   private BigDecimal codRestricao2;
   private BigDecimal codTab;
   private BigDecimal codTabIcms;
   private BigDecimal codTrib;
   private String convProduz;
   private BigDecimal csosn;
   private BigDecimal codTabStAnt;
   private BigDecimal codTabStUfdest;
   private String cusComIcmsBaseSt;
   private String descrRestricao;
   private String descrRestricao2;
   private String maiorBaseIcms;
   private String maiorBaseSt;
   private BigDecimal margLucro;
   private BigDecimal mvaStUfdest;
   private BigDecimal outOrga;
   private String proEmprego;
   private BigDecimal redBase;
   private BigDecimal redBaseFrete;
   private BigDecimal redBaseSt;
   private String redIcms;
   private String repIcms;
   private String repRedBase;
   private String repRedBase2;
   private String tipRestricao;
   private String tipRestricao2;
   private BigDecimal ufDest;
   private BigDecimal ufOrig;
   private String zerar;
   private String zerarStNeg;
   private BigDecimal percIcmsFcp;
   private BigDecimal percMinSubtrib;
   private BigDecimal idAliq;
   private String tabCfop;
   private String calcMvaAjustado;
   private BigDecimal aliqIntDest;
   private String calcRepRedDentro;
   private BigDecimal codFormBasIcm;
   private String formaRepIcms;
   private String icmsDifPositiva;
   private BigDecimal margLucroEst;
   private BigDecimal percMultCalcDp;
   private BigDecimal percRedBaseIcmsEfet;
   private BigDecimal percTravaMed;
   private BigDecimal redBaseEstrangeira;
   private String stSutri4302014Mg;
   private String calcDifIcmsDentro;
   private BigDecimal aliqIcmsEfet;
   private String baseFcpInt;
   private BigDecimal aliqEstrangeira;
   private String desconsideraRedBase;
   private BigDecimal repPercBaseIcms;
   private String repDifAlFcp;
   private BigDecimal percIcmsFcpInt;
   private BigDecimal percStFcpInt;
   private String mvaOriginal;
   private String zerarDifAlRem;
   private BigDecimal tipCalcStEspec;
   private String pautaVlrStFixo;
   private BigDecimal aliqIcmsLimiteCalcSt;
   private String calcStLivreCom;
   private BigDecimal sequencia;
   private String icmsUfOrigDifEmit;
   private BigDecimal percCargaTribMedia;
   private String mvaSimplificado;
   private BigDecimal tipCalcDifAl;
   private BigDecimal percRedBaseDest;
   private String stCat137Sp;
   private String calcStConsuTri;
   private String considIpivLroPprop;
   private BigDecimal percPmpf;
   private String calcRedPreIcmCon;
   private String naoConsidMva;
   private BigDecimal percRedPreIcmCon;
   private BigDecimal codTabStFarPop;
   private BigDecimal codTabStPmpf;
   private BigDecimal aliqIcmsCargTribRed;
   private BigDecimal aliqStCargTribRed;
   private String calPerRedBaseIcms;
   private String calPerRedBaseSt;
   private BigDecimal aliqIcmsEspSt;
   private BigDecimal percUsaquDecpe;
   private String tipCusAquDecpe;
   private BigDecimal tipCalcFcpStEspec;
   private String calcRepRedSt;
   private BigDecimal codMotDesoneraSt;
   private String caracTrib;
   private String finalidade;
   private BigDecimal aliqIcmsAt;
   private BigDecimal aliqIcmsAtImp;
   private BigDecimal aliqIcmsAtInt;
   private BigDecimal codFormBcIcmsAt;
   private String regraCalcBcIcmsAt;
   private String regraDeIcmsAt;
   private BigDecimal codFormBasDifAl;
   private String calcStDecpr;
   private BigDecimal codFormCalcDifAl;
   private BigDecimal credPresDecpr;
   private String desIcmsSn;
   private BigDecimal formCalcFcpDifAl;
   private BigDecimal percUsaquDecpeEst;
   private BigDecimal aliqConsFin;
   private String codBen;
   private BigDecimal codFormVa;
   private BigDecimal percRedPr;
   private String consPmvAbcIcm;
   private String calcAliFcpSt;
   private BigDecimal aliqAdRemIcms;
   private BigDecimal motRedAdRem;
   private BigDecimal percAliqAdRemIcms;
   private BigDecimal percIcmsMonoRet;

   public BigDecimal getAliqFrete() {
        return aliqFrete;
   }

   public void setAliqFrete(BigDecimal aliqFrete) {
        this.aliqFrete = aliqFrete;
   }

   public BigDecimal getAliqSubtrib() {
        return aliqSubtrib;
   }

   public void setAliqSubtrib(BigDecimal aliqSubtrib) {
        this.aliqSubtrib = aliqSubtrib;
   }

   public BigDecimal getAliqUfdest() {
        return aliqUfdest;
   }

   public void setAliqUfdest(BigDecimal aliqUfdest) {
        this.aliqUfdest = aliqUfdest;
   }

   public BigDecimal getAliquota() {
        return aliquota;
   }

   public void setAliquota(BigDecimal aliquota) {
        this.aliquota = aliquota;
   }

   public String getBaseStRed() {
        return baseStRed;
   }

   public void setBaseStRed(String baseStRed) {
        this.baseStRed = baseStRed;
   }

   public String getBaseStUfdest() {
        return baseStUfdest;
   }

   public void setBaseStUfdest(String baseStUfdest) {
        this.baseStUfdest = baseStUfdest;
   }

   public BigDecimal getBaseIcmMod() {
        return baseIcmMod;
   }

   public void setBaseIcmMod(BigDecimal baseIcmMod) {
        this.baseIcmMod = baseIcmMod;
   }

   public BigDecimal getBaseIcmStMod() {
        return baseIcmStMod;
   }

   public void setBaseIcmStMod(BigDecimal baseIcmStMod) {
        this.baseIcmStMod = baseIcmStMod;
   }

   public String getCalcStExtraNota() {
        return calcStExtraNota;
   }

   public void setCalcStExtraNota(String calcStExtraNota) {
        this.calcStExtraNota = calcStExtraNota;
   }

   public String getCodAntecipSt() {
        return codAntecipSt;
   }

   public void setCodAntecipSt(String codAntecipSt) {
        this.codAntecipSt = codAntecipSt;
   }

   public BigDecimal getCodMotDesoneraIcms() {
        return codMotDesoneraIcms;
   }

   public void setCodMotDesoneraIcms(BigDecimal codMotDesoneraIcms) {
        this.codMotDesoneraIcms = codMotDesoneraIcms;
   }

   public BigDecimal getCodObsPadrao() {
        return codObsPadrao;
   }

   public void setCodObsPadrao(BigDecimal codObsPadrao) {
        this.codObsPadrao = codObsPadrao;
   }

   public BigDecimal getCodRestricao() {
        return codRestricao;
   }

   public void setCodRestricao(BigDecimal codRestricao) {
        this.codRestricao = codRestricao;
   }

   public BigDecimal getCodRestricao2() {
        return codRestricao2;
   }

   public void setCodRestricao2(BigDecimal codRestricao2) {
        this.codRestricao2 = codRestricao2;
   }

   public BigDecimal getCodTab() {
        return codTab;
   }

   public void setCodTab(BigDecimal codTab) {
        this.codTab = codTab;
   }

   public BigDecimal getCodTabIcms() {
        return codTabIcms;
   }

   public void setCodTabIcms(BigDecimal codTabIcms) {
        this.codTabIcms = codTabIcms;
   }

   public BigDecimal getCodTrib() {
        return codTrib;
   }

   public void setCodTrib(BigDecimal codTrib) {
        this.codTrib = codTrib;
   }

   public String getConvProduz() {
        return convProduz;
   }

   public void setConvProduz(String convProduz) {
        this.convProduz = convProduz;
   }

   public BigDecimal getCsosn() {
        return csosn;
   }

   public void setCsosn(BigDecimal csosn) {
        this.csosn = csosn;
   }

   public BigDecimal getCodTabStAnt() {
        return codTabStAnt;
   }

   public void setCodTabStAnt(BigDecimal codTabStAnt) {
        this.codTabStAnt = codTabStAnt;
   }

   public BigDecimal getCodTabStUfdest() {
        return codTabStUfdest;
   }

   public void setCodTabStUfdest(BigDecimal codTabStUfdest) {
        this.codTabStUfdest = codTabStUfdest;
   }

   public String getCusComIcmsBaseSt() {
        return cusComIcmsBaseSt;
   }

   public void setCusComIcmsBaseSt(String cusComIcmsBaseSt) {
        this.cusComIcmsBaseSt = cusComIcmsBaseSt;
   }

   public String getDescrRestricao() {
        return descrRestricao;
   }

   public void setDescrRestricao(String descrRestricao) {
        this.descrRestricao = descrRestricao;
   }

   public String getDescrRestricao2() {
        return descrRestricao2;
   }

   public void setDescrRestricao2(String descrRestricao2) {
        this.descrRestricao2 = descrRestricao2;
   }

   public String getMaiorBaseIcms() {
        return maiorBaseIcms;
   }

   public void setMaiorBaseIcms(String maiorBaseIcms) {
        this.maiorBaseIcms = maiorBaseIcms;
   }

   public String getMaiorBaseSt() {
        return maiorBaseSt;
   }

   public void setMaiorBaseSt(String maiorBaseSt) {
        this.maiorBaseSt = maiorBaseSt;
   }

   public BigDecimal getMargLucro() {
        return margLucro;
   }

   public void setMargLucro(BigDecimal margLucro) {
        this.margLucro = margLucro;
   }

   public BigDecimal getMvaStUfdest() {
        return mvaStUfdest;
   }

   public void setMvaStUfdest(BigDecimal mvaStUfdest) {
        this.mvaStUfdest = mvaStUfdest;
   }

   public BigDecimal getOutOrga() {
        return outOrga;
   }

   public void setOutOrga(BigDecimal outOrga) {
        this.outOrga = outOrga;
   }

   public String getProEmprego() {
        return proEmprego;
   }

   public void setProEmprego(String proEmprego) {
        this.proEmprego = proEmprego;
   }

   public BigDecimal getRedBase() {
        return redBase;
   }

   public void setRedBase(BigDecimal redBase) {
        this.redBase = redBase;
   }

   public BigDecimal getRedBaseFrete() {
        return redBaseFrete;
   }

   public void setRedBaseFrete(BigDecimal redBaseFrete) {
        this.redBaseFrete = redBaseFrete;
   }

   public BigDecimal getRedBaseSt() {
        return redBaseSt;
   }

   public void setRedBaseSt(BigDecimal redBaseSt) {
        this.redBaseSt = redBaseSt;
   }

   public String getRedIcms() {
        return redIcms;
   }

   public void setRedIcms(String redIcms) {
        this.redIcms = redIcms;
   }

   public String getRepIcms() {
        return repIcms;
   }

   public void setRepIcms(String repIcms) {
        this.repIcms = repIcms;
   }

   public String getRepRedBase() {
        return repRedBase;
   }

   public void setRepRedBase(String repRedBase) {
        this.repRedBase = repRedBase;
   }

   public String getRepRedBase2() {
        return repRedBase2;
   }

   public void setRepRedBase2(String repRedBase2) {
        this.repRedBase2 = repRedBase2;
   }

   public String getTipRestricao() {
        return tipRestricao;
   }

   public void setTipRestricao(String tipRestricao) {
        this.tipRestricao = tipRestricao;
   }

   public String getTipRestricao2() {
        return tipRestricao2;
   }

   public void setTipRestricao2(String tipRestricao2) {
        this.tipRestricao2 = tipRestricao2;
   }

   public BigDecimal getUfDest() {
        return ufDest;
   }

   public void setUfDest(BigDecimal ufDest) {
        this.ufDest = ufDest;
   }

   public BigDecimal getUfOrig() {
        return ufOrig;
   }

   public void setUfOrig(BigDecimal ufOrig) {
        this.ufOrig = ufOrig;
   }

   public String getZerar() {
        return zerar;
   }

   public void setZerar(String zerar) {
        this.zerar = zerar;
   }

   public String getZerarStNeg() {
        return zerarStNeg;
   }

   public void setZerarStNeg(String zerarStNeg) {
        this.zerarStNeg = zerarStNeg;
   }

   public BigDecimal getPercIcmsFcp() {
        return percIcmsFcp;
   }

   public void setPercIcmsFcp(BigDecimal percIcmsFcp) {
        this.percIcmsFcp = percIcmsFcp;
   }

   public BigDecimal getPercMinSubtrib() {
        return percMinSubtrib;
   }

   public void setPercMinSubtrib(BigDecimal percMinSubtrib) {
        this.percMinSubtrib = percMinSubtrib;
   }

   public BigDecimal getIdAliq() {
        return idAliq;
   }

   public void setIdAliq(BigDecimal idAliq) {
        this.idAliq = idAliq;
   }

   public String getTabCfop() {
        return tabCfop;
   }

   public void setTabCfop(String tabCfop) {
        this.tabCfop = tabCfop;
   }

   public String getCalcMvaAjustado() {
        return calcMvaAjustado;
   }

   public void setCalcMvaAjustado(String calcMvaAjustado) {
        this.calcMvaAjustado = calcMvaAjustado;
   }

   public BigDecimal getAliqIntDest() {
        return aliqIntDest;
   }

   public void setAliqIntDest(BigDecimal aliqIntDest) {
        this.aliqIntDest = aliqIntDest;
   }

   public String getCalcRepRedDentro() {
        return calcRepRedDentro;
   }

   public void setCalcRepRedDentro(String calcRepRedDentro) {
        this.calcRepRedDentro = calcRepRedDentro;
   }

   public BigDecimal getCodFormBasIcm() {
        return codFormBasIcm;
   }

   public void setCodFormBasIcm(BigDecimal codFormBasIcm) {
        this.codFormBasIcm = codFormBasIcm;
   }

   public String getFormaRepIcms() {
        return formaRepIcms;
   }

   public void setFormaRepIcms(String formaRepIcms) {
        this.formaRepIcms = formaRepIcms;
   }

   public String getIcmsDifPositiva() {
        return icmsDifPositiva;
   }

   public void setIcmsDifPositiva(String icmsDifPositiva) {
        this.icmsDifPositiva = icmsDifPositiva;
   }

   public BigDecimal getMargLucroEst() {
        return margLucroEst;
   }

   public void setMargLucroEst(BigDecimal margLucroEst) {
        this.margLucroEst = margLucroEst;
   }

   public BigDecimal getPercMultCalcDp() {
        return percMultCalcDp;
   }

   public void setPercMultCalcDp(BigDecimal percMultCalcDp) {
        this.percMultCalcDp = percMultCalcDp;
   }

   public BigDecimal getPercRedBaseIcmsEfet() {
        return percRedBaseIcmsEfet;
   }

   public void setPercRedBaseIcmsEfet(BigDecimal percRedBaseIcmsEfet) {
        this.percRedBaseIcmsEfet = percRedBaseIcmsEfet;
   }

   public BigDecimal getPercTravaMed() {
        return percTravaMed;
   }

   public void setPercTravaMed(BigDecimal percTravaMed) {
        this.percTravaMed = percTravaMed;
   }

   public BigDecimal getRedBaseEstrangeira() {
        return redBaseEstrangeira;
   }

   public void setRedBaseEstrangeira(BigDecimal redBaseEstrangeira) {
        this.redBaseEstrangeira = redBaseEstrangeira;
   }

   public String getStSutri4302014Mg() {
        return stSutri4302014Mg;
   }

   public void setStSutri4302014Mg(String stSutri4302014Mg) {
        this.stSutri4302014Mg = stSutri4302014Mg;
   }

   public String getCalcDifIcmsDentro() {
        return calcDifIcmsDentro;
   }

   public void setCalcDifIcmsDentro(String calcDifIcmsDentro) {
        this.calcDifIcmsDentro = calcDifIcmsDentro;
   }

   public BigDecimal getAliqIcmsEfet() {
        return aliqIcmsEfet;
   }

   public void setAliqIcmsEfet(BigDecimal aliqIcmsEfet) {
        this.aliqIcmsEfet = aliqIcmsEfet;
   }

   public String getBaseFcpInt() {
        return baseFcpInt;
   }

   public void setBaseFcpInt(String baseFcpInt) {
        this.baseFcpInt = baseFcpInt;
   }

   public BigDecimal getAliqEstrangeira() {
        return aliqEstrangeira;
   }

   public void setAliqEstrangeira(BigDecimal aliqEstrangeira) {
        this.aliqEstrangeira = aliqEstrangeira;
   }

   public String getDesconsideraRedBase() {
        return desconsideraRedBase;
   }

   public void setDesconsideraRedBase(String desconsideraRedBase) {
        this.desconsideraRedBase = desconsideraRedBase;
   }

   public BigDecimal getRepPercBaseIcms() {
        return repPercBaseIcms;
   }

   public void setRepPercBaseIcms(BigDecimal repPercBaseIcms) {
        this.repPercBaseIcms = repPercBaseIcms;
   }

   public String getRepDifAlFcp() {
        return repDifAlFcp;
   }

   public void setRepDifAlFcp(String repDifAlFcp) {
        this.repDifAlFcp = repDifAlFcp;
   }

   public BigDecimal getPercIcmsFcpInt() {
        return percIcmsFcpInt;
   }

   public void setPercIcmsFcpInt(BigDecimal percIcmsFcpInt) {
        this.percIcmsFcpInt = percIcmsFcpInt;
   }

   public BigDecimal getPercStFcpInt() {
        return percStFcpInt;
   }

   public void setPercStFcpInt(BigDecimal percStFcpInt) {
        this.percStFcpInt = percStFcpInt;
   }

   public String getMvaOriginal() {
        return mvaOriginal;
   }

   public void setMvaOriginal(String mvaOriginal) {
        this.mvaOriginal = mvaOriginal;
   }

   public String getZerarDifAlRem() {
        return zerarDifAlRem;
   }

   public void setZerarDifAlRem(String zerarDifAlRem) {
        this.zerarDifAlRem = zerarDifAlRem;
   }

   public BigDecimal getTipCalcStEspec() {
        return tipCalcStEspec;
   }

   public void setTipCalcStEspec(BigDecimal tipCalcStEspec) {
        this.tipCalcStEspec = tipCalcStEspec;
   }

   public String getPautaVlrStFixo() {
        return pautaVlrStFixo;
   }

   public void setPautaVlrStFixo(String pautaVlrStFixo) {
        this.pautaVlrStFixo = pautaVlrStFixo;
   }

   public BigDecimal getAliqIcmsLimiteCalcSt() {
        return aliqIcmsLimiteCalcSt;
   }

   public void setAliqIcmsLimiteCalcSt(BigDecimal aliqIcmsLimiteCalcSt) {
        this.aliqIcmsLimiteCalcSt = aliqIcmsLimiteCalcSt;
   }

   public String getCalcStLivreCom() {
        return calcStLivreCom;
   }

   public void setCalcStLivreCom(String calcStLivreCom) {
        this.calcStLivreCom = calcStLivreCom;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getIcmsUfOrigDifEmit() {
        return icmsUfOrigDifEmit;
   }

   public void setIcmsUfOrigDifEmit(String icmsUfOrigDifEmit) {
        this.icmsUfOrigDifEmit = icmsUfOrigDifEmit;
   }

   public BigDecimal getPercCargaTribMedia() {
        return percCargaTribMedia;
   }

   public void setPercCargaTribMedia(BigDecimal percCargaTribMedia) {
        this.percCargaTribMedia = percCargaTribMedia;
   }

   public String getMvaSimplificado() {
        return mvaSimplificado;
   }

   public void setMvaSimplificado(String mvaSimplificado) {
        this.mvaSimplificado = mvaSimplificado;
   }

   public BigDecimal getTipCalcDifAl() {
        return tipCalcDifAl;
   }

   public void setTipCalcDifAl(BigDecimal tipCalcDifAl) {
        this.tipCalcDifAl = tipCalcDifAl;
   }

   public BigDecimal getPercRedBaseDest() {
        return percRedBaseDest;
   }

   public void setPercRedBaseDest(BigDecimal percRedBaseDest) {
        this.percRedBaseDest = percRedBaseDest;
   }

   public String getStCat137Sp() {
        return stCat137Sp;
   }

   public void setStCat137Sp(String stCat137Sp) {
        this.stCat137Sp = stCat137Sp;
   }

   public String getCalcStConsuTri() {
        return calcStConsuTri;
   }

   public void setCalcStConsuTri(String calcStConsuTri) {
        this.calcStConsuTri = calcStConsuTri;
   }

   public String getConsidIpivLroPprop() {
        return considIpivLroPprop;
   }

   public void setConsidIpivLroPprop(String considIpivLroPprop) {
        this.considIpivLroPprop = considIpivLroPprop;
   }

   public BigDecimal getPercPmpf() {
        return percPmpf;
   }

   public void setPercPmpf(BigDecimal percPmpf) {
        this.percPmpf = percPmpf;
   }

   public String getCalcRedPreIcmCon() {
        return calcRedPreIcmCon;
   }

   public void setCalcRedPreIcmCon(String calcRedPreIcmCon) {
        this.calcRedPreIcmCon = calcRedPreIcmCon;
   }

   public String getNaoConsidMva() {
        return naoConsidMva;
   }

   public void setNaoConsidMva(String naoConsidMva) {
        this.naoConsidMva = naoConsidMva;
   }

   public BigDecimal getPercRedPreIcmCon() {
        return percRedPreIcmCon;
   }

   public void setPercRedPreIcmCon(BigDecimal percRedPreIcmCon) {
        this.percRedPreIcmCon = percRedPreIcmCon;
   }

   public BigDecimal getCodTabStFarPop() {
        return codTabStFarPop;
   }

   public void setCodTabStFarPop(BigDecimal codTabStFarPop) {
        this.codTabStFarPop = codTabStFarPop;
   }

   public BigDecimal getCodTabStPmpf() {
        return codTabStPmpf;
   }

   public void setCodTabStPmpf(BigDecimal codTabStPmpf) {
        this.codTabStPmpf = codTabStPmpf;
   }

   public BigDecimal getAliqIcmsCargTribRed() {
        return aliqIcmsCargTribRed;
   }

   public void setAliqIcmsCargTribRed(BigDecimal aliqIcmsCargTribRed) {
        this.aliqIcmsCargTribRed = aliqIcmsCargTribRed;
   }

   public BigDecimal getAliqStCargTribRed() {
        return aliqStCargTribRed;
   }

   public void setAliqStCargTribRed(BigDecimal aliqStCargTribRed) {
        this.aliqStCargTribRed = aliqStCargTribRed;
   }

   public String getCalPerRedBaseIcms() {
        return calPerRedBaseIcms;
   }

   public void setCalPerRedBaseIcms(String calPerRedBaseIcms) {
        this.calPerRedBaseIcms = calPerRedBaseIcms;
   }

   public String getCalPerRedBaseSt() {
        return calPerRedBaseSt;
   }

   public void setCalPerRedBaseSt(String calPerRedBaseSt) {
        this.calPerRedBaseSt = calPerRedBaseSt;
   }

   public BigDecimal getAliqIcmsEspSt() {
        return aliqIcmsEspSt;
   }

   public void setAliqIcmsEspSt(BigDecimal aliqIcmsEspSt) {
        this.aliqIcmsEspSt = aliqIcmsEspSt;
   }

   public BigDecimal getPercUsaquDecpe() {
        return percUsaquDecpe;
   }

   public void setPercUsaquDecpe(BigDecimal percUsaquDecpe) {
        this.percUsaquDecpe = percUsaquDecpe;
   }

   public String getTipCusAquDecpe() {
        return tipCusAquDecpe;
   }

   public void setTipCusAquDecpe(String tipCusAquDecpe) {
        this.tipCusAquDecpe = tipCusAquDecpe;
   }

   public BigDecimal getTipCalcFcpStEspec() {
        return tipCalcFcpStEspec;
   }

   public void setTipCalcFcpStEspec(BigDecimal tipCalcFcpStEspec) {
        this.tipCalcFcpStEspec = tipCalcFcpStEspec;
   }

   public String getCalcRepRedSt() {
        return calcRepRedSt;
   }

   public void setCalcRepRedSt(String calcRepRedSt) {
        this.calcRepRedSt = calcRepRedSt;
   }

   public BigDecimal getCodMotDesoneraSt() {
        return codMotDesoneraSt;
   }

   public void setCodMotDesoneraSt(BigDecimal codMotDesoneraSt) {
        this.codMotDesoneraSt = codMotDesoneraSt;
   }

   public String getCaracTrib() {
        return caracTrib;
   }

   public void setCaracTrib(String caracTrib) {
        this.caracTrib = caracTrib;
   }

   public String getFinalidade() {
        return finalidade;
   }

   public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
   }

   public BigDecimal getAliqIcmsAt() {
        return aliqIcmsAt;
   }

   public void setAliqIcmsAt(BigDecimal aliqIcmsAt) {
        this.aliqIcmsAt = aliqIcmsAt;
   }

   public BigDecimal getAliqIcmsAtImp() {
        return aliqIcmsAtImp;
   }

   public void setAliqIcmsAtImp(BigDecimal aliqIcmsAtImp) {
        this.aliqIcmsAtImp = aliqIcmsAtImp;
   }

   public BigDecimal getAliqIcmsAtInt() {
        return aliqIcmsAtInt;
   }

   public void setAliqIcmsAtInt(BigDecimal aliqIcmsAtInt) {
        this.aliqIcmsAtInt = aliqIcmsAtInt;
   }

   public BigDecimal getCodFormBcIcmsAt() {
        return codFormBcIcmsAt;
   }

   public void setCodFormBcIcmsAt(BigDecimal codFormBcIcmsAt) {
        this.codFormBcIcmsAt = codFormBcIcmsAt;
   }

   public String getRegraCalcBcIcmsAt() {
        return regraCalcBcIcmsAt;
   }

   public void setRegraCalcBcIcmsAt(String regraCalcBcIcmsAt) {
        this.regraCalcBcIcmsAt = regraCalcBcIcmsAt;
   }

   public String getRegraDeIcmsAt() {
        return regraDeIcmsAt;
   }

   public void setRegraDeIcmsAt(String regraDeIcmsAt) {
        this.regraDeIcmsAt = regraDeIcmsAt;
   }

   public BigDecimal getCodFormBasDifAl() {
        return codFormBasDifAl;
   }

   public void setCodFormBasDifAl(BigDecimal codFormBasDifAl) {
        this.codFormBasDifAl = codFormBasDifAl;
   }

   public String getCalcStDecpr() {
        return calcStDecpr;
   }

   public void setCalcStDecpr(String calcStDecpr) {
        this.calcStDecpr = calcStDecpr;
   }

   public BigDecimal getCodFormCalcDifAl() {
        return codFormCalcDifAl;
   }

   public void setCodFormCalcDifAl(BigDecimal codFormCalcDifAl) {
        this.codFormCalcDifAl = codFormCalcDifAl;
   }

   public BigDecimal getCredPresDecpr() {
        return credPresDecpr;
   }

   public void setCredPresDecpr(BigDecimal credPresDecpr) {
        this.credPresDecpr = credPresDecpr;
   }

   public String getDesIcmsSn() {
        return desIcmsSn;
   }

   public void setDesIcmsSn(String desIcmsSn) {
        this.desIcmsSn = desIcmsSn;
   }

   public BigDecimal getFormCalcFcpDifAl() {
        return formCalcFcpDifAl;
   }

   public void setFormCalcFcpDifAl(BigDecimal formCalcFcpDifAl) {
        this.formCalcFcpDifAl = formCalcFcpDifAl;
   }

   public BigDecimal getPercUsaquDecpeEst() {
        return percUsaquDecpeEst;
   }

   public void setPercUsaquDecpeEst(BigDecimal percUsaquDecpeEst) {
        this.percUsaquDecpeEst = percUsaquDecpeEst;
   }

   public BigDecimal getAliqConsFin() {
        return aliqConsFin;
   }

   public void setAliqConsFin(BigDecimal aliqConsFin) {
        this.aliqConsFin = aliqConsFin;
   }

   public String getCodBen() {
        return codBen;
   }

   public void setCodBen(String codBen) {
        this.codBen = codBen;
   }

   public BigDecimal getCodFormVa() {
        return codFormVa;
   }

   public void setCodFormVa(BigDecimal codFormVa) {
        this.codFormVa = codFormVa;
   }

   public BigDecimal getPercRedPr() {
        return percRedPr;
   }

   public void setPercRedPr(BigDecimal percRedPr) {
        this.percRedPr = percRedPr;
   }

   public String getConsPmvAbcIcm() {
        return consPmvAbcIcm;
   }

   public void setConsPmvAbcIcm(String consPmvAbcIcm) {
        this.consPmvAbcIcm = consPmvAbcIcm;
   }

   public String getCalcAliFcpSt() {
        return calcAliFcpSt;
   }

   public void setCalcAliFcpSt(String calcAliFcpSt) {
        this.calcAliFcpSt = calcAliFcpSt;
   }

   public BigDecimal getAliqAdRemIcms() {
        return aliqAdRemIcms;
   }

   public void setAliqAdRemIcms(BigDecimal aliqAdRemIcms) {
        this.aliqAdRemIcms = aliqAdRemIcms;
   }

   public BigDecimal getMotRedAdRem() {
        return motRedAdRem;
   }

   public void setMotRedAdRem(BigDecimal motRedAdRem) {
        this.motRedAdRem = motRedAdRem;
   }

   public BigDecimal getPercAliqAdRemIcms() {
        return percAliqAdRemIcms;
   }

   public void setPercAliqAdRemIcms(BigDecimal percAliqAdRemIcms) {
        this.percAliqAdRemIcms = percAliqAdRemIcms;
   }

   public BigDecimal getPercIcmsMonoRet() {
        return percIcmsMonoRet;
   }

   public void setPercIcmsMonoRet(BigDecimal percIcmsMonoRet) {
        this.percIcmsMonoRet = percIcmsMonoRet;
   }

   @Override
   public String getEntityName() {
        return "AliquotaICMS";
   }

   @Override
   public AliquotaICMS fromVO(DynamicVO vo) {
        this.aliqFrete = vo.asBigDecimal("ALIQFRETE");
        this.aliqSubtrib = vo.asBigDecimal("ALIQSUBTRIB");
        this.aliqUfdest = vo.asBigDecimal("ALIQUFDEST");
        this.aliquota = vo.asBigDecimal("ALIQUOTA");
        this.baseStRed = vo.asString("BASESTRED");
        this.baseStUfdest = vo.asString("BASESTUFDEST");
        this.baseIcmMod = vo.asBigDecimal("BASEICMMOD");
        this.baseIcmStMod = vo.asBigDecimal("BASEICMSTMOD");
        this.calcStExtraNota = vo.asString("CALCSTEXTRANOTA");
        this.codAntecipSt = vo.asString("CODANTECIPST");
        this.codMotDesoneraIcms = vo.asBigDecimal("CODMOTDESONERAICMS");
        this.codObsPadrao = vo.asBigDecimal("CODOBSPADRAO");
        this.codRestricao = vo.asBigDecimal("CODRESTRICAO");
        this.codRestricao2 = vo.asBigDecimal("CODRESTRICAO2");
        this.codTab = vo.asBigDecimal("CODTAB");
        this.codTabIcms = vo.asBigDecimal("CODTABICMS");
        this.codTrib = vo.asBigDecimal("CODTRIB");
        this.convProduz = vo.asString("CONVPRODUZ");
        this.csosn = vo.asBigDecimal("CSOSN");
        this.codTabStAnt = vo.asBigDecimal("CODTABSTANT");
        this.codTabStUfdest = vo.asBigDecimal("CODTABSTUFDEST");
        this.cusComIcmsBaseSt = vo.asString("CUSCOMICMSBASEST");
        this.descrRestricao = vo.asString("DESCRRESTRICAO");
        this.descrRestricao2 = vo.asString("DESCRRESTRICAO2");
        this.maiorBaseIcms = vo.asString("MAIORBASEICMS");
        this.maiorBaseSt = vo.asString("MAIORBASEST");
        this.margLucro = vo.asBigDecimal("MARGLUCRO");
        this.mvaStUfdest = vo.asBigDecimal("MVASTUFDEST");
        this.outOrga = vo.asBigDecimal("OUTORGA");
        this.proEmprego = vo.asString("PROEMPREGO");
        this.redBase = vo.asBigDecimal("REDBASE");
        this.redBaseFrete = vo.asBigDecimal("REDBASEFRETE");
        this.redBaseSt = vo.asBigDecimal("REDBASEST");
        this.redIcms = vo.asString("REDICMS");
        this.repIcms = vo.asString("REPICMS");
        this.repRedBase = vo.asString("REPREDBASE");
        this.repRedBase2 = vo.asString("REPREDBASE2");
        this.tipRestricao = vo.asString("TIPRESTRICAO");
        this.tipRestricao2 = vo.asString("TIPRESTRICAO2");
        this.ufDest = vo.asBigDecimal("UFDEST");
        this.ufOrig = vo.asBigDecimal("UFORIG");
        this.zerar = vo.asString("ZERAR");
        this.zerarStNeg = vo.asString("ZERARSTNEG");
        this.percIcmsFcp = vo.asBigDecimal("PERCICMSFCP");
        this.percMinSubtrib = vo.asBigDecimal("PERCMINSUBTRIB");
        this.idAliq = vo.asBigDecimal("IDALIQ");
        this.tabCfop = vo.asString("TABCFOP");
        this.calcMvaAjustado = vo.asString("CALCMVAAJUSTADO");
        this.aliqIntDest = vo.asBigDecimal("ALIQINTDEST");
        this.calcRepRedDentro = vo.asString("CALCREPREDDENTRO");
        this.codFormBasIcm = vo.asBigDecimal("CODFORMBASICM");
        this.formaRepIcms = vo.asString("FORMAREPICMS");
        this.icmsDifPositiva = vo.asString("ICMSDIFPOSITIVA");
        this.margLucroEst = vo.asBigDecimal("MARGLUCROEST");
        this.percMultCalcDp = vo.asBigDecimal("PERCMULTCALCDP");
        this.percRedBaseIcmsEfet = vo.asBigDecimal("PERCREDBASEICMSEFET");
        this.percTravaMed = vo.asBigDecimal("PERCTRAVAMED");
        this.redBaseEstrangeira = vo.asBigDecimal("REDBASEESTRANGEIRA");
        this.stSutri4302014Mg = vo.asString("STSUTRI4302014MG");
        this.calcDifIcmsDentro = vo.asString("CALCDIFICMSDENTRO");
        this.aliqIcmsEfet = vo.asBigDecimal("ALIQICMSEFET");
        this.baseFcpInt = vo.asString("BASEFCPINT");
        this.aliqEstrangeira = vo.asBigDecimal("ALIQESTRANGEIRA");
        this.desconsideraRedBase = vo.asString("DESCONSIDERAREDBASE");
        this.repPercBaseIcms = vo.asBigDecimal("REPPERCBASEICMS");
        this.repDifAlFcp = vo.asString("REPDIFALFCP");
        this.percIcmsFcpInt = vo.asBigDecimal("PERCICMSFCPINT");
        this.percStFcpInt = vo.asBigDecimal("PERCSTFCPINT");
        this.mvaOriginal = vo.asString("MVAORIGINAL");
        this.zerarDifAlRem = vo.asString("ZERARDIFALREM");
        this.tipCalcStEspec = vo.asBigDecimal("TIPCALCSTESPEC");
        this.pautaVlrStFixo = vo.asString("PAUTAVLRSTFIXO");
        this.aliqIcmsLimiteCalcSt = vo.asBigDecimal("ALIQICMSLIMITECALCST");
        this.calcStLivreCom = vo.asString("CALCSTLIVRECOM");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.icmsUfOrigDifEmit = vo.asString("ICMSUFORIGDIFEMIT");
        this.percCargaTribMedia = vo.asBigDecimal("PERCCARGATRIBMEDIA");
        this.mvaSimplificado = vo.asString("MVASIMPLIFICADO");
        this.tipCalcDifAl = vo.asBigDecimal("TIPCALCDIFAL");
        this.percRedBaseDest = vo.asBigDecimal("PERCREDBASEDEST");
        this.stCat137Sp = vo.asString("STCAT137SP");
        this.calcStConsuTri = vo.asString("CALCSTCONSUTRI");
        this.considIpivLroPprop = vo.asString("CONSIDIPIVLROPPROP");
        this.percPmpf = vo.asBigDecimal("PERCPMPF");
        this.calcRedPreIcmCon = vo.asString("CALCREDPREICMCON");
        this.naoConsidMva = vo.asString("NAOCONSIDMVA");
        this.percRedPreIcmCon = vo.asBigDecimal("PERCREDPREICMCON");
        this.codTabStFarPop = vo.asBigDecimal("CODTABSTFARPOP");
        this.codTabStPmpf = vo.asBigDecimal("CODTABSTPMPF");
        this.aliqIcmsCargTribRed = vo.asBigDecimal("ALIQICMSCARGTRIBRED");
        this.aliqStCargTribRed = vo.asBigDecimal("ALIQSTCARGTRIBRED");
        this.calPerRedBaseIcms = vo.asString("CALPERREDBASEICMS");
        this.calPerRedBaseSt = vo.asString("CALPERREDBASEST");
        this.aliqIcmsEspSt = vo.asBigDecimal("ALIQICMSESPST");
        this.percUsaquDecpe = vo.asBigDecimal("PERCUSAQUDECPE");
        this.tipCusAquDecpe = vo.asString("TIPCUSAQUDECPE");
        this.tipCalcFcpStEspec = vo.asBigDecimal("TIPCALCFCPSTESPEC");
        this.calcRepRedSt = vo.asString("CALCREPREDST");
        this.codMotDesoneraSt = vo.asBigDecimal("CODMOTDESONERAST");
        this.caracTrib = vo.asString("CARACTRIB");
        this.finalidade = vo.asString("FINALIDADE");
        this.aliqIcmsAt = vo.asBigDecimal("ALIQICMSAT");
        this.aliqIcmsAtImp = vo.asBigDecimal("ALIQICMSATIMP");
        this.aliqIcmsAtInt = vo.asBigDecimal("ALIQICMSATINT");
        this.codFormBcIcmsAt = vo.asBigDecimal("CODFORMBCICMSAT");
        this.regraCalcBcIcmsAt = vo.asString("REGRACALCBCICMSAT");
        this.regraDeIcmsAt = vo.asString("REGRADEICMSAT");
        this.codFormBasDifAl = vo.asBigDecimal("CODFORMBASDIFAL");
        this.calcStDecpr = vo.asString("CALCSTDECPR");
        this.codFormCalcDifAl = vo.asBigDecimal("CODFORMCALCDIFAL");
        this.credPresDecpr = vo.asBigDecimal("CREDPRESDECPR");
        this.desIcmsSn = vo.asString("DESICMSSN");
        this.formCalcFcpDifAl = vo.asBigDecimal("FORMCALCFCPDIFAL");
        this.percUsaquDecpeEst = vo.asBigDecimal("PERCUSAQUDECPEEST");
        this.aliqConsFin = vo.asBigDecimal("ALIQCONSFIN");
        this.codBen = vo.asString("CODBEN");
        this.codFormVa = vo.asBigDecimal("CODFORMVA");
        this.percRedPr = vo.asBigDecimal("PERCREDPR");
        this.consPmvAbcIcm = vo.asString("CONSPMVABCICM");
        this.calcAliFcpSt = vo.asString("CALCALIFCPST");
        this.aliqAdRemIcms = vo.asBigDecimal("ALIQADREMICMS");
        this.motRedAdRem = vo.asBigDecimal("MOTREDADREM");
        this.percAliqAdRemIcms = vo.asBigDecimal("PERCALIQADREMICMS");
        this.percIcmsMonoRet = vo.asBigDecimal("PERCICMSMONORET");
        return this;
   }
}
