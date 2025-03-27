package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UsuarioCandidatoProcesso extends AbstractSankhyaEntity<UsuarioCandidatoProcesso> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodEquipe() {
        return this.getVo().asBigDecimal("CODEQUIPE");
   }

   public void setCodEquipe(BigDecimal codEquipe) {
        markAsChanged("CODEQUIPE", codEquipe);
   }

   public BigDecimal getCodGrupoUsu() {
        return this.getVo().asBigDecimal("CODGRUPOUSU");
   }

   public void setCodGrupoUsu(BigDecimal codGrupoUsu) {
        markAsChanged("CODGRUPOUSU", codGrupoUsu);
   }

   public BigDecimal getCodPrn() {
        return this.getVo().asBigDecimal("CODPRN");
   }

   public void setCodPrn(BigDecimal codPrn) {
        markAsChanged("CODPRN", codPrn);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getIdElemento() {
        return this.getVo().asString("IDELEMENTO");
   }

   public void setIdElemento(String idElemento) {
        markAsChanged("IDELEMENTO", idElemento);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getDinamico() {
        return this.getVo().asString("DINAMICO");
   }

   public void setDinamico(String dinamico) {
        markAsChanged("DINAMICO", dinamico);
   }

   public BigDecimal getIdInstPrn() {
        return this.getVo().asBigDecimal("IDINSTPRN");
   }

   public void setIdInstPrn(BigDecimal idInstPrn) {
        markAsChanged("IDINSTPRN", idInstPrn);
   }

   public BigDecimal getIdInstTar() {
        return this.getVo().asBigDecimal("IDINSTTAR");
   }

   public void setIdInstTar(BigDecimal idInstTar) {
        markAsChanged("IDINSTTAR", idInstTar);
   }

   public String getExpressao() {
        return this.getVo().asString("EXPRESSAO");
   }

   public void setExpressao(String expressao) {
        markAsChanged("EXPRESSAO", expressao);
   }

   @Override
   public String getTableName() {
        return "TWFUCP";
   }

   @Override
   public String getEntityName() {
        return "UsuarioCandidatoProcesso";
   }

   @Override
   public UsuarioCandidatoProcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
