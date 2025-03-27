package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDMensagemResolvida extends AbstractSankhyaEntity<MSDMensagemResolvida> {
   public BigDecimal getCodMsg() {
        return this.getVo().asBigDecimal("CODMSG");
   }

   public void setCodMsg(BigDecimal codMsg) {
        markAsChanged("CODMSG", codMsg);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public char[] getMensagem() {
        return this.getVo().asClob("MENSAGEM");
   }

   public void setMensagem(char[] mensagem) {
        markAsChanged("MENSAGEM", mensagem);
   }

   public BigDecimal getNova() {
        return this.getVo().asBigDecimal("NOVA");
   }

   public void setNova(BigDecimal nova) {
        markAsChanged("NOVA", nova);
   }

   @Override
   public String getTableName() {
        return "TMDMSR";
   }

   @Override
   public String getEntityName() {
        return "MSDMensagemResolvida";
   }

   @Override
   public MSDMensagemResolvida fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
