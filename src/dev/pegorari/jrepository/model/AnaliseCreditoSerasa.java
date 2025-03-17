package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AnaliseCreditoSerasa implements SankhyaEntity<AnaliseCreditoSerasa> {

   private String urlEnvio;
   private BigDecimal codUsu;
   private Timestamp dhConsulta;
   private BigDecimal nuConsulta;
   private BigDecimal codPap;
   private char[] resposta;
   private String documento;
   private BigDecimal codParc;
   private Timestamp dtLimite;

   public String getUrlEnvio() {
        return urlEnvio;
   }

   public void setUrlEnvio(String urlEnvio) {
        this.urlEnvio = urlEnvio;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhConsulta() {
        return dhConsulta;
   }

   public void setDhConsulta(Timestamp dhConsulta) {
        this.dhConsulta = dhConsulta;
   }

   public BigDecimal getNuConsulta() {
        return nuConsulta;
   }

   public void setNuConsulta(BigDecimal nuConsulta) {
        this.nuConsulta = nuConsulta;
   }

   public BigDecimal getCodPap() {
        return codPap;
   }

   public void setCodPap(BigDecimal codPap) {
        this.codPap = codPap;
   }

   public char[] getResposta() {
        return resposta;
   }

   public void setResposta(char[] resposta) {
        this.resposta = resposta;
   }

   public String getDocumento() {
        return documento;
   }

   public void setDocumento(String documento) {
        this.documento = documento;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public Timestamp getDtLimite() {
        return dtLimite;
   }

   public void setDtLimite(Timestamp dtLimite) {
        this.dtLimite = dtLimite;
   }

   @Override
   public String getEntityName() {
        return "AnaliseCreditoSerasa";
   }

   @Override
   public AnaliseCreditoSerasa fromVO(DynamicVO vo) {
        this.urlEnvio = vo.asString("URLENVIO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhConsulta = vo.asTimestamp("DHCONSULTA");
        this.nuConsulta = vo.asBigDecimal("NUCONSULTA");
        this.codPap = vo.asBigDecimal("CODPAP");
        this.resposta = vo.asClob("RESPOSTA");
        this.documento = vo.asString("DOCUMENTO");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.dtLimite = vo.asTimestamp("DTLIMITE");
        return this;
   }
}
