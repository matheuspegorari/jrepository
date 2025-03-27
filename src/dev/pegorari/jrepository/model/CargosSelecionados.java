package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CargosSelecionados extends AbstractSankhyaEntity<CargosSelecionados> {
   public BigDecimal getCodCargo() {
        return this.getVo().asBigDecimal("CODCARGO");
   }

   public void setCodCargo(BigDecimal codCargo) {
        markAsChanged("CODCARGO", codCargo);
   }

   public BigDecimal getNuCurriculo() {
        return this.getVo().asBigDecimal("NUCURRICULO");
   }

   public void setNuCurriculo(BigDecimal nuCurriculo) {
        markAsChanged("NUCURRICULO", nuCurriculo);
   }

   public String getTriagem() {
        return this.getVo().asString("TRIAGEM");
   }

   public void setTriagem(String triagem) {
        markAsChanged("TRIAGEM", triagem);
   }

   public String getCandidato() {
        return this.getVo().asString("CANDIDATO");
   }

   public void setCandidato(String candidato) {
        markAsChanged("CANDIDATO", candidato);
   }

   @Override
   public String getTableName() {
        return "TFCCAR";
   }

   @Override
   public String getEntityName() {
        return "CargosSelecionados";
   }

   @Override
   public CargosSelecionados fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
