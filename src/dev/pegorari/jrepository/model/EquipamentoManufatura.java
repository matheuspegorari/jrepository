package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EquipamentoManufatura extends AbstractSankhyaEntity<EquipamentoManufatura> {
   private BigDecimal codCre;
   private BigDecimal codPlp;
   private String nome;
   private BigDecimal nuEqp;
   private String ativo;

   public BigDecimal getCodCre() {
        return codCre;
   }

   public void setCodCre(BigDecimal codCre) {
        markAsChanged("CODCRE", codCre);
        this.codCre = codCre;
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

   public BigDecimal getNuEqp() {
        return nuEqp;
   }

   public void setNuEqp(BigDecimal nuEqp) {
        markAsChanged("NUEQP", nuEqp);
        this.nuEqp = nuEqp;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
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
        this.setOriginalVO(vo);
        this.codCre = vo.asBigDecimal("CODCRE");
        this.codPlp = vo.asBigDecimal("CODPLP");
        this.nome = vo.asString("NOME");
        this.nuEqp = vo.asBigDecimal("NUEQP");
        this.ativo = vo.asString("ATIVO");
        return this;
   }
}
