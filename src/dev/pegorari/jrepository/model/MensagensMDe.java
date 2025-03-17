package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MensagensMDe implements SankhyaEntity<MensagensMDe> {

   private BigDecimal sequencia;
   private String chaveAcesso;
   private BigDecimal codEmp;
   private BigDecimal statusResp;
   private Timestamp dhResp;
   private String motivoResp;

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getChaveAcesso() {
        return chaveAcesso;
   }

   public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getStatusResp() {
        return statusResp;
   }

   public void setStatusResp(BigDecimal statusResp) {
        this.statusResp = statusResp;
   }

   public Timestamp getDhResp() {
        return dhResp;
   }

   public void setDhResp(Timestamp dhResp) {
        this.dhResp = dhResp;
   }

   public String getMotivoResp() {
        return motivoResp;
   }

   public void setMotivoResp(String motivoResp) {
        this.motivoResp = motivoResp;
   }

   @Override
   public String getEntityName() {
        return "MensagensMDe";
   }

   @Override
   public MensagensMDe fromVO(DynamicVO vo) {
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.chaveAcesso = vo.asString("CHAVEACESSO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.statusResp = vo.asBigDecimal("STATUSRESP");
        this.dhResp = vo.asTimestamp("DHRESP");
        this.motivoResp = vo.asString("MOTIVORESP");
        return this;
   }
}
