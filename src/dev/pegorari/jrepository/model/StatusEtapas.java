package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class StatusEtapas extends AbstractSankhyaEntity<StatusEtapas> {
   private BigDecimal codEtapa;
   private BigDecimal codStaEtapa;
   private String descRetapa;
   private String descRnucurriculo;
   private String descRrequisicao;
   private BigDecimal nuCurriculo;
   private BigDecimal nuRequisicao;
   private BigDecimal nuSelecao;
   private String statusEtapa;
   private String tipoEtapa;

   public BigDecimal getCodEtapa() {
        return codEtapa;
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        markAsChanged("CODETAPA", codEtapa);
        this.codEtapa = codEtapa;
   }

   public BigDecimal getCodStaEtapa() {
        return codStaEtapa;
   }

   public void setCodStaEtapa(BigDecimal codStaEtapa) {
        markAsChanged("CODSTAETAPA", codStaEtapa);
        this.codStaEtapa = codStaEtapa;
   }

   public String getDescRetapa() {
        return descRetapa;
   }

   public void setDescRetapa(String descRetapa) {
        markAsChanged("DESCRETAPA", descRetapa);
        this.descRetapa = descRetapa;
   }

   public String getDescRnucurriculo() {
        return descRnucurriculo;
   }

   public void setDescRnucurriculo(String descRnucurriculo) {
        markAsChanged("DESCRNUCURRICULO", descRnucurriculo);
        this.descRnucurriculo = descRnucurriculo;
   }

   public String getDescRrequisicao() {
        return descRrequisicao;
   }

   public void setDescRrequisicao(String descRrequisicao) {
        markAsChanged("DESCRREQUISICAO", descRrequisicao);
        this.descRrequisicao = descRrequisicao;
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

   public String getStatusEtapa() {
        return statusEtapa;
   }

   public void setStatusEtapa(String statusEtapa) {
        markAsChanged("STATUSETAPA", statusEtapa);
        this.statusEtapa = statusEtapa;
   }

   public String getTipoEtapa() {
        return tipoEtapa;
   }

   public void setTipoEtapa(String tipoEtapa) {
        markAsChanged("TIPOETAPA", tipoEtapa);
        this.tipoEtapa = tipoEtapa;
   }

   @Override
   public String getTableName() {
        return "TRSSTE";
   }

   @Override
   public String getEntityName() {
        return "StatusEtapas";
   }

   @Override
   public StatusEtapas fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codEtapa = vo.asBigDecimal("CODETAPA");
        this.codStaEtapa = vo.asBigDecimal("CODSTAETAPA");
        this.descRetapa = vo.asString("DESCRETAPA");
        this.descRnucurriculo = vo.asString("DESCRNUCURRICULO");
        this.descRrequisicao = vo.asString("DESCRREQUISICAO");
        this.nuCurriculo = vo.asBigDecimal("NUCURRICULO");
        this.nuRequisicao = vo.asBigDecimal("NUREQUISICAO");
        this.nuSelecao = vo.asBigDecimal("NUSELECAO");
        this.statusEtapa = vo.asString("STATUSETAPA");
        this.tipoEtapa = vo.asString("TIPOETAPA");
        return this;
   }
}
