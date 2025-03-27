package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoDFe extends AbstractSankhyaEntity<ConfiguracaoDFe> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public Timestamp getMdeProxConsCte() {
        return this.getVo().asTimestamp("MDEPROXCONSCTE");
   }

   public void setMdeProxConsCte(Timestamp mdeProxConsCte) {
        markAsChanged("MDEPROXCONSCTE", mdeProxConsCte);
   }

   public Timestamp getMdeProxConsulta() {
        return this.getVo().asTimestamp("MDEPROXCONSULTA");
   }

   public void setMdeProxConsulta(Timestamp mdeProxConsulta) {
        markAsChanged("MDEPROXCONSULTA", mdeProxConsulta);
   }

   public Timestamp getMdeProxDownload() {
        return this.getVo().asTimestamp("MDEPROXDOWNLOAD");
   }

   public void setMdeProxDownload(Timestamp mdeProxDownload) {
        markAsChanged("MDEPROXDOWNLOAD", mdeProxDownload);
   }

   public String getUltNsu() {
        return this.getVo().asString("ULTNSU");
   }

   public void setUltNsu(String ultNsu) {
        markAsChanged("ULTNSU", ultNsu);
   }

   public String getUltNsuCte() {
        return this.getVo().asString("ULTNSUCTE");
   }

   public void setUltNsuCte(String ultNsuCte) {
        markAsChanged("ULTNSUCTE", ultNsuCte);
   }

   @Override
   public String getTableName() {
        return "TSICDFE";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoDFe";
   }

   @Override
   public ConfiguracaoDFe fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
