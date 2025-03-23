package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoEnvioNotaSefaz extends AbstractSankhyaEntity<HistoricoEnvioNotaSefaz> {
   private BigDecimal sequencia;
   private Timestamp dhExec;
   private BigDecimal tipoServExec;
   private String tipoAge;
   private String msg;
   private BigDecimal nuAgendamento;

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public Timestamp getDhExec() {
        return dhExec;
   }

   public void setDhExec(Timestamp dhExec) {
        markAsChanged("DHEXEC", dhExec);
        this.dhExec = dhExec;
   }

   public BigDecimal getTipoServExec() {
        return tipoServExec;
   }

   public void setTipoServExec(BigDecimal tipoServExec) {
        markAsChanged("TIPOSERVEXEC", tipoServExec);
        this.tipoServExec = tipoServExec;
   }

   public String getTipoAge() {
        return tipoAge;
   }

   public void setTipoAge(String tipoAge) {
        markAsChanged("TIPOAGE", tipoAge);
        this.tipoAge = tipoAge;
   }

   public String getMsg() {
        return msg;
   }

   public void setMsg(String msg) {
        markAsChanged("MSG", msg);
        this.msg = msg;
   }

   public BigDecimal getNuAgendamento() {
        return nuAgendamento;
   }

   public void setNuAgendamento(BigDecimal nuAgendamento) {
        markAsChanged("NUAGENDAMENTO", nuAgendamento);
        this.nuAgendamento = nuAgendamento;
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
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.dhExec = vo.asTimestamp("DHEXEC");
        this.tipoServExec = vo.asBigDecimal("TIPOSERVEXEC");
        this.tipoAge = vo.asString("TIPOAGE");
        this.msg = vo.asString("MSG");
        this.nuAgendamento = vo.asBigDecimal("NUAGENDAMENTO");
        return this;
   }
}
