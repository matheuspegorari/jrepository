package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RelacaoTipoNo extends AbstractSankhyaEntity<RelacaoTipoNo> {
   public BigDecimal getNuEst() {
        return this.getVo().asBigDecimal("NUEST");
   }

   public void setNuEst(BigDecimal nuEst) {
        markAsChanged("NUEST", nuEst);
   }

   public BigDecimal getNuInstanciaFilha() {
        return this.getVo().asBigDecimal("NUINSTANCIAFILHA");
   }

   public void setNuInstanciaFilha(BigDecimal nuInstanciaFilha) {
        markAsChanged("NUINSTANCIAFILHA", nuInstanciaFilha);
   }

   public BigDecimal getNuInstanciaPai() {
        return this.getVo().asBigDecimal("NUINSTANCIAPAI");
   }

   public void setNuInstanciaPai(BigDecimal nuInstanciaPai) {
        markAsChanged("NUINSTANCIAPAI", nuInstanciaPai);
   }

   @Override
   public String getTableName() {
        return "TGFRNE";
   }

   @Override
   public String getEntityName() {
        return "RelacaoTipoNo";
   }

   @Override
   public RelacaoTipoNo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
