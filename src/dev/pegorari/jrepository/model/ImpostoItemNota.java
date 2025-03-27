package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImpostoItemNota extends AbstractSankhyaEntity<ImpostoItemNota> {
   public BigDecimal getCodInc() {
        return this.getVo().asBigDecimal("CODINC");
   }

   public void setCodInc(BigDecimal codInc) {
        markAsChanged("CODINC", codInc);
   }

   public BigDecimal getCodLst() {
        return this.getVo().asBigDecimal("CODLST");
   }

   public void setCodLst(BigDecimal codLst) {
        markAsChanged("CODLST", codLst);
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

   public String getComIva() {
        return this.getVo().asString("COMIVA");
   }

   public void setComIva(String comIva) {
        markAsChanged("COMIVA", comIva);
   }

   public BigDecimal getCst() {
        return this.getVo().asBigDecimal("CST");
   }

   public void setCst(BigDecimal cst) {
        markAsChanged("CST", cst);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public BigDecimal getIva() {
        return this.getVo().asBigDecimal("IVA");
   }

   public void setIva(BigDecimal iva) {
        markAsChanged("IVA", iva);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getPauta() {
        return this.getVo().asBigDecimal("PAUTA");
   }

   public void setPauta(BigDecimal pauta) {
        markAsChanged("PAUTA", pauta);
   }

   public String getPercVlr() {
        return this.getVo().asString("PERCVLR");
   }

   public void setPercVlr(String percVlr) {
        markAsChanged("PERCVLR", percVlr);
   }

   public String getRetemFin() {
        return this.getVo().asString("RETEMFIN");
   }

   public void setRetemFin(String retemFin) {
        markAsChanged("RETEMFIN", retemFin);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getTipo() {
        return this.getVo().asBigDecimal("TIPO");
   }

   public void setTipo(BigDecimal tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getTipoDeDiss() {
        return this.getVo().asString("TIPODEDISS");
   }

   public void setTipoDeDiss(String tipoDeDiss) {
        markAsChanged("TIPODEDISS", tipoDeDiss);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
   }

   public BigDecimal getVlrCred() {
        return this.getVo().asBigDecimal("VLRCRED");
   }

   public void setVlrCred(BigDecimal vlrCred) {
        markAsChanged("VLRCRED", vlrCred);
   }

   public BigDecimal getVlrRepRed() {
        return this.getVo().asBigDecimal("VLRREPRED");
   }

   public void setVlrRepRed(BigDecimal vlrRepRed) {
        markAsChanged("VLRREPRED", vlrRepRed);
   }

   public BigDecimal getPercRedBase() {
        return this.getVo().asBigDecimal("PERCREDBASE");
   }

   public void setPercRedBase(BigDecimal percRedBase) {
        markAsChanged("PERCREDBASE", percRedBase);
   }

   public BigDecimal getVlrDifAlDest() {
        return this.getVo().asBigDecimal("VLRDIFALDEST");
   }

   public void setVlrDifAlDest(BigDecimal vlrDifAlDest) {
        markAsChanged("VLRDIFALDEST", vlrDifAlDest);
   }

   public BigDecimal getVlrFcp() {
        return this.getVo().asBigDecimal("VLRFCP");
   }

   public void setVlrFcp(BigDecimal vlrFcp) {
        markAsChanged("VLRFCP", vlrFcp);
   }

   public BigDecimal getPercFcp() {
        return this.getVo().asBigDecimal("PERCFCP");
   }

   public void setPercFcp(BigDecimal percFcp) {
        markAsChanged("PERCFCP", percFcp);
   }

   public BigDecimal getPercPartDifal() {
        return this.getVo().asBigDecimal("PERCPARTDIFAL");
   }

   public void setPercPartDifal(BigDecimal percPartDifal) {
        markAsChanged("PERCPARTDIFAL", percPartDifal);
   }

   public BigDecimal getAliqIntDest() {
        return this.getVo().asBigDecimal("ALIQINTDEST");
   }

   public void setAliqIntDest(BigDecimal aliqIntDest) {
        markAsChanged("ALIQINTDEST", aliqIntDest);
   }

   public BigDecimal getVlrDifalRem() {
        return this.getVo().asBigDecimal("VLRDIFALREM");
   }

   public void setVlrDifalRem(BigDecimal vlrDifalRem) {
        markAsChanged("VLRDIFALREM", vlrDifalRem);
   }

   public BigDecimal getBaseRed() {
        return this.getVo().asBigDecimal("BASERED");
   }

   public void setBaseRed(BigDecimal baseRed) {
        markAsChanged("BASERED", baseRed);
   }

   public BigDecimal getCodImp() {
        return this.getVo().asBigDecimal("CODIMP");
   }

   public void setCodImp(BigDecimal codImp) {
        markAsChanged("CODIMP", codImp);
   }

   public BigDecimal getAliquota() {
        return this.getVo().asBigDecimal("ALIQUOTA");
   }

   public void setAliquota(BigDecimal aliquota) {
        markAsChanged("ALIQUOTA", aliquota);
   }

   public BigDecimal getAliquotaNormal() {
        return this.getVo().asBigDecimal("ALIQUOTANORMAL");
   }

   public void setAliquotaNormal(BigDecimal aliquotaNormal) {
        markAsChanged("ALIQUOTANORMAL", aliquotaNormal);
   }

   public BigDecimal getBase() {
        return this.getVo().asBigDecimal("BASE");
   }

   public void setBase(BigDecimal base) {
        markAsChanged("BASE", base);
   }

   public BigDecimal getAliqDiferencial() {
        return this.getVo().asBigDecimal("ALIQDIFERENCIAL");
   }

   public void setAliqDiferencial(BigDecimal aliqDiferencial) {
        markAsChanged("ALIQDIFERENCIAL", aliqDiferencial);
   }

   public BigDecimal getAliquotaEfet() {
        return this.getVo().asBigDecimal("ALIQUOTAEFET");
   }

   public void setAliquotaEfet(BigDecimal aliquotaEfet) {
        markAsChanged("ALIQUOTAEFET", aliquotaEfet);
   }

   public BigDecimal getBaseNormDifIcms() {
        return this.getVo().asBigDecimal("BASENORMDIFICMS");
   }

   public void setBaseNormDifIcms(BigDecimal baseNormDifIcms) {
        markAsChanged("BASENORMDIFICMS", baseNormDifIcms);
   }

   public BigDecimal getBaseRedEfet() {
        return this.getVo().asBigDecimal("BASEREDEFET");
   }

   public void setBaseRedEfet(BigDecimal baseRedEfet) {
        markAsChanged("BASEREDEFET", baseRedEfet);
   }

   public BigDecimal getPercRedBaseEfet() {
        return this.getVo().asBigDecimal("PERCREDBASEEFET");
   }

   public void setPercRedBaseEfet(BigDecimal percRedBaseEfet) {
        markAsChanged("PERCREDBASEEFET", percRedBaseEfet);
   }

   public BigDecimal getValorDiferencial() {
        return this.getVo().asBigDecimal("VALORDIFERENCIAL");
   }

   public void setValorDiferencial(BigDecimal valorDiferencial) {
        markAsChanged("VALORDIFERENCIAL", valorDiferencial);
   }

   public BigDecimal getValorEfet() {
        return this.getVo().asBigDecimal("VALOREFET");
   }

   public void setValorEfet(BigDecimal valorEfet) {
        markAsChanged("VALOREFET", valorEfet);
   }

   public BigDecimal getVlrRepRedSemDesc() {
        return this.getVo().asBigDecimal("VLRREPREDSEMDESC");
   }

   public void setVlrRepRedSemDesc(BigDecimal vlrRepRedSemDesc) {
        markAsChanged("VLRREPREDSEMDESC", vlrRepRedSemDesc);
   }

   public BigDecimal getAliqParaDifal() {
        return this.getVo().asBigDecimal("ALIQPARADIFAL");
   }

   public void setAliqParaDifal(BigDecimal aliqParaDifal) {
        markAsChanged("ALIQPARADIFAL", aliqParaDifal);
   }

   public BigDecimal getPercInssEspecial() {
        return this.getVo().asBigDecimal("PERCINSSESPECIAL");
   }

   public void setPercInssEspecial(BigDecimal percInssEspecial) {
        markAsChanged("PERCINSSESPECIAL", percInssEspecial);
   }

   public String getTipoInssEspecial() {
        return this.getVo().asString("TIPOINSSESPECIAL");
   }

   public void setTipoInssEspecial(String tipoInssEspecial) {
        markAsChanged("TIPOINSSESPECIAL", tipoInssEspecial);
   }

   public BigDecimal getVlrIcmsParaDifal() {
        return this.getVo().asBigDecimal("VLRICMSPARADIFAL");
   }

   public void setVlrIcmsParaDifal(BigDecimal vlrIcmsParaDifal) {
        markAsChanged("VLRICMSPARADIFAL", vlrIcmsParaDifal);
   }

   public BigDecimal getVlrInssEspecial() {
        return this.getVo().asBigDecimal("VLRINSSESPECIAL");
   }

   public void setVlrInssEspecial(BigDecimal vlrInssEspecial) {
        markAsChanged("VLRINSSESPECIAL", vlrInssEspecial);
   }

   public BigDecimal getVlrRepDifalFcp() {
        return this.getVo().asBigDecimal("VLRREPDIFALFCP");
   }

   public void setVlrRepDifalFcp(BigDecimal vlrRepDifalFcp) {
        markAsChanged("VLRREPDIFALFCP", vlrRepDifalFcp);
   }

   public BigDecimal getBaseFcp() {
        return this.getVo().asBigDecimal("BASEFCP");
   }

   public void setBaseFcp(BigDecimal baseFcp) {
        markAsChanged("BASEFCP", baseFcp);
   }

   public BigDecimal getBaseFcpInt() {
        return this.getVo().asBigDecimal("BASEFCPINT");
   }

   public void setBaseFcpInt(BigDecimal baseFcpInt) {
        markAsChanged("BASEFCPINT", baseFcpInt);
   }

   public BigDecimal getVlrFcpInt() {
        return this.getVo().asBigDecimal("VLRFCPINT");
   }

   public void setVlrFcpInt(BigDecimal vlrFcpInt) {
        markAsChanged("VLRFCPINT", vlrFcpInt);
   }

   public BigDecimal getPercFcpInt() {
        return this.getVo().asBigDecimal("PERCFCPINT");
   }

   public void setPercFcpInt(BigDecimal percFcpInt) {
        markAsChanged("PERCFCPINT", percFcpInt);
   }

   public BigDecimal getPercRedVlrIpi() {
        return this.getVo().asBigDecimal("PERCREDVLRIPI");
   }

   public void setPercRedVlrIpi(BigDecimal percRedVlrIpi) {
        markAsChanged("PERCREDVLRIPI", percRedVlrIpi);
   }

   public BigDecimal getAliqDespAcess() {
        return this.getVo().asBigDecimal("ALIQDESPACESS");
   }

   public void setAliqDespAcess(BigDecimal aliqDespAcess) {
        markAsChanged("ALIQDESPACESS", aliqDespAcess);
   }

   public BigDecimal getBaseDifal() {
        return this.getVo().asBigDecimal("BASEDIFAL");
   }

   public void setBaseDifal(BigDecimal baseDifal) {
        markAsChanged("BASEDIFAL", baseDifal);
   }

   public BigDecimal getTipCalcDifal() {
        return this.getVo().asBigDecimal("TIPCALCDIFAL");
   }

   public void setTipCalcDifal(BigDecimal tipCalcDifal) {
        markAsChanged("TIPCALCDIFAL", tipCalcDifal);
   }

   public BigDecimal getAliquotaDeson() {
        return this.getVo().asBigDecimal("ALIQUOTADESON");
   }

   public void setAliquotaDeson(BigDecimal aliquotaDeson) {
        markAsChanged("ALIQUOTADESON", aliquotaDeson);
   }

   public BigDecimal getValorDeson() {
        return this.getVo().asBigDecimal("VALORDESON");
   }

   public void setValorDeson(BigDecimal valorDeson) {
        markAsChanged("VALORDESON", valorDeson);
   }

   public BigDecimal getTipCalcFcpEspec() {
        return this.getVo().asBigDecimal("TIPCALCFCPESPEC");
   }

   public void setTipCalcFcpEspec(BigDecimal tipCalcFcpEspec) {
        markAsChanged("TIPCALCFCPESPEC", tipCalcFcpEspec);
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

   public String getCodBen() {
        return this.getVo().asString("CODBEN");
   }

   public void setCodBen(String codBen) {
        markAsChanged("CODBEN", codBen);
   }

   public BigDecimal getPercRedPr() {
        return this.getVo().asBigDecimal("PERCREDPR");
   }

   public void setPercRedPr(BigDecimal percRedPr) {
        markAsChanged("PERCREDPR", percRedPr);
   }

   public BigDecimal getVlrCredPr() {
        return this.getVo().asBigDecimal("VLRCREDPR");
   }

   public void setVlrCredPr(BigDecimal vlrCredPr) {
        markAsChanged("VLRCREDPR", vlrCredPr);
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

   public BigDecimal getVlrIcmsMonoDev() {
        return this.getVo().asBigDecimal("VLRICMSMONODEV");
   }

   public void setVlrIcmsMonoDev(BigDecimal vlrIcmsMonoDev) {
        markAsChanged("VLRICMSMONODEV", vlrIcmsMonoDev);
   }

   public BigDecimal getVlrIcmsMonoDif() {
        return this.getVo().asBigDecimal("VLRICMSMONODIF");
   }

   public void setVlrIcmsMonoDif(BigDecimal vlrIcmsMonoDif) {
        markAsChanged("VLRICMSMONODIF", vlrIcmsMonoDif);
   }

   public BigDecimal getIdAliq() {
        return this.getVo().asBigDecimal("IDALIQ");
   }

   public void setIdAliq(BigDecimal idAliq) {
        markAsChanged("IDALIQ", idAliq);
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
        this.setVo(vo);
        return this;
   }
}
