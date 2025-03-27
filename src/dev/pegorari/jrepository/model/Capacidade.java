package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Capacidade extends AbstractSankhyaEntity<Capacidade> {
   public BigDecimal getCodCap() {
        return this.getVo().asBigDecimal("CODCAP");
   }

   public void setCodCap(BigDecimal codCap) {
        markAsChanged("CODCAP", codCap);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getUnidade() {
        return this.getVo().asString("UNIDADE");
   }

   public void setUnidade(String unidade) {
        markAsChanged("UNIDADE", unidade);
   }

   public String getUntmp() {
        return this.getVo().asString("UNTMP");
   }

   public void setUntmp(String untmp) {
        markAsChanged("UNTMP", untmp);
   }

   @Override
   public String getTableName() {
        return "TPRCAP";
   }

   @Override
   public String getEntityName() {
        return "Capacidade";
   }

   @Override
   public Capacidade fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
