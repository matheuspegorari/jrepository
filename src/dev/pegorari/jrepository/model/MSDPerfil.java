package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class MSDPerfil implements SankhyaEntity<MSDPerfil> {

   private BigDecimal codPer;
   private String descPer;
   private String envUlt;
   private BigDecimal intMin;
   private String nomePer;
   private char[] queryListaDest;
   private String usaQueryLista;

   public BigDecimal getCodPer() {
        return codPer;
   }

   public void setCodPer(BigDecimal codPer) {
        this.codPer = codPer;
   }

   public String getDescPer() {
        return descPer;
   }

   public void setDescPer(String descPer) {
        this.descPer = descPer;
   }

   public String getEnvUlt() {
        return envUlt;
   }

   public void setEnvUlt(String envUlt) {
        this.envUlt = envUlt;
   }

   public BigDecimal getIntMin() {
        return intMin;
   }

   public void setIntMin(BigDecimal intMin) {
        this.intMin = intMin;
   }

   public String getNomePer() {
        return nomePer;
   }

   public void setNomePer(String nomePer) {
        this.nomePer = nomePer;
   }

   public char[] getQueryListaDest() {
        return queryListaDest;
   }

   public void setQueryListaDest(char[] queryListaDest) {
        this.queryListaDest = queryListaDest;
   }

   public String getUsaQueryLista() {
        return usaQueryLista;
   }

   public void setUsaQueryLista(String usaQueryLista) {
        this.usaQueryLista = usaQueryLista;
   }

   @Override
   public String getEntityName() {
        return "MSDPerfil";
   }

   @Override
   public MSDPerfil fromVO(DynamicVO vo) {
        this.codPer = vo.asBigDecimal("CODPER");
        this.descPer = vo.asString("DESCPER");
        this.envUlt = vo.asString("ENVULT");
        this.intMin = vo.asBigDecimal("INTMIN");
        this.nomePer = vo.asString("NOMEPER");
        this.queryListaDest = vo.asClob("QUERYLISTADEST");
        this.usaQueryLista = vo.asString("USAQUERYLISTA");
        return this;
   }
}
