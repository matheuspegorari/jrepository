package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProdutoAlternativo implements SankhyaEntity<ProdutoAlternativo> {

   private BigDecimal codProd;
   private BigDecimal codProdAlt;
   private BigDecimal prioridade;
   private BigDecimal quantidade;
   private String referenciaPa;
   private Timestamp dtVigencia;
   private String substituto;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodProdAlt() {
        return codProdAlt;
   }

   public void setCodProdAlt(BigDecimal codProdAlt) {
        this.codProdAlt = codProdAlt;
   }

   public BigDecimal getPrioridade() {
        return prioridade;
   }

   public void setPrioridade(BigDecimal prioridade) {
        this.prioridade = prioridade;
   }

   public BigDecimal getQuantidade() {
        return quantidade;
   }

   public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
   }

   public String getReferenciaPa() {
        return referenciaPa;
   }

   public void setReferenciaPa(String referenciaPa) {
        this.referenciaPa = referenciaPa;
   }

   public Timestamp getDtVigencia() {
        return dtVigencia;
   }

   public void setDtVigencia(Timestamp dtVigencia) {
        this.dtVigencia = dtVigencia;
   }

   public String getSubstituto() {
        return substituto;
   }

   public void setSubstituto(String substituto) {
        this.substituto = substituto;
   }

   @Override
   public String getEntityName() {
        return "ProdutoAlternativo";
   }

   @Override
   public ProdutoAlternativo fromVO(DynamicVO vo) {
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codProdAlt = vo.asBigDecimal("CODPRODALT");
        this.prioridade = vo.asBigDecimal("PRIORIDADE");
        this.quantidade = vo.asBigDecimal("QUANTIDADE");
        this.referenciaPa = vo.asString("REFERENCIAPA");
        this.dtVigencia = vo.asTimestamp("DTVIGENCIA");
        this.substituto = vo.asString("SUBSTITUTO");
        return this;
   }
}
