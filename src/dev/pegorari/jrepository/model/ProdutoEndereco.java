package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProdutoEndereco extends AbstractSankhyaEntity<ProdutoEndereco> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodEnd() {
        return this.getVo().asBigDecimal("CODEND");
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
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

   public Timestamp getDtFim() {
        return this.getVo().asTimestamp("DTFIM");
   }

   public void setDtFim(Timestamp dtFim) {
        markAsChanged("DTFIM", dtFim);
   }

   public Timestamp getDtInicio() {
        return this.getVo().asTimestamp("DTINICIO");
   }

   public void setDtInicio(Timestamp dtInicio) {
        markAsChanged("DTINICIO", dtInicio);
   }

   public BigDecimal getEstMax() {
        return this.getVo().asBigDecimal("ESTMAX");
   }

   public void setEstMax(BigDecimal estMax) {
        markAsChanged("ESTMAX", estMax);
   }

   public BigDecimal getEstMaxVolPad() {
        return this.getVo().asBigDecimal("ESTMAXVOLPAD");
   }

   public void setEstMaxVolPad(BigDecimal estMaxVolPad) {
        markAsChanged("ESTMAXVOLPAD", estMaxVolPad);
   }

   public BigDecimal getEstMin() {
        return this.getVo().asBigDecimal("ESTMIN");
   }

   public void setEstMin(BigDecimal estMin) {
        markAsChanged("ESTMIN", estMin);
   }

   public BigDecimal getEstMinVolPad() {
        return this.getVo().asBigDecimal("ESTMINVOLPAD");
   }

   public void setEstMinVolPad(BigDecimal estMinVolPad) {
        markAsChanged("ESTMINVOLPAD", estMinVolPad);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public String getPicking() {
        return this.getVo().asString("PICKING");
   }

   public void setPicking(String picking) {
        markAsChanged("PICKING", picking);
   }

   public String getUndPad() {
        return this.getVo().asString("UNDPAD");
   }

   public void setUndPad(String undPad) {
        markAsChanged("UNDPAD", undPad);
   }

   public String getVinculoProd() {
        return this.getVo().asString("VINCULOPROD");
   }

   public void setVinculoProd(String vinculoProd) {
        markAsChanged("VINCULOPROD", vinculoProd);
   }

   @Override
   public String getTableName() {
        return "TGWEXP";
   }

   @Override
   public String getEntityName() {
        return "ProdutoEndereco";
   }

   @Override
   public ProdutoEndereco fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
