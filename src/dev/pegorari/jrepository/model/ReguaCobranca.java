package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ReguaCobranca extends AbstractSankhyaEntity<ReguaCobranca> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodRegua() {
        return this.getVo().asBigDecimal("CODREGUA");
   }

   public void setCodRegua(BigDecimal codRegua) {
        markAsChanged("CODREGUA", codRegua);
   }

   public char[] getConfig() {
        return this.getVo().asClob("CONFIG");
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
   }

   public String getDescRegua() {
        return this.getVo().asString("DESCREGUA");
   }

   public void setDescRegua(String descRegua) {
        markAsChanged("DESCREGUA", descRegua);
   }

   public BigDecimal getHoraExec() {
        return this.getVo().asBigDecimal("HORAEXEC");
   }

   public void setHoraExec(BigDecimal horaExec) {
        markAsChanged("HORAEXEC", horaExec);
   }

   public Timestamp getUltExecucao() {
        return this.getVo().asTimestamp("ULTEXECUCAO");
   }

   public void setUltExecucao(Timestamp ultExecucao) {
        markAsChanged("ULTEXECUCAO", ultExecucao);
   }

   @Override
   public String getTableName() {
        return "TGFRCB";
   }

   @Override
   public String getEntityName() {
        return "ReguaCobranca";
   }

   @Override
   public ReguaCobranca fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
