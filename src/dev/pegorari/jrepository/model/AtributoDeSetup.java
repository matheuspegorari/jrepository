package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AtributoDeSetup extends AbstractSankhyaEntity<AtributoDeSetup> {
   public String getDescratributo() {
        return this.getVo().asString("DESCRATRIBUTO");
   }

   public void setDescratributo(String descratributo) {
        markAsChanged("DESCRATRIBUTO", descratributo);
   }

   public BigDecimal getCodWcp() {
        return this.getVo().asBigDecimal("CODWCP");
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
   }

   public String getEstadoWc() {
        return this.getVo().asString("ESTADOWC");
   }

   public void setEstadoWc(String estadoWc) {
        markAsChanged("ESTADOWC", estadoWc);
   }

   public String getExpValidacao() {
        return this.getVo().asString("EXPVALIDACAO");
   }

   public void setExpValidacao(String expValidacao) {
        markAsChanged("EXPVALIDACAO", expValidacao);
   }

   public String getItensLista() {
        return this.getVo().asString("ITENSLISTA");
   }

   public void setItensLista(String itensLista) {
        markAsChanged("ITENSLISTA", itensLista);
   }

   public String getNomeInstanciaRef() {
        return this.getVo().asString("NOMEINSTANCIAREF");
   }

   public void setNomeInstanciaRef(String nomeInstanciaRef) {
        markAsChanged("NOMEINSTANCIAREF", nomeInstanciaRef);
   }

   public BigDecimal getNuAst() {
        return this.getVo().asBigDecimal("NUAST");
   }

   public void setNuAst(BigDecimal nuAst) {
        markAsChanged("NUAST", nuAst);
   }

   public BigDecimal getPesoRelativo() {
        return this.getVo().asBigDecimal("PESORELATIVO");
   }

   public void setPesoRelativo(BigDecimal pesoRelativo) {
        markAsChanged("PESORELATIVO", pesoRelativo);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TPRAST";
   }

   @Override
   public String getEntityName() {
        return "AtributoDeSetup";
   }

   @Override
   public AtributoDeSetup fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
