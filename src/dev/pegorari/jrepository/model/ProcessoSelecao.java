package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProcessoSelecao implements SankhyaEntity<ProcessoSelecao> {

   private BigDecimal nuRequisicao;
   private BigDecimal codAnuncio;
   private BigDecimal codUsu;
   private BigDecimal codUsuResponsavel;
   private String descrSelecao;
   private Timestamp dtAlter;
   private Timestamp dtInicio;
   private Timestamp dtPrevTermino;
   private BigDecimal nuSelecao;
   private String obs;
   private BigDecimal sitSelecao;
   private BigDecimal qtdVagasPre;
   private BigDecimal qtdVagasReq;
   private Timestamp dtFechamento;
   private String personalizar;

   public BigDecimal getNuRequisicao() {
        return nuRequisicao;
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        this.nuRequisicao = nuRequisicao;
   }

   public BigDecimal getCodAnuncio() {
        return codAnuncio;
   }

   public void setCodAnuncio(BigDecimal codAnuncio) {
        this.codAnuncio = codAnuncio;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuResponsavel() {
        return codUsuResponsavel;
   }

   public void setCodUsuResponsavel(BigDecimal codUsuResponsavel) {
        this.codUsuResponsavel = codUsuResponsavel;
   }

   public String getDescrSelecao() {
        return descrSelecao;
   }

   public void setDescrSelecao(String descrSelecao) {
        this.descrSelecao = descrSelecao;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtInicio() {
        return dtInicio;
   }

   public void setDtInicio(Timestamp dtInicio) {
        this.dtInicio = dtInicio;
   }

   public Timestamp getDtPrevTermino() {
        return dtPrevTermino;
   }

   public void setDtPrevTermino(Timestamp dtPrevTermino) {
        this.dtPrevTermino = dtPrevTermino;
   }

   public BigDecimal getNuSelecao() {
        return nuSelecao;
   }

   public void setNuSelecao(BigDecimal nuSelecao) {
        this.nuSelecao = nuSelecao;
   }

   public String getObs() {
        return obs;
   }

   public void setObs(String obs) {
        this.obs = obs;
   }

   public BigDecimal getSitSelecao() {
        return sitSelecao;
   }

   public void setSitSelecao(BigDecimal sitSelecao) {
        this.sitSelecao = sitSelecao;
   }

   public BigDecimal getQtdVagasPre() {
        return qtdVagasPre;
   }

   public void setQtdVagasPre(BigDecimal qtdVagasPre) {
        this.qtdVagasPre = qtdVagasPre;
   }

   public BigDecimal getQtdVagasReq() {
        return qtdVagasReq;
   }

   public void setQtdVagasReq(BigDecimal qtdVagasReq) {
        this.qtdVagasReq = qtdVagasReq;
   }

   public Timestamp getDtFechamento() {
        return dtFechamento;
   }

   public void setDtFechamento(Timestamp dtFechamento) {
        this.dtFechamento = dtFechamento;
   }

   public String getPersonalizar() {
        return personalizar;
   }

   public void setPersonalizar(String personalizar) {
        this.personalizar = personalizar;
   }

   @Override
   public String getEntityName() {
        return "ProcessoSelecao";
   }

   @Override
   public ProcessoSelecao fromVO(DynamicVO vo) {
        this.nuRequisicao = vo.asBigDecimal("NUREQUISICAO");
        this.codAnuncio = vo.asBigDecimal("CODANUNCIO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuResponsavel = vo.asBigDecimal("CODUSURESPONSAVEL");
        this.descrSelecao = vo.asString("DESCRSELECAO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtInicio = vo.asTimestamp("DTINICIO");
        this.dtPrevTermino = vo.asTimestamp("DTPREVTERMINO");
        this.nuSelecao = vo.asBigDecimal("NUSELECAO");
        this.obs = vo.asString("OBS");
        this.sitSelecao = vo.asBigDecimal("SITSELECAO");
        this.qtdVagasPre = vo.asBigDecimal("QTDVAGASPRE");
        this.qtdVagasReq = vo.asBigDecimal("QTDVAGASREQ");
        this.dtFechamento = vo.asTimestamp("DTFECHAMENTO");
        this.personalizar = vo.asString("PERSONALIZAR");
        return this;
   }
}
