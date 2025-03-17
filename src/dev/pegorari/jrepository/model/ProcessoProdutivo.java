package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProcessoProdutivo implements SankhyaEntity<ProcessoProdutivo> {

   private String padrao;
   private BigDecimal codPrcProducao;
   private String procDesmonte;
   private String usaTerceiro;
   private String defTerceiro;
   private String tipoNrLote;
   private String mascNrLote;
   private String tipoFragNrLote;
   private BigDecimal codLocalAlmoxarife;
   private BigDecimal codLocalManufatura;
   private BigDecimal codPlp;
   private BigDecimal codPrc;
   private BigDecimal codUsuAlt;
   private BigDecimal codUsuCad;
   private String descrAbrev;
   private String descrLonga;
   private Timestamp dhAlter;
   private Timestamp dhCad;
   private BigDecimal idProc;
   private BigDecimal idRpAInicial;
   private String idWflow;
   private String multiControle;
   private String multiPa;
   private String tipoInicia;
   private String tipoProc;
   private BigDecimal versao;
   private char[] xmlBpmn;
   private BigDecimal percDesvioInf;
   private BigDecimal percDesvioSup;
   private String procReparo;
   private String exigePedido;
   private String validaVersao;
   private String prodParaTerceiro;
   private String liberaDesvio;
   private String loteCuringa;
   private String padraoProduto;
   private String usaLoteCuringa;
   private String ativo;
   private BigDecimal idFormula;
   private String mascNrLoteSp;
   private String tipoFragNrLoteSp;
   private String tipoNrLoteSp;
   private String usaConfNrLoteSp;
   private char[] xmlBpmnUi;
   private String perEdicao;
   private BigDecimal qtdDias;
   private String roteiroHtml5;
   private String tipExecAtv;
   private BigDecimal versaoAnt;

   public String getPadrao() {
        return padrao;
   }

   public void setPadrao(String padrao) {
        this.padrao = padrao;
   }

   public BigDecimal getCodPrcProducao() {
        return codPrcProducao;
   }

   public void setCodPrcProducao(BigDecimal codPrcProducao) {
        this.codPrcProducao = codPrcProducao;
   }

   public String getProcDesmonte() {
        return procDesmonte;
   }

   public void setProcDesmonte(String procDesmonte) {
        this.procDesmonte = procDesmonte;
   }

   public String getUsaTerceiro() {
        return usaTerceiro;
   }

   public void setUsaTerceiro(String usaTerceiro) {
        this.usaTerceiro = usaTerceiro;
   }

   public String getDefTerceiro() {
        return defTerceiro;
   }

   public void setDefTerceiro(String defTerceiro) {
        this.defTerceiro = defTerceiro;
   }

   public String getTipoNrLote() {
        return tipoNrLote;
   }

   public void setTipoNrLote(String tipoNrLote) {
        this.tipoNrLote = tipoNrLote;
   }

   public String getMascNrLote() {
        return mascNrLote;
   }

   public void setMascNrLote(String mascNrLote) {
        this.mascNrLote = mascNrLote;
   }

   public String getTipoFragNrLote() {
        return tipoFragNrLote;
   }

   public void setTipoFragNrLote(String tipoFragNrLote) {
        this.tipoFragNrLote = tipoFragNrLote;
   }

   public BigDecimal getCodLocalAlmoxarife() {
        return codLocalAlmoxarife;
   }

   public void setCodLocalAlmoxarife(BigDecimal codLocalAlmoxarife) {
        this.codLocalAlmoxarife = codLocalAlmoxarife;
   }

   public BigDecimal getCodLocalManufatura() {
        return codLocalManufatura;
   }

   public void setCodLocalManufatura(BigDecimal codLocalManufatura) {
        this.codLocalManufatura = codLocalManufatura;
   }

   public BigDecimal getCodPlp() {
        return codPlp;
   }

   public void setCodPlp(BigDecimal codPlp) {
        this.codPlp = codPlp;
   }

   public BigDecimal getCodPrc() {
        return codPrc;
   }

   public void setCodPrc(BigDecimal codPrc) {
        this.codPrc = codPrc;
   }

   public BigDecimal getCodUsuAlt() {
        return codUsuAlt;
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        this.codUsuAlt = codUsuAlt;
   }

   public BigDecimal getCodUsuCad() {
        return codUsuCad;
   }

   public void setCodUsuCad(BigDecimal codUsuCad) {
        this.codUsuCad = codUsuCad;
   }

   public String getDescrAbrev() {
        return descrAbrev;
   }

   public void setDescrAbrev(String descrAbrev) {
        this.descrAbrev = descrAbrev;
   }

   public String getDescrLonga() {
        return descrLonga;
   }

   public void setDescrLonga(String descrLonga) {
        this.descrLonga = descrLonga;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhCad() {
        return dhCad;
   }

   public void setDhCad(Timestamp dhCad) {
        this.dhCad = dhCad;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        this.idProc = idProc;
   }

   public BigDecimal getIdRpAInicial() {
        return idRpAInicial;
   }

   public void setIdRpAInicial(BigDecimal idRpAInicial) {
        this.idRpAInicial = idRpAInicial;
   }

   public String getIdWflow() {
        return idWflow;
   }

   public void setIdWflow(String idWflow) {
        this.idWflow = idWflow;
   }

   public String getMultiControle() {
        return multiControle;
   }

   public void setMultiControle(String multiControle) {
        this.multiControle = multiControle;
   }

   public String getMultiPa() {
        return multiPa;
   }

   public void setMultiPa(String multiPa) {
        this.multiPa = multiPa;
   }

   public String getTipoInicia() {
        return tipoInicia;
   }

   public void setTipoInicia(String tipoInicia) {
        this.tipoInicia = tipoInicia;
   }

   public String getTipoProc() {
        return tipoProc;
   }

   public void setTipoProc(String tipoProc) {
        this.tipoProc = tipoProc;
   }

   public BigDecimal getVersao() {
        return versao;
   }

   public void setVersao(BigDecimal versao) {
        this.versao = versao;
   }

   public char[] getXmlBpmn() {
        return xmlBpmn;
   }

   public void setXmlBpmn(char[] xmlBpmn) {
        this.xmlBpmn = xmlBpmn;
   }

   public BigDecimal getPercDesvioInf() {
        return percDesvioInf;
   }

   public void setPercDesvioInf(BigDecimal percDesvioInf) {
        this.percDesvioInf = percDesvioInf;
   }

   public BigDecimal getPercDesvioSup() {
        return percDesvioSup;
   }

   public void setPercDesvioSup(BigDecimal percDesvioSup) {
        this.percDesvioSup = percDesvioSup;
   }

   public String getProcReparo() {
        return procReparo;
   }

   public void setProcReparo(String procReparo) {
        this.procReparo = procReparo;
   }

   public String getExigePedido() {
        return exigePedido;
   }

   public void setExigePedido(String exigePedido) {
        this.exigePedido = exigePedido;
   }

   public String getValidaVersao() {
        return validaVersao;
   }

   public void setValidaVersao(String validaVersao) {
        this.validaVersao = validaVersao;
   }

   public String getProdParaTerceiro() {
        return prodParaTerceiro;
   }

   public void setProdParaTerceiro(String prodParaTerceiro) {
        this.prodParaTerceiro = prodParaTerceiro;
   }

   public String getLiberaDesvio() {
        return liberaDesvio;
   }

   public void setLiberaDesvio(String liberaDesvio) {
        this.liberaDesvio = liberaDesvio;
   }

   public String getLoteCuringa() {
        return loteCuringa;
   }

   public void setLoteCuringa(String loteCuringa) {
        this.loteCuringa = loteCuringa;
   }

   public String getPadraoProduto() {
        return padraoProduto;
   }

   public void setPadraoProduto(String padraoProduto) {
        this.padraoProduto = padraoProduto;
   }

   public String getUsaLoteCuringa() {
        return usaLoteCuringa;
   }

   public void setUsaLoteCuringa(String usaLoteCuringa) {
        this.usaLoteCuringa = usaLoteCuringa;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getIdFormula() {
        return idFormula;
   }

   public void setIdFormula(BigDecimal idFormula) {
        this.idFormula = idFormula;
   }

   public String getMascNrLoteSp() {
        return mascNrLoteSp;
   }

   public void setMascNrLoteSp(String mascNrLoteSp) {
        this.mascNrLoteSp = mascNrLoteSp;
   }

   public String getTipoFragNrLoteSp() {
        return tipoFragNrLoteSp;
   }

   public void setTipoFragNrLoteSp(String tipoFragNrLoteSp) {
        this.tipoFragNrLoteSp = tipoFragNrLoteSp;
   }

   public String getTipoNrLoteSp() {
        return tipoNrLoteSp;
   }

   public void setTipoNrLoteSp(String tipoNrLoteSp) {
        this.tipoNrLoteSp = tipoNrLoteSp;
   }

   public String getUsaConfNrLoteSp() {
        return usaConfNrLoteSp;
   }

   public void setUsaConfNrLoteSp(String usaConfNrLoteSp) {
        this.usaConfNrLoteSp = usaConfNrLoteSp;
   }

   public char[] getXmlBpmnUi() {
        return xmlBpmnUi;
   }

   public void setXmlBpmnUi(char[] xmlBpmnUi) {
        this.xmlBpmnUi = xmlBpmnUi;
   }

   public String getPerEdicao() {
        return perEdicao;
   }

   public void setPerEdicao(String perEdicao) {
        this.perEdicao = perEdicao;
   }

   public BigDecimal getQtdDias() {
        return qtdDias;
   }

   public void setQtdDias(BigDecimal qtdDias) {
        this.qtdDias = qtdDias;
   }

   public String getRoteiroHtml5() {
        return roteiroHtml5;
   }

   public void setRoteiroHtml5(String roteiroHtml5) {
        this.roteiroHtml5 = roteiroHtml5;
   }

   public String getTipExecAtv() {
        return tipExecAtv;
   }

   public void setTipExecAtv(String tipExecAtv) {
        this.tipExecAtv = tipExecAtv;
   }

   public BigDecimal getVersaoAnt() {
        return versaoAnt;
   }

   public void setVersaoAnt(BigDecimal versaoAnt) {
        this.versaoAnt = versaoAnt;
   }

   @Override
   public String getEntityName() {
        return "ProcessoProdutivo";
   }

   @Override
   public ProcessoProdutivo fromVO(DynamicVO vo) {
        this.padrao = vo.asString("PADRAO");
        this.codPrcProducao = vo.asBigDecimal("CODPRCPRODUCAO");
        this.procDesmonte = vo.asString("PROCDESMONTE");
        this.usaTerceiro = vo.asString("USATERCEIRO");
        this.defTerceiro = vo.asString("DEFTERCEIRO");
        this.tipoNrLote = vo.asString("TIPONRLOTE");
        this.mascNrLote = vo.asString("MASCNRLOTE");
        this.tipoFragNrLote = vo.asString("TIPOFRAGNRLOTE");
        this.codLocalAlmoxarife = vo.asBigDecimal("CODLOCALALMOXARIFE");
        this.codLocalManufatura = vo.asBigDecimal("CODLOCALMANUFATURA");
        this.codPlp = vo.asBigDecimal("CODPLP");
        this.codPrc = vo.asBigDecimal("CODPRC");
        this.codUsuAlt = vo.asBigDecimal("CODUSUALT");
        this.codUsuCad = vo.asBigDecimal("CODUSUCAD");
        this.descrAbrev = vo.asString("DESCRABREV");
        this.descrLonga = vo.asString("DESCRLONGA");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhCad = vo.asTimestamp("DHCAD");
        this.idProc = vo.asBigDecimal("IDPROC");
        this.idRpAInicial = vo.asBigDecimal("IDRPAINICIAL");
        this.idWflow = vo.asString("IDWFLOW");
        this.multiControle = vo.asString("MULTICONTROLE");
        this.multiPa = vo.asString("MULTIPA");
        this.tipoInicia = vo.asString("TIPOINICIA");
        this.tipoProc = vo.asString("TIPOPROC");
        this.versao = vo.asBigDecimal("VERSAO");
        this.xmlBpmn = vo.asClob("XMLBPMN");
        this.percDesvioInf = vo.asBigDecimal("PERCDESVIOINF");
        this.percDesvioSup = vo.asBigDecimal("PERCDESVIOSUP");
        this.procReparo = vo.asString("PROCREPARO");
        this.exigePedido = vo.asString("EXIGEPEDIDO");
        this.validaVersao = vo.asString("VALIDAVERSAO");
        this.prodParaTerceiro = vo.asString("PRODPARATERCEIRO");
        this.liberaDesvio = vo.asString("LIBERADESVIO");
        this.loteCuringa = vo.asString("LOTECURINGA");
        this.padraoProduto = vo.asString("PADRAOPRODUTO");
        this.usaLoteCuringa = vo.asString("USALOTECURINGA");
        this.ativo = vo.asString("ATIVO");
        this.idFormula = vo.asBigDecimal("IDFORMULA");
        this.mascNrLoteSp = vo.asString("MASCNRLOTESP");
        this.tipoFragNrLoteSp = vo.asString("TIPOFRAGNRLOTESP");
        this.tipoNrLoteSp = vo.asString("TIPONRLOTESP");
        this.usaConfNrLoteSp = vo.asString("USACONFNRLOTESP");
        this.xmlBpmnUi = vo.asClob("XMLBPMNUI");
        this.perEdicao = vo.asString("PEREDICAO");
        this.qtdDias = vo.asBigDecimal("QTDDIAS");
        this.roteiroHtml5 = vo.asString("ROTEIROHTML5");
        this.tipExecAtv = vo.asString("TIPEXECATV");
        this.versaoAnt = vo.asBigDecimal("VERSAOANT");
        return this;
   }
}
