package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SerieMateriaPrimaTemporario extends AbstractSankhyaEntity<SerieMateriaPrimaTemporario> {
   public BigDecimal getCodProdMp() {
        return this.getVo().asBigDecimal("CODPRODMP");
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public BigDecimal getIdIProc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdIProc(BigDecimal idIProc) {
        markAsChanged("IDIPROC", idIProc);
   }

   public String getLiberado() {
        return this.getVo().asString("LIBERADO");
   }

   public void setLiberado(String liberado) {
        markAsChanged("LIBERADO", liberado);
   }

   public String getSerieMp() {
        return this.getVo().asString("SERIEMP");
   }

   public void setSerieMp(String serieMp) {
        markAsChanged("SERIEMP", serieMp);
   }

   public String getSeriePa() {
        return this.getVo().asString("SERIEPA");
   }

   public void setSeriePa(String seriePa) {
        markAsChanged("SERIEPA", seriePa);
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
        this.setVo(vo);
        return this;
   }
}
