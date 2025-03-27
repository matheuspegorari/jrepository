package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Gadget extends AbstractSankhyaEntity<Gadget> {
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

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuInc() {
        return this.getVo().asBigDecimal("CODUSUINC");
   }

   public void setCodUsuInc(BigDecimal codUsuInc) {
        markAsChanged("CODUSUINC", codUsuInc);
   }

   public char[] getConfig() {
        return this.getVo().asClob("CONFIG");
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
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

   public BigDecimal getNuGdg() {
        return this.getVo().asBigDecimal("NUGDG");
   }

   public void setNuGdg(BigDecimal nuGdg) {
        markAsChanged("NUGDG", nuGdg);
   }

   public byte[] getThumbnail() {
        return this.getVo().asBlob("THUMBNAIL");
   }

   public void setThumbnail(byte[] thumbnail) {
        markAsChanged("THUMBNAIL", thumbnail);
   }

   public String getTitulo() {
        return this.getVo().asString("TITULO");
   }

   public void setTitulo(String titulo) {
        markAsChanged("TITULO", titulo);
   }

   public String getUrlComponente() {
        return this.getVo().asString("URLCOMPONENTE");
   }

   public void setUrlComponente(String urlComponente) {
        markAsChanged("URLCOMPONENTE", urlComponente);
   }

   public byte[] getHtml5() {
        return this.getVo().asBlob("HTML5");
   }

   public void setHtml5(byte[] html5) {
        markAsChanged("HTML5", html5);
   }

   public String getTemHtml5() {
        return this.getVo().asString("TEMHTML5");
   }

   public void setTemHtml5(String temHtml5) {
        markAsChanged("TEMHTML5", temHtml5);
   }

   public String getGdgAssinado() {
        return this.getVo().asString("GDGASSINADO");
   }

   public void setGdgAssinado(String gdgAssinado) {
        markAsChanged("GDGASSINADO", gdgAssinado);
   }

   public String getEvocard() {
        return this.getVo().asString("EVOCARD");
   }

   public void setEvocard(String evocard) {
        markAsChanged("EVOCARD", evocard);
   }

   public String getLayout() {
        return this.getVo().asString("LAYOUT");
   }

   public void setLayout(String layout) {
        markAsChanged("LAYOUT", layout);
   }

   public BigDecimal getQtdAnalisesUtilizadas() {
        return this.getVo().asBigDecimal("QTDANALISESUTILIZADAS");
   }

   public void setQtdAnalisesUtilizadas(BigDecimal qtdAnalisesUtilizadas) {
        markAsChanged("QTDANALISESUTILIZADAS", qtdAnalisesUtilizadas);
   }

   public String getApvNc() {
        return this.getVo().asString("APVNC");
   }

   public void setApvNc(String apvNc) {
        markAsChanged("APVNC", apvNc);
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
        return this;
   }
}
