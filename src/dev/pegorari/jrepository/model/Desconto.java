package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Desconto extends AbstractSankhyaEntity<Desconto> {
   public String getAvisarVct() {
        return this.getVo().asString("AVISARVCT");
   }

   public void setAvisarVct(String avisarVct) {
        markAsChanged("AVISARVCT", avisarVct);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public Timestamp getDtInicial() {
        return this.getVo().asTimestamp("DTINICIAL");
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
   }

   public String getGrupoDescParc() {
        return this.getVo().asString("GRUPODESCPARC");
   }

   public void setGrupoDescParc(String grupoDescParc) {
        markAsChanged("GRUPODESCPARC", grupoDescParc);
   }

   public String getGrupoDescProd() {
        return this.getVo().asString("GRUPODESCPROD");
   }

   public void setGrupoDescProd(String grupoDescProd) {
        markAsChanged("GRUPODESCPROD", grupoDescProd);
   }

   public String getGrupoDescVend() {
        return this.getVo().asString("GRUPODESCVEND");
   }

   public void setGrupoDescVend(String grupoDescVend) {
        markAsChanged("GRUPODESCVEND", grupoDescVend);
   }

   public BigDecimal getNuPromocao() {
        return this.getVo().asBigDecimal("NUPROMOCAO");
   }

   public void setNuPromocao(BigDecimal nuPromocao) {
        markAsChanged("NUPROMOCAO", nuPromocao);
   }

   public BigDecimal getPercDescBonif() {
        return this.getVo().asBigDecimal("PERCDESCBONIF");
   }

   public void setPercDescBonif(BigDecimal percDescBonif) {
        markAsChanged("PERCDESCBONIF", percDescBonif);
   }

   public BigDecimal getPercentual() {
        return this.getVo().asBigDecimal("PERCENTUAL");
   }

   public void setPercentual(BigDecimal percentual) {
        markAsChanged("PERCENTUAL", percentual);
   }

   public String getTipGrupo() {
        return this.getVo().asString("TIPGRUPO");
   }

   public void setTipGrupo(String tipGrupo) {
        markAsChanged("TIPGRUPO", tipGrupo);
   }

   public String getTipPromocao() {
        return this.getVo().asString("TIPPROMOCAO");
   }

   public void setTipPromocao(String tipPromocao) {
        markAsChanged("TIPPROMOCAO", tipPromocao);
   }

   public String getUsaDescQtd() {
        return this.getVo().asString("USADESCQTD");
   }

   public void setUsaDescQtd(String usaDescQtd) {
        markAsChanged("USADESCQTD", usaDescQtd);
   }

   public BigDecimal getVlrDesc() {
        return this.getVo().asBigDecimal("VLRDESC");
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        markAsChanged("VLRDESC", vlrDesc);
   }

   public BigDecimal getVlrVenda() {
        return this.getVo().asBigDecimal("VLRVENDA");
   }

   public void setVlrVenda(BigDecimal vlrVenda) {
        markAsChanged("VLRVENDA", vlrVenda);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodTab() {
        return this.getVo().asBigDecimal("CODTAB");
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public Timestamp getDtFinal() {
        return this.getVo().asTimestamp("DTFINAL");
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
   }

   public String getTipGrupoProd() {
        return this.getVo().asString("TIPGRUPOPROD");
   }

   public void setTipGrupoProd(String tipGrupoProd) {
        markAsChanged("TIPGRUPOPROD", tipGrupoProd);
   }

   public String getDescrPromocao() {
        return this.getVo().asString("DESCRPROMOCAO");
   }

   public void setDescrPromocao(String descrPromocao) {
        markAsChanged("DESCRPROMOCAO", descrPromocao);
   }

   public String getLiquidacao() {
        return this.getVo().asString("LIQUIDACAO");
   }

   public void setLiquidacao(String liquidacao) {
        markAsChanged("LIQUIDACAO", liquidacao);
   }

   public String getAplicDescPorLocal() {
        return this.getVo().asString("APLICDESCPORLOCAL");
   }

   public void setAplicDescPorLocal(String aplicDescPorLocal) {
        markAsChanged("APLICDESCPORLOCAL", aplicDescPorLocal);
   }

   public String getUsaDescCtrl() {
        return this.getVo().asString("USADESCCTRL");
   }

   public void setUsaDescCtrl(String usaDescCtrl) {
        markAsChanged("USADESCCTRL", usaDescCtrl);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getAtNuVersao() {
        return this.getVo().asString("ATUNUVERSAO");
   }

   public void setAtNuVersao(String atNuVersao) {
        markAsChanged("ATUNUVERSAO", atNuVersao);
   }

   public BigDecimal getNuVersao() {
        return this.getVo().asBigDecimal("NUVERSAO");
   }

   public void setNuVersao(BigDecimal nuVersao) {
        markAsChanged("NUVERSAO", nuVersao);
   }

   public String getUsaDescEsp() {
        return this.getVo().asString("USADESCESP");
   }

   public void setUsaDescEsp(String usaDescEsp) {
        markAsChanged("USADESCESP", usaDescEsp);
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
        return this;
   }
}
