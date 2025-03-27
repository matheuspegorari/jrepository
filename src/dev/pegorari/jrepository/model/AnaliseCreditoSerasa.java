package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AnaliseCreditoSerasa extends AbstractSankhyaEntity<AnaliseCreditoSerasa> {
   public String getUrlEnvio() {
        return this.getVo().asString("URLENVIO");
   }

   public void setUrlEnvio(String urlEnvio) {
        markAsChanged("URLENVIO", urlEnvio);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhConsulta() {
        return this.getVo().asTimestamp("DHCONSULTA");
   }

   public void setDhConsulta(Timestamp dhConsulta) {
        markAsChanged("DHCONSULTA", dhConsulta);
   }

   public BigDecimal getNuConsulta() {
        return this.getVo().asBigDecimal("NUCONSULTA");
   }

   public void setNuConsulta(BigDecimal nuConsulta) {
        markAsChanged("NUCONSULTA", nuConsulta);
   }

   public BigDecimal getCodPap() {
        return this.getVo().asBigDecimal("CODPAP");
   }

   public void setCodPap(BigDecimal codPap) {
        markAsChanged("CODPAP", codPap);
   }

   public char[] getResposta() {
        return this.getVo().asClob("RESPOSTA");
   }

   public void setResposta(char[] resposta) {
        markAsChanged("RESPOSTA", resposta);
   }

   public String getDocumento() {
        return this.getVo().asString("DOCUMENTO");
   }

   public void setDocumento(String documento) {
        markAsChanged("DOCUMENTO", documento);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public Timestamp getDtLimite() {
        return this.getVo().asTimestamp("DTLIMITE");
   }

   public void setDtLimite(Timestamp dtLimite) {
        markAsChanged("DTLIMITE", dtLimite);
   }

   @Override
   public String getTableName() {
        return "TSERACS";
   }

   @Override
   public String getEntityName() {
        return "AnaliseCreditoSerasa";
   }

   @Override
   public AnaliseCreditoSerasa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
