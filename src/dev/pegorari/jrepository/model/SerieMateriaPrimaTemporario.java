package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SerieMateriaPrimaTemporario extends AbstractSankhyaEntity<SerieMateriaPrimaTemporario> {
   private BigDecimal codProdMp;
   private BigDecimal codProdPa;
   private BigDecimal idIProc;
   private String liberado;
   private String serieMp;
   private String seriePa;

   public BigDecimal getCodProdMp() {
        return codProdMp;
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
        this.codProdMp = codProdMp;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public BigDecimal getIdIProc() {
        return idIProc;
   }

   public void setIdIProc(BigDecimal idIProc) {
        markAsChanged("IDIPROC", idIProc);
        this.idIProc = idIProc;
   }

   public String getLiberado() {
        return liberado;
   }

   public void setLiberado(String liberado) {
        markAsChanged("LIBERADO", liberado);
        this.liberado = liberado;
   }

   public String getSerieMp() {
        return serieMp;
   }

   public void setSerieMp(String serieMp) {
        markAsChanged("SERIEMP", serieMp);
        this.serieMp = serieMp;
   }

   public String getSeriePa() {
        return seriePa;
   }

   public void setSeriePa(String seriePa) {
        markAsChanged("SERIEPA", seriePa);
        this.seriePa = seriePa;
   }

   @Override
   public String getTableName() {
        return "TPRSERMP_TEMP";
   }

   @Override
   public String getEntityName() {
        return "SerieMateriaPrimaTemporario";
   }

   @Override
   public SerieMateriaPrimaTemporario fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codProdMp = vo.asBigDecimal("CODPRODMP");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.idIProc = vo.asBigDecimal("IDIPROC");
        this.liberado = vo.asString("LIBERADO");
        this.serieMp = vo.asString("SERIEMP");
        this.seriePa = vo.asString("SERIEPA");
        return this;
   }
}
