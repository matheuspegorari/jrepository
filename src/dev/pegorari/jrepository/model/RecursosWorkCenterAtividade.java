package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RecursosWorkCenterAtividade extends AbstractSankhyaEntity<RecursosWorkCenterAtividade> {
   public BigDecimal getCodCre() {
        return this.getVo().asBigDecimal("CODCRE");
   }

   public void setCodCre(BigDecimal codCre) {
        markAsChanged("CODCRE", codCre);
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

   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getQtdUtilizacao() {
        return this.getVo().asBigDecimal("QTDUTILIZACAO");
   }

   public void setQtdUtilizacao(BigDecimal qtdUtilizacao) {
        markAsChanged("QTDUTILIZACAO", qtdUtilizacao);
   }

   public BigDecimal getSeqRec() {
        return this.getVo().asBigDecimal("SEQREC");
   }

   public void setSeqRec(BigDecimal seqRec) {
        markAsChanged("SEQREC", seqRec);
   }

   public BigDecimal getMultUtilizacao() {
        return this.getVo().asBigDecimal("MULTUTILIZACAO");
   }

   public void setMultUtilizacao(BigDecimal multUtilizacao) {
        markAsChanged("MULTUTILIZACAO", multUtilizacao);
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
        this.setVo(vo);
        return this;
   }
}
