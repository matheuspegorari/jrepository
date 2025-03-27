package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RecursosPA extends AbstractSankhyaEntity<RecursosPA> {
   public BigDecimal getCodCre() {
        return this.getVo().asBigDecimal("CODCRE");
   }

   public void setCodCre(BigDecimal codCre) {
        markAsChanged("CODCRE", codCre);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public BigDecimal getFatorCapacidade() {
        return this.getVo().asBigDecimal("FATORCAPACIDADE");
   }

   public void setFatorCapacidade(BigDecimal fatorCapacidade) {
        markAsChanged("FATORCAPACIDADE", fatorCapacidade);
   }

   public String getModCapacidade() {
        return this.getVo().asString("MODCAPACIDADE");
   }

   public void setModCapacidade(String modCapacidade) {
        markAsChanged("MODCAPACIDADE", modCapacidade);
   }

   public BigDecimal getQtdAlocada() {
        return this.getVo().asBigDecimal("QTDALOCADA");
   }

   public void setQtdAlocada(BigDecimal qtdAlocada) {
        markAsChanged("QTDALOCADA", qtdAlocada);
   }

   public BigDecimal getCodWcp() {
        return this.getVo().asBigDecimal("CODWCP");
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
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
        this.setVo(vo);
        return this;
   }
}
