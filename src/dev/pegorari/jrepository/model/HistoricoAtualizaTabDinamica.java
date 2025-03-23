package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoAtualizaTabDinamica extends AbstractSankhyaEntity<HistoricoAtualizaTabDinamica> {
   private BigDecimal codHis;
   private String msg;
   private Timestamp dtExec;
   private String tipoAtualizacao;
   private BigDecimal tempoGasto;

   public BigDecimal getCodHis() {
        return codHis;
   }

   public void setCodHis(BigDecimal codHis) {
        markAsChanged("CODHIS", codHis);
        this.codHis = codHis;
   }

   public String getMsg() {
        return msg;
   }

   public void setMsg(String msg) {
        markAsChanged("MSG", msg);
        this.msg = msg;
   }

   public Timestamp getDtExec() {
        return dtExec;
   }

   public void setDtExec(Timestamp dtExec) {
        markAsChanged("DTEXEC", dtExec);
        this.dtExec = dtExec;
   }

   public String getTipoAtualizacao() {
        return tipoAtualizacao;
   }

   public void setTipoAtualizacao(String tipoAtualizacao) {
        markAsChanged("TIPOATUALIZACAO", tipoAtualizacao);
        this.tipoAtualizacao = tipoAtualizacao;
   }

   public BigDecimal getTempoGasto() {
        return tempoGasto;
   }

   public void setTempoGasto(BigDecimal tempoGasto) {
        markAsChanged("TEMPOGASTO", tempoGasto);
        this.tempoGasto = tempoGasto;
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
        this.codHis = vo.asBigDecimal("CODHIS");
        this.msg = vo.asString("MSG");
        this.dtExec = vo.asTimestamp("DTEXEC");
        this.tipoAtualizacao = vo.asString("TIPOATUALIZACAO");
        this.tempoGasto = vo.asBigDecimal("TEMPOGASTO");
        return this;
   }
}
