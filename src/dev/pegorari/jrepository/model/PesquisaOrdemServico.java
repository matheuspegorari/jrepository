package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PesquisaOrdemServico extends AbstractSankhyaEntity<PesquisaOrdemServico> {
   public String getAplicavel() {
        return this.getVo().asString("APLICAVEL");
   }

   public void setAplicavel(String aplicavel) {
        markAsChanged("APLICAVEL", aplicavel);
   }

   public BigDecimal getCodFld() {
        return this.getVo().asBigDecimal("CODFLD");
   }

   public void setCodFld(BigDecimal codFld) {
        markAsChanged("CODFLD", codFld);
   }

   public BigDecimal getNumItem() {
        return this.getVo().asBigDecimal("NUMITEM");
   }

   public void setNumItem(BigDecimal numItem) {
        markAsChanged("NUMITEM", numItem);
   }

   public BigDecimal getNumOs() {
        return this.getVo().asBigDecimal("NUMOS");
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
   }

   public BigDecimal getNuPesq() {
        return this.getVo().asBigDecimal("NUPESQ");
   }

   public void setNuPesq(BigDecimal nuPesq) {
        markAsChanged("NUPESQ", nuPesq);
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
        this.setVo(vo);
        return this;
   }
}
