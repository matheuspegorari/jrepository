package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class MensagemConsultaSerasa implements SankhyaEntity<MensagemConsultaSerasa> {

   private BigDecimal nuConsulta;
   private String msg;
   private BigDecimal codMsg;
   private String codOpcao;

   public BigDecimal getNuConsulta() {
        return nuConsulta;
   }

   public void setNuConsulta(BigDecimal nuConsulta) {
        this.nuConsulta = nuConsulta;
   }

   public String getMsg() {
        return msg;
   }

   public void setMsg(String msg) {
        this.msg = msg;
   }

   public BigDecimal getCodMsg() {
        return codMsg;
   }

   public void setCodMsg(BigDecimal codMsg) {
        this.codMsg = codMsg;
   }

   public String getCodOpcao() {
        return codOpcao;
   }

   public void setCodOpcao(String codOpcao) {
        this.codOpcao = codOpcao;
   }

   @Override
   public String getEntityName() {
        return "MensagemConsultaSerasa";
   }

   @Override
   public MensagemConsultaSerasa fromVO(DynamicVO vo) {
        this.nuConsulta = vo.asBigDecimal("NUCONSULTA");
        this.msg = vo.asString("MSG");
        this.codMsg = vo.asBigDecimal("CODMSG");
        this.codOpcao = vo.asString("CODOPCAO");
        return this;
   }
}
