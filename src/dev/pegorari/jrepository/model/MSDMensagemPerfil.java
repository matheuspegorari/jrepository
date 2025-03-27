package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MSDMensagemPerfil extends AbstractSankhyaEntity<MSDMensagemPerfil> {
   public BigDecimal getCodMsg() {
        return this.getVo().asBigDecimal("CODMSG");
   }

   public void setCodMsg(BigDecimal codMsg) {
        markAsChanged("CODMSG", codMsg);
   }

   public BigDecimal getCodPer() {
        return this.getVo().asBigDecimal("CODPER");
   }

   public void setCodPer(BigDecimal codPer) {
        markAsChanged("CODPER", codPer);
   }

   @Override
   public String getTableName() {
        return "TMDMPE";
   }

   @Override
   public String getEntityName() {
        return "MSDMensagemPerfil";
   }

   @Override
   public MSDMensagemPerfil fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
