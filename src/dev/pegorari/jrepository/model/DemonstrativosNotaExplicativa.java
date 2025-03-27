package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DemonstrativosNotaExplicativa extends AbstractSankhyaEntity<DemonstrativosNotaExplicativa> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getCodDmt() {
        return this.getVo().asString("CODDMT");
   }

   public void setCodDmt(String codDmt) {
        markAsChanged("CODDMT", codDmt);
   }

   public BigDecimal getCodTab() {
        return this.getVo().asBigDecimal("CODTAB");
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
   }

   public BigDecimal getCodTdm() {
        return this.getVo().asBigDecimal("CODTDM");
   }

   public void setCodTdm(BigDecimal codTdm) {
        markAsChanged("CODTDM", codTdm);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescImagem() {
        return this.getVo().asString("DESCIMAGEM");
   }

   public void setDescImagem(String descImagem) {
        markAsChanged("DESCIMAGEM", descImagem);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getFormatDtImpr() {
        return this.getVo().asBigDecimal("FORMATDTIMPR");
   }

   public void setFormatDtImpr(BigDecimal formatDtImpr) {
        markAsChanged("FORMATDTIMPR", formatDtImpr);
   }

   public String getGeraNeColunasValor() {
        return this.getVo().asString("GERANECOLUNASVALOR");
   }

   public void setGeraNeColunasValor(String geraNeColunasValor) {
        markAsChanged("GERANECOLUNASVALOR", geraNeColunasValor);
   }

   public String getGeraAssinatura() {
        return this.getVo().asString("GERASSINATURA");
   }

   public void setGeraAssinatura(String geraAssinatura) {
        markAsChanged("GERASSINATURA", geraAssinatura);
   }

   public String getImagem() {
        return this.getVo().asString("IMAGEM");
   }

   public void setImagem(String imagem) {
        markAsChanged("IMAGEM", imagem);
   }

   public String getIndEntTit() {
        return this.getVo().asString("INDENTTIT");
   }

   public void setIndEntTit(String indEntTit) {
        markAsChanged("INDENTTIT", indEntTit);
   }

   public BigDecimal getNivel() {
        return this.getVo().asBigDecimal("NIVEL");
   }

   public void setNivel(BigDecimal nivel) {
        markAsChanged("NIVEL", nivel);
   }

   public BigDecimal getNuDnePai() {
        return this.getVo().asBigDecimal("NUDNEPAI");
   }

   public void setNuDnePai(BigDecimal nuDnePai) {
        markAsChanged("NUDNEPAI", nuDnePai);
   }

   public BigDecimal getNuPeriodoCtb() {
        return this.getVo().asBigDecimal("NUPERIODOCTB");
   }

   public void setNuPeriodoCtb(BigDecimal nuPeriodoCtb) {
        markAsChanged("NUPERIODOCTB", nuPeriodoCtb);
   }

   public String getPercentual() {
        return this.getVo().asString("PERCENTUAL");
   }

   public void setPercentual(String percentual) {
        markAsChanged("PERCENTUAL", percentual);
   }

   public String getQuebraPagina() {
        return this.getVo().asString("QUEBRAPAGINA");
   }

   public void setQuebraPagina(String quebraPagina) {
        markAsChanged("QUEBRAPAGINA", quebraPagina);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getSimbolos() {
        return this.getVo().asBigDecimal("SIMBOLOS");
   }

   public void setSimbolos(BigDecimal simbolos) {
        markAsChanged("SIMBOLOS", simbolos);
   }

   public char[] getTexto() {
        return this.getVo().asClob("TEXTO");
   }

   public void setTexto(char[] texto) {
        markAsChanged("TEXTO", texto);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getTitulo() {
        return this.getVo().asString("TITULO");
   }

   public void setTitulo(String titulo) {
        markAsChanged("TITULO", titulo);
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
        this.setVo(vo);
        return this;
   }
}
