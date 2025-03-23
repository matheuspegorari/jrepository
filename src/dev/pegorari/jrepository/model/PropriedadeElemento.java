package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PropriedadeElemento extends AbstractSankhyaEntity<PropriedadeElemento> {
   private Timestamp datVal;
   private BigDecimal decVal;
   private BigDecimal ideFx;
   private BigDecimal intVal;
   private String nome;
   private String textVal;
   private String tipo;

   public Timestamp getDatVal() {
        return datVal;
   }

   public void setDatVal(Timestamp datVal) {
        markAsChanged("DATVAL", datVal);
        this.datVal = datVal;
   }

   public BigDecimal getDecVal() {
        return decVal;
   }

   public void setDecVal(BigDecimal decVal) {
        markAsChanged("DECVAL", decVal);
        this.decVal = decVal;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
        this.ideFx = ideFx;
   }

   public BigDecimal getIntVal() {
        return intVal;
   }

   public void setIntVal(BigDecimal intVal) {
        markAsChanged("INTVAL", intVal);
        this.intVal = intVal;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
        this.nome = nome;
   }

   public String getTextVal() {
        return textVal;
   }

   public void setTextVal(String textVal) {
        markAsChanged("TEXTVAL", textVal);
        this.textVal = textVal;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
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
        this.datVal = vo.asTimestamp("DATVAL");
        this.decVal = vo.asBigDecimal("DECVAL");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.intVal = vo.asBigDecimal("INTVAL");
        this.nome = vo.asString("NOME");
        this.textVal = vo.asString("TEXTVAL");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
