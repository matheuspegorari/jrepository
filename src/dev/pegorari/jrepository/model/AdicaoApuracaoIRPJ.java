package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AdicaoApuracaoIRPJ extends AbstractSankhyaEntity<AdicaoApuracaoIRPJ> {
   public BigDecimal getCodCtaCtb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getCtaCtb() {
        return this.getVo().asString("CTACTB");
   }

   public void setCtaCtb(String ctaCtb) {
        markAsChanged("CTACTB", ctaCtb);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public String getTipoImposto() {
        return this.getVo().asString("TIPOIMPOSTO");
   }

   public void setTipoImposto(String tipoImposto) {
        markAsChanged("TIPOIMPOSTO", tipoImposto);
   }

   public BigDecimal getVlrLanc() {
        return this.getVo().asBigDecimal("VLRLANC");
   }

   public void setVlrLanc(BigDecimal vlrLanc) {
        markAsChanged("VLRLANC", vlrLanc);
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
        return this;
   }
}
