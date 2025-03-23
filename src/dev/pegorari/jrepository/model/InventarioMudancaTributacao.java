package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InventarioMudancaTributacao extends AbstractSankhyaEntity<InventarioMudancaTributacao> {
   private BigDecimal codEmp;
   private BigDecimal codParc;
   private BigDecimal codTipOper;
   private BigDecimal codTipVenda;
   private BigDecimal codUsu;
   private String customTp;
   private Timestamp dtAlter;
   private Timestamp dtMtp;
   private String motInv;
   private String statusEfd;
   private String gravarIcmsNormSth020;
   private String usaStant;
   private String usaVlrUnit;
   private String procPorMed;
   private String geraSpedBaseSt;
   private Timestamp dtRefEsc;
   private String usaVlrCusto;
   private BigDecimal aliqInterna;
   private String consEmpUltCompra;
   private String geraSpedVlrSt;
   private String usaRicmsCalc;
   private String consAntExNota;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
        this.codTipVenda = codTipVenda;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getCustomTp() {
        return customTp;
   }

   public void setCustomTp(String customTp) {
        markAsChanged("CUSTOMTP", customTp);
        this.customTp = customTp;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtMtp() {
        return dtMtp;
   }

   public void setDtMtp(Timestamp dtMtp) {
        markAsChanged("DTMTP", dtMtp);
        this.dtMtp = dtMtp;
   }

   public String getMotInv() {
        return motInv;
   }

   public void setMotInv(String motInv) {
        markAsChanged("MOTINV", motInv);
        this.motInv = motInv;
   }

   public String getStatusEfd() {
        return statusEfd;
   }

   public void setStatusEfd(String statusEfd) {
        markAsChanged("STATUSEFD", statusEfd);
        this.statusEfd = statusEfd;
   }

   public String getGravarIcmsNormSth020() {
        return gravarIcmsNormSth020;
   }

   public void setGravarIcmsNormSth020(String gravarIcmsNormSth020) {
        markAsChanged("GRAVARICMSNORMSTH020", gravarIcmsNormSth020);
        this.gravarIcmsNormSth020 = gravarIcmsNormSth020;
   }

   public String getUsaStant() {
        return usaStant;
   }

   public void setUsaStant(String usaStant) {
        markAsChanged("USASTANT", usaStant);
        this.usaStant = usaStant;
   }

   public String getUsaVlrUnit() {
        return usaVlrUnit;
   }

   public void setUsaVlrUnit(String usaVlrUnit) {
        markAsChanged("USAVLRUNIT", usaVlrUnit);
        this.usaVlrUnit = usaVlrUnit;
   }

   public String getProcPorMed() {
        return procPorMed;
   }

   public void setProcPorMed(String procPorMed) {
        markAsChanged("PROCPORMED", procPorMed);
        this.procPorMed = procPorMed;
   }

   public String getGeraSpedBaseSt() {
        return geraSpedBaseSt;
   }

   public void setGeraSpedBaseSt(String geraSpedBaseSt) {
        markAsChanged("GERASPEDBASEST", geraSpedBaseSt);
        this.geraSpedBaseSt = geraSpedBaseSt;
   }

   public Timestamp getDtRefEsc() {
        return dtRefEsc;
   }

   public void setDtRefEsc(Timestamp dtRefEsc) {
        markAsChanged("DTREFESC", dtRefEsc);
        this.dtRefEsc = dtRefEsc;
   }

   public String getUsaVlrCusto() {
        return usaVlrCusto;
   }

   public void setUsaVlrCusto(String usaVlrCusto) {
        markAsChanged("USAVLRCUSTO", usaVlrCusto);
        this.usaVlrCusto = usaVlrCusto;
   }

   public BigDecimal getAliqInterna() {
        return aliqInterna;
   }

   public void setAliqInterna(BigDecimal aliqInterna) {
        markAsChanged("ALIQINTERNA", aliqInterna);
        this.aliqInterna = aliqInterna;
   }

   public String getConsEmpUltCompra() {
        return consEmpUltCompra;
   }

   public void setConsEmpUltCompra(String consEmpUltCompra) {
        markAsChanged("CONSEMPULTCOMPRA", consEmpUltCompra);
        this.consEmpUltCompra = consEmpUltCompra;
   }

   public String getGeraSpedVlrSt() {
        return geraSpedVlrSt;
   }

   public void setGeraSpedVlrSt(String geraSpedVlrSt) {
        markAsChanged("GERASPEDVLRST", geraSpedVlrSt);
        this.geraSpedVlrSt = geraSpedVlrSt;
   }

   public String getUsaRicmsCalc() {
        return usaRicmsCalc;
   }

   public void setUsaRicmsCalc(String usaRicmsCalc) {
        markAsChanged("USARICMSCALC", usaRicmsCalc);
        this.usaRicmsCalc = usaRicmsCalc;
   }

   public String getConsAntExNota() {
        return consAntExNota;
   }

   public void setConsAntExNota(String consAntExNota) {
        markAsChanged("CONSANTEXNOTA", consAntExNota);
        this.consAntExNota = consAntExNota;
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
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.codTipVenda = vo.asBigDecimal("CODTIPVENDA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.customTp = vo.asString("CUSTOMTP");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtMtp = vo.asTimestamp("DTMTP");
        this.motInv = vo.asString("MOTINV");
        this.statusEfd = vo.asString("STATUSEFD");
        this.gravarIcmsNormSth020 = vo.asString("GRAVARICMSNORMSTH020");
        this.usaStant = vo.asString("USASTANT");
        this.usaVlrUnit = vo.asString("USAVLRUNIT");
        this.procPorMed = vo.asString("PROCPORMED");
        this.geraSpedBaseSt = vo.asString("GERASPEDBASEST");
        this.dtRefEsc = vo.asTimestamp("DTREFESC");
        this.usaVlrCusto = vo.asString("USAVLRCUSTO");
        this.aliqInterna = vo.asBigDecimal("ALIQINTERNA");
        this.consEmpUltCompra = vo.asString("CONSEMPULTCOMPRA");
        this.geraSpedVlrSt = vo.asString("GERASPEDVLRST");
        this.usaRicmsCalc = vo.asString("USARICMSCALC");
        this.consAntExNota = vo.asString("CONSANTEXNOTA");
        return this;
   }
}
