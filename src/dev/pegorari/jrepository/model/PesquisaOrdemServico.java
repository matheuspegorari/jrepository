package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PesquisaOrdemServico extends AbstractSankhyaEntity<PesquisaOrdemServico> {
   private String aplicavel;
   private BigDecimal codFld;
   private BigDecimal numItem;
   private BigDecimal numOs;
   private BigDecimal nuPesq;

   public String getAplicavel() {
        return aplicavel;
   }

   public void setAplicavel(String aplicavel) {
        this.aplicavel = aplicavel;
   }

   public BigDecimal getCodFld() {
        return codFld;
   }

   public void setCodFld(BigDecimal codFld) {
        this.codFld = codFld;
   }

   public BigDecimal getNumItem() {
        return numItem;
   }

   public void setNumItem(BigDecimal numItem) {
        this.numItem = numItem;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        this.numOs = numOs;
   }

   public BigDecimal getNuPesq() {
        return nuPesq;
   }

   public void setNuPesq(BigDecimal nuPesq) {
        this.nuPesq = nuPesq;
   }

   @Override
   public String getTableName() {
        return "TCSPOS";
   }

   @Override
   public String getEntityName() {
        return "PesquisaOrdemServico";
   }

   @Override
   public PesquisaOrdemServico fromVO(DynamicVO vo) {
        this.aplicavel = vo.asString("APLICAVEL");
        this.codFld = vo.asBigDecimal("CODFLD");
        this.numItem = vo.asBigDecimal("NUMITEM");
        this.numOs = vo.asBigDecimal("NUMOS");
        this.nuPesq = vo.asBigDecimal("NUPESQ");
        return this;
   }
}
