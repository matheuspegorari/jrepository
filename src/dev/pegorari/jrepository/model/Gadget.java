package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Gadget extends AbstractSankhyaEntity<Gadget> {
   private String ativo;
   private String categoria;
   private BigDecimal codUsu;
   private BigDecimal codUsuInc;
   private char[] config;
   private String descricao;
   private Timestamp dhAlter;
   private BigDecimal nuGdg;
   private byte[] thumbnail;
   private String titulo;
   private String urlComponente;
   private byte[] html5;
   private String temHtml5;
   private String gdgAssinado;
   private String evocard;
   private String layout;
   private BigDecimal qtdAnalisesUtilizadas;
   private String apvNc;

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

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuInc() {
        return codUsuInc;
   }

   public void setCodUsuInc(BigDecimal codUsuInc) {
        markAsChanged("CODUSUINC", codUsuInc);
        this.codUsuInc = codUsuInc;
   }

   public char[] getConfig() {
        return config;
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
        this.config = config;
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

   public BigDecimal getNuGdg() {
        return nuGdg;
   }

   public void setNuGdg(BigDecimal nuGdg) {
        markAsChanged("NUGDG", nuGdg);
        this.nuGdg = nuGdg;
   }

   public byte[] getThumbnail() {
        return thumbnail;
   }

   public void setThumbnail(byte[] thumbnail) {
        markAsChanged("THUMBNAIL", thumbnail);
        this.thumbnail = thumbnail;
   }

   public String getTitulo() {
        return titulo;
   }

   public void setTitulo(String titulo) {
        markAsChanged("TITULO", titulo);
        this.titulo = titulo;
   }

   public String getUrlComponente() {
        return urlComponente;
   }

   public void setUrlComponente(String urlComponente) {
        markAsChanged("URLCOMPONENTE", urlComponente);
        this.urlComponente = urlComponente;
   }

   public byte[] getHtml5() {
        return html5;
   }

   public void setHtml5(byte[] html5) {
        markAsChanged("HTML5", html5);
        this.html5 = html5;
   }

   public String getTemHtml5() {
        return temHtml5;
   }

   public void setTemHtml5(String temHtml5) {
        markAsChanged("TEMHTML5", temHtml5);
        this.temHtml5 = temHtml5;
   }

   public String getGdgAssinado() {
        return gdgAssinado;
   }

   public void setGdgAssinado(String gdgAssinado) {
        markAsChanged("GDGASSINADO", gdgAssinado);
        this.gdgAssinado = gdgAssinado;
   }

   public String getEvocard() {
        return evocard;
   }

   public void setEvocard(String evocard) {
        markAsChanged("EVOCARD", evocard);
        this.evocard = evocard;
   }

   public String getLayout() {
        return layout;
   }

   public void setLayout(String layout) {
        markAsChanged("LAYOUT", layout);
        this.layout = layout;
   }

   public BigDecimal getQtdAnalisesUtilizadas() {
        return qtdAnalisesUtilizadas;
   }

   public void setQtdAnalisesUtilizadas(BigDecimal qtdAnalisesUtilizadas) {
        markAsChanged("QTDANALISESUTILIZADAS", qtdAnalisesUtilizadas);
        this.qtdAnalisesUtilizadas = qtdAnalisesUtilizadas;
   }

   public String getApvNc() {
        return apvNc;
   }

   public void setApvNc(String apvNc) {
        markAsChanged("APVNC", apvNc);
        this.apvNc = apvNc;
   }

   @Override
   public String getTableName() {
        return "TSIGDG";
   }

   @Override
   public String getEntityName() {
        return "Gadget";
   }

   @Override
   public Gadget fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.ativo = vo.asString("ATIVO");
        this.categoria = vo.asString("CATEGORIA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuInc = vo.asBigDecimal("CODUSUINC");
        this.config = vo.asClob("CONFIG");
        this.descricao = vo.asString("DESCRICAO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nuGdg = vo.asBigDecimal("NUGDG");
        this.thumbnail = vo.asBlob("THUMBNAIL");
        this.titulo = vo.asString("TITULO");
        this.urlComponente = vo.asString("URLCOMPONENTE");
        this.html5 = vo.asBlob("HTML5");
        this.temHtml5 = vo.asString("TEMHTML5");
        this.gdgAssinado = vo.asString("GDGASSINADO");
        this.evocard = vo.asString("EVOCARD");
        this.layout = vo.asString("LAYOUT");
        this.qtdAnalisesUtilizadas = vo.asBigDecimal("QTDANALISESUTILIZADAS");
        this.apvNc = vo.asString("APVNC");
        return this;
   }
}
