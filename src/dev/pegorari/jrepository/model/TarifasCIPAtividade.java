package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TarifasCIPAtividade extends AbstractSankhyaEntity<TarifasCIPAtividade> {
   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public BigDecimal getCodProdTar() {
        return this.getVo().asBigDecimal("CODPRODTAR");
   }

   public void setCodProdTar(BigDecimal codProdTar) {
        markAsChanged("CODPRODTAR", codProdTar);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getIdProc() {
        return this.getVo().asBigDecimal("IDPROC");
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
   }

   public BigDecimal getQtd() {
        return this.getVo().asBigDecimal("QTD");
   }

   public void setQtd(BigDecimal qtd) {
        markAsChanged("QTD", qtd);
   }

   public String getTipoExec() {
        return this.getVo().asString("TIPOEXEC");
   }

   public void setTipoExec(String tipoExec) {
        markAsChanged("TIPOEXEC", tipoExec);
   }

   public String getTipoIndice() {
        return this.getVo().asString("TIPOINDICE");
   }

   public void setTipoIndice(String tipoIndice) {
        markAsChanged("TIPOINDICE", tipoIndice);
   }

   public BigDecimal getCodUsuAlt() {
        return this.getVo().asBigDecimal("CODUSUALT");
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        markAsChanged("CODUSUALT", codUsuAlt);
   }

   public BigDecimal getCodUsuCad() {
        return this.getVo().asBigDecimal("CODUSUCAD");
   }

   public void setCodUsuCad(BigDecimal codUsuCad) {
        markAsChanged("CODUSUCAD", codUsuCad);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDhCad() {
        return this.getVo().asTimestamp("DHCAD");
   }

   public void setDhCad(Timestamp dhCad) {
        markAsChanged("DHCAD", dhCad);
   }

   @Override
   public String getTableName() {
        return "TPRTCA";
   }

   @Override
   public String getEntityName() {
        return "TarifasCIPAtividade";
   }

   @Override
   public TarifasCIPAtividade fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
