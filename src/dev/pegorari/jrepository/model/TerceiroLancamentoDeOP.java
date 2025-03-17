package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TerceiroLancamentoDeOP extends AbstractSankhyaEntity<TerceiroLancamentoDeOP> {
   private BigDecimal seqOp;
   private BigDecimal nuLop;
   private BigDecimal ideFx;
   private BigDecimal codParcterc;
   private String descAtv;

   public BigDecimal getSeqOp() {
        return seqOp;
   }

   public void setSeqOp(BigDecimal seqOp) {
        this.seqOp = seqOp;
   }

   public BigDecimal getNuLop() {
        return nuLop;
   }

   public void setNuLop(BigDecimal nuLop) {
        this.nuLop = nuLop;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        this.ideFx = ideFx;
   }

   public BigDecimal getCodParcterc() {
        return codParcterc;
   }

   public void setCodParcterc(BigDecimal codParcterc) {
        this.codParcterc = codParcterc;
   }

   public String getDescAtv() {
        return descAtv;
   }

   public void setDescAtv(String descAtv) {
        this.descAtv = descAtv;
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
        this.seqOp = vo.asBigDecimal("SEQOP");
        this.nuLop = vo.asBigDecimal("NULOP");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.codParcterc = vo.asBigDecimal("CODPARCTERC");
        this.descAtv = vo.asString("DESCATV");
        return this;
   }
}
