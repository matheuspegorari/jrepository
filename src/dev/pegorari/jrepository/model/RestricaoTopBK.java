package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RestricaoTopBK extends AbstractSankhyaEntity<RestricaoTopBK> {
   public String getRestricao() {
        return this.getVo().asString("RESTRICAO");
   }

   public void setRestricao(String restricao) {
        markAsChanged("RESTRICAO", restricao);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getCodColRest() {
        return this.getVo().asBigDecimal("CODCOLREST");
   }

   public void setCodColRest(BigDecimal codColRest) {
        markAsChanged("CODCOLREST", codColRest);
   }

   public String getSerie() {
        return this.getVo().asString("SERIE");
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
   }

   public BigDecimal getNuNico() {
        return this.getVo().asBigDecimal("NUNICO");
   }

   public void setNuNico(BigDecimal nuNico) {
        markAsChanged("NUNICO", nuNico);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public String getTipRest() {
        return this.getVo().asString("TIPREST");
   }

   public void setTipRest(String tipRest) {
        markAsChanged("TIPREST", tipRest);
   }

   @Override
   public String getTableName() {
        return "TGFREPBK";
   }

   @Override
   public String getEntityName() {
        return "RestricaoTopBK";
   }

   @Override
   public RestricaoTopBK fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
