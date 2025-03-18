package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConsolidadorDados extends AbstractSankhyaEntity<ConsolidadorDados> {
   private String ativo;
   private BigDecimal codConsolidacao;
   private BigDecimal codUsu;
   private char[] consulta;
   private Timestamp dataInicial;
   private String descricao;
   private Timestamp dhAlter;
   private Timestamp dhProxExec;
   private Timestamp dhUltExec;
   private String expGatilho;
   private String fonteDados;
   private String invalido;
   private String logErro;
   private String observacao;
   private BigDecimal qtdMesesConsolidar;
   private BigDecimal qtdMesesRetroagir;
   private String status;
   private String tabela;
   private BigDecimal tempoProcessamento;
   private BigDecimal tipConsolidacao;
   private String tipGatilho;
   private String tipIntervalo;
   private String tipProcessamento;
   private BigDecimal vlrIntervalo;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodConsolidacao() {
        return codConsolidacao;
   }

   public void setCodConsolidacao(BigDecimal codConsolidacao) {
        markAsChanged("CODCONSOLIDACAO", codConsolidacao);
        this.codConsolidacao = codConsolidacao;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public char[] getConsulta() {
        return consulta;
   }

   public void setConsulta(char[] consulta) {
        markAsChanged("CONSULTA", consulta);
        this.consulta = consulta;
   }

   public Timestamp getDataInicial() {
        return dataInicial;
   }

   public void setDataInicial(Timestamp dataInicial) {
        markAsChanged("DATAINICIAL", dataInicial);
        this.dataInicial = dataInicial;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhProxExec() {
        return dhProxExec;
   }

   public void setDhProxExec(Timestamp dhProxExec) {
        markAsChanged("DHPROXEXEC", dhProxExec);
        this.dhProxExec = dhProxExec;
   }

   public Timestamp getDhUltExec() {
        return dhUltExec;
   }

   public void setDhUltExec(Timestamp dhUltExec) {
        markAsChanged("DHULTEXEC", dhUltExec);
        this.dhUltExec = dhUltExec;
   }

   public String getExpGatilho() {
        return expGatilho;
   }

   public void setExpGatilho(String expGatilho) {
        markAsChanged("EXPGATILHO", expGatilho);
        this.expGatilho = expGatilho;
   }

   public String getFonteDados() {
        return fonteDados;
   }

   public void setFonteDados(String fonteDados) {
        markAsChanged("FONTEDADOS", fonteDados);
        this.fonteDados = fonteDados;
   }

   public String getInvalido() {
        return invalido;
   }

   public void setInvalido(String invalido) {
        markAsChanged("INVALIDO", invalido);
        this.invalido = invalido;
   }

   public String getLogErro() {
        return logErro;
   }

   public void setLogErro(String logErro) {
        markAsChanged("LOG_ERRO", logErro);
        this.logErro = logErro;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public BigDecimal getQtdMesesConsolidar() {
        return qtdMesesConsolidar;
   }

   public void setQtdMesesConsolidar(BigDecimal qtdMesesConsolidar) {
        markAsChanged("QTDMESESCONSOLIDAR", qtdMesesConsolidar);
        this.qtdMesesConsolidar = qtdMesesConsolidar;
   }

   public BigDecimal getQtdMesesRetroagir() {
        return qtdMesesRetroagir;
   }

   public void setQtdMesesRetroagir(BigDecimal qtdMesesRetroagir) {
        markAsChanged("QTDMESESRETROAGIR", qtdMesesRetroagir);
        this.qtdMesesRetroagir = qtdMesesRetroagir;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public String getTabela() {
        return tabela;
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
        this.tabela = tabela;
   }

   public BigDecimal getTempoProcessamento() {
        return tempoProcessamento;
   }

   public void setTempoProcessamento(BigDecimal tempoProcessamento) {
        markAsChanged("TEMPOPROCESSAMENTO", tempoProcessamento);
        this.tempoProcessamento = tempoProcessamento;
   }

   public BigDecimal getTipConsolidacao() {
        return tipConsolidacao;
   }

   public void setTipConsolidacao(BigDecimal tipConsolidacao) {
        markAsChanged("TIPCONSOLIDACAO", tipConsolidacao);
        this.tipConsolidacao = tipConsolidacao;
   }

   public String getTipGatilho() {
        return tipGatilho;
   }

   public void setTipGatilho(String tipGatilho) {
        markAsChanged("TIPGATILHO", tipGatilho);
        this.tipGatilho = tipGatilho;
   }

   public String getTipIntervalo() {
        return tipIntervalo;
   }

   public void setTipIntervalo(String tipIntervalo) {
        markAsChanged("TIPINTERVALO", tipIntervalo);
        this.tipIntervalo = tipIntervalo;
   }

   public String getTipProcessamento() {
        return tipProcessamento;
   }

   public void setTipProcessamento(String tipProcessamento) {
        markAsChanged("TIPPROCESSAMENTO", tipProcessamento);
        this.tipProcessamento = tipProcessamento;
   }

   public BigDecimal getVlrIntervalo() {
        return vlrIntervalo;
   }

   public void setVlrIntervalo(BigDecimal vlrIntervalo) {
        markAsChanged("VLRINTERVALO", vlrIntervalo);
        this.vlrIntervalo = vlrIntervalo;
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
        this.setOriginalVO(vo);
        this.ativo = vo.asString("ATIVO");
        this.codConsolidacao = vo.asBigDecimal("CODCONSOLIDACAO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.consulta = vo.asClob("CONSULTA");
        this.dataInicial = vo.asTimestamp("DATAINICIAL");
        this.descricao = vo.asString("DESCRICAO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhProxExec = vo.asTimestamp("DHPROXEXEC");
        this.dhUltExec = vo.asTimestamp("DHULTEXEC");
        this.expGatilho = vo.asString("EXPGATILHO");
        this.fonteDados = vo.asString("FONTEDADOS");
        this.invalido = vo.asString("INVALIDO");
        this.logErro = vo.asString("LOG_ERRO");
        this.observacao = vo.asString("OBSERVACAO");
        this.qtdMesesConsolidar = vo.asBigDecimal("QTDMESESCONSOLIDAR");
        this.qtdMesesRetroagir = vo.asBigDecimal("QTDMESESRETROAGIR");
        this.status = vo.asString("STATUS");
        this.tabela = vo.asString("TABELA");
        this.tempoProcessamento = vo.asBigDecimal("TEMPOPROCESSAMENTO");
        this.tipConsolidacao = vo.asBigDecimal("TIPCONSOLIDACAO");
        this.tipGatilho = vo.asString("TIPGATILHO");
        this.tipIntervalo = vo.asString("TIPINTERVALO");
        this.tipProcessamento = vo.asString("TIPPROCESSAMENTO");
        this.vlrIntervalo = vo.asBigDecimal("VLRINTERVALO");
        return this;
   }
}
