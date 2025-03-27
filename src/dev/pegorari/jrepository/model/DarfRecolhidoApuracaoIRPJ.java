package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DarfRecolhidoApuracaoIRPJ extends AbstractSankhyaEntity<DarfRecolhidoApuracaoIRPJ> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodRec() {
        return this.getVo().asBigDecimal("CODREC");
   }

   public void setCodRec(BigDecimal codRec) {
        markAsChanged("CODREC", codRec);
   }

   public Timestamp getDtApuracao() {
        return this.getVo().asTimestamp("DTAPURACAO");
   }

   public void setDtApuracao(Timestamp dtApuracao) {
        markAsChanged("DTAPURACAO", dtApuracao);
   }

   public Timestamp getDtRecolhimento() {
        return this.getVo().asTimestamp("DTRECOLHIMENTO");
   }

   public void setDtRecolhimento(Timestamp dtRecolhimento) {
        markAsChanged("DTRECOLHIMENTO", dtRecolhimento);
   }

   public Timestamp getDtVencimento() {
        return this.getVo().asTimestamp("DTVENCIMENTO");
   }

   public void setDtVencimento(Timestamp dtVencimento) {
        markAsChanged("DTVENCIMENTO", dtVencimento);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getVlrJuros() {
        return this.getVo().asBigDecimal("VLRJUROS");
   }

   public void setVlrJuros(BigDecimal vlrJuros) {
        markAsChanged("VLRJUROS", vlrJuros);
   }

   public BigDecimal getVlrMulta() {
        return this.getVo().asBigDecimal("VLRMULTA");
   }

   public void setVlrMulta(BigDecimal vlrMulta) {
        markAsChanged("VLRMULTA", vlrMulta);
   }

   public BigDecimal getVlrPrincipal() {
        return this.getVo().asBigDecimal("VLRPRINCIPAL");
   }

   public void setVlrPrincipal(BigDecimal vlrPrincipal) {
        markAsChanged("VLRPRINCIPAL", vlrPrincipal);
   }

   public BigDecimal getVlrTot() {
        return this.getVo().asBigDecimal("VLRTOT");
   }

   public void setVlrTot(BigDecimal vlrTot) {
        markAsChanged("VLRTOT", vlrTot);
   }

   @Override
   public String getTableName() {
        return "TCBIRPJDARF";
   }

   @Override
   public String getEntityName() {
        return "DarfRecolhidoApuracaoIRPJ";
   }

   @Override
   public DarfRecolhidoApuracaoIRPJ fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
