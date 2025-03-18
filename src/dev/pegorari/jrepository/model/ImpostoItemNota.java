package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImpostoItemNota extends AbstractSankhyaEntity<ImpostoItemNota> {
   private BigDecimal codInc;
   private BigDecimal codLst;
   private String codTribMunIss;
   private BigDecimal codUsu;
   private String comIva;
   private BigDecimal cst;
   private Timestamp dhAlter;
   private String digitado;
   private BigDecimal iva;
   private BigDecimal nuNota;
   private BigDecimal pauta;
   private String percVlr;
   private String retemFin;
   private BigDecimal sequencia;
   private BigDecimal tipo;
   private String tipoDeDiss;
   private BigDecimal valor;
   private BigDecimal vlrCred;
   private BigDecimal vlrRepRed;
   private BigDecimal percRedBase;
   private BigDecimal vlrDifAlDest;
   private BigDecimal vlrFcp;
   private BigDecimal percFcp;
   private BigDecimal percPartDifal;
   private BigDecimal aliqIntDest;
   private BigDecimal vlrDifalRem;
   private BigDecimal baseRed;
   private BigDecimal codImp;
   private BigDecimal aliquota;
   private BigDecimal aliquotaNormal;
   private BigDecimal base;
   private BigDecimal aliqDiferencial;
   private BigDecimal aliquotaEfet;
   private BigDecimal baseNormDifIcms;
   private BigDecimal baseRedEfet;
   private BigDecimal percRedBaseEfet;
   private BigDecimal valorDiferencial;
   private BigDecimal valorEfet;
   private BigDecimal vlrRepRedSemDesc;
   private BigDecimal aliqParaDifal;
   private BigDecimal percInssEspecial;
   private String tipoInssEspecial;
   private BigDecimal vlrIcmsParaDifal;
   private BigDecimal vlrInssEspecial;
   private BigDecimal vlrRepDifalFcp;
   private BigDecimal baseFcp;
   private BigDecimal baseFcpInt;
   private BigDecimal vlrFcpInt;
   private BigDecimal percFcpInt;
   private BigDecimal percRedVlrIpi;
   private BigDecimal aliqDespAcess;
   private BigDecimal baseDifal;
   private BigDecimal tipCalcDifal;
   private BigDecimal aliquotaDeson;
   private BigDecimal valorDeson;
   private BigDecimal tipCalcFcpEspec;
   private BigDecimal codNatRend;
   private BigDecimal tpIrrfExt;
   private String codBen;
   private BigDecimal percRedPr;
   private BigDecimal vlrCredPr;
   private BigDecimal motRedAdRem;
   private BigDecimal percAliqAdRemIcms;
   private BigDecimal vlrIcmsMonoDev;
   private BigDecimal vlrIcmsMonoDif;
   private BigDecimal idAliq;

   public BigDecimal getCodInc() {
        return codInc;
   }

   public void setCodInc(BigDecimal codInc) {
        markAsChanged("CODINC", codInc);
        this.codInc = codInc;
   }

   public BigDecimal getCodLst() {
        return codLst;
   }

   public void setCodLst(BigDecimal codLst) {
        markAsChanged("CODLST", codLst);
        this.codLst = codLst;
   }

   public String getCodTribMunIss() {
        return codTribMunIss;
   }

   public void setCodTribMunIss(String codTribMunIss) {
        markAsChanged("CODTRIBMUNISS", codTribMunIss);
        this.codTribMunIss = codTribMunIss;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getComIva() {
        return comIva;
   }

   public void setComIva(String comIva) {
        markAsChanged("COMIVA", comIva);
        this.comIva = comIva;
   }

   public BigDecimal getCst() {
        return cst;
   }

   public void setCst(BigDecimal cst) {
        markAsChanged("CST", cst);
        this.cst = cst;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
        this.digitado = digitado;
   }

   public BigDecimal getIva() {
        return iva;
   }

   public void setIva(BigDecimal iva) {
        markAsChanged("IVA", iva);
        this.iva = iva;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getPauta() {
        return pauta;
   }

   public void setPauta(BigDecimal pauta) {
        markAsChanged("PAUTA", pauta);
        this.pauta = pauta;
   }

   public String getPercVlr() {
        return percVlr;
   }

   public void setPercVlr(String percVlr) {
        markAsChanged("PERCVLR", percVlr);
        this.percVlr = percVlr;
   }

   public String getRetemFin() {
        return retemFin;
   }

   public void setRetemFin(String retemFin) {
        markAsChanged("RETEMFIN", retemFin);
        this.retemFin = retemFin;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getTipo() {
        return tipo;
   }

   public void setTipo(BigDecimal tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public String getTipoDeDiss() {
        return tipoDeDiss;
   }

   public void setTipoDeDiss(String tipoDeDiss) {
        markAsChanged("TIPODEDISS", tipoDeDiss);
        this.tipoDeDiss = tipoDeDiss;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
        this.valor = valor;
   }

   public BigDecimal getVlrCred() {
        return vlrCred;
   }

   public void setVlrCred(BigDecimal vlrCred) {
        markAsChanged("VLRCRED", vlrCred);
        this.vlrCred = vlrCred;
   }

   public BigDecimal getVlrRepRed() {
        return vlrRepRed;
   }

   public void setVlrRepRed(BigDecimal vlrRepRed) {
        markAsChanged("VLRREPRED", vlrRepRed);
        this.vlrRepRed = vlrRepRed;
   }

   public BigDecimal getPercRedBase() {
        return percRedBase;
   }

   public void setPercRedBase(BigDecimal percRedBase) {
        markAsChanged("PERCREDBASE", percRedBase);
        this.percRedBase = percRedBase;
   }

   public BigDecimal getVlrDifAlDest() {
        return vlrDifAlDest;
   }

   public void setVlrDifAlDest(BigDecimal vlrDifAlDest) {
        markAsChanged("VLRDIFALDEST", vlrDifAlDest);
        this.vlrDifAlDest = vlrDifAlDest;
   }

   public BigDecimal getVlrFcp() {
        return vlrFcp;
   }

   public void setVlrFcp(BigDecimal vlrFcp) {
        markAsChanged("VLRFCP", vlrFcp);
        this.vlrFcp = vlrFcp;
   }

   public BigDecimal getPercFcp() {
        return percFcp;
   }

   public void setPercFcp(BigDecimal percFcp) {
        markAsChanged("PERCFCP", percFcp);
        this.percFcp = percFcp;
   }

   public BigDecimal getPercPartDifal() {
        return percPartDifal;
   }

   public void setPercPartDifal(BigDecimal percPartDifal) {
        markAsChanged("PERCPARTDIFAL", percPartDifal);
        this.percPartDifal = percPartDifal;
   }

   public BigDecimal getAliqIntDest() {
        return aliqIntDest;
   }

   public void setAliqIntDest(BigDecimal aliqIntDest) {
        markAsChanged("ALIQINTDEST", aliqIntDest);
        this.aliqIntDest = aliqIntDest;
   }

   public BigDecimal getVlrDifalRem() {
        return vlrDifalRem;
   }

   public void setVlrDifalRem(BigDecimal vlrDifalRem) {
        markAsChanged("VLRDIFALREM", vlrDifalRem);
        this.vlrDifalRem = vlrDifalRem;
   }

   public BigDecimal getBaseRed() {
        return baseRed;
   }

   public void setBaseRed(BigDecimal baseRed) {
        markAsChanged("BASERED", baseRed);
        this.baseRed = baseRed;
   }

   public BigDecimal getCodImp() {
        return codImp;
   }

   public void setCodImp(BigDecimal codImp) {
        markAsChanged("CODIMP", codImp);
        this.codImp = codImp;
   }

   public BigDecimal getAliquota() {
        return aliquota;
   }

   public void setAliquota(BigDecimal aliquota) {
        markAsChanged("ALIQUOTA", aliquota);
        this.aliquota = aliquota;
   }

   public BigDecimal getAliquotaNormal() {
        return aliquotaNormal;
   }

   public void setAliquotaNormal(BigDecimal aliquotaNormal) {
        markAsChanged("ALIQUOTANORMAL", aliquotaNormal);
        this.aliquotaNormal = aliquotaNormal;
   }

   public BigDecimal getBase() {
        return base;
   }

   public void setBase(BigDecimal base) {
        markAsChanged("BASE", base);
        this.base = base;
   }

   public BigDecimal getAliqDiferencial() {
        return aliqDiferencial;
   }

   public void setAliqDiferencial(BigDecimal aliqDiferencial) {
        markAsChanged("ALIQDIFERENCIAL", aliqDiferencial);
        this.aliqDiferencial = aliqDiferencial;
   }

   public BigDecimal getAliquotaEfet() {
        return aliquotaEfet;
   }

   public void setAliquotaEfet(BigDecimal aliquotaEfet) {
        markAsChanged("ALIQUOTAEFET", aliquotaEfet);
        this.aliquotaEfet = aliquotaEfet;
   }

   public BigDecimal getBaseNormDifIcms() {
        return baseNormDifIcms;
   }

   public void setBaseNormDifIcms(BigDecimal baseNormDifIcms) {
        markAsChanged("BASENORMDIFICMS", baseNormDifIcms);
        this.baseNormDifIcms = baseNormDifIcms;
   }

   public BigDecimal getBaseRedEfet() {
        return baseRedEfet;
   }

   public void setBaseRedEfet(BigDecimal baseRedEfet) {
        markAsChanged("BASEREDEFET", baseRedEfet);
        this.baseRedEfet = baseRedEfet;
   }

   public BigDecimal getPercRedBaseEfet() {
        return percRedBaseEfet;
   }

   public void setPercRedBaseEfet(BigDecimal percRedBaseEfet) {
        markAsChanged("PERCREDBASEEFET", percRedBaseEfet);
        this.percRedBaseEfet = percRedBaseEfet;
   }

   public BigDecimal getValorDiferencial() {
        return valorDiferencial;
   }

   public void setValorDiferencial(BigDecimal valorDiferencial) {
        markAsChanged("VALORDIFERENCIAL", valorDiferencial);
        this.valorDiferencial = valorDiferencial;
   }

   public BigDecimal getValorEfet() {
        return valorEfet;
   }

   public void setValorEfet(BigDecimal valorEfet) {
        markAsChanged("VALOREFET", valorEfet);
        this.valorEfet = valorEfet;
   }

   public BigDecimal getVlrRepRedSemDesc() {
        return vlrRepRedSemDesc;
   }

   public void setVlrRepRedSemDesc(BigDecimal vlrRepRedSemDesc) {
        markAsChanged("VLRREPREDSEMDESC", vlrRepRedSemDesc);
        this.vlrRepRedSemDesc = vlrRepRedSemDesc;
   }

   public BigDecimal getAliqParaDifal() {
        return aliqParaDifal;
   }

   public void setAliqParaDifal(BigDecimal aliqParaDifal) {
        markAsChanged("ALIQPARADIFAL", aliqParaDifal);
        this.aliqParaDifal = aliqParaDifal;
   }

   public BigDecimal getPercInssEspecial() {
        return percInssEspecial;
   }

   public void setPercInssEspecial(BigDecimal percInssEspecial) {
        markAsChanged("PERCINSSESPECIAL", percInssEspecial);
        this.percInssEspecial = percInssEspecial;
   }

   public String getTipoInssEspecial() {
        return tipoInssEspecial;
   }

   public void setTipoInssEspecial(String tipoInssEspecial) {
        markAsChanged("TIPOINSSESPECIAL", tipoInssEspecial);
        this.tipoInssEspecial = tipoInssEspecial;
   }

   public BigDecimal getVlrIcmsParaDifal() {
        return vlrIcmsParaDifal;
   }

   public void setVlrIcmsParaDifal(BigDecimal vlrIcmsParaDifal) {
        markAsChanged("VLRICMSPARADIFAL", vlrIcmsParaDifal);
        this.vlrIcmsParaDifal = vlrIcmsParaDifal;
   }

   public BigDecimal getVlrInssEspecial() {
        return vlrInssEspecial;
   }

   public void setVlrInssEspecial(BigDecimal vlrInssEspecial) {
        markAsChanged("VLRINSSESPECIAL", vlrInssEspecial);
        this.vlrInssEspecial = vlrInssEspecial;
   }

   public BigDecimal getVlrRepDifalFcp() {
        return vlrRepDifalFcp;
   }

   public void setVlrRepDifalFcp(BigDecimal vlrRepDifalFcp) {
        markAsChanged("VLRREPDIFALFCP", vlrRepDifalFcp);
        this.vlrRepDifalFcp = vlrRepDifalFcp;
   }

   public BigDecimal getBaseFcp() {
        return baseFcp;
   }

   public void setBaseFcp(BigDecimal baseFcp) {
        markAsChanged("BASEFCP", baseFcp);
        this.baseFcp = baseFcp;
   }

   public BigDecimal getBaseFcpInt() {
        return baseFcpInt;
   }

   public void setBaseFcpInt(BigDecimal baseFcpInt) {
        markAsChanged("BASEFCPINT", baseFcpInt);
        this.baseFcpInt = baseFcpInt;
   }

   public BigDecimal getVlrFcpInt() {
        return vlrFcpInt;
   }

   public void setVlrFcpInt(BigDecimal vlrFcpInt) {
        markAsChanged("VLRFCPINT", vlrFcpInt);
        this.vlrFcpInt = vlrFcpInt;
   }

   public BigDecimal getPercFcpInt() {
        return percFcpInt;
   }

   public void setPercFcpInt(BigDecimal percFcpInt) {
        markAsChanged("PERCFCPINT", percFcpInt);
        this.percFcpInt = percFcpInt;
   }

   public BigDecimal getPercRedVlrIpi() {
        return percRedVlrIpi;
   }

   public void setPercRedVlrIpi(BigDecimal percRedVlrIpi) {
        markAsChanged("PERCREDVLRIPI", percRedVlrIpi);
        this.percRedVlrIpi = percRedVlrIpi;
   }

   public BigDecimal getAliqDespAcess() {
        return aliqDespAcess;
   }

   public void setAliqDespAcess(BigDecimal aliqDespAcess) {
        markAsChanged("ALIQDESPACESS", aliqDespAcess);
        this.aliqDespAcess = aliqDespAcess;
   }

   public BigDecimal getBaseDifal() {
        return baseDifal;
   }

   public void setBaseDifal(BigDecimal baseDifal) {
        markAsChanged("BASEDIFAL", baseDifal);
        this.baseDifal = baseDifal;
   }

   public BigDecimal getTipCalcDifal() {
        return tipCalcDifal;
   }

   public void setTipCalcDifal(BigDecimal tipCalcDifal) {
        markAsChanged("TIPCALCDIFAL", tipCalcDifal);
        this.tipCalcDifal = tipCalcDifal;
   }

   public BigDecimal getAliquotaDeson() {
        return aliquotaDeson;
   }

   public void setAliquotaDeson(BigDecimal aliquotaDeson) {
        markAsChanged("ALIQUOTADESON", aliquotaDeson);
        this.aliquotaDeson = aliquotaDeson;
   }

   public BigDecimal getValorDeson() {
        return valorDeson;
   }

   public void setValorDeson(BigDecimal valorDeson) {
        markAsChanged("VALORDESON", valorDeson);
        this.valorDeson = valorDeson;
   }

   public BigDecimal getTipCalcFcpEspec() {
        return tipCalcFcpEspec;
   }

   public void setTipCalcFcpEspec(BigDecimal tipCalcFcpEspec) {
        markAsChanged("TIPCALCFCPESPEC", tipCalcFcpEspec);
        this.tipCalcFcpEspec = tipCalcFcpEspec;
   }

   public BigDecimal getCodNatRend() {
        return codNatRend;
   }

   public void setCodNatRend(BigDecimal codNatRend) {
        markAsChanged("CODNATREND", codNatRend);
        this.codNatRend = codNatRend;
   }

   public BigDecimal getTpIrrfExt() {
        return tpIrrfExt;
   }

   public void setTpIrrfExt(BigDecimal tpIrrfExt) {
        markAsChanged("TPIRRFEXT", tpIrrfExt);
        this.tpIrrfExt = tpIrrfExt;
   }

   public String getCodBen() {
        return codBen;
   }

   public void setCodBen(String codBen) {
        markAsChanged("CODBEN", codBen);
        this.codBen = codBen;
   }

   public BigDecimal getPercRedPr() {
        return percRedPr;
   }

   public void setPercRedPr(BigDecimal percRedPr) {
        markAsChanged("PERCREDPR", percRedPr);
        this.percRedPr = percRedPr;
   }

   public BigDecimal getVlrCredPr() {
        return vlrCredPr;
   }

   public void setVlrCredPr(BigDecimal vlrCredPr) {
        markAsChanged("VLRCREDPR", vlrCredPr);
        this.vlrCredPr = vlrCredPr;
   }

   public BigDecimal getMotRedAdRem() {
        return motRedAdRem;
   }

   public void setMotRedAdRem(BigDecimal motRedAdRem) {
        markAsChanged("MOTREDADREM", motRedAdRem);
        this.motRedAdRem = motRedAdRem;
   }

   public BigDecimal getPercAliqAdRemIcms() {
        return percAliqAdRemIcms;
   }

   public void setPercAliqAdRemIcms(BigDecimal percAliqAdRemIcms) {
        markAsChanged("PERCALIQADREMICMS", percAliqAdRemIcms);
        this.percAliqAdRemIcms = percAliqAdRemIcms;
   }

   public BigDecimal getVlrIcmsMonoDev() {
        return vlrIcmsMonoDev;
   }

   public void setVlrIcmsMonoDev(BigDecimal vlrIcmsMonoDev) {
        markAsChanged("VLRICMSMONODEV", vlrIcmsMonoDev);
        this.vlrIcmsMonoDev = vlrIcmsMonoDev;
   }

   public BigDecimal getVlrIcmsMonoDif() {
        return vlrIcmsMonoDif;
   }

   public void setVlrIcmsMonoDif(BigDecimal vlrIcmsMonoDif) {
        markAsChanged("VLRICMSMONODIF", vlrIcmsMonoDif);
        this.vlrIcmsMonoDif = vlrIcmsMonoDif;
   }

   public BigDecimal getIdAliq() {
        return idAliq;
   }

   public void setIdAliq(BigDecimal idAliq) {
        markAsChanged("IDALIQ", idAliq);
        this.idAliq = idAliq;
   }

   @Override
   public String getTableName() {
        return "TGFDIN";
   }

   @Override
   public String getEntityName() {
        return "ImpostoItemNota";
   }

   @Override
   public ImpostoItemNota fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codInc = vo.asBigDecimal("CODINC");
        this.codLst = vo.asBigDecimal("CODLST");
        this.codTribMunIss = vo.asString("CODTRIBMUNISS");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.comIva = vo.asString("COMIVA");
        this.cst = vo.asBigDecimal("CST");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.digitado = vo.asString("DIGITADO");
        this.iva = vo.asBigDecimal("IVA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.pauta = vo.asBigDecimal("PAUTA");
        this.percVlr = vo.asString("PERCVLR");
        this.retemFin = vo.asString("RETEMFIN");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipo = vo.asBigDecimal("TIPO");
        this.tipoDeDiss = vo.asString("TIPODEDISS");
        this.valor = vo.asBigDecimal("VALOR");
        this.vlrCred = vo.asBigDecimal("VLRCRED");
        this.vlrRepRed = vo.asBigDecimal("VLRREPRED");
        this.percRedBase = vo.asBigDecimal("PERCREDBASE");
        this.vlrDifAlDest = vo.asBigDecimal("VLRDIFALDEST");
        this.vlrFcp = vo.asBigDecimal("VLRFCP");
        this.percFcp = vo.asBigDecimal("PERCFCP");
        this.percPartDifal = vo.asBigDecimal("PERCPARTDIFAL");
        this.aliqIntDest = vo.asBigDecimal("ALIQINTDEST");
        this.vlrDifalRem = vo.asBigDecimal("VLRDIFALREM");
        this.baseRed = vo.asBigDecimal("BASERED");
        this.codImp = vo.asBigDecimal("CODIMP");
        this.aliquota = vo.asBigDecimal("ALIQUOTA");
        this.aliquotaNormal = vo.asBigDecimal("ALIQUOTANORMAL");
        this.base = vo.asBigDecimal("BASE");
        this.aliqDiferencial = vo.asBigDecimal("ALIQDIFERENCIAL");
        this.aliquotaEfet = vo.asBigDecimal("ALIQUOTAEFET");
        this.baseNormDifIcms = vo.asBigDecimal("BASENORMDIFICMS");
        this.baseRedEfet = vo.asBigDecimal("BASEREDEFET");
        this.percRedBaseEfet = vo.asBigDecimal("PERCREDBASEEFET");
        this.valorDiferencial = vo.asBigDecimal("VALORDIFERENCIAL");
        this.valorEfet = vo.asBigDecimal("VALOREFET");
        this.vlrRepRedSemDesc = vo.asBigDecimal("VLRREPREDSEMDESC");
        this.aliqParaDifal = vo.asBigDecimal("ALIQPARADIFAL");
        this.percInssEspecial = vo.asBigDecimal("PERCINSSESPECIAL");
        this.tipoInssEspecial = vo.asString("TIPOINSSESPECIAL");
        this.vlrIcmsParaDifal = vo.asBigDecimal("VLRICMSPARADIFAL");
        this.vlrInssEspecial = vo.asBigDecimal("VLRINSSESPECIAL");
        this.vlrRepDifalFcp = vo.asBigDecimal("VLRREPDIFALFCP");
        this.baseFcp = vo.asBigDecimal("BASEFCP");
        this.baseFcpInt = vo.asBigDecimal("BASEFCPINT");
        this.vlrFcpInt = vo.asBigDecimal("VLRFCPINT");
        this.percFcpInt = vo.asBigDecimal("PERCFCPINT");
        this.percRedVlrIpi = vo.asBigDecimal("PERCREDVLRIPI");
        this.aliqDespAcess = vo.asBigDecimal("ALIQDESPACESS");
        this.baseDifal = vo.asBigDecimal("BASEDIFAL");
        this.tipCalcDifal = vo.asBigDecimal("TIPCALCDIFAL");
        this.aliquotaDeson = vo.asBigDecimal("ALIQUOTADESON");
        this.valorDeson = vo.asBigDecimal("VALORDESON");
        this.tipCalcFcpEspec = vo.asBigDecimal("TIPCALCFCPESPEC");
        this.codNatRend = vo.asBigDecimal("CODNATREND");
        this.tpIrrfExt = vo.asBigDecimal("TPIRRFEXT");
        this.codBen = vo.asString("CODBEN");
        this.percRedPr = vo.asBigDecimal("PERCREDPR");
        this.vlrCredPr = vo.asBigDecimal("VLRCREDPR");
        this.motRedAdRem = vo.asBigDecimal("MOTREDADREM");
        this.percAliqAdRemIcms = vo.asBigDecimal("PERCALIQADREMICMS");
        this.vlrIcmsMonoDev = vo.asBigDecimal("VLRICMSMONODEV");
        this.vlrIcmsMonoDif = vo.asBigDecimal("VLRICMSMONODIF");
        this.idAliq = vo.asBigDecimal("IDALIQ");
        return this;
   }
}
