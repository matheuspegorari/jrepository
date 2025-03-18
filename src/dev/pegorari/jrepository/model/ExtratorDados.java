package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExtratorDados extends AbstractSankhyaEntity<ExtratorDados> {
   private String ativo;
   private String categoria;
   private BigDecimal codExtracao;
   private String codificacao;
   private BigDecimal codUsu;
   private String compactar;
   private char[] consulta;
   private String descricao;
   private String destinoArquivo;
   private Timestamp dhAlter;
   private Timestamp dhUltExec;
   private String expGatilho;
   private String fonteDados;
   private String formato;
   private String incluirData;
   private String incluirHora;
   private char[] logErro;
   private String nomeArquivo;
   private String status;
   private BigDecimal tempoProcessamento;
   private String tipGatilho;
   private String tipIntervalo;
   private BigDecimal vlrIntervalo;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public String getCategoria() {
        return categoria;
   }

   public void setCategoria(String categoria) {
        markAsChanged("CATEGORIA", categoria);
        this.categoria = categoria;
   }

   public BigDecimal getCodExtracao() {
        return codExtracao;
   }

   public void setCodExtracao(BigDecimal codExtracao) {
        markAsChanged("CODEXTRACAO", codExtracao);
        this.codExtracao = codExtracao;
   }

   public String getCodificacao() {
        return codificacao;
   }

   public void setCodificacao(String codificacao) {
        markAsChanged("CODIFICACAO", codificacao);
        this.codificacao = codificacao;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getCompactar() {
        return compactar;
   }

   public void setCompactar(String compactar) {
        markAsChanged("COMPACTAR", compactar);
        this.compactar = compactar;
   }

   public char[] getConsulta() {
        return consulta;
   }

   public void setConsulta(char[] consulta) {
        markAsChanged("CONSULTA", consulta);
        this.consulta = consulta;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getDestinoArquivo() {
        return destinoArquivo;
   }

   public void setDestinoArquivo(String destinoArquivo) {
        markAsChanged("DESTINOARQUIVO", destinoArquivo);
        this.destinoArquivo = destinoArquivo;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
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

   public String getFormato() {
        return formato;
   }

   public void setFormato(String formato) {
        markAsChanged("FORMATO", formato);
        this.formato = formato;
   }

   public String getIncluirData() {
        return incluirData;
   }

   public void setIncluirData(String incluirData) {
        markAsChanged("INCLUIRDATA", incluirData);
        this.incluirData = incluirData;
   }

   public String getIncluirHora() {
        return incluirHora;
   }

   public void setIncluirHora(String incluirHora) {
        markAsChanged("INCLUIRHORA", incluirHora);
        this.incluirHora = incluirHora;
   }

   public char[] getLogErro() {
        return logErro;
   }

   public void setLogErro(char[] logErro) {
        markAsChanged("LOGERRO", logErro);
        this.logErro = logErro;
   }

   public String getNomeArquivo() {
        return nomeArquivo;
   }

   public void setNomeArquivo(String nomeArquivo) {
        markAsChanged("NOMEARQUIVO", nomeArquivo);
        this.nomeArquivo = nomeArquivo;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public BigDecimal getTempoProcessamento() {
        return tempoProcessamento;
   }

   public void setTempoProcessamento(BigDecimal tempoProcessamento) {
        markAsChanged("TEMPOPROCESSAMENTO", tempoProcessamento);
        this.tempoProcessamento = tempoProcessamento;
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

   public BigDecimal getVlrIntervalo() {
        return vlrIntervalo;
   }

   public void setVlrIntervalo(BigDecimal vlrIntervalo) {
        markAsChanged("VLRINTERVALO", vlrIntervalo);
        this.vlrIntervalo = vlrIntervalo;
   }

   @Override
   public String getTableName() {
        return "TSIEXT";
   }

   @Override
   public String getEntityName() {
        return "ExtratorDados";
   }

   @Override
   public ExtratorDados fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.ativo = vo.asString("ATIVO");
        this.categoria = vo.asString("CATEGORIA");
        this.codExtracao = vo.asBigDecimal("CODEXTRACAO");
        this.codificacao = vo.asString("CODIFICACAO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.compactar = vo.asString("COMPACTAR");
        this.consulta = vo.asClob("CONSULTA");
        this.descricao = vo.asString("DESCRICAO");
        this.destinoArquivo = vo.asString("DESTINOARQUIVO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhUltExec = vo.asTimestamp("DHULTEXEC");
        this.expGatilho = vo.asString("EXPGATILHO");
        this.fonteDados = vo.asString("FONTEDADOS");
        this.formato = vo.asString("FORMATO");
        this.incluirData = vo.asString("INCLUIRDATA");
        this.incluirHora = vo.asString("INCLUIRHORA");
        this.logErro = vo.asClob("LOGERRO");
        this.nomeArquivo = vo.asString("NOMEARQUIVO");
        this.status = vo.asString("STATUS");
        this.tempoProcessamento = vo.asBigDecimal("TEMPOPROCESSAMENTO");
        this.tipGatilho = vo.asString("TIPGATILHO");
        this.tipIntervalo = vo.asString("TIPINTERVALO");
        this.vlrIntervalo = vo.asBigDecimal("VLRINTERVALO");
        return this;
   }
}
