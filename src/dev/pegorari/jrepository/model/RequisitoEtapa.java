package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RequisitoEtapa extends AbstractSankhyaEntity<RequisitoEtapa> {
   private BigDecimal codReq;
   private BigDecimal nuFap;
   private BigDecimal nuMetapa;

   public BigDecimal getCodReq() {
        return codReq;
   }

   public void setCodReq(BigDecimal codReq) {
        markAsChanged("CODREQ", codReq);
        this.codReq = codReq;
   }

   public BigDecimal getNuFap() {
        return nuFap;
   }

   public void setNuFap(BigDecimal nuFap) {
        markAsChanged("NUFAP", nuFap);
        this.nuFap = nuFap;
   }

   public BigDecimal getNuMetapa() {
        return nuMetapa;
   }

   public void setNuMetapa(BigDecimal nuMetapa) {
        markAsChanged("NUMETAPA", nuMetapa);
        this.nuMetapa = nuMetapa;
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
        this.codReq = vo.asBigDecimal("CODREQ");
        this.nuFap = vo.asBigDecimal("NUFAP");
        this.nuMetapa = vo.asBigDecimal("NUMETAPA");
        return this;
   }
}
