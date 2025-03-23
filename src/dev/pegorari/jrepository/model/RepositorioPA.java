package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RepositorioPA extends AbstractSankhyaEntity<RepositorioPA> {
   private String descricao;
   private BigDecimal idRpa;

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public BigDecimal getIdRpa() {
        return idRpa;
   }

   public void setIdRpa(BigDecimal idRpa) {
        markAsChanged("IDRPA", idRpa);
        this.idRpa = idRpa;
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
        this.descricao = vo.asString("DESCRICAO");
        this.idRpa = vo.asBigDecimal("IDRPA");
        return this;
   }
}
