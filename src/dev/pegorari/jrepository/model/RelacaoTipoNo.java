package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RelacaoTipoNo extends AbstractSankhyaEntity<RelacaoTipoNo> {
   private BigDecimal nuEst;
   private BigDecimal nuInstanciaFilha;
   private BigDecimal nuInstanciaPai;

   public BigDecimal getNuEst() {
        return nuEst;
   }

   public void setNuEst(BigDecimal nuEst) {
        markAsChanged("NUEST", nuEst);
        this.nuEst = nuEst;
   }

   public BigDecimal getNuInstanciaFilha() {
        return nuInstanciaFilha;
   }

   public void setNuInstanciaFilha(BigDecimal nuInstanciaFilha) {
        markAsChanged("NUINSTANCIAFILHA", nuInstanciaFilha);
        this.nuInstanciaFilha = nuInstanciaFilha;
   }

   public BigDecimal getNuInstanciaPai() {
        return nuInstanciaPai;
   }

   public void setNuInstanciaPai(BigDecimal nuInstanciaPai) {
        markAsChanged("NUINSTANCIAPAI", nuInstanciaPai);
        this.nuInstanciaPai = nuInstanciaPai;
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
        this.nuEst = vo.asBigDecimal("NUEST");
        this.nuInstanciaFilha = vo.asBigDecimal("NUINSTANCIAFILHA");
        this.nuInstanciaPai = vo.asBigDecimal("NUINSTANCIAPAI");
        return this;
   }
}
