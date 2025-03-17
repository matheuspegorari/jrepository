package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class HistoricoBancario implements SankhyaEntity<HistoricoBancario> {

   private String aceitaDev;
   private BigDecimal codLanc;
   private String descrLancBco;
   private BigDecimal tipLanc;

   public String getAceitaDev() {
        return aceitaDev;
   }

   public void setAceitaDev(String aceitaDev) {
        this.aceitaDev = aceitaDev;
   }

   public BigDecimal getCodLanc() {
        return codLanc;
   }

   public void setCodLanc(BigDecimal codLanc) {
        this.codLanc = codLanc;
   }

   public String getDescrLancBco() {
        return descrLancBco;
   }

   public void setDescrLancBco(String descrLancBco) {
        this.descrLancBco = descrLancBco;
   }

   public BigDecimal getTipLanc() {
        return tipLanc;
   }

   public void setTipLanc(BigDecimal tipLanc) {
        this.tipLanc = tipLanc;
   }

   @Override
   public String getEntityName() {
        return "HistoricoBancario";
   }

   @Override
   public HistoricoBancario fromVO(DynamicVO vo) {
        this.aceitaDev = vo.asString("ACEITADEV");
        this.codLanc = vo.asBigDecimal("CODLANC");
        this.descrLancBco = vo.asString("DESCRLANCBCO");
        this.tipLanc = vo.asBigDecimal("TIPLANC");
        return this;
   }
}
