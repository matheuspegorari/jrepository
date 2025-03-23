package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class HistoricoCopiaConfiguracaoUsu extends AbstractSankhyaEntity<HistoricoCopiaConfiguracaoUsu> {
   private BigDecimal codUsu;
   private BigDecimal nuNico;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getNuNico() {
        return nuNico;
   }

   public void setNuNico(BigDecimal nuNico) {
        markAsChanged("NUNICO", nuNico);
        this.nuNico = nuNico;
   }

   @Override
   public String getTableName() {
        return "TSIHCU";
   }

   @Override
   public String getEntityName() {
        return "HistoricoCopiaConfiguracaoUsu";
   }

   @Override
   public HistoricoCopiaConfiguracaoUsu fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuNico = vo.asBigDecimal("NUNICO");
        return this;
   }
}
