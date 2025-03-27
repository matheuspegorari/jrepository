package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EtapasProcessoSelecao extends AbstractSankhyaEntity<EtapasProcessoSelecao> {
   public String getArqModEmail() {
        return this.getVo().asString("ARQMODEMAIL");
   }

   public void setArqModEmail(String arqModEmail) {
        markAsChanged("ARQMODEMAIL", arqModEmail);
   }

   public BigDecimal getCodEtapa() {
        return this.getVo().asBigDecimal("CODETAPA");
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        markAsChanged("CODETAPA", codEtapa);
   }

   public BigDecimal getCodQuestionario() {
        return this.getVo().asBigDecimal("CODQUESTIONARIO");
   }

   public void setCodQuestionario(BigDecimal codQuestionario) {
        markAsChanged("CODQUESTIONARIO", codQuestionario);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescRetapa() {
        return this.getVo().asString("DESCRETAPA");
   }

   public void setDescRetapa(String descRetapa) {
        markAsChanged("DESCRETAPA", descRetapa);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getNuCurriculo() {
        return this.getVo().asBigDecimal("NUCURRICULO");
   }

   public void setNuCurriculo(BigDecimal nuCurriculo) {
        markAsChanged("NUCURRICULO", nuCurriculo);
   }

   public BigDecimal getNuRequisicao() {
        return this.getVo().asBigDecimal("NUREQUISICAO");
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        markAsChanged("NUREQUISICAO", nuRequisicao);
   }

   public BigDecimal getNuSelecao() {
        return this.getVo().asBigDecimal("NUSELECAO");
   }

   public void setNuSelecao(BigDecimal nuSelecao) {
        markAsChanged("NUSELECAO", nuSelecao);
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
        return this;
   }
}
