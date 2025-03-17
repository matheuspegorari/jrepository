package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoContabilizacao implements SankhyaEntity<HistoricoContabilizacao> {

   private Timestamp dhCtz;
   private char[] erroExec;
   private BigDecimal minutosCtz;
   private BigDecimal nuAgendCtz;
   private BigDecimal qtdLancCtz;
   private BigDecimal qtdLancNctz;
   private BigDecimal qtdLancTot;
   private String tipo;
   private String tipoExec;
   private String liberada;

   public Timestamp getDhCtz() {
        return dhCtz;
   }

   public void setDhCtz(Timestamp dhCtz) {
        this.dhCtz = dhCtz;
   }

   public char[] getErroExec() {
        return erroExec;
   }

   public void setErroExec(char[] erroExec) {
        this.erroExec = erroExec;
   }

   public BigDecimal getMinutosCtz() {
        return minutosCtz;
   }

   public void setMinutosCtz(BigDecimal minutosCtz) {
        this.minutosCtz = minutosCtz;
   }

   public BigDecimal getNuAgendCtz() {
        return nuAgendCtz;
   }

   public void setNuAgendCtz(BigDecimal nuAgendCtz) {
        this.nuAgendCtz = nuAgendCtz;
   }

   public BigDecimal getQtdLancCtz() {
        return qtdLancCtz;
   }

   public void setQtdLancCtz(BigDecimal qtdLancCtz) {
        this.qtdLancCtz = qtdLancCtz;
   }

   public BigDecimal getQtdLancNctz() {
        return qtdLancNctz;
   }

   public void setQtdLancNctz(BigDecimal qtdLancNctz) {
        this.qtdLancNctz = qtdLancNctz;
   }

   public BigDecimal getQtdLancTot() {
        return qtdLancTot;
   }

   public void setQtdLancTot(BigDecimal qtdLancTot) {
        this.qtdLancTot = qtdLancTot;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getTipoExec() {
        return tipoExec;
   }

   public void setTipoExec(String tipoExec) {
        this.tipoExec = tipoExec;
   }

   public String getLiberada() {
        return liberada;
   }

   public void setLiberada(String liberada) {
        this.liberada = liberada;
   }

   @Override
   public String getEntityName() {
        return "HistoricoContabilizacao";
   }

   @Override
   public HistoricoContabilizacao fromVO(DynamicVO vo) {
        this.dhCtz = vo.asTimestamp("DHCTZ");
        this.erroExec = vo.asClob("ERROEXEC");
        this.minutosCtz = vo.asBigDecimal("MINUTOSCTZ");
        this.nuAgendCtz = vo.asBigDecimal("NUAGENDCTZ");
        this.qtdLancCtz = vo.asBigDecimal("QTDLANCCTZ");
        this.qtdLancNctz = vo.asBigDecimal("QTDLANCNCTZ");
        this.qtdLancTot = vo.asBigDecimal("QTDLANCTOT");
        this.tipo = vo.asString("TIPO");
        this.tipoExec = vo.asString("TIPOEXEC");
        this.liberada = vo.asString("LIBERADA");
        return this;
   }
}
