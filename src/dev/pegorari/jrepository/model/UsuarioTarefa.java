package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UsuarioTarefa extends AbstractSankhyaEntity<UsuarioTarefa> {
   private BigDecimal codTarefa;
   private BigDecimal codUsu;
   private BigDecimal ordem;

   public BigDecimal getCodTarefa() {
        return codTarefa;
   }

   public void setCodTarefa(BigDecimal codTarefa) {
        markAsChanged("CODTAREFA", codTarefa);
        this.codTarefa = codTarefa;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
        this.ordem = ordem;
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
        this.codTarefa = vo.asBigDecimal("CODTAREFA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.ordem = vo.asBigDecimal("ORDEM");
        return this;
   }
}
