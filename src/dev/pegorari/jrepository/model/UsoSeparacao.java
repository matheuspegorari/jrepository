package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UsoSeparacao extends AbstractSankhyaEntity<UsoSeparacao> {
   public String getAgrupFinNotas() {
        return this.getVo().asString("AGRUPFINNOTAS");
   }

   public void setAgrupFinNotas(String agrupFinNotas) {
        markAsChanged("AGRUPFINNOTAS", agrupFinNotas);
   }

   public BigDecimal getCodTipOperPrinc() {
        return this.getVo().asBigDecimal("CODTIPOPERPRINC");
   }

   public void setCodTipOperPrinc(BigDecimal codTipOperPrinc) {
        markAsChanged("CODTIPOPERPRINC", codTipOperPrinc);
   }

   public String getConfirmNotasFat() {
        return this.getVo().asString("CONFIRMNOTASFAT");
   }

   public void setConfirmNotasFat(String confirmNotasFat) {
        markAsChanged("CONFIRMNOTASFAT", confirmNotasFat);
   }

   public String getSeriePrinc() {
        return this.getVo().asString("SERIEPRINC");
   }

   public void setSeriePrinc(String seriePrinc) {
        markAsChanged("SERIEPRINC", seriePrinc);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public BigDecimal getCodTipOperSep() {
        return this.getVo().asBigDecimal("CODTIPOPERSEP");
   }

   public void setCodTipOperSep(BigDecimal codTipOperSep) {
        markAsChanged("CODTIPOPERSEP", codTipOperSep);
   }

   public String getSerieSeparacao() {
        return this.getVo().asString("SERIESEPARACAO");
   }

   public void setSerieSeparacao(String serieSeparacao) {
        markAsChanged("SERIESEPARACAO", serieSeparacao);
   }

   public String getUsoSeparacao() {
        return this.getVo().asString("USOSEPARACAO");
   }

   public void setUsoSeparacao(String usoSeparacao) {
        markAsChanged("USOSEPARACAO", usoSeparacao);
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
        this.setVo(vo);
        return this;
   }
}
