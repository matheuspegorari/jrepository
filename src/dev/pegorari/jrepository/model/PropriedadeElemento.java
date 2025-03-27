package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PropriedadeElemento extends AbstractSankhyaEntity<PropriedadeElemento> {
   public Timestamp getDatVal() {
        return this.getVo().asTimestamp("DATVAL");
   }

   public void setDatVal(Timestamp datVal) {
        markAsChanged("DATVAL", datVal);
   }

   public BigDecimal getDecVal() {
        return this.getVo().asBigDecimal("DECVAL");
   }

   public void setDecVal(BigDecimal decVal) {
        markAsChanged("DECVAL", decVal);
   }

   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getIntVal() {
        return this.getVo().asBigDecimal("INTVAL");
   }

   public void setIntVal(BigDecimal intVal) {
        markAsChanged("INTVAL", intVal);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public String getTextVal() {
        return this.getVo().asString("TEXTVAL");
   }

   public void setTextVal(String textVal) {
        markAsChanged("TEXTVAL", textVal);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TPRPEFX";
   }

   @Override
   public String getEntityName() {
        return "PropriedadeElemento";
   }

   @Override
   public PropriedadeElemento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
