package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ImpostoNota extends AbstractSankhyaEntity<ImpostoNota> {
   public BigDecimal getAliquota() {
        return this.getVo().asBigDecimal("ALIQUOTA");
   }

   public void setAliquota(BigDecimal aliquota) {
        markAsChanged("ALIQUOTA", aliquota);
   }

   public BigDecimal getBase() {
        return this.getVo().asBigDecimal("BASE");
   }

   public void setBase(BigDecimal base) {
        markAsChanged("BASE", base);
   }

   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public BigDecimal getCodImp() {
        return this.getVo().asBigDecimal("CODIMP");
   }

   public void setCodImp(BigDecimal codImp) {
        markAsChanged("CODIMP", codImp);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getTipImp() {
        return this.getVo().asBigDecimal("TIPIMP");
   }

   public void setTipImp(BigDecimal tipImp) {
        markAsChanged("TIPIMP", tipImp);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
   }

   public BigDecimal getPercInssEspecial() {
        return this.getVo().asBigDecimal("PERCINSSESPECIAL");
   }

   public void setPercInssEspecial(BigDecimal percInssEspecial) {
        markAsChanged("PERCINSSESPECIAL", percInssEspecial);
   }

   public String getTipoInssEspecial() {
        return this.getVo().asString("TIPOINSSESPECIAL");
   }

   public void setTipoInssEspecial(String tipoInssEspecial) {
        markAsChanged("TIPOINSSESPECIAL", tipoInssEspecial);
   }

   public BigDecimal getVlrInssEspecial() {
        return this.getVo().asBigDecimal("VLRINSSESPECIAL");
   }

   public void setVlrInssEspecial(BigDecimal vlrInssEspecial) {
        markAsChanged("VLRINSSESPECIAL", vlrInssEspecial);
   }

   public BigDecimal getCodNatRend() {
        return this.getVo().asBigDecimal("CODNATREND");
   }

   public void setCodNatRend(BigDecimal codNatRend) {
        markAsChanged("CODNATREND", codNatRend);
   }

   public String getCodReceita() {
        return this.getVo().asString("CODRECEITA");
   }

   public void setCodReceita(String codReceita) {
        markAsChanged("CODRECEITA", codReceita);
   }

   public BigDecimal getTpIrrfExt() {
        return this.getVo().asBigDecimal("TPIRRFEXT");
   }

   public void setTpIrrfExt(BigDecimal tpIrrfExt) {
        markAsChanged("TPIRRFEXT", tpIrrfExt);
   }

   @Override
   public String getTableName() {
        return "TGFIMN";
   }

   @Override
   public String getEntityName() {
        return "ImpostoNota";
   }

   @Override
   public ImpostoNota fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
