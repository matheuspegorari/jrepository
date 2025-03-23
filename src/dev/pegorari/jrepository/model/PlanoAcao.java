package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PlanoAcao extends AbstractSankhyaEntity<PlanoAcao> {
   private BigDecimal codExe;
   private BigDecimal completude;
   private String esforcoPrevisto;
   private String esforcoRealizado;
   private BigDecimal codPla;
   private BigDecimal codUng;
   private BigDecimal codUsu;
   private BigDecimal codUsuExec;
   private String como;
   private String descricao;
   private Timestamp dtFimPrevisto;
   private Timestamp dtFimRealizado;
   private Timestamp dtIniPrevisto;
   private Timestamp dtIniRealizado;
   private Timestamp dtPla;
   private BigDecimal numEt;
   private BigDecimal numOs;
   private String obs;
   private String onde;
   private String oque;
   private String porque;
   private String quanto;
   private String retorno;
   private String status;
   private BigDecimal codUsuAlter;
   private Timestamp dhAlter;

   public BigDecimal getCodExe() {
        return codExe;
   }

   public void setCodExe(BigDecimal codExe) {
        markAsChanged("CODEXE", codExe);
        this.codExe = codExe;
   }

   public BigDecimal getCompletude() {
        return completude;
   }

   public void setCompletude(BigDecimal completude) {
        markAsChanged("COMPLETUDE", completude);
        this.completude = completude;
   }

   public String getEsforcoPrevisto() {
        return esforcoPrevisto;
   }

   public void setEsforcoPrevisto(String esforcoPrevisto) {
        markAsChanged("ESFORCOPREVISTO", esforcoPrevisto);
        this.esforcoPrevisto = esforcoPrevisto;
   }

   public String getEsforcoRealizado() {
        return esforcoRealizado;
   }

   public void setEsforcoRealizado(String esforcoRealizado) {
        markAsChanged("ESFORCOREALIZADO", esforcoRealizado);
        this.esforcoRealizado = esforcoRealizado;
   }

   public BigDecimal getCodPla() {
        return codPla;
   }

   public void setCodPla(BigDecimal codPla) {
        markAsChanged("CODPLA", codPla);
        this.codPla = codPla;
   }

   public BigDecimal getCodUng() {
        return codUng;
   }

   public void setCodUng(BigDecimal codUng) {
        markAsChanged("CODUNG", codUng);
        this.codUng = codUng;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuExec() {
        return codUsuExec;
   }

   public void setCodUsuExec(BigDecimal codUsuExec) {
        markAsChanged("CODUSUEXEC", codUsuExec);
        this.codUsuExec = codUsuExec;
   }

   public String getComo() {
        return como;
   }

   public void setComo(String como) {
        markAsChanged("COMO", como);
        this.como = como;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public Timestamp getDtFimPrevisto() {
        return dtFimPrevisto;
   }

   public void setDtFimPrevisto(Timestamp dtFimPrevisto) {
        markAsChanged("DTFIMPREVISTO", dtFimPrevisto);
        this.dtFimPrevisto = dtFimPrevisto;
   }

   public Timestamp getDtFimRealizado() {
        return dtFimRealizado;
   }

   public void setDtFimRealizado(Timestamp dtFimRealizado) {
        markAsChanged("DTFIMREALIZADO", dtFimRealizado);
        this.dtFimRealizado = dtFimRealizado;
   }

   public Timestamp getDtIniPrevisto() {
        return dtIniPrevisto;
   }

   public void setDtIniPrevisto(Timestamp dtIniPrevisto) {
        markAsChanged("DTINIPREVISTO", dtIniPrevisto);
        this.dtIniPrevisto = dtIniPrevisto;
   }

   public Timestamp getDtIniRealizado() {
        return dtIniRealizado;
   }

   public void setDtIniRealizado(Timestamp dtIniRealizado) {
        markAsChanged("DTINIREALIZADO", dtIniRealizado);
        this.dtIniRealizado = dtIniRealizado;
   }

   public Timestamp getDtPla() {
        return dtPla;
   }

   public void setDtPla(Timestamp dtPla) {
        markAsChanged("DTPLA", dtPla);
        this.dtPla = dtPla;
   }

   public BigDecimal getNumEt() {
        return numEt;
   }

   public void setNumEt(BigDecimal numEt) {
        markAsChanged("NUMET", numEt);
        this.numEt = numEt;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
        this.numOs = numOs;
   }

   public String getObs() {
        return obs;
   }

   public void setObs(String obs) {
        markAsChanged("OBS", obs);
        this.obs = obs;
   }

   public String getOnde() {
        return onde;
   }

   public void setOnde(String onde) {
        markAsChanged("ONDE", onde);
        this.onde = onde;
   }

   public String getOque() {
        return oque;
   }

   public void setOque(String oque) {
        markAsChanged("OQUE", oque);
        this.oque = oque;
   }

   public String getPorque() {
        return porque;
   }

   public void setPorque(String porque) {
        markAsChanged("PORQUE", porque);
        this.porque = porque;
   }

   public String getQuanto() {
        return quanto;
   }

   public void setQuanto(String quanto) {
        markAsChanged("QUANTO", quanto);
        this.quanto = quanto;
   }

   public String getRetorno() {
        return retorno;
   }

   public void setRetorno(String retorno) {
        markAsChanged("RETORNO", retorno);
        this.retorno = retorno;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public BigDecimal getCodUsuAlter() {
        return codUsuAlter;
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        markAsChanged("CODUSUALTER", codUsuAlter);
        this.codUsuAlter = codUsuAlter;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   @Override
   public String getTableName() {
        return "TMIPLA";
   }

   @Override
   public String getEntityName() {
        return "PlanoAcao";
   }

   @Override
   public PlanoAcao fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codExe = vo.asBigDecimal("CODEXE");
        this.completude = vo.asBigDecimal("COMPLETUDE");
        this.esforcoPrevisto = vo.asString("ESFORCOPREVISTO");
        this.esforcoRealizado = vo.asString("ESFORCOREALIZADO");
        this.codPla = vo.asBigDecimal("CODPLA");
        this.codUng = vo.asBigDecimal("CODUNG");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuExec = vo.asBigDecimal("CODUSUEXEC");
        this.como = vo.asString("COMO");
        this.descricao = vo.asString("DESCRICAO");
        this.dtFimPrevisto = vo.asTimestamp("DTFIMPREVISTO");
        this.dtFimRealizado = vo.asTimestamp("DTFIMREALIZADO");
        this.dtIniPrevisto = vo.asTimestamp("DTINIPREVISTO");
        this.dtIniRealizado = vo.asTimestamp("DTINIREALIZADO");
        this.dtPla = vo.asTimestamp("DTPLA");
        this.numEt = vo.asBigDecimal("NUMET");
        this.numOs = vo.asBigDecimal("NUMOS");
        this.obs = vo.asString("OBS");
        this.onde = vo.asString("ONDE");
        this.oque = vo.asString("OQUE");
        this.porque = vo.asString("PORQUE");
        this.quanto = vo.asString("QUANTO");
        this.retorno = vo.asString("RETORNO");
        this.status = vo.asString("STATUS");
        this.codUsuAlter = vo.asBigDecimal("CODUSUALTER");
        this.dhAlter = vo.asTimestamp("DHALTER");
        return this;
   }
}
