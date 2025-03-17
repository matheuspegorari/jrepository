package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class InstanciaCoProdutos implements SankhyaEntity<InstanciaCoProdutos> {

   private BigDecimal idCop;
   private BigDecimal idICop;
   private BigDecimal idIProc;
   private BigDecimal qtdConsumida;

   public BigDecimal getIdCop() {
        return idCop;
   }

   public void setIdCop(BigDecimal idCop) {
        this.idCop = idCop;
   }

   public BigDecimal getIdICop() {
        return idICop;
   }

   public void setIdICop(BigDecimal idICop) {
        this.idICop = idICop;
   }

   public BigDecimal getIdIProc() {
        return idIProc;
   }

   public void setIdIProc(BigDecimal idIProc) {
        this.idIProc = idIProc;
   }

   public BigDecimal getQtdConsumida() {
        return qtdConsumida;
   }

   public void setQtdConsumida(BigDecimal qtdConsumida) {
        this.qtdConsumida = qtdConsumida;
   }

   @Override
   public String getEntityName() {
        return "InstanciaCoProdutos";
   }

   @Override
   public InstanciaCoProdutos fromVO(DynamicVO vo) {
        this.idCop = vo.asBigDecimal("IDCOP");
        this.idICop = vo.asBigDecimal("IDICOP");
        this.idIProc = vo.asBigDecimal("IDIPROC");
        this.qtdConsumida = vo.asBigDecimal("QTDCONSUMIDA");
        return this;
   }
}
