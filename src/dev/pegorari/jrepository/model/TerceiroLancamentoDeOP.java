package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TerceiroLancamentoDeOP extends AbstractSankhyaEntity<TerceiroLancamentoDeOP> {
   public BigDecimal getSeqOp() {
        return this.getVo().asBigDecimal("SEQOP");
   }

   public void setSeqOp(BigDecimal seqOp) {
        markAsChanged("SEQOP", seqOp);
   }

   public BigDecimal getNuLop() {
        return this.getVo().asBigDecimal("NULOP");
   }

   public void setNuLop(BigDecimal nuLop) {
        markAsChanged("NULOP", nuLop);
   }

   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getCodParcterc() {
        return this.getVo().asBigDecimal("CODPARCTERC");
   }

   public void setCodParcterc(BigDecimal codParcterc) {
        markAsChanged("CODPARCTERC", codParcterc);
   }

   public String getDescAtv() {
        return this.getVo().asString("DESCATV");
   }

   public void setDescAtv(String descAtv) {
        markAsChanged("DESCATV", descAtv);
   }

   @Override
   public String getTableName() {
        return "TPRTLOP";
   }

   @Override
   public String getEntityName() {
        return "TerceiroLancamentoDeOP";
   }

   @Override
   public TerceiroLancamentoDeOP fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
