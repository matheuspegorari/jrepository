package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class LigacaoNotasSaidasEntradas extends AbstractSankhyaEntity<LigacaoNotasSaidasEntradas> {
   public BigDecimal getBaseSubst() {
        return this.getVo().asBigDecimal("BASESUBST");
   }

   public void setBaseSubst(BigDecimal baseSubst) {
        markAsChanged("BASESUBST", baseSubst);
   }

   public BigDecimal getVlrSubst() {
        return this.getVo().asBigDecimal("VLRSUBST");
   }

   public void setVlrSubst(BigDecimal vlrSubst) {
        markAsChanged("VLRSUBST", vlrSubst);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuNotaOrig() {
        return this.getVo().asBigDecimal("NUNOTAORIG");
   }

   public void setNuNotaOrig(BigDecimal nuNotaOrig) {
        markAsChanged("NUNOTAORIG", nuNotaOrig);
   }

   public BigDecimal getQtdSai() {
        return this.getVo().asBigDecimal("QTDSAI");
   }

   public void setQtdSai(BigDecimal qtdSai) {
        markAsChanged("QTDSAI", qtdSai);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getSequenciaOrig() {
        return this.getVo().asBigDecimal("SEQUENCIAORIG");
   }

   public void setSequenciaOrig(BigDecimal sequenciaOrig) {
        markAsChanged("SEQUENCIAORIG", sequenciaOrig);
   }

   public BigDecimal getVlrIcms() {
        return this.getVo().asBigDecimal("VLRICMS");
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
   }

   public BigDecimal getBaseStfcpInt() {
        return this.getVo().asBigDecimal("BASESTFCPINT");
   }

   public void setBaseStfcpInt(BigDecimal baseStfcpInt) {
        markAsChanged("BASESTFCPINT", baseStfcpInt);
   }

   public BigDecimal getPercStfcpInt() {
        return this.getVo().asBigDecimal("PERCSTFCPINT");
   }

   public void setPercStfcpInt(BigDecimal percStfcpInt) {
        markAsChanged("PERCSTFCPINT", percStfcpInt);
   }

   public BigDecimal getVlrStfcpInt() {
        return this.getVo().asBigDecimal("VLRSTFCPINT");
   }

   public void setVlrStfcpInt(BigDecimal vlrStfcpInt) {
        markAsChanged("VLRSTFCPINT", vlrStfcpInt);
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
        this.setVo(vo);
        return this;
   }
}
