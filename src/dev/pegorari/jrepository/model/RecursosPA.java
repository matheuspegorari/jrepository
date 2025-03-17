package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RecursosPA extends AbstractSankhyaEntity<RecursosPA> {
   private BigDecimal codCre;
   private BigDecimal codProdPa;
   private String controlePa;
   private BigDecimal fatorCapacidade;
   private String modCapacidade;
   private BigDecimal qtdAlocada;
   private BigDecimal codWcp;

   public BigDecimal getCodCre() {
        return codCre;
   }

   public void setCodCre(BigDecimal codCre) {
        this.codCre = codCre;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
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

   public BigDecimal getQtdAlocada() {
        return qtdAlocada;
   }

   public void setQtdAlocada(BigDecimal qtdAlocada) {
        this.qtdAlocada = qtdAlocada;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        this.codWcp = codWcp;
   }

   @Override
   public String getTableName() {
        return "TPRRXP";
   }

   @Override
   public String getEntityName() {
        return "RecursosPA";
   }

   @Override
   public RecursosPA fromVO(DynamicVO vo) {
        this.codCre = vo.asBigDecimal("CODCRE");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.controlePa = vo.asString("CONTROLEPA");
        this.fatorCapacidade = vo.asBigDecimal("FATORCAPACIDADE");
        this.modCapacidade = vo.asString("MODCAPACIDADE");
        this.qtdAlocada = vo.asBigDecimal("QTDALOCADA");
        this.codWcp = vo.asBigDecimal("CODWCP");
        return this;
   }
}
