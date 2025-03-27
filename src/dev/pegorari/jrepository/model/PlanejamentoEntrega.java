package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PlanejamentoEntrega extends AbstractSankhyaEntity<PlanejamentoEntrega> {
   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public String getCodTipOper() {
        return this.getVo().asString("CODTIPOPER");
   }

   public void setCodTipOper(String codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getNuNotaOrig() {
        return this.getVo().asBigDecimal("NUNOTAORIG");
   }

   public void setNuNotaOrig(BigDecimal nuNotaOrig) {
        markAsChanged("NUNOTAORIG", nuNotaOrig);
   }

   public BigDecimal getNuPlan() {
        return this.getVo().asBigDecimal("NUPLAN");
   }

   public void setNuPlan(BigDecimal nuPlan) {
        markAsChanged("NUPLAN", nuPlan);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getTotalItens() {
        return this.getVo().asBigDecimal("TOTALITENS");
   }

   public void setTotalItens(BigDecimal totalItens) {
        markAsChanged("TOTALITENS", totalItens);
   }

   public Timestamp getDhAlterTop() {
        return this.getVo().asTimestamp("DHALTERTOP");
   }

   public void setDhAlterTop(Timestamp dhAlterTop) {
        markAsChanged("DHALTERTOP", dhAlterTop);
   }

   public Timestamp getDtNeg() {
        return this.getVo().asTimestamp("DTNEG");
   }

   public void setDtNeg(Timestamp dtNeg) {
        markAsChanged("DTNEG", dtNeg);
   }

   public BigDecimal getNumNotaOrig() {
        return this.getVo().asBigDecimal("NUMNOTAORIG");
   }

   public void setNumNotaOrig(BigDecimal numNotaOrig) {
        markAsChanged("NUMNOTAORIG", numNotaOrig);
   }

   public String getModEntrega() {
        return this.getVo().asString("MODENTREGA");
   }

   public void setModEntrega(String modEntrega) {
        markAsChanged("MODENTREGA", modEntrega);
   }

   public BigDecimal getNuNotaDest() {
        return this.getVo().asBigDecimal("NUNOTADEST");
   }

   public void setNuNotaDest(BigDecimal nuNotaDest) {
        markAsChanged("NUNOTADEST", nuNotaDest);
   }

   public BigDecimal getGrupo() {
        return this.getVo().asBigDecimal("GRUPO");
   }

   public void setGrupo(BigDecimal grupo) {
        markAsChanged("GRUPO", grupo);
   }

   public String getCodParc() {
        return this.getVo().asString("CODPARC");
   }

   public void setCodParc(String codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getTotalCestasContato() {
        return this.getVo().asBigDecimal("TOTALCESTASCONTATO");
   }

   public void setTotalCestasContato(BigDecimal totalCestasContato) {
        markAsChanged("TOTALCESTASCONTATO", totalCestasContato);
   }

   public String getCodEmp() {
        return this.getVo().asString("CODEMP");
   }

   public void setCodEmp(String codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getNumNotaDest() {
        return this.getVo().asBigDecimal("NUMNOTADEST");
   }

   public void setNumNotaDest(BigDecimal numNotaDest) {
        markAsChanged("NUMNOTADEST", numNotaDest);
   }

   @Override
   public String getTableName() {
        return "TGFPLAN";
   }

   @Override
   public String getEntityName() {
        return "PlanejamentoEntrega";
   }

   @Override
   public PlanejamentoEntrega fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
