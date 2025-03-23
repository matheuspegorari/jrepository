package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TipoSazonalidade extends AbstractSankhyaEntity<TipoSazonalidade> {
   private BigDecimal codTipSaz;
   private String descricao;

   public BigDecimal getCodTipSaz() {
        return codTipSaz;
   }

   public void setCodTipSaz(BigDecimal codTipSaz) {
        markAsChanged("CODTIPSAZ", codTipSaz);
        this.codTipSaz = codTipSaz;
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
        return "TGFTPS";
   }

   @Override
   public String getEntityName() {
        return "TipoSazonalidade";
   }

   @Override
   public TipoSazonalidade fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codTipSaz = vo.asBigDecimal("CODTIPSAZ");
        this.descricao = vo.asString("DESCRICAO");
        return this;
   }
}
