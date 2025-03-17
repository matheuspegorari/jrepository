package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoBloqueioMovimento implements SankhyaEntity<ConfiguracaoBloqueioMovimento> {

   private String ativo;
   private BigDecimal codEmp;
   private BigDecimal codUsu;
   private String descrBloqueio;
   private Timestamp dhAlter;
   private BigDecimal diaFechaMovBco;
   private BigDecimal diaFechaMovCalcCus;
   private BigDecimal diaFechaMovCtb;
   private BigDecimal diaFechaMovDesp;
   private BigDecimal diaFechaMovEnt;
   private BigDecimal diaFechaMovFis;
   private BigDecimal diaFechaMovRec;
   private BigDecimal diaFechaMovSai;
   private String fechaMovBco;
   private String fechaMovCalcCus;
   private String fechaMovCtb;
   private String fechaMovDesp;
   private String fechaMovEnt;
   private String fechaMovFis;
   private String fechaMovRec;
   private String fechaMovSai;
   private BigDecimal nuConfBloqueio;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

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

   public String getDescrBloqueio() {
        return descrBloqueio;
   }

   public void setDescrBloqueio(String descrBloqueio) {
        this.descrBloqueio = descrBloqueio;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public BigDecimal getDiaFechaMovBco() {
        return diaFechaMovBco;
   }

   public void setDiaFechaMovBco(BigDecimal diaFechaMovBco) {
        this.diaFechaMovBco = diaFechaMovBco;
   }

   public BigDecimal getDiaFechaMovCalcCus() {
        return diaFechaMovCalcCus;
   }

   public void setDiaFechaMovCalcCus(BigDecimal diaFechaMovCalcCus) {
        this.diaFechaMovCalcCus = diaFechaMovCalcCus;
   }

   public BigDecimal getDiaFechaMovCtb() {
        return diaFechaMovCtb;
   }

   public void setDiaFechaMovCtb(BigDecimal diaFechaMovCtb) {
        this.diaFechaMovCtb = diaFechaMovCtb;
   }

   public BigDecimal getDiaFechaMovDesp() {
        return diaFechaMovDesp;
   }

   public void setDiaFechaMovDesp(BigDecimal diaFechaMovDesp) {
        this.diaFechaMovDesp = diaFechaMovDesp;
   }

   public BigDecimal getDiaFechaMovEnt() {
        return diaFechaMovEnt;
   }

   public void setDiaFechaMovEnt(BigDecimal diaFechaMovEnt) {
        this.diaFechaMovEnt = diaFechaMovEnt;
   }

   public BigDecimal getDiaFechaMovFis() {
        return diaFechaMovFis;
   }

   public void setDiaFechaMovFis(BigDecimal diaFechaMovFis) {
        this.diaFechaMovFis = diaFechaMovFis;
   }

   public BigDecimal getDiaFechaMovRec() {
        return diaFechaMovRec;
   }

   public void setDiaFechaMovRec(BigDecimal diaFechaMovRec) {
        this.diaFechaMovRec = diaFechaMovRec;
   }

   public BigDecimal getDiaFechaMovSai() {
        return diaFechaMovSai;
   }

   public void setDiaFechaMovSai(BigDecimal diaFechaMovSai) {
        this.diaFechaMovSai = diaFechaMovSai;
   }

   public String getFechaMovBco() {
        return fechaMovBco;
   }

   public void setFechaMovBco(String fechaMovBco) {
        this.fechaMovBco = fechaMovBco;
   }

   public String getFechaMovCalcCus() {
        return fechaMovCalcCus;
   }

   public void setFechaMovCalcCus(String fechaMovCalcCus) {
        this.fechaMovCalcCus = fechaMovCalcCus;
   }

   public String getFechaMovCtb() {
        return fechaMovCtb;
   }

   public void setFechaMovCtb(String fechaMovCtb) {
        this.fechaMovCtb = fechaMovCtb;
   }

   public String getFechaMovDesp() {
        return fechaMovDesp;
   }

   public void setFechaMovDesp(String fechaMovDesp) {
        this.fechaMovDesp = fechaMovDesp;
   }

   public String getFechaMovEnt() {
        return fechaMovEnt;
   }

   public void setFechaMovEnt(String fechaMovEnt) {
        this.fechaMovEnt = fechaMovEnt;
   }

   public String getFechaMovFis() {
        return fechaMovFis;
   }

   public void setFechaMovFis(String fechaMovFis) {
        this.fechaMovFis = fechaMovFis;
   }

   public String getFechaMovRec() {
        return fechaMovRec;
   }

   public void setFechaMovRec(String fechaMovRec) {
        this.fechaMovRec = fechaMovRec;
   }

   public String getFechaMovSai() {
        return fechaMovSai;
   }

   public void setFechaMovSai(String fechaMovSai) {
        this.fechaMovSai = fechaMovSai;
   }

   public BigDecimal getNuConfBloqueio() {
        return nuConfBloqueio;
   }

   public void setNuConfBloqueio(BigDecimal nuConfBloqueio) {
        this.nuConfBloqueio = nuConfBloqueio;
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoBloqueioMovimento";
   }

   @Override
   public ConfiguracaoBloqueioMovimento fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descrBloqueio = vo.asString("DESCRBLOQUEIO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.diaFechaMovBco = vo.asBigDecimal("DIAFECHAMOVBCO");
        this.diaFechaMovCalcCus = vo.asBigDecimal("DIAFECHAMOVCALCCUS");
        this.diaFechaMovCtb = vo.asBigDecimal("DIAFECHAMOVCTB");
        this.diaFechaMovDesp = vo.asBigDecimal("DIAFECHAMOVDESP");
        this.diaFechaMovEnt = vo.asBigDecimal("DIAFECHAMOVENT");
        this.diaFechaMovFis = vo.asBigDecimal("DIAFECHAMOVFIS");
        this.diaFechaMovRec = vo.asBigDecimal("DIAFECHAMOVREC");
        this.diaFechaMovSai = vo.asBigDecimal("DIAFECHAMOVSAI");
        this.fechaMovBco = vo.asString("FECHAMOVBCO");
        this.fechaMovCalcCus = vo.asString("FECHAMOVCALCCUS");
        this.fechaMovCtb = vo.asString("FECHAMOVCTB");
        this.fechaMovDesp = vo.asString("FECHAMOVDESP");
        this.fechaMovEnt = vo.asString("FECHAMOVENT");
        this.fechaMovFis = vo.asString("FECHAMOVFIS");
        this.fechaMovRec = vo.asString("FECHAMOVREC");
        this.fechaMovSai = vo.asString("FECHAMOVSAI");
        this.nuConfBloqueio = vo.asBigDecimal("NUCONFBLOQUEIO");
        return this;
   }
}
