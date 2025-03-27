package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProdutoAlternativo extends AbstractSankhyaEntity<ProdutoAlternativo> {
   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodProdAlt() {
        return this.getVo().asBigDecimal("CODPRODALT");
   }

   public void setCodProdAlt(BigDecimal codProdAlt) {
        markAsChanged("CODPRODALT", codProdAlt);
   }

   public BigDecimal getPrioridade() {
        return this.getVo().asBigDecimal("PRIORIDADE");
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
   }

   public BigDecimal getQuantidade() {
        return this.getVo().asBigDecimal("QUANTIDADE");
   }

   public void setQuantidade(BigDecimal quantidade) {
        markAsChanged("QUANTIDADE", quantidade);
   }

   public String getReferenciaPa() {
        return this.getVo().asString("REFERENCIAPA");
   }

   public void setReferenciaPa(String referenciaPa) {
        markAsChanged("REFERENCIAPA", referenciaPa);
   }

   public Timestamp getDtVigencia() {
        return this.getVo().asTimestamp("DTVIGENCIA");
   }

   public void setDtVigencia(Timestamp dtVigencia) {
        markAsChanged("DTVIGENCIA", dtVigencia);
   }

   public String getSubstituto() {
        return this.getVo().asString("SUBSTITUTO");
   }

   public void setSubstituto(String substituto) {
        markAsChanged("SUBSTITUTO", substituto);
   }

   @Override
   public String getTableName() {
        return "TGFPAL";
   }

   @Override
   public String getEntityName() {
        return "ProdutoAlternativo";
   }

   @Override
   public ProdutoAlternativo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
