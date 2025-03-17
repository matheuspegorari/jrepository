package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AvisoSistema implements SankhyaEntity<AvisoSistema> {

   private BigDecimal codGrupo;
   private BigDecimal codUsu;
   private BigDecimal codUsuRemetente;
   private String descricao;
   private Timestamp dhCriacao;
   private String identificador;
   private BigDecimal importancia;
   private BigDecimal nuAviso;
   private BigDecimal nuAvisoPai;
   private String solucao;
   private String tipo;
   private String titulo;
   private BigDecimal ordem;
   private Timestamp dtExpiracao;
   private Timestamp dtNotificacao;

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        this.codGrupo = codGrupo;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuRemetente() {
        return codUsuRemetente;
   }

   public void setCodUsuRemetente(BigDecimal codUsuRemetente) {
        this.codUsuRemetente = codUsuRemetente;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public Timestamp getDhCriacao() {
        return dhCriacao;
   }

   public void setDhCriacao(Timestamp dhCriacao) {
        this.dhCriacao = dhCriacao;
   }

   public String getIdentificador() {
        return identificador;
   }

   public void setIdentificador(String identificador) {
        this.identificador = identificador;
   }

   public BigDecimal getImportancia() {
        return importancia;
   }

   public void setImportancia(BigDecimal importancia) {
        this.importancia = importancia;
   }

   public BigDecimal getNuAviso() {
        return nuAviso;
   }

   public void setNuAviso(BigDecimal nuAviso) {
        this.nuAviso = nuAviso;
   }

   public BigDecimal getNuAvisoPai() {
        return nuAvisoPai;
   }

   public void setNuAvisoPai(BigDecimal nuAvisoPai) {
        this.nuAvisoPai = nuAvisoPai;
   }

   public String getSolucao() {
        return solucao;
   }

   public void setSolucao(String solucao) {
        this.solucao = solucao;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getTitulo() {
        return titulo;
   }

   public void setTitulo(String titulo) {
        this.titulo = titulo;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public Timestamp getDtExpiracao() {
        return dtExpiracao;
   }

   public void setDtExpiracao(Timestamp dtExpiracao) {
        this.dtExpiracao = dtExpiracao;
   }

   public Timestamp getDtNotificacao() {
        return dtNotificacao;
   }

   public void setDtNotificacao(Timestamp dtNotificacao) {
        this.dtNotificacao = dtNotificacao;
   }

   @Override
   public String getEntityName() {
        return "AvisoSistema";
   }

   @Override
   public AvisoSistema fromVO(DynamicVO vo) {
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuRemetente = vo.asBigDecimal("CODUSUREMETENTE");
        this.descricao = vo.asString("DESCRICAO");
        this.dhCriacao = vo.asTimestamp("DHCRIACAO");
        this.identificador = vo.asString("IDENTIFICADOR");
        this.importancia = vo.asBigDecimal("IMPORTANCIA");
        this.nuAviso = vo.asBigDecimal("NUAVISO");
        this.nuAvisoPai = vo.asBigDecimal("NUAVISOPAI");
        this.solucao = vo.asString("SOLUCAO");
        this.tipo = vo.asString("TIPO");
        this.titulo = vo.asString("TITULO");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.dtExpiracao = vo.asTimestamp("DTEXPIRACAO");
        this.dtNotificacao = vo.asTimestamp("DTNOTIFICACAO");
        return this;
   }
}
