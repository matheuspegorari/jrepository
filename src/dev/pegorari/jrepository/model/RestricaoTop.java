package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RestricaoTop extends AbstractSankhyaEntity<RestricaoTop> {
   public BigDecimal getCodColRest() {
        return this.getVo().asBigDecimal("CODCOLREST");
   }

   public void setCodColRest(BigDecimal codColRest) {
        markAsChanged("CODCOLREST", codColRest);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getRestricao() {
        return this.getVo().asString("RESTRICAO");
   }

   public void setRestricao(String restricao) {
        markAsChanged("RESTRICAO", restricao);
   }

   public String getSerie() {
        return this.getVo().asString("SERIE");
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
   }

   public String getTipRest() {
        return this.getVo().asString("TIPREST");
   }

   public void setTipRest(String tipRest) {
        markAsChanged("TIPREST", tipRest);
   }

   @Override
   public String getTableName() {
        return "TGFREP";
   }

   @Override
   public String getEntityName() {
        return "RestricaoTop";
   }

   @Override
   public RestricaoTop fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
