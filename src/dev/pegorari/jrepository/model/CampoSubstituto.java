package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class CampoSubstituto implements SankhyaEntity<CampoSubstituto> {

   private String campoSubstituto;
   private String codCampo;
   private BigDecimal codMeta;
   private BigDecimal grau;

   public String getCampoSubstituto() {
        return campoSubstituto;
   }

   public void setCampoSubstituto(String campoSubstituto) {
        this.campoSubstituto = campoSubstituto;
   }

   public String getCodCampo() {
        return codCampo;
   }

   public void setCodCampo(String codCampo) {
        this.codCampo = codCampo;
   }

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        this.codMeta = codMeta;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        this.grau = grau;
   }

   @Override
   public String getEntityName() {
        return "CampoSubstituto";
   }

   @Override
   public CampoSubstituto fromVO(DynamicVO vo) {
        this.campoSubstituto = vo.asString("CAMPOSUBSTITUTO");
        this.codCampo = vo.asString("CODCAMPO");
        this.codMeta = vo.asBigDecimal("CODMETA");
        this.grau = vo.asBigDecimal("GRAU");
        return this;
   }
}
