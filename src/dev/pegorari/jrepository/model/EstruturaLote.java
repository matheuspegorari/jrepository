package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EstruturaLote extends AbstractSankhyaEntity<EstruturaLote> {
   private BigDecimal codProd;
   private String lista;
   private BigDecimal ordem;
   private BigDecimal tamanho;
   private String tipo;
   private String titulo;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getLista() {
        return lista;
   }

   public void setLista(String lista) {
        markAsChanged("LISTA", lista);
        this.lista = lista;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
        this.ordem = ordem;
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

   public String getTitulo() {
        return titulo;
   }

   public void setTitulo(String titulo) {
        markAsChanged("TITULO", titulo);
        this.titulo = titulo;
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
        this.setOriginalVO(vo);
        this.codProd = vo.asBigDecimal("CODPROD");
        this.lista = vo.asString("LISTA");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.tamanho = vo.asBigDecimal("TAMANHO");
        this.tipo = vo.asString("TIPO");
        this.titulo = vo.asString("TITULO");
        return this;
   }
}
