package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ApuracaoIRPJ implements SankhyaEntity<ApuracaoIRPJ> {

   private BigDecimal baseAjustada;
   private BigDecimal baseAjustadaCsll;
   private BigDecimal codEmp;
   private BigDecimal compensacoes;
   private BigDecimal compensacoesCsll;
   private BigDecimal csll9;
   private BigDecimal csllRetido;
   private BigDecimal deducaoPat;
   private BigDecimal impostoARecolherFinal;
   private BigDecimal impostoARecolherFinalCsll;
   private BigDecimal impostoDevido;
   private BigDecimal impostoDevidoLiq;
   private BigDecimal irpj10;
   private BigDecimal irpj15;
   private BigDecimal irpjRetido;
   private BigDecimal lucroAntesIr;
   private BigDecimal lucroAntesIrCsll;
   private BigDecimal recolhimentoAvulso;
   private BigDecimal recolhimentoAvulsoCsll;
   private Timestamp referencia;
   private BigDecimal saldoARecolher;
   private BigDecimal saldoARecolherCsll;
   private BigDecimal totalAdicoes;
   private BigDecimal totalAdicoesCsll;
   private BigDecimal totalExclusoes;
   private BigDecimal totalExclusoesCsll;
   private BigDecimal totalRecolhido;
   private BigDecimal totalRecolhidoCsll;
   private BigDecimal valorPat;
   private String formaApur;
   private BigDecimal vlrIrpjCompprej;
   private BigDecimal vlrIrpjCompprejCsll;
   private BigDecimal compBcnegCsll;
   private BigDecimal compprejUfis;
   private BigDecimal deduOutinc;
   private BigDecimal resLiqAjus;
   private BigDecimal resLiqAjusCsll;
   private BigDecimal vlrCsllRetComp;
   private BigDecimal vlrIrpjRetComp;
   private String consCrespecPartea;
   private String deduzPat10;

   public BigDecimal getBaseAjustada() {
        return baseAjustada;
   }

   public void setBaseAjustada(BigDecimal baseAjustada) {
        this.baseAjustada = baseAjustada;
   }

   public BigDecimal getBaseAjustadaCsll() {
        return baseAjustadaCsll;
   }

   public void setBaseAjustadaCsll(BigDecimal baseAjustadaCsll) {
        this.baseAjustadaCsll = baseAjustadaCsll;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCompensacoes() {
        return compensacoes;
   }

   public void setCompensacoes(BigDecimal compensacoes) {
        this.compensacoes = compensacoes;
   }

   public BigDecimal getCompensacoesCsll() {
        return compensacoesCsll;
   }

   public void setCompensacoesCsll(BigDecimal compensacoesCsll) {
        this.compensacoesCsll = compensacoesCsll;
   }

   public BigDecimal getCsll9() {
        return csll9;
   }

   public void setCsll9(BigDecimal csll9) {
        this.csll9 = csll9;
   }

   public BigDecimal getCsllRetido() {
        return csllRetido;
   }

   public void setCsllRetido(BigDecimal csllRetido) {
        this.csllRetido = csllRetido;
   }

   public BigDecimal getDeducaoPat() {
        return deducaoPat;
   }

   public void setDeducaoPat(BigDecimal deducaoPat) {
        this.deducaoPat = deducaoPat;
   }

   public BigDecimal getImpostoARecolherFinal() {
        return impostoARecolherFinal;
   }

   public void setImpostoARecolherFinal(BigDecimal impostoARecolherFinal) {
        this.impostoARecolherFinal = impostoARecolherFinal;
   }

   public BigDecimal getImpostoARecolherFinalCsll() {
        return impostoARecolherFinalCsll;
   }

   public void setImpostoARecolherFinalCsll(BigDecimal impostoARecolherFinalCsll) {
        this.impostoARecolherFinalCsll = impostoARecolherFinalCsll;
   }

   public BigDecimal getImpostoDevido() {
        return impostoDevido;
   }

   public void setImpostoDevido(BigDecimal impostoDevido) {
        this.impostoDevido = impostoDevido;
   }

   public BigDecimal getImpostoDevidoLiq() {
        return impostoDevidoLiq;
   }

   public void setImpostoDevidoLiq(BigDecimal impostoDevidoLiq) {
        this.impostoDevidoLiq = impostoDevidoLiq;
   }

   public BigDecimal getIrpj10() {
        return irpj10;
   }

   public void setIrpj10(BigDecimal irpj10) {
        this.irpj10 = irpj10;
   }

   public BigDecimal getIrpj15() {
        return irpj15;
   }

   public void setIrpj15(BigDecimal irpj15) {
        this.irpj15 = irpj15;
   }

   public BigDecimal getIrpjRetido() {
        return irpjRetido;
   }

   public void setIrpjRetido(BigDecimal irpjRetido) {
        this.irpjRetido = irpjRetido;
   }

   public BigDecimal getLucroAntesIr() {
        return lucroAntesIr;
   }

   public void setLucroAntesIr(BigDecimal lucroAntesIr) {
        this.lucroAntesIr = lucroAntesIr;
   }

   public BigDecimal getLucroAntesIrCsll() {
        return lucroAntesIrCsll;
   }

   public void setLucroAntesIrCsll(BigDecimal lucroAntesIrCsll) {
        this.lucroAntesIrCsll = lucroAntesIrCsll;
   }

   public BigDecimal getRecolhimentoAvulso() {
        return recolhimentoAvulso;
   }

   public void setRecolhimentoAvulso(BigDecimal recolhimentoAvulso) {
        this.recolhimentoAvulso = recolhimentoAvulso;
   }

   public BigDecimal getRecolhimentoAvulsoCsll() {
        return recolhimentoAvulsoCsll;
   }

   public void setRecolhimentoAvulsoCsll(BigDecimal recolhimentoAvulsoCsll) {
        this.recolhimentoAvulsoCsll = recolhimentoAvulsoCsll;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        this.referencia = referencia;
   }

   public BigDecimal getSaldoARecolher() {
        return saldoARecolher;
   }

   public void setSaldoARecolher(BigDecimal saldoARecolher) {
        this.saldoARecolher = saldoARecolher;
   }

   public BigDecimal getSaldoARecolherCsll() {
        return saldoARecolherCsll;
   }

   public void setSaldoARecolherCsll(BigDecimal saldoARecolherCsll) {
        this.saldoARecolherCsll = saldoARecolherCsll;
   }

   public BigDecimal getTotalAdicoes() {
        return totalAdicoes;
   }

   public void setTotalAdicoes(BigDecimal totalAdicoes) {
        this.totalAdicoes = totalAdicoes;
   }

   public BigDecimal getTotalAdicoesCsll() {
        return totalAdicoesCsll;
   }

   public void setTotalAdicoesCsll(BigDecimal totalAdicoesCsll) {
        this.totalAdicoesCsll = totalAdicoesCsll;
   }

   public BigDecimal getTotalExclusoes() {
        return totalExclusoes;
   }

   public void setTotalExclusoes(BigDecimal totalExclusoes) {
        this.totalExclusoes = totalExclusoes;
   }

   public BigDecimal getTotalExclusoesCsll() {
        return totalExclusoesCsll;
   }

   public void setTotalExclusoesCsll(BigDecimal totalExclusoesCsll) {
        this.totalExclusoesCsll = totalExclusoesCsll;
   }

   public BigDecimal getTotalRecolhido() {
        return totalRecolhido;
   }

   public void setTotalRecolhido(BigDecimal totalRecolhido) {
        this.totalRecolhido = totalRecolhido;
   }

   public BigDecimal getTotalRecolhidoCsll() {
        return totalRecolhidoCsll;
   }

   public void setTotalRecolhidoCsll(BigDecimal totalRecolhidoCsll) {
        this.totalRecolhidoCsll = totalRecolhidoCsll;
   }

   public BigDecimal getValorPat() {
        return valorPat;
   }

   public void setValorPat(BigDecimal valorPat) {
        this.valorPat = valorPat;
   }

   public String getFormaApur() {
        return formaApur;
   }

   public void setFormaApur(String formaApur) {
        this.formaApur = formaApur;
   }

   public BigDecimal getVlrIrpjCompprej() {
        return vlrIrpjCompprej;
   }

   public void setVlrIrpjCompprej(BigDecimal vlrIrpjCompprej) {
        this.vlrIrpjCompprej = vlrIrpjCompprej;
   }

   public BigDecimal getVlrIrpjCompprejCsll() {
        return vlrIrpjCompprejCsll;
   }

   public void setVlrIrpjCompprejCsll(BigDecimal vlrIrpjCompprejCsll) {
        this.vlrIrpjCompprejCsll = vlrIrpjCompprejCsll;
   }

   public BigDecimal getCompBcnegCsll() {
        return compBcnegCsll;
   }

   public void setCompBcnegCsll(BigDecimal compBcnegCsll) {
        this.compBcnegCsll = compBcnegCsll;
   }

   public BigDecimal getCompprejUfis() {
        return compprejUfis;
   }

   public void setCompprejUfis(BigDecimal compprejUfis) {
        this.compprejUfis = compprejUfis;
   }

   public BigDecimal getDeduOutinc() {
        return deduOutinc;
   }

   public void setDeduOutinc(BigDecimal deduOutinc) {
        this.deduOutinc = deduOutinc;
   }

   public BigDecimal getResLiqAjus() {
        return resLiqAjus;
   }

   public void setResLiqAjus(BigDecimal resLiqAjus) {
        this.resLiqAjus = resLiqAjus;
   }

   public BigDecimal getResLiqAjusCsll() {
        return resLiqAjusCsll;
   }

   public void setResLiqAjusCsll(BigDecimal resLiqAjusCsll) {
        this.resLiqAjusCsll = resLiqAjusCsll;
   }

   public BigDecimal getVlrCsllRetComp() {
        return vlrCsllRetComp;
   }

   public void setVlrCsllRetComp(BigDecimal vlrCsllRetComp) {
        this.vlrCsllRetComp = vlrCsllRetComp;
   }

   public BigDecimal getVlrIrpjRetComp() {
        return vlrIrpjRetComp;
   }

   public void setVlrIrpjRetComp(BigDecimal vlrIrpjRetComp) {
        this.vlrIrpjRetComp = vlrIrpjRetComp;
   }

   public String getConsCrespecPartea() {
        return consCrespecPartea;
   }

   public void setConsCrespecPartea(String consCrespecPartea) {
        this.consCrespecPartea = consCrespecPartea;
   }

   public String getDeduzPat10() {
        return deduzPat10;
   }

   public void setDeduzPat10(String deduzPat10) {
        this.deduzPat10 = deduzPat10;
   }

   @Override
   public String getEntityName() {
        return "ApuracaoIRPJ";
   }

   @Override
   public ApuracaoIRPJ fromVO(DynamicVO vo) {
        this.baseAjustada = vo.asBigDecimal("BASEAJUSTADA");
        this.baseAjustadaCsll = vo.asBigDecimal("BASEAJUSTADACSLL");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.compensacoes = vo.asBigDecimal("COMPENSACOES");
        this.compensacoesCsll = vo.asBigDecimal("COMPENSACOESCSLL");
        this.csll9 = vo.asBigDecimal("CSLL9");
        this.csllRetido = vo.asBigDecimal("CSLLRETIDO");
        this.deducaoPat = vo.asBigDecimal("DEDUCAOPAT");
        this.impostoARecolherFinal = vo.asBigDecimal("IMPOSTOARECOLHERFINAL");
        this.impostoARecolherFinalCsll = vo.asBigDecimal("IMPOSTOARECOLHERFINALCSLL");
        this.impostoDevido = vo.asBigDecimal("IMPOSTODEVIDO");
        this.impostoDevidoLiq = vo.asBigDecimal("IMPOSTODEVIDOLIQ");
        this.irpj10 = vo.asBigDecimal("IRPJ10");
        this.irpj15 = vo.asBigDecimal("IRPJ15");
        this.irpjRetido = vo.asBigDecimal("IRPJRETIDO");
        this.lucroAntesIr = vo.asBigDecimal("LUCROANTESIR");
        this.lucroAntesIrCsll = vo.asBigDecimal("LUCROANTESIRCSLL");
        this.recolhimentoAvulso = vo.asBigDecimal("RECOLHIMENTOAVULSO");
        this.recolhimentoAvulsoCsll = vo.asBigDecimal("RECOLHIMENTOAVULSOCSLL");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.saldoARecolher = vo.asBigDecimal("SALDOARECOLHER");
        this.saldoARecolherCsll = vo.asBigDecimal("SALDOARECOLHERCSLL");
        this.totalAdicoes = vo.asBigDecimal("TOTALADICOES");
        this.totalAdicoesCsll = vo.asBigDecimal("TOTALADICOESCSLL");
        this.totalExclusoes = vo.asBigDecimal("TOTALEXCLUSOES");
        this.totalExclusoesCsll = vo.asBigDecimal("TOTALEXCLUSOESCSLL");
        this.totalRecolhido = vo.asBigDecimal("TOTALRECOLHIDO");
        this.totalRecolhidoCsll = vo.asBigDecimal("TOTALRECOLHIDOCSLL");
        this.valorPat = vo.asBigDecimal("VALORPAT");
        this.formaApur = vo.asString("FORMAAPUR");
        this.vlrIrpjCompprej = vo.asBigDecimal("VLRIRPJCOMPPREJ");
        this.vlrIrpjCompprejCsll = vo.asBigDecimal("VLRIRPJCOMPPREJCSLL");
        this.compBcnegCsll = vo.asBigDecimal("COMPBCNEGCSLL");
        this.compprejUfis = vo.asBigDecimal("COMPPREJUFIS");
        this.deduOutinc = vo.asBigDecimal("DEDUOUTINC");
        this.resLiqAjus = vo.asBigDecimal("RESLIQAJUS");
        this.resLiqAjusCsll = vo.asBigDecimal("RESLIQAJUSCSLL");
        this.vlrCsllRetComp = vo.asBigDecimal("VLRCSLLRETCOMP");
        this.vlrIrpjRetComp = vo.asBigDecimal("VLRIRPJRETCOMP");
        this.consCrespecPartea = vo.asString("CONSCRESPECPARTEA");
        this.deduzPat10 = vo.asString("DEDUZPAT10");
        return this;
   }
}
