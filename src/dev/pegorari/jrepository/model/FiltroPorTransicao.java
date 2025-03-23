package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FiltroPorTransicao extends AbstractSankhyaEntity<FiltroPorTransicao> {
   private BigDecimal codEmp;
   private BigDecimal codLocal;
   private BigDecimal codProdMp;
   private BigDecimal codProdPa;
   private String controleMp;
   private String controlePa;
   private String expSql;
   private BigDecimal ideFx;
   private BigDecimal ideFxBase;
   private BigDecimal sequencia;
   private String tipoFiltro;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodProdMp() {
        return codProdMp;
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
        this.codProdMp = codProdMp;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public String getControleMp() {
        return controleMp;
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
        this.controleMp = controleMp;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
        this.controlePa = controlePa;
   }

   public String getExpSql() {
        return expSql;
   }

   public void setExpSql(String expSql) {
        markAsChanged("EXPSQL", expSql);
        this.expSql = expSql;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
        this.ideFx = ideFx;
   }

   public BigDecimal getIdeFxBase() {
        return ideFxBase;
   }

   public void setIdeFxBase(BigDecimal ideFxBase) {
        markAsChanged("IDEFXBASE", ideFxBase);
        this.ideFxBase = ideFxBase;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getTipoFiltro() {
        return tipoFiltro;
   }

   public void setTipoFiltro(String tipoFiltro) {
        markAsChanged("TIPOFILTRO", tipoFiltro);
        this.tipoFiltro = tipoFiltro;
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
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codProdMp = vo.asBigDecimal("CODPRODMP");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.controleMp = vo.asString("CONTROLEMP");
        this.controlePa = vo.asString("CONTROLEPA");
        this.expSql = vo.asString("EXPSQL");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.ideFxBase = vo.asBigDecimal("IDEFXBASE");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipoFiltro = vo.asString("TIPOFILTRO");
        return this;
   }
}
