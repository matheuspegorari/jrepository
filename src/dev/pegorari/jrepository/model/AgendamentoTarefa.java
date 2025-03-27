package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AgendamentoTarefa extends AbstractSankhyaEntity<AgendamentoTarefa> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public char[] getConfig() {
        return this.getVo().asClob("CONFIG");
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDhExecucao() {
        return this.getVo().asTimestamp("DHEXECUCAO");
   }

   public void setDhExecucao(Timestamp dhExecucao) {
        markAsChanged("DHEXECUCAO", dhExecucao);
   }

   public Timestamp getDhProxExec() {
        return this.getVo().asTimestamp("DHPROXEXEC");
   }

   public void setDhProxExec(Timestamp dhProxExec) {
        markAsChanged("DHPROXEXEC", dhProxExec);
   }

   public Timestamp getDhUltExec() {
        return this.getVo().asTimestamp("DHULTEXEC");
   }

   public void setDhUltExec(Timestamp dhUltExec) {
        markAsChanged("DHULTEXEC", dhUltExec);
   }

   public String getDiaMes() {
        return this.getVo().asString("DIAMES");
   }

   public void setDiaMes(String diaMes) {
        markAsChanged("DIAMES", diaMes);
   }

   public String getDiaSemana() {
        return this.getVo().asString("DIASEMANA");
   }

   public void setDiaSemana(String diaSemana) {
        markAsChanged("DIASEMANA", diaSemana);
   }

   public String getHorario() {
        return this.getVo().asString("HORARIO");
   }

   public void setHorario(String horario) {
        markAsChanged("HORARIO", horario);
   }

   public String getMes() {
        return this.getVo().asString("MES");
   }

   public void setMes(String mes) {
        markAsChanged("MES", mes);
   }

   public BigDecimal getNuAgendamento() {
        return this.getVo().asBigDecimal("NUAGENDAMENTO");
   }

   public void setNuAgendamento(BigDecimal nuAgendamento) {
        markAsChanged("NUAGENDAMENTO", nuAgendamento);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTipoAge() {
        return this.getVo().asString("TIPOAGE");
   }

   public void setTipoAge(String tipoAge) {
        markAsChanged("TIPOAGE", tipoAge);
   }

   public String getTipoExec() {
        return this.getVo().asString("TIPOEXEC");
   }

   public void setTipoExec(String tipoExec) {
        markAsChanged("TIPOEXEC", tipoExec);
   }

   public char[] getInfo() {
        return this.getVo().asClob("INFO");
   }

   public void setInfo(char[] info) {
        markAsChanged("INFO", info);
   }

   public String getStatusUltExec() {
        return this.getVo().asString("STATUSULTEXEC");
   }

   public void setStatusUltExec(String statusUltExec) {
        markAsChanged("STATUSULTEXEC", statusUltExec);
   }

   public String getGeraLotePara() {
        return this.getVo().asString("GERALOTEPARA");
   }

   public void setGeraLotePara(String geraLotePara) {
        markAsChanged("GERALOTEPARA", geraLotePara);
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
        this.setVo(vo);
        return this;
   }
}
