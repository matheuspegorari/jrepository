package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class SerieProdutoAcabado implements SankhyaEntity<SerieProdutoAcabado> {

   private BigDecimal codProdPa;
   private BigDecimal idIproc;
   private String liberado;
   private BigDecimal nuApo;
   private String perda;
   private String seriePa;

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        this.idIproc = idIproc;
   }

   public String getLiberado() {
        return liberado;
   }

   public void setLiberado(String liberado) {
        this.liberado = liberado;
   }

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        this.nuApo = nuApo;
   }

   public String getPerda() {
        return perda;
   }

   public void setPerda(String perda) {
        this.perda = perda;
   }

   public String getSeriePa() {
        return seriePa;
   }

   public void setSeriePa(String seriePa) {
        this.seriePa = seriePa;
   }

   @Override
   public String getEntityName() {
        return "SerieProdutoAcabado";
   }

   @Override
   public SerieProdutoAcabado fromVO(DynamicVO vo) {
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.idIproc = vo.asBigDecimal("IDIPROC");
        this.liberado = vo.asString("LIBERADO");
        this.nuApo = vo.asBigDecimal("NUAPO");
        this.perda = vo.asString("PERDA");
        this.seriePa = vo.asString("SERIEPA");
        return this;
   }
}
