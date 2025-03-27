package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DefinicaoNoEstrutura extends AbstractSankhyaEntity<DefinicaoNoEstrutura> {
   public String getMultipocor() {
        return this.getVo().asString("MULTIPOCOR");
   }

   public void setMultipocor(String multipocor) {
        markAsChanged("MULTIPOCOR", multipocor);
   }

   public BigDecimal getNivelFinal() {
        return this.getVo().asBigDecimal("NIVELFINAL");
   }

   public void setNivelFinal(BigDecimal nivelFinal) {
        markAsChanged("NIVELFINAL", nivelFinal);
   }

   public BigDecimal getNivelInicial() {
        return this.getVo().asBigDecimal("NIVELINICIAL");
   }

   public void setNivelInicial(BigDecimal nivelInicial) {
        markAsChanged("NIVELINICIAL", nivelInicial);
   }

   public BigDecimal getNuEst() {
        return this.getVo().asBigDecimal("NUEST");
   }

   public void setNuEst(BigDecimal nuEst) {
        markAsChanged("NUEST", nuEst);
   }

   public BigDecimal getNuInstancia() {
        return this.getVo().asBigDecimal("NUINSTANCIA");
   }

   public void setNuInstancia(BigDecimal nuInstancia) {
        markAsChanged("NUINSTANCIA", nuInstancia);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TGFDNE";
   }

   @Override
   public String getEntityName() {
        return "DefinicaoNoEstrutura";
   }

   @Override
   public DefinicaoNoEstrutura fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
