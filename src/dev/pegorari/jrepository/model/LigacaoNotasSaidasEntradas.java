package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class LigacaoNotasSaidasEntradas extends AbstractSankhyaEntity<LigacaoNotasSaidasEntradas> {
   private BigDecimal baseSubst;
   private BigDecimal vlrSubst;
   private BigDecimal nuNota;
   private BigDecimal nuNotaOrig;
   private BigDecimal qtdSai;
   private BigDecimal sequencia;
   private BigDecimal sequenciaOrig;
   private BigDecimal vlrIcms;
   private BigDecimal baseStfcpInt;
   private BigDecimal percStfcpInt;
   private BigDecimal vlrStfcpInt;

   public BigDecimal getBaseSubst() {
        return baseSubst;
   }

   public void setBaseSubst(BigDecimal baseSubst) {
        markAsChanged("BASESUBST", baseSubst);
        this.baseSubst = baseSubst;
   }

   public BigDecimal getVlrSubst() {
        return vlrSubst;
   }

   public void setVlrSubst(BigDecimal vlrSubst) {
        markAsChanged("VLRSUBST", vlrSubst);
        this.vlrSubst = vlrSubst;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getNuNotaOrig() {
        return nuNotaOrig;
   }

   public void setNuNotaOrig(BigDecimal nuNotaOrig) {
        markAsChanged("NUNOTAORIG", nuNotaOrig);
        this.nuNotaOrig = nuNotaOrig;
   }

   public BigDecimal getQtdSai() {
        return qtdSai;
   }

   public void setQtdSai(BigDecimal qtdSai) {
        markAsChanged("QTDSAI", qtdSai);
        this.qtdSai = qtdSai;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getSequenciaOrig() {
        return sequenciaOrig;
   }

   public void setSequenciaOrig(BigDecimal sequenciaOrig) {
        markAsChanged("SEQUENCIAORIG", sequenciaOrig);
        this.sequenciaOrig = sequenciaOrig;
   }

   public BigDecimal getVlrIcms() {
        return vlrIcms;
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
        this.vlrIcms = vlrIcms;
   }

   public BigDecimal getBaseStfcpInt() {
        return baseStfcpInt;
   }

   public void setBaseStfcpInt(BigDecimal baseStfcpInt) {
        markAsChanged("BASESTFCPINT", baseStfcpInt);
        this.baseStfcpInt = baseStfcpInt;
   }

   public BigDecimal getPercStfcpInt() {
        return percStfcpInt;
   }

   public void setPercStfcpInt(BigDecimal percStfcpInt) {
        markAsChanged("PERCSTFCPINT", percStfcpInt);
        this.percStfcpInt = percStfcpInt;
   }

   public BigDecimal getVlrStfcpInt() {
        return vlrStfcpInt;
   }

   public void setVlrStfcpInt(BigDecimal vlrStfcpInt) {
        markAsChanged("VLRSTFCPINT", vlrStfcpInt);
        this.vlrStfcpInt = vlrStfcpInt;
   }

   @Override
   public String getTableName() {
        return "TGFVAS";
   }

   @Override
   public String getEntityName() {
        return "LigacaoNotasSaidasEntradas";
   }

   @Override
   public LigacaoNotasSaidasEntradas fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.baseSubst = vo.asBigDecimal("BASESUBST");
        this.vlrSubst = vo.asBigDecimal("VLRSUBST");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuNotaOrig = vo.asBigDecimal("NUNOTAORIG");
        this.qtdSai = vo.asBigDecimal("QTDSAI");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.sequenciaOrig = vo.asBigDecimal("SEQUENCIAORIG");
        this.vlrIcms = vo.asBigDecimal("VLRICMS");
        this.baseStfcpInt = vo.asBigDecimal("BASESTFCPINT");
        this.percStfcpInt = vo.asBigDecimal("PERCSTFCPINT");
        this.vlrStfcpInt = vo.asBigDecimal("VLRSTFCPINT");
        return this;
   }
}
