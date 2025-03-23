package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EtapaPersonalizada extends AbstractSankhyaEntity<EtapaPersonalizada> {
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
        markAsChanged("ARQMODEMAIL", arqModEmail);
        this.arqModEmail = arqModEmail;
   }

   public BigDecimal getCodEpe() {
        return codEpe;
   }

   public void setCodEpe(BigDecimal codEpe) {
        markAsChanged("CODEPE", codEpe);
        this.codEpe = codEpe;
   }

   public BigDecimal getCodEtapa() {
        return codEtapa;
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        markAsChanged("CODETAPA", codEtapa);
        this.codEtapa = codEtapa;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDtAbertura() {
        return dtAbertura;
   }

   public void setDtAbertura(Timestamp dtAbertura) {
        markAsChanged("DTABERTURA", dtAbertura);
        this.dtAbertura = dtAbertura;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuRequisicao() {
        return nuRequisicao;
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        markAsChanged("NUREQUISICAO", nuRequisicao);
        this.nuRequisicao = nuRequisicao;
   }

   public BigDecimal getNuSelecao() {
        return nuSelecao;
   }

   public void setNuSelecao(BigDecimal nuSelecao) {
        markAsChanged("NUSELECAO", nuSelecao);
        this.nuSelecao = nuSelecao;
   }

   @Override
   public String getTableName() {
        return "TRSEPE";
   }

   @Override
   public String getEntityName() {
        return "EtapaPersonalizada";
   }

   @Override
   public EtapaPersonalizada fromVO(DynamicVO vo) {
        this.setVo(vo);
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
