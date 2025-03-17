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
        this.codUsuResp = codUsuResp;
   }

   public String getAgendamento() {
        return agendamento;
   }

   public void setAgendamento(String agendamento) {
        this.agendamento = agendamento;
   }

   public String getArqModEmail() {
        return arqModEmail;
   }

   public void setArqModEmail(String arqModEmail) {
        this.arqModEmail = arqModEmail;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public Timestamp getDhFim() {
        return dhFim;
   }

   public void setDhFim(Timestamp dhFim) {
        this.dhFim = dhFim;
   }

   public Timestamp getDhIni() {
        return dhIni;
   }

   public void setDhIni(Timestamp dhIni) {
        this.dhIni = dhIni;
   }

   public String getExecUnica() {
        return execUnica;
   }

   public void setExecUnica(String execUnica) {
        this.execUnica = execUnica;
   }

   public BigDecimal getNuRfe() {
        return nuRfe;
   }

   public void setNuRfe(BigDecimal nuRfe) {
        this.nuRfe = nuRfe;
   }

   public Timestamp getProxExec() {
        return proxExec;
   }

   public void setProxExec(Timestamp proxExec) {
        this.proxExec = proxExec;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getCodSmtp() {
        return codSmtp;
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        this.codSmtp = codSmtp;
   }

   public char[] getEmailManual() {
        return emailManual;
   }

   public void setEmailManual(char[] emailManual) {
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
