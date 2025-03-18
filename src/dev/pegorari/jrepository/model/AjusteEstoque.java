package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AjusteEstoque extends AbstractSankhyaEntity<AjusteEstoque> {
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private BigDecimal nuAjuste;
   private BigDecimal nuIvt;
   private String observacao;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public BigDecimal getNuAjuste() {
        return nuAjuste;
   }

   public void setNuAjuste(BigDecimal nuAjuste) {
        markAsChanged("NUAJUSTE", nuAjuste);
        this.nuAjuste = nuAjuste;
   }

   public BigDecimal getNuIvt() {
        return nuIvt;
   }

   public void setNuIvt(BigDecimal nuIvt) {
        markAsChanged("NUIVT", nuIvt);
        this.nuIvt = nuIvt;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   @Override
   public String getTableName() {
        return "TGWAJE";
   }

   @Override
   public String getEntityName() {
        return "AjusteEstoque";
   }

   @Override
   public AjusteEstoque fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nuAjuste = vo.asBigDecimal("NUAJUSTE");
        this.nuIvt = vo.asBigDecimal("NUIVT");
        this.observacao = vo.asString("OBSERVACAO");
        return this;
   }
}
