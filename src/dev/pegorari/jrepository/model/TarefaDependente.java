package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TarefaDependente extends AbstractSankhyaEntity<TarefaDependente> {
   public BigDecimal getNuTarefaDep() {
        return this.getVo().asBigDecimal("NUTAREFADEP");
   }

   public void setNuTarefaDep(BigDecimal nuTarefaDep) {
        markAsChanged("NUTAREFADEP", nuTarefaDep);
   }

   public BigDecimal getNuTarefa() {
        return this.getVo().asBigDecimal("NUTAREFA");
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
   }

   public BigDecimal getQtdDep() {
        return this.getVo().asBigDecimal("QTDDEP");
   }

   public void setQtdDep(BigDecimal qtdDep) {
        markAsChanged("QTDDEP", qtdDep);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getSequenciaDep() {
        return this.getVo().asBigDecimal("SEQUENCIADEP");
   }

   public void setSequenciaDep(BigDecimal sequenciaDep) {
        markAsChanged("SEQUENCIADEP", sequenciaDep);
   }

   @Override
   public String getTableName() {
        return "TGWTDP";
   }

   @Override
   public String getEntityName() {
        return "TarefaDependente";
   }

   @Override
   public TarefaDependente fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
