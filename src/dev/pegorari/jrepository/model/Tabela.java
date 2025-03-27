package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Tabela extends AbstractSankhyaEntity<Tabela> {
   public String getDescTab() {
        return this.getVo().asString("DESCRTAB");
   }

   public void setDescTab(String descTab) {
        markAsChanged("DESCRTAB", descTab);
   }

   public String getNomeTab() {
        return this.getVo().asString("NOMETAB");
   }

   public void setNomeTab(String nomeTab) {
        markAsChanged("NOMETAB", nomeTab);
   }

   public BigDecimal getNuCampoNumeracao() {
        return this.getVo().asBigDecimal("NUCAMPONUMERACAO");
   }

   public void setNuCampoNumeracao(BigDecimal nuCampoNumeracao) {
        markAsChanged("NUCAMPONUMERACAO", nuCampoNumeracao);
   }

   public String getTipoNumeracao() {
        return this.getVo().asString("TIPONUMERACAO");
   }

   public void setTipoNumeracao(String tipoNumeracao) {
        markAsChanged("TIPONUMERACAO", tipoNumeracao);
   }

   @Override
   public String getTableName() {
        return "TDDTAB";
   }

   @Override
   public String getEntityName() {
        return "Tabela";
   }

   @Override
   public Tabela fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
