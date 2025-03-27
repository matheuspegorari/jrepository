package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ElementoFluxo extends AbstractSankhyaEntity<ElementoFluxo> {
   public String getCorFonte() {
        return this.getVo().asString("CORFONTE");
   }

   public void setCorFonte(String corFonte) {
        markAsChanged("CORFONTE", corFonte);
   }

   public String getCorPreenchimento() {
        return this.getVo().asString("CORPREENCHIMENTO");
   }

   public void setCorPreenchimento(String corPreenchimento) {
        markAsChanged("CORPREENCHIMENTO", corPreenchimento);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getIdeFxLane() {
        return this.getVo().asBigDecimal("IDEFXLANE");
   }

   public void setIdeFxLane(BigDecimal ideFxLane) {
        markAsChanged("IDEFXLANE", ideFxLane);
   }

   public BigDecimal getIdProc() {
        return this.getVo().asBigDecimal("IDPROC");
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
   }

   public BigDecimal getTamFonte() {
        return this.getVo().asBigDecimal("TAMFONTE");
   }

   public void setTamFonte(BigDecimal tamFonte) {
        markAsChanged("TAMFONTE", tamFonte);
   }

   public BigDecimal getTipo() {
        return this.getVo().asBigDecimal("TIPO");
   }

   public void setTipo(BigDecimal tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getX1Pos() {
        return this.getVo().asBigDecimal("X1POS");
   }

   public void setX1Pos(BigDecimal x1Pos) {
        markAsChanged("X1POS", x1Pos);
   }

   public BigDecimal getX2Pos() {
        return this.getVo().asBigDecimal("X2POS");
   }

   public void setX2Pos(BigDecimal x2Pos) {
        markAsChanged("X2POS", x2Pos);
   }

   public BigDecimal getY1Pos() {
        return this.getVo().asBigDecimal("Y1POS");
   }

   public void setY1Pos(BigDecimal y1Pos) {
        markAsChanged("Y1POS", y1Pos);
   }

   public BigDecimal getY2Pos() {
        return this.getVo().asBigDecimal("Y2POS");
   }

   public void setY2Pos(BigDecimal y2Pos) {
        markAsChanged("Y2POS", y2Pos);
   }

   public char[] getWaypoints() {
        return this.getVo().asClob("WAYPOINTS");
   }

   public void setWaypoints(char[] waypoints) {
        markAsChanged("WAYPOINTS", waypoints);
   }

   @Override
   public String getTableName() {
        return "TPREFX";
   }

   @Override
   public String getEntityName() {
        return "ElementoFluxo";
   }

   @Override
   public ElementoFluxo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
