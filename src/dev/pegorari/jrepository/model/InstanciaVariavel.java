package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InstanciaVariavel extends AbstractSankhyaEntity<InstanciaVariavel> {
   private Timestamp dta;
   private BigDecimal idInstPrn;
   private BigDecimal idInstTar;
   private String nome;
   private BigDecimal numDec;
   private BigDecimal numInt;
   private String texto;
   private String textoLongo;
   private String tipo;

   public Timestamp getDta() {
        return dta;
   }

   public void setDta(Timestamp dta) {
        this.dta = dta;
   }

   public BigDecimal getIdInstPrn() {
        return idInstPrn;
   }

   public void setIdInstPrn(BigDecimal idInstPrn) {
        this.idInstPrn = idInstPrn;
   }

   public BigDecimal getIdInstTar() {
        return idInstTar;
   }

   public void setIdInstTar(BigDecimal idInstTar) {
        this.idInstTar = idInstTar;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        this.nome = nome;
   }

   public BigDecimal getNumDec() {
        return numDec;
   }

   public void setNumDec(BigDecimal numDec) {
        this.numDec = numDec;
   }

   public BigDecimal getNumInt() {
        return numInt;
   }

   public void setNumInt(BigDecimal numInt) {
        this.numInt = numInt;
   }

   public String getTexto() {
        return texto;
   }

   public void setTexto(String texto) {
        this.texto = texto;
   }

   public String getTextoLongo() {
        return textoLongo;
   }

   public void setTextoLongo(String textoLongo) {
        this.textoLongo = textoLongo;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getTableName() {
        return "TWFIVAR";
   }

   @Override
   public String getEntityName() {
        return "InstanciaVariavel";
   }

   @Override
   public InstanciaVariavel fromVO(DynamicVO vo) {
        this.dta = vo.asTimestamp("DTA");
        this.idInstPrn = vo.asBigDecimal("IDINSTPRN");
        this.idInstTar = vo.asBigDecimal("IDINSTTAR");
        this.nome = vo.asString("NOME");
        this.numDec = vo.asBigDecimal("NUMDEC");
        this.numInt = vo.asBigDecimal("NUMINT");
        this.texto = vo.asString("TEXTO");
        this.textoLongo = vo.asString("TEXTOLONGO");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
