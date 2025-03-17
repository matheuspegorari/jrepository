package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class CargosSelecionados implements SankhyaEntity<CargosSelecionados> {

   private BigDecimal codCargo;
   private BigDecimal nuCurriculo;
   private String triagem;
   private String candidato;

   public BigDecimal getCodCargo() {
        return codCargo;
   }

   public void setCodCargo(BigDecimal codCargo) {
        this.codCargo = codCargo;
   }

   public BigDecimal getNuCurriculo() {
        return nuCurriculo;
   }

   public void setNuCurriculo(BigDecimal nuCurriculo) {
        this.nuCurriculo = nuCurriculo;
   }

   public String getTriagem() {
        return triagem;
   }

   public void setTriagem(String triagem) {
        this.triagem = triagem;
   }

   public String getCandidato() {
        return candidato;
   }

   public void setCandidato(String candidato) {
        this.candidato = candidato;
   }

   @Override
   public String getEntityName() {
        return "CargosSelecionados";
   }

   @Override
   public CargosSelecionados fromVO(DynamicVO vo) {
        this.codCargo = vo.asBigDecimal("CODCARGO");
        this.nuCurriculo = vo.asBigDecimal("NUCURRICULO");
        this.triagem = vo.asString("TRIAGEM");
        this.candidato = vo.asString("CANDIDATO");
        return this;
   }
}
