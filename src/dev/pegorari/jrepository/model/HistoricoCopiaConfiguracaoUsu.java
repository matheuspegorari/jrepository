package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class HistoricoCopiaConfiguracaoUsu extends AbstractSankhyaEntity<HistoricoCopiaConfiguracaoUsu> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getNuNico() {
        return this.getVo().asBigDecimal("NUNICO");
   }

   public void setNuNico(BigDecimal nuNico) {
        markAsChanged("NUNICO", nuNico);
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
        return this;
   }
}
