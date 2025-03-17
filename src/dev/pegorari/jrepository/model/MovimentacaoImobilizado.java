package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MovimentacaoImobilizado implements SankhyaEntity<MovimentacaoImobilizado> {

   private String codBem;
   private BigDecimal codCencus;
   private BigDecimal codDep;
   private BigDecimal codEmp;
   private BigDecimal codProd;
   private Timestamp dtMovto;
   private BigDecimal numLanc;
   private BigDecimal numLote;
   private Timestamp referencia;
   private BigDecimal sequencia;
   private String tipMov;
   private BigDecimal tipo;
   private BigDecimal valor;
   private BigDecimal vlrDep;

   public String getCodBem() {
        return codBem;
   }

   public void setCodBem(String codBem) {
        this.codBem = codBem;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        this.codCencus = codCencus;
   }

   public BigDecimal getCodDep() {
        return codDep;
   }

   public void setCodDep(BigDecimal codDep) {
        this.codDep = codDep;
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

   public Timestamp getDtMovto() {
        return dtMovto;
   }

   public void setDtMovto(Timestamp dtMovto) {
        this.dtMovto = dtMovto;
   }

   public BigDecimal getNumLanc() {
        return numLanc;
   }

   public void setNumLanc(BigDecimal numLanc) {
        this.numLanc = numLanc;
   }

   public BigDecimal getNumLote() {
        return numLote;
   }

   public void setNumLote(BigDecimal numLote) {
        this.numLote = numLote;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        this.referencia = referencia;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getTipMov() {
        return tipMov;
   }

   public void setTipMov(String tipMov) {
        this.tipMov = tipMov;
   }

   public BigDecimal getTipo() {
        return tipo;
   }

   public void setTipo(BigDecimal tipo) {
        this.tipo = tipo;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        this.valor = valor;
   }

   public BigDecimal getVlrDep() {
        return vlrDep;
   }

   public void setVlrDep(BigDecimal vlrDep) {
        this.vlrDep = vlrDep;
   }

   @Override
   public String getEntityName() {
        return "MovimentacaoImobilizado";
   }

   @Override
   public MovimentacaoImobilizado fromVO(DynamicVO vo) {
        this.codBem = vo.asString("CODBEM");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codDep = vo.asBigDecimal("CODDEP");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.dtMovto = vo.asTimestamp("DTMOVTO");
        this.numLanc = vo.asBigDecimal("NUMLANC");
        this.numLote = vo.asBigDecimal("NUMLOTE");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipMov = vo.asString("TIPMOV");
        this.tipo = vo.asBigDecimal("TIPO");
        this.valor = vo.asBigDecimal("VALOR");
        this.vlrDep = vo.asBigDecimal("VLRDEP");
        return this;
   }
}
