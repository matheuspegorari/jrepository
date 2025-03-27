package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItensLiberacaoBloqueioContabil extends AbstractSankhyaEntity<ItensLiberacaoBloqueioContabil> {
   public BigDecimal getNuChave() {
        return this.getVo().asBigDecimal("NUCHAVE");
   }

   public void setNuChave(BigDecimal nuChave) {
        markAsChanged("NUCHAVE", nuChave);
   }

   public BigDecimal getNuLiberacao() {
        return this.getVo().asBigDecimal("NULIBERACAO");
   }

   public void setNuLiberacao(BigDecimal nuLiberacao) {
        markAsChanged("NULIBERACAO", nuLiberacao);
   }

   public String getTabela() {
        return this.getVo().asString("TABELA");
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TCBILB";
   }

   @Override
   public String getEntityName() {
        return "ItensLiberacaoBloqueioContabil";
   }

   @Override
   public ItensLiberacaoBloqueioContabil fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
