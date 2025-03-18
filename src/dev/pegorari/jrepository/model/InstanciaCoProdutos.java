package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class InstanciaCoProdutos extends AbstractSankhyaEntity<InstanciaCoProdutos> {
   private BigDecimal idCop;
   private BigDecimal idICop;
   private BigDecimal idIProc;
   private BigDecimal qtdConsumida;

   public BigDecimal getIdCop() {
        return idCop;
   }

   public void setIdCop(BigDecimal idCop) {
        markAsChanged("IDCOP", idCop);
        this.idCop = idCop;
   }

   public BigDecimal getIdICop() {
        return idICop;
   }

   public void setIdICop(BigDecimal idICop) {
        markAsChanged("IDICOP", idICop);
        this.idICop = idICop;
   }

   public BigDecimal getIdIProc() {
        return idIProc;
   }

   public void setIdIProc(BigDecimal idIProc) {
        markAsChanged("IDIPROC", idIProc);
        this.idIProc = idIProc;
   }

   public BigDecimal getQtdConsumida() {
        return qtdConsumida;
   }

   public void setQtdConsumida(BigDecimal qtdConsumida) {
        markAsChanged("QTDCONSUMIDA", qtdConsumida);
        this.qtdConsumida = qtdConsumida;
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
        this.setOriginalVO(vo);
        this.idCop = vo.asBigDecimal("IDCOP");
        this.idICop = vo.asBigDecimal("IDICOP");
        this.idIProc = vo.asBigDecimal("IDIPROC");
        this.qtdConsumida = vo.asBigDecimal("QTDCONSUMIDA");
        return this;
   }
}
