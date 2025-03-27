package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemConferenciaProducao extends AbstractSankhyaEntity<ItemConferenciaProducao> {
   public String getCodBarra() {
        return this.getVo().asString("CODBARRA");
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getNuConf() {
        return this.getVo().asBigDecimal("NUCONF");
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
   }

   public BigDecimal getQtdConf() {
        return this.getVo().asBigDecimal("QTDCONF");
   }

   public void setQtdConf(BigDecimal qtdConf) {
        markAsChanged("QTDCONF", qtdConf);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   @Override
   public String getTableName() {
        return "TPRCOI";
   }

   @Override
   public String getEntityName() {
        return "ItemConferenciaProducao";
   }

   @Override
   public ItemConferenciaProducao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
