package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RecursosHumanosManufatura extends AbstractSankhyaEntity<RecursosHumanosManufatura> {
   private String ativo;
   private BigDecimal codCre;
   private BigDecimal codFunc;
   private BigDecimal codParc;
   private BigDecimal codPlp;
   private BigDecimal codRhp;
   private BigDecimal codUsu;
   private String nome;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodCre() {
        return codCre;
   }

   public void setCodCre(BigDecimal codCre) {
        markAsChanged("CODCRE", codCre);
        this.codCre = codCre;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
        this.codFunc = codFunc;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodPlp() {
        return codPlp;
   }

   public void setCodPlp(BigDecimal codPlp) {
        markAsChanged("CODPLP", codPlp);
        this.codPlp = codPlp;
   }

   public BigDecimal getCodRhp() {
        return codRhp;
   }

   public void setCodRhp(BigDecimal codRhp) {
        markAsChanged("CODRHP", codRhp);
        this.codRhp = codRhp;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
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
        return "TPRRHP";
   }

   @Override
   public String getEntityName() {
        return "RecursosHumanosManufatura";
   }

   @Override
   public RecursosHumanosManufatura fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.ativo = vo.asString("ATIVO");
        this.codCre = vo.asBigDecimal("CODCRE");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codPlp = vo.asBigDecimal("CODPLP");
        this.codRhp = vo.asBigDecimal("CODRHP");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nome = vo.asString("NOME");
        return this;
   }
}
