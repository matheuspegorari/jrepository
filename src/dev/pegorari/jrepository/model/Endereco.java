package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Endereco implements SankhyaEntity<Endereco> {

   private BigDecimal codEnd;
   private String descricaoCorreio;
   private Timestamp dtAlter;
   private String nomeEnd;
   private String tipo;
   private String atNuVersao;
   private String codLogradouro;
   private String tipoEndereco;

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        this.codEnd = codEnd;
   }

   public String getDescricaoCorreio() {
        return descricaoCorreio;
   }

   public void setDescricaoCorreio(String descricaoCorreio) {
        this.descricaoCorreio = descricaoCorreio;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public String getNomeEnd() {
        return nomeEnd;
   }

   public void setNomeEnd(String nomeEnd) {
        this.nomeEnd = nomeEnd;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getAtNuVersao() {
        return atNuVersao;
   }

   public void setAtNuVersao(String atNuVersao) {
        this.atNuVersao = atNuVersao;
   }

   public String getCodLogradouro() {
        return codLogradouro;
   }

   public void setCodLogradouro(String codLogradouro) {
        this.codLogradouro = codLogradouro;
   }

   public String getTipoEndereco() {
        return tipoEndereco;
   }

   public void setTipoEndereco(String tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
   }

   @Override
   public String getEntityName() {
        return "Endereco";
   }

   @Override
   public Endereco fromVO(DynamicVO vo) {
        this.codEnd = vo.asBigDecimal("CODEND");
        this.descricaoCorreio = vo.asString("DESCRICAOCORREIO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nomeEnd = vo.asString("NOMEEND");
        this.tipo = vo.asString("TIPO");
        this.atNuVersao = vo.asString("ATNUVERSAO");
        this.codLogradouro = vo.asString("CODLOGRADOURO");
        this.tipoEndereco = vo.asString("TIPOENDERECO");
        return this;
   }
}
