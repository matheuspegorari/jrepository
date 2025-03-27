package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CoProdutosLancamento extends AbstractSankhyaEntity<CoProdutosLancamento> {
   public BigDecimal getIdCop() {
        return this.getVo().asBigDecimal("IDCOP");
   }

   public void setIdCop(BigDecimal idCop) {
        markAsChanged("IDCOP", idCop);
   }

   public BigDecimal getNuLop() {
        return this.getVo().asBigDecimal("NULOP");
   }

   public void setNuLop(BigDecimal nuLop) {
        markAsChanged("NULOP", nuLop);
   }

   public BigDecimal getQtdConsumida() {
        return this.getVo().asBigDecimal("QTDCONSUMIDA");
   }

   public void setQtdConsumida(BigDecimal qtdConsumida) {
        markAsChanged("QTDCONSUMIDA", qtdConsumida);
   }

   public BigDecimal getSeqCop() {
        return this.getVo().asBigDecimal("SEQCOP");
   }

   public void setSeqCop(BigDecimal seqCop) {
        markAsChanged("SEQCOP", seqCop);
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
        return this;
   }
}
