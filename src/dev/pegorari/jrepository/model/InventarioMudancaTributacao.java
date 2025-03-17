package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InventarioMudancaTributacao implements SankhyaEntity<InventarioMudancaTributacao> {

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
   private String gravarIcmsNormStTh020;
   private String usaStAnt;
   private String usaVlrUnit;
   private String procPorMed;
   private String geraSpedBaseSt;
   private Timestamp dtRefEsc;
   private String usaVlrCusto;
   private BigDecimal aliqInterna;
   private String consEmpUltCompra;
   private String geraSpedVlrSt;
   private String usaIcmsCalc;
   private String consAntExNota;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        this.codTipVenda = codTipVenda;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getCustomTp() {
        return customTp;
   }

   public void setCustomTp(String customTp) {
        this.customTp = customTp;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtMtp() {
        return dtMtp;
   }

   public void setDtMtp(Timestamp dtMtp) {
        this.dtMtp = dtMtp;
   }

   public String getMotInv() {
        return motInv;
   }

   public void setMotInv(String motInv) {
        this.motInv = motInv;
   }

   public String getStatusEfd() {
        return statusEfd;
   }

   public void setStatusEfd(String statusEfd) {
        this.statusEfd = statusEfd;
   }

   public String getGravarIcmsNormStTh020() {
        return gravarIcmsNormStTh020;
   }

   public void setGravarIcmsNormStTh020(String gravarIcmsNormStTh020) {
        this.gravarIcmsNormStTh020 = gravarIcmsNormStTh020;
   }

   public String getUsaStAnt() {
        return usaStAnt;
   }

   public void setUsaStAnt(String usaStAnt) {
        this.usaStAnt = usaStAnt;
   }

   public String getUsaVlrUnit() {
        return usaVlrUnit;
   }

   public void setUsaVlrUnit(String usaVlrUnit) {
        this.usaVlrUnit = usaVlrUnit;
   }

   public String getProcPorMed() {
        return procPorMed;
   }

   public void setProcPorMed(String procPorMed) {
        this.procPorMed = procPorMed;
   }

   public String getGeraSpedBaseSt() {
        return geraSpedBaseSt;
   }

   public void setGeraSpedBaseSt(String geraSpedBaseSt) {
        this.geraSpedBaseSt = geraSpedBaseSt;
   }

   public Timestamp getDtRefEsc() {
        return dtRefEsc;
   }

   public void setDtRefEsc(Timestamp dtRefEsc) {
        this.dtRefEsc = dtRefEsc;
   }

   public String getUsaVlrCusto() {
        return usaVlrCusto;
   }

   public void setUsaVlrCusto(String usaVlrCusto) {
        this.usaVlrCusto = usaVlrCusto;
   }

   public BigDecimal getAliqInterna() {
        return aliqInterna;
   }

   public void setAliqInterna(BigDecimal aliqInterna) {
        this.aliqInterna = aliqInterna;
   }

   public String getConsEmpUltCompra() {
        return consEmpUltCompra;
   }

   public void setConsEmpUltCompra(String consEmpUltCompra) {
        this.consEmpUltCompra = consEmpUltCompra;
   }

   public String getGeraSpedVlrSt() {
        return geraSpedVlrSt;
   }

   public void setGeraSpedVlrSt(String geraSpedVlrSt) {
        this.geraSpedVlrSt = geraSpedVlrSt;
   }

   public String getUsaIcmsCalc() {
        return usaIcmsCalc;
   }

   public void setUsaIcmsCalc(String usaIcmsCalc) {
        this.usaIcmsCalc = usaIcmsCalc;
   }

   public String getConsAntExNota() {
        return consAntExNota;
   }

   public void setConsAntExNota(String consAntExNota) {
        this.consAntExNota = consAntExNota;
   }

   @Override
   public String getEntityName() {
        return "InventarioMudancaTributacao";
   }

   @Override
   public InventarioMudancaTributacao fromVO(DynamicVO vo) {
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
        this.gravarIcmsNormStTh020 = vo.asString("GRAVARICMSNORMSTTH020");
        this.usaStAnt = vo.asString("USASTANT");
        this.usaVlrUnit = vo.asString("USAVLRUNIT");
        this.procPorMed = vo.asString("PROCPORMED");
        this.geraSpedBaseSt = vo.asString("GERASPEDBASEST");
        this.dtRefEsc = vo.asTimestamp("DTREFESC");
        this.usaVlrCusto = vo.asString("USAVLRCUSTO");
        this.aliqInterna = vo.asBigDecimal("ALIQINTERNA");
        this.consEmpUltCompra = vo.asString("CONSEMPULTCOMPRA");
        this.geraSpedVlrSt = vo.asString("GERASPEDVLRST");
        this.usaIcmsCalc = vo.asString("USAICMSCALC");
        this.consAntExNota = vo.asString("CONSANTEXNOTA");
        return this;
   }
}
