package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CEP extends AbstractSankhyaEntity<CEP> {
   private String cep;
   private BigDecimal codBai;
   private BigDecimal codCid;
   private BigDecimal codEnd;
   private String intervalo;

   public String getCep() {
        return cep;
   }

   public void setCep(String cep) {
        this.cep = cep;
   }

   public BigDecimal getCodBai() {
        return codBai;
   }

   public void setCodBai(BigDecimal codBai) {
        this.codBai = codBai;
   }

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        this.codCid = codCid;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        this.codEnd = codEnd;
   }

   public String getIntervalo() {
        return intervalo;
   }

   public void setIntervalo(String intervalo) {
        this.intervalo = intervalo;
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
        this.cep = vo.asString("CEP");
        this.codBai = vo.asBigDecimal("CODBAI");
        this.codCid = vo.asBigDecimal("CODCID");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.intervalo = vo.asString("INTERVALO");
        return this;
   }
}
