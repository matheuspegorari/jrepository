package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EmpresaProdutoImpostos extends AbstractSankhyaEntity<EmpresaProdutoImpostos> {
   private String usaLoteDtFab;
   private String usaLoteDtVal;
   private BigDecimal estMin;
   private String tipContEst;
   private BigDecimal estMax;
   private String localizacao;
   private BigDecimal aliqIcmsIntEfd;
   private BigDecimal codEmp;
   private BigDecimal codIcmsFast;
   private BigDecimal codProd;
   private String codProdRoi;
   private BigDecimal descMax;
   private BigDecimal grupoIcms;
   private BigDecimal leadTime;
   private String origProd;
   private String temIcms;
   private String tipSubst;
   private String usaIdPalete;
   private String usoProd;
   private BigDecimal cstIpiEnt;
   private BigDecimal cstIpiSai;
   private String temIpiCompra;
   private String temIpiVenda;
   private BigDecimal codEnqIpiSai;
   private BigDecimal codEnqIpiEnt;
   private BigDecimal aliqGeral;
   private BigDecimal grupoIcms2;
   private BigDecimal codLocalPad;
   private BigDecimal codEspecSt;
   private BigDecimal mvaPadrao;
   private String cat1799SpRes;
   private String codFci;
   private BigDecimal percRedBaseIcmsEfet;
   private String rastStUltEntrada;
   private String tipoItemSped;
   private BigDecimal percCmtNac;
   private BigDecimal percCmtEst;
   private BigDecimal percCmtFed;
   private BigDecimal percCmtImp;
   private String calcDifAl;
   private BigDecimal codCtaCtbEfd;
   private String temRastroLote;
   private BigDecimal vlrComerc;
   private BigDecimal vlrParcImpExt;
   private String obtStAntMedEnt;
   private char[] gradePadrao;
   private BigDecimal idGrade;
   private BigDecimal enqReIntegra;

   public String getUsaLoteDtFab() {
        return usaLoteDtFab;
   }

   public void setUsaLoteDtFab(String usaLoteDtFab) {
        this.usaLoteDtFab = usaLoteDtFab;
   }

   public String getUsaLoteDtVal() {
        return usaLoteDtVal;
   }

   public void setUsaLoteDtVal(String usaLoteDtVal) {
        this.usaLoteDtVal = usaLoteDtVal;
   }

   public BigDecimal getEstMin() {
        return estMin;
   }

   public void setEstMin(BigDecimal estMin) {
        this.estMin = estMin;
   }

   public String getTipContEst() {
        return tipContEst;
   }

   public void setTipContEst(String tipContEst) {
        this.tipContEst = tipContEst;
   }

   public BigDecimal getEstMax() {
        return estMax;
   }

   public void setEstMax(BigDecimal estMax) {
        this.estMax = estMax;
   }

   public String getLocalizacao() {
        return localizacao;
   }

   public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
   }

   public BigDecimal getAliqIcmsIntEfd() {
        return aliqIcmsIntEfd;
   }

   public void setAliqIcmsIntEfd(BigDecimal aliqIcmsIntEfd) {
        this.aliqIcmsIntEfd = aliqIcmsIntEfd;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodIcmsFast() {
        return codIcmsFast;
   }

   public void setCodIcmsFast(BigDecimal codIcmsFast) {
        this.codIcmsFast = codIcmsFast;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getCodProdRoi() {
        return codProdRoi;
   }

   public void setCodProdRoi(String codProdRoi) {
        this.codProdRoi = codProdRoi;
   }

   public BigDecimal getDescMax() {
        return descMax;
   }

   public void setDescMax(BigDecimal descMax) {
        this.descMax = descMax;
   }

   public BigDecimal getGrupoIcms() {
        return grupoIcms;
   }

   public void setGrupoIcms(BigDecimal grupoIcms) {
        this.grupoIcms = grupoIcms;
   }

   public BigDecimal getLeadTime() {
        return leadTime;
   }

   public void setLeadTime(BigDecimal leadTime) {
        this.leadTime = leadTime;
   }

   public String getOrigProd() {
        return origProd;
   }

   public void setOrigProd(String origProd) {
        this.origProd = origProd;
   }

   public String getTemIcms() {
        return temIcms;
   }

   public void setTemIcms(String temIcms) {
        this.temIcms = temIcms;
   }

   public String getTipSubst() {
        return tipSubst;
   }

   public void setTipSubst(String tipSubst) {
        this.tipSubst = tipSubst;
   }

   public String getUsaIdPalete() {
        return usaIdPalete;
   }

   public void setUsaIdPalete(String usaIdPalete) {
        this.usaIdPalete = usaIdPalete;
   }

   public String getUsoProd() {
        return usoProd;
   }

   public void setUsoProd(String usoProd) {
        this.usoProd = usoProd;
   }

   public BigDecimal getCstIpiEnt() {
        return cstIpiEnt;
   }

   public void setCstIpiEnt(BigDecimal cstIpiEnt) {
        this.cstIpiEnt = cstIpiEnt;
   }

   public BigDecimal getCstIpiSai() {
        return cstIpiSai;
   }

   public void setCstIpiSai(BigDecimal cstIpiSai) {
        this.cstIpiSai = cstIpiSai;
   }

   public String getTemIpiCompra() {
        return temIpiCompra;
   }

   public void setTemIpiCompra(String temIpiCompra) {
        this.temIpiCompra = temIpiCompra;
   }

   public String getTemIpiVenda() {
        return temIpiVenda;
   }

   public void setTemIpiVenda(String temIpiVenda) {
        this.temIpiVenda = temIpiVenda;
   }

   public BigDecimal getCodEnqIpiSai() {
        return codEnqIpiSai;
   }

   public void setCodEnqIpiSai(BigDecimal codEnqIpiSai) {
        this.codEnqIpiSai = codEnqIpiSai;
   }

   public BigDecimal getCodEnqIpiEnt() {
        return codEnqIpiEnt;
   }

   public void setCodEnqIpiEnt(BigDecimal codEnqIpiEnt) {
        this.codEnqIpiEnt = codEnqIpiEnt;
   }

   public BigDecimal getAliqGeral() {
        return aliqGeral;
   }

   public void setAliqGeral(BigDecimal aliqGeral) {
        this.aliqGeral = aliqGeral;
   }

   public BigDecimal getGrupoIcms2() {
        return grupoIcms2;
   }

   public void setGrupoIcms2(BigDecimal grupoIcms2) {
        this.grupoIcms2 = grupoIcms2;
   }

   public BigDecimal getCodLocalPad() {
        return codLocalPad;
   }

   public void setCodLocalPad(BigDecimal codLocalPad) {
        this.codLocalPad = codLocalPad;
   }

   public BigDecimal getCodEspecSt() {
        return codEspecSt;
   }

   public void setCodEspecSt(BigDecimal codEspecSt) {
        this.codEspecSt = codEspecSt;
   }

   public BigDecimal getMvaPadrao() {
        return mvaPadrao;
   }

   public void setMvaPadrao(BigDecimal mvaPadrao) {
        this.mvaPadrao = mvaPadrao;
   }

   public String getCat1799SpRes() {
        return cat1799SpRes;
   }

   public void setCat1799SpRes(String cat1799SpRes) {
        this.cat1799SpRes = cat1799SpRes;
   }

   public String getCodFci() {
        return codFci;
   }

   public void setCodFci(String codFci) {
        this.codFci = codFci;
   }

   public BigDecimal getPercRedBaseIcmsEfet() {
        return percRedBaseIcmsEfet;
   }

   public void setPercRedBaseIcmsEfet(BigDecimal percRedBaseIcmsEfet) {
        this.percRedBaseIcmsEfet = percRedBaseIcmsEfet;
   }

   public String getRastStUltEntrada() {
        return rastStUltEntrada;
   }

   public void setRastStUltEntrada(String rastStUltEntrada) {
        this.rastStUltEntrada = rastStUltEntrada;
   }

   public String getTipoItemSped() {
        return tipoItemSped;
   }

   public void setTipoItemSped(String tipoItemSped) {
        this.tipoItemSped = tipoItemSped;
   }

   public BigDecimal getPercCmtNac() {
        return percCmtNac;
   }

   public void setPercCmtNac(BigDecimal percCmtNac) {
        this.percCmtNac = percCmtNac;
   }

   public BigDecimal getPercCmtEst() {
        return percCmtEst;
   }

   public void setPercCmtEst(BigDecimal percCmtEst) {
        this.percCmtEst = percCmtEst;
   }

   public BigDecimal getPercCmtFed() {
        return percCmtFed;
   }

   public void setPercCmtFed(BigDecimal percCmtFed) {
        this.percCmtFed = percCmtFed;
   }

   public BigDecimal getPercCmtImp() {
        return percCmtImp;
   }

   public void setPercCmtImp(BigDecimal percCmtImp) {
        this.percCmtImp = percCmtImp;
   }

   public String getCalcDifAl() {
        return calcDifAl;
   }

   public void setCalcDifAl(String calcDifAl) {
        this.calcDifAl = calcDifAl;
   }

   public BigDecimal getCodCtaCtbEfd() {
        return codCtaCtbEfd;
   }

   public void setCodCtaCtbEfd(BigDecimal codCtaCtbEfd) {
        this.codCtaCtbEfd = codCtaCtbEfd;
   }

   public String getTemRastroLote() {
        return temRastroLote;
   }

   public void setTemRastroLote(String temRastroLote) {
        this.temRastroLote = temRastroLote;
   }

   public BigDecimal getVlrComerc() {
        return vlrComerc;
   }

   public void setVlrComerc(BigDecimal vlrComerc) {
        this.vlrComerc = vlrComerc;
   }

   public BigDecimal getVlrParcImpExt() {
        return vlrParcImpExt;
   }

   public void setVlrParcImpExt(BigDecimal vlrParcImpExt) {
        this.vlrParcImpExt = vlrParcImpExt;
   }

   public String getObtStAntMedEnt() {
        return obtStAntMedEnt;
   }

   public void setObtStAntMedEnt(String obtStAntMedEnt) {
        this.obtStAntMedEnt = obtStAntMedEnt;
   }

   public char[] getGradePadrao() {
        return gradePadrao;
   }

   public void setGradePadrao(char[] gradePadrao) {
        this.gradePadrao = gradePadrao;
   }

   public BigDecimal getIdGrade() {
        return idGrade;
   }

   public void setIdGrade(BigDecimal idGrade) {
        this.idGrade = idGrade;
   }

   public BigDecimal getEnqReIntegra() {
        return enqReIntegra;
   }

   public void setEnqReIntegra(BigDecimal enqReIntegra) {
        this.enqReIntegra = enqReIntegra;
   }

   @Override
   public String getTableName() {
        return "TGFPEM";
   }

   @Override
   public String getEntityName() {
        return "EmpresaProdutoImpostos";
   }

   @Override
   public EmpresaProdutoImpostos fromVO(DynamicVO vo) {
        this.usaLoteDtFab = vo.asString("USALOTEDTFAB");
        this.usaLoteDtVal = vo.asString("USALOTEDTVAL");
        this.estMin = vo.asBigDecimal("ESTMIN");
        this.tipContEst = vo.asString("TIPCONTEST");
        this.estMax = vo.asBigDecimal("ESTMAX");
        this.localizacao = vo.asString("LOCALIZACAO");
        this.aliqIcmsIntEfd = vo.asBigDecimal("ALIQICMSINTEFD");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codIcmsFast = vo.asBigDecimal("CODICMSFAST");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codProdRoi = vo.asString("CODPRODROI");
        this.descMax = vo.asBigDecimal("DESCMAX");
        this.grupoIcms = vo.asBigDecimal("GRUPOICMS");
        this.leadTime = vo.asBigDecimal("LEADTIME");
        this.origProd = vo.asString("ORIGPROD");
        this.temIcms = vo.asString("TEMICMS");
        this.tipSubst = vo.asString("TIPSUBST");
        this.usaIdPalete = vo.asString("USAIDPALETE");
        this.usoProd = vo.asString("USOPROD");
        this.cstIpiEnt = vo.asBigDecimal("CSTIPIENT");
        this.cstIpiSai = vo.asBigDecimal("CSTIPISAI");
        this.temIpiCompra = vo.asString("TEMIPICOMPRA");
        this.temIpiVenda = vo.asString("TEMIPIVENDA");
        this.codEnqIpiSai = vo.asBigDecimal("CODENQIPISAI");
        this.codEnqIpiEnt = vo.asBigDecimal("CODENQIPIENT");
        this.aliqGeral = vo.asBigDecimal("ALIQGERAL");
        this.grupoIcms2 = vo.asBigDecimal("GRUPOICMS2");
        this.codLocalPad = vo.asBigDecimal("CODLOCALPAD");
        this.codEspecSt = vo.asBigDecimal("CODESPECST");
        this.mvaPadrao = vo.asBigDecimal("MVAPADRAO");
        this.cat1799SpRes = vo.asString("CAT1799SPRES");
        this.codFci = vo.asString("CODFCI");
        this.percRedBaseIcmsEfet = vo.asBigDecimal("PERCREDBASEICMSEFET");
        this.rastStUltEntrada = vo.asString("RASTSTULTENTRADA");
        this.tipoItemSped = vo.asString("TIPOITEMSPED");
        this.percCmtNac = vo.asBigDecimal("PERCCMTNAC");
        this.percCmtEst = vo.asBigDecimal("PERCCMTEST");
        this.percCmtFed = vo.asBigDecimal("PERCCMTFED");
        this.percCmtImp = vo.asBigDecimal("PERCCMTIMP");
        this.calcDifAl = vo.asString("CALCDIFAL");
        this.codCtaCtbEfd = vo.asBigDecimal("CODCTACTBEFD");
        this.temRastroLote = vo.asString("TEMRASTROLOTE");
        this.vlrComerc = vo.asBigDecimal("VLRCOMERC");
        this.vlrParcImpExt = vo.asBigDecimal("VLRPARCIMPEXT");
        this.obtStAntMedEnt = vo.asString("OBTSTANTMEDENT");
        this.gradePadrao = vo.asClob("GRADEPADRAO");
        this.idGrade = vo.asBigDecimal("IDGRADE");
        this.enqReIntegra = vo.asBigDecimal("ENQREINTEGRA");
        return this;
   }
}
