package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EvtLoteReinf extends AbstractSankhyaEntity<EvtLoteReinf> {
   private Timestamp dhInc;
   private Timestamp dhPrevConsulta;
   private char[] msg;
   private String nroProtLote;
   private BigDecimal nuLote;
   private String status;
   private char[] xmlEnvLote;
   private char[] xmlRetLote;
   private BigDecimal tpAmb;

   public Timestamp getDhInc() {
        return dhInc;
   }

   public void setDhInc(Timestamp dhInc) {
        this.dhInc = dhInc;
   }

   public Timestamp getDhPrevConsulta() {
        return dhPrevConsulta;
   }

   public void setDhPrevConsulta(Timestamp dhPrevConsulta) {
        this.dhPrevConsulta = dhPrevConsulta;
   }

   public char[] getMsg() {
        return msg;
   }

   public void setMsg(char[] msg) {
        this.msg = msg;
   }

   public String getNroProtLote() {
        return nroProtLote;
   }

   public void setNroProtLote(String nroProtLote) {
        this.nroProtLote = nroProtLote;
   }

   public BigDecimal getNuLote() {
        return nuLote;
   }

   public void setNuLote(BigDecimal nuLote) {
        this.nuLote = nuLote;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        this.status = status;
   }

   public char[] getXmlEnvLote() {
        return xmlEnvLote;
   }

   public void setXmlEnvLote(char[] xmlEnvLote) {
        this.xmlEnvLote = xmlEnvLote;
   }

   public char[] getXmlRetLote() {
        return xmlRetLote;
   }

   public void setXmlRetLote(char[] xmlRetLote) {
        this.xmlRetLote = xmlRetLote;
   }

   public BigDecimal getTpAmb() {
        return tpAmb;
   }

   public void setTpAmb(BigDecimal tpAmb) {
        this.tpAmb = tpAmb;
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
        this.dhInc = vo.asTimestamp("DHINC");
        this.dhPrevConsulta = vo.asTimestamp("DHPREVCONSULTA");
        this.msg = vo.asClob("MSG");
        this.nroProtLote = vo.asString("NROPROTLOTE");
        this.nuLote = vo.asBigDecimal("NULOTE");
        this.status = vo.asString("STATUS");
        this.xmlEnvLote = vo.asClob("XMLENVLOTE");
        this.xmlRetLote = vo.asClob("XMLRETLOTE");
        this.tpAmb = vo.asBigDecimal("TPAMB");
        return this;
   }
}
