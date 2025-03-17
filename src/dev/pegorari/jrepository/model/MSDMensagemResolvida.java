package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDMensagemResolvida implements SankhyaEntity<MSDMensagemResolvida> {

   private BigDecimal codMsg;
   private Timestamp dtAlter;
   private char[] mensagem;
   private BigDecimal nova;

   public BigDecimal getCodMsg() {
        return codMsg;
   }

   public void setCodMsg(BigDecimal codMsg) {
        this.codMsg = codMsg;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public char[] getMensagem() {
        return mensagem;
   }

   public void setMensagem(char[] mensagem) {
        this.mensagem = mensagem;
   }

   public BigDecimal getNova() {
        return nova;
   }

   public void setNova(BigDecimal nova) {
        this.nova = nova;
   }

   @Override
   public String getEntityName() {
        return "MSDMensagemResolvida";
   }

   @Override
   public MSDMensagemResolvida fromVO(DynamicVO vo) {
        this.codMsg = vo.asBigDecimal("CODMSG");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.mensagem = vo.asClob("MENSAGEM");
        this.nova = vo.asBigDecimal("NOVA");
        return this;
   }
}
