package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExtratorDados extends AbstractSankhyaEntity<ExtratorDados> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getCategoria() {
        return this.getVo().asString("CATEGORIA");
   }

   public void setCategoria(String categoria) {
        markAsChanged("CATEGORIA", categoria);
   }

   public BigDecimal getCodExtracao() {
        return this.getVo().asBigDecimal("CODEXTRACAO");
   }

   public void setCodExtracao(BigDecimal codExtracao) {
        markAsChanged("CODEXTRACAO", codExtracao);
   }

   public String getCodificacao() {
        return this.getVo().asString("CODIFICACAO");
   }

   public void setCodificacao(String codificacao) {
        markAsChanged("CODIFICACAO", codificacao);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getCompactar() {
        return this.getVo().asString("COMPACTAR");
   }

   public void setCompactar(String compactar) {
        markAsChanged("COMPACTAR", compactar);
   }

   public char[] getConsulta() {
        return this.getVo().asClob("CONSULTA");
   }

   public void setConsulta(char[] consulta) {
        markAsChanged("CONSULTA", consulta);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getDestinoArquivo() {
        return this.getVo().asString("DESTINOARQUIVO");
   }

   public void setDestinoArquivo(String destinoArquivo) {
        markAsChanged("DESTINOARQUIVO", destinoArquivo);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
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

   public String getFormato() {
        return this.getVo().asString("FORMATO");
   }

   public void setFormato(String formato) {
        markAsChanged("FORMATO", formato);
   }

   public String getIncluirData() {
        return this.getVo().asString("INCLUIRDATA");
   }

   public void setIncluirData(String incluirData) {
        markAsChanged("INCLUIRDATA", incluirData);
   }

   public String getIncluirHora() {
        return this.getVo().asString("INCLUIRHORA");
   }

   public void setIncluirHora(String incluirHora) {
        markAsChanged("INCLUIRHORA", incluirHora);
   }

   public char[] getLogErro() {
        return this.getVo().asClob("LOGERRO");
   }

   public void setLogErro(char[] logErro) {
        markAsChanged("LOGERRO", logErro);
   }

   public String getNomeArquivo() {
        return this.getVo().asString("NOMEARQUIVO");
   }

   public void setNomeArquivo(String nomeArquivo) {
        markAsChanged("NOMEARQUIVO", nomeArquivo);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public BigDecimal getTempoProcessamento() {
        return this.getVo().asBigDecimal("TEMPOPROCESSAMENTO");
   }

   public void setTempoProcessamento(BigDecimal tempoProcessamento) {
        markAsChanged("TEMPOPROCESSAMENTO", tempoProcessamento);
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

   public BigDecimal getVlrIntervalo() {
        return this.getVo().asBigDecimal("VLRINTERVALO");
   }

   public void setVlrIntervalo(BigDecimal vlrIntervalo) {
        markAsChanged("VLRINTERVALO", vlrIntervalo);
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
        this.setVo(vo);
        return this;
   }
}
