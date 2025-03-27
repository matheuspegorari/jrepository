package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ImpressoraSubstituta extends AbstractSankhyaEntity<ImpressoraSubstituta> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getOriginalPrinterName() {
        return this.getVo().asString("ORIGINALPRINTERNAME");
   }

   public void setOriginalPrinterName(String originalPrinterName) {
        markAsChanged("ORIGINALPRINTERNAME", originalPrinterName);
   }

   public String getPrinterUri() {
        return this.getVo().asString("PRINTERURI");
   }

   public void setPrinterUri(String printerUri) {
        markAsChanged("PRINTERURI", printerUri);
   }

   public String getTipoDoc() {
        return this.getVo().asString("TIPODOC");
   }

   public void setTipoDoc(String tipoDoc) {
        markAsChanged("TIPODOC", tipoDoc);
   }

   @Override
   public String getTableName() {
        return "TSISBP";
   }

   @Override
   public String getEntityName() {
        return "ImpressoraSubstituta";
   }

   @Override
   public ImpressoraSubstituta fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
