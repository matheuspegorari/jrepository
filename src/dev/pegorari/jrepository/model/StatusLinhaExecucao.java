package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class StatusLinhaExecucao extends AbstractSankhyaEntity<StatusLinhaExecucao> {
   public BigDecimal getIdAtvStatusNormal() {
        return this.getVo().asBigDecimal("IDATVSTATUSNORMAL");
   }

   public void setIdAtvStatusNormal(BigDecimal idAtvStatusNormal) {
        markAsChanged("IDATVSTATUSNORMAL", idAtvStatusNormal);
   }

   public String getIdExecWflow() {
        return this.getVo().asString("IDEXECWFLOW");
   }

   public void setIdExecWflow(String idExecWflow) {
        markAsChanged("IDEXECWFLOW", idExecWflow);
   }

   public String getStatusExec() {
        return this.getVo().asString("STATUSEXEC");
   }

   public void setStatusExec(String statusExec) {
        markAsChanged("STATUSEXEC", statusExec);
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
        this.setVo(vo);
        return this;
   }
}
