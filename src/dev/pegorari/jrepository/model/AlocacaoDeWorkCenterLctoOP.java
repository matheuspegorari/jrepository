package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AlocacaoDeWorkCenterLctoOP extends AbstractSankhyaEntity<AlocacaoDeWorkCenterLctoOP> {
   private BigDecimal seqOp;
   private BigDecimal nuLop;
   private BigDecimal idAwc;
   private BigDecimal idProc;
   private BigDecimal codWcp;
   private BigDecimal codCwc;
   private String descrCwc;
   private String descrAtv;

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

   public BigDecimal getIdAwc() {
        return idAwc;
   }

   public void setIdAwc(BigDecimal idAwc) {
        this.idAwc = idAwc;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        this.idProc = idProc;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        this.codWcp = codWcp;
   }

   public BigDecimal getCodCwc() {
        return codCwc;
   }

   public void setCodCwc(BigDecimal codCwc) {
        this.codCwc = codCwc;
   }

   public String getDescrCwc() {
        return descrCwc;
   }

   public void setDescrCwc(String descrCwc) {
        this.descrCwc = descrCwc;
   }

   public String getDescrAtv() {
        return descrAtv;
   }

   public void setDescrAtv(String descrAtv) {
        this.descrAtv = descrAtv;
   }

   @Override
   public String getTableName() {
        return "TPRWLOP";
   }

   @Override
   public String getEntityName() {
        return "AlocacaoDeWorkCenterLctoOP";
   }

   @Override
   public AlocacaoDeWorkCenterLctoOP fromVO(DynamicVO vo) {
        this.seqOp = vo.asBigDecimal("SEQOP");
        this.nuLop = vo.asBigDecimal("NULOP");
        this.idAwc = vo.asBigDecimal("IDAWC");
        this.idProc = vo.asBigDecimal("IDPROC");
        this.codWcp = vo.asBigDecimal("CODWCP");
        this.codCwc = vo.asBigDecimal("CODCWC");
        this.descrCwc = vo.asString("DESCRCWC");
        this.descrAtv = vo.asString("DESCRATV");
        return this;
   }
}
