package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Custo extends AbstractSankhyaEntity<Custo> {
   public BigDecimal getTotalSemIcmsAnt() {
        return this.getVo().asBigDecimal("TOTALSEMICMSANT");
   }

   public void setTotalSemIcmsAnt(BigDecimal totalSemIcmsAnt) {
        markAsChanged("TOTALSEMICMSANT", totalSemIcmsAnt);
   }

   public String getAltPreco() {
        return this.getVo().asString("ALTPRECO");
   }

   public void setAltPreco(String altPreco) {
        markAsChanged("ALTPRECO", altPreco);
   }

   public String getAutomatico() {
        return this.getVo().asString("AUTOMATICO");
   }

   public void setAutomatico(String automatico) {
        markAsChanged("AUTOMATICO", automatico);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public BigDecimal getCusGer() {
        return this.getVo().asBigDecimal("CUSGER");
   }

   public void setCusGer(BigDecimal cusGer) {
        markAsChanged("CUSGER", cusGer);
   }

   public BigDecimal getCusMed() {
        return this.getVo().asBigDecimal("CUSMED");
   }

   public void setCusMed(BigDecimal cusMed) {
        markAsChanged("CUSMED", cusMed);
   }

   public String getCusMedCalc() {
        return this.getVo().asString("CUSMEDCALC");
   }

   public void setCusMedCalc(String cusMedCalc) {
        markAsChanged("CUSMEDCALC", cusMedCalc);
   }

   public BigDecimal getCusMedIcm() {
        return this.getVo().asBigDecimal("CUSMEDICM");
   }

   public void setCusMedIcm(BigDecimal cusMedIcm) {
        markAsChanged("CUSMEDICM", cusMedIcm);
   }

   public BigDecimal getCusRep() {
        return this.getVo().asBigDecimal("CUSREP");
   }

   public void setCusRep(BigDecimal cusRep) {
        markAsChanged("CUSREP", cusRep);
   }

   public BigDecimal getCusSemIcm() {
        return this.getVo().asBigDecimal("CUSSEMICM");
   }

   public void setCusSemIcm(BigDecimal cusSemIcm) {
        markAsChanged("CUSSEMICM", cusSemIcm);
   }

   public BigDecimal getCusVariavel() {
        return this.getVo().asBigDecimal("CUSVARIAVEL");
   }

   public void setCusVariavel(BigDecimal cusVariavel) {
        markAsChanged("CUSVARIAVEL", cusVariavel);
   }

   public Timestamp getDtAtual() {
        return this.getVo().asTimestamp("DTATUAL");
   }

   public void setDtAtual(Timestamp dtAtual) {
        markAsChanged("DTATUAL", dtAtual);
   }

   public BigDecimal getEntradaComIcms() {
        return this.getVo().asBigDecimal("ENTRADACOMICMS");
   }

   public void setEntradaComIcms(BigDecimal entradaComIcms) {
        markAsChanged("ENTRADACOMICMS", entradaComIcms);
   }

   public BigDecimal getEntradaSemIcms() {
        return this.getVo().asBigDecimal("ENTRADASEMICMS");
   }

   public void setEntradaSemIcms(BigDecimal entradaSemIcms) {
        markAsChanged("ENTRADASEMICMS", entradaSemIcms);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getQtdNeg() {
        return this.getVo().asBigDecimal("QTDNEG");
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        markAsChanged("QTDNEG", qtdNeg);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getTotalComIcms() {
        return this.getVo().asBigDecimal("TOTALCOMICMS");
   }

   public void setTotalComIcms(BigDecimal totalComIcms) {
        markAsChanged("TOTALCOMICMS", totalComIcms);
   }

   public BigDecimal getTotalComIcmsAnt() {
        return this.getVo().asBigDecimal("TOTALCOMICMSANT");
   }

   public void setTotalComIcmsAnt(BigDecimal totalComIcmsAnt) {
        markAsChanged("TOTALCOMICMSANT", totalComIcmsAnt);
   }

   public BigDecimal getTotalSemIcms() {
        return this.getVo().asBigDecimal("TOTALSEMICMS");
   }

   public void setTotalSemIcms(BigDecimal totalSemIcms) {
        markAsChanged("TOTALSEMICMS", totalSemIcms);
   }

   public BigDecimal getVlrVendaFixo() {
        return this.getVo().asBigDecimal("VLRVENDAFIXO");
   }

   public void setVlrVendaFixo(BigDecimal vlrVendaFixo) {
        markAsChanged("VLRVENDAFIXO", vlrVendaFixo);
   }

   public String getProcesso() {
        return this.getVo().asString("PROCESSO");
   }

   public void setProcesso(String processo) {
        markAsChanged("PROCESSO", processo);
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
        this.setVo(vo);
        return this;
   }
}
