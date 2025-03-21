package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProdutoEndereco extends AbstractSankhyaEntity<ProdutoEndereco> {
   private String ativo;
   private BigDecimal codEnd;
   private BigDecimal codProd;
   private String codVol;
   private String controle;
   private Timestamp dtFim;
   private Timestamp dtInicio;
   private BigDecimal estMax;
   private BigDecimal estMaxVolPad;
   private BigDecimal estMin;
   private BigDecimal estMinVolPad;
   private BigDecimal ordem;
   private String picking;
   private String undPad;
   private String vinculoProd;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
        this.codEnd = codEnd;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
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

   public Timestamp getDtFim() {
        return dtFim;
   }

   public void setDtFim(Timestamp dtFim) {
        markAsChanged("DTFIM", dtFim);
        this.dtFim = dtFim;
   }

   public Timestamp getDtInicio() {
        return dtInicio;
   }

   public void setDtInicio(Timestamp dtInicio) {
        markAsChanged("DTINICIO", dtInicio);
        this.dtInicio = dtInicio;
   }

   public BigDecimal getEstMax() {
        return estMax;
   }

   public void setEstMax(BigDecimal estMax) {
        markAsChanged("ESTMAX", estMax);
        this.estMax = estMax;
   }

   public BigDecimal getEstMaxVolPad() {
        return estMaxVolPad;
   }

   public void setEstMaxVolPad(BigDecimal estMaxVolPad) {
        markAsChanged("ESTMAXVOLPAD", estMaxVolPad);
        this.estMaxVolPad = estMaxVolPad;
   }

   public BigDecimal getEstMin() {
        return estMin;
   }

   public void setEstMin(BigDecimal estMin) {
        markAsChanged("ESTMIN", estMin);
        this.estMin = estMin;
   }

   public BigDecimal getEstMinVolPad() {
        return estMinVolPad;
   }

   public void setEstMinVolPad(BigDecimal estMinVolPad) {
        markAsChanged("ESTMINVOLPAD", estMinVolPad);
        this.estMinVolPad = estMinVolPad;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
        this.ordem = ordem;
   }

   public String getPicking() {
        return picking;
   }

   public void setPicking(String picking) {
        markAsChanged("PICKING", picking);
        this.picking = picking;
   }

   public String getUndPad() {
        return undPad;
   }

   public void setUndPad(String undPad) {
        markAsChanged("UNDPAD", undPad);
        this.undPad = undPad;
   }

   public String getVinculoProd() {
        return vinculoProd;
   }

   public void setVinculoProd(String vinculoProd) {
        markAsChanged("VINCULOPROD", vinculoProd);
        this.vinculoProd = vinculoProd;
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
        this.setOriginalVO(vo);
        this.ativo = vo.asString("ATIVO");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codVol = vo.asString("CODVOL");
        this.controle = vo.asString("CONTROLE");
        this.dtFim = vo.asTimestamp("DTFIM");
        this.dtInicio = vo.asTimestamp("DTINICIO");
        this.estMax = vo.asBigDecimal("ESTMAX");
        this.estMaxVolPad = vo.asBigDecimal("ESTMAXVOLPAD");
        this.estMin = vo.asBigDecimal("ESTMIN");
        this.estMinVolPad = vo.asBigDecimal("ESTMINVOLPAD");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.picking = vo.asString("PICKING");
        this.undPad = vo.asString("UNDPAD");
        this.vinculoProd = vo.asString("VINCULOPROD");
        return this;
   }
}
