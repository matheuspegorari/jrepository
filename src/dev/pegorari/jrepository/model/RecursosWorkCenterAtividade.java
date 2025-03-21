package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RecursosWorkCenterAtividade extends AbstractSankhyaEntity<RecursosWorkCenterAtividade> {
   private BigDecimal codCre;
   private BigDecimal codProdPa;
   private String controlePa;
   private BigDecimal ideFx;
   private BigDecimal qtdUtilizacao;
   private BigDecimal seqRec;
   private BigDecimal multUtilizacao;
   private Timestamp dhAlter;
   private Timestamp dhCad;
   private BigDecimal codUsuAlt;
   private BigDecimal codUsuCad;

   public BigDecimal getCodCre() {
        return codCre;
   }

   public void setCodCre(BigDecimal codCre) {
        markAsChanged("CODCRE", codCre);
        this.codCre = codCre;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
        this.controlePa = controlePa;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
        this.ideFx = ideFx;
   }

   public BigDecimal getQtdUtilizacao() {
        return qtdUtilizacao;
   }

   public void setQtdUtilizacao(BigDecimal qtdUtilizacao) {
        markAsChanged("QTDUTILIZACAO", qtdUtilizacao);
        this.qtdUtilizacao = qtdUtilizacao;
   }

   public BigDecimal getSeqRec() {
        return seqRec;
   }

   public void setSeqRec(BigDecimal seqRec) {
        markAsChanged("SEQREC", seqRec);
        this.seqRec = seqRec;
   }

   public BigDecimal getMultUtilizacao() {
        return multUtilizacao;
   }

   public void setMultUtilizacao(BigDecimal multUtilizacao) {
        markAsChanged("MULTUTILIZACAO", multUtilizacao);
        this.multUtilizacao = multUtilizacao;
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

   @Override
   public String getTableName() {
        return "TPRRWA";
   }

   @Override
   public String getEntityName() {
        return "RecursosWorkCenterAtividade";
   }

   @Override
   public RecursosWorkCenterAtividade fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codCre = vo.asBigDecimal("CODCRE");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.controlePa = vo.asString("CONTROLEPA");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.qtdUtilizacao = vo.asBigDecimal("QTDUTILIZACAO");
        this.seqRec = vo.asBigDecimal("SEQREC");
        this.multUtilizacao = vo.asBigDecimal("MULTUTILIZACAO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhCad = vo.asTimestamp("DHCAD");
        this.codUsuAlt = vo.asBigDecimal("CODUSUALT");
        this.codUsuCad = vo.asBigDecimal("CODUSUCAD");
        return this;
   }
}
