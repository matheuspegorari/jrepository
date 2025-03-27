package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AnexoSistema extends AbstractSankhyaEntity<AnexoSistema> {
   public Timestamp getDhCad() {
        return this.getVo().asTimestamp("DHCAD");
   }

   public void setDhCad(Timestamp dhCad) {
        markAsChanged("DHCAD", dhCad);
   }

   public BigDecimal getCodUsuAlt() {
        return this.getVo().asBigDecimal("CODUSUALT");
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        markAsChanged("CODUSUALT", codUsuAlt);
   }

   public String getPkRegistro() {
        return this.getVo().asString("PKREGISTRO");
   }

   public void setPkRegistro(String pkRegistro) {
        markAsChanged("PKREGISTRO", pkRegistro);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getChaveArquivo() {
        return this.getVo().asString("CHAVEARQUIVO");
   }

   public void setChaveArquivo(String chaveArquivo) {
        markAsChanged("CHAVEARQUIVO", chaveArquivo);
   }

   public String getNomeArquivo() {
        return this.getVo().asString("NOMEARQUIVO");
   }

   public void setNomeArquivo(String nomeArquivo) {
        markAsChanged("NOMEARQUIVO", nomeArquivo);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public String getResourceId() {
        return this.getVo().asString("RESOURCEID");
   }

   public void setResourceId(String resourceId) {
        markAsChanged("RESOURCEID", resourceId);
   }

   public String getTipoAcesso() {
        return this.getVo().asString("TIPOACESSO");
   }

   public void setTipoAcesso(String tipoAcesso) {
        markAsChanged("TIPOACESSO", tipoAcesso);
   }

   public String getTipoApres() {
        return this.getVo().asString("TIPOAPRES");
   }

   public void setTipoApres(String tipoApres) {
        markAsChanged("TIPOAPRES", tipoApres);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getNomeInstancia() {
        return this.getVo().asString("NOMEINSTANCIA");
   }

   public void setNomeInstancia(String nomeInstancia) {
        markAsChanged("NOMEINSTANCIA", nomeInstancia);
   }

   public BigDecimal getNuAttach() {
        return this.getVo().asBigDecimal("NUATTACH");
   }

   public void setNuAttach(BigDecimal nuAttach) {
        markAsChanged("NUATTACH", nuAttach);
   }

   public String getLink() {
        return this.getVo().asString("LINK");
   }

   public void setLink(String link) {
        markAsChanged("LINK", link);
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
        return this;
   }
}
