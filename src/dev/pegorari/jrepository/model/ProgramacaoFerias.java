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
        markAsChanged("ABONOINICIO", abonoInicio);
        this.abonoInicio = abonoInicio;
   }

   public BigDecimal getAbonoPec() {
        return abonoPec;
   }

   public void setAbonoPec(BigDecimal abonoPec) {
        markAsChanged("ABONOPEC", abonoPec);
        this.abonoPec = abonoPec;
   }

   public String getAtualFergoz() {
        return atualFergoz;
   }

   public void setAtualFergoz(String atualFergoz) {
        markAsChanged("ATUALFERGOZ", atualFergoz);
        this.atualFergoz = atualFergoz;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
        this.codFunc = codFunc;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtFinAqui() {
        return dtFinAqui;
   }

   public void setDtFinAqui(Timestamp dtFinAqui) {
        markAsChanged("DTFINAQUI", dtFinAqui);
        this.dtFinAqui = dtFinAqui;
   }

   public Timestamp getDtIniAqui() {
        return dtIniAqui;
   }

   public void setDtIniAqui(Timestamp dtIniAqui) {
        markAsChanged("DTINIAQUI", dtIniAqui);
        this.dtIniAqui = dtIniAqui;
   }

   public Timestamp getDtPrevista() {
        return dtPrevista;
   }

   public void setDtPrevista(Timestamp dtPrevista) {
        markAsChanged("DTPREVISTA", dtPrevista);
        this.dtPrevista = dtPrevista;
   }

   public Timestamp getDtSaida() {
        return dtSaida;
   }

   public void setDtSaida(Timestamp dtSaida) {
        markAsChanged("DTSAIDA", dtSaida);
        this.dtSaida = dtSaida;
   }

   public BigDecimal getFaltPer() {
        return faltPer;
   }

   public void setFaltPer(BigDecimal faltPer) {
        markAsChanged("FALTPER", faltPer);
        this.faltPer = faltPer;
   }

   public BigDecimal getNumDiasFer() {
        return numDiasFer;
   }

   public void setNumDiasFer(BigDecimal numDiasFer) {
        markAsChanged("NUMDIASFER", numDiasFer);
        this.numDiasFer = numDiasFer;
   }

   public BigDecimal getNumDiasFerCol() {
        return numDiasFerCol;
   }

   public void setNumDiasFerCol(BigDecimal numDiasFerCol) {
        markAsChanged("NUMDIASFERCOL", numDiasFerCol);
        this.numDiasFerCol = numDiasFerCol;
   }

   public BigDecimal getNumDiasLicRem() {
        return numDiasLicRem;
   }

   public void setNumDiasLicRem(BigDecimal numDiasLicRem) {
        markAsChanged("NUMDIASLICREM", numDiasLicRem);
        this.numDiasLicRem = numDiasLicRem;
   }

   public BigDecimal getNuOcor() {
        return nuOcor;
   }

   public void setNuOcor(BigDecimal nuOcor) {
        markAsChanged("NUOCOR", nuOcor);
        this.nuOcor = nuOcor;
   }

   public BigDecimal getQtdParcelas() {
        return qtdParcelas;
   }

   public void setQtdParcelas(BigDecimal qtdParcelas) {
        markAsChanged("QTDPARCELAS", qtdParcelas);
        this.qtdParcelas = qtdParcelas;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
        this.digitado = digitado;
   }

   public String getAprovado() {
        return aprovado;
   }

   public void setAprovado(String aprovado) {
        markAsChanged("APROVADO", aprovado);
        this.aprovado = aprovado;
   }

   public BigDecimal getSaldoDias() {
        return saldoDias;
   }

   public void setSaldoDias(BigDecimal saldoDias) {
        markAsChanged("SALDODIAS", saldoDias);
        this.saldoDias = saldoDias;
   }

   public BigDecimal getQtdDiasSolFerias() {
        return qtdDiasSolFerias;
   }

   public void setQtdDiasSolFerias(BigDecimal qtdDiasSolFerias) {
        markAsChanged("QTDDIASSOLFERIAS", qtdDiasSolFerias);
        this.qtdDiasSolFerias = qtdDiasSolFerias;
   }

   public Timestamp getDtLimGozFer() {
        return dtLimGozFer;
   }

   public void setDtLimGozFer(Timestamp dtLimGozFer) {
        markAsChanged("DTLIMGOZFER", dtLimGozFer);
        this.dtLimGozFer = dtLimGozFer;
   }

   public BigDecimal getCodFervinc() {
        return codFervinc;
   }

   public void setCodFervinc(BigDecimal codFervinc) {
        markAsChanged("CODFERVINC", codFervinc);
        this.codFervinc = codFervinc;
   }

   public BigDecimal getNumDiasFerReal() {
        return numDiasFerReal;
   }

   public void setNumDiasFerReal(BigDecimal numDiasFerReal) {
        markAsChanged("NUMDIASFERREAL", numDiasFerReal);
        this.numDiasFerReal = numDiasFerReal;
   }

   public BigDecimal getNumDiasLicRemReal() {
        return numDiasLicRemReal;
   }

   public void setNumDiasLicRemReal(BigDecimal numDiasLicRemReal) {
        markAsChanged("NUMDIASLICREMREAL", numDiasLicRemReal);
        this.numDiasLicRemReal = numDiasLicRemReal;
   }

   public String getPerQuitado() {
        return perQuitado;
   }

   public void setPerQuitado(String perQuitado) {
        markAsChanged("PERQUITADO", perQuitado);
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
        this.setOriginalVO(vo);
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
