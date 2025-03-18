package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class OcorrenciaOS extends AbstractSankhyaEntity<OcorrenciaOS> {
   private String cobrar;
   private BigDecimal codOcorOs;
   private String descOcorOs;
   private String previsto;

   public String getCobrar() {
        return cobrar;
   }

   public void setCobrar(String cobrar) {
        markAsChanged("COBRAR", cobrar);
        this.cobrar = cobrar;
   }

   public BigDecimal getCodOcorOs() {
        return codOcorOs;
   }

   public void setCodOcorOs(BigDecimal codOcorOs) {
        markAsChanged("CODOCOROS", codOcorOs);
        this.codOcorOs = codOcorOs;
   }

   public String getDescOcorOs() {
        return descOcorOs;
   }

   public void setDescOcorOs(String descOcorOs) {
        markAsChanged("DESCROCOROS", descOcorOs);
        this.descOcorOs = descOcorOs;
   }

   public String getPrevisto() {
        return previsto;
   }

   public void setPrevisto(String previsto) {
        markAsChanged("PREVISTO", previsto);
        this.previsto = previsto;
   }

   @Override
   public String getTableName() {
        return "TCSOOS";
   }

   @Override
   public String getEntityName() {
        return "OcorrenciaOS";
   }

   @Override
   public OcorrenciaOS fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.cobrar = vo.asString("COBRAR");
        this.codOcorOs = vo.asBigDecimal("CODOCOROS");
        this.descOcorOs = vo.asString("DESCROCOROS");
        this.previsto = vo.asString("PREVISTO");
        return this;
   }
}
