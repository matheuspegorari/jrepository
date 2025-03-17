package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class UsuarioCandidatoProcesso implements SankhyaEntity<UsuarioCandidatoProcesso> {

   private String ativo;
   private BigDecimal codEquipe;
   private BigDecimal codGrupoUsu;
   private BigDecimal codPrn;
   private BigDecimal codUsu;
   private String idElemento;
   private BigDecimal sequencia;
   private String dinamico;
   private BigDecimal idInstPrn;
   private BigDecimal idInstTar;
   private String expressao;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCodEquipe() {
        return codEquipe;
   }

   public void setCodEquipe(BigDecimal codEquipe) {
        this.codEquipe = codEquipe;
   }

   public BigDecimal getCodGrupoUsu() {
        return codGrupoUsu;
   }

   public void setCodGrupoUsu(BigDecimal codGrupoUsu) {
        this.codGrupoUsu = codGrupoUsu;
   }

   public BigDecimal getCodPrn() {
        return codPrn;
   }

   public void setCodPrn(BigDecimal codPrn) {
        this.codPrn = codPrn;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getIdElemento() {
        return idElemento;
   }

   public void setIdElemento(String idElemento) {
        this.idElemento = idElemento;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getDinamico() {
        return dinamico;
   }

   public void setDinamico(String dinamico) {
        this.dinamico = dinamico;
   }

   public BigDecimal getIdInstPrn() {
        return idInstPrn;
   }

   public void setIdInstPrn(BigDecimal idInstPrn) {
        this.idInstPrn = idInstPrn;
   }

   public BigDecimal getIdInstTar() {
        return idInstTar;
   }

   public void setIdInstTar(BigDecimal idInstTar) {
        this.idInstTar = idInstTar;
   }

   public String getExpressao() {
        return expressao;
   }

   public void setExpressao(String expressao) {
        this.expressao = expressao;
   }

   @Override
   public String getEntityName() {
        return "UsuarioCandidatoProcesso";
   }

   @Override
   public UsuarioCandidatoProcesso fromVO(DynamicVO vo) {
        this.ativo = vo.asString("ATIVO");
        this.codEquipe = vo.asBigDecimal("CODEQUIPE");
        this.codGrupoUsu = vo.asBigDecimal("CODGRUPOUSU");
        this.codPrn = vo.asBigDecimal("CODPRN");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.idElemento = vo.asString("IDELEMENTO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.dinamico = vo.asString("DINAMICO");
        this.idInstPrn = vo.asBigDecimal("IDINSTPRN");
        this.idInstTar = vo.asBigDecimal("IDINSTTAR");
        this.expressao = vo.asString("EXPRESSAO");
        return this;
   }
}
