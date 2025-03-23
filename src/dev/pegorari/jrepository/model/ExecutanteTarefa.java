package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExecutanteTarefa extends AbstractSankhyaEntity<ExecutanteTarefa> {
   private BigDecimal chave;
   private BigDecimal codUsu;
   private BigDecimal codUsuExec;
   private Timestamp dtAlter;
   private BigDecimal nuTarefa;
   private String sitTarefa;
   private String tipTarefa;

   public BigDecimal getChave() {
        return chave;
   }

   public void setChave(BigDecimal chave) {
        markAsChanged("CHAVE", chave);
        this.chave = chave;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuExec() {
        return codUsuExec;
   }

   public void setCodUsuExec(BigDecimal codUsuExec) {
        markAsChanged("CODUSUEXEC", codUsuExec);
        this.codUsuExec = codUsuExec;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuTarefa() {
        return nuTarefa;
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
        this.nuTarefa = nuTarefa;
   }

   public String getSitTarefa() {
        return sitTarefa;
   }

   public void setSitTarefa(String sitTarefa) {
        markAsChanged("SITTAREFA", sitTarefa);
        this.sitTarefa = sitTarefa;
   }

   public String getTipTarefa() {
        return tipTarefa;
   }

   public void setTipTarefa(String tipTarefa) {
        markAsChanged("TIPTAREFA", tipTarefa);
        this.tipTarefa = tipTarefa;
   }

   @Override
   public String getTableName() {
        return "TGWUXT";
   }

   @Override
   public String getEntityName() {
        return "ExecutanteTarefa";
   }

   @Override
   public ExecutanteTarefa fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.chave = vo.asBigDecimal("CHAVE");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuExec = vo.asBigDecimal("CODUSUEXEC");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nuTarefa = vo.asBigDecimal("NUTAREFA");
        this.sitTarefa = vo.asString("SITTAREFA");
        this.tipTarefa = vo.asString("TIPTAREFA");
        return this;
   }
}
