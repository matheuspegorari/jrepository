package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RequisitoEtapa extends AbstractSankhyaEntity<RequisitoEtapa> {
   public BigDecimal getCodReq() {
        return this.getVo().asBigDecimal("CODREQ");
   }

   public void setCodReq(BigDecimal codReq) {
        markAsChanged("CODREQ", codReq);
   }

   public BigDecimal getNuFap() {
        return this.getVo().asBigDecimal("NUFAP");
   }

   public void setNuFap(BigDecimal nuFap) {
        markAsChanged("NUFAP", nuFap);
   }

   public BigDecimal getNuMetapa() {
        return this.getVo().asBigDecimal("NUMETAPA");
   }

   public void setNuMetapa(BigDecimal nuMetapa) {
        markAsChanged("NUMETAPA", nuMetapa);
   }

   @Override
   public String getTableName() {
        return "TCSREE";
   }

   @Override
   public String getEntityName() {
        return "RequisitoEtapa";
   }

   @Override
   public RequisitoEtapa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
