package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CheckoutItem implements SankhyaEntity<CheckoutItem> {

   private BigDecimal nuKc;
   private BigDecimal nuPromocao;
   private BigDecimal nuTab;
   private BigDecimal percDesc;
   private BigDecimal precoBase;
   private BigDecimal qtdNeg;
   private BigDecimal seqCki;
   private String status;
   private String usoProd;
   private BigDecimal vlrDesc;
   private BigDecimal vlrTot;
   private BigDecimal vlrTotLiq;
   private BigDecimal vlrUnit;
   private String mensagem;
   private String codBarra;
   private BigDecimal codLocalOrig;
   private BigDecimal codProd;
   private String codVol;
   private String controle;
   private Timestamp dhAlter;
   private BigDecimal codVend;
   private BigDecimal baseIcms;
   private BigDecimal baseIpi;
   private BigDecimal baseIss;
   private BigDecimal baseSubstit;
   private BigDecimal vlrIcms;
   private BigDecimal vlrIpi;
   private BigDecimal vlrIss;
   private BigDecimal vlrSubst;

   public BigDecimal getNuKc() {
        return nuKc;
   }

   public void setNuKc(BigDecimal nuKc) {
        this.nuKc = nuKc;
   }

   public BigDecimal getNuPromocao() {
        return nuPromocao;
   }

   public void setNuPromocao(BigDecimal nuPromocao) {
        this.nuPromocao = nuPromocao;
   }

   public BigDecimal getNuTab() {
        return nuTab;
   }

   public void setNuTab(BigDecimal nuTab) {
        this.nuTab = nuTab;
   }

   public BigDecimal getPercDesc() {
        return percDesc;
   }

   public void setPercDesc(BigDecimal percDesc) {
        this.percDesc = percDesc;
   }

   public BigDecimal getPrecoBase() {
        return precoBase;
   }

   public void setPrecoBase(BigDecimal precoBase) {
        this.precoBase = precoBase;
   }

   public BigDecimal getQtdNeg() {
        return qtdNeg;
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        this.qtdNeg = qtdNeg;
   }

   public BigDecimal getSeqCki() {
        return seqCki;
   }

   public void setSeqCki(BigDecimal seqCki) {
        this.seqCki = seqCki;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        this.status = status;
   }

   public String getUsoProd() {
        return usoProd;
   }

   public void setUsoProd(String usoProd) {
        this.usoProd = usoProd;
   }

   public BigDecimal getVlrDesc() {
        return vlrDesc;
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        this.vlrDesc = vlrDesc;
   }

   public BigDecimal getVlrTot() {
        return vlrTot;
   }

   public void setVlrTot(BigDecimal vlrTot) {
        this.vlrTot = vlrTot;
   }

   public BigDecimal getVlrTotLiq() {
        return vlrTotLiq;
   }

   public void setVlrTotLiq(BigDecimal vlrTotLiq) {
        this.vlrTotLiq = vlrTotLiq;
   }

   public BigDecimal getVlrUnit() {
        return vlrUnit;
   }

   public void setVlrUnit(BigDecimal vlrUnit) {
        this.vlrUnit = vlrUnit;
   }

   public String getMensagem() {
        return mensagem;
   }

   public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
   }

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
   }

   public BigDecimal getCodLocalOrig() {
        return codLocalOrig;
   }

   public void setCodLocalOrig(BigDecimal codLocalOrig) {
        this.codLocalOrig = codLocalOrig;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        this.codVend = codVend;
   }

   public BigDecimal getBaseIcms() {
        return baseIcms;
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        this.baseIcms = baseIcms;
   }

   public BigDecimal getBaseIpi() {
        return baseIpi;
   }

   public void setBaseIpi(BigDecimal baseIpi) {
        this.baseIpi = baseIpi;
   }

   public BigDecimal getBaseIss() {
        return baseIss;
   }

   public void setBaseIss(BigDecimal baseIss) {
        this.baseIss = baseIss;
   }

   public BigDecimal getBaseSubstit() {
        return baseSubstit;
   }

   public void setBaseSubstit(BigDecimal baseSubstit) {
        this.baseSubstit = baseSubstit;
   }

   public BigDecimal getVlrIcms() {
        return vlrIcms;
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        this.vlrIcms = vlrIcms;
   }

   public BigDecimal getVlrIpi() {
        return vlrIpi;
   }

   public void setVlrIpi(BigDecimal vlrIpi) {
        this.vlrIpi = vlrIpi;
   }

   public BigDecimal getVlrIss() {
        return vlrIss;
   }

   public void setVlrIss(BigDecimal vlrIss) {
        this.vlrIss = vlrIss;
   }

   public BigDecimal getVlrSubst() {
        return vlrSubst;
   }

   public void setVlrSubst(BigDecimal vlrSubst) {
        this.vlrSubst = vlrSubst;
   }

   @Override
   public String getEntityName() {
        return "CheckoutItem";
   }

   @Override
   public CheckoutItem fromVO(DynamicVO vo) {
        this.nuKc = vo.asBigDecimal("NUKC");
        this.nuPromocao = vo.asBigDecimal("NUPROMOCAO");
        this.nuTab = vo.asBigDecimal("NUTAB");
        this.percDesc = vo.asBigDecimal("PERCDESC");
        this.precoBase = vo.asBigDecimal("PRECOBASE");
        this.qtdNeg = vo.asBigDecimal("QTDNEG");
        this.seqCki = vo.asBigDecimal("SEQCKI");
        this.status = vo.asString("STATUS");
        this.usoProd = vo.asString("USOPROD");
        this.vlrDesc = vo.asBigDecimal("VLRDESC");
        this.vlrTot = vo.asBigDecimal("VLRTOT");
        this.vlrTotLiq = vo.asBigDecimal("VLRTOTLIQ");
        this.vlrUnit = vo.asBigDecimal("VLRUNIT");
        this.mensagem = vo.asString("MENSAGEM");
        this.codBarra = vo.asString("CODBARRA");
        this.codLocalOrig = vo.asBigDecimal("CODLOCALORIG");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codVol = vo.asString("CODVOL");
        this.controle = vo.asString("CONTROLE");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.baseIcms = vo.asBigDecimal("BASEICMS");
        this.baseIpi = vo.asBigDecimal("BASEIPI");
        this.baseIss = vo.asBigDecimal("BASEISS");
        this.baseSubstit = vo.asBigDecimal("BASESUBSTIT");
        this.vlrIcms = vo.asBigDecimal("VLRICMS");
        this.vlrIpi = vo.asBigDecimal("VLRIPI");
        this.vlrIss = vo.asBigDecimal("VLRISS");
        this.vlrSubst = vo.asBigDecimal("VLRSUBST");
        return this;
   }
}
