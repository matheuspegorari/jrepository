package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ProdutoDivergente extends AbstractSankhyaEntity<ProdutoDivergente> {
   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public BigDecimal getNuConf() {
        return this.getVo().asBigDecimal("NUCONF");
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TGFPDD";
   }

   @Override
   public String getEntityName() {
        return "ProdutoDivergente";
   }

   @Override
   public ProdutoDivergente fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
