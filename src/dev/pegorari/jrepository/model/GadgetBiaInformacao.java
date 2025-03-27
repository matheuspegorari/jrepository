package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GadgetBiaInformacao extends AbstractSankhyaEntity<GadgetBiaInformacao> {
   public String getCampoAgrup() {
        return this.getVo().asString("CAMPOAGRUP");
   }

   public void setCampoAgrup(String campoAgrup) {
        markAsChanged("CAMPOAGRUP", campoAgrup);
   }

   public String getCampoValor() {
        return this.getVo().asString("CAMPOVALOR");
   }

   public void setCampoValor(String campoValor) {
        markAsChanged("CAMPOVALOR", campoValor);
   }

   public BigDecimal getCodGbi() {
        return this.getVo().asBigDecimal("CODGBI");
   }

   public void setCodGbi(BigDecimal codGbi) {
        markAsChanged("CODGBI", codGbi);
   }

   public String getDescrGbi() {
        return this.getVo().asString("DESCRGBI");
   }

   public void setDescrGbi(String descrGbi) {
        markAsChanged("DESCRGBI", descrGbi);
   }

   public String getIdCmp() {
        return this.getVo().asString("IDCMP");
   }

   public void setIdCmp(String idCmp) {
        markAsChanged("IDCMP", idCmp);
   }

   public String getIdInfoBia() {
        return this.getVo().asString("IDINFOBIA");
   }

   public void setIdInfoBia(String idInfoBia) {
        markAsChanged("IDINFOBIA", idInfoBia);
   }

   public String getIdLvl() {
        return this.getVo().asString("IDLVL");
   }

   public void setIdLvl(String idLvl) {
        markAsChanged("IDLVL", idLvl);
   }

   public BigDecimal getNuGdg() {
        return this.getVo().asBigDecimal("NUGDG");
   }

   public void setNuGdg(BigDecimal nuGdg) {
        markAsChanged("NUGDG", nuGdg);
   }

   @Override
   public String getTableName() {
        return "TSIGBI";
   }

   @Override
   public String getEntityName() {
        return "GadgetBiaInformacao";
   }

   @Override
   public GadgetBiaInformacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
