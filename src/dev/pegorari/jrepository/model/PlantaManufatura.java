package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PlantaManufatura extends AbstractSankhyaEntity<PlantaManufatura> {
   public BigDecimal getCodCargaHor() {
        return this.getVo().asBigDecimal("CODCARGAHOR");
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        markAsChanged("CODCARGAHOR", codCargaHor);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodPlp() {
        return this.getVo().asBigDecimal("CODPLP");
   }

   public void setCodPlp(BigDecimal codPlp) {
        markAsChanged("CODPLP", codPlp);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   @Override
   public String getTableName() {
        return "TPRPLP";
   }

   @Override
   public String getEntityName() {
        return "PlantaManufatura";
   }

   @Override
   public PlantaManufatura fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
