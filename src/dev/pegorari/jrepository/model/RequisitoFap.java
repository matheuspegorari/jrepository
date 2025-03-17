package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RequisitoFap extends AbstractSankhyaEntity<RequisitoFap> {
   private String casoUso;
   private BigDecimal codReq;
   private String descricao;
   private String nome;
   private BigDecimal nuFap;
   private BigDecimal peso;
   private String todaEtapa;

   public String getCasoUso() {
        return casoUso;
   }

   public void setCasoUso(String casoUso) {
        this.casoUso = casoUso;
   }

   public BigDecimal getCodReq() {
        return codReq;
   }

   public void setCodReq(BigDecimal codReq) {
        this.codReq = codReq;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        this.nome = nome;
   }

   public BigDecimal getNuFap() {
        return nuFap;
   }

   public void setNuFap(BigDecimal nuFap) {
        this.nuFap = nuFap;
   }

   public BigDecimal getPeso() {
        return peso;
   }

   public void setPeso(BigDecimal peso) {
        this.peso = peso;
   }

   public String getTodaEtapa() {
        return todaEtapa;
   }

   public void setTodaEtapa(String todaEtapa) {
        this.todaEtapa = todaEtapa;
   }

   @Override
   public String getTableName() {
        return "TCSREQ";
   }

   @Override
   public String getEntityName() {
        return "RequisitoFap";
   }

   @Override
   public RequisitoFap fromVO(DynamicVO vo) {
        this.casoUso = vo.asString("CASOUSO");
        this.codReq = vo.asBigDecimal("CODREQ");
        this.descricao = vo.asString("DESCRICAO");
        this.nome = vo.asString("NOME");
        this.nuFap = vo.asBigDecimal("NUFAP");
        this.peso = vo.asBigDecimal("PESO");
        this.todaEtapa = vo.asString("TODAETAPA");
        return this;
   }
}
