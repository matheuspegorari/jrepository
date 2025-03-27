package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NSUFaltante extends AbstractSankhyaEntity<NSUFaltante> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getNsu() {
        return this.getVo().asString("NSU");
   }

   public void setNsu(String nsu) {
        markAsChanged("NSU", nsu);
   }

   public Timestamp getDhInc() {
        return this.getVo().asTimestamp("DHINC");
   }

   public void setDhInc(Timestamp dhInc) {
        markAsChanged("DHINC", dhInc);
   }

   public Timestamp getDhLimConsulta() {
        return this.getVo().asTimestamp("DHLIMCONSULTA");
   }

   public void setDhLimConsulta(Timestamp dhLimConsulta) {
        markAsChanged("DHLIMCONSULTA", dhLimConsulta);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getLocalizado() {
        return this.getVo().asString("LOCALIZADO");
   }

   public void setLocalizado(String localizado) {
        markAsChanged("LOCALIZADO", localizado);
   }

   @Override
   public String getTableName() {
        return "TGFNSUF";
   }

   @Override
   public String getEntityName() {
        return "NSUFaltante";
   }

   @Override
   public NSUFaltante fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
