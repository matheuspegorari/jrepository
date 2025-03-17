package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class PerfilParceiro implements SankhyaEntity<PerfilParceiro> {

   private BigDecimal codContato;
   private BigDecimal codParc;
   private BigDecimal codTipParc;

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        this.codContato = codContato;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodTipParc() {
        return codTipParc;
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        this.codTipParc = codTipParc;
   }

   @Override
   public String getEntityName() {
        return "PerfilParceiro";
   }

   @Override
   public PerfilParceiro fromVO(DynamicVO vo) {
        this.codContato = vo.asBigDecimal("CODCONTATO");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codTipParc = vo.asBigDecimal("CODTIPPARC");
        return this;
   }
}
