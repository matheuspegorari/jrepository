package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ControleEntrega extends AbstractSankhyaEntity<ControleEntrega> {
   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodReg() {
        return this.getVo().asBigDecimal("CODREG");
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public BigDecimal getSeqVisita() {
        return this.getVo().asBigDecimal("SEQVISITA");
   }

   public void setSeqVisita(BigDecimal seqVisita) {
        markAsChanged("SEQVISITA", seqVisita);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
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
        this.setVo(vo);
        return this;
   }
}
