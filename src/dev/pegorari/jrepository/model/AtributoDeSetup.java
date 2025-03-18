package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AtributoDeSetup extends AbstractSankhyaEntity<AtributoDeSetup> {
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
        markAsChanged("DESCRATRIBUTO", descratributo);
        this.descratributo = descratributo;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
        this.codWcp = codWcp;
   }

   public String getEstadoWc() {
        return estadoWc;
   }

   public void setEstadoWc(String estadoWc) {
        markAsChanged("ESTADOWC", estadoWc);
        this.estadoWc = estadoWc;
   }

   public String getExpValidacao() {
        return expValidacao;
   }

   public void setExpValidacao(String expValidacao) {
        markAsChanged("EXPVALIDACAO", expValidacao);
        this.expValidacao = expValidacao;
   }

   public String getItensLista() {
        return itensLista;
   }

   public void setItensLista(String itensLista) {
        markAsChanged("ITENSLISTA", itensLista);
        this.itensLista = itensLista;
   }

   public String getNomeInstanciaRef() {
        return nomeInstanciaRef;
   }

   public void setNomeInstanciaRef(String nomeInstanciaRef) {
        markAsChanged("NOMEINSTANCIAREF", nomeInstanciaRef);
        this.nomeInstanciaRef = nomeInstanciaRef;
   }

   public BigDecimal getNuAst() {
        return nuAst;
   }

   public void setNuAst(BigDecimal nuAst) {
        markAsChanged("NUAST", nuAst);
        this.nuAst = nuAst;
   }

   public BigDecimal getPesoRelativo() {
        return pesoRelativo;
   }

   public void setPesoRelativo(BigDecimal pesoRelativo) {
        markAsChanged("PESORELATIVO", pesoRelativo);
        this.pesoRelativo = pesoRelativo;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
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
        this.setOriginalVO(vo);
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
