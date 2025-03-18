package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LancamentoBeneficio extends AbstractSankhyaEntity<LancamentoBeneficio> {
   private BigDecimal vlrTitular;
   private String nomeFunc;
   private BigDecimal sequencia;
   private BigDecimal situacaoFunc;
   private BigDecimal codBen;
   private BigDecimal codCargo;
   private BigDecimal codCbe;
   private BigDecimal codDep;
   private BigDecimal codEmp;
   private BigDecimal codEvento;
   private BigDecimal codFunc;
   private BigDecimal codFuncao;
   private BigDecimal codLbe;
   private Timestamp dtRefEmp;
   private String nomeDepend;
   private BigDecimal vlrDepen;

   public BigDecimal getVlrTitular() {
        return vlrTitular;
   }

   public void setVlrTitular(BigDecimal vlrTitular) {
        markAsChanged("VLRTITULAR", vlrTitular);
        this.vlrTitular = vlrTitular;
   }

   public String getNomeFunc() {
        return nomeFunc;
   }

   public void setNomeFunc(String nomeFunc) {
        markAsChanged("NOMEFUNC", nomeFunc);
        this.nomeFunc = nomeFunc;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getSituacaoFunc() {
        return situacaoFunc;
   }

   public void setSituacaoFunc(BigDecimal situacaoFunc) {
        markAsChanged("SITUACAOFUNC", situacaoFunc);
        this.situacaoFunc = situacaoFunc;
   }

   public BigDecimal getCodBen() {
        return codBen;
   }

   public void setCodBen(BigDecimal codBen) {
        markAsChanged("CODBEN", codBen);
        this.codBen = codBen;
   }

   public BigDecimal getCodCargo() {
        return codCargo;
   }

   public void setCodCargo(BigDecimal codCargo) {
        markAsChanged("CODCARGO", codCargo);
        this.codCargo = codCargo;
   }

   public BigDecimal getCodCbe() {
        return codCbe;
   }

   public void setCodCbe(BigDecimal codCbe) {
        markAsChanged("CODCBE", codCbe);
        this.codCbe = codCbe;
   }

   public BigDecimal getCodDep() {
        return codDep;
   }

   public void setCodDep(BigDecimal codDep) {
        markAsChanged("CODDEP", codDep);
        this.codDep = codDep;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEvento() {
        return codEvento;
   }

   public void setCodEvento(BigDecimal codEvento) {
        markAsChanged("CODEVENTO", codEvento);
        this.codEvento = codEvento;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
        this.codFunc = codFunc;
   }

   public BigDecimal getCodFuncao() {
        return codFuncao;
   }

   public void setCodFuncao(BigDecimal codFuncao) {
        markAsChanged("CODFUNCAO", codFuncao);
        this.codFuncao = codFuncao;
   }

   public BigDecimal getCodLbe() {
        return codLbe;
   }

   public void setCodLbe(BigDecimal codLbe) {
        markAsChanged("CODLBE", codLbe);
        this.codLbe = codLbe;
   }

   public Timestamp getDtRefEmp() {
        return dtRefEmp;
   }

   public void setDtRefEmp(Timestamp dtRefEmp) {
        markAsChanged("DTREFEMP", dtRefEmp);
        this.dtRefEmp = dtRefEmp;
   }

   public String getNomeDepend() {
        return nomeDepend;
   }

   public void setNomeDepend(String nomeDepend) {
        markAsChanged("NOMEDEPEND", nomeDepend);
        this.nomeDepend = nomeDepend;
   }

   public BigDecimal getVlrDepen() {
        return vlrDepen;
   }

   public void setVlrDepen(BigDecimal vlrDepen) {
        markAsChanged("VLRDEPEN", vlrDepen);
        this.vlrDepen = vlrDepen;
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
        this.setOriginalVO(vo);
        this.vlrTitular = vo.asBigDecimal("VLRTITULAR");
        this.nomeFunc = vo.asString("NOMEFUNC");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.situacaoFunc = vo.asBigDecimal("SITUACAOFUNC");
        this.codBen = vo.asBigDecimal("CODBEN");
        this.codCargo = vo.asBigDecimal("CODCARGO");
        this.codCbe = vo.asBigDecimal("CODCBE");
        this.codDep = vo.asBigDecimal("CODDEP");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEvento = vo.asBigDecimal("CODEVENTO");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codFuncao = vo.asBigDecimal("CODFUNCAO");
        this.codLbe = vo.asBigDecimal("CODLBE");
        this.dtRefEmp = vo.asTimestamp("DTREFEMP");
        this.nomeDepend = vo.asString("NOMEDEPEND");
        this.vlrDepen = vo.asBigDecimal("VLRDEPEN");
        return this;
   }
}
