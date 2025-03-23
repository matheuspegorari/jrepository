package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Capacidade extends AbstractSankhyaEntity<Capacidade> {
   private BigDecimal codCap;
   private String descricao;
   private String unidade;
   private String untmp;

   public BigDecimal getCodCap() {
        return codCap;
   }

   public void setCodCap(BigDecimal codCap) {
        markAsChanged("CODCAP", codCap);
        this.codCap = codCap;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getUnidade() {
        return unidade;
   }

   public void setUnidade(String unidade) {
        markAsChanged("UNIDADE", unidade);
        this.unidade = unidade;
   }

   public String getUntmp() {
        return untmp;
   }

   public void setUntmp(String untmp) {
        markAsChanged("UNTMP", untmp);
        this.untmp = untmp;
   }

   @Override
   public String getTableName() {
        return "TPRCAP";
   }

   @Override
   public String getEntityName() {
        return "Capacidade";
   }

   @Override
   public Capacidade fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codCap = vo.asBigDecimal("CODCAP");
        this.descricao = vo.asString("DESCRICAO");
        this.unidade = vo.asString("UNIDADE");
        this.untmp = vo.asString("UNTMP");
        return this;
   }
}
