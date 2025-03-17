package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MovimentacaoCaixa implements SankhyaEntity<MovimentacaoCaixa> {

   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private BigDecimal nroUnico;
   private BigDecimal nuBco;
   private BigDecimal nuCaixa;
   private String origem;
   private BigDecimal recDesp;
   private BigDecimal valor;
   private String numNsu;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNroUnico() {
        return nroUnico;
   }

   public void setNroUnico(BigDecimal nroUnico) {
        this.nroUnico = nroUnico;
   }

   public BigDecimal getNuBco() {
        return nuBco;
   }

   public void setNuBco(BigDecimal nuBco) {
        this.nuBco = nuBco;
   }

   public BigDecimal getNuCaixa() {
        return nuCaixa;
   }

   public void setNuCaixa(BigDecimal nuCaixa) {
        this.nuCaixa = nuCaixa;
   }

   public String getOrigem() {
        return origem;
   }

   public void setOrigem(String origem) {
        this.origem = origem;
   }

   public BigDecimal getRecDesp() {
        return recDesp;
   }

   public void setRecDesp(BigDecimal recDesp) {
        this.recDesp = recDesp;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        this.valor = valor;
   }

   public String getNumNsu() {
        return numNsu;
   }

   public void setNumNsu(String numNsu) {
        this.numNsu = numNsu;
   }

   @Override
   public String getEntityName() {
        return "MovimentacaoCaixa";
   }

   @Override
   public MovimentacaoCaixa fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nroUnico = vo.asBigDecimal("NROUNICO");
        this.nuBco = vo.asBigDecimal("NUBCO");
        this.nuCaixa = vo.asBigDecimal("NUCAIXA");
        this.origem = vo.asString("ORIGEM");
        this.recDesp = vo.asBigDecimal("RECDESP");
        this.valor = vo.asBigDecimal("VALOR");
        this.numNsu = vo.asString("NUMNSU");
        return this;
   }
}
