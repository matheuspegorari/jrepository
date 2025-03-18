package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CheckoutItem extends AbstractSankhyaEntity<CheckoutItem> {
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
        markAsChanged("NUCKC", nuKc);
        this.nuKc = nuKc;
   }

   public BigDecimal getNuPromocao() {
        return nuPromocao;
   }

   public void setNuPromocao(BigDecimal nuPromocao) {
        markAsChanged("NUPROMOCAO", nuPromocao);
        this.nuPromocao = nuPromocao;
   }

   public BigDecimal getNuTab() {
        return nuTab;
   }

   public void setNuTab(BigDecimal nuTab) {
        markAsChanged("NUTAB", nuTab);
        this.nuTab = nuTab;
   }

   public BigDecimal getPercDesc() {
        return percDesc;
   }

   public void setPercDesc(BigDecimal percDesc) {
        markAsChanged("PERCDESC", percDesc);
        this.percDesc = percDesc;
   }

   public BigDecimal getPrecoBase() {
        return precoBase;
   }

   public void setPrecoBase(BigDecimal precoBase) {
        markAsChanged("PRECOBASE", precoBase);
        this.precoBase = precoBase;
   }

   public BigDecimal getQtdNeg() {
        return qtdNeg;
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        markAsChanged("QTDNEG", qtdNeg);
        this.qtdNeg = qtdNeg;
   }

   public BigDecimal getSeqCki() {
        return seqCki;
   }

   public void setSeqCki(BigDecimal seqCki) {
        markAsChanged("SEQCKI", seqCki);
        this.seqCki = seqCki;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public String getUsoProd() {
        return usoProd;
   }

   public void setUsoProd(String usoProd) {
        markAsChanged("USOPROD", usoProd);
        this.usoProd = usoProd;
   }

   public BigDecimal getVlrDesc() {
        return vlrDesc;
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        markAsChanged("VLRDESC", vlrDesc);
        this.vlrDesc = vlrDesc;
   }

   public BigDecimal getVlrTot() {
        return vlrTot;
   }

   public void setVlrTot(BigDecimal vlrTot) {
        markAsChanged("VLRTOT", vlrTot);
        this.vlrTot = vlrTot;
   }

   public BigDecimal getVlrTotLiq() {
        return vlrTotLiq;
   }

   public void setVlrTotLiq(BigDecimal vlrTotLiq) {
        markAsChanged("VLRTOTLIQ", vlrTotLiq);
        this.vlrTotLiq = vlrTotLiq;
   }

   public BigDecimal getVlrUnit() {
        return vlrUnit;
   }

   public void setVlrUnit(BigDecimal vlrUnit) {
        markAsChanged("VLRUNIT", vlrUnit);
        this.vlrUnit = vlrUnit;
   }

   public String getMensagem() {
        return mensagem;
   }

   public void setMensagem(String mensagem) {
        markAsChanged("MENSAGEM", mensagem);
        this.mensagem = mensagem;
   }

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
        this.codBarra = codBarra;
   }

   public BigDecimal getCodLocalOrig() {
        return codLocalOrig;
   }

   public void setCodLocalOrig(BigDecimal codLocalOrig) {
        markAsChanged("CODLOCALORIG", codLocalOrig);
        this.codLocalOrig = codLocalOrig;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
        this.codVend = codVend;
   }

   public BigDecimal getBaseIcms() {
        return baseIcms;
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        markAsChanged("BASEICMS", baseIcms);
        this.baseIcms = baseIcms;
   }

   public BigDecimal getBaseIpi() {
        return baseIpi;
   }

   public void setBaseIpi(BigDecimal baseIpi) {
        markAsChanged("BASEIPI", baseIpi);
        this.baseIpi = baseIpi;
   }

   public BigDecimal getBaseIss() {
        return baseIss;
   }

   public void setBaseIss(BigDecimal baseIss) {
        markAsChanged("BASEISS", baseIss);
        this.baseIss = baseIss;
   }

   public BigDecimal getBaseSubstit() {
        return baseSubstit;
   }

   public void setBaseSubstit(BigDecimal baseSubstit) {
        markAsChanged("BASESUBSTIT", baseSubstit);
        this.baseSubstit = baseSubstit;
   }

   public BigDecimal getVlrIcms() {
        return vlrIcms;
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
        this.vlrIcms = vlrIcms;
   }

   public BigDecimal getVlrIpi() {
        return vlrIpi;
   }

   public void setVlrIpi(BigDecimal vlrIpi) {
        markAsChanged("VLRIPI", vlrIpi);
        this.vlrIpi = vlrIpi;
   }

   public BigDecimal getVlrIss() {
        return vlrIss;
   }

   public void setVlrIss(BigDecimal vlrIss) {
        markAsChanged("VLRISS", vlrIss);
        this.vlrIss = vlrIss;
   }

   public BigDecimal getVlrSubst() {
        return vlrSubst;
   }

   public void setVlrSubst(BigDecimal vlrSubst) {
        markAsChanged("VLRSUBST", vlrSubst);
        this.vlrSubst = vlrSubst;
   }

   @Override
   public String getTableName() {
        return "TGFCKI";
   }

   @Override
   public String getEntityName() {
        return "CheckoutItem";
   }

   @Override
   public CheckoutItem fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.nuKc = vo.asBigDecimal("NUCKC");
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
