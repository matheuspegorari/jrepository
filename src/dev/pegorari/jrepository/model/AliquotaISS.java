package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AliquotaISS extends AbstractSankhyaEntity<AliquotaISS> {
   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodLst() {
        return this.getVo().asBigDecimal("CODLST");
   }

   public void setCodLst(BigDecimal codLst) {
        markAsChanged("CODLST", codLst);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodTribIss() {
        return this.getVo().asBigDecimal("CODTRIBISS");
   }

   public void setCodTribIss(BigDecimal codTribIss) {
        markAsChanged("CODTRIBISS", codTribIss);
   }

   public String getCodTribMunIss() {
        return this.getVo().asString("CODTRIBMUNISS");
   }

   public void setCodTribMunIss(String codTribMunIss) {
        markAsChanged("CODTRIBMUNISS", codTribMunIss);
   }

   public BigDecimal getPercDeducao() {
        return this.getVo().asBigDecimal("PERCDEDUCAO");
   }

   public void setPercDeducao(BigDecimal percDeducao) {
        markAsChanged("PERCDEDUCAO", percDeducao);
   }

   public BigDecimal getPercInss() {
        return this.getVo().asBigDecimal("PERCINSS");
   }

   public void setPercInss(BigDecimal percInss) {
        markAsChanged("PERCINSS", percInss);
   }

   public String getTipoDeducao() {
        return this.getVo().asString("TIPODEDUCAO");
   }

   public void setTipoDeducao(String tipoDeducao) {
        markAsChanged("TIPODEDUCAO", tipoDeducao);
   }

   public String getNaoCalcula() {
        return this.getVo().asString("NAOCALCULA");
   }

   public void setNaoCalcula(String naoCalcula) {
        markAsChanged("NAOCALCULA", naoCalcula);
   }

   public BigDecimal getIdAliq() {
        return this.getVo().asBigDecimal("IDALIQ");
   }

   public void setIdAliq(BigDecimal idAliq) {
        markAsChanged("IDALIQ", idAliq);
   }

   @Override
   public String getTableName() {
        return "TGFISS";
   }

   @Override
   public String getEntityName() {
        return "AliquotaISS";
   }

   @Override
   public AliquotaISS fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
