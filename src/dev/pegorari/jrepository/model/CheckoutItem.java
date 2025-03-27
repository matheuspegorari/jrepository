package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CheckoutItem extends AbstractSankhyaEntity<CheckoutItem> {
   public BigDecimal getNuKc() {
        return this.getVo().asBigDecimal("NUCKC");
   }

   public void setNuKc(BigDecimal nuKc) {
        markAsChanged("NUCKC", nuKc);
   }

   public BigDecimal getNuPromocao() {
        return this.getVo().asBigDecimal("NUPROMOCAO");
   }

   public void setNuPromocao(BigDecimal nuPromocao) {
        markAsChanged("NUPROMOCAO", nuPromocao);
   }

   public BigDecimal getNuTab() {
        return this.getVo().asBigDecimal("NUTAB");
   }

   public void setNuTab(BigDecimal nuTab) {
        markAsChanged("NUTAB", nuTab);
   }

   public BigDecimal getPercDesc() {
        return this.getVo().asBigDecimal("PERCDESC");
   }

   public void setPercDesc(BigDecimal percDesc) {
        markAsChanged("PERCDESC", percDesc);
   }

   public BigDecimal getPrecoBase() {
        return this.getVo().asBigDecimal("PRECOBASE");
   }

   public void setPrecoBase(BigDecimal precoBase) {
        markAsChanged("PRECOBASE", precoBase);
   }

   public BigDecimal getQtdNeg() {
        return this.getVo().asBigDecimal("QTDNEG");
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        markAsChanged("QTDNEG", qtdNeg);
   }

   public BigDecimal getSeqCki() {
        return this.getVo().asBigDecimal("SEQCKI");
   }

   public void setSeqCki(BigDecimal seqCki) {
        markAsChanged("SEQCKI", seqCki);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public String getUsoProd() {
        return this.getVo().asString("USOPROD");
   }

   public void setUsoProd(String usoProd) {
        markAsChanged("USOPROD", usoProd);
   }

   public BigDecimal getVlrDesc() {
        return this.getVo().asBigDecimal("VLRDESC");
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        markAsChanged("VLRDESC", vlrDesc);
   }

   public BigDecimal getVlrTot() {
        return this.getVo().asBigDecimal("VLRTOT");
   }

   public void setVlrTot(BigDecimal vlrTot) {
        markAsChanged("VLRTOT", vlrTot);
   }

   public BigDecimal getVlrTotLiq() {
        return this.getVo().asBigDecimal("VLRTOTLIQ");
   }

   public void setVlrTotLiq(BigDecimal vlrTotLiq) {
        markAsChanged("VLRTOTLIQ", vlrTotLiq);
   }

   public BigDecimal getVlrUnit() {
        return this.getVo().asBigDecimal("VLRUNIT");
   }

   public void setVlrUnit(BigDecimal vlrUnit) {
        markAsChanged("VLRUNIT", vlrUnit);
   }

   public String getMensagem() {
        return this.getVo().asString("MENSAGEM");
   }

   public void setMensagem(String mensagem) {
        markAsChanged("MENSAGEM", mensagem);
   }

   public String getCodBarra() {
        return this.getVo().asString("CODBARRA");
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
   }

   public BigDecimal getCodLocalOrig() {
        return this.getVo().asBigDecimal("CODLOCALORIG");
   }

   public void setCodLocalOrig(BigDecimal codLocalOrig) {
        markAsChanged("CODLOCALORIG", codLocalOrig);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public BigDecimal getBaseIcms() {
        return this.getVo().asBigDecimal("BASEICMS");
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        markAsChanged("BASEICMS", baseIcms);
   }

   public BigDecimal getBaseIpi() {
        return this.getVo().asBigDecimal("BASEIPI");
   }

   public void setBaseIpi(BigDecimal baseIpi) {
        markAsChanged("BASEIPI", baseIpi);
   }

   public BigDecimal getBaseIss() {
        return this.getVo().asBigDecimal("BASEISS");
   }

   public void setBaseIss(BigDecimal baseIss) {
        markAsChanged("BASEISS", baseIss);
   }

   public BigDecimal getBaseSubstit() {
        return this.getVo().asBigDecimal("BASESUBSTIT");
   }

   public void setBaseSubstit(BigDecimal baseSubstit) {
        markAsChanged("BASESUBSTIT", baseSubstit);
   }

   public BigDecimal getVlrIcms() {
        return this.getVo().asBigDecimal("VLRICMS");
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
   }

   public BigDecimal getVlrIpi() {
        return this.getVo().asBigDecimal("VLRIPI");
   }

   public void setVlrIpi(BigDecimal vlrIpi) {
        markAsChanged("VLRIPI", vlrIpi);
   }

   public BigDecimal getVlrIss() {
        return this.getVo().asBigDecimal("VLRISS");
   }

   public void setVlrIss(BigDecimal vlrIss) {
        markAsChanged("VLRISS", vlrIss);
   }

   public BigDecimal getVlrSubst() {
        return this.getVo().asBigDecimal("VLRSUBST");
   }

   public void setVlrSubst(BigDecimal vlrSubst) {
        markAsChanged("VLRSUBST", vlrSubst);
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
        this.setVo(vo);
        return this;
   }
}
