package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class Pais implements SankhyaEntity<Pais> {

   private String abreviatura;
   private BigDecimal codPais;
   private BigDecimal codPaisFis;
   private String descricao;
   private String timNacionalidad;

   public String getAbreviatura() {
        return abreviatura;
   }

   public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
   }

   public BigDecimal getCodPais() {
        return codPais;
   }

   public void setCodPais(BigDecimal codPais) {
        this.codPais = codPais;
   }

   public BigDecimal getCodPaisFis() {
        return codPaisFis;
   }

   public void setCodPaisFis(BigDecimal codPaisFis) {
        this.codPaisFis = codPaisFis;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getTimNacionalidad() {
        return timNacionalidad;
   }

   public void setTimNacionalidad(String timNacionalidad) {
        this.timNacionalidad = timNacionalidad;
   }

   @Override
   public String getEntityName() {
        return "Pais";
   }

   @Override
   public Pais fromVO(DynamicVO vo) {
        this.abreviatura = vo.asString("ABREVIATURA");
        this.codPais = vo.asBigDecimal("CODPAIS");
        this.codPaisFis = vo.asBigDecimal("CODPAISFIS");
        this.descricao = vo.asString("DESCRICAO");
        this.timNacionalidad = vo.asString("TIMNACIONALIDAD");
        return this;
   }
}
