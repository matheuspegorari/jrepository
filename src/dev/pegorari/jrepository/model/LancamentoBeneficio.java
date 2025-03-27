package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LancamentoBeneficio extends AbstractSankhyaEntity<LancamentoBeneficio> {
   public BigDecimal getVlrTitular() {
        return this.getVo().asBigDecimal("VLRTITULAR");
   }

   public void setVlrTitular(BigDecimal vlrTitular) {
        markAsChanged("VLRTITULAR", vlrTitular);
   }

   public String getNomeFunc() {
        return this.getVo().asString("NOMEFUNC");
   }

   public void setNomeFunc(String nomeFunc) {
        markAsChanged("NOMEFUNC", nomeFunc);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getSituacaoFunc() {
        return this.getVo().asBigDecimal("SITUACAOFUNC");
   }

   public void setSituacaoFunc(BigDecimal situacaoFunc) {
        markAsChanged("SITUACAOFUNC", situacaoFunc);
   }

   public BigDecimal getCodBen() {
        return this.getVo().asBigDecimal("CODBEN");
   }

   public void setCodBen(BigDecimal codBen) {
        markAsChanged("CODBEN", codBen);
   }

   public BigDecimal getCodCargo() {
        return this.getVo().asBigDecimal("CODCARGO");
   }

   public void setCodCargo(BigDecimal codCargo) {
        markAsChanged("CODCARGO", codCargo);
   }

   public BigDecimal getCodCbe() {
        return this.getVo().asBigDecimal("CODCBE");
   }

   public void setCodCbe(BigDecimal codCbe) {
        markAsChanged("CODCBE", codCbe);
   }

   public BigDecimal getCodDep() {
        return this.getVo().asBigDecimal("CODDEP");
   }

   public void setCodDep(BigDecimal codDep) {
        markAsChanged("CODDEP", codDep);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEvento() {
        return this.getVo().asBigDecimal("CODEVENTO");
   }

   public void setCodEvento(BigDecimal codEvento) {
        markAsChanged("CODEVENTO", codEvento);
   }

   public BigDecimal getCodFunc() {
        return this.getVo().asBigDecimal("CODFUNC");
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
   }

   public BigDecimal getCodFuncao() {
        return this.getVo().asBigDecimal("CODFUNCAO");
   }

   public void setCodFuncao(BigDecimal codFuncao) {
        markAsChanged("CODFUNCAO", codFuncao);
   }

   public BigDecimal getCodLbe() {
        return this.getVo().asBigDecimal("CODLBE");
   }

   public void setCodLbe(BigDecimal codLbe) {
        markAsChanged("CODLBE", codLbe);
   }

   public Timestamp getDtRefEmp() {
        return this.getVo().asTimestamp("DTREFEMP");
   }

   public void setDtRefEmp(Timestamp dtRefEmp) {
        markAsChanged("DTREFEMP", dtRefEmp);
   }

   public String getNomeDepend() {
        return this.getVo().asString("NOMEDEPEND");
   }

   public void setNomeDepend(String nomeDepend) {
        markAsChanged("NOMEDEPEND", nomeDepend);
   }

   public BigDecimal getVlrDepen() {
        return this.getVo().asBigDecimal("VLRDEPEN");
   }

   public void setVlrDepen(BigDecimal vlrDepen) {
        markAsChanged("VLRDEPEN", vlrDepen);
   }

   @Override
   public String getTableName() {
        return "TFPLBE";
   }

   @Override
   public String getEntityName() {
        return "LancamentoBeneficio";
   }

   @Override
   public LancamentoBeneficio fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
