package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RespostaAvisoSistema extends AbstractSankhyaEntity<RespostaAvisoSistema> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getNuAviso() {
        return this.getVo().asBigDecimal("NUAVISO");
   }

   public void setNuAviso(BigDecimal nuAviso) {
        markAsChanged("NUAVISO", nuAviso);
   }

   public BigDecimal getNuRespAviso() {
        return this.getVo().asBigDecimal("NURESPAVISO");
   }

   public void setNuRespAviso(BigDecimal nuRespAviso) {
        markAsChanged("NURESPAVISO", nuRespAviso);
   }

   @Override
   public String getTableName() {
        return "TSIRAV";
   }

   @Override
   public String getEntityName() {
        return "RespostaAvisoSistema";
   }

   @Override
   public RespostaAvisoSistema fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
