package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ReguaCobranca extends AbstractSankhyaEntity<ReguaCobranca> {
   private String ativo;
   private BigDecimal codRegua;
   private char[] config;
   private String descRegua;
   private BigDecimal horaExec;
   private Timestamp ultExecucao;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodRegua() {
        return codRegua;
   }

   public void setCodRegua(BigDecimal codRegua) {
        markAsChanged("CODREGUA", codRegua);
        this.codRegua = codRegua;
   }

   public char[] getConfig() {
        return config;
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
        this.config = config;
   }

   public String getDescRegua() {
        return descRegua;
   }

   public void setDescRegua(String descRegua) {
        markAsChanged("DESCREGUA", descRegua);
        this.descRegua = descRegua;
   }

   public BigDecimal getHoraExec() {
        return horaExec;
   }

   public void setHoraExec(BigDecimal horaExec) {
        markAsChanged("HORAEXEC", horaExec);
        this.horaExec = horaExec;
   }

   public Timestamp getUltExecucao() {
        return ultExecucao;
   }

   public void setUltExecucao(Timestamp ultExecucao) {
        markAsChanged("ULTEXECUCAO", ultExecucao);
        this.ultExecucao = ultExecucao;
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
        this.ativo = vo.asString("ATIVO");
        this.codRegua = vo.asBigDecimal("CODREGUA");
        this.config = vo.asClob("CONFIG");
        this.descRegua = vo.asString("DESCREGUA");
        this.horaExec = vo.asBigDecimal("HORAEXEC");
        this.ultExecucao = vo.asTimestamp("ULTEXECUCAO");
        return this;
   }
}
