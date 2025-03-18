package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDMensagemResolvida extends AbstractSankhyaEntity<MSDMensagemResolvida> {
   private BigDecimal codMsg;
   private Timestamp dtAlter;
   private char[] mensagem;
   private BigDecimal nova;

   public BigDecimal getCodMsg() {
        return codMsg;
   }

   public void setCodMsg(BigDecimal codMsg) {
        markAsChanged("CODMSG", codMsg);
        this.codMsg = codMsg;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public char[] getMensagem() {
        return mensagem;
   }

   public void setMensagem(char[] mensagem) {
        markAsChanged("MENSAGEM", mensagem);
        this.mensagem = mensagem;
   }

   public BigDecimal getNova() {
        return nova;
   }

   public void setNova(BigDecimal nova) {
        markAsChanged("NOVA", nova);
        this.nova = nova;
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
        this.setOriginalVO(vo);
        this.codMsg = vo.asBigDecimal("CODMSG");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.mensagem = vo.asClob("MENSAGEM");
        this.nova = vo.asBigDecimal("NOVA");
        return this;
   }
}
