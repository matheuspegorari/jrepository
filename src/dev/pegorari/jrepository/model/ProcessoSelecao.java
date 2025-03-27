package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProcessoSelecao extends AbstractSankhyaEntity<ProcessoSelecao> {
   public BigDecimal getNuRequisicao() {
        return this.getVo().asBigDecimal("NUREQUISICAO");
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        markAsChanged("NUREQUISICAO", nuRequisicao);
   }

   public BigDecimal getCodAnuncio() {
        return this.getVo().asBigDecimal("CODANUNCIO");
   }

   public void setCodAnuncio(BigDecimal codAnuncio) {
        markAsChanged("CODANUNCIO", codAnuncio);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuResponsavel() {
        return this.getVo().asBigDecimal("CODUSURESPONSAVEL");
   }

   public void setCodUsuResponsavel(BigDecimal codUsuResponsavel) {
        markAsChanged("CODUSURESPONSAVEL", codUsuResponsavel);
   }

   public String getDescrSelecao() {
        return this.getVo().asString("DESCRSELECAO");
   }

   public void setDescrSelecao(String descrSelecao) {
        markAsChanged("DESCRSELECAO", descrSelecao);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtInicio() {
        return this.getVo().asTimestamp("DTINICIO");
   }

   public void setDtInicio(Timestamp dtInicio) {
        markAsChanged("DTINICIO", dtInicio);
   }

   public Timestamp getDtPrevTermino() {
        return this.getVo().asTimestamp("DTPREVTERMINO");
   }

   public void setDtPrevTermino(Timestamp dtPrevTermino) {
        markAsChanged("DTPREVTERMINO", dtPrevTermino);
   }

   public BigDecimal getNuSelecao() {
        return this.getVo().asBigDecimal("NUSELECAO");
   }

   public void setNuSelecao(BigDecimal nuSelecao) {
        markAsChanged("NUSELECAO", nuSelecao);
   }

   public String getObs() {
        return this.getVo().asString("OBS");
   }

   public void setObs(String obs) {
        markAsChanged("OBS", obs);
   }

   public BigDecimal getSitSelecao() {
        return this.getVo().asBigDecimal("SITSELECAO");
   }

   public void setSitSelecao(BigDecimal sitSelecao) {
        markAsChanged("SITSELECAO", sitSelecao);
   }

   public BigDecimal getQtdVagasPre() {
        return this.getVo().asBigDecimal("QTDVAGASPRE");
   }

   public void setQtdVagasPre(BigDecimal qtdVagasPre) {
        markAsChanged("QTDVAGASPRE", qtdVagasPre);
   }

   public BigDecimal getQtdVagasReq() {
        return this.getVo().asBigDecimal("QTDVAGASREQ");
   }

   public void setQtdVagasReq(BigDecimal qtdVagasReq) {
        markAsChanged("QTDVAGASREQ", qtdVagasReq);
   }

   public Timestamp getDtFechamento() {
        return this.getVo().asTimestamp("DTFECHAMENTO");
   }

   public void setDtFechamento(Timestamp dtFechamento) {
        markAsChanged("DTFECHAMENTO", dtFechamento);
   }

   public String getPersonalizar() {
        return this.getVo().asString("PERSONALIZAR");
   }

   public void setPersonalizar(String personalizar) {
        markAsChanged("PERSONALIZAR", personalizar);
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
        return this;
   }
}
