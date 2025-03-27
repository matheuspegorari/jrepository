package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AliquotaInternaDestino extends AbstractSankhyaEntity<AliquotaInternaDestino> {
   public BigDecimal getPercIcmFcp() {
        return this.getVo().asBigDecimal("PERCICMSFCP");
   }

   public void setPercIcmFcp(BigDecimal percIcmFcp) {
        markAsChanged("PERCICMSFCP", percIcmFcp);
   }

   public BigDecimal getCodUf() {
        return this.getVo().asBigDecimal("CODUF");
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getAliqIntDest() {
        return this.getVo().asBigDecimal("ALIQINTDEST");
   }

   public void setAliqIntDest(BigDecimal aliqIntDest) {
        markAsChanged("ALIQINTDEST", aliqIntDest);
   }

   public BigDecimal getPercRedBaseDest() {
        return this.getVo().asBigDecimal("PERCREDBASEDEST");
   }

   public void setPercRedBaseDest(BigDecimal percRedBaseDest) {
        markAsChanged("PERCREDBASEDEST", percRedBaseDest);
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
        this.setVo(vo);
        return this;
   }
}
