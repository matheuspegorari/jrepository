package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CampoSubstituto extends AbstractSankhyaEntity<CampoSubstituto> {
   public String getCampoSubstituto() {
        return this.getVo().asString("CAMPOSUBSTITUTO");
   }

   public void setCampoSubstituto(String campoSubstituto) {
        markAsChanged("CAMPOSUBSTITUTO", campoSubstituto);
   }

   public String getCodCampo() {
        return this.getVo().asString("CODCAMPO");
   }

   public void setCodCampo(String codCampo) {
        markAsChanged("CODCAMPO", codCampo);
   }

   public BigDecimal getCodMeta() {
        return this.getVo().asBigDecimal("CODMETA");
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   @Override
   public String getTableName() {
        return "TGMSUB";
   }

   @Override
   public String getEntityName() {
        return "CampoSubstituto";
   }

   @Override
   public CampoSubstituto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
