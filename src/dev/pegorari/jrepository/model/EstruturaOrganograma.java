package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EstruturaOrganograma extends AbstractSankhyaEntity<EstruturaOrganograma> {
   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getDescrRoot() {
        return this.getVo().asString("DESCRROOT");
   }

   public void setDescrRoot(String descrRoot) {
        markAsChanged("DESCRROOT", descrRoot);
   }

   public BigDecimal getNuEst() {
        return this.getVo().asBigDecimal("NUEST");
   }

   public void setNuEst(BigDecimal nuEst) {
        markAsChanged("NUEST", nuEst);
   }

   public String getTipVisual() {
        return this.getVo().asString("TIPVISUAL");
   }

   public void setTipVisual(String tipVisual) {
        markAsChanged("TIPVISUAL", tipVisual);
   }

   @Override
   public String getTableName() {
        return "TGFCES";
   }

   @Override
   public String getEntityName() {
        return "EstruturaOrganograma";
   }

   @Override
   public EstruturaOrganograma fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
