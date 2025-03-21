package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDDestinatarioMensagem extends AbstractSankhyaEntity<MSDDestinatarioMensagem> {
   private BigDecimal codCon;
   private BigDecimal codMsg;
   private BigDecimal intMin;
   private Timestamp ultEnvio;

   public BigDecimal getCodCon() {
        return codCon;
   }

   public void setCodCon(BigDecimal codCon) {
        markAsChanged("CODCON", codCon);
        this.codCon = codCon;
   }

   public BigDecimal getCodMsg() {
        return codMsg;
   }

   public void setCodMsg(BigDecimal codMsg) {
        markAsChanged("CODMSG", codMsg);
        this.codMsg = codMsg;
   }

   public BigDecimal getIntMin() {
        return intMin;
   }

   public void setIntMin(BigDecimal intMin) {
        markAsChanged("INTMIN", intMin);
        this.intMin = intMin;
   }

   public Timestamp getUltEnvio() {
        return ultEnvio;
   }

   public void setUltEnvio(Timestamp ultEnvio) {
        markAsChanged("ULTENVIO", ultEnvio);
        this.ultEnvio = ultEnvio;
   }

   @Override
   public String getTableName() {
        return "TMDDMG";
   }

   @Override
   public String getEntityName() {
        return "MSDDestinatarioMensagem";
   }

   @Override
   public MSDDestinatarioMensagem fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codCon = vo.asBigDecimal("CODCON");
        this.codMsg = vo.asBigDecimal("CODMSG");
        this.intMin = vo.asBigDecimal("INTMIN");
        this.ultEnvio = vo.asTimestamp("ULTENVIO");
        return this;
   }
}
