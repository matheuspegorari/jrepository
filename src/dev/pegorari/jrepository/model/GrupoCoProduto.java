package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GrupoCoProduto extends AbstractSankhyaEntity<GrupoCoProduto> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodProdMp() {
        return this.getVo().asBigDecimal("CODPRODMP");
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getControleMp() {
        return this.getVo().asString("CONTROLEMP");
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
   }

   public String getDescrCop() {
        return this.getVo().asString("DESCRCOP");
   }

   public void setDescrCop(String descrCop) {
        markAsChanged("DESCRCOP", descrCop);
   }

   public BigDecimal getIdCop() {
        return this.getVo().asBigDecimal("IDCOP");
   }

   public void setIdCop(BigDecimal idCop) {
        markAsChanged("IDCOP", idCop);
   }

   public BigDecimal getQtdProcess() {
        return this.getVo().asBigDecimal("QTDPROCESS");
   }

   public void setQtdProcess(BigDecimal qtdProcess) {
        markAsChanged("QTDPROCESS", qtdProcess);
   }

   @Override
   public String getTableName() {
        return "TPRCOP";
   }

   @Override
   public String getEntityName() {
        return "GrupoCoProduto";
   }

   @Override
   public GrupoCoProduto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
