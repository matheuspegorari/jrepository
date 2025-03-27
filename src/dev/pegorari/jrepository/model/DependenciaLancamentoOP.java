package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class DependenciaLancamentoOP extends AbstractSankhyaEntity<DependenciaLancamentoOP> {
   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public String getTipoNroLote() {
        return this.getVo().asString("TIPONROLOTE");
   }

   public void setTipoNroLote(String tipoNroLote) {
        markAsChanged("TIPONROLOTE", tipoNroLote);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public BigDecimal getSeqOppi() {
        return this.getVo().asBigDecimal("SEQOPPI");
   }

   public void setSeqOppi(BigDecimal seqOppi) {
        markAsChanged("SEQOPPI", seqOppi);
   }

   public BigDecimal getCodProdPi() {
        return this.getVo().asBigDecimal("CODPRODPI");
   }

   public void setCodProdPi(BigDecimal codProdPi) {
        markAsChanged("CODPRODPI", codProdPi);
   }

   public BigDecimal getNuLop() {
        return this.getVo().asBigDecimal("NULOP");
   }

   public void setNuLop(BigDecimal nuLop) {
        markAsChanged("NULOP", nuLop);
   }

   public BigDecimal getSeqOp() {
        return this.getVo().asBigDecimal("SEQOP");
   }

   public void setSeqOp(BigDecimal seqOp) {
        markAsChanged("SEQOP", seqOp);
   }

   public String getControlePi() {
        return this.getVo().asString("CONTROLEPI");
   }

   public void setControlePi(String controlePi) {
        markAsChanged("CONTROLEPI", controlePi);
   }

   public BigDecimal getQtdPi() {
        return this.getVo().asBigDecimal("QTDPI");
   }

   public void setQtdPi(BigDecimal qtdPi) {
        markAsChanged("QTDPI", qtdPi);
   }

   public String getTipoSubOp() {
        return this.getVo().asString("TIPOSUBOP");
   }

   public void setTipoSubOp(String tipoSubOp) {
        markAsChanged("TIPOSUBOP", tipoSubOp);
   }

   public BigDecimal getQtdNecessario() {
        return this.getVo().asBigDecimal("QTDNECESSARIO");
   }

   public void setQtdNecessario(BigDecimal qtdNecessario) {
        markAsChanged("QTDNECESSARIO", qtdNecessario);
   }

   public BigDecimal getQtdEstoque() {
        return this.getVo().asBigDecimal("QTDESTOQUE");
   }

   public void setQtdEstoque(BigDecimal qtdEstoque) {
        markAsChanged("QTDESTOQUE", qtdEstoque);
   }

   public BigDecimal getNecessidadeTotal() {
        return this.getVo().asBigDecimal("NECESSIDADETOTAL");
   }

   public void setNecessidadeTotal(BigDecimal necessidadeTotal) {
        markAsChanged("NECESSIDADETOTAL", necessidadeTotal);
   }

   public String getConsideraEstoque() {
        return this.getVo().asString("CONSIDERAESTOQUE");
   }

   public void setConsideraEstoque(String consideraEstoque) {
        markAsChanged("CONSIDERAESTOQUE", consideraEstoque);
   }

   @Override
   public String getTableName() {
        return "TPRDLOP";
   }

   @Override
   public String getEntityName() {
        return "DependenciaLancamentoOP";
   }

   @Override
   public DependenciaLancamentoOP fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
