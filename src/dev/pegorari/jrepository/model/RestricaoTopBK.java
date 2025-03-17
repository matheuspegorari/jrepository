package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RestricaoTopBK extends AbstractSankhyaEntity<RestricaoTopBK> {
   private String restricao;
   private BigDecimal sequencia;
   private BigDecimal codColRest;
   private String serie;
   private BigDecimal nuNico;
   private BigDecimal codTipOper;
   private String tipRest;

   public String getRestricao() {
        return restricao;
   }

   public void setRestricao(String restricao) {
        this.restricao = restricao;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getCodColRest() {
        return codColRest;
   }

   public void setCodColRest(BigDecimal codColRest) {
        this.codColRest = codColRest;
   }

   public String getSerie() {
        return serie;
   }

   public void setSerie(String serie) {
        this.serie = serie;
   }

   public BigDecimal getNuNico() {
        return nuNico;
   }

   public void setNuNico(BigDecimal nuNico) {
        this.nuNico = nuNico;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        this.codTipOper = codTipOper;
   }

   public String getTipRest() {
        return tipRest;
   }

   public void setTipRest(String tipRest) {
        this.tipRest = tipRest;
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
        this.restricao = vo.asString("RESTRICAO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.codColRest = vo.asBigDecimal("CODCOLREST");
        this.serie = vo.asString("SERIE");
        this.nuNico = vo.asBigDecimal("NUNICO");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.tipRest = vo.asString("TIPREST");
        return this;
   }
}
