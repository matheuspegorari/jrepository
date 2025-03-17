package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImpostoRastreamentoEstoque implements SankhyaEntity<ImpostoRastreamentoEstoque> {

   private BigDecimal baseStFcpIntAnt;
   private BigDecimal baseSubst;
   private BigDecimal codEmp;
   private BigDecimal codProd;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private String digitado;
   private BigDecimal nuNota;
   private BigDecimal nuNotaCompra;
   private BigDecimal percStFcpIntAnt;
   private BigDecimal qtdNeg;
   private BigDecimal sequencia;
   private BigDecimal sequenciaCompra;
   private BigDecimal vlrIcms;
   private BigDecimal vlrStFcpIntAnt;
   private BigDecimal vlrSubst;
   private BigDecimal percSubst;
   private BigDecimal codCfo;
   private Timestamp dtNeg;
   private String tipMov;

   public BigDecimal getBaseStFcpIntAnt() {
        return baseStFcpIntAnt;
   }

   public void setBaseStFcpIntAnt(BigDecimal baseStFcpIntAnt) {
        this.baseStFcpIntAnt = baseStFcpIntAnt;
   }

   public BigDecimal getBaseSubst() {
        return baseSubst;
   }

   public void setBaseSubst(BigDecimal baseSubst) {
        this.baseSubst = baseSubst;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getNuNotaCompra() {
        return nuNotaCompra;
   }

   public void setNuNotaCompra(BigDecimal nuNotaCompra) {
        this.nuNotaCompra = nuNotaCompra;
   }

   public BigDecimal getPercStFcpIntAnt() {
        return percStFcpIntAnt;
   }

   public void setPercStFcpIntAnt(BigDecimal percStFcpIntAnt) {
        this.percStFcpIntAnt = percStFcpIntAnt;
   }

   public BigDecimal getQtdNeg() {
        return qtdNeg;
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        this.qtdNeg = qtdNeg;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getSequenciaCompra() {
        return sequenciaCompra;
   }

   public void setSequenciaCompra(BigDecimal sequenciaCompra) {
        this.sequenciaCompra = sequenciaCompra;
   }

   public BigDecimal getVlrIcms() {
        return vlrIcms;
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        this.vlrIcms = vlrIcms;
   }

   public BigDecimal getVlrStFcpIntAnt() {
        return vlrStFcpIntAnt;
   }

   public void setVlrStFcpIntAnt(BigDecimal vlrStFcpIntAnt) {
        this.vlrStFcpIntAnt = vlrStFcpIntAnt;
   }

   public BigDecimal getVlrSubst() {
        return vlrSubst;
   }

   public void setVlrSubst(BigDecimal vlrSubst) {
        this.vlrSubst = vlrSubst;
   }

   public BigDecimal getPercSubst() {
        return percSubst;
   }

   public void setPercSubst(BigDecimal percSubst) {
        this.percSubst = percSubst;
   }

   public BigDecimal getCodCfo() {
        return codCfo;
   }

   public void setCodCfo(BigDecimal codCfo) {
        this.codCfo = codCfo;
   }

   public Timestamp getDtNeg() {
        return dtNeg;
   }

   public void setDtNeg(Timestamp dtNeg) {
        this.dtNeg = dtNeg;
   }

   public String getTipMov() {
        return tipMov;
   }

   public void setTipMov(String tipMov) {
        this.tipMov = tipMov;
   }

   @Override
   public String getEntityName() {
        return "ImpostoRastreamentoEstoque";
   }

   @Override
   public ImpostoRastreamentoEstoque fromVO(DynamicVO vo) {
        this.baseStFcpIntAnt = vo.asBigDecimal("BASESTFCPINTANT");
        this.baseSubst = vo.asBigDecimal("BASESUBST");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.digitado = vo.asString("DIGITADO");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuNotaCompra = vo.asBigDecimal("NUNOTACOMPRA");
        this.percStFcpIntAnt = vo.asBigDecimal("PERCSTFCPINTANT");
        this.qtdNeg = vo.asBigDecimal("QTDNEG");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.sequenciaCompra = vo.asBigDecimal("SEQUENCIACOMPRA");
        this.vlrIcms = vo.asBigDecimal("VLRICMS");
        this.vlrStFcpIntAnt = vo.asBigDecimal("VLRSTFCPINTANT");
        this.vlrSubst = vo.asBigDecimal("VLRSUBST");
        this.percSubst = vo.asBigDecimal("PERCSUBST");
        this.codCfo = vo.asBigDecimal("CODCFO");
        this.dtNeg = vo.asTimestamp("DTNEG");
        this.tipMov = vo.asString("TIPMOV");
        return this;
   }
}
