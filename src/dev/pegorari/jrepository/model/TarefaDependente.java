package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TarefaDependente extends AbstractSankhyaEntity<TarefaDependente> {
   private BigDecimal nuTarefaDep;
   private BigDecimal nuTarefa;
   private BigDecimal qtdDep;
   private BigDecimal sequencia;
   private BigDecimal sequenciaDep;

   public BigDecimal getNuTarefaDep() {
        return nuTarefaDep;
   }

   public void setNuTarefaDep(BigDecimal nuTarefaDep) {
        this.nuTarefaDep = nuTarefaDep;
   }

   public BigDecimal getNuTarefa() {
        return nuTarefa;
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        this.nuTarefa = nuTarefa;
   }

   public BigDecimal getQtdDep() {
        return qtdDep;
   }

   public void setQtdDep(BigDecimal qtdDep) {
        this.qtdDep = qtdDep;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getSequenciaDep() {
        return sequenciaDep;
   }

   public void setSequenciaDep(BigDecimal sequenciaDep) {
        this.sequenciaDep = sequenciaDep;
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
        this.nuTarefaDep = vo.asBigDecimal("NUTAREFADEP");
        this.nuTarefa = vo.asBigDecimal("NUTAREFA");
        this.qtdDep = vo.asBigDecimal("QTDDEP");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.sequenciaDep = vo.asBigDecimal("SEQUENCIADEP");
        return this;
   }
}
