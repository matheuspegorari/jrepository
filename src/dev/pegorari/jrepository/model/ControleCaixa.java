package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ControleCaixa extends AbstractSankhyaEntity<ControleCaixa> {
   private BigDecimal codCtabcoint;
   private BigDecimal codUsu;
   private String conferido;
   private BigDecimal despesa;
   private Timestamp dtAbertura;
   private Timestamp dtFechamento;
   private BigDecimal nuCaixa;
   private BigDecimal receita;
   private BigDecimal saldoInicial;
   private BigDecimal codPdv;

   public BigDecimal getCodCtabcoint() {
        return codCtabcoint;
   }

   public void setCodCtabcoint(BigDecimal codCtabcoint) {
        markAsChanged("CODCTABCOINT", codCtabcoint);
        this.codCtabcoint = codCtabcoint;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getConferido() {
        return conferido;
   }

   public void setConferido(String conferido) {
        markAsChanged("CONFERIDO", conferido);
        this.conferido = conferido;
   }

   public BigDecimal getDespesa() {
        return despesa;
   }

   public void setDespesa(BigDecimal despesa) {
        markAsChanged("DESPESA", despesa);
        this.despesa = despesa;
   }

   public Timestamp getDtAbertura() {
        return dtAbertura;
   }

   public void setDtAbertura(Timestamp dtAbertura) {
        markAsChanged("DTABERTURA", dtAbertura);
        this.dtAbertura = dtAbertura;
   }

   public Timestamp getDtFechamento() {
        return dtFechamento;
   }

   public void setDtFechamento(Timestamp dtFechamento) {
        markAsChanged("DTFECHAMENTO", dtFechamento);
        this.dtFechamento = dtFechamento;
   }

   public BigDecimal getNuCaixa() {
        return nuCaixa;
   }

   public void setNuCaixa(BigDecimal nuCaixa) {
        markAsChanged("NUCAIXA", nuCaixa);
        this.nuCaixa = nuCaixa;
   }

   public BigDecimal getReceita() {
        return receita;
   }

   public void setReceita(BigDecimal receita) {
        markAsChanged("RECEITA", receita);
        this.receita = receita;
   }

   public BigDecimal getSaldoInicial() {
        return saldoInicial;
   }

   public void setSaldoInicial(BigDecimal saldoInicial) {
        markAsChanged("SALDOINICIAL", saldoInicial);
        this.saldoInicial = saldoInicial;
   }

   public BigDecimal getCodPdv() {
        return codPdv;
   }

   public void setCodPdv(BigDecimal codPdv) {
        markAsChanged("CODPDV", codPdv);
        this.codPdv = codPdv;
   }

   @Override
   public String getTableName() {
        return "TGFCAI";
   }

   @Override
   public String getEntityName() {
        return "ControleCaixa";
   }

   @Override
   public ControleCaixa fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codCtabcoint = vo.asBigDecimal("CODCTABCOINT");
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
