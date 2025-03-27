package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ProcessoNegocio extends AbstractSankhyaEntity<ProcessoNegocio> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodPrn() {
        return this.getVo().asBigDecimal("CODPRN");
   }

   public void setCodPrn(BigDecimal codPrn) {
        markAsChanged("CODPRN", codPrn);
   }

   public BigDecimal getCodUsuAlter() {
        return this.getVo().asBigDecimal("CODUSUALTER");
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        markAsChanged("CODUSUALTER", codUsuAlter);
   }

   public BigDecimal getCodUsuDono() {
        return this.getVo().asBigDecimal("CODUSUDONO");
   }

   public void setCodUsuDono(BigDecimal codUsuDono) {
        markAsChanged("CODUSUDONO", codUsuDono);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDhCriacao() {
        return this.getVo().asTimestamp("DHCRIACAO");
   }

   public void setDhCriacao(Timestamp dhCriacao) {
        markAsChanged("DHCRIACAO", dhCriacao);
   }

   public Timestamp getDhPublicacao() {
        return this.getVo().asTimestamp("DHPUBLICACAO");
   }

   public void setDhPublicacao(Timestamp dhPublicacao) {
        markAsChanged("DHPUBLICACAO", dhPublicacao);
   }

   public char[] getDocumentacao() {
        return this.getVo().asClob("DOCUMENTACAO");
   }

   public void setDocumentacao(char[] documentacao) {
        markAsChanged("DOCUMENTACAO", documentacao);
   }

   public char[] getImgBpmn() {
        return this.getVo().asClob("IMGBPMN");
   }

   public void setImgBpmn(char[] imgBpmn) {
        markAsChanged("IMGBPMN", imgBpmn);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public BigDecimal getNuGrupo() {
        return this.getVo().asBigDecimal("NUGRUPO");
   }

   public void setNuGrupo(BigDecimal nuGrupo) {
        markAsChanged("NUGRUPO", nuGrupo);
   }

   public String getUltimaVersao() {
        return this.getVo().asString("ULTIMAVERSAO");
   }

   public void setUltimaVersao(String ultimaVersao) {
        markAsChanged("ULTIMAVERSAO", ultimaVersao);
   }

   public Timestamp getVerAntDhPublicacao() {
        return this.getVo().asTimestamp("VERANTDHPUBLICACAO");
   }

   public void setVerAntDhPublicacao(Timestamp verAntDhPublicacao) {
        markAsChanged("VERANTDHPUBLICACAO", verAntDhPublicacao);
   }

   public BigDecimal getVersao() {
        return this.getVo().asBigDecimal("VERSAO");
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
   }

   public char[] getXmlBpmn() {
        return this.getVo().asClob("XMLBPMN");
   }

   public void setXmlBpmn(char[] xmlBpmn) {
        markAsChanged("XMLBPMN", xmlBpmn);
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
        this.setVo(vo);
        return this;
   }
}
