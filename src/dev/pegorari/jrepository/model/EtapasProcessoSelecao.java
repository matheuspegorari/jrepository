package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EtapasProcessoSelecao extends AbstractSankhyaEntity<EtapasProcessoSelecao> {
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
        markAsChanged("ARQMODEMAIL", arqModEmail);
        this.arqModEmail = arqModEmail;
   }

   public BigDecimal getCodEtapa() {
        return codEtapa;
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        markAsChanged("CODETAPA", codEtapa);
        this.codEtapa = codEtapa;
   }

   public BigDecimal getCodQuestionario() {
        return codQuestionario;
   }

   public void setCodQuestionario(BigDecimal codQuestionario) {
        markAsChanged("CODQUESTIONARIO", codQuestionario);
        this.codQuestionario = codQuestionario;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getDescRetapa() {
        return descRetapa;
   }

   public void setDescRetapa(String descRetapa) {
        markAsChanged("DESCRETAPA", descRetapa);
        this.descRetapa = descRetapa;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuCurriculo() {
        return nuCurriculo;
   }

   public void setNuCurriculo(BigDecimal nuCurriculo) {
        markAsChanged("NUCURRICULO", nuCurriculo);
        this.nuCurriculo = nuCurriculo;
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
        return "TRSETA";
   }

   @Override
   public String getEntityName() {
        return "EtapasProcessoSelecao";
   }

   @Override
   public EtapasProcessoSelecao fromVO(DynamicVO vo) {
        this.setVo(vo);
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
