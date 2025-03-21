package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Processo extends AbstractSankhyaEntity<Processo> {
   private BigDecimal codUsu;
   private Timestamp dhFim;
   private Timestamp dhIni;
   private String idProc;
   private char[] msgResult;
   private BigDecimal nroUnico;
   private String params;
   private String status;
   private String tipo;
   private char[] xmlResult;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhFim() {
        return dhFim;
   }

   public void setDhFim(Timestamp dhFim) {
        markAsChanged("DHFIM", dhFim);
        this.dhFim = dhFim;
   }

   public Timestamp getDhIni() {
        return dhIni;
   }

   public void setDhIni(Timestamp dhIni) {
        markAsChanged("DHINI", dhIni);
        this.dhIni = dhIni;
   }

   public String getIdProc() {
        return idProc;
   }

   public void setIdProc(String idProc) {
        markAsChanged("IDPROC", idProc);
        this.idProc = idProc;
   }

   public char[] getMsgResult() {
        return msgResult;
   }

   public void setMsgResult(char[] msgResult) {
        markAsChanged("MSGRESULT", msgResult);
        this.msgResult = msgResult;
   }

   public BigDecimal getNroUnico() {
        return nroUnico;
   }

   public void setNroUnico(BigDecimal nroUnico) {
        markAsChanged("NROUNICO", nroUnico);
        this.nroUnico = nroUnico;
   }

   public String getParams() {
        return params;
   }

   public void setParams(String params) {
        markAsChanged("PARAMS", params);
        this.params = params;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public char[] getXmlResult() {
        return xmlResult;
   }

   public void setXmlResult(char[] xmlResult) {
        markAsChanged("XMLRESULT", xmlResult);
        this.xmlResult = xmlResult;
   }

   @Override
   public String getTableName() {
        return "TGFPRC";
   }

   @Override
   public String getEntityName() {
        return "Processo";
   }

   @Override
   public Processo fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhFim = vo.asTimestamp("DHFIM");
        this.dhIni = vo.asTimestamp("DHINI");
        this.idProc = vo.asString("IDPROC");
        this.msgResult = vo.asClob("MSGRESULT");
        this.nroUnico = vo.asBigDecimal("NROUNICO");
        this.params = vo.asString("PARAMS");
        this.status = vo.asString("STATUS");
        this.tipo = vo.asString("TIPO");
        this.xmlResult = vo.asClob("XMLRESULT");
        return this;
   }
}
