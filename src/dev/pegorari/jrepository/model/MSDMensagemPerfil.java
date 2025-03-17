package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class MSDMensagemPerfil implements SankhyaEntity<MSDMensagemPerfil> {

   private BigDecimal codMsg;
   private BigDecimal codPer;

   public BigDecimal getCodMsg() {
        return codMsg;
   }

   public void setCodMsg(BigDecimal codMsg) {
        this.codMsg = codMsg;
   }

   public BigDecimal getCodPer() {
        return codPer;
   }

   public void setCodPer(BigDecimal codPer) {
        this.codPer = codPer;
   }

   @Override
   public String getEntityName() {
        return "MSDMensagemPerfil";
   }

   @Override
   public MSDMensagemPerfil fromVO(DynamicVO vo) {
        this.codMsg = vo.asBigDecimal("CODMSG");
        this.codPer = vo.asBigDecimal("CODPER");
        return this;
   }
}
