package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MensagemConsultaSerasa extends AbstractSankhyaEntity<MensagemConsultaSerasa> {
   private BigDecimal nuConsulta;
   private String msg;
   private BigDecimal codMsg;
   private String codOpcao;

   public BigDecimal getNuConsulta() {
        return nuConsulta;
   }

   public void setNuConsulta(BigDecimal nuConsulta) {
        markAsChanged("NUCONSULTA", nuConsulta);
        this.nuConsulta = nuConsulta;
   }

   public String getMsg() {
        return msg;
   }

   public void setMsg(String msg) {
        markAsChanged("MSG", msg);
        this.msg = msg;
   }

   public BigDecimal getCodMsg() {
        return codMsg;
   }

   public void setCodMsg(BigDecimal codMsg) {
        markAsChanged("CODMSG", codMsg);
        this.codMsg = codMsg;
   }

   public String getCodOpcao() {
        return codOpcao;
   }

   public void setCodOpcao(String codOpcao) {
        markAsChanged("CODOPCAO", codOpcao);
        this.codOpcao = codOpcao;
   }

   @Override
   public String getTableName() {
        return "TSERMSGCONS";
   }

   @Override
   public String getEntityName() {
        return "MensagemConsultaSerasa";
   }

   @Override
   public MensagemConsultaSerasa fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.nuConsulta = vo.asBigDecimal("NUCONSULTA");
        this.msg = vo.asString("MSG");
        this.codMsg = vo.asBigDecimal("CODMSG");
        this.codOpcao = vo.asString("CODOPCAO");
        return this;
   }
}
