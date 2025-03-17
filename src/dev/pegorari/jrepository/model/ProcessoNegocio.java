package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProcessoNegocio extends AbstractSankhyaEntity<ProcessoNegocio> {
   private String ativo;
   private BigDecimal codPrn;
   private BigDecimal codUsuAlter;
   private BigDecimal codUsuDono;
   private Timestamp dhAlter;
   private Timestamp dhCriacao;
   private Timestamp dhPublicacao;
   private char[] documentacao;
   private char[] imgBpmn;
   private String nome;
   private BigDecimal nuGrupo;
   private String ultimaVersao;
   private Timestamp verAntDhPublicacao;
   private BigDecimal versao;
   private char[] xmlBpmn;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCodPrn() {
        return codPrn;
   }

   public void setCodPrn(BigDecimal codPrn) {
        this.codPrn = codPrn;
   }

   public BigDecimal getCodUsuAlter() {
        return codUsuAlter;
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        this.codUsuAlter = codUsuAlter;
   }

   public BigDecimal getCodUsuDono() {
        return codUsuDono;
   }

   public void setCodUsuDono(BigDecimal codUsuDono) {
        this.codUsuDono = codUsuDono;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhCriacao() {
        return dhCriacao;
   }

   public void setDhCriacao(Timestamp dhCriacao) {
        this.dhCriacao = dhCriacao;
   }

   public Timestamp getDhPublicacao() {
        return dhPublicacao;
   }

   public void setDhPublicacao(Timestamp dhPublicacao) {
        this.dhPublicacao = dhPublicacao;
   }

   public char[] getDocumentacao() {
        return documentacao;
   }

   public void setDocumentacao(char[] documentacao) {
        this.documentacao = documentacao;
   }

   public char[] getImgBpmn() {
        return imgBpmn;
   }

   public void setImgBpmn(char[] imgBpmn) {
        this.imgBpmn = imgBpmn;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        this.nome = nome;
   }

   public BigDecimal getNuGrupo() {
        return nuGrupo;
   }

   public void setNuGrupo(BigDecimal nuGrupo) {
        this.nuGrupo = nuGrupo;
   }

   public String getUltimaVersao() {
        return ultimaVersao;
   }

   public void setUltimaVersao(String ultimaVersao) {
        this.ultimaVersao = ultimaVersao;
   }

   public Timestamp getVerAntDhPublicacao() {
        return verAntDhPublicacao;
   }

   public void setVerAntDhPublicacao(Timestamp verAntDhPublicacao) {
        this.verAntDhPublicacao = verAntDhPublicacao;
   }

   public BigDecimal getVersao() {
        return versao;
   }

   public void setVersao(BigDecimal versao) {
        this.versao = versao;
   }

   public char[] getXmlBpmn() {
        return xmlBpmn;
   }

   public void setXmlBpmn(char[] xmlBpmn) {
        this.xmlBpmn = xmlBpmn;
   }

   @Override
   public String getTableName() {
        return "TWFPRN";
   }

   @Override
   public String getEntityName() {
        return "ProcessoNegocio";
   }

   @Override
   public ProcessoNegocio fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.codPrn = vo.asBigDecimal("CODPRN");
        this.codUsuAlter = vo.asBigDecimal("CODUSUALTER");
        this.codUsuDono = vo.asBigDecimal("CODUSUDONO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhCriacao = vo.asTimestamp("DHCRIACAO");
        this.dhPublicacao = vo.asTimestamp("DHPUBLICACAO");
        this.documentacao = vo.asClob("DOCUMENTACAO");
        this.imgBpmn = vo.asClob("IMGBPMN");
        this.nome = vo.asString("NOME");
        this.nuGrupo = vo.asBigDecimal("NUGRUPO");
        this.ultimaVersao = vo.asString("ULTIMAVERSAO");
        this.verAntDhPublicacao = vo.asTimestamp("VERANTDHPUBLICACAO");
        this.versao = vo.asBigDecimal("VERSAO");
        this.xmlBpmn = vo.asClob("XMLBPMN");
        return this;
   }
}
