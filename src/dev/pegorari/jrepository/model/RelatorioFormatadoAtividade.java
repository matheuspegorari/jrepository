package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RelatorioFormatadoAtividade extends AbstractSankhyaEntity<RelatorioFormatadoAtividade> {
   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getNuEle() {
        return this.getVo().asBigDecimal("NUELE");
   }

   public void setNuEle(BigDecimal nuEle) {
        markAsChanged("NUELE", nuEle);
   }

   public BigDecimal getNuRfe() {
        return this.getVo().asBigDecimal("NURFE");
   }

   public void setNuRfe(BigDecimal nuRfe) {
        markAsChanged("NURFE", nuRfe);
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
        this.setVo(vo);
        return this;
   }
}
