package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Endereco extends AbstractSankhyaEntity<Endereco> {
   public BigDecimal getCodEnd() {
        return this.getVo().asBigDecimal("CODEND");
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
   }

   public String getDescricaoCorreio() {
        return this.getVo().asString("DESCRICAOCORREIO");
   }

   public void setDescricaoCorreio(String descricaoCorreio) {
        markAsChanged("DESCRICAOCORREIO", descricaoCorreio);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public String getNomeEnd() {
        return this.getVo().asString("NOMEEND");
   }

   public void setNomeEnd(String nomeEnd) {
        markAsChanged("NOMEEND", nomeEnd);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getAtNuVersao() {
        return this.getVo().asString("ATUNUVERSAO");
   }

   public void setAtNuVersao(String atNuVersao) {
        markAsChanged("ATUNUVERSAO", atNuVersao);
   }

   public String getCodLogradouro() {
        return this.getVo().asString("CODLOGRADOURO");
   }

   public void setCodLogradouro(String codLogradouro) {
        markAsChanged("CODLOGRADOURO", codLogradouro);
   }

   public String getTipoEndereco() {
        return this.getVo().asString("TIPOENDERECO");
   }

   public void setTipoEndereco(String tipoEndereco) {
        markAsChanged("TIPOENDERECO", tipoEndereco);
   }

   @Override
   public String getTableName() {
        return "TSIEND";
   }

   @Override
   public String getEntityName() {
        return "Endereco";
   }

   @Override
   public Endereco fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
