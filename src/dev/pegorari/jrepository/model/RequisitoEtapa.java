package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class RequisitoEtapa implements SankhyaEntity<RequisitoEtapa> {

   private BigDecimal codReq;
   private BigDecimal nuFap;
   private BigDecimal nuMetapa;

   public BigDecimal getCodReq() {
        return codReq;
   }

   public void setCodReq(BigDecimal codReq) {
        this.codReq = codReq;
   }

   public BigDecimal getNuFap() {
        return nuFap;
   }

   public void setNuFap(BigDecimal nuFap) {
        this.nuFap = nuFap;
   }

   public BigDecimal getNuMetapa() {
        return nuMetapa;
   }

   public void setNuMetapa(BigDecimal nuMetapa) {
        this.nuMetapa = nuMetapa;
   }

   @Override
   public String getEntityName() {
        return "RequisitoEtapa";
   }

   @Override
   public RequisitoEtapa fromVO(DynamicVO vo) {
        this.codReq = vo.asBigDecimal("CODREQ");
        this.nuFap = vo.asBigDecimal("NUFAP");
        this.nuMetapa = vo.asBigDecimal("NUMETAPA");
        return this;
   }
}
