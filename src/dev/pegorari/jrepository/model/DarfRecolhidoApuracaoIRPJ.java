package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DarfRecolhidoApuracaoIRPJ extends AbstractSankhyaEntity<DarfRecolhidoApuracaoIRPJ> {
   private BigDecimal codEmp;
   private BigDecimal codRec;
   private Timestamp dtApuracao;
   private Timestamp dtRecolhimento;
   private Timestamp dtVencimento;
   private Timestamp referencia;
   private BigDecimal vlrJuros;
   private BigDecimal vlrMulta;
   private BigDecimal vlrPrincipal;
   private BigDecimal vlrTot;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodRec() {
        return codRec;
   }

   public void setCodRec(BigDecimal codRec) {
        markAsChanged("CODREC", codRec);
        this.codRec = codRec;
   }

   public Timestamp getDtApuracao() {
        return dtApuracao;
   }

   public void setDtApuracao(Timestamp dtApuracao) {
        markAsChanged("DTAPURACAO", dtApuracao);
        this.dtApuracao = dtApuracao;
   }

   public Timestamp getDtRecolhimento() {
        return dtRecolhimento;
   }

   public void setDtRecolhimento(Timestamp dtRecolhimento) {
        markAsChanged("DTRECOLHIMENTO", dtRecolhimento);
        this.dtRecolhimento = dtRecolhimento;
   }

   public Timestamp getDtVencimento() {
        return dtVencimento;
   }

   public void setDtVencimento(Timestamp dtVencimento) {
        markAsChanged("DTVENCIMENTO", dtVencimento);
        this.dtVencimento = dtVencimento;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public BigDecimal getVlrJuros() {
        return vlrJuros;
   }

   public void setVlrJuros(BigDecimal vlrJuros) {
        markAsChanged("VLRJUROS", vlrJuros);
        this.vlrJuros = vlrJuros;
   }

   public BigDecimal getVlrMulta() {
        return vlrMulta;
   }

   public void setVlrMulta(BigDecimal vlrMulta) {
        markAsChanged("VLRMULTA", vlrMulta);
        this.vlrMulta = vlrMulta;
   }

   public BigDecimal getVlrPrincipal() {
        return vlrPrincipal;
   }

   public void setVlrPrincipal(BigDecimal vlrPrincipal) {
        markAsChanged("VLRPRINCIPAL", vlrPrincipal);
        this.vlrPrincipal = vlrPrincipal;
   }

   public BigDecimal getVlrTot() {
        return vlrTot;
   }

   public void setVlrTot(BigDecimal vlrTot) {
        markAsChanged("VLRTOT", vlrTot);
        this.vlrTot = vlrTot;
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
        this.setOriginalVO(vo);
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codRec = vo.asBigDecimal("CODREC");
        this.dtApuracao = vo.asTimestamp("DTAPURACAO");
        this.dtRecolhimento = vo.asTimestamp("DTRECOLHIMENTO");
        this.dtVencimento = vo.asTimestamp("DTVENCIMENTO");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.vlrJuros = vo.asBigDecimal("VLRJUROS");
        this.vlrMulta = vo.asBigDecimal("VLRMULTA");
        this.vlrPrincipal = vo.asBigDecimal("VLRPRINCIPAL");
        this.vlrTot = vo.asBigDecimal("VLRTOT");
        return this;
   }
}
