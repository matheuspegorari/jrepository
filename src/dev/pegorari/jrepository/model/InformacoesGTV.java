package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class InformacoesGTV extends AbstractSankhyaEntity<InformacoesGTV> {
   private BigDecimal cargaInfGtv;
   private BigDecimal codVeiculo;
   private BigDecimal digVerInfGtv;
   private String idInfGtv;
   private String numInfGtv;
   private BigDecimal nuNota;
   private String serInfGtv;
   private String subSerInfGtv;

   public BigDecimal getCargaInfGtv() {
        return cargaInfGtv;
   }

   public void setCargaInfGtv(BigDecimal cargaInfGtv) {
        this.cargaInfGtv = cargaInfGtv;
   }

   public BigDecimal getCodVeiculo() {
        return codVeiculo;
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        this.codVeiculo = codVeiculo;
   }

   public BigDecimal getDigVerInfGtv() {
        return digVerInfGtv;
   }

   public void setDigVerInfGtv(BigDecimal digVerInfGtv) {
        this.digVerInfGtv = digVerInfGtv;
   }

   public String getIdInfGtv() {
        return idInfGtv;
   }

   public void setIdInfGtv(String idInfGtv) {
        this.idInfGtv = idInfGtv;
   }

   public String getNumInfGtv() {
        return numInfGtv;
   }

   public void setNumInfGtv(String numInfGtv) {
        this.numInfGtv = numInfGtv;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public String getSerInfGtv() {
        return serInfGtv;
   }

   public void setSerInfGtv(String serInfGtv) {
        this.serInfGtv = serInfGtv;
   }

   public String getSubSerInfGtv() {
        return subSerInfGtv;
   }

   public void setSubSerInfGtv(String subSerInfGtv) {
        this.subSerInfGtv = subSerInfGtv;
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
        this.cargaInfGtv = vo.asBigDecimal("CARGAINFGTV");
        this.codVeiculo = vo.asBigDecimal("CODVEICULO");
        this.digVerInfGtv = vo.asBigDecimal("DIGVERINFGTV");
        this.idInfGtv = vo.asString("IDINFGTV");
        this.numInfGtv = vo.asString("NUMINFGTV");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.serInfGtv = vo.asString("SERINFGTV");
        this.subSerInfGtv = vo.asString("SUBSERINFGTV");
        return this;
   }
}
