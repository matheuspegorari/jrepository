package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Tarefa extends AbstractSankhyaEntity<Tarefa> {
   public BigDecimal getCodEmpoc() {
        return this.getVo().asBigDecimal("CODEMPOC");
   }

   public void setCodEmpoc(BigDecimal codEmpoc) {
        markAsChanged("CODEMPOC", codEmpoc);
   }

   public BigDecimal getCodTarefa() {
        return this.getVo().asBigDecimal("CODTAREFA");
   }

   public void setCodTarefa(BigDecimal codTarefa) {
        markAsChanged("CODTAREFA", codTarefa);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtTarefa() {
        return this.getVo().asTimestamp("DTTAREFA");
   }

   public void setDtTarefa(Timestamp dtTarefa) {
        markAsChanged("DTTAREFA", dtTarefa);
   }

   public BigDecimal getNuConferencia() {
        return this.getVo().asBigDecimal("NUCONFERENCIA");
   }

   public void setNuConferencia(BigDecimal nuConferencia) {
        markAsChanged("NUCONFERENCIA", nuConferencia);
   }

   public BigDecimal getNuIvt() {
        return this.getVo().asBigDecimal("NUIVT");
   }

   public void setNuIvt(BigDecimal nuIvt) {
        markAsChanged("NUIVT", nuIvt);
   }

   public BigDecimal getNuTarefa() {
        return this.getVo().asBigDecimal("NUTAREFA");
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
   }

   public BigDecimal getNuTarefaDep() {
        return this.getVo().asBigDecimal("NUTAREFADEP");
   }

   public void setNuTarefaDep(BigDecimal nuTarefaDep) {
        markAsChanged("NUTAREFADEP", nuTarefaDep);
   }

   public BigDecimal getNuTarefaOrigem() {
        return this.getVo().asBigDecimal("NUTAREFAORIGEM");
   }

   public void setNuTarefaOrigem(BigDecimal nuTarefaOrigem) {
        markAsChanged("NUTAREFAORIGEM", nuTarefaOrigem);
   }

   public BigDecimal getOrdemCarga() {
        return this.getVo().asBigDecimal("ORDEMCARGA");
   }

   public void setOrdemCarga(BigDecimal ordemCarga) {
        markAsChanged("ORDEMCARGA", ordemCarga);
   }

   public BigDecimal getPrioridade() {
        return this.getVo().asBigDecimal("PRIORIDADE");
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
   }

   public String getProAtiva() {
        return this.getVo().asString("PROATIVA");
   }

   public void setProAtiva(String proAtiva) {
        markAsChanged("PROATIVA", proAtiva);
   }

   public BigDecimal getSequenciaDep() {
        return this.getVo().asBigDecimal("SEQUENCIADEP");
   }

   public void setSequenciaDep(BigDecimal sequenciaDep) {
        markAsChanged("SEQUENCIADEP", sequenciaDep);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
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
        this.setVo(vo);
        return this;
   }
}
