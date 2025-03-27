package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoConfProducao extends AbstractSankhyaEntity<CabecalhoConfProducao> {
   public BigDecimal getNuApo() {
        return this.getVo().asBigDecimal("NUAPO");
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public BigDecimal getIdAtv() {
        return this.getVo().asBigDecimal("IDIATV");
   }

   public void setIdAtv(BigDecimal idAtv) {
        markAsChanged("IDIATV", idAtv);
   }

   public Timestamp getDhFinConf() {
        return this.getVo().asTimestamp("DHFINCONF");
   }

   public void setDhFinConf(Timestamp dhFinConf) {
        markAsChanged("DHFINCONF", dhFinConf);
   }

   public BigDecimal getCodUsuConf() {
        return this.getVo().asBigDecimal("CODUSUCONF");
   }

   public void setCodUsuConf(BigDecimal codUsuConf) {
        markAsChanged("CODUSUCONF", codUsuConf);
   }

   public Timestamp getDhIniConf() {
        return this.getVo().asTimestamp("DHINICONF");
   }

   public void setDhIniConf(Timestamp dhIniConf) {
        markAsChanged("DHINICONF", dhIniConf);
   }

   public BigDecimal getNuConf() {
        return this.getVo().asBigDecimal("NUCONF");
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
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
        return this;
   }
}
