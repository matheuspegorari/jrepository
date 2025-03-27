package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InstanciaVariavel extends AbstractSankhyaEntity<InstanciaVariavel> {
   public Timestamp getDta() {
        return this.getVo().asTimestamp("DTA");
   }

   public void setDta(Timestamp dta) {
        markAsChanged("DTA", dta);
   }

   public BigDecimal getIdInstPrn() {
        return this.getVo().asBigDecimal("IDINSTPRN");
   }

   public void setIdInstPrn(BigDecimal idInstPrn) {
        markAsChanged("IDINSTPRN", idInstPrn);
   }

   public BigDecimal getIdInstTar() {
        return this.getVo().asBigDecimal("IDINSTTAR");
   }

   public void setIdInstTar(BigDecimal idInstTar) {
        markAsChanged("IDINSTTAR", idInstTar);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public BigDecimal getNumDec() {
        return this.getVo().asBigDecimal("NUMDEC");
   }

   public void setNumDec(BigDecimal numDec) {
        markAsChanged("NUMDEC", numDec);
   }

   public BigDecimal getNumInt() {
        return this.getVo().asBigDecimal("NUMINT");
   }

   public void setNumInt(BigDecimal numInt) {
        markAsChanged("NUMINT", numInt);
   }

   public String getTexto() {
        return this.getVo().asString("TEXTO");
   }

   public void setTexto(String texto) {
        markAsChanged("TEXTO", texto);
   }

   public String getTextoLongo() {
        return this.getVo().asString("TEXTOLONGO");
   }

   public void setTextoLongo(String textoLongo) {
        markAsChanged("TEXTOLONGO", textoLongo);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
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
        this.setVo(vo);
        return this;
   }
}
