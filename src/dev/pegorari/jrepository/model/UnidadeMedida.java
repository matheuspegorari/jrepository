package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UnidadeMedida extends AbstractSankhyaEntity<UnidadeMedida> {
   public String getTipMed() {
        return this.getVo().asString("TIPMED");
   }

   public void setTipMed(String tipMed) {
        markAsChanged("TIPMED", tipMed);
   }

   public BigDecimal getQtdMed() {
        return this.getVo().asBigDecimal("QTDMED");
   }

   public void setQtdMed(BigDecimal qtdMed) {
        markAsChanged("QTDMED", qtdMed);
   }

   public BigDecimal getSeqMed() {
        return this.getVo().asBigDecimal("SEQMED");
   }

   public void setSeqMed(BigDecimal seqMed) {
        markAsChanged("SEQMED", seqMed);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getUnMed() {
        return this.getVo().asString("UNMED");
   }

   public void setUnMed(String unMed) {
        markAsChanged("UNMED", unMed);
   }

   @Override
   public String getTableName() {
        return "TGFUNM";
   }

   @Override
   public String getEntityName() {
        return "UnidadeMedida";
   }

   @Override
   public UnidadeMedida fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
