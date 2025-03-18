package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DefinicaoNoEstrutura extends AbstractSankhyaEntity<DefinicaoNoEstrutura> {
   private String multipocor;
   private BigDecimal nivelFinal;
   private BigDecimal nivelInicial;
   private BigDecimal nuEst;
   private BigDecimal nuInstancia;
   private BigDecimal sequencia;

   public String getMultipocor() {
        return multipocor;
   }

   public void setMultipocor(String multipocor) {
        markAsChanged("MULTIPOCOR", multipocor);
        this.multipocor = multipocor;
   }

   public BigDecimal getNivelFinal() {
        return nivelFinal;
   }

   public void setNivelFinal(BigDecimal nivelFinal) {
        markAsChanged("NIVELFINAL", nivelFinal);
        this.nivelFinal = nivelFinal;
   }

   public BigDecimal getNivelInicial() {
        return nivelInicial;
   }

   public void setNivelInicial(BigDecimal nivelInicial) {
        markAsChanged("NIVELINICIAL", nivelInicial);
        this.nivelInicial = nivelInicial;
   }

   public BigDecimal getNuEst() {
        return nuEst;
   }

   public void setNuEst(BigDecimal nuEst) {
        markAsChanged("NUEST", nuEst);
        this.nuEst = nuEst;
   }

   public BigDecimal getNuInstancia() {
        return nuInstancia;
   }

   public void setNuInstancia(BigDecimal nuInstancia) {
        markAsChanged("NUINSTANCIA", nuInstancia);
        this.nuInstancia = nuInstancia;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
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
        this.setOriginalVO(vo);
        this.multipocor = vo.asString("MULTIPOCOR");
        this.nivelFinal = vo.asBigDecimal("NIVELFINAL");
        this.nivelInicial = vo.asBigDecimal("NIVELINICIAL");
        this.nuEst = vo.asBigDecimal("NUEST");
        this.nuInstancia = vo.asBigDecimal("NUINSTANCIA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
