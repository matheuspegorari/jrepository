package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PlanejamentoEntrega extends AbstractSankhyaEntity<PlanejamentoEntrega> {
   private String situacao;
   private String codTipOper;
   private BigDecimal codUsu;
   private BigDecimal nuNotaOrig;
   private BigDecimal nuPlan;
   private Timestamp dtAlter;
   private BigDecimal totalItens;
   private Timestamp dhAlterTop;
   private Timestamp dtNeg;
   private BigDecimal numNotaOrig;
   private String modEntrega;
   private BigDecimal nuNotaDest;
   private BigDecimal grupo;
   private String codParc;
   private BigDecimal totalCestasContato;
   private String codEmp;
   private BigDecimal numNotaDest;

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        this.situacao = situacao;
   }

   public String getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(String codTipOper) {
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getNuNotaOrig() {
        return nuNotaOrig;
   }

   public void setNuNotaOrig(BigDecimal nuNotaOrig) {
        this.nuNotaOrig = nuNotaOrig;
   }

   public BigDecimal getNuPlan() {
        return nuPlan;
   }

   public void setNuPlan(BigDecimal nuPlan) {
        this.nuPlan = nuPlan;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getTotalItens() {
        return totalItens;
   }

   public void setTotalItens(BigDecimal totalItens) {
        this.totalItens = totalItens;
   }

   public Timestamp getDhAlterTop() {
        return dhAlterTop;
   }

   public void setDhAlterTop(Timestamp dhAlterTop) {
        this.dhAlterTop = dhAlterTop;
   }

   public Timestamp getDtNeg() {
        return dtNeg;
   }

   public void setDtNeg(Timestamp dtNeg) {
        this.dtNeg = dtNeg;
   }

   public BigDecimal getNumNotaOrig() {
        return numNotaOrig;
   }

   public void setNumNotaOrig(BigDecimal numNotaOrig) {
        this.numNotaOrig = numNotaOrig;
   }

   public String getModEntrega() {
        return modEntrega;
   }

   public void setModEntrega(String modEntrega) {
        this.modEntrega = modEntrega;
   }

   public BigDecimal getNuNotaDest() {
        return nuNotaDest;
   }

   public void setNuNotaDest(BigDecimal nuNotaDest) {
        this.nuNotaDest = nuNotaDest;
   }

   public BigDecimal getGrupo() {
        return grupo;
   }

   public void setGrupo(BigDecimal grupo) {
        this.grupo = grupo;
   }

   public String getCodParc() {
        return codParc;
   }

   public void setCodParc(String codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getTotalCestasContato() {
        return totalCestasContato;
   }

   public void setTotalCestasContato(BigDecimal totalCestasContato) {
        this.totalCestasContato = totalCestasContato;
   }

   public String getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(String codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getNumNotaDest() {
        return numNotaDest;
   }

   public void setNumNotaDest(BigDecimal numNotaDest) {
        this.numNotaDest = numNotaDest;
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
        this.situacao = vo.asString("SITUACAO");
        this.codTipOper = vo.asString("CODTIPOPER");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuNotaOrig = vo.asBigDecimal("NUNOTAORIG");
        this.nuPlan = vo.asBigDecimal("NUPLAN");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.totalItens = vo.asBigDecimal("TOTALITENS");
        this.dhAlterTop = vo.asTimestamp("DHALTERTOP");
        this.dtNeg = vo.asTimestamp("DTNEG");
        this.numNotaOrig = vo.asBigDecimal("NUMNOTAORIG");
        this.modEntrega = vo.asString("MODENTREGA");
        this.nuNotaDest = vo.asBigDecimal("NUNOTADEST");
        this.grupo = vo.asBigDecimal("GRUPO");
        this.codParc = vo.asString("CODPARC");
        this.totalCestasContato = vo.asBigDecimal("TOTALCESTASCONTATO");
        this.codEmp = vo.asString("CODEMP");
        this.numNotaDest = vo.asBigDecimal("NUMNOTADEST");
        return this;
   }
}
