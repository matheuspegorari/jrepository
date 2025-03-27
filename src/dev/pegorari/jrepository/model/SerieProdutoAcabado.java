package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SerieProdutoAcabado extends AbstractSankhyaEntity<SerieProdutoAcabado> {
   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public BigDecimal getIdiProc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdiProc(BigDecimal idiProc) {
        markAsChanged("IDIPROC", idiProc);
   }

   public String getLiberado() {
        return this.getVo().asString("LIBERADO");
   }

   public void setLiberado(String liberado) {
        markAsChanged("LIBERADO", liberado);
   }

   public BigDecimal getNuApo() {
        return this.getVo().asBigDecimal("NUAPO");
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
   }

   public String getPerda() {
        return this.getVo().asString("PERDA");
   }

   public void setPerda(String perda) {
        markAsChanged("PERDA", perda);
   }

   public String getSeriePa() {
        return this.getVo().asString("SERIEPA");
   }

   public void setSeriePa(String seriePa) {
        markAsChanged("SERIEPA", seriePa);
   }

   @Override
   public String getTableName() {
        return "TPRSERPA";
   }

   @Override
   public String getEntityName() {
        return "SerieProdutoAcabado";
   }

   @Override
   public SerieProdutoAcabado fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
