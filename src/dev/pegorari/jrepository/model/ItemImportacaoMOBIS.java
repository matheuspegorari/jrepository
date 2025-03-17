package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ItemImportacaoMOBIS implements SankhyaEntity<ItemImportacaoMOBIS> {

   private String invoiceNumber;
   private char[] msg;
   private BigDecimal nuImp;
   private BigDecimal nuNota;
   private String orderNumber;
   private BigDecimal seqImp;
   private char[] log;
   private String impStatus;

   public String getInvoiceNumber() {
        return invoiceNumber;
   }

   public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
   }

   public char[] getMsg() {
        return msg;
   }

   public void setMsg(char[] msg) {
        this.msg = msg;
   }

   public BigDecimal getNuImp() {
        return nuImp;
   }

   public void setNuImp(BigDecimal nuImp) {
        this.nuImp = nuImp;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public String getOrderNumber() {
        return orderNumber;
   }

   public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
   }

   public BigDecimal getSeqImp() {
        return seqImp;
   }

   public void setSeqImp(BigDecimal seqImp) {
        this.seqImp = seqImp;
   }

   public char[] getLog() {
        return log;
   }

   public void setLog(char[] log) {
        this.log = log;
   }

   public String getImpStatus() {
        return impStatus;
   }

   public void setImpStatus(String impStatus) {
        this.impStatus = impStatus;
   }

   @Override
   public String getEntityName() {
        return "ItemImportacaoMOBIS";
   }

   @Override
   public ItemImportacaoMOBIS fromVO(DynamicVO vo) {
        this.invoiceNumber = vo.asString("INVOICENUMBER");
        this.msg = vo.asClob("MSG");
        this.nuImp = vo.asBigDecimal("NUIMP");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.orderNumber = vo.asString("ORDERNUMBER");
        this.seqImp = vo.asBigDecimal("SEQIMP");
        this.log = vo.asClob("LOG");
        this.impStatus = vo.asString("IMPSTATUS");
        return this;
   }
}
