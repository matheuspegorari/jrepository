package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class GadgetBiaParametro extends AbstractSankhyaEntity<GadgetBiaParametro> {
   public BigDecimal getVlrDec() {
        return this.getVo().asBigDecimal("VLRDEC");
   }

   public void setVlrDec(BigDecimal vlrDec) {
        markAsChanged("VLRDEC", vlrDec);
   }

   public String getVlrTxt() {
        return this.getVo().asString("VLRTXT");
   }

   public void setVlrTxt(String vlrTxt) {
        markAsChanged("VLRTXT", vlrTxt);
   }

   public String getChave() {
        return this.getVo().asString("CHAVE");
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
   }

   public BigDecimal getCodGbi() {
        return this.getVo().asBigDecimal("CODGBI");
   }

   public void setCodGbi(BigDecimal codGbi) {
        markAsChanged("CODGBI", codGbi);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public Timestamp getVlrDat() {
        return this.getVo().asTimestamp("VLRDAT");
   }

   public void setVlrDat(Timestamp vlrDat) {
        markAsChanged("VLRDAT", vlrDat);
   }

   @Override
   public String getTableName() {
        return "TSIGBP";
   }

   @Override
   public String getEntityName() {
        return "GadgetBiaParametro";
   }

   @Override
   public GadgetBiaParametro fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
