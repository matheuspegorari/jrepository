package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RecursoModEtapa extends AbstractSankhyaEntity<RecursoModEtapa> {
   private BigDecimal codMetod;
   private BigDecimal codTipFuncao;
   private BigDecimal numModelo;

   public BigDecimal getCodMetod() {
        return codMetod;
   }

   public void setCodMetod(BigDecimal codMetod) {
        markAsChanged("CODMETOD", codMetod);
        this.codMetod = codMetod;
   }

   public BigDecimal getCodTipFuncao() {
        return codTipFuncao;
   }

   public void setCodTipFuncao(BigDecimal codTipFuncao) {
        markAsChanged("CODTIPFUNCAO", codTipFuncao);
        this.codTipFuncao = codTipFuncao;
   }

   public BigDecimal getNumModelo() {
        return numModelo;
   }

   public void setNumModelo(BigDecimal numModelo) {
        markAsChanged("NUMMODELO", numModelo);
        this.numModelo = numModelo;
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
        this.setOriginalVO(vo);
        this.codMetod = vo.asBigDecimal("CODMETOD");
        this.codTipFuncao = vo.asBigDecimal("CODTIPFUNCAO");
        this.numModelo = vo.asBigDecimal("NUMMODELO");
        return this;
   }
}
