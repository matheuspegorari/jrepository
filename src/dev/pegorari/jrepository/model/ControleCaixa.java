package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ControleCaixa implements SankhyaEntity<ControleCaixa> {

   private BigDecimal codCtabCoint;
   private BigDecimal codUsu;
   private String conferido;
   private BigDecimal despesa;
   private Timestamp dtAbertura;
   private Timestamp dtFechamento;
   private BigDecimal nuCaixa;
   private BigDecimal receita;
   private BigDecimal saldoInicial;
   private BigDecimal codPdv;

   public BigDecimal getCodCtabCoint() {
        return codCtabCoint;
   }

   public void setCodCtabCoint(BigDecimal codCtabCoint) {
        this.codCtabCoint = codCtabCoint;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getConferido() {
        return conferido;
   }

   public void setConferido(String conferido) {
        this.conferido = conferido;
   }

   public BigDecimal getDespesa() {
        return despesa;
   }

   public void setDespesa(BigDecimal despesa) {
        this.despesa = despesa;
   }

   public Timestamp getDtAbertura() {
        return dtAbertura;
   }

   public void setDtAbertura(Timestamp dtAbertura) {
        this.dtAbertura = dtAbertura;
   }

   public Timestamp getDtFechamento() {
        return dtFechamento;
   }

   public void setDtFechamento(Timestamp dtFechamento) {
        this.dtFechamento = dtFechamento;
   }

   public BigDecimal getNuCaixa() {
        return nuCaixa;
   }

   public void setNuCaixa(BigDecimal nuCaixa) {
        this.nuCaixa = nuCaixa;
   }

   public BigDecimal getReceita() {
        return receita;
   }

   public void setReceita(BigDecimal receita) {
        this.receita = receita;
   }

   public BigDecimal getSaldoInicial() {
        return saldoInicial;
   }

   public void setSaldoInicial(BigDecimal saldoInicial) {
        this.saldoInicial = saldoInicial;
   }

   public BigDecimal getCodPdv() {
        return codPdv;
   }

   public void setCodPdv(BigDecimal codPdv) {
        this.codPdv = codPdv;
   }

   @Override
   public String getEntityName() {
        return "ControleCaixa";
   }

   @Override
   public ControleCaixa fromVO(DynamicVO vo) {
        this.codCtabCoint = vo.asBigDecimal("CODCTABCOINT");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.conferido = vo.asString("CONFERIDO");
        this.despesa = vo.asBigDecimal("DESPESA");
        this.dtAbertura = vo.asTimestamp("DTABERTURA");
        this.dtFechamento = vo.asTimestamp("DTFECHAMENTO");
        this.nuCaixa = vo.asBigDecimal("NUCAIXA");
        this.receita = vo.asBigDecimal("RECEITA");
        this.saldoInicial = vo.asBigDecimal("SALDOINICIAL");
        this.codPdv = vo.asBigDecimal("CODPDV");
        return this;
   }
}
