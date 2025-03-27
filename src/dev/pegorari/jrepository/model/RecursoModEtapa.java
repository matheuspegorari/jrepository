package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RecursoModEtapa extends AbstractSankhyaEntity<RecursoModEtapa> {
   public BigDecimal getCodMetod() {
        return this.getVo().asBigDecimal("CODMETOD");
   }

   public void setCodMetod(BigDecimal codMetod) {
        markAsChanged("CODMETOD", codMetod);
   }

   public BigDecimal getCodTipFuncao() {
        return this.getVo().asBigDecimal("CODTIPFUNCAO");
   }

   public void setCodTipFuncao(BigDecimal codTipFuncao) {
        markAsChanged("CODTIPFUNCAO", codTipFuncao);
   }

   public BigDecimal getNumModelo() {
        return this.getVo().asBigDecimal("NUMMODELO");
   }

   public void setNumModelo(BigDecimal numModelo) {
        markAsChanged("NUMMODELO", numModelo);
   }

   @Override
   public String getTableName() {
        return "TCSMFU";
   }

   @Override
   public String getEntityName() {
        return "RecursoModEtapa";
   }

   @Override
   public RecursoModEtapa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
