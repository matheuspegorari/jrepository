package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AvisoSistema extends AbstractSankhyaEntity<AvisoSistema> {
   public BigDecimal getCodGrupo() {
        return this.getVo().asBigDecimal("CODGRUPO");
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuRemetente() {
        return this.getVo().asBigDecimal("CODUSUREMETENTE");
   }

   public void setCodUsuRemetente(BigDecimal codUsuRemetente) {
        markAsChanged("CODUSUREMETENTE", codUsuRemetente);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDhCriacao() {
        return this.getVo().asTimestamp("DHCRIACAO");
   }

   public void setDhCriacao(Timestamp dhCriacao) {
        markAsChanged("DHCRIACAO", dhCriacao);
   }

   public String getIdentificador() {
        return this.getVo().asString("IDENTIFICADOR");
   }

   public void setIdentificador(String identificador) {
        markAsChanged("IDENTIFICADOR", identificador);
   }

   public BigDecimal getImportancia() {
        return this.getVo().asBigDecimal("IMPORTANCIA");
   }

   public void setImportancia(BigDecimal importancia) {
        markAsChanged("IMPORTANCIA", importancia);
   }

   public BigDecimal getNuAviso() {
        return this.getVo().asBigDecimal("NUAVISO");
   }

   public void setNuAviso(BigDecimal nuAviso) {
        markAsChanged("NUAVISO", nuAviso);
   }

   public BigDecimal getNuAvisoPai() {
        return this.getVo().asBigDecimal("NUAVISOPAI");
   }

   public void setNuAvisoPai(BigDecimal nuAvisoPai) {
        markAsChanged("NUAVISOPAI", nuAvisoPai);
   }

   public String getSolucao() {
        return this.getVo().asString("SOLUCAO");
   }

   public void setSolucao(String solucao) {
        markAsChanged("SOLUCAO", solucao);
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

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public Timestamp getDtExpiracao() {
        return this.getVo().asTimestamp("DTEXPIRACAO");
   }

   public void setDtExpiracao(Timestamp dtExpiracao) {
        markAsChanged("DTEXPIRACAO", dtExpiracao);
   }

   public Timestamp getDtNotificacao() {
        return this.getVo().asTimestamp("DTNOTIFICACAO");
   }

   public void setDtNotificacao(Timestamp dtNotificacao) {
        markAsChanged("DTNOTIFICACAO", dtNotificacao);
   }

   @Override
   public String getTableName() {
        return "TSIAVI";
   }

   @Override
   public String getEntityName() {
        return "AvisoSistema";
   }

   @Override
   public AvisoSistema fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
