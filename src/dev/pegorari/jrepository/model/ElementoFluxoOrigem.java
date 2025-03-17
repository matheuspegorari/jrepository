package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ElementoFluxoOrigem implements SankhyaEntity<ElementoFluxoOrigem> {

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
        this.corFonte = corFonte;
   }

   public String getCorPreenchimento() {
        return corPreenchimento;
   }

   public void setCorPreenchimento(String corPreenchimento) {
        this.corPreenchimento = corPreenchimento;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        this.ideFx = ideFx;
   }

   public BigDecimal getIdeFxLane() {
        return ideFxLane;
   }

   public void setIdeFxLane(BigDecimal ideFxLane) {
        this.ideFxLane = ideFxLane;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        this.idProc = idProc;
   }

   public BigDecimal getTamFonte() {
        return tamFonte;
   }

   public void setTamFonte(BigDecimal tamFonte) {
        this.tamFonte = tamFonte;
   }

   public BigDecimal getTipo() {
        return tipo;
   }

   public void setTipo(BigDecimal tipo) {
        this.tipo = tipo;
   }

   public BigDecimal getX1Pos() {
        return x1Pos;
   }

   public void setX1Pos(BigDecimal x1Pos) {
        this.x1Pos = x1Pos;
   }

   public BigDecimal getX2Pos() {
        return x2Pos;
   }

   public void setX2Pos(BigDecimal x2Pos) {
        this.x2Pos = x2Pos;
   }

   public BigDecimal getY1Pos() {
        return y1Pos;
   }

   public void setY1Pos(BigDecimal y1Pos) {
        this.y1Pos = y1Pos;
   }

   public BigDecimal getY2Pos() {
        return y2Pos;
   }

   public void setY2Pos(BigDecimal y2Pos) {
        this.y2Pos = y2Pos;
   }

   public char[] getWaypoints() {
        return waypoints;
   }

   public void setWaypoints(char[] waypoints) {
        this.waypoints = waypoints;
   }

   @Override
   public String getEntityName() {
        return "ElementoFluxoOrigem";
   }

   @Override
   public ElementoFluxoOrigem fromVO(DynamicVO vo) {
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
