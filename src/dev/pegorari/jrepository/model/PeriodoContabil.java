package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PeriodoContabil extends AbstractSankhyaEntity<PeriodoContabil> {
   private BigDecimal codEmp;
   private BigDecimal codUsu;
   private String descricao;
   private Timestamp dhAlter;
   private Timestamp fimPeriodo;
   private Timestamp inicioPeriodo;
   private BigDecimal nuPeriodoCtb;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public Timestamp getFimPeriodo() {
        return fimPeriodo;
   }

   public void setFimPeriodo(Timestamp fimPeriodo) {
        this.fimPeriodo = fimPeriodo;
   }

   public Timestamp getInicioPeriodo() {
        return inicioPeriodo;
   }

   public void setInicioPeriodo(Timestamp inicioPeriodo) {
        this.inicioPeriodo = inicioPeriodo;
   }

   public BigDecimal getNuPeriodoCtb() {
        return nuPeriodoCtb;
   }

   public void setNuPeriodoCtb(BigDecimal nuPeriodoCtb) {
        this.nuPeriodoCtb = nuPeriodoCtb;
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
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descricao = vo.asString("DESCRICAO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.fimPeriodo = vo.asTimestamp("FIMPERIODO");
        this.inicioPeriodo = vo.asTimestamp("INICIOPERIODO");
        this.nuPeriodoCtb = vo.asBigDecimal("NUPERIODOCTB");
        return this;
   }
}
