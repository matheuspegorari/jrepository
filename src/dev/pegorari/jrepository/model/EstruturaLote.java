package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class EstruturaLote implements SankhyaEntity<EstruturaLote> {

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
        this.codProd = codProd;
   }

   public String getLista() {
        return lista;
   }

   public void setLista(String lista) {
        this.lista = lista;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public BigDecimal getTamanho() {
        return tamanho;
   }

   public void setTamanho(BigDecimal tamanho) {
        this.tamanho = tamanho;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getTitulo() {
        return titulo;
   }

   public void setTitulo(String titulo) {
        this.titulo = titulo;
   }

   @Override
   public String getEntityName() {
        return "EstruturaLote";
   }

   @Override
   public EstruturaLote fromVO(DynamicVO vo) {
        this.codProd = vo.asBigDecimal("CODPROD");
        this.lista = vo.asString("LISTA");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.tamanho = vo.asBigDecimal("TAMANHO");
        this.tipo = vo.asString("TIPO");
        this.titulo = vo.asString("TITULO");
        return this;
   }
}
