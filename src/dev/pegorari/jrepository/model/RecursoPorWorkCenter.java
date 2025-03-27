package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RecursoPorWorkCenter extends AbstractSankhyaEntity<RecursoPorWorkCenter> {
   public BigDecimal getQtdAlocada() {
        return this.getVo().asBigDecimal("QTDALOCADA");
   }

   public void setQtdAlocada(BigDecimal qtdAlocada) {
        markAsChanged("QTDALOCADA", qtdAlocada);
   }

   public BigDecimal getCodCre() {
        return this.getVo().asBigDecimal("CODCRE");
   }

   public void setCodCre(BigDecimal codCre) {
        markAsChanged("CODCRE", codCre);
   }

   public BigDecimal getCodWcp() {
        return this.getVo().asBigDecimal("CODWCP");
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
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
        this.setVo(vo);
        return this;
   }
}
