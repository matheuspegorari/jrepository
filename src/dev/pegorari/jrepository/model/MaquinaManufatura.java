package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MaquinaManufatura extends AbstractSankhyaEntity<MaquinaManufatura> {
   public BigDecimal getCodCre() {
        return this.getVo().asBigDecimal("CODCRE");
   }

   public void setCodCre(BigDecimal codCre) {
        markAsChanged("CODCRE", codCre);
   }

   public BigDecimal getCodMqp() {
        return this.getVo().asBigDecimal("CODMQP");
   }

   public void setCodMqp(BigDecimal codMqp) {
        markAsChanged("CODMQP", codMqp);
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

   public BigDecimal getNumEq() {
        return this.getVo().asBigDecimal("NUMEQ");
   }

   public void setNumEq(BigDecimal numEq) {
        markAsChanged("NUMEQ", numEq);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getDecQtd() {
        return this.getVo().asBigDecimal("DECQTD");
   }

   public void setDecQtd(BigDecimal decQtd) {
        markAsChanged("DECQTD", decQtd);
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
        this.setVo(vo);
        return this;
   }
}
