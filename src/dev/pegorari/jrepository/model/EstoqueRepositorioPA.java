package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EstoqueRepositorioPA extends AbstractSankhyaEntity<EstoqueRepositorioPA> {
   public BigDecimal getCodCpm() {
        return this.getVo().asBigDecimal("CODCPM");
   }

   public void setCodCpm(BigDecimal codCpm) {
        markAsChanged("CODCPM", codCpm);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public BigDecimal getEstoque() {
        return this.getVo().asBigDecimal("ESTOQUE");
   }

   public void setEstoque(BigDecimal estoque) {
        markAsChanged("ESTOQUE", estoque);
   }

   public BigDecimal getIdIproc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
   }

   public BigDecimal getIdRpa() {
        return this.getVo().asBigDecimal("IDRPA");
   }

   public void setIdRpa(BigDecimal idRpa) {
        markAsChanged("IDRPA", idRpa);
   }

   public String getStatusExec() {
        return this.getVo().asString("STATUSEXEC");
   }

   public void setStatusExec(String statusExec) {
        markAsChanged("STATUSEXEC", statusExec);
   }

   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getEstoquePerda() {
        return this.getVo().asBigDecimal("ESTOQUEPERDA");
   }

   public void setEstoquePerda(BigDecimal estoquePerda) {
        markAsChanged("ESTOQUEPERDA", estoquePerda);
   }

   @Override
   public String getTableName() {
        return "TPRESR";
   }

   @Override
   public String getEntityName() {
        return "EstoqueRepositorioPA";
   }

   @Override
   public EstoqueRepositorioPA fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
