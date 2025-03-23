package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TerceiroProcessoProdutivo extends AbstractSankhyaEntity<TerceiroProcessoProdutivo> {
   private BigDecimal codProdPa;
   private BigDecimal codParcTerc;
   private BigDecimal ideFx;
   private BigDecimal idProc;
   private String preferencial;
   private BigDecimal codUsuAlt;
   private BigDecimal codUsuCad;
   private Timestamp dhAlter;
   private Timestamp dhCad;

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public BigDecimal getCodParcTerc() {
        return codParcTerc;
   }

   public void setCodParcTerc(BigDecimal codParcTerc) {
        markAsChanged("CODPARCTERC", codParcTerc);
        this.codParcTerc = codParcTerc;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
        this.ideFx = ideFx;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
        this.idProc = idProc;
   }

   public String getPreferencial() {
        return preferencial;
   }

   public void setPreferencial(String preferencial) {
        markAsChanged("PREFERENCIAL", preferencial);
        this.preferencial = preferencial;
   }

   public BigDecimal getCodUsuAlt() {
        return codUsuAlt;
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        markAsChanged("CODUSUALT", codUsuAlt);
        this.codUsuAlt = codUsuAlt;
   }

   public BigDecimal getCodUsuCad() {
        return codUsuCad;
   }

   public void setCodUsuCad(BigDecimal codUsuCad) {
        markAsChanged("CODUSUCAD", codUsuCad);
        this.codUsuCad = codUsuCad;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhCad() {
        return dhCad;
   }

   public void setDhCad(Timestamp dhCad) {
        markAsChanged("DHCAD", dhCad);
        this.dhCad = dhCad;
   }

   @Override
   public String getTableName() {
        return "TPRTXPP";
   }

   @Override
   public String getEntityName() {
        return "TerceiroProcessoProdutivo";
   }

   @Override
   public TerceiroProcessoProdutivo fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.codParcTerc = vo.asBigDecimal("CODPARCTERC");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.idProc = vo.asBigDecimal("IDPROC");
        this.preferencial = vo.asString("PREFERENCIAL");
        this.codUsuAlt = vo.asBigDecimal("CODUSUALT");
        this.codUsuCad = vo.asBigDecimal("CODUSUCAD");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhCad = vo.asTimestamp("DHCAD");
        return this;
   }
}
