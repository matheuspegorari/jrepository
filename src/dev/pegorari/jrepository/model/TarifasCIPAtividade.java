package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TarifasCIPAtividade extends AbstractSankhyaEntity<TarifasCIPAtividade> {
   private BigDecimal codProdPa;
   private BigDecimal codProdTar;
   private String codVol;
   private String controlePa;
   private BigDecimal ideFx;
   private BigDecimal idProc;
   private BigDecimal qtd;
   private String tipoExec;
   private String tipoIndice;
   private BigDecimal codUsuAlt;
   private BigDecimal codUsuCad;
   private Timestamp dhAlter;
   private Timestamp dhCad;

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public BigDecimal getCodProdTar() {
        return codProdTar;
   }

   public void setCodProdTar(BigDecimal codProdTar) {
        this.codProdTar = codProdTar;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        this.ideFx = ideFx;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        this.idProc = idProc;
   }

   public BigDecimal getQtd() {
        return qtd;
   }

   public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
   }

   public String getTipoExec() {
        return tipoExec;
   }

   public void setTipoExec(String tipoExec) {
        this.tipoExec = tipoExec;
   }

   public String getTipoIndice() {
        return tipoIndice;
   }

   public void setTipoIndice(String tipoIndice) {
        this.tipoIndice = tipoIndice;
   }

   public BigDecimal getCodUsuAlt() {
        return codUsuAlt;
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        this.codUsuAlt = codUsuAlt;
   }

   public BigDecimal getCodUsuCad() {
        return codUsuCad;
   }

   public void setCodUsuCad(BigDecimal codUsuCad) {
        this.codUsuCad = codUsuCad;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhCad() {
        return dhCad;
   }

   public void setDhCad(Timestamp dhCad) {
        this.dhCad = dhCad;
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
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.codProdTar = vo.asBigDecimal("CODPRODTAR");
        this.codVol = vo.asString("CODVOL");
        this.controlePa = vo.asString("CONTROLEPA");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.idProc = vo.asBigDecimal("IDPROC");
        this.qtd = vo.asBigDecimal("QTD");
        this.tipoExec = vo.asString("TIPOEXEC");
        this.tipoIndice = vo.asString("TIPOINDICE");
        this.codUsuAlt = vo.asBigDecimal("CODUSUALT");
        this.codUsuCad = vo.asBigDecimal("CODUSUCAD");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhCad = vo.asTimestamp("DHCAD");
        return this;
   }
}
