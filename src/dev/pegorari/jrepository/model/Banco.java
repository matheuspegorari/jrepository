package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Banco extends AbstractSankhyaEntity<Banco> {
   public String getAbreviatura() {
        return this.getVo().asString("ABREVIATURA");
   }

   public void setAbreviatura(String abreviatura) {
        markAsChanged("ABREVIATURA", abreviatura);
   }

   public BigDecimal getCodBco() {
        return this.getVo().asBigDecimal("CODBCO");
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
   }

   public String getNomeBco() {
        return this.getVo().asString("NOMEBCO");
   }

   public void setNomeBco(String nomeBco) {
        markAsChanged("NOMEBCO", nomeBco);
   }

   public BigDecimal getCtaCmc7Ini() {
        return this.getVo().asBigDecimal("CTACMC7INI");
   }

   public void setCtaCmc7Ini(BigDecimal ctaCmc7Ini) {
        markAsChanged("CTACMC7INI", ctaCmc7Ini);
   }

   public BigDecimal getCtaCmc7Fim() {
        return this.getVo().asBigDecimal("CTACMC7FIM");
   }

   public void setCtaCmc7Fim(BigDecimal ctaCmc7Fim) {
        markAsChanged("CTACMC7FIM", ctaCmc7Fim);
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
        this.setVo(vo);
        return this;
   }
}
