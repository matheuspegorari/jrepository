package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Site extends AbstractSankhyaEntity<Site> {
   public String getAbreviatura() {
        return this.getVo().asString("ABREVIATURA");
   }

   public void setAbreviatura(String abreviatura) {
        markAsChanged("ABREVIATURA", abreviatura);
   }

   public String getAnalitico() {
        return this.getVo().asString("ANALITICO");
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getCelular() {
        return this.getVo().asString("CELULAR");
   }

   public void setCelular(String celular) {
        markAsChanged("CELULAR", celular);
   }

   public String getCep() {
        return this.getVo().asString("CEP");
   }

   public void setCep(String cep) {
        markAsChanged("CEP", cep);
   }

   public String getCnpj() {
        return this.getVo().asString("CNPJ");
   }

   public void setCnpj(String cnpj) {
        markAsChanged("CNPJ", cnpj);
   }

   public BigDecimal getCodBai() {
        return this.getVo().asBigDecimal("CODBAI");
   }

   public void setCodBai(BigDecimal codBai) {
        markAsChanged("CODBAI", codBai);
   }

   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public BigDecimal getCodEnd() {
        return this.getVo().asBigDecimal("CODEND");
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
   }

   public BigDecimal getCodSite() {
        return this.getVo().asBigDecimal("CODSITE");
   }

   public void setCodSite(BigDecimal codSite) {
        markAsChanged("CODSITE", codSite);
   }

   public BigDecimal getCodSitePai() {
        return this.getVo().asBigDecimal("CODSITEPAI");
   }

   public void setCodSitePai(BigDecimal codSitePai) {
        markAsChanged("CODSITEPAI", codSitePai);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getComplemento() {
        return this.getVo().asString("COMPLEMENTO");
   }

   public void setComplemento(String complemento) {
        markAsChanged("COMPLEMENTO", complemento);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtCad() {
        return this.getVo().asTimestamp("DTCAD");
   }

   public void setDtCad(Timestamp dtCad) {
        markAsChanged("DTCAD", dtCad);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public String getFax() {
        return this.getVo().asString("FAX");
   }

   public void setFax(String fax) {
        markAsChanged("FAX", fax);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public String getInscEstad() {
        return this.getVo().asString("INSCESTAD");
   }

   public void setInscEstad(String inscEstad) {
        markAsChanged("INSCESTAD", inscEstad);
   }

   public String getNomeSite() {
        return this.getVo().asString("NOMESITE");
   }

   public void setNomeSite(String nomeSite) {
        markAsChanged("NOMESITE", nomeSite);
   }

   public String getNumEnd() {
        return this.getVo().asString("NUMEND");
   }

   public void setNumEnd(String numEnd) {
        markAsChanged("NUMEND", numEnd);
   }

   public String getObservacoes() {
        return this.getVo().asString("OBSERVACOES");
   }

   public void setObservacoes(String observacoes) {
        markAsChanged("OBSERVACOES", observacoes);
   }

   public BigDecimal getRamal() {
        return this.getVo().asBigDecimal("RAMAL");
   }

   public void setRamal(BigDecimal ramal) {
        markAsChanged("RAMAL", ramal);
   }

   public String getTelefone() {
        return this.getVo().asString("TELEFONE");
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
   }

   @Override
   public String getTableName() {
        return "TGFSIT";
   }

   @Override
   public String getEntityName() {
        return "Site";
   }

   @Override
   public Site fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
