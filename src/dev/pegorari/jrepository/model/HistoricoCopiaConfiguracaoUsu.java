package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class HistoricoCopiaConfiguracaoUsu implements SankhyaEntity<HistoricoCopiaConfiguracaoUsu> {

   private BigDecimal codUsu;
   private BigDecimal nuNico;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getNuNico() {
        return nuNico;
   }

   public void setNuNico(BigDecimal nuNico) {
        this.nuNico = nuNico;
   }

   @Override
   public String getEntityName() {
        return "HistoricoCopiaConfiguracaoUsu";
   }

   @Override
   public HistoricoCopiaConfiguracaoUsu fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuNico = vo.asBigDecimal("NUNICO");
        return this;
   }
}
