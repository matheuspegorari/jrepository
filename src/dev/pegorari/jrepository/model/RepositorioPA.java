package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class RepositorioPA implements SankhyaEntity<RepositorioPA> {

   private String descricao;
   private BigDecimal idRpa;

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public BigDecimal getIdRpa() {
        return idRpa;
   }

   public void setIdRpa(BigDecimal idRpa) {
        this.idRpa = idRpa;
   }

   @Override
   public String getEntityName() {
        return "RepositorioPA";
   }

   @Override
   public RepositorioPA fromVO(DynamicVO vo) {
        this.descricao = vo.asString("DESCRICAO");
        this.idRpa = vo.asBigDecimal("IDRPA");
        return this;
   }
}
