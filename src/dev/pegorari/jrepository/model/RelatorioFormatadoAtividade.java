package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RelatorioFormatadoAtividade extends AbstractSankhyaEntity<RelatorioFormatadoAtividade> {
   private String descricao;
   private BigDecimal nuEle;
   private BigDecimal nuRfe;

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public BigDecimal getNuEle() {
        return nuEle;
   }

   public void setNuEle(BigDecimal nuEle) {
        markAsChanged("NUELE", nuEle);
        this.nuEle = nuEle;
   }

   public BigDecimal getNuRfe() {
        return nuRfe;
   }

   public void setNuRfe(BigDecimal nuRfe) {
        markAsChanged("NURFE", nuRfe);
        this.nuRfe = nuRfe;
   }

   @Override
   public String getTableName() {
        return "TWFRFA";
   }

   @Override
   public String getEntityName() {
        return "RelatorioFormatadoAtividade";
   }

   @Override
   public RelatorioFormatadoAtividade fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.descricao = vo.asString("DESCRICAO");
        this.nuEle = vo.asBigDecimal("NUELE");
        this.nuRfe = vo.asBigDecimal("NURFE");
        return this;
   }
}
