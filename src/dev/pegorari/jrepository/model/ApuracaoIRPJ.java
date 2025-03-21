package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ApuracaoIRPJ extends AbstractSankhyaEntity<ApuracaoIRPJ> {
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
   private BigDecimal vlrIrpjCompPrej;
   private BigDecimal vlrIrpjCompPrejCsll;
   private BigDecimal compBcNegCsll;
   private BigDecimal compPrejUfis;
   private BigDecimal deduOutInc;
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
        markAsChanged("BASEAJUSTADA", baseAjustada);
        this.baseAjustada = baseAjustada;
   }

   public BigDecimal getBaseAjustadaCsll() {
        return baseAjustadaCsll;
   }

   public void setBaseAjustadaCsll(BigDecimal baseAjustadaCsll) {
        markAsChanged("BASEAJUSTADA_CSLL", baseAjustadaCsll);
        this.baseAjustadaCsll = baseAjustadaCsll;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCompensacoes() {
        return compensacoes;
   }

   public void setCompensacoes(BigDecimal compensacoes) {
        markAsChanged("COMPENSACOES", compensacoes);
        this.compensacoes = compensacoes;
   }

   public BigDecimal getCompensacoesCsll() {
        return compensacoesCsll;
   }

   public void setCompensacoesCsll(BigDecimal compensacoesCsll) {
        markAsChanged("COMPENSACOES_CSLL", compensacoesCsll);
        this.compensacoesCsll = compensacoesCsll;
   }

   public BigDecimal getCsll9() {
        return csll9;
   }

   public void setCsll9(BigDecimal csll9) {
        markAsChanged("CSLL9", csll9);
        this.csll9 = csll9;
   }

   public BigDecimal getCsllRetido() {
        return csllRetido;
   }

   public void setCsllRetido(BigDecimal csllRetido) {
        markAsChanged("CSLLRETIDO", csllRetido);
        this.csllRetido = csllRetido;
   }

   public BigDecimal getDeducaoPat() {
        return deducaoPat;
   }

   public void setDeducaoPat(BigDecimal deducaoPat) {
        markAsChanged("DEDUCAOPAT", deducaoPat);
        this.deducaoPat = deducaoPat;
   }

   public BigDecimal getImpostoARecolherFinal() {
        return impostoARecolherFinal;
   }

   public void setImpostoARecolherFinal(BigDecimal impostoARecolherFinal) {
        markAsChanged("IMPOSTOARECOLHERFINAL", impostoARecolherFinal);
        this.impostoARecolherFinal = impostoARecolherFinal;
   }

   public BigDecimal getImpostoARecolherFinalCsll() {
        return impostoARecolherFinalCsll;
   }

   public void setImpostoARecolherFinalCsll(BigDecimal impostoARecolherFinalCsll) {
        markAsChanged("IMPOSTOARECOLHERFINAL_CSLL", impostoARecolherFinalCsll);
        this.impostoARecolherFinalCsll = impostoARecolherFinalCsll;
   }

   public BigDecimal getImpostoDevido() {
        return impostoDevido;
   }

   public void setImpostoDevido(BigDecimal impostoDevido) {
        markAsChanged("IMPOSTODEVIDO", impostoDevido);
        this.impostoDevido = impostoDevido;
   }

   public BigDecimal getImpostoDevidoLiq() {
        return impostoDevidoLiq;
   }

   public void setImpostoDevidoLiq(BigDecimal impostoDevidoLiq) {
        markAsChanged("IMPOSTODEVIDOLIQ", impostoDevidoLiq);
        this.impostoDevidoLiq = impostoDevidoLiq;
   }

   public BigDecimal getIrpj10() {
        return irpj10;
   }

   public void setIrpj10(BigDecimal irpj10) {
        markAsChanged("IRPJ10", irpj10);
        this.irpj10 = irpj10;
   }

   public BigDecimal getIrpj15() {
        return irpj15;
   }

   public void setIrpj15(BigDecimal irpj15) {
        markAsChanged("IRPJ15", irpj15);
        this.irpj15 = irpj15;
   }

   public BigDecimal getIrpjRetido() {
        return irpjRetido;
   }

   public void setIrpjRetido(BigDecimal irpjRetido) {
        markAsChanged("IRPJRETIDO", irpjRetido);
        this.irpjRetido = irpjRetido;
   }

   public BigDecimal getLucroAntesIr() {
        return lucroAntesIr;
   }

   public void setLucroAntesIr(BigDecimal lucroAntesIr) {
        markAsChanged("LUCROANTESIR", lucroAntesIr);
        this.lucroAntesIr = lucroAntesIr;
   }

   public BigDecimal getLucroAntesIrCsll() {
        return lucroAntesIrCsll;
   }

   public void setLucroAntesIrCsll(BigDecimal lucroAntesIrCsll) {
        markAsChanged("LUCROANTESIR_CSLL", lucroAntesIrCsll);
        this.lucroAntesIrCsll = lucroAntesIrCsll;
   }

   public BigDecimal getRecolhimentoAvulso() {
        return recolhimentoAvulso;
   }

   public void setRecolhimentoAvulso(BigDecimal recolhimentoAvulso) {
        markAsChanged("RECOLHIMENTOAVULSO", recolhimentoAvulso);
        this.recolhimentoAvulso = recolhimentoAvulso;
   }

   public BigDecimal getRecolhimentoAvulsoCsll() {
        return recolhimentoAvulsoCsll;
   }

   public void setRecolhimentoAvulsoCsll(BigDecimal recolhimentoAvulsoCsll) {
        markAsChanged("RECOLHIMENTOAVULSO_CSLL", recolhimentoAvulsoCsll);
        this.recolhimentoAvulsoCsll = recolhimentoAvulsoCsll;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public BigDecimal getSaldoARecolher() {
        return saldoARecolher;
   }

   public void setSaldoARecolher(BigDecimal saldoARecolher) {
        markAsChanged("SALDOARECOLHER", saldoARecolher);
        this.saldoARecolher = saldoARecolher;
   }

   public BigDecimal getSaldoARecolherCsll() {
        return saldoARecolherCsll;
   }

   public void setSaldoARecolherCsll(BigDecimal saldoARecolherCsll) {
        markAsChanged("SALDOARECOLHER_CSLL", saldoARecolherCsll);
        this.saldoARecolherCsll = saldoARecolherCsll;
   }

   public BigDecimal getTotalAdicoes() {
        return totalAdicoes;
   }

   public void setTotalAdicoes(BigDecimal totalAdicoes) {
        markAsChanged("TOTALADICOES", totalAdicoes);
        this.totalAdicoes = totalAdicoes;
   }

   public BigDecimal getTotalAdicoesCsll() {
        return totalAdicoesCsll;
   }

   public void setTotalAdicoesCsll(BigDecimal totalAdicoesCsll) {
        markAsChanged("TOTALADICOES_CSLL", totalAdicoesCsll);
        this.totalAdicoesCsll = totalAdicoesCsll;
   }

   public BigDecimal getTotalExclusoes() {
        return totalExclusoes;
   }

   public void setTotalExclusoes(BigDecimal totalExclusoes) {
        markAsChanged("TOTALEXCLUSOES", totalExclusoes);
        this.totalExclusoes = totalExclusoes;
   }

   public BigDecimal getTotalExclusoesCsll() {
        return totalExclusoesCsll;
   }

   public void setTotalExclusoesCsll(BigDecimal totalExclusoesCsll) {
        markAsChanged("TOTALEXCLUSOES_CSLL", totalExclusoesCsll);
        this.totalExclusoesCsll = totalExclusoesCsll;
   }

   public BigDecimal getTotalRecolhido() {
        return totalRecolhido;
   }

   public void setTotalRecolhido(BigDecimal totalRecolhido) {
        markAsChanged("TOTALRECOLHIDO", totalRecolhido);
        this.totalRecolhido = totalRecolhido;
   }

   public BigDecimal getTotalRecolhidoCsll() {
        return totalRecolhidoCsll;
   }

   public void setTotalRecolhidoCsll(BigDecimal totalRecolhidoCsll) {
        markAsChanged("TOTALRECOLHIDO_CSLL", totalRecolhidoCsll);
        this.totalRecolhidoCsll = totalRecolhidoCsll;
   }

   public BigDecimal getValorPat() {
        return valorPat;
   }

   public void setValorPat(BigDecimal valorPat) {
        markAsChanged("VALORPAT", valorPat);
        this.valorPat = valorPat;
   }

   public String getFormaApur() {
        return formaApur;
   }

   public void setFormaApur(String formaApur) {
        markAsChanged("FORMAAPUR", formaApur);
        this.formaApur = formaApur;
   }

   public BigDecimal getVlrIrpjCompPrej() {
        return vlrIrpjCompPrej;
   }

   public void setVlrIrpjCompPrej(BigDecimal vlrIrpjCompPrej) {
        markAsChanged("VLRIRPJCOMPPREJ", vlrIrpjCompPrej);
        this.vlrIrpjCompPrej = vlrIrpjCompPrej;
   }

   public BigDecimal getVlrIrpjCompPrejCsll() {
        return vlrIrpjCompPrejCsll;
   }

   public void setVlrIrpjCompPrejCsll(BigDecimal vlrIrpjCompPrejCsll) {
        markAsChanged("VLRIRPJCOMPPREJ_CSLL", vlrIrpjCompPrejCsll);
        this.vlrIrpjCompPrejCsll = vlrIrpjCompPrejCsll;
   }

   public BigDecimal getCompBcNegCsll() {
        return compBcNegCsll;
   }

   public void setCompBcNegCsll(BigDecimal compBcNegCsll) {
        markAsChanged("COMPBCNEG_CSLL", compBcNegCsll);
        this.compBcNegCsll = compBcNegCsll;
   }

   public BigDecimal getCompPrejUfis() {
        return compPrejUfis;
   }

   public void setCompPrejUfis(BigDecimal compPrejUfis) {
        markAsChanged("COMPPREJUFIS", compPrejUfis);
        this.compPrejUfis = compPrejUfis;
   }

   public BigDecimal getDeduOutInc() {
        return deduOutInc;
   }

   public void setDeduOutInc(BigDecimal deduOutInc) {
        markAsChanged("DEDUOUTINC", deduOutInc);
        this.deduOutInc = deduOutInc;
   }

   public BigDecimal getResLiqAjus() {
        return resLiqAjus;
   }

   public void setResLiqAjus(BigDecimal resLiqAjus) {
        markAsChanged("RESLIQAJUS", resLiqAjus);
        this.resLiqAjus = resLiqAjus;
   }

   public BigDecimal getResLiqAjusCsll() {
        return resLiqAjusCsll;
   }

   public void setResLiqAjusCsll(BigDecimal resLiqAjusCsll) {
        markAsChanged("RESLIQAJUS_CSLL", resLiqAjusCsll);
        this.resLiqAjusCsll = resLiqAjusCsll;
   }

   public BigDecimal getVlrCsllRetComp() {
        return vlrCsllRetComp;
   }

   public void setVlrCsllRetComp(BigDecimal vlrCsllRetComp) {
        markAsChanged("VLRCSLLRETCOMP", vlrCsllRetComp);
        this.vlrCsllRetComp = vlrCsllRetComp;
   }

   public BigDecimal getVlrIrpjRetComp() {
        return vlrIrpjRetComp;
   }

   public void setVlrIrpjRetComp(BigDecimal vlrIrpjRetComp) {
        markAsChanged("VLRIRPJRETCOMP", vlrIrpjRetComp);
        this.vlrIrpjRetComp = vlrIrpjRetComp;
   }

   public String getConsCrespecPartea() {
        return consCrespecPartea;
   }

   public void setConsCrespecPartea(String consCrespecPartea) {
        markAsChanged("CONSCRESPECPARTEA", consCrespecPartea);
        this.consCrespecPartea = consCrespecPartea;
   }

   public String getDeduzPat10() {
        return deduzPat10;
   }

   public void setDeduzPat10(String deduzPat10) {
        markAsChanged("DEDUZPAT10", deduzPat10);
        this.deduzPat10 = deduzPat10;
   }

   @Override
   public String getTableName() {
        return "TCBIRPJ";
   }

   @Override
   public String getEntityName() {
        return "ApuracaoIRPJ";
   }

   @Override
   public ApuracaoIRPJ fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.baseAjustada = vo.asBigDecimal("BASEAJUSTADA");
        this.baseAjustadaCsll = vo.asBigDecimal("BASEAJUSTADA_CSLL");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.compensacoes = vo.asBigDecimal("COMPENSACOES");
        this.compensacoesCsll = vo.asBigDecimal("COMPENSACOES_CSLL");
        this.csll9 = vo.asBigDecimal("CSLL9");
        this.csllRetido = vo.asBigDecimal("CSLLRETIDO");
        this.deducaoPat = vo.asBigDecimal("DEDUCAOPAT");
        this.impostoARecolherFinal = vo.asBigDecimal("IMPOSTOARECOLHERFINAL");
        this.impostoARecolherFinalCsll = vo.asBigDecimal("IMPOSTOARECOLHERFINAL_CSLL");
        this.impostoDevido = vo.asBigDecimal("IMPOSTODEVIDO");
        this.impostoDevidoLiq = vo.asBigDecimal("IMPOSTODEVIDOLIQ");
        this.irpj10 = vo.asBigDecimal("IRPJ10");
        this.irpj15 = vo.asBigDecimal("IRPJ15");
        this.irpjRetido = vo.asBigDecimal("IRPJRETIDO");
        this.lucroAntesIr = vo.asBigDecimal("LUCROANTESIR");
        this.lucroAntesIrCsll = vo.asBigDecimal("LUCROANTESIR_CSLL");
        this.recolhimentoAvulso = vo.asBigDecimal("RECOLHIMENTOAVULSO");
        this.recolhimentoAvulsoCsll = vo.asBigDecimal("RECOLHIMENTOAVULSO_CSLL");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.saldoARecolher = vo.asBigDecimal("SALDOARECOLHER");
        this.saldoARecolherCsll = vo.asBigDecimal("SALDOARECOLHER_CSLL");
        this.totalAdicoes = vo.asBigDecimal("TOTALADICOES");
        this.totalAdicoesCsll = vo.asBigDecimal("TOTALADICOES_CSLL");
        this.totalExclusoes = vo.asBigDecimal("TOTALEXCLUSOES");
        this.totalExclusoesCsll = vo.asBigDecimal("TOTALEXCLUSOES_CSLL");
        this.totalRecolhido = vo.asBigDecimal("TOTALRECOLHIDO");
        this.totalRecolhidoCsll = vo.asBigDecimal("TOTALRECOLHIDO_CSLL");
        this.valorPat = vo.asBigDecimal("VALORPAT");
        this.formaApur = vo.asString("FORMAAPUR");
        this.vlrIrpjCompPrej = vo.asBigDecimal("VLRIRPJCOMPPREJ");
        this.vlrIrpjCompPrejCsll = vo.asBigDecimal("VLRIRPJCOMPPREJ_CSLL");
        this.compBcNegCsll = vo.asBigDecimal("COMPBCNEG_CSLL");
        this.compPrejUfis = vo.asBigDecimal("COMPPREJUFIS");
        this.deduOutInc = vo.asBigDecimal("DEDUOUTINC");
        this.resLiqAjus = vo.asBigDecimal("RESLIQAJUS");
        this.resLiqAjusCsll = vo.asBigDecimal("RESLIQAJUS_CSLL");
        this.vlrCsllRetComp = vo.asBigDecimal("VLRCSLLRETCOMP");
        this.vlrIrpjRetComp = vo.asBigDecimal("VLRIRPJRETCOMP");
        this.consCrespecPartea = vo.asString("CONSCRESPECPARTEA");
        this.deduzPat10 = vo.asString("DEDUZPAT10");
        return this;
   }
}
