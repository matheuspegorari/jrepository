package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class GadgetBiaParametro implements SankhyaEntity<GadgetBiaParametro> {

   private BigDecimal vlrDec;
   private String vlrTxt;
   private String chave;
   private BigDecimal codGbi;
   private String tipo;
   private Timestamp vlrDat;

   public BigDecimal getVlrDec() {
        return vlrDec;
   }

   public void setVlrDec(BigDecimal vlrDec) {
        this.vlrDec = vlrDec;
   }

   public String getVlrTxt() {
        return vlrTxt;
   }

   public void setVlrTxt(String vlrTxt) {
        this.vlrTxt = vlrTxt;
   }

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        this.chave = chave;
   }

   public BigDecimal getCodGbi() {
        return codGbi;
   }

   public void setCodGbi(BigDecimal codGbi) {
        this.codGbi = codGbi;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public Timestamp getVlrDat() {
        return vlrDat;
   }

   public void setVlrDat(Timestamp vlrDat) {
        this.vlrDat = vlrDat;
   }

   @Override
   public String getEntityName() {
        return "GadgetBiaParametro";
   }

   @Override
   public GadgetBiaParametro fromVO(DynamicVO vo) {
        this.vlrDec = vo.asBigDecimal("VLRDEC");
        this.vlrTxt = vo.asString("VLRTXT");
        this.chave = vo.asString("CHAVE");
        this.codGbi = vo.asBigDecimal("CODGBI");
        this.tipo = vo.asString("TIPO");
        this.vlrDat = vo.asTimestamp("VLRDAT");
        return this;
   }
}
