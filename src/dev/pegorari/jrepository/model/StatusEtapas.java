package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class StatusEtapas extends AbstractSankhyaEntity<StatusEtapas> {
   public BigDecimal getCodEtapa() {
        return this.getVo().asBigDecimal("CODETAPA");
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        markAsChanged("CODETAPA", codEtapa);
   }

   public BigDecimal getCodStaEtapa() {
        return this.getVo().asBigDecimal("CODSTAETAPA");
   }

   public void setCodStaEtapa(BigDecimal codStaEtapa) {
        markAsChanged("CODSTAETAPA", codStaEtapa);
   }

   public String getDescRetapa() {
        return this.getVo().asString("DESCRETAPA");
   }

   public void setDescRetapa(String descRetapa) {
        markAsChanged("DESCRETAPA", descRetapa);
   }

   public String getDescRnucurriculo() {
        return this.getVo().asString("DESCRNUCURRICULO");
   }

   public void setDescRnucurriculo(String descRnucurriculo) {
        markAsChanged("DESCRNUCURRICULO", descRnucurriculo);
   }

   public String getDescRrequisicao() {
        return this.getVo().asString("DESCRREQUISICAO");
   }

   public void setDescRrequisicao(String descRrequisicao) {
        markAsChanged("DESCRREQUISICAO", descRrequisicao);
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

   public String getStatusEtapa() {
        return this.getVo().asString("STATUSETAPA");
   }

   public void setStatusEtapa(String statusEtapa) {
        markAsChanged("STATUSETAPA", statusEtapa);
   }

   public String getTipoEtapa() {
        return this.getVo().asString("TIPOETAPA");
   }

   public void setTipoEtapa(String tipoEtapa) {
        markAsChanged("TIPOETAPA", tipoEtapa);
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
        this.setVo(vo);
        return this;
   }
}
