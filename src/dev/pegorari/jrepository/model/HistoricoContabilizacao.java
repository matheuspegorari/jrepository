package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoContabilizacao extends AbstractSankhyaEntity<HistoricoContabilizacao> {
   private Timestamp dhctz;
   private char[] erroExec;
   private BigDecimal minutosCtz;
   private BigDecimal nuAgendCtz;
   private BigDecimal qtdLancCtz;
   private BigDecimal qtdLancNctz;
   private BigDecimal qtdLancTot;
   private String tipo;
   private String tipoExec;
   private String liberada;

   public Timestamp getDhctz() {
        return dhctz;
   }

   public void setDhctz(Timestamp dhctz) {
        markAsChanged("DHCTZ", dhctz);
        this.dhctz = dhctz;
   }

   public char[] getErroExec() {
        return erroExec;
   }

   public void setErroExec(char[] erroExec) {
        markAsChanged("ERROEXEC", erroExec);
        this.erroExec = erroExec;
   }

   public BigDecimal getMinutosCtz() {
        return minutosCtz;
   }

   public void setMinutosCtz(BigDecimal minutosCtz) {
        markAsChanged("MINUTOSCTZ", minutosCtz);
        this.minutosCtz = minutosCtz;
   }

   public BigDecimal getNuAgendCtz() {
        return nuAgendCtz;
   }

   public void setNuAgendCtz(BigDecimal nuAgendCtz) {
        markAsChanged("NUAGENDCTZ", nuAgendCtz);
        this.nuAgendCtz = nuAgendCtz;
   }

   public BigDecimal getQtdLancCtz() {
        return qtdLancCtz;
   }

   public void setQtdLancCtz(BigDecimal qtdLancCtz) {
        markAsChanged("QTDLANCCTZ", qtdLancCtz);
        this.qtdLancCtz = qtdLancCtz;
   }

   public BigDecimal getQtdLancNctz() {
        return qtdLancNctz;
   }

   public void setQtdLancNctz(BigDecimal qtdLancNctz) {
        markAsChanged("QTDLANCNCTZ", qtdLancNctz);
        this.qtdLancNctz = qtdLancNctz;
   }

   public BigDecimal getQtdLancTot() {
        return qtdLancTot;
   }

   public void setQtdLancTot(BigDecimal qtdLancTot) {
        markAsChanged("QTDLANCTOT", qtdLancTot);
        this.qtdLancTot = qtdLancTot;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public String getTipoExec() {
        return tipoExec;
   }

   public void setTipoExec(String tipoExec) {
        markAsChanged("TIPOEXEC", tipoExec);
        this.tipoExec = tipoExec;
   }

   public String getLiberada() {
        return liberada;
   }

   public void setLiberada(String liberada) {
        markAsChanged("LIBERADA", liberada);
        this.liberada = liberada;
   }

   @Override
   public String getTableName() {
        return "TCBHCT";
   }

   @Override
   public String getEntityName() {
        return "HistoricoContabilizacao";
   }

   @Override
   public HistoricoContabilizacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.dhctz = vo.asTimestamp("DHCTZ");
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
