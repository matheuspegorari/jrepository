package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class StatusLinhaExecucao extends AbstractSankhyaEntity<StatusLinhaExecucao> {
   private BigDecimal idAtvStatusNormal;
   private String idExecWflow;
   private String statusExec;

   public BigDecimal getIdAtvStatusNormal() {
        return idAtvStatusNormal;
   }

   public void setIdAtvStatusNormal(BigDecimal idAtvStatusNormal) {
        markAsChanged("IDATVSTATUSNORMAL", idAtvStatusNormal);
        this.idAtvStatusNormal = idAtvStatusNormal;
   }

   public String getIdExecWflow() {
        return idExecWflow;
   }

   public void setIdExecWflow(String idExecWflow) {
        markAsChanged("IDEXECWFLOW", idExecWflow);
        this.idExecWflow = idExecWflow;
   }

   public String getStatusExec() {
        return statusExec;
   }

   public void setStatusExec(String statusExec) {
        markAsChanged("STATUSEXEC", statusExec);
        this.statusExec = statusExec;
   }

   @Override
   public String getTableName() {
        return "TPRSTE";
   }

   @Override
   public String getEntityName() {
        return "StatusLinhaExecucao";
   }

   @Override
   public StatusLinhaExecucao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.idAtvStatusNormal = vo.asBigDecimal("IDATVSTATUSNORMAL");
        this.idExecWflow = vo.asString("IDEXECWFLOW");
        this.statusExec = vo.asString("STATUSEXEC");
        return this;
   }
}
