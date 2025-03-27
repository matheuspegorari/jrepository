package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Pais extends AbstractSankhyaEntity<Pais> {
   public String getAbreviatura() {
        return this.getVo().asString("ABREVIATURA");
   }

   public void setAbreviatura(String abreviatura) {
        markAsChanged("ABREVIATURA", abreviatura);
   }

   public BigDecimal getCodPais() {
        return this.getVo().asBigDecimal("CODPAIS");
   }

   public void setCodPais(BigDecimal codPais) {
        markAsChanged("CODPAIS", codPais);
   }

   public BigDecimal getCodPaisFis() {
        return this.getVo().asBigDecimal("CODPAISFIS");
   }

   public void setCodPaisFis(BigDecimal codPaisFis) {
        markAsChanged("CODPAISFIS", codPaisFis);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getTimNacionalidad() {
        return this.getVo().asString("TIMNACIONALIDAD");
   }

   public void setTimNacionalidad(String timNacionalidad) {
        markAsChanged("TIMNACIONALIDAD", timNacionalidad);
   }

   @Override
   public String getTableName() {
        return "TSIPAI";
   }

   @Override
   public String getEntityName() {
        return "Pais";
   }

   @Override
   public Pais fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
