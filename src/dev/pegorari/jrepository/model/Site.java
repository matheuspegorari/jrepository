package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Site extends AbstractSankhyaEntity<Site> {
   private String abreviatura;
   private String analitico;
   private String ativo;
   private String celular;
   private String cep;
   private String cnpj;
   private BigDecimal codBai;
   private BigDecimal codCid;
   private BigDecimal codEnd;
   private BigDecimal codSite;
   private BigDecimal codSitePai;
   private BigDecimal codUsu;
   private String complemento;
   private Timestamp dtAlter;
   private Timestamp dtCad;
   private String email;
   private String fax;
   private BigDecimal grau;
   private String inscEstad;
   private String nomeSite;
   private String numEnd;
   private String observacoes;
   private BigDecimal ramal;
   private String telefone;

   public String getAbreviatura() {
        return abreviatura;
   }

   public void setAbreviatura(String abreviatura) {
        markAsChanged("ABREVIATURA", abreviatura);
        this.abreviatura = abreviatura;
   }

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
        this.analitico = analitico;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public String getCelular() {
        return celular;
   }

   public void setCelular(String celular) {
        markAsChanged("CELULAR", celular);
        this.celular = celular;
   }

   public String getCep() {
        return cep;
   }

   public void setCep(String cep) {
        markAsChanged("CEP", cep);
        this.cep = cep;
   }

   public String getCnpj() {
        return cnpj;
   }

   public void setCnpj(String cnpj) {
        markAsChanged("CNPJ", cnpj);
        this.cnpj = cnpj;
   }

   public BigDecimal getCodBai() {
        return codBai;
   }

   public void setCodBai(BigDecimal codBai) {
        markAsChanged("CODBAI", codBai);
        this.codBai = codBai;
   }

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
        this.codCid = codCid;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
        this.codEnd = codEnd;
   }

   public BigDecimal getCodSite() {
        return codSite;
   }

   public void setCodSite(BigDecimal codSite) {
        markAsChanged("CODSITE", codSite);
        this.codSite = codSite;
   }

   public BigDecimal getCodSitePai() {
        return codSitePai;
   }

   public void setCodSitePai(BigDecimal codSitePai) {
        markAsChanged("CODSITEPAI", codSitePai);
        this.codSitePai = codSitePai;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getComplemento() {
        return complemento;
   }

   public void setComplemento(String complemento) {
        markAsChanged("COMPLEMENTO", complemento);
        this.complemento = complemento;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtCad() {
        return dtCad;
   }

   public void setDtCad(Timestamp dtCad) {
        markAsChanged("DTCAD", dtCad);
        this.dtCad = dtCad;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
        this.email = email;
   }

   public String getFax() {
        return fax;
   }

   public void setFax(String fax) {
        markAsChanged("FAX", fax);
        this.fax = fax;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
        this.grau = grau;
   }

   public String getInscEstad() {
        return inscEstad;
   }

   public void setInscEstad(String inscEstad) {
        markAsChanged("INSCESTAD", inscEstad);
        this.inscEstad = inscEstad;
   }

   public String getNomeSite() {
        return nomeSite;
   }

   public void setNomeSite(String nomeSite) {
        markAsChanged("NOMESITE", nomeSite);
        this.nomeSite = nomeSite;
   }

   public String getNumEnd() {
        return numEnd;
   }

   public void setNumEnd(String numEnd) {
        markAsChanged("NUMEND", numEnd);
        this.numEnd = numEnd;
   }

   public String getObservacoes() {
        return observacoes;
   }

   public void setObservacoes(String observacoes) {
        markAsChanged("OBSERVACOES", observacoes);
        this.observacoes = observacoes;
   }

   public BigDecimal getRamal() {
        return ramal;
   }

   public void setRamal(BigDecimal ramal) {
        markAsChanged("RAMAL", ramal);
        this.ramal = ramal;
   }

   public String getTelefone() {
        return telefone;
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
        this.telefone = telefone;
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
        this.setOriginalVO(vo);
        this.abreviatura = vo.asString("ABREVIATURA");
        this.analitico = vo.asString("ANALITICO");
        this.ativo = vo.asString("ATIVO");
        this.celular = vo.asString("CELULAR");
        this.cep = vo.asString("CEP");
        this.cnpj = vo.asString("CNPJ");
        this.codBai = vo.asBigDecimal("CODBAI");
        this.codCid = vo.asBigDecimal("CODCID");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.codSite = vo.asBigDecimal("CODSITE");
        this.codSitePai = vo.asBigDecimal("CODSITEPAI");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.complemento = vo.asString("COMPLEMENTO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtCad = vo.asTimestamp("DTCAD");
        this.email = vo.asString("EMAIL");
        this.fax = vo.asString("FAX");
        this.grau = vo.asBigDecimal("GRAU");
        this.inscEstad = vo.asString("INSCESTAD");
        this.nomeSite = vo.asString("NOMESITE");
        this.numEnd = vo.asString("NUMEND");
        this.observacoes = vo.asString("OBSERVACOES");
        this.ramal = vo.asBigDecimal("RAMAL");
        this.telefone = vo.asString("TELEFONE");
        return this;
   }
}
