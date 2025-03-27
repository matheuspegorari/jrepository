package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RepositorioPA extends AbstractSankhyaEntity<RepositorioPA> {
   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getIdRpa() {
        return this.getVo().asBigDecimal("IDRPA");
   }

   public void setIdRpa(BigDecimal idRpa) {
        markAsChanged("IDRPA", idRpa);
   }

   @Override
   public String getTableName() {
        return "TPRRPA";
   }

   @Override
   public String getEntityName() {
        return "RepositorioPA";
   }

   @Override
   public RepositorioPA fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
