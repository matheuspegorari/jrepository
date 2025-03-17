package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class OcorrenciaOS implements SankhyaEntity<OcorrenciaOS> {

   private String cobrar;
   private BigDecimal codOcorOs;
   private String descOcorOs;
   private String previsto;

   public String getCobrar() {
        return cobrar;
   }

   public void setCobrar(String cobrar) {
        this.cobrar = cobrar;
   }

   public BigDecimal getCodOcorOs() {
        return codOcorOs;
   }

   public void setCodOcorOs(BigDecimal codOcorOs) {
        this.codOcorOs = codOcorOs;
   }

   public String getDescOcorOs() {
        return descOcorOs;
   }

   public void setDescOcorOs(String descOcorOs) {
        this.descOcorOs = descOcorOs;
   }

   public String getPrevisto() {
        return previsto;
   }

   public void setPrevisto(String previsto) {
        this.previsto = previsto;
   }

   @Override
   public String getEntityName() {
        return "OcorrenciaOS";
   }

   @Override
   public OcorrenciaOS fromVO(DynamicVO vo) {
        this.cobrar = vo.asString("COBRAR");
        this.codOcorOs = vo.asBigDecimal("CODOCOROS");
        this.descOcorOs = vo.asString("DESCOCOROS");
        this.previsto = vo.asString("PREVISTO");
        return this;
   }
}
