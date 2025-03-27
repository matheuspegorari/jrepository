package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDDestinatarioMensagem extends AbstractSankhyaEntity<MSDDestinatarioMensagem> {
   public BigDecimal getCodCon() {
        return this.getVo().asBigDecimal("CODCON");
   }

   public void setCodCon(BigDecimal codCon) {
        markAsChanged("CODCON", codCon);
   }

   public BigDecimal getCodMsg() {
        return this.getVo().asBigDecimal("CODMSG");
   }

   public void setCodMsg(BigDecimal codMsg) {
        markAsChanged("CODMSG", codMsg);
   }

   public BigDecimal getIntMin() {
        return this.getVo().asBigDecimal("INTMIN");
   }

   public void setIntMin(BigDecimal intMin) {
        markAsChanged("INTMIN", intMin);
   }

   public Timestamp getUltEnvio() {
        return this.getVo().asTimestamp("ULTENVIO");
   }

   public void setUltEnvio(Timestamp ultEnvio) {
        markAsChanged("ULTENVIO", ultEnvio);
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
        this.setVo(vo);
        return this;
   }
}
