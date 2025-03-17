package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Consenso extends AbstractSankhyaEntity<Consenso> {
   private BigDecimal nuAvaliacao;
   private BigDecimal nuPesq;
   private BigDecimal codUsu;
   private BigDecimal nuPesqConsenso;
   private Timestamp dhAlter;
   private BigDecimal nuPesqAvaliado;
   private String status;
   private String planoDeAcao;

   public BigDecimal getNuAvaliacao() {
        return nuAvaliacao;
   }

   public void setNuAvaliacao(BigDecimal nuAvaliacao) {
        this.nuAvaliacao = nuAvaliacao;
   }

   public BigDecimal getNuPesq() {
        return nuPesq;
   }

   public void setNuPesq(BigDecimal nuPesq) {
        this.nuPesq = nuPesq;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getNuPesqConsenso() {
        return nuPesqConsenso;
   }

   public void setNuPesqConsenso(BigDecimal nuPesqConsenso) {
        this.nuPesqConsenso = nuPesqConsenso;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public BigDecimal getNuPesqAvaliado() {
        return nuPesqAvaliado;
   }

   public void setNuPesqAvaliado(BigDecimal nuPesqAvaliado) {
        this.nuPesqAvaliado = nuPesqAvaliado;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        this.status = status;
   }

   public String getPlanoDeAcao() {
        return planoDeAcao;
   }

   public void setPlanoDeAcao(String planoDeAcao) {
        this.planoDeAcao = planoDeAcao;
   }

   @Override
   public String getTableName() {
        return "TPQCON";
   }

   @Override
   public String getEntityName() {
        return "Consenso";
   }

   @Override
   public Consenso fromVO(DynamicVO vo) {
        this.nuAvaliacao = vo.asBigDecimal("NUAVALIACAO");
        this.nuPesq = vo.asBigDecimal("NUPESQ");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuPesqConsenso = vo.asBigDecimal("NUPESQCONSENSO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nuPesqAvaliado = vo.asBigDecimal("NUPESQAVALIADO");
        this.status = vo.asString("STATUS");
        this.planoDeAcao = vo.asString("PLANODEACAO");
        return this;
   }
}
