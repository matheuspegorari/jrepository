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
        markAsChanged("CASOUSO", casoUso);
        this.casoUso = casoUso;
   }

   public BigDecimal getCodReq() {
        return codReq;
   }

   public void setCodReq(BigDecimal codReq) {
        markAsChanged("CODREQ", codReq);
        this.codReq = codReq;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
        this.nome = nome;
   }

   public BigDecimal getNuFap() {
        return nuFap;
   }

   public void setNuFap(BigDecimal nuFap) {
        markAsChanged("NUFAP", nuFap);
        this.nuFap = nuFap;
   }

   public BigDecimal getPeso() {
        return peso;
   }

   public void setPeso(BigDecimal peso) {
        markAsChanged("PESO", peso);
        this.peso = peso;
   }

   public String getTodaEtapa() {
        return todaEtapa;
   }

   public void setTodaEtapa(String todaEtapa) {
        markAsChanged("TODAETAPA", todaEtapa);
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
        this.setVo(vo);
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
