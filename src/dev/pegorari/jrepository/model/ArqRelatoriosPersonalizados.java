package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ArqRelatoriosPersonalizados implements SankhyaEntity<ArqRelatoriosPersonalizados> {

   private BigDecimal sequencia;
   private BigDecimal tabela;
   private String arqPersonalizado;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private String idPasta;
   private BigDecimal nuPeriodoCtb;

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getTabela() {
        return tabela;
   }

   public void setTabela(BigDecimal tabela) {
        this.tabela = tabela;
   }

   public String getArqPersonalizado() {
        return arqPersonalizado;
   }

   public void setArqPersonalizado(String arqPersonalizado) {
        this.arqPersonalizado = arqPersonalizado;
   }

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

   public String getIdPasta() {
        return idPasta;
   }

   public void setIdPasta(String idPasta) {
        this.idPasta = idPasta;
   }

   public BigDecimal getNuPeriodoCtb() {
        return nuPeriodoCtb;
   }

   public void setNuPeriodoCtb(BigDecimal nuPeriodoCtb) {
        this.nuPeriodoCtb = nuPeriodoCtb;
   }

   @Override
   public String getEntityName() {
        return "ArqRelatoriosPersonalizados";
   }

   @Override
   public ArqRelatoriosPersonalizados fromVO(DynamicVO vo) {
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tabela = vo.asBigDecimal("TABELA");
        this.arqPersonalizado = vo.asString("ARQPERSONALIZADO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.idPasta = vo.asString("IDPASTA");
        this.nuPeriodoCtb = vo.asBigDecimal("NUPERIODOCTB");
        return this;
   }
}
