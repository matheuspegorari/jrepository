package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ApontamentoSubproduto extends AbstractSankhyaEntity<ApontamentoSubproduto> {
   private String referencia;
   private BigDecimal qtd;
   private BigDecimal seqApa;
   private String codVol;
   private BigDecimal nuApo;
   private String controleSp;
   private BigDecimal codProdSp;

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        this.referencia = referencia;
   }

   public BigDecimal getQtd() {
        return qtd;
   }

   public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
   }

   public BigDecimal getSeqApa() {
        return seqApa;
   }

   public void setSeqApa(BigDecimal seqApa) {
        this.seqApa = seqApa;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        this.nuApo = nuApo;
   }

   public String getControleSp() {
        return controleSp;
   }

   public void setControleSp(String controleSp) {
        this.controleSp = controleSp;
   }

   public BigDecimal getCodProdSp() {
        return codProdSp;
   }

   public void setCodProdSp(BigDecimal codProdSp) {
        this.codProdSp = codProdSp;
   }

   @Override
   public String getTableName() {
        return "TPRASP";
   }

   @Override
   public String getEntityName() {
        return "ApontamentoSubproduto";
   }

   @Override
   public ApontamentoSubproduto fromVO(DynamicVO vo) {
        this.referencia = vo.asString("REFERENCIA");
        this.qtd = vo.asBigDecimal("QTD");
        this.seqApa = vo.asBigDecimal("SEQAPA");
        this.codVol = vo.asString("CODVOL");
        this.nuApo = vo.asBigDecimal("NUAPO");
        this.controleSp = vo.asString("CONTROLESP");
        this.codProdSp = vo.asBigDecimal("CODPRODSP");
        return this;
   }
}
