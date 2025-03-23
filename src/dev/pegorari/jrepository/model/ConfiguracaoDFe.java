package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoDFe extends AbstractSankhyaEntity<ConfiguracaoDFe> {
   private BigDecimal codEmp;
   private Timestamp mdeProxConsCte;
   private Timestamp mdeProxConsulta;
   private Timestamp mdeProxDownload;
   private String ultNsu;
   private String ultNsuCte;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public Timestamp getMdeProxConsCte() {
        return mdeProxConsCte;
   }

   public void setMdeProxConsCte(Timestamp mdeProxConsCte) {
        markAsChanged("MDEPROXCONSCTE", mdeProxConsCte);
        this.mdeProxConsCte = mdeProxConsCte;
   }

   public Timestamp getMdeProxConsulta() {
        return mdeProxConsulta;
   }

   public void setMdeProxConsulta(Timestamp mdeProxConsulta) {
        markAsChanged("MDEPROXCONSULTA", mdeProxConsulta);
        this.mdeProxConsulta = mdeProxConsulta;
   }

   public Timestamp getMdeProxDownload() {
        return mdeProxDownload;
   }

   public void setMdeProxDownload(Timestamp mdeProxDownload) {
        markAsChanged("MDEPROXDOWNLOAD", mdeProxDownload);
        this.mdeProxDownload = mdeProxDownload;
   }

   public String getUltNsu() {
        return ultNsu;
   }

   public void setUltNsu(String ultNsu) {
        markAsChanged("ULTNSU", ultNsu);
        this.ultNsu = ultNsu;
   }

   public String getUltNsuCte() {
        return ultNsuCte;
   }

   public void setUltNsuCte(String ultNsuCte) {
        markAsChanged("ULTNSUCTE", ultNsuCte);
        this.ultNsuCte = ultNsuCte;
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
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.mdeProxConsCte = vo.asTimestamp("MDEPROXCONSCTE");
        this.mdeProxConsulta = vo.asTimestamp("MDEPROXCONSULTA");
        this.mdeProxDownload = vo.asTimestamp("MDEPROXDOWNLOAD");
        this.ultNsu = vo.asString("ULTNSU");
        this.ultNsuCte = vo.asString("ULTNSUCTE");
        return this;
   }
}
