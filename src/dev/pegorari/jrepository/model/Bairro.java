package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Bairro extends AbstractSankhyaEntity<Bairro> {
   private BigDecimal codBai;
   private BigDecimal codReg;
   private String descricaoCorreio;
   private Timestamp dtAlter;
   private String nomeBai;
   private String atNuVersao;

   public BigDecimal getCodBai() {
        return codBai;
   }

   public void setCodBai(BigDecimal codBai) {
        markAsChanged("CODBAI", codBai);
        this.codBai = codBai;
   }

   public BigDecimal getCodReg() {
        return codReg;
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
        this.codReg = codReg;
   }

   public String getDescricaoCorreio() {
        return descricaoCorreio;
   }

   public void setDescricaoCorreio(String descricaoCorreio) {
        markAsChanged("DESCRICAOCORREIO", descricaoCorreio);
        this.descricaoCorreio = descricaoCorreio;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public String getNomeBai() {
        return nomeBai;
   }

   public void setNomeBai(String nomeBai) {
        markAsChanged("NOMEBAI", nomeBai);
        this.nomeBai = nomeBai;
   }

   public String getAtNuVersao() {
        return atNuVersao;
   }

   public void setAtNuVersao(String atNuVersao) {
        markAsChanged("ATUNUVERSAO", atNuVersao);
        this.atNuVersao = atNuVersao;
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
        this.codBai = vo.asBigDecimal("CODBAI");
        this.codReg = vo.asBigDecimal("CODREG");
        this.descricaoCorreio = vo.asString("DESCRICAOCORREIO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nomeBai = vo.asString("NOMEBAI");
        this.atNuVersao = vo.asString("ATUNUVERSAO");
        return this;
   }
}
