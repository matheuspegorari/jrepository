package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class HistoricoPadrao extends AbstractSankhyaEntity<HistoricoPadrao> {
   private BigDecimal codHistCtb;
   private String historico;

   public BigDecimal getCodHistCtb() {
        return codHistCtb;
   }

   public void setCodHistCtb(BigDecimal codHistCtb) {
        markAsChanged("CODHISTCTB", codHistCtb);
        this.codHistCtb = codHistCtb;
   }

   public String getHistorico() {
        return historico;
   }

   public void setHistorico(String historico) {
        markAsChanged("HISTORICO", historico);
        this.historico = historico;
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
        this.codHistCtb = vo.asBigDecimal("CODHISTCTB");
        this.historico = vo.asString("HISTORICO");
        return this;
   }
}
