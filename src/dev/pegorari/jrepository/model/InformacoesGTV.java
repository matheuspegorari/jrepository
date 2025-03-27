package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class InformacoesGTV extends AbstractSankhyaEntity<InformacoesGTV> {
   public BigDecimal getCargaInfGtv() {
        return this.getVo().asBigDecimal("CARGAINFGTV");
   }

   public void setCargaInfGtv(BigDecimal cargaInfGtv) {
        markAsChanged("CARGAINFGTV", cargaInfGtv);
   }

   public BigDecimal getCodVeiculo() {
        return this.getVo().asBigDecimal("CODVEICULO");
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
   }

   public BigDecimal getDigVerInfGtv() {
        return this.getVo().asBigDecimal("DIGVERINFGTV");
   }

   public void setDigVerInfGtv(BigDecimal digVerInfGtv) {
        markAsChanged("DIGVERINFGTV", digVerInfGtv);
   }

   public String getIdInfGtv() {
        return this.getVo().asString("IDINFGTV");
   }

   public void setIdInfGtv(String idInfGtv) {
        markAsChanged("IDINFGTV", idInfGtv);
   }

   public String getNumInfGtv() {
        return this.getVo().asString("NUMINFGTV");
   }

   public void setNumInfGtv(String numInfGtv) {
        markAsChanged("NUMINFGTV", numInfGtv);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getSerInfGtv() {
        return this.getVo().asString("SERINFGTV");
   }

   public void setSerInfGtv(String serInfGtv) {
        markAsChanged("SERINFGTV", serInfGtv);
   }

   public String getSubSerInfGtv() {
        return this.getVo().asString("SUBSERINFGTV");
   }

   public void setSubSerInfGtv(String subSerInfGtv) {
        markAsChanged("SUBSERINFGTV", subSerInfGtv);
   }

   @Override
   public String getTableName() {
        return "TGFIGTV";
   }

   @Override
   public String getEntityName() {
        return "InformacoesGTV";
   }

   @Override
   public InformacoesGTV fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
