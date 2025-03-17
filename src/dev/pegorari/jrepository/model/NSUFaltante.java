package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NSUFaltante implements SankhyaEntity<NSUFaltante> {

   private BigDecimal codEmp;
   private String tipo;
   private String nsu;
   private Timestamp dhInc;
   private Timestamp dhLimConsulta;
   private BigDecimal codUsu;
   private String localizado;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getNsu() {
        return nsu;
   }

   public void setNsu(String nsu) {
        this.nsu = nsu;
   }

   public Timestamp getDhInc() {
        return dhInc;
   }

   public void setDhInc(Timestamp dhInc) {
        this.dhInc = dhInc;
   }

   public Timestamp getDhLimConsulta() {
        return dhLimConsulta;
   }

   public void setDhLimConsulta(Timestamp dhLimConsulta) {
        this.dhLimConsulta = dhLimConsulta;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getLocalizado() {
        return localizado;
   }

   public void setLocalizado(String localizado) {
        this.localizado = localizado;
   }

   @Override
   public String getEntityName() {
        return "NSUFaltante";
   }

   @Override
   public NSUFaltante fromVO(DynamicVO vo) {
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.tipo = vo.asString("TIPO");
        this.nsu = vo.asString("NSU");
        this.dhInc = vo.asTimestamp("DHINC");
        this.dhLimConsulta = vo.asTimestamp("DHLIMCONSULTA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.localizado = vo.asString("LOCALIZADO");
        return this;
   }
}
