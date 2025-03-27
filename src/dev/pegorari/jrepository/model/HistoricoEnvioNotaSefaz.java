package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoEnvioNotaSefaz extends AbstractSankhyaEntity<HistoricoEnvioNotaSefaz> {
   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public Timestamp getDhExec() {
        return this.getVo().asTimestamp("DHEXEC");
   }

   public void setDhExec(Timestamp dhExec) {
        markAsChanged("DHEXEC", dhExec);
   }

   public BigDecimal getTipoServExec() {
        return this.getVo().asBigDecimal("TIPOSERVEXEC");
   }

   public void setTipoServExec(BigDecimal tipoServExec) {
        markAsChanged("TIPOSERVEXEC", tipoServExec);
   }

   public String getTipoAge() {
        return this.getVo().asString("TIPOAGE");
   }

   public void setTipoAge(String tipoAge) {
        markAsChanged("TIPOAGE", tipoAge);
   }

   public String getMsg() {
        return this.getVo().asString("MSG");
   }

   public void setMsg(String msg) {
        markAsChanged("MSG", msg);
   }

   public BigDecimal getNuAgendamento() {
        return this.getVo().asBigDecimal("NUAGENDAMENTO");
   }

   public void setNuAgendamento(BigDecimal nuAgendamento) {
        markAsChanged("NUAGENDAMENTO", nuAgendamento);
   }

   @Override
   public String getTableName() {
        return "TGFHEN";
   }

   @Override
   public String getEntityName() {
        return "HistoricoEnvioNotaSefaz";
   }

   @Override
   public HistoricoEnvioNotaSefaz fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
