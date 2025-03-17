package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Tarefa extends AbstractSankhyaEntity<Tarefa> {
   private BigDecimal codEmpoc;
   private BigDecimal codTarefa;
   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private Timestamp dtTarefa;
   private BigDecimal nuConferencia;
   private BigDecimal nuIvt;
   private BigDecimal nuTarefa;
   private BigDecimal nuTarefaDep;
   private BigDecimal nuTarefaOrigem;
   private BigDecimal ordemCarga;
   private BigDecimal prioridade;
   private String proAtiva;
   private BigDecimal sequenciaDep;
   private String situacao;
   private BigDecimal codParc;

   public BigDecimal getCodEmpoc() {
        return codEmpoc;
   }

   public void setCodEmpoc(BigDecimal codEmpoc) {
        this.codEmpoc = codEmpoc;
   }

   public BigDecimal getCodTarefa() {
        return codTarefa;
   }

   public void setCodTarefa(BigDecimal codTarefa) {
        this.codTarefa = codTarefa;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtTarefa() {
        return dtTarefa;
   }

   public void setDtTarefa(Timestamp dtTarefa) {
        this.dtTarefa = dtTarefa;
   }

   public BigDecimal getNuConferencia() {
        return nuConferencia;
   }

   public void setNuConferencia(BigDecimal nuConferencia) {
        this.nuConferencia = nuConferencia;
   }

   public BigDecimal getNuIvt() {
        return nuIvt;
   }

   public void setNuIvt(BigDecimal nuIvt) {
        this.nuIvt = nuIvt;
   }

   public BigDecimal getNuTarefa() {
        return nuTarefa;
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        this.nuTarefa = nuTarefa;
   }

   public BigDecimal getNuTarefaDep() {
        return nuTarefaDep;
   }

   public void setNuTarefaDep(BigDecimal nuTarefaDep) {
        this.nuTarefaDep = nuTarefaDep;
   }

   public BigDecimal getNuTarefaOrigem() {
        return nuTarefaOrigem;
   }

   public void setNuTarefaOrigem(BigDecimal nuTarefaOrigem) {
        this.nuTarefaOrigem = nuTarefaOrigem;
   }

   public BigDecimal getOrdemCarga() {
        return ordemCarga;
   }

   public void setOrdemCarga(BigDecimal ordemCarga) {
        this.ordemCarga = ordemCarga;
   }

   public BigDecimal getPrioridade() {
        return prioridade;
   }

   public void setPrioridade(BigDecimal prioridade) {
        this.prioridade = prioridade;
   }

   public String getProAtiva() {
        return proAtiva;
   }

   public void setProAtiva(String proAtiva) {
        this.proAtiva = proAtiva;
   }

   public BigDecimal getSequenciaDep() {
        return sequenciaDep;
   }

   public void setSequenciaDep(BigDecimal sequenciaDep) {
        this.sequenciaDep = sequenciaDep;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        this.situacao = situacao;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   @Override
   public String getTableName() {
        return "TGWTAR";
   }

   @Override
   public String getEntityName() {
        return "Tarefa";
   }

   @Override
   public Tarefa fromVO(DynamicVO vo) {
        this.codEmpoc = vo.asBigDecimal("CODEMPOC");
        this.codTarefa = vo.asBigDecimal("CODTAREFA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtTarefa = vo.asTimestamp("DTTAREFA");
        this.nuConferencia = vo.asBigDecimal("NUCONFERENCIA");
        this.nuIvt = vo.asBigDecimal("NUIVT");
        this.nuTarefa = vo.asBigDecimal("NUTAREFA");
        this.nuTarefaDep = vo.asBigDecimal("NUTAREFADEP");
        this.nuTarefaOrigem = vo.asBigDecimal("NUTAREFAORIGEM");
        this.ordemCarga = vo.asBigDecimal("ORDEMCARGA");
        this.prioridade = vo.asBigDecimal("PRIORIDADE");
        this.proAtiva = vo.asString("PROATIVA");
        this.sequenciaDep = vo.asBigDecimal("SEQUENCIADEP");
        this.situacao = vo.asString("SITUACAO");
        this.codParc = vo.asBigDecimal("CODPARC");
        return this;
   }
}
