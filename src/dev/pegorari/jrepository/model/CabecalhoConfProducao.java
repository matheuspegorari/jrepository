package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoConfProducao extends AbstractSankhyaEntity<CabecalhoConfProducao> {
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
        markAsChanged("NUAPO", nuApo);
        this.nuApo = nuApo;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public BigDecimal getIdAtv() {
        return idAtv;
   }

   public void setIdAtv(BigDecimal idAtv) {
        markAsChanged("IDIATV", idAtv);
        this.idAtv = idAtv;
   }

   public Timestamp getDhFinConf() {
        return dhFinConf;
   }

   public void setDhFinConf(Timestamp dhFinConf) {
        markAsChanged("DHFINCONF", dhFinConf);
        this.dhFinConf = dhFinConf;
   }

   public BigDecimal getCodUsuConf() {
        return codUsuConf;
   }

   public void setCodUsuConf(BigDecimal codUsuConf) {
        markAsChanged("CODUSUCONF", codUsuConf);
        this.codUsuConf = codUsuConf;
   }

   public Timestamp getDhIniConf() {
        return dhIniConf;
   }

   public void setDhIniConf(Timestamp dhIniConf) {
        markAsChanged("DHINICONF", dhIniConf);
        this.dhIniConf = dhIniConf;
   }

   public BigDecimal getNuConf() {
        return nuConf;
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
        this.nuConf = nuConf;
   }

   @Override
   public String getTableName() {
        return "TPRCONF";
   }

   @Override
   public String getEntityName() {
        return "CabecalhoConfProducao";
   }

   @Override
   public CabecalhoConfProducao fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.nuApo = vo.asBigDecimal("NUAPO");
        this.status = vo.asString("STATUS");
        this.idAtv = vo.asBigDecimal("IDIATV");
        this.dhFinConf = vo.asTimestamp("DHFINCONF");
        this.codUsuConf = vo.asBigDecimal("CODUSUCONF");
        this.dhIniConf = vo.asTimestamp("DHINICONF");
        this.nuConf = vo.asBigDecimal("NUCONF");
        return this;
   }
}
