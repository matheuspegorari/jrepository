package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EtapasProcessoSelecao implements SankhyaEntity<EtapasProcessoSelecao> {

   private String arqModEmail;
   private BigDecimal codEtapa;
   private BigDecimal codQuestionario;
   private BigDecimal codUsu;
   private String descRetapa;
   private Timestamp dtAlter;
   private BigDecimal nuCurriculo;
   private BigDecimal nuRequisicao;
   private BigDecimal nuSelecao;

   public String getArqModEmail() {
        return arqModEmail;
   }

   public void setArqModEmail(String arqModEmail) {
        this.arqModEmail = arqModEmail;
   }

   public BigDecimal getCodEtapa() {
        return codEtapa;
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        this.codEtapa = codEtapa;
   }

   public BigDecimal getCodQuestionario() {
        return codQuestionario;
   }

   public void setCodQuestionario(BigDecimal codQuestionario) {
        this.codQuestionario = codQuestionario;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getDescRetapa() {
        return descRetapa;
   }

   public void setDescRetapa(String descRetapa) {
        this.descRetapa = descRetapa;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuCurriculo() {
        return nuCurriculo;
   }

   public void setNuCurriculo(BigDecimal nuCurriculo) {
        this.nuCurriculo = nuCurriculo;
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
        return "EtapasProcessoSelecao";
   }

   @Override
   public EtapasProcessoSelecao fromVO(DynamicVO vo) {
        this.arqModEmail = vo.asString("ARQMODEMAIL");
        this.codEtapa = vo.asBigDecimal("CODETAPA");
        this.codQuestionario = vo.asBigDecimal("CODQUESTIONARIO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descRetapa = vo.asString("DESCRETAPA");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nuCurriculo = vo.asBigDecimal("NUCURRICULO");
        this.nuRequisicao = vo.asBigDecimal("NUREQUISICAO");
        this.nuSelecao = vo.asBigDecimal("NUSELECAO");
        return this;
   }
}
