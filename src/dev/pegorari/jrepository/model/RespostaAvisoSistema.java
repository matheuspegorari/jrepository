package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RespostaAvisoSistema extends AbstractSankhyaEntity<RespostaAvisoSistema> {
   private BigDecimal codUsu;
   private BigDecimal nuAviso;
   private BigDecimal nuRespAviso;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getNuAviso() {
        return nuAviso;
   }

   public void setNuAviso(BigDecimal nuAviso) {
        markAsChanged("NUAVISO", nuAviso);
        this.nuAviso = nuAviso;
   }

   public BigDecimal getNuRespAviso() {
        return nuRespAviso;
   }

   public void setNuRespAviso(BigDecimal nuRespAviso) {
        markAsChanged("NURESPAVISO", nuRespAviso);
        this.nuRespAviso = nuRespAviso;
   }

   @Override
   public String getTableName() {
        return "TSIRAV";
   }

   @Override
   public String getEntityName() {
        return "RespostaAvisoSistema";
   }

   @Override
   public RespostaAvisoSistema fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuAviso = vo.asBigDecimal("NUAVISO");
        this.nuRespAviso = vo.asBigDecimal("NURESPAVISO");
        return this;
   }
}
