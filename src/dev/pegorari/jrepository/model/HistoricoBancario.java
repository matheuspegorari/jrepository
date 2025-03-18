package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class HistoricoBancario extends AbstractSankhyaEntity<HistoricoBancario> {
   private String aceitaDev;
   private BigDecimal codLanc;
   private String descrLancBco;
   private BigDecimal tipLanc;

   public String getAceitaDev() {
        return aceitaDev;
   }

   public void setAceitaDev(String aceitaDev) {
        markAsChanged("ACEITADEV", aceitaDev);
        this.aceitaDev = aceitaDev;
   }

   public BigDecimal getCodLanc() {
        return codLanc;
   }

   public void setCodLanc(BigDecimal codLanc) {
        markAsChanged("CODLANC", codLanc);
        this.codLanc = codLanc;
   }

   public String getDescrLancBco() {
        return descrLancBco;
   }

   public void setDescrLancBco(String descrLancBco) {
        markAsChanged("DESCRLANCBCO", descrLancBco);
        this.descrLancBco = descrLancBco;
   }

   public BigDecimal getTipLanc() {
        return tipLanc;
   }

   public void setTipLanc(BigDecimal tipLanc) {
        markAsChanged("TIPLANC", tipLanc);
        this.tipLanc = tipLanc;
   }

   @Override
   public String getTableName() {
        return "TGFHBC";
   }

   @Override
   public String getEntityName() {
        return "HistoricoBancario";
   }

   @Override
   public HistoricoBancario fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.aceitaDev = vo.asString("ACEITADEV");
        this.codLanc = vo.asBigDecimal("CODLANC");
        this.descrLancBco = vo.asString("DESCRLANCBCO");
        this.tipLanc = vo.asBigDecimal("TIPLANC");
        return this;
   }
}
