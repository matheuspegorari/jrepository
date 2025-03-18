package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AvisoSistema extends AbstractSankhyaEntity<AvisoSistema> {
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
        markAsChanged("CODGRUPO", codGrupo);
        this.codGrupo = codGrupo;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuRemetente() {
        return codUsuRemetente;
   }

   public void setCodUsuRemetente(BigDecimal codUsuRemetente) {
        markAsChanged("CODUSUREMETENTE", codUsuRemetente);
        this.codUsuRemetente = codUsuRemetente;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public Timestamp getDhCriacao() {
        return dhCriacao;
   }

   public void setDhCriacao(Timestamp dhCriacao) {
        markAsChanged("DHCRIACAO", dhCriacao);
        this.dhCriacao = dhCriacao;
   }

   public String getIdentificador() {
        return identificador;
   }

   public void setIdentificador(String identificador) {
        markAsChanged("IDENTIFICADOR", identificador);
        this.identificador = identificador;
   }

   public BigDecimal getImportancia() {
        return importancia;
   }

   public void setImportancia(BigDecimal importancia) {
        markAsChanged("IMPORTANCIA", importancia);
        this.importancia = importancia;
   }

   public BigDecimal getNuAviso() {
        return nuAviso;
   }

   public void setNuAviso(BigDecimal nuAviso) {
        markAsChanged("NUAVISO", nuAviso);
        this.nuAviso = nuAviso;
   }

   public BigDecimal getNuAvisoPai() {
        return nuAvisoPai;
   }

   public void setNuAvisoPai(BigDecimal nuAvisoPai) {
        markAsChanged("NUAVISOPAI", nuAvisoPai);
        this.nuAvisoPai = nuAvisoPai;
   }

   public String getSolucao() {
        return solucao;
   }

   public void setSolucao(String solucao) {
        markAsChanged("SOLUCAO", solucao);
        this.solucao = solucao;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public String getTitulo() {
        return titulo;
   }

   public void setTitulo(String titulo) {
        markAsChanged("TITULO", titulo);
        this.titulo = titulo;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
        this.ordem = ordem;
   }

   public Timestamp getDtExpiracao() {
        return dtExpiracao;
   }

   public void setDtExpiracao(Timestamp dtExpiracao) {
        markAsChanged("DTEXPIRACAO", dtExpiracao);
        this.dtExpiracao = dtExpiracao;
   }

   public Timestamp getDtNotificacao() {
        return dtNotificacao;
   }

   public void setDtNotificacao(Timestamp dtNotificacao) {
        markAsChanged("DTNOTIFICACAO", dtNotificacao);
        this.dtNotificacao = dtNotificacao;
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
        this.setOriginalVO(vo);
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
