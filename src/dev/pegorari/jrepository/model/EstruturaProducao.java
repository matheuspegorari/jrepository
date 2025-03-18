package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EstruturaProducao extends AbstractSankhyaEntity<EstruturaProducao> {
   private BigDecimal nuNota;
   private BigDecimal codEst;
   private String descricao;

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getCodEst() {
        return codEst;
   }

   public void setCodEst(BigDecimal codEst) {
        markAsChanged("CODEST", codEst);
        this.codEst = codEst;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   @Override
   public String getTableName() {
        return "TGFESP";
   }

   @Override
   public String getEntityName() {
        return "EstruturaProducao";
   }

   @Override
   public EstruturaProducao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.codEst = vo.asBigDecimal("CODEST");
        this.descricao = vo.asString("DESCRICAO");
        return this;
   }
}
