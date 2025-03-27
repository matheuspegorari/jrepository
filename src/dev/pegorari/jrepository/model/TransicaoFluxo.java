package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TransicaoFluxo extends AbstractSankhyaEntity<TransicaoFluxo> {
   public String getDefStatusExec() {
        return this.getVo().asString("DEFSTATUSEXEC");
   }

   public void setDefStatusExec(String defStatusExec) {
        markAsChanged("DEFSTATUSEXEC", defStatusExec);
   }

   public String getExpCondicao() {
        return this.getVo().asString("EXPCONDICAO");
   }

   public void setExpCondicao(String expCondicao) {
        markAsChanged("EXPCONDICAO", expCondicao);
   }

   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getIdeFxDest() {
        return this.getVo().asBigDecimal("IDEFXDEST");
   }

   public void setIdeFxDest(BigDecimal ideFxDest) {
        markAsChanged("IDEFXDEST", ideFxDest);
   }

   public BigDecimal getIdeFxOrig() {
        return this.getVo().asBigDecimal("IDEFXORIG");
   }

   public void setIdeFxOrig(BigDecimal ideFxOrig) {
        markAsChanged("IDEFXORIG", ideFxOrig);
   }

   public BigDecimal getOrdemAval() {
        return this.getVo().asBigDecimal("ORDEMAVAL");
   }

   public void setOrdemAval(BigDecimal ordemAval) {
        markAsChanged("ORDEMAVAL", ordemAval);
   }

   public String getPadrao() {
        return this.getVo().asString("PADRAO");
   }

   public void setPadrao(String padrao) {
        markAsChanged("PADRAO", padrao);
   }

   public String getPrioritario() {
        return this.getVo().asString("PRIORITARIO");
   }

   public void setPrioritario(String prioritario) {
        markAsChanged("PRIORITARIO", prioritario);
   }

   @Override
   public String getTableName() {
        return "TPRTFX";
   }

   @Override
   public String getEntityName() {
        return "TransicaoFluxo";
   }

   @Override
   public TransicaoFluxo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
