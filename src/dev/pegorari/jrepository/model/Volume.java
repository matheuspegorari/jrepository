package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Volume extends AbstractSankhyaEntity<Volume> {
   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getDescrVol() {
        return this.getVo().asString("DESCRVOL");
   }

   public void setDescrVol(String descrVol) {
        markAsChanged("DESCRVOL", descrVol);
   }

   public String getUtiliRegVolWms() {
        return this.getVo().asString("UTILIREGVOLWMS");
   }

   public void setUtiliRegVolWms(String utiliRegVolWms) {
        markAsChanged("UTILIREGVOLWMS", utiliRegVolWms);
   }

   public String getUtiliConfPeso() {
        return this.getVo().asString("UTILICONFPESO");
   }

   public void setUtiliConfPeso(String utiliConfPeso) {
        markAsChanged("UTILICONFPESO", utiliConfPeso);
   }

   public String getCodVolFci() {
        return this.getVo().asString("CODVOLFCI");
   }

   public void setCodVolFci(String codVolFci) {
        markAsChanged("CODVOLFCI", codVolFci);
   }

   public BigDecimal getDecQtd() {
        return this.getVo().asBigDecimal("DECQTD");
   }

   public void setDecQtd(BigDecimal decQtd) {
        markAsChanged("DECQTD", decQtd);
   }

   public String getAtuNuVersao() {
        return this.getVo().asString("ATUNUVERSAO");
   }

   public void setAtuNuVersao(String atuNuVersao) {
        markAsChanged("ATUNUVERSAO", atuNuVersao);
   }

   public BigDecimal getNuVersao() {
        return this.getVo().asBigDecimal("NUVERSAO");
   }

   public void setNuVersao(BigDecimal nuVersao) {
        markAsChanged("NUVERSAO", nuVersao);
   }

   @Override
   public String getTableName() {
        return "TGFVOL";
   }

   @Override
   public String getEntityName() {
        return "Volume";
   }

   @Override
   public Volume fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
