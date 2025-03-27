package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ModeloVeiculo extends AbstractSankhyaEntity<ModeloVeiculo> {
   public BigDecimal getCilindrada() {
        return this.getVo().asBigDecimal("CILINDRADA");
   }

   public void setCilindrada(BigDecimal cilindrada) {
        markAsChanged("CILINDRADA", cilindrada);
   }

   public BigDecimal getCodModVei() {
        return this.getVo().asBigDecimal("CODMODVEI");
   }

   public void setCodModVei(BigDecimal codModVei) {
        markAsChanged("CODMODVEI", codModVei);
   }

   public String getCombustivel() {
        return this.getVo().asString("COMBUSTIVEL");
   }

   public void setCombustivel(String combustivel) {
        markAsChanged("COMBUSTIVEL", combustivel);
   }

   public String getDescrModVei() {
        return this.getVo().asString("DESCRMODVEI");
   }

   public void setDescrModVei(String descrModVei) {
        markAsChanged("DESCRMODVEI", descrModVei);
   }

   @Override
   public String getTableName() {
        return "TGFMVE";
   }

   @Override
   public String getEntityName() {
        return "ModeloVeiculo";
   }

   @Override
   public ModeloVeiculo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
