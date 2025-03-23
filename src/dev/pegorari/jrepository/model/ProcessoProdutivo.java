package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProcessoProdutivo extends AbstractSankhyaEntity<ProcessoProdutivo> {
   private String padrao;
   private BigDecimal codPrcProducao;
   private String procDesmonte;
   private String usaTerceiro;
   private String defTerceiro;
   private String tipoNroLote;
   private String mascNroLote;
   private String tipoFragNroLote;
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
   private BigDecimal idRpaInicial;
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
   private String mascNroLoteSp;
   private String tipoFragNroLoteSp;
   private String tipoNroLoteSp;
   private String usaConfNroLoteSp;
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
        markAsChanged("PADRAO", padrao);
        this.padrao = padrao;
   }

   public BigDecimal getCodPrcProducao() {
        return codPrcProducao;
   }

   public void setCodPrcProducao(BigDecimal codPrcProducao) {
        markAsChanged("CODPRCPRODUCAO", codPrcProducao);
        this.codPrcProducao = codPrcProducao;
   }

   public String getProcDesmonte() {
        return procDesmonte;
   }

   public void setProcDesmonte(String procDesmonte) {
        markAsChanged("PROCDESMONTE", procDesmonte);
        this.procDesmonte = procDesmonte;
   }

   public String getUsaTerceiro() {
        return usaTerceiro;
   }

   public void setUsaTerceiro(String usaTerceiro) {
        markAsChanged("USATERCEIRO", usaTerceiro);
        this.usaTerceiro = usaTerceiro;
   }

   public String getDefTerceiro() {
        return defTerceiro;
   }

   public void setDefTerceiro(String defTerceiro) {
        markAsChanged("DEFTERCEIRO", defTerceiro);
        this.defTerceiro = defTerceiro;
   }

   public String getTipoNroLote() {
        return tipoNroLote;
   }

   public void setTipoNroLote(String tipoNroLote) {
        markAsChanged("TIPONROLOTE", tipoNroLote);
        this.tipoNroLote = tipoNroLote;
   }

   public String getMascNroLote() {
        return mascNroLote;
   }

   public void setMascNroLote(String mascNroLote) {
        markAsChanged("MASCNROLOTE", mascNroLote);
        this.mascNroLote = mascNroLote;
   }

   public String getTipoFragNroLote() {
        return tipoFragNroLote;
   }

   public void setTipoFragNroLote(String tipoFragNroLote) {
        markAsChanged("TIPOFRAGNROLOTE", tipoFragNroLote);
        this.tipoFragNroLote = tipoFragNroLote;
   }

   public BigDecimal getCodLocalAlmoxarife() {
        return codLocalAlmoxarife;
   }

   public void setCodLocalAlmoxarife(BigDecimal codLocalAlmoxarife) {
        markAsChanged("CODLOCALALMOXARIFE", codLocalAlmoxarife);
        this.codLocalAlmoxarife = codLocalAlmoxarife;
   }

   public BigDecimal getCodLocalManufatura() {
        return codLocalManufatura;
   }

   public void setCodLocalManufatura(BigDecimal codLocalManufatura) {
        markAsChanged("CODLOCALMANUFATURA", codLocalManufatura);
        this.codLocalManufatura = codLocalManufatura;
   }

   public BigDecimal getCodPlp() {
        return codPlp;
   }

   public void setCodPlp(BigDecimal codPlp) {
        markAsChanged("CODPLP", codPlp);
        this.codPlp = codPlp;
   }

   public BigDecimal getCodPrc() {
        return codPrc;
   }

   public void setCodPrc(BigDecimal codPrc) {
        markAsChanged("CODPRC", codPrc);
        this.codPrc = codPrc;
   }

   public BigDecimal getCodUsuAlt() {
        return codUsuAlt;
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        markAsChanged("CODUSUALT", codUsuAlt);
        this.codUsuAlt = codUsuAlt;
   }

   public BigDecimal getCodUsuCad() {
        return codUsuCad;
   }

   public void setCodUsuCad(BigDecimal codUsuCad) {
        markAsChanged("CODUSUCAD", codUsuCad);
        this.codUsuCad = codUsuCad;
   }

   public String getDescrAbrev() {
        return descrAbrev;
   }

   public void setDescrAbrev(String descrAbrev) {
        markAsChanged("DESCRABREV", descrAbrev);
        this.descrAbrev = descrAbrev;
   }

   public String getDescrLonga() {
        return descrLonga;
   }

   public void setDescrLonga(String descrLonga) {
        markAsChanged("DESCRLONGA", descrLonga);
        this.descrLonga = descrLonga;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhCad() {
        return dhCad;
   }

   public void setDhCad(Timestamp dhCad) {
        markAsChanged("DHCAD", dhCad);
        this.dhCad = dhCad;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
        this.idProc = idProc;
   }

   public BigDecimal getIdRpaInicial() {
        return idRpaInicial;
   }

   public void setIdRpaInicial(BigDecimal idRpaInicial) {
        markAsChanged("IDRPAINICIAL", idRpaInicial);
        this.idRpaInicial = idRpaInicial;
   }

   public String getIdWflow() {
        return idWflow;
   }

   public void setIdWflow(String idWflow) {
        markAsChanged("IDWFLOW", idWflow);
        this.idWflow = idWflow;
   }

   public String getMultiControle() {
        return multiControle;
   }

   public void setMultiControle(String multiControle) {
        markAsChanged("MULTICONTROLE", multiControle);
        this.multiControle = multiControle;
   }

   public String getMultiPa() {
        return multiPa;
   }

   public void setMultiPa(String multiPa) {
        markAsChanged("MULTIPA", multiPa);
        this.multiPa = multiPa;
   }

   public String getTipoInicia() {
        return tipoInicia;
   }

   public void setTipoInicia(String tipoInicia) {
        markAsChanged("TIPOINICIA", tipoInicia);
        this.tipoInicia = tipoInicia;
   }

   public String getTipoProc() {
        return tipoProc;
   }

   public void setTipoProc(String tipoProc) {
        markAsChanged("TIPOPROC", tipoProc);
        this.tipoProc = tipoProc;
   }

   public BigDecimal getVersao() {
        return versao;
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
        this.versao = versao;
   }

   public char[] getXmlBpmn() {
        return xmlBpmn;
   }

   public void setXmlBpmn(char[] xmlBpmn) {
        markAsChanged("XMLBPMN", xmlBpmn);
        this.xmlBpmn = xmlBpmn;
   }

   public BigDecimal getPercDesvioInf() {
        return percDesvioInf;
   }

   public void setPercDesvioInf(BigDecimal percDesvioInf) {
        markAsChanged("PERCDESVIOINF", percDesvioInf);
        this.percDesvioInf = percDesvioInf;
   }

   public BigDecimal getPercDesvioSup() {
        return percDesvioSup;
   }

   public void setPercDesvioSup(BigDecimal percDesvioSup) {
        markAsChanged("PERCDESVIOSUP", percDesvioSup);
        this.percDesvioSup = percDesvioSup;
   }

   public String getProcReparo() {
        return procReparo;
   }

   public void setProcReparo(String procReparo) {
        markAsChanged("PROCREPARO", procReparo);
        this.procReparo = procReparo;
   }

   public String getExigePedido() {
        return exigePedido;
   }

   public void setExigePedido(String exigePedido) {
        markAsChanged("EXIGEPEDIDO", exigePedido);
        this.exigePedido = exigePedido;
   }

   public String getValidaVersao() {
        return validaVersao;
   }

   public void setValidaVersao(String validaVersao) {
        markAsChanged("VALIDAVERSAO", validaVersao);
        this.validaVersao = validaVersao;
   }

   public String getProdParaTerceiro() {
        return prodParaTerceiro;
   }

   public void setProdParaTerceiro(String prodParaTerceiro) {
        markAsChanged("PRODPARATERCEIRO", prodParaTerceiro);
        this.prodParaTerceiro = prodParaTerceiro;
   }

   public String getLiberaDesvio() {
        return liberaDesvio;
   }

   public void setLiberaDesvio(String liberaDesvio) {
        markAsChanged("LIBERADESVIO", liberaDesvio);
        this.liberaDesvio = liberaDesvio;
   }

   public String getLoteCuringa() {
        return loteCuringa;
   }

   public void setLoteCuringa(String loteCuringa) {
        markAsChanged("LOTECURINGA", loteCuringa);
        this.loteCuringa = loteCuringa;
   }

   public String getPadraoProduto() {
        return padraoProduto;
   }

   public void setPadraoProduto(String padraoProduto) {
        markAsChanged("PADRAOPRODUTO", padraoProduto);
        this.padraoProduto = padraoProduto;
   }

   public String getUsaLoteCuringa() {
        return usaLoteCuringa;
   }

   public void setUsaLoteCuringa(String usaLoteCuringa) {
        markAsChanged("USALOTECURINGA", usaLoteCuringa);
        this.usaLoteCuringa = usaLoteCuringa;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getIdFormula() {
        return idFormula;
   }

   public void setIdFormula(BigDecimal idFormula) {
        markAsChanged("IDFORMULA", idFormula);
        this.idFormula = idFormula;
   }

   public String getMascNroLoteSp() {
        return mascNroLoteSp;
   }

   public void setMascNroLoteSp(String mascNroLoteSp) {
        markAsChanged("MASCNROLOTESP", mascNroLoteSp);
        this.mascNroLoteSp = mascNroLoteSp;
   }

   public String getTipoFragNroLoteSp() {
        return tipoFragNroLoteSp;
   }

   public void setTipoFragNroLoteSp(String tipoFragNroLoteSp) {
        markAsChanged("TIPOFRAGNROLOTESP", tipoFragNroLoteSp);
        this.tipoFragNroLoteSp = tipoFragNroLoteSp;
   }

   public String getTipoNroLoteSp() {
        return tipoNroLoteSp;
   }

   public void setTipoNroLoteSp(String tipoNroLoteSp) {
        markAsChanged("TIPONROLOTESP", tipoNroLoteSp);
        this.tipoNroLoteSp = tipoNroLoteSp;
   }

   public String getUsaConfNroLoteSp() {
        return usaConfNroLoteSp;
   }

   public void setUsaConfNroLoteSp(String usaConfNroLoteSp) {
        markAsChanged("USACONFNROLOTESP", usaConfNroLoteSp);
        this.usaConfNroLoteSp = usaConfNroLoteSp;
   }

   public char[] getXmlBpmnUi() {
        return xmlBpmnUi;
   }

   public void setXmlBpmnUi(char[] xmlBpmnUi) {
        markAsChanged("XMLBPMNUI", xmlBpmnUi);
        this.xmlBpmnUi = xmlBpmnUi;
   }

   public String getPerEdicao() {
        return perEdicao;
   }

   public void setPerEdicao(String perEdicao) {
        markAsChanged("PEREDICAO", perEdicao);
        this.perEdicao = perEdicao;
   }

   public BigDecimal getQtdDias() {
        return qtdDias;
   }

   public void setQtdDias(BigDecimal qtdDias) {
        markAsChanged("QTDDIAS", qtdDias);
        this.qtdDias = qtdDias;
   }

   public String getRoteiroHtml5() {
        return roteiroHtml5;
   }

   public void setRoteiroHtml5(String roteiroHtml5) {
        markAsChanged("ROTEIROHTML5", roteiroHtml5);
        this.roteiroHtml5 = roteiroHtml5;
   }

   public String getTipExecAtv() {
        return tipExecAtv;
   }

   public void setTipExecAtv(String tipExecAtv) {
        markAsChanged("TIPEXECATV", tipExecAtv);
        this.tipExecAtv = tipExecAtv;
   }

   public BigDecimal getVersaoAnt() {
        return versaoAnt;
   }

   public void setVersaoAnt(BigDecimal versaoAnt) {
        markAsChanged("VERSAOANT", versaoAnt);
        this.versaoAnt = versaoAnt;
   }

   @Override
   public String getTableName() {
        return "TPRPRC";
   }

   @Override
   public String getEntityName() {
        return "ProcessoProdutivo";
   }

   @Override
   public ProcessoProdutivo fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.padrao = vo.asString("PADRAO");
        this.codPrcProducao = vo.asBigDecimal("CODPRCPRODUCAO");
        this.procDesmonte = vo.asString("PROCDESMONTE");
        this.usaTerceiro = vo.asString("USATERCEIRO");
        this.defTerceiro = vo.asString("DEFTERCEIRO");
        this.tipoNroLote = vo.asString("TIPONROLOTE");
        this.mascNroLote = vo.asString("MASCNROLOTE");
        this.tipoFragNroLote = vo.asString("TIPOFRAGNROLOTE");
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
        this.idRpaInicial = vo.asBigDecimal("IDRPAINICIAL");
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
        this.mascNroLoteSp = vo.asString("MASCNROLOTESP");
        this.tipoFragNroLoteSp = vo.asString("TIPOFRAGNROLOTESP");
        this.tipoNroLoteSp = vo.asString("TIPONROLOTESP");
        this.usaConfNroLoteSp = vo.asString("USACONFNROLOTESP");
        this.xmlBpmnUi = vo.asClob("XMLBPMNUI");
        this.perEdicao = vo.asString("PEREDICAO");
        this.qtdDias = vo.asBigDecimal("QTDDIAS");
        this.roteiroHtml5 = vo.asString("ROTEIROHTML5");
        this.tipExecAtv = vo.asString("TIPEXECATV");
        this.versaoAnt = vo.asBigDecimal("VERSAOANT");
        return this;
   }
}
