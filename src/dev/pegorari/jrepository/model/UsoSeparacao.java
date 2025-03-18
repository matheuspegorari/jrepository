package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UsoSeparacao extends AbstractSankhyaEntity<UsoSeparacao> {
   private String agrupFinNotas;
   private BigDecimal codTipOperPrinc;
   private String confirmNotasFat;
   private String seriePrinc;
   private BigDecimal codEmp;
   private BigDecimal codTipOper;
   private BigDecimal codTipOperSep;
   private String serieSeparacao;
   private String usoSeparacao;

   public String getAgrupFinNotas() {
        return agrupFinNotas;
   }

   public void setAgrupFinNotas(String agrupFinNotas) {
        markAsChanged("AGRUPFINNOTAS", agrupFinNotas);
        this.agrupFinNotas = agrupFinNotas;
   }

   public BigDecimal getCodTipOperPrinc() {
        return codTipOperPrinc;
   }

   public void setCodTipOperPrinc(BigDecimal codTipOperPrinc) {
        markAsChanged("CODTIPOPERPRINC", codTipOperPrinc);
        this.codTipOperPrinc = codTipOperPrinc;
   }

   public String getConfirmNotasFat() {
        return confirmNotasFat;
   }

   public void setConfirmNotasFat(String confirmNotasFat) {
        markAsChanged("CONFIRMNOTASFAT", confirmNotasFat);
        this.confirmNotasFat = confirmNotasFat;
   }

   public String getSeriePrinc() {
        return seriePrinc;
   }

   public void setSeriePrinc(String seriePrinc) {
        markAsChanged("SERIEPRINC", seriePrinc);
        this.seriePrinc = seriePrinc;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCodTipOperSep() {
        return codTipOperSep;
   }

   public void setCodTipOperSep(BigDecimal codTipOperSep) {
        markAsChanged("CODTIPOPERSEP", codTipOperSep);
        this.codTipOperSep = codTipOperSep;
   }

   public String getSerieSeparacao() {
        return serieSeparacao;
   }

   public void setSerieSeparacao(String serieSeparacao) {
        markAsChanged("SERIESEPARACAO", serieSeparacao);
        this.serieSeparacao = serieSeparacao;
   }

   public String getUsoSeparacao() {
        return usoSeparacao;
   }

   public void setUsoSeparacao(String usoSeparacao) {
        markAsChanged("USOSEPARACAO", usoSeparacao);
        this.usoSeparacao = usoSeparacao;
   }

   @Override
   public String getTableName() {
        return "TGFUSE";
   }

   @Override
   public String getEntityName() {
        return "UsoSeparacao";
   }

   @Override
   public UsoSeparacao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.agrupFinNotas = vo.asString("AGRUPFINNOTAS");
        this.codTipOperPrinc = vo.asBigDecimal("CODTIPOPERPRINC");
        this.confirmNotasFat = vo.asString("CONFIRMNOTASFAT");
        this.seriePrinc = vo.asString("SERIEPRINC");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.codTipOperSep = vo.asBigDecimal("CODTIPOPERSEP");
        this.serieSeparacao = vo.asString("SERIESEPARACAO");
        this.usoSeparacao = vo.asString("USOSEPARACAO");
        return this;
   }
}
