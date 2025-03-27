package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DestinatarioRelatorioFormatado extends AbstractSankhyaEntity<DestinatarioRelatorioFormatado> {
   public BigDecimal getCodCon() {
        return this.getVo().asBigDecimal("CODCON");
   }

   public void setCodCon(BigDecimal codCon) {
        markAsChanged("CODCON", codCon);
   }

   public BigDecimal getNuRfe() {
        return this.getVo().asBigDecimal("NURFE");
   }

   public void setNuRfe(BigDecimal nuRfe) {
        markAsChanged("NURFE", nuRfe);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TSIDRF";
   }

   @Override
   public String getEntityName() {
        return "DestinatarioRelatorioFormatado";
   }

   @Override
   public DestinatarioRelatorioFormatado fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
