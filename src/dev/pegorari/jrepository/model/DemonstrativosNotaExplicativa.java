package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DemonstrativosNotaExplicativa extends AbstractSankhyaEntity<DemonstrativosNotaExplicativa> {
   private String ativo;
   private String codDmt;
   private BigDecimal codTab;
   private BigDecimal codTdm;
   private BigDecimal codUsu;
   private String descImagem;
   private Timestamp dhAlter;
   private BigDecimal formatDtImpr;
   private String geraNeColunasValor;
   private String geraAssinatura;
   private String imagem;
   private String indEntTit;
   private BigDecimal nivel;
   private BigDecimal nuDnePai;
   private BigDecimal nuPeriodoCtb;
   private String percentual;
   private String quebraPagina;
   private BigDecimal sequencia;
   private BigDecimal simbolos;
   private char[] texto;
   private String tipo;
   private String titulo;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public String getCodDmt() {
        return codDmt;
   }

   public void setCodDmt(String codDmt) {
        markAsChanged("CODDMT", codDmt);
        this.codDmt = codDmt;
   }

   public BigDecimal getCodTab() {
        return codTab;
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
        this.codTab = codTab;
   }

   public BigDecimal getCodTdm() {
        return codTdm;
   }

   public void setCodTdm(BigDecimal codTdm) {
        markAsChanged("CODTDM", codTdm);
        this.codTdm = codTdm;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getDescImagem() {
        return descImagem;
   }

   public void setDescImagem(String descImagem) {
        markAsChanged("DESCIMAGEM", descImagem);
        this.descImagem = descImagem;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public BigDecimal getFormatDtImpr() {
        return formatDtImpr;
   }

   public void setFormatDtImpr(BigDecimal formatDtImpr) {
        markAsChanged("FORMATDTIMPR", formatDtImpr);
        this.formatDtImpr = formatDtImpr;
   }

   public String getGeraNeColunasValor() {
        return geraNeColunasValor;
   }

   public void setGeraNeColunasValor(String geraNeColunasValor) {
        markAsChanged("GERANECOLUNASVALOR", geraNeColunasValor);
        this.geraNeColunasValor = geraNeColunasValor;
   }

   public String getGeraAssinatura() {
        return geraAssinatura;
   }

   public void setGeraAssinatura(String geraAssinatura) {
        markAsChanged("GERASSINATURA", geraAssinatura);
        this.geraAssinatura = geraAssinatura;
   }

   public String getImagem() {
        return imagem;
   }

   public void setImagem(String imagem) {
        markAsChanged("IMAGEM", imagem);
        this.imagem = imagem;
   }

   public String getIndEntTit() {
        return indEntTit;
   }

   public void setIndEntTit(String indEntTit) {
        markAsChanged("INDENTTIT", indEntTit);
        this.indEntTit = indEntTit;
   }

   public BigDecimal getNivel() {
        return nivel;
   }

   public void setNivel(BigDecimal nivel) {
        markAsChanged("NIVEL", nivel);
        this.nivel = nivel;
   }

   public BigDecimal getNuDnePai() {
        return nuDnePai;
   }

   public void setNuDnePai(BigDecimal nuDnePai) {
        markAsChanged("NUDNEPAI", nuDnePai);
        this.nuDnePai = nuDnePai;
   }

   public BigDecimal getNuPeriodoCtb() {
        return nuPeriodoCtb;
   }

   public void setNuPeriodoCtb(BigDecimal nuPeriodoCtb) {
        markAsChanged("NUPERIODOCTB", nuPeriodoCtb);
        this.nuPeriodoCtb = nuPeriodoCtb;
   }

   public String getPercentual() {
        return percentual;
   }

   public void setPercentual(String percentual) {
        markAsChanged("PERCENTUAL", percentual);
        this.percentual = percentual;
   }

   public String getQuebraPagina() {
        return quebraPagina;
   }

   public void setQuebraPagina(String quebraPagina) {
        markAsChanged("QUEBRAPAGINA", quebraPagina);
        this.quebraPagina = quebraPagina;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getSimbolos() {
        return simbolos;
   }

   public void setSimbolos(BigDecimal simbolos) {
        markAsChanged("SIMBOLOS", simbolos);
        this.simbolos = simbolos;
   }

   public char[] getTexto() {
        return texto;
   }

   public void setTexto(char[] texto) {
        markAsChanged("TEXTO", texto);
        this.texto = texto;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public String getTitulo() {
        return titulo;
   }

   public void setTitulo(String titulo) {
        markAsChanged("TITULO", titulo);
        this.titulo = titulo;
   }

   @Override
   public String getTableName() {
        return "TCBDNE";
   }

   @Override
   public String getEntityName() {
        return "DemonstrativosNotaExplicativa";
   }

   @Override
   public DemonstrativosNotaExplicativa fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.ativo = vo.asString("ATIVO");
        this.codDmt = vo.asString("CODDMT");
        this.codTab = vo.asBigDecimal("CODTAB");
        this.codTdm = vo.asBigDecimal("CODTDM");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descImagem = vo.asString("DESCIMAGEM");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.formatDtImpr = vo.asBigDecimal("FORMATDTIMPR");
        this.geraNeColunasValor = vo.asString("GERANECOLUNASVALOR");
        this.geraAssinatura = vo.asString("GERASSINATURA");
        this.imagem = vo.asString("IMAGEM");
        this.indEntTit = vo.asString("INDENTTIT");
        this.nivel = vo.asBigDecimal("NIVEL");
        this.nuDnePai = vo.asBigDecimal("NUDNEPAI");
        this.nuPeriodoCtb = vo.asBigDecimal("NUPERIODOCTB");
        this.percentual = vo.asString("PERCENTUAL");
        this.quebraPagina = vo.asString("QUEBRAPAGINA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.simbolos = vo.asBigDecimal("SIMBOLOS");
        this.texto = vo.asClob("TEXTO");
        this.tipo = vo.asString("TIPO");
        this.titulo = vo.asString("TITULO");
        return this;
   }
}
