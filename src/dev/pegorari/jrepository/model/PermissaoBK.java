package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PermissaoBK extends AbstractSankhyaEntity<PermissaoBK> {
   public String getAcesso() {
        return this.getVo().asString("ACESSO");
   }

   public void setAcesso(String acesso) {
        markAsChanged("ACESSO", acesso);
   }

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

   public String getIdAcesso() {
        return this.getVo().asString("IDACESSO");
   }

   public void setIdAcesso(String idAcesso) {
        markAsChanged("IDACESSO", idAcesso);
   }

   public BigDecimal getNuNico() {
        return this.getVo().asBigDecimal("NUNICO");
   }

   public void setNuNico(BigDecimal nuNico) {
        markAsChanged("NUNICO", nuNico);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getVersao() {
        return this.getVo().asBigDecimal("VERSAO");
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
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
        this.setVo(vo);
        return this;
   }
}
