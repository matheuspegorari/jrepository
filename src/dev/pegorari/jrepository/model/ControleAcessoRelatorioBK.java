package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ControleAcessoRelatorioBK extends AbstractSankhyaEntity<ControleAcessoRelatorioBK> {
   private String altera;
   private BigDecimal codGrupo;
   private BigDecimal codRel;
   private BigDecimal codUsu;
   private String cons;
   private String filtro;
   private BigDecimal nuNico;
   private String resumo;
   private String seguranca;
   private BigDecimal sequencia;

   public String getAltera() {
        return altera;
   }

   public void setAltera(String altera) {
        markAsChanged("ALTERA", altera);
        this.altera = altera;
   }

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
        this.codGrupo = codGrupo;
   }

   public BigDecimal getCodRel() {
        return codRel;
   }

   public void setCodRel(BigDecimal codRel) {
        markAsChanged("CODREL", codRel);
        this.codRel = codRel;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getCons() {
        return cons;
   }

   public void setCons(String cons) {
        markAsChanged("CONS", cons);
        this.cons = cons;
   }

   public String getFiltro() {
        return filtro;
   }

   public void setFiltro(String filtro) {
        markAsChanged("FILTRO", filtro);
        this.filtro = filtro;
   }

   public BigDecimal getNuNico() {
        return nuNico;
   }

   public void setNuNico(BigDecimal nuNico) {
        markAsChanged("NUNICO", nuNico);
        this.nuNico = nuNico;
   }

   public String getResumo() {
        return resumo;
   }

   public void setResumo(String resumo) {
        markAsChanged("RESUMO", resumo);
        this.resumo = resumo;
   }

   public String getSeguranca() {
        return seguranca;
   }

   public void setSeguranca(String seguranca) {
        markAsChanged("SEGURANCA", seguranca);
        this.seguranca = seguranca;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
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
        this.altera = vo.asString("ALTERA");
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.codRel = vo.asBigDecimal("CODREL");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.cons = vo.asString("CONS");
        this.filtro = vo.asString("FILTRO");
        this.nuNico = vo.asBigDecimal("NUNICO");
        this.resumo = vo.asString("RESUMO");
        this.seguranca = vo.asString("SEGURANCA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
