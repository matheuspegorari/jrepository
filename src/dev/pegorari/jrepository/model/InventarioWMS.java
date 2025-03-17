package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InventarioWMS implements SankhyaEntity<InventarioWMS> {

   private String ativo;
   private BigDecimal atualEstoque;
   private String codBarra;
   private BigDecimal codEmp;
   private BigDecimal codEnd;
   private BigDecimal codLocal;
   private BigDecimal codParc;
   private BigDecimal codProd;
   private BigDecimal codUsu;
   private String codVol;
   private String controle;
   private Timestamp dtAtualEst;
   private Timestamp dtContagem;
   private Timestamp dtVal;
   private BigDecimal estMax;
   private BigDecimal estMin;
   private BigDecimal estoque;
   private BigDecimal reservado;
   private String tipo;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getAtualEstoque() {
        return atualEstoque;
   }

   public void setAtualEstoque(BigDecimal atualEstoque) {
        this.atualEstoque = atualEstoque;
   }

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        this.codEnd = codEnd;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        this.codLocal = codLocal;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
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

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public Timestamp getDtAtualEst() {
        return dtAtualEst;
   }

   public void setDtAtualEst(Timestamp dtAtualEst) {
        this.dtAtualEst = dtAtualEst;
   }

   public Timestamp getDtContagem() {
        return dtContagem;
   }

   public void setDtContagem(Timestamp dtContagem) {
        this.dtContagem = dtContagem;
   }

   public Timestamp getDtVal() {
        return dtVal;
   }

   public void setDtVal(Timestamp dtVal) {
        this.dtVal = dtVal;
   }

   public BigDecimal getEstMax() {
        return estMax;
   }

   public void setEstMax(BigDecimal estMax) {
        this.estMax = estMax;
   }

   public BigDecimal getEstMin() {
        return estMin;
   }

   public void setEstMin(BigDecimal estMin) {
        this.estMin = estMin;
   }

   public BigDecimal getEstoque() {
        return estoque;
   }

   public void setEstoque(BigDecimal estoque) {
        this.estoque = estoque;
   }

   public BigDecimal getReservado() {
        return reservado;
   }

   public void setReservado(BigDecimal reservado) {
        this.reservado = reservado;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getEntityName() {
        return "InventarioWMS";
   }

   @Override
   public InventarioWMS fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.atualEstoque = vo.asBigDecimal("ATUALESTOQUE");
        this.codBarra = vo.asString("CODBARRA");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVol = vo.asString("CODVOL");
        this.controle = vo.asString("CONTROLE");
        this.dtAtualEst = vo.asTimestamp("DTATUALEST");
        this.dtContagem = vo.asTimestamp("DTCONTAGEM");
        this.dtVal = vo.asTimestamp("DTVAL");
        this.estMax = vo.asBigDecimal("ESTMAX");
        this.estMin = vo.asBigDecimal("ESTMIN");
        this.estoque = vo.asBigDecimal("ESTOQUE");
        this.reservado = vo.asBigDecimal("RESERVADO");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
