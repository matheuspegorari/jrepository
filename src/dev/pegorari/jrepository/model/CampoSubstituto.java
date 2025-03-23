package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CampoSubstituto extends AbstractSankhyaEntity<CampoSubstituto> {
   private String campoSubstituto;
   private String codCampo;
   private BigDecimal codMeta;
   private BigDecimal grau;

   public String getCampoSubstituto() {
        return campoSubstituto;
   }

   public void setCampoSubstituto(String campoSubstituto) {
        markAsChanged("CAMPOSUBSTITUTO", campoSubstituto);
        this.campoSubstituto = campoSubstituto;
   }

   public String getCodCampo() {
        return codCampo;
   }

   public void setCodCampo(String codCampo) {
        markAsChanged("CODCAMPO", codCampo);
        this.codCampo = codCampo;
   }

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
        this.codMeta = codMeta;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
        this.grau = grau;
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
        this.campoSubstituto = vo.asString("CAMPOSUBSTITUTO");
        this.codCampo = vo.asString("CODCAMPO");
        this.codMeta = vo.asBigDecimal("CODMETA");
        this.grau = vo.asBigDecimal("GRAU");
        return this;
   }
}
