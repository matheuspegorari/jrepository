package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabRelatoriosPersonalizados implements SankhyaEntity<CabRelatoriosPersonalizados> {

   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private BigDecimal nuPeriodoCtb;
   private BigDecimal tabela;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public BigDecimal getNuPeriodoCtb() {
        return nuPeriodoCtb;
   }

   public void setNuPeriodoCtb(BigDecimal nuPeriodoCtb) {
        this.nuPeriodoCtb = nuPeriodoCtb;
   }

   public BigDecimal getTabela() {
        return tabela;
   }

   public void setTabela(BigDecimal tabela) {
        this.tabela = tabela;
   }

   @Override
   public String getEntityName() {
        return "CabRelatoriosPersonalizados";
   }

   @Override
   public CabRelatoriosPersonalizados fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nuPeriodoCtb = vo.asBigDecimal("NUPERIODOCTB");
        this.tabela = vo.asBigDecimal("TABELA");
        return this;
   }
}
