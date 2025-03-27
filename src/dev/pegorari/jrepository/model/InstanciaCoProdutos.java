package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class InstanciaCoProdutos extends AbstractSankhyaEntity<InstanciaCoProdutos> {
   public BigDecimal getIdCop() {
        return this.getVo().asBigDecimal("IDCOP");
   }

   public void setIdCop(BigDecimal idCop) {
        markAsChanged("IDCOP", idCop);
   }

   public BigDecimal getIdICop() {
        return this.getVo().asBigDecimal("IDICOP");
   }

   public void setIdICop(BigDecimal idICop) {
        markAsChanged("IDICOP", idICop);
   }

   public BigDecimal getIdIProc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdIProc(BigDecimal idIProc) {
        markAsChanged("IDIPROC", idIProc);
   }

   public BigDecimal getQtdConsumida() {
        return this.getVo().asBigDecimal("QTDCONSUMIDA");
   }

   public void setQtdConsumida(BigDecimal qtdConsumida) {
        markAsChanged("QTDCONSUMIDA", qtdConsumida);
   }

   @Override
   public String getTableName() {
        return "TPRICOP";
   }

   @Override
   public String getEntityName() {
        return "InstanciaCoProdutos";
   }

   @Override
   public InstanciaCoProdutos fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
