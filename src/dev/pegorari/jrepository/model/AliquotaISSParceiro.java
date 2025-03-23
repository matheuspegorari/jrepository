package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AliquotaISSParceiro extends AbstractSankhyaEntity<AliquotaISSParceiro> {
   private BigDecimal codCid;
   private BigDecimal codEmp;
   private BigDecimal codParc;
   private BigDecimal codProd;
   private String retemIss;

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
        this.codCid = codCid;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getRetemIss() {
        return retemIss;
   }

   public void setRetemIss(String retemIss) {
        markAsChanged("RETEMISS", retemIss);
        this.retemIss = retemIss;
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
        this.codCid = vo.asBigDecimal("CODCID");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.retemIss = vo.asString("RETEMISS");
        return this;
   }
}
