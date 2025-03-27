package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DocReferenciadoPortImportacao extends AbstractSankhyaEntity<DocReferenciadoPortImportacao> {
   public String getChaveRef() {
        return this.getVo().asString("CHAVEREF");
   }

   public void setChaveRef(String chaveRef) {
        markAsChanged("CHAVEREF", chaveRef);
   }

   public BigDecimal getNuArquivo() {
        return this.getVo().asBigDecimal("NUARQUIVO");
   }

   public void setNuArquivo(BigDecimal nuArquivo) {
        markAsChanged("NUARQUIVO", nuArquivo);
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
        this.setVo(vo);
        return this;
   }
}
