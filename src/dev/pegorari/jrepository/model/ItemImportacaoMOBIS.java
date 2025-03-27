package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemImportacaoMOBIS extends AbstractSankhyaEntity<ItemImportacaoMOBIS> {
   public String getInvoiceNumber() {
        return this.getVo().asString("INVOICENUMBER");
   }

   public void setInvoiceNumber(String invoiceNumber) {
        markAsChanged("INVOICENUMBER", invoiceNumber);
   }

   public char[] getMsg() {
        return this.getVo().asClob("MSG");
   }

   public void setMsg(char[] msg) {
        markAsChanged("MSG", msg);
   }

   public BigDecimal getNuImp() {
        return this.getVo().asBigDecimal("NUIMP");
   }

   public void setNuImp(BigDecimal nuImp) {
        markAsChanged("NUIMP", nuImp);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getOrderNumber() {
        return this.getVo().asString("ORDERNUMBER");
   }

   public void setOrderNumber(String orderNumber) {
        markAsChanged("ORDERNUMBER", orderNumber);
   }

   public BigDecimal getSeqImp() {
        return this.getVo().asBigDecimal("SEQIMP");
   }

   public void setSeqImp(BigDecimal seqImp) {
        markAsChanged("SEQIMP", seqImp);
   }

   public char[] getLog() {
        return this.getVo().asClob("LOG");
   }

   public void setLog(char[] log) {
        markAsChanged("LOG", log);
   }

   public String getImpStatus() {
        return this.getVo().asString("IMPSTATUS");
   }

   public void setImpStatus(String impStatus) {
        markAsChanged("IMPSTATUS", impStatus);
   }

   @Override
   public String getTableName() {
        return "TGFIIMPMOBIS";
   }

   @Override
   public String getEntityName() {
        return "ItemImportacaoMOBIS";
   }

   @Override
   public ItemImportacaoMOBIS fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
