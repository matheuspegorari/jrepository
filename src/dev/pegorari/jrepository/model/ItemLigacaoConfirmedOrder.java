package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemLigacaoConfirmedOrder implements SankhyaEntity<ItemLigacaoConfirmedOrder> {

   private String amendCodeCo;
   private String amendCodeIv;
   private String amendCodeSr;
   private String amendCode;
   private BigDecimal bkOrderQty;
   private Timestamp dtEstDesp;
   private Timestamp dtStatus;
   private String flagCode;
   private String shipMode;
   private BigDecimal shipQty;
   private String sufixoPo;
   private BigDecimal supplanQty;
   private BigDecimal nuNotaCo;
   private BigDecimal nuNotaPo;
   private BigDecimal packQty;
   private BigDecimal procQty;
   private BigDecimal qtdNegOriginal;
   private BigDecimal sequenciaCo;
   private BigDecimal sequenciaPo;
   private String lastInvoice;
   private Timestamp lastShip;

   public String getAmendCodeCo() {
        return amendCodeCo;
   }

   public void setAmendCodeCo(String amendCodeCo) {
        this.amendCodeCo = amendCodeCo;
   }

   public String getAmendCodeIv() {
        return amendCodeIv;
   }

   public void setAmendCodeIv(String amendCodeIv) {
        this.amendCodeIv = amendCodeIv;
   }

   public String getAmendCodeSr() {
        return amendCodeSr;
   }

   public void setAmendCodeSr(String amendCodeSr) {
        this.amendCodeSr = amendCodeSr;
   }

   public String getAmendCode() {
        return amendCode;
   }

   public void setAmendCode(String amendCode) {
        this.amendCode = amendCode;
   }

   public BigDecimal getBkOrderQty() {
        return bkOrderQty;
   }

   public void setBkOrderQty(BigDecimal bkOrderQty) {
        this.bkOrderQty = bkOrderQty;
   }

   public Timestamp getDtEstDesp() {
        return dtEstDesp;
   }

   public void setDtEstDesp(Timestamp dtEstDesp) {
        this.dtEstDesp = dtEstDesp;
   }

   public Timestamp getDtStatus() {
        return dtStatus;
   }

   public void setDtStatus(Timestamp dtStatus) {
        this.dtStatus = dtStatus;
   }

   public String getFlagCode() {
        return flagCode;
   }

   public void setFlagCode(String flagCode) {
        this.flagCode = flagCode;
   }

   public String getShipMode() {
        return shipMode;
   }

   public void setShipMode(String shipMode) {
        this.shipMode = shipMode;
   }

   public BigDecimal getShipQty() {
        return shipQty;
   }

   public void setShipQty(BigDecimal shipQty) {
        this.shipQty = shipQty;
   }

   public String getSufixoPo() {
        return sufixoPo;
   }

   public void setSufixoPo(String sufixoPo) {
        this.sufixoPo = sufixoPo;
   }

   public BigDecimal getSupplanQty() {
        return supplanQty;
   }

   public void setSupplanQty(BigDecimal supplanQty) {
        this.supplanQty = supplanQty;
   }

   public BigDecimal getNuNotaCo() {
        return nuNotaCo;
   }

   public void setNuNotaCo(BigDecimal nuNotaCo) {
        this.nuNotaCo = nuNotaCo;
   }

   public BigDecimal getNuNotaPo() {
        return nuNotaPo;
   }

   public void setNuNotaPo(BigDecimal nuNotaPo) {
        this.nuNotaPo = nuNotaPo;
   }

   public BigDecimal getPackQty() {
        return packQty;
   }

   public void setPackQty(BigDecimal packQty) {
        this.packQty = packQty;
   }

   public BigDecimal getProcQty() {
        return procQty;
   }

   public void setProcQty(BigDecimal procQty) {
        this.procQty = procQty;
   }

   public BigDecimal getQtdNegOriginal() {
        return qtdNegOriginal;
   }

   public void setQtdNegOriginal(BigDecimal qtdNegOriginal) {
        this.qtdNegOriginal = qtdNegOriginal;
   }

   public BigDecimal getSequenciaCo() {
        return sequenciaCo;
   }

   public void setSequenciaCo(BigDecimal sequenciaCo) {
        this.sequenciaCo = sequenciaCo;
   }

   public BigDecimal getSequenciaPo() {
        return sequenciaPo;
   }

   public void setSequenciaPo(BigDecimal sequenciaPo) {
        this.sequenciaPo = sequenciaPo;
   }

   public String getLastInvoice() {
        return lastInvoice;
   }

   public void setLastInvoice(String lastInvoice) {
        this.lastInvoice = lastInvoice;
   }

   public Timestamp getLastShip() {
        return lastShip;
   }

   public void setLastShip(Timestamp lastShip) {
        this.lastShip = lastShip;
   }

   @Override
   public String getEntityName() {
        return "ItemLigacaoConfirmedOrder";
   }

   @Override
   public ItemLigacaoConfirmedOrder fromVO(DynamicVO vo) {
        this.amendCodeCo = vo.asString("AMENDCODECO");
        this.amendCodeIv = vo.asString("AMENDCODEIV");
        this.amendCodeSr = vo.asString("AMENDCODESR");
        this.amendCode = vo.asString("AMENDCODE");
        this.bkOrderQty = vo.asBigDecimal("BKORDERQTY");
        this.dtEstDesp = vo.asTimestamp("DTESTDESP");
        this.dtStatus = vo.asTimestamp("DTSTATUS");
        this.flagCode = vo.asString("FLAGCODE");
        this.shipMode = vo.asString("SHIPMODE");
        this.shipQty = vo.asBigDecimal("SHIPQTY");
        this.sufixoPo = vo.asString("SUFIXOPO");
        this.supplanQty = vo.asBigDecimal("SUPPLANQTY");
        this.nuNotaCo = vo.asBigDecimal("NUNOTACO");
        this.nuNotaPo = vo.asBigDecimal("NUNOTAPO");
        this.packQty = vo.asBigDecimal("PACKQTY");
        this.procQty = vo.asBigDecimal("PROCQTY");
        this.qtdNegOriginal = vo.asBigDecimal("QTDNEGORIGINAL");
        this.sequenciaCo = vo.asBigDecimal("SEQUENCIACO");
        this.sequenciaPo = vo.asBigDecimal("SEQUENCIAPO");
        this.lastInvoice = vo.asString("LASTINVOICE");
        this.lastShip = vo.asTimestamp("LASTSHIP");
        return this;
   }
}
