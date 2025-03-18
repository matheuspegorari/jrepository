package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PerfilParceiro extends AbstractSankhyaEntity<PerfilParceiro> {
   private BigDecimal codContato;
   private BigDecimal codParc;
   private BigDecimal codTipParc;

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
        this.codContato = codContato;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodTipParc() {
        return codTipParc;
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        markAsChanged("CODTIPPARC", codTipParc);
        this.codTipParc = codTipParc;
   }

   @Override
   public String getTableName() {
        return "TGFPPA";
   }

   @Override
   public String getEntityName() {
        return "PerfilParceiro";
   }

   @Override
   public PerfilParceiro fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codContato = vo.asBigDecimal("CODCONTATO");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codTipParc = vo.asBigDecimal("CODTIPPARC");
        return this;
   }
}
