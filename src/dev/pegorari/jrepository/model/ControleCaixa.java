package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ControleCaixa extends AbstractSankhyaEntity<ControleCaixa> {
   public BigDecimal getCodCtabcoint() {
        return this.getVo().asBigDecimal("CODCTABCOINT");
   }

   public void setCodCtabcoint(BigDecimal codCtabcoint) {
        markAsChanged("CODCTABCOINT", codCtabcoint);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getConferido() {
        return this.getVo().asString("CONFERIDO");
   }

   public void setConferido(String conferido) {
        markAsChanged("CONFERIDO", conferido);
   }

   public BigDecimal getDespesa() {
        return this.getVo().asBigDecimal("DESPESA");
   }

   public void setDespesa(BigDecimal despesa) {
        markAsChanged("DESPESA", despesa);
   }

   public Timestamp getDtAbertura() {
        return this.getVo().asTimestamp("DTABERTURA");
   }

   public void setDtAbertura(Timestamp dtAbertura) {
        markAsChanged("DTABERTURA", dtAbertura);
   }

   public Timestamp getDtFechamento() {
        return this.getVo().asTimestamp("DTFECHAMENTO");
   }

   public void setDtFechamento(Timestamp dtFechamento) {
        markAsChanged("DTFECHAMENTO", dtFechamento);
   }

   public BigDecimal getNuCaixa() {
        return this.getVo().asBigDecimal("NUCAIXA");
   }

   public void setNuCaixa(BigDecimal nuCaixa) {
        markAsChanged("NUCAIXA", nuCaixa);
   }

   public BigDecimal getReceita() {
        return this.getVo().asBigDecimal("RECEITA");
   }

   public void setReceita(BigDecimal receita) {
        markAsChanged("RECEITA", receita);
   }

   public BigDecimal getSaldoInicial() {
        return this.getVo().asBigDecimal("SALDOINICIAL");
   }

   public void setSaldoInicial(BigDecimal saldoInicial) {
        markAsChanged("SALDOINICIAL", saldoInicial);
   }

   public BigDecimal getCodPdv() {
        return this.getVo().asBigDecimal("CODPDV");
   }

   public void setCodPdv(BigDecimal codPdv) {
        markAsChanged("CODPDV", codPdv);
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
        return this;
   }
}
