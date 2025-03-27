package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Processo extends AbstractSankhyaEntity<Processo> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhFim() {
        return this.getVo().asTimestamp("DHFIM");
   }

   public void setDhFim(Timestamp dhFim) {
        markAsChanged("DHFIM", dhFim);
   }

   public Timestamp getDhIni() {
        return this.getVo().asTimestamp("DHINI");
   }

   public void setDhIni(Timestamp dhIni) {
        markAsChanged("DHINI", dhIni);
   }

   public String getIdProc() {
        return this.getVo().asString("IDPROC");
   }

   public void setIdProc(String idProc) {
        markAsChanged("IDPROC", idProc);
   }

   public char[] getMsgResult() {
        return this.getVo().asClob("MSGRESULT");
   }

   public void setMsgResult(char[] msgResult) {
        markAsChanged("MSGRESULT", msgResult);
   }

   public BigDecimal getNroUnico() {
        return this.getVo().asBigDecimal("NROUNICO");
   }

   public void setNroUnico(BigDecimal nroUnico) {
        markAsChanged("NROUNICO", nroUnico);
   }

   public String getParams() {
        return this.getVo().asString("PARAMS");
   }

   public void setParams(String params) {
        markAsChanged("PARAMS", params);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public char[] getXmlResult() {
        return this.getVo().asClob("XMLRESULT");
   }

   public void setXmlResult(char[] xmlResult) {
        markAsChanged("XMLRESULT", xmlResult);
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
        this.setVo(vo);
        return this;
   }
}
