package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Custo extends AbstractSankhyaEntity<Custo> {
   private BigDecimal totalSemIcmsAnt;
   private String altPreco;
   private String automatico;
   private BigDecimal codEmp;
   private BigDecimal codLocal;
   private BigDecimal codProd;
   private String controle;
   private BigDecimal cusGer;
   private BigDecimal cusMed;
   private String cusMedCalc;
   private BigDecimal cusMedIcm;
   private BigDecimal cusRep;
   private BigDecimal cusSemIcm;
   private BigDecimal cusVariavel;
   private Timestamp dtAtual;
   private BigDecimal entradaComIcms;
   private BigDecimal entradaSemIcms;
   private BigDecimal nuNota;
   private BigDecimal qtdNeg;
   private BigDecimal sequencia;
   private BigDecimal totalComIcms;
   private BigDecimal totalComIcmsAnt;
   private BigDecimal totalSemIcms;
   private BigDecimal vlrVendaFixo;
   private String processo;

   public BigDecimal getTotalSemIcmsAnt() {
        return totalSemIcmsAnt;
   }

   public void setTotalSemIcmsAnt(BigDecimal totalSemIcmsAnt) {
        markAsChanged("TOTALSEMICMSANT", totalSemIcmsAnt);
        this.totalSemIcmsAnt = totalSemIcmsAnt;
   }

   public String getAltPreco() {
        return altPreco;
   }

   public void setAltPreco(String altPreco) {
        markAsChanged("ALTPRECO", altPreco);
        this.altPreco = altPreco;
   }

   public String getAutomatico() {
        return automatico;
   }

   public void setAutomatico(String automatico) {
        markAsChanged("AUTOMATICO", automatico);
        this.automatico = automatico;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public BigDecimal getCusGer() {
        return cusGer;
   }

   public void setCusGer(BigDecimal cusGer) {
        markAsChanged("CUSGER", cusGer);
        this.cusGer = cusGer;
   }

   public BigDecimal getCusMed() {
        return cusMed;
   }

   public void setCusMed(BigDecimal cusMed) {
        markAsChanged("CUSMED", cusMed);
        this.cusMed = cusMed;
   }

   public String getCusMedCalc() {
        return cusMedCalc;
   }

   public void setCusMedCalc(String cusMedCalc) {
        markAsChanged("CUSMEDCALC", cusMedCalc);
        this.cusMedCalc = cusMedCalc;
   }

   public BigDecimal getCusMedIcm() {
        return cusMedIcm;
   }

   public void setCusMedIcm(BigDecimal cusMedIcm) {
        markAsChanged("CUSMEDICM", cusMedIcm);
        this.cusMedIcm = cusMedIcm;
   }

   public BigDecimal getCusRep() {
        return cusRep;
   }

   public void setCusRep(BigDecimal cusRep) {
        markAsChanged("CUSREP", cusRep);
        this.cusRep = cusRep;
   }

   public BigDecimal getCusSemIcm() {
        return cusSemIcm;
   }

   public void setCusSemIcm(BigDecimal cusSemIcm) {
        markAsChanged("CUSSEMICM", cusSemIcm);
        this.cusSemIcm = cusSemIcm;
   }

   public BigDecimal getCusVariavel() {
        return cusVariavel;
   }

   public void setCusVariavel(BigDecimal cusVariavel) {
        markAsChanged("CUSVARIAVEL", cusVariavel);
        this.cusVariavel = cusVariavel;
   }

   public Timestamp getDtAtual() {
        return dtAtual;
   }

   public void setDtAtual(Timestamp dtAtual) {
        markAsChanged("DTATUAL", dtAtual);
        this.dtAtual = dtAtual;
   }

   public BigDecimal getEntradaComIcms() {
        return entradaComIcms;
   }

   public void setEntradaComIcms(BigDecimal entradaComIcms) {
        markAsChanged("ENTRADACOMICMS", entradaComIcms);
        this.entradaComIcms = entradaComIcms;
   }

   public BigDecimal getEntradaSemIcms() {
        return entradaSemIcms;
   }

   public void setEntradaSemIcms(BigDecimal entradaSemIcms) {
        markAsChanged("ENTRADASEMICMS", entradaSemIcms);
        this.entradaSemIcms = entradaSemIcms;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getQtdNeg() {
        return qtdNeg;
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        markAsChanged("QTDNEG", qtdNeg);
        this.qtdNeg = qtdNeg;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getTotalComIcms() {
        return totalComIcms;
   }

   public void setTotalComIcms(BigDecimal totalComIcms) {
        markAsChanged("TOTALCOMICMS", totalComIcms);
        this.totalComIcms = totalComIcms;
   }

   public BigDecimal getTotalComIcmsAnt() {
        return totalComIcmsAnt;
   }

   public void setTotalComIcmsAnt(BigDecimal totalComIcmsAnt) {
        markAsChanged("TOTALCOMICMSANT", totalComIcmsAnt);
        this.totalComIcmsAnt = totalComIcmsAnt;
   }

   public BigDecimal getTotalSemIcms() {
        return totalSemIcms;
   }

   public void setTotalSemIcms(BigDecimal totalSemIcms) {
        markAsChanged("TOTALSEMICMS", totalSemIcms);
        this.totalSemIcms = totalSemIcms;
   }

   public BigDecimal getVlrVendaFixo() {
        return vlrVendaFixo;
   }

   public void setVlrVendaFixo(BigDecimal vlrVendaFixo) {
        markAsChanged("VLRVENDAFIXO", vlrVendaFixo);
        this.vlrVendaFixo = vlrVendaFixo;
   }

   public String getProcesso() {
        return processo;
   }

   public void setProcesso(String processo) {
        markAsChanged("PROCESSO", processo);
        this.processo = processo;
   }

   @Override
   public String getTableName() {
        return "TGFCUS";
   }

   @Override
   public String getEntityName() {
        return "Custo";
   }

   @Override
   public Custo fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.totalSemIcmsAnt = vo.asBigDecimal("TOTALSEMICMSANT");
        this.altPreco = vo.asString("ALTPRECO");
        this.automatico = vo.asString("AUTOMATICO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.controle = vo.asString("CONTROLE");
        this.cusGer = vo.asBigDecimal("CUSGER");
        this.cusMed = vo.asBigDecimal("CUSMED");
        this.cusMedCalc = vo.asString("CUSMEDCALC");
        this.cusMedIcm = vo.asBigDecimal("CUSMEDICM");
        this.cusRep = vo.asBigDecimal("CUSREP");
        this.cusSemIcm = vo.asBigDecimal("CUSSEMICM");
        this.cusVariavel = vo.asBigDecimal("CUSVARIAVEL");
        this.dtAtual = vo.asTimestamp("DTATUAL");
        this.entradaComIcms = vo.asBigDecimal("ENTRADACOMICMS");
        this.entradaSemIcms = vo.asBigDecimal("ENTRADASEMICMS");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.qtdNeg = vo.asBigDecimal("QTDNEG");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.totalComIcms = vo.asBigDecimal("TOTALCOMICMS");
        this.totalComIcmsAnt = vo.asBigDecimal("TOTALCOMICMSANT");
        this.totalSemIcms = vo.asBigDecimal("TOTALSEMICMS");
        this.vlrVendaFixo = vo.asBigDecimal("VLRVENDAFIXO");
        this.processo = vo.asString("PROCESSO");
        return this;
   }
}
