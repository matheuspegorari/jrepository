package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PeriodoContabil extends AbstractSankhyaEntity<PeriodoContabil> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getFimPeriodo() {
        return this.getVo().asTimestamp("FIMPERIODO");
   }

   public void setFimPeriodo(Timestamp fimPeriodo) {
        markAsChanged("FIMPERIODO", fimPeriodo);
   }

   public Timestamp getInicioPeriodo() {
        return this.getVo().asTimestamp("INICIOPERIODO");
   }

   public void setInicioPeriodo(Timestamp inicioPeriodo) {
        markAsChanged("INICIOPERIODO", inicioPeriodo);
   }

   public BigDecimal getNuPeriodoCtb() {
        return this.getVo().asBigDecimal("NUPERIODOCTB");
   }

   public void setNuPeriodoCtb(BigDecimal nuPeriodoCtb) {
        markAsChanged("NUPERIODOCTB", nuPeriodoCtb);
   }

   @Override
   public String getTableName() {
        return "TCBPCT";
   }

   @Override
   public String getEntityName() {
        return "PeriodoContabil";
   }

   @Override
   public PeriodoContabil fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
