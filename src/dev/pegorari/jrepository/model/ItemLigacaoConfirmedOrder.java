package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemLigacaoConfirmedOrder extends AbstractSankhyaEntity<ItemLigacaoConfirmedOrder> {
   public String getAmendCodeCo() {
        return this.getVo().asString("AMENDCODECO");
   }

   public void setAmendCodeCo(String amendCodeCo) {
        markAsChanged("AMENDCODECO", amendCodeCo);
   }

   public String getAmendCodeIv() {
        return this.getVo().asString("AMENDCODEIV");
   }

   public void setAmendCodeIv(String amendCodeIv) {
        markAsChanged("AMENDCODEIV", amendCodeIv);
   }

   public String getAmendCodeSr() {
        return this.getVo().asString("AMENDCODESR");
   }

   public void setAmendCodeSr(String amendCodeSr) {
        markAsChanged("AMENDCODESR", amendCodeSr);
   }

   public String getAmendCode() {
        return this.getVo().asString("AMENDCODE");
   }

   public void setAmendCode(String amendCode) {
        markAsChanged("AMENDCODE", amendCode);
   }

   public BigDecimal getBkOrderQty() {
        return this.getVo().asBigDecimal("BKORDERQTY");
   }

   public void setBkOrderQty(BigDecimal bkOrderQty) {
        markAsChanged("BKORDERQTY", bkOrderQty);
   }

   public Timestamp getDtEstDesp() {
        return this.getVo().asTimestamp("DTESTDESP");
   }

   public void setDtEstDesp(Timestamp dtEstDesp) {
        markAsChanged("DTESTDESP", dtEstDesp);
   }

   public Timestamp getDtStatus() {
        return this.getVo().asTimestamp("DTSTATUS");
   }

   public void setDtStatus(Timestamp dtStatus) {
        markAsChanged("DTSTATUS", dtStatus);
   }

   public String getFlagCode() {
        return this.getVo().asString("FLAGCODE");
   }

   public void setFlagCode(String flagCode) {
        markAsChanged("FLAGCODE", flagCode);
   }

   public String getShipMode() {
        return this.getVo().asString("SHIPMODE");
   }

   public void setShipMode(String shipMode) {
        markAsChanged("SHIPMODE", shipMode);
   }

   public BigDecimal getShipQty() {
        return this.getVo().asBigDecimal("SHIPQTY");
   }

   public void setShipQty(BigDecimal shipQty) {
        markAsChanged("SHIPQTY", shipQty);
   }

   public String getSufixoPo() {
        return this.getVo().asString("SUFIXOPO");
   }

   public void setSufixoPo(String sufixoPo) {
        markAsChanged("SUFIXOPO", sufixoPo);
   }

   public BigDecimal getSupplanQty() {
        return this.getVo().asBigDecimal("SUPPLANQTY");
   }

   public void setSupplanQty(BigDecimal supplanQty) {
        markAsChanged("SUPPLANQTY", supplanQty);
   }

   public BigDecimal getNuNotaCo() {
        return this.getVo().asBigDecimal("NUNOTACO");
   }

   public void setNuNotaCo(BigDecimal nuNotaCo) {
        markAsChanged("NUNOTACO", nuNotaCo);
   }

   public BigDecimal getNuNotaPo() {
        return this.getVo().asBigDecimal("NUNOTAPO");
   }

   public void setNuNotaPo(BigDecimal nuNotaPo) {
        markAsChanged("NUNOTAPO", nuNotaPo);
   }

   public BigDecimal getPackQty() {
        return this.getVo().asBigDecimal("PACKQTY");
   }

   public void setPackQty(BigDecimal packQty) {
        markAsChanged("PACKQTY", packQty);
   }

   public BigDecimal getProcQty() {
        return this.getVo().asBigDecimal("PROCQTY");
   }

   public void setProcQty(BigDecimal procQty) {
        markAsChanged("PROCQTY", procQty);
   }

   public BigDecimal getQtdNegOriginal() {
        return this.getVo().asBigDecimal("QTDNEGORIGINAL");
   }

   public void setQtdNegOriginal(BigDecimal qtdNegOriginal) {
        markAsChanged("QTDNEGORIGINAL", qtdNegOriginal);
   }

   public BigDecimal getSequenciaCo() {
        return this.getVo().asBigDecimal("SEQUENCIACO");
   }

   public void setSequenciaCo(BigDecimal sequenciaCo) {
        markAsChanged("SEQUENCIACO", sequenciaCo);
   }

   public BigDecimal getSequenciaPo() {
        return this.getVo().asBigDecimal("SEQUENCIAPO");
   }

   public void setSequenciaPo(BigDecimal sequenciaPo) {
        markAsChanged("SEQUENCIAPO", sequenciaPo);
   }

   public String getLastInvoice() {
        return this.getVo().asString("LASTINVOICE");
   }

   public void setLastInvoice(String lastInvoice) {
        markAsChanged("LASTINVOICE", lastInvoice);
   }

   public Timestamp getLastShip() {
        return this.getVo().asTimestamp("LASTSHIP");
   }

   public void setLastShip(Timestamp lastShip) {
        markAsChanged("LASTSHIP", lastShip);
   }

   @Override
   public String getTableName() {
        return "TGFICO";
   }

   @Override
   public String getEntityName() {
        return "ItemLigacaoConfirmedOrder";
   }

   @Override
   public ItemLigacaoConfirmedOrder fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
