package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AjusteEstoque extends AbstractSankhyaEntity<AjusteEstoque> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getNuAjuste() {
        return this.getVo().asBigDecimal("NUAJUSTE");
   }

   public void setNuAjuste(BigDecimal nuAjuste) {
        markAsChanged("NUAJUSTE", nuAjuste);
   }

   public BigDecimal getNuIvt() {
        return this.getVo().asBigDecimal("NUIVT");
   }

   public void setNuIvt(BigDecimal nuIvt) {
        markAsChanged("NUIVT", nuIvt);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
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
        this.setVo(vo);
        return this;
   }
}
