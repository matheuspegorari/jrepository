package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EvtLoteReinf extends AbstractSankhyaEntity<EvtLoteReinf> {
   public Timestamp getDhInc() {
        return this.getVo().asTimestamp("DHINC");
   }

   public void setDhInc(Timestamp dhInc) {
        markAsChanged("DHINC", dhInc);
   }

   public Timestamp getDhPrevConsulta() {
        return this.getVo().asTimestamp("DHPREVCONSULTA");
   }

   public void setDhPrevConsulta(Timestamp dhPrevConsulta) {
        markAsChanged("DHPREVCONSULTA", dhPrevConsulta);
   }

   public char[] getMsg() {
        return this.getVo().asClob("MSG");
   }

   public void setMsg(char[] msg) {
        markAsChanged("MSG", msg);
   }

   public String getNroProtLote() {
        return this.getVo().asString("NROPROTLOTE");
   }

   public void setNroProtLote(String nroProtLote) {
        markAsChanged("NROPROTLOTE", nroProtLote);
   }

   public BigDecimal getNuLote() {
        return this.getVo().asBigDecimal("NULOTE");
   }

   public void setNuLote(BigDecimal nuLote) {
        markAsChanged("NULOTE", nuLote);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public char[] getXmlEnvLote() {
        return this.getVo().asClob("XMLENVLOTE");
   }

   public void setXmlEnvLote(char[] xmlEnvLote) {
        markAsChanged("XMLENVLOTE", xmlEnvLote);
   }

   public char[] getXmlRetLote() {
        return this.getVo().asClob("XMLRETLOTE");
   }

   public void setXmlRetLote(char[] xmlRetLote) {
        markAsChanged("XMLRETLOTE", xmlRetLote);
   }

   public BigDecimal getTpAmb() {
        return this.getVo().asBigDecimal("TPAMB");
   }

   public void setTpAmb(BigDecimal tpAmb) {
        markAsChanged("TPAMB", tpAmb);
   }

   @Override
   public String getTableName() {
        return "EVTLOTEREINF";
   }

   @Override
   public String getEntityName() {
        return "EvtLoteReinf";
   }

   @Override
   public EvtLoteReinf fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
