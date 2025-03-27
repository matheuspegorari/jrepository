package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProgramacaoFerias extends AbstractSankhyaEntity<ProgramacaoFerias> {
   public String getAbonoInicio() {
        return this.getVo().asString("ABONOINICIO");
   }

   public void setAbonoInicio(String abonoInicio) {
        markAsChanged("ABONOINICIO", abonoInicio);
   }

   public BigDecimal getAbonoPec() {
        return this.getVo().asBigDecimal("ABONOPEC");
   }

   public void setAbonoPec(BigDecimal abonoPec) {
        markAsChanged("ABONOPEC", abonoPec);
   }

   public String getAtualFergoz() {
        return this.getVo().asString("ATUALFERGOZ");
   }

   public void setAtualFergoz(String atualFergoz) {
        markAsChanged("ATUALFERGOZ", atualFergoz);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodFunc() {
        return this.getVo().asBigDecimal("CODFUNC");
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtFinAqui() {
        return this.getVo().asTimestamp("DTFINAQUI");
   }

   public void setDtFinAqui(Timestamp dtFinAqui) {
        markAsChanged("DTFINAQUI", dtFinAqui);
   }

   public Timestamp getDtIniAqui() {
        return this.getVo().asTimestamp("DTINIAQUI");
   }

   public void setDtIniAqui(Timestamp dtIniAqui) {
        markAsChanged("DTINIAQUI", dtIniAqui);
   }

   public Timestamp getDtPrevista() {
        return this.getVo().asTimestamp("DTPREVISTA");
   }

   public void setDtPrevista(Timestamp dtPrevista) {
        markAsChanged("DTPREVISTA", dtPrevista);
   }

   public Timestamp getDtSaida() {
        return this.getVo().asTimestamp("DTSAIDA");
   }

   public void setDtSaida(Timestamp dtSaida) {
        markAsChanged("DTSAIDA", dtSaida);
   }

   public BigDecimal getFaltPer() {
        return this.getVo().asBigDecimal("FALTPER");
   }

   public void setFaltPer(BigDecimal faltPer) {
        markAsChanged("FALTPER", faltPer);
   }

   public BigDecimal getNumDiasFer() {
        return this.getVo().asBigDecimal("NUMDIASFER");
   }

   public void setNumDiasFer(BigDecimal numDiasFer) {
        markAsChanged("NUMDIASFER", numDiasFer);
   }

   public BigDecimal getNumDiasFerCol() {
        return this.getVo().asBigDecimal("NUMDIASFERCOL");
   }

   public void setNumDiasFerCol(BigDecimal numDiasFerCol) {
        markAsChanged("NUMDIASFERCOL", numDiasFerCol);
   }

   public BigDecimal getNumDiasLicRem() {
        return this.getVo().asBigDecimal("NUMDIASLICREM");
   }

   public void setNumDiasLicRem(BigDecimal numDiasLicRem) {
        markAsChanged("NUMDIASLICREM", numDiasLicRem);
   }

   public BigDecimal getNuOcor() {
        return this.getVo().asBigDecimal("NUOCOR");
   }

   public void setNuOcor(BigDecimal nuOcor) {
        markAsChanged("NUOCOR", nuOcor);
   }

   public BigDecimal getQtdParcelas() {
        return this.getVo().asBigDecimal("QTDPARCELAS");
   }

   public void setQtdParcelas(BigDecimal qtdParcelas) {
        markAsChanged("QTDPARCELAS", qtdParcelas);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public String getAprovado() {
        return this.getVo().asString("APROVADO");
   }

   public void setAprovado(String aprovado) {
        markAsChanged("APROVADO", aprovado);
   }

   public BigDecimal getSaldoDias() {
        return this.getVo().asBigDecimal("SALDODIAS");
   }

   public void setSaldoDias(BigDecimal saldoDias) {
        markAsChanged("SALDODIAS", saldoDias);
   }

   public BigDecimal getQtdDiasSolFerias() {
        return this.getVo().asBigDecimal("QTDDIASSOLFERIAS");
   }

   public void setQtdDiasSolFerias(BigDecimal qtdDiasSolFerias) {
        markAsChanged("QTDDIASSOLFERIAS", qtdDiasSolFerias);
   }

   public Timestamp getDtLimGozFer() {
        return this.getVo().asTimestamp("DTLIMGOZFER");
   }

   public void setDtLimGozFer(Timestamp dtLimGozFer) {
        markAsChanged("DTLIMGOZFER", dtLimGozFer);
   }

   public BigDecimal getCodFervinc() {
        return this.getVo().asBigDecimal("CODFERVINC");
   }

   public void setCodFervinc(BigDecimal codFervinc) {
        markAsChanged("CODFERVINC", codFervinc);
   }

   public BigDecimal getNumDiasFerReal() {
        return this.getVo().asBigDecimal("NUMDIASFERREAL");
   }

   public void setNumDiasFerReal(BigDecimal numDiasFerReal) {
        markAsChanged("NUMDIASFERREAL", numDiasFerReal);
   }

   public BigDecimal getNumDiasLicRemReal() {
        return this.getVo().asBigDecimal("NUMDIASLICREMREAL");
   }

   public void setNumDiasLicRemReal(BigDecimal numDiasLicRemReal) {
        markAsChanged("NUMDIASLICREMREAL", numDiasLicRemReal);
   }

   public String getPerQuitado() {
        return this.getVo().asString("PERQUITADO");
   }

   public void setPerQuitado(String perQuitado) {
        markAsChanged("PERQUITADO", perQuitado);
   }

   @Override
   public String getTableName() {
        return "TFPFER";
   }

   @Override
   public String getEntityName() {
        return "ProgramacaoFerias";
   }

   @Override
   public ProgramacaoFerias fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
