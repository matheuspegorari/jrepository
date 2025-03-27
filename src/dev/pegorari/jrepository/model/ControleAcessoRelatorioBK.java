package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ControleAcessoRelatorioBK extends AbstractSankhyaEntity<ControleAcessoRelatorioBK> {
   public String getAltera() {
        return this.getVo().asString("ALTERA");
   }

   public void setAltera(String altera) {
        markAsChanged("ALTERA", altera);
   }

   public BigDecimal getCodGrupo() {
        return this.getVo().asBigDecimal("CODGRUPO");
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
   }

   public BigDecimal getCodRel() {
        return this.getVo().asBigDecimal("CODREL");
   }

   public void setCodRel(BigDecimal codRel) {
        markAsChanged("CODREL", codRel);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getCons() {
        return this.getVo().asString("CONS");
   }

   public void setCons(String cons) {
        markAsChanged("CONS", cons);
   }

   public String getFiltro() {
        return this.getVo().asString("FILTRO");
   }

   public void setFiltro(String filtro) {
        markAsChanged("FILTRO", filtro);
   }

   public BigDecimal getNuNico() {
        return this.getVo().asBigDecimal("NUNICO");
   }

   public void setNuNico(BigDecimal nuNico) {
        markAsChanged("NUNICO", nuNico);
   }

   public String getResumo() {
        return this.getVo().asString("RESUMO");
   }

   public void setResumo(String resumo) {
        markAsChanged("RESUMO", resumo);
   }

   public String getSeguranca() {
        return this.getVo().asString("SEGURANCA");
   }

   public void setSeguranca(String seguranca) {
        markAsChanged("SEGURANCA", seguranca);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TSIACIBK";
   }

   @Override
   public String getEntityName() {
        return "ControleAcessoRelatorioBK";
   }

   @Override
   public ControleAcessoRelatorioBK fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
