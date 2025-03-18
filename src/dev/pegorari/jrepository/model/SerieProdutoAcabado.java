package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SerieProdutoAcabado extends AbstractSankhyaEntity<SerieProdutoAcabado> {
   private BigDecimal codProdPa;
   private BigDecimal idiProc;
   private String liberado;
   private BigDecimal nuApo;
   private String perda;
   private String seriePa;

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public BigDecimal getIdiProc() {
        return idiProc;
   }

   public void setIdiProc(BigDecimal idiProc) {
        markAsChanged("IDIPROC", idiProc);
        this.idiProc = idiProc;
   }

   public String getLiberado() {
        return liberado;
   }

   public void setLiberado(String liberado) {
        markAsChanged("LIBERADO", liberado);
        this.liberado = liberado;
   }

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
        this.nuApo = nuApo;
   }

   public String getPerda() {
        return perda;
   }

   public void setPerda(String perda) {
        markAsChanged("PERDA", perda);
        this.perda = perda;
   }

   public String getSeriePa() {
        return seriePa;
   }

   public void setSeriePa(String seriePa) {
        markAsChanged("SERIEPA", seriePa);
        this.seriePa = seriePa;
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
        this.setOriginalVO(vo);
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.idiProc = vo.asBigDecimal("IDIPROC");
        this.liberado = vo.asString("LIBERADO");
        this.nuApo = vo.asBigDecimal("NUAPO");
        this.perda = vo.asString("PERDA");
        this.seriePa = vo.asString("SERIEPA");
        return this;
   }
}
