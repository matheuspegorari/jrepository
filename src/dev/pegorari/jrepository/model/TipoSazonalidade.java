package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TipoSazonalidade extends AbstractSankhyaEntity<TipoSazonalidade> {
   public BigDecimal getCodTipSaz() {
        return this.getVo().asBigDecimal("CODTIPSAZ");
   }

   public void setCodTipSaz(BigDecimal codTipSaz) {
        markAsChanged("CODTIPSAZ", codTipSaz);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   @Override
   public String getTableName() {
        return "TGFTPS";
   }

   @Override
   public String getEntityName() {
        return "TipoSazonalidade";
   }

   @Override
   public TipoSazonalidade fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
