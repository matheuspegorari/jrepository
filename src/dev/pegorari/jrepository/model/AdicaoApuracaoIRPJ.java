package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AdicaoApuracaoIRPJ extends AbstractSankhyaEntity<AdicaoApuracaoIRPJ> {
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
        markAsChanged("CODCTACTB", codCtaCtb);
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public String getCtaCtb() {
        return ctaCtb;
   }

   public void setCtaCtb(String ctaCtb) {
        markAsChanged("CTACTB", ctaCtb);
        this.ctaCtb = ctaCtb;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
        this.digitado = digitado;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public String getTipoImposto() {
        return tipoImposto;
   }

   public void setTipoImposto(String tipoImposto) {
        markAsChanged("TIPOIMPOSTO", tipoImposto);
        this.tipoImposto = tipoImposto;
   }

   public BigDecimal getVlrLanc() {
        return vlrLanc;
   }

   public void setVlrLanc(BigDecimal vlrLanc) {
        markAsChanged("VLRLANC", vlrLanc);
        this.vlrLanc = vlrLanc;
   }

   @Override
   public String getTableName() {
        return "TCBIRPJAD";
   }

   @Override
   public String getEntityName() {
        return "AdicaoApuracaoIRPJ";
   }

   @Override
   public AdicaoApuracaoIRPJ fromVO(DynamicVO vo) {
        this.setVo(vo);
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
