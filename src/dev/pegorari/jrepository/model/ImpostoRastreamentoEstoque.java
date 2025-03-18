package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImpostoRastreamentoEstoque extends AbstractSankhyaEntity<ImpostoRastreamentoEstoque> {
   private BigDecimal baseStfcpIntAnt;
   private BigDecimal baseSubst;
   private BigDecimal codEmp;
   private BigDecimal codProd;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private String digitado;
   private BigDecimal nuNota;
   private BigDecimal nuNotaCompra;
   private BigDecimal percStfcpIntAnt;
   private BigDecimal qtdNeg;
   private BigDecimal sequencia;
   private BigDecimal sequenciaCompra;
   private BigDecimal vlrIcms;
   private BigDecimal vlrStfcpIntAnt;
   private BigDecimal vlrSubst;
   private BigDecimal percSubst;
   private BigDecimal codCfo;
   private Timestamp dtNeg;
   private String tipMov;

   public BigDecimal getBaseStfcpIntAnt() {
        return baseStfcpIntAnt;
   }

   public void setBaseStfcpIntAnt(BigDecimal baseStfcpIntAnt) {
        markAsChanged("BASESTFCPINTANT", baseStfcpIntAnt);
        this.baseStfcpIntAnt = baseStfcpIntAnt;
   }

   public BigDecimal getBaseSubst() {
        return baseSubst;
   }

   public void setBaseSubst(BigDecimal baseSubst) {
        markAsChanged("BASESUBST", baseSubst);
        this.baseSubst = baseSubst;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
        this.digitado = digitado;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getNuNotaCompra() {
        return nuNotaCompra;
   }

   public void setNuNotaCompra(BigDecimal nuNotaCompra) {
        markAsChanged("NUNOTACOMPRA", nuNotaCompra);
        this.nuNotaCompra = nuNotaCompra;
   }

   public BigDecimal getPercStfcpIntAnt() {
        return percStfcpIntAnt;
   }

   public void setPercStfcpIntAnt(BigDecimal percStfcpIntAnt) {
        markAsChanged("PERCSTFCPINTANT", percStfcpIntAnt);
        this.percStfcpIntAnt = percStfcpIntAnt;
   }

   public BigDecimal getQtdNeg() {
        return qtdNeg;
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        markAsChanged("QTDNEG", qtdNeg);
        this.qtdNeg = qtdNeg;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getSequenciaCompra() {
        return sequenciaCompra;
   }

   public void setSequenciaCompra(BigDecimal sequenciaCompra) {
        markAsChanged("SEQUENCIACOMPRA", sequenciaCompra);
        this.sequenciaCompra = sequenciaCompra;
   }

   public BigDecimal getVlrIcms() {
        return vlrIcms;
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
        this.vlrIcms = vlrIcms;
   }

   public BigDecimal getVlrStfcpIntAnt() {
        return vlrStfcpIntAnt;
   }

   public void setVlrStfcpIntAnt(BigDecimal vlrStfcpIntAnt) {
        markAsChanged("VLRSTFCPINTANT", vlrStfcpIntAnt);
        this.vlrStfcpIntAnt = vlrStfcpIntAnt;
   }

   public BigDecimal getVlrSubst() {
        return vlrSubst;
   }

   public void setVlrSubst(BigDecimal vlrSubst) {
        markAsChanged("VLRSUBST", vlrSubst);
        this.vlrSubst = vlrSubst;
   }

   public BigDecimal getPercSubst() {
        return percSubst;
   }

   public void setPercSubst(BigDecimal percSubst) {
        markAsChanged("PERCSUBST", percSubst);
        this.percSubst = percSubst;
   }

   public BigDecimal getCodCfo() {
        return codCfo;
   }

   public void setCodCfo(BigDecimal codCfo) {
        markAsChanged("CODCFO", codCfo);
        this.codCfo = codCfo;
   }

   public Timestamp getDtNeg() {
        return dtNeg;
   }

   public void setDtNeg(Timestamp dtNeg) {
        markAsChanged("DTNEG", dtNeg);
        this.dtNeg = dtNeg;
   }

   public String getTipMov() {
        return tipMov;
   }

   public void setTipMov(String tipMov) {
        markAsChanged("TIPMOV", tipMov);
        this.tipMov = tipMov;
   }

   @Override
   public String getTableName() {
        return "TGFIPRE";
   }

   @Override
   public String getEntityName() {
        return "ImpostoRastreamentoEstoque";
   }

   @Override
   public ImpostoRastreamentoEstoque fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.baseStfcpIntAnt = vo.asBigDecimal("BASESTFCPINTANT");
        this.baseSubst = vo.asBigDecimal("BASESUBST");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.digitado = vo.asString("DIGITADO");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuNotaCompra = vo.asBigDecimal("NUNOTACOMPRA");
        this.percStfcpIntAnt = vo.asBigDecimal("PERCSTFCPINTANT");
        this.qtdNeg = vo.asBigDecimal("QTDNEG");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.sequenciaCompra = vo.asBigDecimal("SEQUENCIACOMPRA");
        this.vlrIcms = vo.asBigDecimal("VLRICMS");
        this.vlrStfcpIntAnt = vo.asBigDecimal("VLRSTFCPINTANT");
        this.vlrSubst = vo.asBigDecimal("VLRSUBST");
        this.percSubst = vo.asBigDecimal("PERCSUBST");
        this.codCfo = vo.asBigDecimal("CODCFO");
        this.dtNeg = vo.asTimestamp("DTNEG");
        this.tipMov = vo.asString("TIPMOV");
        return this;
   }
}
