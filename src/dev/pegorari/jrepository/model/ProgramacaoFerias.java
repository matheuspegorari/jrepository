package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProgramacaoFerias extends AbstractSankhyaEntity<ProgramacaoFerias> {
   private String abonoInicio;
   private BigDecimal abonoPec;
   private String atualFergoz;
   private BigDecimal codEmp;
   private BigDecimal codFunc;
   private Timestamp dtAlter;
   private Timestamp dtFinAqui;
   private Timestamp dtIniAqui;
   private Timestamp dtPrevista;
   private Timestamp dtSaida;
   private BigDecimal faltPer;
   private BigDecimal numDiasFer;
   private BigDecimal numDiasFerCol;
   private BigDecimal numDiasLicRem;
   private BigDecimal nuOcor;
   private BigDecimal qtdParcelas;
   private Timestamp referencia;
   private BigDecimal sequencia;
   private String digitado;
   private String aprovado;
   private BigDecimal saldoDias;
   private BigDecimal qtdDiasSolFerias;
   private Timestamp dtLimGozFer;
   private BigDecimal codFervinc;
   private BigDecimal numDiasFerReal;
   private BigDecimal numDiasLicRemReal;
   private String perQuitado;

   public String getAbonoInicio() {
        return abonoInicio;
   }

   public void setAbonoInicio(String abonoInicio) {
        this.abonoInicio = abonoInicio;
   }

   public BigDecimal getAbonoPec() {
        return abonoPec;
   }

   public void setAbonoPec(BigDecimal abonoPec) {
        this.abonoPec = abonoPec;
   }

   public String getAtualFergoz() {
        return atualFergoz;
   }

   public void setAtualFergoz(String atualFergoz) {
        this.atualFergoz = atualFergoz;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        this.codFunc = codFunc;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtFinAqui() {
        return dtFinAqui;
   }

   public void setDtFinAqui(Timestamp dtFinAqui) {
        this.dtFinAqui = dtFinAqui;
   }

   public Timestamp getDtIniAqui() {
        return dtIniAqui;
   }

   public void setDtIniAqui(Timestamp dtIniAqui) {
        this.dtIniAqui = dtIniAqui;
   }

   public Timestamp getDtPrevista() {
        return dtPrevista;
   }

   public void setDtPrevista(Timestamp dtPrevista) {
        this.dtPrevista = dtPrevista;
   }

   public Timestamp getDtSaida() {
        return dtSaida;
   }

   public void setDtSaida(Timestamp dtSaida) {
        this.dtSaida = dtSaida;
   }

   public BigDecimal getFaltPer() {
        return faltPer;
   }

   public void setFaltPer(BigDecimal faltPer) {
        this.faltPer = faltPer;
   }

   public BigDecimal getNumDiasFer() {
        return numDiasFer;
   }

   public void setNumDiasFer(BigDecimal numDiasFer) {
        this.numDiasFer = numDiasFer;
   }

   public BigDecimal getNumDiasFerCol() {
        return numDiasFerCol;
   }

   public void setNumDiasFerCol(BigDecimal numDiasFerCol) {
        this.numDiasFerCol = numDiasFerCol;
   }

   public BigDecimal getNumDiasLicRem() {
        return numDiasLicRem;
   }

   public void setNumDiasLicRem(BigDecimal numDiasLicRem) {
        this.numDiasLicRem = numDiasLicRem;
   }

   public BigDecimal getNuOcor() {
        return nuOcor;
   }

   public void setNuOcor(BigDecimal nuOcor) {
        this.nuOcor = nuOcor;
   }

   public BigDecimal getQtdParcelas() {
        return qtdParcelas;
   }

   public void setQtdParcelas(BigDecimal qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        this.referencia = referencia;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public String getAprovado() {
        return aprovado;
   }

   public void setAprovado(String aprovado) {
        this.aprovado = aprovado;
   }

   public BigDecimal getSaldoDias() {
        return saldoDias;
   }

   public void setSaldoDias(BigDecimal saldoDias) {
        this.saldoDias = saldoDias;
   }

   public BigDecimal getQtdDiasSolFerias() {
        return qtdDiasSolFerias;
   }

   public void setQtdDiasSolFerias(BigDecimal qtdDiasSolFerias) {
        this.qtdDiasSolFerias = qtdDiasSolFerias;
   }

   public Timestamp getDtLimGozFer() {
        return dtLimGozFer;
   }

   public void setDtLimGozFer(Timestamp dtLimGozFer) {
        this.dtLimGozFer = dtLimGozFer;
   }

   public BigDecimal getCodFervinc() {
        return codFervinc;
   }

   public void setCodFervinc(BigDecimal codFervinc) {
        this.codFervinc = codFervinc;
   }

   public BigDecimal getNumDiasFerReal() {
        return numDiasFerReal;
   }

   public void setNumDiasFerReal(BigDecimal numDiasFerReal) {
        this.numDiasFerReal = numDiasFerReal;
   }

   public BigDecimal getNumDiasLicRemReal() {
        return numDiasLicRemReal;
   }

   public void setNumDiasLicRemReal(BigDecimal numDiasLicRemReal) {
        this.numDiasLicRemReal = numDiasLicRemReal;
   }

   public String getPerQuitado() {
        return perQuitado;
   }

   public void setPerQuitado(String perQuitado) {
        this.perQuitado = perQuitado;
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
        this.abonoInicio = vo.asString("ABONOINICIO");
        this.abonoPec = vo.asBigDecimal("ABONOPEC");
        this.atualFergoz = vo.asString("ATUALFERGOZ");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtFinAqui = vo.asTimestamp("DTFINAQUI");
        this.dtIniAqui = vo.asTimestamp("DTINIAQUI");
        this.dtPrevista = vo.asTimestamp("DTPREVISTA");
        this.dtSaida = vo.asTimestamp("DTSAIDA");
        this.faltPer = vo.asBigDecimal("FALTPER");
        this.numDiasFer = vo.asBigDecimal("NUMDIASFER");
        this.numDiasFerCol = vo.asBigDecimal("NUMDIASFERCOL");
        this.numDiasLicRem = vo.asBigDecimal("NUMDIASLICREM");
        this.nuOcor = vo.asBigDecimal("NUOCOR");
        this.qtdParcelas = vo.asBigDecimal("QTDPARCELAS");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.digitado = vo.asString("DIGITADO");
        this.aprovado = vo.asString("APROVADO");
        this.saldoDias = vo.asBigDecimal("SALDODIAS");
        this.qtdDiasSolFerias = vo.asBigDecimal("QTDDIASSOLFERIAS");
        this.dtLimGozFer = vo.asTimestamp("DTLIMGOZFER");
        this.codFervinc = vo.asBigDecimal("CODFERVINC");
        this.numDiasFerReal = vo.asBigDecimal("NUMDIASFERREAL");
        this.numDiasLicRemReal = vo.asBigDecimal("NUMDIASLICREMREAL");
        this.perQuitado = vo.asString("PERQUITADO");
        return this;
   }
}
