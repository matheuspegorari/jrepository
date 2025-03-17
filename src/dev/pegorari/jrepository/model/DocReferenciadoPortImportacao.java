package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DocReferenciadoPortImportacao extends AbstractSankhyaEntity<DocReferenciadoPortImportacao> {
   private String chaveRef;
   private BigDecimal nuArquivo;

   public String getChaveRef() {
        return chaveRef;
   }

   public void setChaveRef(String chaveRef) {
        this.chaveRef = chaveRef;
   }

   public BigDecimal getNuArquivo() {
        return nuArquivo;
   }

   public void setNuArquivo(BigDecimal nuArquivo) {
        this.nuArquivo = nuArquivo;
   }

   @Override
   public String getTableName() {
        return "TGFDFPI";
   }

   @Override
   public String getEntityName() {
        return "DocReferenciadoPortImportacao";
   }

   @Override
   public DocReferenciadoPortImportacao fromVO(DynamicVO vo) {
        this.chaveRef = vo.asString("CHAVEREF");
        this.nuArquivo = vo.asBigDecimal("NUARQUIVO");
        return this;
   }
}
