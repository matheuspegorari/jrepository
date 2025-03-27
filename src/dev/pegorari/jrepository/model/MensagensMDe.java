package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MensagensMDe extends AbstractSankhyaEntity<MensagensMDe> {
   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getChaveAcesso() {
        return this.getVo().asString("CHAVEACESSO");
   }

   public void setChaveAcesso(String chaveAcesso) {
        markAsChanged("CHAVEACESSO", chaveAcesso);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getStatusResp() {
        return this.getVo().asBigDecimal("STATUSRESP");
   }

   public void setStatusResp(BigDecimal statusResp) {
        markAsChanged("STATUSRESP", statusResp);
   }

   public Timestamp getDhResp() {
        return this.getVo().asTimestamp("DHRESP");
   }

   public void setDhResp(Timestamp dhResp) {
        markAsChanged("DHRESP", dhResp);
   }

   public String getMotivoResp() {
        return this.getVo().asString("MOTIVORESP");
   }

   public void setMotivoResp(String motivoResp) {
        markAsChanged("MOTIVORESP", motivoResp);
   }

   @Override
   public String getTableName() {
        return "TGFMDEMSGS";
   }

   @Override
   public String getEntityName() {
        return "MensagensMDe";
   }

   @Override
   public MensagensMDe fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
