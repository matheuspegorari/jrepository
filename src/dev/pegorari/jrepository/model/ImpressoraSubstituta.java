package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ImpressoraSubstituta extends AbstractSankhyaEntity<ImpressoraSubstituta> {
   private BigDecimal codUsu;
   private String originalPrinterName;
   private String printerUri;
   private String tipoDoc;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getOriginalPrinterName() {
        return originalPrinterName;
   }

   public void setOriginalPrinterName(String originalPrinterName) {
        markAsChanged("ORIGINALPRINTERNAME", originalPrinterName);
        this.originalPrinterName = originalPrinterName;
   }

   public String getPrinterUri() {
        return printerUri;
   }

   public void setPrinterUri(String printerUri) {
        markAsChanged("PRINTERURI", printerUri);
        this.printerUri = printerUri;
   }

   public String getTipoDoc() {
        return tipoDoc;
   }

   public void setTipoDoc(String tipoDoc) {
        markAsChanged("TIPODOC", tipoDoc);
        this.tipoDoc = tipoDoc;
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
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.originalPrinterName = vo.asString("ORIGINALPRINTERNAME");
        this.printerUri = vo.asString("PRINTERURI");
        this.tipoDoc = vo.asString("TIPODOC");
        return this;
   }
}
