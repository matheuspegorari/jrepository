package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InventarioWMS extends AbstractSankhyaEntity<InventarioWMS> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getAtualEstoque() {
        return this.getVo().asBigDecimal("ATUALESTOQUE");
   }

   public void setAtualEstoque(BigDecimal atualEstoque) {
        markAsChanged("ATUALESTOQUE", atualEstoque);
   }

   public String getCodBarra() {
        return this.getVo().asString("CODBARRA");
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEnd() {
        return this.getVo().asBigDecimal("CODEND");
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public Timestamp getDtAtualEst() {
        return this.getVo().asTimestamp("DTATUALEST");
   }

   public void setDtAtualEst(Timestamp dtAtualEst) {
        markAsChanged("DTATUALEST", dtAtualEst);
   }

   public Timestamp getDtContagem() {
        return this.getVo().asTimestamp("DTCONTAGEM");
   }

   public void setDtContagem(Timestamp dtContagem) {
        markAsChanged("DTCONTAGEM", dtContagem);
   }

   public Timestamp getDtVal() {
        return this.getVo().asTimestamp("DTVAL");
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
   }

   public BigDecimal getEstMax() {
        return this.getVo().asBigDecimal("ESTMAX");
   }

   public void setEstMax(BigDecimal estMax) {
        markAsChanged("ESTMAX", estMax);
   }

   public BigDecimal getEstMin() {
        return this.getVo().asBigDecimal("ESTMIN");
   }

   public void setEstMin(BigDecimal estMin) {
        markAsChanged("ESTMIN", estMin);
   }

   public BigDecimal getEstoque() {
        return this.getVo().asBigDecimal("ESTOQUE");
   }

   public void setEstoque(BigDecimal estoque) {
        markAsChanged("ESTOQUE", estoque);
   }

   public BigDecimal getReservado() {
        return this.getVo().asBigDecimal("RESERVADO");
   }

   public void setReservado(BigDecimal reservado) {
        markAsChanged("RESERVADO", reservado);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
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
        this.setVo(vo);
        return this;
   }
}
