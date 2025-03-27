package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InventarioMudancaTributacao extends AbstractSankhyaEntity<InventarioMudancaTributacao> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public BigDecimal getCodTipVenda() {
        return this.getVo().asBigDecimal("CODTIPVENDA");
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getCustomTp() {
        return this.getVo().asString("CUSTOMTP");
   }

   public void setCustomTp(String customTp) {
        markAsChanged("CUSTOMTP", customTp);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtMtp() {
        return this.getVo().asTimestamp("DTMTP");
   }

   public void setDtMtp(Timestamp dtMtp) {
        markAsChanged("DTMTP", dtMtp);
   }

   public String getMotInv() {
        return this.getVo().asString("MOTINV");
   }

   public void setMotInv(String motInv) {
        markAsChanged("MOTINV", motInv);
   }

   public String getStatusEfd() {
        return this.getVo().asString("STATUSEFD");
   }

   public void setStatusEfd(String statusEfd) {
        markAsChanged("STATUSEFD", statusEfd);
   }

   public String getGravarIcmsNormSth020() {
        return this.getVo().asString("GRAVARICMSNORMSTH020");
   }

   public void setGravarIcmsNormSth020(String gravarIcmsNormSth020) {
        markAsChanged("GRAVARICMSNORMSTH020", gravarIcmsNormSth020);
   }

   public String getUsaStant() {
        return this.getVo().asString("USASTANT");
   }

   public void setUsaStant(String usaStant) {
        markAsChanged("USASTANT", usaStant);
   }

   public String getUsaVlrUnit() {
        return this.getVo().asString("USAVLRUNIT");
   }

   public void setUsaVlrUnit(String usaVlrUnit) {
        markAsChanged("USAVLRUNIT", usaVlrUnit);
   }

   public String getProcPorMed() {
        return this.getVo().asString("PROCPORMED");
   }

   public void setProcPorMed(String procPorMed) {
        markAsChanged("PROCPORMED", procPorMed);
   }

   public String getGeraSpedBaseSt() {
        return this.getVo().asString("GERASPEDBASEST");
   }

   public void setGeraSpedBaseSt(String geraSpedBaseSt) {
        markAsChanged("GERASPEDBASEST", geraSpedBaseSt);
   }

   public Timestamp getDtRefEsc() {
        return this.getVo().asTimestamp("DTREFESC");
   }

   public void setDtRefEsc(Timestamp dtRefEsc) {
        markAsChanged("DTREFESC", dtRefEsc);
   }

   public String getUsaVlrCusto() {
        return this.getVo().asString("USAVLRCUSTO");
   }

   public void setUsaVlrCusto(String usaVlrCusto) {
        markAsChanged("USAVLRCUSTO", usaVlrCusto);
   }

   public BigDecimal getAliqInterna() {
        return this.getVo().asBigDecimal("ALIQINTERNA");
   }

   public void setAliqInterna(BigDecimal aliqInterna) {
        markAsChanged("ALIQINTERNA", aliqInterna);
   }

   public String getConsEmpUltCompra() {
        return this.getVo().asString("CONSEMPULTCOMPRA");
   }

   public void setConsEmpUltCompra(String consEmpUltCompra) {
        markAsChanged("CONSEMPULTCOMPRA", consEmpUltCompra);
   }

   public String getGeraSpedVlrSt() {
        return this.getVo().asString("GERASPEDVLRST");
   }

   public void setGeraSpedVlrSt(String geraSpedVlrSt) {
        markAsChanged("GERASPEDVLRST", geraSpedVlrSt);
   }

   public String getUsaRicmsCalc() {
        return this.getVo().asString("USARICMSCALC");
   }

   public void setUsaRicmsCalc(String usaRicmsCalc) {
        markAsChanged("USARICMSCALC", usaRicmsCalc);
   }

   public String getConsAntExNota() {
        return this.getVo().asString("CONSANTEXNOTA");
   }

   public void setConsAntExNota(String consAntExNota) {
        markAsChanged("CONSANTEXNOTA", consAntExNota);
   }

   @Override
   public String getTableName() {
        return "TGFMTP";
   }

   @Override
   public String getEntityName() {
        return "InventarioMudancaTributacao";
   }

   @Override
   public InventarioMudancaTributacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
