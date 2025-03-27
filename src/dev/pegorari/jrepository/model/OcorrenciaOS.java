package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class OcorrenciaOS extends AbstractSankhyaEntity<OcorrenciaOS> {
   public String getCobrar() {
        return this.getVo().asString("COBRAR");
   }

   public void setCobrar(String cobrar) {
        markAsChanged("COBRAR", cobrar);
   }

   public BigDecimal getCodOcorOs() {
        return this.getVo().asBigDecimal("CODOCOROS");
   }

   public void setCodOcorOs(BigDecimal codOcorOs) {
        markAsChanged("CODOCOROS", codOcorOs);
   }

   public String getDescOcorOs() {
        return this.getVo().asString("DESCROCOROS");
   }

   public void setDescOcorOs(String descOcorOs) {
        markAsChanged("DESCROCOROS", descOcorOs);
   }

   public String getPrevisto() {
        return this.getVo().asString("PREVISTO");
   }

   public void setPrevisto(String previsto) {
        markAsChanged("PREVISTO", previsto);
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
        this.setVo(vo);
        return this;
   }
}
