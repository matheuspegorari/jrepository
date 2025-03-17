package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class LogImportacaoPO implements SankhyaEntity<LogImportacaoPO> {

   private String erro;
   private BigDecimal nroLinha;
   private BigDecimal nuImport;

   public String getErro() {
        return erro;
   }

   public void setErro(String erro) {
        this.erro = erro;
   }

   public BigDecimal getNroLinha() {
        return nroLinha;
   }

   public void setNroLinha(BigDecimal nroLinha) {
        this.nroLinha = nroLinha;
   }

   public BigDecimal getNuImport() {
        return nuImport;
   }

   public void setNuImport(BigDecimal nuImport) {
        this.nuImport = nuImport;
   }

   @Override
   public String getEntityName() {
        return "LogImportacaoPO";
   }

   @Override
   public LogImportacaoPO fromVO(DynamicVO vo) {
        this.erro = vo.asString("ERRO");
        this.nroLinha = vo.asBigDecimal("NROLINHA");
        this.nuImport = vo.asBigDecimal("NUIMPORT");
        return this;
   }
}
