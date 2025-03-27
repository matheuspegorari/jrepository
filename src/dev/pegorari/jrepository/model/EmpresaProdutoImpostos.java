package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EmpresaProdutoImpostos extends AbstractSankhyaEntity<EmpresaProdutoImpostos> {
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

   public BigDecimal getEstMin() {
        return this.getVo().asBigDecimal("ESTMIN");
   }

   public void setEstMin(BigDecimal estMin) {
        markAsChanged("ESTMIN", estMin);
   }

   public String getTipContEst() {
        return this.getVo().asString("TIPCONTEST");
   }

   public void setTipContEst(String tipContEst) {
        markAsChanged("TIPCONTEST", tipContEst);
   }

   public BigDecimal getEstMax() {
        return this.getVo().asBigDecimal("ESTMAX");
   }

   public void setEstMax(BigDecimal estMax) {
        markAsChanged("ESTMAX", estMax);
   }

   public String getLocalizacao() {
        return this.getVo().asString("LOCALIZACAO");
   }

   public void setLocalizacao(String localizacao) {
        markAsChanged("LOCALIZACAO", localizacao);
   }

   public BigDecimal getAliqIcmsIntEfd() {
        return this.getVo().asBigDecimal("ALIQICMSINTEFD");
   }

   public void setAliqIcmsIntEfd(BigDecimal aliqIcmsIntEfd) {
        markAsChanged("ALIQICMSINTEFD", aliqIcmsIntEfd);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodIcmsFast() {
        return this.getVo().asBigDecimal("CODICMSFAST");
   }

   public void setCodIcmsFast(BigDecimal codIcmsFast) {
        markAsChanged("CODICMSFAST", codIcmsFast);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getCodProdRoi() {
        return this.getVo().asString("CODPRODROI");
   }

   public void setCodProdRoi(String codProdRoi) {
        markAsChanged("CODPRODROI", codProdRoi);
   }

   public BigDecimal getDescMax() {
        return this.getVo().asBigDecimal("DESCMAX");
   }

   public void setDescMax(BigDecimal descMax) {
        markAsChanged("DESCMAX", descMax);
   }

   public BigDecimal getGrupoIcms() {
        return this.getVo().asBigDecimal("GRUPOICMS");
   }

   public void setGrupoIcms(BigDecimal grupoIcms) {
        markAsChanged("GRUPOICMS", grupoIcms);
   }

   public BigDecimal getLeadTime() {
        return this.getVo().asBigDecimal("LEADTIME");
   }

   public void setLeadTime(BigDecimal leadTime) {
        markAsChanged("LEADTIME", leadTime);
   }

   public String getOrigProd() {
        return this.getVo().asString("ORIGPROD");
   }

   public void setOrigProd(String origProd) {
        markAsChanged("ORIGPROD", origProd);
   }

   public String getTemIcms() {
        return this.getVo().asString("TEMICMS");
   }

   public void setTemIcms(String temIcms) {
        markAsChanged("TEMICMS", temIcms);
   }

   public String getTipSubst() {
        return this.getVo().asString("TIPSUBST");
   }

   public void setTipSubst(String tipSubst) {
        markAsChanged("TIPSUBST", tipSubst);
   }

   public String getUsaIdPalete() {
        return this.getVo().asString("USAIDPALETE");
   }

   public void setUsaIdPalete(String usaIdPalete) {
        markAsChanged("USAIDPALETE", usaIdPalete);
   }

   public String getUsoProd() {
        return this.getVo().asString("USOPROD");
   }

   public void setUsoProd(String usoProd) {
        markAsChanged("USOPROD", usoProd);
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

   public BigDecimal getCodEnqIpiSai() {
        return this.getVo().asBigDecimal("CODENQIPISAI");
   }

   public void setCodEnqIpiSai(BigDecimal codEnqIpiSai) {
        markAsChanged("CODENQIPISAI", codEnqIpiSai);
   }

   public BigDecimal getCodEnqIpiEnt() {
        return this.getVo().asBigDecimal("CODENQIPIENT");
   }

   public void setCodEnqIpiEnt(BigDecimal codEnqIpiEnt) {
        markAsChanged("CODENQIPIENT", codEnqIpiEnt);
   }

   public BigDecimal getAliqGeral() {
        return this.getVo().asBigDecimal("ALIQGERAL");
   }

   public void setAliqGeral(BigDecimal aliqGeral) {
        markAsChanged("ALIQGERAL", aliqGeral);
   }

   public BigDecimal getGrupoIcms2() {
        return this.getVo().asBigDecimal("GRUPOICMS2");
   }

   public void setGrupoIcms2(BigDecimal grupoIcms2) {
        markAsChanged("GRUPOICMS2", grupoIcms2);
   }

   public BigDecimal getCodLocalPad() {
        return this.getVo().asBigDecimal("CODLOCALPAD");
   }

   public void setCodLocalPad(BigDecimal codLocalPad) {
        markAsChanged("CODLOCALPAD", codLocalPad);
   }

   public BigDecimal getCodEspecSt() {
        return this.getVo().asBigDecimal("CODESPECST");
   }

   public void setCodEspecSt(BigDecimal codEspecSt) {
        markAsChanged("CODESPECST", codEspecSt);
   }

   public BigDecimal getMvaPadrao() {
        return this.getVo().asBigDecimal("MVAPADRAO");
   }

   public void setMvaPadrao(BigDecimal mvaPadrao) {
        markAsChanged("MVAPADRAO", mvaPadrao);
   }

   public String getCat1799SpRes() {
        return this.getVo().asString("CAT1799SPRES");
   }

   public void setCat1799SpRes(String cat1799SpRes) {
        markAsChanged("CAT1799SPRES", cat1799SpRes);
   }

   public String getCodFci() {
        return this.getVo().asString("CODFCI");
   }

   public void setCodFci(String codFci) {
        markAsChanged("CODFCI", codFci);
   }

   public BigDecimal getPercRedBaseIcmsEfet() {
        return this.getVo().asBigDecimal("PERCREDBASEICMSEFET");
   }

   public void setPercRedBaseIcmsEfet(BigDecimal percRedBaseIcmsEfet) {
        markAsChanged("PERCREDBASEICMSEFET", percRedBaseIcmsEfet);
   }

   public String getRastStUltEntrada() {
        return this.getVo().asString("RASTSTULTENTRADA");
   }

   public void setRastStUltEntrada(String rastStUltEntrada) {
        markAsChanged("RASTSTULTENTRADA", rastStUltEntrada);
   }

   public String getTipoItemSped() {
        return this.getVo().asString("TIPOITEMSPED");
   }

   public void setTipoItemSped(String tipoItemSped) {
        markAsChanged("TIPOITEMSPED", tipoItemSped);
   }

   public BigDecimal getPercCmtNac() {
        return this.getVo().asBigDecimal("PERCCMTNAC");
   }

   public void setPercCmtNac(BigDecimal percCmtNac) {
        markAsChanged("PERCCMTNAC", percCmtNac);
   }

   public BigDecimal getPercCmtEst() {
        return this.getVo().asBigDecimal("PERCCMTEST");
   }

   public void setPercCmtEst(BigDecimal percCmtEst) {
        markAsChanged("PERCCMTEST", percCmtEst);
   }

   public BigDecimal getPercCmtFed() {
        return this.getVo().asBigDecimal("PERCCMTFED");
   }

   public void setPercCmtFed(BigDecimal percCmtFed) {
        markAsChanged("PERCCMTFED", percCmtFed);
   }

   public BigDecimal getPercCmtImp() {
        return this.getVo().asBigDecimal("PERCCMTIMP");
   }

   public void setPercCmtImp(BigDecimal percCmtImp) {
        markAsChanged("PERCCMTIMP", percCmtImp);
   }

   public String getCalcDifAl() {
        return this.getVo().asString("CALCDIFAL");
   }

   public void setCalcDifAl(String calcDifAl) {
        markAsChanged("CALCDIFAL", calcDifAl);
   }

   public BigDecimal getCodCtaCtbEfd() {
        return this.getVo().asBigDecimal("CODCTACTBEFD");
   }

   public void setCodCtaCtbEfd(BigDecimal codCtaCtbEfd) {
        markAsChanged("CODCTACTBEFD", codCtaCtbEfd);
   }

   public String getTemRastroLote() {
        return this.getVo().asString("TEMRASTROLOTE");
   }

   public void setTemRastroLote(String temRastroLote) {
        markAsChanged("TEMRASTROLOTE", temRastroLote);
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

   public String getObtStAntMedEnt() {
        return this.getVo().asString("OBTSTANTMEDENT");
   }

   public void setObtStAntMedEnt(String obtStAntMedEnt) {
        markAsChanged("OBTSTANTMEDENT", obtStAntMedEnt);
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

   public BigDecimal getEnqReIntegra() {
        return this.getVo().asBigDecimal("ENQREINTEGRA");
   }

   public void setEnqReIntegra(BigDecimal enqReIntegra) {
        markAsChanged("ENQREINTEGRA", enqReIntegra);
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
        this.setVo(vo);
        return this;
   }
}
