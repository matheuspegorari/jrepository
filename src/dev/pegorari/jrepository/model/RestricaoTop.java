package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RestricaoTop extends AbstractSankhyaEntity<RestricaoTop> {
   private BigDecimal codColRest;
   private BigDecimal codTipOper;
   private String descricao;
   private String restricao;
   private String serie;
   private String tipRest;

   public BigDecimal getCodColRest() {
        return codColRest;
   }

   public void setCodColRest(BigDecimal codColRest) {
        markAsChanged("CODCOLREST", codColRest);
        this.codColRest = codColRest;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
        this.codTipOper = codTipOper;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getRestricao() {
        return restricao;
   }

   public void setRestricao(String restricao) {
        markAsChanged("RESTRICAO", restricao);
        this.restricao = restricao;
   }

   public String getSerie() {
        return serie;
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
        this.serie = serie;
   }

   public String getTipRest() {
        return tipRest;
   }

   public void setTipRest(String tipRest) {
        markAsChanged("TIPREST", tipRest);
        this.tipRest = tipRest;
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
        this.setOriginalVO(vo);
        this.codColRest = vo.asBigDecimal("CODCOLREST");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.descricao = vo.asString("DESCRICAO");
        this.restricao = vo.asString("RESTRICAO");
        this.serie = vo.asString("SERIE");
        this.tipRest = vo.asString("TIPREST");
        return this;
   }
}
