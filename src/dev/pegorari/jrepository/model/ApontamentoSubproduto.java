package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ApontamentoSubproduto extends AbstractSankhyaEntity<ApontamentoSubproduto> {
   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getQtd() {
        return this.getVo().asBigDecimal("QTD");
   }

   public void setQtd(BigDecimal qtd) {
        markAsChanged("QTD", qtd);
   }

   public BigDecimal getSeqApa() {
        return this.getVo().asBigDecimal("SEQAPA");
   }

   public void setSeqApa(BigDecimal seqApa) {
        markAsChanged("SEQAPA", seqApa);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public BigDecimal getNuApo() {
        return this.getVo().asBigDecimal("NUAPO");
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
   }

   public String getControleSp() {
        return this.getVo().asString("CONTROLESP");
   }

   public void setControleSp(String controleSp) {
        markAsChanged("CONTROLESP", controleSp);
   }

   public BigDecimal getCodProdSp() {
        return this.getVo().asBigDecimal("CODPRODSP");
   }

   public void setCodProdSp(BigDecimal codProdSp) {
        markAsChanged("CODPRODSP", codProdSp);
   }

   @Override
   public String getTableName() {
        return "TPRASP";
   }

   @Override
   public String getEntityName() {
        return "ApontamentoSubproduto";
   }

   @Override
   public ApontamentoSubproduto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
