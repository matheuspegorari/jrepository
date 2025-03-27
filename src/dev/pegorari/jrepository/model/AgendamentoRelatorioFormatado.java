package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AgendamentoRelatorioFormatado extends AbstractSankhyaEntity<AgendamentoRelatorioFormatado> {
   public BigDecimal getCodUsuResp() {
        return this.getVo().asBigDecimal("CODUSURESP");
   }

   public void setCodUsuResp(BigDecimal codUsuResp) {
        markAsChanged("CODUSURESP", codUsuResp);
   }

   public String getAgendamento() {
        return this.getVo().asString("AGENDAMENTO");
   }

   public void setAgendamento(String agendamento) {
        markAsChanged("AGENDAMENTO", agendamento);
   }

   public String getArqModEmail() {
        return this.getVo().asString("ARQMODEMAIL");
   }

   public void setArqModEmail(String arqModEmail) {
        markAsChanged("ARQMODEMAIL", arqModEmail);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDhFim() {
        return this.getVo().asTimestamp("DHFIM");
   }

   public void setDhFim(Timestamp dhFim) {
        markAsChanged("DHFIM", dhFim);
   }

   public Timestamp getDhIni() {
        return this.getVo().asTimestamp("DHINI");
   }

   public void setDhIni(Timestamp dhIni) {
        markAsChanged("DHINI", dhIni);
   }

   public String getExecUnica() {
        return this.getVo().asString("EXECUNICA");
   }

   public void setExecUnica(String execUnica) {
        markAsChanged("EXECUNICA", execUnica);
   }

   public BigDecimal getNuRfe() {
        return this.getVo().asBigDecimal("NURFE");
   }

   public void setNuRfe(BigDecimal nuRfe) {
        markAsChanged("NURFE", nuRfe);
   }

   public Timestamp getProxExec() {
        return this.getVo().asTimestamp("PROXEXEC");
   }

   public void setProxExec(Timestamp proxExec) {
        markAsChanged("PROXEXEC", proxExec);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getCodSmtp() {
        return this.getVo().asBigDecimal("CODSMTP");
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        markAsChanged("CODSMTP", codSmtp);
   }

   public char[] getEmailManual() {
        return this.getVo().asClob("EMAILMANUAL");
   }

   public void setEmailManual(char[] emailManual) {
        markAsChanged("EMAILMANUAL", emailManual);
   }

   @Override
   public String getTableName() {
        return "TSIARF";
   }

   @Override
   public String getEntityName() {
        return "AgendamentoRelatorioFormatado";
   }

   @Override
   public AgendamentoRelatorioFormatado fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
