package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemRemessa extends AbstractSankhyaEntity<ItemRemessa> {
   public String getCampo() {
        return this.getVo().asString("CAMPO");
   }

   public void setCampo(String campo) {
        markAsChanged("CAMPO", campo);
   }

   public BigDecimal getCodigo() {
        return this.getVo().asBigDecimal("CODIGO");
   }

   public void setCodigo(BigDecimal codigo) {
        markAsChanged("CODIGO", codigo);
   }

   public String getModulo() {
        return this.getVo().asString("MODULO");
   }

   public void setModulo(String modulo) {
        markAsChanged("MODULO", modulo);
   }

   public BigDecimal getPosFim() {
        return this.getVo().asBigDecimal("POSFIM");
   }

   public void setPosFim(BigDecimal posFim) {
        markAsChanged("POSFIM", posFim);
   }

   public BigDecimal getPosIni() {
        return this.getVo().asBigDecimal("POSINI");
   }

   public void setPosIni(BigDecimal posIni) {
        markAsChanged("POSINI", posIni);
   }

   public BigDecimal getQtdDec() {
        return this.getVo().asBigDecimal("QTDDEC");
   }

   public void setQtdDec(BigDecimal qtdDec) {
        markAsChanged("QTDDEC", qtdDec);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getTamanho() {
        return this.getVo().asBigDecimal("TAMANHO");
   }

   public void setTamanho(BigDecimal tamanho) {
        markAsChanged("TAMANHO", tamanho);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TSIIRE";
   }

   @Override
   public String getEntityName() {
        return "ItemRemessa";
   }

   @Override
   public ItemRemessa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
