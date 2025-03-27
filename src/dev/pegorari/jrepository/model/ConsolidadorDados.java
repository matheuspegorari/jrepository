package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConsolidadorDados extends AbstractSankhyaEntity<ConsolidadorDados> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodConsolidacao() {
        return this.getVo().asBigDecimal("CODCONSOLIDACAO");
   }

   public void setCodConsolidacao(BigDecimal codConsolidacao) {
        markAsChanged("CODCONSOLIDACAO", codConsolidacao);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public char[] getConsulta() {
        return this.getVo().asClob("CONSULTA");
   }

   public void setConsulta(char[] consulta) {
        markAsChanged("CONSULTA", consulta);
   }

   public Timestamp getDataInicial() {
        return this.getVo().asTimestamp("DATAINICIAL");
   }

   public void setDataInicial(Timestamp dataInicial) {
        markAsChanged("DATAINICIAL", dataInicial);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDhProxExec() {
        return this.getVo().asTimestamp("DHPROXEXEC");
   }

   public void setDhProxExec(Timestamp dhProxExec) {
        markAsChanged("DHPROXEXEC", dhProxExec);
   }

   public Timestamp getDhUltExec() {
        return this.getVo().asTimestamp("DHULTEXEC");
   }

   public void setDhUltExec(Timestamp dhUltExec) {
        markAsChanged("DHULTEXEC", dhUltExec);
   }

   public String getExpGatilho() {
        return this.getVo().asString("EXPGATILHO");
   }

   public void setExpGatilho(String expGatilho) {
        markAsChanged("EXPGATILHO", expGatilho);
   }

   public String getFonteDados() {
        return this.getVo().asString("FONTEDADOS");
   }

   public void setFonteDados(String fonteDados) {
        markAsChanged("FONTEDADOS", fonteDados);
   }

   public String getInvalido() {
        return this.getVo().asString("INVALIDO");
   }

   public void setInvalido(String invalido) {
        markAsChanged("INVALIDO", invalido);
   }

   public String getLogErro() {
        return this.getVo().asString("LOG_ERRO");
   }

   public void setLogErro(String logErro) {
        markAsChanged("LOG_ERRO", logErro);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public BigDecimal getQtdMesesConsolidar() {
        return this.getVo().asBigDecimal("QTDMESESCONSOLIDAR");
   }

   public void setQtdMesesConsolidar(BigDecimal qtdMesesConsolidar) {
        markAsChanged("QTDMESESCONSOLIDAR", qtdMesesConsolidar);
   }

   public BigDecimal getQtdMesesRetroagir() {
        return this.getVo().asBigDecimal("QTDMESESRETROAGIR");
   }

   public void setQtdMesesRetroagir(BigDecimal qtdMesesRetroagir) {
        markAsChanged("QTDMESESRETROAGIR", qtdMesesRetroagir);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public String getTabela() {
        return this.getVo().asString("TABELA");
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
   }

   public BigDecimal getTempoProcessamento() {
        return this.getVo().asBigDecimal("TEMPOPROCESSAMENTO");
   }

   public void setTempoProcessamento(BigDecimal tempoProcessamento) {
        markAsChanged("TEMPOPROCESSAMENTO", tempoProcessamento);
   }

   public BigDecimal getTipConsolidacao() {
        return this.getVo().asBigDecimal("TIPCONSOLIDACAO");
   }

   public void setTipConsolidacao(BigDecimal tipConsolidacao) {
        markAsChanged("TIPCONSOLIDACAO", tipConsolidacao);
   }

   public String getTipGatilho() {
        return this.getVo().asString("TIPGATILHO");
   }

   public void setTipGatilho(String tipGatilho) {
        markAsChanged("TIPGATILHO", tipGatilho);
   }

   public String getTipIntervalo() {
        return this.getVo().asString("TIPINTERVALO");
   }

   public void setTipIntervalo(String tipIntervalo) {
        markAsChanged("TIPINTERVALO", tipIntervalo);
   }

   public String getTipProcessamento() {
        return this.getVo().asString("TIPPROCESSAMENTO");
   }

   public void setTipProcessamento(String tipProcessamento) {
        markAsChanged("TIPPROCESSAMENTO", tipProcessamento);
   }

   public BigDecimal getVlrIntervalo() {
        return this.getVo().asBigDecimal("VLRINTERVALO");
   }

   public void setVlrIntervalo(BigDecimal vlrIntervalo) {
        markAsChanged("VLRINTERVALO", vlrIntervalo);
   }

   @Override
   public String getTableName() {
        return "TSICND";
   }

   @Override
   public String getEntityName() {
        return "ConsolidadorDados";
   }

   @Override
   public ConsolidadorDados fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
