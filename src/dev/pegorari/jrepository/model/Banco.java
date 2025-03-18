package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Banco extends AbstractSankhyaEntity<Banco> {
   private String abreviatura;
   private BigDecimal codBco;
   private String nomeBco;
   private BigDecimal ctaCmc7Ini;
   private BigDecimal ctaCmc7Fim;

   public String getAbreviatura() {
        return abreviatura;
   }

   public void setAbreviatura(String abreviatura) {
        markAsChanged("ABREVIATURA", abreviatura);
        this.abreviatura = abreviatura;
   }

   public BigDecimal getCodBco() {
        return codBco;
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
        this.codBco = codBco;
   }

   public String getNomeBco() {
        return nomeBco;
   }

   public void setNomeBco(String nomeBco) {
        markAsChanged("NOMEBCO", nomeBco);
        this.nomeBco = nomeBco;
   }

   public BigDecimal getCtaCmc7Ini() {
        return ctaCmc7Ini;
   }

   public void setCtaCmc7Ini(BigDecimal ctaCmc7Ini) {
        markAsChanged("CTACMC7INI", ctaCmc7Ini);
        this.ctaCmc7Ini = ctaCmc7Ini;
   }

   public BigDecimal getCtaCmc7Fim() {
        return ctaCmc7Fim;
   }

   public void setCtaCmc7Fim(BigDecimal ctaCmc7Fim) {
        markAsChanged("CTACMC7FIM", ctaCmc7Fim);
        this.ctaCmc7Fim = ctaCmc7Fim;
   }

   @Override
   public String getTableName() {
        return "TSIBCO";
   }

   @Override
   public String getEntityName() {
        return "Banco";
   }

   @Override
   public Banco fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.abreviatura = vo.asString("ABREVIATURA");
        this.codBco = vo.asBigDecimal("CODBCO");
        this.nomeBco = vo.asString("NOMEBCO");
        this.ctaCmc7Ini = vo.asBigDecimal("CTACMC7INI");
        this.ctaCmc7Fim = vo.asBigDecimal("CTACMC7FIM");
        return this;
   }
}
