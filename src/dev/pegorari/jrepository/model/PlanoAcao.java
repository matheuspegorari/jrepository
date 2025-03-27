package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PlanoAcao extends AbstractSankhyaEntity<PlanoAcao> {
   public BigDecimal getCodExe() {
        return this.getVo().asBigDecimal("CODEXE");
   }

   public void setCodExe(BigDecimal codExe) {
        markAsChanged("CODEXE", codExe);
   }

   public BigDecimal getCompletude() {
        return this.getVo().asBigDecimal("COMPLETUDE");
   }

   public void setCompletude(BigDecimal completude) {
        markAsChanged("COMPLETUDE", completude);
   }

   public String getEsforcoPrevisto() {
        return this.getVo().asString("ESFORCOPREVISTO");
   }

   public void setEsforcoPrevisto(String esforcoPrevisto) {
        markAsChanged("ESFORCOPREVISTO", esforcoPrevisto);
   }

   public String getEsforcoRealizado() {
        return this.getVo().asString("ESFORCOREALIZADO");
   }

   public void setEsforcoRealizado(String esforcoRealizado) {
        markAsChanged("ESFORCOREALIZADO", esforcoRealizado);
   }

   public BigDecimal getCodPla() {
        return this.getVo().asBigDecimal("CODPLA");
   }

   public void setCodPla(BigDecimal codPla) {
        markAsChanged("CODPLA", codPla);
   }

   public BigDecimal getCodUng() {
        return this.getVo().asBigDecimal("CODUNG");
   }

   public void setCodUng(BigDecimal codUng) {
        markAsChanged("CODUNG", codUng);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuExec() {
        return this.getVo().asBigDecimal("CODUSUEXEC");
   }

   public void setCodUsuExec(BigDecimal codUsuExec) {
        markAsChanged("CODUSUEXEC", codUsuExec);
   }

   public String getComo() {
        return this.getVo().asString("COMO");
   }

   public void setComo(String como) {
        markAsChanged("COMO", como);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDtFimPrevisto() {
        return this.getVo().asTimestamp("DTFIMPREVISTO");
   }

   public void setDtFimPrevisto(Timestamp dtFimPrevisto) {
        markAsChanged("DTFIMPREVISTO", dtFimPrevisto);
   }

   public Timestamp getDtFimRealizado() {
        return this.getVo().asTimestamp("DTFIMREALIZADO");
   }

   public void setDtFimRealizado(Timestamp dtFimRealizado) {
        markAsChanged("DTFIMREALIZADO", dtFimRealizado);
   }

   public Timestamp getDtIniPrevisto() {
        return this.getVo().asTimestamp("DTINIPREVISTO");
   }

   public void setDtIniPrevisto(Timestamp dtIniPrevisto) {
        markAsChanged("DTINIPREVISTO", dtIniPrevisto);
   }

   public Timestamp getDtIniRealizado() {
        return this.getVo().asTimestamp("DTINIREALIZADO");
   }

   public void setDtIniRealizado(Timestamp dtIniRealizado) {
        markAsChanged("DTINIREALIZADO", dtIniRealizado);
   }

   public Timestamp getDtPla() {
        return this.getVo().asTimestamp("DTPLA");
   }

   public void setDtPla(Timestamp dtPla) {
        markAsChanged("DTPLA", dtPla);
   }

   public BigDecimal getNumEt() {
        return this.getVo().asBigDecimal("NUMET");
   }

   public void setNumEt(BigDecimal numEt) {
        markAsChanged("NUMET", numEt);
   }

   public BigDecimal getNumOs() {
        return this.getVo().asBigDecimal("NUMOS");
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
   }

   public String getObs() {
        return this.getVo().asString("OBS");
   }

   public void setObs(String obs) {
        markAsChanged("OBS", obs);
   }

   public String getOnde() {
        return this.getVo().asString("ONDE");
   }

   public void setOnde(String onde) {
        markAsChanged("ONDE", onde);
   }

   public String getOque() {
        return this.getVo().asString("OQUE");
   }

   public void setOque(String oque) {
        markAsChanged("OQUE", oque);
   }

   public String getPorque() {
        return this.getVo().asString("PORQUE");
   }

   public void setPorque(String porque) {
        markAsChanged("PORQUE", porque);
   }

   public String getQuanto() {
        return this.getVo().asString("QUANTO");
   }

   public void setQuanto(String quanto) {
        markAsChanged("QUANTO", quanto);
   }

   public String getRetorno() {
        return this.getVo().asString("RETORNO");
   }

   public void setRetorno(String retorno) {
        markAsChanged("RETORNO", retorno);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public BigDecimal getCodUsuAlter() {
        return this.getVo().asBigDecimal("CODUSUALTER");
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        markAsChanged("CODUSUALTER", codUsuAlter);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
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
        return this;
   }
}
