package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class RelatorioFormatadoAtividade implements SankhyaEntity<RelatorioFormatadoAtividade> {

   private String descricao;
   private BigDecimal nuEle;
   private BigDecimal nuRfe;

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public BigDecimal getNuEle() {
        return nuEle;
   }

   public void setNuEle(BigDecimal nuEle) {
        this.nuEle = nuEle;
   }

   public BigDecimal getNuRfe() {
        return nuRfe;
   }

   public void setNuRfe(BigDecimal nuRfe) {
        this.nuRfe = nuRfe;
   }

   @Override
   public String getEntityName() {
        return "RelatorioFormatadoAtividade";
   }

   @Override
   public RelatorioFormatadoAtividade fromVO(DynamicVO vo) {
        this.descricao = vo.asString("DESCRICAO");
        this.nuEle = vo.asBigDecimal("NUELE");
        this.nuRfe = vo.asBigDecimal("NURFE");
        return this;
   }
}
