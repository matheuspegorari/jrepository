package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class Volume implements SankhyaEntity<Volume> {

   private String codVol;
   private String descrVol;
   private String utiliRegVolWms;
   private String utiliConfPeso;
   private String codVolFci;
   private BigDecimal decQtd;
   private String atunVersao;
   private BigDecimal nuVersao;

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public String getDescrVol() {
        return descrVol;
   }

   public void setDescrVol(String descrVol) {
        this.descrVol = descrVol;
   }

   public String getUtiliRegVolWms() {
        return utiliRegVolWms;
   }

   public void setUtiliRegVolWms(String utiliRegVolWms) {
        this.utiliRegVolWms = utiliRegVolWms;
   }

   public String getUtiliConfPeso() {
        return utiliConfPeso;
   }

   public void setUtiliConfPeso(String utiliConfPeso) {
        this.utiliConfPeso = utiliConfPeso;
   }

   public String getCodVolFci() {
        return codVolFci;
   }

   public void setCodVolFci(String codVolFci) {
        this.codVolFci = codVolFci;
   }

   public BigDecimal getDecQtd() {
        return decQtd;
   }

   public void setDecQtd(BigDecimal decQtd) {
        this.decQtd = decQtd;
   }

   public String getAtunVersao() {
        return atunVersao;
   }

   public void setAtunVersao(String atunVersao) {
        this.atunVersao = atunVersao;
   }

   public BigDecimal getNuVersao() {
        return nuVersao;
   }

   public void setNuVersao(BigDecimal nuVersao) {
        this.nuVersao = nuVersao;
   }

   @Override
   public String getEntityName() {
        return "Volume";
   }

   @Override
   public Volume fromVO(DynamicVO vo) {
        this.codVol = vo.asString("CODVOL");
        this.descrVol = vo.asString("DESCRVOL");
        this.utiliRegVolWms = vo.asString("UTILIREGVOLWMS");
        this.utiliConfPeso = vo.asString("UTILICONFPESO");
        this.codVolFci = vo.asString("CODVOLFCI");
        this.decQtd = vo.asBigDecimal("DECQTD");
        this.atunVersao = vo.asString("ATUNVERSAO");
        this.nuVersao = vo.asBigDecimal("NUVERSAO");
        return this;
   }
}
