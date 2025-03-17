package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AliquotaInternaDestino extends AbstractSankhyaEntity<AliquotaInternaDestino> {
   private BigDecimal percIcmFcp;
   private BigDecimal codUf;
   private BigDecimal codProd;
   private BigDecimal aliqIntDest;
   private BigDecimal percRedBaseDest;

   public BigDecimal getPercIcmFcp() {
        return percIcmFcp;
   }

   public void setPercIcmFcp(BigDecimal percIcmFcp) {
        this.percIcmFcp = percIcmFcp;
   }

   public BigDecimal getCodUf() {
        return codUf;
   }

   public void setCodUf(BigDecimal codUf) {
        this.codUf = codUf;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getAliqIntDest() {
        return aliqIntDest;
   }

   public void setAliqIntDest(BigDecimal aliqIntDest) {
        this.aliqIntDest = aliqIntDest;
   }

   public BigDecimal getPercRedBaseDest() {
        return percRedBaseDest;
   }

   public void setPercRedBaseDest(BigDecimal percRedBaseDest) {
        this.percRedBaseDest = percRedBaseDest;
   }

   @Override
   public String getTableName() {
        return "TGFAID";
   }

   @Override
   public String getEntityName() {
        return "AliquotaInternaDestino";
   }

   @Override
   public AliquotaInternaDestino fromVO(DynamicVO vo) {
        this.percIcmFcp = vo.asBigDecimal("PERCICMSFCP");
        this.codUf = vo.asBigDecimal("CODUF");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.aliqIntDest = vo.asBigDecimal("ALIQINTDEST");
        this.percRedBaseDest = vo.asBigDecimal("PERCREDBASEDEST");
        return this;
   }
}
