package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FiltroPorTransicao extends AbstractSankhyaEntity<FiltroPorTransicao> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodProdMp() {
        return this.getVo().asBigDecimal("CODPRODMP");
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public String getControleMp() {
        return this.getVo().asString("CONTROLEMP");
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public String getExpSql() {
        return this.getVo().asString("EXPSQL");
   }

   public void setExpSql(String expSql) {
        markAsChanged("EXPSQL", expSql);
   }

   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getIdeFxBase() {
        return this.getVo().asBigDecimal("IDEFXBASE");
   }

   public void setIdeFxBase(BigDecimal ideFxBase) {
        markAsChanged("IDEFXBASE", ideFxBase);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTipoFiltro() {
        return this.getVo().asString("TIPOFILTRO");
   }

   public void setTipoFiltro(String tipoFiltro) {
        markAsChanged("TIPOFILTRO", tipoFiltro);
   }

   @Override
   public String getTableName() {
        return "TPRFXT";
   }

   @Override
   public String getEntityName() {
        return "FiltroPorTransicao";
   }

   @Override
   public FiltroPorTransicao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
