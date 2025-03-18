package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class BloqueioFechamentoContabil extends AbstractSankhyaEntity<BloqueioFechamentoContabil> {
   private Timestamp dhInclusao;
   private Timestamp dtFechamentoBco;
   private Timestamp dtFechamentoCtb;
   private Timestamp dtFechamentoCus;
   private Timestamp dtFechamentoDesp;
   private Timestamp dtFechamentoFis;
   private Timestamp dtFechamentoRec;
   private Timestamp dtFechamentoSai;
   private BigDecimal nuBloqueio;
   private Timestamp referencia;
   private BigDecimal sequencia;
   private String tipoFechaCalcust;
   private String tipoFechaEstEnt;
   private String tipoFechaEstSai;
   private String tipoFechaFinDesp;
   private String tipoFechaFinRec;
   private String tipoFechaMovBco;
   private String tipoFechaMovCtb;
   private String tipoFechaMovFis;
   private Timestamp dtFechamentoEnt;
   private BigDecimal codEmp;
   private BigDecimal codUsu;
   private String refFixa;

   public Timestamp getDhInclusao() {
        return dhInclusao;
   }

   public void setDhInclusao(Timestamp dhInclusao) {
        markAsChanged("DHINCLUSAO", dhInclusao);
        this.dhInclusao = dhInclusao;
   }

   public Timestamp getDtFechamentoBco() {
        return dtFechamentoBco;
   }

   public void setDtFechamentoBco(Timestamp dtFechamentoBco) {
        markAsChanged("DTFECHAMENTOBCO", dtFechamentoBco);
        this.dtFechamentoBco = dtFechamentoBco;
   }

   public Timestamp getDtFechamentoCtb() {
        return dtFechamentoCtb;
   }

   public void setDtFechamentoCtb(Timestamp dtFechamentoCtb) {
        markAsChanged("DTFECHAMENTOCTB", dtFechamentoCtb);
        this.dtFechamentoCtb = dtFechamentoCtb;
   }

   public Timestamp getDtFechamentoCus() {
        return dtFechamentoCus;
   }

   public void setDtFechamentoCus(Timestamp dtFechamentoCus) {
        markAsChanged("DTFECHAMENTOCUS", dtFechamentoCus);
        this.dtFechamentoCus = dtFechamentoCus;
   }

   public Timestamp getDtFechamentoDesp() {
        return dtFechamentoDesp;
   }

   public void setDtFechamentoDesp(Timestamp dtFechamentoDesp) {
        markAsChanged("DTFECHAMENTODESP", dtFechamentoDesp);
        this.dtFechamentoDesp = dtFechamentoDesp;
   }

   public Timestamp getDtFechamentoFis() {
        return dtFechamentoFis;
   }

   public void setDtFechamentoFis(Timestamp dtFechamentoFis) {
        markAsChanged("DTFECHAMENTOFIS", dtFechamentoFis);
        this.dtFechamentoFis = dtFechamentoFis;
   }

   public Timestamp getDtFechamentoRec() {
        return dtFechamentoRec;
   }

   public void setDtFechamentoRec(Timestamp dtFechamentoRec) {
        markAsChanged("DTFECHAMENTOREC", dtFechamentoRec);
        this.dtFechamentoRec = dtFechamentoRec;
   }

   public Timestamp getDtFechamentoSai() {
        return dtFechamentoSai;
   }

   public void setDtFechamentoSai(Timestamp dtFechamentoSai) {
        markAsChanged("DTFECHAMENTOSAI", dtFechamentoSai);
        this.dtFechamentoSai = dtFechamentoSai;
   }

   public BigDecimal getNuBloqueio() {
        return nuBloqueio;
   }

   public void setNuBloqueio(BigDecimal nuBloqueio) {
        markAsChanged("NUBLOQUEIO", nuBloqueio);
        this.nuBloqueio = nuBloqueio;
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

   public String getTipoFechaCalcust() {
        return tipoFechaCalcust;
   }

   public void setTipoFechaCalcust(String tipoFechaCalcust) {
        markAsChanged("TIPOFECHACALCUST", tipoFechaCalcust);
        this.tipoFechaCalcust = tipoFechaCalcust;
   }

   public String getTipoFechaEstEnt() {
        return tipoFechaEstEnt;
   }

   public void setTipoFechaEstEnt(String tipoFechaEstEnt) {
        markAsChanged("TIPOFECHAESTENT", tipoFechaEstEnt);
        this.tipoFechaEstEnt = tipoFechaEstEnt;
   }

   public String getTipoFechaEstSai() {
        return tipoFechaEstSai;
   }

   public void setTipoFechaEstSai(String tipoFechaEstSai) {
        markAsChanged("TIPOFECHAESTSAI", tipoFechaEstSai);
        this.tipoFechaEstSai = tipoFechaEstSai;
   }

   public String getTipoFechaFinDesp() {
        return tipoFechaFinDesp;
   }

   public void setTipoFechaFinDesp(String tipoFechaFinDesp) {
        markAsChanged("TIPOFECHAFINDESP", tipoFechaFinDesp);
        this.tipoFechaFinDesp = tipoFechaFinDesp;
   }

   public String getTipoFechaFinRec() {
        return tipoFechaFinRec;
   }

   public void setTipoFechaFinRec(String tipoFechaFinRec) {
        markAsChanged("TIPOFECHAFINREC", tipoFechaFinRec);
        this.tipoFechaFinRec = tipoFechaFinRec;
   }

   public String getTipoFechaMovBco() {
        return tipoFechaMovBco;
   }

   public void setTipoFechaMovBco(String tipoFechaMovBco) {
        markAsChanged("TIPOFECHAMOVBCO", tipoFechaMovBco);
        this.tipoFechaMovBco = tipoFechaMovBco;
   }

   public String getTipoFechaMovCtb() {
        return tipoFechaMovCtb;
   }

   public void setTipoFechaMovCtb(String tipoFechaMovCtb) {
        markAsChanged("TIPOFECHAMOVCTB", tipoFechaMovCtb);
        this.tipoFechaMovCtb = tipoFechaMovCtb;
   }

   public String getTipoFechaMovFis() {
        return tipoFechaMovFis;
   }

   public void setTipoFechaMovFis(String tipoFechaMovFis) {
        markAsChanged("TIPOFECHAMOVFIS", tipoFechaMovFis);
        this.tipoFechaMovFis = tipoFechaMovFis;
   }

   public Timestamp getDtFechamentoEnt() {
        return dtFechamentoEnt;
   }

   public void setDtFechamentoEnt(Timestamp dtFechamentoEnt) {
        markAsChanged("DTFECHAMENTOENT", dtFechamentoEnt);
        this.dtFechamentoEnt = dtFechamentoEnt;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getRefFixa() {
        return refFixa;
   }

   public void setRefFixa(String refFixa) {
        markAsChanged("REFFIXA", refFixa);
        this.refFixa = refFixa;
   }

   @Override
   public String getTableName() {
        return "TCBBFC";
   }

   @Override
   public String getEntityName() {
        return "BloqueioFechamentoContabil";
   }

   @Override
   public BloqueioFechamentoContabil fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.dhInclusao = vo.asTimestamp("DHINCLUSAO");
        this.dtFechamentoBco = vo.asTimestamp("DTFECHAMENTOBCO");
        this.dtFechamentoCtb = vo.asTimestamp("DTFECHAMENTOCTB");
        this.dtFechamentoCus = vo.asTimestamp("DTFECHAMENTOCUS");
        this.dtFechamentoDesp = vo.asTimestamp("DTFECHAMENTODESP");
        this.dtFechamentoFis = vo.asTimestamp("DTFECHAMENTOFIS");
        this.dtFechamentoRec = vo.asTimestamp("DTFECHAMENTOREC");
        this.dtFechamentoSai = vo.asTimestamp("DTFECHAMENTOSAI");
        this.nuBloqueio = vo.asBigDecimal("NUBLOQUEIO");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipoFechaCalcust = vo.asString("TIPOFECHACALCUST");
        this.tipoFechaEstEnt = vo.asString("TIPOFECHAESTENT");
        this.tipoFechaEstSai = vo.asString("TIPOFECHAESTSAI");
        this.tipoFechaFinDesp = vo.asString("TIPOFECHAFINDESP");
        this.tipoFechaFinRec = vo.asString("TIPOFECHAFINREC");
        this.tipoFechaMovBco = vo.asString("TIPOFECHAMOVBCO");
        this.tipoFechaMovCtb = vo.asString("TIPOFECHAMOVCTB");
        this.tipoFechaMovFis = vo.asString("TIPOFECHAMOVFIS");
        this.dtFechamentoEnt = vo.asTimestamp("DTFECHAMENTOENT");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.refFixa = vo.asString("REFFIXA");
        return this;
   }
}
