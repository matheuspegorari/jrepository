package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MovimentacaoCaixa extends AbstractSankhyaEntity<MovimentacaoCaixa> {
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
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNroUnico() {
        return nroUnico;
   }

   public void setNroUnico(BigDecimal nroUnico) {
        markAsChanged("NROUNICO", nroUnico);
        this.nroUnico = nroUnico;
   }

   public BigDecimal getNuBco() {
        return nuBco;
   }

   public void setNuBco(BigDecimal nuBco) {
        markAsChanged("NUBCO", nuBco);
        this.nuBco = nuBco;
   }

   public BigDecimal getNuCaixa() {
        return nuCaixa;
   }

   public void setNuCaixa(BigDecimal nuCaixa) {
        markAsChanged("NUCAIXA", nuCaixa);
        this.nuCaixa = nuCaixa;
   }

   public String getOrigem() {
        return origem;
   }

   public void setOrigem(String origem) {
        markAsChanged("ORIGEM", origem);
        this.origem = origem;
   }

   public BigDecimal getRecDesp() {
        return recDesp;
   }

   public void setRecDesp(BigDecimal recDesp) {
        markAsChanged("RECDESP", recDesp);
        this.recDesp = recDesp;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
        this.valor = valor;
   }

   public String getNumNsu() {
        return numNsu;
   }

   public void setNumNsu(String numNsu) {
        markAsChanged("NUMNSU", numNsu);
        this.numNsu = numNsu;
   }

   @Override
   public String getTableName() {
        return "TGFMCX";
   }

   @Override
   public String getEntityName() {
        return "MovimentacaoCaixa";
   }

   @Override
   public MovimentacaoCaixa fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
