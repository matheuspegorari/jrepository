package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemRemessa extends AbstractSankhyaEntity<ItemRemessa> {
   private String campo;
   private BigDecimal codigo;
   private String modulo;
   private BigDecimal posFim;
   private BigDecimal posIni;
   private BigDecimal qtdDec;
   private BigDecimal sequencia;
   private BigDecimal tamanho;
   private String tipo;

   public String getCampo() {
        return campo;
   }

   public void setCampo(String campo) {
        markAsChanged("CAMPO", campo);
        this.campo = campo;
   }

   public BigDecimal getCodigo() {
        return codigo;
   }

   public void setCodigo(BigDecimal codigo) {
        markAsChanged("CODIGO", codigo);
        this.codigo = codigo;
   }

   public String getModulo() {
        return modulo;
   }

   public void setModulo(String modulo) {
        markAsChanged("MODULO", modulo);
        this.modulo = modulo;
   }

   public BigDecimal getPosFim() {
        return posFim;
   }

   public void setPosFim(BigDecimal posFim) {
        markAsChanged("POSFIM", posFim);
        this.posFim = posFim;
   }

   public BigDecimal getPosIni() {
        return posIni;
   }

   public void setPosIni(BigDecimal posIni) {
        markAsChanged("POSINI", posIni);
        this.posIni = posIni;
   }

   public BigDecimal getQtdDec() {
        return qtdDec;
   }

   public void setQtdDec(BigDecimal qtdDec) {
        markAsChanged("QTDDEC", qtdDec);
        this.qtdDec = qtdDec;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getTamanho() {
        return tamanho;
   }

   public void setTamanho(BigDecimal tamanho) {
        markAsChanged("TAMANHO", tamanho);
        this.tamanho = tamanho;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
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
        this.campo = vo.asString("CAMPO");
        this.codigo = vo.asBigDecimal("CODIGO");
        this.modulo = vo.asString("MODULO");
        this.posFim = vo.asBigDecimal("POSFIM");
        this.posIni = vo.asBigDecimal("POSINI");
        this.qtdDec = vo.asBigDecimal("QTDDEC");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tamanho = vo.asBigDecimal("TAMANHO");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
