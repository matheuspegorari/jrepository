package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MensagemConsultaSerasa extends AbstractSankhyaEntity<MensagemConsultaSerasa> {
   public BigDecimal getNuConsulta() {
        return this.getVo().asBigDecimal("NUCONSULTA");
   }

   public void setNuConsulta(BigDecimal nuConsulta) {
        markAsChanged("NUCONSULTA", nuConsulta);
   }

   public String getMsg() {
        return this.getVo().asString("MSG");
   }

   public void setMsg(String msg) {
        markAsChanged("MSG", msg);
   }

   public BigDecimal getCodMsg() {
        return this.getVo().asBigDecimal("CODMSG");
   }

   public void setCodMsg(BigDecimal codMsg) {
        markAsChanged("CODMSG", codMsg);
   }

   public String getCodOpcao() {
        return this.getVo().asString("CODOPCAO");
   }

   public void setCodOpcao(String codOpcao) {
        markAsChanged("CODOPCAO", codOpcao);
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
        this.setVo(vo);
        return this;
   }
}
