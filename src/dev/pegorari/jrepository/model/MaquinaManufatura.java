package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MaquinaManufatura extends AbstractSankhyaEntity<MaquinaManufatura> {
   private BigDecimal codCre;
   private BigDecimal codMqp;
   private BigDecimal codPlp;
   private String nome;
   private BigDecimal numEq;
   private String ativo;
   private BigDecimal decQtd;

   public BigDecimal getCodCre() {
        return codCre;
   }

   public void setCodCre(BigDecimal codCre) {
        markAsChanged("CODCRE", codCre);
        this.codCre = codCre;
   }

   public BigDecimal getCodMqp() {
        return codMqp;
   }

   public void setCodMqp(BigDecimal codMqp) {
        markAsChanged("CODMQP", codMqp);
        this.codMqp = codMqp;
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

   public BigDecimal getNumEq() {
        return numEq;
   }

   public void setNumEq(BigDecimal numEq) {
        markAsChanged("NUMEQ", numEq);
        this.numEq = numEq;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getDecQtd() {
        return decQtd;
   }

   public void setDecQtd(BigDecimal decQtd) {
        markAsChanged("DECQTD", decQtd);
        this.decQtd = decQtd;
   }

   @Override
   public String getTableName() {
        return "TPRMQP";
   }

   @Override
   public String getEntityName() {
        return "MaquinaManufatura";
   }

   @Override
   public MaquinaManufatura fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codCre = vo.asBigDecimal("CODCRE");
        this.codMqp = vo.asBigDecimal("CODMQP");
        this.codPlp = vo.asBigDecimal("CODPLP");
        this.nome = vo.asString("NOME");
        this.numEq = vo.asBigDecimal("NUMEQ");
        this.ativo = vo.asString("ATIVO");
        this.decQtd = vo.asBigDecimal("DECQTD");
        return this;
   }
}
