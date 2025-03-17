package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TransicaoFluxo extends AbstractSankhyaEntity<TransicaoFluxo> {
   private String defStatusExec;
   private String expCondicao;
   private BigDecimal ideFx;
   private BigDecimal ideFxDest;
   private BigDecimal ideFxOrig;
   private BigDecimal ordemAval;
   private String padrao;
   private String prioritario;

   public String getDefStatusExec() {
        return defStatusExec;
   }

   public void setDefStatusExec(String defStatusExec) {
        this.defStatusExec = defStatusExec;
   }

   public String getExpCondicao() {
        return expCondicao;
   }

   public void setExpCondicao(String expCondicao) {
        this.expCondicao = expCondicao;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        this.ideFx = ideFx;
   }

   public BigDecimal getIdeFxDest() {
        return ideFxDest;
   }

   public void setIdeFxDest(BigDecimal ideFxDest) {
        this.ideFxDest = ideFxDest;
   }

   public BigDecimal getIdeFxOrig() {
        return ideFxOrig;
   }

   public void setIdeFxOrig(BigDecimal ideFxOrig) {
        this.ideFxOrig = ideFxOrig;
   }

   public BigDecimal getOrdemAval() {
        return ordemAval;
   }

   public void setOrdemAval(BigDecimal ordemAval) {
        this.ordemAval = ordemAval;
   }

   public String getPadrao() {
        return padrao;
   }

   public void setPadrao(String padrao) {
        this.padrao = padrao;
   }

   public String getPrioritario() {
        return prioritario;
   }

   public void setPrioritario(String prioritario) {
        this.prioritario = prioritario;
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
        this.defStatusExec = vo.asString("DEFSTATUSEXEC");
        this.expCondicao = vo.asString("EXPCONDICAO");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.ideFxDest = vo.asBigDecimal("IDEFXDEST");
        this.ideFxOrig = vo.asBigDecimal("IDEFXORIG");
        this.ordemAval = vo.asBigDecimal("ORDEMAVAL");
        this.padrao = vo.asString("PADRAO");
        this.prioritario = vo.asString("PRIORITARIO");
        return this;
   }
}
