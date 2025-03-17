package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExclusaoApuracaoIRPJ implements SankhyaEntity<ExclusaoApuracaoIRPJ> {

   private BigDecimal codCtaCtb;
   private BigDecimal codEmp;
   private String ctaCtb;
   private String digitado;
   private Timestamp referencia;
   private String tipoImposto;
   private BigDecimal vlrLanc;

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getCtaCtb() {
        return ctaCtb;
   }

   public void setCtaCtb(String ctaCtb) {
        this.ctaCtb = ctaCtb;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        this.referencia = referencia;
   }

   public String getTipoImposto() {
        return tipoImposto;
   }

   public void setTipoImposto(String tipoImposto) {
        this.tipoImposto = tipoImposto;
   }

   public BigDecimal getVlrLanc() {
        return vlrLanc;
   }

   public void setVlrLanc(BigDecimal vlrLanc) {
        this.vlrLanc = vlrLanc;
   }

   @Override
   public String getEntityName() {
        return "ExclusaoApuracaoIRPJ";
   }

   @Override
   public ExclusaoApuracaoIRPJ fromVO(DynamicVO vo) {
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.ctaCtb = vo.asString("CTACTB");
        this.digitado = vo.asString("DIGITADO");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.tipoImposto = vo.asString("TIPOIMPOSTO");
        this.vlrLanc = vo.asBigDecimal("VLRLANC");
        return this;
   }
}
