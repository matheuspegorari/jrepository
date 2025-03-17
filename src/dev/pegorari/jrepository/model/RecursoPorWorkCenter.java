package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RecursoPorWorkCenter extends AbstractSankhyaEntity<RecursoPorWorkCenter> {
   private BigDecimal qtdAlocada;
   private BigDecimal codCre;
   private BigDecimal codWcp;
   private BigDecimal fatorCapacidade;
   private String modCapacidade;

   public BigDecimal getQtdAlocada() {
        return qtdAlocada;
   }

   public void setQtdAlocada(BigDecimal qtdAlocada) {
        this.qtdAlocada = qtdAlocada;
   }

   public BigDecimal getCodCre() {
        return codCre;
   }

   public void setCodCre(BigDecimal codCre) {
        this.codCre = codCre;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        this.codWcp = codWcp;
   }

   public BigDecimal getFatorCapacidade() {
        return fatorCapacidade;
   }

   public void setFatorCapacidade(BigDecimal fatorCapacidade) {
        this.fatorCapacidade = fatorCapacidade;
   }

   public String getModCapacidade() {
        return modCapacidade;
   }

   public void setModCapacidade(String modCapacidade) {
        this.modCapacidade = modCapacidade;
   }

   @Override
   public String getTableName() {
        return "TPRRXW";
   }

   @Override
   public String getEntityName() {
        return "RecursoPorWorkCenter";
   }

   @Override
   public RecursoPorWorkCenter fromVO(DynamicVO vo) {
        this.qtdAlocada = vo.asBigDecimal("QTDALOCADA");
        this.codCre = vo.asBigDecimal("CODCRE");
        this.codWcp = vo.asBigDecimal("CODWCP");
        this.fatorCapacidade = vo.asBigDecimal("FATORCAPACIDADE");
        this.modCapacidade = vo.asString("MODCAPACIDADE");
        return this;
   }
}
