package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class HistoricoBancario extends AbstractSankhyaEntity<HistoricoBancario> {
   public String getAceitaDev() {
        return this.getVo().asString("ACEITADEV");
   }

   public void setAceitaDev(String aceitaDev) {
        markAsChanged("ACEITADEV", aceitaDev);
   }

   public BigDecimal getCodLanc() {
        return this.getVo().asBigDecimal("CODLANC");
   }

   public void setCodLanc(BigDecimal codLanc) {
        markAsChanged("CODLANC", codLanc);
   }

   public String getDescrLancBco() {
        return this.getVo().asString("DESCRLANCBCO");
   }

   public void setDescrLancBco(String descrLancBco) {
        markAsChanged("DESCRLANCBCO", descrLancBco);
   }

   public BigDecimal getTipLanc() {
        return this.getVo().asBigDecimal("TIPLANC");
   }

   public void setTipLanc(BigDecimal tipLanc) {
        markAsChanged("TIPLANC", tipLanc);
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
        this.setVo(vo);
        return this;
   }
}
