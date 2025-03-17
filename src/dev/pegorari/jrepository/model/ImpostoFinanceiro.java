package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ImpostoFinanceiro extends AbstractSankhyaEntity<ImpostoFinanceiro> {
   private BigDecimal aliquota;
   private BigDecimal base;
   private BigDecimal codImp;
   private String digitado;
   private BigDecimal nuFin;
   private BigDecimal tipImp;
   private BigDecimal valor;
   private BigDecimal percInssEspecial;
   private String tipoInssEspecial;
   private BigDecimal vlrInssEspecial;
   private BigDecimal codNatRend;
   private String codReceita;
   private BigDecimal tpIrrfExt;

   public BigDecimal getAliquota() {
        return aliquota;
   }

   public void setAliquota(BigDecimal aliquota) {
        this.aliquota = aliquota;
   }

   public BigDecimal getBase() {
        return base;
   }

   public void setBase(BigDecimal base) {
        this.base = base;
   }

   public BigDecimal getCodImp() {
        return codImp;
   }

   public void setCodImp(BigDecimal codImp) {
        this.codImp = codImp;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        this.nuFin = nuFin;
   }

   public BigDecimal getTipImp() {
        return tipImp;
   }

   public void setTipImp(BigDecimal tipImp) {
        this.tipImp = tipImp;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        this.valor = valor;
   }

   public BigDecimal getPercInssEspecial() {
        return percInssEspecial;
   }

   public void setPercInssEspecial(BigDecimal percInssEspecial) {
        this.percInssEspecial = percInssEspecial;
   }

   public String getTipoInssEspecial() {
        return tipoInssEspecial;
   }

   public void setTipoInssEspecial(String tipoInssEspecial) {
        this.tipoInssEspecial = tipoInssEspecial;
   }

   public BigDecimal getVlrInssEspecial() {
        return vlrInssEspecial;
   }

   public void setVlrInssEspecial(BigDecimal vlrInssEspecial) {
        this.vlrInssEspecial = vlrInssEspecial;
   }

   public BigDecimal getCodNatRend() {
        return codNatRend;
   }

   public void setCodNatRend(BigDecimal codNatRend) {
        this.codNatRend = codNatRend;
   }

   public String getCodReceita() {
        return codReceita;
   }

   public void setCodReceita(String codReceita) {
        this.codReceita = codReceita;
   }

   public BigDecimal getTpIrrfExt() {
        return tpIrrfExt;
   }

   public void setTpIrrfExt(BigDecimal tpIrrfExt) {
        this.tpIrrfExt = tpIrrfExt;
   }

   @Override
   public String getTableName() {
        return "TGFIMF";
   }

   @Override
   public String getEntityName() {
        return "ImpostoFinanceiro";
   }

   @Override
   public ImpostoFinanceiro fromVO(DynamicVO vo) {
        this.aliquota = vo.asBigDecimal("ALIQUOTA");
        this.base = vo.asBigDecimal("BASE");
        this.codImp = vo.asBigDecimal("CODIMP");
        this.digitado = vo.asString("DIGITADO");
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.tipImp = vo.asBigDecimal("TIPIMP");
        this.valor = vo.asBigDecimal("VALOR");
        this.percInssEspecial = vo.asBigDecimal("PERCINSSESPECIAL");
        this.tipoInssEspecial = vo.asString("TIPOINSSESPECIAL");
        this.vlrInssEspecial = vo.asBigDecimal("VLRINSSESPECIAL");
        this.codNatRend = vo.asBigDecimal("CODNATREND");
        this.codReceita = vo.asString("CODRECEITA");
        this.tpIrrfExt = vo.asBigDecimal("TPIRRFEXT");
        return this;
   }
}
