package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ElementoFluxoOrigem extends AbstractSankhyaEntity<ElementoFluxoOrigem> {
   private String corFonte;
   private String corPreenchimento;
   private String descricao;
   private BigDecimal ideFx;
   private BigDecimal ideFxLane;
   private BigDecimal idProc;
   private BigDecimal tamFonte;
   private BigDecimal tipo;
   private BigDecimal x1Pos;
   private BigDecimal x2Pos;
   private BigDecimal y1Pos;
   private BigDecimal y2Pos;
   private char[] waypoints;

   public String getCorFonte() {
        return corFonte;
   }

   public void setCorFonte(String corFonte) {
        markAsChanged("CORFONTE", corFonte);
        this.corFonte = corFonte;
   }

   public String getCorPreenchimento() {
        return corPreenchimento;
   }

   public void setCorPreenchimento(String corPreenchimento) {
        markAsChanged("CORPREENCHIMENTO", corPreenchimento);
        this.corPreenchimento = corPreenchimento;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
        this.ideFx = ideFx;
   }

   public BigDecimal getIdeFxLane() {
        return ideFxLane;
   }

   public void setIdeFxLane(BigDecimal ideFxLane) {
        markAsChanged("IDEFXLANE", ideFxLane);
        this.ideFxLane = ideFxLane;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
        this.idProc = idProc;
   }

   public BigDecimal getTamFonte() {
        return tamFonte;
   }

   public void setTamFonte(BigDecimal tamFonte) {
        markAsChanged("TAMFONTE", tamFonte);
        this.tamFonte = tamFonte;
   }

   public BigDecimal getTipo() {
        return tipo;
   }

   public void setTipo(BigDecimal tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getX1Pos() {
        return x1Pos;
   }

   public void setX1Pos(BigDecimal x1Pos) {
        markAsChanged("X1POS", x1Pos);
        this.x1Pos = x1Pos;
   }

   public BigDecimal getX2Pos() {
        return x2Pos;
   }

   public void setX2Pos(BigDecimal x2Pos) {
        markAsChanged("X2POS", x2Pos);
        this.x2Pos = x2Pos;
   }

   public BigDecimal getY1Pos() {
        return y1Pos;
   }

   public void setY1Pos(BigDecimal y1Pos) {
        markAsChanged("Y1POS", y1Pos);
        this.y1Pos = y1Pos;
   }

   public BigDecimal getY2Pos() {
        return y2Pos;
   }

   public void setY2Pos(BigDecimal y2Pos) {
        markAsChanged("Y2POS", y2Pos);
        this.y2Pos = y2Pos;
   }

   public char[] getWaypoints() {
        return waypoints;
   }

   public void setWaypoints(char[] waypoints) {
        markAsChanged("WAYPOINTS", waypoints);
        this.waypoints = waypoints;
   }

   @Override
   public String getTableName() {
        return "TPREFX";
   }

   @Override
   public String getEntityName() {
        return "ElementoFluxoOrigem";
   }

   @Override
   public ElementoFluxoOrigem fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.corFonte = vo.asString("CORFONTE");
        this.corPreenchimento = vo.asString("CORPREENCHIMENTO");
        this.descricao = vo.asString("DESCRICAO");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.ideFxLane = vo.asBigDecimal("IDEFXLANE");
        this.idProc = vo.asBigDecimal("IDPROC");
        this.tamFonte = vo.asBigDecimal("TAMFONTE");
        this.tipo = vo.asBigDecimal("TIPO");
        this.x1Pos = vo.asBigDecimal("X1POS");
        this.x2Pos = vo.asBigDecimal("X2POS");
        this.y1Pos = vo.asBigDecimal("Y1POS");
        this.y2Pos = vo.asBigDecimal("Y2POS");
        this.waypoints = vo.asClob("WAYPOINTS");
        return this;
   }
}
