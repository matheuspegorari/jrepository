package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Pais extends AbstractSankhyaEntity<Pais> {
   private String abreviatura;
   private BigDecimal codPais;
   private BigDecimal codPaisFis;
   private String descricao;
   private String timNacionalidad;

   public String getAbreviatura() {
        return abreviatura;
   }

   public void setAbreviatura(String abreviatura) {
        markAsChanged("ABREVIATURA", abreviatura);
        this.abreviatura = abreviatura;
   }

   public BigDecimal getCodPais() {
        return codPais;
   }

   public void setCodPais(BigDecimal codPais) {
        markAsChanged("CODPAIS", codPais);
        this.codPais = codPais;
   }

   public BigDecimal getCodPaisFis() {
        return codPaisFis;
   }

   public void setCodPaisFis(BigDecimal codPaisFis) {
        markAsChanged("CODPAISFIS", codPaisFis);
        this.codPaisFis = codPaisFis;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getTimNacionalidad() {
        return timNacionalidad;
   }

   public void setTimNacionalidad(String timNacionalidad) {
        markAsChanged("TIMNACIONALIDAD", timNacionalidad);
        this.timNacionalidad = timNacionalidad;
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
        this.abreviatura = vo.asString("ABREVIATURA");
        this.codPais = vo.asBigDecimal("CODPAIS");
        this.codPaisFis = vo.asBigDecimal("CODPAISFIS");
        this.descricao = vo.asString("DESCRICAO");
        this.timNacionalidad = vo.asString("TIMNACIONALIDAD");
        return this;
   }
}
