package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class GadgetBiaInformacao implements SankhyaEntity<GadgetBiaInformacao> {

   private String campoAgrup;
   private String campoValor;
   private BigDecimal codGbi;
   private String descrGbi;
   private String idCmp;
   private String idInfoBia;
   private String idLvl;
   private BigDecimal nuGdg;

   public String getCampoAgrup() {
        return campoAgrup;
   }

   public void setCampoAgrup(String campoAgrup) {
        this.campoAgrup = campoAgrup;
   }

   public String getCampoValor() {
        return campoValor;
   }

   public void setCampoValor(String campoValor) {
        this.campoValor = campoValor;
   }

   public BigDecimal getCodGbi() {
        return codGbi;
   }

   public void setCodGbi(BigDecimal codGbi) {
        this.codGbi = codGbi;
   }

   public String getDescrGbi() {
        return descrGbi;
   }

   public void setDescrGbi(String descrGbi) {
        this.descrGbi = descrGbi;
   }

   public String getIdCmp() {
        return idCmp;
   }

   public void setIdCmp(String idCmp) {
        this.idCmp = idCmp;
   }

   public String getIdInfoBia() {
        return idInfoBia;
   }

   public void setIdInfoBia(String idInfoBia) {
        this.idInfoBia = idInfoBia;
   }

   public String getIdLvl() {
        return idLvl;
   }

   public void setIdLvl(String idLvl) {
        this.idLvl = idLvl;
   }

   public BigDecimal getNuGdg() {
        return nuGdg;
   }

   public void setNuGdg(BigDecimal nuGdg) {
        this.nuGdg = nuGdg;
   }

   @Override
   public String getEntityName() {
        return "GadgetBiaInformacao";
   }

   @Override
   public GadgetBiaInformacao fromVO(DynamicVO vo) {
        this.campoAgrup = vo.asString("CAMPOAGRUP");
        this.campoValor = vo.asString("CAMPOVALOR");
        this.codGbi = vo.asBigDecimal("CODGBI");
        this.descrGbi = vo.asString("DESCRGBI");
        this.idCmp = vo.asString("IDCMP");
        this.idInfoBia = vo.asString("IDINFOBIA");
        this.idLvl = vo.asString("IDLVL");
        this.nuGdg = vo.asBigDecimal("NUGDG");
        return this;
   }
}
