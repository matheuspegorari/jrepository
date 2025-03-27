package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExecutanteTarefa extends AbstractSankhyaEntity<ExecutanteTarefa> {
   public BigDecimal getChave() {
        return this.getVo().asBigDecimal("CHAVE");
   }

   public void setChave(BigDecimal chave) {
        markAsChanged("CHAVE", chave);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuExec() {
        return this.getVo().asBigDecimal("CODUSUEXEC");
   }

   public void setCodUsuExec(BigDecimal codUsuExec) {
        markAsChanged("CODUSUEXEC", codUsuExec);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getNuTarefa() {
        return this.getVo().asBigDecimal("NUTAREFA");
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
   }

   public String getSitTarefa() {
        return this.getVo().asString("SITTAREFA");
   }

   public void setSitTarefa(String sitTarefa) {
        markAsChanged("SITTAREFA", sitTarefa);
   }

   public String getTipTarefa() {
        return this.getVo().asString("TIPTAREFA");
   }

   public void setTipTarefa(String tipTarefa) {
        markAsChanged("TIPTAREFA", tipTarefa);
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
        return this;
   }
}
