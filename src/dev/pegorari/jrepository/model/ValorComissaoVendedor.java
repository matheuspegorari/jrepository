package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ValorComissaoVendedor extends AbstractSankhyaEntity<ValorComissaoVendedor> {
   private BigDecimal codEmp;
   private BigDecimal codEvento;
   private BigDecimal codForm;
   private BigDecimal codFunc;
   private BigDecimal codUsu;
   private BigDecimal codVend;
   private Timestamp dhAlter;
   private BigDecimal indiceProdutividade;
   private BigDecimal nuFechamento;
   private BigDecimal nuFin;
   private BigDecimal nuFinOrig;
   private BigDecimal numItemOrig;
   private BigDecimal numOsOrig;
   private BigDecimal nuNotaOrig;
   private BigDecimal qtdHora;
   private BigDecimal qtdHoraExtra;
   private Timestamp referencia;
   private BigDecimal sequencia;
   private String tipo;
   private BigDecimal vlrCom;
   private BigDecimal vlrHora;
   private BigDecimal vlrHoraExtra;
   private BigDecimal vlrResiduoCom;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEvento() {
        return codEvento;
   }

   public void setCodEvento(BigDecimal codEvento) {
        this.codEvento = codEvento;
   }

   public BigDecimal getCodForm() {
        return codForm;
   }

   public void setCodForm(BigDecimal codForm) {
        this.codForm = codForm;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        this.codFunc = codFunc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        this.codVend = codVend;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public BigDecimal getIndiceProdutividade() {
        return indiceProdutividade;
   }

   public void setIndiceProdutividade(BigDecimal indiceProdutividade) {
        this.indiceProdutividade = indiceProdutividade;
   }

   public BigDecimal getNuFechamento() {
        return nuFechamento;
   }

   public void setNuFechamento(BigDecimal nuFechamento) {
        this.nuFechamento = nuFechamento;
   }

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        this.nuFin = nuFin;
   }

   public BigDecimal getNuFinOrig() {
        return nuFinOrig;
   }

   public void setNuFinOrig(BigDecimal nuFinOrig) {
        this.nuFinOrig = nuFinOrig;
   }

   public BigDecimal getNumItemOrig() {
        return numItemOrig;
   }

   public void setNumItemOrig(BigDecimal numItemOrig) {
        this.numItemOrig = numItemOrig;
   }

   public BigDecimal getNumOsOrig() {
        return numOsOrig;
   }

   public void setNumOsOrig(BigDecimal numOsOrig) {
        this.numOsOrig = numOsOrig;
   }

   public BigDecimal getNuNotaOrig() {
        return nuNotaOrig;
   }

   public void setNuNotaOrig(BigDecimal nuNotaOrig) {
        this.nuNotaOrig = nuNotaOrig;
   }

   public BigDecimal getQtdHora() {
        return qtdHora;
   }

   public void setQtdHora(BigDecimal qtdHora) {
        this.qtdHora = qtdHora;
   }

   public BigDecimal getQtdHoraExtra() {
        return qtdHoraExtra;
   }

   public void setQtdHoraExtra(BigDecimal qtdHoraExtra) {
        this.qtdHoraExtra = qtdHoraExtra;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        this.referencia = referencia;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public BigDecimal getVlrCom() {
        return vlrCom;
   }

   public void setVlrCom(BigDecimal vlrCom) {
        this.vlrCom = vlrCom;
   }

   public BigDecimal getVlrHora() {
        return vlrHora;
   }

   public void setVlrHora(BigDecimal vlrHora) {
        this.vlrHora = vlrHora;
   }

   public BigDecimal getVlrHoraExtra() {
        return vlrHoraExtra;
   }

   public void setVlrHoraExtra(BigDecimal vlrHoraExtra) {
        this.vlrHoraExtra = vlrHoraExtra;
   }

   public BigDecimal getVlrResiduoCom() {
        return vlrResiduoCom;
   }

   public void setVlrResiduoCom(BigDecimal vlrResiduoCom) {
        this.vlrResiduoCom = vlrResiduoCom;
   }

   @Override
   public String getTableName() {
        return "TGFCOM";
   }

   @Override
   public String getEntityName() {
        return "ValorComissaoVendedor";
   }

   @Override
   public ValorComissaoVendedor fromVO(DynamicVO vo) {
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEvento = vo.asBigDecimal("CODEVENTO");
        this.codForm = vo.asBigDecimal("CODFORM");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.indiceProdutividade = vo.asBigDecimal("INDICEPRODUTIVIDADE");
        this.nuFechamento = vo.asBigDecimal("NUFECHAMENTO");
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.nuFinOrig = vo.asBigDecimal("NUFINORIG");
        this.numItemOrig = vo.asBigDecimal("NUMITEMORIG");
        this.numOsOrig = vo.asBigDecimal("NUMOSORIG");
        this.nuNotaOrig = vo.asBigDecimal("NUNOTAORIG");
        this.qtdHora = vo.asBigDecimal("QTDHORA");
        this.qtdHoraExtra = vo.asBigDecimal("QTDHORAEXTRA");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipo = vo.asString("TIPO");
        this.vlrCom = vo.asBigDecimal("VLRCOM");
        this.vlrHora = vo.asBigDecimal("VLRHORA");
        this.vlrHoraExtra = vo.asBigDecimal("VLRHORAEXTRA");
        this.vlrResiduoCom = vo.asBigDecimal("VLRRESIDUOCOM");
        return this;
   }
}
