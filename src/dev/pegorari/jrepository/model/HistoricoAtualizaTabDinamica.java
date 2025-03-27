package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoAtualizaTabDinamica extends AbstractSankhyaEntity<HistoricoAtualizaTabDinamica> {
   public BigDecimal getCodHis() {
        return this.getVo().asBigDecimal("CODHIS");
   }

   public void setCodHis(BigDecimal codHis) {
        markAsChanged("CODHIS", codHis);
   }

   public String getMsg() {
        return this.getVo().asString("MSG");
   }

   public void setMsg(String msg) {
        markAsChanged("MSG", msg);
   }

   public Timestamp getDtExec() {
        return this.getVo().asTimestamp("DTEXEC");
   }

   public void setDtExec(Timestamp dtExec) {
        markAsChanged("DTEXEC", dtExec);
   }

   public String getTipoAtualizacao() {
        return this.getVo().asString("TIPOATUALIZACAO");
   }

   public void setTipoAtualizacao(String tipoAtualizacao) {
        markAsChanged("TIPOATUALIZACAO", tipoAtualizacao);
   }

   public BigDecimal getTempoGasto() {
        return this.getVo().asBigDecimal("TEMPOGASTO");
   }

   public void setTempoGasto(BigDecimal tempoGasto) {
        markAsChanged("TEMPOGASTO", tempoGasto);
   }

   @Override
   public String getTableName() {
        return "TCBHID";
   }

   @Override
   public String getEntityName() {
        return "HistoricoAtualizaTabDinamica";
   }

   @Override
   public HistoricoAtualizaTabDinamica fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
