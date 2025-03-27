package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EstruturaLote extends AbstractSankhyaEntity<EstruturaLote> {
   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getLista() {
        return this.getVo().asString("LISTA");
   }

   public void setLista(String lista) {
        markAsChanged("LISTA", lista);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
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

   public String getTitulo() {
        return this.getVo().asString("TITULO");
   }

   public void setTitulo(String titulo) {
        markAsChanged("TITULO", titulo);
   }

   @Override
   public String getTableName() {
        return "TCIEST";
   }

   @Override
   public String getEntityName() {
        return "EstruturaLote";
   }

   @Override
   public EstruturaLote fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
