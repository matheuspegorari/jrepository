package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class LogImportacaoPO extends AbstractSankhyaEntity<LogImportacaoPO> {
   private String erro;
   private BigDecimal nroLinha;
   private BigDecimal nuImport;

   public String getErro() {
        return erro;
   }

   public void setErro(String erro) {
        markAsChanged("ERRO", erro);
        this.erro = erro;
   }

   public BigDecimal getNroLinha() {
        return nroLinha;
   }

   public void setNroLinha(BigDecimal nroLinha) {
        markAsChanged("NROLINHA", nroLinha);
        this.nroLinha = nroLinha;
   }

   public BigDecimal getNuImport() {
        return nuImport;
   }

   public void setNuImport(BigDecimal nuImport) {
        markAsChanged("NUIMPORT", nuImport);
        this.nuImport = nuImport;
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
        this.erro = vo.asString("ERRO");
        this.nroLinha = vo.asBigDecimal("NROLINHA");
        this.nuImport = vo.asBigDecimal("NUIMPORT");
        return this;
   }
}
