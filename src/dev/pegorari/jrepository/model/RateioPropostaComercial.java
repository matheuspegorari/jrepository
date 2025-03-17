package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RateioPropostaComercial extends AbstractSankhyaEntity<RateioPropostaComercial> {
   private BigDecimal chave;
   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private BigDecimal nuProjeto;
   private BigDecimal percRateio;
   private String rateado;
   private BigDecimal seqItem;
   private BigDecimal seqKit;
   private String tipo;
   private String versaoProjeto;
   private BigDecimal vlrRateio;

   public BigDecimal getChave() {
        return chave;
   }

   public void setChave(BigDecimal chave) {
        this.chave = chave;
   }

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

   public BigDecimal getNuProjeto() {
        return nuProjeto;
   }

   public void setNuProjeto(BigDecimal nuProjeto) {
        this.nuProjeto = nuProjeto;
   }

   public BigDecimal getPercRateio() {
        return percRateio;
   }

   public void setPercRateio(BigDecimal percRateio) {
        this.percRateio = percRateio;
   }

   public String getRateado() {
        return rateado;
   }

   public void setRateado(String rateado) {
        this.rateado = rateado;
   }

   public BigDecimal getSeqItem() {
        return seqItem;
   }

   public void setSeqItem(BigDecimal seqItem) {
        this.seqItem = seqItem;
   }

   public BigDecimal getSeqKit() {
        return seqKit;
   }

   public void setSeqKit(BigDecimal seqKit) {
        this.seqKit = seqKit;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getVersaoProjeto() {
        return versaoProjeto;
   }

   public void setVersaoProjeto(String versaoProjeto) {
        this.versaoProjeto = versaoProjeto;
   }

   public BigDecimal getVlrRateio() {
        return vlrRateio;
   }

   public void setVlrRateio(BigDecimal vlrRateio) {
        this.vlrRateio = vlrRateio;
   }

   @Override
   public String getTableName() {
        return "TGIRAT";
   }

   @Override
   public String getEntityName() {
        return "RateioPropostaComercial";
   }

   @Override
   public RateioPropostaComercial fromVO(DynamicVO vo) {
        this.chave = vo.asBigDecimal("CHAVE");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nuProjeto = vo.asBigDecimal("NUPROJETO");
        this.percRateio = vo.asBigDecimal("PERCRATEIO");
        this.rateado = vo.asString("RATEADO");
        this.seqItem = vo.asBigDecimal("SEQITEM");
        this.seqKit = vo.asBigDecimal("SEQKIT");
        this.tipo = vo.asString("TIPO");
        this.versaoProjeto = vo.asString("VERSAOPROJETO");
        this.vlrRateio = vo.asBigDecimal("VLRRATEIO");
        return this;
   }
}
