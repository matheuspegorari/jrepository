package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class AliquotaISSParceiro implements SankhyaEntity<AliquotaISSParceiro> {

   private BigDecimal codCid;
   private BigDecimal codEmp;
   private BigDecimal codParc;
   private BigDecimal codProd;
   private String retemIss;

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        this.codCid = codCid;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getRetemIss() {
        return retemIss;
   }

   public void setRetemIss(String retemIss) {
        this.retemIss = retemIss;
   }

   @Override
   public String getEntityName() {
        return "AliquotaISSParceiro";
   }

   @Override
   public AliquotaISSParceiro fromVO(DynamicVO vo) {
        this.codCid = vo.asBigDecimal("CODCID");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.retemIss = vo.asString("RETEMISS");
        return this;
   }
}
