package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoConfProducao implements SankhyaEntity<CabecalhoConfProducao> {

   private BigDecimal nuApo;
   private String status;
   private BigDecimal idAtv;
   private Timestamp dhFinConf;
   private BigDecimal codUsuConf;
   private Timestamp dhIniConf;
   private BigDecimal nuConf;

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        this.nuApo = nuApo;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        this.status = status;
   }

   public BigDecimal getIdAtv() {
        return idAtv;
   }

   public void setIdAtv(BigDecimal idAtv) {
        this.idAtv = idAtv;
   }

   public Timestamp getDhFinConf() {
        return dhFinConf;
   }

   public void setDhFinConf(Timestamp dhFinConf) {
        this.dhFinConf = dhFinConf;
   }

   public BigDecimal getCodUsuConf() {
        return codUsuConf;
   }

   public void setCodUsuConf(BigDecimal codUsuConf) {
        this.codUsuConf = codUsuConf;
   }

   public Timestamp getDhIniConf() {
        return dhIniConf;
   }

   public void setDhIniConf(Timestamp dhIniConf) {
        this.dhIniConf = dhIniConf;
   }

   public BigDecimal getNuConf() {
        return nuConf;
   }

   public void setNuConf(BigDecimal nuConf) {
        this.nuConf = nuConf;
   }

   @Override
   public String getEntityName() {
        return "CabecalhoConfProducao";
   }

   @Override
   public CabecalhoConfProducao fromVO(DynamicVO vo) {
        this.nuApo = vo.asBigDecimal("NUAPO");
        this.status = vo.asString("STATUS");
        this.idAtv = vo.asBigDecimal("IDATV");
        this.dhFinConf = vo.asTimestamp("DHFINCONF");
        this.codUsuConf = vo.asBigDecimal("CODUSUCONF");
        this.dhIniConf = vo.asTimestamp("DHINICONF");
        this.nuConf = vo.asBigDecimal("NUCONF");
        return this;
   }
}
