package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EstoqueNotaProduto implements SankhyaEntity<EstoqueNotaProduto> {

   private String codVol;
   private BigDecimal nuNota;
   private BigDecimal codEnd;
   private Timestamp dhAlter;
   private BigDecimal codUsu;
   private BigDecimal estoque;
   private BigDecimal codProd;
   private BigDecimal estoqueVolPad;
   private BigDecimal codLocal;
   private String controle;
   private BigDecimal sequencia;
   private BigDecimal codEmp;

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        this.codEnd = codEnd;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getEstoque() {
        return estoque;
   }

   public void setEstoque(BigDecimal estoque) {
        this.estoque = estoque;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getEstoqueVolPad() {
        return estoqueVolPad;
   }

   public void setEstoqueVolPad(BigDecimal estoqueVolPad) {
        this.estoqueVolPad = estoqueVolPad;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        this.codLocal = codLocal;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   @Override
   public String getEntityName() {
        return "EstoqueNotaProduto";
   }

   @Override
   public EstoqueNotaProduto fromVO(DynamicVO vo) {
        this.codVol = vo.asString("CODVOL");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.estoque = vo.asBigDecimal("ESTOQUE");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.estoqueVolPad = vo.asBigDecimal("ESTOQUEVOLPAD");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.controle = vo.asString("CONTROLE");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.codEmp = vo.asBigDecimal("CODEMP");
        return this;
   }
}
