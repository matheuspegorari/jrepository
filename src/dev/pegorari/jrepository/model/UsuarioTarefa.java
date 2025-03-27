package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UsuarioTarefa extends AbstractSankhyaEntity<UsuarioTarefa> {
   public BigDecimal getCodTarefa() {
        return this.getVo().asBigDecimal("CODTAREFA");
   }

   public void setCodTarefa(BigDecimal codTarefa) {
        markAsChanged("CODTAREFA", codTarefa);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   @Override
   public String getTableName() {
        return "TGWUSU";
   }

   @Override
   public String getEntityName() {
        return "UsuarioTarefa";
   }

   @Override
   public UsuarioTarefa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
