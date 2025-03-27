package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProcessoProdutivo extends AbstractSankhyaEntity<ProcessoProdutivo> {
   public String getPadrao() {
        return this.getVo().asString("PADRAO");
   }

   public void setPadrao(String padrao) {
        markAsChanged("PADRAO", padrao);
   }

   public BigDecimal getCodPrcProducao() {
        return this.getVo().asBigDecimal("CODPRCPRODUCAO");
   }

   public void setCodPrcProducao(BigDecimal codPrcProducao) {
        markAsChanged("CODPRCPRODUCAO", codPrcProducao);
   }

   public String getProcDesmonte() {
        return this.getVo().asString("PROCDESMONTE");
   }

   public void setProcDesmonte(String procDesmonte) {
        markAsChanged("PROCDESMONTE", procDesmonte);
   }

   public String getUsaTerceiro() {
        return this.getVo().asString("USATERCEIRO");
   }

   public void setUsaTerceiro(String usaTerceiro) {
        markAsChanged("USATERCEIRO", usaTerceiro);
   }

   public String getDefTerceiro() {
        return this.getVo().asString("DEFTERCEIRO");
   }

   public void setDefTerceiro(String defTerceiro) {
        markAsChanged("DEFTERCEIRO", defTerceiro);
   }

   public String getTipoNroLote() {
        return this.getVo().asString("TIPONROLOTE");
   }

   public void setTipoNroLote(String tipoNroLote) {
        markAsChanged("TIPONROLOTE", tipoNroLote);
   }

   public String getMascNroLote() {
        return this.getVo().asString("MASCNROLOTE");
   }

   public void setMascNroLote(String mascNroLote) {
        markAsChanged("MASCNROLOTE", mascNroLote);
   }

   public String getTipoFragNroLote() {
        return this.getVo().asString("TIPOFRAGNROLOTE");
   }

   public void setTipoFragNroLote(String tipoFragNroLote) {
        markAsChanged("TIPOFRAGNROLOTE", tipoFragNroLote);
   }

   public BigDecimal getCodLocalAlmoxarife() {
        return this.getVo().asBigDecimal("CODLOCALALMOXARIFE");
   }

   public void setCodLocalAlmoxarife(BigDecimal codLocalAlmoxarife) {
        markAsChanged("CODLOCALALMOXARIFE", codLocalAlmoxarife);
   }

   public BigDecimal getCodLocalManufatura() {
        return this.getVo().asBigDecimal("CODLOCALMANUFATURA");
   }

   public void setCodLocalManufatura(BigDecimal codLocalManufatura) {
        markAsChanged("CODLOCALMANUFATURA", codLocalManufatura);
   }

   public BigDecimal getCodPlp() {
        return this.getVo().asBigDecimal("CODPLP");
   }

   public void setCodPlp(BigDecimal codPlp) {
        markAsChanged("CODPLP", codPlp);
   }

   public BigDecimal getCodPrc() {
        return this.getVo().asBigDecimal("CODPRC");
   }

   public void setCodPrc(BigDecimal codPrc) {
        markAsChanged("CODPRC", codPrc);
   }

   public BigDecimal getCodUsuAlt() {
        return this.getVo().asBigDecimal("CODUSUALT");
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        markAsChanged("CODUSUALT", codUsuAlt);
   }

   public BigDecimal getCodUsuCad() {
        return this.getVo().asBigDecimal("CODUSUCAD");
   }

   public void setCodUsuCad(BigDecimal codUsuCad) {
        markAsChanged("CODUSUCAD", codUsuCad);
   }

   public String getDescrAbrev() {
        return this.getVo().asString("DESCRABREV");
   }

   public void setDescrAbrev(String descrAbrev) {
        markAsChanged("DESCRABREV", descrAbrev);
   }

   public String getDescrLonga() {
        return this.getVo().asString("DESCRLONGA");
   }

   public void setDescrLonga(String descrLonga) {
        markAsChanged("DESCRLONGA", descrLonga);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDhCad() {
        return this.getVo().asTimestamp("DHCAD");
   }

   public void setDhCad(Timestamp dhCad) {
        markAsChanged("DHCAD", dhCad);
   }

   public BigDecimal getIdProc() {
        return this.getVo().asBigDecimal("IDPROC");
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
   }

   public BigDecimal getIdRpaInicial() {
        return this.getVo().asBigDecimal("IDRPAINICIAL");
   }

   public void setIdRpaInicial(BigDecimal idRpaInicial) {
        markAsChanged("IDRPAINICIAL", idRpaInicial);
   }

   public String getIdWflow() {
        return this.getVo().asString("IDWFLOW");
   }

   public void setIdWflow(String idWflow) {
        markAsChanged("IDWFLOW", idWflow);
   }

   public String getMultiControle() {
        return this.getVo().asString("MULTICONTROLE");
   }

   public void setMultiControle(String multiControle) {
        markAsChanged("MULTICONTROLE", multiControle);
   }

   public String getMultiPa() {
        return this.getVo().asString("MULTIPA");
   }

   public void setMultiPa(String multiPa) {
        markAsChanged("MULTIPA", multiPa);
   }

   public String getTipoInicia() {
        return this.getVo().asString("TIPOINICIA");
   }

   public void setTipoInicia(String tipoInicia) {
        markAsChanged("TIPOINICIA", tipoInicia);
   }

   public String getTipoProc() {
        return this.getVo().asString("TIPOPROC");
   }

   public void setTipoProc(String tipoProc) {
        markAsChanged("TIPOPROC", tipoProc);
   }

   public BigDecimal getVersao() {
        return this.getVo().asBigDecimal("VERSAO");
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
   }

   public char[] getXmlBpmn() {
        return this.getVo().asClob("XMLBPMN");
   }

   public void setXmlBpmn(char[] xmlBpmn) {
        markAsChanged("XMLBPMN", xmlBpmn);
   }

   public BigDecimal getPercDesvioInf() {
        return this.getVo().asBigDecimal("PERCDESVIOINF");
   }

   public void setPercDesvioInf(BigDecimal percDesvioInf) {
        markAsChanged("PERCDESVIOINF", percDesvioInf);
   }

   public BigDecimal getPercDesvioSup() {
        return this.getVo().asBigDecimal("PERCDESVIOSUP");
   }

   public void setPercDesvioSup(BigDecimal percDesvioSup) {
        markAsChanged("PERCDESVIOSUP", percDesvioSup);
   }

   public String getProcReparo() {
        return this.getVo().asString("PROCREPARO");
   }

   public void setProcReparo(String procReparo) {
        markAsChanged("PROCREPARO", procReparo);
   }

   public String getExigePedido() {
        return this.getVo().asString("EXIGEPEDIDO");
   }

   public void setExigePedido(String exigePedido) {
        markAsChanged("EXIGEPEDIDO", exigePedido);
   }

   public String getValidaVersao() {
        return this.getVo().asString("VALIDAVERSAO");
   }

   public void setValidaVersao(String validaVersao) {
        markAsChanged("VALIDAVERSAO", validaVersao);
   }

   public String getProdParaTerceiro() {
        return this.getVo().asString("PRODPARATERCEIRO");
   }

   public void setProdParaTerceiro(String prodParaTerceiro) {
        markAsChanged("PRODPARATERCEIRO", prodParaTerceiro);
   }

   public String getLiberaDesvio() {
        return this.getVo().asString("LIBERADESVIO");
   }

   public void setLiberaDesvio(String liberaDesvio) {
        markAsChanged("LIBERADESVIO", liberaDesvio);
   }

   public String getLoteCuringa() {
        return this.getVo().asString("LOTECURINGA");
   }

   public void setLoteCuringa(String loteCuringa) {
        markAsChanged("LOTECURINGA", loteCuringa);
   }

   public String getPadraoProduto() {
        return this.getVo().asString("PADRAOPRODUTO");
   }

   public void setPadraoProduto(String padraoProduto) {
        markAsChanged("PADRAOPRODUTO", padraoProduto);
   }

   public String getUsaLoteCuringa() {
        return this.getVo().asString("USALOTECURINGA");
   }

   public void setUsaLoteCuringa(String usaLoteCuringa) {
        markAsChanged("USALOTECURINGA", usaLoteCuringa);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getIdFormula() {
        return this.getVo().asBigDecimal("IDFORMULA");
   }

   public void setIdFormula(BigDecimal idFormula) {
        markAsChanged("IDFORMULA", idFormula);
   }

   public String getMascNroLoteSp() {
        return this.getVo().asString("MASCNROLOTESP");
   }

   public void setMascNroLoteSp(String mascNroLoteSp) {
        markAsChanged("MASCNROLOTESP", mascNroLoteSp);
   }

   public String getTipoFragNroLoteSp() {
        return this.getVo().asString("TIPOFRAGNROLOTESP");
   }

   public void setTipoFragNroLoteSp(String tipoFragNroLoteSp) {
        markAsChanged("TIPOFRAGNROLOTESP", tipoFragNroLoteSp);
   }

   public String getTipoNroLoteSp() {
        return this.getVo().asString("TIPONROLOTESP");
   }

   public void setTipoNroLoteSp(String tipoNroLoteSp) {
        markAsChanged("TIPONROLOTESP", tipoNroLoteSp);
   }

   public String getUsaConfNroLoteSp() {
        return this.getVo().asString("USACONFNROLOTESP");
   }

   public void setUsaConfNroLoteSp(String usaConfNroLoteSp) {
        markAsChanged("USACONFNROLOTESP", usaConfNroLoteSp);
   }

   public char[] getXmlBpmnUi() {
        return this.getVo().asClob("XMLBPMNUI");
   }

   public void setXmlBpmnUi(char[] xmlBpmnUi) {
        markAsChanged("XMLBPMNUI", xmlBpmnUi);
   }

   public String getPerEdicao() {
        return this.getVo().asString("PEREDICAO");
   }

   public void setPerEdicao(String perEdicao) {
        markAsChanged("PEREDICAO", perEdicao);
   }

   public BigDecimal getQtdDias() {
        return this.getVo().asBigDecimal("QTDDIAS");
   }

   public void setQtdDias(BigDecimal qtdDias) {
        markAsChanged("QTDDIAS", qtdDias);
   }

   public String getRoteiroHtml5() {
        return this.getVo().asString("ROTEIROHTML5");
   }

   public void setRoteiroHtml5(String roteiroHtml5) {
        markAsChanged("ROTEIROHTML5", roteiroHtml5);
   }

   public String getTipExecAtv() {
        return this.getVo().asString("TIPEXECATV");
   }

   public void setTipExecAtv(String tipExecAtv) {
        markAsChanged("TIPEXECATV", tipExecAtv);
   }

   public BigDecimal getVersaoAnt() {
        return this.getVo().asBigDecimal("VERSAOANT");
   }

   public void setVersaoAnt(BigDecimal versaoAnt) {
        markAsChanged("VERSAOANT", versaoAnt);
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
        return this;
   }
}
