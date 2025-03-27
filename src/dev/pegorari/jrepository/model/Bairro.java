package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Bairro extends AbstractSankhyaEntity<Bairro> {
   public BigDecimal getCodBai() {
        return this.getVo().asBigDecimal("CODBAI");
   }

   public void setCodBai(BigDecimal codBai) {
        markAsChanged("CODBAI", codBai);
   }

   public BigDecimal getCodReg() {
        return this.getVo().asBigDecimal("CODREG");
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
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

   public String getNomeBai() {
        return this.getVo().asString("NOMEBAI");
   }

   public void setNomeBai(String nomeBai) {
        markAsChanged("NOMEBAI", nomeBai);
   }

   public String getAtNuVersao() {
        return this.getVo().asString("ATUNUVERSAO");
   }

   public void setAtNuVersao(String atNuVersao) {
        markAsChanged("ATUNUVERSAO", atNuVersao);
   }

   @Override
   public String getTableName() {
        return "TSIBAI";
   }

   @Override
   public String getEntityName() {
        return "Bairro";
   }

   @Override
   public Bairro fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
