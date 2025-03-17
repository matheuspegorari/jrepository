package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EtapaPersonalizada implements SankhyaEntity<EtapaPersonalizada> {

   private String arqModEmail;
   private BigDecimal codEpe;
   private BigDecimal codEtapa;
   private BigDecimal codUsu;
   private Timestamp dtAbertura;
   private Timestamp dtAlter;
   private BigDecimal nuRequisicao;
   private BigDecimal nuSelecao;

   public String getArqModEmail() {
        return arqModEmail;
   }

   public void setArqModEmail(String arqModEmail) {
        this.arqModEmail = arqModEmail;
   }

   public BigDecimal getCodEpe() {
        return codEpe;
   }

   public void setCodEpe(BigDecimal codEpe) {
        this.codEpe = codEpe;
   }

   public BigDecimal getCodEtapa() {
        return codEtapa;
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        this.codEtapa = codEtapa;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtAbertura() {
        return dtAbertura;
   }

   public void setDtAbertura(Timestamp dtAbertura) {
        this.dtAbertura = dtAbertura;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuRequisicao() {
        return nuRequisicao;
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        this.nuRequisicao = nuRequisicao;
   }

   public BigDecimal getNuSelecao() {
        return nuSelecao;
   }

   public void setNuSelecao(BigDecimal nuSelecao) {
        this.nuSelecao = nuSelecao;
   }

   @Override
   public String getEntityName() {
        return "EtapaPersonalizada";
   }

   @Override
   public EtapaPersonalizada fromVO(DynamicVO vo) {
        this.arqModEmail = vo.asString("ARQMODEMAIL");
        this.codEpe = vo.asBigDecimal("CODEPE");
        this.codEtapa = vo.asBigDecimal("CODETAPA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAbertura = vo.asTimestamp("DTABERTURA");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nuRequisicao = vo.asBigDecimal("NUREQUISICAO");
        this.nuSelecao = vo.asBigDecimal("NUSELECAO");
        return this;
   }
}
