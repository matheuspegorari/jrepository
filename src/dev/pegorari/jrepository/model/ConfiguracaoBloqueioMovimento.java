package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoBloqueioMovimento extends AbstractSankhyaEntity<ConfiguracaoBloqueioMovimento> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

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

   public String getDescrBloqueio() {
        return this.getVo().asString("DESCRBLOQUEIO");
   }

   public void setDescrBloqueio(String descrBloqueio) {
        markAsChanged("DESCRBLOQUEIO", descrBloqueio);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getDiaFechaMovBco() {
        return this.getVo().asBigDecimal("DIAFECHAMOVBCO");
   }

   public void setDiaFechaMovBco(BigDecimal diaFechaMovBco) {
        markAsChanged("DIAFECHAMOVBCO", diaFechaMovBco);
   }

   public BigDecimal getDiaFechaMovCalcCus() {
        return this.getVo().asBigDecimal("DIAFECHAMOVCALCCUS");
   }

   public void setDiaFechaMovCalcCus(BigDecimal diaFechaMovCalcCus) {
        markAsChanged("DIAFECHAMOVCALCCUS", diaFechaMovCalcCus);
   }

   public BigDecimal getDiaFechaMovCtb() {
        return this.getVo().asBigDecimal("DIAFECHAMOVCTB");
   }

   public void setDiaFechaMovCtb(BigDecimal diaFechaMovCtb) {
        markAsChanged("DIAFECHAMOVCTB", diaFechaMovCtb);
   }

   public BigDecimal getDiaFechaMovDesp() {
        return this.getVo().asBigDecimal("DIAFECHAMOVDESP");
   }

   public void setDiaFechaMovDesp(BigDecimal diaFechaMovDesp) {
        markAsChanged("DIAFECHAMOVDESP", diaFechaMovDesp);
   }

   public BigDecimal getDiaFechaMovEnt() {
        return this.getVo().asBigDecimal("DIAFECHAMOVENT");
   }

   public void setDiaFechaMovEnt(BigDecimal diaFechaMovEnt) {
        markAsChanged("DIAFECHAMOVENT", diaFechaMovEnt);
   }

   public BigDecimal getDiaFechaMovFis() {
        return this.getVo().asBigDecimal("DIAFECHAMOVFIS");
   }

   public void setDiaFechaMovFis(BigDecimal diaFechaMovFis) {
        markAsChanged("DIAFECHAMOVFIS", diaFechaMovFis);
   }

   public BigDecimal getDiaFechaMovRec() {
        return this.getVo().asBigDecimal("DIAFECHAMOVREC");
   }

   public void setDiaFechaMovRec(BigDecimal diaFechaMovRec) {
        markAsChanged("DIAFECHAMOVREC", diaFechaMovRec);
   }

   public BigDecimal getDiaFechaMovSai() {
        return this.getVo().asBigDecimal("DIAFECHAMOVSAI");
   }

   public void setDiaFechaMovSai(BigDecimal diaFechaMovSai) {
        markAsChanged("DIAFECHAMOVSAI", diaFechaMovSai);
   }

   public String getFechaMovBco() {
        return this.getVo().asString("FECHAMOVBCO");
   }

   public void setFechaMovBco(String fechaMovBco) {
        markAsChanged("FECHAMOVBCO", fechaMovBco);
   }

   public String getFechaMovCalcCus() {
        return this.getVo().asString("FECHAMOVCALCCUS");
   }

   public void setFechaMovCalcCus(String fechaMovCalcCus) {
        markAsChanged("FECHAMOVCALCCUS", fechaMovCalcCus);
   }

   public String getFechaMovCtb() {
        return this.getVo().asString("FECHAMOVCTB");
   }

   public void setFechaMovCtb(String fechaMovCtb) {
        markAsChanged("FECHAMOVCTB", fechaMovCtb);
   }

   public String getFechaMovDesp() {
        return this.getVo().asString("FECHAMOVDESP");
   }

   public void setFechaMovDesp(String fechaMovDesp) {
        markAsChanged("FECHAMOVDESP", fechaMovDesp);
   }

   public String getFechaMovEnt() {
        return this.getVo().asString("FECHAMOVENT");
   }

   public void setFechaMovEnt(String fechaMovEnt) {
        markAsChanged("FECHAMOVENT", fechaMovEnt);
   }

   public String getFechaMovFis() {
        return this.getVo().asString("FECHAMOVFIS");
   }

   public void setFechaMovFis(String fechaMovFis) {
        markAsChanged("FECHAMOVFIS", fechaMovFis);
   }

   public String getFechaMovRec() {
        return this.getVo().asString("FECHAMOVREC");
   }

   public void setFechaMovRec(String fechaMovRec) {
        markAsChanged("FECHAMOVREC", fechaMovRec);
   }

   public String getFechaMovSai() {
        return this.getVo().asString("FECHAMOVSAI");
   }

   public void setFechaMovSai(String fechaMovSai) {
        markAsChanged("FECHAMOVSAI", fechaMovSai);
   }

   public BigDecimal getNuConfBloqueio() {
        return this.getVo().asBigDecimal("NUCONFBLOQUEIO");
   }

   public void setNuConfBloqueio(BigDecimal nuConfBloqueio) {
        markAsChanged("NUCONFBLOQUEIO", nuConfBloqueio);
   }

   @Override
   public String getTableName() {
        return "TCBCBM";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoBloqueioMovimento";
   }

   @Override
   public ConfiguracaoBloqueioMovimento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
