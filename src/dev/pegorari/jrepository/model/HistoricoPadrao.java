package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class HistoricoPadrao extends AbstractSankhyaEntity<HistoricoPadrao> {
   public BigDecimal getCodHistCtb() {
        return this.getVo().asBigDecimal("CODHISTCTB");
   }

   public void setCodHistCtb(BigDecimal codHistCtb) {
        markAsChanged("CODHISTCTB", codHistCtb);
   }

   public String getHistorico() {
        return this.getVo().asString("HISTORICO");
   }

   public void setHistorico(String historico) {
        markAsChanged("HISTORICO", historico);
   }

   @Override
   public String getTableName() {
        return "TCBHIS";
   }

   @Override
   public String getEntityName() {
        return "HistoricoPadrao";
   }

   @Override
   public HistoricoPadrao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
