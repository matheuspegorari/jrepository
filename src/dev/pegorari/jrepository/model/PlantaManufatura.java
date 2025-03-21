package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PlantaManufatura extends AbstractSankhyaEntity<PlantaManufatura> {
   private BigDecimal codCargaHor;
   private BigDecimal codCencus;
   private BigDecimal codEmp;
   private BigDecimal codPlp;
   private String nome;

   public BigDecimal getCodCargaHor() {
        return codCargaHor;
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        markAsChanged("CODCARGAHOR", codCargaHor);
        this.codCargaHor = codCargaHor;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
        this.codCencus = codCencus;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodPlp() {
        return codPlp;
   }

   public void setCodPlp(BigDecimal codPlp) {
        markAsChanged("CODPLP", codPlp);
        this.codPlp = codPlp;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
        this.nome = nome;
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
        this.setOriginalVO(vo);
        this.codCargaHor = vo.asBigDecimal("CODCARGAHOR");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codPlp = vo.asBigDecimal("CODPLP");
        this.nome = vo.asString("NOME");
        return this;
   }
}
