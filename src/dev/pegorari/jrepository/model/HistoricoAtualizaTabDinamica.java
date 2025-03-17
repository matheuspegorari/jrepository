package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoAtualizaTabDinamica implements SankhyaEntity<HistoricoAtualizaTabDinamica> {

   private BigDecimal codHis;
   private String msg;
   private Timestamp dtExec;
   private String tipoAtualizacao;
   private BigDecimal tempoGasto;

   public BigDecimal getCodHis() {
        return codHis;
   }

   public void setCodHis(BigDecimal codHis) {
        this.codHis = codHis;
   }

   public String getMsg() {
        return msg;
   }

   public void setMsg(String msg) {
        this.msg = msg;
   }

   public Timestamp getDtExec() {
        return dtExec;
   }

   public void setDtExec(Timestamp dtExec) {
        this.dtExec = dtExec;
   }

   public String getTipoAtualizacao() {
        return tipoAtualizacao;
   }

   public void setTipoAtualizacao(String tipoAtualizacao) {
        this.tipoAtualizacao = tipoAtualizacao;
   }

   public BigDecimal getTempoGasto() {
        return tempoGasto;
   }

   public void setTempoGasto(BigDecimal tempoGasto) {
        this.tempoGasto = tempoGasto;
   }

   @Override
   public String getEntityName() {
        return "HistoricoAtualizaTabDinamica";
   }

   @Override
   public HistoricoAtualizaTabDinamica fromVO(DynamicVO vo) {
        this.codHis = vo.asBigDecimal("CODHIS");
        this.msg = vo.asString("MSG");
        this.dtExec = vo.asTimestamp("DTEXEC");
        this.tipoAtualizacao = vo.asString("TIPOATUALIZACAO");
        this.tempoGasto = vo.asBigDecimal("TEMPOGASTO");
        return this;
   }
}
