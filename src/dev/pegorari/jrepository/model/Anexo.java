package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Anexo implements SankhyaEntity<Anexo> {

   private String arquivo;
   private BigDecimal coData;
   private BigDecimal codEmp;
   private BigDecimal codUsu;
   private byte[] conteudo;
   private String descricao;
   private Timestamp dtAlter;
   private Timestamp dtExpira;
   private String edita;
   private String endArqui;
   private String identificacaoArquivo;
   private String publico;
   private BigDecimal sequencia;
   private BigDecimal sequenciaPr;
   private String tipo;
   private String tipoConteudo;
   private Timestamp dtInclusao;
   private Timestamp dtVigor;
   private String link;

   public String getArquivo() {
        return arquivo;
   }

   public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
   }

   public BigDecimal getCoData() {
        return coData;
   }

   public void setCoData(BigDecimal coData) {
        this.coData = coData;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public byte[] getConteudo() {
        return conteudo;
   }

   public void setConteudo(byte[] conteudo) {
        this.conteudo = conteudo;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtExpira() {
        return dtExpira;
   }

   public void setDtExpira(Timestamp dtExpira) {
        this.dtExpira = dtExpira;
   }

   public String getEdita() {
        return edita;
   }

   public void setEdita(String edita) {
        this.edita = edita;
   }

   public String getEndArqui() {
        return endArqui;
   }

   public void setEndArqui(String endArqui) {
        this.endArqui = endArqui;
   }

   public String getIdentificacaoArquivo() {
        return identificacaoArquivo;
   }

   public void setIdentificacaoArquivo(String identificacaoArquivo) {
        this.identificacaoArquivo = identificacaoArquivo;
   }

   public String getPublico() {
        return publico;
   }

   public void setPublico(String publico) {
        this.publico = publico;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getSequenciaPr() {
        return sequenciaPr;
   }

   public void setSequenciaPr(BigDecimal sequenciaPr) {
        this.sequenciaPr = sequenciaPr;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getTipoConteudo() {
        return tipoConteudo;
   }

   public void setTipoConteudo(String tipoConteudo) {
        this.tipoConteudo = tipoConteudo;
   }

   public Timestamp getDtInclusao() {
        return dtInclusao;
   }

   public void setDtInclusao(Timestamp dtInclusao) {
        this.dtInclusao = dtInclusao;
   }

   public Timestamp getDtVigor() {
        return dtVigor;
   }

   public void setDtVigor(Timestamp dtVigor) {
        this.dtVigor = dtVigor;
   }

   public String getLink() {
        return link;
   }

   public void setLink(String link) {
        this.link = link;
   }

   @Override
   public String getEntityName() {
        return "Anexo";
   }

   @Override
   public Anexo fromVO(DynamicVO vo) {
        this.arquivo = vo.asString("ARQUIVO");
        this.coData = vo.asBigDecimal("CODATA");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.conteudo = vo.asBlob("CONTEUDO");
        this.descricao = vo.asString("DESCRICAO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtExpira = vo.asTimestamp("DTEXPIRA");
        this.edita = vo.asString("EDITA");
        this.endArqui = vo.asString("ENDARQUI");
        this.identificacaoArquivo = vo.asString("IDENTIFICACAOARQUIVO");
        this.publico = vo.asString("PUBLICO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.sequenciaPr = vo.asBigDecimal("SEQUENCIAPR");
        this.tipo = vo.asString("TIPO");
        this.tipoConteudo = vo.asString("TIPOCONTEUDO");
        this.dtInclusao = vo.asTimestamp("DTINCLUSAO");
        this.dtVigor = vo.asTimestamp("DTVIGOR");
        this.link = vo.asString("LINK");
        return this;
   }
}
