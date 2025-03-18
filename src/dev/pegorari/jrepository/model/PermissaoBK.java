package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PermissaoBK extends AbstractSankhyaEntity<PermissaoBK> {
   private String acesso;
   private BigDecimal codGrupo;
   private BigDecimal codUsu;
   private String idAcesso;
   private BigDecimal nuNico;
   private BigDecimal sequencia;
   private BigDecimal versao;

   public String getAcesso() {
        return acesso;
   }

   public void setAcesso(String acesso) {
        markAsChanged("ACESSO", acesso);
        this.acesso = acesso;
   }

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

   public String getIdAcesso() {
        return idAcesso;
   }

   public void setIdAcesso(String idAcesso) {
        markAsChanged("IDACESSO", idAcesso);
        this.idAcesso = idAcesso;
   }

   public BigDecimal getNuNico() {
        return nuNico;
   }

   public void setNuNico(BigDecimal nuNico) {
        markAsChanged("NUNICO", nuNico);
        this.nuNico = nuNico;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getVersao() {
        return versao;
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
        this.versao = versao;
   }

   @Override
   public String getTableName() {
        return "TDDPERBK";
   }

   @Override
   public String getEntityName() {
        return "PermissaoBK";
   }

   @Override
   public PermissaoBK fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.acesso = vo.asString("ACESSO");
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.idAcesso = vo.asString("IDACESSO");
        this.nuNico = vo.asBigDecimal("NUNICO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.versao = vo.asBigDecimal("VERSAO");
        return this;
   }
}
