package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AgendamentoRelatorioFormatado extends AbstractSankhyaEntity<AgendamentoRelatorioFormatado> {
   private BigDecimal codUsuResp;
   private String agendamento;
   private String arqModEmail;
   private String descricao;
   private Timestamp dhFim;
   private Timestamp dhIni;
   private String execUnica;
   private BigDecimal nuRfe;
   private Timestamp proxExec;
   private BigDecimal sequencia;
   private BigDecimal codSmtp;
   private char[] emailManual;

   public BigDecimal getCodUsuResp() {
        return codUsuResp;
   }

   public void setCodUsuResp(BigDecimal codUsuResp) {
        markAsChanged("CODUSURESP", codUsuResp);
        this.codUsuResp = codUsuResp;
   }

   public String getAgendamento() {
        return agendamento;
   }

   public void setAgendamento(String agendamento) {
        markAsChanged("AGENDAMENTO", agendamento);
        this.agendamento = agendamento;
   }

   public String getArqModEmail() {
        return arqModEmail;
   }

   public void setArqModEmail(String arqModEmail) {
        markAsChanged("ARQMODEMAIL", arqModEmail);
        this.arqModEmail = arqModEmail;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public Timestamp getDhFim() {
        return dhFim;
   }

   public void setDhFim(Timestamp dhFim) {
        markAsChanged("DHFIM", dhFim);
        this.dhFim = dhFim;
   }

   public Timestamp getDhIni() {
        return dhIni;
   }

   public void setDhIni(Timestamp dhIni) {
        markAsChanged("DHINI", dhIni);
        this.dhIni = dhIni;
   }

   public String getExecUnica() {
        return execUnica;
   }

   public void setExecUnica(String execUnica) {
        markAsChanged("EXECUNICA", execUnica);
        this.execUnica = execUnica;
   }

   public BigDecimal getNuRfe() {
        return nuRfe;
   }

   public void setNuRfe(BigDecimal nuRfe) {
        markAsChanged("NURFE", nuRfe);
        this.nuRfe = nuRfe;
   }

   public Timestamp getProxExec() {
        return proxExec;
   }

   public void setProxExec(Timestamp proxExec) {
        markAsChanged("PROXEXEC", proxExec);
        this.proxExec = proxExec;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getCodSmtp() {
        return codSmtp;
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        markAsChanged("CODSMTP", codSmtp);
        this.codSmtp = codSmtp;
   }

   public char[] getEmailManual() {
        return emailManual;
   }

   public void setEmailManual(char[] emailManual) {
        markAsChanged("EMAILMANUAL", emailManual);
        this.emailManual = emailManual;
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
        this.codUsuResp = vo.asBigDecimal("CODUSURESP");
        this.agendamento = vo.asString("AGENDAMENTO");
        this.arqModEmail = vo.asString("ARQMODEMAIL");
        this.descricao = vo.asString("DESCRICAO");
        this.dhFim = vo.asTimestamp("DHFIM");
        this.dhIni = vo.asTimestamp("DHINI");
        this.execUnica = vo.asString("EXECUNICA");
        this.nuRfe = vo.asBigDecimal("NURFE");
        this.proxExec = vo.asTimestamp("PROXEXEC");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.codSmtp = vo.asBigDecimal("CODSMTP");
        this.emailManual = vo.asClob("EMAILMANUAL");
        return this;
   }
}
