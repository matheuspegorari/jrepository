package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class TipoSazonalidade implements SankhyaEntity<TipoSazonalidade> {

   private BigDecimal codTipSaz;
   private String descricao;

   public BigDecimal getCodTipSaz() {
        return codTipSaz;
   }

   public void setCodTipSaz(BigDecimal codTipSaz) {
        this.codTipSaz = codTipSaz;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   @Override
   public String getEntityName() {
        return "TipoSazonalidade";
   }

   @Override
   public TipoSazonalidade fromVO(DynamicVO vo) {
        this.codTipSaz = vo.asBigDecimal("CODTIPSAZ");
        this.descricao = vo.asString("DESCRICAO");
        return this;
   }
}
