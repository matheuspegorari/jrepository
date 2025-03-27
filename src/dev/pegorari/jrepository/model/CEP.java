package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CEP extends AbstractSankhyaEntity<CEP> {
   public String getCep() {
        return this.getVo().asString("CEP");
   }

   public void setCep(String cep) {
        markAsChanged("CEP", cep);
   }

   public BigDecimal getCodBai() {
        return this.getVo().asBigDecimal("CODBAI");
   }

   public void setCodBai(BigDecimal codBai) {
        markAsChanged("CODBAI", codBai);
   }

   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public BigDecimal getCodEnd() {
        return this.getVo().asBigDecimal("CODEND");
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
   }

   public String getIntervalo() {
        return this.getVo().asString("INTERVALO");
   }

   public void setIntervalo(String intervalo) {
        markAsChanged("INTERVALO", intervalo);
   }

   @Override
   public String getTableName() {
        return "TSICEP";
   }

   @Override
   public String getEntityName() {
        return "CEP";
   }

   @Override
   public CEP fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
