package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RateioPropostaComercial extends AbstractSankhyaEntity<RateioPropostaComercial> {
   public BigDecimal getChave() {
        return this.getVo().asBigDecimal("CHAVE");
   }

   public void setChave(BigDecimal chave) {
        markAsChanged("CHAVE", chave);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getNuProjeto() {
        return this.getVo().asBigDecimal("NUPROJETO");
   }

   public void setNuProjeto(BigDecimal nuProjeto) {
        markAsChanged("NUPROJETO", nuProjeto);
   }

   public BigDecimal getPercRateio() {
        return this.getVo().asBigDecimal("PERCRATEIO");
   }

   public void setPercRateio(BigDecimal percRateio) {
        markAsChanged("PERCRATEIO", percRateio);
   }

   public String getRateado() {
        return this.getVo().asString("RATEADO");
   }

   public void setRateado(String rateado) {
        markAsChanged("RATEADO", rateado);
   }

   public BigDecimal getSeqItem() {
        return this.getVo().asBigDecimal("SEQITEM");
   }

   public void setSeqItem(BigDecimal seqItem) {
        markAsChanged("SEQITEM", seqItem);
   }

   public BigDecimal getSeqKit() {
        return this.getVo().asBigDecimal("SEQKIT");
   }

   public void setSeqKit(BigDecimal seqKit) {
        markAsChanged("SEQKIT", seqKit);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getVersaoProjeto() {
        return this.getVo().asString("VERSAOPROJETO");
   }

   public void setVersaoProjeto(String versaoProjeto) {
        markAsChanged("VERSAOPROJETO", versaoProjeto);
   }

   public BigDecimal getVlrRateio() {
        return this.getVo().asBigDecimal("VLRRATEIO");
   }

   public void setVlrRateio(BigDecimal vlrRateio) {
        markAsChanged("VLRRATEIO", vlrRateio);
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
        this.setVo(vo);
        return this;
   }
}
