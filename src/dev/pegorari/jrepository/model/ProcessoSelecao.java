package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProcessoSelecao extends AbstractSankhyaEntity<ProcessoSelecao> {
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
        markAsChanged("NUREQUISICAO", nuRequisicao);
        this.nuRequisicao = nuRequisicao;
   }

   public BigDecimal getCodAnuncio() {
        return codAnuncio;
   }

   public void setCodAnuncio(BigDecimal codAnuncio) {
        markAsChanged("CODANUNCIO", codAnuncio);
        this.codAnuncio = codAnuncio;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuResponsavel() {
        return codUsuResponsavel;
   }

   public void setCodUsuResponsavel(BigDecimal codUsuResponsavel) {
        markAsChanged("CODUSURESPONSAVEL", codUsuResponsavel);
        this.codUsuResponsavel = codUsuResponsavel;
   }

   public String getDescrSelecao() {
        return descrSelecao;
   }

   public void setDescrSelecao(String descrSelecao) {
        markAsChanged("DESCRSELECAO", descrSelecao);
        this.descrSelecao = descrSelecao;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtInicio() {
        return dtInicio;
   }

   public void setDtInicio(Timestamp dtInicio) {
        markAsChanged("DTINICIO", dtInicio);
        this.dtInicio = dtInicio;
   }

   public Timestamp getDtPrevTermino() {
        return dtPrevTermino;
   }

   public void setDtPrevTermino(Timestamp dtPrevTermino) {
        markAsChanged("DTPREVTERMINO", dtPrevTermino);
        this.dtPrevTermino = dtPrevTermino;
   }

   public BigDecimal getNuSelecao() {
        return nuSelecao;
   }

   public void setNuSelecao(BigDecimal nuSelecao) {
        markAsChanged("NUSELECAO", nuSelecao);
        this.nuSelecao = nuSelecao;
   }

   public String getObs() {
        return obs;
   }

   public void setObs(String obs) {
        markAsChanged("OBS", obs);
        this.obs = obs;
   }

   public BigDecimal getSitSelecao() {
        return sitSelecao;
   }

   public void setSitSelecao(BigDecimal sitSelecao) {
        markAsChanged("SITSELECAO", sitSelecao);
        this.sitSelecao = sitSelecao;
   }

   public BigDecimal getQtdVagasPre() {
        return qtdVagasPre;
   }

   public void setQtdVagasPre(BigDecimal qtdVagasPre) {
        markAsChanged("QTDVAGASPRE", qtdVagasPre);
        this.qtdVagasPre = qtdVagasPre;
   }

   public BigDecimal getQtdVagasReq() {
        return qtdVagasReq;
   }

   public void setQtdVagasReq(BigDecimal qtdVagasReq) {
        markAsChanged("QTDVAGASREQ", qtdVagasReq);
        this.qtdVagasReq = qtdVagasReq;
   }

   public Timestamp getDtFechamento() {
        return dtFechamento;
   }

   public void setDtFechamento(Timestamp dtFechamento) {
        markAsChanged("DTFECHAMENTO", dtFechamento);
        this.dtFechamento = dtFechamento;
   }

   public String getPersonalizar() {
        return personalizar;
   }

   public void setPersonalizar(String personalizar) {
        markAsChanged("PERSONALIZAR", personalizar);
        this.personalizar = personalizar;
   }

   @Override
   public String getTableName() {
        return "TRSSEL";
   }

   @Override
   public String getEntityName() {
        return "ProcessoSelecao";
   }

   @Override
   public ProcessoSelecao fromVO(DynamicVO vo) {
        this.setVo(vo);
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
