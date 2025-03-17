package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EstoqueRepositorioPA extends AbstractSankhyaEntity<EstoqueRepositorioPA> {
   private BigDecimal codCpm;
   private BigDecimal codProdPa;
   private String controlePa;
   private BigDecimal estoque;
   private BigDecimal idIproc;
   private BigDecimal idRpa;
   private String statusExec;
   private String referencia;
   private BigDecimal estoquePerda;

   public BigDecimal getCodCpm() {
        return codCpm;
   }

   public void setCodCpm(BigDecimal codCpm) {
        this.codCpm = codCpm;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public BigDecimal getEstoque() {
        return estoque;
   }

   public void setEstoque(BigDecimal estoque) {
        this.estoque = estoque;
   }

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        this.idIproc = idIproc;
   }

   public BigDecimal getIdRpa() {
        return idRpa;
   }

   public void setIdRpa(BigDecimal idRpa) {
        this.idRpa = idRpa;
   }

   public String getStatusExec() {
        return statusExec;
   }

   public void setStatusExec(String statusExec) {
        this.statusExec = statusExec;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        this.referencia = referencia;
   }

   public BigDecimal getEstoquePerda() {
        return estoquePerda;
   }

   public void setEstoquePerda(BigDecimal estoquePerda) {
        this.estoquePerda = estoquePerda;
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
        this.codCpm = vo.asBigDecimal("CODCPM");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.controlePa = vo.asString("CONTROLEPA");
        this.estoque = vo.asBigDecimal("ESTOQUE");
        this.idIproc = vo.asBigDecimal("IDIPROC");
        this.idRpa = vo.asBigDecimal("IDRPA");
        this.statusExec = vo.asString("STATUSEXEC");
        this.referencia = vo.asString("REFERENCIA");
        this.estoquePerda = vo.asBigDecimal("ESTOQUEPERDA");
        return this;
   }
}
