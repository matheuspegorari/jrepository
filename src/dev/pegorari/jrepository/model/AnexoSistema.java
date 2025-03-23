package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AnexoSistema extends AbstractSankhyaEntity<AnexoSistema> {
   private Timestamp dhCad;
   private BigDecimal codUsuAlt;
   private String pkRegistro;
   private BigDecimal codUsu;
   private String chaveArquivo;
   private String nomeArquivo;
   private Timestamp dhAlter;
   private String resourceId;
   private String tipoAcesso;
   private String tipoApres;
   private String descricao;
   private String nomeInstancia;
   private BigDecimal nuAttach;
   private String link;

   public Timestamp getDhCad() {
        return dhCad;
   }

   public void setDhCad(Timestamp dhCad) {
        markAsChanged("DHCAD", dhCad);
        this.dhCad = dhCad;
   }

   public BigDecimal getCodUsuAlt() {
        return codUsuAlt;
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        markAsChanged("CODUSUALT", codUsuAlt);
        this.codUsuAlt = codUsuAlt;
   }

   public String getPkRegistro() {
        return pkRegistro;
   }

   public void setPkRegistro(String pkRegistro) {
        markAsChanged("PKREGISTRO", pkRegistro);
        this.pkRegistro = pkRegistro;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getChaveArquivo() {
        return chaveArquivo;
   }

   public void setChaveArquivo(String chaveArquivo) {
        markAsChanged("CHAVEARQUIVO", chaveArquivo);
        this.chaveArquivo = chaveArquivo;
   }

   public String getNomeArquivo() {
        return nomeArquivo;
   }

   public void setNomeArquivo(String nomeArquivo) {
        markAsChanged("NOMEARQUIVO", nomeArquivo);
        this.nomeArquivo = nomeArquivo;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public String getResourceId() {
        return resourceId;
   }

   public void setResourceId(String resourceId) {
        markAsChanged("RESOURCEID", resourceId);
        this.resourceId = resourceId;
   }

   public String getTipoAcesso() {
        return tipoAcesso;
   }

   public void setTipoAcesso(String tipoAcesso) {
        markAsChanged("TIPOACESSO", tipoAcesso);
        this.tipoAcesso = tipoAcesso;
   }

   public String getTipoApres() {
        return tipoApres;
   }

   public void setTipoApres(String tipoApres) {
        markAsChanged("TIPOAPRES", tipoApres);
        this.tipoApres = tipoApres;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getNomeInstancia() {
        return nomeInstancia;
   }

   public void setNomeInstancia(String nomeInstancia) {
        markAsChanged("NOMEINSTANCIA", nomeInstancia);
        this.nomeInstancia = nomeInstancia;
   }

   public BigDecimal getNuAttach() {
        return nuAttach;
   }

   public void setNuAttach(BigDecimal nuAttach) {
        markAsChanged("NUATTACH", nuAttach);
        this.nuAttach = nuAttach;
   }

   public String getLink() {
        return link;
   }

   public void setLink(String link) {
        markAsChanged("LINK", link);
        this.link = link;
   }

   @Override
   public String getTableName() {
        return "TSIANX";
   }

   @Override
   public String getEntityName() {
        return "AnexoSistema";
   }

   @Override
   public AnexoSistema fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.dhCad = vo.asTimestamp("DHCAD");
        this.codUsuAlt = vo.asBigDecimal("CODUSUALT");
        this.pkRegistro = vo.asString("PKREGISTRO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.chaveArquivo = vo.asString("CHAVEARQUIVO");
        this.nomeArquivo = vo.asString("NOMEARQUIVO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.resourceId = vo.asString("RESOURCEID");
        this.tipoAcesso = vo.asString("TIPOACESSO");
        this.tipoApres = vo.asString("TIPOAPRES");
        this.descricao = vo.asString("DESCRICAO");
        this.nomeInstancia = vo.asString("NOMEINSTANCIA");
        this.nuAttach = vo.asBigDecimal("NUATTACH");
        this.link = vo.asString("LINK");
        return this;
   }
}
