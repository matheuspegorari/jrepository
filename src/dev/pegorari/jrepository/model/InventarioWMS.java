package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InventarioWMS extends AbstractSankhyaEntity<InventarioWMS> {
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
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getAtualEstoque() {
        return atualEstoque;
   }

   public void setAtualEstoque(BigDecimal atualEstoque) {
        markAsChanged("ATUALESTOQUE", atualEstoque);
        this.atualEstoque = atualEstoque;
   }

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
        this.codBarra = codBarra;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
        this.codEnd = codEnd;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
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

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public Timestamp getDtAtualEst() {
        return dtAtualEst;
   }

   public void setDtAtualEst(Timestamp dtAtualEst) {
        markAsChanged("DTATUALEST", dtAtualEst);
        this.dtAtualEst = dtAtualEst;
   }

   public Timestamp getDtContagem() {
        return dtContagem;
   }

   public void setDtContagem(Timestamp dtContagem) {
        markAsChanged("DTCONTAGEM", dtContagem);
        this.dtContagem = dtContagem;
   }

   public Timestamp getDtVal() {
        return dtVal;
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
        this.dtVal = dtVal;
   }

   public BigDecimal getEstMax() {
        return estMax;
   }

   public void setEstMax(BigDecimal estMax) {
        markAsChanged("ESTMAX", estMax);
        this.estMax = estMax;
   }

   public BigDecimal getEstMin() {
        return estMin;
   }

   public void setEstMin(BigDecimal estMin) {
        markAsChanged("ESTMIN", estMin);
        this.estMin = estMin;
   }

   public BigDecimal getEstoque() {
        return estoque;
   }

   public void setEstoque(BigDecimal estoque) {
        markAsChanged("ESTOQUE", estoque);
        this.estoque = estoque;
   }

   public BigDecimal getReservado() {
        return reservado;
   }

   public void setReservado(BigDecimal reservado) {
        markAsChanged("RESERVADO", reservado);
        this.reservado = reservado;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   @Override
   public String getTableName() {
        return "TGWCTE";
   }

   @Override
   public String getEntityName() {
        return "InventarioWMS";
   }

   @Override
   public InventarioWMS fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
