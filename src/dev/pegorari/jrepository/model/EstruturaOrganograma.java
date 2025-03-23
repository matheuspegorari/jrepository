package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EstruturaOrganograma extends AbstractSankhyaEntity<EstruturaOrganograma> {
   private String descricao;
   private String descrRoot;
   private BigDecimal nuEst;
   private String tipVisual;

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getDescrRoot() {
        return descrRoot;
   }

   public void setDescrRoot(String descrRoot) {
        markAsChanged("DESCRROOT", descrRoot);
        this.descrRoot = descrRoot;
   }

   public BigDecimal getNuEst() {
        return nuEst;
   }

   public void setNuEst(BigDecimal nuEst) {
        markAsChanged("NUEST", nuEst);
        this.nuEst = nuEst;
   }

   public String getTipVisual() {
        return tipVisual;
   }

   public void setTipVisual(String tipVisual) {
        markAsChanged("TIPVISUAL", tipVisual);
        this.tipVisual = tipVisual;
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
        this.descricao = vo.asString("DESCRICAO");
        this.descrRoot = vo.asString("DESCRROOT");
        this.nuEst = vo.asBigDecimal("NUEST");
        this.tipVisual = vo.asString("TIPVISUAL");
        return this;
   }
}
