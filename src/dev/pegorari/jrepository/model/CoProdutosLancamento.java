package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CoProdutosLancamento extends AbstractSankhyaEntity<CoProdutosLancamento> {
   private BigDecimal idCop;
   private BigDecimal nuLop;
   private BigDecimal qtdConsumida;
   private BigDecimal seqCop;

   public BigDecimal getIdCop() {
        return idCop;
   }

   public void setIdCop(BigDecimal idCop) {
        markAsChanged("IDCOP", idCop);
        this.idCop = idCop;
   }

   public BigDecimal getNuLop() {
        return nuLop;
   }

   public void setNuLop(BigDecimal nuLop) {
        markAsChanged("NULOP", nuLop);
        this.nuLop = nuLop;
   }

   public BigDecimal getQtdConsumida() {
        return qtdConsumida;
   }

   public void setQtdConsumida(BigDecimal qtdConsumida) {
        markAsChanged("QTDCONSUMIDA", qtdConsumida);
        this.qtdConsumida = qtdConsumida;
   }

   public BigDecimal getSeqCop() {
        return seqCop;
   }

   public void setSeqCop(BigDecimal seqCop) {
        markAsChanged("SEQCOP", seqCop);
        this.seqCop = seqCop;
   }

   @Override
   public String getTableName() {
        return "TPRCOPLOP";
   }

   @Override
   public String getEntityName() {
        return "CoProdutosLancamento";
   }

   @Override
   public CoProdutosLancamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.idCop = vo.asBigDecimal("IDCOP");
        this.nuLop = vo.asBigDecimal("NULOP");
        this.qtdConsumida = vo.asBigDecimal("QTDCONSUMIDA");
        this.seqCop = vo.asBigDecimal("SEQCOP");
        return this;
   }
}
