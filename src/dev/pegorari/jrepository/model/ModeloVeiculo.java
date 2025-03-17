package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ModeloVeiculo extends AbstractSankhyaEntity<ModeloVeiculo> {
   private BigDecimal cilindrada;
   private BigDecimal codModVei;
   private String combustivel;
   private String descrModVei;

   public BigDecimal getCilindrada() {
        return cilindrada;
   }

   public void setCilindrada(BigDecimal cilindrada) {
        this.cilindrada = cilindrada;
   }

   public BigDecimal getCodModVei() {
        return codModVei;
   }

   public void setCodModVei(BigDecimal codModVei) {
        this.codModVei = codModVei;
   }

   public String getCombustivel() {
        return combustivel;
   }

   public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
   }

   public String getDescrModVei() {
        return descrModVei;
   }

   public void setDescrModVei(String descrModVei) {
        this.descrModVei = descrModVei;
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
        this.cilindrada = vo.asBigDecimal("CILINDRADA");
        this.codModVei = vo.asBigDecimal("CODMODVEI");
        this.combustivel = vo.asString("COMBUSTIVEL");
        this.descrModVei = vo.asString("DESCRMODVEI");
        return this;
   }
}
