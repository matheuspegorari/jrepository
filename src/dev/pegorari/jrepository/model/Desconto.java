package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Desconto extends AbstractSankhyaEntity<Desconto> {
   private String avisarVct;
   private BigDecimal codEmp;
   private BigDecimal codLocal;
   private BigDecimal codParc;
   private Timestamp dtInicial;
   private String grupoDescParc;
   private String grupoDescProd;
   private String grupoDescVend;
   private BigDecimal nuPromocao;
   private BigDecimal percDescBonif;
   private BigDecimal percentual;
   private String tipGrupo;
   private String tipPromocao;
   private String usaDescQtd;
   private BigDecimal vlrDesc;
   private BigDecimal vlrVenda;
   private BigDecimal codProd;
   private BigDecimal codTab;
   private BigDecimal codVend;
   private Timestamp dtFinal;
   private String tipGrupoProd;
   private String descrPromocao;
   private String liquidacao;
   private String aplicDescPorLocal;
   private String usaDescCtrl;
   private String controle;
   private String codVol;
   private String atNuVersao;
   private BigDecimal nuVersao;
   private String usaDescEsp;

   public String getAvisarVct() {
        return avisarVct;
   }

   public void setAvisarVct(String avisarVct) {
        markAsChanged("AVISARVCT", avisarVct);
        this.avisarVct = avisarVct;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public Timestamp getDtInicial() {
        return dtInicial;
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
        this.dtInicial = dtInicial;
   }

   public String getGrupoDescParc() {
        return grupoDescParc;
   }

   public void setGrupoDescParc(String grupoDescParc) {
        markAsChanged("GRUPODESCPARC", grupoDescParc);
        this.grupoDescParc = grupoDescParc;
   }

   public String getGrupoDescProd() {
        return grupoDescProd;
   }

   public void setGrupoDescProd(String grupoDescProd) {
        markAsChanged("GRUPODESCPROD", grupoDescProd);
        this.grupoDescProd = grupoDescProd;
   }

   public String getGrupoDescVend() {
        return grupoDescVend;
   }

   public void setGrupoDescVend(String grupoDescVend) {
        markAsChanged("GRUPODESCVEND", grupoDescVend);
        this.grupoDescVend = grupoDescVend;
   }

   public BigDecimal getNuPromocao() {
        return nuPromocao;
   }

   public void setNuPromocao(BigDecimal nuPromocao) {
        markAsChanged("NUPROMOCAO", nuPromocao);
        this.nuPromocao = nuPromocao;
   }

   public BigDecimal getPercDescBonif() {
        return percDescBonif;
   }

   public void setPercDescBonif(BigDecimal percDescBonif) {
        markAsChanged("PERCDESCBONIF", percDescBonif);
        this.percDescBonif = percDescBonif;
   }

   public BigDecimal getPercentual() {
        return percentual;
   }

   public void setPercentual(BigDecimal percentual) {
        markAsChanged("PERCENTUAL", percentual);
        this.percentual = percentual;
   }

   public String getTipGrupo() {
        return tipGrupo;
   }

   public void setTipGrupo(String tipGrupo) {
        markAsChanged("TIPGRUPO", tipGrupo);
        this.tipGrupo = tipGrupo;
   }

   public String getTipPromocao() {
        return tipPromocao;
   }

   public void setTipPromocao(String tipPromocao) {
        markAsChanged("TIPPROMOCAO", tipPromocao);
        this.tipPromocao = tipPromocao;
   }

   public String getUsaDescQtd() {
        return usaDescQtd;
   }

   public void setUsaDescQtd(String usaDescQtd) {
        markAsChanged("USADESCQTD", usaDescQtd);
        this.usaDescQtd = usaDescQtd;
   }

   public BigDecimal getVlrDesc() {
        return vlrDesc;
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        markAsChanged("VLRDESC", vlrDesc);
        this.vlrDesc = vlrDesc;
   }

   public BigDecimal getVlrVenda() {
        return vlrVenda;
   }

   public void setVlrVenda(BigDecimal vlrVenda) {
        markAsChanged("VLRVENDA", vlrVenda);
        this.vlrVenda = vlrVenda;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodTab() {
        return codTab;
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
        this.codTab = codTab;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
        this.codVend = codVend;
   }

   public Timestamp getDtFinal() {
        return dtFinal;
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
        this.dtFinal = dtFinal;
   }

   public String getTipGrupoProd() {
        return tipGrupoProd;
   }

   public void setTipGrupoProd(String tipGrupoProd) {
        markAsChanged("TIPGRUPOPROD", tipGrupoProd);
        this.tipGrupoProd = tipGrupoProd;
   }

   public String getDescrPromocao() {
        return descrPromocao;
   }

   public void setDescrPromocao(String descrPromocao) {
        markAsChanged("DESCRPROMOCAO", descrPromocao);
        this.descrPromocao = descrPromocao;
   }

   public String getLiquidacao() {
        return liquidacao;
   }

   public void setLiquidacao(String liquidacao) {
        markAsChanged("LIQUIDACAO", liquidacao);
        this.liquidacao = liquidacao;
   }

   public String getAplicDescPorLocal() {
        return aplicDescPorLocal;
   }

   public void setAplicDescPorLocal(String aplicDescPorLocal) {
        markAsChanged("APLICDESCPORLOCAL", aplicDescPorLocal);
        this.aplicDescPorLocal = aplicDescPorLocal;
   }

   public String getUsaDescCtrl() {
        return usaDescCtrl;
   }

   public void setUsaDescCtrl(String usaDescCtrl) {
        markAsChanged("USADESCCTRL", usaDescCtrl);
        this.usaDescCtrl = usaDescCtrl;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public String getAtNuVersao() {
        return atNuVersao;
   }

   public void setAtNuVersao(String atNuVersao) {
        markAsChanged("ATUNUVERSAO", atNuVersao);
        this.atNuVersao = atNuVersao;
   }

   public BigDecimal getNuVersao() {
        return nuVersao;
   }

   public void setNuVersao(BigDecimal nuVersao) {
        markAsChanged("NUVERSAO", nuVersao);
        this.nuVersao = nuVersao;
   }

   public String getUsaDescEsp() {
        return usaDescEsp;
   }

   public void setUsaDescEsp(String usaDescEsp) {
        markAsChanged("USADESCESP", usaDescEsp);
        this.usaDescEsp = usaDescEsp;
   }

   @Override
   public String getTableName() {
        return "TGFDES";
   }

   @Override
   public String getEntityName() {
        return "Desconto";
   }

   @Override
   public Desconto fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.avisarVct = vo.asString("AVISARVCT");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.grupoDescParc = vo.asString("GRUPODESCPARC");
        this.grupoDescProd = vo.asString("GRUPODESCPROD");
        this.grupoDescVend = vo.asString("GRUPODESCVEND");
        this.nuPromocao = vo.asBigDecimal("NUPROMOCAO");
        this.percDescBonif = vo.asBigDecimal("PERCDESCBONIF");
        this.percentual = vo.asBigDecimal("PERCENTUAL");
        this.tipGrupo = vo.asString("TIPGRUPO");
        this.tipPromocao = vo.asString("TIPPROMOCAO");
        this.usaDescQtd = vo.asString("USADESCQTD");
        this.vlrDesc = vo.asBigDecimal("VLRDESC");
        this.vlrVenda = vo.asBigDecimal("VLRVENDA");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codTab = vo.asBigDecimal("CODTAB");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.tipGrupoProd = vo.asString("TIPGRUPOPROD");
        this.descrPromocao = vo.asString("DESCRPROMOCAO");
        this.liquidacao = vo.asString("LIQUIDACAO");
        this.aplicDescPorLocal = vo.asString("APLICDESCPORLOCAL");
        this.usaDescCtrl = vo.asString("USADESCCTRL");
        this.controle = vo.asString("CONTROLE");
        this.codVol = vo.asString("CODVOL");
        this.atNuVersao = vo.asString("ATUNUVERSAO");
        this.nuVersao = vo.asBigDecimal("NUVERSAO");
        this.usaDescEsp = vo.asString("USADESCESP");
        return this;
   }
}
