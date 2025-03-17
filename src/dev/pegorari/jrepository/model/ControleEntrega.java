package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ControleEntrega extends AbstractSankhyaEntity<ControleEntrega> {
   private BigDecimal codParc;
   private BigDecimal codReg;
   private BigDecimal codVend;
   private BigDecimal seqVisita;
   private String tipo;
   private BigDecimal valor;

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodReg() {
        return codReg;
   }

   public void setCodReg(BigDecimal codReg) {
        this.codReg = codReg;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        this.codVend = codVend;
   }

   public BigDecimal getSeqVisita() {
        return seqVisita;
   }

   public void setSeqVisita(BigDecimal seqVisita) {
        this.seqVisita = seqVisita;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        this.valor = valor;
   }

   @Override
   public String getTableName() {
        return "TGFVIS";
   }

   @Override
   public String getEntityName() {
        return "ControleEntrega";
   }

   @Override
   public ControleEntrega fromVO(DynamicVO vo) {
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codReg = vo.asBigDecimal("CODREG");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.seqVisita = vo.asBigDecimal("SEQVISITA");
        this.tipo = vo.asString("TIPO");
        this.valor = vo.asBigDecimal("VALOR");
        return this;
   }
}
