package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Relacionamento implements SankhyaEntity<Relacionamento> {

   private BigDecimal codAtendente;
   private BigDecimal codContato;
   private BigDecimal codHist;
   private BigDecimal codParc;
   private BigDecimal codProd;
   private BigDecimal codUsu;
   private BigDecimal codVend;
   private String comentarios;
   private String comentarios2;
   private Timestamp dhChamada;
   private Timestamp dhProxCham;
   private Timestamp dtAlter;
   private BigDecimal numOs;
   private BigDecimal nuRel;
   private String pendente;
   private String situacao;
   private String telefoneParc;
   private Timestamp tempPrevisto;
   private String tipCham;
   private BigDecimal nuAviso;

   public BigDecimal getCodAtendente() {
        return codAtendente;
   }

   public void setCodAtendente(BigDecimal codAtendente) {
        this.codAtendente = codAtendente;
   }

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        this.codContato = codContato;
   }

   public BigDecimal getCodHist() {
        return codHist;
   }

   public void setCodHist(BigDecimal codHist) {
        this.codHist = codHist;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        this.codVend = codVend;
   }

   public String getComentarios() {
        return comentarios;
   }

   public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
   }

   public String getComentarios2() {
        return comentarios2;
   }

   public void setComentarios2(String comentarios2) {
        this.comentarios2 = comentarios2;
   }

   public Timestamp getDhChamada() {
        return dhChamada;
   }

   public void setDhChamada(Timestamp dhChamada) {
        this.dhChamada = dhChamada;
   }

   public Timestamp getDhProxCham() {
        return dhProxCham;
   }

   public void setDhProxCham(Timestamp dhProxCham) {
        this.dhProxCham = dhProxCham;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNumOs() {
        return numOs;
   }

   public void setNumOs(BigDecimal numOs) {
        this.numOs = numOs;
   }

   public BigDecimal getNuRel() {
        return nuRel;
   }

   public void setNuRel(BigDecimal nuRel) {
        this.nuRel = nuRel;
   }

   public String getPendente() {
        return pendente;
   }

   public void setPendente(String pendente) {
        this.pendente = pendente;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        this.situacao = situacao;
   }

   public String getTelefoneParc() {
        return telefoneParc;
   }

   public void setTelefoneParc(String telefoneParc) {
        this.telefoneParc = telefoneParc;
   }

   public Timestamp getTempPrevisto() {
        return tempPrevisto;
   }

   public void setTempPrevisto(Timestamp tempPrevisto) {
        this.tempPrevisto = tempPrevisto;
   }

   public String getTipCham() {
        return tipCham;
   }

   public void setTipCham(String tipCham) {
        this.tipCham = tipCham;
   }

   public BigDecimal getNuAviso() {
        return nuAviso;
   }

   public void setNuAviso(BigDecimal nuAviso) {
        this.nuAviso = nuAviso;
   }

   @Override
   public String getEntityName() {
        return "Relacionamento";
   }

   @Override
   public Relacionamento fromVO(DynamicVO vo) {
        this.codAtendente = vo.asBigDecimal("CODATENDENTE");
        this.codContato = vo.asBigDecimal("CODCONTATO");
        this.codHist = vo.asBigDecimal("CODHIST");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.comentarios = vo.asString("COMENTARIOS");
        this.comentarios2 = vo.asString("COMENTARIOS2");
        this.dhChamada = vo.asTimestamp("DHCHAMADA");
        this.dhProxCham = vo.asTimestamp("DHPROXCHAM");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.numOs = vo.asBigDecimal("NUMOS");
        this.nuRel = vo.asBigDecimal("NUREL");
        this.pendente = vo.asString("PENDENTE");
        this.situacao = vo.asString("SITUACAO");
        this.telefoneParc = vo.asString("TELEFONEPARC");
        this.tempPrevisto = vo.asTimestamp("TEMPPREVISTO");
        this.tipCham = vo.asString("TIPCHAM");
        this.nuAviso = vo.asBigDecimal("NUAVISO");
        return this;
   }
}
