package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoContabilizacao extends AbstractSankhyaEntity<HistoricoContabilizacao> {
   public Timestamp getDhctz() {
        return this.getVo().asTimestamp("DHCTZ");
   }

   public void setDhctz(Timestamp dhctz) {
        markAsChanged("DHCTZ", dhctz);
   }

   public char[] getErroExec() {
        return this.getVo().asClob("ERROEXEC");
   }

   public void setErroExec(char[] erroExec) {
        markAsChanged("ERROEXEC", erroExec);
   }

   public BigDecimal getMinutosCtz() {
        return this.getVo().asBigDecimal("MINUTOSCTZ");
   }

   public void setMinutosCtz(BigDecimal minutosCtz) {
        markAsChanged("MINUTOSCTZ", minutosCtz);
   }

   public BigDecimal getNuAgendCtz() {
        return this.getVo().asBigDecimal("NUAGENDCTZ");
   }

   public void setNuAgendCtz(BigDecimal nuAgendCtz) {
        markAsChanged("NUAGENDCTZ", nuAgendCtz);
   }

   public BigDecimal getQtdLancCtz() {
        return this.getVo().asBigDecimal("QTDLANCCTZ");
   }

   public void setQtdLancCtz(BigDecimal qtdLancCtz) {
        markAsChanged("QTDLANCCTZ", qtdLancCtz);
   }

   public BigDecimal getQtdLancNctz() {
        return this.getVo().asBigDecimal("QTDLANCNCTZ");
   }

   public void setQtdLancNctz(BigDecimal qtdLancNctz) {
        markAsChanged("QTDLANCNCTZ", qtdLancNctz);
   }

   public BigDecimal getQtdLancTot() {
        return this.getVo().asBigDecimal("QTDLANCTOT");
   }

   public void setQtdLancTot(BigDecimal qtdLancTot) {
        markAsChanged("QTDLANCTOT", qtdLancTot);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getTipoExec() {
        return this.getVo().asString("TIPOEXEC");
   }

   public void setTipoExec(String tipoExec) {
        markAsChanged("TIPOEXEC", tipoExec);
   }

   public String getLiberada() {
        return this.getVo().asString("LIBERADA");
   }

   public void setLiberada(String liberada) {
        markAsChanged("LIBERADA", liberada);
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
        return this;
   }
}
