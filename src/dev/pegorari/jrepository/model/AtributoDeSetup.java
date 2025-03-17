package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class AtributoDeSetup implements SankhyaEntity<AtributoDeSetup> {

   private String descratributo;
   private BigDecimal codWcp;
   private String estadoWc;
   private String expValidacao;
   private String itensLista;
   private String nomeInstanciaRef;
   private BigDecimal nuAst;
   private BigDecimal pesoRelativo;
   private String tipo;

   public String getDescratributo() {
        return descratributo;
   }

   public void setDescratributo(String descratributo) {
        this.descratributo = descratributo;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        this.codWcp = codWcp;
   }

   public String getEstadoWc() {
        return estadoWc;
   }

   public void setEstadoWc(String estadoWc) {
        this.estadoWc = estadoWc;
   }

   public String getExpValidacao() {
        return expValidacao;
   }

   public void setExpValidacao(String expValidacao) {
        this.expValidacao = expValidacao;
   }

   public String getItensLista() {
        return itensLista;
   }

   public void setItensLista(String itensLista) {
        this.itensLista = itensLista;
   }

   public String getNomeInstanciaRef() {
        return nomeInstanciaRef;
   }

   public void setNomeInstanciaRef(String nomeInstanciaRef) {
        this.nomeInstanciaRef = nomeInstanciaRef;
   }

   public BigDecimal getNuAst() {
        return nuAst;
   }

   public void setNuAst(BigDecimal nuAst) {
        this.nuAst = nuAst;
   }

   public BigDecimal getPesoRelativo() {
        return pesoRelativo;
   }

   public void setPesoRelativo(BigDecimal pesoRelativo) {
        this.pesoRelativo = pesoRelativo;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getEntityName() {
        return "AtributoDeSetup";
   }

   @Override
   public AtributoDeSetup fromVO(DynamicVO vo) {
        this.descratributo = vo.asString("DESCRATRIBUTO");
        this.codWcp = vo.asBigDecimal("CODWCP");
        this.estadoWc = vo.asString("ESTADOWC");
        this.expValidacao = vo.asString("EXPVALIDACAO");
        this.itensLista = vo.asString("ITENSLISTA");
        this.nomeInstanciaRef = vo.asString("NOMEINSTANCIAREF");
        this.nuAst = vo.asBigDecimal("NUAST");
        this.pesoRelativo = vo.asBigDecimal("PESORELATIVO");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
