package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SerieMateriaPrima extends AbstractSankhyaEntity<SerieMateriaPrima> {
   private BigDecimal codProdMp;
   private BigDecimal codProdPa;
   private BigDecimal idIproc;
   private String liberado;
   private BigDecimal nuApo;
   private String serieMp;
   private String seriePa;

   public BigDecimal getCodProdMp() {
        return codProdMp;
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        this.codProdMp = codProdMp;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        this.idIproc = idIproc;
   }

   public String getLiberado() {
        return liberado;
   }

   public void setLiberado(String liberado) {
        this.liberado = liberado;
   }

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        this.nuApo = nuApo;
   }

   public String getSerieMp() {
        return serieMp;
   }

   public void setSerieMp(String serieMp) {
        this.serieMp = serieMp;
   }

   public String getSeriePa() {
        return seriePa;
   }

   public void setSeriePa(String seriePa) {
        this.seriePa = seriePa;
   }

   @Override
   public String getTableName() {
        return "TPRSERMP";
   }

   @Override
   public String getEntityName() {
        return "SerieMateriaPrima";
   }

   @Override
   public SerieMateriaPrima fromVO(DynamicVO vo) {
        this.codProdMp = vo.asBigDecimal("CODPRODMP");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.idIproc = vo.asBigDecimal("IDIPROC");
        this.liberado = vo.asString("LIBERADO");
        this.nuApo = vo.asBigDecimal("NUAPO");
        this.serieMp = vo.asString("SERIEMP");
        this.seriePa = vo.asString("SERIEPA");
        return this;
   }
}
