package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class StatusEtapas implements SankhyaEntity<StatusEtapas> {

   private BigDecimal codEtapa;
   private BigDecimal codStaEtapa;
   private String descRetapa;
   private String descrNuCurriculo;
   private String descrRequisicao;
   private BigDecimal nuCurriculo;
   private BigDecimal nuRequisicao;
   private BigDecimal nuSelecao;
   private String statusEtapa;
   private String tipoEtapa;

   public BigDecimal getCodEtapa() {
        return codEtapa;
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        this.codEtapa = codEtapa;
   }

   public BigDecimal getCodStaEtapa() {
        return codStaEtapa;
   }

   public void setCodStaEtapa(BigDecimal codStaEtapa) {
        this.codStaEtapa = codStaEtapa;
   }

   public String getDescRetapa() {
        return descRetapa;
   }

   public void setDescRetapa(String descRetapa) {
        this.descRetapa = descRetapa;
   }

   public String getDescrNuCurriculo() {
        return descrNuCurriculo;
   }

   public void setDescrNuCurriculo(String descrNuCurriculo) {
        this.descrNuCurriculo = descrNuCurriculo;
   }

   public String getDescrRequisicao() {
        return descrRequisicao;
   }

   public void setDescrRequisicao(String descrRequisicao) {
        this.descrRequisicao = descrRequisicao;
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

   public String getStatusEtapa() {
        return statusEtapa;
   }

   public void setStatusEtapa(String statusEtapa) {
        this.statusEtapa = statusEtapa;
   }

   public String getTipoEtapa() {
        return tipoEtapa;
   }

   public void setTipoEtapa(String tipoEtapa) {
        this.tipoEtapa = tipoEtapa;
   }

   @Override
   public String getEntityName() {
        return "StatusEtapas";
   }

   @Override
   public StatusEtapas fromVO(DynamicVO vo) {
        this.codEtapa = vo.asBigDecimal("CODETAPA");
        this.codStaEtapa = vo.asBigDecimal("CODSTAETAPA");
        this.descRetapa = vo.asString("DESCRETAPA");
        this.descrNuCurriculo = vo.asString("DESCRNUCURRICULO");
        this.descrRequisicao = vo.asString("DESCRREQUISICAO");
        this.nuCurriculo = vo.asBigDecimal("NUCURRICULO");
        this.nuRequisicao = vo.asBigDecimal("NUREQUISICAO");
        this.nuSelecao = vo.asBigDecimal("NUSELECAO");
        this.statusEtapa = vo.asString("STATUSETAPA");
        this.tipoEtapa = vo.asString("TIPOETAPA");
        return this;
   }
}
