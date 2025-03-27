package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EquipamentoManufatura extends AbstractSankhyaEntity<EquipamentoManufatura> {
   public BigDecimal getCodCre() {
        return this.getVo().asBigDecimal("CODCRE");
   }

   public void setCodCre(BigDecimal codCre) {
        markAsChanged("CODCRE", codCre);
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

   public BigDecimal getNuEqp() {
        return this.getVo().asBigDecimal("NUEQP");
   }

   public void setNuEqp(BigDecimal nuEqp) {
        markAsChanged("NUEQP", nuEqp);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   @Override
   public String getTableName() {
        return "TPREQP";
   }

   @Override
   public String getEntityName() {
        return "EquipamentoManufatura";
   }

   @Override
   public EquipamentoManufatura fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
