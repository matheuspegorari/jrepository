package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class LogImportacaoPO extends AbstractSankhyaEntity<LogImportacaoPO> {
   public String getErro() {
        return this.getVo().asString("ERRO");
   }

   public void setErro(String erro) {
        markAsChanged("ERRO", erro);
   }

   public BigDecimal getNroLinha() {
        return this.getVo().asBigDecimal("NROLINHA");
   }

   public void setNroLinha(BigDecimal nroLinha) {
        markAsChanged("NROLINHA", nroLinha);
   }

   public BigDecimal getNuImport() {
        return this.getVo().asBigDecimal("NUIMPORT");
   }

   public void setNuImport(BigDecimal nuImport) {
        markAsChanged("NUIMPORT", nuImport);
   }

   @Override
   public String getTableName() {
        return "TGFIPOLOG";
   }

   @Override
   public String getEntityName() {
        return "LogImportacaoPO";
   }

   @Override
   public LogImportacaoPO fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
