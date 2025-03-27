package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AliquotaISSParceiro extends AbstractSankhyaEntity<AliquotaISSParceiro> {
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

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getRetemIss() {
        return this.getVo().asString("RETEMISS");
   }

   public void setRetemIss(String retemIss) {
        markAsChanged("RETEMISS", retemIss);
   }

   @Override
   public String getTableName() {
        return "TGFAIP";
   }

   @Override
   public String getEntityName() {
        return "AliquotaISSParceiro";
   }

   @Override
   public AliquotaISSParceiro fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
