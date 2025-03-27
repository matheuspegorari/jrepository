package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ApuracaoIRPJ extends AbstractSankhyaEntity<ApuracaoIRPJ> {
   public BigDecimal getBaseAjustada() {
        return this.getVo().asBigDecimal("BASEAJUSTADA");
   }

   public void setBaseAjustada(BigDecimal baseAjustada) {
        markAsChanged("BASEAJUSTADA", baseAjustada);
   }

   public BigDecimal getBaseAjustadaCsll() {
        return this.getVo().asBigDecimal("BASEAJUSTADA_CSLL");
   }

   public void setBaseAjustadaCsll(BigDecimal baseAjustadaCsll) {
        markAsChanged("BASEAJUSTADA_CSLL", baseAjustadaCsll);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCompensacoes() {
        return this.getVo().asBigDecimal("COMPENSACOES");
   }

   public void setCompensacoes(BigDecimal compensacoes) {
        markAsChanged("COMPENSACOES", compensacoes);
   }

   public BigDecimal getCompensacoesCsll() {
        return this.getVo().asBigDecimal("COMPENSACOES_CSLL");
   }

   public void setCompensacoesCsll(BigDecimal compensacoesCsll) {
        markAsChanged("COMPENSACOES_CSLL", compensacoesCsll);
   }

   public BigDecimal getCsll9() {
        return this.getVo().asBigDecimal("CSLL9");
   }

   public void setCsll9(BigDecimal csll9) {
        markAsChanged("CSLL9", csll9);
   }

   public BigDecimal getCsllRetido() {
        return this.getVo().asBigDecimal("CSLLRETIDO");
   }

   public void setCsllRetido(BigDecimal csllRetido) {
        markAsChanged("CSLLRETIDO", csllRetido);
   }

   public BigDecimal getDeducaoPat() {
        return this.getVo().asBigDecimal("DEDUCAOPAT");
   }

   public void setDeducaoPat(BigDecimal deducaoPat) {
        markAsChanged("DEDUCAOPAT", deducaoPat);
   }

   public BigDecimal getImpostoARecolherFinal() {
        return this.getVo().asBigDecimal("IMPOSTOARECOLHERFINAL");
   }

   public void setImpostoARecolherFinal(BigDecimal impostoARecolherFinal) {
        markAsChanged("IMPOSTOARECOLHERFINAL", impostoARecolherFinal);
   }

   public BigDecimal getImpostoARecolherFinalCsll() {
        return this.getVo().asBigDecimal("IMPOSTOARECOLHERFINAL_CSLL");
   }

   public void setImpostoARecolherFinalCsll(BigDecimal impostoARecolherFinalCsll) {
        markAsChanged("IMPOSTOARECOLHERFINAL_CSLL", impostoARecolherFinalCsll);
   }

   public BigDecimal getImpostoDevido() {
        return this.getVo().asBigDecimal("IMPOSTODEVIDO");
   }

   public void setImpostoDevido(BigDecimal impostoDevido) {
        markAsChanged("IMPOSTODEVIDO", impostoDevido);
   }

   public BigDecimal getImpostoDevidoLiq() {
        return this.getVo().asBigDecimal("IMPOSTODEVIDOLIQ");
   }

   public void setImpostoDevidoLiq(BigDecimal impostoDevidoLiq) {
        markAsChanged("IMPOSTODEVIDOLIQ", impostoDevidoLiq);
   }

   public BigDecimal getIrpj10() {
        return this.getVo().asBigDecimal("IRPJ10");
   }

   public void setIrpj10(BigDecimal irpj10) {
        markAsChanged("IRPJ10", irpj10);
   }

   public BigDecimal getIrpj15() {
        return this.getVo().asBigDecimal("IRPJ15");
   }

   public void setIrpj15(BigDecimal irpj15) {
        markAsChanged("IRPJ15", irpj15);
   }

   public BigDecimal getIrpjRetido() {
        return this.getVo().asBigDecimal("IRPJRETIDO");
   }

   public void setIrpjRetido(BigDecimal irpjRetido) {
        markAsChanged("IRPJRETIDO", irpjRetido);
   }

   public BigDecimal getLucroAntesIr() {
        return this.getVo().asBigDecimal("LUCROANTESIR");
   }

   public void setLucroAntesIr(BigDecimal lucroAntesIr) {
        markAsChanged("LUCROANTESIR", lucroAntesIr);
   }

   public BigDecimal getLucroAntesIrCsll() {
        return this.getVo().asBigDecimal("LUCROANTESIR_CSLL");
   }

   public void setLucroAntesIrCsll(BigDecimal lucroAntesIrCsll) {
        markAsChanged("LUCROANTESIR_CSLL", lucroAntesIrCsll);
   }

   public BigDecimal getRecolhimentoAvulso() {
        return this.getVo().asBigDecimal("RECOLHIMENTOAVULSO");
   }

   public void setRecolhimentoAvulso(BigDecimal recolhimentoAvulso) {
        markAsChanged("RECOLHIMENTOAVULSO", recolhimentoAvulso);
   }

   public BigDecimal getRecolhimentoAvulsoCsll() {
        return this.getVo().asBigDecimal("RECOLHIMENTOAVULSO_CSLL");
   }

   public void setRecolhimentoAvulsoCsll(BigDecimal recolhimentoAvulsoCsll) {
        markAsChanged("RECOLHIMENTOAVULSO_CSLL", recolhimentoAvulsoCsll);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getSaldoARecolher() {
        return this.getVo().asBigDecimal("SALDOARECOLHER");
   }

   public void setSaldoARecolher(BigDecimal saldoARecolher) {
        markAsChanged("SALDOARECOLHER", saldoARecolher);
   }

   public BigDecimal getSaldoARecolherCsll() {
        return this.getVo().asBigDecimal("SALDOARECOLHER_CSLL");
   }

   public void setSaldoARecolherCsll(BigDecimal saldoARecolherCsll) {
        markAsChanged("SALDOARECOLHER_CSLL", saldoARecolherCsll);
   }

   public BigDecimal getTotalAdicoes() {
        return this.getVo().asBigDecimal("TOTALADICOES");
   }

   public void setTotalAdicoes(BigDecimal totalAdicoes) {
        markAsChanged("TOTALADICOES", totalAdicoes);
   }

   public BigDecimal getTotalAdicoesCsll() {
        return this.getVo().asBigDecimal("TOTALADICOES_CSLL");
   }

   public void setTotalAdicoesCsll(BigDecimal totalAdicoesCsll) {
        markAsChanged("TOTALADICOES_CSLL", totalAdicoesCsll);
   }

   public BigDecimal getTotalExclusoes() {
        return this.getVo().asBigDecimal("TOTALEXCLUSOES");
   }

   public void setTotalExclusoes(BigDecimal totalExclusoes) {
        markAsChanged("TOTALEXCLUSOES", totalExclusoes);
   }

   public BigDecimal getTotalExclusoesCsll() {
        return this.getVo().asBigDecimal("TOTALEXCLUSOES_CSLL");
   }

   public void setTotalExclusoesCsll(BigDecimal totalExclusoesCsll) {
        markAsChanged("TOTALEXCLUSOES_CSLL", totalExclusoesCsll);
   }

   public BigDecimal getTotalRecolhido() {
        return this.getVo().asBigDecimal("TOTALRECOLHIDO");
   }

   public void setTotalRecolhido(BigDecimal totalRecolhido) {
        markAsChanged("TOTALRECOLHIDO", totalRecolhido);
   }

   public BigDecimal getTotalRecolhidoCsll() {
        return this.getVo().asBigDecimal("TOTALRECOLHIDO_CSLL");
   }

   public void setTotalRecolhidoCsll(BigDecimal totalRecolhidoCsll) {
        markAsChanged("TOTALRECOLHIDO_CSLL", totalRecolhidoCsll);
   }

   public BigDecimal getValorPat() {
        return this.getVo().asBigDecimal("VALORPAT");
   }

   public void setValorPat(BigDecimal valorPat) {
        markAsChanged("VALORPAT", valorPat);
   }

   public String getFormaApur() {
        return this.getVo().asString("FORMAAPUR");
   }

   public void setFormaApur(String formaApur) {
        markAsChanged("FORMAAPUR", formaApur);
   }

   public BigDecimal getVlrIrpjCompPrej() {
        return this.getVo().asBigDecimal("VLRIRPJCOMPPREJ");
   }

   public void setVlrIrpjCompPrej(BigDecimal vlrIrpjCompPrej) {
        markAsChanged("VLRIRPJCOMPPREJ", vlrIrpjCompPrej);
   }

   public BigDecimal getVlrIrpjCompPrejCsll() {
        return this.getVo().asBigDecimal("VLRIRPJCOMPPREJ_CSLL");
   }

   public void setVlrIrpjCompPrejCsll(BigDecimal vlrIrpjCompPrejCsll) {
        markAsChanged("VLRIRPJCOMPPREJ_CSLL", vlrIrpjCompPrejCsll);
   }

   public BigDecimal getCompBcNegCsll() {
        return this.getVo().asBigDecimal("COMPBCNEG_CSLL");
   }

   public void setCompBcNegCsll(BigDecimal compBcNegCsll) {
        markAsChanged("COMPBCNEG_CSLL", compBcNegCsll);
   }

   public BigDecimal getCompPrejUfis() {
        return this.getVo().asBigDecimal("COMPPREJUFIS");
   }

   public void setCompPrejUfis(BigDecimal compPrejUfis) {
        markAsChanged("COMPPREJUFIS", compPrejUfis);
   }

   public BigDecimal getDeduOutInc() {
        return this.getVo().asBigDecimal("DEDUOUTINC");
   }

   public void setDeduOutInc(BigDecimal deduOutInc) {
        markAsChanged("DEDUOUTINC", deduOutInc);
   }

   public BigDecimal getResLiqAjus() {
        return this.getVo().asBigDecimal("RESLIQAJUS");
   }

   public void setResLiqAjus(BigDecimal resLiqAjus) {
        markAsChanged("RESLIQAJUS", resLiqAjus);
   }

   public BigDecimal getResLiqAjusCsll() {
        return this.getVo().asBigDecimal("RESLIQAJUS_CSLL");
   }

   public void setResLiqAjusCsll(BigDecimal resLiqAjusCsll) {
        markAsChanged("RESLIQAJUS_CSLL", resLiqAjusCsll);
   }

   public BigDecimal getVlrCsllRetComp() {
        return this.getVo().asBigDecimal("VLRCSLLRETCOMP");
   }

   public void setVlrCsllRetComp(BigDecimal vlrCsllRetComp) {
        markAsChanged("VLRCSLLRETCOMP", vlrCsllRetComp);
   }

   public BigDecimal getVlrIrpjRetComp() {
        return this.getVo().asBigDecimal("VLRIRPJRETCOMP");
   }

   public void setVlrIrpjRetComp(BigDecimal vlrIrpjRetComp) {
        markAsChanged("VLRIRPJRETCOMP", vlrIrpjRetComp);
   }

   public String getConsCrespecPartea() {
        return this.getVo().asString("CONSCRESPECPARTEA");
   }

   public void setConsCrespecPartea(String consCrespecPartea) {
        markAsChanged("CONSCRESPECPARTEA", consCrespecPartea);
   }

   public String getDeduzPat10() {
        return this.getVo().asString("DEDUZPAT10");
   }

   public void setDeduzPat10(String deduzPat10) {
        markAsChanged("DEDUZPAT10", deduzPat10);
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
        this.setVo(vo);
        return this;
   }
}
