package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AgendamentoTarefa extends AbstractSankhyaEntity<AgendamentoTarefa> {
   private String ativo;
   private BigDecimal codEmp;
   private char[] config;
   private String descricao;
   private Timestamp dhExecucao;
   private Timestamp dhProxExec;
   private Timestamp dhUltExec;
   private String diaMes;
   private String diaSemana;
   private String horario;
   private String mes;
   private BigDecimal nuAgendamento;
   private BigDecimal sequencia;
   private String tipoAge;
   private String tipoExec;
   private char[] info;
   private String statusUltExec;
   private String geraLotePara;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public char[] getConfig() {
        return config;
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
        this.config = config;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public Timestamp getDhExecucao() {
        return dhExecucao;
   }

   public void setDhExecucao(Timestamp dhExecucao) {
        markAsChanged("DHEXECUCAO", dhExecucao);
        this.dhExecucao = dhExecucao;
   }

   public Timestamp getDhProxExec() {
        return dhProxExec;
   }

   public void setDhProxExec(Timestamp dhProxExec) {
        markAsChanged("DHPROXEXEC", dhProxExec);
        this.dhProxExec = dhProxExec;
   }

   public Timestamp getDhUltExec() {
        return dhUltExec;
   }

   public void setDhUltExec(Timestamp dhUltExec) {
        markAsChanged("DHULTEXEC", dhUltExec);
        this.dhUltExec = dhUltExec;
   }

   public String getDiaMes() {
        return diaMes;
   }

   public void setDiaMes(String diaMes) {
        markAsChanged("DIAMES", diaMes);
        this.diaMes = diaMes;
   }

   public String getDiaSemana() {
        return diaSemana;
   }

   public void setDiaSemana(String diaSemana) {
        markAsChanged("DIASEMANA", diaSemana);
        this.diaSemana = diaSemana;
   }

   public String getHorario() {
        return horario;
   }

   public void setHorario(String horario) {
        markAsChanged("HORARIO", horario);
        this.horario = horario;
   }

   public String getMes() {
        return mes;
   }

   public void setMes(String mes) {
        markAsChanged("MES", mes);
        this.mes = mes;
   }

   public BigDecimal getNuAgendamento() {
        return nuAgendamento;
   }

   public void setNuAgendamento(BigDecimal nuAgendamento) {
        markAsChanged("NUAGENDAMENTO", nuAgendamento);
        this.nuAgendamento = nuAgendamento;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getTipoAge() {
        return tipoAge;
   }

   public void setTipoAge(String tipoAge) {
        markAsChanged("TIPOAGE", tipoAge);
        this.tipoAge = tipoAge;
   }

   public String getTipoExec() {
        return tipoExec;
   }

   public void setTipoExec(String tipoExec) {
        markAsChanged("TIPOEXEC", tipoExec);
        this.tipoExec = tipoExec;
   }

   public char[] getInfo() {
        return info;
   }

   public void setInfo(char[] info) {
        markAsChanged("INFO", info);
        this.info = info;
   }

   public String getStatusUltExec() {
        return statusUltExec;
   }

   public void setStatusUltExec(String statusUltExec) {
        markAsChanged("STATUSULTEXEC", statusUltExec);
        this.statusUltExec = statusUltExec;
   }

   public String getGeraLotePara() {
        return geraLotePara;
   }

   public void setGeraLotePara(String geraLotePara) {
        markAsChanged("GERALOTEPARA", geraLotePara);
        this.geraLotePara = geraLotePara;
   }

   @Override
   public String getTableName() {
        return "TGFTAG";
   }

   @Override
   public String getEntityName() {
        return "AgendamentoTarefa";
   }

   @Override
   public AgendamentoTarefa fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.ativo = vo.asString("ATIVO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.config = vo.asClob("CONFIG");
        this.descricao = vo.asString("DESCRICAO");
        this.dhExecucao = vo.asTimestamp("DHEXECUCAO");
        this.dhProxExec = vo.asTimestamp("DHPROXEXEC");
        this.dhUltExec = vo.asTimestamp("DHULTEXEC");
        this.diaMes = vo.asString("DIAMES");
        this.diaSemana = vo.asString("DIASEMANA");
        this.horario = vo.asString("HORARIO");
        this.mes = vo.asString("MES");
        this.nuAgendamento = vo.asBigDecimal("NUAGENDAMENTO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipoAge = vo.asString("TIPOAGE");
        this.tipoExec = vo.asString("TIPOEXEC");
        this.info = vo.asClob("INFO");
        this.statusUltExec = vo.asString("STATUSULTEXEC");
        this.geraLotePara = vo.asString("GERALOTEPARA");
        return this;
   }
}
